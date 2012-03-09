// $ANTLR 3.4 Haxe.g 2012-03-09 21:03:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CALL_OR_SLICE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPORT", "IN", "INHERIT_LIST", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "INTNUM", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRING", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_CONSTRAIN", "TYPE_PARAM", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
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
    public static final int IMPORT=74;
    public static final int IN=75;
    public static final int INHERIT_LIST=76;
    public static final int INLINE=77;
    public static final int INSTANCEOF=78;
    public static final int INT=79;
    public static final int INTERFACE=80;
    public static final int INTLITERAL=81;
    public static final int INTNUM=82;
    public static final int IntegerNumber=83;
    public static final int LBRACE=84;
    public static final int LBRACKET=85;
    public static final int LONG=86;
    public static final int LONGLITERAL=87;
    public static final int LPAREN=88;
    public static final int LT=89;
    public static final int LTEQ=90;
    public static final int LTLT=91;
    public static final int LTLTEQ=92;
    public static final int LongSuffix=93;
    public static final int MINUS_BIGGER=94;
    public static final int MODULE=95;
    public static final int MONKEYS_AT=96;
    public static final int NATIVE=97;
    public static final int NEVER=98;
    public static final int NEW=99;
    public static final int NULL=100;
    public static final int OCTAL_ESC=101;
    public static final int OVERRIDE=102;
    public static final int PACKAGE=103;
    public static final int PARAM_LIST=104;
    public static final int PERCENT=105;
    public static final int PERCENTEQ=106;
    public static final int PLUS=107;
    public static final int PLUSEQ=108;
    public static final int PLUSPLUS=109;
    public static final int PP_AND_EXPRESSION=110;
    public static final int PP_CONDITIONAL=111;
    public static final int PP_ELSE=112;
    public static final int PP_ELSEIF=113;
    public static final int PP_END=114;
    public static final int PP_ERROR=115;
    public static final int PP_EXPRESSION=116;
    public static final int PP_IF=117;
    public static final int PP_OR_EXPRESSION=118;
    public static final int PP_PRIMARY_EXPRESSION=119;
    public static final int PP_UNARY_EXPRESSION=120;
    public static final int PREFIX_EXPR=121;
    public static final int PREPROCESSOR_DIRECTIVE=122;
    public static final int PRIVATE=123;
    public static final int PROPERTY_DECL=124;
    public static final int PROTECTED=125;
    public static final int PUBLIC=126;
    public static final int QUES=127;
    public static final int RBRACE=128;
    public static final int RBRACKET=129;
    public static final int RETURN=130;
    public static final int RPAREN=131;
    public static final int SEMI=132;
    public static final int SHORT=133;
    public static final int SLASH=134;
    public static final int SLASHEQ=135;
    public static final int STAR=136;
    public static final int STAREQ=137;
    public static final int STATIC=138;
    public static final int STRICTFP=139;
    public static final int STRING=140;
    public static final int STRINGLITERAL=141;
    public static final int SUB=142;
    public static final int SUBEQ=143;
    public static final int SUBSUB=144;
    public static final int SUFFIX_EXPR=145;
    public static final int SUPER=146;
    public static final int SWITCH=147;
    public static final int THIS=148;
    public static final int THROW=149;
    public static final int THROWS=150;
    public static final int TILDE=151;
    public static final int TRANSIENT=152;
    public static final int TRUE=153;
    public static final int TRY=154;
    public static final int TS=155;
    public static final int TYPEDEF=156;
    public static final int TYPE_CONSTRAIN=157;
    public static final int TYPE_PARAM=158;
    public static final int TYPE_TAG=159;
    public static final int UNICODE_ESC=160;
    public static final int UNTYPED=161;
    public static final int USING=162;
    public static final int VAR=163;
    public static final int VAR_INIT=164;
    public static final int VOID=165;
    public static final int VOLATILE=166;
    public static final int WHILE=167;
    public static final int WS=168;

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
        this.state.ruleMemo = new HashMap[263+1];
         

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
    // Haxe.g:72:1: module : ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) ;
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

            // Haxe.g:72:17: ( ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) )
            // Haxe.g:72:19: ( myPackage )? ( imports )* ( topLevelDecl )*
            {
            // Haxe.g:72:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:72:19: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module191);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            // Haxe.g:72:30: ( imports )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:72:30: imports
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


            // Haxe.g:72:39: ( topLevelDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CLASS||LA3_0==ENUM||LA3_0==EXTERN||LA3_0==INTERFACE||LA3_0==PRIVATE||LA3_0==TYPEDEF) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Haxe.g:72:39: topLevelDecl
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
            // 72:53: -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
            {
                // Haxe.g:72:56: ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE")
                , root_1);

                // Haxe.g:72:85: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:72:96: ( imports )*
                while ( stream_imports.hasNext() ) {
                    adaptor.addChild(root_1, stream_imports.nextTree());

                }
                stream_imports.reset();

                // Haxe.g:72:105: ( topLevelDecl )*
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
    // Haxe.g:75:1: imports : ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !);
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

            // Haxe.g:75:17: ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !)
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
                    // Haxe.g:75:19: IMPORT ^ filepath SEMI !
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
                    // Haxe.g:76:19: USING ^ filepath SEMI !
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
    // Haxe.g:79:1: myPackage : PACKAGE ^ filepath SEMI !;
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

            // Haxe.g:79:17: ( PACKAGE ^ filepath SEMI !)
            // Haxe.g:79:19: PACKAGE ^ filepath SEMI !
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
    // Haxe.g:82:1: filepath : a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a;
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

            // Haxe.g:82:17: (a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a)
            // Haxe.g:82:19: a= IDENTIFIER (b= DOT d= IDENTIFIER )*
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);


            // Haxe.g:82:32: (b= DOT d= IDENTIFIER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Haxe.g:82:33: b= DOT d= IDENTIFIER
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
            // 82:94: -> $a
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
    // Haxe.g:85:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
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

            // Haxe.g:85:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:85:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
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

            // Haxe.g:85:31: ( LPAREN ( paramList )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Haxe.g:85:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN15_tree = 
                    (Object)adaptor.create(LPAREN15)
                    ;
                    adaptor.addChild(root_0, LPAREN15_tree);
                    }

                    // Haxe.g:85:39: ( paramList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFIER||LA6_0==QUES) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Haxe.g:85:39: paramList
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
    // Haxe.g:88:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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

            // Haxe.g:89:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:89:7: IDENTIFIER
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
                    // Haxe.g:90:7: primitiveType
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
                    // Haxe.g:92:7: COLON metaName
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
    // Haxe.g:95:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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

            // Haxe.g:96:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:96:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:96:7: ( meta )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MONKEYS_AT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Haxe.g:96:8: meta
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


            // Haxe.g:96:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:102:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:102:17: ( PRIVATE | EXTERN )
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
    // Haxe.g:106:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:106:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE )
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


    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declAttrList"
    // Haxe.g:114:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr26 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:114:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:114:19: ( declAttr )+
            {
            // Haxe.g:114:19: ( declAttr )+
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
            	    // Haxe.g:114:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList713);
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
            // 114:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:114:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 10, declAttrList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "declAttrList"


    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramList"
    // Haxe.g:117:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:117:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:117:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList758);
            param27=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param27.getTree());

            // Haxe.g:117:25: ( COMMA param )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:117:26: COMMA param
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList761); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA28);


            	    pushFollow(FOLLOW_param_in_paramList763);
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
            // 117:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:117:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 11, paramList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "paramList"


    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // Haxe.g:120:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // Haxe.g:120:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:120:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:120:19: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:120:19: QUES
                    {
                    QUES30=(Token)match(input,QUES,FOLLOW_QUES_in_param813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES30);


                    }
                    break;

            }


            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param816); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER31);


            // Haxe.g:120:36: ( typeTag )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:120:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param818);
                    typeTag32=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag32.getTree());

                    }
                    break;

            }


            // Haxe.g:120:45: ( varInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:120:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param821);
                    varInit33=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit33.getTree());

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
            // 120:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:120:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER31)
                , root_1);

                // Haxe.g:120:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:120:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:120:114: ( QUES )?
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
            if ( state.backtracking>0 ) { memoize(input, 12, param_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "param"


    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // Haxe.g:123:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER34=null;

        Object IDENTIFIER34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:123:17: ( IDENTIFIER )
            // Haxe.g:123:19: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER34_tree = 
            new VarUsageNode(IDENTIFIER34) 
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
            if ( state.backtracking>0 ) { memoize(input, 13, identifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // Haxe.g:126:1: id : ( identifier | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);

        int id_StartIndex = input.index();

        Object root_0 = null;

        Token THIS36=null;
        HaxeParser.identifier_return identifier35 =null;


        Object THIS36_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:126:17: ( identifier | THIS )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER) ) {
                alt16=1;
            }
            else if ( (LA16_0==THIS) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Haxe.g:126:19: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_id928);
                    identifier35=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:127:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS36=(Token)match(input,THIS,FOLLOW_THIS_in_id948); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS36_tree = 
                    new VarUsageNode(THIS36) 
                    ;
                    adaptor.addChild(root_0, THIS36_tree);
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


    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignOp"
    // Haxe.g:130:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
    public final HaxeParser.assignOp_return assignOp() throws RecognitionException {
        HaxeParser.assignOp_return retval = new HaxeParser.assignOp_return();
        retval.start = input.LT(1);

        int assignOp_StartIndex = input.index();

        Object root_0 = null;

        Token EQ37=null;
        Token PLUSEQ38=null;
        Token SUBEQ39=null;
        Token STAREQ40=null;
        Token SLASHEQ41=null;
        Token PERCENTEQ42=null;
        Token AMPEQ43=null;
        Token BAREQ44=null;
        Token CARETEQ45=null;
        Token LTLTEQ46=null;
        Token GTGTEQ47=null;
        Token GTGTGTEQ48=null;

        Object EQ37_tree=null;
        Object PLUSEQ38_tree=null;
        Object SUBEQ39_tree=null;
        Object STAREQ40_tree=null;
        Object SLASHEQ41_tree=null;
        Object PERCENTEQ42_tree=null;
        Object AMPEQ43_tree=null;
        Object BAREQ44_tree=null;
        Object CARETEQ45_tree=null;
        Object LTLTEQ46_tree=null;
        Object GTGTEQ47_tree=null;
        Object GTGTGTEQ48_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Haxe.g:130:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:130:19: EQ
                    {
                    EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ37);


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
                    // 130:28: -> EQ
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
                    // Haxe.g:131:19: PLUSEQ
                    {
                    PLUSEQ38=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ38);


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
                    // 131:28: -> PLUSEQ
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
                    // Haxe.g:132:19: SUBEQ
                    {
                    SUBEQ39=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1045); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ39);


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
                    // 132:28: -> SUBEQ
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
                    // Haxe.g:133:19: STAREQ
                    {
                    STAREQ40=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAREQ.add(STAREQ40);


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
                    // 133:28: -> STAREQ
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
                    // Haxe.g:134:19: SLASHEQ
                    {
                    SLASHEQ41=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ41);


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
                    // 134:28: -> SLASHEQ
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
                    // Haxe.g:135:19: PERCENTEQ
                    {
                    PERCENTEQ42=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ42);


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
                    // 135:29: -> PERCENTEQ
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
                    // Haxe.g:136:19: AMPEQ
                    {
                    AMPEQ43=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1159); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ43);


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
                    // 136:28: -> AMPEQ
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
                    // Haxe.g:137:19: BAREQ
                    {
                    BAREQ44=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BAREQ.add(BAREQ44);


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
                    // 137:28: -> BAREQ
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
                    // Haxe.g:138:19: CARETEQ
                    {
                    CARETEQ45=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CARETEQ.add(CARETEQ45);


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
                    // 138:28: -> CARETEQ
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
                    // Haxe.g:139:19: LTLTEQ
                    {
                    LTLTEQ46=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1247); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LTLTEQ.add(LTLTEQ46);


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
                    // 139:28: -> LTLTEQ
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
                    // Haxe.g:140:19: GTGTEQ
                    {
                    GTGTEQ47=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1276); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTEQ.add(GTGTEQ47);


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
                    // 140:28: -> GTGTEQ
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
                    // Haxe.g:141:19: GTGTGTEQ
                    {
                    GTGTGTEQ48=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGTEQ.add(GTGTGTEQ48);


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
                    // 141:28: -> GTGTGTEQ
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
            if ( state.backtracking>0 ) { memoize(input, 15, assignOp_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "assignOp"


    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcLit"
    // Haxe.g:144:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
    public final HaxeParser.funcLit_return funcLit() throws RecognitionException {
        HaxeParser.funcLit_return retval = new HaxeParser.funcLit_return();
        retval.start = input.LT(1);

        int funcLit_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION49=null;
        Token LPAREN50=null;
        Token RPAREN52=null;
        HaxeParser.paramList_return paramList51 =null;

        HaxeParser.typeTag_return typeTag53 =null;

        HaxeParser.block_return block54 =null;


        Object FUNCTION49_tree=null;
        Object LPAREN50_tree=null;
        Object RPAREN52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // Haxe.g:144:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:144:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION49=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1361); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION49_tree = 
            new FunctionNode(FUNCTION49) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION49_tree, root_0);
            }

            LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1367); if (state.failed) return retval;

            // Haxe.g:144:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:144:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1370);
                    paramList51=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList51.getTree());

                    }
                    break;

            }


            RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1373); if (state.failed) return retval;

            // Haxe.g:144:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:144:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1376);
                    typeTag53=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag53.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1379);
            block54=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block54.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, funcLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcLit"


    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeTag"
    // Haxe.g:172:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
    public final HaxeParser.typeTag_return typeTag() throws RecognitionException {
        HaxeParser.typeTag_return retval = new HaxeParser.typeTag_return();
        retval.start = input.LT(1);

        int typeTag_StartIndex = input.index();

        Object root_0 = null;

        Token COLON55=null;
        HaxeParser.funcType_return funcType56 =null;


        Object COLON55_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // Haxe.g:172:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:172:19: COLON funcType
            {
            COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1423); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON55);


            pushFollow(FOLLOW_funcType_in_typeTag1425);
            funcType56=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_funcType.add(funcType56.getTree());

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
            // 172:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:172:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
            if ( state.backtracking>0 ) { memoize(input, 17, typeTag_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeTag"


    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeList"
    // Haxe.g:175:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
    public final HaxeParser.typeList_return typeList() throws RecognitionException {
        HaxeParser.typeList_return retval = new HaxeParser.typeList_return();
        retval.start = input.LT(1);

        int typeList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA58=null;
        Token COMMA61=null;
        HaxeParser.funcType_return funcType57 =null;

        HaxeParser.typeList_return typeList59 =null;

        HaxeParser.typeConstraint_return typeConstraint60 =null;

        HaxeParser.typeList_return typeList62 =null;


        Object COMMA58_tree=null;
        Object COMMA61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // Haxe.g:175:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BOOLEAN||LA22_0==DYNAMIC||LA22_0==FLOAT||LA22_0==INT||LA22_0==LBRACE||LA22_0==STRING||LA22_0==VOID) ) {
                alt22=1;
            }
            else if ( (LA22_0==IDENTIFIER) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==COMMA||LA22_2==DOT||LA22_2==GT||LA22_2==LT||LA22_2==MINUS_BIGGER||LA22_2==RPAREN) ) {
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
                    // Haxe.g:175:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1469);
                    funcType57=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType57.getTree());

                    // Haxe.g:175:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:175:29: COMMA ! typeList
                            {
                            COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1472); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1475);
                            typeList59=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList59.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:176:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1497);
                    typeConstraint60=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint60.getTree());

                    // Haxe.g:176:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:176:35: COMMA ! typeList
                            {
                            COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1500); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1503);
                            typeList62=typeList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList62.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 18, typeList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeList"


    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcType"
    // Haxe.g:179:1: funcType : type ( MINUS_BIGGER ! type )* ;
    public final HaxeParser.funcType_return funcType() throws RecognitionException {
        HaxeParser.funcType_return retval = new HaxeParser.funcType_return();
        retval.start = input.LT(1);

        int funcType_StartIndex = input.index();

        Object root_0 = null;

        Token MINUS_BIGGER64=null;
        HaxeParser.type_return type63 =null;

        HaxeParser.type_return type65 =null;


        Object MINUS_BIGGER64_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // Haxe.g:179:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:179:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1538);
            type63=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type63.getTree());

            // Haxe.g:179:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:179:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER64=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1541); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1544);
            	    type65=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type65.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 19, funcType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcType"


    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonType"
    // Haxe.g:182:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) ;
    public final HaxeParser.anonType_return anonType() throws RecognitionException {
        HaxeParser.anonType_return retval = new HaxeParser.anonType_return();
        retval.start = input.LT(1);

        int anonType_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE66=null;
        Token RBRACE68=null;
        HaxeParser.anonTypePart_return anonTypePart67 =null;


        Object LBRACE66_tree=null;
        Object RBRACE68_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_anonTypePart=new RewriteRuleSubtreeStream(adaptor,"rule anonTypePart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

            // Haxe.g:182:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) )
            // Haxe.g:182:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE66=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE66);


            // Haxe.g:182:26: ( anonTypePart )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GT||LA24_0==IDENTIFIER||LA24_0==VAR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:182:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1584);
                    anonTypePart67=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart67.getTree());

                    }
                    break;

            }


            RBRACE68=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1587); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE68);


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
            // 182:47: -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
            {
                // Haxe.g:182:50: ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "AnonType")
                , root_1);

                // Haxe.g:182:83: ( anonTypePart )?
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
            if ( state.backtracking>0 ) { memoize(input, 20, anonType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonType"


    public static class anonTypePart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypePart"
    // Haxe.g:185:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
    public final HaxeParser.anonTypePart_return anonTypePart() throws RecognitionException {
        HaxeParser.anonTypePart_return retval = new HaxeParser.anonTypePart_return();
        retval.start = input.LT(1);

        int anonTypePart_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA72=null;
        HaxeParser.anonTypeFieldList_return anonTypeFieldList69 =null;

        HaxeParser.varDecl_return varDecl70 =null;

        HaxeParser.typeExtend_return typeExtend71 =null;

        HaxeParser.anonTypeFieldList_return anonTypeFieldList73 =null;

        HaxeParser.varDecl_return varDecl74 =null;


        Object COMMA72_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

            // Haxe.g:185:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
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
                    // Haxe.g:185:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1628);
                    anonTypeFieldList69=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList69.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:186:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:186:19: ( varDecl )+
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
                    	    // Haxe.g:186:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1648);
                    	    varDecl70=varDecl();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl70.getTree());

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
                    // Haxe.g:187:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1669);
                    typeExtend71=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend71.getTree());

                    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1671); if (state.failed) return retval;

                    // Haxe.g:187:37: ( anonTypeFieldList | ( varDecl )+ )?
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
                            // Haxe.g:187:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1676);
                            anonTypeFieldList73=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList73.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:187:59: ( varDecl )+
                            {
                            // Haxe.g:187:59: ( varDecl )+
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
                            	    // Haxe.g:187:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1680);
                            	    varDecl74=varDecl();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl74.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 21, anonTypePart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypePart"


    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeFieldList"
    // Haxe.g:190:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
    public final HaxeParser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        HaxeParser.anonTypeFieldList_return retval = new HaxeParser.anonTypeFieldList_return();
        retval.start = input.LT(1);

        int anonTypeFieldList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA76=null;
        HaxeParser.anonTypeField_return anonTypeField75 =null;

        HaxeParser.anonTypeField_return anonTypeField77 =null;


        Object COMMA76_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_anonTypeField=new RewriteRuleSubtreeStream(adaptor,"rule anonTypeField");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

            // Haxe.g:191:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:191:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1730);
            anonTypeField75=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField75.getTree());

            // Haxe.g:191:33: ( COMMA anonTypeField )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:191:34: COMMA anonTypeField
            	    {
            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1733); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1735);
            	    anonTypeField77=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField77.getTree());

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
            // 191:56: -> ( anonTypeField )+
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
            if ( state.backtracking>0 ) { memoize(input, 22, anonTypeFieldList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeFieldList"


    public static class primitiveType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primitiveType"
    // Haxe.g:194:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set78=null;

        Object set78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:194:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set78=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DYNAMIC||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set78)
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
            if ( state.backtracking>0 ) { memoize(input, 23, primitiveType_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primitiveType"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // Haxe.g:197:1: type : ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? ;
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.primitiveType_return primitiveType79 =null;

        HaxeParser.filepath_return filepath80 =null;

        HaxeParser.anonType_return anonType81 =null;

        HaxeParser.typeParam_return typeParam82 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:197:17: ( ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:197:19: ( primitiveType ^| filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:197:19: ( primitiveType ^| filepath ^| anonType ^)
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
                    // Haxe.g:197:20: primitiveType ^
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1830);
                    primitiveType79=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType79.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:197:37: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1835);
                    filepath80=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath80.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // Haxe.g:197:49: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1840);
                    anonType81=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType81.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:197:61: ( typeParam )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LT) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred57_Haxe()) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // Haxe.g:197:61: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1845);
                    typeParam82=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam82.getTree());

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
    // Haxe.g:200:1: typeParam : LT typeList ( typeParam )? GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) ;
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT83=null;
        Token GT86=null;
        HaxeParser.typeList_return typeList84 =null;

        HaxeParser.typeParam_return typeParam85 =null;


        Object LT83_tree=null;
        Object GT86_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:200:17: ( LT typeList ( typeParam )? GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            // Haxe.g:200:19: LT typeList ( typeParam )? GT
            {
            LT83=(Token)match(input,LT,FOLLOW_LT_in_typeParam1881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LT.add(LT83);


            pushFollow(FOLLOW_typeList_in_typeParam1883);
            typeList84=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList84.getTree());

            // Haxe.g:200:31: ( typeParam )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:200:31: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParam1885);
                    typeParam85=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam85.getTree());

                    }
                    break;

            }


            GT86=(Token)match(input,GT,FOLLOW_GT_in_typeParam1888); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GT.add(GT86);


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
            // 200:45: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
            {
                // Haxe.g:200:48: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_typeList.nextTree());

                // Haxe.g:200:94: ( typeParam )?
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

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeConstraint"
    // Haxe.g:203:1: typeConstraint : identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token COLON88=null;
        Token LPAREN89=null;
        Token RPAREN91=null;
        HaxeParser.identifier_return identifier87 =null;

        HaxeParser.typeList_return typeList90 =null;


        Object COLON88_tree=null;
        Object LPAREN89_tree=null;
        Object RPAREN91_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:204:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:204:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint1939);
            identifier87=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier87.getTree());

            COLON88=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON88);


            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);


            pushFollow(FOLLOW_typeList_in_typeConstraint1945);
            typeList90=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList90.getTree());

            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN91);


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
            // 204:47: -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
            {
                // Haxe.g:204:50: ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_CONSTRAIN, "TYPE_CONSTRAIN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Haxe.g:204:106: ( typeList )?
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


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // Haxe.g:208:1: statement : ( block | IF ^ parExpression statement ( ELSE ! statement )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) );
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token IF93=null;
        Token ELSE96=null;
        Token FOR98=null;
        Token LPAREN99=null;
        Token IN101=null;
        Token RPAREN103=null;
        Token WHILE105=null;
        Token DO108=null;
        Token WHILE110=null;
        Token SEMI112=null;
        Token TRY113=null;
        Token SWITCH116=null;
        Token LPAREN117=null;
        Token RPAREN119=null;
        Token LBRACE120=null;
        Token RBRACE122=null;
        Token RETURN123=null;
        Token SEMI125=null;
        Token THROW126=null;
        Token SEMI128=null;
        Token set129=null;
        Token SEMI130=null;
        Token SEMI132=null;
        Token IDENTIFIER133=null;
        Token COLON134=null;
        HaxeParser.block_return block92 =null;

        HaxeParser.parExpression_return parExpression94 =null;

        HaxeParser.statement_return statement95 =null;

        HaxeParser.statement_return statement97 =null;

        HaxeParser.expr_return expr100 =null;

        HaxeParser.iterExpr_return iterExpr102 =null;

        HaxeParser.statement_return statement104 =null;

        HaxeParser.parExpression_return parExpression106 =null;

        HaxeParser.statement_return statement107 =null;

        HaxeParser.statement_return statement109 =null;

        HaxeParser.parExpression_return parExpression111 =null;

        HaxeParser.block_return block114 =null;

        HaxeParser.catchStmt_return catchStmt115 =null;

        HaxeParser.expr_return expr118 =null;

        HaxeParser.caseStmt_return caseStmt121 =null;

        HaxeParser.expr_return expr124 =null;

        HaxeParser.expr_return expr127 =null;

        HaxeParser.expr_return expr131 =null;

        HaxeParser.statement_return statement135 =null;


        Object IF93_tree=null;
        Object ELSE96_tree=null;
        Object FOR98_tree=null;
        Object LPAREN99_tree=null;
        Object IN101_tree=null;
        Object RPAREN103_tree=null;
        Object WHILE105_tree=null;
        Object DO108_tree=null;
        Object WHILE110_tree=null;
        Object SEMI112_tree=null;
        Object TRY113_tree=null;
        Object SWITCH116_tree=null;
        Object LPAREN117_tree=null;
        Object RPAREN119_tree=null;
        Object LBRACE120_tree=null;
        Object RBRACE122_tree=null;
        Object RETURN123_tree=null;
        Object SEMI125_tree=null;
        Object THROW126_tree=null;
        Object SEMI128_tree=null;
        Object set129_tree=null;
        Object SEMI130_tree=null;
        Object SEMI132_tree=null;
        Object IDENTIFIER133_tree=null;
        Object COLON134_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:208:17: ( block | IF ^ parExpression statement ( ELSE ! statement )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) )
            int alt37=12;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA37_1 = input.LA(2);

                if ( (synpred59_Haxe()) ) {
                    alt37=1;
                }
                else if ( (synpred74_Haxe()) ) {
                    alt37=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt37=2;
                }
                break;
            case FOR:
                {
                alt37=3;
                }
                break;
            case WHILE:
                {
                alt37=4;
                }
                break;
            case DO:
                {
                alt37=5;
                }
                break;
            case TRY:
                {
                alt37=6;
                }
                break;
            case SWITCH:
                {
                alt37=7;
                }
                break;
            case RETURN:
                {
                alt37=8;
                }
                break;
            case THROW:
                {
                alt37=9;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt37=10;
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
                alt37=11;
                }
                break;
            case IDENTIFIER:
                {
                int LA37_29 = input.LA(2);

                if ( (synpred74_Haxe()) ) {
                    alt37=11;
                }
                else if ( (true) ) {
                    alt37=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 29, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // Haxe.g:208:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1987);
                    block92=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block92.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:209:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF93=(Token)match(input,IF,FOLLOW_IF_in_statement2007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF93_tree = 
                    new IfNode(IF93) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF93_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2013);
                    parExpression94=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression94.getTree());

                    pushFollow(FOLLOW_statement_in_statement2015);
                    statement95=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement95.getTree());

                    // Haxe.g:209:55: ( ELSE ! statement )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ELSE) ) {
                        int LA33_1 = input.LA(2);

                        if ( (synpred60_Haxe()) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:209:56: ELSE ! statement
                            {
                            ELSE96=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2018); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2021);
                            statement97=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement97.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:210:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR98=(Token)match(input,FOR,FOLLOW_FOR_in_statement2043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR98_tree = 
                    new ForNode(FOR98) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR98_tree, root_0);
                    }

                    LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2049); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2052);
                    expr100=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr100.getTree());

                    IN101=(Token)match(input,IN,FOLLOW_IN_in_statement2054); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statement2057);
                    iterExpr102=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr102.getTree());

                    RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2059); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement2062);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement104.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:211:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE105=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2082); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE105_tree = 
                    new WhileNode(WHILE105) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE105_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2088);
                    parExpression106=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression106.getTree());

                    pushFollow(FOLLOW_statement_in_statement2090);
                    statement107=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement107.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:212:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO108=(Token)match(input,DO,FOLLOW_DO_in_statement2110); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO108_tree = 
                    new DoWhileNode(DO108) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO108_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2116);
                    statement109=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement109.getTree());

                    WHILE110=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2118); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2121);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression111.getTree());

                    SEMI112=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2123); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:213:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY113=(Token)match(input,TRY,FOLLOW_TRY_in_statement2144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY113_tree = 
                    new TryNode(TRY113) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY113_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2150);
                    block114=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block114.getTree());

                    // Haxe.g:213:39: ( catchStmt )+
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
                    	    // Haxe.g:213:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2152);
                    	    catchStmt115=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt115.getTree());

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
                case 7 :
                    // Haxe.g:214:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH116=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH116_tree = 
                    new SwitchNode(SWITCH116) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH116_tree, root_0);
                    }

                    LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2179); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2182);
                    expr118=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

                    RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2184); if (state.failed) return retval;

                    LBRACE120=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2187); if (state.failed) return retval;

                    // Haxe.g:214:68: ( caseStmt )+
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
                    	    // Haxe.g:214:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2190);
                    	    caseStmt121=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt121.getTree());

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


                    RBRACE122=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2193); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:215:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN123=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2214); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN123_tree = 
                    new ReturnNode(RETURN123) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN123_tree, root_0);
                    }

                    // Haxe.g:215:39: ( expr )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==BANG||LA36_0==CAST||LA36_0==CHARLITERAL||LA36_0==FALSE||LA36_0==FLOATNUM||LA36_0==FUNCTION||LA36_0==IDENTIFIER||LA36_0==INTLITERAL||(LA36_0 >= LBRACE && LA36_0 <= LBRACKET)||LA36_0==LONGLITERAL||(LA36_0 >= NEW && LA36_0 <= NULL)||LA36_0==PLUSPLUS||(LA36_0 >= STRINGLITERAL && LA36_0 <= SUB)||LA36_0==SUBSUB||LA36_0==THIS||LA36_0==TILDE||LA36_0==TRUE||LA36_0==UNTYPED) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Haxe.g:215:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2220);
                            expr124=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());

                            }
                            break;

                    }


                    SEMI125=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2223); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:216:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW126=(Token)match(input,THROW,FOLLOW_THROW_in_statement2244); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW126_tree = 
                    (Object)adaptor.create(THROW126)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW126_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2247);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

                    SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2249); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:217:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set129=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set129)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI130=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2278); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:218:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2299);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

                    SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2301); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:219:7: IDENTIFIER COLON statement
                    {
                    IDENTIFIER133=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER133);


                    COLON134=(Token)match(input,COLON,FOLLOW_COLON_in_statement2312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON134);


                    pushFollow(FOLLOW_statement_in_statement2314);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());

                    // AST REWRITE
                    // elements: COLON, IDENTIFIER, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:50: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:219:53: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:219:61: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:219:73: ( statement )?
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
    // Haxe.g:222:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN136=null;
        Token RPAREN138=null;
        HaxeParser.expr_return expr137 =null;


        Object LPAREN136_tree=null;
        Object RPAREN138_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:222:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:222:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2360); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2363);
            expr137=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr137.getTree());

            RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2365); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:225:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) ;
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE139=null;
        Token RBRACE141=null;
        HaxeParser.blockStmt_return blockStmt140 =null;


        Object LBRACE139_tree=null;
        Object RBRACE141_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:225:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:225:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE139=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2401); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE139);


            // Haxe.g:225:26: ( blockStmt )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==BANG||LA38_0==BREAK||LA38_0==CAST||(LA38_0 >= CHARLITERAL && LA38_0 <= CLASS)||LA38_0==CONTINUE||LA38_0==DO||LA38_0==EXTERN||LA38_0==FALSE||(LA38_0 >= FLOATNUM && LA38_0 <= FUNCTION)||(LA38_0 >= IDENTIFIER && LA38_0 <= IF)||LA38_0==INTLITERAL||(LA38_0 >= LBRACE && LA38_0 <= LBRACKET)||LA38_0==LONGLITERAL||(LA38_0 >= NEW && LA38_0 <= NULL)||LA38_0==PLUSPLUS||LA38_0==PRIVATE||LA38_0==RETURN||(LA38_0 >= STRINGLITERAL && LA38_0 <= SUB)||LA38_0==SUBSUB||(LA38_0 >= SWITCH && LA38_0 <= THROW)||LA38_0==TILDE||(LA38_0 >= TRUE && LA38_0 <= TRY)||LA38_0==UNTYPED||LA38_0==VAR||LA38_0==WHILE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Haxe.g:225:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2404);
            	    blockStmt140=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt140.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            RBRACE141=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE141);


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
            // 225:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
            {
                // Haxe.g:225:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE139, RBRACE141)
                , root_1);

                // Haxe.g:225:97: ( blockStmt )*
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
    // Haxe.g:228:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl142 =null;

        HaxeParser.classDecl_return classDecl143 =null;

        HaxeParser.statement_return statement144 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:228:17: ( varDecl | classDecl | statement )
            int alt39=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt39=1;
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
            case LBRACKET:
            case LONGLITERAL:
            case NEW:
            case NULL:
            case PLUSPLUS:
            case RETURN:
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
                    // Haxe.g:228:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2452);
                    varDecl142=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl142.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:229:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2463);
                    classDecl143=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl143.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:230:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2474);
                    statement144=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement144.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:233:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE145=null;
        Token COLON147=null;
        Token DEFAULT149=null;
        Token COLON150=null;
        HaxeParser.exprList_return exprList146 =null;

        HaxeParser.statement_return statement148 =null;

        HaxeParser.statement_return statement151 =null;


        Object CASE145_tree=null;
        Object COLON147_tree=null;
        Object DEFAULT149_tree=null;
        Object COLON150_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:233:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:233:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE145=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE145_tree = 
                    (Object)adaptor.create(CASE145)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE145_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2501);
                    exprList146=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList146.getTree());

                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2503); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2506);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement148.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:234:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT149=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT149_tree = 
                    (Object)adaptor.create(DEFAULT149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT149_tree, root_0);
                    }

                    COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2529); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2532);
                    statement151=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement151.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:237:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH152=null;
        Token LPAREN153=null;
        Token RPAREN155=null;
        HaxeParser.param_return param154 =null;

        HaxeParser.block_return block156 =null;


        Object CATCH152_tree=null;
        Object LPAREN153_tree=null;
        Object RPAREN155_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:237:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:237:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH152=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH152_tree = 
            new HaxeTree(CATCH152) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH152_tree, root_0);
            }

            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2573); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2576);
            param154=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param154.getTree());

            RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2578); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2581);
            block156=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block156.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:241:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA158=null;
        HaxeParser.expr_return expr157 =null;

        HaxeParser.expr_return expr159 =null;


        Object COMMA158_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:241:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:241:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2619);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            // Haxe.g:241:24: ( COMMA ! expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Haxe.g:241:25: COMMA ! expr
            	    {
            	    COMMA158=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2622); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2625);
            	    expr159=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr159.getTree());

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
    // Haxe.g:244:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED160=null;
        HaxeParser.assignExpr_return assignExpr161 =null;

        HaxeParser.assignExpr_return assignExpr162 =null;


        Object UNTYPED160_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:244:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==UNTYPED) ) {
                alt42=1;
            }
            else if ( (LA42_0==BANG||LA42_0==CAST||LA42_0==CHARLITERAL||LA42_0==FALSE||LA42_0==FLOATNUM||LA42_0==FUNCTION||LA42_0==IDENTIFIER||LA42_0==INTLITERAL||(LA42_0 >= LBRACE && LA42_0 <= LBRACKET)||LA42_0==LONGLITERAL||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||LA42_0==THIS||LA42_0==TILDE||LA42_0==TRUE) ) {
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
                    // Haxe.g:244:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED160=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2667); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED160_tree = 
                    (Object)adaptor.create(UNTYPED160)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED160_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2670);
                    assignExpr161=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr161.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:245:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2690);
                    assignExpr162=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr162.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:248:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.ternaryExpr_return ternaryExpr163 =null;

        HaxeParser.assignOp_return assignOp164 =null;

        HaxeParser.ternaryExpr_return ternaryExpr165 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:248:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:248:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2720);
            ternaryExpr163=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr163.getTree());

            // Haxe.g:248:31: ( assignOp ^ ternaryExpr )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AMPEQ||LA43_0==BAREQ||LA43_0==CARETEQ||LA43_0==EQ||LA43_0==GTGTEQ||LA43_0==GTGTGTEQ||LA43_0==LTLTEQ||LA43_0==PERCENTEQ||LA43_0==PLUSEQ||LA43_0==SLASHEQ||LA43_0==STAREQ||LA43_0==SUBEQ) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Haxe.g:248:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2723);
                    assignOp164=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp164.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2726);
                    ternaryExpr165=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr165.getTree());

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
    // Haxe.g:251:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES167=null;
        Token COLON169=null;
        HaxeParser.logicOrExpr_return logicOrExpr166 =null;

        HaxeParser.expr_return expr168 =null;

        HaxeParser.ternaryExpr_return ternaryExpr170 =null;


        Object QUES167_tree=null;
        Object COLON169_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:251:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:251:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2757);
            logicOrExpr166=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr166.getTree());

            // Haxe.g:251:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUES) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Haxe.g:251:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES167=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2760); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES167_tree = 
                    (Object)adaptor.create(QUES167)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES167_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2763);
                    expr168=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr168.getTree());

                    COLON169=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2765); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2768);
                    ternaryExpr170=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr170.getTree());

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
    // Haxe.g:254:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR172=null;
        HaxeParser.logicAndExpr_return logicAndExpr171 =null;

        HaxeParser.logicAndExpr_return logicAndExpr173 =null;


        Object BARBAR172_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:254:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:254:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2799);
            logicAndExpr171=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr171.getTree());

            // Haxe.g:254:32: ( BARBAR ^ logicAndExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BARBAR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:254:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR172=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2802); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR172_tree = 
            	    new BinaryExpressionNode(BARBAR172) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR172_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2808);
            	    logicAndExpr173=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr173.getTree());

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
    // Haxe.g:257:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP175=null;
        HaxeParser.iterExpr_return iterExpr174 =null;

        HaxeParser.iterExpr_return iterExpr176 =null;


        Object AMPAMP175_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:257:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:257:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr2842);
            iterExpr174=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr174.getTree());

            // Haxe.g:257:27: ( AMPAMP ^ iterExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AMPAMP) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:257:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP175=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2844); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP175_tree = 
            	    new BinaryExpressionNode(AMPAMP175) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP175_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr2850);
            	    iterExpr176=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr176.getTree());

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
    // Haxe.g:260:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS178=null;
        HaxeParser.cmpExpr_return cmpExpr177 =null;

        HaxeParser.cmpExpr_return cmpExpr179 =null;


        Object ELLIPSIS178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:260:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:260:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr2900);
            cmpExpr177=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr177.getTree());

            // Haxe.g:260:27: ( ELLIPSIS ^ cmpExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ELLIPSIS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:260:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS178=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2903); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS178_tree = 
                    new BinaryExpressionNode(ELLIPSIS178) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS178_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr2909);
                    cmpExpr179=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr179.getTree());

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
    // Haxe.g:263:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ181=null;
        Token BANGEQ182=null;
        Token GTEQ183=null;
        Token LTEQ184=null;
        Token GT185=null;
        Token LT186=null;
        HaxeParser.bitExpr_return bitExpr180 =null;

        HaxeParser.bitExpr_return bitExpr187 =null;


        Object EQEQ181_tree=null;
        Object BANGEQ182_tree=null;
        Object GTEQ183_tree=null;
        Object LTEQ184_tree=null;
        Object GT185_tree=null;
        Object LT186_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:263:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:263:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2948);
            bitExpr180=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr180.getTree());

            // Haxe.g:263:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BANGEQ||LA49_0==EQEQ||(LA49_0 >= GT && LA49_0 <= GTEQ)||(LA49_0 >= LT && LA49_0 <= LTEQ)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:263:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:263:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:264:23: EQEQ ^
            	            {
            	            EQEQ181=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2975); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ181_tree = 
            	            new BinaryExpressionNode(EQEQ181) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ181_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:265:23: BANGEQ ^
            	            {
            	            BANGEQ182=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3004); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ182_tree = 
            	            new BinaryExpressionNode(BANGEQ182) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ182_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:266:23: GTEQ ^
            	            {
            	            GTEQ183=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3033); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ183_tree = 
            	            new BinaryExpressionNode(GTEQ183) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ183_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:267:23: LTEQ ^
            	            {
            	            LTEQ184=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3062); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ184_tree = 
            	            new BinaryExpressionNode(LTEQ184) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ184_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:268:23: GT ^
            	            {
            	            GT185=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3091); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT185_tree = 
            	            new BinaryExpressionNode(GT185) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT185_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:269:23: LT ^
            	            {
            	            LT186=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3120); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT186_tree = 
            	            new BinaryExpressionNode(LT186) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT186_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3127);
            	    bitExpr187=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr187.getTree());

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
    // Haxe.g:272:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR189=null;
        Token AMP190=null;
        Token CARET191=null;
        HaxeParser.shiftExpr_return shiftExpr188 =null;

        HaxeParser.shiftExpr_return shiftExpr192 =null;


        Object BAR189_tree=null;
        Object AMP190_tree=null;
        Object CARET191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:272:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:272:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3166);
            shiftExpr188=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr188.getTree());

            // Haxe.g:272:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AMP||LA51_0==BAR||LA51_0==CARET) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:272:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:272:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:273:23: BAR ^
            	            {
            	            BAR189=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3193); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR189_tree = 
            	            new BinaryExpressionNode(BAR189) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:274:23: AMP ^
            	            {
            	            AMP190=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3222); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP190_tree = 
            	            new BinaryExpressionNode(AMP190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:275:23: CARET ^
            	            {
            	            CARET191=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3251); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET191_tree = 
            	            new BinaryExpressionNode(CARET191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET191_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3258);
            	    shiftExpr192=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr192.getTree());

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
    // Haxe.g:278:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT194=null;
        Token GTGT195=null;
        Token GTGTGT196=null;
        HaxeParser.addExpr_return addExpr193 =null;

        HaxeParser.addExpr_return addExpr197 =null;


        Object LTLT194_tree=null;
        Object GTGT195_tree=null;
        Object GTGTGT196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:278:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:278:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3291);
            addExpr193=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr193.getTree());

            // Haxe.g:278:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GTGT||LA53_0==GTGTGT||LA53_0==LTLT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:278:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:278:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:279:23: LTLT ^
            	            {
            	            LTLT194=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3318); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT194_tree = 
            	            new BinaryExpressionNode(LTLT194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:280:23: GTGT ^
            	            {
            	            GTGT195=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3347); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT195_tree = 
            	            new BinaryExpressionNode(GTGT195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:281:23: GTGTGT ^
            	            {
            	            GTGTGT196=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3376); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT196_tree = 
            	            new BinaryExpressionNode(GTGTGT196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT196_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3383);
            	    addExpr197=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr197.getTree());

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
    // Haxe.g:284:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS199=null;
        Token SUB200=null;
        HaxeParser.multExpr_return multExpr198 =null;

        HaxeParser.multExpr_return multExpr201 =null;


        Object PLUS199_tree=null;
        Object SUB200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:284:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:284:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3418);
            multExpr198=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr198.getTree());

            // Haxe.g:284:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==PLUS||LA55_0==SUB) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:284:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:284:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:285:23: PLUS ^
            	            {
            	            PLUS199=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3445); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS199_tree = 
            	            new BinaryExpressionNode(PLUS199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS199_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:286:23: SUB ^
            	            {
            	            SUB200=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3474); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB200_tree = 
            	            new BinaryExpressionNode(SUB200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB200_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3481);
            	    multExpr201=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr201.getTree());

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
    // Haxe.g:289:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR203=null;
        Token SLASH204=null;
        Token PERCENT205=null;
        HaxeParser.unarExpr_return unarExpr202 =null;

        HaxeParser.unarExpr_return unarExpr206 =null;


        Object STAR203_tree=null;
        Object SLASH204_tree=null;
        Object PERCENT205_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:289:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:289:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3520);
            unarExpr202=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr202.getTree());

            // Haxe.g:289:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PERCENT||LA57_0==SLASH||LA57_0==STAR) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:289:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:289:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:290:23: STAR ^
            	            {
            	            STAR203=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3547); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR203_tree = 
            	            new BinaryExpressionNode(STAR203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:291:23: SLASH ^
            	            {
            	            SLASH204=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3576); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH204_tree = 
            	            new BinaryExpressionNode(SLASH204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:292:23: PERCENT ^
            	            {
            	            PERCENT205=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3605); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT205_tree = 
            	            new BinaryExpressionNode(PERCENT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3612);
            	    unarExpr206=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr206.getTree());

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
    // Haxe.g:295:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB207=null;
        Token SUBSUB208=null;
        Token PLUSPLUS209=null;
        Token BANG210=null;
        Token TILDE211=null;
        Token PLUSPLUS214=null;
        Token SUBSUB215=null;
        HaxeParser.prefixExpr_return prefixExpr212 =null;

        HaxeParser.prefixExpr_return prefixExpr213 =null;


        Object SUB207_tree=null;
        Object SUBSUB208_tree=null;
        Object PLUSPLUS209_tree=null;
        Object BANG210_tree=null;
        Object TILDE211_tree=null;
        Object PLUSPLUS214_tree=null;
        Object SUBSUB215_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:295:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BANG||LA60_0==PLUSPLUS||LA60_0==SUB||LA60_0==SUBSUB||LA60_0==TILDE) ) {
                alt60=1;
            }
            else if ( (LA60_0==CAST||LA60_0==CHARLITERAL||LA60_0==FALSE||LA60_0==FLOATNUM||LA60_0==FUNCTION||LA60_0==IDENTIFIER||LA60_0==INTLITERAL||(LA60_0 >= LBRACE && LA60_0 <= LBRACKET)||LA60_0==LONGLITERAL||(LA60_0 >= NEW && LA60_0 <= NULL)||LA60_0==STRINGLITERAL||LA60_0==THIS||LA60_0==TRUE) ) {
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
                    // Haxe.g:295:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:295:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:296:13: SUB ^
                            {
                            SUB207=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3660); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB207_tree = 
                            new UnarExpressionNode(SUB207) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB207_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:297:13: SUBSUB ^
                            {
                            SUBSUB208=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3679); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB208_tree = 
                            new UnarExpressionNode(SUBSUB208) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB208_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:298:13: PLUSPLUS ^
                            {
                            PLUSPLUS209=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3698); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS209_tree = 
                            new UnarExpressionNode(PLUSPLUS209) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS209_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:299:13: BANG ^
                            {
                            BANG210=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3717); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG210_tree = 
                            new UnarExpressionNode(BANG210) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG210_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:300:13: TILDE ^
                            {
                            TILDE211=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3736); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE211_tree = 
                            new UnarExpressionNode(TILDE211) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE211_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3743);
                    prefixExpr212=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr212.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:301:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3763);
                    prefixExpr213=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

                    // Haxe.g:301:30: ( PLUSPLUS ^| SUBSUB ^)?
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
                            // Haxe.g:301:31: PLUSPLUS ^
                            {
                            PLUSPLUS214=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3766); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS214_tree = 
                            new UnarExpressionNode(PLUSPLUS214) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS214_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:301:61: SUBSUB ^
                            {
                            SUBSUB215=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3772); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB215_tree = 
                            new UnarExpressionNode(SUBSUB215) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB215_tree, root_0);
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
    // Haxe.g:304:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW216=null;
        Token LPAREN218=null;
        Token RPAREN220=null;
        Token CAST221=null;
        Token LPAREN222=null;
        Token COMMA224=null;
        Token RPAREN226=null;
        HaxeParser.type_return type217 =null;

        HaxeParser.exprList_return exprList219 =null;

        HaxeParser.expr_return expr223 =null;

        HaxeParser.funcType_return funcType225 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice227 =null;


        Object NEW216_tree=null;
        Object LPAREN218_tree=null;
        Object RPAREN220_tree=null;
        Object CAST221_tree=null;
        Object LPAREN222_tree=null;
        Object COMMA224_tree=null;
        Object RPAREN226_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:304:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
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
            case LBRACKET:
            case LONGLITERAL:
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
                    // Haxe.g:304:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW216=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW216_tree = 
                    (Object)adaptor.create(NEW216)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW216_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3817);
                    type217=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type217.getTree());

                    LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3819); if (state.failed) return retval;

                    // Haxe.g:304:37: ( exprList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==BANG||LA61_0==CAST||LA61_0==CHARLITERAL||LA61_0==FALSE||LA61_0==FLOATNUM||LA61_0==FUNCTION||LA61_0==IDENTIFIER||LA61_0==INTLITERAL||(LA61_0 >= LBRACE && LA61_0 <= LBRACKET)||LA61_0==LONGLITERAL||(LA61_0 >= NEW && LA61_0 <= NULL)||LA61_0==PLUSPLUS||(LA61_0 >= STRINGLITERAL && LA61_0 <= SUB)||LA61_0==SUBSUB||LA61_0==THIS||LA61_0==TILDE||LA61_0==TRUE||LA61_0==UNTYPED) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:304:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr3822);
                            exprList219=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList219.getTree());

                            }
                            break;

                    }


                    RPAREN220=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3825); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:305:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST221=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST221_tree = 
                    (Object)adaptor.create(CAST221)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST221_tree, root_0);
                    }

                    LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3849); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3852);
                    expr223=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr223.getTree());

                    // Haxe.g:305:38: ( COMMA ! funcType )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==COMMA) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:305:39: COMMA ! funcType
                            {
                            COMMA224=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3855); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3858);
                            funcType225=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType225.getTree());

                            }
                            break;

                    }


                    RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3862); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:306:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3883);
                    methodCallOrSlice227=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice227.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:309:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN229=null;
        Token RPAREN231=null;
        Token LBRACKET234=null;
        Token RBRACKET236=null;
        HaxeParser.value_return value228 =null;

        HaxeParser.exprList_return exprList230 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice232 =null;

        HaxeParser.value_return value233 =null;

        HaxeParser.expr_return expr235 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice237 =null;

        HaxeParser.value_return value238 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice239 =null;

        HaxeParser.value_return value240 =null;


        Object LPAREN229_tree=null;
        Object RPAREN231_tree=null;
        Object LBRACKET234_tree=null;
        Object RBRACKET236_tree=null;
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

            // Haxe.g:310:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt67=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case LBRACKET:
                {
                int LA67_3 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case LONGLITERAL:
                {
                int LA67_4 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case NULL:
                {
                int LA67_5 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case INTLITERAL:
                {
                int LA67_6 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case STRINGLITERAL:
                {
                int LA67_7 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case CHARLITERAL:
                {
                int LA67_8 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case FLOATNUM:
                {
                int LA67_9 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case TRUE:
                {
                int LA67_10 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
            case FALSE:
                {
                int LA67_11 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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

                if ( (synpred116_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred119_Haxe()) ) {
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
                    // Haxe.g:310:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3941);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value228.getTree());

                    LPAREN229=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN229);


                    // Haxe.g:310:32: ( exprList )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==BANG||LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||(LA64_0 >= LBRACE && LA64_0 <= LBRACKET)||LA64_0==LONGLITERAL||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==PLUSPLUS||(LA64_0 >= STRINGLITERAL && LA64_0 <= SUB)||LA64_0==SUBSUB||LA64_0==THIS||LA64_0==TILDE||LA64_0==TRUE||LA64_0==UNTYPED) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:310:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice3945);
                            exprList230=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList230.getTree());

                            }
                            break;

                    }


                    RPAREN231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3948); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN231);


                    // Haxe.g:310:49: ( pureCallOrSlice )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DOT||LA65_0==LBRACKET) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:310:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3950);
                            pureCallOrSlice232=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice232.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: pureCallOrSlice, value, exprList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:13: -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:311:16: ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new MethodCallNode(CALL_OR_SLICE, LPAREN229, RPAREN231)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:311:72: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:311:82: ( pureCallOrSlice )?
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
                    // Haxe.g:312:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4001);
                    value233=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value233.getTree());

                    LBRACKET234=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET234);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4005);
                    expr235=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr235.getTree());

                    RBRACKET236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET236);


                    // Haxe.g:312:48: ( pureCallOrSlice )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DOT||LA66_0==LBRACKET) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:312:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4009);
                            pureCallOrSlice237=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice237.getTree());

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
                    // 313:13: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:313:16: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET234, RBRACKET236, false)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:313:83: ( pureCallOrSlice )?
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
                    // Haxe.g:314:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4060);
                    value238=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value238.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4063);
                    pureCallOrSlice239=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice239.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:315:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4084);
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
    // Haxe.g:318:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET241=null;
        Token RBRACKET243=null;
        Token DOT245=null;
        HaxeParser.expr_return expr242 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice244 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice246 =null;


        Object LBRACKET241_tree=null;
        Object RBRACKET243_tree=null;
        Object DOT245_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:318:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LBRACKET) ) {
                alt70=1;
            }
            else if ( (LA70_0==DOT) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // Haxe.g:318:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET241=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4109); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET241);


                    // Haxe.g:318:28: ( expr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG||LA68_0==CAST||LA68_0==CHARLITERAL||LA68_0==FALSE||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||(LA68_0 >= LBRACE && LA68_0 <= LBRACKET)||LA68_0==LONGLITERAL||(LA68_0 >= NEW && LA68_0 <= NULL)||LA68_0==PLUSPLUS||(LA68_0 >= STRINGLITERAL && LA68_0 <= SUB)||LA68_0==SUBSUB||LA68_0==THIS||LA68_0==TILDE||LA68_0==TRUE||LA68_0==UNTYPED) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:318:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4111);
                            expr242=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr242.getTree());

                            }
                            break;

                    }


                    RBRACKET243=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET243);


                    // Haxe.g:318:43: ( pureCallOrSlice )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DOT||LA69_0==LBRACKET) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:318:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4116);
                            pureCallOrSlice244=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice244.getTree());

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
                    // 318:60: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:318:63: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET241, RBRACKET243, true)
                        , root_1);

                        // Haxe.g:319:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:319:76: ( pureCallOrSlice )?
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
                    // Haxe.g:320:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT245=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT245_tree = 
                    (Object)adaptor.create(DOT245)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT245_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4173);
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
            if ( state.backtracking>0 ) { memoize(input, 48, pureCallOrSlice_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "pureCallOrSlice"


    public static class arrayObj_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayObj"
    // Haxe.g:323:1: arrayObj : LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) ;
    public final HaxeParser.arrayObj_return arrayObj() throws RecognitionException {
        HaxeParser.arrayObj_return retval = new HaxeParser.arrayObj_return();
        retval.start = input.LT(1);

        int arrayObj_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET247=null;
        Token RBRACKET249=null;
        HaxeParser.exprList_return exprList248 =null;


        Object LBRACKET247_tree=null;
        Object RBRACKET249_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:323:17: ( LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) )
            // Haxe.g:323:19: LBRACKET ( exprList )? RBRACKET
            {
            LBRACKET247=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayObj4205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET247);


            // Haxe.g:323:28: ( exprList )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==BANG||LA71_0==CAST||LA71_0==CHARLITERAL||LA71_0==FALSE||LA71_0==FLOATNUM||LA71_0==FUNCTION||LA71_0==IDENTIFIER||LA71_0==INTLITERAL||(LA71_0 >= LBRACE && LA71_0 <= LBRACKET)||LA71_0==LONGLITERAL||(LA71_0 >= NEW && LA71_0 <= NULL)||LA71_0==PLUSPLUS||(LA71_0 >= STRINGLITERAL && LA71_0 <= SUB)||LA71_0==SUBSUB||LA71_0==THIS||LA71_0==TILDE||LA71_0==TRUE||LA71_0==UNTYPED) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // Haxe.g:323:28: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayObj4207);
                    exprList248=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList248.getTree());

                    }
                    break;

            }


            RBRACKET249=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayObj4210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET249);


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
            // 324:13: -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
            {
                // Haxe.g:324:16: ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ArrayNode(SUFFIX_EXPR, LBRACKET247, RBRACKET249)
                , root_1);

                // Haxe.g:324:63: ( exprList )?
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
            if ( state.backtracking>0 ) { memoize(input, 49, arrayObj_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arrayObj"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:327:1: value : ( objLit | funcLit | arrayObj | elementarySymbol | id ( typeParam )? );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.objLit_return objLit250 =null;

        HaxeParser.funcLit_return funcLit251 =null;

        HaxeParser.arrayObj_return arrayObj252 =null;

        HaxeParser.elementarySymbol_return elementarySymbol253 =null;

        HaxeParser.id_return id254 =null;

        HaxeParser.typeParam_return typeParam255 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:329:5: ( objLit | funcLit | arrayObj | elementarySymbol | id ( typeParam )? )
            int alt73=5;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt73=1;
                }
                break;
            case FUNCTION:
                {
                alt73=2;
                }
                break;
            case LBRACKET:
                {
                alt73=3;
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
                alt73=4;
                }
                break;
            case IDENTIFIER:
            case THIS:
                {
                alt73=5;
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
                    // Haxe.g:329:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4287);
                    objLit250=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit250.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:330:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4295);
                    funcLit251=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit251.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:331:7: arrayObj
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayObj_in_value4303);
                    arrayObj252=arrayObj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayObj252.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:332:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4311);
                    elementarySymbol253=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol253.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:335:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4331);
                    id254=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id254.getTree());

                    // Haxe.g:335:12: ( typeParam )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==LT) ) {
                        int LA72_1 = input.LA(2);

                        if ( (synpred128_Haxe()) ) {
                            alt72=1;
                        }
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:335:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4333);
                            typeParam255=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam255.getTree());

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
    // Haxe.g:339:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl256 =null;

        HaxeParser.interfaceDecl_return interfaceDecl257 =null;

        HaxeParser.enumDecl_return enumDecl258 =null;

        HaxeParser.typedefDecl_return typedefDecl259 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:339:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt74=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt74=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt74=2;
                    }
                    break;
                case ENUM:
                    {
                    alt74=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt74=1;
                }
                break;
            case INTERFACE:
                {
                alt74=2;
                }
                break;
            case ENUM:
                {
                alt74=3;
                }
                break;
            case TYPEDEF:
                {
                alt74=4;
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
                    // Haxe.g:339:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4353);
                    classDecl256=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl256.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:340:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4373);
                    interfaceDecl257=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl257.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:341:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4393);
                    enumDecl258=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl258.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:342:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4413);
                    typedefDecl259=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl259.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:345:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM261=null;
        Token IDENTIFIER262=null;
        HaxeParser.topLevelAccess_return topLevelAccess260 =null;

        HaxeParser.typeParam_return typeParam263 =null;

        HaxeParser.enumBody_return enumBody264 =null;


        Object ENUM261_tree=null;
        Object IDENTIFIER262_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:345:17: ( ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) )
            // Haxe.g:345:19: ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:345:19: ( topLevelAccess )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EXTERN||LA75_0==PRIVATE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:345:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4449);
                    topLevelAccess260=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess260.getTree());

                    }
                    break;

            }


            ENUM261=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM261);


            IDENTIFIER262=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER262);


            // Haxe.g:345:51: ( typeParam )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // Haxe.g:345:51: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4456);
                    typeParam263=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam263.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4459);
            enumBody264=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody264.getTree());

            // AST REWRITE
            // elements: topLevelAccess, enumBody, typeParam, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 345:71: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
            {
                // Haxe.g:345:74: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:345:97: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:345:113: ( typeParam )?
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
    // Haxe.g:348:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE265=null;
        Token RBRACE267=null;
        HaxeParser.enumValueDecl_return enumValueDecl266 =null;


        Object LBRACE265_tree=null;
        Object RBRACE267_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:348:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:348:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE265=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE265);


            // Haxe.g:348:26: ( enumValueDecl )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==IDENTIFIER) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Haxe.g:348:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4511);
            	    enumValueDecl266=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl266.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            RBRACE267=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE267);


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
            // 348:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:348:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE265, RBRACE267)
                , root_1);

                // Haxe.g:348:101: ( enumValueDecl )*
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
    // Haxe.g:351:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER268=null;
        Token LPAREN269=null;
        Token RPAREN271=null;
        Token SEMI272=null;
        Token IDENTIFIER273=null;
        Token SEMI274=null;
        HaxeParser.paramList_return paramList270 =null;


        Object IDENTIFIER268_tree=null;
        Object LPAREN269_tree=null;
        Object RPAREN271_tree=null;
        Object SEMI272_tree=null;
        Object IDENTIFIER273_tree=null;
        Object SEMI274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:351:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==IDENTIFIER) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==LPAREN) ) {
                    alt79=1;
                }
                else if ( (LA79_1==SEMI) ) {
                    alt79=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:351:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER268=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4555); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER268_tree = 
                    new VarDeclarationNode(IDENTIFIER268) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER268_tree, root_0);
                    }

                    LPAREN269=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4561); if (state.failed) return retval;

                    // Haxe.g:351:59: ( paramList )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==IDENTIFIER||LA78_0==QUES) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // Haxe.g:351:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4564);
                            paramList270=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList270.getTree());

                            }
                            break;

                    }


                    RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4567); if (state.failed) return retval;

                    SEMI272=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4570); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:352:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER273=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER273_tree = 
                    new VarDeclarationNode(IDENTIFIER273) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER273_tree);
                    }

                    SEMI274=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4598); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:356:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS276=null;
        Token IDENTIFIER277=null;
        HaxeParser.topLevelAccess_return topLevelAccess275 =null;

        HaxeParser.typeParam_return typeParam278 =null;

        HaxeParser.inheritList_return inheritList279 =null;

        HaxeParser.classBodyScope_return classBodyScope280 =null;


        Object CLASS276_tree=null;
        Object IDENTIFIER277_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:356:17: ( ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) )
            // Haxe.g:356:19: ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope
            {
            // Haxe.g:356:19: ( topLevelAccess )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EXTERN||LA80_0==PRIVATE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:356:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4647);
                    topLevelAccess275=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess275.getTree());

                    }
                    break;

            }


            CLASS276=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS276);


            IDENTIFIER277=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER277);


            // Haxe.g:356:52: ( typeParam )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:356:52: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4654);
                    typeParam278=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam278.getTree());

                    }
                    break;

            }


            // Haxe.g:356:63: ( inheritList )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EXTENDS||LA82_0==IMPLEMENTS) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:356:63: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_classDecl4657);
                    inheritList279=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList279.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4660);
            classBodyScope280=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope280.getTree());

            // AST REWRITE
            // elements: inheritList, typeParam, IDENTIFIER, topLevelAccess, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 357:21: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
            {
                // Haxe.g:357:24: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:357:48: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:357:64: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:357:75: ( inheritList )?
                if ( stream_inheritList.hasNext() ) {
                    adaptor.addChild(root_1, stream_inheritList.nextTree());

                }
                stream_inheritList.reset();

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
    // Haxe.g:360:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE281=null;
        Token RBRACE283=null;
        HaxeParser.classMember_return classMember282 =null;


        Object LBRACE281_tree=null;
        Object RBRACE283_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:360:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:360:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE281=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4727); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE281);


            // Haxe.g:360:26: ( classMember )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DYNAMIC||LA83_0==FUNCTION||LA83_0==INLINE||LA83_0==OVERRIDE||LA83_0==PRIVATE||LA83_0==PUBLIC||LA83_0==STATIC||LA83_0==VAR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:360:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4730);
            	    classMember282=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember282.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            RBRACE283=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE283);


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
            // 360:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:360:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE281, RBRACE283)
                , root_1);

                // Haxe.g:360:99: ( classMember )*
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
    // Haxe.g:363:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass284 =null;

        HaxeParser.funcDecl_return funcDecl285 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:363:17: ( varDeclClass | funcDecl )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // Haxe.g:363:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4780);
                    varDeclClass284=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass284.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:364:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4800);
                    funcDecl285=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl285.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:368:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR287=null;
        Token IDENTIFIER288=null;
        Token SEMI292=null;
        HaxeParser.declAttrList_return declAttrList286 =null;

        HaxeParser.propDecl_return propDecl289 =null;

        HaxeParser.typeTag_return typeTag290 =null;

        HaxeParser.varInit_return varInit291 =null;


        Object VAR287_tree=null;
        Object IDENTIFIER288_tree=null;
        Object SEMI292_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:368:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:368:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:368:19: ( declAttrList )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==DYNAMIC||LA85_0==INLINE||LA85_0==OVERRIDE||LA85_0==PRIVATE||LA85_0==PUBLIC||LA85_0==STATIC) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:368:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4842);
                    declAttrList286=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList286.getTree());

                    }
                    break;

            }


            VAR287=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR287);


            IDENTIFIER288=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER288);


            // Haxe.g:368:48: ( propDecl )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LPAREN) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:368:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4849);
                    propDecl289=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl289.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass4852);
            typeTag290=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag290.getTree());

            // Haxe.g:368:66: ( varInit )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==EQ) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:368:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4854);
                    varInit291=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit291.getTree());

                    }
                    break;

            }


            SEMI292=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI292);


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
            // 368:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:368:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:368:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:368:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:368:148: ( varInit )?
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
    // Haxe.g:371:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR293=null;
        Token COMMA295=null;
        Token SEMI297=null;
        HaxeParser.varDeclPartList_return varDeclPartList294 =null;

        HaxeParser.varDeclPartList_return varDeclPartList296 =null;


        Object VAR293_tree=null;
        Object COMMA295_tree=null;
        Object SEMI297_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:371:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:371:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR293=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4926); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl4929);
            varDeclPartList294=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList294.getTree());

            // Haxe.g:371:40: ( COMMA ! varDeclPartList )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Haxe.g:371:41: COMMA ! varDeclPartList
            	    {
            	    COMMA295=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl4932); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl4935);
            	    varDeclPartList296=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList296.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            SEMI297=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4939); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:374:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER298=null;
        HaxeParser.propDecl_return propDecl299 =null;

        HaxeParser.typeTag_return typeTag300 =null;

        HaxeParser.varInit_return varInit301 =null;


        Object IDENTIFIER298_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:374:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:374:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER298=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList4965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER298);


            // Haxe.g:374:30: ( propDecl )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==LPAREN) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:374:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList4967);
                    propDecl299=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl299.getTree());

                    }
                    break;

            }


            // Haxe.g:374:40: ( typeTag )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==COLON) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:374:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList4970);
                    typeTag300=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag300.getTree());

                    }
                    break;

            }


            // Haxe.g:374:49: ( varInit )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==EQ) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:374:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList4973);
                    varInit301=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit301.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeTag, IDENTIFIER, varInit, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 374:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:374:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:374:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:374:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:374:113: ( varInit )?
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
    // Haxe.g:377:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN302=null;
        Token COMMA303=null;
        Token RPAREN304=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN302_tree=null;
        Object COMMA303_tree=null;
        Object RPAREN304_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:377:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:377:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN302=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN302);


            pushFollow(FOLLOW_propAccessor_in_propDecl5028);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA303);


            pushFollow(FOLLOW_propAccessor_in_propDecl5034);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN304=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5036); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN304);


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
            // 377:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:377:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
    // Haxe.g:380:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set305=null;

        Object set305_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:380:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set305=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set305)
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
    // Haxe.g:387:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ306=null;
        HaxeParser.expr_return expr307 =null;


        Object EQ306_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:387:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:387:19: EQ expr
            {
            EQ306=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5195); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ306);


            pushFollow(FOLLOW_expr_in_varInit5197);
            expr307=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr307.getTree());

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
            // 387:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:387:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
    // Haxe.g:390:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION309=null;
        Token NEW310=null;
        Token FUNCTION313=null;
        Token IDENTIFIER314=null;
        HaxeParser.declAttrList_return declAttrList308 =null;

        HaxeParser.funcDeclPart_return funcDeclPart311 =null;

        HaxeParser.declAttrList_return declAttrList312 =null;

        HaxeParser.typeParam_return typeParam315 =null;

        HaxeParser.funcDeclPart_return funcDeclPart316 =null;


        Object FUNCTION309_tree=null;
        Object NEW310_tree=null;
        Object FUNCTION313_tree=null;
        Object IDENTIFIER314_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:390:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // Haxe.g:390:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:390:19: ( declAttrList )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DYNAMIC||LA92_0==INLINE||LA92_0==OVERRIDE||LA92_0==PRIVATE||LA92_0==PUBLIC||LA92_0==STATIC) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Haxe.g:390:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5241);
                            declAttrList308=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList308.getTree());

                            }
                            break;

                    }


                    FUNCTION309=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION309);


                    NEW310=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW310);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5248);
                    funcDeclPart311=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart311.getTree());

                    // AST REWRITE
                    // elements: declAttrList, funcDeclPart, FUNCTION, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 391:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:391:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:391:53: ( declAttrList )?
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
                    // Haxe.g:392:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:392:19: ( declAttrList )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DYNAMIC||LA93_0==INLINE||LA93_0==OVERRIDE||LA93_0==PRIVATE||LA93_0==PUBLIC||LA93_0==STATIC) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:392:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5306);
                            declAttrList312=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList312.getTree());

                            }
                            break;

                    }


                    FUNCTION313=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION313);


                    IDENTIFIER314=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER314);


                    // Haxe.g:392:53: ( typeParam )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LT) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:392:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5313);
                            typeParam315=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam315.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5316);
                    funcDeclPart316=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart316.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, typeParam, declAttrList, IDENTIFIER, funcDeclPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 393:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:393:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:393:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:393:87: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 64, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDeclPart"
    // Haxe.g:396:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN317=null;
        Token RPAREN319=null;
        Token SEMI322=null;
        HaxeParser.paramList_return paramList318 =null;

        HaxeParser.typeTag_return typeTag320 =null;

        HaxeParser.block_return block321 =null;


        Object LPAREN317_tree=null;
        Object RPAREN319_tree=null;
        Object SEMI322_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:396:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:396:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN317=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5400); if (state.failed) return retval;

            // Haxe.g:396:27: ( paramList )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==IDENTIFIER||LA96_0==QUES) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:396:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5403);
                    paramList318=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList318.getTree());

                    }
                    break;

            }


            RPAREN319=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5406); if (state.failed) return retval;

            // Haxe.g:396:46: ( typeTag )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==COLON) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Haxe.g:396:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5409);
                    typeTag320=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag320.getTree());

                    }
                    break;

            }


            // Haxe.g:396:55: ( block | SEMI !)
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LBRACE) ) {
                alt98=1;
            }
            else if ( (LA98_0==SEMI) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // Haxe.g:396:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5413);
                    block321=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block321.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:396:64: SEMI !
                    {
                    SEMI322=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5417); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 65, funcDeclPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDeclPart"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:399:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION324=null;
        Token NEW325=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        Token SEMI330=null;
        Token FUNCTION332=null;
        Token IDENTIFIER333=null;
        Token LPAREN335=null;
        Token RPAREN337=null;
        Token SEMI339=null;
        Token FUNCTION340=null;
        Token NEW341=null;
        Token LPAREN342=null;
        Token RPAREN344=null;
        Token SEMI346=null;
        Token FUNCTION347=null;
        Token IDENTIFIER348=null;
        Token LPAREN350=null;
        Token RPAREN352=null;
        Token SEMI354=null;
        HaxeParser.declAttrList_return declAttrList323 =null;

        HaxeParser.paramList_return paramList327 =null;

        HaxeParser.typeTag_return typeTag329 =null;

        HaxeParser.declAttrList_return declAttrList331 =null;

        HaxeParser.typeParam_return typeParam334 =null;

        HaxeParser.paramList_return paramList336 =null;

        HaxeParser.typeTag_return typeTag338 =null;

        HaxeParser.paramList_return paramList343 =null;

        HaxeParser.typeTag_return typeTag345 =null;

        HaxeParser.typeParam_return typeParam349 =null;

        HaxeParser.paramList_return paramList351 =null;

        HaxeParser.typeTag_return typeTag353 =null;


        Object FUNCTION324_tree=null;
        Object NEW325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;
        Object SEMI330_tree=null;
        Object FUNCTION332_tree=null;
        Object IDENTIFIER333_tree=null;
        Object LPAREN335_tree=null;
        Object RPAREN337_tree=null;
        Object SEMI339_tree=null;
        Object FUNCTION340_tree=null;
        Object NEW341_tree=null;
        Object LPAREN342_tree=null;
        Object RPAREN344_tree=null;
        Object SEMI346_tree=null;
        Object FUNCTION347_tree=null;
        Object IDENTIFIER348_tree=null;
        Object LPAREN350_tree=null;
        Object RPAREN352_tree=null;
        Object SEMI354_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:400:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt109=4;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // Haxe.g:400:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5454);
                    declAttrList323=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList323.getTree());

                    FUNCTION324=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION324);


                    NEW325=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW325);


                    LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN326);


                    // Haxe.g:400:42: ( paramList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==IDENTIFIER||LA99_0==QUES) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:400:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5462);
                            paramList327=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList327.getTree());

                            }
                            break;

                    }


                    RPAREN328=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN328);


                    // Haxe.g:400:60: ( typeTag )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==COLON) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:400:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5467);
                            typeTag329=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag329.getTree());

                            }
                            break;

                    }


                    SEMI330=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI330);


                    // AST REWRITE
                    // elements: NEW, typeTag, FUNCTION, paramList, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 401:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:401:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:401:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:401:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:401:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:401:52: ( declAttrList )?
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
                    // Haxe.g:402:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5511);
                    declAttrList331=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());

                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);


                    IDENTIFIER333=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER333);


                    // Haxe.g:402:42: ( typeParam )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==LT) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:402:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5517);
                            typeParam334=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam334.getTree());

                            }
                            break;

                    }


                    LPAREN335=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN335);


                    // Haxe.g:402:60: ( paramList )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==IDENTIFIER||LA102_0==QUES) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:402:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5522);
                            paramList336=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList336.getTree());

                            }
                            break;

                    }


                    RPAREN337=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5525); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN337);


                    // Haxe.g:402:78: ( typeTag )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==COLON) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:402:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5527);
                            typeTag338=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag338.getTree());

                            }
                            break;

                    }


                    SEMI339=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI339);


                    // AST REWRITE
                    // elements: declAttrList, paramList, IDENTIFIER, typeParam, FUNCTION, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 403:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:403:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:403:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:403:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:403:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:403:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:403:73: ( typeParam )?
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
                    // Haxe.g:404:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION340=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION340);


                    NEW341=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW341);


                    LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN342);


                    // Haxe.g:404:29: ( paramList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==IDENTIFIER||LA104_0==QUES) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:404:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5580);
                            paramList343=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList343.getTree());

                            }
                            break;

                    }


                    RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN344);


                    // Haxe.g:404:47: ( typeTag )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==COLON) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:404:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5585);
                            typeTag345=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag345.getTree());

                            }
                            break;

                    }


                    SEMI346=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI346);


                    // AST REWRITE
                    // elements: typeTag, FUNCTION, NEW, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 405:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:405:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:405:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:405:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:405:43: ( typeTag )?
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
                    // Haxe.g:406:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION347=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION347);


                    IDENTIFIER348=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER348);


                    // Haxe.g:406:29: ( typeParam )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==LT) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:406:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5630);
                            typeParam349=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam349.getTree());

                            }
                            break;

                    }


                    LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN350);


                    // Haxe.g:406:47: ( paramList )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==IDENTIFIER||LA107_0==QUES) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:406:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5635);
                            paramList351=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList351.getTree());

                            }
                            break;

                    }


                    RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN352);


                    // Haxe.g:406:65: ( typeTag )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==COLON) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:406:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5640);
                            typeTag353=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag353.getTree());

                            }
                            break;

                    }


                    SEMI354=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI354);


                    // AST REWRITE
                    // elements: typeTag, paramList, IDENTIFIER, typeParam, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 407:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:407:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:407:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:407:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:407:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:407:59: ( typeParam )?
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
    // Haxe.g:410:1: interfaceDecl : ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE356=null;
        Token LBRACE359=null;
        Token RBRACE361=null;
        HaxeParser.topLevelAccess_return topLevelAccess355 =null;

        HaxeParser.type_return type357 =null;

        HaxeParser.inheritList_return inheritList358 =null;

        HaxeParser.interfaceBody_return interfaceBody360 =null;


        Object INTERFACE356_tree=null;
        Object LBRACE359_tree=null;
        Object RBRACE361_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:411:5: ( ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:411:9: ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:411:9: ( topLevelAccess )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==EXTERN||LA110_0==PRIVATE) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Haxe.g:411:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5702);
                    topLevelAccess355=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess355.getTree());

                    }
                    break;

            }


            INTERFACE356=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5705); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE356_tree = 
            (Object)adaptor.create(INTERFACE356)
            ;
            adaptor.addChild(root_0, INTERFACE356_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5707);
            type357=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type357.getTree());

            // Haxe.g:411:40: ( inheritList )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==EXTENDS||LA111_0==IMPLEMENTS) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Haxe.g:411:40: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_interfaceDecl5709);
                    inheritList358=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritList358.getTree());

                    }
                    break;

            }


            LBRACE359=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5712); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5715);
            interfaceBody360=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody360.getTree());

            RBRACE361=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5717); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:414:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl362 =null;

        HaxeParser.interfaceBody_return interfaceBody363 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl364 =null;

        HaxeParser.interfaceBody_return interfaceBody365 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:415:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
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
                    // Haxe.g:415:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5741);
                    varDecl362=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl362.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5743);
                    interfaceBody363=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody363.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:416:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5753);
                    funcProtoDecl364=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl364.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5755);
                    interfaceBody365=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody365.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:419:5: 
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
    // Haxe.g:421:1: inheritList : inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA367=null;
        HaxeParser.inherit_return inherit366 =null;

        HaxeParser.inherit_return inherit368 =null;


        Object COMMA367_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_inherit=new RewriteRuleSubtreeStream(adaptor,"rule inherit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:421:17: ( inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) )
            // Haxe.g:421:19: inherit ( COMMA inherit )*
            {
            pushFollow(FOLLOW_inherit_in_inheritList5779);
            inherit366=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inherit.add(inherit366.getTree());

            // Haxe.g:421:27: ( COMMA inherit )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==COMMA) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // Haxe.g:421:28: COMMA inherit
            	    {
            	    COMMA367=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5782); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA367);


            	    pushFollow(FOLLOW_inherit_in_inheritList5784);
            	    inherit368=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inherit.add(inherit368.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            // AST REWRITE
            // elements: inherit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 421:44: -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
            {
                // Haxe.g:421:47: ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(INHERIT_LIST, "INHERIT_LIST")
                , root_1);

                if ( !(stream_inherit.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_inherit.hasNext() ) {
                    adaptor.addChild(root_1, stream_inherit.nextTree());

                }
                stream_inherit.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 69, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:424:1: inherit : ( EXTENDS ^ type | IMPLEMENTS ^ type );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS369=null;
        Token IMPLEMENTS371=null;
        HaxeParser.type_return type370 =null;

        HaxeParser.type_return type372 =null;


        Object EXTENDS369_tree=null;
        Object IMPLEMENTS371_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:424:17: ( EXTENDS ^ type | IMPLEMENTS ^ type )
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
                    // Haxe.g:424:19: EXTENDS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS369=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5836); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS369_tree = 
                    (Object)adaptor.create(EXTENDS369)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EXTENDS369_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5839);
                    type370=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type370.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:425:19: IMPLEMENTS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS371=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5859); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS371_tree = 
                    (Object)adaptor.create(IMPLEMENTS371)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLEMENTS371_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5862);
                    type372=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type372.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:428:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF373=null;
        Token IDENTIFIER374=null;
        Token EQ375=null;
        HaxeParser.funcType_return funcType376 =null;


        Object TYPEDEF373_tree=null;
        Object IDENTIFIER374_tree=null;
        Object EQ375_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:428:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:428:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF373=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5895); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF373_tree = 
            (Object)adaptor.create(TYPEDEF373)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF373_tree, root_0);
            }

            IDENTIFIER374=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5898); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER374_tree = 
            (Object)adaptor.create(IDENTIFIER374)
            ;
            adaptor.addChild(root_0, IDENTIFIER374_tree);
            }

            EQ375=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5900); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl5903);
            funcType376=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType376.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:431:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT377=null;
        HaxeParser.funcType_return funcType378 =null;


        Object GT377_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:431:17: ( GT ^ funcType )
            // Haxe.g:431:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT377=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5937); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT377_tree = 
            (Object)adaptor.create(GT377)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT377_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5940);
            funcType378=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType378.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:434:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE379=null;
        Token RBRACE381=null;
        HaxeParser.objLitElemList_return objLitElemList380 =null;


        Object LBRACE379_tree=null;
        Object RBRACE381_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:434:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:434:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE379=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5974); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit5977);
            objLitElemList380=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList380.getTree());

            RBRACE381=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5979); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:437:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER382=null;
        Token COLON383=null;
        HaxeParser.funcType_return funcType384 =null;


        Object IDENTIFIER382_tree=null;
        Object COLON383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:437:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:437:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER382=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6007); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER382_tree = 
            (Object)adaptor.create(IDENTIFIER382)
            ;
            adaptor.addChild(root_0, IDENTIFIER382_tree);
            }

            COLON383=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6009); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6012);
            funcType384=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType384.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:440:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA386=null;
        HaxeParser.objLitElem_return objLitElem385 =null;

        HaxeParser.objLitElem_return objLitElem387 =null;


        Object COMMA386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:440:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:440:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6042);
            objLitElem385=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem385.getTree());

            // Haxe.g:440:30: ( COMMA ! objLitElem )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // Haxe.g:440:31: COMMA ! objLitElem
            	    {
            	    COMMA386=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6045); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6048);
            	    objLitElem387=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem387.getTree());

            	    }
            	    break;

            	default :
            	    break loop115;
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
            if ( state.backtracking>0 ) { memoize(input, 75, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:443:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER388=null;
        Token COLON389=null;
        HaxeParser.expr_return expr390 =null;


        Object IDENTIFIER388_tree=null;
        Object COLON389_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:443:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:443:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER388=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6084); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER388_tree = 
            (Object)adaptor.create(IDENTIFIER388)
            ;
            adaptor.addChild(root_0, IDENTIFIER388_tree);
            }

            COLON389=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6086); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6089);
            expr390=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr390.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:447:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL391=null;
        Token NULL392=null;
        Token INTLITERAL393=null;
        Token STRINGLITERAL394=null;
        Token CHARLITERAL395=null;
        Token FLOATNUM396=null;
        Token TRUE397=null;
        Token FALSE398=null;

        Object LONGLITERAL391_tree=null;
        Object NULL392_tree=null;
        Object INTLITERAL393_tree=null;
        Object STRINGLITERAL394_tree=null;
        Object CHARLITERAL395_tree=null;
        Object FLOATNUM396_tree=null;
        Object TRUE397_tree=null;
        Object FALSE398_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:448:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt116=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt116=1;
                }
                break;
            case NULL:
                {
                alt116=2;
                }
                break;
            case INTLITERAL:
                {
                alt116=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt116=4;
                }
                break;
            case CHARLITERAL:
                {
                alt116=5;
                }
                break;
            case FLOATNUM:
                {
                alt116=6;
                }
                break;
            case TRUE:
                {
                alt116=7;
                }
                break;
            case FALSE:
                {
                alt116=8;
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
                    // Haxe.g:448:7: LONGLITERAL
                    {
                    LONGLITERAL391=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL391);


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
                    // 448:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL391, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:449:7: NULL
                    {
                    NULL392=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL392);


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
                    // 449:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL392, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:450:7: INTLITERAL
                    {
                    INTLITERAL393=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6166); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL393);


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
                    // 450:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL393, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:451:7: STRINGLITERAL
                    {
                    STRINGLITERAL394=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL394);


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
                    // 451:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL394, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:452:7: CHARLITERAL
                    {
                    CHARLITERAL395=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6201); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL395);


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
                    // 452:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL395, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:453:7: FLOATNUM
                    {
                    FLOATNUM396=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6219); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM396);


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
                    // 453:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM396, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:454:7: TRUE
                    {
                    TRUE397=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE397);


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
                    // 454:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE397, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:455:7: FALSE
                    {
                    FALSE398=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6265); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE398);


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
                    // 455:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE398, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 77, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:197:61: ( typeParam )
        // Haxe.g:197:61: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred57_Haxe1845);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:208:19: ( block )
        // Haxe.g:208:19: block
        {
        pushFollow(FOLLOW_block_in_synpred59_Haxe1987);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred60_Haxe
    public final void synpred60_Haxe_fragment() throws RecognitionException {
        // Haxe.g:209:56: ( ELSE statement )
        // Haxe.g:209:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred60_Haxe2018); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred60_Haxe2021);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred74_Haxe
    public final void synpred74_Haxe_fragment() throws RecognitionException {
        // Haxe.g:218:19: ( expr SEMI )
        // Haxe.g:218:19: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred74_Haxe2299);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred74_Haxe2301); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred74_Haxe

    // $ANTLR start synpred116_Haxe
    public final void synpred116_Haxe_fragment() throws RecognitionException {
        // Haxe.g:310:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:310:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred116_Haxe3941);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred116_Haxe3943); if (state.failed) return ;

        // Haxe.g:310:32: ( exprList )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==BANG||LA127_0==CAST||LA127_0==CHARLITERAL||LA127_0==FALSE||LA127_0==FLOATNUM||LA127_0==FUNCTION||LA127_0==IDENTIFIER||LA127_0==INTLITERAL||(LA127_0 >= LBRACE && LA127_0 <= LBRACKET)||LA127_0==LONGLITERAL||(LA127_0 >= NEW && LA127_0 <= NULL)||LA127_0==PLUSPLUS||(LA127_0 >= STRINGLITERAL && LA127_0 <= SUB)||LA127_0==SUBSUB||LA127_0==THIS||LA127_0==TILDE||LA127_0==TRUE||LA127_0==UNTYPED) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // Haxe.g:310:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred116_Haxe3945);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred116_Haxe3948); if (state.failed) return ;

        // Haxe.g:310:49: ( pureCallOrSlice )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==DOT||LA128_0==LBRACKET) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // Haxe.g:310:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred116_Haxe3950);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred116_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {
        // Haxe.g:312:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:312:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred118_Haxe4001);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred118_Haxe4003); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred118_Haxe4005);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred118_Haxe4007); if (state.failed) return ;

        // Haxe.g:312:48: ( pureCallOrSlice )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==DOT||LA129_0==LBRACKET) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // Haxe.g:312:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred118_Haxe4009);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:314:19: ( value pureCallOrSlice )
        // Haxe.g:314:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred119_Haxe4060);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4063);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred119_Haxe

    // $ANTLR start synpred128_Haxe
    public final void synpred128_Haxe_fragment() throws RecognitionException {
        // Haxe.g:335:12: ( typeParam )
        // Haxe.g:335:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred128_Haxe4333);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_Haxe

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
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String DFA84_eotS =
        "\4\uffff";
    static final String DFA84_eofS =
        "\4\uffff";
    static final String DFA84_minS =
        "\2\47\2\uffff";
    static final String DFA84_maxS =
        "\2\u00a3\2\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA84_specialS =
        "\4\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\30\uffff\1\2",
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\30\uffff\1\2",
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
            return "363:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA95_eotS =
        "\5\uffff";
    static final String DFA95_eofS =
        "\5\uffff";
    static final String DFA95_minS =
        "\2\47\1\106\2\uffff";
    static final String DFA95_maxS =
        "\2\u008a\1\143\2\uffff";
    static final String DFA95_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA95_specialS =
        "\5\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\34\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "390:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA109_eotS =
        "\10\uffff";
    static final String DFA109_eofS =
        "\10\uffff";
    static final String DFA109_minS =
        "\2\47\2\106\4\uffff";
    static final String DFA109_maxS =
        "\2\u008a\2\143\4\uffff";
    static final String DFA109_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA109_specialS =
        "\10\uffff}>";
    static final String[] DFA109_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\5\34\uffff\1\4",
            "\1\7\34\uffff\1\6",
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
            return "399:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module191 = new BitSet(new long[]{0x0004100008000002L,0x0800000000010400L,0x0000000410000000L});
    public static final BitSet FOLLOW_imports_in_module194 = new BitSet(new long[]{0x0004100008000002L,0x0800000000010400L,0x0000000410000000L});
    public static final BitSet FOLLOW_topLevelDecl_in_module197 = new BitSet(new long[]{0x0004100008000002L,0x0800000000010000L,0x0000000010000000L});
    public static final BitSet FOLLOW_IMPORT_in_imports250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_imports253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_imports255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_imports276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_imports279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_imports281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_filepath_in_myPackage316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_myPackage318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath373 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_DOT_in_filepath378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath382 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta418 = new BitSet(new long[]{0x0080008010010000L,0x0000000000008040L,0x0000002000001000L});
    public static final BitSet FOLLOW_metaName_in_meta420 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_meta423 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_meta425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_meta428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName464 = new BitSet(new long[]{0x0080008010010000L,0x0000000000008040L,0x0000002000001000L});
    public static final BitSet FOLLOW_metaName_in_metaName466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags484 = new BitSet(new long[]{0x0004000000000002L,0x0800000100000000L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList713 = new BitSet(new long[]{0x0000008000000002L,0x4800004000002000L,0x0000000000000400L});
    public static final BitSet FOLLOW_param_in_paramList758 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList761 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_param_in_paramList763 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_QUES_in_param813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param816 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_param818 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_param821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1361 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1367 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcLit1370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1373 = new BitSet(new long[]{0x0000000010000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_funcLit1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1423 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1469 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1472 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeList1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1497 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1500 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeList1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1538 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1541 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_funcType1544 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1582 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L,0x0000000800000001L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1648 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1669 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1671 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000800000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1730 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1735 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1830 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_filepath_in_type1835 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonType_in_type1840 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParam_in_type1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1881 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1883 = new BitSet(new long[]{0x1000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1885 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint1939 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1943 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2007 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2013 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2015 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2018 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2043 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2049 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statement2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_IN_in_statement2054 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_iterExpr_in_statement2057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_statement2059 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2082 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2088 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2110 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statement2121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_statement2150 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2152 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2179 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statement2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_statement2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2187 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2190 = new BitSet(new long[]{0x0000000400400000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_statement2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2214 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916010L});
    public static final BitSet FOLLOW_expr_in_statement2220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2244 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statement2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2310 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statement2312 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statement2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2360 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_parExpression2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2401 = new BitSet(new long[]{0x071400110C820200L,0x0800201800B200C0L,0x0000008A06B96005L});
    public static final BitSet FOLLOW_blockStmt_in_block2404 = new BitSet(new long[]{0x071400110C820200L,0x0800201800B200C0L,0x0000008A06B96005L});
    public static final BitSet FOLLOW_RBRACE_in_block2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2498 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2501 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2503 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_caseStmt2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2529 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_caseStmt2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2573 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_param_in_catchStmt2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_catchStmt2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2619 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2622 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_exprList2625 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2667 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2720 = new BitSet(new long[]{0x8000200000204082L,0x0000140010000002L,0x0000000000008280L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2723 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2757 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2760 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2763 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2765 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2799 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2802 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2808 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2842 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2844 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2850 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2900 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2903 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2948 = new BitSet(new long[]{0x3000400000000402L,0x0000000006000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2975 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3004 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3033 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3062 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3091 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3120 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3127 = new BitSet(new long[]{0x3000400000000402L,0x0000000006000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3166 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3193 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3222 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3251 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3258 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3291 = new BitSet(new long[]{0x4000000000000002L,0x0000000008000001L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3318 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3347 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3376 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3383 = new BitSet(new long[]{0x4000000000000002L,0x0000000008000001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3418 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3445 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3474 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3481 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3520 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_STAR_in_multExpr3547 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3576 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3605 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3612 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3660 = new BitSet(new long[]{0x0510000004800000L,0x0000001800B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3679 = new BitSet(new long[]{0x0510000004800000L,0x0000001800B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3698 = new BitSet(new long[]{0x0510000004800000L,0x0000001800B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3717 = new BitSet(new long[]{0x0510000004800000L,0x0000001800B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3736 = new BitSet(new long[]{0x0510000004800000L,0x0000001800B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3763 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3814 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_prefixExpr3817 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3819 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3846 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3849 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3852 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3855 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3943 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3948 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4003 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4007 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4060 = new BitSet(new long[]{0x0000002000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4109 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916002L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4114 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4170 = new BitSet(new long[]{0x0510000004000000L,0x0000001000B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayObj4205 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916002L});
    public static final BitSet FOLLOW_exprList_in_arrayObj4207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayObj4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayObj_in_value4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4331 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParam_in_value4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4449 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4561 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4647 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4652 = new BitSet(new long[]{0x0002000000000000L,0x0000000002100200L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4654 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_inheritList_in_classDecl4657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4727 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4730 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4847 = new BitSet(new long[]{0x0000000010000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4849 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4852 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl4926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4929 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_varDecl4932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4935 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList4965 = new BitSet(new long[]{0x0000200010000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList4967 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList4970 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5024 = new BitSet(new long[]{0x0000008400000000L,0x0000001400000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5028 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5030 = new BitSet(new long[]{0x0000008400000000L,0x0000001400000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5195 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_varInit5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5241 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5244 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5246 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5306 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5400 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5406 = new BitSet(new long[]{0x0000000010000000L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5454 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5456 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5458 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5460 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5465 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5511 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5515 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5520 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5525 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5576 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5578 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5583 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5633 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5638 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5705 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5707 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_inheritList_in_interfaceDecl5709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5712 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5741 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000400L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5753 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000400L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5779 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5782 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_inherit_in_inheritList5784 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5836 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_inherit5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5859 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_inherit5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5898 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5900 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5937 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6007 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6009 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6042 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6048 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6084 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6086 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred57_Haxe1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred59_Haxe1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred60_Haxe2018 = new BitSet(new long[]{0x0710001104820200L,0x0000201800B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_synpred60_Haxe2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred74_Haxe2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_synpred74_Haxe2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred116_Haxe3941 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred116_Haxe3943 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_synpred116_Haxe3945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_synpred116_Haxe3948 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred116_Haxe3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred118_Haxe4001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred118_Haxe4003 = new BitSet(new long[]{0x0510000004800200L,0x0000201800B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred118_Haxe4005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred118_Haxe4007 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred118_Haxe4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred119_Haxe4060 = new BitSet(new long[]{0x0000002000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred128_Haxe4333 = new BitSet(new long[]{0x0000000000000002L});

}