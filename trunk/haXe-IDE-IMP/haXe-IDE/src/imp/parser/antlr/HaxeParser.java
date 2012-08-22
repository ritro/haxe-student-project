// $ANTLR 3.4 Haxe.g 2012-08-22 16:34:46

package imp.parser.antlr;

import tree.HaxeTree;

import tree.expression.Array;
import tree.expression.Assignment;
import tree.expression.Binary;
import tree.expression.Constant;
import tree.expression.Declaration;
import tree.expression.MethodCall;
import tree.expression.NewNode;
import tree.expression.Slice;
import tree.expression.Unary;
import tree.expression.Usage;

import tree.statement.BlockScope;
import tree.statement.DoWhile;
import tree.statement.For;
import tree.statement.IfNode;
import tree.statement.Return;
import tree.statement.SwitchNode;
import tree.statement.TryNode;
import tree.statement.While;

import tree.ErrorNode;
import tree.Function;
import tree.Module;
import tree.TypeTag;

import tree.type.Class;
import tree.type.Enum;
import tree.type.Interface;
import tree.type.TypeDef;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BREAK", "BYTE", "CALL_OR_SLICE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPLEMENT_LIST", "IMPORT", "IN", "INLINE", "INSTANCEOF", "INTERFACE", "INTLITERAL", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_CONSTRAIN", "TYPE_PARAM", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VOLATILE", "WHILE", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int AMP=5;
    public static final int AMPAMP=6;
    public static final int AMPEQ=7;
    public static final int BANG=8;
    public static final int BANGEQ=9;
    public static final int BANGEQQ=10;
    public static final int BAR=11;
    public static final int BARBAR=12;
    public static final int BAREQ=13;
    public static final int BLOCK_SCOPE=14;
    public static final int BREAK=15;
    public static final int BYTE=16;
    public static final int CALL_OR_SLICE=17;
    public static final int CARET=18;
    public static final int CARETEQ=19;
    public static final int CASE=20;
    public static final int CAST=21;
    public static final int CATCH=22;
    public static final int CHAR=23;
    public static final int CHARLITERAL=24;
    public static final int CLASS=25;
    public static final int COLON=26;
    public static final int COMMA=27;
    public static final int COMMENT=28;
    public static final int CONST=29;
    public static final int CONTINUE=30;
    public static final int DECL_ATTR_LIST=31;
    public static final int DEFAULT=32;
    public static final int DIGIT=33;
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
    public static final int FALSE=50;
    public static final int FINAL=51;
    public static final int FINALLY=52;
    public static final int FLOATNUM=53;
    public static final int FOR=54;
    public static final int FUNCTION=55;
    public static final int GOTO=56;
    public static final int GT=57;
    public static final int GTEQ=58;
    public static final int GTGT=59;
    public static final int GTGTEQ=60;
    public static final int GTGTGT=61;
    public static final int GTGTGTEQ=62;
    public static final int HEX_DIGIT=63;
    public static final int HexDigit=64;
    public static final int HexPrefix=65;
    public static final int IDENTIFIER=66;
    public static final int IF=67;
    public static final int IF_TOKEN=68;
    public static final int IMPLEMENTS=69;
    public static final int IMPLEMENT_LIST=70;
    public static final int IMPORT=71;
    public static final int IN=72;
    public static final int INLINE=73;
    public static final int INSTANCEOF=74;
    public static final int INTERFACE=75;
    public static final int INTLITERAL=76;
    public static final int IntegerNumber=77;
    public static final int LBRACE=78;
    public static final int LBRACKET=79;
    public static final int LONG=80;
    public static final int LONGLITERAL=81;
    public static final int LPAREN=82;
    public static final int LT=83;
    public static final int LTEQ=84;
    public static final int LTLT=85;
    public static final int LTLTEQ=86;
    public static final int LongSuffix=87;
    public static final int MINUS_BIGGER=88;
    public static final int MODULE=89;
    public static final int MONKEYS_AT=90;
    public static final int NATIVE=91;
    public static final int NEVER=92;
    public static final int NEW=93;
    public static final int NULL=94;
    public static final int OCTAL_ESC=95;
    public static final int OVERRIDE=96;
    public static final int PACKAGE=97;
    public static final int PARAM_LIST=98;
    public static final int PERCENT=99;
    public static final int PERCENTEQ=100;
    public static final int PLUS=101;
    public static final int PLUSEQ=102;
    public static final int PLUSPLUS=103;
    public static final int PP_AND_EXPRESSION=104;
    public static final int PP_CONDITIONAL=105;
    public static final int PP_ELSE=106;
    public static final int PP_ELSEIF=107;
    public static final int PP_END=108;
    public static final int PP_ERROR=109;
    public static final int PP_EXPRESSION=110;
    public static final int PP_IF=111;
    public static final int PP_OR_EXPRESSION=112;
    public static final int PP_PRIMARY_EXPRESSION=113;
    public static final int PP_UNARY_EXPRESSION=114;
    public static final int PREPROCESSOR_DIRECTIVE=115;
    public static final int PRIVATE=116;
    public static final int PROPERTY_DECL=117;
    public static final int PROTECTED=118;
    public static final int PUBLIC=119;
    public static final int QUES=120;
    public static final int RBRACE=121;
    public static final int RBRACKET=122;
    public static final int RETURN=123;
    public static final int RPAREN=124;
    public static final int SEMI=125;
    public static final int SHORT=126;
    public static final int SLASH=127;
    public static final int SLASHEQ=128;
    public static final int STAR=129;
    public static final int STAREQ=130;
    public static final int STATIC=131;
    public static final int STRICTFP=132;
    public static final int STRINGLITERAL=133;
    public static final int SUB=134;
    public static final int SUBEQ=135;
    public static final int SUBSUB=136;
    public static final int SUFFIX_EXPR=137;
    public static final int SUPER=138;
    public static final int SWITCH=139;
    public static final int THIS=140;
    public static final int THROW=141;
    public static final int THROWS=142;
    public static final int TILDE=143;
    public static final int TRANSIENT=144;
    public static final int TRUE=145;
    public static final int TRY=146;
    public static final int TS=147;
    public static final int TYPEDEF=148;
    public static final int TYPE_CONSTRAIN=149;
    public static final int TYPE_PARAM=150;
    public static final int TYPE_TAG=151;
    public static final int UNICODE_ESC=152;
    public static final int UNTYPED=153;
    public static final int USING=154;
    public static final int VAR=155;
    public static final int VOLATILE=156;
    public static final int WHILE=157;
    public static final int WS=158;

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
        this.state.ruleMemo = new HashMap[269+1];
         

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
    // Haxe.g:90:1: module : ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE ( myPackage )? ( imports )* ( topLevelDecl )* ) ;
    public final HaxeParser.module_return module() throws RecognitionException {
        HaxeParser.module_return retval = new HaxeParser.module_return();
        retval.start = input.LT(1);

        int module_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.myPackage_return myPackage1 =null;

        HaxeParser.imports_return imports2 =null;

        HaxeParser.topLevelDecl_return topLevelDecl3 =null;


        RewriteRuleSubtreeStream stream_topLevelDecl=new RewriteRuleSubtreeStream(adaptor,"rule topLevelDecl");
        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_imports=new RewriteRuleSubtreeStream(adaptor,"rule imports");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // Haxe.g:90:17: ( ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE ( myPackage )? ( imports )* ( topLevelDecl )* ) )
            // Haxe.g:90:19: ( myPackage )? ( imports )* ( topLevelDecl )*
            {
            // Haxe.g:90:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:90:19: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module163);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            // Haxe.g:90:30: ( imports )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:90:30: imports
            	    {
            	    pushFollow(FOLLOW_imports_in_module166);
            	    imports2=imports();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_imports.add(imports2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // Haxe.g:90:39: ( topLevelDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CLASS||LA3_0==ENUM||LA3_0==EXTERN||LA3_0==INTERFACE||LA3_0==PRIVATE||LA3_0==TYPEDEF) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Haxe.g:90:39: topLevelDecl
            	    {
            	    pushFollow(FOLLOW_topLevelDecl_in_module169);
            	    topLevelDecl3=topLevelDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_topLevelDecl.add(topLevelDecl3.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: topLevelDecl, imports, myPackage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 90:53: -> ^( MODULE ( myPackage )? ( imports )* ( topLevelDecl )* )
            {
                // Haxe.g:90:56: ^( MODULE ( myPackage )? ( imports )* ( topLevelDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Module(MODULE)
                , root_1);

                // Haxe.g:90:73: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:90:84: ( imports )*
                while ( stream_imports.hasNext() ) {
                    adaptor.addChild(root_1, stream_imports.nextTree());

                }
                stream_imports.reset();

                // Haxe.g:90:93: ( topLevelDecl )*
                while ( stream_topLevelDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelDecl.nextTree());

                }
                stream_topLevelDecl.reset();

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


    public static class imports_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "imports"
    // Haxe.g:93:1: imports : ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !);
    public final HaxeParser.imports_return imports() throws RecognitionException {
        HaxeParser.imports_return retval = new HaxeParser.imports_return();
        retval.start = input.LT(1);

        int imports_StartIndex = input.index();

        Object root_0 = null;

        Token IMPORT4=null;
        Token SEMI6=null;
        Token USING7=null;
        Token SEMI9=null;
        HaxeParser.filepath_return filepath5 =null;

        HaxeParser.filepath_return filepath8 =null;


        Object IMPORT4_tree=null;
        Object SEMI6_tree=null;
        Object USING7_tree=null;
        Object SEMI9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

            // Haxe.g:93:17: ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IMPORT) ) {
                alt4=1;
            }
            else if ( (LA4_0==USING) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:93:19: IMPORT ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPORT4=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports221); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT4_tree = 
                    (Object)adaptor.create(IMPORT4)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPORT4_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports224);
                    filepath5=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath5.getTree());

                    SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports226); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:94:19: USING ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    USING7=(Token)match(input,USING,FOLLOW_USING_in_imports247); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING7_tree = 
                    (Object)adaptor.create(USING7)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(USING7_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports250);
                    filepath8=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath8.getTree());

                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports252); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, imports_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "imports"


    public static class myPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "myPackage"
    // Haxe.g:97:1: myPackage : PACKAGE ^ ( filepath |)? SEMI !;
    public final HaxeParser.myPackage_return myPackage() throws RecognitionException {
        HaxeParser.myPackage_return retval = new HaxeParser.myPackage_return();
        retval.start = input.LT(1);

        int myPackage_StartIndex = input.index();

        Object root_0 = null;

        Token PACKAGE10=null;
        Token SEMI12=null;
        HaxeParser.filepath_return filepath11 =null;


        Object PACKAGE10_tree=null;
        Object SEMI12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

            // Haxe.g:97:17: ( PACKAGE ^ ( filepath |)? SEMI !)
            // Haxe.g:97:19: PACKAGE ^ ( filepath |)? SEMI !
            {
            root_0 = (Object)adaptor.nil();


            PACKAGE10=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage284); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE10_tree = 
            (Object)adaptor.create(PACKAGE10)
            ;
            root_0 = (Object)adaptor.becomeRoot(PACKAGE10_tree, root_0);
            }

            // Haxe.g:97:28: ( filepath |)?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER) ) {
                alt5=1;
            }
            else if ( (LA5_0==SEMI) ) {
                int LA5_2 = input.LA(2);

                if ( (synpred6_Haxe()) ) {
                    alt5=2;
                }
            }
            switch (alt5) {
                case 1 :
                    // Haxe.g:97:29: filepath
                    {
                    pushFollow(FOLLOW_filepath_in_myPackage288);
                    filepath11=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath11.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:97:40: 
                    {
                    }
                    break;

            }


            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage295); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, myPackage_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "myPackage"


    public static class filepath_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "filepath"
    // Haxe.g:100:1: filepath : a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a;
    public final HaxeParser.filepath_return filepath() throws RecognitionException {
        HaxeParser.filepath_return retval = new HaxeParser.filepath_return();
        retval.start = input.LT(1);

        int filepath_StartIndex = input.index();

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token d=null;

        Object a_tree=null;
        Object b_tree=null;
        Object d_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

            // Haxe.g:100:17: (a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a)
            // Haxe.g:100:19: a= IDENTIFIER (b= DOT d= IDENTIFIER )*
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);


            // Haxe.g:100:32: (b= DOT d= IDENTIFIER )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DOT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Haxe.g:100:33: b= DOT d= IDENTIFIER
            	    {
            	    b=(Token)match(input,DOT,FOLLOW_DOT_in_filepath355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(b);


            	    d=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath359); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(d);


            	    if ( state.backtracking==0 ) {a.setText((a!=null?a.getText():null)+(b!=null?b.getText():null) + (d!=null?d.getText():null));}

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
            // 100:94: -> $a
            {
                adaptor.addChild(root_0, stream_a.nextNode());

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
            if ( state.backtracking>0 ) { memoize(input, 4, filepath_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "filepath"


    public static class meta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "meta"
    // Haxe.g:103:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
    public final HaxeParser.meta_return meta() throws RecognitionException {
        HaxeParser.meta_return retval = new HaxeParser.meta_return();
        retval.start = input.LT(1);

        int meta_StartIndex = input.index();

        Object root_0 = null;

        Token MONKEYS_AT13=null;
        Token LPAREN15=null;
        Token RPAREN17=null;
        HaxeParser.metaName_return metaName14 =null;

        HaxeParser.paramList_return paramList16 =null;


        Object MONKEYS_AT13_tree=null;
        Object LPAREN15_tree=null;
        Object RPAREN17_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

            // Haxe.g:103:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:103:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            MONKEYS_AT13=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta395); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT13_tree = 
            (Object)adaptor.create(MONKEYS_AT13)
            ;
            adaptor.addChild(root_0, MONKEYS_AT13_tree);
            }

            pushFollow(FOLLOW_metaName_in_meta397);
            metaName14=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName14.getTree());

            // Haxe.g:103:31: ( LPAREN ( paramList )? RPAREN )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LPAREN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Haxe.g:103:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN15_tree = 
                    (Object)adaptor.create(LPAREN15)
                    ;
                    adaptor.addChild(root_0, LPAREN15_tree);
                    }

                    // Haxe.g:103:39: ( paramList )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==IDENTIFIER||LA7_0==QUES) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Haxe.g:103:39: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_meta402);
                            paramList16=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList16.getTree());

                            }
                            break;

                    }


                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RPAREN17_tree = 
                    (Object)adaptor.create(RPAREN17)
                    ;
                    adaptor.addChild(root_0, RPAREN17_tree);
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
    // Haxe.g:106:1: metaName : ( IDENTIFIER | COLON metaName );
    public final HaxeParser.metaName_return metaName() throws RecognitionException {
        HaxeParser.metaName_return retval = new HaxeParser.metaName_return();
        retval.start = input.LT(1);

        int metaName_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER18=null;
        Token COLON19=null;
        HaxeParser.metaName_return metaName20 =null;


        Object IDENTIFIER18_tree=null;
        Object COLON19_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Haxe.g:107:5: ( IDENTIFIER | COLON metaName )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENTIFIER) ) {
                alt9=1;
            }
            else if ( (LA9_0==COLON) ) {
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
                    // Haxe.g:107:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER18_tree = 
                    (Object)adaptor.create(IDENTIFIER18)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER18_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:109:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_metaName433); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON19_tree = 
                    (Object)adaptor.create(COLON19)
                    ;
                    adaptor.addChild(root_0, COLON19_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName435);
                    metaName20=metaName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:112:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final HaxeParser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        HaxeParser.typeDeclFlags_return retval = new HaxeParser.typeDeclFlags_return();
        retval.start = input.LT(1);

        int typeDeclFlags_StartIndex = input.index();

        Object root_0 = null;

        Token set22=null;
        HaxeParser.meta_return meta21 =null;


        Object set22_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Haxe.g:113:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:113:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:113:7: ( meta )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==MONKEYS_AT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Haxe.g:113:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags453);
            	    meta21=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta21.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // Haxe.g:113:15: ( EXTERN | PRIVATE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EXTERN||LA11_0==PRIVATE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    set22=(Token)input.LT(1);

            	    if ( input.LA(1)==EXTERN||input.LA(1)==PRIVATE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set22)
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
            	    break loop11;
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
    // Haxe.g:119:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:119:17: ( PRIVATE | EXTERN )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set23=(Token)input.LT(1);

            if ( input.LA(1)==EXTERN||input.LA(1)==PRIVATE ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set23)
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


    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declAttr"
    // Haxe.g:123:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:123:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set24=(Token)input.LT(1);

            if ( input.LA(1)==DYNAMIC||input.LA(1)==INLINE||input.LA(1)==OVERRIDE||input.LA(1)==PRIVATE||input.LA(1)==PUBLIC||input.LA(1)==STATIC ) {
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, declAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declAttr"


    public static class topLevelAccessAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelAccessAttr"
    // Haxe.g:131:1: topLevelAccessAttr : topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) ;
    public final HaxeParser.topLevelAccessAttr_return topLevelAccessAttr() throws RecognitionException {
        HaxeParser.topLevelAccessAttr_return retval = new HaxeParser.topLevelAccessAttr_return();
        retval.start = input.LT(1);

        int topLevelAccessAttr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevelAccess_return topLevelAccess25 =null;


        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:132:17: ( topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) )
            // Haxe.g:132:19: topLevelAccess
            {
            pushFollow(FOLLOW_topLevelAccess_in_topLevelAccessAttr711);
            topLevelAccess25=topLevelAccess();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess25.getTree());

            // AST REWRITE
            // elements: topLevelAccess
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:34: -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
            {
                // Haxe.g:132:37: ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(DECL_ATTR_LIST, "Top_Level_Access")
                , root_1);

                adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 10, topLevelAccessAttr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelAccessAttr"


    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declAttrList"
    // Haxe.g:135:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr26 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:135:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:135:19: ( declAttr )+
            {
            // Haxe.g:135:19: ( declAttr )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==DYNAMIC||LA12_0==INLINE||LA12_0==OVERRIDE||LA12_0==PRIVATE||LA12_0==PUBLIC||LA12_0==STATIC) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:135:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList751);
            	    declAttr26=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr26.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // 135:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:135:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:138:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
    public final HaxeParser.paramList_return paramList() throws RecognitionException {
        HaxeParser.paramList_return retval = new HaxeParser.paramList_return();
        retval.start = input.LT(1);

        int paramList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA28=null;
        HaxeParser.param_return param27 =null;

        HaxeParser.param_return param29 =null;


        Object COMMA28_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Haxe.g:138:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:138:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList796);
            param27=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param27.getTree());

            // Haxe.g:138:25: ( COMMA param )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Haxe.g:138:26: COMMA param
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList799); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA28);


            	    pushFollow(FOLLOW_param_in_paramList801);
            	    param29=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_param.add(param29.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // 138:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:138:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:141:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( typeTag )? ( varInit )? ( QUES )? ) ;
    public final HaxeParser.param_return param() throws RecognitionException {
        HaxeParser.param_return retval = new HaxeParser.param_return();
        retval.start = input.LT(1);

        int param_StartIndex = input.index();

        Object root_0 = null;

        Token QUES30=null;
        Token IDENTIFIER31=null;
        HaxeParser.typeTag_return typeTag32 =null;

        HaxeParser.varInit_return varInit33 =null;


        Object QUES30_tree=null;
        Object IDENTIFIER31_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:141:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:141:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:141:19: ( QUES )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==QUES) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:141:19: QUES
                    {
                    QUES30=(Token)match(input,QUES,FOLLOW_QUES_in_param851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES30);


                    }
                    break;

            }


            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER31);


            // Haxe.g:141:36: ( typeTag )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLON) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:141:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param856);
                    typeTag32=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag32.getTree());

                    }
                    break;

            }


            // Haxe.g:141:45: ( varInit )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQ) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Haxe.g:141:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param859);
                    varInit33=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit33.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: QUES, IDENTIFIER, typeTag, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:54: -> ^( IDENTIFIER ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:141:57: ^( IDENTIFIER ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Declaration(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:141:83: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:141:92: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:141:101: ( QUES )?
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


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // Haxe.g:144:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER34=null;

        Object IDENTIFIER34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:144:17: ( IDENTIFIER )
            // Haxe.g:144:19: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier908); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER34_tree = 
            new Usage(IDENTIFIER34) 
            ;
            adaptor.addChild(root_0, IDENTIFIER34_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 14, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // Haxe.g:147:1: id : ( identifier | THIS | SUPER );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);

        int id_StartIndex = input.index();

        Object root_0 = null;

        Token THIS36=null;
        Token SUPER37=null;
        HaxeParser.identifier_return identifier35 =null;


        Object THIS36_tree=null;
        Object SUPER37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Haxe.g:147:17: ( identifier | THIS | SUPER )
            int alt17=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt17=1;
                }
                break;
            case THIS:
                {
                alt17=2;
                }
                break;
            case SUPER:
                {
                alt17=3;
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
                    // Haxe.g:147:19: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_id965);
                    identifier35=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:148:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS36=(Token)match(input,THIS,FOLLOW_THIS_in_id985); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS36_tree = 
                    new Usage(THIS36) 
                    ;
                    adaptor.addChild(root_0, THIS36_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:149:19: SUPER
                    {
                    root_0 = (Object)adaptor.nil();


                    SUPER37=(Token)match(input,SUPER,FOLLOW_SUPER_in_id1008); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER37_tree = 
                    new Usage(SUPER37) 
                    ;
                    adaptor.addChild(root_0, SUPER37_tree);
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


    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // Haxe.g:152:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        Object root_0 = null;

        Token EQ38=null;
        Token PLUSEQ39=null;
        Token SUBEQ40=null;
        Token STAREQ41=null;
        Token SLASHEQ42=null;
        Token PERCENTEQ43=null;
        Token AMPEQ44=null;
        Token BAREQ45=null;
        Token CARETEQ46=null;
        Token LTLTEQ47=null;
        Token GTGTEQ48=null;
        Token GTGTGTEQ49=null;

        Object EQ38_tree=null;
        Object PLUSEQ39_tree=null;
        Object SUBEQ40_tree=null;
        Object STAREQ41_tree=null;
        Object SLASHEQ42_tree=null;
        Object PERCENTEQ43_tree=null;
        Object AMPEQ44_tree=null;
        Object BAREQ45_tree=null;
        Object CARETEQ46_tree=null;
        Object LTLTEQ47_tree=null;
        Object GTGTEQ48_tree=null;
        Object GTGTGTEQ49_tree=null;
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

            // Haxe.g:152:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
            int alt18=12;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt18=1;
                }
                break;
            case PLUSEQ:
                {
                alt18=2;
                }
                break;
            case SUBEQ:
                {
                alt18=3;
                }
                break;
            case STAREQ:
                {
                alt18=4;
                }
                break;
            case SLASHEQ:
                {
                alt18=5;
                }
                break;
            case PERCENTEQ:
                {
                alt18=6;
                }
                break;
            case AMPEQ:
                {
                alt18=7;
                }
                break;
            case BAREQ:
                {
                alt18=8;
                }
                break;
            case CARETEQ:
                {
                alt18=9;
                }
                break;
            case LTLTEQ:
                {
                alt18=10;
                }
                break;
            case GTGTEQ:
                {
                alt18=11;
                }
                break;
            case GTGTGTEQ:
                {
                alt18=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Haxe.g:152:19: EQ
                    {
                    EQ38=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ38);


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
                    // 152:28: -> EQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_EQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:153:19: PLUSEQ
                    {
                    PLUSEQ39=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ39);


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
                    // 153:28: -> PLUSEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_PLUSEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:154:19: SUBEQ
                    {
                    SUBEQ40=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1105); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ40);


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
                    // 154:28: -> SUBEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_SUBEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:155:19: STAREQ
                    {
                    STAREQ41=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAREQ.add(STAREQ41);


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
                    // 155:28: -> STAREQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_STAREQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:156:19: SLASHEQ
                    {
                    SLASHEQ42=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ42);


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
                    // 156:28: -> SLASHEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_SLASHEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:157:19: PERCENTEQ
                    {
                    PERCENTEQ43=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ43);


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
                    // 157:29: -> PERCENTEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_PERCENTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:158:19: AMPEQ
                    {
                    AMPEQ44=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ44);


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
                    // 158:28: -> AMPEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_AMPEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:159:19: BAREQ
                    {
                    BAREQ45=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAREQ.add(BAREQ45);


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
                    // 159:28: -> BAREQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_BAREQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // Haxe.g:160:19: CARETEQ
                    {
                    CARETEQ46=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CARETEQ.add(CARETEQ46);


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
                    // 160:28: -> CARETEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_CARETEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 10 :
                    // Haxe.g:161:19: LTLTEQ
                    {
                    LTLTEQ47=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LTLTEQ.add(LTLTEQ47);


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
                    // 161:28: -> LTLTEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_LTLTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 11 :
                    // Haxe.g:162:19: GTGTEQ
                    {
                    GTGTEQ48=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTEQ.add(GTGTEQ48);


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
                    // 162:28: -> GTGTEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_GTGTEQ.nextToken())
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 12 :
                    // Haxe.g:163:19: GTGTGTEQ
                    {
                    GTGTGTEQ49=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGTEQ.add(GTGTGTEQ49);


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
                    // 163:28: -> GTGTGTEQ
                    {
                        adaptor.addChild(root_0, 
                        new Assignment(stream_GTGTGTEQ.nextToken())
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
    // Haxe.g:166:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);

        int funcLit_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION50=null;
        Token LPAREN51=null;
        Token RPAREN53=null;
        HaxeParser.paramList_return paramList52 =null;

        HaxeParser.typeTag_return typeTag54 =null;

        HaxeParser.block_return block55 =null;


        Object FUNCTION50_tree=null;
        Object LPAREN51_tree=null;
        Object RPAREN53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Haxe.g:166:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:166:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1421); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION50_tree = 
            new Function(FUNCTION50) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION50_tree, root_0);
            }

            LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1427); if (state.failed) return retval;

            // Haxe.g:166:47: ( paramList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||LA19_0==QUES) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:166:47: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1430);
                    paramList52=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList52.getTree());

                    }
                    break;

            }


            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1433); if (state.failed) return retval;

            // Haxe.g:166:66: ( typeTag )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLON) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Haxe.g:166:66: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1436);
                    typeTag54=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag54.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1439);
            block55=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block55.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:194:1: typeTag : COLON funcType -> ^( TYPE_TAG funcType ) ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON56=null;
        HaxeParser.funcType_return funcType57 =null;


        Object COLON56_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Haxe.g:194:17: ( COLON funcType -> ^( TYPE_TAG funcType ) )
            // Haxe.g:194:19: COLON funcType
            {
            COLON56=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1483); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON56);


            pushFollow(FOLLOW_funcType_in_typeTag1485);
            funcType57=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType57.getTree());

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
            // 194:34: -> ^( TYPE_TAG funcType )
            {
                // Haxe.g:194:37: ^( TYPE_TAG funcType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new TypeTag(TYPE_TAG)
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
    // Haxe.g:197:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA59=null;
        Token COMMA62=null;
        HaxeParser.funcType_return funcType58 =null;

        HaxeParser.typeList_return typeList60 =null;

        HaxeParser.typeConstraint_return typeConstraint61 =null;

        HaxeParser.typeList_return typeList63 =null;


        Object COMMA59_tree=null;
        Object COMMA62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:197:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==EOF||LA23_1==COMMA||LA23_1==DOT||LA23_1==GT||LA23_1==GTGT||LA23_1==GTGTGT||LA23_1==LT||LA23_1==MINUS_BIGGER||LA23_1==RPAREN) ) {
                    alt23=1;
                }
                else if ( (LA23_1==COLON) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA23_0==LBRACE) ) {
                alt23=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Haxe.g:197:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1528);
                    funcType58=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType58.getTree());

                    // Haxe.g:197:28: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:197:29: COMMA ! typeList
                            {
                            COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1531); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1534);
                            typeList60=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList60.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:198:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1556);
                    typeConstraint61=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint61.getTree());

                    // Haxe.g:198:34: ( COMMA ! typeList )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==COMMA) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Haxe.g:198:35: COMMA ! typeList
                            {
                            COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1559); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1562);
                            typeList63=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList63.getTree());

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
    // Haxe.g:201:1: funcType : type ( MINUS_BIGGER ! type )* ;
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER65=null;
        HaxeParser.type_return type64 =null;

        HaxeParser.type_return type66 =null;


        Object MINUS_BIGGER65_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:201:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:201:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1597);
            type64=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());

            // Haxe.g:201:24: ( MINUS_BIGGER ! type )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MINUS_BIGGER) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Haxe.g:201:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER65=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1600); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1603);
            	    type66=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type66.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 20, funcType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcType"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:204:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\", LBRACE, RBRACE] ( anonTypePart )? ) ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE67=null;
        Token RBRACE69=null;
        HaxeParser.anonTypePart_return anonTypePart68 =null;


        Object LBRACE67_tree=null;
        Object RBRACE69_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_anonTypePart=new RewriteRuleSubtreeStream(adaptor,"rule anonTypePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:204:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\", LBRACE, RBRACE] ( anonTypePart )? ) )
            // Haxe.g:204:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE67=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE67);


            // Haxe.g:204:26: ( anonTypePart )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==GT||LA25_0==IDENTIFIER||LA25_0==VAR) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Haxe.g:204:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1643);
                    anonTypePart68=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart68.getTree());

                    }
                    break;

            }


            RBRACE69=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1646); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE69);


            // AST REWRITE
            // elements: anonTypePart
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:47: -> ^( TYPE_TAG[\"AnonType\", LBRACE, RBRACE] ( anonTypePart )? )
            {
                // Haxe.g:204:50: ^( TYPE_TAG[\"AnonType\", LBRACE, RBRACE] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new TypeTag(TYPE_TAG, "AnonType", LBRACE, RBRACE)
                , root_1);

                // Haxe.g:204:98: ( anonTypePart )?
                if ( stream_anonTypePart.hasNext() ) {
                    adaptor.addChild(root_1, stream_anonTypePart.nextTree());

                }
                stream_anonTypePart.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 21, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypePart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypePart"
    // Haxe.g:207:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
    public final HaxeParser.anonTypePart_return anonTypePart() throws RecognitionException {
        HaxeParser.anonTypePart_return retval = new HaxeParser.anonTypePart_return();
        retval.start = input.LT(1);

        int anonTypePart_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA73=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList70 =null;

        HaxeParser.varDecl_return varDecl71 =null;

        HaxeParser.typeExtend_return typeExtend72 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList74 =null;

        HaxeParser.varDecl_return varDecl75 =null;


        Object COMMA73_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:207:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
            int alt29=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt29=1;
                }
                break;
            case VAR:
                {
                alt29=2;
                }
                break;
            case GT:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // Haxe.g:207:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1687);
                    anonTypeFieldList70=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList70.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:208:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:208:19: ( varDecl )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==VAR) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Haxe.g:208:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1707);
                    	    varDecl71=varDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Haxe.g:209:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1728);
                    typeExtend72=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend72.getTree());

                    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1730); if (state.failed) return retval;

                    // Haxe.g:209:37: ( anonTypeFieldList | ( varDecl )+ )?
                    int alt28=3;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==VAR) ) {
                        alt28=2;
                    }
                    switch (alt28) {
                        case 1 :
                            // Haxe.g:209:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1735);
                            anonTypeFieldList74=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList74.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:209:59: ( varDecl )+
                            {
                            // Haxe.g:209:59: ( varDecl )+
                            int cnt27=0;
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==VAR) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // Haxe.g:209:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1739);
                            	    varDecl75=varDecl();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl75.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt27 >= 1 ) break loop27;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(27, input);
                                        throw eee;
                                }
                                cnt27++;
                            } while (true);


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
            if ( state.backtracking>0 ) { memoize(input, 22, anonTypePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypePart"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:212:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA77=null;
        HaxeParser.anonTypeField_return anonTypeField76 =null;

        HaxeParser.anonTypeField_return anonTypeField78 =null;


        Object COMMA77_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_anonTypeField=new RewriteRuleSubtreeStream(adaptor,"rule anonTypeField");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:213:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:213:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1789);
            anonTypeField76=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField76.getTree());

            // Haxe.g:213:33: ( COMMA anonTypeField )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Haxe.g:213:34: COMMA anonTypeField
            	    {
            	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1792); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1794);
            	    anonTypeField78=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField78.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // AST REWRITE
            // elements: anonTypeField
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:56: -> ( anonTypeField )+
            {
                if ( !(stream_anonTypeField.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_anonTypeField.hasNext() ) {
                    adaptor.addChild(root_0, stream_anonTypeField.nextTree());

                }
                stream_anonTypeField.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 23, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // Haxe.g:216:1: type : ( filepath ^| anonType ^) ( typeParam )? ;
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.filepath_return filepath79 =null;

        HaxeParser.anonType_return anonType80 =null;

        HaxeParser.typeParam_return typeParam81 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:216:17: ( ( filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:216:19: ( filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:216:19: ( filepath ^| anonType ^)
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENTIFIER) ) {
                alt31=1;
            }
            else if ( (LA31_0==LBRACE) ) {
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
                    // Haxe.g:216:21: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1839);
                    filepath79=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath79.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:216:33: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1844);
                    anonType80=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType80.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:216:45: ( typeParam )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred53_Haxe()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:216:45: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1849);
                    typeParam81=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam81.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 24, type_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "type"


    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParam"
    // Haxe.g:219:1: typeParam : ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT82=null;
        Token LT85=null;
        Token GT87=null;
        HaxeParser.typeList_return typeList83 =null;

        HaxeParser.typeParamPart_return typeParamPart84 =null;

        HaxeParser.typeList_return typeList86 =null;


        Object LT82_tree=null;
        Object LT85_tree=null;
        Object GT87_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_typeParamPart=new RewriteRuleSubtreeStream(adaptor,"rule typeParamPart");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:219:17: ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LT) ) {
                int LA33_1 = input.LA(2);

                if ( (synpred54_Haxe()) ) {
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
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // Haxe.g:219:19: LT typeList typeParamPart
                    {
                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1885); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT82);


                    pushFollow(FOLLOW_typeList_in_typeParam1887);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList83.getTree());

                    pushFollow(FOLLOW_typeParamPart_in_typeParam1889);
                    typeParamPart84=typeParamPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamPart.add(typeParamPart84.getTree());

                    // AST REWRITE
                    // elements: typeList, typeParamPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:45: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
                    {
                        // Haxe.g:219:48: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

                        adaptor.addChild(root_1, stream_typeParamPart.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:220:19: LT typeList GT
                    {
                    LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1923); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT85);


                    pushFollow(FOLLOW_typeList_in_typeParam1925);
                    typeList86=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList86.getTree());

                    GT87=(Token)match(input,GT,FOLLOW_GT_in_typeParam1927); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(GT87);


                    // AST REWRITE
                    // elements: typeList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:34: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:220:37: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 25, typeParam_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParam"


    public static class typeParamPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeParamPart"
    // Haxe.g:223:1: typeParamPart : ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) );
    public final HaxeParser.typeParamPart_return typeParamPart() throws RecognitionException {
        HaxeParser.typeParamPart_return retval = new HaxeParser.typeParamPart_return();
        retval.start = input.LT(1);

        int typeParamPart_StartIndex = input.index();

        Object root_0 = null;

        Token LT88=null;
        Token GTGT90=null;
        Token LT91=null;
        Token GTGTGT94=null;
        HaxeParser.typeList_return typeList89 =null;

        HaxeParser.typeList_return typeList92 =null;

        HaxeParser.typeParam_return typeParam93 =null;


        Object LT88_tree=null;
        Object GTGT90_tree=null;
        Object LT91_tree=null;
        Object GTGTGT94_tree=null;
        RewriteRuleTokenStream stream_GTGTGT=new RewriteRuleTokenStream(adaptor,"token GTGTGT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GTGT=new RewriteRuleTokenStream(adaptor,"token GTGT");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:223:17: ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==LT) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred55_Haxe()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Haxe.g:223:19: LT typeList GTGT
                    {
                    LT88=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart1983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT88);


                    pushFollow(FOLLOW_typeList_in_typeParamPart1985);
                    typeList89=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList89.getTree());

                    GTGT90=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParamPart1987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGT.add(GTGT90);


                    // AST REWRITE
                    // elements: typeList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:36: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:223:39: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:224:19: LT typeList ( typeParam )? GTGTGT
                    {
                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT91);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2021);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList92.getTree());

                    // Haxe.g:224:31: ( typeParam )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==LT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:224:31: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_typeParamPart2023);
                            typeParam93=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam93.getTree());

                            }
                            break;

                    }


                    GTGTGT94=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParamPart2026); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGT.add(GTGTGT94);


                    // AST REWRITE
                    // elements: typeList, typeParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:49: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                    {
                        // Haxe.g:224:52: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

                        // Haxe.g:224:98: ( typeParam )?
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, typeParamPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeParamPart"


    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeConstraint"
    // Haxe.g:227:1: typeConstraint : identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token COLON96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        HaxeParser.identifier_return identifier95 =null;

        HaxeParser.typeList_return typeList98 =null;


        Object COLON96_tree=null;
        Object LPAREN97_tree=null;
        Object RPAREN99_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:228:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:228:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint2077);
            identifier95=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier95.getTree());

            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint2079); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON96);


            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint2081); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);


            pushFollow(FOLLOW_typeList_in_typeConstraint2083);
            typeList98=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList98.getTree());

            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint2085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);


            // AST REWRITE
            // elements: typeList, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 228:47: -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
            {
                // Haxe.g:228:50: ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_CONSTRAIN, "TYPE_CONSTRAIN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Haxe.g:228:106: ( typeList )?
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
            if ( state.backtracking>0 ) { memoize(input, 27, typeConstraint_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeConstraint"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Haxe.g:232:1: statement : ( statementLast | expr SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI102=null;
        HaxeParser.statementLast_return statementLast100 =null;

        HaxeParser.expr_return expr101 =null;


        Object SEMI102_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:232:17: ( statementLast | expr SEMI !)
            int alt36=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==BANG||LA36_1==BREAK||LA36_1==CAST||(LA36_1 >= CHARLITERAL && LA36_1 <= CLASS)||LA36_1==CONTINUE||LA36_1==DO||LA36_1==EXTERN||LA36_1==FALSE||(LA36_1 >= FLOATNUM && LA36_1 <= FUNCTION)||LA36_1==IF||LA36_1==INTLITERAL||(LA36_1 >= LBRACE && LA36_1 <= LBRACKET)||(LA36_1 >= LONGLITERAL && LA36_1 <= LPAREN)||(LA36_1 >= NEW && LA36_1 <= NULL)||LA36_1==PLUSPLUS||LA36_1==PRIVATE||LA36_1==RBRACE||LA36_1==RETURN||(LA36_1 >= STRINGLITERAL && LA36_1 <= SUB)||LA36_1==SUBSUB||(LA36_1 >= SUPER && LA36_1 <= THROW)||LA36_1==TILDE||(LA36_1 >= TRUE && LA36_1 <= TRY)||LA36_1==UNTYPED||LA36_1==VAR||LA36_1==WHILE) ) {
                    alt36=1;
                }
                else if ( (LA36_1==IDENTIFIER) ) {
                    int LA36_4 = input.LA(3);

                    if ( (LA36_4==COLON) ) {
                        alt36=2;
                    }
                    else if ( ((LA36_4 >= AMP && LA36_4 <= AMPEQ)||LA36_4==BANGEQ||(LA36_4 >= BAR && LA36_4 <= BAREQ)||(LA36_4 >= CARET && LA36_4 <= CARETEQ)||LA36_4==DOT||LA36_4==ELLIPSIS||(LA36_4 >= EQ && LA36_4 <= EQEQ)||(LA36_4 >= GT && LA36_4 <= GTGTGTEQ)||LA36_4==LBRACKET||(LA36_4 >= LPAREN && LA36_4 <= LTLTEQ)||(LA36_4 >= PERCENT && LA36_4 <= PLUSPLUS)||LA36_4==QUES||LA36_4==SEMI||(LA36_4 >= SLASH && LA36_4 <= STAREQ)||(LA36_4 >= SUB && LA36_4 <= SUBSUB)) ) {
                        alt36=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

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
            case SWITCH:
            case THROW:
            case TRY:
            case WHILE:
                {
                alt36=1;
                }
                break;
            case BANG:
            case CAST:
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case IDENTIFIER:
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
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case UNTYPED:
                {
                alt36=2;
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
                    // Haxe.g:232:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statement2125);
                    statementLast100=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast100.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:233:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2145);
                    expr101=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr101.getTree());

                    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2147); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class statementLast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementLast"
    // Haxe.g:236:1: statementLast : ( block | IF ^ parExpression ( statementOrLast ELSE !)? statement | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !);
    public final HaxeParser.statementLast_return statementLast() throws RecognitionException {
        HaxeParser.statementLast_return retval = new HaxeParser.statementLast_return();
        retval.start = input.LT(1);

        int statementLast_StartIndex = input.index();

        Object root_0 = null;

        Token IF104=null;
        Token ELSE107=null;
        Token FOR109=null;
        Token LPAREN110=null;
        Token IN112=null;
        Token RPAREN114=null;
        Token WHILE116=null;
        Token DO119=null;
        Token WHILE121=null;
        Token SEMI123=null;
        Token TRY124=null;
        Token SWITCH127=null;
        Token LPAREN128=null;
        Token RPAREN130=null;
        Token LBRACE131=null;
        Token RBRACE133=null;
        Token RETURN134=null;
        Token SEMI136=null;
        Token THROW137=null;
        Token SEMI139=null;
        Token set140=null;
        Token SEMI141=null;
        HaxeParser.block_return block103 =null;

        HaxeParser.parExpression_return parExpression105 =null;

        HaxeParser.statementOrLast_return statementOrLast106 =null;

        HaxeParser.statement_return statement108 =null;

        HaxeParser.expr_return expr111 =null;

        HaxeParser.iterExpr_return iterExpr113 =null;

        HaxeParser.statement_return statement115 =null;

        HaxeParser.parExpression_return parExpression117 =null;

        HaxeParser.statement_return statement118 =null;

        HaxeParser.statement_return statement120 =null;

        HaxeParser.parExpression_return parExpression122 =null;

        HaxeParser.block_return block125 =null;

        HaxeParser.catchStmt_return catchStmt126 =null;

        HaxeParser.expr_return expr129 =null;

        HaxeParser.caseStmt_return caseStmt132 =null;

        HaxeParser.expr_return expr135 =null;

        HaxeParser.expr_return expr138 =null;


        Object IF104_tree=null;
        Object ELSE107_tree=null;
        Object FOR109_tree=null;
        Object LPAREN110_tree=null;
        Object IN112_tree=null;
        Object RPAREN114_tree=null;
        Object WHILE116_tree=null;
        Object DO119_tree=null;
        Object WHILE121_tree=null;
        Object SEMI123_tree=null;
        Object TRY124_tree=null;
        Object SWITCH127_tree=null;
        Object LPAREN128_tree=null;
        Object RPAREN130_tree=null;
        Object LBRACE131_tree=null;
        Object RBRACE133_tree=null;
        Object RETURN134_tree=null;
        Object SEMI136_tree=null;
        Object THROW137_tree=null;
        Object SEMI139_tree=null;
        Object set140_tree=null;
        Object SEMI141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:236:17: ( block | IF ^ parExpression ( statementOrLast ELSE !)? statement | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !)
            int alt41=10;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt41=1;
                }
                break;
            case IF:
                {
                alt41=2;
                }
                break;
            case FOR:
                {
                alt41=3;
                }
                break;
            case WHILE:
                {
                alt41=4;
                }
                break;
            case DO:
                {
                alt41=5;
                }
                break;
            case TRY:
                {
                alt41=6;
                }
                break;
            case SWITCH:
                {
                alt41=7;
                }
                break;
            case RETURN:
                {
                alt41=8;
                }
                break;
            case THROW:
                {
                alt41=9;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt41=10;
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
                    // Haxe.g:236:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statementLast2179);
                    block103=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block103.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:237:19: IF ^ parExpression ( statementOrLast ELSE !)? statement
                    {
                    root_0 = (Object)adaptor.nil();


                    IF104=(Token)match(input,IF,FOLLOW_IF_in_statementLast2199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF104_tree = 
                    new IfNode(IF104) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF104_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2205);
                    parExpression105=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression105.getTree());

                    // Haxe.g:237:45: ( statementOrLast ELSE !)?
                    int alt37=2;
                    switch ( input.LA(1) ) {
                        case LBRACE:
                            {
                            int LA37_1 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case IF:
                            {
                            int LA37_2 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case FOR:
                            {
                            int LA37_3 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case WHILE:
                            {
                            int LA37_4 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case DO:
                            {
                            int LA37_5 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case TRY:
                            {
                            int LA37_6 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case SWITCH:
                            {
                            int LA37_7 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case RETURN:
                            {
                            int LA37_8 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case THROW:
                            {
                            int LA37_9 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case BREAK:
                        case CONTINUE:
                            {
                            int LA37_10 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case UNTYPED:
                            {
                            int LA37_11 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case SUB:
                            {
                            int LA37_12 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case SUBSUB:
                            {
                            int LA37_13 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case PLUSPLUS:
                            {
                            int LA37_14 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case BANG:
                            {
                            int LA37_15 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case TILDE:
                            {
                            int LA37_16 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case NEW:
                            {
                            int LA37_17 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case CAST:
                            {
                            int LA37_18 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case FUNCTION:
                            {
                            int LA37_19 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case LBRACKET:
                            {
                            int LA37_20 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case LONGLITERAL:
                            {
                            int LA37_21 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case NULL:
                            {
                            int LA37_22 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case INTLITERAL:
                            {
                            int LA37_23 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case STRINGLITERAL:
                            {
                            int LA37_24 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case CHARLITERAL:
                            {
                            int LA37_25 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case FLOATNUM:
                            {
                            int LA37_26 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case TRUE:
                            {
                            int LA37_27 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case FALSE:
                            {
                            int LA37_28 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            int LA37_29 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA37_30 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case THIS:
                            {
                            int LA37_31 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                        case SUPER:
                            {
                            int LA37_32 = input.LA(2);

                            if ( (synpred59_Haxe()) ) {
                                alt37=1;
                            }
                            }
                            break;
                    }

                    switch (alt37) {
                        case 1 :
                            // Haxe.g:237:46: statementOrLast ELSE !
                            {
                            pushFollow(FOLLOW_statementOrLast_in_statementLast2208);
                            statementOrLast106=statementOrLast();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementOrLast106.getTree());

                            ELSE107=(Token)match(input,ELSE,FOLLOW_ELSE_in_statementLast2210); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_statement_in_statementLast2215);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement108.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:238:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR109=(Token)match(input,FOR,FOLLOW_FOR_in_statementLast2235); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR109_tree = 
                    new For(FOR109) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR109_tree, root_0);
                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2241); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2244);
                    expr111=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr111.getTree());

                    IN112=(Token)match(input,IN,FOLLOW_IN_in_statementLast2246); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statementLast2249);
                    iterExpr113=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr113.getTree());

                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2251); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statementLast2254);
                    statement115=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement115.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:239:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE116=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2274); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE116_tree = 
                    new While(WHILE116) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE116_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2280);
                    parExpression117=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression117.getTree());

                    pushFollow(FOLLOW_statement_in_statementLast2282);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement118.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:240:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO119=(Token)match(input,DO,FOLLOW_DO_in_statementLast2302); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO119_tree = 
                    new DoWhile(DO119) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO119_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statementLast2308);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement120.getTree());

                    WHILE121=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2310); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statementLast2313);
                    parExpression122=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression122.getTree());

                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2315); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:241:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY124=(Token)match(input,TRY,FOLLOW_TRY_in_statementLast2336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY124_tree = 
                    new TryNode(TRY124) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY124_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statementLast2342);
                    block125=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block125.getTree());

                    // Haxe.g:241:39: ( catchStmt )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==CATCH) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Haxe.g:241:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statementLast2344);
                    	    catchStmt126=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt126.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);


                    }
                    break;
                case 7 :
                    // Haxe.g:242:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH127=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statementLast2365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH127_tree = 
                    new SwitchNode(SWITCH127) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH127_tree, root_0);
                    }

                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2371); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2374);
                    expr129=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr129.getTree());

                    RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2376); if (state.failed) return retval;

                    LBRACE131=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statementLast2379); if (state.failed) return retval;

                    // Haxe.g:242:68: ( caseStmt )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==CASE||LA39_0==DEFAULT) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Haxe.g:242:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statementLast2382);
                    	    caseStmt132=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    RBRACE133=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statementLast2385); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:243:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN134=(Token)match(input,RETURN,FOLLOW_RETURN_in_statementLast2406); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN134_tree = 
                    new Return(RETURN134) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN134_tree, root_0);
                    }

                    // Haxe.g:243:35: ( expr )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==BANG||LA40_0==CAST||LA40_0==CHARLITERAL||LA40_0==FALSE||LA40_0==FLOATNUM||LA40_0==FUNCTION||LA40_0==IDENTIFIER||LA40_0==INTLITERAL||(LA40_0 >= LBRACE && LA40_0 <= LBRACKET)||(LA40_0 >= LONGLITERAL && LA40_0 <= LPAREN)||(LA40_0 >= NEW && LA40_0 <= NULL)||LA40_0==PLUSPLUS||(LA40_0 >= STRINGLITERAL && LA40_0 <= SUB)||LA40_0==SUBSUB||LA40_0==SUPER||LA40_0==THIS||LA40_0==TILDE||LA40_0==TRUE||LA40_0==UNTYPED) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // Haxe.g:243:35: expr
                            {
                            pushFollow(FOLLOW_expr_in_statementLast2412);
                            expr135=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                            }
                            break;

                    }


                    SEMI136=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2415); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:244:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW137=(Token)match(input,THROW,FOLLOW_THROW_in_statementLast2436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW137_tree = 
                    (Object)adaptor.create(THROW137)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW137_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statementLast2439);
                    expr138=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2441); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:245:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set140=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set140)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI141=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2470); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, statementLast_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementLast"


    public static class statementOrLast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statementOrLast"
    // Haxe.g:249:1: statementOrLast : ( statementLast | expr );
    public final HaxeParser.statementOrLast_return statementOrLast() throws RecognitionException {
        HaxeParser.statementOrLast_return retval = new HaxeParser.statementOrLast_return();
        retval.start = input.LT(1);

        int statementOrLast_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.statementLast_return statementLast142 =null;

        HaxeParser.expr_return expr143 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:249:17: ( statementLast | expr )
            int alt42=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==BANG||LA42_1==BREAK||LA42_1==CAST||(LA42_1 >= CHARLITERAL && LA42_1 <= CLASS)||LA42_1==CONTINUE||LA42_1==DO||LA42_1==EXTERN||LA42_1==FALSE||(LA42_1 >= FLOATNUM && LA42_1 <= FUNCTION)||LA42_1==IF||LA42_1==INTLITERAL||(LA42_1 >= LBRACE && LA42_1 <= LBRACKET)||(LA42_1 >= LONGLITERAL && LA42_1 <= LPAREN)||(LA42_1 >= NEW && LA42_1 <= NULL)||LA42_1==PLUSPLUS||LA42_1==PRIVATE||LA42_1==RBRACE||LA42_1==RETURN||(LA42_1 >= STRINGLITERAL && LA42_1 <= SUB)||LA42_1==SUBSUB||(LA42_1 >= SUPER && LA42_1 <= THROW)||LA42_1==TILDE||(LA42_1 >= TRUE && LA42_1 <= TRY)||LA42_1==UNTYPED||LA42_1==VAR||LA42_1==WHILE) ) {
                    alt42=1;
                }
                else if ( (LA42_1==IDENTIFIER) ) {
                    int LA42_4 = input.LA(3);

                    if ( (LA42_4==COLON) ) {
                        alt42=2;
                    }
                    else if ( ((LA42_4 >= AMP && LA42_4 <= AMPEQ)||LA42_4==BANGEQ||(LA42_4 >= BAR && LA42_4 <= BAREQ)||(LA42_4 >= CARET && LA42_4 <= CARETEQ)||LA42_4==DOT||LA42_4==ELLIPSIS||(LA42_4 >= EQ && LA42_4 <= EQEQ)||(LA42_4 >= GT && LA42_4 <= GTGTGTEQ)||LA42_4==LBRACKET||(LA42_4 >= LPAREN && LA42_4 <= LTLTEQ)||(LA42_4 >= PERCENT && LA42_4 <= PLUSPLUS)||LA42_4==QUES||LA42_4==SEMI||(LA42_4 >= SLASH && LA42_4 <= STAREQ)||(LA42_4 >= SUB && LA42_4 <= SUBSUB)) ) {
                        alt42=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

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
            case SWITCH:
            case THROW:
            case TRY:
            case WHILE:
                {
                alt42=1;
                }
                break;
            case BANG:
            case CAST:
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case FUNCTION:
            case IDENTIFIER:
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
            case SUPER:
            case THIS:
            case TILDE:
            case TRUE:
            case UNTYPED:
                {
                alt42=2;
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
                    // Haxe.g:249:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statementOrLast2493);
                    statementLast142=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast142.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:250:19: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statementOrLast2513);
                    expr143=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr143.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, statementOrLast_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "statementOrLast"


    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
    // Haxe.g:253:1: parExpression : LPAREN ! expr RPAREN !;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:253:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:253:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2543); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2546);
            expr145=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr145.getTree());

            RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2548); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:256:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) ;
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE147=null;
        Token RBRACE149=null;
        HaxeParser.blockStmt_return blockStmt148 =null;


        Object LBRACE147_tree=null;
        Object RBRACE149_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:256:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:256:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE147=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE147);


            // Haxe.g:256:26: ( blockStmt )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==BANG||LA43_0==BREAK||LA43_0==CAST||(LA43_0 >= CHARLITERAL && LA43_0 <= CLASS)||LA43_0==CONTINUE||LA43_0==DO||LA43_0==EXTERN||LA43_0==FALSE||(LA43_0 >= FLOATNUM && LA43_0 <= FUNCTION)||(LA43_0 >= IDENTIFIER && LA43_0 <= IF)||LA43_0==INTLITERAL||(LA43_0 >= LBRACE && LA43_0 <= LBRACKET)||(LA43_0 >= LONGLITERAL && LA43_0 <= LPAREN)||(LA43_0 >= NEW && LA43_0 <= NULL)||LA43_0==PLUSPLUS||LA43_0==PRIVATE||LA43_0==RETURN||(LA43_0 >= STRINGLITERAL && LA43_0 <= SUB)||LA43_0==SUBSUB||(LA43_0 >= SUPER && LA43_0 <= THROW)||LA43_0==TILDE||(LA43_0 >= TRUE && LA43_0 <= TRY)||LA43_0==UNTYPED||LA43_0==VAR||LA43_0==WHILE) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Haxe.g:256:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2587);
            	    blockStmt148=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt148.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            RBRACE149=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2591); if (state.failed) return retval; 
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
            // 256:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
            {
                // Haxe.g:256:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE147, RBRACE149)
                , root_1);

                // Haxe.g:256:93: ( blockStmt )*
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:259:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl150 =null;

        HaxeParser.classDecl_return classDecl151 =null;

        HaxeParser.statement_return statement152 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:259:17: ( varDecl | classDecl | statement )
            int alt44=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt44=1;
                }
                break;
            case CLASS:
            case EXTERN:
            case PRIVATE:
                {
                alt44=2;
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
            case STRINGLITERAL:
            case SUB:
            case SUBSUB:
            case SUPER:
            case SWITCH:
            case THIS:
            case THROW:
            case TILDE:
            case TRUE:
            case TRY:
            case UNTYPED:
            case WHILE:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // Haxe.g:259:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2635);
                    varDecl150=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl150.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:260:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2646);
                    classDecl151=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl151.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:261:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2657);
                    statement152=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement152.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseStmt"
    // Haxe.g:264:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE153=null;
        Token COLON155=null;
        Token DEFAULT157=null;
        Token COLON158=null;
        HaxeParser.exprList_return exprList154 =null;

        HaxeParser.statement_return statement156 =null;

        HaxeParser.statement_return statement159 =null;


        Object CASE153_tree=null;
        Object COLON155_tree=null;
        Object DEFAULT157_tree=null;
        Object COLON158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:264:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==CASE) ) {
                alt45=1;
            }
            else if ( (LA45_0==DEFAULT) ) {
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
                    // Haxe.g:264:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE153=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE153_tree = 
                    (Object)adaptor.create(CASE153)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE153_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2684);
                    exprList154=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList154.getTree());

                    COLON155=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2686); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2689);
                    statement156=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement156.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:265:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT157=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT157_tree = 
                    (Object)adaptor.create(DEFAULT157)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT157_tree, root_0);
                    }

                    COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2712); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2715);
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
    // Haxe.g:268:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH160=null;
        Token LPAREN161=null;
        Token RPAREN163=null;
        HaxeParser.param_return param162 =null;

        HaxeParser.block_return block164 =null;


        Object CATCH160_tree=null;
        Object LPAREN161_tree=null;
        Object RPAREN163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:268:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:268:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH160=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2750); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH160_tree = 
            new HaxeTree(CATCH160) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH160_tree, root_0);
            }

            LPAREN161=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2756); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2759);
            param162=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param162.getTree());

            RPAREN163=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2761); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2764);
            block164=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block164.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:272:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA166=null;
        HaxeParser.expr_return expr165 =null;

        HaxeParser.expr_return expr167 =null;


        Object COMMA166_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:272:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:272:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2802);
            expr165=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr165.getTree());

            // Haxe.g:272:24: ( COMMA ! expr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:272:25: COMMA ! expr
            	    {
            	    COMMA166=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2805); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2808);
            	    expr167=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());

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
    // Haxe.g:275:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED168=null;
        HaxeParser.assignExpr_return assignExpr169 =null;

        HaxeParser.assignExpr_return assignExpr170 =null;


        Object UNTYPED168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:275:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==UNTYPED) ) {
                alt47=1;
            }
            else if ( (LA47_0==BANG||LA47_0==CAST||LA47_0==CHARLITERAL||LA47_0==FALSE||LA47_0==FLOATNUM||LA47_0==FUNCTION||LA47_0==IDENTIFIER||LA47_0==INTLITERAL||(LA47_0 >= LBRACE && LA47_0 <= LBRACKET)||(LA47_0 >= LONGLITERAL && LA47_0 <= LPAREN)||(LA47_0 >= NEW && LA47_0 <= NULL)||LA47_0==PLUSPLUS||(LA47_0 >= STRINGLITERAL && LA47_0 <= SUB)||LA47_0==SUBSUB||LA47_0==SUPER||LA47_0==THIS||LA47_0==TILDE||LA47_0==TRUE) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:275:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED168=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED168_tree = 
                    (Object)adaptor.create(UNTYPED168)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED168_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2853);
                    assignExpr169=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr169.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:276:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2873);
                    assignExpr170=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr170.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:279:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.ternaryExpr_return ternaryExpr171 =null;

        HaxeParser.assignOp_return assignOp172 =null;

        HaxeParser.ternaryExpr_return ternaryExpr173 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:279:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:279:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2903);
            ternaryExpr171=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr171.getTree());

            // Haxe.g:279:31: ( assignOp ^ ternaryExpr )?
            int alt48=2;
            switch ( input.LA(1) ) {
                case EQ:
                    {
                    int LA48_1 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case PLUSEQ:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case SUBEQ:
                    {
                    int LA48_3 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case STAREQ:
                    {
                    int LA48_4 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case SLASHEQ:
                    {
                    int LA48_5 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case PERCENTEQ:
                    {
                    int LA48_6 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case AMPEQ:
                    {
                    int LA48_7 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case BAREQ:
                    {
                    int LA48_8 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case CARETEQ:
                    {
                    int LA48_9 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case LTLTEQ:
                    {
                    int LA48_10 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case GTGTEQ:
                    {
                    int LA48_11 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
                case GTGTGTEQ:
                    {
                    int LA48_12 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt48=1;
                    }
                    }
                    break;
            }

            switch (alt48) {
                case 1 :
                    // Haxe.g:279:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2906);
                    assignOp172=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp172.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2909);
                    ternaryExpr173=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr173.getTree());

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


    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ternaryExpr"
    // Haxe.g:282:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES175=null;
        Token COLON177=null;
        HaxeParser.logicOrExpr_return logicOrExpr174 =null;

        HaxeParser.expr_return expr176 =null;

        HaxeParser.ternaryExpr_return ternaryExpr178 =null;


        Object QUES175_tree=null;
        Object COLON177_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:282:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:282:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2940);
            logicOrExpr174=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr174.getTree());

            // Haxe.g:282:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==QUES) ) {
                int LA49_1 = input.LA(2);

                if ( (synpred80_Haxe()) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // Haxe.g:282:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES175=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES175_tree = 
                    (Object)adaptor.create(QUES175)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES175_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2946);
                    expr176=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr176.getTree());

                    COLON177=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2948); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2951);
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
            if ( state.backtracking>0 ) { memoize(input, 39, ternaryExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "ternaryExpr"


    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOrExpr"
    // Haxe.g:285:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR180=null;
        HaxeParser.logicAndExpr_return logicAndExpr179 =null;

        HaxeParser.logicAndExpr_return logicAndExpr181 =null;


        Object BARBAR180_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:285:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:285:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2982);
            logicAndExpr179=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr179.getTree());

            // Haxe.g:285:32: ( BARBAR ^ logicAndExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==BARBAR) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred81_Haxe()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:285:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR180=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2985); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR180_tree = 
            	    new Binary(BARBAR180) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR180_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2991);
            	    logicAndExpr181=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr181.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 40, logicOrExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicOrExpr"


    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicAndExpr"
    // Haxe.g:288:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP183=null;
        HaxeParser.iterExpr_return iterExpr182 =null;

        HaxeParser.iterExpr_return iterExpr184 =null;


        Object AMPAMP183_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:288:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:288:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr3025);
            iterExpr182=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr182.getTree());

            // Haxe.g:288:27: ( AMPAMP ^ iterExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AMPAMP) ) {
                    int LA51_2 = input.LA(2);

                    if ( (synpred82_Haxe()) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:288:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP183=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3027); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP183_tree = 
            	    new Binary(AMPAMP183) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP183_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr3033);
            	    iterExpr184=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr184.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 41, logicAndExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "logicAndExpr"


    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iterExpr"
    // Haxe.g:291:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS186=null;
        HaxeParser.cmpExpr_return cmpExpr185 =null;

        HaxeParser.cmpExpr_return cmpExpr187 =null;


        Object ELLIPSIS186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:291:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:291:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr3083);
            cmpExpr185=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr185.getTree());

            // Haxe.g:291:27: ( ELLIPSIS ^ cmpExpr )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ELLIPSIS) ) {
                int LA52_1 = input.LA(2);

                if ( (synpred83_Haxe()) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // Haxe.g:291:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS186=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr3086); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS186_tree = 
                    new Binary(ELLIPSIS186) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS186_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr3092);
                    cmpExpr187=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr187.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 42, iterExpr_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "iterExpr"


    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cmpExpr"
    // Haxe.g:294:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ189=null;
        Token BANGEQ190=null;
        Token GTEQ191=null;
        Token LTEQ192=null;
        Token GT193=null;
        Token LT194=null;
        HaxeParser.bitExpr_return bitExpr188 =null;

        HaxeParser.bitExpr_return bitExpr195 =null;


        Object EQEQ189_tree=null;
        Object BANGEQ190_tree=null;
        Object GTEQ191_tree=null;
        Object LTEQ192_tree=null;
        Object GT193_tree=null;
        Object LT194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:294:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:294:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3131);
            bitExpr188=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr188.getTree());

            // Haxe.g:294:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop54:
            do {
                int alt54=2;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    int LA54_2 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;
                case BANGEQ:
                    {
                    int LA54_3 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;
                case GTEQ:
                    {
                    int LA54_4 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;
                case LTEQ:
                    {
                    int LA54_5 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;
                case GT:
                    {
                    int LA54_6 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;
                case LT:
                    {
                    int LA54_7 = input.LA(2);

                    if ( (synpred89_Haxe()) ) {
                        alt54=1;
                    }


                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // Haxe.g:294:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:294:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
            	    int alt53=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt53=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt53=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt53=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt53=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt53=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt53=6;
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
            	            // Haxe.g:295:23: EQEQ ^
            	            {
            	            EQEQ189=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3158); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ189_tree = 
            	            new Binary(EQEQ189) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:296:23: BANGEQ ^
            	            {
            	            BANGEQ190=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3187); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ190_tree = 
            	            new Binary(BANGEQ190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:297:23: GTEQ ^
            	            {
            	            GTEQ191=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3216); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ191_tree = 
            	            new Binary(GTEQ191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:298:23: LTEQ ^
            	            {
            	            LTEQ192=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3245); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ192_tree = 
            	            new Binary(LTEQ192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:299:23: GT ^
            	            {
            	            GT193=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3274); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT193_tree = 
            	            new Binary(GT193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:300:23: LT ^
            	            {
            	            LT194=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3303); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT194_tree = 
            	            new Binary(LT194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT194_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3310);
            	    bitExpr195=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr195.getTree());

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
    // Haxe.g:303:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR197=null;
        Token AMP198=null;
        Token CARET199=null;
        HaxeParser.shiftExpr_return shiftExpr196 =null;

        HaxeParser.shiftExpr_return shiftExpr200 =null;


        Object BAR197_tree=null;
        Object AMP198_tree=null;
        Object CARET199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:303:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:303:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3349);
            shiftExpr196=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr196.getTree());

            // Haxe.g:303:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop56:
            do {
                int alt56=2;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    int LA56_2 = input.LA(2);

                    if ( (synpred92_Haxe()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case AMP:
                    {
                    int LA56_3 = input.LA(2);

                    if ( (synpred92_Haxe()) ) {
                        alt56=1;
                    }


                    }
                    break;
                case CARET:
                    {
                    int LA56_4 = input.LA(2);

                    if ( (synpred92_Haxe()) ) {
                        alt56=1;
                    }


                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // Haxe.g:303:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:303:30: ( BAR ^| AMP ^| CARET ^)
            	    int alt55=3;
            	    switch ( input.LA(1) ) {
            	    case BAR:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case AMP:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case CARET:
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
            	            // Haxe.g:304:23: BAR ^
            	            {
            	            BAR197=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3376); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR197_tree = 
            	            new Binary(BAR197) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR197_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:305:23: AMP ^
            	            {
            	            AMP198=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3405); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP198_tree = 
            	            new Binary(AMP198) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP198_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:306:23: CARET ^
            	            {
            	            CARET199=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3434); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET199_tree = 
            	            new Binary(CARET199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET199_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3441);
            	    shiftExpr200=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr200.getTree());

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
    // Haxe.g:309:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT202=null;
        Token GTGT203=null;
        Token GTGTGT204=null;
        HaxeParser.addExpr_return addExpr201 =null;

        HaxeParser.addExpr_return addExpr205 =null;


        Object LTLT202_tree=null;
        Object GTGT203_tree=null;
        Object GTGTGT204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:309:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:309:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3474);
            addExpr201=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr201.getTree());

            // Haxe.g:309:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    int LA58_2 = input.LA(2);

                    if ( (synpred95_Haxe()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case GTGT:
                    {
                    int LA58_3 = input.LA(2);

                    if ( (synpred95_Haxe()) ) {
                        alt58=1;
                    }


                    }
                    break;
                case GTGTGT:
                    {
                    int LA58_4 = input.LA(2);

                    if ( (synpred95_Haxe()) ) {
                        alt58=1;
                    }


                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // Haxe.g:309:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:309:28: ( LTLT ^| GTGT ^| GTGTGT ^)
            	    int alt57=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt57=1;
            	        }
            	        break;
            	    case GTGT:
            	        {
            	        alt57=2;
            	        }
            	        break;
            	    case GTGTGT:
            	        {
            	        alt57=3;
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
            	            // Haxe.g:310:23: LTLT ^
            	            {
            	            LTLT202=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3501); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT202_tree = 
            	            new Binary(LTLT202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT202_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:311:23: GTGT ^
            	            {
            	            GTGT203=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3530); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT203_tree = 
            	            new Binary(GTGT203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:312:23: GTGTGT ^
            	            {
            	            GTGTGT204=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3559); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT204_tree = 
            	            new Binary(GTGTGT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT204_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3566);
            	    addExpr205=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr205.getTree());

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
    // Haxe.g:315:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS207=null;
        Token SUB208=null;
        HaxeParser.multExpr_return multExpr206 =null;

        HaxeParser.multExpr_return multExpr209 =null;


        Object PLUS207_tree=null;
        Object SUB208_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:315:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:315:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3601);
            multExpr206=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr206.getTree());

            // Haxe.g:315:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==PLUS) ) {
                    int LA60_2 = input.LA(2);

                    if ( (synpred97_Haxe()) ) {
                        alt60=1;
                    }


                }
                else if ( (LA60_0==SUB) ) {
                    int LA60_3 = input.LA(2);

                    if ( (synpred97_Haxe()) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // Haxe.g:315:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:315:29: ( PLUS ^| SUB ^)
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==PLUS) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==SUB) ) {
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
            	            // Haxe.g:316:23: PLUS ^
            	            {
            	            PLUS207=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3628); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS207_tree = 
            	            new Binary(PLUS207) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:317:23: SUB ^
            	            {
            	            SUB208=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3657); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB208_tree = 
            	            new Binary(SUB208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB208_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3664);
            	    multExpr209=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr209.getTree());

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
    // Haxe.g:320:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR211=null;
        Token SLASH212=null;
        Token PERCENT213=null;
        HaxeParser.unarExpr_return unarExpr210 =null;

        HaxeParser.unarExpr_return unarExpr214 =null;


        Object STAR211_tree=null;
        Object SLASH212_tree=null;
        Object PERCENT213_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:320:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:320:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3703);
            unarExpr210=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr210.getTree());

            // Haxe.g:320:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop62:
            do {
                int alt62=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case SLASH:
                    {
                    int LA62_3 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt62=1;
                    }


                    }
                    break;
                case PERCENT:
                    {
                    int LA62_4 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt62=1;
                    }


                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // Haxe.g:320:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:320:29: ( STAR ^| SLASH ^| PERCENT ^)
            	    int alt61=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt61=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt61=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt61=3;
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
            	            // Haxe.g:321:23: STAR ^
            	            {
            	            STAR211=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3730); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR211_tree = 
            	            new Binary(STAR211) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:322:23: SLASH ^
            	            {
            	            SLASH212=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3759); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH212_tree = 
            	            new Binary(SLASH212) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:323:23: PERCENT ^
            	            {
            	            PERCENT213=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3788); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT213_tree = 
            	            new Binary(PERCENT213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT213_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3795);
            	    unarExpr214=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr214.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // Haxe.g:326:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB215=null;
        Token SUBSUB216=null;
        Token PLUSPLUS217=null;
        Token BANG218=null;
        Token TILDE219=null;
        Token PLUSPLUS222=null;
        Token SUBSUB223=null;
        HaxeParser.prefixExpr_return prefixExpr220 =null;

        HaxeParser.prefixExpr_return prefixExpr221 =null;


        Object SUB215_tree=null;
        Object SUBSUB216_tree=null;
        Object PLUSPLUS217_tree=null;
        Object BANG218_tree=null;
        Object TILDE219_tree=null;
        Object PLUSPLUS222_tree=null;
        Object SUBSUB223_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:326:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==BANG||LA65_0==PLUSPLUS||LA65_0==SUB||LA65_0==SUBSUB||LA65_0==TILDE) ) {
                alt65=1;
            }
            else if ( (LA65_0==CAST||LA65_0==CHARLITERAL||LA65_0==FALSE||LA65_0==FLOATNUM||LA65_0==FUNCTION||LA65_0==IDENTIFIER||LA65_0==INTLITERAL||(LA65_0 >= LBRACE && LA65_0 <= LBRACKET)||(LA65_0 >= LONGLITERAL && LA65_0 <= LPAREN)||(LA65_0 >= NEW && LA65_0 <= NULL)||LA65_0==STRINGLITERAL||LA65_0==SUPER||LA65_0==THIS||LA65_0==TRUE) ) {
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
                    // Haxe.g:326:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:326:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
                    int alt63=5;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt63=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt63=2;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt63=3;
                        }
                        break;
                    case BANG:
                        {
                        alt63=4;
                        }
                        break;
                    case TILDE:
                        {
                        alt63=5;
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
                            // Haxe.g:327:13: SUB ^
                            {
                            SUB215=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3843); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB215_tree = 
                            new Unary(SUB215) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB215_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:328:13: SUBSUB ^
                            {
                            SUBSUB216=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3862); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB216_tree = 
                            new Unary(SUBSUB216) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB216_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:329:13: PLUSPLUS ^
                            {
                            PLUSPLUS217=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3881); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS217_tree = 
                            new Unary(PLUSPLUS217) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS217_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:330:13: BANG ^
                            {
                            BANG218=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3900); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG218_tree = 
                            new Unary(BANG218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG218_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:331:13: TILDE ^
                            {
                            TILDE219=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3919); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE219_tree = 
                            new Unary(TILDE219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE219_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3926);
                    prefixExpr220=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr220.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:332:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3946);
                    prefixExpr221=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr221.getTree());

                    // Haxe.g:332:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt64=3;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==PLUSPLUS) ) {
                        int LA64_1 = input.LA(2);

                        if ( (synpred106_Haxe()) ) {
                            alt64=1;
                        }
                    }
                    else if ( (LA64_0==SUBSUB) ) {
                        int LA64_2 = input.LA(2);

                        if ( (synpred107_Haxe()) ) {
                            alt64=2;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:332:31: PLUSPLUS ^
                            {
                            PLUSPLUS222=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3949); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS222_tree = 
                            new Unary(PLUSPLUS222) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS222_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:332:48: SUBSUB ^
                            {
                            SUBSUB223=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3955); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB223_tree = 
                            new Unary(SUBSUB223) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB223_tree, root_0);
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
    // Haxe.g:335:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW224=null;
        Token LPAREN226=null;
        Token RPAREN228=null;
        Token CAST229=null;
        Token LPAREN230=null;
        Token COMMA232=null;
        Token RPAREN234=null;
        HaxeParser.type_return type225 =null;

        HaxeParser.exprList_return exprList227 =null;

        HaxeParser.expr_return expr231 =null;

        HaxeParser.funcType_return funcType233 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice235 =null;


        Object NEW224_tree=null;
        Object LPAREN226_tree=null;
        Object RPAREN228_tree=null;
        Object CAST229_tree=null;
        Object LPAREN230_tree=null;
        Object COMMA232_tree=null;
        Object RPAREN234_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:335:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
            int alt68=3;
            switch ( input.LA(1) ) {
            case NEW:
                {
                alt68=1;
                }
                break;
            case CAST:
                {
                alt68=2;
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
            case SUPER:
            case THIS:
            case TRUE:
                {
                alt68=3;
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
                    // Haxe.g:335:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW224=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3997); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW224_tree = 
                    new NewNode(NEW224) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW224_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4003);
                    type225=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type225.getTree());

                    LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4005); if (state.failed) return retval;

                    // Haxe.g:335:46: ( exprList )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==BANG||LA66_0==CAST||LA66_0==CHARLITERAL||LA66_0==FALSE||LA66_0==FLOATNUM||LA66_0==FUNCTION||LA66_0==IDENTIFIER||LA66_0==INTLITERAL||(LA66_0 >= LBRACE && LA66_0 <= LBRACKET)||(LA66_0 >= LONGLITERAL && LA66_0 <= LPAREN)||(LA66_0 >= NEW && LA66_0 <= NULL)||LA66_0==PLUSPLUS||(LA66_0 >= STRINGLITERAL && LA66_0 <= SUB)||LA66_0==SUBSUB||LA66_0==SUPER||LA66_0==THIS||LA66_0==TILDE||LA66_0==TRUE||LA66_0==UNTYPED) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:335:46: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4008);
                            exprList227=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList227.getTree());

                            }
                            break;

                    }


                    RPAREN228=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4011); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:336:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST229=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST229_tree = 
                    (Object)adaptor.create(CAST229)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST229_tree, root_0);
                    }

                    LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4035); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4038);
                    expr231=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr231.getTree());

                    // Haxe.g:336:38: ( COMMA ! funcType )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==COMMA) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Haxe.g:336:39: COMMA ! funcType
                            {
                            COMMA232=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4041); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4044);
                            funcType233=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType233.getTree());

                            }
                            break;

                    }


                    RPAREN234=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4048); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:337:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr4069);
                    methodCallOrSlice235=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice235.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:340:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN237=null;
        Token RPAREN239=null;
        Token LBRACKET242=null;
        Token RBRACKET244=null;
        HaxeParser.value_return value236 =null;

        HaxeParser.exprList_return exprList238 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice240 =null;

        HaxeParser.value_return value241 =null;

        HaxeParser.expr_return expr243 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice245 =null;

        HaxeParser.value_return value246 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice247 =null;

        HaxeParser.value_return value248 =null;


        Object LPAREN237_tree=null;
        Object RPAREN239_tree=null;
        Object LBRACKET242_tree=null;
        Object RBRACKET244_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:341:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt72=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA72_1 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA72_2 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA72_3 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 3, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA72_4 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 4, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA72_5 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 5, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA72_6 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 6, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA72_7 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 7, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA72_8 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 8, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA72_9 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 9, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA72_10 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 10, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA72_11 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 11, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA72_12 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA72_13 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 13, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA72_14 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 14, input);

                    throw nvae;

                }
                }
                break;
            case SUPER:
                {
                int LA72_15 = input.LA(2);

                if ( (synpred114_Haxe()) ) {
                    alt72=1;
                }
                else if ( (synpred116_Haxe()) ) {
                    alt72=2;
                }
                else if ( (synpred117_Haxe()) ) {
                    alt72=3;
                }
                else if ( (true) ) {
                    alt72=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 15, input);

                    throw nvae;

                }
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
                    // Haxe.g:341:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4111);
                    value236=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value236.getTree());

                    LPAREN237=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN237);


                    // Haxe.g:341:32: ( exprList )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==BANG||LA69_0==CAST||LA69_0==CHARLITERAL||LA69_0==FALSE||LA69_0==FLOATNUM||LA69_0==FUNCTION||LA69_0==IDENTIFIER||LA69_0==INTLITERAL||(LA69_0 >= LBRACE && LA69_0 <= LBRACKET)||(LA69_0 >= LONGLITERAL && LA69_0 <= LPAREN)||(LA69_0 >= NEW && LA69_0 <= NULL)||LA69_0==PLUSPLUS||(LA69_0 >= STRINGLITERAL && LA69_0 <= SUB)||LA69_0==SUBSUB||LA69_0==SUPER||LA69_0==THIS||LA69_0==TILDE||LA69_0==TRUE||LA69_0==UNTYPED) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:341:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4115);
                            exprList238=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList238.getTree());

                            }
                            break;

                    }


                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN239);


                    // Haxe.g:341:49: ( pureCallOrSlice )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==LBRACKET) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred113_Haxe()) ) {
                            alt70=1;
                        }
                    }
                    else if ( (LA70_0==DOT) ) {
                        int LA70_2 = input.LA(2);

                        if ( (synpred113_Haxe()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:341:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4120);
                            pureCallOrSlice240=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice240.getTree());

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
                    // 342:13: -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:342:16: ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new MethodCall(CALL_OR_SLICE, LPAREN237, RPAREN239)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:342:68: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:342:78: ( pureCallOrSlice )?
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
                    // Haxe.g:343:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4171);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());

                    LBRACKET242=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4173); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET242);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4175);
                    expr243=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr243.getTree());

                    RBRACKET244=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET244);


                    // Haxe.g:343:48: ( pureCallOrSlice )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==LBRACKET) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred115_Haxe()) ) {
                            alt71=1;
                        }
                    }
                    else if ( (LA71_0==DOT) ) {
                        int LA71_2 = input.LA(2);

                        if ( (synpred115_Haxe()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:343:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4179);
                            pureCallOrSlice245=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice245.getTree());

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
                    // 344:13: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:344:16: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Slice(CALL_OR_SLICE, LBRACKET242, RBRACKET244, false)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:344:79: ( pureCallOrSlice )?
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
                    // Haxe.g:345:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4230);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value246.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4233);
                    pureCallOrSlice247=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice247.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:346:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4254);
                    value248=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value248.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:349:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET249=null;
        Token RBRACKET251=null;
        Token DOT253=null;
        HaxeParser.expr_return expr250 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice252 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice254 =null;


        Object LBRACKET249_tree=null;
        Object RBRACKET251_tree=null;
        Object DOT253_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:349:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LBRACKET) ) {
                alt75=1;
            }
            else if ( (LA75_0==DOT) ) {
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
                    // Haxe.g:349:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET249=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET249);


                    // Haxe.g:349:28: ( expr )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==BANG||LA73_0==CAST||LA73_0==CHARLITERAL||LA73_0==FALSE||LA73_0==FLOATNUM||LA73_0==FUNCTION||LA73_0==IDENTIFIER||LA73_0==INTLITERAL||(LA73_0 >= LBRACE && LA73_0 <= LBRACKET)||(LA73_0 >= LONGLITERAL && LA73_0 <= LPAREN)||(LA73_0 >= NEW && LA73_0 <= NULL)||LA73_0==PLUSPLUS||(LA73_0 >= STRINGLITERAL && LA73_0 <= SUB)||LA73_0==SUBSUB||LA73_0==SUPER||LA73_0==THIS||LA73_0==TILDE||LA73_0==TRUE||LA73_0==UNTYPED) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:349:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4281);
                            expr250=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr250.getTree());

                            }
                            break;

                    }


                    RBRACKET251=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET251);


                    // Haxe.g:349:43: ( pureCallOrSlice )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==LBRACKET) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred119_Haxe()) ) {
                            alt74=1;
                        }
                    }
                    else if ( (LA74_0==DOT) ) {
                        int LA74_2 = input.LA(2);

                        if ( (synpred119_Haxe()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // Haxe.g:349:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4286);
                            pureCallOrSlice252=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice252.getTree());

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
                    // 349:60: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:349:63: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Slice(CALL_OR_SLICE, LBRACKET249, RBRACKET251, true)
                        , root_1);

                        // Haxe.g:350:66: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:350:72: ( pureCallOrSlice )?
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
                    // Haxe.g:351:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT253=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4340); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT253_tree = 
                    (Object)adaptor.create(DOT253)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT253_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4343);
                    methodCallOrSlice254=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice254.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class arrayObj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayObj"
    // Haxe.g:354:1: arrayObj : LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) ;
    public final HaxeParser.arrayObj_return arrayObj() throws RecognitionException {
        HaxeParser.arrayObj_return retval = new HaxeParser.arrayObj_return();
        retval.start = input.LT(1);

        int arrayObj_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET255=null;
        Token RBRACKET257=null;
        HaxeParser.exprList_return exprList256 =null;


        Object LBRACKET255_tree=null;
        Object RBRACKET257_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:354:17: ( LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) )
            // Haxe.g:354:19: LBRACKET ( exprList )? RBRACKET
            {
            LBRACKET255=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayObj4375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET255);


            // Haxe.g:354:28: ( exprList )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==BANG||LA76_0==CAST||LA76_0==CHARLITERAL||LA76_0==FALSE||LA76_0==FLOATNUM||LA76_0==FUNCTION||LA76_0==IDENTIFIER||LA76_0==INTLITERAL||(LA76_0 >= LBRACE && LA76_0 <= LBRACKET)||(LA76_0 >= LONGLITERAL && LA76_0 <= LPAREN)||(LA76_0 >= NEW && LA76_0 <= NULL)||LA76_0==PLUSPLUS||(LA76_0 >= STRINGLITERAL && LA76_0 <= SUB)||LA76_0==SUBSUB||LA76_0==SUPER||LA76_0==THIS||LA76_0==TILDE||LA76_0==TRUE||LA76_0==UNTYPED) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // Haxe.g:354:28: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayObj4377);
                    exprList256=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList256.getTree());

                    }
                    break;

            }


            RBRACKET257=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayObj4380); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET257);


            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 355:13: -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
            {
                // Haxe.g:355:16: ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Array(SUFFIX_EXPR, LBRACKET255, RBRACKET257)
                , root_1);

                // Haxe.g:355:59: ( exprList )?
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
            if ( state.backtracking>0 ) { memoize(input, 52, arrayObj_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayObj"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:358:1: value : ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN262=null;
        Token RPAREN264=null;
        Token char_literal265=null;
        Token COLON267=null;
        Token LPAREN269=null;
        Token RPAREN271=null;
        HaxeParser.objLit_return objLit258 =null;

        HaxeParser.funcLit_return funcLit259 =null;

        HaxeParser.arrayObj_return arrayObj260 =null;

        HaxeParser.elementarySymbol_return elementarySymbol261 =null;

        HaxeParser.expr_return expr263 =null;

        HaxeParser.expr_return expr266 =null;

        HaxeParser.expr_return expr268 =null;

        HaxeParser.expr_return expr270 =null;

        HaxeParser.id_return id272 =null;

        HaxeParser.typeParam_return typeParam273 =null;


        Object LPAREN262_tree=null;
        Object RPAREN264_tree=null;
        Object char_literal265_tree=null;
        Object COLON267_tree=null;
        Object LPAREN269_tree=null;
        Object RPAREN271_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:360:5: ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? )
            int alt78=7;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt78=1;
                }
                break;
            case FUNCTION:
                {
                alt78=2;
                }
                break;
            case LBRACKET:
                {
                alt78=3;
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
                alt78=4;
                }
                break;
            case LPAREN:
                {
                int LA78_12 = input.LA(2);

                if ( (synpred126_Haxe()) ) {
                    alt78=5;
                }
                else if ( (synpred127_Haxe()) ) {
                    alt78=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 12, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
            case SUPER:
            case THIS:
                {
                alt78=7;
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
                    // Haxe.g:360:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4457);
                    objLit258=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit258.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:361:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4465);
                    funcLit259=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit259.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:362:7: arrayObj
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayObj_in_value4473);
                    arrayObj260=arrayObj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayObj260.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:363:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4481);
                    elementarySymbol261=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol261.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:364:9: LPAREN expr RPAREN '?' expr COLON expr
                    {
                    LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4491); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN262);


                    pushFollow(FOLLOW_expr_in_value4493);
                    expr263=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr263.getTree());

                    RPAREN264=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN264);


                    char_literal265=(Token)match(input,QUES,FOLLOW_QUES_in_value4497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(char_literal265);


                    pushFollow(FOLLOW_expr_in_value4499);
                    expr266=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr266.getTree());

                    COLON267=(Token)match(input,COLON,FOLLOW_COLON_in_value4501); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON267);


                    pushFollow(FOLLOW_expr_in_value4503);
                    expr268=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr268.getTree());

                    // AST REWRITE
                    // elements: LPAREN, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 364:48: -> ^( LPAREN ( expr )+ )
                    {
                        // Haxe.g:364:51: ^( LPAREN ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new IfNode(stream_LPAREN.nextToken())
                        , root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
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
                case 6 :
                    // Haxe.g:365:9: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN269=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4525); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value4528);
                    expr270=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr270.getTree());

                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4530); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:367:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4546);
                    id272=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id272.getTree());

                    // Haxe.g:367:12: ( typeParam )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==LT) ) {
                        int LA77_1 = input.LA(2);

                        if ( (synpred128_Haxe()) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // Haxe.g:367:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4548);
                            typeParam273=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam273.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 53, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:371:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl274 =null;

        HaxeParser.interfaceDecl_return interfaceDecl275 =null;

        HaxeParser.enumDecl_return enumDecl276 =null;

        HaxeParser.typedefDecl_return typedefDecl277 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:371:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:371:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4568);
                    classDecl274=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl274.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:372:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4588);
                    interfaceDecl275=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl275.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:373:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4608);
                    enumDecl276=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl276.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:374:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4628);
                    typedefDecl277=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl277.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:377:1: enumDecl : ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM279=null;
        Token IDENTIFIER280=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr278 =null;

        HaxeParser.typeParam_return typeParam281 =null;

        HaxeParser.enumBody_return enumBody282 =null;


        Object ENUM279_tree=null;
        Object IDENTIFIER280_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:377:17: ( ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) )
            // Haxe.g:377:19: ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:377:19: ( topLevelAccessAttr )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EXTERN||LA80_0==PRIVATE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:377:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_enumDecl4664);
                    topLevelAccessAttr278=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr278.getTree());

                    }
                    break;

            }


            ENUM279=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4667); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM279);


            IDENTIFIER280=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4669); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER280);


            // Haxe.g:377:55: ( typeParam )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:377:55: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4671);
                    typeParam281=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam281.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4674);
            enumBody282=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody282.getTree());

            // AST REWRITE
            // elements: typeParam, topLevelAccessAttr, IDENTIFIER, enumBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 377:75: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
            {
                // Haxe.g:377:78: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Enum(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:377:97: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:377:117: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                adaptor.addChild(root_1, stream_enumBody.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 55, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:380:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE283=null;
        Token RBRACE285=null;
        HaxeParser.enumValueDecl_return enumValueDecl284 =null;


        Object LBRACE283_tree=null;
        Object RBRACE285_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:380:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:380:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE283=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4723); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE283);


            // Haxe.g:380:26: ( enumValueDecl )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==IDENTIFIER) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // Haxe.g:380:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4726);
            	    enumValueDecl284=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl284.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            RBRACE285=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE285);


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
            // 380:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:380:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE283, RBRACE285)
                , root_1);

                // Haxe.g:380:97: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 56, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:383:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER286=null;
        Token LPAREN287=null;
        Token RPAREN289=null;
        Token SEMI290=null;
        Token IDENTIFIER291=null;
        Token SEMI292=null;
        HaxeParser.paramList_return paramList288 =null;


        Object IDENTIFIER286_tree=null;
        Object LPAREN287_tree=null;
        Object RPAREN289_tree=null;
        Object SEMI290_tree=null;
        Object IDENTIFIER291_tree=null;
        Object SEMI292_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:383:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==IDENTIFIER) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==LPAREN) ) {
                    alt84=1;
                }
                else if ( (LA84_1==SEMI) ) {
                    alt84=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;

            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:383:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER286_tree = 
                    new Declaration(IDENTIFIER286) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER286_tree, root_0);
                    }

                    LPAREN287=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4776); if (state.failed) return retval;

                    // Haxe.g:383:52: ( paramList )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==IDENTIFIER||LA83_0==QUES) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // Haxe.g:383:52: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4779);
                            paramList288=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList288.getTree());

                            }
                            break;

                    }


                    RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4782); if (state.failed) return retval;

                    SEMI290=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4785); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:384:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4808); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER291_tree = 
                    new Declaration(IDENTIFIER291) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER291_tree);
                    }

                    SEMI292=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4813); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:388:1: classDecl : ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( ( extending ( COMMA implementList )? ) | implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS294=null;
        Token IDENTIFIER295=null;
        Token COMMA298=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr293 =null;

        HaxeParser.typeParam_return typeParam296 =null;

        HaxeParser.extending_return extending297 =null;

        HaxeParser.implementList_return implementList299 =null;

        HaxeParser.implementList_return implementList300 =null;

        HaxeParser.classBodyScope_return classBodyScope301 =null;


        Object CLASS294_tree=null;
        Object IDENTIFIER295_tree=null;
        Object COMMA298_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_implementList=new RewriteRuleSubtreeStream(adaptor,"rule implementList");
        RewriteRuleSubtreeStream stream_extending=new RewriteRuleSubtreeStream(adaptor,"rule extending");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:388:17: ( ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( ( extending ( COMMA implementList )? ) | implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) )
            // Haxe.g:388:19: ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( ( extending ( COMMA implementList )? ) | implementList )? classBodyScope
            {
            // Haxe.g:388:19: ( topLevelAccessAttr )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==EXTERN||LA85_0==PRIVATE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:388:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_classDecl4862);
                    topLevelAccessAttr293=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr293.getTree());

                    }
                    break;

            }


            CLASS294=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS294);


            IDENTIFIER295=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER295);


            // Haxe.g:388:56: ( typeParam )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:388:56: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4869);
                    typeParam296=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam296.getTree());

                    }
                    break;

            }


            // Haxe.g:388:68: ( ( extending ( COMMA implementList )? ) | implementList )?
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EXTENDS) ) {
                alt88=1;
            }
            else if ( (LA88_0==IMPLEMENTS) ) {
                alt88=2;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:388:69: ( extending ( COMMA implementList )? )
                    {
                    // Haxe.g:388:69: ( extending ( COMMA implementList )? )
                    // Haxe.g:388:70: extending ( COMMA implementList )?
                    {
                    pushFollow(FOLLOW_extending_in_classDecl4875);
                    extending297=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extending.add(extending297.getTree());

                    // Haxe.g:388:80: ( COMMA implementList )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==COMMA) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // Haxe.g:388:81: COMMA implementList
                            {
                            COMMA298=(Token)match(input,COMMA,FOLLOW_COMMA_in_classDecl4878); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA298);


                            pushFollow(FOLLOW_implementList_in_classDecl4880);
                            implementList299=implementList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_implementList.add(implementList299.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:388:104: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_classDecl4885);
                    implementList300=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementList.add(implementList300.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4890);
            classBodyScope301=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope301.getTree());

            // AST REWRITE
            // elements: classBodyScope, extending, topLevelAccessAttr, typeParam, implementList, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 389:21: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope )
            {
                // Haxe.g:389:24: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Class(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:389:44: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:389:64: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:389:75: ( extending )?
                if ( stream_extending.hasNext() ) {
                    adaptor.addChild(root_1, stream_extending.nextTree());

                }
                stream_extending.reset();

                // Haxe.g:389:86: ( implementList )?
                if ( stream_implementList.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementList.nextTree());

                }
                stream_implementList.reset();

                adaptor.addChild(root_1, stream_classBodyScope.nextTree());

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
            if ( state.backtracking>0 ) { memoize(input, 58, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:392:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE302=null;
        Token RBRACE304=null;
        HaxeParser.classMember_return classMember303 =null;


        Object LBRACE302_tree=null;
        Object RBRACE304_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:392:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:392:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE302=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4960); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE302);


            // Haxe.g:392:26: ( classMember )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==DYNAMIC||LA89_0==FUNCTION||LA89_0==INLINE||LA89_0==OVERRIDE||LA89_0==PRIVATE||LA89_0==PUBLIC||LA89_0==STATIC||LA89_0==VAR) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Haxe.g:392:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4963);
            	    classMember303=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember303.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            RBRACE304=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4967); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE304);


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
            // 392:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:392:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE302, RBRACE304)
                , root_1);

                // Haxe.g:392:95: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 59, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:395:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass305 =null;

        HaxeParser.funcDecl_return funcDecl306 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:395:17: ( varDeclClass | funcDecl )
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // Haxe.g:395:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember5013);
                    varDeclClass305=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass305.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:396:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember5033);
                    funcDecl306=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl306.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:400:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ^ ( propDecl )? typeTag ( varInit )? SEMI !;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR308=null;
        Token IDENTIFIER309=null;
        Token SEMI313=null;
        HaxeParser.declAttrList_return declAttrList307 =null;

        HaxeParser.propDecl_return propDecl310 =null;

        HaxeParser.typeTag_return typeTag311 =null;

        HaxeParser.varInit_return varInit312 =null;


        Object VAR308_tree=null;
        Object IDENTIFIER309_tree=null;
        Object SEMI313_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:400:17: ( ( declAttrList )? VAR IDENTIFIER ^ ( propDecl )? typeTag ( varInit )? SEMI !)
            // Haxe.g:400:19: ( declAttrList )? VAR IDENTIFIER ^ ( propDecl )? typeTag ( varInit )? SEMI !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:400:19: ( declAttrList )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==DYNAMIC||LA91_0==INLINE||LA91_0==OVERRIDE||LA91_0==PRIVATE||LA91_0==PUBLIC||LA91_0==STATIC) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:400:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5075);
                    declAttrList307=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declAttrList307.getTree());

                    }
                    break;

            }


            VAR308=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR308_tree = 
            (Object)adaptor.create(VAR308)
            ;
            adaptor.addChild(root_0, VAR308_tree);
            }

            IDENTIFIER309=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER309_tree = 
            new Declaration(IDENTIFIER309) 
            ;
            root_0 = (Object)adaptor.becomeRoot(IDENTIFIER309_tree, root_0);
            }

            // Haxe.g:400:62: ( propDecl )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==LPAREN) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:400:62: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5086);
                    propDecl310=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl310.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass5089);
            typeTag311=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag311.getTree());

            // Haxe.g:400:80: ( varInit )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==EQ) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Haxe.g:400:80: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5091);
                    varInit312=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit312.getTree());

                    }
                    break;

            }


            SEMI313=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5094); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:403:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR314=null;
        Token COMMA316=null;
        Token SEMI318=null;
        HaxeParser.varDeclPartList_return varDeclPartList315 =null;

        HaxeParser.varDeclPartList_return varDeclPartList317 =null;


        Object VAR314_tree=null;
        Object COMMA316_tree=null;
        Object SEMI318_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:403:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:403:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR314=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5144); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5147);
            varDeclPartList315=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList315.getTree());

            // Haxe.g:403:40: ( COMMA ! varDeclPartList )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==COMMA) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // Haxe.g:403:41: COMMA ! varDeclPartList
            	    {
            	    COMMA316=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5150); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5153);
            	    varDeclPartList317=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList317.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);


            SEMI318=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5157); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:406:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER319=null;
        HaxeParser.propDecl_return propDecl320 =null;

        HaxeParser.typeTag_return typeTag321 =null;

        HaxeParser.varInit_return varInit322 =null;


        Object IDENTIFIER319_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:406:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:406:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER319=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER319);


            // Haxe.g:406:30: ( propDecl )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==LPAREN) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Haxe.g:406:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5185);
                    propDecl320=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl320.getTree());

                    }
                    break;

            }


            // Haxe.g:406:40: ( typeTag )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==COLON) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:406:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5188);
                    typeTag321=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag321.getTree());

                    }
                    break;

            }


            // Haxe.g:406:49: ( varInit )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==EQ) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Haxe.g:406:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5191);
                    varInit322=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit322.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, typeTag, varInit, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 406:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:406:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Declaration(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:406:87: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:406:97: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:406:106: ( varInit )?
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
    // Haxe.g:409:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN323=null;
        Token COMMA324=null;
        Token RPAREN325=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN323_tree=null;
        Object COMMA324_tree=null;
        Object RPAREN325_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:409:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:409:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN323=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN323);


            pushFollow(FOLLOW_propAccessor_in_propDecl5246);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA324=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5248); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA324);


            pushFollow(FOLLOW_propAccessor_in_propDecl5252);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN325=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN325);


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
            // 409:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:409:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
    // Haxe.g:412:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set326=null;

        Object set326_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:412:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set326=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set326)
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
    // Haxe.g:419:1: varInit : EQ ^ expr ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ327=null;
        HaxeParser.expr_return expr328 =null;


        Object EQ327_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:419:17: ( EQ ^ expr )
            // Haxe.g:419:19: EQ ^ expr
            {
            root_0 = (Object)adaptor.nil();


            EQ327=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5413); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ327_tree = 
            new HaxeTree(EQ327) 
            ;
            root_0 = (Object)adaptor.becomeRoot(EQ327_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_varInit5419);
            expr328=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr328.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:422:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION330=null;
        Token NEW331=null;
        Token FUNCTION334=null;
        Token IDENTIFIER335=null;
        HaxeParser.declAttrList_return declAttrList329 =null;

        HaxeParser.funcDeclPart_return funcDeclPart332 =null;

        HaxeParser.declAttrList_return declAttrList333 =null;

        HaxeParser.typeParam_return typeParam336 =null;

        HaxeParser.funcDeclPart_return funcDeclPart337 =null;


        Object FUNCTION330_tree=null;
        Object NEW331_tree=null;
        Object FUNCTION334_tree=null;
        Object IDENTIFIER335_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:422:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt101=2;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // Haxe.g:422:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:422:19: ( declAttrList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DYNAMIC||LA98_0==INLINE||LA98_0==OVERRIDE||LA98_0==PRIVATE||LA98_0==PUBLIC||LA98_0==STATIC) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:422:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5451);
                            declAttrList329=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList329.getTree());

                            }
                            break;

                    }


                    FUNCTION330=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION330);


                    NEW331=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW331);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5458);
                    funcDeclPart332=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart332.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, declAttrList, funcDeclPart, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 423:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:423:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Function(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:423:49: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:424:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:424:19: ( declAttrList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==DYNAMIC||LA99_0==INLINE||LA99_0==OVERRIDE||LA99_0==PRIVATE||LA99_0==PUBLIC||LA99_0==STATIC) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:424:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5516);
                            declAttrList333=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList333.getTree());

                            }
                            break;

                    }


                    FUNCTION334=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5519); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION334);


                    IDENTIFIER335=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5521); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER335);


                    // Haxe.g:424:53: ( typeParam )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==LT) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:424:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5523);
                            typeParam336=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam336.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5526);
                    funcDeclPart337=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart337.getTree());

                    // AST REWRITE
                    // elements: typeParam, FUNCTION, declAttrList, IDENTIFIER, funcDeclPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 425:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:425:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Function(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:425:56: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:425:83: ( typeParam )?
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class funcDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDeclPart"
    // Haxe.g:428:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN338=null;
        Token RPAREN340=null;
        Token SEMI343=null;
        HaxeParser.paramList_return paramList339 =null;

        HaxeParser.typeTag_return typeTag341 =null;

        HaxeParser.block_return block342 =null;


        Object LPAREN338_tree=null;
        Object RPAREN340_tree=null;
        Object SEMI343_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:428:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:428:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN338=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5610); if (state.failed) return retval;

            // Haxe.g:428:27: ( paramList )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==IDENTIFIER||LA102_0==QUES) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Haxe.g:428:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5613);
                    paramList339=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList339.getTree());

                    }
                    break;

            }


            RPAREN340=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5616); if (state.failed) return retval;

            // Haxe.g:428:46: ( typeTag )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==COLON) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // Haxe.g:428:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5619);
                    typeTag341=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag341.getTree());

                    }
                    break;

            }


            // Haxe.g:428:55: ( block | SEMI !)
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==LBRACE) ) {
                alt104=1;
            }
            else if ( (LA104_0==SEMI) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }
            switch (alt104) {
                case 1 :
                    // Haxe.g:428:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5623);
                    block342=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block342.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:428:64: SEMI !
                    {
                    SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5627); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 68, funcDeclPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDeclPart"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:431:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
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
        HaxeParser.declAttrList_return declAttrList344 =null;

        HaxeParser.paramList_return paramList348 =null;

        HaxeParser.typeTag_return typeTag350 =null;

        HaxeParser.declAttrList_return declAttrList352 =null;

        HaxeParser.typeParam_return typeParam355 =null;

        HaxeParser.paramList_return paramList357 =null;

        HaxeParser.typeTag_return typeTag359 =null;

        HaxeParser.paramList_return paramList364 =null;

        HaxeParser.typeTag_return typeTag366 =null;

        HaxeParser.typeParam_return typeParam370 =null;

        HaxeParser.paramList_return paramList372 =null;

        HaxeParser.typeTag_return typeTag374 =null;


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
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:432:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt115=4;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // Haxe.g:432:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5664);
                    declAttrList344=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList344.getTree());

                    FUNCTION345=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION345);


                    NEW346=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW346);


                    LPAREN347=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN347);


                    // Haxe.g:432:42: ( paramList )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==IDENTIFIER||LA105_0==QUES) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:432:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5672);
                            paramList348=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList348.getTree());

                            }
                            break;

                    }


                    RPAREN349=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN349);


                    // Haxe.g:432:60: ( typeTag )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==COLON) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:432:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5677);
                            typeTag350=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag350.getTree());

                            }
                            break;

                    }


                    SEMI351=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI351);


                    // AST REWRITE
                    // elements: FUNCTION, typeTag, paramList, declAttrList, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 433:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:433:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:433:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:433:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:433:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:433:52: ( declAttrList )?
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
                    // Haxe.g:434:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5721);
                    declAttrList352=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList352.getTree());

                    FUNCTION353=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5723); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION353);


                    IDENTIFIER354=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER354);


                    // Haxe.g:434:42: ( typeParam )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==LT) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:434:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5727);
                            typeParam355=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam355.getTree());

                            }
                            break;

                    }


                    LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN356);


                    // Haxe.g:434:60: ( paramList )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==IDENTIFIER||LA108_0==QUES) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:434:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5732);
                            paramList357=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList357.getTree());

                            }
                            break;

                    }


                    RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5735); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN358);


                    // Haxe.g:434:78: ( typeTag )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==COLON) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:434:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5737);
                            typeTag359=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag359.getTree());

                            }
                            break;

                    }


                    SEMI360=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI360);


                    // AST REWRITE
                    // elements: FUNCTION, declAttrList, typeTag, paramList, IDENTIFIER, typeParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:435:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:435:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:435:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:435:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:435:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:435:73: ( typeParam )?
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
                case 3 :
                    // Haxe.g:436:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION361=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION361);


                    NEW362=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW362);


                    LPAREN363=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN363);


                    // Haxe.g:436:29: ( paramList )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==IDENTIFIER||LA110_0==QUES) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Haxe.g:436:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5790);
                            paramList364=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList364.getTree());

                            }
                            break;

                    }


                    RPAREN365=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN365);


                    // Haxe.g:436:47: ( typeTag )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==COLON) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Haxe.g:436:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5795);
                            typeTag366=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag366.getTree());

                            }
                            break;

                    }


                    SEMI367=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI367);


                    // AST REWRITE
                    // elements: NEW, FUNCTION, typeTag, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 437:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:437:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:437:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:437:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:437:43: ( typeTag )?
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
                    // Haxe.g:438:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION368=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION368);


                    IDENTIFIER369=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER369);


                    // Haxe.g:438:29: ( typeParam )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==LT) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Haxe.g:438:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5840);
                            typeParam370=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam370.getTree());

                            }
                            break;

                    }


                    LPAREN371=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN371);


                    // Haxe.g:438:47: ( paramList )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==IDENTIFIER||LA113_0==QUES) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Haxe.g:438:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5845);
                            paramList372=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList372.getTree());

                            }
                            break;

                    }


                    RPAREN373=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN373);


                    // Haxe.g:438:65: ( typeTag )?
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==COLON) ) {
                        alt114=1;
                    }
                    switch (alt114) {
                        case 1 :
                            // Haxe.g:438:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5850);
                            typeTag374=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag374.getTree());

                            }
                            break;

                    }


                    SEMI375=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI375);


                    // AST REWRITE
                    // elements: IDENTIFIER, FUNCTION, paramList, typeTag, typeParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 439:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:439:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:439:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:439:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:439:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:439:59: ( typeParam )?
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:442:1: interfaceDecl : ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE377=null;
        Token LBRACE381=null;
        Token RBRACE383=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr376 =null;

        HaxeParser.type_return type378 =null;

        HaxeParser.extending_return extending379 =null;

        HaxeParser.implementList_return implementList380 =null;

        HaxeParser.interfaceBody_return interfaceBody382 =null;


        Object INTERFACE377_tree=null;
        Object LBRACE381_tree=null;
        Object RBRACE383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:443:5: ( ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:443:9: ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:443:9: ( topLevelAccessAttr )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==EXTERN||LA116_0==PRIVATE) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // Haxe.g:443:9: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_interfaceDecl5912);
                    topLevelAccessAttr376=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccessAttr376.getTree());

                    }
                    break;

            }


            INTERFACE377=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5915); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE377_tree = 
            (Object)adaptor.create(INTERFACE377)
            ;
            adaptor.addChild(root_0, INTERFACE377_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5917);
            type378=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type378.getTree());

            // Haxe.g:443:44: ( extending )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==EXTENDS) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Haxe.g:443:44: extending
                    {
                    pushFollow(FOLLOW_extending_in_interfaceDecl5919);
                    extending379=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extending379.getTree());

                    }
                    break;

            }


            // Haxe.g:443:55: ( implementList )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==IMPLEMENTS) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // Haxe.g:443:55: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_interfaceDecl5922);
                    implementList380=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementList380.getTree());

                    }
                    break;

            }


            LBRACE381=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5925); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5928);
            interfaceBody382=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody382.getTree());

            RBRACE383=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5930); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:446:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl384 =null;

        HaxeParser.interfaceBody_return interfaceBody385 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl386 =null;

        HaxeParser.interfaceBody_return interfaceBody387 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:447:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt119=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt119=1;
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
                alt119=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt119=3;
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
                    // Haxe.g:447:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5954);
                    varDecl384=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl384.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5956);
                    interfaceBody385=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody385.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:448:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5966);
                    funcProtoDecl386=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl386.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5968);
                    interfaceBody387=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody387.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:451:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 71, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class implementList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementList"
    // Haxe.g:453:1: implementList : implementing ( COMMA implementing )* -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ ) ;
    public final HaxeParser.implementList_return implementList() throws RecognitionException {
        HaxeParser.implementList_return retval = new HaxeParser.implementList_return();
        retval.start = input.LT(1);

        int implementList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA389=null;
        HaxeParser.implementing_return implementing388 =null;

        HaxeParser.implementing_return implementing390 =null;


        Object COMMA389_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implementing=new RewriteRuleSubtreeStream(adaptor,"rule implementing");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:453:17: ( implementing ( COMMA implementing )* -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ ) )
            // Haxe.g:453:19: implementing ( COMMA implementing )*
            {
            pushFollow(FOLLOW_implementing_in_implementList6006);
            implementing388=implementing();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementing.add(implementing388.getTree());

            // Haxe.g:453:32: ( COMMA implementing )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMMA) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // Haxe.g:453:33: COMMA implementing
            	    {
            	    COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_implementList6009); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA389);


            	    pushFollow(FOLLOW_implementing_in_implementList6011);
            	    implementing390=implementing();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_implementing.add(implementing390.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            // AST REWRITE
            // elements: implementing
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 453:54: -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ )
            {
                // Haxe.g:453:57: ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(IMPLEMENT_LIST, "ImplementList")
                , root_1);

                if ( !(stream_implementing.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_implementing.hasNext() ) {
                    adaptor.addChild(root_1, stream_implementing.nextTree());

                }
                stream_implementing.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 72, implementList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementList"


    public static class implementing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implementing"
    // Haxe.g:456:1: implementing : IMPLEMENTS ! type ;
    public final HaxeParser.implementing_return implementing() throws RecognitionException {
        HaxeParser.implementing_return retval = new HaxeParser.implementing_return();
        retval.start = input.LT(1);

        int implementing_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTS391=null;
        HaxeParser.type_return type392 =null;


        Object IMPLEMENTS391_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:456:17: ( IMPLEMENTS ! type )
            // Haxe.g:456:19: IMPLEMENTS ! type
            {
            root_0 = (Object)adaptor.nil();


            IMPLEMENTS391=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementing6058); if (state.failed) return retval;

            pushFollow(FOLLOW_type_in_implementing6061);
            type392=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type392.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, implementing_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "implementing"


    public static class extending_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "extending"
    // Haxe.g:459:1: extending : EXTENDS ^ type ;
    public final HaxeParser.extending_return extending() throws RecognitionException {
        HaxeParser.extending_return retval = new HaxeParser.extending_return();
        retval.start = input.LT(1);

        int extending_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS393=null;
        HaxeParser.type_return type394 =null;


        Object EXTENDS393_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:459:17: ( EXTENDS ^ type )
            // Haxe.g:459:19: EXTENDS ^ type
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS393=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extending6108); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS393_tree = 
            new HaxeTree(EXTENDS393) 
            ;
            root_0 = (Object)adaptor.becomeRoot(EXTENDS393_tree, root_0);
            }

            pushFollow(FOLLOW_type_in_extending6114);
            type394=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type394.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, extending_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "extending"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:462:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF395=null;
        Token IDENTIFIER396=null;
        Token EQ397=null;
        HaxeParser.funcType_return funcType398 =null;


        Object TYPEDEF395_tree=null;
        Object IDENTIFIER396_tree=null;
        Object EQ397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:462:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:462:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF395=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF395_tree = 
            (Object)adaptor.create(TYPEDEF395)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF395_tree, root_0);
            }

            IDENTIFIER396=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER396_tree = 
            (Object)adaptor.create(IDENTIFIER396)
            ;
            adaptor.addChild(root_0, IDENTIFIER396_tree);
            }

            EQ397=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6152); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl6155);
            funcType398=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType398.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:465:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT399=null;
        HaxeParser.funcType_return funcType400 =null;


        Object GT399_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:465:17: ( GT ^ funcType )
            // Haxe.g:465:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT399=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT399_tree = 
            (Object)adaptor.create(GT399)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT399_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6192);
            funcType400=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType400.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:468:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE401=null;
        Token RBRACE403=null;
        HaxeParser.objLitElemList_return objLitElemList402 =null;


        Object LBRACE401_tree=null;
        Object RBRACE403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:468:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:468:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE401=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6226); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6229);
            objLitElemList402=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList402.getTree());

            RBRACE403=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6231); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:471:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER404=null;
        Token COLON405=null;
        HaxeParser.funcType_return funcType406 =null;


        Object IDENTIFIER404_tree=null;
        Object COLON405_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:471:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:471:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER404=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6259); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER404_tree = 
            (Object)adaptor.create(IDENTIFIER404)
            ;
            adaptor.addChild(root_0, IDENTIFIER404_tree);
            }

            COLON405=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6261); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6264);
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
            if ( state.backtracking>0 ) { memoize(input, 78, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:474:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA408=null;
        HaxeParser.objLitElem_return objLitElem407 =null;

        HaxeParser.objLitElem_return objLitElem409 =null;


        Object COMMA408_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:474:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:474:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6294);
            objLitElem407=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem407.getTree());

            // Haxe.g:474:30: ( COMMA ! objLitElem )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==COMMA) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // Haxe.g:474:31: COMMA ! objLitElem
            	    {
            	    COMMA408=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6297); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6300);
            	    objLitElem409=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem409.getTree());

            	    }
            	    break;

            	default :
            	    break loop121;
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
            if ( state.backtracking>0 ) { memoize(input, 79, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:477:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER410=null;
        Token COLON411=null;
        HaxeParser.expr_return expr412 =null;


        Object IDENTIFIER410_tree=null;
        Object COLON411_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:477:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:477:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER410=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER410_tree = 
            (Object)adaptor.create(IDENTIFIER410)
            ;
            adaptor.addChild(root_0, IDENTIFIER410_tree);
            }

            COLON411=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6338); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6341);
            expr412=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr412.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:481:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"Int\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"Int\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"String\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"String\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"Float\"] | TRUE -> TRUE[$TRUE,\"Bool\"] | FALSE -> FALSE[$FALSE,\"Bool\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL413=null;
        Token NULL414=null;
        Token INTLITERAL415=null;
        Token STRINGLITERAL416=null;
        Token CHARLITERAL417=null;
        Token FLOATNUM418=null;
        Token TRUE419=null;
        Token FALSE420=null;

        Object LONGLITERAL413_tree=null;
        Object NULL414_tree=null;
        Object INTLITERAL415_tree=null;
        Object STRINGLITERAL416_tree=null;
        Object CHARLITERAL417_tree=null;
        Object FLOATNUM418_tree=null;
        Object TRUE419_tree=null;
        Object FALSE420_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:482:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"Int\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"Int\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"String\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"String\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"Float\"] | TRUE -> TRUE[$TRUE,\"Bool\"] | FALSE -> FALSE[$FALSE,\"Bool\"] )
            int alt122=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt122=1;
                }
                break;
            case NULL:
                {
                alt122=2;
                }
                break;
            case INTLITERAL:
                {
                alt122=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt122=4;
                }
                break;
            case CHARLITERAL:
                {
                alt122=5;
                }
                break;
            case FLOATNUM:
                {
                alt122=6;
                }
                break;
            case TRUE:
                {
                alt122=7;
                }
                break;
            case FALSE:
                {
                alt122=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // Haxe.g:482:7: LONGLITERAL
                    {
                    LONGLITERAL413=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL413);


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
                    // 482:21: -> LONGLITERAL[$LONGLITERAL, \"Int\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(LONGLITERAL, LONGLITERAL413, "Int")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:483:7: NULL
                    {
                    NULL414=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL414);


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
                    // 483:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(NULL, NULL414, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:484:7: INTLITERAL
                    {
                    INTLITERAL415=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6418); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL415);


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
                    // 484:21: -> INTLITERAL[$INTLITERAL, \"Int\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(INTLITERAL, INTLITERAL415, "Int")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:485:7: STRINGLITERAL
                    {
                    STRINGLITERAL416=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL416);


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
                    // 485:21: -> STRINGLITERAL[$STRINGLITERAL,\"String\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(STRINGLITERAL, STRINGLITERAL416, "String")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:486:7: CHARLITERAL
                    {
                    CHARLITERAL417=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6453); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL417);


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
                    // 486:21: -> CHARLITERAL[$CHARLITERAL, \"String\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(CHARLITERAL, CHARLITERAL417, "String")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:487:7: FLOATNUM
                    {
                    FLOATNUM418=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM418);


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
                    // 487:21: -> FLOATNUM[$FLOATNUM, \"Float\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(FLOATNUM, FLOATNUM418, "Float")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:488:7: TRUE
                    {
                    TRUE419=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE419);


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
                    // 488:21: -> TRUE[$TRUE,\"Bool\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(TRUE, TRUE419, "Bool")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:489:7: FALSE
                    {
                    FALSE420=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE420);


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
                    // 489:21: -> FALSE[$FALSE,\"Bool\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(FALSE, FALSE420, "Bool")
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
            if ( state.backtracking>0 ) { memoize(input, 81, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred6_Haxe
    public final void synpred6_Haxe_fragment() throws RecognitionException {
        // Haxe.g:97:40: ()
        // Haxe.g:97:40: 
        {
        }

    }
    // $ANTLR end synpred6_Haxe

    // $ANTLR start synpred53_Haxe
    public final void synpred53_Haxe_fragment() throws RecognitionException {
        // Haxe.g:216:45: ( typeParam )
        // Haxe.g:216:45: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred53_Haxe1849);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_Haxe

    // $ANTLR start synpred54_Haxe
    public final void synpred54_Haxe_fragment() throws RecognitionException {
        // Haxe.g:219:19: ( LT typeList typeParamPart )
        // Haxe.g:219:19: LT typeList typeParamPart
        {
        match(input,LT,FOLLOW_LT_in_synpred54_Haxe1885); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred54_Haxe1887);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_typeParamPart_in_synpred54_Haxe1889);
        typeParamPart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred54_Haxe

    // $ANTLR start synpred55_Haxe
    public final void synpred55_Haxe_fragment() throws RecognitionException {
        // Haxe.g:223:19: ( LT typeList GTGT )
        // Haxe.g:223:19: LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred55_Haxe1983); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred55_Haxe1985);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GTGT,FOLLOW_GTGT_in_synpred55_Haxe1987); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred55_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:237:46: ( statementOrLast ELSE )
        // Haxe.g:237:46: statementOrLast ELSE
        {
        pushFollow(FOLLOW_statementOrLast_in_synpred59_Haxe2208);
        statementOrLast();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred59_Haxe2210); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred79_Haxe
    public final void synpred79_Haxe_fragment() throws RecognitionException {
        // Haxe.g:279:32: ( assignOp ternaryExpr )
        // Haxe.g:279:32: assignOp ternaryExpr
        {
        pushFollow(FOLLOW_assignOp_in_synpred79_Haxe2906);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred79_Haxe2909);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_Haxe

    // $ANTLR start synpred80_Haxe
    public final void synpred80_Haxe_fragment() throws RecognitionException {
        // Haxe.g:282:32: ( QUES expr COLON ternaryExpr )
        // Haxe.g:282:32: QUES expr COLON ternaryExpr
        {
        match(input,QUES,FOLLOW_QUES_in_synpred80_Haxe2943); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred80_Haxe2946);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred80_Haxe2948); if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred80_Haxe2951);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_Haxe

    // $ANTLR start synpred81_Haxe
    public final void synpred81_Haxe_fragment() throws RecognitionException {
        // Haxe.g:285:33: ( BARBAR logicAndExpr )
        // Haxe.g:285:33: BARBAR logicAndExpr
        {
        match(input,BARBAR,FOLLOW_BARBAR_in_synpred81_Haxe2985); if (state.failed) return ;

        pushFollow(FOLLOW_logicAndExpr_in_synpred81_Haxe2991);
        logicAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_Haxe

    // $ANTLR start synpred82_Haxe
    public final void synpred82_Haxe_fragment() throws RecognitionException {
        // Haxe.g:288:28: ( AMPAMP iterExpr )
        // Haxe.g:288:28: AMPAMP iterExpr
        {
        match(input,AMPAMP,FOLLOW_AMPAMP_in_synpred82_Haxe3027); if (state.failed) return ;

        pushFollow(FOLLOW_iterExpr_in_synpred82_Haxe3033);
        iterExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred82_Haxe

    // $ANTLR start synpred83_Haxe
    public final void synpred83_Haxe_fragment() throws RecognitionException {
        // Haxe.g:291:28: ( ELLIPSIS cmpExpr )
        // Haxe.g:291:28: ELLIPSIS cmpExpr
        {
        match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_synpred83_Haxe3086); if (state.failed) return ;

        pushFollow(FOLLOW_cmpExpr_in_synpred83_Haxe3092);
        cmpExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred83_Haxe

    // $ANTLR start synpred89_Haxe
    public final void synpred89_Haxe_fragment() throws RecognitionException {
        // Haxe.g:294:28: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )
        // Haxe.g:294:28: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
        {
        if ( input.LA(1)==BANGEQ||input.LA(1)==EQEQ||(input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_bitExpr_in_synpred89_Haxe3310);
        bitExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred89_Haxe

    // $ANTLR start synpred92_Haxe
    public final void synpred92_Haxe_fragment() throws RecognitionException {
        // Haxe.g:303:30: ( ( BAR | AMP | CARET ) shiftExpr )
        // Haxe.g:303:30: ( BAR | AMP | CARET ) shiftExpr
        {
        if ( input.LA(1)==AMP||input.LA(1)==BAR||input.LA(1)==CARET ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_shiftExpr_in_synpred92_Haxe3441);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred92_Haxe

    // $ANTLR start synpred95_Haxe
    public final void synpred95_Haxe_fragment() throws RecognitionException {
        // Haxe.g:309:28: ( ( LTLT | GTGT | GTGTGT ) addExpr )
        // Haxe.g:309:28: ( LTLT | GTGT | GTGTGT ) addExpr
        {
        if ( input.LA(1)==GTGT||input.LA(1)==GTGTGT||input.LA(1)==LTLT ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_addExpr_in_synpred95_Haxe3566);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred95_Haxe

    // $ANTLR start synpred97_Haxe
    public final void synpred97_Haxe_fragment() throws RecognitionException {
        // Haxe.g:315:29: ( ( PLUS | SUB ) multExpr )
        // Haxe.g:315:29: ( PLUS | SUB ) multExpr
        {
        if ( input.LA(1)==PLUS||input.LA(1)==SUB ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_multExpr_in_synpred97_Haxe3664);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_Haxe

    // $ANTLR start synpred100_Haxe
    public final void synpred100_Haxe_fragment() throws RecognitionException {
        // Haxe.g:320:29: ( ( STAR | SLASH | PERCENT ) unarExpr )
        // Haxe.g:320:29: ( STAR | SLASH | PERCENT ) unarExpr
        {
        if ( input.LA(1)==PERCENT||input.LA(1)==SLASH||input.LA(1)==STAR ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        pushFollow(FOLLOW_unarExpr_in_synpred100_Haxe3795);
        unarExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_Haxe

    // $ANTLR start synpred106_Haxe
    public final void synpred106_Haxe_fragment() throws RecognitionException {
        // Haxe.g:332:31: ( PLUSPLUS )
        // Haxe.g:332:31: PLUSPLUS
        {
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred106_Haxe3949); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred106_Haxe

    // $ANTLR start synpred107_Haxe
    public final void synpred107_Haxe_fragment() throws RecognitionException {
        // Haxe.g:332:48: ( SUBSUB )
        // Haxe.g:332:48: SUBSUB
        {
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred107_Haxe3955); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred107_Haxe

    // $ANTLR start synpred113_Haxe
    public final void synpred113_Haxe_fragment() throws RecognitionException {
        // Haxe.g:341:49: ( pureCallOrSlice )
        // Haxe.g:341:49: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred113_Haxe4120);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred113_Haxe

    // $ANTLR start synpred114_Haxe
    public final void synpred114_Haxe_fragment() throws RecognitionException {
        // Haxe.g:341:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:341:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred114_Haxe4111);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred114_Haxe4113); if (state.failed) return ;

        // Haxe.g:341:32: ( exprList )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==BANG||LA133_0==CAST||LA133_0==CHARLITERAL||LA133_0==FALSE||LA133_0==FLOATNUM||LA133_0==FUNCTION||LA133_0==IDENTIFIER||LA133_0==INTLITERAL||(LA133_0 >= LBRACE && LA133_0 <= LBRACKET)||(LA133_0 >= LONGLITERAL && LA133_0 <= LPAREN)||(LA133_0 >= NEW && LA133_0 <= NULL)||LA133_0==PLUSPLUS||(LA133_0 >= STRINGLITERAL && LA133_0 <= SUB)||LA133_0==SUBSUB||LA133_0==SUPER||LA133_0==THIS||LA133_0==TILDE||LA133_0==TRUE||LA133_0==UNTYPED) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // Haxe.g:341:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred114_Haxe4115);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred114_Haxe4118); if (state.failed) return ;

        // Haxe.g:341:49: ( pureCallOrSlice )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==DOT||LA134_0==LBRACKET) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // Haxe.g:341:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred114_Haxe4120);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred114_Haxe

    // $ANTLR start synpred115_Haxe
    public final void synpred115_Haxe_fragment() throws RecognitionException {
        // Haxe.g:343:48: ( pureCallOrSlice )
        // Haxe.g:343:48: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred115_Haxe4179);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred116_Haxe
    public final void synpred116_Haxe_fragment() throws RecognitionException {
        // Haxe.g:343:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:343:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred116_Haxe4171);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred116_Haxe4173); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred116_Haxe4175);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred116_Haxe4177); if (state.failed) return ;

        // Haxe.g:343:48: ( pureCallOrSlice )?
        int alt135=2;
        int LA135_0 = input.LA(1);

        if ( (LA135_0==DOT||LA135_0==LBRACKET) ) {
            alt135=1;
        }
        switch (alt135) {
            case 1 :
                // Haxe.g:343:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred116_Haxe4179);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred116_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:345:19: ( value pureCallOrSlice )
        // Haxe.g:345:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred117_Haxe4230);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred117_Haxe4233);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:349:43: ( pureCallOrSlice )
        // Haxe.g:349:43: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4286);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred126_Haxe
    public final void synpred126_Haxe_fragment() throws RecognitionException {
        // Haxe.g:364:9: ( LPAREN expr RPAREN '?' expr COLON expr )
        // Haxe.g:364:9: LPAREN expr RPAREN '?' expr COLON expr
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred126_Haxe4491); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred126_Haxe4493);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred126_Haxe4495); if (state.failed) return ;

        match(input,QUES,FOLLOW_QUES_in_synpred126_Haxe4497); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred126_Haxe4499);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred126_Haxe4501); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred126_Haxe4503);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_Haxe

    // $ANTLR start synpred127_Haxe
    public final void synpred127_Haxe_fragment() throws RecognitionException {
        // Haxe.g:365:9: ( LPAREN expr RPAREN )
        // Haxe.g:365:9: LPAREN expr RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred127_Haxe4525); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred127_Haxe4528);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred127_Haxe4530); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_Haxe

    // $ANTLR start synpred128_Haxe
    public final void synpred128_Haxe_fragment() throws RecognitionException {
        // Haxe.g:367:12: ( typeParam )
        // Haxe.g:367:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred128_Haxe4548);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_Haxe

    // Delegated rules

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
    public final boolean synpred128_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred128_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred113_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred89_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred6_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred53_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred95_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred92_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred97_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred100_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred126_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA90 dfa90 = new DFA90(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA115 dfa115 = new DFA115(this);
    static final String DFA90_eotS =
        "\4\uffff";
    static final String DFA90_eofS =
        "\4\uffff";
    static final String DFA90_minS =
        "\2\45\2\uffff";
    static final String DFA90_maxS =
        "\2\u009b\2\uffff";
    static final String DFA90_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA90_specialS =
        "\4\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\1\21\uffff\1\3\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\27\uffff\1\2",
            "\1\1\21\uffff\1\3\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\27\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "395:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA101_eotS =
        "\5\uffff";
    static final String DFA101_eofS =
        "\5\uffff";
    static final String DFA101_minS =
        "\2\45\1\102\2\uffff";
    static final String DFA101_maxS =
        "\2\u0083\1\135\2\uffff";
    static final String DFA101_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA101_specialS =
        "\5\uffff}>";
    static final String[] DFA101_transitionS = {
            "\1\1\21\uffff\1\2\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\21\uffff\1\2\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\32\uffff\1\3",
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
            return "422:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA115_eotS =
        "\10\uffff";
    static final String DFA115_eofS =
        "\10\uffff";
    static final String DFA115_minS =
        "\2\45\2\102\4\uffff";
    static final String DFA115_maxS =
        "\2\u0083\2\135\4\uffff";
    static final String DFA115_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA115_specialS =
        "\10\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\1\21\uffff\1\2\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\21\uffff\1\3\21\uffff\1\1\26\uffff\1\1\23\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\5\32\uffff\1\4",
            "\1\7\32\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "431:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module163 = new BitSet(new long[]{0x0001040002000002L,0x0010000000000880L,0x0000000004100000L});
    public static final BitSet FOLLOW_imports_in_module166 = new BitSet(new long[]{0x0001040002000002L,0x0010000000000880L,0x0000000004100000L});
    public static final BitSet FOLLOW_topLevelDecl_in_module169 = new BitSet(new long[]{0x0001040002000002L,0x0010000000000800L,0x0000000000100000L});
    public static final BitSet FOLLOW_IMPORT_in_imports221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_filepath_in_imports224 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_imports226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_imports247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_filepath_in_imports250 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_imports252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage284 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000004L});
    public static final BitSet FOLLOW_filepath_in_myPackage288 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath350 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_filepath355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath359 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta395 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_metaName_in_meta397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_meta400 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_meta402 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_meta405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName433 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_metaName_in_metaName435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags453 = new BitSet(new long[]{0x0001000000000002L,0x0010000004000000L});
    public static final BitSet FOLLOW_topLevelAccess_in_topLevelAccessAttr711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList751 = new BitSet(new long[]{0x0000002000000002L,0x0090000100000200L,0x0000000000000008L});
    public static final BitSet FOLLOW_param_in_paramList796 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList799 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000004L});
    public static final BitSet FOLLOW_param_in_paramList801 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_QUES_in_param851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param854 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_typeTag_in_param856 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_param859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_id1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1427 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcLit1430 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1433 = new BitSet(new long[]{0x0000000004000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_funcLit1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_funcType_in_typeTag1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1528 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeList1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1556 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeList1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1597 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_type_in_funcType1603 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1641 = new BitSet(new long[]{0x0200000000000000L,0x0200000000000004L,0x0000000008000000L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1643 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1728 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x0000000008000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1739 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1789 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1794 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_filepath_in_type1839 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_anonType_in_type1844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeParam_in_type1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeParam1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeParamPart_in_typeParam1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeParam1925 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart1985 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParamPart1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2021 = new BitSet(new long[]{0x2000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeParam_in_typeParamPart2023 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParamPart2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint2077 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint2083 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statement2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2145 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statement2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementLast2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statementLast2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2205 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statementOrLast_in_statementLast2208 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ELSE_in_statementLast2210 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_statementLast2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statementLast2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2241 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_statementLast2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_IN_in_statementLast2246 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_iterExpr_in_statementLast2249 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2251 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_statementLast2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2280 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_statementLast2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statementLast2302 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_statementLast2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2313 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statementLast2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_statementLast2342 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_catchStmt_in_statementLast2344 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_SWITCH_in_statementLast2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2371 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_statementLast2374 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_statementLast2379 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_caseStmt_in_statementLast2382 = new BitSet(new long[]{0x0000000100100000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statementLast2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statementLast2406 = new BitSet(new long[]{0x00A4000001200100L,0x200000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_statementLast2412 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statementLast2436 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_statementLast2439 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statementLast2462 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statementOrLast2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statementOrLast2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2543 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_parExpression2546 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2584 = new BitSet(new long[]{0x00E5000443208100L,0x0A1000806006D00CL,0x000000002A06BD60L});
    public static final BitSet FOLLOW_blockStmt_in_block2587 = new BitSet(new long[]{0x00E5000443208100L,0x0A1000806006D00CL,0x000000002A06BD60L});
    public static final BitSet FOLLOW_RBRACE_in_block2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2681 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2684 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2686 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_caseStmt2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2709 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2712 = new BitSet(new long[]{0x00E4000441208100L,0x080000806006D00CL,0x000000002206BD60L});
    public static final BitSet FOLLOW_statement_in_caseStmt2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2756 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000004L});
    public static final BitSet FOLLOW_param_in_catchStmt2759 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_block_in_catchStmt2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2802 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2805 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_exprList2808 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2850 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_assignExpr_in_expr2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2903 = new BitSet(new long[]{0x5000080000082082L,0x0000005000400000L,0x0000000000000085L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2906 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2940 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2943 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2946 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2948 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2982 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2985 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2991 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3025 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3027 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3033 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3083 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr3086 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3131 = new BitSet(new long[]{0x0600100000000202L,0x0000000000180000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3158 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3187 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3216 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3245 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3274 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3303 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3310 = new BitSet(new long[]{0x0600100000000202L,0x0000000000180000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3349 = new BitSet(new long[]{0x0000000000040822L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3376 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3405 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3434 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3441 = new BitSet(new long[]{0x0000000000040822L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3474 = new BitSet(new long[]{0x2800000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3501 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3530 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3559 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3566 = new BitSet(new long[]{0x2800000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3601 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3628 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_SUB_in_addExpr3657 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3664 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3703 = new BitSet(new long[]{0x0000000000000002L,0x8000000800000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multExpr3730 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3759 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3788 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3795 = new BitSet(new long[]{0x0000000000000002L,0x8000000800000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3843 = new BitSet(new long[]{0x00A4000001200000L,0x000000006006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3862 = new BitSet(new long[]{0x00A4000001200000L,0x000000006006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3881 = new BitSet(new long[]{0x00A4000001200000L,0x000000006006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3900 = new BitSet(new long[]{0x00A4000001200000L,0x000000006006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3919 = new BitSet(new long[]{0x00A4000001200000L,0x000000006006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3946 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_type_in_prefixExpr4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4005 = new BitSet(new long[]{0x00A4000001200100L,0x100000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4008 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4035 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4038 = new BitSet(new long[]{0x0000000008000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4044 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4113 = new BitSet(new long[]{0x00A4000001200100L,0x100000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4115 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4118 = new BitSet(new long[]{0x0000000800000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4173 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4175 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4177 = new BitSet(new long[]{0x0000000800000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4230 = new BitSet(new long[]{0x0000000800000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4279 = new BitSet(new long[]{0x00A4000001200100L,0x040000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4281 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4284 = new BitSet(new long[]{0x0000000800000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4340 = new BitSet(new long[]{0x00A4000001000000L,0x000000004006D004L,0x0000000000021420L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayObj4375 = new BitSet(new long[]{0x00A4000001200100L,0x040000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_exprList_in_arrayObj4377 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayObj4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayObj_in_value4473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4491 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_value4493 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value4495 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUES_in_value4497 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_value4499 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_value4501 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_value4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4525 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_value4528 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4546 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeParam_in_value4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_enumDecl4664 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000084000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4723 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000004L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4726 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000004L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4776 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4779 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4782 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4808 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_classDecl4862 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4867 = new BitSet(new long[]{0x0000800000000000L,0x0000000000084020L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4869 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004020L});
    public static final BitSet FOLLOW_extending_in_classDecl4875 = new BitSet(new long[]{0x0000000008000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_classDecl4878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_implementList_in_classDecl4880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_implementList_in_classDecl4885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4960 = new BitSet(new long[]{0x0080002000000000L,0x0290000100000200L,0x0000000008000008L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4963 = new BitSet(new long[]{0x0080002000000000L,0x0290000100000200L,0x0000000008000008L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5080 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5086 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5089 = new BitSet(new long[]{0x0000080000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5091 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5147 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5153 = new BitSet(new long[]{0x0000000008000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5183 = new BitSet(new long[]{0x0000080004000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5185 = new BitSet(new long[]{0x0000080004000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5188 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5242 = new BitSet(new long[]{0x0000002100000000L,0x0000000050000004L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5246 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5248 = new BitSet(new long[]{0x0000002100000000L,0x0000000050000004L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5252 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5413 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_varInit5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5451 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5454 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5516 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5521 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5610 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5613 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5616 = new BitSet(new long[]{0x0000000004000000L,0x2000000000004000L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5619 = new BitSet(new long[]{0x0000000000000000L,0x2000000000004000L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5664 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5670 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5672 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5675 = new BitSet(new long[]{0x0000000004000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5677 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5721 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5725 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5730 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5732 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5735 = new BitSet(new long[]{0x0000000004000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5737 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5784 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5788 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5790 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5793 = new BitSet(new long[]{0x0000000004000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5795 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5838 = new BitSet(new long[]{0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5843 = new BitSet(new long[]{0x0000000000000000L,0x1100000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5845 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5848 = new BitSet(new long[]{0x0000000004000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5850 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_interfaceDecl5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5917 = new BitSet(new long[]{0x0000800000000000L,0x0000000000004020L});
    public static final BitSet FOLLOW_extending_in_interfaceDecl5919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004020L});
    public static final BitSet FOLLOW_implementList_in_interfaceDecl5922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5925 = new BitSet(new long[]{0x0080002000000000L,0x0290000100000200L,0x0000000008000008L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5928 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5954 = new BitSet(new long[]{0x0080002000000000L,0x0090000100000200L,0x0000000008000008L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5966 = new BitSet(new long[]{0x0080002000000000L,0x0090000100000200L,0x0000000008000008L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implementing_in_implementList6006 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_implementList6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_implementing_in_implementList6011 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_implementing6058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_type_in_implementing6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extending6108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_type_in_extending6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6150 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6229 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6259 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6294 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6300 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6336 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6338 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_objLitElem6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred53_Haxe1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred54_Haxe1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_synpred54_Haxe1887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeParamPart_in_synpred54_Haxe1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred55_Haxe1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004004L});
    public static final BitSet FOLLOW_typeList_in_synpred55_Haxe1985 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred55_Haxe1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementOrLast_in_synpred59_Haxe2208 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred59_Haxe2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_synpred79_Haxe2906 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred79_Haxe2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_synpred80_Haxe2943 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred80_Haxe2946 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred80_Haxe2948 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred80_Haxe2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_synpred81_Haxe2985 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_logicAndExpr_in_synpred81_Haxe2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_synpred82_Haxe3027 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_iterExpr_in_synpred82_Haxe3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_synpred83_Haxe3086 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_cmpExpr_in_synpred83_Haxe3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred89_Haxe3134 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_bitExpr_in_synpred89_Haxe3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred92_Haxe3352 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred92_Haxe3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred95_Haxe3477 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_addExpr_in_synpred95_Haxe3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred97_Haxe3604 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_multExpr_in_synpred97_Haxe3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred100_Haxe3706 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000000029560L});
    public static final BitSet FOLLOW_unarExpr_in_synpred100_Haxe3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred106_Haxe3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred107_Haxe3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred113_Haxe4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred114_Haxe4111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred114_Haxe4113 = new BitSet(new long[]{0x00A4000001200100L,0x100000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_exprList_in_synpred114_Haxe4115 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred114_Haxe4118 = new BitSet(new long[]{0x0000000800000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred114_Haxe4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred115_Haxe4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred116_Haxe4171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred116_Haxe4173 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred116_Haxe4175 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred116_Haxe4177 = new BitSet(new long[]{0x0000000800000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred116_Haxe4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred117_Haxe4230 = new BitSet(new long[]{0x0000000800000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred117_Haxe4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred126_Haxe4491 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred126_Haxe4493 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred126_Haxe4495 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_QUES_in_synpred126_Haxe4497 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred126_Haxe4499 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_in_synpred126_Haxe4501 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred126_Haxe4503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred127_Haxe4525 = new BitSet(new long[]{0x00A4000001200100L,0x000000806006D004L,0x0000000002029560L});
    public static final BitSet FOLLOW_expr_in_synpred127_Haxe4528 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred127_Haxe4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred128_Haxe4548 = new BitSet(new long[]{0x0000000000000002L});

}