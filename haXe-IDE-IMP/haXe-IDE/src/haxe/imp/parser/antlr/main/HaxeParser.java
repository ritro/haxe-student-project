// $ANTLR 3.4 Haxe.g 2012-03-26 01:41:01

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
        this.state.ruleMemo = new HashMap[272+1];
         

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


    public static class topLevelAccessAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelAccessAttr"
    // Haxe.g:114:1: topLevelAccessAttr : topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) ;
    public final HaxeParser.topLevelAccessAttr_return topLevelAccessAttr() throws RecognitionException {
        HaxeParser.topLevelAccessAttr_return retval = new HaxeParser.topLevelAccessAttr_return();
        retval.start = input.LT(1);

        int topLevelAccessAttr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.topLevelAccess_return topLevelAccess26 =null;


        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:115:17: ( topLevelAccess -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess ) )
            // Haxe.g:115:19: topLevelAccess
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
            // 115:34: -> ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
            {
                // Haxe.g:115:37: ^( DECL_ATTR_LIST[\"Top_Level_Access\"] topLevelAccess )
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
    // Haxe.g:118:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr27 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // Haxe.g:118:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:118:19: ( declAttr )+
            {
            // Haxe.g:118:19: ( declAttr )+
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
            	    // Haxe.g:118:19: declAttr
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
            // 118:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:118:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:121:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
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

            // Haxe.g:121:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:121:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList827);
            param28=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param28.getTree());

            // Haxe.g:121:25: ( COMMA param )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:121:26: COMMA param
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
            // 121:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:121:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:124:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
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

            // Haxe.g:124:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:124:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:124:19: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:124:19: QUES
                    {
                    QUES31=(Token)match(input,QUES,FOLLOW_QUES_in_param882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES31);


                    }
                    break;

            }


            IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER32);


            // Haxe.g:124:36: ( typeTag )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:124:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param887);
                    typeTag33=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag33.getTree());

                    }
                    break;

            }


            // Haxe.g:124:45: ( varInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:124:45: varInit
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
            // 124:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:124:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER32)
                , root_1);

                // Haxe.g:124:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:124:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:124:114: ( QUES )?
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
    // Haxe.g:127:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER35=null;

        Object IDENTIFIER35_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // Haxe.g:127:17: ( IDENTIFIER )
            // Haxe.g:127:19: IDENTIFIER
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
    // Haxe.g:130:1: id : ( identifier | THIS );
    public final HaxeParser.id_return id() throws RecognitionException {
        HaxeParser.id_return retval = new HaxeParser.id_return();
        retval.start = input.LT(1);

        int id_StartIndex = input.index();

        Object root_0 = null;

        Token THIS37=null;
        HaxeParser.identifier_return identifier36 =null;


        Object THIS37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // Haxe.g:130:17: ( identifier | THIS )
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
                    // Haxe.g:130:19: identifier
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
                    // Haxe.g:131:19: THIS
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:134:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
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

            // Haxe.g:134:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:134:19: EQ
                    {
                    EQ38=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp1052); if (state.failed) return retval; 
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
                    // 134:28: -> EQ
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
                    // Haxe.g:135:19: PLUSEQ
                    {
                    PLUSEQ39=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1085); if (state.failed) return retval; 
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
                    // 135:28: -> PLUSEQ
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
                    // Haxe.g:136:19: SUBEQ
                    {
                    SUBEQ40=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1114); if (state.failed) return retval; 
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
                    // 136:28: -> SUBEQ
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
                    // Haxe.g:137:19: STAREQ
                    {
                    STAREQ41=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1144); if (state.failed) return retval; 
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
                    // 137:28: -> STAREQ
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
                    // Haxe.g:138:19: SLASHEQ
                    {
                    SLASHEQ42=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1173); if (state.failed) return retval; 
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
                    // 138:28: -> SLASHEQ
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
                    // Haxe.g:139:19: PERCENTEQ
                    {
                    PERCENTEQ43=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1201); if (state.failed) return retval; 
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
                    // 139:29: -> PERCENTEQ
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
                    // Haxe.g:140:19: AMPEQ
                    {
                    AMPEQ44=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1228); if (state.failed) return retval; 
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
                    // 140:28: -> AMPEQ
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
                    // Haxe.g:141:19: BAREQ
                    {
                    BAREQ45=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1258); if (state.failed) return retval; 
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
                    // 141:28: -> BAREQ
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
                    // Haxe.g:142:19: CARETEQ
                    {
                    CARETEQ46=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1288); if (state.failed) return retval; 
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
                    // 142:28: -> CARETEQ
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
                    // Haxe.g:143:19: LTLTEQ
                    {
                    LTLTEQ47=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1316); if (state.failed) return retval; 
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
                    // 143:28: -> LTLTEQ
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
                    // Haxe.g:144:19: GTGTEQ
                    {
                    GTGTEQ48=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1345); if (state.failed) return retval; 
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
                    // 144:28: -> GTGTEQ
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
                    // Haxe.g:145:19: GTGTGTEQ
                    {
                    GTGTGTEQ49=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1374); if (state.failed) return retval; 
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
                    // 145:28: -> GTGTGTEQ
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
    // Haxe.g:148:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
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

            // Haxe.g:148:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:148:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION50=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1430); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION50_tree = 
            new FunctionNode(FUNCTION50) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION50_tree, root_0);
            }

            LPAREN51=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1436); if (state.failed) return retval;

            // Haxe.g:148:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:148:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1439);
                    paramList52=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList52.getTree());

                    }
                    break;

            }


            RPAREN53=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1442); if (state.failed) return retval;

            // Haxe.g:148:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:148:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1445);
                    typeTag54=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag54.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1448);
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
    // Haxe.g:176:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
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

            // Haxe.g:176:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:176:19: COLON funcType
            {
            COLON56=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1492); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON56);


            pushFollow(FOLLOW_funcType_in_typeTag1494);
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
            // 176:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:176:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
    // Haxe.g:179:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
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

            // Haxe.g:179:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
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
                    // Haxe.g:179:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1538);
                    funcType58=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType58.getTree());

                    // Haxe.g:179:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:179:29: COMMA ! typeList
                            {
                            COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1541); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1544);
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
                    // Haxe.g:180:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1566);
                    typeConstraint61=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint61.getTree());

                    // Haxe.g:180:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:180:35: COMMA ! typeList
                            {
                            COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1569); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1572);
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
    // Haxe.g:183:1: funcType : type ( MINUS_BIGGER ! type )* ;
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

            // Haxe.g:183:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:183:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1607);
            type64=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type64.getTree());

            // Haxe.g:183:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:183:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER65=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1610); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1613);
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
    // Haxe.g:186:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) ;
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

            // Haxe.g:186:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) )
            // Haxe.g:186:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE67=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE67);


            // Haxe.g:186:26: ( anonTypePart )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GT||LA24_0==IDENTIFIER||LA24_0==VAR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:186:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1653);
                    anonTypePart68=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart68.getTree());

                    }
                    break;

            }


            RBRACE69=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1656); if (state.failed) return retval; 
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
            // 186:47: -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
            {
                // Haxe.g:186:50: ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "AnonType")
                , root_1);

                // Haxe.g:186:83: ( anonTypePart )?
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
    // Haxe.g:189:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
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

            // Haxe.g:189:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
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
                    // Haxe.g:189:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1697);
                    anonTypeFieldList70=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList70.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:190:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:190:19: ( varDecl )+
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
                    	    // Haxe.g:190:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1717);
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
                    // Haxe.g:191:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1738);
                    typeExtend72=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend72.getTree());

                    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1740); if (state.failed) return retval;

                    // Haxe.g:191:37: ( anonTypeFieldList | ( varDecl )+ )?
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
                            // Haxe.g:191:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1745);
                            anonTypeFieldList74=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList74.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:191:59: ( varDecl )+
                            {
                            // Haxe.g:191:59: ( varDecl )+
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
                            	    // Haxe.g:191:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1749);
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
    // Haxe.g:194:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
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

            // Haxe.g:195:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:195:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1799);
            anonTypeField76=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField76.getTree());

            // Haxe.g:195:33: ( COMMA anonTypeField )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:195:34: COMMA anonTypeField
            	    {
            	    COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1802); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1804);
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
            // 195:56: -> ( anonTypeField )+
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
    // Haxe.g:198:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set79=null;

        Object set79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:198:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set79=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DYNAMIC||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VOID ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set79)
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
    // Haxe.g:201:1: type : ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? ;
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.primitiveType_return primitiveType80 =null;

        HaxeParser.filepath_return filepath81 =null;

        HaxeParser.anonType_return anonType82 =null;

        HaxeParser.typeParam_return typeParam83 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:201:17: ( ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:201:19: ( primitiveType ^| filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:201:19: ( primitiveType ^| filepath ^| anonType ^)
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
                    // Haxe.g:201:20: primitiveType ^
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1899);
                    primitiveType80=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType80.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:201:37: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1904);
                    filepath81=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath81.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // Haxe.g:201:49: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1909);
                    anonType82=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType82.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:201:61: ( typeParam )?
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
                    // Haxe.g:201:61: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1914);
                    typeParam83=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam83.getTree());

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
    // Haxe.g:204:1: typeParam : ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) );
    public final HaxeParser.typeParam_return typeParam() throws RecognitionException {
        HaxeParser.typeParam_return retval = new HaxeParser.typeParam_return();
        retval.start = input.LT(1);

        int typeParam_StartIndex = input.index();

        Object root_0 = null;

        Token LT84=null;
        Token LT87=null;
        Token GT89=null;
        HaxeParser.typeList_return typeList85 =null;

        HaxeParser.typeParamPart_return typeParamPart86 =null;

        HaxeParser.typeList_return typeList88 =null;


        Object LT84_tree=null;
        Object LT87_tree=null;
        Object GT89_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_typeParamPart=new RewriteRuleSubtreeStream(adaptor,"rule typeParamPart");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

            // Haxe.g:204:17: ( LT typeList typeParamPart -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart ) | LT typeList GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                int LA32_1 = input.LA(2);

                if ( (synpred58_Haxe()) ) {
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
                    // Haxe.g:204:19: LT typeList typeParamPart
                    {
                    LT84=(Token)match(input,LT,FOLLOW_LT_in_typeParam1950); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT84);


                    pushFollow(FOLLOW_typeList_in_typeParam1952);
                    typeList85=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList85.getTree());

                    pushFollow(FOLLOW_typeParamPart_in_typeParam1954);
                    typeParamPart86=typeParamPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamPart.add(typeParamPart86.getTree());

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
                    // 204:45: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
                    {
                        // Haxe.g:204:48: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList typeParamPart )
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
                    // Haxe.g:205:19: LT typeList GT
                    {
                    LT87=(Token)match(input,LT,FOLLOW_LT_in_typeParam1988); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT87);


                    pushFollow(FOLLOW_typeList_in_typeParam1990);
                    typeList88=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList88.getTree());

                    GT89=(Token)match(input,GT,FOLLOW_GT_in_typeParam1992); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GT.add(GT89);


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
                    // 205:34: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:205:37: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
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
    // Haxe.g:208:1: typeParamPart : ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) );
    public final HaxeParser.typeParamPart_return typeParamPart() throws RecognitionException {
        HaxeParser.typeParamPart_return retval = new HaxeParser.typeParamPart_return();
        retval.start = input.LT(1);

        int typeParamPart_StartIndex = input.index();

        Object root_0 = null;

        Token LT90=null;
        Token GTGT92=null;
        Token LT93=null;
        Token GTGTGT96=null;
        HaxeParser.typeList_return typeList91 =null;

        HaxeParser.typeList_return typeList94 =null;

        HaxeParser.typeParam_return typeParam95 =null;


        Object LT90_tree=null;
        Object GTGT92_tree=null;
        Object LT93_tree=null;
        Object GTGTGT96_tree=null;
        RewriteRuleTokenStream stream_GTGTGT=new RewriteRuleTokenStream(adaptor,"token GTGTGT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_GTGT=new RewriteRuleTokenStream(adaptor,"token GTGT");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

            // Haxe.g:208:17: ( LT typeList GTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ) | LT typeList ( typeParam )? GTGTGT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LT) ) {
                int LA34_1 = input.LA(2);

                if ( (synpred59_Haxe()) ) {
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
                    // Haxe.g:208:19: LT typeList GTGT
                    {
                    LT90=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2048); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT90);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2050);
                    typeList91=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList91.getTree());

                    GTGT92=(Token)match(input,GTGT,FOLLOW_GTGT_in_typeParamPart2052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGT.add(GTGT92);


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
                    // 208:36: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
                    {
                        // Haxe.g:208:39: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList )
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
                    // Haxe.g:209:19: LT typeList ( typeParam )? GTGTGT
                    {
                    LT93=(Token)match(input,LT,FOLLOW_LT_in_typeParamPart2084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT93);


                    pushFollow(FOLLOW_typeList_in_typeParamPart2086);
                    typeList94=typeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeList.add(typeList94.getTree());

                    // Haxe.g:209:31: ( typeParam )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==LT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:209:31: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_typeParamPart2088);
                            typeParam95=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam95.getTree());

                            }
                            break;

                    }


                    GTGTGT96=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_typeParamPart2091); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GTGTGT.add(GTGTGT96);


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
                    // 209:49: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                    {
                        // Haxe.g:209:52: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                        , root_1);

                        adaptor.addChild(root_1, stream_typeList.nextTree());

                        // Haxe.g:209:98: ( typeParam )?
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
    // Haxe.g:212:1: typeConstraint : identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) ;
    public final HaxeParser.typeConstraint_return typeConstraint() throws RecognitionException {
        HaxeParser.typeConstraint_return retval = new HaxeParser.typeConstraint_return();
        retval.start = input.LT(1);

        int typeConstraint_StartIndex = input.index();

        Object root_0 = null;

        Token COLON98=null;
        Token LPAREN99=null;
        Token RPAREN101=null;
        HaxeParser.identifier_return identifier97 =null;

        HaxeParser.typeList_return typeList100 =null;


        Object COLON98_tree=null;
        Object LPAREN99_tree=null;
        Object RPAREN101_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:213:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:213:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint2142);
            identifier97=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier97.getTree());

            COLON98=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint2144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON98);


            LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint2146); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN99);


            pushFollow(FOLLOW_typeList_in_typeConstraint2148);
            typeList100=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList100.getTree());

            RPAREN101=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint2150); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN101);


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
            // 213:47: -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
            {
                // Haxe.g:213:50: ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_CONSTRAIN, "TYPE_CONSTRAIN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Haxe.g:213:106: ( typeList )?
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
    // Haxe.g:217:1: statement : ( statementLast | expr SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI104=null;
        HaxeParser.statementLast_return statementLast102 =null;

        HaxeParser.expr_return expr103 =null;


        Object SEMI104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:217:17: ( statementLast | expr SEMI !)
            int alt35=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA35_1 = input.LA(2);

                if ( (synpred61_Haxe()) ) {
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
            case IDENTIFIER:
                {
                int LA35_11 = input.LA(2);

                if ( (synpred61_Haxe()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 11, input);

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
                    // Haxe.g:217:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statement2190);
                    statementLast102=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast102.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:218:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2210);
                    expr103=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr103.getTree());

                    SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2212); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:221:1: statementLast : ( block | IF ^ parExpression statementOrLast ( ELSE ! statementOrLast )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) );
    public final HaxeParser.statementLast_return statementLast() throws RecognitionException {
        HaxeParser.statementLast_return retval = new HaxeParser.statementLast_return();
        retval.start = input.LT(1);

        int statementLast_StartIndex = input.index();

        Object root_0 = null;

        Token IF106=null;
        Token ELSE109=null;
        Token FOR111=null;
        Token LPAREN112=null;
        Token IN114=null;
        Token RPAREN116=null;
        Token WHILE118=null;
        Token DO121=null;
        Token WHILE123=null;
        Token SEMI125=null;
        Token TRY126=null;
        Token SWITCH129=null;
        Token LPAREN130=null;
        Token RPAREN132=null;
        Token LBRACE133=null;
        Token RBRACE135=null;
        Token RETURN136=null;
        Token SEMI138=null;
        Token THROW139=null;
        Token SEMI141=null;
        Token set142=null;
        Token SEMI143=null;
        Token IDENTIFIER144=null;
        Token COLON145=null;
        HaxeParser.block_return block105 =null;

        HaxeParser.parExpression_return parExpression107 =null;

        HaxeParser.statementOrLast_return statementOrLast108 =null;

        HaxeParser.statementOrLast_return statementOrLast110 =null;

        HaxeParser.expr_return expr113 =null;

        HaxeParser.iterExpr_return iterExpr115 =null;

        HaxeParser.statement_return statement117 =null;

        HaxeParser.parExpression_return parExpression119 =null;

        HaxeParser.statement_return statement120 =null;

        HaxeParser.statement_return statement122 =null;

        HaxeParser.parExpression_return parExpression124 =null;

        HaxeParser.block_return block127 =null;

        HaxeParser.catchStmt_return catchStmt128 =null;

        HaxeParser.expr_return expr131 =null;

        HaxeParser.caseStmt_return caseStmt134 =null;

        HaxeParser.expr_return expr137 =null;

        HaxeParser.expr_return expr140 =null;

        HaxeParser.statement_return statement146 =null;


        Object IF106_tree=null;
        Object ELSE109_tree=null;
        Object FOR111_tree=null;
        Object LPAREN112_tree=null;
        Object IN114_tree=null;
        Object RPAREN116_tree=null;
        Object WHILE118_tree=null;
        Object DO121_tree=null;
        Object WHILE123_tree=null;
        Object SEMI125_tree=null;
        Object TRY126_tree=null;
        Object SWITCH129_tree=null;
        Object LPAREN130_tree=null;
        Object RPAREN132_tree=null;
        Object LBRACE133_tree=null;
        Object RBRACE135_tree=null;
        Object RETURN136_tree=null;
        Object SEMI138_tree=null;
        Object THROW139_tree=null;
        Object SEMI141_tree=null;
        Object set142_tree=null;
        Object SEMI143_tree=null;
        Object IDENTIFIER144_tree=null;
        Object COLON145_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:221:17: ( block | IF ^ parExpression statementOrLast ( ELSE ! statementOrLast )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) )
            int alt40=11;
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
            case IDENTIFIER:
                {
                alt40=11;
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
                    // Haxe.g:221:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statementLast2244);
                    block105=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block105.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:222:19: IF ^ parExpression statementOrLast ( ELSE ! statementOrLast )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF106=(Token)match(input,IF,FOLLOW_IF_in_statementLast2264); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF106_tree = 
                    new IfNode(IF106) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF106_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2270);
                    parExpression107=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression107.getTree());

                    pushFollow(FOLLOW_statementOrLast_in_statementLast2272);
                    statementOrLast108=statementOrLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementOrLast108.getTree());

                    // Haxe.g:222:61: ( ELSE ! statementOrLast )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ELSE) ) {
                        int LA36_1 = input.LA(2);

                        if ( (synpred63_Haxe()) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // Haxe.g:222:62: ELSE ! statementOrLast
                            {
                            ELSE109=(Token)match(input,ELSE,FOLLOW_ELSE_in_statementLast2275); if (state.failed) return retval;

                            pushFollow(FOLLOW_statementOrLast_in_statementLast2278);
                            statementOrLast110=statementOrLast();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statementOrLast110.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:223:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR111=(Token)match(input,FOR,FOLLOW_FOR_in_statementLast2300); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR111_tree = 
                    new ForNode(FOR111) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR111_tree, root_0);
                    }

                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2306); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2309);
                    expr113=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr113.getTree());

                    IN114=(Token)match(input,IN,FOLLOW_IN_in_statementLast2311); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statementLast2314);
                    iterExpr115=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr115.getTree());

                    RPAREN116=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2316); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statementLast2319);
                    statement117=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement117.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:224:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE118=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2339); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE118_tree = 
                    new WhileNode(WHILE118) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE118_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statementLast2345);
                    parExpression119=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression119.getTree());

                    pushFollow(FOLLOW_statement_in_statementLast2347);
                    statement120=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement120.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:225:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO121=(Token)match(input,DO,FOLLOW_DO_in_statementLast2367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO121_tree = 
                    new DoWhileNode(DO121) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO121_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statementLast2373);
                    statement122=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement122.getTree());

                    WHILE123=(Token)match(input,WHILE,FOLLOW_WHILE_in_statementLast2375); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statementLast2378);
                    parExpression124=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression124.getTree());

                    SEMI125=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2380); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:226:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY126=(Token)match(input,TRY,FOLLOW_TRY_in_statementLast2401); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY126_tree = 
                    new TryNode(TRY126) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY126_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statementLast2407);
                    block127=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block127.getTree());

                    // Haxe.g:226:39: ( catchStmt )+
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
                    	    // Haxe.g:226:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statementLast2409);
                    	    catchStmt128=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt128.getTree());

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
                    // Haxe.g:227:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH129=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statementLast2430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH129_tree = 
                    new SwitchNode(SWITCH129) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH129_tree, root_0);
                    }

                    LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statementLast2436); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statementLast2439);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statementLast2441); if (state.failed) return retval;

                    LBRACE133=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statementLast2444); if (state.failed) return retval;

                    // Haxe.g:227:68: ( caseStmt )+
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
                    	    // Haxe.g:227:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statementLast2447);
                    	    caseStmt134=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt134.getTree());

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


                    RBRACE135=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statementLast2450); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:228:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN136=(Token)match(input,RETURN,FOLLOW_RETURN_in_statementLast2471); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN136_tree = 
                    new ReturnNode(RETURN136) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN136_tree, root_0);
                    }

                    // Haxe.g:228:39: ( expr )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==BANG||LA39_0==CAST||LA39_0==CHARLITERAL||LA39_0==FALSE||LA39_0==FLOATNUM||LA39_0==FUNCTION||LA39_0==IDENTIFIER||LA39_0==INTLITERAL||(LA39_0 >= LBRACE && LA39_0 <= LBRACKET)||(LA39_0 >= LONGLITERAL && LA39_0 <= LPAREN)||(LA39_0 >= NEW && LA39_0 <= NULL)||LA39_0==PLUSPLUS||(LA39_0 >= STRINGLITERAL && LA39_0 <= SUB)||LA39_0==SUBSUB||LA39_0==THIS||LA39_0==TILDE||LA39_0==TRUE||LA39_0==UNTYPED) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // Haxe.g:228:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statementLast2477);
                            expr137=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr137.getTree());

                            }
                            break;

                    }


                    SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2480); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:229:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW139=(Token)match(input,THROW,FOLLOW_THROW_in_statementLast2501); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW139_tree = 
                    (Object)adaptor.create(THROW139)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW139_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statementLast2504);
                    expr140=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr140.getTree());

                    SEMI141=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2506); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:230:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set142=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set142)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statementLast2535); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:231:7: IDENTIFIER COLON statement
                    {
                    IDENTIFIER144=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statementLast2544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER144);


                    COLON145=(Token)match(input,COLON,FOLLOW_COLON_in_statementLast2546); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON145);


                    pushFollow(FOLLOW_statement_in_statementLast2548);
                    statement146=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement146.getTree());

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
                    // 231:50: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:231:53: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:231:61: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:231:73: ( statement )?
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
    // Haxe.g:234:1: statementOrLast : ( statementLast | expr );
    public final HaxeParser.statementOrLast_return statementOrLast() throws RecognitionException {
        HaxeParser.statementOrLast_return retval = new HaxeParser.statementOrLast_return();
        retval.start = input.LT(1);

        int statementOrLast_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.statementLast_return statementLast147 =null;

        HaxeParser.expr_return expr148 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:234:17: ( statementLast | expr )
            int alt41=2;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA41_1 = input.LA(2);

                if ( (synpred77_Haxe()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
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
            case IDENTIFIER:
                {
                int LA41_11 = input.LA(2);

                if ( (synpred77_Haxe()) ) {
                    alt41=1;
                }
                else if ( (true) ) {
                    alt41=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 11, input);

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
                    // Haxe.g:234:19: statementLast
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statementLast_in_statementOrLast2593);
                    statementLast147=statementLast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementLast147.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:235:19: expr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statementOrLast2613);
                    expr148=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:238:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN149=null;
        Token RPAREN151=null;
        HaxeParser.expr_return expr150 =null;


        Object LPAREN149_tree=null;
        Object RPAREN151_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:238:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:238:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN149=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2643); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2646);
            expr150=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr150.getTree());

            RPAREN151=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2648); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:241:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) ;
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE152=null;
        Token RBRACE154=null;
        HaxeParser.blockStmt_return blockStmt153 =null;


        Object LBRACE152_tree=null;
        Object RBRACE154_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:241:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:241:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE152=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE152);


            // Haxe.g:241:26: ( blockStmt )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==BANG||LA42_0==BREAK||LA42_0==CAST||(LA42_0 >= CHARLITERAL && LA42_0 <= CLASS)||LA42_0==CONTINUE||LA42_0==DO||LA42_0==EXTERN||LA42_0==FALSE||(LA42_0 >= FLOATNUM && LA42_0 <= FUNCTION)||(LA42_0 >= IDENTIFIER && LA42_0 <= IF)||LA42_0==INTLITERAL||(LA42_0 >= LBRACE && LA42_0 <= LBRACKET)||(LA42_0 >= LONGLITERAL && LA42_0 <= LPAREN)||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||LA42_0==PRIVATE||LA42_0==RETURN||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||(LA42_0 >= SWITCH && LA42_0 <= THROW)||LA42_0==TILDE||(LA42_0 >= TRUE && LA42_0 <= TRY)||LA42_0==UNTYPED||LA42_0==VAR||LA42_0==WHILE) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // Haxe.g:241:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2687);
            	    blockStmt153=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt153.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            RBRACE154=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE154);


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
            // 241:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
            {
                // Haxe.g:241:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE152, RBRACE154)
                , root_1);

                // Haxe.g:241:97: ( blockStmt )*
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
    // Haxe.g:244:1: blockStmt : ( varDecl | classDecl | statement );
    public final HaxeParser.blockStmt_return blockStmt() throws RecognitionException {
        HaxeParser.blockStmt_return retval = new HaxeParser.blockStmt_return();
        retval.start = input.LT(1);

        int blockStmt_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl155 =null;

        HaxeParser.classDecl_return classDecl156 =null;

        HaxeParser.statement_return statement157 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:244:17: ( varDecl | classDecl | statement )
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
                    // Haxe.g:244:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2735);
                    varDecl155=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl155.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:245:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2746);
                    classDecl156=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl156.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:246:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2757);
                    statement157=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement157.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:249:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE158=null;
        Token COLON160=null;
        Token DEFAULT162=null;
        Token COLON163=null;
        HaxeParser.exprList_return exprList159 =null;

        HaxeParser.statement_return statement161 =null;

        HaxeParser.statement_return statement164 =null;


        Object CASE158_tree=null;
        Object COLON160_tree=null;
        Object DEFAULT162_tree=null;
        Object COLON163_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:249:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:249:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE158=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE158_tree = 
                    (Object)adaptor.create(CASE158)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE158_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2784);
                    exprList159=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList159.getTree());

                    COLON160=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2786); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2789);
                    statement161=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement161.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:250:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT162=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT162_tree = 
                    (Object)adaptor.create(DEFAULT162)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT162_tree, root_0);
                    }

                    COLON163=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2812); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2815);
                    statement164=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement164.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:253:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH165=null;
        Token LPAREN166=null;
        Token RPAREN168=null;
        HaxeParser.param_return param167 =null;

        HaxeParser.block_return block169 =null;


        Object CATCH165_tree=null;
        Object LPAREN166_tree=null;
        Object RPAREN168_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:253:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:253:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH165=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2850); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH165_tree = 
            new HaxeTree(CATCH165) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH165_tree, root_0);
            }

            LPAREN166=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2856); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2859);
            param167=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param167.getTree());

            RPAREN168=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2861); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2864);
            block169=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block169.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:257:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA171=null;
        HaxeParser.expr_return expr170 =null;

        HaxeParser.expr_return expr172 =null;


        Object COMMA171_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:257:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:257:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2902);
            expr170=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr170.getTree());

            // Haxe.g:257:24: ( COMMA ! expr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:257:25: COMMA ! expr
            	    {
            	    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2905); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2908);
            	    expr172=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr172.getTree());

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
    // Haxe.g:260:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED173=null;
        HaxeParser.assignExpr_return assignExpr174 =null;

        HaxeParser.assignExpr_return assignExpr175 =null;


        Object UNTYPED173_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:260:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==UNTYPED) ) {
                alt46=1;
            }
            else if ( (LA46_0==BANG||LA46_0==CAST||LA46_0==CHARLITERAL||LA46_0==FALSE||LA46_0==FLOATNUM||LA46_0==FUNCTION||LA46_0==IDENTIFIER||LA46_0==INTLITERAL||(LA46_0 >= LBRACE && LA46_0 <= LBRACKET)||(LA46_0 >= LONGLITERAL && LA46_0 <= LPAREN)||(LA46_0 >= NEW && LA46_0 <= NULL)||LA46_0==PLUSPLUS||(LA46_0 >= STRINGLITERAL && LA46_0 <= SUB)||LA46_0==SUBSUB||LA46_0==THIS||LA46_0==TILDE||LA46_0==TRUE) ) {
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
                    // Haxe.g:260:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED173=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED173_tree = 
                    (Object)adaptor.create(UNTYPED173)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED173_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2953);
                    assignExpr174=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr174.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:261:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2973);
                    assignExpr175=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr175.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:264:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.ternaryExpr_return ternaryExpr176 =null;

        HaxeParser.assignOp_return assignOp177 =null;

        HaxeParser.ternaryExpr_return ternaryExpr178 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:264:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:264:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr3003);
            ternaryExpr176=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr176.getTree());

            // Haxe.g:264:31: ( assignOp ^ ternaryExpr )?
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
                    // Haxe.g:264:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr3006);
                    assignOp177=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp177.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr3009);
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:267:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:267:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr3040);
            logicOrExpr179=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr179.getTree());

            // Haxe.g:267:31: ( QUES ^ expr COLON ! ternaryExpr )?
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
                    // Haxe.g:267:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES180=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr3043); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES180_tree = 
                    (Object)adaptor.create(QUES180)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES180_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr3046);
                    expr181=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr181.getTree());

                    COLON182=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr3048); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr3051);
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:270:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:270:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3082);
            logicAndExpr184=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr184.getTree());

            // Haxe.g:270:32: ( BARBAR ^ logicAndExpr )*
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
            	    // Haxe.g:270:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR185=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr3085); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR185_tree = 
            	    new BinaryExpressionNode(BARBAR185) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR185_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr3091);
            	    logicAndExpr186=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr186.getTree());

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
    // Haxe.g:273:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP188=null;
        HaxeParser.iterExpr_return iterExpr187 =null;

        HaxeParser.iterExpr_return iterExpr189 =null;


        Object AMPAMP188_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:273:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:273:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr3125);
            iterExpr187=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr187.getTree());

            // Haxe.g:273:27: ( AMPAMP ^ iterExpr )*
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
            	    // Haxe.g:273:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP188=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr3127); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP188_tree = 
            	    new BinaryExpressionNode(AMPAMP188) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP188_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr3133);
            	    iterExpr189=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr189.getTree());

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
    // Haxe.g:276:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS191=null;
        HaxeParser.cmpExpr_return cmpExpr190 =null;

        HaxeParser.cmpExpr_return cmpExpr192 =null;


        Object ELLIPSIS191_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:276:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:276:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr3183);
            cmpExpr190=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr190.getTree());

            // Haxe.g:276:27: ( ELLIPSIS ^ cmpExpr )?
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
                    // Haxe.g:276:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS191=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr3186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS191_tree = 
                    new BinaryExpressionNode(ELLIPSIS191) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS191_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr3192);
                    cmpExpr192=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr192.getTree());

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
    // Haxe.g:279:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ194=null;
        Token BANGEQ195=null;
        Token GTEQ196=null;
        Token LTEQ197=null;
        Token GT198=null;
        Token LT199=null;
        HaxeParser.bitExpr_return bitExpr193 =null;

        HaxeParser.bitExpr_return bitExpr200 =null;


        Object EQEQ194_tree=null;
        Object BANGEQ195_tree=null;
        Object GTEQ196_tree=null;
        Object LTEQ197_tree=null;
        Object GT198_tree=null;
        Object LT199_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:279:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:279:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr3231);
            bitExpr193=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr193.getTree());

            // Haxe.g:279:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
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
            	    // Haxe.g:279:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:279:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:280:23: EQEQ ^
            	            {
            	            EQEQ194=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3258); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ194_tree = 
            	            new BinaryExpressionNode(EQEQ194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:281:23: BANGEQ ^
            	            {
            	            BANGEQ195=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3287); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ195_tree = 
            	            new BinaryExpressionNode(BANGEQ195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:282:23: GTEQ ^
            	            {
            	            GTEQ196=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3316); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ196_tree = 
            	            new BinaryExpressionNode(GTEQ196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ196_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:283:23: LTEQ ^
            	            {
            	            LTEQ197=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3345); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ197_tree = 
            	            new BinaryExpressionNode(LTEQ197) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ197_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:284:23: GT ^
            	            {
            	            GT198=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3374); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT198_tree = 
            	            new BinaryExpressionNode(GT198) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT198_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:285:23: LT ^
            	            {
            	            LT199=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3403); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT199_tree = 
            	            new BinaryExpressionNode(LT199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT199_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3410);
            	    bitExpr200=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr200.getTree());

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
    // Haxe.g:288:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR202=null;
        Token AMP203=null;
        Token CARET204=null;
        HaxeParser.shiftExpr_return shiftExpr201 =null;

        HaxeParser.shiftExpr_return shiftExpr205 =null;


        Object BAR202_tree=null;
        Object AMP203_tree=null;
        Object CARET204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:288:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:288:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3449);
            shiftExpr201=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr201.getTree());

            // Haxe.g:288:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
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
            	    // Haxe.g:288:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:288:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:289:23: BAR ^
            	            {
            	            BAR202=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3476); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR202_tree = 
            	            new BinaryExpressionNode(BAR202) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR202_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:290:23: AMP ^
            	            {
            	            AMP203=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3505); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP203_tree = 
            	            new BinaryExpressionNode(AMP203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:291:23: CARET ^
            	            {
            	            CARET204=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3534); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET204_tree = 
            	            new BinaryExpressionNode(CARET204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET204_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3541);
            	    shiftExpr205=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr205.getTree());

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
    // Haxe.g:294:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT207=null;
        Token GTGT208=null;
        Token GTGTGT209=null;
        HaxeParser.addExpr_return addExpr206 =null;

        HaxeParser.addExpr_return addExpr210 =null;


        Object LTLT207_tree=null;
        Object GTGT208_tree=null;
        Object GTGTGT209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:294:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:294:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3574);
            addExpr206=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr206.getTree());

            // Haxe.g:294:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
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
            	    // Haxe.g:294:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:294:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:295:23: LTLT ^
            	            {
            	            LTLT207=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3601); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT207_tree = 
            	            new BinaryExpressionNode(LTLT207) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:296:23: GTGT ^
            	            {
            	            GTGT208=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3630); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT208_tree = 
            	            new BinaryExpressionNode(GTGT208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:297:23: GTGTGT ^
            	            {
            	            GTGTGT209=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3659); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT209_tree = 
            	            new BinaryExpressionNode(GTGTGT209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT209_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3666);
            	    addExpr210=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr210.getTree());

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
    // Haxe.g:300:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS212=null;
        Token SUB213=null;
        HaxeParser.multExpr_return multExpr211 =null;

        HaxeParser.multExpr_return multExpr214 =null;


        Object PLUS212_tree=null;
        Object SUB213_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

            // Haxe.g:300:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:300:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3701);
            multExpr211=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr211.getTree());

            // Haxe.g:300:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==SUB) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred102_Haxe()) ) {
                        alt59=1;
                    }


                }
                else if ( (LA59_0==PLUS) ) {
                    int LA59_3 = input.LA(2);

                    if ( (synpred102_Haxe()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:300:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:300:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:301:23: PLUS ^
            	            {
            	            PLUS212=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3728); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS212_tree = 
            	            new BinaryExpressionNode(PLUS212) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:302:23: SUB ^
            	            {
            	            SUB213=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3757); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB213_tree = 
            	            new BinaryExpressionNode(SUB213) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB213_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3764);
            	    multExpr214=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr214.getTree());

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
    // Haxe.g:305:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR216=null;
        Token SLASH217=null;
        Token PERCENT218=null;
        HaxeParser.unarExpr_return unarExpr215 =null;

        HaxeParser.unarExpr_return unarExpr219 =null;


        Object STAR216_tree=null;
        Object SLASH217_tree=null;
        Object PERCENT218_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:305:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:305:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3803);
            unarExpr215=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr215.getTree());

            // Haxe.g:305:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
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
            	    // Haxe.g:305:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:305:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:306:23: STAR ^
            	            {
            	            STAR216=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3830); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR216_tree = 
            	            new BinaryExpressionNode(STAR216) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR216_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:307:23: SLASH ^
            	            {
            	            SLASH217=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3859); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH217_tree = 
            	            new BinaryExpressionNode(SLASH217) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH217_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:308:23: PERCENT ^
            	            {
            	            PERCENT218=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3888); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT218_tree = 
            	            new BinaryExpressionNode(PERCENT218) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT218_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3895);
            	    unarExpr219=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr219.getTree());

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
    // Haxe.g:311:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB220=null;
        Token SUBSUB221=null;
        Token PLUSPLUS222=null;
        Token BANG223=null;
        Token TILDE224=null;
        Token PLUSPLUS227=null;
        Token SUBSUB228=null;
        HaxeParser.prefixExpr_return prefixExpr225 =null;

        HaxeParser.prefixExpr_return prefixExpr226 =null;


        Object SUB220_tree=null;
        Object SUBSUB221_tree=null;
        Object PLUSPLUS222_tree=null;
        Object BANG223_tree=null;
        Object TILDE224_tree=null;
        Object PLUSPLUS227_tree=null;
        Object SUBSUB228_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:311:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==BANG||LA64_0==PLUSPLUS||LA64_0==SUB||LA64_0==SUBSUB||LA64_0==TILDE) ) {
                alt64=1;
            }
            else if ( (LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||(LA64_0 >= LBRACE && LA64_0 <= LBRACKET)||(LA64_0 >= LONGLITERAL && LA64_0 <= LPAREN)||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==STRINGLITERAL||LA64_0==THIS||LA64_0==TRUE) ) {
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
                    // Haxe.g:311:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:311:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:312:13: SUB ^
                            {
                            SUB220=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3943); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB220_tree = 
                            new UnarExpressionNode(SUB220) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB220_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:313:13: SUBSUB ^
                            {
                            SUBSUB221=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3962); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB221_tree = 
                            new UnarExpressionNode(SUBSUB221) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB221_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:314:13: PLUSPLUS ^
                            {
                            PLUSPLUS222=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3981); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS222_tree = 
                            new UnarExpressionNode(PLUSPLUS222) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS222_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:315:13: BANG ^
                            {
                            BANG223=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr4000); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG223_tree = 
                            new UnarExpressionNode(BANG223) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG223_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:316:13: TILDE ^
                            {
                            TILDE224=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr4019); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE224_tree = 
                            new UnarExpressionNode(TILDE224) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE224_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr4026);
                    prefixExpr225=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr225.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:317:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr4046);
                    prefixExpr226=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr226.getTree());

                    // Haxe.g:317:30: ( PLUSPLUS ^| SUBSUB ^)?
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
                            // Haxe.g:317:31: PLUSPLUS ^
                            {
                            PLUSPLUS227=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr4049); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS227_tree = 
                            new UnarExpressionNode(PLUSPLUS227) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS227_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:317:61: SUBSUB ^
                            {
                            SUBSUB228=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr4055); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB228_tree = 
                            new UnarExpressionNode(SUBSUB228) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB228_tree, root_0);
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
    // Haxe.g:320:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW229=null;
        Token LPAREN231=null;
        Token RPAREN233=null;
        Token CAST234=null;
        Token LPAREN235=null;
        Token COMMA237=null;
        Token RPAREN239=null;
        HaxeParser.type_return type230 =null;

        HaxeParser.exprList_return exprList232 =null;

        HaxeParser.expr_return expr236 =null;

        HaxeParser.funcType_return funcType238 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice240 =null;


        Object NEW229_tree=null;
        Object LPAREN231_tree=null;
        Object RPAREN233_tree=null;
        Object CAST234_tree=null;
        Object LPAREN235_tree=null;
        Object COMMA237_tree=null;
        Object RPAREN239_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:320:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
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
                    // Haxe.g:320:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW229=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr4097); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW229_tree = 
                    (Object)adaptor.create(NEW229)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW229_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr4100);
                    type230=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type230.getTree());

                    LPAREN231=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4102); if (state.failed) return retval;

                    // Haxe.g:320:37: ( exprList )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==BANG||LA65_0==CAST||LA65_0==CHARLITERAL||LA65_0==FALSE||LA65_0==FLOATNUM||LA65_0==FUNCTION||LA65_0==IDENTIFIER||LA65_0==INTLITERAL||(LA65_0 >= LBRACE && LA65_0 <= LBRACKET)||(LA65_0 >= LONGLITERAL && LA65_0 <= LPAREN)||(LA65_0 >= NEW && LA65_0 <= NULL)||LA65_0==PLUSPLUS||(LA65_0 >= STRINGLITERAL && LA65_0 <= SUB)||LA65_0==SUBSUB||LA65_0==THIS||LA65_0==TILDE||LA65_0==TRUE||LA65_0==UNTYPED) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:320:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr4105);
                            exprList232=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList232.getTree());

                            }
                            break;

                    }


                    RPAREN233=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4108); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:321:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST234=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr4129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST234_tree = 
                    (Object)adaptor.create(CAST234)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST234_tree, root_0);
                    }

                    LPAREN235=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr4132); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr4135);
                    expr236=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr236.getTree());

                    // Haxe.g:321:38: ( COMMA ! funcType )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==COMMA) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:321:39: COMMA ! funcType
                            {
                            COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr4138); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr4141);
                            funcType238=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType238.getTree());

                            }
                            break;

                    }


                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr4145); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:322:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr4166);
                    methodCallOrSlice240=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice240.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:325:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN242=null;
        Token RPAREN244=null;
        Token LBRACKET247=null;
        Token RBRACKET249=null;
        HaxeParser.value_return value241 =null;

        HaxeParser.exprList_return exprList243 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice245 =null;

        HaxeParser.value_return value246 =null;

        HaxeParser.expr_return expr248 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice250 =null;

        HaxeParser.value_return value251 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice252 =null;

        HaxeParser.value_return value253 =null;


        Object LPAREN242_tree=null;
        Object RPAREN244_tree=null;
        Object LBRACKET247_tree=null;
        Object RBRACKET249_tree=null;
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

            // Haxe.g:326:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }

            switch (alt71) {
                case 1 :
                    // Haxe.g:326:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4224);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value241.getTree());

                    LPAREN242=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice4226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN242);


                    // Haxe.g:326:32: ( exprList )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG||LA68_0==CAST||LA68_0==CHARLITERAL||LA68_0==FALSE||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||(LA68_0 >= LBRACE && LA68_0 <= LBRACKET)||(LA68_0 >= LONGLITERAL && LA68_0 <= LPAREN)||(LA68_0 >= NEW && LA68_0 <= NULL)||LA68_0==PLUSPLUS||(LA68_0 >= STRINGLITERAL && LA68_0 <= SUB)||LA68_0==SUBSUB||LA68_0==THIS||LA68_0==TILDE||LA68_0==TRUE||LA68_0==UNTYPED) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:326:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice4228);
                            exprList243=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList243.getTree());

                            }
                            break;

                    }


                    RPAREN244=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice4231); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN244);


                    // Haxe.g:326:49: ( pureCallOrSlice )?
                    int alt69=2;
                    alt69 = dfa69.predict(input);
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:326:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4233);
                            pureCallOrSlice245=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice245.getTree());

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
                    // 327:13: -> ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:327:16: ^( CALL_OR_SLICE[$LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new MethodCallNode(CALL_OR_SLICE, LPAREN242, RPAREN244)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:327:72: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

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
                    break;
                case 2 :
                    // Haxe.g:328:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4284);
                    value246=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value246.getTree());

                    LBRACKET247=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET247);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4288);
                    expr248=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr248.getTree());

                    RBRACKET249=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET249);


                    // Haxe.g:328:48: ( pureCallOrSlice )?
                    int alt70=2;
                    alt70 = dfa70.predict(input);
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:328:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4292);
                            pureCallOrSlice250=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice250.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expr, value, pureCallOrSlice
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 329:13: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:329:16: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, false] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET247, RBRACKET249, false)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:329:83: ( pureCallOrSlice )?
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
                    // Haxe.g:330:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4343);
                    value251=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value251.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4346);
                    pureCallOrSlice252=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice252.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:331:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4367);
                    value253=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value253.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:334:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET254=null;
        Token RBRACKET256=null;
        Token DOT258=null;
        HaxeParser.expr_return expr255 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice257 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice259 =null;


        Object LBRACKET254_tree=null;
        Object RBRACKET256_tree=null;
        Object DOT258_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:334:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
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
                    // Haxe.g:334:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET254=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET254);


                    // Haxe.g:334:28: ( expr )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==BANG||LA72_0==CAST||LA72_0==CHARLITERAL||LA72_0==FALSE||LA72_0==FLOATNUM||LA72_0==FUNCTION||LA72_0==IDENTIFIER||LA72_0==INTLITERAL||(LA72_0 >= LBRACE && LA72_0 <= LBRACKET)||(LA72_0 >= LONGLITERAL && LA72_0 <= LPAREN)||(LA72_0 >= NEW && LA72_0 <= NULL)||LA72_0==PLUSPLUS||(LA72_0 >= STRINGLITERAL && LA72_0 <= SUB)||LA72_0==SUBSUB||LA72_0==THIS||LA72_0==TILDE||LA72_0==TRUE||LA72_0==UNTYPED) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // Haxe.g:334:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4394);
                            expr255=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr255.getTree());

                            }
                            break;

                    }


                    RBRACKET256=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET256);


                    // Haxe.g:334:43: ( pureCallOrSlice )?
                    int alt73=2;
                    alt73 = dfa73.predict(input);
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:334:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4399);
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
                    // 334:60: -> ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:334:63: ^( CALL_OR_SLICE[$LBRACKET, $RBRACKET, true] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new SliceNode(CALL_OR_SLICE, LBRACKET254, RBRACKET256, true)
                        , root_1);

                        // Haxe.g:335:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:335:76: ( pureCallOrSlice )?
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
                    // Haxe.g:336:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT258=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT258_tree = 
                    (Object)adaptor.create(DOT258)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT258_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4456);
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
    // Haxe.g:339:1: arrayObj : LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) ;
    public final HaxeParser.arrayObj_return arrayObj() throws RecognitionException {
        HaxeParser.arrayObj_return retval = new HaxeParser.arrayObj_return();
        retval.start = input.LT(1);

        int arrayObj_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET260=null;
        Token RBRACKET262=null;
        HaxeParser.exprList_return exprList261 =null;


        Object LBRACKET260_tree=null;
        Object RBRACKET262_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:339:17: ( LBRACKET ( exprList )? RBRACKET -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? ) )
            // Haxe.g:339:19: LBRACKET ( exprList )? RBRACKET
            {
            LBRACKET260=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayObj4488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET260);


            // Haxe.g:339:28: ( exprList )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==BANG||LA75_0==CAST||LA75_0==CHARLITERAL||LA75_0==FALSE||LA75_0==FLOATNUM||LA75_0==FUNCTION||LA75_0==IDENTIFIER||LA75_0==INTLITERAL||(LA75_0 >= LBRACE && LA75_0 <= LBRACKET)||(LA75_0 >= LONGLITERAL && LA75_0 <= LPAREN)||(LA75_0 >= NEW && LA75_0 <= NULL)||LA75_0==PLUSPLUS||(LA75_0 >= STRINGLITERAL && LA75_0 <= SUB)||LA75_0==SUBSUB||LA75_0==THIS||LA75_0==TILDE||LA75_0==TRUE||LA75_0==UNTYPED) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:339:28: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_arrayObj4490);
                    exprList261=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList261.getTree());

                    }
                    break;

            }


            RBRACKET262=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayObj4493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET262);


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
            // 340:13: -> ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
            {
                // Haxe.g:340:16: ^( SUFFIX_EXPR[$LBRACKET, $RBRACKET] ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ArrayNode(SUFFIX_EXPR, LBRACKET260, RBRACKET262)
                , root_1);

                // Haxe.g:340:63: ( exprList )?
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
    // Haxe.g:343:1: value : ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN267=null;
        Token RPAREN269=null;
        Token char_literal270=null;
        Token COLON272=null;
        Token LPAREN274=null;
        Token RPAREN276=null;
        HaxeParser.objLit_return objLit263 =null;

        HaxeParser.funcLit_return funcLit264 =null;

        HaxeParser.arrayObj_return arrayObj265 =null;

        HaxeParser.elementarySymbol_return elementarySymbol266 =null;

        HaxeParser.expr_return expr268 =null;

        HaxeParser.expr_return expr271 =null;

        HaxeParser.expr_return expr273 =null;

        HaxeParser.expr_return expr275 =null;

        HaxeParser.id_return id277 =null;

        HaxeParser.typeParam_return typeParam278 =null;


        Object LPAREN267_tree=null;
        Object RPAREN269_tree=null;
        Object char_literal270_tree=null;
        Object COLON272_tree=null;
        Object LPAREN274_tree=null;
        Object RPAREN276_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:345:5: ( objLit | funcLit | arrayObj | elementarySymbol | LPAREN expr RPAREN '?' expr COLON expr -> ^( LPAREN ( expr )+ ) | LPAREN ! expr RPAREN !| id ( typeParam )? )
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
                    // Haxe.g:345:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4570);
                    objLit263=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit263.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:346:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4578);
                    funcLit264=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit264.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:347:7: arrayObj
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayObj_in_value4586);
                    arrayObj265=arrayObj();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayObj265.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:348:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4594);
                    elementarySymbol266=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol266.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:349:9: LPAREN expr RPAREN '?' expr COLON expr
                    {
                    LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN267);


                    pushFollow(FOLLOW_expr_in_value4606);
                    expr268=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr268.getTree());

                    RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN269);


                    char_literal270=(Token)match(input,QUES,FOLLOW_QUES_in_value4610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(char_literal270);


                    pushFollow(FOLLOW_expr_in_value4612);
                    expr271=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr271.getTree());

                    COLON272=(Token)match(input,COLON,FOLLOW_COLON_in_value4614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON272);


                    pushFollow(FOLLOW_expr_in_value4616);
                    expr273=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr273.getTree());

                    // AST REWRITE
                    // elements: expr, LPAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 349:48: -> ^( LPAREN ( expr )+ )
                    {
                        // Haxe.g:349:51: ^( LPAREN ( expr )+ )
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
                    // Haxe.g:350:9: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4638); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value4641);
                    expr275=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr275.getTree());

                    RPAREN276=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4643); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:352:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4659);
                    id277=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id277.getTree());

                    // Haxe.g:352:12: ( typeParam )?
                    int alt76=2;
                    alt76 = dfa76.predict(input);
                    switch (alt76) {
                        case 1 :
                            // Haxe.g:352:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4661);
                            typeParam278=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam278.getTree());

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
    // Haxe.g:356:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:356:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:356:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4681);
                    classDecl279=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl279.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:357:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4701);
                    interfaceDecl280=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl280.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:358:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4721);
                    enumDecl281=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl281.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:359:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4741);
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
    // Haxe.g:362:1: enumDecl : ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM284=null;
        Token IDENTIFIER285=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr283 =null;

        HaxeParser.typeParam_return typeParam286 =null;

        HaxeParser.enumBody_return enumBody287 =null;


        Object ENUM284_tree=null;
        Object IDENTIFIER285_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:362:17: ( ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody ) )
            // Haxe.g:362:19: ( topLevelAccessAttr )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:362:19: ( topLevelAccessAttr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EXTERN||LA79_0==PRIVATE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:362:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_enumDecl4777);
                    topLevelAccessAttr283=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr283.getTree());

                    }
                    break;

            }


            ENUM284=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4780); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM284);


            IDENTIFIER285=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER285);


            // Haxe.g:362:55: ( typeParam )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:362:55: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4784);
                    typeParam286=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam286.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4787);
            enumBody287=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody287.getTree());

            // AST REWRITE
            // elements: topLevelAccessAttr, typeParam, IDENTIFIER, enumBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 362:75: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
            {
                // Haxe.g:362:78: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:362:101: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:362:121: ( typeParam )?
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
    // Haxe.g:365:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:365:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:365:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE288=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE288);


            // Haxe.g:365:26: ( enumValueDecl )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==IDENTIFIER) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Haxe.g:365:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4839);
            	    enumValueDecl289=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl289.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            RBRACE290=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4843); if (state.failed) return retval; 
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
            // 365:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:365:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE288, RBRACE290)
                , root_1);

                // Haxe.g:365:101: ( enumValueDecl )*
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
    // Haxe.g:368:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:368:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
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
                    // Haxe.g:368:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER291=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4883); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER291_tree = 
                    new VarDeclarationNode(IDENTIFIER291) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER291_tree, root_0);
                    }

                    LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4889); if (state.failed) return retval;

                    // Haxe.g:368:59: ( paramList )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==IDENTIFIER||LA82_0==QUES) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // Haxe.g:368:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4892);
                            paramList293=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList293.getTree());

                            }
                            break;

                    }


                    RPAREN294=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4895); if (state.failed) return retval;

                    SEMI295=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4898); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:369:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER296=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4921); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER296_tree = 
                    new VarDeclarationNode(IDENTIFIER296) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER296_tree);
                    }

                    SEMI297=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4926); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:373:1: classDecl : ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( inheritList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS299=null;
        Token IDENTIFIER300=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr298 =null;

        HaxeParser.typeParam_return typeParam301 =null;

        HaxeParser.inheritList_return inheritList302 =null;

        HaxeParser.classBodyScope_return classBodyScope303 =null;


        Object CLASS299_tree=null;
        Object IDENTIFIER300_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_topLevelAccessAttr=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccessAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:373:17: ( ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( inheritList )? classBodyScope ) )
            // Haxe.g:373:19: ( topLevelAccessAttr )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope
            {
            // Haxe.g:373:19: ( topLevelAccessAttr )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==EXTERN||LA84_0==PRIVATE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:373:19: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_classDecl4975);
                    topLevelAccessAttr298=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccessAttr.add(topLevelAccessAttr298.getTree());

                    }
                    break;

            }


            CLASS299=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4978); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS299);


            IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);


            // Haxe.g:373:56: ( typeParam )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LT) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:373:56: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4982);
                    typeParam301=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam301.getTree());

                    }
                    break;

            }


            // Haxe.g:373:67: ( inheritList )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EXTENDS||LA86_0==IMPLEMENTS) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:373:67: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_classDecl4985);
                    inheritList302=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList302.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4988);
            classBodyScope303=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope303.getTree());

            // AST REWRITE
            // elements: typeParam, classBodyScope, IDENTIFIER, inheritList, topLevelAccessAttr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 374:21: -> ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( inheritList )? classBodyScope )
            {
                // Haxe.g:374:24: ^( IDENTIFIER ( topLevelAccessAttr )? ( typeParam )? ( inheritList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:374:48: ( topLevelAccessAttr )?
                if ( stream_topLevelAccessAttr.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccessAttr.nextTree());

                }
                stream_topLevelAccessAttr.reset();

                // Haxe.g:374:68: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:374:79: ( inheritList )?
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
    // Haxe.g:377:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:377:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:377:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE304=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope5055); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE304);


            // Haxe.g:377:26: ( classMember )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==DYNAMIC||LA87_0==FUNCTION||LA87_0==INLINE||LA87_0==OVERRIDE||LA87_0==PRIVATE||LA87_0==PUBLIC||LA87_0==STATIC||LA87_0==VAR) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Haxe.g:377:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope5058);
            	    classMember305=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember305.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            RBRACE306=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope5062); if (state.failed) return retval; 
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
            // 377:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:377:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE304, RBRACE306)
                , root_1);

                // Haxe.g:377:99: ( classMember )*
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
    // Haxe.g:380:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass307 =null;

        HaxeParser.funcDecl_return funcDecl308 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:380:17: ( varDeclClass | funcDecl )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // Haxe.g:380:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember5108);
                    varDeclClass307=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass307.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:381:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember5128);
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
    // Haxe.g:385:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR310=null;
        Token IDENTIFIER311=null;
        Token SEMI315=null;
        HaxeParser.declAttrList_return declAttrList309 =null;

        HaxeParser.propDecl_return propDecl312 =null;

        HaxeParser.typeTag_return typeTag313 =null;

        HaxeParser.varInit_return varInit314 =null;


        Object VAR310_tree=null;
        Object IDENTIFIER311_tree=null;
        Object SEMI315_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:385:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:385:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:385:19: ( declAttrList )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==DYNAMIC||LA89_0==INLINE||LA89_0==OVERRIDE||LA89_0==PRIVATE||LA89_0==PUBLIC||LA89_0==STATIC) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:385:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass5170);
                    declAttrList309=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList309.getTree());

                    }
                    break;

            }


            VAR310=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass5173); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR310);


            IDENTIFIER311=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass5175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER311);


            // Haxe.g:385:48: ( propDecl )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LPAREN) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:385:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass5177);
                    propDecl312=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl312.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass5180);
            typeTag313=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag313.getTree());

            // Haxe.g:385:66: ( varInit )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==EQ) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:385:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass5182);
                    varInit314=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit314.getTree());

                    }
                    break;

            }


            SEMI315=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass5185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI315);


            // AST REWRITE
            // elements: typeTag, IDENTIFIER, varInit, propDecl, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 385:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:385:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:385:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:385:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:385:148: ( varInit )?
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
    // Haxe.g:388:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR316=null;
        Token COMMA318=null;
        Token SEMI320=null;
        HaxeParser.varDeclPartList_return varDeclPartList317 =null;

        HaxeParser.varDeclPartList_return varDeclPartList319 =null;


        Object VAR316_tree=null;
        Object COMMA318_tree=null;
        Object SEMI320_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:388:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:388:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR316=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl5254); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl5257);
            varDeclPartList317=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList317.getTree());

            // Haxe.g:388:40: ( COMMA ! varDeclPartList )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==COMMA) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // Haxe.g:388:41: COMMA ! varDeclPartList
            	    {
            	    COMMA318=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl5260); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl5263);
            	    varDeclPartList319=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList319.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);


            SEMI320=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl5267); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:391:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER321=null;
        HaxeParser.propDecl_return propDecl322 =null;

        HaxeParser.typeTag_return typeTag323 =null;

        HaxeParser.varInit_return varInit324 =null;


        Object IDENTIFIER321_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:391:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:391:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER321=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList5293); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER321);


            // Haxe.g:391:30: ( propDecl )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==LPAREN) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // Haxe.g:391:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList5295);
                    propDecl322=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl322.getTree());

                    }
                    break;

            }


            // Haxe.g:391:40: ( typeTag )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==COLON) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // Haxe.g:391:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList5298);
                    typeTag323=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag323.getTree());

                    }
                    break;

            }


            // Haxe.g:391:49: ( varInit )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==EQ) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Haxe.g:391:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList5301);
                    varInit324=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit324.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: IDENTIFIER, typeTag, propDecl, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 391:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:391:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:391:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:391:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:391:113: ( varInit )?
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
    // Haxe.g:394:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN325=null;
        Token COMMA326=null;
        Token RPAREN327=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN325_tree=null;
        Object COMMA326_tree=null;
        Object RPAREN327_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:394:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:394:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN325=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN325);


            pushFollow(FOLLOW_propAccessor_in_propDecl5356);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA326=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5358); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA326);


            pushFollow(FOLLOW_propAccessor_in_propDecl5362);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN327=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5364); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN327);


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
            // 394:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:394:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
    // Haxe.g:397:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set328=null;

        Object set328_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:397:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set328=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set328)
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
    // Haxe.g:404:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ329=null;
        HaxeParser.expr_return expr330 =null;


        Object EQ329_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:404:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:404:19: EQ expr
            {
            EQ329=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5523); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ329);


            pushFollow(FOLLOW_expr_in_varInit5525);
            expr330=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr330.getTree());

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
            // 404:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:404:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
    // Haxe.g:407:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION332=null;
        Token NEW333=null;
        Token FUNCTION336=null;
        Token IDENTIFIER337=null;
        HaxeParser.declAttrList_return declAttrList331 =null;

        HaxeParser.funcDeclPart_return funcDeclPart334 =null;

        HaxeParser.declAttrList_return declAttrList335 =null;

        HaxeParser.typeParam_return typeParam338 =null;

        HaxeParser.funcDeclPart_return funcDeclPart339 =null;


        Object FUNCTION332_tree=null;
        Object NEW333_tree=null;
        Object FUNCTION336_tree=null;
        Object IDENTIFIER337_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:407:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt99=2;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // Haxe.g:407:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:407:19: ( declAttrList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==DYNAMIC||LA96_0==INLINE||LA96_0==OVERRIDE||LA96_0==PRIVATE||LA96_0==PUBLIC||LA96_0==STATIC) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Haxe.g:407:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5569);
                            declAttrList331=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());

                            }
                            break;

                    }


                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);


                    NEW333=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW333);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5576);
                    funcDeclPart334=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart334.getTree());

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
                    // 408:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:408:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:408:53: ( declAttrList )?
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
                    // Haxe.g:409:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:409:19: ( declAttrList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DYNAMIC||LA97_0==INLINE||LA97_0==OVERRIDE||LA97_0==PRIVATE||LA97_0==PUBLIC||LA97_0==STATIC) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Haxe.g:409:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5634);
                            declAttrList335=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList335.getTree());

                            }
                            break;

                    }


                    FUNCTION336=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION336);


                    IDENTIFIER337=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER337);


                    // Haxe.g:409:53: ( typeParam )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==LT) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:409:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5641);
                            typeParam338=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam338.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5644);
                    funcDeclPart339=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart339.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, funcDeclPart, declAttrList, IDENTIFIER, typeParam
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 410:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:410:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:410:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:410:87: ( typeParam )?
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
    // Haxe.g:413:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN340=null;
        Token RPAREN342=null;
        Token SEMI345=null;
        HaxeParser.paramList_return paramList341 =null;

        HaxeParser.typeTag_return typeTag343 =null;

        HaxeParser.block_return block344 =null;


        Object LPAREN340_tree=null;
        Object RPAREN342_tree=null;
        Object SEMI345_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:413:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:413:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN340=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5728); if (state.failed) return retval;

            // Haxe.g:413:27: ( paramList )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==IDENTIFIER||LA100_0==QUES) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // Haxe.g:413:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5731);
                    paramList341=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList341.getTree());

                    }
                    break;

            }


            RPAREN342=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5734); if (state.failed) return retval;

            // Haxe.g:413:46: ( typeTag )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==COLON) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // Haxe.g:413:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5737);
                    typeTag343=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag343.getTree());

                    }
                    break;

            }


            // Haxe.g:413:55: ( block | SEMI !)
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LBRACE) ) {
                alt102=1;
            }
            else if ( (LA102_0==SEMI) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // Haxe.g:413:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5741);
                    block344=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block344.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:413:64: SEMI !
                    {
                    SEMI345=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5745); if (state.failed) return retval;

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
    // Haxe.g:416:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION347=null;
        Token NEW348=null;
        Token LPAREN349=null;
        Token RPAREN351=null;
        Token SEMI353=null;
        Token FUNCTION355=null;
        Token IDENTIFIER356=null;
        Token LPAREN358=null;
        Token RPAREN360=null;
        Token SEMI362=null;
        Token FUNCTION363=null;
        Token NEW364=null;
        Token LPAREN365=null;
        Token RPAREN367=null;
        Token SEMI369=null;
        Token FUNCTION370=null;
        Token IDENTIFIER371=null;
        Token LPAREN373=null;
        Token RPAREN375=null;
        Token SEMI377=null;
        HaxeParser.declAttrList_return declAttrList346 =null;

        HaxeParser.paramList_return paramList350 =null;

        HaxeParser.typeTag_return typeTag352 =null;

        HaxeParser.declAttrList_return declAttrList354 =null;

        HaxeParser.typeParam_return typeParam357 =null;

        HaxeParser.paramList_return paramList359 =null;

        HaxeParser.typeTag_return typeTag361 =null;

        HaxeParser.paramList_return paramList366 =null;

        HaxeParser.typeTag_return typeTag368 =null;

        HaxeParser.typeParam_return typeParam372 =null;

        HaxeParser.paramList_return paramList374 =null;

        HaxeParser.typeTag_return typeTag376 =null;


        Object FUNCTION347_tree=null;
        Object NEW348_tree=null;
        Object LPAREN349_tree=null;
        Object RPAREN351_tree=null;
        Object SEMI353_tree=null;
        Object FUNCTION355_tree=null;
        Object IDENTIFIER356_tree=null;
        Object LPAREN358_tree=null;
        Object RPAREN360_tree=null;
        Object SEMI362_tree=null;
        Object FUNCTION363_tree=null;
        Object NEW364_tree=null;
        Object LPAREN365_tree=null;
        Object RPAREN367_tree=null;
        Object SEMI369_tree=null;
        Object FUNCTION370_tree=null;
        Object IDENTIFIER371_tree=null;
        Object LPAREN373_tree=null;
        Object RPAREN375_tree=null;
        Object SEMI377_tree=null;
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

            // Haxe.g:417:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt113=4;
            alt113 = dfa113.predict(input);
            switch (alt113) {
                case 1 :
                    // Haxe.g:417:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5782);
                    declAttrList346=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList346.getTree());

                    FUNCTION347=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION347);


                    NEW348=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5786); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW348);


                    LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN349);


                    // Haxe.g:417:42: ( paramList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER||LA103_0==QUES) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:417:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5790);
                            paramList350=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList350.getTree());

                            }
                            break;

                    }


                    RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN351);


                    // Haxe.g:417:60: ( typeTag )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==COLON) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:417:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5795);
                            typeTag352=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag352.getTree());

                            }
                            break;

                    }


                    SEMI353=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI353);


                    // AST REWRITE
                    // elements: paramList, declAttrList, typeTag, NEW, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 418:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:418:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:418:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:418:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:418:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:418:52: ( declAttrList )?
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
                    // Haxe.g:419:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5839);
                    declAttrList354=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList354.getTree());

                    FUNCTION355=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION355);


                    IDENTIFIER356=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER356);


                    // Haxe.g:419:42: ( typeParam )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==LT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:419:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5845);
                            typeParam357=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam357.getTree());

                            }
                            break;

                    }


                    LPAREN358=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN358);


                    // Haxe.g:419:60: ( paramList )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==IDENTIFIER||LA106_0==QUES) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:419:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5850);
                            paramList359=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList359.getTree());

                            }
                            break;

                    }


                    RPAREN360=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN360);


                    // Haxe.g:419:78: ( typeTag )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==COLON) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:419:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5855);
                            typeTag361=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag361.getTree());

                            }
                            break;

                    }


                    SEMI362=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI362);


                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, FUNCTION, declAttrList, typeParam, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 420:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:420:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:420:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:420:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:420:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:420:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:420:73: ( typeParam )?
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
                    // Haxe.g:421:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION363=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5902); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION363);


                    NEW364=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5904); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW364);


                    LPAREN365=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5906); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN365);


                    // Haxe.g:421:29: ( paramList )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==IDENTIFIER||LA108_0==QUES) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:421:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5908);
                            paramList366=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList366.getTree());

                            }
                            break;

                    }


                    RPAREN367=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5911); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN367);


                    // Haxe.g:421:47: ( typeTag )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==COLON) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:421:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5913);
                            typeTag368=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag368.getTree());

                            }
                            break;

                    }


                    SEMI369=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5916); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI369);


                    // AST REWRITE
                    // elements: NEW, FUNCTION, paramList, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 422:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:422:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:422:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:422:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:422:43: ( typeTag )?
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
                    // Haxe.g:423:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION370=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION370);


                    IDENTIFIER371=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER371);


                    // Haxe.g:423:29: ( typeParam )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==LT) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // Haxe.g:423:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5958);
                            typeParam372=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam372.getTree());

                            }
                            break;

                    }


                    LPAREN373=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN373);


                    // Haxe.g:423:47: ( paramList )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==IDENTIFIER||LA111_0==QUES) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // Haxe.g:423:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5963);
                            paramList374=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList374.getTree());

                            }
                            break;

                    }


                    RPAREN375=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5966); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN375);


                    // Haxe.g:423:65: ( typeTag )?
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==COLON) ) {
                        alt112=1;
                    }
                    switch (alt112) {
                        case 1 :
                            // Haxe.g:423:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5968);
                            typeTag376=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag376.getTree());

                            }
                            break;

                    }


                    SEMI377=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5971); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI377);


                    // AST REWRITE
                    // elements: typeParam, paramList, FUNCTION, typeTag, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 424:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:424:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:424:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:424:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:424:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:424:59: ( typeParam )?
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
    // Haxe.g:427:1: interfaceDecl : ( topLevelAccessAttr )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE379=null;
        Token LBRACE382=null;
        Token RBRACE384=null;
        HaxeParser.topLevelAccessAttr_return topLevelAccessAttr378 =null;

        HaxeParser.type_return type380 =null;

        HaxeParser.inheritList_return inheritList381 =null;

        HaxeParser.interfaceBody_return interfaceBody383 =null;


        Object INTERFACE379_tree=null;
        Object LBRACE382_tree=null;
        Object RBRACE384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:428:5: ( ( topLevelAccessAttr )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:428:9: ( topLevelAccessAttr )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:428:9: ( topLevelAccessAttr )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==EXTERN||LA114_0==PRIVATE) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // Haxe.g:428:9: topLevelAccessAttr
                    {
                    pushFollow(FOLLOW_topLevelAccessAttr_in_interfaceDecl6030);
                    topLevelAccessAttr378=topLevelAccessAttr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccessAttr378.getTree());

                    }
                    break;

            }


            INTERFACE379=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl6033); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE379_tree = 
            (Object)adaptor.create(INTERFACE379)
            ;
            adaptor.addChild(root_0, INTERFACE379_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl6035);
            type380=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type380.getTree());

            // Haxe.g:428:44: ( inheritList )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==EXTENDS||LA115_0==IMPLEMENTS) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // Haxe.g:428:44: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_interfaceDecl6037);
                    inheritList381=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritList381.getTree());

                    }
                    break;

            }


            LBRACE382=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl6040); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl6043);
            interfaceBody383=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody383.getTree());

            RBRACE384=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl6045); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:431:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
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

            // Haxe.g:432:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt116=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt116=1;
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
                alt116=2;
                }
                break;
            case EOF:
            case RBRACE:
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
                    // Haxe.g:432:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody6069);
                    varDecl385=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl385.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody6071);
                    interfaceBody386=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody386.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:433:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody6081);
                    funcProtoDecl387=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl387.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody6083);
                    interfaceBody388=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody388.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:436:5: 
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
    // Haxe.g:438:1: inheritList : inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA390=null;
        HaxeParser.inherit_return inherit389 =null;

        HaxeParser.inherit_return inherit391 =null;


        Object COMMA390_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_inherit=new RewriteRuleSubtreeStream(adaptor,"rule inherit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:438:17: ( inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) )
            // Haxe.g:438:19: inherit ( COMMA inherit )*
            {
            pushFollow(FOLLOW_inherit_in_inheritList6107);
            inherit389=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inherit.add(inherit389.getTree());

            // Haxe.g:438:27: ( COMMA inherit )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==COMMA) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // Haxe.g:438:28: COMMA inherit
            	    {
            	    COMMA390=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList6110); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA390);


            	    pushFollow(FOLLOW_inherit_in_inheritList6112);
            	    inherit391=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inherit.add(inherit391.getTree());

            	    }
            	    break;

            	default :
            	    break loop117;
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
            // 438:44: -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
            {
                // Haxe.g:438:47: ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 73, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:441:1: inherit : ( EXTENDS ^ type | IMPLEMENTS ^ type );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS392=null;
        Token IMPLEMENTS394=null;
        HaxeParser.type_return type393 =null;

        HaxeParser.type_return type395 =null;


        Object EXTENDS392_tree=null;
        Object IMPLEMENTS394_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:441:17: ( EXTENDS ^ type | IMPLEMENTS ^ type )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==EXTENDS) ) {
                alt118=1;
            }
            else if ( (LA118_0==IMPLEMENTS) ) {
                alt118=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;

            }
            switch (alt118) {
                case 1 :
                    // Haxe.g:441:19: EXTENDS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS392=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit6164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS392_tree = 
                    (Object)adaptor.create(EXTENDS392)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EXTENDS392_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit6167);
                    type393=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type393.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:442:19: IMPLEMENTS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS394=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit6187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS394_tree = 
                    (Object)adaptor.create(IMPLEMENTS394)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLEMENTS394_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit6190);
                    type395=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type395.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:445:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:445:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:445:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF396=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl6223); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF396_tree = 
            (Object)adaptor.create(TYPEDEF396)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF396_tree, root_0);
            }

            IDENTIFIER397=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl6226); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER397_tree = 
            (Object)adaptor.create(IDENTIFIER397)
            ;
            adaptor.addChild(root_0, IDENTIFIER397_tree);
            }

            EQ398=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl6228); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl6231);
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
    // Haxe.g:448:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT400=null;
        HaxeParser.funcType_return funcType401 =null;


        Object GT400_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:448:17: ( GT ^ funcType )
            // Haxe.g:448:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT400=(Token)match(input,GT,FOLLOW_GT_in_typeExtend6265); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT400_tree = 
            (Object)adaptor.create(GT400)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT400_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend6268);
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
    // Haxe.g:451:1: objLit : LBRACE ! objLitElemList RBRACE !;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:451:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:451:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE402=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit6302); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit6305);
            objLitElemList403=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList403.getTree());

            RBRACE404=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit6307); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:454:1: anonTypeField : IDENTIFIER COLON ! funcType ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:454:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:454:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER405=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6335); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER405_tree = 
            (Object)adaptor.create(IDENTIFIER405)
            ;
            adaptor.addChild(root_0, IDENTIFIER405_tree);
            }

            COLON406=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6337); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6340);
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
    // Haxe.g:457:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }

            // Haxe.g:457:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:457:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6370);
            objLitElem408=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem408.getTree());

            // Haxe.g:457:30: ( COMMA ! objLitElem )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==COMMA) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // Haxe.g:457:31: COMMA ! objLitElem
            	    {
            	    COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6373); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6376);
            	    objLitElem410=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem410.getTree());

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
    // Haxe.g:460:1: objLitElem : IDENTIFIER COLON ! expr ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }

            // Haxe.g:460:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:460:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER411=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6412); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER411_tree = 
            (Object)adaptor.create(IDENTIFIER411)
            ;
            adaptor.addChild(root_0, IDENTIFIER411_tree);
            }

            COLON412=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6414); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6417);
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
    // Haxe.g:464:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }

            // Haxe.g:465:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
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
                    // Haxe.g:465:7: LONGLITERAL
                    {
                    LONGLITERAL414=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6451); if (state.failed) return retval; 
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
                    // 465:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
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
                    // Haxe.g:466:7: NULL
                    {
                    NULL415=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6469); if (state.failed) return retval; 
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
                    // 466:21: -> NULL[$NULL,\"Unknown<0>\"]
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
                    // Haxe.g:467:7: INTLITERAL
                    {
                    INTLITERAL416=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6494); if (state.failed) return retval; 
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
                    // 467:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
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
                    // Haxe.g:468:7: STRINGLITERAL
                    {
                    STRINGLITERAL417=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6513); if (state.failed) return retval; 
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
                    // 468:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
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
                    // Haxe.g:469:7: CHARLITERAL
                    {
                    CHARLITERAL418=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6529); if (state.failed) return retval; 
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
                    // 469:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
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
                    // Haxe.g:470:7: FLOATNUM
                    {
                    FLOATNUM419=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6547); if (state.failed) return retval; 
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
                    // 470:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
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
                    // Haxe.g:471:7: TRUE
                    {
                    TRUE420=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6568); if (state.failed) return retval; 
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
                    // 471:21: -> TRUE[$TRUE,\"BOOL\"]
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
                    // Haxe.g:472:7: FALSE
                    {
                    FALSE421=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6593); if (state.failed) return retval; 
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
                    // 472:21: -> FALSE[$FALSE,\"BOOL\"]
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
            if ( state.backtracking>0 ) { memoize(input, 81, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:201:61: ( typeParam )
        // Haxe.g:201:61: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred57_Haxe1914);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {
        // Haxe.g:204:19: ( LT typeList typeParamPart )
        // Haxe.g:204:19: LT typeList typeParamPart
        {
        match(input,LT,FOLLOW_LT_in_synpred58_Haxe1950); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred58_Haxe1952);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_typeParamPart_in_synpred58_Haxe1954);
        typeParamPart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:208:19: ( LT typeList GTGT )
        // Haxe.g:208:19: LT typeList GTGT
        {
        match(input,LT,FOLLOW_LT_in_synpred59_Haxe2048); if (state.failed) return ;

        pushFollow(FOLLOW_typeList_in_synpred59_Haxe2050);
        typeList();

        state._fsp--;
        if (state.failed) return ;

        match(input,GTGT,FOLLOW_GTGT_in_synpred59_Haxe2052); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred61_Haxe
    public final void synpred61_Haxe_fragment() throws RecognitionException {
        // Haxe.g:217:19: ( statementLast )
        // Haxe.g:217:19: statementLast
        {
        pushFollow(FOLLOW_statementLast_in_synpred61_Haxe2190);
        statementLast();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_Haxe

    // $ANTLR start synpred63_Haxe
    public final void synpred63_Haxe_fragment() throws RecognitionException {
        // Haxe.g:222:62: ( ELSE statementOrLast )
        // Haxe.g:222:62: ELSE statementOrLast
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred63_Haxe2275); if (state.failed) return ;

        pushFollow(FOLLOW_statementOrLast_in_synpred63_Haxe2278);
        statementOrLast();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_Haxe

    // $ANTLR start synpred77_Haxe
    public final void synpred77_Haxe_fragment() throws RecognitionException {
        // Haxe.g:234:19: ( statementLast )
        // Haxe.g:234:19: statementLast
        {
        pushFollow(FOLLOW_statementLast_in_synpred77_Haxe2593);
        statementLast();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred77_Haxe

    // $ANTLR start synpred84_Haxe
    public final void synpred84_Haxe_fragment() throws RecognitionException {
        // Haxe.g:264:32: ( assignOp ternaryExpr )
        // Haxe.g:264:32: assignOp ternaryExpr
        {
        pushFollow(FOLLOW_assignOp_in_synpred84_Haxe3006);
        assignOp();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred84_Haxe3009);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred84_Haxe

    // $ANTLR start synpred85_Haxe
    public final void synpred85_Haxe_fragment() throws RecognitionException {
        // Haxe.g:267:32: ( QUES expr COLON ternaryExpr )
        // Haxe.g:267:32: QUES expr COLON ternaryExpr
        {
        match(input,QUES,FOLLOW_QUES_in_synpred85_Haxe3043); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred85_Haxe3046);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred85_Haxe3048); if (state.failed) return ;

        pushFollow(FOLLOW_ternaryExpr_in_synpred85_Haxe3051);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred85_Haxe

    // $ANTLR start synpred86_Haxe
    public final void synpred86_Haxe_fragment() throws RecognitionException {
        // Haxe.g:270:33: ( BARBAR logicAndExpr )
        // Haxe.g:270:33: BARBAR logicAndExpr
        {
        match(input,BARBAR,FOLLOW_BARBAR_in_synpred86_Haxe3085); if (state.failed) return ;

        pushFollow(FOLLOW_logicAndExpr_in_synpred86_Haxe3091);
        logicAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred86_Haxe

    // $ANTLR start synpred87_Haxe
    public final void synpred87_Haxe_fragment() throws RecognitionException {
        // Haxe.g:273:28: ( AMPAMP iterExpr )
        // Haxe.g:273:28: AMPAMP iterExpr
        {
        match(input,AMPAMP,FOLLOW_AMPAMP_in_synpred87_Haxe3127); if (state.failed) return ;

        pushFollow(FOLLOW_iterExpr_in_synpred87_Haxe3133);
        iterExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred87_Haxe

    // $ANTLR start synpred88_Haxe
    public final void synpred88_Haxe_fragment() throws RecognitionException {
        // Haxe.g:276:28: ( ELLIPSIS cmpExpr )
        // Haxe.g:276:28: ELLIPSIS cmpExpr
        {
        match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_synpred88_Haxe3186); if (state.failed) return ;

        pushFollow(FOLLOW_cmpExpr_in_synpred88_Haxe3192);
        cmpExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred88_Haxe

    // $ANTLR start synpred94_Haxe
    public final void synpred94_Haxe_fragment() throws RecognitionException {
        // Haxe.g:279:28: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )
        // Haxe.g:279:28: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
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


        pushFollow(FOLLOW_bitExpr_in_synpred94_Haxe3410);
        bitExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred94_Haxe

    // $ANTLR start synpred97_Haxe
    public final void synpred97_Haxe_fragment() throws RecognitionException {
        // Haxe.g:288:30: ( ( BAR | AMP | CARET ) shiftExpr )
        // Haxe.g:288:30: ( BAR | AMP | CARET ) shiftExpr
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


        pushFollow(FOLLOW_shiftExpr_in_synpred97_Haxe3541);
        shiftExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred97_Haxe

    // $ANTLR start synpred100_Haxe
    public final void synpred100_Haxe_fragment() throws RecognitionException {
        // Haxe.g:294:28: ( ( LTLT | GTGT | GTGTGT ) addExpr )
        // Haxe.g:294:28: ( LTLT | GTGT | GTGTGT ) addExpr
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


        pushFollow(FOLLOW_addExpr_in_synpred100_Haxe3666);
        addExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred100_Haxe

    // $ANTLR start synpred102_Haxe
    public final void synpred102_Haxe_fragment() throws RecognitionException {
        // Haxe.g:300:29: ( ( PLUS | SUB ) multExpr )
        // Haxe.g:300:29: ( PLUS | SUB ) multExpr
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


        pushFollow(FOLLOW_multExpr_in_synpred102_Haxe3764);
        multExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred102_Haxe

    // $ANTLR start synpred105_Haxe
    public final void synpred105_Haxe_fragment() throws RecognitionException {
        // Haxe.g:305:29: ( ( STAR | SLASH | PERCENT ) unarExpr )
        // Haxe.g:305:29: ( STAR | SLASH | PERCENT ) unarExpr
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


        pushFollow(FOLLOW_unarExpr_in_synpred105_Haxe3895);
        unarExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred105_Haxe

    // $ANTLR start synpred111_Haxe
    public final void synpred111_Haxe_fragment() throws RecognitionException {
        // Haxe.g:317:31: ( PLUSPLUS )
        // Haxe.g:317:31: PLUSPLUS
        {
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred111_Haxe4049); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred111_Haxe

    // $ANTLR start synpred112_Haxe
    public final void synpred112_Haxe_fragment() throws RecognitionException {
        // Haxe.g:317:61: ( SUBSUB )
        // Haxe.g:317:61: SUBSUB
        {
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred112_Haxe4055); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred112_Haxe

    // $ANTLR start synpred118_Haxe
    public final void synpred118_Haxe_fragment() throws RecognitionException {
        // Haxe.g:326:49: ( pureCallOrSlice )
        // Haxe.g:326:49: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred118_Haxe4233);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:326:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:326:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred119_Haxe4224);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred119_Haxe4226); if (state.failed) return ;

        // Haxe.g:326:32: ( exprList )?
        int alt131=2;
        int LA131_0 = input.LA(1);

        if ( (LA131_0==BANG||LA131_0==CAST||LA131_0==CHARLITERAL||LA131_0==FALSE||LA131_0==FLOATNUM||LA131_0==FUNCTION||LA131_0==IDENTIFIER||LA131_0==INTLITERAL||(LA131_0 >= LBRACE && LA131_0 <= LBRACKET)||(LA131_0 >= LONGLITERAL && LA131_0 <= LPAREN)||(LA131_0 >= NEW && LA131_0 <= NULL)||LA131_0==PLUSPLUS||(LA131_0 >= STRINGLITERAL && LA131_0 <= SUB)||LA131_0==SUBSUB||LA131_0==THIS||LA131_0==TILDE||LA131_0==TRUE||LA131_0==UNTYPED) ) {
            alt131=1;
        }
        switch (alt131) {
            case 1 :
                // Haxe.g:326:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred119_Haxe4228);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred119_Haxe4231); if (state.failed) return ;

        // Haxe.g:326:49: ( pureCallOrSlice )?
        int alt132=2;
        int LA132_0 = input.LA(1);

        if ( (LA132_0==DOT||LA132_0==LBRACKET) ) {
            alt132=1;
        }
        switch (alt132) {
            case 1 :
                // Haxe.g:326:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4233);
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
        // Haxe.g:328:48: ( pureCallOrSlice )
        // Haxe.g:328:48: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe4292);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred121_Haxe
    public final void synpred121_Haxe_fragment() throws RecognitionException {
        // Haxe.g:328:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:328:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred121_Haxe4284);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred121_Haxe4286); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred121_Haxe4288);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred121_Haxe4290); if (state.failed) return ;

        // Haxe.g:328:48: ( pureCallOrSlice )?
        int alt133=2;
        int LA133_0 = input.LA(1);

        if ( (LA133_0==DOT||LA133_0==LBRACKET) ) {
            alt133=1;
        }
        switch (alt133) {
            case 1 :
                // Haxe.g:328:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred121_Haxe4292);
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
        // Haxe.g:330:19: ( value pureCallOrSlice )
        // Haxe.g:330:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred122_Haxe4343);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred122_Haxe4346);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred122_Haxe

    // $ANTLR start synpred124_Haxe
    public final void synpred124_Haxe_fragment() throws RecognitionException {
        // Haxe.g:334:43: ( pureCallOrSlice )
        // Haxe.g:334:43: pureCallOrSlice
        {
        pushFollow(FOLLOW_pureCallOrSlice_in_synpred124_Haxe4399);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_Haxe

    // $ANTLR start synpred131_Haxe
    public final void synpred131_Haxe_fragment() throws RecognitionException {
        // Haxe.g:349:9: ( LPAREN expr RPAREN '?' expr COLON expr )
        // Haxe.g:349:9: LPAREN expr RPAREN '?' expr COLON expr
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred131_Haxe4604); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4606);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred131_Haxe4608); if (state.failed) return ;

        match(input,QUES,FOLLOW_QUES_in_synpred131_Haxe4610); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4612);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred131_Haxe4614); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred131_Haxe4616);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred131_Haxe

    // $ANTLR start synpred132_Haxe
    public final void synpred132_Haxe_fragment() throws RecognitionException {
        // Haxe.g:350:9: ( LPAREN expr RPAREN )
        // Haxe.g:350:9: LPAREN expr RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred132_Haxe4638); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred132_Haxe4641);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred132_Haxe4643); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred132_Haxe

    // $ANTLR start synpred133_Haxe
    public final void synpred133_Haxe_fragment() throws RecognitionException {
        // Haxe.g:352:12: ( typeParam )
        // Haxe.g:352:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred133_Haxe4661);
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
    public final boolean synpred61_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_Haxe_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_Haxe_fragment(); // can never throw exception
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


    protected DFA69 dfa69 = new DFA69(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA113 dfa113 = new DFA113(this);
    static final String DFA69_eotS =
        "\120\uffff";
    static final String DFA69_eofS =
        "\1\3\117\uffff";
    static final String DFA69_minS =
        "\1\5\2\0\115\uffff";
    static final String DFA69_maxS =
        "\1\u00a7\2\0\115\uffff";
    static final String DFA69_acceptS =
        "\3\uffff\1\2\113\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\1\1\115\uffff}>";
    static final String[] DFA69_transitionS = {
            "\3\3\1\uffff\2\3\1\uffff\3\3\2\uffff\1\3\2\uffff\4\3\2\uffff"+
            "\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\2\2\uffff\2\3\3\uffff"+
            "\2\3\3\uffff\1\3\1\uffff\1\3\3\uffff\3\3\1\uffff\6\3\4\uffff"+
            "\2\3\3\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\1\1\uffff\6\3\6\uffff"+
            "\2\3\4\uffff\5\3\15\uffff\1\3\3\uffff\6\3\1\uffff\4\3\3\uffff"+
            "\4\3\2\uffff\3\3\1\uffff\1\3\1\uffff\2\3\6\uffff\1\3\1\uffff"+
            "\1\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "326:49: ( pureCallOrSlice )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred118_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred118_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index69_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA70_eotS =
        "\120\uffff";
    static final String DFA70_eofS =
        "\1\3\117\uffff";
    static final String DFA70_minS =
        "\1\5\2\0\115\uffff";
    static final String DFA70_maxS =
        "\1\u00a7\2\0\115\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\1\2\113\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\1\1\115\uffff}>";
    static final String[] DFA70_transitionS = {
            "\3\3\1\uffff\2\3\1\uffff\3\3\2\uffff\1\3\2\uffff\4\3\2\uffff"+
            "\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\2\2\uffff\2\3\3\uffff"+
            "\2\3\3\uffff\1\3\1\uffff\1\3\3\uffff\3\3\1\uffff\6\3\4\uffff"+
            "\2\3\3\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\1\1\uffff\6\3\6\uffff"+
            "\2\3\4\uffff\5\3\15\uffff\1\3\3\uffff\6\3\1\uffff\4\3\3\uffff"+
            "\4\3\2\uffff\3\3\1\uffff\1\3\1\uffff\2\3\6\uffff\1\3\1\uffff"+
            "\1\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "328:48: ( pureCallOrSlice )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred120_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index70_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA70_2 = input.LA(1);

                         
                        int index70_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred120_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index70_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA73_eotS =
        "\120\uffff";
    static final String DFA73_eofS =
        "\1\3\117\uffff";
    static final String DFA73_minS =
        "\1\5\2\0\115\uffff";
    static final String DFA73_maxS =
        "\1\u00a7\2\0\115\uffff";
    static final String DFA73_acceptS =
        "\3\uffff\1\2\113\uffff\1\1";
    static final String DFA73_specialS =
        "\1\uffff\1\0\1\1\115\uffff}>";
    static final String[] DFA73_transitionS = {
            "\3\3\1\uffff\2\3\1\uffff\3\3\2\uffff\1\3\2\uffff\4\3\2\uffff"+
            "\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\2\2\uffff\2\3\3\uffff"+
            "\2\3\3\uffff\1\3\1\uffff\1\3\3\uffff\3\3\1\uffff\6\3\4\uffff"+
            "\2\3\3\uffff\1\3\5\uffff\1\3\2\uffff\1\3\1\1\1\uffff\6\3\6\uffff"+
            "\2\3\4\uffff\5\3\15\uffff\1\3\3\uffff\6\3\1\uffff\4\3\3\uffff"+
            "\4\3\2\uffff\3\3\1\uffff\1\3\1\uffff\2\3\6\uffff\1\3\1\uffff"+
            "\1\3\3\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "334:43: ( pureCallOrSlice )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_1 = input.LA(1);

                         
                        int index73_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred124_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index73_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred124_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index73_2);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA76_eotS =
        "\120\uffff";
    static final String DFA76_eofS =
        "\1\2\117\uffff";
    static final String DFA76_minS =
        "\1\5\1\0\116\uffff";
    static final String DFA76_maxS =
        "\1\u00a7\1\0\116\uffff";
    static final String DFA76_acceptS =
        "\2\uffff\1\2\114\uffff\1\1";
    static final String DFA76_specialS =
        "\1\uffff\1\0\116\uffff}>";
    static final String[] DFA76_transitionS = {
            "\3\2\1\uffff\2\2\1\uffff\3\2\2\uffff\1\2\2\uffff\4\2\2\uffff"+
            "\4\2\2\uffff\1\2\1\uffff\1\2\1\uffff\2\2\2\uffff\2\2\3\uffff"+
            "\2\2\3\uffff\1\2\1\uffff\1\2\3\uffff\3\2\1\uffff\6\2\4\uffff"+
            "\2\2\3\uffff\1\2\5\uffff\1\2\2\uffff\2\2\1\uffff\2\2\1\1\3\2"+
            "\6\uffff\2\2\4\uffff\5\2\15\uffff\1\2\3\uffff\6\2\1\uffff\4"+
            "\2\3\uffff\4\2\2\uffff\3\2\1\uffff\1\2\1\uffff\2\2\6\uffff\1"+
            "\2\1\uffff\1\2\3\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
    static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
    static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
    static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
    static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
    static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
    static final short[][] DFA76_transition;

    static {
        int numStates = DFA76_transitionS.length;
        DFA76_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
        }
    }

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = DFA76_eot;
            this.eof = DFA76_eof;
            this.min = DFA76_min;
            this.max = DFA76_max;
            this.accept = DFA76_accept;
            this.special = DFA76_special;
            this.transition = DFA76_transition;
        }
        public String getDescription() {
            return "352:12: ( typeParam )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_1 = input.LA(1);

                         
                        int index76_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred133_Haxe()) ) {s = 79;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index76_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA88_eotS =
        "\4\uffff";
    static final String DFA88_eofS =
        "\4\uffff";
    static final String DFA88_minS =
        "\2\47\2\uffff";
    static final String DFA88_maxS =
        "\2\u00a3\2\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA88_specialS =
        "\4\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\30\uffff\1\2",
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\30\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "380:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA99_eotS =
        "\5\uffff";
    static final String DFA99_eofS =
        "\5\uffff";
    static final String DFA99_minS =
        "\2\47\1\106\2\uffff";
    static final String DFA99_maxS =
        "\2\u008a\1\143\2\uffff";
    static final String DFA99_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA99_specialS =
        "\5\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\34\uffff\1\3",
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
            return "407:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA113_eotS =
        "\10\uffff";
    static final String DFA113_eofS =
        "\10\uffff";
    static final String DFA113_minS =
        "\2\47\2\106\4\uffff";
    static final String DFA113_maxS =
        "\2\u008a\2\143\4\uffff";
    static final String DFA113_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA113_specialS =
        "\10\uffff}>";
    static final String[] DFA113_transitionS = {
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

    static final short[] DFA113_eot = DFA.unpackEncodedString(DFA113_eotS);
    static final short[] DFA113_eof = DFA.unpackEncodedString(DFA113_eofS);
    static final char[] DFA113_min = DFA.unpackEncodedStringToUnsignedChars(DFA113_minS);
    static final char[] DFA113_max = DFA.unpackEncodedStringToUnsignedChars(DFA113_maxS);
    static final short[] DFA113_accept = DFA.unpackEncodedString(DFA113_acceptS);
    static final short[] DFA113_special = DFA.unpackEncodedString(DFA113_specialS);
    static final short[][] DFA113_transition;

    static {
        int numStates = DFA113_transitionS.length;
        DFA113_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA113_transition[i] = DFA.unpackEncodedString(DFA113_transitionS[i]);
        }
    }

    class DFA113 extends DFA {

        public DFA113(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 113;
            this.eot = DFA113_eot;
            this.eof = DFA113_eof;
            this.min = DFA113_min;
            this.max = DFA113_max;
            this.accept = DFA113_accept;
            this.special = DFA113_special;
            this.transition = DFA113_transition;
        }
        public String getDescription() {
            return "416:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
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
    public static final BitSet FOLLOW_topLevelAccess_in_topLevelAccessAttr742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList782 = new BitSet(new long[]{0x0000008000000002L,0x4800004000002000L,0x0000000000000400L});
    public static final BitSet FOLLOW_param_in_paramList827 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList830 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_param_in_paramList832 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_QUES_in_param882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param885 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_param887 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_param890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1436 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcLit1439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1442 = new BitSet(new long[]{0x0000000010000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_funcLit1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1492 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1538 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1541 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeList1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1566 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1569 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeList1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1610 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_funcType1613 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1651 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000040L,0x0000000800000001L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1738 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000000800000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1799 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1804 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1899 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_filepath_in_type1904 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_anonType_in_type1909 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParam_in_type1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1950 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParamPart_in_typeParam1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1988 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1990 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2048 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2050 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_typeParamPart2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParamPart2084 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeParamPart2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000001L});
    public static final BitSet FOLLOW_typeParam_in_typeParamPart2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_GTGTGT_in_typeParamPart2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint2142 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint2146 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint2148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statement2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statement2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statementLast2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statementLast2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2270 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statementOrLast_in_statementLast2272 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ELSE_in_statementLast2275 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statementOrLast_in_statementLast2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statementLast2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2306 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statementLast2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_IN_in_statementLast2311 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_iterExpr_in_statementLast2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2316 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statementLast2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2339 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2345 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statementLast2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statementLast2367 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statementLast2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_WHILE_in_statementLast2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_parExpression_in_statementLast2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statementLast2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_statementLast2407 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_catchStmt_in_statementLast2409 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_SWITCH_in_statementLast2430 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_statementLast2436 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statementLast2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_statementLast2441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACE_in_statementLast2444 = new BitSet(new long[]{0x0000000400400000L});
    public static final BitSet FOLLOW_caseStmt_in_statementLast2447 = new BitSet(new long[]{0x0000000400400000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_statementLast2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statementLast2471 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916010L});
    public static final BitSet FOLLOW_expr_in_statementLast2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statementLast2501 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_statementLast2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statementLast2527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_statementLast2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statementLast2544 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_statementLast2546 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_statementLast2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_statementOrLast2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statementOrLast2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2643 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_parExpression2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2684 = new BitSet(new long[]{0x071400110C820200L,0x0800201801B200C0L,0x0000008A06B96005L});
    public static final BitSet FOLLOW_blockStmt_in_block2687 = new BitSet(new long[]{0x071400110C820200L,0x0800201801B200C0L,0x0000008A06B96005L});
    public static final BitSet FOLLOW_RBRACE_in_block2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2781 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2784 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2786 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_caseStmt2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2809 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2812 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statement_in_caseStmt2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2850 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2856 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L});
    public static final BitSet FOLLOW_param_in_catchStmt2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_block_in_catchStmt2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2902 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2905 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_exprList2908 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2950 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr3003 = new BitSet(new long[]{0x8000200000204082L,0x0000140010000002L,0x0000000000008280L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr3006 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr3040 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr3043 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr3046 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr3048 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3082 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr3085 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr3091 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3125 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr3127 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr3133 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3183 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr3186 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3231 = new BitSet(new long[]{0x3000400000000402L,0x0000000006000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3258 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3287 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3316 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3345 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3374 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3403 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3410 = new BitSet(new long[]{0x3000400000000402L,0x0000000006000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3449 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3476 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3505 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3534 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3541 = new BitSet(new long[]{0x0000000000101022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3574 = new BitSet(new long[]{0x4000000000000002L,0x0000000008000001L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3601 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3630 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3659 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3666 = new BitSet(new long[]{0x4000000000000002L,0x0000000008000001L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3701 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3728 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3757 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3764 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3803 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_STAR_in_multExpr3830 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3859 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3888 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3895 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L,0x0000000000000140L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3943 = new BitSet(new long[]{0x0510000004800000L,0x0000001801B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3962 = new BitSet(new long[]{0x0510000004800000L,0x0000001801B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3981 = new BitSet(new long[]{0x0510000004800000L,0x0000001801B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr4000 = new BitSet(new long[]{0x0510000004800000L,0x0000001801B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr4019 = new BitSet(new long[]{0x0510000004800000L,0x0000001801B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr4046 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr4097 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_prefixExpr4100 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4102 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr4105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr4129 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr4132 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr4135 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr4138 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr4141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice4226 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice4228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice4231 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4286 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4290 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4343 = new BitSet(new long[]{0x0000002000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4392 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916002L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4397 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4453 = new BitSet(new long[]{0x0510000004000000L,0x0000001001B20040L,0x0000000002102000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayObj4488 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916002L});
    public static final BitSet FOLLOW_exprList_in_arrayObj4490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayObj4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayObj_in_value4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4604 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_value4606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_value4608 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_QUES_in_value4610 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_value4612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_value4614 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_value4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4638 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_value4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_value4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4659 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParam_in_value4661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_enumDecl4777 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4883 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4889 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_classDecl4975 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4980 = new BitSet(new long[]{0x0002000000000000L,0x0000000002100200L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4982 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_inheritList_in_classDecl4985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope5055 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope5058 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass5170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass5173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass5175 = new BitSet(new long[]{0x0000000010000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass5177 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass5180 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl5254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5257 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_COMMA_in_varDecl5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl5263 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_varDecl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList5293 = new BitSet(new long[]{0x0000200010000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList5295 = new BitSet(new long[]{0x0000200010000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList5298 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5352 = new BitSet(new long[]{0x0000008400000000L,0x0000001400000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5356 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5358 = new BitSet(new long[]{0x0000008400000000L,0x0000001400000040L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5523 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_varInit5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5569 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5572 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5634 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5639 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5641 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5728 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5734 = new BitSet(new long[]{0x0000000010000000L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5782 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5784 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5786 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5788 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5793 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5839 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5843 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5848 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5853 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5902 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5904 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5906 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5911 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5958 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5961 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000040L,0x0000000000000008L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5966 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccessAttr_in_interfaceDecl6030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl6033 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl6035 = new BitSet(new long[]{0x0002000000000000L,0x0000000000100200L});
    public static final BitSet FOLLOW_inheritList_in_interfaceDecl6037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl6040 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000401L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl6043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody6069 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000400L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody6081 = new BitSet(new long[]{0x0400008000000000L,0x4800004000002000L,0x0000000800000400L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList6107 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList6110 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_inherit_in_inheritList6112 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit6164 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_inherit6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit6187 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_type_in_inherit6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl6223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl6226 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl6228 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend6265 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit6302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit6305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_objLit6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6335 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6337 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6370 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6376 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6412 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6414 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred57_Haxe1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred58_Haxe1950 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_synpred58_Haxe1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_typeParamPart_in_synpred58_Haxe1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred59_Haxe2048 = new BitSet(new long[]{0x0080008000010000L,0x0000000000108040L,0x0000002000001000L});
    public static final BitSet FOLLOW_typeList_in_synpred59_Haxe2050 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_GTGT_in_synpred59_Haxe2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_synpred61_Haxe2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred63_Haxe2275 = new BitSet(new long[]{0x0710001104820200L,0x0000201801B200C0L,0x0000008206B96004L});
    public static final BitSet FOLLOW_statementOrLast_in_synpred63_Haxe2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementLast_in_synpred77_Haxe2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignOp_in_synpred84_Haxe3006 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred84_Haxe3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_synpred85_Haxe3043 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred85_Haxe3046 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred85_Haxe3048 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred85_Haxe3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BARBAR_in_synpred86_Haxe3085 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_logicAndExpr_in_synpred86_Haxe3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPAMP_in_synpred87_Haxe3127 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_iterExpr_in_synpred87_Haxe3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_synpred88_Haxe3186 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_cmpExpr_in_synpred88_Haxe3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred94_Haxe3234 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_bitExpr_in_synpred94_Haxe3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred97_Haxe3452 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_shiftExpr_in_synpred97_Haxe3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred100_Haxe3577 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_addExpr_in_synpred100_Haxe3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred102_Haxe3704 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_multExpr_in_synpred102_Haxe3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred105_Haxe3806 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000002916000L});
    public static final BitSet FOLLOW_unarExpr_in_synpred105_Haxe3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred111_Haxe4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred112_Haxe4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred118_Haxe4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred119_Haxe4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred119_Haxe4226 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916008L});
    public static final BitSet FOLLOW_exprList_in_synpred119_Haxe4228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_synpred119_Haxe4231 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred121_Haxe4284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred121_Haxe4286 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred121_Haxe4288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred121_Haxe4290 = new BitSet(new long[]{0x0000002000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred121_Haxe4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred122_Haxe4343 = new BitSet(new long[]{0x0000002000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred122_Haxe4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred124_Haxe4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred131_Haxe4604 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_synpred131_Haxe4608 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_QUES_in_synpred131_Haxe4610 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COLON_in_synpred131_Haxe4614 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred131_Haxe4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred132_Haxe4638 = new BitSet(new long[]{0x0510000004800200L,0x0000201801B20040L,0x0000000202916000L});
    public static final BitSet FOLLOW_expr_in_synpred132_Haxe4641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RPAREN_in_synpred132_Haxe4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred133_Haxe4661 = new BitSet(new long[]{0x0000000000000002L});

}