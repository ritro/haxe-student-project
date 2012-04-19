// $ANTLR 3.4 Haxe.g 2012-04-02 19:52:19

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
import haxe.imp.parser.antlr.tree.specific.MethodCallNode;
import haxe.imp.parser.antlr.tree.specific.NewNode;
import haxe.imp.parser.antlr.tree.specific.SliceNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.ReturnNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclarationNode;
import haxe.imp.parser.antlr.tree.specific.VarUsageNode;
import haxe.imp.parser.antlr.tree.specific.ConstantNode;
import haxe.imp.parser.antlr.tree.specific.ArrayNode;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CALL_OR_SLICE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPLEMENT_LIST", "IMPORT", "IN", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRING", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_CONSTRAIN", "TYPE_PARAM", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
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
    public static final int CALL_OR_SLICE=19;
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
    public static final int DIGIT=35;
    public static final int DO=36;
    public static final int DOT=37;
    public static final int DOUBLE=38;
    public static final int DYNAMIC=39;
    public static final int ELLIPSIS=40;
    public static final int ELSE=41;
    public static final int ELSE_TOKEN=42;
    public static final int ENDIF_TOKEN=43;
    public static final int ENUM=44;
    public static final int EQ=45;
    public static final int EQEQ=46;
    public static final int ESC_SEQ=47;
    public static final int EXPONENT=48;
    public static final int EXTENDS=49;
    public static final int EXTERN=50;
    public static final int EscapeSequence=51;
    public static final int FALSE=52;
    public static final int FINAL=53;
    public static final int FINALLY=54;
    public static final int FLOAT=55;
    public static final int FLOATNUM=56;
    public static final int FOR=57;
    public static final int FUNCTION=58;
    public static final int GOTO=59;
    public static final int GT=60;
    public static final int GTEQ=61;
    public static final int GTGT=62;
    public static final int GTGTEQ=63;
    public static final int GTGTGT=64;
    public static final int GTGTGTEQ=65;
    public static final int HEX_DIGIT=66;
    public static final int HexDigit=67;
    public static final int HexPrefix=68;
    public static final int IDENT=69;
    public static final int IDENTIFIER=70;
    public static final int IF=71;
    public static final int IF_TOKEN=72;
    public static final int IMPLEMENTS=73;
    public static final int IMPLEMENT_LIST=74;
    public static final int IMPORT=75;
    public static final int IN=76;
    public static final int INLINE=77;
    public static final int INSTANCEOF=78;
    public static final int INT=79;
    public static final int INTERFACE=80;
    public static final int INTLITERAL=81;
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
    public static final int STRING=139;
    public static final int STRINGLITERAL=140;
    public static final int SUB=141;
    public static final int SUBEQ=142;
    public static final int SUBSUB=143;
    public static final int SUFFIX_EXPR=144;
    public static final int SUPER=145;
    public static final int SWITCH=146;
    public static final int THIS=147;
    public static final int THROW=148;
    public static final int THROWS=149;
    public static final int TILDE=150;
    public static final int TRANSIENT=151;
    public static final int TRUE=152;
    public static final int TRY=153;
    public static final int TS=154;
    public static final int TYPEDEF=155;
    public static final int TYPE_CONSTRAIN=156;
    public static final int TYPE_PARAM=157;
    public static final int TYPE_TAG=158;
    public static final int UNICODE_ESC=159;
    public static final int UNTYPED=160;
    public static final int USING=161;
    public static final int VAR=162;
    public static final int VAR_INIT=163;
    public static final int VOID=164;
    public static final int VOLATILE=165;
    public static final int WHILE=166;
    public static final int WS=167;

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
            // elements: myPackage, topLevelDecl, imports
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
    // Haxe.g:102:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
    public final HaxeParser.metaName_return metaName() throws RecognitionException {
        HaxeParser.metaName_return retval = new HaxeParser.metaName_return();
        retval.start = input.LT(1);

        int metaName_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER18=null;
        Token COLON20=null;
        HaxeParser.primitiveType_return primitiveType19 =null;

        HaxeParser.metaName_return metaName21 =null;


        Object IDENTIFIER18_tree=null;
        Object COLON20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

            // Haxe.g:103:5: ( IDENTIFIER | primitiveType | COLON metaName )
            int alt8=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt8=1;
                }
                break;
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case INT:
            case STRING:
            case VOID:
                {
                alt8=2;
                }
                break;
            case COLON:
                {
                alt8=3;
                }
                break;
            default:
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
                    // Haxe.g:104:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_metaName455);
                    primitiveType19=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType19.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:106:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_metaName464); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON20_tree = 
                    (Object)adaptor.create(COLON20)
                    ;
                    adaptor.addChild(root_0, COLON20_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName466);
                    metaName21=metaName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName21.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:109:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
    public final HaxeParser.typeDeclFlags_return typeDeclFlags() throws RecognitionException {
        HaxeParser.typeDeclFlags_return retval = new HaxeParser.typeDeclFlags_return();
        retval.start = input.LT(1);

        int typeDeclFlags_StartIndex = input.index();

        Object root_0 = null;

        Token set23=null;
        HaxeParser.meta_return meta22 =null;


        Object set23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

            // Haxe.g:110:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:110:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:110:7: ( meta )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MONKEYS_AT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Haxe.g:110:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags484);
            	    meta22=meta();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, meta22.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // Haxe.g:110:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:116:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:116:17: ( PRIVATE | EXTERN )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:120:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:120:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set25=(Token)input.LT(1);

            if ( input.LA(1)==DYNAMIC||input.LA(1)==INLINE||input.LA(1)==OVERRIDE||input.LA(1)==PRIVATE||input.LA(1)==PUBLIC||input.LA(1)==STATIC ) {
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
    // Haxe.g:128:1: topLevelAccessAttr : topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) ;
    public final HaxeParser.topLevelAccessAttr_return topLevelAccessAttr() throws RecognitionException {
        HaxeParser.topLevelAccessAttr_return retval = new HaxeParser.topLevelAccessAttr_return();
        retval.start = input.LT(1);

        int topLevelAccessAttr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevelAccess_return topLevelAccess26 =null;


        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:129:17: ( topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) )
            // Haxe.g:129:19: topLevelAccess
            {
            pushFollow(FOLLOW_topLevelAccess_in_topLevelAccessAttr742);
            topLevelAccess26=topLevelAccess();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess26.getTree());

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
            // 129:34: -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
            {
                // Haxe.g:129:37: ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
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
    // Haxe.g:132:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr27 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:132:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:132:19: ( declAttr )+
            {
            // Haxe.g:132:19: ( declAttr )+
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
            	    // Haxe.g:132:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList782);
            	    declAttr27=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr27.getTree());

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
            // 132:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:132:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:135:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
    public final HaxeParser.paramList_return paramList() throws RecognitionException {
        HaxeParser.paramList_return retval = new HaxeParser.paramList_return();
        retval.start = input.LT(1);

        int paramList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA29=null;
        HaxeParser.param_return param28 =null;

        HaxeParser.param_return param30 =null;


        Object COMMA29_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Haxe.g:135:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:135:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList827);
            param28=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param28.getTree());

            // Haxe.g:135:25: ( COMMA param )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:135:26: COMMA param
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList830); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);


            	    pushFollow(FOLLOW_param_in_paramList832);
            	    param30=param();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_param.add(param30.getTree());

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
            // 135:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:135:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:138:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
    public final HaxeParser.param_return param() throws RecognitionException {
        HaxeParser.param_return retval = new HaxeParser.param_return();
        retval.start = input.LT(1);

        int param_StartIndex = input.index();

        Object root_0 = null;

        Token QUES31=null;
        Token IDENTIFIER32=null;
        HaxeParser.typeTag_return typeTag33 =null;

        HaxeParser.varInit_return varInit34 =null;


        Object QUES31_tree=null;
        Object IDENTIFIER32_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:138:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:138:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:138:19: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:138:19: QUES
                    {
                    QUES31=(Token)match(input,QUES,FOLLOW_QUES_in_param882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES31);


                    }
                    break;

            }


            IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER32);


            // Haxe.g:138:36: ( typeTag )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:138:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param887);
                    typeTag33=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag33.getTree());

                    }
                    break;

            }


            // Haxe.g:138:45: ( varInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:138:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param890);
                    varInit34=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit34.getTree());

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
            // 138:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:138:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER32)
                , root_1);

                // Haxe.g:138:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:138:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:138:114: ( QUES )?
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
    // Haxe.g:141:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER35=null;

        Object IDENTIFIER35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:141:17: ( IDENTIFIER )
            // Haxe.g:141:19: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER35=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier940); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER35_tree = 
            new VarUsageNode(IDENTIFIER35) 
            ;
            adaptor.addChild(root_0, IDENTIFIER35_tree);
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
    // Haxe.g:144:1: id : ( identifier | THIS | SUPER );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);

        int id_StartIndex = input.index();

        Object root_0 = null;

        Token THIS37=null;
        Token SUPER38=null;
        HaxeParser.identifier_return identifier36 =null;


        Object THIS37_tree=null;
        Object SUPER38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Haxe.g:144:17: ( identifier | THIS | SUPER )
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
                    // Haxe.g:144:19: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_id997);
                    identifier36=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier36.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:145:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS37=(Token)match(input,THIS,FOLLOW_THIS_in_id1017); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS37_tree = 
                    new VarUsageNode(THIS37) 
                    ;
                    adaptor.addChild(root_0, THIS37_tree);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:146:19: SUPER
                    {
                    root_0 = (Object)adaptor.nil();


                    SUPER38=(Token)match(input,SUPER,FOLLOW_SUPER_in_id1040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER38_tree = 
                    new VarUsageNode(SUPER38) 
                    ;
                    adaptor.addChild(root_0, SUPER38_tree);
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
    // Haxe.g:149:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        Object root_0 = null;

        Token EQ39=null;
        Token PLUSEQ40=null;
        Token SUBEQ41=null;
        Token STAREQ42=null;
        Token SLASHEQ43=null;
        Token PERCENTEQ44=null;
        Token AMPEQ45=null;
        Token BAREQ46=null;
        Token CARETEQ47=null;
        Token LTLTEQ48=null;
        Token GTGTEQ49=null;
        Token GTGTGTEQ50=null;

        Object EQ39_tree=null;
        Object PLUSEQ40_tree=null;
        Object SUBEQ41_tree=null;
        Object STAREQ42_tree=null;
        Object SLASHEQ43_tree=null;
        Object PERCENTEQ44_tree=null;
        Object AMPEQ45_tree=null;
        Object BAREQ46_tree=null;
        Object CARETEQ47_tree=null;
        Object LTLTEQ48_tree=null;
        Object GTGTEQ49_tree=null;
        Object GTGTGTEQ50_tree=null;
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

            // Haxe.g:149:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:149:19: EQ
                    {
                    EQ39=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ39);


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
                    // 149:28: -> EQ
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
                    // Haxe.g:150:19: PLUSEQ
                    {
                    PLUSEQ40=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1108); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ40);


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
                    // 150:28: -> PLUSEQ
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
                    // Haxe.g:151:19: SUBEQ
                    {
                    SUBEQ41=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ41);


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
                    // 151:28: -> SUBEQ
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
                    // Haxe.g:152:19: STAREQ
                    {
                    STAREQ42=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAREQ.add(STAREQ42);


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
                    // 152:28: -> STAREQ
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
                    // Haxe.g:153:19: SLASHEQ
                    {
                    SLASHEQ43=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ43);


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
                    // 153:28: -> SLASHEQ
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
                    // Haxe.g:154:19: PERCENTEQ
                    {
                    PERCENTEQ44=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ44);


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
                    // 154:29: -> PERCENTEQ
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
                    // Haxe.g:155:19: AMPEQ
                    {
                    AMPEQ45=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1251); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ45);


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
                    // 155:28: -> AMPEQ
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
                    // Haxe.g:156:19: BAREQ
                    {
                    BAREQ46=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1281); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAREQ.add(BAREQ46);


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
                    // 156:28: -> BAREQ
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
                    // Haxe.g:157:19: CARETEQ
                    {
                    CARETEQ47=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CARETEQ.add(CARETEQ47);


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
                    // 157:28: -> CARETEQ
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
                    // Haxe.g:158:19: LTLTEQ
                    {
                    LTLTEQ48=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LTLTEQ.add(LTLTEQ48);


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
                    // 158:28: -> LTLTEQ
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
                    // Haxe.g:159:19: GTGTEQ
                    {
                    GTGTEQ49=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTEQ.add(GTGTEQ49);


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
                    // 159:28: -> GTGTEQ
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
                    // Haxe.g:160:19: GTGTGTEQ
                    {
                    GTGTGTEQ50=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGTEQ.add(GTGTGTEQ50);


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
                    // 160:28: -> GTGTGTEQ
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
    // Haxe.g:163:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);

        int funcLit_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION51=null;
        Token LPAREN52=null;
        Token RPAREN54=null;
        HaxeParser.paramList_return paramList53 =null;

        HaxeParser.typeTag_return typeTag55 =null;

        HaxeParser.block_return block56 =null;


        Object FUNCTION51_tree=null;
        Object LPAREN52_tree=null;
        Object RPAREN54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Haxe.g:163:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:163:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION51=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1453); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION51_tree = 
            new FunctionNode(FUNCTION51) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION51_tree, root_0);
            }

            LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1459); if (state.failed) return retval;

            // Haxe.g:163:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:163:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1462);
                    paramList53=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList53.getTree());

                    }
                    break;

            }


            RPAREN54=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1465); if (state.failed) return retval;

            // Haxe.g:163:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:163:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1468);
                    typeTag55=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag55.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1471);
            block56=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block56.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:191:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON57=null;
        HaxeParser.funcType_return funcType58 =null;


        Object COLON57_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Haxe.g:191:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:191:19: COLON funcType
            {
            COLON57=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON57);


            pushFollow(FOLLOW_funcType_in_typeTag1517);
            funcType58=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType58.getTree());

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
            // 191:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:191:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
    // Haxe.g:194:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA60=null;
        Token COMMA63=null;
        HaxeParser.funcType_return funcType59 =null;

        HaxeParser.typeList_return typeList61 =null;

        HaxeParser.typeConstraint_return typeConstraint62 =null;

        HaxeParser.typeList_return typeList64 =null;


        Object COMMA60_tree=null;
        Object COMMA63_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:194:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOLEAN||LA22_0==DYNAMIC||LA22_0==FLOAT||LA22_0==INT||LA22_0==LBRACE||LA22_0==STRING||LA22_0==VOID) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENTIFIER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==COMMA||LA22_2==DOT||LA22_2==GT||LA22_2==GTGT||LA22_2==GTGTGT||LA22_2==LT||LA22_2==MINUS_BIGGER||LA22_2==RPAREN) ) {
                    alt22=1;
                }
                else if ( (LA22_2==COLON) ) {
                    alt22=2;
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
                    // Haxe.g:194:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1561);
                    funcType59=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType59.getTree());

                    // Haxe.g:194:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:194:29: COMMA ! typeList
                            {
                            COMMA60=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1564); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1567);
                            typeList61=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList61.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:195:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1589);
                    typeConstraint62=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint62.getTree());

                    // Haxe.g:195:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:195:35: COMMA ! typeList
                            {
                            COMMA63=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1592); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1595);
                            typeList64=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList64.getTree());

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
    // Haxe.g:198:1: funcType : type ( MINUS_BIGGER ! type )* ;
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER66=null;
        HaxeParser.type_return type65 =null;

        HaxeParser.type_return type67 =null;


        Object MINUS_BIGGER66_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:198:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:198:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1630);
            type65=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type65.getTree());

            // Haxe.g:198:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:198:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER66=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1633); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1636);
            	    type67=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type67.getTree());

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
    // Haxe.g:201:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE68=null;
        Token RBRACE70=null;
        HaxeParser.anonTypePart_return anonTypePart69 =null;


        Object LBRACE68_tree=null;
        Object RBRACE70_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_anonTypePart=new RewriteRuleSubtreeStream(adaptor,"rule anonTypePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:201:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) )
            // Haxe.g:201:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE68=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE68);


            // Haxe.g:201:26: ( anonTypePart )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GT||LA24_0==IDENTIFIER||LA24_0==VAR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:201:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1676);
                    anonTypePart69=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart69.getTree());

                    }
                    break;

            }


            RBRACE70=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE70);


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
            // 201:47: -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
            {
                // Haxe.g:201:50: ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "AnonType")
                , root_1);

                // Haxe.g:201:83: ( anonTypePart )?
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
    // Haxe.g:204:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
    public final HaxeParser.anonTypePart_return anonTypePart() throws RecognitionException {
        HaxeParser.anonTypePart_return retval = new HaxeParser.anonTypePart_return();
        retval.start = input.LT(1);

        int anonTypePart_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA74=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList71 =null;

        HaxeParser.varDecl_return varDecl72 =null;

        HaxeParser.typeExtend_return typeExtend73 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList75 =null;

        HaxeParser.varDecl_return varDecl76 =null;


        Object COMMA74_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:204:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
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
                    // Haxe.g:204:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1720);
                    anonTypeFieldList71=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList71.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:205:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:205:19: ( varDecl )+
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
                    	    // Haxe.g:205:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1740);
                    	    varDecl72=varDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl72.getTree());

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
                    // Haxe.g:206:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1761);
                    typeExtend73=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend73.getTree());

                    COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1763); if (state.failed) return retval;

                    // Haxe.g:206:37: ( anonTypeFieldList | ( varDecl )+ )?
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
                            // Haxe.g:206:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1768);
                            anonTypeFieldList75=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList75.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:206:59: ( varDecl )+
                            {
                            // Haxe.g:206:59: ( varDecl )+
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
                            	    // Haxe.g:206:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1772);
                            	    varDecl76=varDecl();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl76.getTree());

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
    // Haxe.g:209:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA78=null;
        HaxeParser.anonTypeField_return anonTypeField77 =null;

        HaxeParser.anonTypeField_return anonTypeField79 =null;


        Object COMMA78_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_anonTypeField=new RewriteRuleSubtreeStream(adaptor,"rule anonTypeField");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:210:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:210:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1822);
            anonTypeField77=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField77.getTree());

            // Haxe.g:210:33: ( COMMA anonTypeField )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:210:34: COMMA anonTypeField
            	    {
            	    COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1825); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1827);
            	    anonTypeField79=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField79.getTree());

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
            // 210:56: -> ( anonTypeField )+
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


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // Haxe.g:213:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set80=null;

        Object set80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:213:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set80=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DYNAMIC||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set80)
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
    // Haxe.g:216:1: type : ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? ;
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.primitiveType_return primitiveType81 =null;

        HaxeParser.filepath_return filepath82 =null;

        HaxeParser.anonType_return anonType83 =null;

        HaxeParser.typeParam_return typeParam84 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:216:17: ( ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:216:19: ( primitiveType ^| filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:216:19: ( primitiveType ^| filepath ^| anonType ^)
            int alt30=3;
            switch ( input.LA(1) ) {
            case BOOLEAN:
            case DYNAMIC:
            case FLOAT:
            case INT:
            case STRING:
            case VOID:
                {
                alt30=1;
                }
                break;
            case IDENTIFIER:
                {
                alt30=2;
                }
                break;
            case LBRACE:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // Haxe.g:216:20: primitiveType ^
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1922);
                    primitiveType81=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType81.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:216:37: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1927);
                    filepath82=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath82.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // Haxe.g:216:49: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1932);
                    anonType83=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType83.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:216:61: ( typeParam )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LT) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred58_Haxe()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // Haxe.g:216:61: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1937);
                    typeParam84=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam84.getTree());

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
    // Haxe.g:219:1: typeParam : ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT85=null;
        Token LT88=null;
        Token GT90=null;
        HaxeParser.typeList_return typeList86 =null;

        HaxeParser.typeParamPart_return typeParamPart87 =null;

        HaxeParser.typeList_return typeList89 =null;


        Object LT85_tree=null;
        Object LT88_tree=null;
        Object GT90_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_typeParamPart=new RewriteRuleSubtreeStream(adaptor,"rule typeParamPart");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:219:17: ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred59_Haxe()) ) {
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
                    // Haxe.g:219:19: LT typeList typeParamPart
                    {
                    LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1973); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT85);


                    pushFollow(FOLLOW_typeList_in_typeParam1975);
                    typeList86=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList86.getTree());

                    pushFollow(FOLLOW_typeParamPart_in_typeParam1977);
                    typeParamPart87=typeParamPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamPart.add(typeParamPart87.getTree());

                    // AST REWRITE
                    // elements: typeParamPart, typeList
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
                    LT88=(Token)match(input,LT,FOLLOW_LT_in_typeParam2011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT88);


                    pushFollow(FOLLOW_typeList_in_typeParam2013);
                    typeList89=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList89.getTree());

                    GT90=(Token)match(input,GT,FOLLOW_GT_in_typeParam2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(GT90);


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
            if ( state.backtracking>0 ) { memoize(input, 26, typeParam_StartIndex); }

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

        Token LT91=null;
        Token GTGT93=null;
        Token LT94=null;
        Token GTGTGT97=null;
        HaxeParser.typeList_return typeList92 =null;

        HaxeParser.typeList_return typeList95 =null;

        HaxeParser.typeParam_return typeParam96 =null;


        Object LT91_tree=null;
        Object GTGT93_tree=null;
        Object LT94_tree=null;
        Object GTGTGT97_tree=null;
        RewriteRuleTokenStream stream_GTGTGT=new RewriteRuleTokenStream(adaptor,"token GTGTGT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GTGT=new RewriteRuleTokenStream(adaptor,"token GTGT");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:223:17: ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LT) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred60_Haxe()) ) {
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
                    // Haxe.g:223:19: LT typeList GTGT
                    {
                    LT91=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT91);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2073);
                    typeList92=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList92.getTree());

                    GTGT93=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParamPart2075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGT.add(GTGT93);


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
                    LT94=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT94);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2109);
                    typeList95=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList95.getTree());

                    // Haxe.g:224:31: ( typeParam )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:224:31: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_typeParamPart2111);
                            typeParam96=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam96.getTree());

                            }
                            break;

                    }


                    GTGTGT97=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParamPart2114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGT.add(GTGTGT97);


                    // AST REWRITE
                    // elements: typeParam, typeList
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
            if ( state.backtracking>0 ) { memoize(input, 27, typeParamPart_StartIndex); }

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

        Token COLON99=null;
        Token LPAREN100=null;
        Token RPAREN102=null;
        HaxeParser.identifier_return identifier98 =null;

        HaxeParser.typeList_return typeList101 =null;


        Object COLON99_tree=null;
        Object LPAREN100_tree=null;
        Object RPAREN102_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:228:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:228:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint2165);
            identifier98=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier98.getTree());

            COLON99=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint2167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON99);


            LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint2169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);


            pushFollow(FOLLOW_typeList_in_typeConstraint2171);
            typeList101=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList101.getTree());

            RPAREN102=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint2173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN102);


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
            if ( state.backtracking>0 ) { memoize(input, 28, typeConstraint_StartIndex); }

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

        Token SEMI105=null;
        HaxeParser.statementLast_return statementLast103 =null;

        HaxeParser.expr_return expr104 =null;


        Object SEMI105_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:232:17: ( statementLast | expr SEMI !)
            int alt35=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==BANG||LA35_1==BREAK||LA35_1==CAST||(LA35_1 >= CHARLITERAL && LA35_1 <= CLASS)||LA35_1==CONTINUE||LA35_1==DO||LA35_1==EXTERN||LA35_1==FALSE||(LA35_1 >= FLOATNUM && LA35_1 <= FUNCTION)||LA35_1==IF||LA35_1==INTLITERAL||(LA35_1 >= LBRACE && LA35_1 <= LBRACKET)||(LA35_1 >= LONGLITERAL && LA35_1 <= LPAREN)||(LA35_1 >= NEW && LA35_1 <= NULL)||LA35_1==PLUSPLUS||LA35_1==PRIVATE||LA35_1==RBRACE||LA35_1==RETURN||(LA35_1 >= STRINGLITERAL && LA35_1 <= SUB)||LA35_1==SUBSUB||(LA35_1 >= SUPER && LA35_1 <= THROW)||LA35_1==TILDE||(LA35_1 >= TRUE && LA35_1 <= TRY)||LA35_1==UNTYPED||LA35_1==VAR||LA35_1==WHILE) ) {
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
                    // Haxe.g:232:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statement2213);
                    statementLast103=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast103.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:233:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2233);
                    expr104=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr104.getTree());

                    SEMI105=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2235); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, statement_StartIndex); }

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

        Token IF107=null;
        Token ELSE110=null;
        Token FOR112=null;
        Token LPAREN113=null;
        Token IN115=null;
        Token RPAREN117=null;
        Token WHILE119=null;
        Token DO122=null;
        Token WHILE124=null;
        Token SEMI126=null;
        Token TRY127=null;
        Token SWITCH130=null;
        Token LPAREN131=null;
        Token RPAREN133=null;
        Token LBRACE134=null;
        Token RBRACE136=null;
        Token RETURN137=null;
        Token SEMI139=null;
        Token THROW140=null;
        Token SEMI142=null;
        Token set143=null;
        Token SEMI144=null;
        HaxeParser.block_return block106 =null;

        HaxeParser.parExpression_return parExpression108 =null;

        HaxeParser.statementOrLast_return statementOrLast109 =null;

        HaxeParser.statement_return statement111 =null;

        HaxeParser.expr_return expr114 =null;

        HaxeParser.iterExpr_return iterExpr116 =null;

        HaxeParser.statement_return statement118 =null;

        HaxeParser.parExpression_return parExpression120 =null;

        HaxeParser.statement_return statement121 =null;

        HaxeParser.statement_return statement123 =null;

        HaxeParser.parExpression_return parExpression125 =null;

        HaxeParser.block_return block128 =null;

        HaxeParser.catchStmt_return catchStmt129 =null;

        HaxeParser.expr_return expr132 =null;

        HaxeParser.caseStmt_return caseStmt135 =null;

        HaxeParser.expr_return expr138 =null;

        HaxeParser.expr_return expr141 =null;


        Object IF107_tree=null;
        Object ELSE110_tree=null;
        Object FOR112_tree=null;
        Object LPAREN113_tree=null;
        Object IN115_tree=null;
        Object RPAREN117_tree=null;
        Object WHILE119_tree=null;
        Object DO122_tree=null;
        Object WHILE124_tree=null;
        Object SEMI126_tree=null;
        Object TRY127_tree=null;
        Object SWITCH130_tree=null;
        Object LPAREN131_tree=null;
        Object RPAREN133_tree=null;
        Object LBRACE134_tree=null;
        Object RBRACE136_tree=null;
        Object RETURN137_tree=null;
        Object SEMI139_tree=null;
        Object THROW140_tree=null;
        Object SEMI142_tree=null;
        Object set143_tree=null;
        Object SEMI144_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:236:17: ( block | IF ^ parExpression ( statementOrLast ELSE !)? statement | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !)
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
                    // Haxe.g:236:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statementLast2267);
                    block106=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block106.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:237:19: IF ^ parExpression ( statementOrLast ELSE !)? statement
                    {
                    root_0 = (Object)adaptor.nil();


                    IF107=(Token)match(input,IF,FOLLOW_IF_in_statementLast2287); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF107_tree = 
                    new IfNode(IF107) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF107_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2293);
                    parExpression108=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression108.getTree());

                    // Haxe.g:237:45: ( statementOrLast ELSE !)?
                    int alt36=2;
                    switch ( input.LA(1) ) {
                        case LBRACE:
                            {
                            int LA36_1 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case IF:
                            {
                            int LA36_2 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FOR:
                            {
                            int LA36_3 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case WHILE:
                            {
                            int LA36_4 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case DO:
                            {
                            int LA36_5 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case TRY:
                            {
                            int LA36_6 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SWITCH:
                            {
                            int LA36_7 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case RETURN:
                            {
                            int LA36_8 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case THROW:
                            {
                            int LA36_9 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case BREAK:
                        case CONTINUE:
                            {
                            int LA36_10 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case UNTYPED:
                            {
                            int LA36_11 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUB:
                            {
                            int LA36_12 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUBSUB:
                            {
                            int LA36_13 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case PLUSPLUS:
                            {
                            int LA36_14 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case BANG:
                            {
                            int LA36_15 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case TILDE:
                            {
                            int LA36_16 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case NEW:
                            {
                            int LA36_17 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case CAST:
                            {
                            int LA36_18 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FUNCTION:
                            {
                            int LA36_19 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LBRACKET:
                            {
                            int LA36_20 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LONGLITERAL:
                            {
                            int LA36_21 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case NULL:
                            {
                            int LA36_22 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case INTLITERAL:
                            {
                            int LA36_23 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case STRINGLITERAL:
                            {
                            int LA36_24 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case CHARLITERAL:
                            {
                            int LA36_25 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FLOATNUM:
                            {
                            int LA36_26 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case TRUE:
                            {
                            int LA36_27 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case FALSE:
                            {
                            int LA36_28 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case LPAREN:
                            {
                            int LA36_29 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case IDENTIFIER:
                            {
                            int LA36_30 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case THIS:
                            {
                            int LA36_31 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case SUPER:
                            {
                            int LA36_32 = input.LA(2);

                            if ( (synpred64_Haxe()) ) {
                                alt36=1;
                            }
                            }
                            break;
                    }

                    switch (alt36) {
                        case 1 :
                            // Haxe.g:237:46: statementOrLast ELSE !
                            {
                            pushFollow(FOLLOW_statementOrLast_in_statementLast2296);
                            statementOrLast109=statementOrLast();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementOrLast109.getTree());

                            ELSE110=(Token)match(input,ELSE,FOLLOW_ELSE_in_statementLast2298); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_statement_in_statementLast2303);
                    statement111=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:238:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR112=(Token)match(input,FOR,FOLLOW_FOR_in_statementLast2323); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR112_tree = 
                    new ForNode(FOR112) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR112_tree, root_0);
                    }

                    LPAREN113=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2329); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2332);
                    expr114=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr114.getTree());

                    IN115=(Token)match(input,IN,FOLLOW_IN_in_statementLast2334); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statementLast2337);
                    iterExpr116=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr116.getTree());

                    RPAREN117=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2339); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statementLast2342);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement118.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:239:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2362); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE119_tree = 
                    new WhileNode(WHILE119) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE119_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2368);
                    parExpression120=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression120.getTree());

                    pushFollow(FOLLOW_statement_in_statementLast2370);
                    statement121=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement121.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:240:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO122=(Token)match(input,DO,FOLLOW_DO_in_statementLast2390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO122_tree = 
                    new DoWhileNode(DO122) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO122_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statementLast2396);
                    statement123=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement123.getTree());

                    WHILE124=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2398); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statementLast2401);
                    parExpression125=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression125.getTree());

                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2403); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:241:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY127=(Token)match(input,TRY,FOLLOW_TRY_in_statementLast2424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY127_tree = 
                    new TryNode(TRY127) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY127_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statementLast2430);
                    block128=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block128.getTree());

                    // Haxe.g:241:39: ( catchStmt )+
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
                    	    // Haxe.g:241:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statementLast2432);
                    	    catchStmt129=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt129.getTree());

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
                    // Haxe.g:242:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH130=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statementLast2453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH130_tree = 
                    new SwitchNode(SWITCH130) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH130_tree, root_0);
                    }

                    LPAREN131=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2459); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2462);
                    expr132=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());

                    RPAREN133=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2464); if (state.failed) return retval;

                    LBRACE134=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statementLast2467); if (state.failed) return retval;

                    // Haxe.g:242:68: ( caseStmt )+
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
                    	    // Haxe.g:242:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statementLast2470);
                    	    caseStmt135=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt135.getTree());

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


                    RBRACE136=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statementLast2473); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:243:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN137=(Token)match(input,RETURN,FOLLOW_RETURN_in_statementLast2494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN137_tree = 
                    new ReturnNode(RETURN137) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN137_tree, root_0);
                    }

                    // Haxe.g:243:39: ( expr )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==BANG||LA39_0==CAST||LA39_0==CHARLITERAL||LA39_0==FALSE||LA39_0==FLOATNUM||LA39_0==FUNCTION||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||(LA39_0 >= LBRACE && LA39_0 <= LBRACKET)||(LA39_0 >= LONGLITERAL && LA39_0 <= LPAREN)||(LA39_0 >= NEW && LA39_0 <= NULL)||LA39_0==PLUSPLUS||(LA39_0 >= STRINGLITERAL && LA39_0 <= SUB)||LA39_0==SUBSUB||LA39_0==SUPER||LA39_0==THIS||LA39_0==TILDE||LA39_0==TRUE||LA39_0==UNTYPED) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Haxe.g:243:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statementLast2500);
                            expr138=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

                            }
                            break;

                    }


                    SEMI139=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2503); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:244:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW140=(Token)match(input,THROW,FOLLOW_THROW_in_statementLast2524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW140_tree = 
                    (Object)adaptor.create(THROW140)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW140_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statementLast2527);
                    expr141=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr141.getTree());

                    SEMI142=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2529); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:245:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set143=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set143)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI144=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2558); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, statementLast_StartIndex); }

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

        HaxeParser.statementLast_return statementLast145 =null;

        HaxeParser.expr_return expr146 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:249:17: ( statementLast | expr )
            int alt41=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==BANG||LA41_1==BREAK||LA41_1==CAST||(LA41_1 >= CHARLITERAL && LA41_1 <= CLASS)||LA41_1==CONTINUE||LA41_1==DO||LA41_1==EXTERN||LA41_1==FALSE||(LA41_1 >= FLOATNUM && LA41_1 <= FUNCTION)||LA41_1==IF||LA41_1==INTLITERAL||(LA41_1 >= LBRACE && LA41_1 <= LBRACKET)||(LA41_1 >= LONGLITERAL && LA41_1 <= LPAREN)||(LA41_1 >= NEW && LA41_1 <= NULL)||LA41_1==PLUSPLUS||LA41_1==PRIVATE||LA41_1==RBRACE||LA41_1==RETURN||(LA41_1 >= STRINGLITERAL && LA41_1 <= SUB)||LA41_1==SUBSUB||(LA41_1 >= SUPER && LA41_1 <= THROW)||LA41_1==TILDE||(LA41_1 >= TRUE && LA41_1 <= TRY)||LA41_1==UNTYPED||LA41_1==VAR||LA41_1==WHILE) ) {
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
                    // Haxe.g:249:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statementOrLast2581);
                    statementLast145=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast145.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:250:19: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statementOrLast2601);
                    expr146=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr146.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, statementOrLast_StartIndex); }

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

        Token LPAREN147=null;
        Token RPAREN149=null;
        HaxeParser.expr_return expr148 =null;


        Object LPAREN147_tree=null;
        Object RPAREN149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:253:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:253:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN147=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2631); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2634);
            expr148=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr148.getTree());

            RPAREN149=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2636); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, parExpression_StartIndex); }

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

        Token LBRACE150=null;
        Token RBRACE152=null;
        HaxeParser.blockStmt_return blockStmt151 =null;


        Object LBRACE150_tree=null;
        Object RBRACE152_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:256:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:256:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE150=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2672); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE150);


            // Haxe.g:256:26: ( blockStmt )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BANG||LA42_0==BREAK||LA42_0==CAST||(LA42_0 >= CHARLITERAL && LA42_0 <= CLASS)||LA42_0==CONTINUE||LA42_0==DO||LA42_0==EXTERN||LA42_0==FALSE||(LA42_0 >= FLOATNUM && LA42_0 <= FUNCTION)||(LA42_0 >= IDENTIFIER && LA42_0 <= IF)||LA42_0==INTLITERAL||(LA42_0 >= LBRACE && LA42_0 <= LBRACKET)||(LA42_0 >= LONGLITERAL && LA42_0 <= LPAREN)||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||LA42_0==PRIVATE||LA42_0==RETURN||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||(LA42_0 >= SUPER && LA42_0 <= THROW)||LA42_0==TILDE||(LA42_0 >= TRUE && LA42_0 <= TRY)||LA42_0==UNTYPED||LA42_0==VAR||LA42_0==WHILE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:256:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2675);
            	    blockStmt151=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt151.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            RBRACE152=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2679); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE152);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE150, RBRACE152)
                , root_1);

                // Haxe.g:256:97: ( blockStmt )*
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
            if ( state.backtracking>0 ) { memoize(input, 33, block_StartIndex); }

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

        HaxeParser.varDecl_return varDecl153 =null;

        HaxeParser.classDecl_return classDecl154 =null;

        HaxeParser.statement_return statement155 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:259:17: ( varDecl | classDecl | statement )
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
                    // Haxe.g:259:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2723);
                    varDecl153=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl153.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:260:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2734);
                    classDecl154=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl154.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:261:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2745);
                    statement155=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement155.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, blockStmt_StartIndex); }

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

        Token CASE156=null;
        Token COLON158=null;
        Token DEFAULT160=null;
        Token COLON161=null;
        HaxeParser.exprList_return exprList157 =null;

        HaxeParser.statement_return statement159 =null;

        HaxeParser.statement_return statement162 =null;


        Object CASE156_tree=null;
        Object COLON158_tree=null;
        Object DEFAULT160_tree=null;
        Object COLON161_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:264:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:264:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE156=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2769); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE156_tree = 
                    (Object)adaptor.create(CASE156)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE156_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2772);
                    exprList157=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList157.getTree());

                    COLON158=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2774); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2777);
                    statement159=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement159.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:265:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT160=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2797); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT160_tree = 
                    (Object)adaptor.create(DEFAULT160)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT160_tree, root_0);
                    }

                    COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2800); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2803);
                    statement162=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement162.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, caseStmt_StartIndex); }

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

        Token CATCH163=null;
        Token LPAREN164=null;
        Token RPAREN166=null;
        HaxeParser.param_return param165 =null;

        HaxeParser.block_return block167 =null;


        Object CATCH163_tree=null;
        Object LPAREN164_tree=null;
        Object RPAREN166_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:268:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:268:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH163=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2838); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH163_tree = 
            new HaxeTree(CATCH163) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH163_tree, root_0);
            }

            LPAREN164=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2844); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2847);
            param165=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param165.getTree());

            RPAREN166=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2849); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2852);
            block167=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block167.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, catchStmt_StartIndex); }

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

        Token COMMA169=null;
        HaxeParser.expr_return expr168 =null;

        HaxeParser.expr_return expr170 =null;


        Object COMMA169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:272:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:272:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2890);
            expr168=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr168.getTree());

            // Haxe.g:272:24: ( COMMA ! expr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:272:25: COMMA ! expr
            	    {
            	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2893); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2896);
            	    expr170=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr170.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 37, exprList_StartIndex); }

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

        Token UNTYPED171=null;
        HaxeParser.assignExpr_return assignExpr172 =null;

        HaxeParser.assignExpr_return assignExpr173 =null;


        Object UNTYPED171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:275:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==UNTYPED) ) {
                alt46=1;
            }
            else if ( (LA46_0==BANG||LA46_0==CAST||LA46_0==CHARLITERAL||LA46_0==FALSE||LA46_0==FLOATNUM||LA46_0==FUNCTION||LA46_0==IDENTIFIER||LA46_0==INTLITERAL||(LA46_0 >= LBRACE && LA46_0 <= LBRACKET)||(LA46_0 >= LONGLITERAL && LA46_0 <= LPAREN)||(LA46_0 >= NEW && LA46_0 <= NULL)||LA46_0==PLUSPLUS||(LA46_0 >= STRINGLITERAL && LA46_0 <= SUB)||LA46_0==SUBSUB||LA46_0==SUPER||LA46_0==THIS||LA46_0==TILDE||LA46_0==TRUE) ) {
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
                    // Haxe.g:275:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED171=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2938); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED171_tree = 
                    (Object)adaptor.create(UNTYPED171)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED171_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2941);
                    assignExpr172=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr172.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:276:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2961);
                    assignExpr173=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr173.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, expr_StartIndex); }

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

        HaxeParser.ternaryExpr_return ternaryExpr174 =null;

        HaxeParser.assignOp_return assignOp175 =null;

        HaxeParser.ternaryExpr_return ternaryExpr176 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:279:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:279:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2991);
            ternaryExpr174=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr174.getTree());

            // Haxe.g:279:31: ( assignOp ^ ternaryExpr )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case EQ:
                    {
                    int LA47_1 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case PLUSEQ:
                    {
                    int LA47_2 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case SUBEQ:
                    {
                    int LA47_3 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case STAREQ:
                    {
                    int LA47_4 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case SLASHEQ:
                    {
                    int LA47_5 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case PERCENTEQ:
                    {
                    int LA47_6 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case AMPEQ:
                    {
                    int LA47_7 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case BAREQ:
                    {
                    int LA47_8 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case CARETEQ:
                    {
                    int LA47_9 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case LTLTEQ:
                    {
                    int LA47_10 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case GTGTEQ:
                    {
                    int LA47_11 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
                case GTGTGTEQ:
                    {
                    int LA47_12 = input.LA(2);

                    if ( (synpred84_Haxe()) ) {
                        alt47=1;
                    }
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // Haxe.g:279:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2994);
                    assignOp175=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp175.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2997);
                    ternaryExpr176=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr176.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 39, assignExpr_StartIndex); }

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

        Token QUES178=null;
        Token COLON180=null;
        HaxeParser.logicOrExpr_return logicOrExpr177 =null;

        HaxeParser.expr_return expr179 =null;

        HaxeParser.ternaryExpr_return ternaryExpr181 =null;


        Object QUES178_tree=null;
        Object COLON180_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:282:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:282:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr3028);
            logicOrExpr177=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr177.getTree());

            // Haxe.g:282:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==QUES) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred85_Haxe()) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // Haxe.g:282:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES178=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr3031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES178_tree = 
                    (Object)adaptor.create(QUES178)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES178_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr3034);
                    expr179=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr179.getTree());

                    COLON180=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr3036); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr3039);
                    ternaryExpr181=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr181.getTree());

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
    // Haxe.g:285:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR183=null;
        HaxeParser.logicAndExpr_return logicAndExpr182 =null;

        HaxeParser.logicAndExpr_return logicAndExpr184 =null;


        Object BARBAR183_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:285:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:285:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3070);
            logicAndExpr182=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr182.getTree());

            // Haxe.g:285:32: ( BARBAR ^ logicAndExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BARBAR) ) {
                    int LA49_2 = input.LA(2);

                    if ( (synpred86_Haxe()) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:285:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR183=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr3073); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR183_tree = 
            	    new BinaryExpressionNode(BARBAR183) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR183_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3079);
            	    logicAndExpr184=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr184.getTree());

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
    // Haxe.g:288:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP186=null;
        HaxeParser.iterExpr_return iterExpr185 =null;

        HaxeParser.iterExpr_return iterExpr187 =null;


        Object AMPAMP186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:288:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:288:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr3113);
            iterExpr185=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr185.getTree());

            // Haxe.g:288:27: ( AMPAMP ^ iterExpr )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==AMPAMP) ) {
                    int LA50_2 = input.LA(2);

                    if ( (synpred87_Haxe()) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // Haxe.g:288:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP186=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3115); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP186_tree = 
            	    new BinaryExpressionNode(AMPAMP186) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP186_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr3121);
            	    iterExpr187=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr187.getTree());

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

        Token ELLIPSIS189=null;
        HaxeParser.cmpExpr_return cmpExpr188 =null;

        HaxeParser.cmpExpr_return cmpExpr190 =null;


        Object ELLIPSIS189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:291:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:291:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr3171);
            cmpExpr188=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr188.getTree());

            // Haxe.g:291:27: ( ELLIPSIS ^ cmpExpr )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ELLIPSIS) ) {
                int LA51_1 = input.LA(2);

                if ( (synpred88_Haxe()) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // Haxe.g:291:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS189=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS189_tree = 
                    new BinaryExpressionNode(ELLIPSIS189) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS189_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr3180);
                    cmpExpr190=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr190.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 43, iterExpr_StartIndex); }

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

        Token EQEQ192=null;
        Token BANGEQ193=null;
        Token GTEQ194=null;
        Token LTEQ195=null;
        Token GT196=null;
        Token LT197=null;
        HaxeParser.bitExpr_return bitExpr191 =null;

        HaxeParser.bitExpr_return bitExpr198 =null;


        Object EQEQ192_tree=null;
        Object BANGEQ193_tree=null;
        Object GTEQ194_tree=null;
        Object LTEQ195_tree=null;
        Object GT196_tree=null;
        Object LT197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:294:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:294:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3219);
            bitExpr191=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr191.getTree());

            // Haxe.g:294:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    int LA53_2 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case BANGEQ:
                    {
                    int LA53_3 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case GTEQ:
                    {
                    int LA53_4 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case LTEQ:
                    {
                    int LA53_5 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case GT:
                    {
                    int LA53_6 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;
                case LT:
                    {
                    int LA53_7 = input.LA(2);

                    if ( (synpred94_Haxe()) ) {
                        alt53=1;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // Haxe.g:294:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:294:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:295:23: EQEQ ^
            	            {
            	            EQEQ192=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3246); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ192_tree = 
            	            new BinaryExpressionNode(EQEQ192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ192_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:296:23: BANGEQ ^
            	            {
            	            BANGEQ193=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3275); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ193_tree = 
            	            new BinaryExpressionNode(BANGEQ193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:297:23: GTEQ ^
            	            {
            	            GTEQ194=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3304); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ194_tree = 
            	            new BinaryExpressionNode(GTEQ194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:298:23: LTEQ ^
            	            {
            	            LTEQ195=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3333); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ195_tree = 
            	            new BinaryExpressionNode(LTEQ195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:299:23: GT ^
            	            {
            	            GT196=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3362); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT196_tree = 
            	            new BinaryExpressionNode(GT196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT196_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:300:23: LT ^
            	            {
            	            LT197=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3391); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT197_tree = 
            	            new BinaryExpressionNode(LT197) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT197_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3398);
            	    bitExpr198=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr198.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 44, cmpExpr_StartIndex); }

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

        Token BAR200=null;
        Token AMP201=null;
        Token CARET202=null;
        HaxeParser.shiftExpr_return shiftExpr199 =null;

        HaxeParser.shiftExpr_return shiftExpr203 =null;


        Object BAR200_tree=null;
        Object AMP201_tree=null;
        Object CARET202_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:303:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:303:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3437);
            shiftExpr199=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr199.getTree());

            // Haxe.g:303:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop55:
            do {
                int alt55=2;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    int LA55_2 = input.LA(2);

                    if ( (synpred97_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case AMP:
                    {
                    int LA55_3 = input.LA(2);

                    if ( (synpred97_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;
                case CARET:
                    {
                    int LA55_4 = input.LA(2);

                    if ( (synpred97_Haxe()) ) {
                        alt55=1;
                    }


                    }
                    break;

                }

                switch (alt55) {
            	case 1 :
            	    // Haxe.g:303:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:303:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:304:23: BAR ^
            	            {
            	            BAR200=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3464); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR200_tree = 
            	            new BinaryExpressionNode(BAR200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR200_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:305:23: AMP ^
            	            {
            	            AMP201=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3493); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP201_tree = 
            	            new BinaryExpressionNode(AMP201) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP201_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:306:23: CARET ^
            	            {
            	            CARET202=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3522); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET202_tree = 
            	            new BinaryExpressionNode(CARET202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET202_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3529);
            	    shiftExpr203=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr203.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 45, bitExpr_StartIndex); }

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

        Token LTLT205=null;
        Token GTGT206=null;
        Token GTGTGT207=null;
        HaxeParser.addExpr_return addExpr204 =null;

        HaxeParser.addExpr_return addExpr208 =null;


        Object LTLT205_tree=null;
        Object GTGT206_tree=null;
        Object GTGTGT207_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:309:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:309:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3562);
            addExpr204=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr204.getTree());

            // Haxe.g:309:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop57:
            do {
                int alt57=2;
                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    int LA57_2 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case GTGT:
                    {
                    int LA57_3 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;
                case GTGTGT:
                    {
                    int LA57_4 = input.LA(2);

                    if ( (synpred100_Haxe()) ) {
                        alt57=1;
                    }


                    }
                    break;

                }

                switch (alt57) {
            	case 1 :
            	    // Haxe.g:309:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:309:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:310:23: LTLT ^
            	            {
            	            LTLT205=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3589); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT205_tree = 
            	            new BinaryExpressionNode(LTLT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:311:23: GTGT ^
            	            {
            	            GTGT206=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3618); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT206_tree = 
            	            new BinaryExpressionNode(GTGT206) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT206_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:312:23: GTGTGT ^
            	            {
            	            GTGTGT207=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3647); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT207_tree = 
            	            new BinaryExpressionNode(GTGTGT207) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT207_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3654);
            	    addExpr208=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr208.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 46, shiftExpr_StartIndex); }

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

        Token PLUS210=null;
        Token SUB211=null;
        HaxeParser.multExpr_return multExpr209 =null;

        HaxeParser.multExpr_return multExpr212 =null;


        Object PLUS210_tree=null;
        Object SUB211_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:315:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:315:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3689);
            multExpr209=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr209.getTree());

            // Haxe.g:315:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==PLUS) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred102_Haxe()) ) {
                        alt59=1;
                    }


                }
                else if ( (LA59_0==SUB) ) {
                    int LA59_3 = input.LA(2);

                    if ( (synpred102_Haxe()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:315:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:315:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:316:23: PLUS ^
            	            {
            	            PLUS210=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3716); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS210_tree = 
            	            new BinaryExpressionNode(PLUS210) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:317:23: SUB ^
            	            {
            	            SUB211=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3745); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB211_tree = 
            	            new BinaryExpressionNode(SUB211) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB211_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3752);
            	    multExpr212=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr212.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, addExpr_StartIndex); }

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

        Token STAR214=null;
        Token SLASH215=null;
        Token PERCENT216=null;
        HaxeParser.unarExpr_return unarExpr213 =null;

        HaxeParser.unarExpr_return unarExpr217 =null;


        Object STAR214_tree=null;
        Object SLASH215_tree=null;
        Object PERCENT216_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:320:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:320:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3791);
            unarExpr213=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr213.getTree());

            // Haxe.g:320:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop61:
            do {
                int alt61=2;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    int LA61_2 = input.LA(2);

                    if ( (synpred105_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;
                case SLASH:
                    {
                    int LA61_3 = input.LA(2);

                    if ( (synpred105_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;
                case PERCENT:
                    {
                    int LA61_4 = input.LA(2);

                    if ( (synpred105_Haxe()) ) {
                        alt61=1;
                    }


                    }
                    break;

                }

                switch (alt61) {
            	case 1 :
            	    // Haxe.g:320:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:320:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:321:23: STAR ^
            	            {
            	            STAR214=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3818); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR214_tree = 
            	            new BinaryExpressionNode(STAR214) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:322:23: SLASH ^
            	            {
            	            SLASH215=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3847); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH215_tree = 
            	            new BinaryExpressionNode(SLASH215) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH215_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:323:23: PERCENT ^
            	            {
            	            PERCENT216=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3876); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT216_tree = 
            	            new BinaryExpressionNode(PERCENT216) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT216_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3883);
            	    unarExpr217=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr217.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 48, multExpr_StartIndex); }

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

        Token SUB218=null;
        Token SUBSUB219=null;
        Token PLUSPLUS220=null;
        Token BANG221=null;
        Token TILDE222=null;
        Token PLUSPLUS225=null;
        Token SUBSUB226=null;
        HaxeParser.prefixExpr_return prefixExpr223 =null;

        HaxeParser.prefixExpr_return prefixExpr224 =null;


        Object SUB218_tree=null;
        Object SUBSUB219_tree=null;
        Object PLUSPLUS220_tree=null;
        Object BANG221_tree=null;
        Object TILDE222_tree=null;
        Object PLUSPLUS225_tree=null;
        Object SUBSUB226_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:326:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BANG||LA64_0==PLUSPLUS||LA64_0==SUB||LA64_0==SUBSUB||LA64_0==TILDE) ) {
                alt64=1;
            }
            else if ( (LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||(LA64_0 >= LBRACE && LA64_0 <= LBRACKET)||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==STRINGLITERAL||LA64_0==SUPER||LA64_0==THIS||LA64_0==TRUE) ) {
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
                    // Haxe.g:326:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:326:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:327:13: SUB ^
                            {
                            SUB218=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3931); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB218_tree = 
                            new UnarExpressionNode(SUB218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB218_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:328:13: SUBSUB ^
                            {
                            SUBSUB219=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3950); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB219_tree = 
                            new UnarExpressionNode(SUBSUB219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB219_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:329:13: PLUSPLUS ^
                            {
                            PLUSPLUS220=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3969); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS220_tree = 
                            new UnarExpressionNode(PLUSPLUS220) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS220_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:330:13: BANG ^
                            {
                            BANG221=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3988); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG221_tree = 
                            new UnarExpressionNode(BANG221) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG221_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:331:13: TILDE ^
                            {
                            TILDE222=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr4007); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE222_tree = 
                            new UnarExpressionNode(TILDE222) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE222_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr4014);
                    prefixExpr223=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr223.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:332:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr4034);
                    prefixExpr224=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr224.getTree());

                    // Haxe.g:332:30: ( PLUSPLUS ^| SUBSUB ^)?
                    int alt63=3;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==PLUSPLUS) ) {
                        int LA63_1 = input.LA(2);

                        if ( (synpred111_Haxe()) ) {
                            alt63=1;
                        }
                    }
                    else if ( (LA63_0==SUBSUB) ) {
                        int LA63_2 = input.LA(2);

                        if ( (synpred112_Haxe()) ) {
                            alt63=2;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:332:31: PLUSPLUS ^
                            {
                            PLUSPLUS225=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr4037); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS225_tree = 
                            new UnarExpressionNode(PLUSPLUS225) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS225_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:332:61: SUBSUB ^
                            {
                            SUBSUB226=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr4043); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB226_tree = 
                            new UnarExpressionNode(SUBSUB226) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB226_tree, root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 49, unarExpr_StartIndex); }

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

        Token NEW227=null;
        Token LPAREN229=null;
        Token RPAREN231=null;
        Token CAST232=null;
        Token LPAREN233=null;
        Token COMMA235=null;
        Token RPAREN237=null;
        HaxeParser.type_return type228 =null;

        HaxeParser.exprList_return exprList230 =null;

        HaxeParser.expr_return expr234 =null;

        HaxeParser.funcType_return funcType236 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice238 =null;


        Object NEW227_tree=null;
        Object LPAREN229_tree=null;
        Object RPAREN231_tree=null;
        Object CAST232_tree=null;
        Object LPAREN233_tree=null;
        Object COMMA235_tree=null;
        Object RPAREN237_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:335:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
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
                    // Haxe.g:335:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW227=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr4085); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW227_tree = 
                    new NewNode(NEW227) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW227_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4091);
                    type228=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type228.getTree());

                    LPAREN229=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4093); if (state.failed) return retval;

                    // Haxe.g:335:46: ( exprList )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==BANG||LA65_0==CAST||LA65_0==CHARLITERAL||LA65_0==FALSE||LA65_0==FLOATNUM||LA65_0==FUNCTION||LA65_0==IDENTIFIER||LA65_0==INTLITERAL||(LA65_0 >= LBRACE && LA65_0 <= LBRACKET)||(LA65_0 >= LONGLITERAL && LA65_0 <= LPAREN)||(LA65_0 >= NEW && LA65_0 <= NULL)||LA65_0==PLUSPLUS||(LA65_0 >= STRINGLITERAL && LA65_0 <= SUB)||LA65_0==SUBSUB||LA65_0==SUPER||LA65_0==THIS||LA65_0==TILDE||LA65_0==TRUE||LA65_0==UNTYPED) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:335:46: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4096);
                            exprList230=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList230.getTree());

                            }
                            break;

                    }


                    RPAREN231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4099); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:336:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST232=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST232_tree = 
                    (Object)adaptor.create(CAST232)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST232_tree, root_0);
                    }

                    LPAREN233=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4123); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4126);
                    expr234=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr234.getTree());

                    // Haxe.g:336:38: ( COMMA ! funcType )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==COMMA) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:336:39: COMMA ! funcType
                            {
                            COMMA235=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4129); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4132);
                            funcType236=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType236.getTree());

                            }
                            break;

                    }


                    RPAREN237=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4136); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:337:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr4157);
                    methodCallOrSlice238=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice238.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, prefixExpr_StartIndex); }

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

        Token LPAREN240=null;
        Token RPAREN242=null;
        Token LBRACKET245=null;
        Token RBRACKET247=null;
        HaxeParser.value_return value239 =null;

        HaxeParser.exprList_return exprList241 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice243 =null;

        HaxeParser.value_return value244 =null;

        HaxeParser.expr_return expr246 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice248 =null;

        HaxeParser.value_return value249 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice250 =null;

        HaxeParser.value_return value251 =null;


        Object LPAREN240_tree=null;
        Object RPAREN242_tree=null;
        Object LBRACKET245_tree=null;
        Object RBRACKET247_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:341:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt71=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA71_1 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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
            case TRUE:
                {
                int LA71_10 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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
            case FALSE:
                {
                int LA71_11 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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
            case LPAREN:
                {
                int LA71_12 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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
            case IDENTIFIER:
                {
                int LA71_13 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
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
            case THIS:
                {
                int LA71_14 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 14, input);

                    throw nvae;

                }
                }
                break;
            case SUPER:
                {
                int LA71_15 = input.LA(2);

                if ( (synpred119_Haxe()) ) {
                    alt71=1;
                }
                else if ( (synpred121_Haxe()) ) {
                    alt71=2;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt71=3;
                }
                else if ( (true) ) {
                    alt71=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 15, input);

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
                    // Haxe.g:341:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4199);
                    value239=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value239.getTree());

                    LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN240);


                    // Haxe.g:341:32: ( exprList )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG||LA68_0==CAST||LA68_0==CHARLITERAL||LA68_0==FALSE||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||(LA68_0 >= LBRACE && LA68_0 <= LBRACKET)||(LA68_0 >= LONGLITERAL && LA68_0 <= LPAREN)||(LA68_0 >= NEW && LA68_0 <= NULL)||LA68_0==PLUSPLUS||(LA68_0 >= STRINGLITERAL && LA68_0 <= SUB)||LA68_0==SUBSUB||LA68_0==SUPER||LA68_0==THIS||LA68_0==TILDE||LA68_0==TRUE||LA68_0==UNTYPED) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:341:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4203);
                            exprList241=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList241.getTree());

                            }
                            break;

                    }


                    RPAREN242=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN242);


                    // Haxe.g:341:49: ( pureCallOrSlice )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==LBRACKET) ) {
                        int LA69_1 = input.LA(2);

                        if ( (synpred118_Haxe()) ) {
                            alt69=1;
                        }
                    }
                    else if ( (LA69_0==DOT) ) {
                        int LA69_2 = input.LA(2);

                        if ( (synpred118_Haxe()) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:341:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4208);
                            pureCallOrSlice243=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice243.getTree());

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
                        new MethodCallNode(CALL_OR_SLICE, LPAREN240, RPAREN242)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:342:72: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:342:82: ( pureCallOrSlice )?
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
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4259);
                    value244=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value244.getTree());

                    LBRACKET245=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET245);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4263);
                    expr246=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr246.getTree());

                    RBRACKET247=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET247);


                    // Haxe.g:343:48: ( pureCallOrSlice )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==LBRACKET) ) {
                        int LA70_1 = input.LA(2);

                        if ( (synpred120_Haxe()) ) {
                            alt70=1;
                        }
                    }
                    else if ( (LA70_0==DOT) ) {
                        int LA70_2 = input.LA(2);

                        if ( (synpred120_Haxe()) ) {
                            alt70=1;
                        }
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:343:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4267);
                            pureCallOrSlice248=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice248.getTree());

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
                    // 344:13: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:344:16: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET245, RBRACKET247, false)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:344:83: ( pureCallOrSlice )?
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


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4318);
                    value249=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value249.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4321);
                    pureCallOrSlice250=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice250.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:346:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4342);
                    value251=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value251.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:349:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET252=null;
        Token RBRACKET254=null;
        Token DOT256=null;
        HaxeParser.expr_return expr253 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice255 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice257 =null;


        Object LBRACKET252_tree=null;
        Object RBRACKET254_tree=null;
        Object DOT256_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:349:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
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
                    // Haxe.g:349:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET252=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET252);


                    // Haxe.g:349:28: ( expr )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==BANG||LA72_0==CAST||LA72_0==CHARLITERAL||LA72_0==FALSE||LA72_0==FLOATNUM||LA72_0==FUNCTION||LA72_0==IDENTIFIER||LA72_0==INTLITERAL||(LA72_0 >= LBRACE && LA72_0 <= LBRACKET)||(LA72_0 >= LONGLITERAL && LA72_0 <= LPAREN)||(LA72_0 >= NEW && LA72_0 <= NULL)||LA72_0==PLUSPLUS||(LA72_0 >= STRINGLITERAL && LA72_0 <= SUB)||LA72_0==SUBSUB||LA72_0==SUPER||LA72_0==THIS||LA72_0==TILDE||LA72_0==TRUE||LA72_0==UNTYPED) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:349:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4369);
                            expr253=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr253.getTree());

                            }
                            break;

                    }


                    RBRACKET254=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4372); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET254);


                    // Haxe.g:349:43: ( pureCallOrSlice )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LBRACKET) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt73=1;
                        }
                    }
                    else if ( (LA73_0==DOT) ) {
                        int LA73_2 = input.LA(2);

                        if ( (synpred124_Haxe()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:349:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4374);
                            pureCallOrSlice255=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice255.getTree());

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
                        new SliceNode(CALL_OR_SLICE, LBRACKET252, RBRACKET254, true)
                        , root_1);

                        // Haxe.g:350:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:350:76: ( pureCallOrSlice )?
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


                    DOT256=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4428); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT256_tree = 
                    (Object)adaptor.create(DOT256)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT256_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4431);
                    methodCallOrSlice257=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice257.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token LBRACKET258=null;
        Token RBRACKET260=null;
        HaxeParser.exprList_return exprList259 =null;


        Object LBRACKET258_tree=null;
        Object RBRACKET260_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:354:17: ( LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) )
            // Haxe.g:354:19: LBRACKET ( exprList )? RBRACKET
            {
            LBRACKET258=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayObj4463); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET258);


            // Haxe.g:354:28: ( exprList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BANG||LA75_0==CAST||LA75_0==CHARLITERAL||LA75_0==FALSE||LA75_0==FLOATNUM||LA75_0==FUNCTION||LA75_0==IDENTIFIER||LA75_0==INTLITERAL||(LA75_0 >= LBRACE && LA75_0 <= LBRACKET)||(LA75_0 >= LONGLITERAL && LA75_0 <= LPAREN)||(LA75_0 >= NEW && LA75_0 <= NULL)||LA75_0==PLUSPLUS||(LA75_0 >= STRINGLITERAL && LA75_0 <= SUB)||LA75_0==SUBSUB||LA75_0==SUPER||LA75_0==THIS||LA75_0==TILDE||LA75_0==TRUE||LA75_0==UNTYPED) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:354:28: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayObj4465);
                    exprList259=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList259.getTree());

                    }
                    break;

            }


            RBRACKET260=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayObj4468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET260);


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
                new ArrayNode(SUFFIX_EXPR, LBRACKET258, RBRACKET260)
                , root_1);

                // Haxe.g:355:63: ( exprList )?
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
            if ( state.backtracking>0 ) { memoize(input, 53, arrayObj_StartIndex); }

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

        Token LPAREN265=null;
        Token RPAREN267=null;
        Token char_literal268=null;
        Token COLON270=null;
        Token LPAREN272=null;
        Token RPAREN274=null;
        HaxeParser.objLit_return objLit261 =null;

        HaxeParser.funcLit_return funcLit262 =null;

        HaxeParser.arrayObj_return arrayObj263 =null;

        HaxeParser.elementarySymbol_return elementarySymbol264 =null;

        HaxeParser.expr_return expr266 =null;

        HaxeParser.expr_return expr269 =null;

        HaxeParser.expr_return expr271 =null;

        HaxeParser.expr_return expr273 =null;

        HaxeParser.id_return id275 =null;

        HaxeParser.typeParam_return typeParam276 =null;


        Object LPAREN265_tree=null;
        Object RPAREN267_tree=null;
        Object char_literal268_tree=null;
        Object COLON270_tree=null;
        Object LPAREN272_tree=null;
        Object RPAREN274_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:360:5: ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? )
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
                int LA77_12 = input.LA(2);

                if ( (synpred131_Haxe()) ) {
                    alt77=5;
                }
                else if ( (synpred132_Haxe()) ) {
                    alt77=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 12, input);

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
                    // Haxe.g:360:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4545);
                    objLit261=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit261.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:361:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4553);
                    funcLit262=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit262.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:362:7: arrayObj
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayObj_in_value4561);
                    arrayObj263=arrayObj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayObj263.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:363:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4569);
                    elementarySymbol264=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol264.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:364:9: LPAREN expr RPAREN '?' expr COLON expr
                    {
                    LPAREN265=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN265);


                    pushFollow(FOLLOW_expr_in_value4581);
                    expr266=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr266.getTree());

                    RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN267);


                    char_literal268=(Token)match(input,QUES,FOLLOW_QUES_in_value4585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(char_literal268);


                    pushFollow(FOLLOW_expr_in_value4587);
                    expr269=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr269.getTree());

                    COLON270=(Token)match(input,COLON,FOLLOW_COLON_in_value4589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON270);


                    pushFollow(FOLLOW_expr_in_value4591);
                    expr271=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr271.getTree());

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


                    LPAREN272=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4613); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value4616);
                    expr273=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr273.getTree());

                    RPAREN274=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4618); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:367:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4634);
                    id275=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id275.getTree());

                    // Haxe.g:367:12: ( typeParam )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==LT) ) {
                        int LA76_1 = input.LA(2);

                        if ( (synpred133_Haxe()) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // Haxe.g:367:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4636);
                            typeParam276=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam276.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 54, value_StartIndex); }

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

        HaxeParser.classDecl_return classDecl277 =null;

        HaxeParser.interfaceDecl_return interfaceDecl278 =null;

        HaxeParser.enumDecl_return enumDecl279 =null;

        HaxeParser.typedefDecl_return typedefDecl280 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:371:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:371:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4656);
                    classDecl277=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl277.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:372:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4676);
                    interfaceDecl278=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl278.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:373:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4696);
                    enumDecl279=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl279.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:374:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4716);
                    typedefDecl280=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl280.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:377:1: enumDecl : ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM282=null;
        Token IDENTIFIER283=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr281 =null;

        HaxeParser.typeParam_return typeParam284 =null;

        HaxeParser.enumBody_return enumBody285 =null;


        Object ENUM282_tree=null;
        Object IDENTIFIER283_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:377:17: ( ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) )
            // Haxe.g:377:19: ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:377:19: ( topLevelAccessAttr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EXTERN||LA79_0==PRIVATE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:377:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_enumDecl4752);
                    topLevelAccessAttr281=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr281.getTree());

                    }
                    break;

            }


            ENUM282=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4755); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM282);


            IDENTIFIER283=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4757); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER283);


            // Haxe.g:377:55: ( typeParam )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:377:55: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4759);
                    typeParam284=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam284.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4762);
            enumBody285=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody285.getTree());

            // AST REWRITE
            // elements: IDENTIFIER, topLevelAccessAttr, enumBody, typeParam
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
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:377:101: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:377:121: ( typeParam )?
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
    // Haxe.g:380:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE286=null;
        Token RBRACE288=null;
        HaxeParser.enumValueDecl_return enumValueDecl287 =null;


        Object LBRACE286_tree=null;
        Object RBRACE288_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:380:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:380:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE286=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE286);


            // Haxe.g:380:26: ( enumValueDecl )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==IDENTIFIER) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Haxe.g:380:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4814);
            	    enumValueDecl287=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl287.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            RBRACE288=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4818); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE288);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE286, RBRACE288)
                , root_1);

                // Haxe.g:380:101: ( enumValueDecl )*
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
    // Haxe.g:383:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER289=null;
        Token LPAREN290=null;
        Token RPAREN292=null;
        Token SEMI293=null;
        Token IDENTIFIER294=null;
        Token SEMI295=null;
        HaxeParser.paramList_return paramList291 =null;


        Object IDENTIFIER289_tree=null;
        Object LPAREN290_tree=null;
        Object RPAREN292_tree=null;
        Object SEMI293_tree=null;
        Object IDENTIFIER294_tree=null;
        Object SEMI295_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:383:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
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
                    // Haxe.g:383:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER289_tree = 
                    new VarDeclarationNode(IDENTIFIER289) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER289_tree, root_0);
                    }

                    LPAREN290=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4864); if (state.failed) return retval;

                    // Haxe.g:383:59: ( paramList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==IDENTIFIER||LA82_0==QUES) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Haxe.g:383:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4867);
                            paramList291=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList291.getTree());

                            }
                            break;

                    }


                    RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4870); if (state.failed) return retval;

                    SEMI293=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4873); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:384:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER294=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER294_tree = 
                    new VarDeclarationNode(IDENTIFIER294) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER294_tree);
                    }

                    SEMI295=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4901); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:388:1: classDecl : ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS297=null;
        Token IDENTIFIER298=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr296 =null;

        HaxeParser.typeParam_return typeParam299 =null;

        HaxeParser.extending_return extending300 =null;

        HaxeParser.implementList_return implementList301 =null;

        HaxeParser.classBodyScope_return classBodyScope302 =null;


        Object CLASS297_tree=null;
        Object IDENTIFIER298_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_implementList=new RewriteRuleSubtreeStream(adaptor,"rule implementList");
        RewriteRuleSubtreeStream stream_extending=new RewriteRuleSubtreeStream(adaptor,"rule extending");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:388:17: ( ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( extending )? ( implementList )? classBodyScope ) )
            // Haxe.g:388:19: ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( extending )? ( implementList )? classBodyScope
            {
            // Haxe.g:388:19: ( topLevelAccessAttr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTERN||LA84_0==PRIVATE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:388:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_classDecl4950);
                    topLevelAccessAttr296=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr296.getTree());

                    }
                    break;

            }


            CLASS297=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS297);


            IDENTIFIER298=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4955); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER298);


            // Haxe.g:388:56: ( typeParam )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:388:56: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4957);
                    typeParam299=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam299.getTree());

                    }
                    break;

            }


            // Haxe.g:388:68: ( extending )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EXTENDS) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:388:68: extending
                    {
                    pushFollow(FOLLOW_extending_in_classDecl4961);
                    extending300=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_extending.add(extending300.getTree());

                    }
                    break;

            }


            // Haxe.g:388:79: ( implementList )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==IMPLEMENTS) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:388:79: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_classDecl4964);
                    implementList301=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implementList.add(implementList301.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4968);
            classBodyScope302=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope302.getTree());

            // AST REWRITE
            // elements: classBodyScope, topLevelAccessAttr, typeParam, extending, IDENTIFIER, implementList
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
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:389:48: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:389:68: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:389:80: ( extending )?
                if ( stream_extending.hasNext() ) {
                    adaptor.addChild(root_1, stream_extending.nextTree());

                }
                stream_extending.reset();

                // Haxe.g:389:91: ( implementList )?
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
    // Haxe.g:392:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE303=null;
        Token RBRACE305=null;
        HaxeParser.classMember_return classMember304 =null;


        Object LBRACE303_tree=null;
        Object RBRACE305_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:392:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:392:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE303=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope5039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE303);


            // Haxe.g:392:26: ( classMember )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==DYNAMIC||LA88_0==FUNCTION||LA88_0==INLINE||LA88_0==OVERRIDE||LA88_0==PRIVATE||LA88_0==PUBLIC||LA88_0==STATIC||LA88_0==VAR) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Haxe.g:392:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope5042);
            	    classMember304=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember304.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            RBRACE305=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope5046); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE305);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE303, RBRACE305)
                , root_1);

                // Haxe.g:392:99: ( classMember )*
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
    // Haxe.g:395:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass306 =null;

        HaxeParser.funcDecl_return funcDecl307 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:395:17: ( varDeclClass | funcDecl )
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // Haxe.g:395:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember5092);
                    varDeclClass306=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass306.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:396:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember5112);
                    funcDecl307=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl307.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:400:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR309=null;
        Token IDENTIFIER310=null;
        Token SEMI314=null;
        HaxeParser.declAttrList_return declAttrList308 =null;

        HaxeParser.propDecl_return propDecl311 =null;

        HaxeParser.typeTag_return typeTag312 =null;

        HaxeParser.varInit_return varInit313 =null;


        Object VAR309_tree=null;
        Object IDENTIFIER310_tree=null;
        Object SEMI314_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:400:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:400:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:400:19: ( declAttrList )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==DYNAMIC||LA90_0==INLINE||LA90_0==OVERRIDE||LA90_0==PRIVATE||LA90_0==PUBLIC||LA90_0==STATIC) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:400:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5154);
                    declAttrList308=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList308.getTree());

                    }
                    break;

            }


            VAR309=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR309);


            IDENTIFIER310=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER310);


            // Haxe.g:400:48: ( propDecl )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==LPAREN) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:400:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5161);
                    propDecl311=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl311.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass5164);
            typeTag312=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag312.getTree());

            // Haxe.g:400:66: ( varInit )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==EQ) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:400:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5166);
                    varInit313=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit313.getTree());

                    }
                    break;

            }


            SEMI314=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI314);


            // AST REWRITE
            // elements: propDecl, IDENTIFIER, declAttrList, varInit, typeTag
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 400:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:400:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:400:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:400:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:400:148: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 62, varDeclClass_StartIndex); }

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

        Token VAR315=null;
        Token COMMA317=null;
        Token SEMI319=null;
        HaxeParser.varDeclPartList_return varDeclPartList316 =null;

        HaxeParser.varDeclPartList_return varDeclPartList318 =null;


        Object VAR315_tree=null;
        Object COMMA317_tree=null;
        Object SEMI319_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:403:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:403:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR315=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5238); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5241);
            varDeclPartList316=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList316.getTree());

            // Haxe.g:403:40: ( COMMA ! varDeclPartList )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==COMMA) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // Haxe.g:403:41: COMMA ! varDeclPartList
            	    {
            	    COMMA317=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5244); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5247);
            	    varDeclPartList318=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList318.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            SEMI319=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5251); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, varDecl_StartIndex); }

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

        Token IDENTIFIER320=null;
        HaxeParser.propDecl_return propDecl321 =null;

        HaxeParser.typeTag_return typeTag322 =null;

        HaxeParser.varInit_return varInit323 =null;


        Object IDENTIFIER320_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:406:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:406:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER320=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER320);


            // Haxe.g:406:30: ( propDecl )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LPAREN) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Haxe.g:406:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5279);
                    propDecl321=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl321.getTree());

                    }
                    break;

            }


            // Haxe.g:406:40: ( typeTag )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==COLON) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Haxe.g:406:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5282);
                    typeTag322=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag322.getTree());

                    }
                    break;

            }


            // Haxe.g:406:49: ( varInit )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==EQ) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:406:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5285);
                    varInit323=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit323.getTree());

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
            // 406:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:406:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:406:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:406:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:406:113: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 64, varDeclPartList_StartIndex); }

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

        Token LPAREN324=null;
        Token COMMA325=null;
        Token RPAREN326=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN324_tree=null;
        Object COMMA325_tree=null;
        Object RPAREN326_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:409:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:409:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN324=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5336); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN324);


            pushFollow(FOLLOW_propAccessor_in_propDecl5340);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA325=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA325);


            pushFollow(FOLLOW_propAccessor_in_propDecl5346);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN326=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5348); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN326);


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
            if ( state.backtracking>0 ) { memoize(input, 65, propDecl_StartIndex); }

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

        Token set327=null;

        Object set327_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:412:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set327=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set327)
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
            if ( state.backtracking>0 ) { memoize(input, 66, propAccessor_StartIndex); }

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

        Token EQ328=null;
        HaxeParser.expr_return expr329 =null;


        Object EQ328_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:419:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:419:19: EQ expr
            {
            EQ328=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5507); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ328);


            pushFollow(FOLLOW_expr_in_varInit5509);
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
            if ( state.backtracking>0 ) { memoize(input, 67, varInit_StartIndex); }

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

        Token FUNCTION331=null;
        Token NEW332=null;
        Token FUNCTION335=null;
        Token IDENTIFIER336=null;
        HaxeParser.declAttrList_return declAttrList330 =null;

        HaxeParser.funcDeclPart_return funcDeclPart333 =null;

        HaxeParser.declAttrList_return declAttrList334 =null;

        HaxeParser.typeParam_return typeParam337 =null;

        HaxeParser.funcDeclPart_return funcDeclPart338 =null;


        Object FUNCTION331_tree=null;
        Object NEW332_tree=null;
        Object FUNCTION335_tree=null;
        Object IDENTIFIER336_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:422:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt100=2;
            alt100 = dfa100.predict(input);
            switch (alt100) {
                case 1 :
                    // Haxe.g:422:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:422:19: ( declAttrList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DYNAMIC||LA97_0==INLINE||LA97_0==OVERRIDE||LA97_0==PRIVATE||LA97_0==PUBLIC||LA97_0==STATIC) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:422:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5553);
                            declAttrList330=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList330.getTree());

                            }
                            break;

                    }


                    FUNCTION331=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION331);


                    NEW332=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW332);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5560);
                    funcDeclPart333=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart333.getTree());

                    // AST REWRITE
                    // elements: funcDeclPart, NEW, FUNCTION, declAttrList
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
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:423:53: ( declAttrList )?
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
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DYNAMIC||LA98_0==INLINE||LA98_0==OVERRIDE||LA98_0==PRIVATE||LA98_0==PUBLIC||LA98_0==STATIC) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:424:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5618);
                            declAttrList334=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList334.getTree());

                            }
                            break;

                    }


                    FUNCTION335=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION335);


                    IDENTIFIER336=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER336);


                    // Haxe.g:424:53: ( typeParam )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==LT) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:424:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5625);
                            typeParam337=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam337.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5628);
                    funcDeclPart338=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart338.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, declAttrList, typeParam, IDENTIFIER, funcDeclPart
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
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:425:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:425:87: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 68, funcDecl_StartIndex); }

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

        Token LPAREN339=null;
        Token RPAREN341=null;
        Token SEMI344=null;
        HaxeParser.paramList_return paramList340 =null;

        HaxeParser.typeTag_return typeTag342 =null;

        HaxeParser.block_return block343 =null;


        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
        Object SEMI344_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:428:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:428:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5712); if (state.failed) return retval;

            // Haxe.g:428:27: ( paramList )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Haxe.g:428:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5715);
                    paramList340=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList340.getTree());

                    }
                    break;

            }


            RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5718); if (state.failed) return retval;

            // Haxe.g:428:46: ( typeTag )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==COLON) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // Haxe.g:428:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5721);
                    typeTag342=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag342.getTree());

                    }
                    break;

            }


            // Haxe.g:428:55: ( block | SEMI !)
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
                    // Haxe.g:428:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5725);
                    block343=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block343.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:428:64: SEMI !
                    {
                    SEMI344=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5729); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 69, funcDeclPart_StartIndex); }

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

        Token FUNCTION346=null;
        Token NEW347=null;
        Token LPAREN348=null;
        Token RPAREN350=null;
        Token SEMI352=null;
        Token FUNCTION354=null;
        Token IDENTIFIER355=null;
        Token LPAREN357=null;
        Token RPAREN359=null;
        Token SEMI361=null;
        Token FUNCTION362=null;
        Token NEW363=null;
        Token LPAREN364=null;
        Token RPAREN366=null;
        Token SEMI368=null;
        Token FUNCTION369=null;
        Token IDENTIFIER370=null;
        Token LPAREN372=null;
        Token RPAREN374=null;
        Token SEMI376=null;
        HaxeParser.declAttrList_return declAttrList345 =null;

        HaxeParser.paramList_return paramList349 =null;

        HaxeParser.typeTag_return typeTag351 =null;

        HaxeParser.declAttrList_return declAttrList353 =null;

        HaxeParser.typeParam_return typeParam356 =null;

        HaxeParser.paramList_return paramList358 =null;

        HaxeParser.typeTag_return typeTag360 =null;

        HaxeParser.paramList_return paramList365 =null;

        HaxeParser.typeTag_return typeTag367 =null;

        HaxeParser.typeParam_return typeParam371 =null;

        HaxeParser.paramList_return paramList373 =null;

        HaxeParser.typeTag_return typeTag375 =null;


        Object FUNCTION346_tree=null;
        Object NEW347_tree=null;
        Object LPAREN348_tree=null;
        Object RPAREN350_tree=null;
        Object SEMI352_tree=null;
        Object FUNCTION354_tree=null;
        Object IDENTIFIER355_tree=null;
        Object LPAREN357_tree=null;
        Object RPAREN359_tree=null;
        Object SEMI361_tree=null;
        Object FUNCTION362_tree=null;
        Object NEW363_tree=null;
        Object LPAREN364_tree=null;
        Object RPAREN366_tree=null;
        Object SEMI368_tree=null;
        Object FUNCTION369_tree=null;
        Object IDENTIFIER370_tree=null;
        Object LPAREN372_tree=null;
        Object RPAREN374_tree=null;
        Object SEMI376_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:432:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt114=4;
            alt114 = dfa114.predict(input);
            switch (alt114) {
                case 1 :
                    // Haxe.g:432:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5766);
                    declAttrList345=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList345.getTree());

                    FUNCTION346=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION346);


                    NEW347=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW347);


                    LPAREN348=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5772); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN348);


                    // Haxe.g:432:42: ( paramList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==IDENTIFIER||LA104_0==QUES) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:432:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5774);
                            paramList349=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList349.getTree());

                            }
                            break;

                    }


                    RPAREN350=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN350);


                    // Haxe.g:432:60: ( typeTag )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COLON) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:432:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5779);
                            typeTag351=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag351.getTree());

                            }
                            break;

                    }


                    SEMI352=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5782); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI352);


                    // AST REWRITE
                    // elements: declAttrList, NEW, FUNCTION, typeTag, paramList
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
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5823);
                    declAttrList353=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList353.getTree());

                    FUNCTION354=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5825); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION354);


                    IDENTIFIER355=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER355);


                    // Haxe.g:434:42: ( typeParam )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LT) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:434:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5829);
                            typeParam356=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam356.getTree());

                            }
                            break;

                    }


                    LPAREN357=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN357);


                    // Haxe.g:434:60: ( paramList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==IDENTIFIER||LA107_0==QUES) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:434:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5834);
                            paramList358=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList358.getTree());

                            }
                            break;

                    }


                    RPAREN359=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN359);


                    // Haxe.g:434:78: ( typeTag )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==COLON) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:434:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5839);
                            typeTag360=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag360.getTree());

                            }
                            break;

                    }


                    SEMI361=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI361);


                    // AST REWRITE
                    // elements: declAttrList, typeTag, paramList, typeParam, IDENTIFIER, FUNCTION
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
                    FUNCTION362=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION362);


                    NEW363=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5888); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW363);


                    LPAREN364=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5890); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN364);


                    // Haxe.g:436:29: ( paramList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==IDENTIFIER||LA109_0==QUES) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:436:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5892);
                            paramList365=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList365.getTree());

                            }
                            break;

                    }


                    RPAREN366=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN366);


                    // Haxe.g:436:47: ( typeTag )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==COLON) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Haxe.g:436:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5897);
                            typeTag367=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag367.getTree());

                            }
                            break;

                    }


                    SEMI368=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI368);


                    // AST REWRITE
                    // elements: typeTag, paramList, FUNCTION, NEW
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
                    FUNCTION369=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION369);


                    IDENTIFIER370=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER370);


                    // Haxe.g:438:29: ( typeParam )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==LT) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Haxe.g:438:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5942);
                            typeParam371=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam371.getTree());

                            }
                            break;

                    }


                    LPAREN372=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN372);


                    // Haxe.g:438:47: ( paramList )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==IDENTIFIER||LA112_0==QUES) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Haxe.g:438:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5947);
                            paramList373=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList373.getTree());

                            }
                            break;

                    }


                    RPAREN374=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN374);


                    // Haxe.g:438:65: ( typeTag )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==COLON) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // Haxe.g:438:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5952);
                            typeTag375=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag375.getTree());

                            }
                            break;

                    }


                    SEMI376=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI376);


                    // AST REWRITE
                    // elements: typeParam, paramList, FUNCTION, IDENTIFIER, typeTag
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
    // Haxe.g:442:1: interfaceDecl : ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE378=null;
        Token LBRACE382=null;
        Token RBRACE384=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr377 =null;

        HaxeParser.type_return type379 =null;

        HaxeParser.extending_return extending380 =null;

        HaxeParser.implementList_return implementList381 =null;

        HaxeParser.interfaceBody_return interfaceBody383 =null;


        Object INTERFACE378_tree=null;
        Object LBRACE382_tree=null;
        Object RBRACE384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:443:5: ( ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:443:9: ( topLevelAccessAttr )? INTERFACE type ( extending )? ( implementList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:443:9: ( topLevelAccessAttr )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==EXTERN||LA115_0==PRIVATE) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // Haxe.g:443:9: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_interfaceDecl6014);
                    topLevelAccessAttr377=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccessAttr377.getTree());

                    }
                    break;

            }


            INTERFACE378=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl6017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE378_tree = 
            (Object)adaptor.create(INTERFACE378)
            ;
            adaptor.addChild(root_0, INTERFACE378_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl6019);
            type379=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type379.getTree());

            // Haxe.g:443:44: ( extending )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==EXTENDS) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // Haxe.g:443:44: extending
                    {
                    pushFollow(FOLLOW_extending_in_interfaceDecl6021);
                    extending380=extending();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, extending380.getTree());

                    }
                    break;

            }


            // Haxe.g:443:55: ( implementList )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==IMPLEMENTS) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Haxe.g:443:55: implementList
                    {
                    pushFollow(FOLLOW_implementList_in_interfaceDecl6024);
                    implementList381=implementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, implementList381.getTree());

                    }
                    break;

            }


            LBRACE382=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl6027); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl6030);
            interfaceBody383=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody383.getTree());

            RBRACE384=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl6032); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:446:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl385 =null;

        HaxeParser.interfaceBody_return interfaceBody386 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl387 =null;

        HaxeParser.interfaceBody_return interfaceBody388 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:447:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
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
                    // Haxe.g:447:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody6056);
                    varDecl385=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl385.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody6058);
                    interfaceBody386=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody386.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:448:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody6068);
                    funcProtoDecl387=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl387.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody6070);
                    interfaceBody388=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody388.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 72, interfaceBody_StartIndex); }

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

        Token COMMA390=null;
        HaxeParser.implementing_return implementing389 =null;

        HaxeParser.implementing_return implementing391 =null;


        Object COMMA390_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_implementing=new RewriteRuleSubtreeStream(adaptor,"rule implementing");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:453:17: ( implementing ( COMMA implementing )* -> ^( IMPLEMENT_LIST[\"ImplementList\"] ( implementing )+ ) )
            // Haxe.g:453:19: implementing ( COMMA implementing )*
            {
            pushFollow(FOLLOW_implementing_in_implementList6108);
            implementing389=implementing();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_implementing.add(implementing389.getTree());

            // Haxe.g:453:32: ( COMMA implementing )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Haxe.g:453:33: COMMA implementing
            	    {
            	    COMMA390=(Token)match(input,COMMA,FOLLOW_COMMA_in_implementList6111); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA390);


            	    pushFollow(FOLLOW_implementing_in_implementList6113);
            	    implementing391=implementing();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_implementing.add(implementing391.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 73, implementList_StartIndex); }

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

        Token IMPLEMENTS392=null;
        HaxeParser.type_return type393 =null;


        Object IMPLEMENTS392_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:456:17: ( IMPLEMENTS ! type )
            // Haxe.g:456:19: IMPLEMENTS ! type
            {
            root_0 = (Object)adaptor.nil();


            IMPLEMENTS392=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_implementing6160); if (state.failed) return retval;

            pushFollow(FOLLOW_type_in_implementing6163);
            type393=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type393.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, implementing_StartIndex); }

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

        Token EXTENDS394=null;
        HaxeParser.type_return type395 =null;


        Object EXTENDS394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:459:17: ( EXTENDS ^ type )
            // Haxe.g:459:19: EXTENDS ^ type
            {
            root_0 = (Object)adaptor.nil();


            EXTENDS394=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extending6210); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS394_tree = 
            new HaxeTree(EXTENDS394) 
            ;
            root_0 = (Object)adaptor.becomeRoot(EXTENDS394_tree, root_0);
            }

            pushFollow(FOLLOW_type_in_extending6216);
            type395=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type395.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, extending_StartIndex); }

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

        Token TYPEDEF396=null;
        Token IDENTIFIER397=null;
        Token EQ398=null;
        HaxeParser.funcType_return funcType399 =null;


        Object TYPEDEF396_tree=null;
        Object IDENTIFIER397_tree=null;
        Object EQ398_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:462:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:462:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF396=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6249); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF396_tree = 
            (Object)adaptor.create(TYPEDEF396)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF396_tree, root_0);
            }

            IDENTIFIER397=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER397_tree = 
            (Object)adaptor.create(IDENTIFIER397)
            ;
            adaptor.addChild(root_0, IDENTIFIER397_tree);
            }

            EQ398=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6254); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl6257);
            funcType399=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType399.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:465:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT400=null;
        HaxeParser.funcType_return funcType401 =null;


        Object GT400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:465:17: ( GT ^ funcType )
            // Haxe.g:465:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT400=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6291); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT400_tree = 
            (Object)adaptor.create(GT400)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT400_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6294);
            funcType401=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType401.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token LBRACE402=null;
        Token RBRACE404=null;
        HaxeParser.objLitElemList_return objLitElemList403 =null;


        Object LBRACE402_tree=null;
        Object RBRACE404_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:468:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:468:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE402=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6328); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6331);
            objLitElemList403=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList403.getTree());

            RBRACE404=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6333); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:471:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER405=null;
        Token COLON406=null;
        HaxeParser.funcType_return funcType407 =null;


        Object IDENTIFIER405_tree=null;
        Object COLON406_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:471:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:471:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER405=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER405_tree = 
            (Object)adaptor.create(IDENTIFIER405)
            ;
            adaptor.addChild(root_0, IDENTIFIER405_tree);
            }

            COLON406=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6363); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6366);
            funcType407=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType407.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:474:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA409=null;
        HaxeParser.objLitElem_return objLitElem408 =null;

        HaxeParser.objLitElem_return objLitElem410 =null;


        Object COMMA409_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:474:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:474:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6396);
            objLitElem408=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem408.getTree());

            // Haxe.g:474:30: ( COMMA ! objLitElem )*
            loop120:
            do {
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMMA) ) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // Haxe.g:474:31: COMMA ! objLitElem
            	    {
            	    COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6399); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6402);
            	    objLitElem410=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem410.getTree());

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
    // Haxe.g:477:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER411=null;
        Token COLON412=null;
        HaxeParser.expr_return expr413 =null;


        Object IDENTIFIER411_tree=null;
        Object COLON412_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:477:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:477:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER411=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6438); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER411_tree = 
            (Object)adaptor.create(IDENTIFIER411)
            ;
            adaptor.addChild(root_0, IDENTIFIER411_tree);
            }

            COLON412=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6440); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6443);
            expr413=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr413.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:481:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL414=null;
        Token NULL415=null;
        Token INTLITERAL416=null;
        Token STRINGLITERAL417=null;
        Token CHARLITERAL418=null;
        Token FLOATNUM419=null;
        Token TRUE420=null;
        Token FALSE421=null;

        Object LONGLITERAL414_tree=null;
        Object NULL415_tree=null;
        Object INTLITERAL416_tree=null;
        Object STRINGLITERAL417_tree=null;
        Object CHARLITERAL418_tree=null;
        Object FLOATNUM419_tree=null;
        Object TRUE420_tree=null;
        Object FALSE421_tree=null;
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

            // Haxe.g:482:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt121=8;
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
            case TRUE:
                {
                alt121=7;
                }
                break;
            case FALSE:
                {
                alt121=8;
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
                    // Haxe.g:482:7: LONGLITERAL
                    {
                    LONGLITERAL414=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL414);


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
                    // 482:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL414, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:483:7: NULL
                    {
                    NULL415=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6495); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL415);


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
                        new ConstantNode(NULL, NULL415, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:484:7: INTLITERAL
                    {
                    INTLITERAL416=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL416);


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
                    // 484:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL416, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:485:7: STRINGLITERAL
                    {
                    STRINGLITERAL417=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL417);


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
                    // 485:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL417, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:486:7: CHARLITERAL
                    {
                    CHARLITERAL418=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6555); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL418);


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
                    // 486:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL418, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:487:7: FLOATNUM
                    {
                    FLOATNUM419=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6573); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM419);


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
                    // 487:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM419, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:488:7: TRUE
                    {
                    TRUE420=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6594); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE420);


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
                    // 488:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE420, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:489:7: FALSE
                    {
                    FALSE421=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE421);


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
                    // 489:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE421, "BOOL")
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

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {
        // Haxe.g:216:61: ( typeParam )
        // Haxe.g:216:61: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred58_Haxe1937);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:219:19: ( LT typeList typeParamPart )
        // Haxe.g:219:19: LT typeList typeParamPart
        {
        match(input,LT,FOLLOW_LT_in_synpred59_Haxe1973); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred59_Haxe1975);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_typeParamPart_in_synpred59_Haxe1977);
        typeParamPart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred60_Haxe
    public final void synpred60_Haxe_fragment() throws RecognitionException {
        // Haxe.g:223:19: ( LT typeList GTGT )
        // Haxe.g:223:19: LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred60_Haxe2071); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred60_Haxe2073);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GTGT,FOLLOW_GTGT_in_synpred60_Haxe2075); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred64_Haxe
    public final void synpred64_Haxe_fragment() throws RecognitionException {
        // Haxe.g:237:46: ( statementOrLast ELSE )
        // Haxe.g:237:46: statementOrLast ELSE
        {
        pushFollow(FOLLOW_statementOrLast_in_synpred64_Haxe2296);
        statementOrLast();

        state._fsp--;
        if (state.failed) return ;

        match(input,ELSE,FOLLOW_ELSE_in_synpred64_Haxe2298); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred64_Haxe

    // $ANTLR start synpred84_Haxe
    public final void synpred84_Haxe_fragment() throws RecognitionException {
        // Haxe.g:279:32: ( assignOp ternaryExpr )
        // Haxe.g:279:32: assignOp ternaryExpr
        {
        pushFollow(FOLLOW_assignOp_in_synpred84_Haxe2994);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred84_Haxe2997);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_Haxe

    // $ANTLR start synpred85_Haxe
    public final void synpred85_Haxe_fragment() throws RecognitionException {
        // Haxe.g:282:32: ( QUES expr COLON ternaryExpr )
        // Haxe.g:282:32: QUES expr COLON ternaryExpr
        {
        match(input,QUES,FOLLOW_QUES_in_synpred85_Haxe3031); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred85_Haxe3034);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred85_Haxe3036); if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred85_Haxe3039);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_Haxe

    // $ANTLR start synpred86_Haxe
    public final void synpred86_Haxe_fragment() throws RecognitionException {
        // Haxe.g:285:33: ( BARBAR logicAndExpr )
        // Haxe.g:285:33: BARBAR logicAndExpr
        {
        match(input,BARBAR,FOLLOW_BARBAR_in_synpred86_Haxe3073); if (state.failed) return ;

        pushFollow(FOLLOW_logicAndExpr_in_synpred86_Haxe3079);
        logicAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_Haxe

    // $ANTLR start synpred87_Haxe
    public final void synpred87_Haxe_fragment() throws RecognitionException {
        // Haxe.g:288:28: ( AMPAMP iterExpr )
        // Haxe.g:288:28: AMPAMP iterExpr
        {
        match(input,AMPAMP,FOLLOW_AMPAMP_in_synpred87_Haxe3115); if (state.failed) return ;

        pushFollow(FOLLOW_iterExpr_in_synpred87_Haxe3121);
        iterExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_Haxe

    // $ANTLR start synpred88_Haxe
    public final void synpred88_Haxe_fragment() throws RecognitionException {
        // Haxe.g:291:28: ( ELLIPSIS cmpExpr )
        // Haxe.g:291:28: ELLIPSIS cmpExpr
        {
        match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_synpred88_Haxe3174); if (state.failed) return ;

        pushFollow(FOLLOW_cmpExpr_in_synpred88_Haxe3180);
        cmpExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_Haxe

    // $ANTLR start synpred94_Haxe
    public final void synpred94_Haxe_fragment() throws RecognitionException {
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


        pushFollow(FOLLOW_bitExpr_in_synpred94_Haxe3398);
        bitExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred94_Haxe

    // $ANTLR start synpred97_Haxe
    public final void synpred97_Haxe_fragment() throws RecognitionException {
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


        pushFollow(FOLLOW_shiftExpr_in_synpred97_Haxe3529);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_Haxe

    // $ANTLR start synpred100_Haxe
    public final void synpred100_Haxe_fragment() throws RecognitionException {
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


        pushFollow(FOLLOW_addExpr_in_synpred100_Haxe3654);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_Haxe

    // $ANTLR start synpred102_Haxe
    public final void synpred102_Haxe_fragment() throws RecognitionException {
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


        pushFollow(FOLLOW_multExpr_in_synpred102_Haxe3752);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred102_Haxe

    // $ANTLR start synpred105_Haxe
    public final void synpred105_Haxe_fragment() throws RecognitionException {
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


        pushFollow(FOLLOW_unarExpr_in_synpred105_Haxe3883);
        unarExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred105_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {
        // Haxe.g:332:31: ( PLUSPLUS )
        // Haxe.g:332:31: PLUSPLUS
        {
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred111_Haxe4037); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred112_Haxe
    public final void synpred112_Haxe_fragment() throws RecognitionException {
        // Haxe.g:332:61: ( SUBSUB )
        // Haxe.g:332:61: SUBSUB
        {
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred112_Haxe4043); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {
        // Haxe.g:341:49: ( pureCallOrSlice )
        // Haxe.g:341:49: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred118_Haxe4208);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:341:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:341:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred119_Haxe4199);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred119_Haxe4201); if (state.failed) return ;

        // Haxe.g:341:32: ( exprList )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==BANG||LA132_0==CAST||LA132_0==CHARLITERAL||LA132_0==FALSE||LA132_0==FLOATNUM||LA132_0==FUNCTION||LA132_0==IDENTIFIER||LA132_0==INTLITERAL||(LA132_0 >= LBRACE && LA132_0 <= LBRACKET)||(LA132_0 >= LONGLITERAL && LA132_0 <= LPAREN)||(LA132_0 >= NEW && LA132_0 <= NULL)||LA132_0==PLUSPLUS||(LA132_0 >= STRINGLITERAL && LA132_0 <= SUB)||LA132_0==SUBSUB||LA132_0==SUPER||LA132_0==THIS||LA132_0==TILDE||LA132_0==TRUE||LA132_0==UNTYPED) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // Haxe.g:341:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred119_Haxe4203);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred119_Haxe4206); if (state.failed) return ;

        // Haxe.g:341:49: ( pureCallOrSlice )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==DOT||LA133_0==LBRACKET) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // Haxe.g:341:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4208);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {
        // Haxe.g:343:48: ( pureCallOrSlice )
        // Haxe.g:343:48: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe4267);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {
        // Haxe.g:343:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:343:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred121_Haxe4259);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred121_Haxe4261); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred121_Haxe4263);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred121_Haxe4265); if (state.failed) return ;

        // Haxe.g:343:48: ( pureCallOrSlice )?
        int alt134=2;
        int LA134_0 = input.LA(1);

        if ( (LA134_0==DOT||LA134_0==LBRACKET) ) {
            alt134=1;
        }
        switch (alt134) {
            case 1 :
                // Haxe.g:343:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred121_Haxe4267);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred121_Haxe

    // $ANTLR start synpred122_Haxe
    public final void synpred122_Haxe_fragment() throws RecognitionException {
        // Haxe.g:345:19: ( value pureCallOrSlice )
        // Haxe.g:345:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred122_Haxe4318);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred122_Haxe4321);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_Haxe

    // $ANTLR start synpred124_Haxe
    public final void synpred124_Haxe_fragment() throws RecognitionException {
        // Haxe.g:349:43: ( pureCallOrSlice )
        // Haxe.g:349:43: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred124_Haxe4374);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_Haxe

    // $ANTLR start synpred131_Haxe
    public final void synpred131_Haxe_fragment() throws RecognitionException {
        // Haxe.g:364:9: ( LPAREN expr RPAREN '?' expr COLON expr )
        // Haxe.g:364:9: LPAREN expr RPAREN '?' expr COLON expr
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred131_Haxe4579); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4581);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred131_Haxe4583); if (state.failed) return ;

        match(input,QUES,FOLLOW_QUES_in_synpred131_Haxe4585); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4587);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred131_Haxe4589); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4591);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred131_Haxe

    // $ANTLR start synpred132_Haxe
    public final void synpred132_Haxe_fragment() throws RecognitionException {
        // Haxe.g:365:9: ( LPAREN expr RPAREN )
        // Haxe.g:365:9: LPAREN expr RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred132_Haxe4613); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred132_Haxe4616);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred132_Haxe4618); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_Haxe

    // $ANTLR start synpred133_Haxe
    public final void synpred133_Haxe_fragment() throws RecognitionException {
        // Haxe.g:367:12: ( typeParam )
        // Haxe.g:367:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred133_Haxe4636);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred133_Haxe

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
    public final boolean synpred94_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred102_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred84_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred131_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred64_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred88_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred133_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_Haxe_fragment(); // can never throw exception
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


    protected DFA89 dfa89 = new DFA89(this);
    protected DFA100 dfa100 = new DFA100(this);
    protected DFA114 dfa114 = new DFA114(this);
    static final String DFA89_eotS =
        "\4\uffff";
    static final String DFA89_eofS =
        "\4\uffff";
    static final String DFA89_minS =
        "\2\47\2\uffff";
    static final String DFA89_maxS =
        "\2\u00a2\2\uffff";
    static final String DFA89_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA89_specialS =
        "\4\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\1\22\uffff\1\3\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\30\uffff\1\2",
            "\1\1\22\uffff\1\3\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\30\uffff\1\2",
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
            return "395:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA100_eotS =
        "\5\uffff";
    static final String DFA100_eofS =
        "\5\uffff";
    static final String DFA100_minS =
        "\2\47\1\106\2\uffff";
    static final String DFA100_maxS =
        "\2\u0089\1\142\2\uffff";
    static final String DFA100_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA100_specialS =
        "\5\uffff}>";
    static final String[] DFA100_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\2\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\33\uffff\1\3",
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
            return "422:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA114_eotS =
        "\10\uffff";
    static final String DFA114_eofS =
        "\10\uffff";
    static final String DFA114_minS =
        "\2\47\2\106\4\uffff";
    static final String DFA114_maxS =
        "\2\u0089\2\142\4\uffff";
    static final String DFA114_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA114_specialS =
        "\10\uffff}>";
    static final String[] DFA114_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\3\22\uffff\1\1\27\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\5\33\uffff\1\4",
            "\1\7\33\uffff\1\6",
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
            return "431:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module191 = new BitSet(new long[]{0x0004100008000002L,0x0400000000010800L,0x0000000208000000L});
    public static final BitSet FOLLOW_imports_in_module194 = new BitSet(new long[]{0x0004100008000002L,0x0400000000010800L,0x0000000208000000L});
    public static final BitSet FOLLOW_topLevelDecl_in_module197 = new BitSet(new long[]{0x0004100008000002L,0x0400000000010000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IMPORT_in_imports250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_imports253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_imports255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_imports276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_imports279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_imports281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_myPackage316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_myPackage318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath373 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_DOT_in_filepath378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath382 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta418 = new BitSet(new long[]{0x0080008010010000L,0x0000000000008040L,0x0000001000000800L});
    public static final BitSet FOLLOW_metaName_in_meta420 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_meta423 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_meta425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_meta428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName464 = new BitSet(new long[]{0x0080008010010000L,0x0000000000008040L,0x0000001000000800L});
    public static final BitSet FOLLOW_metaName_in_metaName466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags484 = new BitSet(new long[]{0x0004000000000002L,0x0400000080000000L});
    public static final BitSet FOLLOW_topLevelAccess_in_topLevelAccessAttr742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList782 = new BitSet(new long[]{0x0000008000000002L,0x2400002000002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_paramList827 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList830 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L});
    public static final BitSet FOLLOW_param_in_paramList832 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_QUES_in_param882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param885 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_param887 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_param890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_id1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1459 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcLit1462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1465 = new BitSet(new long[]{0x0000000010000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_funcLit1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1515 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeTag1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1561 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1564 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeList1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1589 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1592 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeList1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1630 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1633 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_funcType1636 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1674 = new BitSet(new long[]{0x1000000000000000L,0x8000000000000040L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1676 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1761 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1822 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1827 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1922 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_filepath_in_type1927 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_anonType_in_type1932 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1973 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParam1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamPart_in_typeParam1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam2011 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParam2013 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2071 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2073 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParamPart2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2107 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000001L});
    public static final BitSet FOLLOW_typeParam_in_typeParamPart2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParamPart2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint2165 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint2169 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statement2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementLast2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statementLast2287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2293 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statementOrLast_in_statementLast2296 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ELSE_in_statementLast2298 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_statementLast2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statementLast2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2329 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_statementLast2332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_statementLast2334 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_iterExpr_in_statementLast2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2339 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_statementLast2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2368 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_statementLast2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statementLast2390 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_statementLast2396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statementLast2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_statementLast2430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_catchStmt_in_statementLast2432 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_SWITCH_in_statementLast2453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2459 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_statementLast2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statementLast2467 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_caseStmt_in_statementLast2470 = new BitSet(new long[]{0x0000000400400000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statementLast2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statementLast2494 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB008L});
    public static final BitSet FOLLOW_expr_in_statementLast2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statementLast2524 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_statementLast2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statementLast2550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statementOrLast2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statementOrLast2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2631 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_parExpression2634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2672 = new BitSet(new long[]{0x071400110C820200L,0x8400100C00DA00C0L,0x00000045035EB002L});
    public static final BitSet FOLLOW_blockStmt_in_block2675 = new BitSet(new long[]{0x071400110C820200L,0x8400100C00DA00C0L,0x00000045035EB002L});
    public static final BitSet FOLLOW_RBRACE_in_block2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2769 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2772 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2774 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2797 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2800 = new BitSet(new long[]{0x0710001104820200L,0x0000100C00DA00C0L,0x00000041035EB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2844 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L});
    public static final BitSet FOLLOW_param_in_catchStmt2847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_catchStmt2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2890 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2893 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_exprList2896 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2938 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2991 = new BitSet(new long[]{0x8000200000204082L,0x00000A0008000002L,0x0000000000004140L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2994 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr3028 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr3031 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr3034 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr3036 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3070 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3073 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3079 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3113 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3115 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3121 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3171 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr3174 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3219 = new BitSet(new long[]{0x3000400000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3246 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3275 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3304 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3333 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3362 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3391 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3398 = new BitSet(new long[]{0x3000400000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3437 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3464 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3493 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3522 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3529 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3562 = new BitSet(new long[]{0x4000000000000002L,0x0000000004000001L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3589 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3618 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3647 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3654 = new BitSet(new long[]{0x4000000000000002L,0x0000000004000001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3689 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3716 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3745 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3752 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3791 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_STAR_in_multExpr3818 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3847 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3876 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3883 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3931 = new BitSet(new long[]{0x0510000004800000L,0x0000000C00DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3950 = new BitSet(new long[]{0x0510000004800000L,0x0000000C00DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3969 = new BitSet(new long[]{0x0510000004800000L,0x0000000C00DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3988 = new BitSet(new long[]{0x0510000004800000L,0x0000000C00DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr4007 = new BitSet(new long[]{0x0510000004800000L,0x0000000C00DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr4034 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr4085 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_prefixExpr4091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4093 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB004L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4123 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4126 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4129 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4201 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB004L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4206 = new BitSet(new long[]{0x0000002000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4261 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4265 = new BitSet(new long[]{0x0000002000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4318 = new BitSet(new long[]{0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4367 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB001L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4372 = new BitSet(new long[]{0x0000002000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4428 = new BitSet(new long[]{0x0510000004000000L,0x0000000800DA0040L,0x00000000010A1000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayObj4463 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB001L});
    public static final BitSet FOLLOW_exprList_in_arrayObj4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayObj4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayObj_in_value4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4579 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_value4581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_value4583 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_value4585 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_value4587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_value4589 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_value4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4613 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_value4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_value4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4634 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_value4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_enumDecl4752 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4811 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4814 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4864 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_classDecl4950 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4955 = new BitSet(new long[]{0x0002000000000000L,0x0000000001080200L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4957 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080200L});
    public static final BitSet FOLLOW_extending_in_classDecl4961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080200L});
    public static final BitSet FOLLOW_implementList_in_classDecl4964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope5039 = new BitSet(new long[]{0x0400008000000000L,0xA400002000002000L,0x0000000400000200L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope5042 = new BitSet(new long[]{0x0400008000000000L,0xA400002000002000L,0x0000000400000200L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5159 = new BitSet(new long[]{0x0000000010000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5161 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5164 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5241 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5247 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5277 = new BitSet(new long[]{0x0000200010000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5279 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5282 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5336 = new BitSet(new long[]{0x0000008400000000L,0x0000000A00000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5340 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5342 = new BitSet(new long[]{0x0000008400000000L,0x0000000A00000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5507 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_varInit5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5553 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5556 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5618 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5623 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5712 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5718 = new BitSet(new long[]{0x0000000010000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5766 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5772 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5777 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5823 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5827 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5832 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5837 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5886 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5890 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5895 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5940 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5945 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5950 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_interfaceDecl6014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl6017 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_interfaceDecl6019 = new BitSet(new long[]{0x0002000000000000L,0x0000000000080200L});
    public static final BitSet FOLLOW_extending_in_interfaceDecl6021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080200L});
    public static final BitSet FOLLOW_implementList_in_interfaceDecl6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl6027 = new BitSet(new long[]{0x0400008000000000L,0xA400002000002000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl6030 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody6056 = new BitSet(new long[]{0x0400008000000000L,0x2400002000002000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody6058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody6068 = new BitSet(new long[]{0x0400008000000000L,0x2400002000002000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implementing_in_implementList6108 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_implementList6111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_implementing_in_implementList6113 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_implementing6160 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_implementing6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_extending6210 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_extending6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6252 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6254 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6291 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6331 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6361 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6363 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6396 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6402 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6438 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6440 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred58_Haxe1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred59_Haxe1973 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_synpred59_Haxe1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParamPart_in_synpred59_Haxe1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred60_Haxe2071 = new BitSet(new long[]{0x0080008000010000L,0x0000000000088040L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_synpred60_Haxe2073 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred60_Haxe2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementOrLast_in_synpred64_Haxe2296 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ELSE_in_synpred64_Haxe2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_synpred84_Haxe2994 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred84_Haxe2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_synpred85_Haxe3031 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred85_Haxe3034 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred85_Haxe3036 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred85_Haxe3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_synpred86_Haxe3073 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_logicAndExpr_in_synpred86_Haxe3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_synpred87_Haxe3115 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_iterExpr_in_synpred87_Haxe3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_synpred88_Haxe3174 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_cmpExpr_in_synpred88_Haxe3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred94_Haxe3222 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_bitExpr_in_synpred94_Haxe3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred97_Haxe3440 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred97_Haxe3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred100_Haxe3565 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_addExpr_in_synpred100_Haxe3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred102_Haxe3692 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_multExpr_in_synpred102_Haxe3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred105_Haxe3794 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000000014AB000L});
    public static final BitSet FOLLOW_unarExpr_in_synpred105_Haxe3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred111_Haxe4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred112_Haxe4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred118_Haxe4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred119_Haxe4199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred119_Haxe4201 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB004L});
    public static final BitSet FOLLOW_exprList_in_synpred119_Haxe4203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred119_Haxe4206 = new BitSet(new long[]{0x0000002000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred121_Haxe4259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred121_Haxe4261 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred121_Haxe4263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred121_Haxe4265 = new BitSet(new long[]{0x0000002000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred121_Haxe4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred122_Haxe4318 = new BitSet(new long[]{0x0000002000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred122_Haxe4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred124_Haxe4374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred131_Haxe4579 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred131_Haxe4583 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_synpred131_Haxe4585 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4587 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred131_Haxe4589 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred132_Haxe4613 = new BitSet(new long[]{0x0510000004800200L,0x0000100C00DA0040L,0x00000001014AB000L});
    public static final BitSet FOLLOW_expr_in_synpred132_Haxe4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred132_Haxe4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred133_Haxe4636 = new BitSet(new long[]{0x0000000000000002L});

}