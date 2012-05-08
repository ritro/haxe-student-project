// $ANTLR 3.4 Haxe.g 2012-04-23 20:22:35

package imp.parser.antlr;

import tree.HaxeTree;
import tree.specific.Assignment;
import tree.specific.BinaryExpression;
import tree.specific.BlockScope;
import tree.specific.type.ClassNode;
import tree.specific.UnarExpression;
import tree.specific.type.EnumNode;
import tree.specific.ErrorNode;
import tree.specific.DoWhile;
import tree.specific.For;
import tree.specific.Function;
import tree.specific.IfNode;
import tree.specific.MethodCall;
import tree.specific.NewNode;
import tree.specific.SliceNode;
import tree.specific.SwitchNode;
import tree.specific.TryNode;
import tree.specific.Return;
import tree.specific.Declaration;
import tree.specific.Usage;
import tree.specific.Constant;
import tree.specific.ArrayNode;
import tree.specific.While;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BREAK", "BYTE", "CALL_OR_SLICE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPLEMENT_LIST", "IMPORT", "IN", "INLINE", "INSTANCEOF", "INTERFACE", "INTLITERAL", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_CONSTRAIN", "TYPE_PARAM", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOLATILE", "WHILE", "WS"
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
    public static final int BREAK=16;
    public static final int BYTE=17;
    public static final int CALL_OR_SLICE=18;
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
    public static final int FLOATNUM=54;
    public static final int FOR=55;
    public static final int FUNCTION=56;
    public static final int GOTO=57;
    public static final int GT=58;
    public static final int GTEQ=59;
    public static final int GTGT=60;
    public static final int GTGTEQ=61;
    public static final int GTGTGT=62;
    public static final int GTGTGTEQ=63;
    public static final int HEX_DIGIT=64;
    public static final int HexDigit=65;
    public static final int HexPrefix=66;
    public static final int IDENT=67;
    public static final int IDENTIFIER=68;
    public static final int IF=69;
    public static final int IF_TOKEN=70;
    public static final int IMPLEMENTS=71;
    public static final int IMPLEMENT_LIST=72;
    public static final int IMPORT=73;
    public static final int IN=74;
    public static final int INLINE=75;
    public static final int INSTANCEOF=76;
    public static final int INTERFACE=77;
    public static final int INTLITERAL=78;
    public static final int IntegerNumber=79;
    public static final int LBRACE=80;
    public static final int LBRACKET=81;
    public static final int LONG=82;
    public static final int LONGLITERAL=83;
    public static final int LPAREN=84;
    public static final int LT=85;
    public static final int LTEQ=86;
    public static final int LTLT=87;
    public static final int LTLTEQ=88;
    public static final int LongSuffix=89;
    public static final int MINUS_BIGGER=90;
    public static final int MODULE=91;
    public static final int MONKEYS_AT=92;
    public static final int NATIVE=93;
    public static final int NEVER=94;
    public static final int NEW=95;
    public static final int NULL=96;
    public static final int OCTAL_ESC=97;
    public static final int OVERRIDE=98;
    public static final int PACKAGE=99;
    public static final int PARAM_LIST=100;
    public static final int PERCENT=101;
    public static final int PERCENTEQ=102;
    public static final int PLUS=103;
    public static final int PLUSEQ=104;
    public static final int PLUSPLUS=105;
    public static final int PP_AND_EXPRESSION=106;
    public static final int PP_CONDITIONAL=107;
    public static final int PP_ELSE=108;
    public static final int PP_ELSEIF=109;
    public static final int PP_END=110;
    public static final int PP_ERROR=111;
    public static final int PP_EXPRESSION=112;
    public static final int PP_IF=113;
    public static final int PP_OR_EXPRESSION=114;
    public static final int PP_PRIMARY_EXPRESSION=115;
    public static final int PP_UNARY_EXPRESSION=116;
    public static final int PREFIX_EXPR=117;
    public static final int PREPROCESSOR_DIRECTIVE=118;
    public static final int PRIVATE=119;
    public static final int PROPERTY_DECL=120;
    public static final int PROTECTED=121;
    public static final int PUBLIC=122;
    public static final int QUES=123;
    public static final int RBRACE=124;
    public static final int RBRACKET=125;
    public static final int RETURN=126;
    public static final int RPAREN=127;
    public static final int SEMI=128;
    public static final int SHORT=129;
    public static final int SLASH=130;
    public static final int SLASHEQ=131;
    public static final int STAR=132;
    public static final int STAREQ=133;
    public static final int STATIC=134;
    public static final int STRICTFP=135;
    public static final int STRINGLITERAL=136;
    public static final int SUB=137;
    public static final int SUBEQ=138;
    public static final int SUBSUB=139;
    public static final int SUFFIX_EXPR=140;
    public static final int SUPER=141;
    public static final int SWITCH=142;
    public static final int THIS=143;
    public static final int THROW=144;
    public static final int THROWS=145;
    public static final int TILDE=146;
    public static final int TRANSIENT=147;
    public static final int TRUE=148;
    public static final int TRY=149;
    public static final int TS=150;
    public static final int TYPEDEF=151;
    public static final int TYPE_CONSTRAIN=152;
    public static final int TYPE_PARAM=153;
    public static final int TYPE_TAG=154;
    public static final int UNICODE_ESC=155;
    public static final int UNTYPED=156;
    public static final int USING=157;
    public static final int VAR=158;
    public static final int VAR_INIT=159;
    public static final int VOLATILE=160;
    public static final int WHILE=161;
    public static final int WS=162;

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
    // Haxe.g:86:1: module : ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) ;
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

            // Haxe.g:86:17: ( ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) )
            // Haxe.g:86:19: ( myPackage )? ( imports )* ( topLevelDecl )*
            {
            // Haxe.g:86:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:86:19: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module191);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            // Haxe.g:86:30: ( imports )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:86:30: imports
            	    {
            	    pushFollow(FOLLOW_imports_in_module194);
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


            // Haxe.g:86:39: ( topLevelDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CLASS||LA3_0==ENUM||LA3_0==EXTERN||LA3_0==INTERFACE||LA3_0==PRIVATE||LA3_0==TYPEDEF) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Haxe.g:86:39: topLevelDecl
            	    {
            	    pushFollow(FOLLOW_topLevelDecl_in_module197);
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
            // elements: myPackage, imports, topLevelDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:53: -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
            {
                // Haxe.g:86:56: ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE")
                , root_1);

                // Haxe.g:86:85: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:86:96: ( imports )*
                while ( stream_imports.hasNext() ) {
                    adaptor.addChild(root_1, stream_imports.nextTree());

                }
                stream_imports.reset();

                // Haxe.g:86:105: ( topLevelDecl )*
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
    // Haxe.g:89:1: imports : ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !);
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

            // Haxe.g:89:17: ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !)
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
                    // Haxe.g:89:19: IMPORT ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPORT4=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports250); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT4_tree = 
                    (Object)adaptor.create(IMPORT4)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPORT4_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports253);
                    filepath5=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath5.getTree());

                    SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports255); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:90:19: USING ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    USING7=(Token)match(input,USING,FOLLOW_USING_in_imports276); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING7_tree = 
                    (Object)adaptor.create(USING7)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(USING7_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports279);
                    filepath8=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath8.getTree());

                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports281); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:93:1: myPackage : PACKAGE ^ filepath SEMI !;
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

            // Haxe.g:93:17: ( PACKAGE ^ filepath SEMI !)
            // Haxe.g:93:19: PACKAGE ^ filepath SEMI !
            {
            root_0 = (Object)adaptor.nil();


            PACKAGE10=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE10_tree = 
            (Object)adaptor.create(PACKAGE10)
            ;
            root_0 = (Object)adaptor.becomeRoot(PACKAGE10_tree, root_0);
            }

            pushFollow(FOLLOW_filepath_in_myPackage316);
            filepath11=filepath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath11.getTree());

            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage318); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:96:1: filepath : a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a;
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

            // Haxe.g:96:17: (a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a)
            // Haxe.g:96:19: a= IDENTIFIER (b= DOT d= IDENTIFIER )*
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);


            // Haxe.g:96:32: (b= DOT d= IDENTIFIER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Haxe.g:96:33: b= DOT d= IDENTIFIER
            	    {
            	    b=(Token)match(input,DOT,FOLLOW_DOT_in_filepath378); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(b);


            	    d=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath382); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(d);


            	    if ( state.backtracking==0 ) {a.setText((a!=null?a.getText():null)+(b!=null?b.getText():null) + (d!=null?d.getText():null));}

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // 96:94: -> $a
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
    // Haxe.g:99:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
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

            // Haxe.g:99:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:99:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            MONKEYS_AT13=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta418); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT13_tree = 
            (Object)adaptor.create(MONKEYS_AT13)
            ;
            adaptor.addChild(root_0, MONKEYS_AT13_tree);
            }

            pushFollow(FOLLOW_metaName_in_meta420);
            metaName14=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName14.getTree());

            // Haxe.g:99:31: ( LPAREN ( paramList )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Haxe.g:99:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN15_tree = 
                    (Object)adaptor.create(LPAREN15)
                    ;
                    adaptor.addChild(root_0, LPAREN15_tree);
                    }

                    // Haxe.g:99:39: ( paramList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFIER||LA6_0==QUES) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Haxe.g:99:39: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_meta425);
                            paramList16=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList16.getTree());

                            }
                            break;

                    }


                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta428); if (state.failed) return retval;
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
    // Haxe.g:102:1: metaName : ( IDENTIFIER | COLON metaName );
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

            // Haxe.g:103:5: ( IDENTIFIER | COLON metaName )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER) ) {
                alt8=1;
            }
            else if ( (LA8_0==COLON) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // Haxe.g:103:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName447); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER18_tree = 
                    (Object)adaptor.create(IDENTIFIER18)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER18_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:105:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON19=(Token)match(input,COLON,FOLLOW_COLON_in_metaName456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON19_tree = 
                    (Object)adaptor.create(COLON19)
                    ;
                    adaptor.addChild(root_0, COLON19_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName458);
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
    // Haxe.g:108:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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

            // Haxe.g:109:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:109:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:109:7: ( meta )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MONKEYS_AT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Haxe.g:109:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags476);
            	    meta21=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta21.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // Haxe.g:109:15: ( EXTERN | PRIVATE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==EXTERN||LA10_0==PRIVATE) ) {
                    alt10=1;
                }


                switch (alt10) {
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
            	    break loop10;
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
    // Haxe.g:115:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;

        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:115:17: ( PRIVATE | EXTERN )
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
    // Haxe.g:119:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:119:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE )
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
    // Haxe.g:127:1: topLevelAccessAttr : topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) ;
    public final HaxeParser.topLevelAccessAttr_return topLevelAccessAttr() throws RecognitionException {
        HaxeParser.topLevelAccessAttr_return retval = new HaxeParser.topLevelAccessAttr_return();
        retval.start = input.LT(1);

        int topLevelAccessAttr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevelAccess_return topLevelAccess25 =null;


        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:128:17: ( topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) )
            // Haxe.g:128:19: topLevelAccess
            {
            pushFollow(FOLLOW_topLevelAccess_in_topLevelAccessAttr734);
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
            // 128:34: -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
            {
                // Haxe.g:128:37: ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
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
    // Haxe.g:131:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr26 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:131:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:131:19: ( declAttr )+
            {
            // Haxe.g:131:19: ( declAttr )+
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
            	    // Haxe.g:131:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList774);
            	    declAttr26=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr26.getTree());

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
            // 131:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:131:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:134:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
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

            // Haxe.g:134:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:134:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList819);
            param27=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param27.getTree());

            // Haxe.g:134:25: ( COMMA param )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:134:26: COMMA param
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList822); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA28);


            	    pushFollow(FOLLOW_param_in_paramList824);
            	    param29=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_param.add(param29.getTree());

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
            // 134:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:134:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:137:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
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

            // Haxe.g:137:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:137:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:137:19: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:137:19: QUES
                    {
                    QUES30=(Token)match(input,QUES,FOLLOW_QUES_in_param874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES30);


                    }
                    break;

            }


            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER31);


            // Haxe.g:137:36: ( typeTag )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:137:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param879);
                    typeTag32=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag32.getTree());

                    }
                    break;

            }


            // Haxe.g:137:45: ( varInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:137:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param882);
                    varInit33=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit33.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeTag, varInit, QUES
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:137:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Declaration(VAR, IDENTIFIER31)
                , root_1);

                // Haxe.g:137:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:137:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:137:114: ( QUES )?
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
    // Haxe.g:140:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER34=null;

        Object IDENTIFIER34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:140:17: ( IDENTIFIER )
            // Haxe.g:140:19: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier932); if (state.failed) return retval;
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
    // Haxe.g:143:1: id : ( identifier | THIS | SUPER );
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

            // Haxe.g:143:17: ( identifier | THIS | SUPER )
            int alt16=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt16=1;
                }
                break;
            case THIS:
                {
                alt16=2;
                }
                break;
            case SUPER:
                {
                alt16=3;
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
                    // Haxe.g:143:19: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_id989);
                    identifier35=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:144:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS36=(Token)match(input,THIS,FOLLOW_THIS_in_id1009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS36_tree = 
                    new Usage(THIS36) 
                    ;
                    adaptor.addChild(root_0, THIS36_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:145:19: SUPER
                    {
                    root_0 = (Object)adaptor.nil();


                    SUPER37=(Token)match(input,SUPER,FOLLOW_SUPER_in_id1032); if (state.failed) return retval;
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
    // Haxe.g:148:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
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

            // Haxe.g:148:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:148:19: EQ
                    {
                    EQ38=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp1067); if (state.failed) return retval; 
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
                    // 148:28: -> EQ
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
                    // Haxe.g:149:19: PLUSEQ
                    {
                    PLUSEQ39=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1100); if (state.failed) return retval; 
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
                    // 149:28: -> PLUSEQ
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
                    // Haxe.g:150:19: SUBEQ
                    {
                    SUBEQ40=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1129); if (state.failed) return retval; 
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
                    // 150:28: -> SUBEQ
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
                    // Haxe.g:151:19: STAREQ
                    {
                    STAREQ41=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1159); if (state.failed) return retval; 
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
                    // 151:28: -> STAREQ
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
                    // Haxe.g:152:19: SLASHEQ
                    {
                    SLASHEQ42=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1188); if (state.failed) return retval; 
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
                    // 152:28: -> SLASHEQ
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
                    // Haxe.g:153:19: PERCENTEQ
                    {
                    PERCENTEQ43=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1216); if (state.failed) return retval; 
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
                    // 153:29: -> PERCENTEQ
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
                    // Haxe.g:154:19: AMPEQ
                    {
                    AMPEQ44=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1243); if (state.failed) return retval; 
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
                    // 154:28: -> AMPEQ
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
                    // Haxe.g:155:19: BAREQ
                    {
                    BAREQ45=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1273); if (state.failed) return retval; 
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
                    // 155:28: -> BAREQ
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
                    // Haxe.g:156:19: CARETEQ
                    {
                    CARETEQ46=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1303); if (state.failed) return retval; 
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
                    // 156:28: -> CARETEQ
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
                    // Haxe.g:157:19: LTLTEQ
                    {
                    LTLTEQ47=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1331); if (state.failed) return retval; 
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
                    // 157:28: -> LTLTEQ
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
                    // Haxe.g:158:19: GTGTEQ
                    {
                    GTGTEQ48=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1360); if (state.failed) return retval; 
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
                    // 158:28: -> GTGTEQ
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
                    // Haxe.g:159:19: GTGTGTEQ
                    {
                    GTGTGTEQ49=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1389); if (state.failed) return retval; 
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
                    // 159:28: -> GTGTGTEQ
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
    // Haxe.g:162:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
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

            // Haxe.g:162:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:162:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1445); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION50_tree = 
            new Function(FUNCTION50) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION50_tree, root_0);
            }

            LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1451); if (state.failed) return retval;

            // Haxe.g:162:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:162:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1454);
                    paramList52=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList52.getTree());

                    }
                    break;

            }


            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1457); if (state.failed) return retval;

            // Haxe.g:162:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:162:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1460);
                    typeTag54=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag54.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1463);
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
    // Haxe.g:190:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
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

            // Haxe.g:190:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:190:19: COLON funcType
            {
            COLON56=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON56);


            pushFollow(FOLLOW_funcType_in_typeTag1509);
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
            // 190:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:190:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
    // Haxe.g:193:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
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

            // Haxe.g:193:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EOF||LA22_1==COMMA||LA22_1==DOT||LA22_1==GT||LA22_1==GTGT||LA22_1==GTGTGT||LA22_1==LT||LA22_1==MINUS_BIGGER||LA22_1==RPAREN) ) {
                    alt22=1;
                }
                else if ( (LA22_1==COLON) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA22_0==LBRACE) ) {
                alt22=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Haxe.g:193:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1553);
                    funcType58=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType58.getTree());

                    // Haxe.g:193:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:193:29: COMMA ! typeList
                            {
                            COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1556); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1559);
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
                    // Haxe.g:194:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1581);
                    typeConstraint61=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint61.getTree());

                    // Haxe.g:194:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:194:35: COMMA ! typeList
                            {
                            COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1584); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1587);
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
    // Haxe.g:197:1: funcType : type ( MINUS_BIGGER ! type )* ;
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

            // Haxe.g:197:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:197:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1622);
            type64=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());

            // Haxe.g:197:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:197:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER65=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1625); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1628);
            	    type66=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type66.getTree());

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


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:200:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) ;
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

            // Haxe.g:200:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) )
            // Haxe.g:200:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE67=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE67);


            // Haxe.g:200:26: ( anonTypePart )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GT||LA24_0==IDENTIFIER||LA24_0==VAR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:200:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1668);
                    anonTypePart68=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart68.getTree());

                    }
                    break;

            }


            RBRACE69=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1671); if (state.failed) return retval; 
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
            // 200:47: -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
            {
                // Haxe.g:200:50: ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "AnonType")
                , root_1);

                // Haxe.g:200:83: ( anonTypePart )?
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
    // Haxe.g:203:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
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

            // Haxe.g:203:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
            int alt28=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt28=1;
                }
                break;
            case VAR:
                {
                alt28=2;
                }
                break;
            case GT:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // Haxe.g:203:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1712);
                    anonTypeFieldList70=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList70.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:204:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:204:19: ( varDecl )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==VAR) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Haxe.g:204:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1732);
                    	    varDecl71=varDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl71.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // Haxe.g:205:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1753);
                    typeExtend72=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend72.getTree());

                    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1755); if (state.failed) return retval;

                    // Haxe.g:205:37: ( anonTypeFieldList | ( varDecl )+ )?
                    int alt27=3;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENTIFIER) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==VAR) ) {
                        alt27=2;
                    }
                    switch (alt27) {
                        case 1 :
                            // Haxe.g:205:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1760);
                            anonTypeFieldList74=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList74.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:205:59: ( varDecl )+
                            {
                            // Haxe.g:205:59: ( varDecl )+
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
                            	    // Haxe.g:205:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1764);
                            	    varDecl75=varDecl();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl75.getTree());

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
    // Haxe.g:208:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
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

            // Haxe.g:209:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:209:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1814);
            anonTypeField76=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField76.getTree());

            // Haxe.g:209:33: ( COMMA anonTypeField )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:209:34: COMMA anonTypeField
            	    {
            	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1817); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1819);
            	    anonTypeField78=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField78.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // 209:56: -> ( anonTypeField )+
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
    // Haxe.g:212:1: type : ( filepath ^| anonType ^) ( typeParam )? ;
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

            // Haxe.g:212:17: ( ( filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:212:19: ( filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:212:19: ( filepath ^| anonType ^)
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==IDENTIFIER) ) {
                alt30=1;
            }
            else if ( (LA30_0==LBRACE) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // Haxe.g:212:21: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1864);
                    filepath79=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath79.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:212:33: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1869);
                    anonType80=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType80.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:212:45: ( typeParam )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LT) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred51_Haxe()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // Haxe.g:212:45: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1874);
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
    // Haxe.g:215:1: typeParam : ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) );
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

            // Haxe.g:215:17: ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred52_Haxe()) ) {
                    alt32=1;
                }
                else if ( (true) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:215:19: LT typeList typeParamPart
                    {
                    LT82=(Token)match(input,LT,FOLLOW_LT_in_typeParam1910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT82);


                    pushFollow(FOLLOW_typeList_in_typeParam1912);
                    typeList83=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList83.getTree());

                    pushFollow(FOLLOW_typeParamPart_in_typeParam1914);
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
                    // 215:45: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
                    {
                        // Haxe.g:215:48: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
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
                    // Haxe.g:216:19: LT typeList GT
                    {
                    LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT85);


                    pushFollow(FOLLOW_typeList_in_typeParam1950);
                    typeList86=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList86.getTree());

                    GT87=(Token)match(input,GT,FOLLOW_GT_in_typeParam1952); if (state.failed) return retval; 
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
                    // 216:34: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:216:37: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
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
    // Haxe.g:219:1: typeParamPart : ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) );
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

            // Haxe.g:219:17: ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LT) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred53_Haxe()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // Haxe.g:219:19: LT typeList GTGT
                    {
                    LT88=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT88);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2010);
                    typeList89=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList89.getTree());

                    GTGT90=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParamPart2012); if (state.failed) return retval; 
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
                    // 219:36: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:219:39: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
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
                    // Haxe.g:220:19: LT typeList ( typeParam )? GTGTGT
                    {
                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2044); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT91);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2046);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList92.getTree());

                    // Haxe.g:220:31: ( typeParam )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:220:31: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_typeParamPart2048);
                            typeParam93=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam93.getTree());

                            }
                            break;

                    }


                    GTGTGT94=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParamPart2051); if (state.failed) return retval; 
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
                    // 220:49: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                    {
                        // Haxe.g:220:52: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

                        // Haxe.g:220:98: ( typeParam )?
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
    // Haxe.g:223:1: typeConstraint : identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) ;
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

            // Haxe.g:224:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:224:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint2102);
            identifier95=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier95.getTree());

            COLON96=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint2104); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON96);


            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint2106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);


            pushFollow(FOLLOW_typeList_in_typeConstraint2108);
            typeList98=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList98.getTree());

            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint2110); if (state.failed) return retval; 
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
            // 224:47: -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
            {
                // Haxe.g:224:50: ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_CONSTRAIN, "TYPE_CONSTRAIN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Haxe.g:224:106: ( typeList )?
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
    // Haxe.g:228:1: statement : ( statementLast | expr SEMI !);
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

            // Haxe.g:228:17: ( statementLast | expr SEMI !)
            int alt35=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==BANG||LA35_1==BREAK||LA35_1==CAST||(LA35_1 >= CHARLITERAL && LA35_1 <= CLASS)||LA35_1==CONTINUE||LA35_1==DO||LA35_1==EXTERN||(LA35_1 >= FLOATNUM && LA35_1 <= FUNCTION)||LA35_1==IF||LA35_1==INTLITERAL||(LA35_1 >= LBRACE && LA35_1 <= LBRACKET)||(LA35_1 >= LONGLITERAL && LA35_1 <= LPAREN)||(LA35_1 >= NEW && LA35_1 <= NULL)||LA35_1==PLUSPLUS||LA35_1==PRIVATE||LA35_1==RBRACE||LA35_1==RETURN||(LA35_1 >= STRINGLITERAL && LA35_1 <= SUB)||LA35_1==SUBSUB||(LA35_1 >= SUPER && LA35_1 <= THROW)||LA35_1==TILDE||LA35_1==TRY||LA35_1==UNTYPED||LA35_1==VAR||LA35_1==WHILE) ) {
                    alt35=1;
                }
                else if ( (LA35_1==IDENTIFIER) ) {
                    int LA35_4 = input.LA(3);

                    if ( (LA35_4==COLON) ) {
                        alt35=2;
                    }
                    else if ( ((LA35_4 >= AMP && LA35_4 <= AMPEQ)||LA35_4==BANGEQ||(LA35_4 >= BAR && LA35_4 <= BAREQ)||(LA35_4 >= CARET && LA35_4 <= CARETEQ)||LA35_4==DOT||LA35_4==ELLIPSIS||(LA35_4 >= EQ && LA35_4 <= EQEQ)||(LA35_4 >= GT && LA35_4 <= GTGTGTEQ)||LA35_4==LBRACKET||(LA35_4 >= LPAREN && LA35_4 <= LTLTEQ)||(LA35_4 >= PERCENT && LA35_4 <= PLUSPLUS)||LA35_4==QUES||LA35_4==SEMI||(LA35_4 >= SLASH && LA35_4 <= STAREQ)||(LA35_4 >= SUB && LA35_4 <= SUBSUB)) ) {
                        alt35=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

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
                alt35=1;
                }
                break;
            case BANG:
            case CAST:
            case CHARLITERAL:
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
            case UNTYPED:
                {
                alt35=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Haxe.g:228:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statement2150);
                    statementLast100=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast100.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:229:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2170);
                    expr101=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr101.getTree());

                    SEMI102=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2172); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:232:1: statementLast : ( block | IF ^ parExpression ( statementOrLast ELSE !)? statement | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !);
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

            // Haxe.g:232:17: ( block | IF ^ parExpression ( statementOrLast ELSE !)? statement | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !)
            int alt40=10;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt40=1;
                }
                break;
            case IF:
                {
                alt40=2;
                }
                break;
            case FOR:
                {
                alt40=3;
                }
                break;
            case WHILE:
                {
                alt40=4;
                }
                break;
            case DO:
                {
                alt40=5;
                }
                break;
            case TRY:
                {
                alt40=6;
                }
                break;
            case SWITCH:
                {
                alt40=7;
                }
                break;
            case RETURN:
                {
                alt40=8;
                }
                break;
            case THROW:
                {
                alt40=9;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt40=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // Haxe.g:232:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statementLast2204);
                    block103=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block103.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:233:19: IF ^ parExpression ( statementOrLast ELSE !)? statement
                    {
                    root_0 = (Object)adaptor.nil();


                    IF104=(Token)match(input,IF,FOLLOW_IF_in_statementLast2224); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF104_tree = 
                    new IfNode(IF104) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF104_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2230);
                    parExpression105=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression105.getTree());

                    // Haxe.g:233:45: ( statementOrLast ELSE !)?
                    int alt36=2;
                    switch ( input.LA(1) ) {
                        case LBRACE:
                            {
                            int LA36_1 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case IF:
                            {
                            int LA36_2 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FOR:
                            {
                            int LA36_3 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case WHILE:
                            {
                            int LA36_4 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case DO:
                            {
                            int LA36_5 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case TRY:
                            {
                            int LA36_6 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SWITCH:
                            {
                            int LA36_7 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case RETURN:
                            {
                            int LA36_8 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case THROW:
                            {
                            int LA36_9 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case BREAK:
                        case CONTINUE:
                            {
                            int LA36_10 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case UNTYPED:
                            {
                            int LA36_11 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUB:
                            {
                            int LA36_12 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUBSUB:
                            {
                            int LA36_13 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case PLUSPLUS:
                            {
                            int LA36_14 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case BANG:
                            {
                            int LA36_15 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case TILDE:
                            {
                            int LA36_16 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case NEW:
                            {
                            int LA36_17 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case CAST:
                            {
                            int LA36_18 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FUNCTION:
                            {
                            int LA36_19 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LBRACKET:
                            {
                            int LA36_20 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LONGLITERAL:
                            {
                            int LA36_21 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case NULL:
                            {
                            int LA36_22 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case INTLITERAL:
                            {
                            int LA36_23 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case STRINGLITERAL:
                            {
                            int LA36_24 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case CHARLITERAL:
                            {
                            int LA36_25 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FLOATNUM:
                            {
                            int LA36_26 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            int LA36_27 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA36_28 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case THIS:
                            {
                            int LA36_29 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUPER:
                            {
                            int LA36_30 = input.LA(2);

                            if ( (synpred57_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                    }

                    switch (alt36) {
                        case 1 :
                            // Haxe.g:233:46: statementOrLast ELSE !
                            {
                            pushFollow(FOLLOW_statementOrLast_in_statementLast2233);
                            statementOrLast106=statementOrLast();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementOrLast106.getTree());

                            ELSE107=(Token)match(input,ELSE,FOLLOW_ELSE_in_statementLast2235); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_statement_in_statementLast2240);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement108.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:234:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR109=(Token)match(input,FOR,FOLLOW_FOR_in_statementLast2260); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR109_tree = 
                    new For(FOR109) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR109_tree, root_0);
                    }

                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2266); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2269);
                    expr111=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr111.getTree());

                    IN112=(Token)match(input,IN,FOLLOW_IN_in_statementLast2271); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statementLast2274);
                    iterExpr113=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr113.getTree());

                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2276); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statementLast2279);
                    statement115=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement115.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:235:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE116=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2299); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE116_tree = 
                    new While(WHILE116) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE116_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2305);
                    parExpression117=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression117.getTree());

                    pushFollow(FOLLOW_statement_in_statementLast2307);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement118.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:236:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO119=(Token)match(input,DO,FOLLOW_DO_in_statementLast2327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO119_tree = 
                    new DoWhile(DO119) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO119_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statementLast2333);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement120.getTree());

                    WHILE121=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2335); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statementLast2338);
                    parExpression122=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression122.getTree());

                    SEMI123=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2340); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:237:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY124=(Token)match(input,TRY,FOLLOW_TRY_in_statementLast2361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY124_tree = 
                    new TryNode(TRY124) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY124_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statementLast2367);
                    block125=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block125.getTree());

                    // Haxe.g:237:39: ( catchStmt )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==CATCH) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Haxe.g:237:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statementLast2369);
                    	    catchStmt126=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt126.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;
                case 7 :
                    // Haxe.g:238:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH127=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statementLast2390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH127_tree = 
                    new SwitchNode(SWITCH127) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH127_tree, root_0);
                    }

                    LPAREN128=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2396); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2399);
                    expr129=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr129.getTree());

                    RPAREN130=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2401); if (state.failed) return retval;

                    LBRACE131=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statementLast2404); if (state.failed) return retval;

                    // Haxe.g:238:68: ( caseStmt )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==CASE||LA38_0==DEFAULT) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Haxe.g:238:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statementLast2407);
                    	    caseStmt132=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt132.getTree());

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


                    RBRACE133=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statementLast2410); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:239:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN134=(Token)match(input,RETURN,FOLLOW_RETURN_in_statementLast2431); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN134_tree = 
                    new Return(RETURN134) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN134_tree, root_0);
                    }

                    // Haxe.g:239:39: ( expr )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==BANG||LA39_0==CAST||LA39_0==CHARLITERAL||LA39_0==FLOATNUM||LA39_0==FUNCTION||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||(LA39_0 >= LBRACE && LA39_0 <= LBRACKET)||(LA39_0 >= LONGLITERAL && LA39_0 <= LPAREN)||(LA39_0 >= NEW && LA39_0 <= NULL)||LA39_0==PLUSPLUS||(LA39_0 >= STRINGLITERAL && LA39_0 <= SUB)||LA39_0==SUBSUB||LA39_0==SUPER||LA39_0==THIS||LA39_0==TILDE||LA39_0==UNTYPED) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Haxe.g:239:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statementLast2437);
                            expr135=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr135.getTree());

                            }
                            break;

                    }


                    SEMI136=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2440); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:240:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW137=(Token)match(input,THROW,FOLLOW_THROW_in_statementLast2461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW137_tree = 
                    (Object)adaptor.create(THROW137)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW137_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statementLast2464);
                    expr138=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2466); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:241:19: ( BREAK | CONTINUE ) SEMI !
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


                    SEMI141=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2495); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:245:1: statementOrLast : ( statementLast | expr );
    public final HaxeParser.statementOrLast_return statementOrLast() throws RecognitionException {
        HaxeParser.statementOrLast_return retval = new HaxeParser.statementOrLast_return();
        retval.start = input.LT(1);

        int statementOrLast_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.statementLast_return statementLast142 =null;

        HaxeParser.expr_return expr143 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:245:17: ( statementLast | expr )
            int alt41=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==BANG||LA41_1==BREAK||LA41_1==CAST||(LA41_1 >= CHARLITERAL && LA41_1 <= CLASS)||LA41_1==CONTINUE||LA41_1==DO||LA41_1==EXTERN||(LA41_1 >= FLOATNUM && LA41_1 <= FUNCTION)||LA41_1==IF||LA41_1==INTLITERAL||(LA41_1 >= LBRACE && LA41_1 <= LBRACKET)||(LA41_1 >= LONGLITERAL && LA41_1 <= LPAREN)||(LA41_1 >= NEW && LA41_1 <= NULL)||LA41_1==PLUSPLUS||LA41_1==PRIVATE||LA41_1==RBRACE||LA41_1==RETURN||(LA41_1 >= STRINGLITERAL && LA41_1 <= SUB)||LA41_1==SUBSUB||(LA41_1 >= SUPER && LA41_1 <= THROW)||LA41_1==TILDE||LA41_1==TRY||LA41_1==UNTYPED||LA41_1==VAR||LA41_1==WHILE) ) {
                    alt41=1;
                }
                else if ( (LA41_1==IDENTIFIER) ) {
                    int LA41_4 = input.LA(3);

                    if ( (LA41_4==COLON) ) {
                        alt41=2;
                    }
                    else if ( ((LA41_4 >= AMP && LA41_4 <= AMPEQ)||LA41_4==BANGEQ||(LA41_4 >= BAR && LA41_4 <= BAREQ)||(LA41_4 >= CARET && LA41_4 <= CARETEQ)||LA41_4==DOT||LA41_4==ELLIPSIS||(LA41_4 >= EQ && LA41_4 <= EQEQ)||(LA41_4 >= GT && LA41_4 <= GTGTGTEQ)||LA41_4==LBRACKET||(LA41_4 >= LPAREN && LA41_4 <= LTLTEQ)||(LA41_4 >= PERCENT && LA41_4 <= PLUSPLUS)||LA41_4==QUES||LA41_4==SEMI||(LA41_4 >= SLASH && LA41_4 <= STAREQ)||(LA41_4 >= SUB && LA41_4 <= SUBSUB)) ) {
                        alt41=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

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
                alt41=1;
                }
                break;
            case BANG:
            case CAST:
            case CHARLITERAL:
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
            case UNTYPED:
                {
                alt41=2;
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
                    // Haxe.g:245:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statementOrLast2518);
                    statementLast142=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast142.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:246:19: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statementOrLast2538);
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
    // Haxe.g:249:1: parExpression : LPAREN ! expr RPAREN !;
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

            // Haxe.g:249:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:249:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN144=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2568); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2571);
            expr145=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr145.getTree());

            RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2573); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:252:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) ;
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

            // Haxe.g:252:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:252:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE147=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE147);


            // Haxe.g:252:26: ( blockStmt )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BANG||LA42_0==BREAK||LA42_0==CAST||(LA42_0 >= CHARLITERAL && LA42_0 <= CLASS)||LA42_0==CONTINUE||LA42_0==DO||LA42_0==EXTERN||(LA42_0 >= FLOATNUM && LA42_0 <= FUNCTION)||(LA42_0 >= IDENTIFIER && LA42_0 <= IF)||LA42_0==INTLITERAL||(LA42_0 >= LBRACE && LA42_0 <= LBRACKET)||(LA42_0 >= LONGLITERAL && LA42_0 <= LPAREN)||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||LA42_0==PRIVATE||LA42_0==RETURN||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||(LA42_0 >= SUPER && LA42_0 <= THROW)||LA42_0==TILDE||LA42_0==TRY||LA42_0==UNTYPED||LA42_0==VAR||LA42_0==WHILE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:252:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2612);
            	    blockStmt148=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt148.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            RBRACE149=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2616); if (state.failed) return retval; 
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
            // 252:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
            {
                // Haxe.g:252:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE147, RBRACE149)
                , root_1);

                // Haxe.g:252:97: ( blockStmt )*
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
    // Haxe.g:255:1: blockStmt : ( varDecl | classDecl | statement );
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

            // Haxe.g:255:17: ( varDecl | classDecl | statement )
            int alt43=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt43=1;
                }
                break;
            case CLASS:
            case EXTERN:
            case PRIVATE:
                {
                alt43=2;
                }
                break;
            case BANG:
            case BREAK:
            case CAST:
            case CHARLITERAL:
            case CONTINUE:
            case DO:
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
            case TRY:
            case UNTYPED:
            case WHILE:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // Haxe.g:255:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2660);
                    varDecl150=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl150.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:256:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2671);
                    classDecl151=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl151.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:257:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2682);
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
    // Haxe.g:260:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
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

            // Haxe.g:260:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==CASE) ) {
                alt44=1;
            }
            else if ( (LA44_0==DEFAULT) ) {
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
                    // Haxe.g:260:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE153=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE153_tree = 
                    (Object)adaptor.create(CASE153)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE153_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2709);
                    exprList154=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList154.getTree());

                    COLON155=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2711); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2714);
                    statement156=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement156.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:261:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT157=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2734); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT157_tree = 
                    (Object)adaptor.create(DEFAULT157)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT157_tree, root_0);
                    }

                    COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2737); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2740);
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
    // Haxe.g:264:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
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

            // Haxe.g:264:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:264:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH160=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2775); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH160_tree = 
            new HaxeTree(CATCH160) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH160_tree, root_0);
            }

            LPAREN161=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2781); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2784);
            param162=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param162.getTree());

            RPAREN163=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2786); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2789);
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
    // Haxe.g:268:1: exprList : expr ( COMMA ! expr )* ;
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

            // Haxe.g:268:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:268:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2827);
            expr165=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr165.getTree());

            // Haxe.g:268:24: ( COMMA ! expr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:268:25: COMMA ! expr
            	    {
            	    COMMA166=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2830); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2833);
            	    expr167=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr167.getTree());

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
    // Haxe.g:271:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
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

            // Haxe.g:271:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==UNTYPED) ) {
                alt46=1;
            }
            else if ( (LA46_0==BANG||LA46_0==CAST||LA46_0==CHARLITERAL||LA46_0==FLOATNUM||LA46_0==FUNCTION||LA46_0==IDENTIFIER||LA46_0==INTLITERAL||(LA46_0 >= LBRACE && LA46_0 <= LBRACKET)||(LA46_0 >= LONGLITERAL && LA46_0 <= LPAREN)||(LA46_0 >= NEW && LA46_0 <= NULL)||LA46_0==PLUSPLUS||(LA46_0 >= STRINGLITERAL && LA46_0 <= SUB)||LA46_0==SUBSUB||LA46_0==SUPER||LA46_0==THIS||LA46_0==TILDE) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:271:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED168=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2875); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED168_tree = 
                    (Object)adaptor.create(UNTYPED168)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED168_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2878);
                    assignExpr169=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr169.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:272:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2898);
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
    // Haxe.g:275:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
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

            // Haxe.g:275:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:275:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2928);
            ternaryExpr171=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr171.getTree());

            // Haxe.g:275:31: ( assignOp ^ ternaryExpr )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case EQ:
                    {
                    int LA47_1 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case PLUSEQ:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case SUBEQ:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case STAREQ:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case SLASHEQ:
                    {
                    int LA47_5 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case PERCENTEQ:
                    {
                    int LA47_6 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case AMPEQ:
                    {
                    int LA47_7 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case BAREQ:
                    {
                    int LA47_8 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case CARETEQ:
                    {
                    int LA47_9 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case LTLTEQ:
                    {
                    int LA47_10 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case GTGTEQ:
                    {
                    int LA47_11 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case GTGTGTEQ:
                    {
                    int LA47_12 = input.LA(2);

                    if ( (synpred77_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // Haxe.g:275:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2931);
                    assignOp172=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp172.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2934);
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
    // Haxe.g:278:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
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

            // Haxe.g:278:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:278:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2965);
            logicOrExpr174=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr174.getTree());

            // Haxe.g:278:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==QUES) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred78_Haxe()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // Haxe.g:278:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES175=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES175_tree = 
                    (Object)adaptor.create(QUES175)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES175_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2971);
                    expr176=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr176.getTree());

                    COLON177=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2973); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2976);
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
    // Haxe.g:281:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
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

            // Haxe.g:281:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:281:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3007);
            logicAndExpr179=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr179.getTree());

            // Haxe.g:281:32: ( BARBAR ^ logicAndExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BARBAR) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred79_Haxe()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:281:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR180=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr3010); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR180_tree = 
            	    new BinaryExpression(BARBAR180) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR180_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3016);
            	    logicAndExpr181=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr181.getTree());

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
    // Haxe.g:284:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
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

            // Haxe.g:284:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:284:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr3050);
            iterExpr182=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr182.getTree());

            // Haxe.g:284:27: ( AMPAMP ^ iterExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==AMPAMP) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred80_Haxe()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:284:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP183=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3052); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP183_tree = 
            	    new BinaryExpression(AMPAMP183) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP183_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr3058);
            	    iterExpr184=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr184.getTree());

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
    // Haxe.g:287:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
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

            // Haxe.g:287:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:287:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr3108);
            cmpExpr185=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr185.getTree());

            // Haxe.g:287:27: ( ELLIPSIS ^ cmpExpr )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ELLIPSIS) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred81_Haxe()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // Haxe.g:287:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS186=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr3111); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS186_tree = 
                    new BinaryExpression(ELLIPSIS186) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS186_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr3117);
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
    // Haxe.g:290:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
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

            // Haxe.g:290:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:290:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3156);
            bitExpr188=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr188.getTree());

            // Haxe.g:290:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case BANGEQ:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case GTEQ:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case LTEQ:
                    {
                    int LA53_5 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case GT:
                    {
                    int LA53_6 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case LT:
                    {
                    int LA53_7 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // Haxe.g:290:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:290:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
            	    int alt52=6;
            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt52=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt52=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt52=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt52=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt52=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt52=6;
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
            	            // Haxe.g:291:23: EQEQ ^
            	            {
            	            EQEQ189=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3183); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ189_tree = 
            	            new BinaryExpression(EQEQ189) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:292:23: BANGEQ ^
            	            {
            	            BANGEQ190=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3212); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ190_tree = 
            	            new BinaryExpression(BANGEQ190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:293:23: GTEQ ^
            	            {
            	            GTEQ191=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3241); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ191_tree = 
            	            new BinaryExpression(GTEQ191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:294:23: LTEQ ^
            	            {
            	            LTEQ192=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3270); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ192_tree = 
            	            new BinaryExpression(LTEQ192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:295:23: GT ^
            	            {
            	            GT193=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3299); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT193_tree = 
            	            new BinaryExpression(GT193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:296:23: LT ^
            	            {
            	            LT194=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3328); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT194_tree = 
            	            new BinaryExpression(LT194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT194_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3335);
            	    bitExpr195=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr195.getTree());

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
    // Haxe.g:299:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
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

            // Haxe.g:299:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:299:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3374);
            shiftExpr196=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr196.getTree());

            // Haxe.g:299:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred90_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case AMP:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred90_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case CARET:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred90_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // Haxe.g:299:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:299:30: ( BAR ^| AMP ^| CARET ^)
            	    int alt54=3;
            	    switch ( input.LA(1) ) {
            	    case BAR:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case AMP:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case CARET:
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
            	            // Haxe.g:300:23: BAR ^
            	            {
            	            BAR197=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3401); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR197_tree = 
            	            new BinaryExpression(BAR197) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR197_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:301:23: AMP ^
            	            {
            	            AMP198=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3430); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP198_tree = 
            	            new BinaryExpression(AMP198) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP198_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:302:23: CARET ^
            	            {
            	            CARET199=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3459); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET199_tree = 
            	            new BinaryExpression(CARET199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET199_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3466);
            	    shiftExpr200=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr200.getTree());

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
    // Haxe.g:305:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
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

            // Haxe.g:305:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:305:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3499);
            addExpr201=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr201.getTree());

            // Haxe.g:305:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred93_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case GTGT:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred93_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case GTGTGT:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred93_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // Haxe.g:305:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:305:28: ( LTLT ^| GTGT ^| GTGTGT ^)
            	    int alt56=3;
            	    switch ( input.LA(1) ) {
            	    case LTLT:
            	        {
            	        alt56=1;
            	        }
            	        break;
            	    case GTGT:
            	        {
            	        alt56=2;
            	        }
            	        break;
            	    case GTGTGT:
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
            	            // Haxe.g:306:23: LTLT ^
            	            {
            	            LTLT202=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3526); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT202_tree = 
            	            new BinaryExpression(LTLT202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT202_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:307:23: GTGT ^
            	            {
            	            GTGT203=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3555); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT203_tree = 
            	            new BinaryExpression(GTGT203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:308:23: GTGTGT ^
            	            {
            	            GTGTGT204=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3584); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT204_tree = 
            	            new BinaryExpression(GTGTGT204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT204_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3591);
            	    addExpr205=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr205.getTree());

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
    // Haxe.g:311:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
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

            // Haxe.g:311:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:311:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3626);
            multExpr206=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr206.getTree());

            // Haxe.g:311:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==PLUS) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred95_Haxe()) ) {
                        alt59=1;
                    }


                }
                else if ( (LA59_0==SUB) ) {
                    int LA59_3 = input.LA(2);

                    if ( (synpred95_Haxe()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:311:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:311:29: ( PLUS ^| SUB ^)
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==PLUS) ) {
            	        alt58=1;
            	    }
            	    else if ( (LA58_0==SUB) ) {
            	        alt58=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 58, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // Haxe.g:312:23: PLUS ^
            	            {
            	            PLUS207=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3653); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS207_tree = 
            	            new BinaryExpression(PLUS207) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:313:23: SUB ^
            	            {
            	            SUB208=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3682); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB208_tree = 
            	            new BinaryExpression(SUB208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB208_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3689);
            	    multExpr209=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr209.getTree());

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
    // Haxe.g:316:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
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

            // Haxe.g:316:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:316:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3728);
            unarExpr210=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr210.getTree());

            // Haxe.g:316:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    int LA61_2 = input.LA(2);

                    if ( (synpred98_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;
                case SLASH:
                    {
                    int LA61_3 = input.LA(2);

                    if ( (synpred98_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;
                case PERCENT:
                    {
                    int LA61_4 = input.LA(2);

                    if ( (synpred98_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // Haxe.g:316:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:316:29: ( STAR ^| SLASH ^| PERCENT ^)
            	    int alt60=3;
            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt60=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt60=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt60=3;
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
            	            // Haxe.g:317:23: STAR ^
            	            {
            	            STAR211=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3755); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR211_tree = 
            	            new BinaryExpression(STAR211) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:318:23: SLASH ^
            	            {
            	            SLASH212=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3784); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH212_tree = 
            	            new BinaryExpression(SLASH212) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:319:23: PERCENT ^
            	            {
            	            PERCENT213=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3813); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT213_tree = 
            	            new BinaryExpression(PERCENT213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT213_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3820);
            	    unarExpr214=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr214.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // Haxe.g:322:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
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

            // Haxe.g:322:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BANG||LA64_0==PLUSPLUS||LA64_0==SUB||LA64_0==SUBSUB||LA64_0==TILDE) ) {
                alt64=1;
            }
            else if ( (LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||(LA64_0 >= LBRACE && LA64_0 <= LBRACKET)||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==STRINGLITERAL||LA64_0==SUPER||LA64_0==THIS) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // Haxe.g:322:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:322:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
                    int alt62=5;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        alt62=1;
                        }
                        break;
                    case SUBSUB:
                        {
                        alt62=2;
                        }
                        break;
                    case PLUSPLUS:
                        {
                        alt62=3;
                        }
                        break;
                    case BANG:
                        {
                        alt62=4;
                        }
                        break;
                    case TILDE:
                        {
                        alt62=5;
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
                            // Haxe.g:323:13: SUB ^
                            {
                            SUB215=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3868); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB215_tree = 
                            new UnarExpression(SUB215) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB215_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:324:13: SUBSUB ^
                            {
                            SUBSUB216=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3887); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB216_tree = 
                            new UnarExpression(SUBSUB216) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB216_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:325:13: PLUSPLUS ^
                            {
                            PLUSPLUS217=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3906); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS217_tree = 
                            new UnarExpression(PLUSPLUS217) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS217_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:326:13: BANG ^
                            {
                            BANG218=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3925); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG218_tree = 
                            new UnarExpression(BANG218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG218_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:327:13: TILDE ^
                            {
                            TILDE219=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3944); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE219_tree = 
                            new UnarExpression(TILDE219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE219_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3951);
                    prefixExpr220=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr220.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:328:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3971);
                    prefixExpr221=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr221.getTree());

                    // Haxe.g:328:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt63=3;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==PLUSPLUS) ) {
                        int LA63_1 = input.LA(2);

                        if ( (synpred104_Haxe()) ) {
                            alt63=1;
                        }
                    }
                    else if ( (LA63_0==SUBSUB) ) {
                        int LA63_2 = input.LA(2);

                        if ( (synpred105_Haxe()) ) {
                            alt63=2;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:328:31: PLUSPLUS ^
                            {
                            PLUSPLUS222=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3974); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS222_tree = 
                            new UnarExpression(PLUSPLUS222) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS222_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:328:61: SUBSUB ^
                            {
                            SUBSUB223=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3980); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB223_tree = 
                            new UnarExpression(SUBSUB223) 
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
    // Haxe.g:331:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
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

            // Haxe.g:331:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
            int alt67=3;
            switch ( input.LA(1) ) {
            case NEW:
                {
                alt67=1;
                }
                break;
            case CAST:
                {
                alt67=2;
                }
                break;
            case CHARLITERAL:
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
                {
                alt67=3;
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
                    // Haxe.g:331:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW224=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr4022); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW224_tree = 
                    new NewNode(NEW224) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW224_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4028);
                    type225=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type225.getTree());

                    LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4030); if (state.failed) return retval;

                    // Haxe.g:331:46: ( exprList )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==BANG||LA65_0==CAST||LA65_0==CHARLITERAL||LA65_0==FLOATNUM||LA65_0==FUNCTION||LA65_0==IDENTIFIER||LA65_0==INTLITERAL||(LA65_0 >= LBRACE && LA65_0 <= LBRACKET)||(LA65_0 >= LONGLITERAL && LA65_0 <= LPAREN)||(LA65_0 >= NEW && LA65_0 <= NULL)||LA65_0==PLUSPLUS||(LA65_0 >= STRINGLITERAL && LA65_0 <= SUB)||LA65_0==SUBSUB||LA65_0==SUPER||LA65_0==THIS||LA65_0==TILDE||LA65_0==UNTYPED) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:331:46: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4033);
                            exprList227=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList227.getTree());

                            }
                            break;

                    }


                    RPAREN228=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4036); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:332:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST229=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST229_tree = 
                    (Object)adaptor.create(CAST229)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST229_tree, root_0);
                    }

                    LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4060); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4063);
                    expr231=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr231.getTree());

                    // Haxe.g:332:38: ( COMMA ! funcType )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==COMMA) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:332:39: COMMA ! funcType
                            {
                            COMMA232=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4066); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4069);
                            funcType233=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType233.getTree());

                            }
                            break;

                    }


                    RPAREN234=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4073); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:333:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr4094);
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
    // Haxe.g:336:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
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

            // Haxe.g:337:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt71=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA71_1 = input.LA(2);

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
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

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 9, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA71_10 = input.LA(2);

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 10, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA71_11 = input.LA(2);

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 11, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA71_12 = input.LA(2);

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 12, input);

                    throw nvae;

                }
                }
                break;
            case SUPER:
                {
                int LA71_13 = input.LA(2);

                if ( (synpred112_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred114_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred115_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 13, input);

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
                    // Haxe.g:337:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4136);
                    value236=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value236.getTree());

                    LPAREN237=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN237);


                    // Haxe.g:337:32: ( exprList )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG||LA68_0==CAST||LA68_0==CHARLITERAL||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||(LA68_0 >= LBRACE && LA68_0 <= LBRACKET)||(LA68_0 >= LONGLITERAL && LA68_0 <= LPAREN)||(LA68_0 >= NEW && LA68_0 <= NULL)||LA68_0==PLUSPLUS||(LA68_0 >= STRINGLITERAL && LA68_0 <= SUB)||LA68_0==SUBSUB||LA68_0==SUPER||LA68_0==THIS||LA68_0==TILDE||LA68_0==UNTYPED) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:337:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4140);
                            exprList238=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList238.getTree());

                            }
                            break;

                    }


                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN239);


                    // Haxe.g:337:49: ( pureCallOrSlice )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==LBRACKET) ) {
                        int LA69_1 = input.LA(2);

                        if ( (synpred111_Haxe()) ) {
                            alt69=1;
                        }
                    }
                    else if ( (LA69_0==DOT) ) {
                        int LA69_2 = input.LA(2);

                        if ( (synpred111_Haxe()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:337:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4145);
                            pureCallOrSlice240=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice240.getTree());

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
                    // 338:13: -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:338:16: ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new MethodCall(CALL_OR_SLICE, LPAREN237, RPAREN239)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:338:72: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:338:82: ( pureCallOrSlice )?
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
                    // Haxe.g:339:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4196);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());

                    LBRACKET242=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4198); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET242);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4200);
                    expr243=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr243.getTree());

                    RBRACKET244=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4202); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET244);


                    // Haxe.g:339:48: ( pureCallOrSlice )?
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
                            // Haxe.g:339:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4204);
                            pureCallOrSlice245=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice245.getTree());

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
                    // 340:13: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:340:16: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET242, RBRACKET244, false)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:340:83: ( pureCallOrSlice )?
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
                    // Haxe.g:341:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4255);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value246.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4258);
                    pureCallOrSlice247=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice247.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:342:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4279);
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
    // Haxe.g:345:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
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

            // Haxe.g:345:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==LBRACKET) ) {
                alt74=1;
            }
            else if ( (LA74_0==DOT) ) {
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
                    // Haxe.g:345:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET249=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET249);


                    // Haxe.g:345:28: ( expr )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==BANG||LA72_0==CAST||LA72_0==CHARLITERAL||LA72_0==FLOATNUM||LA72_0==FUNCTION||LA72_0==IDENTIFIER||LA72_0==INTLITERAL||(LA72_0 >= LBRACE && LA72_0 <= LBRACKET)||(LA72_0 >= LONGLITERAL && LA72_0 <= LPAREN)||(LA72_0 >= NEW && LA72_0 <= NULL)||LA72_0==PLUSPLUS||(LA72_0 >= STRINGLITERAL && LA72_0 <= SUB)||LA72_0==SUBSUB||LA72_0==SUPER||LA72_0==THIS||LA72_0==TILDE||LA72_0==UNTYPED) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:345:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4306);
                            expr250=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr250.getTree());

                            }
                            break;

                    }


                    RBRACKET251=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET251);


                    // Haxe.g:345:43: ( pureCallOrSlice )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LBRACKET) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred117_Haxe()) ) {
                            alt73=1;
                        }
                    }
                    else if ( (LA73_0==DOT) ) {
                        int LA73_2 = input.LA(2);

                        if ( (synpred117_Haxe()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:345:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4311);
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
                    // 345:60: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:345:63: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET249, RBRACKET251, true)
                        , root_1);

                        // Haxe.g:346:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:346:76: ( pureCallOrSlice )?
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
                    // Haxe.g:347:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT253=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4365); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT253_tree = 
                    (Object)adaptor.create(DOT253)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT253_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4368);
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
    // Haxe.g:350:1: arrayObj : LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) ;
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

            // Haxe.g:350:17: ( LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) )
            // Haxe.g:350:19: LBRACKET ( exprList )? RBRACKET
            {
            LBRACKET255=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayObj4400); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET255);


            // Haxe.g:350:28: ( exprList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BANG||LA75_0==CAST||LA75_0==CHARLITERAL||LA75_0==FLOATNUM||LA75_0==FUNCTION||LA75_0==IDENTIFIER||LA75_0==INTLITERAL||(LA75_0 >= LBRACE && LA75_0 <= LBRACKET)||(LA75_0 >= LONGLITERAL && LA75_0 <= LPAREN)||(LA75_0 >= NEW && LA75_0 <= NULL)||LA75_0==PLUSPLUS||(LA75_0 >= STRINGLITERAL && LA75_0 <= SUB)||LA75_0==SUBSUB||LA75_0==SUPER||LA75_0==THIS||LA75_0==TILDE||LA75_0==UNTYPED) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:350:28: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayObj4402);
                    exprList256=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList256.getTree());

                    }
                    break;

            }


            RBRACKET257=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayObj4405); if (state.failed) return retval; 
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
            // 351:13: -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
            {
                // Haxe.g:351:16: ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ArrayNode(SUFFIX_EXPR, LBRACKET255, RBRACKET257)
                , root_1);

                // Haxe.g:351:63: ( exprList )?
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
    // Haxe.g:354:1: value : ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? );
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

            // Haxe.g:356:5: ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? )
            int alt77=7;
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
            case FLOATNUM:
            case INTLITERAL:
            case LONGLITERAL:
            case NULL:
            case STRINGLITERAL:
                {
                alt77=4;
                }
                break;
            case LPAREN:
                {
                int LA77_10 = input.LA(2);

                if ( (synpred124_Haxe()) ) {
                    alt77=5;
                }
                else if ( (synpred125_Haxe()) ) {
                    alt77=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 10, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
            case SUPER:
            case THIS:
                {
                alt77=7;
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
                    // Haxe.g:356:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4482);
                    objLit258=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit258.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:357:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4490);
                    funcLit259=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit259.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:358:7: arrayObj
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayObj_in_value4498);
                    arrayObj260=arrayObj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayObj260.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:359:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4506);
                    elementarySymbol261=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol261.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:360:9: LPAREN expr RPAREN '?' expr COLON expr
                    {
                    LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN262);


                    pushFollow(FOLLOW_expr_in_value4518);
                    expr263=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr263.getTree());

                    RPAREN264=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN264);


                    char_literal265=(Token)match(input,QUES,FOLLOW_QUES_in_value4522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(char_literal265);


                    pushFollow(FOLLOW_expr_in_value4524);
                    expr266=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr266.getTree());

                    COLON267=(Token)match(input,COLON,FOLLOW_COLON_in_value4526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON267);


                    pushFollow(FOLLOW_expr_in_value4528);
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
                    // 360:48: -> ^( LPAREN ( expr )+ )
                    {
                        // Haxe.g:360:51: ^( LPAREN ( expr )+ )
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
                    // Haxe.g:361:9: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN269=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4550); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value4553);
                    expr270=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr270.getTree());

                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4555); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:363:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4571);
                    id272=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id272.getTree());

                    // Haxe.g:363:12: ( typeParam )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==LT) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred126_Haxe()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // Haxe.g:363:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4573);
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
    // Haxe.g:367:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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

            // Haxe.g:367:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:367:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4593);
                    classDecl274=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl274.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:368:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4613);
                    interfaceDecl275=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl275.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:369:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4633);
                    enumDecl276=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl276.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:370:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4653);
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
    // Haxe.g:373:1: enumDecl : ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) ;
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

            // Haxe.g:373:17: ( ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) )
            // Haxe.g:373:19: ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:373:19: ( topLevelAccessAttr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EXTERN||LA79_0==PRIVATE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:373:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_enumDecl4689);
                    topLevelAccessAttr278=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr278.getTree());

                    }
                    break;

            }


            ENUM279=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4692); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM279);


            IDENTIFIER280=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER280);


            // Haxe.g:373:55: ( typeParam )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:373:55: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4696);
                    typeParam281=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam281.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4699);
            enumBody282=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody282.getTree());

            // AST REWRITE
            // elements: typeParam, enumBody, IDENTIFIER, topLevelAccessAttr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 373:75: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
            {
                // Haxe.g:373:78: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:373:101: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:373:121: ( typeParam )?
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
    // Haxe.g:376:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
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

            // Haxe.g:376:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:376:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE283=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4748); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE283);


            // Haxe.g:376:26: ( enumValueDecl )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==IDENTIFIER) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Haxe.g:376:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4751);
            	    enumValueDecl284=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl284.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            RBRACE285=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4755); if (state.failed) return retval; 
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
            // 376:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:376:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE283, RBRACE285)
                , root_1);

                // Haxe.g:376:101: ( enumValueDecl )*
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
    // Haxe.g:379:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
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

            // Haxe.g:379:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
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
                    // Haxe.g:379:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4795); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER286_tree = 
                    new Declaration(IDENTIFIER286) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER286_tree, root_0);
                    }

                    LPAREN287=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4801); if (state.failed) return retval;

                    // Haxe.g:379:59: ( paramList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==IDENTIFIER||LA82_0==QUES) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Haxe.g:379:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4804);
                            paramList288=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList288.getTree());

                            }
                            break;

                    }


                    RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4807); if (state.failed) return retval;

                    SEMI290=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4810); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:380:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4833); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER291_tree = 
                    new Declaration(IDENTIFIER291) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER291_tree);
                    }

                    SEMI292=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4838); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:384:1: classDecl : ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS294=null;
        Token IDENTIFIER295=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr293 =null;

        HaxeParser.typeParam_return typeParam296 =null;

        HaxeParser.extending_return extending297 =null;

        HaxeParser.implementList_return implementList298 =null;

        HaxeParser.classBodyScope_return classBodyScope299 =null;


        Object CLASS294_tree=null;
        Object IDENTIFIER295_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_implementList=new RewriteRuleSubtreeStream(adaptor,"rule implementList");
        RewriteRuleSubtreeStream stream_extending=new RewriteRuleSubtreeStream(adaptor,"rule extending");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:384:17: ( ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) )
            // Haxe.g:384:19: ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope
            {
            // Haxe.g:384:19: ( topLevelAccessAttr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTERN||LA84_0==PRIVATE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:384:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_classDecl4887);
                    topLevelAccessAttr293=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr293.getTree());

                    }
                    break;

            }


            CLASS294=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4890); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS294);


            IDENTIFIER295=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4892); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER295);


            // Haxe.g:384:56: ( typeParam )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:384:56: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4894);
                    typeParam296=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam296.getTree());

                    }
                    break;

            }


            // Haxe.g:384:68: ( extending )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EXTENDS) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:384:68: extending
                    {
                    pushFollow(FOLLOW_extending_in_classDecl4898);
                    extending297=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extending.add(extending297.getTree());

                    }
                    break;

            }


            // Haxe.g:384:79: ( implementList )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==IMPLEMENTS) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:384:79: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_classDecl4901);
                    implementList298=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementList.add(implementList298.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4905);
            classBodyScope299=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope299.getTree());

            // AST REWRITE
            // elements: extending, implementList, classBodyScope, typeParam, topLevelAccessAttr, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 385:21: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope )
            {
                // Haxe.g:385:24: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:385:48: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:385:68: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:385:80: ( extending )?
                if ( stream_extending.hasNext() ) {
                    adaptor.addChild(root_1, stream_extending.nextTree());

                }
                stream_extending.reset();

                // Haxe.g:385:91: ( implementList )?
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
    // Haxe.g:388:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE300=null;
        Token RBRACE302=null;
        HaxeParser.classMember_return classMember301 =null;


        Object LBRACE300_tree=null;
        Object RBRACE302_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:388:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:388:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE300=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4976); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE300);


            // Haxe.g:388:26: ( classMember )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==DYNAMIC||LA88_0==FUNCTION||LA88_0==INLINE||LA88_0==OVERRIDE||LA88_0==PRIVATE||LA88_0==PUBLIC||LA88_0==STATIC||LA88_0==VAR) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Haxe.g:388:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4979);
            	    classMember301=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember301.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            RBRACE302=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4983); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE302);


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
            // 388:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:388:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScope(BLOCK_SCOPE, LBRACE300, RBRACE302)
                , root_1);

                // Haxe.g:388:99: ( classMember )*
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
    // Haxe.g:391:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass303 =null;

        HaxeParser.funcDecl_return funcDecl304 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:391:17: ( varDeclClass | funcDecl )
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // Haxe.g:391:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember5029);
                    varDeclClass303=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass303.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:392:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember5049);
                    funcDecl304=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl304.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:396:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR306=null;
        Token IDENTIFIER307=null;
        Token SEMI311=null;
        HaxeParser.declAttrList_return declAttrList305 =null;

        HaxeParser.propDecl_return propDecl308 =null;

        HaxeParser.typeTag_return typeTag309 =null;

        HaxeParser.varInit_return varInit310 =null;


        Object VAR306_tree=null;
        Object IDENTIFIER307_tree=null;
        Object SEMI311_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:396:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:396:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:396:19: ( declAttrList )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==DYNAMIC||LA90_0==INLINE||LA90_0==OVERRIDE||LA90_0==PRIVATE||LA90_0==PUBLIC||LA90_0==STATIC) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:396:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5091);
                    declAttrList305=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());

                    }
                    break;

            }


            VAR306=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR306);


            IDENTIFIER307=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5096); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER307);


            // Haxe.g:396:48: ( propDecl )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LPAREN) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:396:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5098);
                    propDecl308=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl308.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass5101);
            typeTag309=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag309.getTree());

            // Haxe.g:396:66: ( varInit )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==EQ) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:396:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5103);
                    varInit310=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit310.getTree());

                    }
                    break;

            }


            SEMI311=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI311);


            // AST REWRITE
            // elements: declAttrList, propDecl, varInit, typeTag, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 396:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:396:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Declaration(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:396:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:396:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:396:148: ( varInit )?
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
    // Haxe.g:399:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR312=null;
        Token COMMA314=null;
        Token SEMI316=null;
        HaxeParser.varDeclPartList_return varDeclPartList313 =null;

        HaxeParser.varDeclPartList_return varDeclPartList315 =null;


        Object VAR312_tree=null;
        Object COMMA314_tree=null;
        Object SEMI316_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:399:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:399:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR312=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5175); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5178);
            varDeclPartList313=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList313.getTree());

            // Haxe.g:399:40: ( COMMA ! varDeclPartList )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==COMMA) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // Haxe.g:399:41: COMMA ! varDeclPartList
            	    {
            	    COMMA314=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5181); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5184);
            	    varDeclPartList315=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList315.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            SEMI316=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5188); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:402:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER317=null;
        HaxeParser.propDecl_return propDecl318 =null;

        HaxeParser.typeTag_return typeTag319 =null;

        HaxeParser.varInit_return varInit320 =null;


        Object IDENTIFIER317_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:402:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:402:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER317=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER317);


            // Haxe.g:402:30: ( propDecl )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LPAREN) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Haxe.g:402:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5216);
                    propDecl318=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl318.getTree());

                    }
                    break;

            }


            // Haxe.g:402:40: ( typeTag )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==COLON) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Haxe.g:402:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5219);
                    typeTag319=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag319.getTree());

                    }
                    break;

            }


            // Haxe.g:402:49: ( varInit )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==EQ) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:402:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5222);
                    varInit320=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit320.getTree());

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
            // 402:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:402:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new Declaration(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:402:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:402:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:402:113: ( varInit )?
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
    // Haxe.g:405:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN321=null;
        Token COMMA322=null;
        Token RPAREN323=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN321_tree=null;
        Object COMMA322_tree=null;
        Object RPAREN323_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:405:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:405:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN321=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN321);


            pushFollow(FOLLOW_propAccessor_in_propDecl5277);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA322=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5279); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA322);


            pushFollow(FOLLOW_propAccessor_in_propDecl5283);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN323=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN323);


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
            // 405:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:405:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
    // Haxe.g:408:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set324=null;

        Object set324_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:408:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set324=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set324)
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
    // Haxe.g:415:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ325=null;
        HaxeParser.expr_return expr326 =null;


        Object EQ325_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:415:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:415:19: EQ expr
            {
            EQ325=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ325);


            pushFollow(FOLLOW_expr_in_varInit5446);
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
            // 415:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:415:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
    // Haxe.g:418:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION328=null;
        Token NEW329=null;
        Token FUNCTION332=null;
        Token IDENTIFIER333=null;
        HaxeParser.declAttrList_return declAttrList327 =null;

        HaxeParser.funcDeclPart_return funcDeclPart330 =null;

        HaxeParser.declAttrList_return declAttrList331 =null;

        HaxeParser.typeParam_return typeParam334 =null;

        HaxeParser.funcDeclPart_return funcDeclPart335 =null;


        Object FUNCTION328_tree=null;
        Object NEW329_tree=null;
        Object FUNCTION332_tree=null;
        Object IDENTIFIER333_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:418:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // Haxe.g:418:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:418:19: ( declAttrList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DYNAMIC||LA97_0==INLINE||LA97_0==OVERRIDE||LA97_0==PRIVATE||LA97_0==PUBLIC||LA97_0==STATIC) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:418:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5490);
                            declAttrList327=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList327.getTree());

                            }
                            break;

                    }


                    FUNCTION328=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION328);


                    NEW329=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW329);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5497);
                    funcDeclPart330=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart330.getTree());

                    // AST REWRITE
                    // elements: funcDeclPart, NEW, declAttrList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 419:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:419:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Function(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:419:53: ( declAttrList )?
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
                    // Haxe.g:420:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:420:19: ( declAttrList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DYNAMIC||LA98_0==INLINE||LA98_0==OVERRIDE||LA98_0==PRIVATE||LA98_0==PUBLIC||LA98_0==STATIC) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:420:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5555);
                            declAttrList331=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());

                            }
                            break;

                    }


                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);


                    IDENTIFIER333=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER333);


                    // Haxe.g:420:53: ( typeParam )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==LT) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:420:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5562);
                            typeParam334=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam334.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5565);
                    funcDeclPart335=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart335.getTree());

                    // AST REWRITE
                    // elements: funcDeclPart, typeParam, IDENTIFIER, FUNCTION, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 421:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:421:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new Function(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:421:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:421:87: ( typeParam )?
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
    // Haxe.g:424:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN336=null;
        Token RPAREN338=null;
        Token SEMI341=null;
        HaxeParser.paramList_return paramList337 =null;

        HaxeParser.typeTag_return typeTag339 =null;

        HaxeParser.block_return block340 =null;


        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
        Object SEMI341_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:424:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:424:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5649); if (state.failed) return retval;

            // Haxe.g:424:27: ( paramList )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Haxe.g:424:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5652);
                    paramList337=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList337.getTree());

                    }
                    break;

            }


            RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5655); if (state.failed) return retval;

            // Haxe.g:424:46: ( typeTag )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==COLON) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Haxe.g:424:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5658);
                    typeTag339=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag339.getTree());

                    }
                    break;

            }


            // Haxe.g:424:55: ( block | SEMI !)
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==LBRACE) ) {
                alt103=1;
            }
            else if ( (LA103_0==SEMI) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // Haxe.g:424:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5662);
                    block340=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block340.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:424:64: SEMI !
                    {
                    SEMI341=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5666); if (state.failed) return retval;

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
    // Haxe.g:427:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION343=null;
        Token NEW344=null;
        Token LPAREN345=null;
        Token RPAREN347=null;
        Token SEMI349=null;
        Token FUNCTION351=null;
        Token IDENTIFIER352=null;
        Token LPAREN354=null;
        Token RPAREN356=null;
        Token SEMI358=null;
        Token FUNCTION359=null;
        Token NEW360=null;
        Token LPAREN361=null;
        Token RPAREN363=null;
        Token SEMI365=null;
        Token FUNCTION366=null;
        Token IDENTIFIER367=null;
        Token LPAREN369=null;
        Token RPAREN371=null;
        Token SEMI373=null;
        HaxeParser.declAttrList_return declAttrList342 =null;

        HaxeParser.paramList_return paramList346 =null;

        HaxeParser.typeTag_return typeTag348 =null;

        HaxeParser.declAttrList_return declAttrList350 =null;

        HaxeParser.typeParam_return typeParam353 =null;

        HaxeParser.paramList_return paramList355 =null;

        HaxeParser.typeTag_return typeTag357 =null;

        HaxeParser.paramList_return paramList362 =null;

        HaxeParser.typeTag_return typeTag364 =null;

        HaxeParser.typeParam_return typeParam368 =null;

        HaxeParser.paramList_return paramList370 =null;

        HaxeParser.typeTag_return typeTag372 =null;


        Object FUNCTION343_tree=null;
        Object NEW344_tree=null;
        Object LPAREN345_tree=null;
        Object RPAREN347_tree=null;
        Object SEMI349_tree=null;
        Object FUNCTION351_tree=null;
        Object IDENTIFIER352_tree=null;
        Object LPAREN354_tree=null;
        Object RPAREN356_tree=null;
        Object SEMI358_tree=null;
        Object FUNCTION359_tree=null;
        Object NEW360_tree=null;
        Object LPAREN361_tree=null;
        Object RPAREN363_tree=null;
        Object SEMI365_tree=null;
        Object FUNCTION366_tree=null;
        Object IDENTIFIER367_tree=null;
        Object LPAREN369_tree=null;
        Object RPAREN371_tree=null;
        Object SEMI373_tree=null;
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

            // Haxe.g:428:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt114=4;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // Haxe.g:428:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5703);
                    declAttrList342=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList342.getTree());

                    FUNCTION343=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION343);


                    NEW344=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW344);


                    LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN345);


                    // Haxe.g:428:42: ( paramList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==IDENTIFIER||LA104_0==QUES) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:428:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5711);
                            paramList346=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList346.getTree());

                            }
                            break;

                    }


                    RPAREN347=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN347);


                    // Haxe.g:428:60: ( typeTag )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COLON) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:428:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5716);
                            typeTag348=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag348.getTree());

                            }
                            break;

                    }


                    SEMI349=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5719); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI349);


                    // AST REWRITE
                    // elements: declAttrList, paramList, NEW, typeTag, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 429:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:429:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:429:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:429:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:429:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:429:52: ( declAttrList )?
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
                    // Haxe.g:430:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5760);
                    declAttrList350=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList350.getTree());

                    FUNCTION351=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION351);


                    IDENTIFIER352=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER352);


                    // Haxe.g:430:42: ( typeParam )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LT) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:430:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5766);
                            typeParam353=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam353.getTree());

                            }
                            break;

                    }


                    LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5769); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN354);


                    // Haxe.g:430:60: ( paramList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==IDENTIFIER||LA107_0==QUES) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:430:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5771);
                            paramList355=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList355.getTree());

                            }
                            break;

                    }


                    RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5774); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN356);


                    // Haxe.g:430:78: ( typeTag )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==COLON) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:430:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5776);
                            typeTag357=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag357.getTree());

                            }
                            break;

                    }


                    SEMI358=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI358);


                    // AST REWRITE
                    // elements: typeTag, paramList, IDENTIFIER, FUNCTION, typeParam, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 431:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:431:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:431:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:431:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:431:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:431:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:431:73: ( typeParam )?
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
                    // Haxe.g:432:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION359=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION359);


                    NEW360=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW360);


                    LPAREN361=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN361);


                    // Haxe.g:432:29: ( paramList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==IDENTIFIER||LA109_0==QUES) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:432:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5829);
                            paramList362=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList362.getTree());

                            }
                            break;

                    }


                    RPAREN363=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN363);


                    // Haxe.g:432:47: ( typeTag )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==COLON) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Haxe.g:432:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5834);
                            typeTag364=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag364.getTree());

                            }
                            break;

                    }


                    SEMI365=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI365);


                    // AST REWRITE
                    // elements: FUNCTION, paramList, typeTag, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 433:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:433:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
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

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:434:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION366=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5875); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION366);


                    IDENTIFIER367=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER367);


                    // Haxe.g:434:29: ( typeParam )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==LT) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Haxe.g:434:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5879);
                            typeParam368=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam368.getTree());

                            }
                            break;

                    }


                    LPAREN369=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN369);


                    // Haxe.g:434:47: ( paramList )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==IDENTIFIER||LA112_0==QUES) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Haxe.g:434:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5884);
                            paramList370=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList370.getTree());

                            }
                            break;

                    }


                    RPAREN371=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN371);


                    // Haxe.g:434:65: ( typeTag )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==COLON) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Haxe.g:434:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5889);
                            typeTag372=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag372.getTree());

                            }
                            break;

                    }


                    SEMI373=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI373);


                    // AST REWRITE
                    // elements: typeParam, FUNCTION, IDENTIFIER, paramList, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 435:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:435:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
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

                        // Haxe.g:435:59: ( typeParam )?
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
    // Haxe.g:438:1: interfaceDecl : ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE375=null;
        Token LBRACE379=null;
        Token RBRACE381=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr374 =null;

        HaxeParser.type_return type376 =null;

        HaxeParser.extending_return extending377 =null;

        HaxeParser.implementList_return implementList378 =null;

        HaxeParser.interfaceBody_return interfaceBody380 =null;


        Object INTERFACE375_tree=null;
        Object LBRACE379_tree=null;
        Object RBRACE381_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:439:5: ( ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:439:9: ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:439:9: ( topLevelAccessAttr )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==EXTERN||LA115_0==PRIVATE) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // Haxe.g:439:9: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_interfaceDecl5951);
                    topLevelAccessAttr374=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccessAttr374.getTree());

                    }
                    break;

            }


            INTERFACE375=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE375_tree = 
            (Object)adaptor.create(INTERFACE375)
            ;
            adaptor.addChild(root_0, INTERFACE375_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5956);
            type376=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type376.getTree());

            // Haxe.g:439:44: ( extending )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==EXTENDS) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // Haxe.g:439:44: extending
                    {
                    pushFollow(FOLLOW_extending_in_interfaceDecl5958);
                    extending377=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extending377.getTree());

                    }
                    break;

            }


            // Haxe.g:439:55: ( implementList )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==IMPLEMENTS) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Haxe.g:439:55: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_interfaceDecl5961);
                    implementList378=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementList378.getTree());

                    }
                    break;

            }


            LBRACE379=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5964); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5967);
            interfaceBody380=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody380.getTree());

            RBRACE381=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5969); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:442:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl382 =null;

        HaxeParser.interfaceBody_return interfaceBody383 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl384 =null;

        HaxeParser.interfaceBody_return interfaceBody385 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:443:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt118=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt118=1;
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
                alt118=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt118=3;
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
                    // Haxe.g:443:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5993);
                    varDecl382=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl382.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5995);
                    interfaceBody383=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody383.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:444:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody6005);
                    funcProtoDecl384=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl384.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody6007);
                    interfaceBody385=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody385.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:447:5: 
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
    // Haxe.g:449:1: implementList : implementing ( COMMA implementing )* -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ ) ;
    public final HaxeParser.implementList_return implementList() throws RecognitionException {
        HaxeParser.implementList_return retval = new HaxeParser.implementList_return();
        retval.start = input.LT(1);

        int implementList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA387=null;
        HaxeParser.implementing_return implementing386 =null;

        HaxeParser.implementing_return implementing388 =null;


        Object COMMA387_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implementing=new RewriteRuleSubtreeStream(adaptor,"rule implementing");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:449:17: ( implementing ( COMMA implementing )* -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ ) )
            // Haxe.g:449:19: implementing ( COMMA implementing )*
            {
            pushFollow(FOLLOW_implementing_in_implementList6045);
            implementing386=implementing();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementing.add(implementing386.getTree());

            // Haxe.g:449:32: ( COMMA implementing )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Haxe.g:449:33: COMMA implementing
            	    {
            	    COMMA387=(Token)match(input,COMMA,FOLLOW_COMMA_in_implementList6048); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA387);


            	    pushFollow(FOLLOW_implementing_in_implementList6050);
            	    implementing388=implementing();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_implementing.add(implementing388.getTree());

            	    }
            	    break;

            	default :
            	    break loop119;
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
            // 449:54: -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ )
            {
                // Haxe.g:449:57: ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ )
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
    // Haxe.g:452:1: implementing : IMPLEMENTS ! type ;
    public final HaxeParser.implementing_return implementing() throws RecognitionException {
        HaxeParser.implementing_return retval = new HaxeParser.implementing_return();
        retval.start = input.LT(1);

        int implementing_StartIndex = input.index();

        Object root_0 = null;

        Token IMPLEMENTS389=null;
        HaxeParser.type_return type390 =null;


        Object IMPLEMENTS389_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:452:17: ( IMPLEMENTS ! type )
            // Haxe.g:452:19: IMPLEMENTS ! type
            {
            root_0 = (Object)adaptor.nil();


            IMPLEMENTS389=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementing6097); if (state.failed) return retval;

            pushFollow(FOLLOW_type_in_implementing6100);
            type390=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type390.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:455:1: extending : EXTENDS ^ type ;
    public final HaxeParser.extending_return extending() throws RecognitionException {
        HaxeParser.extending_return retval = new HaxeParser.extending_return();
        retval.start = input.LT(1);

        int extending_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS391=null;
        HaxeParser.type_return type392 =null;


        Object EXTENDS391_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:455:17: ( EXTENDS ^ type )
            // Haxe.g:455:19: EXTENDS ^ type
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS391=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extending6147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS391_tree = 
            new HaxeTree(EXTENDS391) 
            ;
            root_0 = (Object)adaptor.becomeRoot(EXTENDS391_tree, root_0);
            }

            pushFollow(FOLLOW_type_in_extending6153);
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
    // Haxe.g:458:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF393=null;
        Token IDENTIFIER394=null;
        Token EQ395=null;
        HaxeParser.funcType_return funcType396 =null;


        Object TYPEDEF393_tree=null;
        Object IDENTIFIER394_tree=null;
        Object EQ395_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:458:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:458:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF393=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6186); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF393_tree = 
            (Object)adaptor.create(TYPEDEF393)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF393_tree, root_0);
            }

            IDENTIFIER394=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6189); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER394_tree = 
            (Object)adaptor.create(IDENTIFIER394)
            ;
            adaptor.addChild(root_0, IDENTIFIER394_tree);
            }

            EQ395=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6191); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl6194);
            funcType396=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType396.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:461:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT397=null;
        HaxeParser.funcType_return funcType398 =null;


        Object GT397_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:461:17: ( GT ^ funcType )
            // Haxe.g:461:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT397=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6228); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT397_tree = 
            (Object)adaptor.create(GT397)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT397_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6231);
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
    // Haxe.g:464:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE399=null;
        Token RBRACE401=null;
        HaxeParser.objLitElemList_return objLitElemList400 =null;


        Object LBRACE399_tree=null;
        Object RBRACE401_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:464:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:464:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE399=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6265); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6268);
            objLitElemList400=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList400.getTree());

            RBRACE401=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6270); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:467:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER402=null;
        Token COLON403=null;
        HaxeParser.funcType_return funcType404 =null;


        Object IDENTIFIER402_tree=null;
        Object COLON403_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:467:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:467:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER402=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER402_tree = 
            (Object)adaptor.create(IDENTIFIER402)
            ;
            adaptor.addChild(root_0, IDENTIFIER402_tree);
            }

            COLON403=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6300); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6303);
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
    // Haxe.g:470:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA406=null;
        HaxeParser.objLitElem_return objLitElem405 =null;

        HaxeParser.objLitElem_return objLitElem407 =null;


        Object COMMA406_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:470:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:470:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6333);
            objLitElem405=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem405.getTree());

            // Haxe.g:470:30: ( COMMA ! objLitElem )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMMA) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // Haxe.g:470:31: COMMA ! objLitElem
            	    {
            	    COMMA406=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6336); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6339);
            	    objLitElem407=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem407.getTree());

            	    }
            	    break;

            	default :
            	    break loop120;
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
    // Haxe.g:473:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER408=null;
        Token COLON409=null;
        HaxeParser.expr_return expr410 =null;


        Object IDENTIFIER408_tree=null;
        Object COLON409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:473:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:473:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER408_tree = 
            (Object)adaptor.create(IDENTIFIER408)
            ;
            adaptor.addChild(root_0, IDENTIFIER408_tree);
            }

            COLON409=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6377); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6380);
            expr410=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr410.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:477:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"Int\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"Int\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"String\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"String\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"Float\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL411=null;
        Token NULL412=null;
        Token INTLITERAL413=null;
        Token STRINGLITERAL414=null;
        Token CHARLITERAL415=null;
        Token FLOATNUM416=null;

        Object LONGLITERAL411_tree=null;
        Object NULL412_tree=null;
        Object INTLITERAL413_tree=null;
        Object STRINGLITERAL414_tree=null;
        Object CHARLITERAL415_tree=null;
        Object FLOATNUM416_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:478:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"Int\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"Int\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"String\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"String\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"Float\"] )
            int alt121=6;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt121=1;
                }
                break;
            case NULL:
                {
                alt121=2;
                }
                break;
            case INTLITERAL:
                {
                alt121=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt121=4;
                }
                break;
            case CHARLITERAL:
                {
                alt121=5;
                }
                break;
            case FLOATNUM:
                {
                alt121=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;

            }

            switch (alt121) {
                case 1 :
                    // Haxe.g:478:7: LONGLITERAL
                    {
                    LONGLITERAL411=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL411);


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
                    // 478:21: -> LONGLITERAL[$LONGLITERAL, \"Int\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(LONGLITERAL, LONGLITERAL411, "Int")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:479:7: NULL
                    {
                    NULL412=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6432); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL412);


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
                    // 479:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(NULL, NULL412, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:480:7: INTLITERAL
                    {
                    INTLITERAL413=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL413);


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
                    // 480:21: -> INTLITERAL[$INTLITERAL, \"Int\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(INTLITERAL, INTLITERAL413, "Int")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:481:7: STRINGLITERAL
                    {
                    STRINGLITERAL414=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL414);


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
                    // 481:21: -> STRINGLITERAL[$STRINGLITERAL,\"String\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(STRINGLITERAL, STRINGLITERAL414, "String")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:482:7: CHARLITERAL
                    {
                    CHARLITERAL415=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6492); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL415);


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
                    // 482:21: -> CHARLITERAL[$CHARLITERAL, \"String\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(CHARLITERAL, CHARLITERAL415, "String")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:483:7: FLOATNUM
                    {
                    FLOATNUM416=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM416);


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
                    // 483:21: -> FLOATNUM[$FLOATNUM, \"Float\"]
                    {
                        adaptor.addChild(root_0, 
                        new Constant(FLOATNUM, FLOATNUM416, "Float")
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

    // $ANTLR start synpred51_Haxe
    public final void synpred51_Haxe_fragment() throws RecognitionException {
        // Haxe.g:212:45: ( typeParam )
        // Haxe.g:212:45: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred51_Haxe1874);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred51_Haxe

    // $ANTLR start synpred52_Haxe
    public final void synpred52_Haxe_fragment() throws RecognitionException {
        // Haxe.g:215:19: ( LT typeList typeParamPart )
        // Haxe.g:215:19: LT typeList typeParamPart
        {
        match(input,LT,FOLLOW_LT_in_synpred52_Haxe1910); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred52_Haxe1912);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_typeParamPart_in_synpred52_Haxe1914);
        typeParamPart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred52_Haxe

    // $ANTLR start synpred53_Haxe
    public final void synpred53_Haxe_fragment() throws RecognitionException {
        // Haxe.g:219:19: ( LT typeList GTGT )
        // Haxe.g:219:19: LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred53_Haxe2008); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred53_Haxe2010);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GTGT,FOLLOW_GTGT_in_synpred53_Haxe2012); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred53_Haxe

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:233:46: ( statementOrLast ELSE )
        // Haxe.g:233:46: statementOrLast ELSE
        {
        pushFollow(FOLLOW_statementOrLast_in_synpred57_Haxe2233);
        statementOrLast();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred57_Haxe2235); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred77_Haxe
    public final void synpred77_Haxe_fragment() throws RecognitionException {
        // Haxe.g:275:32: ( assignOp ternaryExpr )
        // Haxe.g:275:32: assignOp ternaryExpr
        {
        pushFollow(FOLLOW_assignOp_in_synpred77_Haxe2931);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred77_Haxe2934);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred77_Haxe

    // $ANTLR start synpred78_Haxe
    public final void synpred78_Haxe_fragment() throws RecognitionException {
        // Haxe.g:278:32: ( QUES expr COLON ternaryExpr )
        // Haxe.g:278:32: QUES expr COLON ternaryExpr
        {
        match(input,QUES,FOLLOW_QUES_in_synpred78_Haxe2968); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred78_Haxe2971);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred78_Haxe2973); if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred78_Haxe2976);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred78_Haxe

    // $ANTLR start synpred79_Haxe
    public final void synpred79_Haxe_fragment() throws RecognitionException {
        // Haxe.g:281:33: ( BARBAR logicAndExpr )
        // Haxe.g:281:33: BARBAR logicAndExpr
        {
        match(input,BARBAR,FOLLOW_BARBAR_in_synpred79_Haxe3010); if (state.failed) return ;

        pushFollow(FOLLOW_logicAndExpr_in_synpred79_Haxe3016);
        logicAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred79_Haxe

    // $ANTLR start synpred80_Haxe
    public final void synpred80_Haxe_fragment() throws RecognitionException {
        // Haxe.g:284:28: ( AMPAMP iterExpr )
        // Haxe.g:284:28: AMPAMP iterExpr
        {
        match(input,AMPAMP,FOLLOW_AMPAMP_in_synpred80_Haxe3052); if (state.failed) return ;

        pushFollow(FOLLOW_iterExpr_in_synpred80_Haxe3058);
        iterExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred80_Haxe

    // $ANTLR start synpred81_Haxe
    public final void synpred81_Haxe_fragment() throws RecognitionException {
        // Haxe.g:287:28: ( ELLIPSIS cmpExpr )
        // Haxe.g:287:28: ELLIPSIS cmpExpr
        {
        match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_synpred81_Haxe3111); if (state.failed) return ;

        pushFollow(FOLLOW_cmpExpr_in_synpred81_Haxe3117);
        cmpExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred81_Haxe

    // $ANTLR start synpred87_Haxe
    public final void synpred87_Haxe_fragment() throws RecognitionException {
        // Haxe.g:290:28: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )
        // Haxe.g:290:28: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
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


        pushFollow(FOLLOW_bitExpr_in_synpred87_Haxe3335);
        bitExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_Haxe

    // $ANTLR start synpred90_Haxe
    public final void synpred90_Haxe_fragment() throws RecognitionException {
        // Haxe.g:299:30: ( ( BAR | AMP | CARET ) shiftExpr )
        // Haxe.g:299:30: ( BAR | AMP | CARET ) shiftExpr
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


        pushFollow(FOLLOW_shiftExpr_in_synpred90_Haxe3466);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred90_Haxe

    // $ANTLR start synpred93_Haxe
    public final void synpred93_Haxe_fragment() throws RecognitionException {
        // Haxe.g:305:28: ( ( LTLT | GTGT | GTGTGT ) addExpr )
        // Haxe.g:305:28: ( LTLT | GTGT | GTGTGT ) addExpr
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


        pushFollow(FOLLOW_addExpr_in_synpred93_Haxe3591);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred93_Haxe

    // $ANTLR start synpred95_Haxe
    public final void synpred95_Haxe_fragment() throws RecognitionException {
        // Haxe.g:311:29: ( ( PLUS | SUB ) multExpr )
        // Haxe.g:311:29: ( PLUS | SUB ) multExpr
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


        pushFollow(FOLLOW_multExpr_in_synpred95_Haxe3689);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred95_Haxe

    // $ANTLR start synpred98_Haxe
    public final void synpred98_Haxe_fragment() throws RecognitionException {
        // Haxe.g:316:29: ( ( STAR | SLASH | PERCENT ) unarExpr )
        // Haxe.g:316:29: ( STAR | SLASH | PERCENT ) unarExpr
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


        pushFollow(FOLLOW_unarExpr_in_synpred98_Haxe3820);
        unarExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred98_Haxe

    // $ANTLR start synpred104_Haxe
    public final void synpred104_Haxe_fragment() throws RecognitionException {
        // Haxe.g:328:31: ( PLUSPLUS )
        // Haxe.g:328:31: PLUSPLUS
        {
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred104_Haxe3974); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred104_Haxe

    // $ANTLR start synpred105_Haxe
    public final void synpred105_Haxe_fragment() throws RecognitionException {
        // Haxe.g:328:61: ( SUBSUB )
        // Haxe.g:328:61: SUBSUB
        {
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred105_Haxe3980); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred105_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {
        // Haxe.g:337:49: ( pureCallOrSlice )
        // Haxe.g:337:49: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred111_Haxe4145);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred112_Haxe
    public final void synpred112_Haxe_fragment() throws RecognitionException {
        // Haxe.g:337:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:337:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred112_Haxe4136);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred112_Haxe4138); if (state.failed) return ;

        // Haxe.g:337:32: ( exprList )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==BANG||LA132_0==CAST||LA132_0==CHARLITERAL||LA132_0==FLOATNUM||LA132_0==FUNCTION||LA132_0==IDENTIFIER||LA132_0==INTLITERAL||(LA132_0 >= LBRACE && LA132_0 <= LBRACKET)||(LA132_0 >= LONGLITERAL && LA132_0 <= LPAREN)||(LA132_0 >= NEW && LA132_0 <= NULL)||LA132_0==PLUSPLUS||(LA132_0 >= STRINGLITERAL && LA132_0 <= SUB)||LA132_0==SUBSUB||LA132_0==SUPER||LA132_0==THIS||LA132_0==TILDE||LA132_0==UNTYPED) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // Haxe.g:337:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred112_Haxe4140);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred112_Haxe4143); if (state.failed) return ;

        // Haxe.g:337:49: ( pureCallOrSlice )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==DOT||LA133_0==LBRACKET) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // Haxe.g:337:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred112_Haxe4145);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred112_Haxe

    // $ANTLR start synpred113_Haxe
    public final void synpred113_Haxe_fragment() throws RecognitionException {
        // Haxe.g:339:48: ( pureCallOrSlice )
        // Haxe.g:339:48: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred113_Haxe4204);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred113_Haxe

    // $ANTLR start synpred114_Haxe
    public final void synpred114_Haxe_fragment() throws RecognitionException {
        // Haxe.g:339:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:339:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred114_Haxe4196);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred114_Haxe4198); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred114_Haxe4200);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred114_Haxe4202); if (state.failed) return ;

        // Haxe.g:339:48: ( pureCallOrSlice )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==DOT||LA134_0==LBRACKET) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // Haxe.g:339:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred114_Haxe4204);
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
        // Haxe.g:341:19: ( value pureCallOrSlice )
        // Haxe.g:341:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred115_Haxe4255);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred115_Haxe4258);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred115_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:345:43: ( pureCallOrSlice )
        // Haxe.g:345:43: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred117_Haxe4311);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred124_Haxe
    public final void synpred124_Haxe_fragment() throws RecognitionException {
        // Haxe.g:360:9: ( LPAREN expr RPAREN '?' expr COLON expr )
        // Haxe.g:360:9: LPAREN expr RPAREN '?' expr COLON expr
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred124_Haxe4516); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred124_Haxe4518);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred124_Haxe4520); if (state.failed) return ;

        match(input,QUES,FOLLOW_QUES_in_synpred124_Haxe4522); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred124_Haxe4524);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred124_Haxe4526); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred124_Haxe4528);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_Haxe

    // $ANTLR start synpred125_Haxe
    public final void synpred125_Haxe_fragment() throws RecognitionException {
        // Haxe.g:361:9: ( LPAREN expr RPAREN )
        // Haxe.g:361:9: LPAREN expr RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred125_Haxe4550); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred125_Haxe4553);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred125_Haxe4555); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_Haxe

    // $ANTLR start synpred126_Haxe
    public final void synpred126_Haxe_fragment() throws RecognitionException {
        // Haxe.g:363:12: ( typeParam )
        // Haxe.g:363:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred126_Haxe4573);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_Haxe

    // Delegated rules

    public final boolean synpred105_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred105_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred87_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred98_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred78_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred93_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred125_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA89 dfa89 = new DFA89(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA114 dfa114 = new DFA114(this);
    static final String DFA89_eotS =
        "\4\uffff";
    static final String DFA89_eofS =
        "\4\uffff";
    static final String DFA89_minS =
        "\2\46\2\uffff";
    static final String DFA89_maxS =
        "\2\u009e\2\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA89_specialS =
        "\4\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\1\21\uffff\1\3\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\27\uffff\1\2",
            "\1\1\21\uffff\1\3\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\27\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "391:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA100_eotS =
        "\5\uffff";
    static final String DFA100_eofS =
        "\5\uffff";
    static final String DFA100_minS =
        "\2\46\1\104\2\uffff";
    static final String DFA100_maxS =
        "\2\u0086\1\137\2\uffff";
    static final String DFA100_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA100_specialS =
        "\5\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\1\21\uffff\1\2\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\21\uffff\1\2\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\32\uffff\1\3",
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
            return "418:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA114_eotS =
        "\10\uffff";
    static final String DFA114_eofS =
        "\10\uffff";
    static final String DFA114_minS =
        "\2\46\2\104\4\uffff";
    static final String DFA114_maxS =
        "\2\u0086\2\137\4\uffff";
    static final String DFA114_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA114_specialS =
        "\10\uffff}>";
    static final String[] DFA114_transitionS = {
            "\1\1\21\uffff\1\2\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\21\uffff\1\3\22\uffff\1\1\26\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\5\32\uffff\1\4",
            "\1\7\32\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
    static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
    static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
    static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
    static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
    static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
    static final short[][] DFA114_transition;

    static {
        int numStates = DFA114_transitionS.length;
        DFA114_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
        }
    }

    class DFA114 extends DFA {

        public DFA114(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 114;
            this.eot = DFA114_eot;
            this.eof = DFA114_eof;
            this.min = DFA114_min;
            this.max = DFA114_max;
            this.accept = DFA114_accept;
            this.special = DFA114_special;
            this.transition = DFA114_transition;
        }
        public String getDescription() {
            return "427:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module191 = new BitSet(new long[]{0x0002080004000002L,0x0080000000002200L,0x0000000020800000L});
    public static final BitSet FOLLOW_imports_in_module194 = new BitSet(new long[]{0x0002080004000002L,0x0080000000002200L,0x0000000020800000L});
    public static final BitSet FOLLOW_topLevelDecl_in_module197 = new BitSet(new long[]{0x0002080004000002L,0x0080000000002000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IMPORT_in_imports250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_filepath_in_imports253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_imports255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_imports276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_filepath_in_imports279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_imports281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_filepath_in_myPackage316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_myPackage318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath373 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_DOT_in_filepath378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath382 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta418 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_metaName_in_meta420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_meta423 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_meta425 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_meta428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName456 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_metaName_in_metaName458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags476 = new BitSet(new long[]{0x0002000000000002L,0x0080000010000000L});
    public static final BitSet FOLLOW_topLevelAccess_in_topLevelAccessAttr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList774 = new BitSet(new long[]{0x0000004000000002L,0x0480000400000800L,0x0000000000000040L});
    public static final BitSet FOLLOW_param_in_paramList819 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList822 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static final BitSet FOLLOW_param_in_paramList824 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_QUES_in_param874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param877 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_param879 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_param882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_id1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1451 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcLit1454 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1457 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_funcLit1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_funcType_in_typeTag1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1553 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeList1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1581 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeList1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_type_in_funcType1628 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1666 = new BitSet(new long[]{0x0400000000000000L,0x1000000000000010L,0x0000000040000000L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1668 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1753 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000040000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1764 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1814 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1819 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_filepath_in_type1864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_anonType_in_type1869 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeParam_in_type1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeParam1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeParamPart_in_typeParam1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeParam1950 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2010 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParamPart2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2046 = new BitSet(new long[]{0x4000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeParam_in_typeParamPart2048 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParamPart2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint2102 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint2104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint2108 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statement2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statement2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementLast2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statementLast2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2230 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statementOrLast_in_statementLast2233 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ELSE_in_statementLast2235 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_statementLast2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statementLast2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2266 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_statementLast2269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statementLast2271 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_iterExpr_in_statementLast2274 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2276 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_statementLast2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2305 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_statementLast2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statementLast2327 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_statementLast2333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statementLast2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_statementLast2367 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statementLast2369 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statementLast2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2396 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_statementLast2399 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACE_in_statementLast2404 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statementLast2407 = new BitSet(new long[]{0x0000000200200000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statementLast2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statementLast2431 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB01L});
    public static final BitSet FOLLOW_expr_in_statementLast2437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statementLast2461 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_statementLast2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statementLast2487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statementOrLast2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statementOrLast2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2568 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_parExpression2571 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2609 = new BitSet(new long[]{0x01C2000886410200L,0x50800201801B4030L,0x000000025025EB00L});
    public static final BitSet FOLLOW_blockStmt_in_block2612 = new BitSet(new long[]{0x01C2000886410200L,0x50800201801B4030L,0x000000025025EB00L});
    public static final BitSet FOLLOW_RBRACE_in_block2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2706 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2709 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2711 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_caseStmt2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2734 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2737 = new BitSet(new long[]{0x01C0000882410200L,0x40000201801B4030L,0x000000021025EB00L});
    public static final BitSet FOLLOW_statement_in_caseStmt2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2781 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static final BitSet FOLLOW_param_in_catchStmt2784 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_block_in_catchStmt2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2827 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2830 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_exprList2833 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2875 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_assignExpr_in_expr2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2928 = new BitSet(new long[]{0xA000100000104082L,0x0000014001000000L,0x0000000000000428L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2931 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2965 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2968 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2971 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2973 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3007 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3010 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3016 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3050 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3052 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3058 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3108 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr3111 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3156 = new BitSet(new long[]{0x0C00200000000402L,0x0000000000600000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3183 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3212 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3241 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3270 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3299 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3328 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3335 = new BitSet(new long[]{0x0C00200000000402L,0x0000000000600000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3374 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3401 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3430 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3459 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3466 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3499 = new BitSet(new long[]{0x5000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3526 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3555 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3584 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3591 = new BitSet(new long[]{0x5000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3626 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3653 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_SUB_in_addExpr3682 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3689 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3728 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_STAR_in_multExpr3755 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3784 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3813 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3820 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3868 = new BitSet(new long[]{0x0140000002400000L,0x00000001801B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3887 = new BitSet(new long[]{0x0140000002400000L,0x00000001801B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3906 = new BitSet(new long[]{0x0140000002400000L,0x00000001801B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3925 = new BitSet(new long[]{0x0140000002400000L,0x00000001801B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3944 = new BitSet(new long[]{0x0140000002400000L,0x00000001801B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3971 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr4022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_type_in_prefixExpr4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4030 = new BitSet(new long[]{0x0140000002400200L,0x80000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4033 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4060 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4063 = new BitSet(new long[]{0x0000000010000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4069 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4138 = new BitSet(new long[]{0x0140000002400200L,0x80000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4140 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4143 = new BitSet(new long[]{0x0000001000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4198 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4200 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4202 = new BitSet(new long[]{0x0000001000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4255 = new BitSet(new long[]{0x0000001000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4304 = new BitSet(new long[]{0x0140000002400200L,0x20000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4306 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4309 = new BitSet(new long[]{0x0000001000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4365 = new BitSet(new long[]{0x0140000002000000L,0x00000001001B4010L,0x000000000000A100L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayObj4400 = new BitSet(new long[]{0x0140000002400200L,0x20000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_exprList_in_arrayObj4402 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayObj4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayObj_in_value4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4516 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_value4518 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value4520 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_QUES_in_value4522 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_value4524 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_value4526 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_value4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4550 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_value4553 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeParam_in_value4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_enumDecl4689 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000210000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4748 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000010L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4751 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000010L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4801 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4804 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_classDecl4887 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4892 = new BitSet(new long[]{0x0001000000000000L,0x0000000000210080L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4894 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_extending_in_classDecl4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_implementList_in_classDecl4901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4976 = new BitSet(new long[]{0x0100004000000000L,0x1480000400000800L,0x0000000040000040L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4979 = new BitSet(new long[]{0x0100004000000000L,0x1480000400000800L,0x0000000040000040L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5096 = new BitSet(new long[]{0x0000000008000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5098 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5101 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5178 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5184 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5214 = new BitSet(new long[]{0x0000100008000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5216 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5219 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5273 = new BitSet(new long[]{0x0000004200000000L,0x0000000140000010L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5277 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5279 = new BitSet(new long[]{0x0000004200000000L,0x0000000140000010L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5283 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5444 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_varInit5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5490 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5493 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5555 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5649 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5652 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5655 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5703 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5705 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5709 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5711 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5714 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5760 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5769 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5771 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5774 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5827 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5829 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5832 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5882 = new BitSet(new long[]{0x0000000000000000L,0x8800000000000010L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5884 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5887 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_interfaceDecl5951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5956 = new BitSet(new long[]{0x0001000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_extending_in_interfaceDecl5958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010080L});
    public static final BitSet FOLLOW_implementList_in_interfaceDecl5961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5964 = new BitSet(new long[]{0x0100004000000000L,0x1480000400000800L,0x0000000040000040L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5967 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5993 = new BitSet(new long[]{0x0100004000000000L,0x0480000400000800L,0x0000000040000040L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody6005 = new BitSet(new long[]{0x0100004000000000L,0x0480000400000800L,0x0000000040000040L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implementing_in_implementList6045 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_implementList6048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_implementing_in_implementList6050 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_implementing6097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_type_in_implementing6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extending6147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_type_in_extending6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6189 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6268 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6298 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6333 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6339 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6375 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6377 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_objLitElem6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred51_Haxe1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred52_Haxe1910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_synpred52_Haxe1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_typeParamPart_in_synpred52_Haxe1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred53_Haxe2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010010L});
    public static final BitSet FOLLOW_typeList_in_synpred53_Haxe2010 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred53_Haxe2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementOrLast_in_synpred57_Haxe2233 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred57_Haxe2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_synpred77_Haxe2931 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred77_Haxe2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_synpred78_Haxe2968 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred78_Haxe2971 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred78_Haxe2973 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred78_Haxe2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_synpred79_Haxe3010 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_logicAndExpr_in_synpred79_Haxe3016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_synpred80_Haxe3052 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_iterExpr_in_synpred80_Haxe3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_synpred81_Haxe3111 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_cmpExpr_in_synpred81_Haxe3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred87_Haxe3159 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_bitExpr_in_synpred87_Haxe3335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred90_Haxe3377 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred90_Haxe3466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred93_Haxe3502 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_addExpr_in_synpred93_Haxe3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred95_Haxe3629 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_multExpr_in_synpred95_Haxe3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred98_Haxe3731 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000000004AB00L});
    public static final BitSet FOLLOW_unarExpr_in_synpred98_Haxe3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred104_Haxe3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred105_Haxe3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred111_Haxe4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred112_Haxe4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred112_Haxe4138 = new BitSet(new long[]{0x0140000002400200L,0x80000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_exprList_in_synpred112_Haxe4140 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred112_Haxe4143 = new BitSet(new long[]{0x0000001000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred112_Haxe4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred113_Haxe4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred114_Haxe4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred114_Haxe4198 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred114_Haxe4200 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred114_Haxe4202 = new BitSet(new long[]{0x0000001000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred114_Haxe4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred115_Haxe4255 = new BitSet(new long[]{0x0000001000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred115_Haxe4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred117_Haxe4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred124_Haxe4516 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred124_Haxe4518 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred124_Haxe4520 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_QUES_in_synpred124_Haxe4522 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred124_Haxe4524 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred124_Haxe4526 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred124_Haxe4528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred125_Haxe4550 = new BitSet(new long[]{0x0140000002400200L,0x00000201801B4010L,0x000000001004AB00L});
    public static final BitSet FOLLOW_expr_in_synpred125_Haxe4553 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred125_Haxe4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred126_Haxe4573 = new BitSet(new long[]{0x0000000000000002L});

}