// $ANTLR 3.4 Haxe.g 2012-03-05 00:46:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "AMP", "AMPAMP", "AMPEQ", "ASSIGN_OPERATOR", "BANG", "BANGEQ", "BANGEQQ", "BAR", "BARBAR", "BAREQ", "BLOCK_SCOPE", "BOOLEAN", "BREAK", "BYTE", "CARET", "CARETEQ", "CASE", "CAST", "CATCH", "CHAR", "CHARLITERAL", "CLASS", "COLON", "COMMA", "COMMENT", "CONST", "CONTINUE", "DECL_ATTR_LIST", "DEFAULT", "DIGIT", "DO", "DOT", "DOUBLE", "DYNAMIC", "ELLIPSIS", "ELSE", "ELSE_TOKEN", "ENDIF_TOKEN", "ENUM", "EQ", "EQEQ", "ESC_SEQ", "EXPONENT", "EXTENDS", "EXTERN", "EscapeSequence", "FALSE", "FINAL", "FINALLY", "FLOAT", "FLOATNUM", "FOR", "FUNCTION", "GOTO", "GT", "GTEQ", "GTGT", "GTGTEQ", "GTGTGT", "GTGTGTEQ", "HEX_DIGIT", "HexDigit", "HexPrefix", "IDENT", "IDENTIFIER", "IF", "IF_TOKEN", "IMPLEMENTS", "IMPORT", "IN", "INHERIT_LIST", "INLINE", "INSTANCEOF", "INT", "INTERFACE", "INTLITERAL", "INTNUM", "IntegerNumber", "LBRACE", "LBRACKET", "LONG", "LONGLITERAL", "LPAREN", "LT", "LTEQ", "LTLT", "LTLTEQ", "LongSuffix", "MINUS_BIGGER", "MODULE", "MONKEYS_AT", "NATIVE", "NEVER", "NEW", "NULL", "OCTAL_ESC", "OVERRIDE", "PACKAGE", "PARAM_LIST", "PERCENT", "PERCENTEQ", "PLUS", "PLUSEQ", "PLUSPLUS", "PP_AND_EXPRESSION", "PP_CONDITIONAL", "PP_ELSE", "PP_ELSEIF", "PP_END", "PP_ERROR", "PP_EXPRESSION", "PP_IF", "PP_OR_EXPRESSION", "PP_PRIMARY_EXPRESSION", "PP_UNARY_EXPRESSION", "PREFIX_EXPR", "PREPROCESSOR_DIRECTIVE", "PRIVATE", "PROPERTY_DECL", "PROTECTED", "PUBLIC", "QUES", "RBRACE", "RBRACKET", "RETURN", "RPAREN", "SEMI", "SHORT", "SLASH", "SLASHEQ", "STAR", "STAREQ", "STATIC", "STRICTFP", "STRING", "STRINGLITERAL", "SUB", "SUBEQ", "SUBSUB", "SUFFIX_EXPR", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TILDE", "TRANSIENT", "TRUE", "TRY", "TS", "TYPEDEF", "TYPE_CONSTRAIN", "TYPE_PARAM", "TYPE_TAG", "UNICODE_ESC", "UNTYPED", "USING", "VAR", "VAR_INIT", "VOID", "VOLATILE", "WHILE", "WS"
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
    public static final int INHERIT_LIST=75;
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
    // Haxe.g:68:1: module : ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) ;
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

            // Haxe.g:68:17: ( ( myPackage )? ( imports )* ( topLevelDecl )* -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* ) )
            // Haxe.g:68:19: ( myPackage )? ( imports )* ( topLevelDecl )*
            {
            // Haxe.g:68:19: ( myPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Haxe.g:68:19: myPackage
                    {
                    pushFollow(FOLLOW_myPackage_in_module184);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }


            // Haxe.g:68:30: ( imports )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==USING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Haxe.g:68:30: imports
            	    {
            	    pushFollow(FOLLOW_imports_in_module187);
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


            // Haxe.g:68:39: ( topLevelDecl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==CLASS||LA3_0==ENUM||LA3_0==EXTERN||LA3_0==INTERFACE||LA3_0==PRIVATE||LA3_0==TYPEDEF) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Haxe.g:68:39: topLevelDecl
            	    {
            	    pushFollow(FOLLOW_topLevelDecl_in_module190);
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
            // 68:53: -> ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
            {
                // Haxe.g:68:56: ^( MODULE[\"MODULE\"] ( myPackage )? ( imports )* ( topLevelDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(MODULE, "MODULE")
                , root_1);

                // Haxe.g:68:85: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();

                // Haxe.g:68:96: ( imports )*
                while ( stream_imports.hasNext() ) {
                    adaptor.addChild(root_1, stream_imports.nextTree());

                }
                stream_imports.reset();

                // Haxe.g:68:105: ( topLevelDecl )*
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
    // Haxe.g:71:1: imports : ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !);
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

            // Haxe.g:71:17: ( IMPORT ^ filepath SEMI !| USING ^ filepath SEMI !)
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
                    // Haxe.g:71:19: IMPORT ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPORT4=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_imports243); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPORT4_tree = 
                    (Object)adaptor.create(IMPORT4)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPORT4_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports246);
                    filepath5=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath5.getTree());

                    SEMI6=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports248); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:72:19: USING ^ filepath SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    USING7=(Token)match(input,USING,FOLLOW_USING_in_imports269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    USING7_tree = 
                    (Object)adaptor.create(USING7)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(USING7_tree, root_0);
                    }

                    pushFollow(FOLLOW_filepath_in_imports272);
                    filepath8=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath8.getTree());

                    SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_imports274); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:75:1: myPackage : PACKAGE ^ filepath SEMI !;
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

            // Haxe.g:75:17: ( PACKAGE ^ filepath SEMI !)
            // Haxe.g:75:19: PACKAGE ^ filepath SEMI !
            {
            root_0 = (Object)adaptor.nil();


            PACKAGE10=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage306); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE10_tree = 
            (Object)adaptor.create(PACKAGE10)
            ;
            root_0 = (Object)adaptor.becomeRoot(PACKAGE10_tree, root_0);
            }

            pushFollow(FOLLOW_filepath_in_myPackage309);
            filepath11=filepath();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, filepath11.getTree());

            SEMI12=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage311); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:78:1: filepath : a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a;
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

            // Haxe.g:78:17: (a= IDENTIFIER (b= DOT d= IDENTIFIER )* -> $a)
            // Haxe.g:78:19: a= IDENTIFIER (b= DOT d= IDENTIFIER )*
            {
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);


            // Haxe.g:78:32: (b= DOT d= IDENTIFIER )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DOT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Haxe.g:78:33: b= DOT d= IDENTIFIER
            	    {
            	    b=(Token)match(input,DOT,FOLLOW_DOT_in_filepath371); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(b);


            	    d=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_filepath375); if (state.failed) return retval; 
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
            // 78:94: -> $a
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
    // Haxe.g:81:1: meta : MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? ;
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

            // Haxe.g:81:9: ( MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )? )
            // Haxe.g:81:11: MONKEYS_AT metaName ( LPAREN ( paramList )? RPAREN )?
            {
            root_0 = (Object)adaptor.nil();


            MONKEYS_AT13=(Token)match(input,MONKEYS_AT,FOLLOW_MONKEYS_AT_in_meta411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MONKEYS_AT13_tree = 
            (Object)adaptor.create(MONKEYS_AT13)
            ;
            adaptor.addChild(root_0, MONKEYS_AT13_tree);
            }

            pushFollow(FOLLOW_metaName_in_meta413);
            metaName14=metaName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, metaName14.getTree());

            // Haxe.g:81:31: ( LPAREN ( paramList )? RPAREN )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Haxe.g:81:32: LPAREN ( paramList )? RPAREN
                    {
                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_meta416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LPAREN15_tree = 
                    (Object)adaptor.create(LPAREN15)
                    ;
                    adaptor.addChild(root_0, LPAREN15_tree);
                    }

                    // Haxe.g:81:39: ( paramList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFIER||LA6_0==QUES) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Haxe.g:81:39: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_meta418);
                            paramList16=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList16.getTree());

                            }
                            break;

                    }


                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_meta421); if (state.failed) return retval;
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
    // Haxe.g:84:1: metaName : ( IDENTIFIER | primitiveType | COLON metaName );
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

            // Haxe.g:85:5: ( IDENTIFIER | primitiveType | COLON metaName )
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
                    // Haxe.g:85:7: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER18=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_metaName440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER18_tree = 
                    (Object)adaptor.create(IDENTIFIER18)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER18_tree);
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:86:7: primitiveType
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_primitiveType_in_metaName448);
                    primitiveType19=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType19.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:88:7: COLON metaName
                    {
                    root_0 = (Object)adaptor.nil();


                    COLON20=(Token)match(input,COLON,FOLLOW_COLON_in_metaName457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    COLON20_tree = 
                    (Object)adaptor.create(COLON20)
                    ;
                    adaptor.addChild(root_0, COLON20_tree);
                    }

                    pushFollow(FOLLOW_metaName_in_metaName459);
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
    // Haxe.g:91:1: typeDeclFlags : ( meta )* ( EXTERN | PRIVATE )* ;
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

            // Haxe.g:92:5: ( ( meta )* ( EXTERN | PRIVATE )* )
            // Haxe.g:92:7: ( meta )* ( EXTERN | PRIVATE )*
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:92:7: ( meta )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MONKEYS_AT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Haxe.g:92:8: meta
            	    {
            	    pushFollow(FOLLOW_meta_in_typeDeclFlags477);
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


            // Haxe.g:92:15: ( EXTERN | PRIVATE )*
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
    // Haxe.g:98:1: topLevelAccess : ( PRIVATE | EXTERN );
    public final HaxeParser.topLevelAccess_return topLevelAccess() throws RecognitionException {
        HaxeParser.topLevelAccess_return retval = new HaxeParser.topLevelAccess_return();
        retval.start = input.LT(1);

        int topLevelAccess_StartIndex = input.index();

        Object root_0 = null;

        Token set24=null;

        Object set24_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

            // Haxe.g:98:17: ( PRIVATE | EXTERN )
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
    // Haxe.g:102:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE );
    public final HaxeParser.declAttr_return declAttr() throws RecognitionException {
        HaxeParser.declAttr_return retval = new HaxeParser.declAttr_return();
        retval.start = input.LT(1);

        int declAttr_StartIndex = input.index();

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

            // Haxe.g:102:17: ( STATIC | INLINE | DYNAMIC | OVERRIDE | PUBLIC | PRIVATE )
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
    // Haxe.g:110:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) ;
    public final HaxeParser.declAttrList_return declAttrList() throws RecognitionException {
        HaxeParser.declAttrList_return retval = new HaxeParser.declAttrList_return();
        retval.start = input.LT(1);

        int declAttrList_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.declAttr_return declAttr26 =null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // Haxe.g:110:17: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ ) )
            // Haxe.g:110:19: ( declAttr )+
            {
            // Haxe.g:110:19: ( declAttr )+
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
            	    // Haxe.g:110:19: declAttr
            	    {
            	    pushFollow(FOLLOW_declAttr_in_declAttrList706);
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
            // 110:29: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
            {
                // Haxe.g:110:32: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\"] ( declAttr )+ )
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
    // Haxe.g:113:1: paramList : param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) ;
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

            // Haxe.g:113:17: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ ) )
            // Haxe.g:113:19: param ( COMMA param )*
            {
            pushFollow(FOLLOW_param_in_paramList751);
            param27=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param27.getTree());

            // Haxe.g:113:25: ( COMMA param )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Haxe.g:113:26: COMMA param
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList754); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA28);


            	    pushFollow(FOLLOW_param_in_paramList756);
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
            // 113:40: -> ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
            {
                // Haxe.g:113:43: ^( PARAM_LIST[\"PARAM_LIST\"] ( param )+ )
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
    // Haxe.g:116:1: param : ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) ;
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

            // Haxe.g:116:17: ( ( QUES )? IDENTIFIER ( typeTag )? ( varInit )? -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? ) )
            // Haxe.g:116:19: ( QUES )? IDENTIFIER ( typeTag )? ( varInit )?
            {
            // Haxe.g:116:19: ( QUES )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QUES) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Haxe.g:116:19: QUES
                    {
                    QUES30=(Token)match(input,QUES,FOLLOW_QUES_in_param806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES30);


                    }
                    break;

            }


            IDENTIFIER31=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param809); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER31);


            // Haxe.g:116:36: ( typeTag )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Haxe.g:116:36: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_param811);
                    typeTag32=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag32.getTree());

                    }
                    break;

            }


            // Haxe.g:116:45: ( varInit )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Haxe.g:116:45: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_param814);
                    varInit33=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit33.getTree());

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
            // 116:54: -> ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
            {
                // Haxe.g:116:57: ^( VAR[$IDENTIFIER] ( typeTag )? ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(VAR, IDENTIFIER31)
                , root_1);

                // Haxe.g:116:96: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:116:105: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();

                // Haxe.g:116:114: ( QUES )?
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
    // Haxe.g:119:1: identifier : IDENTIFIER ;
    public final HaxeParser.identifier_return identifier() throws RecognitionException {
        HaxeParser.identifier_return retval = new HaxeParser.identifier_return();
        retval.start = input.LT(1);

        int identifier_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER34=null;

        Object IDENTIFIER34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // Haxe.g:119:17: ( IDENTIFIER )
            // Haxe.g:119:19: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER34=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier864); if (state.failed) return retval;
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
    // Haxe.g:122:1: id : ( identifier | THIS );
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

            // Haxe.g:122:17: ( identifier | THIS )
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
                    // Haxe.g:122:19: identifier
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_id921);
                    identifier35=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier35.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:123:19: THIS
                    {
                    root_0 = (Object)adaptor.nil();


                    THIS36=(Token)match(input,THIS,FOLLOW_THIS_in_id941); if (state.failed) return retval;
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
    // Haxe.g:126:1: assignOp : ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ );
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

            // Haxe.g:126:17: ( EQ -> EQ | PLUSEQ -> PLUSEQ | SUBEQ -> SUBEQ | STAREQ -> STAREQ | SLASHEQ -> SLASHEQ | PERCENTEQ -> PERCENTEQ | AMPEQ -> AMPEQ | BAREQ -> BAREQ | CARETEQ -> CARETEQ | LTLTEQ -> LTLTEQ | GTGTEQ -> GTGTEQ | GTGTGTEQ -> GTGTGTEQ )
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
                    // Haxe.g:126:19: EQ
                    {
                    EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp976); if (state.failed) return retval; 
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
                    // 126:28: -> EQ
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
                    // Haxe.g:127:19: PLUSEQ
                    {
                    PLUSEQ38=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp1009); if (state.failed) return retval; 
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
                    // 127:28: -> PLUSEQ
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
                    // Haxe.g:128:19: SUBEQ
                    {
                    SUBEQ39=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp1038); if (state.failed) return retval; 
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
                    // 128:28: -> SUBEQ
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
                    // Haxe.g:129:19: STAREQ
                    {
                    STAREQ40=(Token)match(input,STAREQ,FOLLOW_STAREQ_in_assignOp1068); if (state.failed) return retval; 
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
                    // 129:28: -> STAREQ
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
                    // Haxe.g:130:19: SLASHEQ
                    {
                    SLASHEQ41=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp1097); if (state.failed) return retval; 
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
                    // 130:28: -> SLASHEQ
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
                    // Haxe.g:131:19: PERCENTEQ
                    {
                    PERCENTEQ42=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp1125); if (state.failed) return retval; 
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
                    // 131:29: -> PERCENTEQ
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
                    // Haxe.g:132:19: AMPEQ
                    {
                    AMPEQ43=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp1152); if (state.failed) return retval; 
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
                    // 132:28: -> AMPEQ
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
                    // Haxe.g:133:19: BAREQ
                    {
                    BAREQ44=(Token)match(input,BAREQ,FOLLOW_BAREQ_in_assignOp1182); if (state.failed) return retval; 
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
                    // 133:28: -> BAREQ
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
                    // Haxe.g:134:19: CARETEQ
                    {
                    CARETEQ45=(Token)match(input,CARETEQ,FOLLOW_CARETEQ_in_assignOp1212); if (state.failed) return retval; 
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
                    // 134:28: -> CARETEQ
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
                    // Haxe.g:135:19: LTLTEQ
                    {
                    LTLTEQ46=(Token)match(input,LTLTEQ,FOLLOW_LTLTEQ_in_assignOp1240); if (state.failed) return retval; 
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
                    // 135:28: -> LTLTEQ
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
                    // Haxe.g:136:19: GTGTEQ
                    {
                    GTGTEQ47=(Token)match(input,GTGTEQ,FOLLOW_GTGTEQ_in_assignOp1269); if (state.failed) return retval; 
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
                    // 136:28: -> GTGTEQ
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
                    // Haxe.g:137:19: GTGTGTEQ
                    {
                    GTGTGTEQ48=(Token)match(input,GTGTGTEQ,FOLLOW_GTGTGTEQ_in_assignOp1298); if (state.failed) return retval; 
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
                    // 137:28: -> GTGTGTEQ
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
    // Haxe.g:140:1: funcLit : FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
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

            // Haxe.g:140:17: ( FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:140:19: FUNCTION ^ LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            FUNCTION49=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit1354); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FUNCTION49_tree = 
            new FunctionNode(FUNCTION49) 
            ;
            root_0 = (Object)adaptor.becomeRoot(FUNCTION49_tree, root_0);
            }

            LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit1360); if (state.failed) return retval;

            // Haxe.g:140:51: ( paramList )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENTIFIER||LA18_0==QUES) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:140:51: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcLit1363);
                    paramList51=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList51.getTree());

                    }
                    break;

            }


            RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit1366); if (state.failed) return retval;

            // Haxe.g:140:70: ( typeTag )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==COLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Haxe.g:140:70: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcLit1369);
                    typeTag53=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag53.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcLit1372);
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
    // Haxe.g:168:1: typeTag : COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) ;
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

            // Haxe.g:168:17: ( COLON funcType -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType ) )
            // Haxe.g:168:19: COLON funcType
            {
            COLON55=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON55);


            pushFollow(FOLLOW_funcType_in_typeTag1418);
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
            // 168:34: -> ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
            {
                // Haxe.g:168:37: ^( TYPE_TAG[\"TYPE_TAG\"] funcType )
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
    // Haxe.g:171:1: typeList : ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? );
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

            // Haxe.g:171:17: ( funcType ( COMMA ! typeList )? | typeConstraint ( COMMA ! typeList )? )
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
                    // Haxe.g:171:19: funcType ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcType_in_typeList1462);
                    funcType57=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType57.getTree());

                    // Haxe.g:171:28: ( COMMA ! typeList )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==COMMA) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:171:29: COMMA ! typeList
                            {
                            COMMA58=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1465); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1468);
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
                    // Haxe.g:172:19: typeConstraint ( COMMA ! typeList )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeConstraint_in_typeList1490);
                    typeConstraint60=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint60.getTree());

                    // Haxe.g:172:34: ( COMMA ! typeList )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==COMMA) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Haxe.g:172:35: COMMA ! typeList
                            {
                            COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1493); if (state.failed) return retval;

                            pushFollow(FOLLOW_typeList_in_typeList1496);
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
    // Haxe.g:175:1: funcType : type ( MINUS_BIGGER ! type )* ;
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

            // Haxe.g:175:17: ( type ( MINUS_BIGGER ! type )* )
            // Haxe.g:175:19: type ( MINUS_BIGGER ! type )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_funcType1531);
            type63=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type63.getTree());

            // Haxe.g:175:24: ( MINUS_BIGGER ! type )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS_BIGGER) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Haxe.g:175:25: MINUS_BIGGER ! type
            	    {
            	    MINUS_BIGGER64=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1534); if (state.failed) return retval;

            	    pushFollow(FOLLOW_type_in_funcType1537);
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
    // Haxe.g:178:1: anonType : LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) ;
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

            // Haxe.g:178:17: ( LBRACE ( anonTypePart )? RBRACE -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? ) )
            // Haxe.g:178:19: LBRACE ( anonTypePart )? RBRACE
            {
            LBRACE66=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType1575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE66);


            // Haxe.g:178:26: ( anonTypePart )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==GT||LA24_0==IDENTIFIER||LA24_0==VAR) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Haxe.g:178:26: anonTypePart
                    {
                    pushFollow(FOLLOW_anonTypePart_in_anonType1577);
                    anonTypePart67=anonTypePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_anonTypePart.add(anonTypePart67.getTree());

                    }
                    break;

            }


            RBRACE68=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType1580); if (state.failed) return retval; 
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
            // 178:47: -> ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
            {
                // Haxe.g:178:50: ^( TYPE_TAG[\"AnonType\"] ( anonTypePart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_TAG, "AnonType")
                , root_1);

                // Haxe.g:178:83: ( anonTypePart )?
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
    // Haxe.g:181:1: anonTypePart : ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? );
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

            // Haxe.g:181:17: ( anonTypeFieldList | ( varDecl )+ | typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )? )
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
                    // Haxe.g:181:19: anonTypeFieldList
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1621);
                    anonTypeFieldList69=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList69.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:182:19: ( varDecl )+
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:182:19: ( varDecl )+
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
                    	    // Haxe.g:182:19: varDecl
                    	    {
                    	    pushFollow(FOLLOW_varDecl_in_anonTypePart1641);
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
                    // Haxe.g:183:19: typeExtend COMMA ! ( anonTypeFieldList | ( varDecl )+ )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typeExtend_in_anonTypePart1662);
                    typeExtend71=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend71.getTree());

                    COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypePart1664); if (state.failed) return retval;

                    // Haxe.g:183:37: ( anonTypeFieldList | ( varDecl )+ )?
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
                            // Haxe.g:183:39: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonTypePart1669);
                            anonTypeFieldList73=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList73.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:183:59: ( varDecl )+
                            {
                            // Haxe.g:183:59: ( varDecl )+
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
                            	    // Haxe.g:183:59: varDecl
                            	    {
                            	    pushFollow(FOLLOW_varDecl_in_anonTypePart1673);
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
    // Haxe.g:186:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ ;
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

            // Haxe.g:187:17: ( anonTypeField ( COMMA anonTypeField )* -> ( anonTypeField )+ )
            // Haxe.g:187:19: anonTypeField ( COMMA anonTypeField )*
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1723);
            anonTypeField75=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_anonTypeField.add(anonTypeField75.getTree());

            // Haxe.g:187:33: ( COMMA anonTypeField )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:187:34: COMMA anonTypeField
            	    {
            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList1726); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);


            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList1728);
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
            // 187:56: -> ( anonTypeField )+
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
    // Haxe.g:190:1: primitiveType : ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING );
    public final HaxeParser.primitiveType_return primitiveType() throws RecognitionException {
        HaxeParser.primitiveType_return retval = new HaxeParser.primitiveType_return();
        retval.start = input.LT(1);

        int primitiveType_StartIndex = input.index();

        Object root_0 = null;

        Token set78=null;

        Object set78_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

            // Haxe.g:190:17: ( INT | FLOAT | DYNAMIC | BOOLEAN | VOID | STRING )
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
    // Haxe.g:193:1: type : ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? ;
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

            // Haxe.g:193:17: ( ( primitiveType ^| filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:193:19: ( primitiveType ^| filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:193:19: ( primitiveType ^| filepath ^| anonType ^)
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
                    // Haxe.g:193:20: primitiveType ^
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1823);
                    primitiveType79=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(primitiveType79.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // Haxe.g:193:37: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1828);
                    filepath80=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath80.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // Haxe.g:193:49: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1833);
                    anonType81=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType81.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:193:61: ( typeParam )?
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
                    // Haxe.g:193:61: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1838);
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
    // Haxe.g:196:1: typeParam : LT typeList ( typeParam )? GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) ;
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

            // Haxe.g:196:17: ( LT typeList ( typeParam )? GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            // Haxe.g:196:19: LT typeList ( typeParam )? GT
            {
            LT83=(Token)match(input,LT,FOLLOW_LT_in_typeParam1874); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LT.add(LT83);


            pushFollow(FOLLOW_typeList_in_typeParam1876);
            typeList84=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList84.getTree());

            // Haxe.g:196:31: ( typeParam )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==LT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // Haxe.g:196:31: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParam1878);
                    typeParam85=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam85.getTree());

                    }
                    break;

            }


            GT86=(Token)match(input,GT,FOLLOW_GT_in_typeParam1881); if (state.failed) return retval; 
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
            // 196:45: -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
            {
                // Haxe.g:196:48: ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_PARAM, "TYPE_PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_typeList.nextTree());

                // Haxe.g:196:94: ( typeParam )?
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
    // Haxe.g:199:1: typeConstraint : identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) ;
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

            // Haxe.g:200:5: ( identifier COLON LPAREN typeList RPAREN -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? ) )
            // Haxe.g:200:7: identifier COLON LPAREN typeList RPAREN
            {
            pushFollow(FOLLOW_identifier_in_typeConstraint1932);
            identifier87=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier87.getTree());

            COLON88=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON88);


            LPAREN89=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN89);


            pushFollow(FOLLOW_typeList_in_typeConstraint1938);
            typeList90=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList90.getTree());

            RPAREN91=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1940); if (state.failed) return retval; 
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
            // 200:47: -> ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
            {
                // Haxe.g:200:50: ^( TYPE_CONSTRAIN[\"TYPE_CONSTRAIN\"] identifier ( typeList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new HaxeTree(TYPE_CONSTRAIN, "TYPE_CONSTRAIN")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // Haxe.g:200:106: ( typeList )?
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
    // Haxe.g:204:1: statement : ( block | IF ^ parExpression statement ( ELSE ! statement )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) );
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

            // Haxe.g:204:17: ( block | IF ^ parExpression statement ( ELSE ! statement )? | FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| expr SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) )
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
                int LA37_28 = input.LA(2);

                if ( (synpred74_Haxe()) ) {
                    alt37=11;
                }
                else if ( (true) ) {
                    alt37=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 28, input);

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
                    // Haxe.g:204:19: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1980);
                    block92=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block92.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:205:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF93=(Token)match(input,IF,FOLLOW_IF_in_statement2000); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF93_tree = 
                    new IfNode(IF93) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF93_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2006);
                    parExpression94=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression94.getTree());

                    pushFollow(FOLLOW_statement_in_statement2008);
                    statement95=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement95.getTree());

                    // Haxe.g:205:55: ( ELSE ! statement )?
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
                            // Haxe.g:205:56: ELSE ! statement
                            {
                            ELSE96=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2011); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2014);
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
                    // Haxe.g:206:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR98=(Token)match(input,FOR,FOLLOW_FOR_in_statement2036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR98_tree = 
                    new ForNode(FOR98) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR98_tree, root_0);
                    }

                    LPAREN99=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2042); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2045);
                    expr100=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr100.getTree());

                    IN101=(Token)match(input,IN,FOLLOW_IN_in_statement2047); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statement2050);
                    iterExpr102=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr102.getTree());

                    RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2052); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement2055);
                    statement104=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement104.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:207:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE105=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE105_tree = 
                    new WhileNode(WHILE105) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE105_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2081);
                    parExpression106=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression106.getTree());

                    pushFollow(FOLLOW_statement_in_statement2083);
                    statement107=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement107.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:208:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO108=(Token)match(input,DO,FOLLOW_DO_in_statement2103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO108_tree = 
                    new DoWhileNode(DO108) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO108_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2109);
                    statement109=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement109.getTree());

                    WHILE110=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2111); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2114);
                    parExpression111=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression111.getTree());

                    SEMI112=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2116); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:209:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY113=(Token)match(input,TRY,FOLLOW_TRY_in_statement2137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY113_tree = 
                    new TryNode(TRY113) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY113_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2143);
                    block114=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block114.getTree());

                    // Haxe.g:209:39: ( catchStmt )+
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
                    	    // Haxe.g:209:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2145);
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
                    // Haxe.g:210:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH116=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2166); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH116_tree = 
                    new SwitchNode(SWITCH116) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH116_tree, root_0);
                    }

                    LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2172); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2175);
                    expr118=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr118.getTree());

                    RPAREN119=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2177); if (state.failed) return retval;

                    LBRACE120=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2180); if (state.failed) return retval;

                    // Haxe.g:210:68: ( caseStmt )+
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
                    	    // Haxe.g:210:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2183);
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


                    RBRACE122=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2186); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:211:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN123=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2207); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN123_tree = 
                    new ReturnNode(RETURN123) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN123_tree, root_0);
                    }

                    // Haxe.g:211:39: ( expr )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==BANG||LA36_0==CAST||LA36_0==CHARLITERAL||LA36_0==FALSE||LA36_0==FLOATNUM||LA36_0==FUNCTION||LA36_0==IDENTIFIER||LA36_0==INTLITERAL||LA36_0==LBRACE||LA36_0==LONGLITERAL||(LA36_0 >= NEW && LA36_0 <= NULL)||LA36_0==PLUSPLUS||(LA36_0 >= STRINGLITERAL && LA36_0 <= SUB)||LA36_0==SUBSUB||LA36_0==THIS||LA36_0==TILDE||LA36_0==TRUE||LA36_0==UNTYPED) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Haxe.g:211:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2213);
                            expr124=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr124.getTree());

                            }
                            break;

                    }


                    SEMI125=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2216); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:212:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW126=(Token)match(input,THROW,FOLLOW_THROW_in_statement2237); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW126_tree = 
                    (Object)adaptor.create(THROW126)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW126_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2240);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr127.getTree());

                    SEMI128=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2242); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:213:19: ( BREAK | CONTINUE ) SEMI !
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


                    SEMI130=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2271); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:214:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2292);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

                    SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2294); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:215:7: IDENTIFIER COLON statement
                    {
                    IDENTIFIER133=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2303); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER133);


                    COLON134=(Token)match(input,COLON,FOLLOW_COLON_in_statement2305); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON134);


                    pushFollow(FOLLOW_statement_in_statement2307);
                    statement135=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement135.getTree());

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
                    // 215:50: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:215:53: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:215:61: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:215:73: ( statement )?
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
    // Haxe.g:218:1: parExpression : LPAREN ! expr RPAREN !;
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

            // Haxe.g:218:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:218:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2353); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2356);
            expr137=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr137.getTree());

            RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2358); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:221:1: block : LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) ;
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

            // Haxe.g:221:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:221:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE139=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2394); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE139);


            // Haxe.g:221:26: ( blockStmt )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==BANG||LA38_0==BREAK||LA38_0==CAST||(LA38_0 >= CHARLITERAL && LA38_0 <= CLASS)||LA38_0==CONTINUE||LA38_0==DO||LA38_0==EXTERN||LA38_0==FALSE||(LA38_0 >= FLOATNUM && LA38_0 <= FUNCTION)||(LA38_0 >= IDENTIFIER && LA38_0 <= IF)||LA38_0==INTLITERAL||LA38_0==LBRACE||LA38_0==LONGLITERAL||(LA38_0 >= NEW && LA38_0 <= NULL)||LA38_0==PLUSPLUS||LA38_0==PRIVATE||LA38_0==RETURN||(LA38_0 >= STRINGLITERAL && LA38_0 <= SUB)||LA38_0==SUBSUB||(LA38_0 >= SWITCH && LA38_0 <= THROW)||LA38_0==TILDE||(LA38_0 >= TRUE && LA38_0 <= TRY)||LA38_0==UNTYPED||LA38_0==VAR||LA38_0==WHILE) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Haxe.g:221:27: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block2397);
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


            RBRACE141=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2401); if (state.failed) return retval; 
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
            // 221:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
            {
                // Haxe.g:221:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE139, RBRACE141)
                , root_1);

                // Haxe.g:221:97: ( blockStmt )*
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
    // Haxe.g:224:1: blockStmt : ( varDecl | classDecl | statement );
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

            // Haxe.g:224:17: ( varDecl | classDecl | statement )
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
                    // Haxe.g:224:19: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2445);
                    varDecl142=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl142.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:225:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2456);
                    classDecl143=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl143.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:226:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2467);
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
    // Haxe.g:229:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
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

            // Haxe.g:229:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:229:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE145=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2491); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE145_tree = 
                    (Object)adaptor.create(CASE145)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE145_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2494);
                    exprList146=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList146.getTree());

                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2496); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2499);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement148.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:230:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT149=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2519); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT149_tree = 
                    (Object)adaptor.create(DEFAULT149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT149_tree, root_0);
                    }

                    COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2522); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2525);
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
    // Haxe.g:233:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
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

            // Haxe.g:233:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:233:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH152=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2560); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH152_tree = 
            new HaxeTree(CATCH152) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH152_tree, root_0);
            }

            LPAREN153=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2566); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2569);
            param154=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param154.getTree());

            RPAREN155=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2571); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2574);
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
    // Haxe.g:237:1: exprList : expr ( COMMA ! expr )* ;
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

            // Haxe.g:237:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:237:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2612);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            // Haxe.g:237:24: ( COMMA ! expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // Haxe.g:237:25: COMMA ! expr
            	    {
            	    COMMA158=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2615); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2618);
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
    // Haxe.g:240:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
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

            // Haxe.g:240:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==UNTYPED) ) {
                alt42=1;
            }
            else if ( (LA42_0==BANG||LA42_0==CAST||LA42_0==CHARLITERAL||LA42_0==FALSE||LA42_0==FLOATNUM||LA42_0==FUNCTION||LA42_0==IDENTIFIER||LA42_0==INTLITERAL||LA42_0==LBRACE||LA42_0==LONGLITERAL||(LA42_0 >= NEW && LA42_0 <= NULL)||LA42_0==PLUSPLUS||(LA42_0 >= STRINGLITERAL && LA42_0 <= SUB)||LA42_0==SUBSUB||LA42_0==THIS||LA42_0==TILDE||LA42_0==TRUE) ) {
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
                    // Haxe.g:240:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED160=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2660); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED160_tree = 
                    (Object)adaptor.create(UNTYPED160)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED160_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2663);
                    assignExpr161=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr161.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:241:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2683);
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
    // Haxe.g:244:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
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

            // Haxe.g:244:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:244:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2713);
            ternaryExpr163=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr163.getTree());

            // Haxe.g:244:31: ( assignOp ^ ternaryExpr )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AMPEQ||LA43_0==BAREQ||LA43_0==CARETEQ||LA43_0==EQ||LA43_0==GTGTEQ||LA43_0==GTGTGTEQ||LA43_0==LTLTEQ||LA43_0==PERCENTEQ||LA43_0==PLUSEQ||LA43_0==SLASHEQ||LA43_0==STAREQ||LA43_0==SUBEQ) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Haxe.g:244:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2716);
                    assignOp164=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp164.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2719);
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
    // Haxe.g:247:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
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

            // Haxe.g:247:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:247:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2750);
            logicOrExpr166=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr166.getTree());

            // Haxe.g:247:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUES) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Haxe.g:247:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES167=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES167_tree = 
                    (Object)adaptor.create(QUES167)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES167_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2756);
                    expr168=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr168.getTree());

                    COLON169=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2758); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2761);
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
    // Haxe.g:250:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
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

            // Haxe.g:250:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:250:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2792);
            logicAndExpr171=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr171.getTree());

            // Haxe.g:250:32: ( BARBAR ^ logicAndExpr )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==BARBAR) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // Haxe.g:250:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR172=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2795); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR172_tree = 
            	    new BinaryExpressionNode(BARBAR172) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR172_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2801);
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
    // Haxe.g:253:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
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

            // Haxe.g:253:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:253:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr2835);
            iterExpr174=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr174.getTree());

            // Haxe.g:253:27: ( AMPAMP ^ iterExpr )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==AMPAMP) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // Haxe.g:253:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP175=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2837); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP175_tree = 
            	    new BinaryExpressionNode(AMPAMP175) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP175_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr2843);
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
    // Haxe.g:256:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
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

            // Haxe.g:256:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:256:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr2893);
            cmpExpr177=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr177.getTree());

            // Haxe.g:256:27: ( ELLIPSIS ^ cmpExpr )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ELLIPSIS) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // Haxe.g:256:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS178=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS178_tree = 
                    new BinaryExpressionNode(ELLIPSIS178) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS178_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr2902);
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
    // Haxe.g:259:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
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

            // Haxe.g:259:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:259:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2941);
            bitExpr180=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr180.getTree());

            // Haxe.g:259:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==BANGEQ||LA49_0==EQEQ||(LA49_0 >= GT && LA49_0 <= GTEQ)||(LA49_0 >= LT && LA49_0 <= LTEQ)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // Haxe.g:259:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:259:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:260:23: EQEQ ^
            	            {
            	            EQEQ181=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2968); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ181_tree = 
            	            new BinaryExpressionNode(EQEQ181) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ181_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:261:23: BANGEQ ^
            	            {
            	            BANGEQ182=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2997); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ182_tree = 
            	            new BinaryExpressionNode(BANGEQ182) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ182_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:262:23: GTEQ ^
            	            {
            	            GTEQ183=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3026); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ183_tree = 
            	            new BinaryExpressionNode(GTEQ183) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ183_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:263:23: LTEQ ^
            	            {
            	            LTEQ184=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3055); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ184_tree = 
            	            new BinaryExpressionNode(LTEQ184) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ184_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:264:23: GT ^
            	            {
            	            GT185=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3084); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT185_tree = 
            	            new BinaryExpressionNode(GT185) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT185_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:265:23: LT ^
            	            {
            	            LT186=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3113); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT186_tree = 
            	            new BinaryExpressionNode(LT186) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT186_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3120);
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
    // Haxe.g:268:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
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

            // Haxe.g:268:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:268:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3159);
            shiftExpr188=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr188.getTree());

            // Haxe.g:268:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==AMP||LA51_0==BAR||LA51_0==CARET) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:268:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:268:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:269:23: BAR ^
            	            {
            	            BAR189=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3186); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR189_tree = 
            	            new BinaryExpressionNode(BAR189) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:270:23: AMP ^
            	            {
            	            AMP190=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3215); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP190_tree = 
            	            new BinaryExpressionNode(AMP190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:271:23: CARET ^
            	            {
            	            CARET191=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3244); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET191_tree = 
            	            new BinaryExpressionNode(CARET191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET191_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3251);
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
    // Haxe.g:274:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
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

            // Haxe.g:274:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:274:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3284);
            addExpr193=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr193.getTree());

            // Haxe.g:274:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==GTGT||LA53_0==GTGTGT||LA53_0==LTLT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:274:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:274:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:275:23: LTLT ^
            	            {
            	            LTLT194=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3311); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT194_tree = 
            	            new BinaryExpressionNode(LTLT194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:276:23: GTGT ^
            	            {
            	            GTGT195=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3340); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT195_tree = 
            	            new BinaryExpressionNode(GTGT195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:277:23: GTGTGT ^
            	            {
            	            GTGTGT196=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3369); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT196_tree = 
            	            new BinaryExpressionNode(GTGTGT196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT196_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3376);
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
    // Haxe.g:280:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
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

            // Haxe.g:280:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:280:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3411);
            multExpr198=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr198.getTree());

            // Haxe.g:280:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==PLUS||LA55_0==SUB) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:280:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:280:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:281:23: PLUS ^
            	            {
            	            PLUS199=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3438); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS199_tree = 
            	            new BinaryExpressionNode(PLUS199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS199_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:282:23: SUB ^
            	            {
            	            SUB200=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3467); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB200_tree = 
            	            new BinaryExpressionNode(SUB200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB200_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3474);
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
    // Haxe.g:285:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
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

            // Haxe.g:285:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:285:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3513);
            unarExpr202=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr202.getTree());

            // Haxe.g:285:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PERCENT||LA57_0==SLASH||LA57_0==STAR) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:285:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:285:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:286:23: STAR ^
            	            {
            	            STAR203=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3540); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR203_tree = 
            	            new BinaryExpressionNode(STAR203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:287:23: SLASH ^
            	            {
            	            SLASH204=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3569); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH204_tree = 
            	            new BinaryExpressionNode(SLASH204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:288:23: PERCENT ^
            	            {
            	            PERCENT205=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3598); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT205_tree = 
            	            new BinaryExpressionNode(PERCENT205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT205_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3605);
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
    // Haxe.g:291:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
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

            // Haxe.g:291:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==BANG||LA60_0==PLUSPLUS||LA60_0==SUB||LA60_0==SUBSUB||LA60_0==TILDE) ) {
                alt60=1;
            }
            else if ( (LA60_0==CAST||LA60_0==CHARLITERAL||LA60_0==FALSE||LA60_0==FLOATNUM||LA60_0==FUNCTION||LA60_0==IDENTIFIER||LA60_0==INTLITERAL||LA60_0==LBRACE||LA60_0==LONGLITERAL||(LA60_0 >= NEW && LA60_0 <= NULL)||LA60_0==STRINGLITERAL||LA60_0==THIS||LA60_0==TRUE) ) {
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
                    // Haxe.g:291:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:291:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:292:13: SUB ^
                            {
                            SUB207=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3653); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB207_tree = 
                            new UnarExpressionNode(SUB207) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB207_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:293:13: SUBSUB ^
                            {
                            SUBSUB208=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3672); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB208_tree = 
                            new UnarExpressionNode(SUBSUB208) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB208_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:294:13: PLUSPLUS ^
                            {
                            PLUSPLUS209=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3691); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS209_tree = 
                            new UnarExpressionNode(PLUSPLUS209) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS209_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:295:13: BANG ^
                            {
                            BANG210=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3710); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG210_tree = 
                            new UnarExpressionNode(BANG210) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG210_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:296:13: TILDE ^
                            {
                            TILDE211=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3729); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE211_tree = 
                            new UnarExpressionNode(TILDE211) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE211_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3736);
                    prefixExpr212=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr212.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:297:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3756);
                    prefixExpr213=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

                    // Haxe.g:297:30: ( PLUSPLUS ^| SUBSUB ^)?
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
                            // Haxe.g:297:31: PLUSPLUS ^
                            {
                            PLUSPLUS214=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3759); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS214_tree = 
                            new UnarExpressionNode(PLUSPLUS214) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS214_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:297:61: SUBSUB ^
                            {
                            SUBSUB215=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3765); if (state.failed) return retval;
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
    // Haxe.g:300:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
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

            // Haxe.g:300:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
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
                    // Haxe.g:300:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW216=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3807); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW216_tree = 
                    (Object)adaptor.create(NEW216)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW216_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3810);
                    type217=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type217.getTree());

                    LPAREN218=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3812); if (state.failed) return retval;

                    // Haxe.g:300:37: ( exprList )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==BANG||LA61_0==CAST||LA61_0==CHARLITERAL||LA61_0==FALSE||LA61_0==FLOATNUM||LA61_0==FUNCTION||LA61_0==IDENTIFIER||LA61_0==INTLITERAL||LA61_0==LBRACE||LA61_0==LONGLITERAL||(LA61_0 >= NEW && LA61_0 <= NULL)||LA61_0==PLUSPLUS||(LA61_0 >= STRINGLITERAL && LA61_0 <= SUB)||LA61_0==SUBSUB||LA61_0==THIS||LA61_0==TILDE||LA61_0==TRUE||LA61_0==UNTYPED) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // Haxe.g:300:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr3815);
                            exprList219=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList219.getTree());

                            }
                            break;

                    }


                    RPAREN220=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3818); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:301:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST221=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3839); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST221_tree = 
                    (Object)adaptor.create(CAST221)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST221_tree, root_0);
                    }

                    LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3842); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3845);
                    expr223=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr223.getTree());

                    // Haxe.g:301:38: ( COMMA ! funcType )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==COMMA) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // Haxe.g:301:39: COMMA ! funcType
                            {
                            COMMA224=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3848); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3851);
                            funcType225=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType225.getTree());

                            }
                            break;

                    }


                    RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3855); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:302:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3876);
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
    // Haxe.g:305:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ( pureCallOrSlice )? -> ^( value ( pureCallOrSlice )? ) );
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

            // Haxe.g:306:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ( pureCallOrSlice )? -> ^( value ( pureCallOrSlice )? ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA68_1 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA68_2 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 2, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA68_3 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 3, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA68_4 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 4, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA68_5 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 5, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA68_6 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA68_7 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 7, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA68_8 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 8, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA68_9 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 9, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA68_10 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 10, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA68_11 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 11, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA68_12 = input.LA(2);

                if ( (synpred116_Haxe()) ) {
                    alt68=1;
                }
                else if ( (synpred118_Haxe()) ) {
                    alt68=2;
                }
                else if ( (true) ) {
                    alt68=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 12, input);

                    throw nvae;

                }
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
                    // Haxe.g:306:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3934);
                    value228=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value228.getTree());

                    LPAREN229=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3936); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN229);


                    // Haxe.g:306:32: ( exprList )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==BANG||LA64_0==CAST||LA64_0==CHARLITERAL||LA64_0==FALSE||LA64_0==FLOATNUM||LA64_0==FUNCTION||LA64_0==IDENTIFIER||LA64_0==INTLITERAL||LA64_0==LBRACE||LA64_0==LONGLITERAL||(LA64_0 >= NEW && LA64_0 <= NULL)||LA64_0==PLUSPLUS||(LA64_0 >= STRINGLITERAL && LA64_0 <= SUB)||LA64_0==SUBSUB||LA64_0==THIS||LA64_0==TILDE||LA64_0==TRUE||LA64_0==UNTYPED) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:306:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice3938);
                            exprList230=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList230.getTree());

                            }
                            break;

                    }


                    RPAREN231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN231);


                    // Haxe.g:306:49: ( pureCallOrSlice )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==DOT||LA65_0==LBRACKET) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // Haxe.g:306:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3943);
                            pureCallOrSlice232=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice232.getTree());

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
                    // 307:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:307:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN229, RPAREN231)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:307:78: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:307:88: ( pureCallOrSlice )?
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
                    // Haxe.g:308:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3994);
                    value233=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value233.getTree());

                    LBRACKET234=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice3996); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET234);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice3998);
                    expr235=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr235.getTree());

                    RBRACKET236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET236);


                    // Haxe.g:308:48: ( pureCallOrSlice )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==DOT||LA66_0==LBRACKET) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:308:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4002);
                            pureCallOrSlice237=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice237.getTree());

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
                    // 309:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:309:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET234, RBRACKET236)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:309:82: ( pureCallOrSlice )?
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
                    // Haxe.g:310:19: value ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4053);
                    value238=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value238.getTree());

                    // Haxe.g:310:25: ( pureCallOrSlice )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DOT||LA67_0==LBRACKET) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Haxe.g:310:25: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4055);
                            pureCallOrSlice239=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice239.getTree());

                            }
                            break;

                    }


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
                    // 310:42: -> ^( value ( pureCallOrSlice )? )
                    {
                        // Haxe.g:310:45: ^( value ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_value.nextNode(), root_1);

                        // Haxe.g:310:53: ( pureCallOrSlice )?
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

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:313:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET240=null;
        Token RBRACKET242=null;
        Token DOT244=null;
        HaxeParser.expr_return expr241 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice243 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice245 =null;


        Object LBRACKET240_tree=null;
        Object RBRACKET242_tree=null;
        Object DOT244_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:313:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LBRACKET) ) {
                alt71=1;
            }
            else if ( (LA71_0==DOT) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // Haxe.g:313:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET240=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET240);


                    // Haxe.g:313:28: ( expr )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==BANG||LA69_0==CAST||LA69_0==CHARLITERAL||LA69_0==FALSE||LA69_0==FLOATNUM||LA69_0==FUNCTION||LA69_0==IDENTIFIER||LA69_0==INTLITERAL||LA69_0==LBRACE||LA69_0==LONGLITERAL||(LA69_0 >= NEW && LA69_0 <= NULL)||LA69_0==PLUSPLUS||(LA69_0 >= STRINGLITERAL && LA69_0 <= SUB)||LA69_0==SUBSUB||LA69_0==THIS||LA69_0==TILDE||LA69_0==TRUE||LA69_0==UNTYPED) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:313:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4092);
                            expr241=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr241.getTree());

                            }
                            break;

                    }


                    RBRACKET242=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET242);


                    // Haxe.g:313:43: ( pureCallOrSlice )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DOT||LA70_0==LBRACKET) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:313:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4097);
                            pureCallOrSlice243=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice243.getTree());

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
                    // 313:60: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:313:63: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET240, RBRACKET242)
                        , root_1);

                        // Haxe.g:314:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:314:76: ( pureCallOrSlice )?
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
                    // Haxe.g:315:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT244=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT244_tree = 
                    (Object)adaptor.create(DOT244)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT244_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4154);
                    methodCallOrSlice245=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice245.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class dotIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotIdentifier"
    // Haxe.g:318:1: dotIdentifier : value ( dotPart )? -> ^( value ( dotPart )? ) ;
    public final HaxeParser.dotIdentifier_return dotIdentifier() throws RecognitionException {
        HaxeParser.dotIdentifier_return retval = new HaxeParser.dotIdentifier_return();
        retval.start = input.LT(1);

        int dotIdentifier_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.value_return value246 =null;

        HaxeParser.dotPart_return dotPart247 =null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_dotPart=new RewriteRuleSubtreeStream(adaptor,"rule dotPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:318:17: ( value ( dotPart )? -> ^( value ( dotPart )? ) )
            // Haxe.g:318:19: value ( dotPart )?
            {
            pushFollow(FOLLOW_value_in_dotIdentifier4197);
            value246=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value246.getTree());

            // Haxe.g:318:25: ( dotPart )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==DOT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // Haxe.g:318:25: dotPart
                    {
                    pushFollow(FOLLOW_dotPart_in_dotIdentifier4199);
                    dotPart247=dotPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dotPart.add(dotPart247.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: dotPart, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 318:34: -> ^( value ( dotPart )? )
            {
                // Haxe.g:318:37: ^( value ( dotPart )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_value.nextNode(), root_1);

                // Haxe.g:318:45: ( dotPart )?
                if ( stream_dotPart.hasNext() ) {
                    adaptor.addChild(root_1, stream_dotPart.nextTree());

                }
                stream_dotPart.reset();

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
            if ( state.backtracking>0 ) { memoize(input, 49, dotIdentifier_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dotIdentifier"


    public static class dotPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotPart"
    // Haxe.g:321:1: dotPart : DOT ^ dotIdentifier ;
    public final HaxeParser.dotPart_return dotPart() throws RecognitionException {
        HaxeParser.dotPart_return retval = new HaxeParser.dotPart_return();
        retval.start = input.LT(1);

        int dotPart_StartIndex = input.index();

        Object root_0 = null;

        Token DOT248=null;
        HaxeParser.dotIdentifier_return dotIdentifier249 =null;


        Object DOT248_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:321:17: ( DOT ^ dotIdentifier )
            // Haxe.g:321:19: DOT ^ dotIdentifier
            {
            root_0 = (Object)adaptor.nil();


            DOT248=(Token)match(input,DOT,FOLLOW_DOT_in_dotPart4258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT248_tree = 
            (Object)adaptor.create(DOT248)
            ;
            root_0 = (Object)adaptor.becomeRoot(DOT248_tree, root_0);
            }

            pushFollow(FOLLOW_dotIdentifier_in_dotPart4261);
            dotIdentifier249=dotIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdentifier249.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, dotPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dotPart"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // Haxe.g:324:1: value : ( objLit | funcLit | elementarySymbol | id ( typeParam )? );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.objLit_return objLit250 =null;

        HaxeParser.funcLit_return funcLit251 =null;

        HaxeParser.elementarySymbol_return elementarySymbol252 =null;

        HaxeParser.id_return id253 =null;

        HaxeParser.typeParam_return typeParam254 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:326:5: ( objLit | funcLit | elementarySymbol | id ( typeParam )? )
            int alt74=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt74=1;
                }
                break;
            case FUNCTION:
                {
                alt74=2;
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
                alt74=3;
                }
                break;
            case IDENTIFIER:
            case THIS:
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
                    // Haxe.g:326:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4297);
                    objLit250=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit250.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:327:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4305);
                    funcLit251=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit251.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:328:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4313);
                    elementarySymbol252=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol252.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:331:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4333);
                    id253=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id253.getTree());

                    // Haxe.g:331:12: ( typeParam )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==LT) ) {
                        int LA73_1 = input.LA(2);

                        if ( (synpred127_Haxe()) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // Haxe.g:331:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4335);
                            typeParam254=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam254.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 51, value_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "value"


    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "topLevelDecl"
    // Haxe.g:335:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl255 =null;

        HaxeParser.interfaceDecl_return interfaceDecl256 =null;

        HaxeParser.enumDecl_return enumDecl257 =null;

        HaxeParser.typedefDecl_return typedefDecl258 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:335:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt75=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt75=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt75=2;
                    }
                    break;
                case ENUM:
                    {
                    alt75=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt75=1;
                }
                break;
            case INTERFACE:
                {
                alt75=2;
                }
                break;
            case ENUM:
                {
                alt75=3;
                }
                break;
            case TYPEDEF:
                {
                alt75=4;
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
                    // Haxe.g:335:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4355);
                    classDecl255=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl255.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:336:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4375);
                    interfaceDecl256=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl256.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:337:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4395);
                    enumDecl257=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl257.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:338:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4415);
                    typedefDecl258=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl258.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, topLevelDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "topLevelDecl"


    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumDecl"
    // Haxe.g:341:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM260=null;
        Token IDENTIFIER261=null;
        HaxeParser.topLevelAccess_return topLevelAccess259 =null;

        HaxeParser.typeParam_return typeParam262 =null;

        HaxeParser.enumBody_return enumBody263 =null;


        Object ENUM260_tree=null;
        Object IDENTIFIER261_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:341:17: ( ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) )
            // Haxe.g:341:19: ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:341:19: ( topLevelAccess )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==EXTERN||LA76_0==PRIVATE) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // Haxe.g:341:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4451);
                    topLevelAccess259=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess259.getTree());

                    }
                    break;

            }


            ENUM260=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4454); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM260);


            IDENTIFIER261=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER261);


            // Haxe.g:341:51: ( typeParam )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==LT) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // Haxe.g:341:51: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4458);
                    typeParam262=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam262.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4461);
            enumBody263=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody263.getTree());

            // AST REWRITE
            // elements: enumBody, typeParam, IDENTIFIER, topLevelAccess
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 341:71: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
            {
                // Haxe.g:341:74: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:341:97: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:341:113: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 53, enumDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumDecl"


    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumBody"
    // Haxe.g:344:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE264=null;
        Token RBRACE266=null;
        HaxeParser.enumValueDecl_return enumValueDecl265 =null;


        Object LBRACE264_tree=null;
        Object RBRACE266_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:344:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:344:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE264=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE264);


            // Haxe.g:344:26: ( enumValueDecl )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==IDENTIFIER) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // Haxe.g:344:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4513);
            	    enumValueDecl265=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl265.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            RBRACE266=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE266);


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
            // 344:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:344:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE264, RBRACE266)
                , root_1);

                // Haxe.g:344:101: ( enumValueDecl )*
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
            if ( state.backtracking>0 ) { memoize(input, 54, enumBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumBody"


    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enumValueDecl"
    // Haxe.g:347:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER267=null;
        Token LPAREN268=null;
        Token RPAREN270=null;
        Token SEMI271=null;
        Token IDENTIFIER272=null;
        Token SEMI273=null;
        HaxeParser.paramList_return paramList269 =null;


        Object IDENTIFIER267_tree=null;
        Object LPAREN268_tree=null;
        Object RPAREN270_tree=null;
        Object SEMI271_tree=null;
        Object IDENTIFIER272_tree=null;
        Object SEMI273_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:347:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==IDENTIFIER) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==LPAREN) ) {
                    alt80=1;
                }
                else if ( (LA80_1==SEMI) ) {
                    alt80=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;

            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:347:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER267=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER267_tree = 
                    new VarDeclarationNode(IDENTIFIER267) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER267_tree, root_0);
                    }

                    LPAREN268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4563); if (state.failed) return retval;

                    // Haxe.g:347:59: ( paramList )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==IDENTIFIER||LA79_0==QUES) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // Haxe.g:347:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4566);
                            paramList269=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList269.getTree());

                            }
                            break;

                    }


                    RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4569); if (state.failed) return retval;

                    SEMI271=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4572); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:348:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER272=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4595); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER272_tree = 
                    new VarDeclarationNode(IDENTIFIER272) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER272_tree);
                    }

                    SEMI273=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4600); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, enumValueDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "enumValueDecl"


    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDecl"
    // Haxe.g:352:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS275=null;
        Token IDENTIFIER276=null;
        HaxeParser.topLevelAccess_return topLevelAccess274 =null;

        HaxeParser.typeParam_return typeParam277 =null;

        HaxeParser.inheritList_return inheritList278 =null;

        HaxeParser.classBodyScope_return classBodyScope279 =null;


        Object CLASS275_tree=null;
        Object IDENTIFIER276_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:352:17: ( ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) )
            // Haxe.g:352:19: ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope
            {
            // Haxe.g:352:19: ( topLevelAccess )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==EXTERN||LA81_0==PRIVATE) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:352:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4649);
                    topLevelAccess274=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess274.getTree());

                    }
                    break;

            }


            CLASS275=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4652); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS275);


            IDENTIFIER276=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER276);


            // Haxe.g:352:52: ( typeParam )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:352:52: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4656);
                    typeParam277=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam277.getTree());

                    }
                    break;

            }


            // Haxe.g:352:63: ( inheritList )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==EXTENDS||LA83_0==IMPLEMENTS) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // Haxe.g:352:63: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_classDecl4659);
                    inheritList278=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList278.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4662);
            classBodyScope279=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope279.getTree());

            // AST REWRITE
            // elements: classBodyScope, IDENTIFIER, inheritList, typeParam, topLevelAccess
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 353:21: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
            {
                // Haxe.g:353:24: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:353:48: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:353:64: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:353:75: ( inheritList )?
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
            if ( state.backtracking>0 ) { memoize(input, 56, classDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classDecl"


    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classBodyScope"
    // Haxe.g:356:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE280=null;
        Token RBRACE282=null;
        HaxeParser.classMember_return classMember281 =null;


        Object LBRACE280_tree=null;
        Object RBRACE282_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:356:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:356:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE280=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4729); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE280);


            // Haxe.g:356:26: ( classMember )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==DYNAMIC||LA84_0==FUNCTION||LA84_0==INLINE||LA84_0==OVERRIDE||LA84_0==PRIVATE||LA84_0==PUBLIC||LA84_0==STATIC||LA84_0==VAR) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // Haxe.g:356:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4732);
            	    classMember281=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember281.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            RBRACE282=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4736); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE282);


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
            // 356:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:356:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE280, RBRACE282)
                , root_1);

                // Haxe.g:356:99: ( classMember )*
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
            if ( state.backtracking>0 ) { memoize(input, 57, classBodyScope_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classBodyScope"


    public static class classMember_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classMember"
    // Haxe.g:359:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass283 =null;

        HaxeParser.funcDecl_return funcDecl284 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:359:17: ( varDeclClass | funcDecl )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // Haxe.g:359:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4782);
                    varDeclClass283=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass283.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:360:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4802);
                    funcDecl284=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl284.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, classMember_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "classMember"


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:364:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR286=null;
        Token IDENTIFIER287=null;
        Token SEMI291=null;
        HaxeParser.declAttrList_return declAttrList285 =null;

        HaxeParser.propDecl_return propDecl288 =null;

        HaxeParser.typeTag_return typeTag289 =null;

        HaxeParser.varInit_return varInit290 =null;


        Object VAR286_tree=null;
        Object IDENTIFIER287_tree=null;
        Object SEMI291_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:364:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:364:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:364:19: ( declAttrList )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==DYNAMIC||LA86_0==INLINE||LA86_0==OVERRIDE||LA86_0==PRIVATE||LA86_0==PUBLIC||LA86_0==STATIC) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:364:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4844);
                    declAttrList285=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList285.getTree());

                    }
                    break;

            }


            VAR286=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4847); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR286);


            IDENTIFIER287=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER287);


            // Haxe.g:364:48: ( propDecl )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LPAREN) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:364:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4851);
                    propDecl288=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl288.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass4854);
            typeTag289=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag289.getTree());

            // Haxe.g:364:66: ( varInit )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==EQ) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:364:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4856);
                    varInit290=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit290.getTree());

                    }
                    break;

            }


            SEMI291=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4859); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI291);


            // AST REWRITE
            // elements: propDecl, typeTag, varInit, declAttrList, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 364:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:364:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:364:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:364:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:364:148: ( varInit )?
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
    // Haxe.g:367:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR292=null;
        Token COMMA294=null;
        Token SEMI296=null;
        HaxeParser.varDeclPartList_return varDeclPartList293 =null;

        HaxeParser.varDeclPartList_return varDeclPartList295 =null;


        Object VAR292_tree=null;
        Object COMMA294_tree=null;
        Object SEMI296_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:367:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:367:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR292=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4928); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl4931);
            varDeclPartList293=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList293.getTree());

            // Haxe.g:367:40: ( COMMA ! varDeclPartList )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // Haxe.g:367:41: COMMA ! varDeclPartList
            	    {
            	    COMMA294=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl4934); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl4937);
            	    varDeclPartList295=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList295.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);


            SEMI296=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4941); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:370:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER297=null;
        HaxeParser.propDecl_return propDecl298 =null;

        HaxeParser.typeTag_return typeTag299 =null;

        HaxeParser.varInit_return varInit300 =null;


        Object IDENTIFIER297_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:370:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:370:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER297=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList4967); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER297);


            // Haxe.g:370:30: ( propDecl )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LPAREN) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:370:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList4969);
                    propDecl298=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl298.getTree());

                    }
                    break;

            }


            // Haxe.g:370:40: ( typeTag )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==COLON) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:370:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList4972);
                    typeTag299=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag299.getTree());

                    }
                    break;

            }


            // Haxe.g:370:49: ( varInit )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==EQ) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // Haxe.g:370:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList4975);
                    varInit300=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit300.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: typeTag, varInit, propDecl, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 370:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:370:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:370:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:370:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:370:113: ( varInit )?
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
    // Haxe.g:373:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN301=null;
        Token COMMA302=null;
        Token RPAREN303=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN301_tree=null;
        Object COMMA302_tree=null;
        Object RPAREN303_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:373:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:373:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN301=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl5026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN301);


            pushFollow(FOLLOW_propAccessor_in_propDecl5030);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA302=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl5032); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA302);


            pushFollow(FOLLOW_propAccessor_in_propDecl5036);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN303=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl5038); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN303);


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
            // 373:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:373:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
    // Haxe.g:376:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set304=null;

        Object set304_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:376:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set304=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set304)
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
    // Haxe.g:383:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ305=null;
        HaxeParser.expr_return expr306 =null;


        Object EQ305_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:383:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:383:19: EQ expr
            {
            EQ305=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5197); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ305);


            pushFollow(FOLLOW_expr_in_varInit5199);
            expr306=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr306.getTree());

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
            // 383:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:383:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
    // Haxe.g:386:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION308=null;
        Token NEW309=null;
        Token FUNCTION312=null;
        Token IDENTIFIER313=null;
        HaxeParser.declAttrList_return declAttrList307 =null;

        HaxeParser.funcDeclPart_return funcDeclPart310 =null;

        HaxeParser.declAttrList_return declAttrList311 =null;

        HaxeParser.typeParam_return typeParam314 =null;

        HaxeParser.funcDeclPart_return funcDeclPart315 =null;


        Object FUNCTION308_tree=null;
        Object NEW309_tree=null;
        Object FUNCTION312_tree=null;
        Object IDENTIFIER313_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:386:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt96=2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // Haxe.g:386:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:386:19: ( declAttrList )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DYNAMIC||LA93_0==INLINE||LA93_0==OVERRIDE||LA93_0==PRIVATE||LA93_0==PUBLIC||LA93_0==STATIC) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:386:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5243);
                            declAttrList307=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList307.getTree());

                            }
                            break;

                    }


                    FUNCTION308=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION308);


                    NEW309=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW309);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5250);
                    funcDeclPart310=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart310.getTree());

                    // AST REWRITE
                    // elements: declAttrList, FUNCTION, funcDeclPart, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 387:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:387:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:387:53: ( declAttrList )?
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
                    // Haxe.g:388:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:388:19: ( declAttrList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==DYNAMIC||LA94_0==INLINE||LA94_0==OVERRIDE||LA94_0==PRIVATE||LA94_0==PUBLIC||LA94_0==STATIC) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:388:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5308);
                            declAttrList311=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList311.getTree());

                            }
                            break;

                    }


                    FUNCTION312=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION312);


                    IDENTIFIER313=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER313);


                    // Haxe.g:388:53: ( typeParam )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==LT) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // Haxe.g:388:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5315);
                            typeParam314=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam314.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5318);
                    funcDeclPart315=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart315.getTree());

                    // AST REWRITE
                    // elements: funcDeclPart, declAttrList, IDENTIFIER, typeParam, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 389:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:389:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:389:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:389:87: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 65, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDeclPart"
    // Haxe.g:392:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN316=null;
        Token RPAREN318=null;
        Token SEMI321=null;
        HaxeParser.paramList_return paramList317 =null;

        HaxeParser.typeTag_return typeTag319 =null;

        HaxeParser.block_return block320 =null;


        Object LPAREN316_tree=null;
        Object RPAREN318_tree=null;
        Object SEMI321_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:392:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:392:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN316=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5402); if (state.failed) return retval;

            // Haxe.g:392:27: ( paramList )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==IDENTIFIER||LA97_0==QUES) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Haxe.g:392:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5405);
                    paramList317=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList317.getTree());

                    }
                    break;

            }


            RPAREN318=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5408); if (state.failed) return retval;

            // Haxe.g:392:46: ( typeTag )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==COLON) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // Haxe.g:392:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5411);
                    typeTag319=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag319.getTree());

                    }
                    break;

            }


            // Haxe.g:392:55: ( block | SEMI !)
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==LBRACE) ) {
                alt99=1;
            }
            else if ( (LA99_0==SEMI) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }
            switch (alt99) {
                case 1 :
                    // Haxe.g:392:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5415);
                    block320=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block320.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:392:64: SEMI !
                    {
                    SEMI321=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5419); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 66, funcDeclPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDeclPart"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:395:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION323=null;
        Token NEW324=null;
        Token LPAREN325=null;
        Token RPAREN327=null;
        Token SEMI329=null;
        Token FUNCTION331=null;
        Token IDENTIFIER332=null;
        Token LPAREN334=null;
        Token RPAREN336=null;
        Token SEMI338=null;
        Token FUNCTION339=null;
        Token NEW340=null;
        Token LPAREN341=null;
        Token RPAREN343=null;
        Token SEMI345=null;
        Token FUNCTION346=null;
        Token IDENTIFIER347=null;
        Token LPAREN349=null;
        Token RPAREN351=null;
        Token SEMI353=null;
        HaxeParser.declAttrList_return declAttrList322 =null;

        HaxeParser.paramList_return paramList326 =null;

        HaxeParser.typeTag_return typeTag328 =null;

        HaxeParser.declAttrList_return declAttrList330 =null;

        HaxeParser.typeParam_return typeParam333 =null;

        HaxeParser.paramList_return paramList335 =null;

        HaxeParser.typeTag_return typeTag337 =null;

        HaxeParser.paramList_return paramList342 =null;

        HaxeParser.typeTag_return typeTag344 =null;

        HaxeParser.typeParam_return typeParam348 =null;

        HaxeParser.paramList_return paramList350 =null;

        HaxeParser.typeTag_return typeTag352 =null;


        Object FUNCTION323_tree=null;
        Object NEW324_tree=null;
        Object LPAREN325_tree=null;
        Object RPAREN327_tree=null;
        Object SEMI329_tree=null;
        Object FUNCTION331_tree=null;
        Object IDENTIFIER332_tree=null;
        Object LPAREN334_tree=null;
        Object RPAREN336_tree=null;
        Object SEMI338_tree=null;
        Object FUNCTION339_tree=null;
        Object NEW340_tree=null;
        Object LPAREN341_tree=null;
        Object RPAREN343_tree=null;
        Object SEMI345_tree=null;
        Object FUNCTION346_tree=null;
        Object IDENTIFIER347_tree=null;
        Object LPAREN349_tree=null;
        Object RPAREN351_tree=null;
        Object SEMI353_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:396:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt110=4;
            alt110 = dfa110.predict(input);
            switch (alt110) {
                case 1 :
                    // Haxe.g:396:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5456);
                    declAttrList322=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList322.getTree());

                    FUNCTION323=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5458); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION323);


                    NEW324=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW324);


                    LPAREN325=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5462); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN325);


                    // Haxe.g:396:42: ( paramList )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==IDENTIFIER||LA100_0==QUES) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:396:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5464);
                            paramList326=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList326.getTree());

                            }
                            break;

                    }


                    RPAREN327=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN327);


                    // Haxe.g:396:60: ( typeTag )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==COLON) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:396:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5469);
                            typeTag328=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag328.getTree());

                            }
                            break;

                    }


                    SEMI329=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5472); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI329);


                    // AST REWRITE
                    // elements: declAttrList, paramList, typeTag, FUNCTION, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 397:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:397:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:397:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:397:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:397:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:397:52: ( declAttrList )?
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
                    // Haxe.g:398:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5513);
                    declAttrList330=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList330.getTree());

                    FUNCTION331=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5515); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION331);


                    IDENTIFIER332=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER332);


                    // Haxe.g:398:42: ( typeParam )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==LT) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:398:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5519);
                            typeParam333=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam333.getTree());

                            }
                            break;

                    }


                    LPAREN334=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN334);


                    // Haxe.g:398:60: ( paramList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER||LA103_0==QUES) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:398:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5524);
                            paramList335=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList335.getTree());

                            }
                            break;

                    }


                    RPAREN336=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN336);


                    // Haxe.g:398:78: ( typeTag )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==COLON) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:398:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5529);
                            typeTag337=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag337.getTree());

                            }
                            break;

                    }


                    SEMI338=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI338);


                    // AST REWRITE
                    // elements: typeTag, IDENTIFIER, typeParam, paramList, declAttrList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 399:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:399:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:399:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:399:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:399:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:399:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:399:73: ( typeParam )?
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
                    // Haxe.g:400:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION339=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION339);


                    NEW340=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW340);


                    LPAREN341=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN341);


                    // Haxe.g:400:29: ( paramList )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==IDENTIFIER||LA105_0==QUES) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:400:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5582);
                            paramList342=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList342.getTree());

                            }
                            break;

                    }


                    RPAREN343=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN343);


                    // Haxe.g:400:47: ( typeTag )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==COLON) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:400:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5587);
                            typeTag344=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag344.getTree());

                            }
                            break;

                    }


                    SEMI345=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI345);


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
                    // 401:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:401:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
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

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:402:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION346=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5628); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION346);


                    IDENTIFIER347=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER347);


                    // Haxe.g:402:29: ( typeParam )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==LT) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:402:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5632);
                            typeParam348=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam348.getTree());

                            }
                            break;

                    }


                    LPAREN349=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5635); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN349);


                    // Haxe.g:402:47: ( paramList )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==IDENTIFIER||LA108_0==QUES) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // Haxe.g:402:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5637);
                            paramList350=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList350.getTree());

                            }
                            break;

                    }


                    RPAREN351=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5640); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN351);


                    // Haxe.g:402:65: ( typeTag )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==COLON) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Haxe.g:402:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5642);
                            typeTag352=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag352.getTree());

                            }
                            break;

                    }


                    SEMI353=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI353);


                    // AST REWRITE
                    // elements: FUNCTION, typeParam, IDENTIFIER, typeTag, paramList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 403:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:403:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
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

                        // Haxe.g:403:59: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 67, funcProtoDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcProtoDecl"


    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceDecl"
    // Haxe.g:406:1: interfaceDecl : ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE355=null;
        Token LBRACE358=null;
        Token RBRACE360=null;
        HaxeParser.topLevelAccess_return topLevelAccess354 =null;

        HaxeParser.type_return type356 =null;

        HaxeParser.inheritList_return inheritList357 =null;

        HaxeParser.interfaceBody_return interfaceBody359 =null;


        Object INTERFACE355_tree=null;
        Object LBRACE358_tree=null;
        Object RBRACE360_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:407:5: ( ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:407:9: ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:407:9: ( topLevelAccess )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==EXTERN||LA111_0==PRIVATE) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // Haxe.g:407:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5704);
                    topLevelAccess354=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess354.getTree());

                    }
                    break;

            }


            INTERFACE355=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5707); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE355_tree = 
            (Object)adaptor.create(INTERFACE355)
            ;
            adaptor.addChild(root_0, INTERFACE355_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5709);
            type356=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type356.getTree());

            // Haxe.g:407:40: ( inheritList )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==EXTENDS||LA112_0==IMPLEMENTS) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // Haxe.g:407:40: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_interfaceDecl5711);
                    inheritList357=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritList357.getTree());

                    }
                    break;

            }


            LBRACE358=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5714); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5717);
            interfaceBody359=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody359.getTree());

            RBRACE360=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5719); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, interfaceDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceDecl"


    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBody"
    // Haxe.g:410:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl361 =null;

        HaxeParser.interfaceBody_return interfaceBody362 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl363 =null;

        HaxeParser.interfaceBody_return interfaceBody364 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:411:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
            int alt113=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt113=1;
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
                alt113=2;
                }
                break;
            case EOF:
            case RBRACE:
                {
                alt113=3;
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
                    // Haxe.g:411:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5743);
                    varDecl361=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl361.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5745);
                    interfaceBody362=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody362.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:412:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5755);
                    funcProtoDecl363=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl363.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5757);
                    interfaceBody364=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody364.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:415:5: 
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
            if ( state.backtracking>0 ) { memoize(input, 69, interfaceBody_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "interfaceBody"


    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inheritList"
    // Haxe.g:417:1: inheritList : inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA366=null;
        HaxeParser.inherit_return inherit365 =null;

        HaxeParser.inherit_return inherit367 =null;


        Object COMMA366_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_inherit=new RewriteRuleSubtreeStream(adaptor,"rule inherit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:417:17: ( inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) )
            // Haxe.g:417:19: inherit ( COMMA inherit )*
            {
            pushFollow(FOLLOW_inherit_in_inheritList5781);
            inherit365=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inherit.add(inherit365.getTree());

            // Haxe.g:417:27: ( COMMA inherit )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Haxe.g:417:28: COMMA inherit
            	    {
            	    COMMA366=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5784); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA366);


            	    pushFollow(FOLLOW_inherit_in_inheritList5786);
            	    inherit367=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inherit.add(inherit367.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
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
            // 417:44: -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
            {
                // Haxe.g:417:47: ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 70, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:420:1: inherit : ( EXTENDS ^ type | IMPLEMENTS ^ type );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS368=null;
        Token IMPLEMENTS370=null;
        HaxeParser.type_return type369 =null;

        HaxeParser.type_return type371 =null;


        Object EXTENDS368_tree=null;
        Object IMPLEMENTS370_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:420:17: ( EXTENDS ^ type | IMPLEMENTS ^ type )
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
                    // Haxe.g:420:19: EXTENDS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS368=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5838); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS368_tree = 
                    (Object)adaptor.create(EXTENDS368)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EXTENDS368_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5841);
                    type369=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type369.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:421:19: IMPLEMENTS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS370=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5861); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS370_tree = 
                    (Object)adaptor.create(IMPLEMENTS370)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLEMENTS370_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5864);
                    type371=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type371.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:424:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF372=null;
        Token IDENTIFIER373=null;
        Token EQ374=null;
        HaxeParser.funcType_return funcType375 =null;


        Object TYPEDEF372_tree=null;
        Object IDENTIFIER373_tree=null;
        Object EQ374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:424:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:424:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF372=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5897); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF372_tree = 
            (Object)adaptor.create(TYPEDEF372)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF372_tree, root_0);
            }

            IDENTIFIER373=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5900); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER373_tree = 
            (Object)adaptor.create(IDENTIFIER373)
            ;
            adaptor.addChild(root_0, IDENTIFIER373_tree);
            }

            EQ374=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5902); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl5905);
            funcType375=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType375.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:427:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT376=null;
        HaxeParser.funcType_return funcType377 =null;


        Object GT376_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:427:17: ( GT ^ funcType )
            // Haxe.g:427:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT376=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5939); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT376_tree = 
            (Object)adaptor.create(GT376)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT376_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5942);
            funcType377=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType377.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:430:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE378=null;
        Token RBRACE380=null;
        HaxeParser.objLitElemList_return objLitElemList379 =null;


        Object LBRACE378_tree=null;
        Object RBRACE380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:430:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:430:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE378=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5976); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit5979);
            objLitElemList379=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList379.getTree());

            RBRACE380=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5981); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:433:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER381=null;
        Token COLON382=null;
        HaxeParser.funcType_return funcType383 =null;


        Object IDENTIFIER381_tree=null;
        Object COLON382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:433:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:433:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER381=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField6009); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER381_tree = 
            (Object)adaptor.create(IDENTIFIER381)
            ;
            adaptor.addChild(root_0, IDENTIFIER381_tree);
            }

            COLON382=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField6011); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField6014);
            funcType383=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType383.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:436:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA385=null;
        HaxeParser.objLitElem_return objLitElem384 =null;

        HaxeParser.objLitElem_return objLitElem386 =null;


        Object COMMA385_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:436:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:436:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList6044);
            objLitElem384=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem384.getTree());

            // Haxe.g:436:30: ( COMMA ! objLitElem )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==COMMA) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // Haxe.g:436:31: COMMA ! objLitElem
            	    {
            	    COMMA385=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList6047); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList6050);
            	    objLitElem386=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem386.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 76, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:439:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER387=null;
        Token COLON388=null;
        HaxeParser.expr_return expr389 =null;


        Object IDENTIFIER387_tree=null;
        Object COLON388_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }

            // Haxe.g:439:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:439:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER387=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6086); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER387_tree = 
            (Object)adaptor.create(IDENTIFIER387)
            ;
            adaptor.addChild(root_0, IDENTIFIER387_tree);
            }

            COLON388=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6088); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6091);
            expr389=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr389.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:443:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL390=null;
        Token NULL391=null;
        Token INTLITERAL392=null;
        Token STRINGLITERAL393=null;
        Token CHARLITERAL394=null;
        Token FLOATNUM395=null;
        Token TRUE396=null;
        Token FALSE397=null;

        Object LONGLITERAL390_tree=null;
        Object NULL391_tree=null;
        Object INTLITERAL392_tree=null;
        Object STRINGLITERAL393_tree=null;
        Object CHARLITERAL394_tree=null;
        Object FLOATNUM395_tree=null;
        Object TRUE396_tree=null;
        Object FALSE397_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }

            // Haxe.g:444:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt117=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt117=1;
                }
                break;
            case NULL:
                {
                alt117=2;
                }
                break;
            case INTLITERAL:
                {
                alt117=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt117=4;
                }
                break;
            case CHARLITERAL:
                {
                alt117=5;
                }
                break;
            case FLOATNUM:
                {
                alt117=6;
                }
                break;
            case TRUE:
                {
                alt117=7;
                }
                break;
            case FALSE:
                {
                alt117=8;
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
                    // Haxe.g:444:7: LONGLITERAL
                    {
                    LONGLITERAL390=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL390);


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
                    // 444:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL390, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:445:7: NULL
                    {
                    NULL391=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL391);


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
                    // 445:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL391, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:446:7: INTLITERAL
                    {
                    INTLITERAL392=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL392);


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
                    // 446:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL392, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:447:7: STRINGLITERAL
                    {
                    STRINGLITERAL393=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6187); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL393);


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
                    // 447:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL393, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:448:7: CHARLITERAL
                    {
                    CHARLITERAL394=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6203); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL394);


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
                    // 448:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL394, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:449:7: FLOATNUM
                    {
                    FLOATNUM395=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM395);


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
                    // 449:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM395, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:450:7: TRUE
                    {
                    TRUE396=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6242); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE396);


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
                    // 450:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE396, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:451:7: FALSE
                    {
                    FALSE397=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE397);


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
                    // 451:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE397, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 78, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:193:61: ( typeParam )
        // Haxe.g:193:61: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred57_Haxe1838);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred59_Haxe
    public final void synpred59_Haxe_fragment() throws RecognitionException {
        // Haxe.g:204:19: ( block )
        // Haxe.g:204:19: block
        {
        pushFollow(FOLLOW_block_in_synpred59_Haxe1980);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred59_Haxe

    // $ANTLR start synpred60_Haxe
    public final void synpred60_Haxe_fragment() throws RecognitionException {
        // Haxe.g:205:56: ( ELSE statement )
        // Haxe.g:205:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred60_Haxe2011); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred60_Haxe2014);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred74_Haxe
    public final void synpred74_Haxe_fragment() throws RecognitionException {
        // Haxe.g:214:19: ( expr SEMI )
        // Haxe.g:214:19: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred74_Haxe2292);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred74_Haxe2294); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred74_Haxe

    // $ANTLR start synpred116_Haxe
    public final void synpred116_Haxe_fragment() throws RecognitionException {
        // Haxe.g:306:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:306:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred116_Haxe3934);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred116_Haxe3936); if (state.failed) return ;

        // Haxe.g:306:32: ( exprList )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==BANG||LA128_0==CAST||LA128_0==CHARLITERAL||LA128_0==FALSE||LA128_0==FLOATNUM||LA128_0==FUNCTION||LA128_0==IDENTIFIER||LA128_0==INTLITERAL||LA128_0==LBRACE||LA128_0==LONGLITERAL||(LA128_0 >= NEW && LA128_0 <= NULL)||LA128_0==PLUSPLUS||(LA128_0 >= STRINGLITERAL && LA128_0 <= SUB)||LA128_0==SUBSUB||LA128_0==THIS||LA128_0==TILDE||LA128_0==TRUE||LA128_0==UNTYPED) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // Haxe.g:306:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred116_Haxe3938);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred116_Haxe3941); if (state.failed) return ;

        // Haxe.g:306:49: ( pureCallOrSlice )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==DOT||LA129_0==LBRACKET) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // Haxe.g:306:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred116_Haxe3943);
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
        // Haxe.g:308:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:308:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred118_Haxe3994);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred118_Haxe3996); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred118_Haxe3998);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred118_Haxe4000); if (state.failed) return ;

        // Haxe.g:308:48: ( pureCallOrSlice )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==DOT||LA130_0==LBRACKET) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // Haxe.g:308:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred118_Haxe4002);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred118_Haxe

    // $ANTLR start synpred127_Haxe
    public final void synpred127_Haxe_fragment() throws RecognitionException {
        // Haxe.g:331:12: ( typeParam )
        // Haxe.g:331:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred127_Haxe4335);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

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


    protected DFA85 dfa85 = new DFA85(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA110 dfa110 = new DFA110(this);
    static final String DFA85_eotS =
        "\4\uffff";
    static final String DFA85_eofS =
        "\4\uffff";
    static final String DFA85_minS =
        "\2\46\2\uffff";
    static final String DFA85_maxS =
        "\2\u00a2\2\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA85_specialS =
        "\4\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\30\uffff\1\2",
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\30\uffff\1\2",
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
            return "359:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA96_eotS =
        "\5\uffff";
    static final String DFA96_eofS =
        "\5\uffff";
    static final String DFA96_minS =
        "\2\46\1\105\2\uffff";
    static final String DFA96_maxS =
        "\2\u0089\1\142\2\uffff";
    static final String DFA96_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA96_specialS =
        "\5\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\34\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "386:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA110_eotS =
        "\10\uffff";
    static final String DFA110_eofS =
        "\10\uffff";
    static final String DFA110_minS =
        "\2\46\2\105\4\uffff";
    static final String DFA110_maxS =
        "\2\u0089\2\142\4\uffff";
    static final String DFA110_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA110_specialS =
        "\10\uffff}>";
    static final String[] DFA110_transitionS = {
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
            return "395:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module184 = new BitSet(new long[]{0x0002080004000002L,0x0400000000008200L,0x0000000208000000L});
    public static final BitSet FOLLOW_imports_in_module187 = new BitSet(new long[]{0x0002080004000002L,0x0400000000008200L,0x0000000208000000L});
    public static final BitSet FOLLOW_topLevelDecl_in_module190 = new BitSet(new long[]{0x0002080004000002L,0x0400000000008000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IMPORT_in_imports243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_filepath_in_imports246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_imports248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USING_in_imports269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_filepath_in_imports272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_imports274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_filepath_in_myPackage309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_myPackage311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath366 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_DOT_in_filepath371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_filepath375 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_MONKEYS_AT_in_meta411 = new BitSet(new long[]{0x0040004008010000L,0x0000000000004020L,0x0000001000000800L});
    public static final BitSet FOLLOW_metaName_in_meta413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_meta416 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_meta418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_meta421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_metaName440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_metaName448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_metaName457 = new BitSet(new long[]{0x0040004008010000L,0x0000000000004020L,0x0000001000000800L});
    public static final BitSet FOLLOW_metaName_in_metaName459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_meta_in_typeDeclFlags477 = new BitSet(new long[]{0x0002000000000002L,0x0400000080000000L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList706 = new BitSet(new long[]{0x0000004000000002L,0x2400002000001000L,0x0000000000000200L});
    public static final BitSet FOLLOW_param_in_paramList751 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList754 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_paramList756 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_QUES_in_param806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param809 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_param811 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_param814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_id921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_id941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_assignOp976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAREQ_in_assignOp1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BAREQ_in_assignOp1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARETEQ_in_assignOp1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTLTEQ_in_assignOp1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTEQ_in_assignOp1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTGTGTEQ_in_assignOp1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit1354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit1360 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcLit1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit1366 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_funcLit1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1416 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeTag1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1462 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1465 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeList1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1490 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1493 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeList1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_funcType1531 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1534 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_funcType1537 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_LBRACE_in_anonType1575 = new BitSet(new long[]{0x0800000000000000L,0x8000000000000020L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypePart_in_anonType1577 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonTypePart1662 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_anonTypePart1664 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonTypePart1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_anonTypePart1673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1723 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList1728 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_primitiveType_in_type1823 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_filepath_in_type1828 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_anonType_in_type1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1874 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParam1876 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1878 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint1932 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1936 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2006 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2008 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2011 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2042 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2047 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_statement2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2052 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2081 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2103 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_statement2143 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2145 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2172 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2180 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2183 = new BitSet(new long[]{0x0000000200200000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2207 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B008L});
    public static final BitSet FOLLOW_expr_in_statement2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2237 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2303 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2305 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2353 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_parExpression2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2394 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00490060L,0x00000045035CB002L});
    public static final BitSet FOLLOW_blockStmt_in_block2397 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00490060L,0x00000045035CB002L});
    public static final BitSet FOLLOW_RBRACE_in_block2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2491 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2494 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2496 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2522 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2566 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_catchStmt2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2612 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2615 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_exprList2618 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2660 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2713 = new BitSet(new long[]{0x4000100000104082L,0x00000A0008000001L,0x0000000000004140L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2716 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2750 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2753 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2756 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2758 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2792 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2795 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2801 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2835 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2837 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2843 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2893 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2896 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2941 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2968 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2997 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3026 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3055 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3084 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3113 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3120 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3159 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3186 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3215 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3244 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3251 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3284 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3311 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3340 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3369 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3376 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3411 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3438 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3467 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3474 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3513 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_STAR_in_multExpr3540 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3569 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3598 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3605 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3653 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3672 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3691 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3710 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3729 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3756 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3807 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_prefixExpr3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3812 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3842 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3845 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3848 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3936 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3941 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice3996 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4000 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4053 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4090 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B001L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4095 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4151 = new BitSet(new long[]{0x0288000002000000L,0x0000000800490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_dotIdentifier4197 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dotPart_in_dotIdentifier4199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_dotPart4258 = new BitSet(new long[]{0x0288000002000000L,0x0000000800490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_dotIdentifier_in_dotPart4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4333 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_value4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4451 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4510 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4513 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4563 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4649 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4654 = new BitSet(new long[]{0x0001000000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4656 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_classDecl4659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4729 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4732 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4849 = new BitSet(new long[]{0x0000000008000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4851 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4854 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4931 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_varDecl4934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4937 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList4967 = new BitSet(new long[]{0x0000100008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList4969 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList4972 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl5026 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5030 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl5032 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl5036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5197 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_varInit5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5243 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5246 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5308 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5313 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5402 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5408 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5456 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5458 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5462 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5467 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5513 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5517 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5522 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5527 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5576 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5580 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5585 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5630 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5635 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5640 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5707 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5709 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_interfaceDecl5711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5714 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5717 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5743 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5755 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5781 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5784 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5786 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5838 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5861 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5900 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5902 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5939 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5979 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField6009 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField6011 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6044 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList6047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList6050 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6086 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6088 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred57_Haxe1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred59_Haxe1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred60_Haxe2011 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_synpred60_Haxe2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred74_Haxe2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_synpred74_Haxe2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred116_Haxe3934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred116_Haxe3936 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_synpred116_Haxe3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred116_Haxe3941 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred116_Haxe3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred118_Haxe3994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred118_Haxe3996 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_synpred118_Haxe3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred118_Haxe4000 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred118_Haxe4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred127_Haxe4335 = new BitSet(new long[]{0x0000000000000002L});

}