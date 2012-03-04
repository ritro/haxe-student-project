// $ANTLR 3.4 Haxe.g 2012-03-04 22:15:26

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
        this.state.ruleMemo = new HashMap[261+1];
         

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
            // elements: QUES, typeTag, varInit
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
    // Haxe.g:193:1: type : ( primitiveType ^| IDENTIFIER ^| filepath ^| anonType ^) ( typeParam )? ;
    public final HaxeParser.type_return type() throws RecognitionException {
        HaxeParser.type_return retval = new HaxeParser.type_return();
        retval.start = input.LT(1);

        int type_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER80=null;
        HaxeParser.primitiveType_return primitiveType79 =null;

        HaxeParser.filepath_return filepath81 =null;

        HaxeParser.anonType_return anonType82 =null;

        HaxeParser.typeParam_return typeParam83 =null;


        Object IDENTIFIER80_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

            // Haxe.g:193:17: ( ( primitiveType ^| IDENTIFIER ^| filepath ^| anonType ^) ( typeParam )? )
            // Haxe.g:193:19: ( primitiveType ^| IDENTIFIER ^| filepath ^| anonType ^) ( typeParam )?
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:193:19: ( primitiveType ^| IDENTIFIER ^| filepath ^| anonType ^)
            int alt30=4;
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
                int LA30_2 = input.LA(2);

                if ( (synpred56_Haxe()) ) {
                    alt30=2;
                }
                else if ( (synpred57_Haxe()) ) {
                    alt30=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                alt30=4;
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
                    // Haxe.g:193:37: IDENTIFIER ^
                    {
                    IDENTIFIER80=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type1828); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER80_tree = 
                    (Object)adaptor.create(IDENTIFIER80)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER80_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:193:51: filepath ^
                    {
                    pushFollow(FOLLOW_filepath_in_type1833);
                    filepath81=filepath();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(filepath81.getTree(), root_0);

                    }
                    break;
                case 4 :
                    // Haxe.g:193:63: anonType ^
                    {
                    pushFollow(FOLLOW_anonType_in_type1838);
                    anonType82=anonType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(anonType82.getTree(), root_0);

                    }
                    break;

            }


            // Haxe.g:193:75: ( typeParam )?
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
                    // Haxe.g:193:75: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_type1843);
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

        Token LT84=null;
        Token GT87=null;
        HaxeParser.typeList_return typeList85 =null;

        HaxeParser.typeParam_return typeParam86 =null;


        Object LT84_tree=null;
        Object GT87_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

            // Haxe.g:196:17: ( LT typeList ( typeParam )? GT -> ^( TYPE_PARAM[\"TYPE_PARAM\"] typeList ( typeParam )? ) )
            // Haxe.g:196:19: LT typeList ( typeParam )? GT
            {
            LT84=(Token)match(input,LT,FOLLOW_LT_in_typeParam1879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LT.add(LT84);


            pushFollow(FOLLOW_typeList_in_typeParam1881);
            typeList85=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList85.getTree());

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
                    pushFollow(FOLLOW_typeParam_in_typeParam1883);
                    typeParam86=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam86.getTree());

                    }
                    break;

            }


            GT87=(Token)match(input,GT,FOLLOW_GT_in_typeParam1886); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GT.add(GT87);


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

        Token COLON89=null;
        Token LPAREN90=null;
        Token RPAREN92=null;
        HaxeParser.identifier_return identifier88 =null;

        HaxeParser.typeList_return typeList91 =null;


        Object COLON89_tree=null;
        Object LPAREN90_tree=null;
        Object RPAREN92_tree=null;
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
            pushFollow(FOLLOW_identifier_in_typeConstraint1937);
            identifier88=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier88.getTree());

            COLON89=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON89);


            LPAREN90=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN90);


            pushFollow(FOLLOW_typeList_in_typeConstraint1943);
            typeList91=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList91.getTree());

            RPAREN92=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1945); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN92);


            // AST REWRITE
            // elements: identifier, typeList
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

        Token IF94=null;
        Token ELSE97=null;
        Token FOR99=null;
        Token LPAREN100=null;
        Token IN102=null;
        Token RPAREN104=null;
        Token WHILE106=null;
        Token DO109=null;
        Token WHILE111=null;
        Token SEMI113=null;
        Token TRY114=null;
        Token SWITCH117=null;
        Token LPAREN118=null;
        Token RPAREN120=null;
        Token LBRACE121=null;
        Token RBRACE123=null;
        Token RETURN124=null;
        Token SEMI126=null;
        Token THROW127=null;
        Token SEMI129=null;
        Token set130=null;
        Token SEMI131=null;
        Token SEMI133=null;
        Token IDENTIFIER134=null;
        Token COLON135=null;
        HaxeParser.block_return block93 =null;

        HaxeParser.parExpression_return parExpression95 =null;

        HaxeParser.statement_return statement96 =null;

        HaxeParser.statement_return statement98 =null;

        HaxeParser.expr_return expr101 =null;

        HaxeParser.iterExpr_return iterExpr103 =null;

        HaxeParser.statement_return statement105 =null;

        HaxeParser.parExpression_return parExpression107 =null;

        HaxeParser.statement_return statement108 =null;

        HaxeParser.statement_return statement110 =null;

        HaxeParser.parExpression_return parExpression112 =null;

        HaxeParser.block_return block115 =null;

        HaxeParser.catchStmt_return catchStmt116 =null;

        HaxeParser.expr_return expr119 =null;

        HaxeParser.caseStmt_return caseStmt122 =null;

        HaxeParser.expr_return expr125 =null;

        HaxeParser.expr_return expr128 =null;

        HaxeParser.expr_return expr132 =null;

        HaxeParser.statement_return statement136 =null;


        Object IF94_tree=null;
        Object ELSE97_tree=null;
        Object FOR99_tree=null;
        Object LPAREN100_tree=null;
        Object IN102_tree=null;
        Object RPAREN104_tree=null;
        Object WHILE106_tree=null;
        Object DO109_tree=null;
        Object WHILE111_tree=null;
        Object SEMI113_tree=null;
        Object TRY114_tree=null;
        Object SWITCH117_tree=null;
        Object LPAREN118_tree=null;
        Object RPAREN120_tree=null;
        Object LBRACE121_tree=null;
        Object RBRACE123_tree=null;
        Object RETURN124_tree=null;
        Object SEMI126_tree=null;
        Object THROW127_tree=null;
        Object SEMI129_tree=null;
        Object set130_tree=null;
        Object SEMI131_tree=null;
        Object SEMI133_tree=null;
        Object IDENTIFIER134_tree=null;
        Object COLON135_tree=null;
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

                if ( (synpred60_Haxe()) ) {
                    alt37=1;
                }
                else if ( (synpred75_Haxe()) ) {
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

                if ( (synpred75_Haxe()) ) {
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


                    pushFollow(FOLLOW_block_in_statement1985);
                    block93=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block93.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:205:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF94=(Token)match(input,IF,FOLLOW_IF_in_statement2005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF94_tree = 
                    new IfNode(IF94) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF94_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2011);
                    parExpression95=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression95.getTree());

                    pushFollow(FOLLOW_statement_in_statement2013);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement96.getTree());

                    // Haxe.g:205:55: ( ELSE ! statement )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ELSE) ) {
                        int LA33_1 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // Haxe.g:205:56: ELSE ! statement
                            {
                            ELSE97=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2016); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2019);
                            statement98=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement98.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:206:19: FOR ^ LPAREN ! expr IN ! iterExpr RPAREN ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    FOR99=(Token)match(input,FOR,FOLLOW_FOR_in_statement2041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR99_tree = 
                    new ForNode(FOR99) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(FOR99_tree, root_0);
                    }

                    LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2047); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2050);
                    expr101=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr101.getTree());

                    IN102=(Token)match(input,IN,FOLLOW_IN_in_statement2052); if (state.failed) return retval;

                    pushFollow(FOLLOW_iterExpr_in_statement2055);
                    iterExpr103=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr103.getTree());

                    RPAREN104=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2057); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_statement2060);
                    statement105=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement105.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:207:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE106=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE106_tree = 
                    new WhileNode(WHILE106) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE106_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2086);
                    parExpression107=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression107.getTree());

                    pushFollow(FOLLOW_statement_in_statement2088);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement108.getTree());

                    }
                    break;
                case 5 :
                    // Haxe.g:208:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO109=(Token)match(input,DO,FOLLOW_DO_in_statement2108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO109_tree = 
                    new DoWhileNode(DO109) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO109_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2114);
                    statement110=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement110.getTree());

                    WHILE111=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2116); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2119);
                    parExpression112=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression112.getTree());

                    SEMI113=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2121); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // Haxe.g:209:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY114=(Token)match(input,TRY,FOLLOW_TRY_in_statement2142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY114_tree = 
                    new TryNode(TRY114) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY114_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2148);
                    block115=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block115.getTree());

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
                    	    pushFollow(FOLLOW_catchStmt_in_statement2150);
                    	    catchStmt116=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt116.getTree());

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


                    SWITCH117=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2171); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH117_tree = 
                    new SwitchNode(SWITCH117) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH117_tree, root_0);
                    }

                    LPAREN118=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2177); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2180);
                    expr119=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());

                    RPAREN120=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2182); if (state.failed) return retval;

                    LBRACE121=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2185); if (state.failed) return retval;

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
                    	    pushFollow(FOLLOW_caseStmt_in_statement2188);
                    	    caseStmt122=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt122.getTree());

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


                    RBRACE123=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2191); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // Haxe.g:211:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN124=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2212); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN124_tree = 
                    new ReturnNode(RETURN124) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN124_tree, root_0);
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
                            pushFollow(FOLLOW_expr_in_statement2218);
                            expr125=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr125.getTree());

                            }
                            break;

                    }


                    SEMI126=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2221); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:212:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW127=(Token)match(input,THROW,FOLLOW_THROW_in_statement2242); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW127_tree = 
                    (Object)adaptor.create(THROW127)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW127_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2245);
                    expr128=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                    SEMI129=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2247); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:213:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set130=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set130)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI131=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2276); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:214:19: expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_statement2297);
                    expr132=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr132.getTree());

                    SEMI133=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2299); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:215:7: IDENTIFIER COLON statement
                    {
                    IDENTIFIER134=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER134);


                    COLON135=(Token)match(input,COLON,FOLLOW_COLON_in_statement2310); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON135);


                    pushFollow(FOLLOW_statement_in_statement2312);
                    statement136=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement136.getTree());

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

        Token LPAREN137=null;
        Token RPAREN139=null;
        HaxeParser.expr_return expr138 =null;


        Object LPAREN137_tree=null;
        Object RPAREN139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:218:17: ( LPAREN ! expr RPAREN !)
            // Haxe.g:218:19: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2358); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2361);
            expr138=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr138.getTree());

            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2363); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token LBRACE140=null;
        Token RBRACE142=null;
        HaxeParser.blockStmt_return blockStmt141 =null;


        Object LBRACE140_tree=null;
        Object RBRACE142_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:221:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) )
            // Haxe.g:221:19: LBRACE ( blockStmt )* RBRACE
            {
            LBRACE140=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2399); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE140);


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
            	    pushFollow(FOLLOW_blockStmt_in_block2402);
            	    blockStmt141=blockStmt();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt141.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            RBRACE142=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE142);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE140, RBRACE142)
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

        HaxeParser.varDecl_return varDecl143 =null;

        HaxeParser.classDecl_return classDecl144 =null;

        HaxeParser.statement_return statement145 =null;



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


                    pushFollow(FOLLOW_varDecl_in_blockStmt2450);
                    varDecl143=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl143.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:225:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2461);
                    classDecl144=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl144.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:226:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2472);
                    statement145=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement145.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token CASE146=null;
        Token COLON148=null;
        Token DEFAULT150=null;
        Token COLON151=null;
        HaxeParser.exprList_return exprList147 =null;

        HaxeParser.statement_return statement149 =null;

        HaxeParser.statement_return statement152 =null;


        Object CASE146_tree=null;
        Object COLON148_tree=null;
        Object DEFAULT150_tree=null;
        Object COLON151_tree=null;

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


                    CASE146=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE146_tree = 
                    (Object)adaptor.create(CASE146)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE146_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2499);
                    exprList147=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList147.getTree());

                    COLON148=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2501); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2504);
                    statement149=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement149.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:230:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT150=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT150_tree = 
                    (Object)adaptor.create(DEFAULT150)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT150_tree, root_0);
                    }

                    COLON151=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2527); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2530);
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

        Token CATCH153=null;
        Token LPAREN154=null;
        Token RPAREN156=null;
        HaxeParser.param_return param155 =null;

        HaxeParser.block_return block157 =null;


        Object CATCH153_tree=null;
        Object LPAREN154_tree=null;
        Object RPAREN156_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:233:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:233:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH153=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2565); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH153_tree = 
            new HaxeTree(CATCH153) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH153_tree, root_0);
            }

            LPAREN154=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2571); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2574);
            param155=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param155.getTree());

            RPAREN156=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2576); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2579);
            block157=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block157.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        Token COMMA159=null;
        HaxeParser.expr_return expr158 =null;

        HaxeParser.expr_return expr160 =null;


        Object COMMA159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:237:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:237:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2617);
            expr158=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr158.getTree());

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
            	    COMMA159=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2620); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2623);
            	    expr160=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr160.getTree());

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

        Token UNTYPED161=null;
        HaxeParser.assignExpr_return assignExpr162 =null;

        HaxeParser.assignExpr_return assignExpr163 =null;


        Object UNTYPED161_tree=null;

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


                    UNTYPED161=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED161_tree = 
                    (Object)adaptor.create(UNTYPED161)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED161_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2668);
                    assignExpr162=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr162.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:241:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2688);
                    assignExpr163=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        HaxeParser.ternaryExpr_return ternaryExpr164 =null;

        HaxeParser.assignOp_return assignOp165 =null;

        HaxeParser.ternaryExpr_return ternaryExpr166 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:244:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:244:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2718);
            ternaryExpr164=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr164.getTree());

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
                    pushFollow(FOLLOW_assignOp_in_assignExpr2721);
                    assignOp165=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp165.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2724);
                    ternaryExpr166=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr166.getTree());

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

        Token QUES168=null;
        Token COLON170=null;
        HaxeParser.logicOrExpr_return logicOrExpr167 =null;

        HaxeParser.expr_return expr169 =null;

        HaxeParser.ternaryExpr_return ternaryExpr171 =null;


        Object QUES168_tree=null;
        Object COLON170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:247:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:247:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2755);
            logicOrExpr167=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr167.getTree());

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
                    QUES168=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES168_tree = 
                    (Object)adaptor.create(QUES168)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES168_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2761);
                    expr169=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr169.getTree());

                    COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2763); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2766);
                    ternaryExpr171=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr171.getTree());

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

        Token BARBAR173=null;
        HaxeParser.logicAndExpr_return logicAndExpr172 =null;

        HaxeParser.logicAndExpr_return logicAndExpr174 =null;


        Object BARBAR173_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:250:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:250:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2797);
            logicAndExpr172=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr172.getTree());

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
            	    BARBAR173=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2800); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR173_tree = 
            	    new BinaryExpressionNode(BARBAR173) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR173_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2806);
            	    logicAndExpr174=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr174.getTree());

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

        Token AMPAMP176=null;
        HaxeParser.iterExpr_return iterExpr175 =null;

        HaxeParser.iterExpr_return iterExpr177 =null;


        Object AMPAMP176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:253:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:253:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr2840);
            iterExpr175=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr175.getTree());

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
            	    AMPAMP176=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2842); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP176_tree = 
            	    new BinaryExpressionNode(AMPAMP176) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP176_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr2848);
            	    iterExpr177=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr177.getTree());

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

        Token ELLIPSIS179=null;
        HaxeParser.cmpExpr_return cmpExpr178 =null;

        HaxeParser.cmpExpr_return cmpExpr180 =null;


        Object ELLIPSIS179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:256:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:256:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr2898);
            cmpExpr178=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr178.getTree());

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
                    ELLIPSIS179=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2901); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS179_tree = 
                    new BinaryExpressionNode(ELLIPSIS179) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS179_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr2907);
                    cmpExpr180=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr180.getTree());

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

        Token EQEQ182=null;
        Token BANGEQ183=null;
        Token GTEQ184=null;
        Token LTEQ185=null;
        Token GT186=null;
        Token LT187=null;
        HaxeParser.bitExpr_return bitExpr181 =null;

        HaxeParser.bitExpr_return bitExpr188 =null;


        Object EQEQ182_tree=null;
        Object BANGEQ183_tree=null;
        Object GTEQ184_tree=null;
        Object LTEQ185_tree=null;
        Object GT186_tree=null;
        Object LT187_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:259:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:259:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2946);
            bitExpr181=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr181.getTree());

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
            	            EQEQ182=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2973); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ182_tree = 
            	            new BinaryExpressionNode(EQEQ182) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ182_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:261:23: BANGEQ ^
            	            {
            	            BANGEQ183=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3002); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ183_tree = 
            	            new BinaryExpressionNode(BANGEQ183) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ183_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:262:23: GTEQ ^
            	            {
            	            GTEQ184=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3031); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ184_tree = 
            	            new BinaryExpressionNode(GTEQ184) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ184_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:263:23: LTEQ ^
            	            {
            	            LTEQ185=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3060); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ185_tree = 
            	            new BinaryExpressionNode(LTEQ185) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ185_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:264:23: GT ^
            	            {
            	            GT186=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3089); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT186_tree = 
            	            new BinaryExpressionNode(GT186) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT186_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:265:23: LT ^
            	            {
            	            LT187=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3118); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT187_tree = 
            	            new BinaryExpressionNode(LT187) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT187_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3125);
            	    bitExpr188=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr188.getTree());

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

        Token BAR190=null;
        Token AMP191=null;
        Token CARET192=null;
        HaxeParser.shiftExpr_return shiftExpr189 =null;

        HaxeParser.shiftExpr_return shiftExpr193 =null;


        Object BAR190_tree=null;
        Object AMP191_tree=null;
        Object CARET192_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:268:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:268:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3164);
            shiftExpr189=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr189.getTree());

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
            	            BAR190=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3191); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR190_tree = 
            	            new BinaryExpressionNode(BAR190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR190_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:270:23: AMP ^
            	            {
            	            AMP191=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3220); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP191_tree = 
            	            new BinaryExpressionNode(AMP191) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP191_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:271:23: CARET ^
            	            {
            	            CARET192=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3249); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET192_tree = 
            	            new BinaryExpressionNode(CARET192) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET192_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3256);
            	    shiftExpr193=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr193.getTree());

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

        Token LTLT195=null;
        Token GTGT196=null;
        Token GTGTGT197=null;
        HaxeParser.addExpr_return addExpr194 =null;

        HaxeParser.addExpr_return addExpr198 =null;


        Object LTLT195_tree=null;
        Object GTGT196_tree=null;
        Object GTGTGT197_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:274:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:274:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3289);
            addExpr194=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr194.getTree());

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
            	            LTLT195=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3316); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT195_tree = 
            	            new BinaryExpressionNode(LTLT195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT195_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:276:23: GTGT ^
            	            {
            	            GTGT196=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3345); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT196_tree = 
            	            new BinaryExpressionNode(GTGT196) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT196_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:277:23: GTGTGT ^
            	            {
            	            GTGTGT197=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3374); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT197_tree = 
            	            new BinaryExpressionNode(GTGTGT197) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT197_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3381);
            	    addExpr198=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr198.getTree());

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

        Token PLUS200=null;
        Token SUB201=null;
        HaxeParser.multExpr_return multExpr199 =null;

        HaxeParser.multExpr_return multExpr202 =null;


        Object PLUS200_tree=null;
        Object SUB201_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:280:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:280:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3416);
            multExpr199=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr199.getTree());

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
            	            PLUS200=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3443); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS200_tree = 
            	            new BinaryExpressionNode(PLUS200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS200_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:282:23: SUB ^
            	            {
            	            SUB201=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3472); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB201_tree = 
            	            new BinaryExpressionNode(SUB201) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB201_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3479);
            	    multExpr202=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr202.getTree());

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

        Token STAR204=null;
        Token SLASH205=null;
        Token PERCENT206=null;
        HaxeParser.unarExpr_return unarExpr203 =null;

        HaxeParser.unarExpr_return unarExpr207 =null;


        Object STAR204_tree=null;
        Object SLASH205_tree=null;
        Object PERCENT206_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:285:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:285:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3518);
            unarExpr203=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr203.getTree());

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
            	            STAR204=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3545); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR204_tree = 
            	            new BinaryExpressionNode(STAR204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR204_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:287:23: SLASH ^
            	            {
            	            SLASH205=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3574); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH205_tree = 
            	            new BinaryExpressionNode(SLASH205) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH205_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:288:23: PERCENT ^
            	            {
            	            PERCENT206=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3603); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT206_tree = 
            	            new BinaryExpressionNode(PERCENT206) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT206_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3610);
            	    unarExpr207=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr207.getTree());

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

        Token SUB208=null;
        Token SUBSUB209=null;
        Token PLUSPLUS210=null;
        Token BANG211=null;
        Token TILDE212=null;
        Token PLUSPLUS215=null;
        Token SUBSUB216=null;
        HaxeParser.prefixExpr_return prefixExpr213 =null;

        HaxeParser.prefixExpr_return prefixExpr214 =null;


        Object SUB208_tree=null;
        Object SUBSUB209_tree=null;
        Object PLUSPLUS210_tree=null;
        Object BANG211_tree=null;
        Object TILDE212_tree=null;
        Object PLUSPLUS215_tree=null;
        Object SUBSUB216_tree=null;

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
                            SUB208=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3658); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB208_tree = 
                            new UnarExpressionNode(SUB208) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB208_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:293:13: SUBSUB ^
                            {
                            SUBSUB209=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3677); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB209_tree = 
                            new UnarExpressionNode(SUBSUB209) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB209_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:294:13: PLUSPLUS ^
                            {
                            PLUSPLUS210=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3696); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS210_tree = 
                            new UnarExpressionNode(PLUSPLUS210) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS210_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:295:13: BANG ^
                            {
                            BANG211=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3715); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG211_tree = 
                            new UnarExpressionNode(BANG211) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG211_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:296:13: TILDE ^
                            {
                            TILDE212=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3734); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE212_tree = 
                            new UnarExpressionNode(TILDE212) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE212_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3741);
                    prefixExpr213=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr213.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:297:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3761);
                    prefixExpr214=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr214.getTree());

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
                            PLUSPLUS215=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3764); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS215_tree = 
                            new UnarExpressionNode(PLUSPLUS215) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS215_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:297:61: SUBSUB ^
                            {
                            SUBSUB216=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3770); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB216_tree = 
                            new UnarExpressionNode(SUBSUB216) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB216_tree, root_0);
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

        Token NEW217=null;
        Token LPAREN219=null;
        Token RPAREN221=null;
        Token CAST222=null;
        Token LPAREN223=null;
        Token COMMA225=null;
        Token RPAREN227=null;
        HaxeParser.type_return type218 =null;

        HaxeParser.exprList_return exprList220 =null;

        HaxeParser.expr_return expr224 =null;

        HaxeParser.funcType_return funcType226 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice228 =null;


        Object NEW217_tree=null;
        Object LPAREN219_tree=null;
        Object RPAREN221_tree=null;
        Object CAST222_tree=null;
        Object LPAREN223_tree=null;
        Object COMMA225_tree=null;
        Object RPAREN227_tree=null;

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


                    NEW217=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3812); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW217_tree = 
                    (Object)adaptor.create(NEW217)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW217_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3815);
                    type218=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type218.getTree());

                    LPAREN219=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3817); if (state.failed) return retval;

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
                            pushFollow(FOLLOW_exprList_in_prefixExpr3820);
                            exprList220=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList220.getTree());

                            }
                            break;

                    }


                    RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3823); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:301:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST222=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3844); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST222_tree = 
                    (Object)adaptor.create(CAST222)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST222_tree, root_0);
                    }

                    LPAREN223=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3847); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3850);
                    expr224=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr224.getTree());

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
                            COMMA225=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3853); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3856);
                            funcType226=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType226.getTree());

                            }
                            break;

                    }


                    RPAREN227=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3860); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:302:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3881);
                    methodCallOrSlice228=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice228.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:305:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN230=null;
        Token RPAREN232=null;
        Token LBRACKET235=null;
        Token RBRACKET237=null;
        HaxeParser.value_return value229 =null;

        HaxeParser.exprList_return exprList231 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice233 =null;

        HaxeParser.value_return value234 =null;

        HaxeParser.expr_return expr236 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice238 =null;

        HaxeParser.value_return value239 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice240 =null;

        HaxeParser.value_return value241 =null;


        Object LPAREN230_tree=null;
        Object RPAREN232_tree=null;
        Object LBRACKET235_tree=null;
        Object RBRACKET237_tree=null;
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

            // Haxe.g:306:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt67=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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
            case IDENTIFIER:
                {
                int LA67_11 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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
            case THIS:
                {
                int LA67_12 = input.LA(2);

                if ( (synpred117_Haxe()) ) {
                    alt67=1;
                }
                else if ( (synpred119_Haxe()) ) {
                    alt67=2;
                }
                else if ( (synpred120_Haxe()) ) {
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // Haxe.g:306:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3939);
                    value229=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value229.getTree());

                    LPAREN230=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN230);


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
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice3943);
                            exprList231=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList231.getTree());

                            }
                            break;

                    }


                    RPAREN232=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3946); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN232);


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
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3948);
                            pureCallOrSlice233=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice233.getTree());

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
                    // 307:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:307:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN230, RPAREN232)
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
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3999);
                    value234=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value234.getTree());

                    LBRACKET235=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4001); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET235);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4003);
                    expr236=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr236.getTree());

                    RBRACKET237=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4005); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET237);


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
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4007);
                            pureCallOrSlice238=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice238.getTree());

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
                    // 309:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:309:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET235, RBRACKET237)
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
                    // Haxe.g:310:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4058);
                    value239=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value239.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4061);
                    pureCallOrSlice240=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice240.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:311:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4081);
                    value241=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value241.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:314:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET242=null;
        Token RBRACKET244=null;
        Token DOT246=null;
        HaxeParser.expr_return expr243 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice245 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice247 =null;


        Object LBRACKET242_tree=null;
        Object RBRACKET244_tree=null;
        Object DOT246_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:314:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
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
                    // Haxe.g:314:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET242=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET242);


                    // Haxe.g:314:28: ( expr )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==BANG||LA68_0==CAST||LA68_0==CHARLITERAL||LA68_0==FALSE||LA68_0==FLOATNUM||LA68_0==FUNCTION||LA68_0==IDENTIFIER||LA68_0==INTLITERAL||LA68_0==LBRACE||LA68_0==LONGLITERAL||(LA68_0 >= NEW && LA68_0 <= NULL)||LA68_0==PLUSPLUS||(LA68_0 >= STRINGLITERAL && LA68_0 <= SUB)||LA68_0==SUBSUB||LA68_0==THIS||LA68_0==TILDE||LA68_0==TRUE||LA68_0==UNTYPED) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:314:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4108);
                            expr243=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr243.getTree());

                            }
                            break;

                    }


                    RBRACKET244=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4111); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET244);


                    // Haxe.g:314:43: ( pureCallOrSlice )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DOT||LA69_0==LBRACKET) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Haxe.g:314:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4113);
                            pureCallOrSlice245=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice245.getTree());

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
                    // 314:60: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:314:63: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET242, RBRACKET244)
                        , root_1);

                        // Haxe.g:315:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:315:76: ( pureCallOrSlice )?
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
                    // Haxe.g:316:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT246=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT246_tree = 
                    (Object)adaptor.create(DOT246)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT246_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4170);
                    methodCallOrSlice247=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice247.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:319:1: value : ( objLit | funcLit | elementarySymbol | id ( typeParam )? );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.objLit_return objLit248 =null;

        HaxeParser.funcLit_return funcLit249 =null;

        HaxeParser.elementarySymbol_return elementarySymbol250 =null;

        HaxeParser.id_return id251 =null;

        HaxeParser.typeParam_return typeParam252 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:321:5: ( objLit | funcLit | elementarySymbol | id ( typeParam )? )
            int alt72=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                alt72=1;
                }
                break;
            case FUNCTION:
                {
                alt72=2;
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
                alt72=3;
                }
                break;
            case IDENTIFIER:
            case THIS:
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
                    // Haxe.g:321:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4206);
                    objLit248=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit248.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:322:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4214);
                    funcLit249=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit249.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:323:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4222);
                    elementarySymbol250=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol250.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:326:9: id ( typeParam )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4242);
                    id251=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id251.getTree());

                    // Haxe.g:326:12: ( typeParam )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==LT) ) {
                        int LA71_1 = input.LA(2);

                        if ( (synpred127_Haxe()) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:326:12: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_value4244);
                            typeParam252=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam252.getTree());

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
    // Haxe.g:330:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl253 =null;

        HaxeParser.interfaceDecl_return interfaceDecl254 =null;

        HaxeParser.enumDecl_return enumDecl255 =null;

        HaxeParser.typedefDecl_return typedefDecl256 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:330:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt73=4;
            switch ( input.LA(1) ) {
            case EXTERN:
            case PRIVATE:
                {
                switch ( input.LA(2) ) {
                case CLASS:
                    {
                    alt73=1;
                    }
                    break;
                case INTERFACE:
                    {
                    alt73=2;
                    }
                    break;
                case ENUM:
                    {
                    alt73=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;

                }

                }
                break;
            case CLASS:
                {
                alt73=1;
                }
                break;
            case INTERFACE:
                {
                alt73=2;
                }
                break;
            case ENUM:
                {
                alt73=3;
                }
                break;
            case TYPEDEF:
                {
                alt73=4;
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
                    // Haxe.g:330:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4264);
                    classDecl253=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl253.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:331:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4284);
                    interfaceDecl254=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl254.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:332:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4304);
                    enumDecl255=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl255.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:333:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4324);
                    typedefDecl256=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl256.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:336:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM258=null;
        Token IDENTIFIER259=null;
        HaxeParser.topLevelAccess_return topLevelAccess257 =null;

        HaxeParser.typeParam_return typeParam260 =null;

        HaxeParser.enumBody_return enumBody261 =null;


        Object ENUM258_tree=null;
        Object IDENTIFIER259_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:336:17: ( ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) )
            // Haxe.g:336:19: ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:336:19: ( topLevelAccess )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==EXTERN||LA74_0==PRIVATE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // Haxe.g:336:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4360);
                    topLevelAccess257=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess257.getTree());

                    }
                    break;

            }


            ENUM258=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4363); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM258);


            IDENTIFIER259=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER259);


            // Haxe.g:336:51: ( typeParam )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LT) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:336:51: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4367);
                    typeParam260=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam260.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4370);
            enumBody261=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody261.getTree());

            // AST REWRITE
            // elements: enumBody, IDENTIFIER, typeParam, topLevelAccess
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 336:71: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
            {
                // Haxe.g:336:74: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new EnumNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:336:97: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:336:113: ( typeParam )?
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
    // Haxe.g:339:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE262=null;
        Token RBRACE264=null;
        HaxeParser.enumValueDecl_return enumValueDecl263 =null;


        Object LBRACE262_tree=null;
        Object RBRACE264_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:339:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:339:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE262=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE262);


            // Haxe.g:339:26: ( enumValueDecl )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==IDENTIFIER) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Haxe.g:339:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4422);
            	    enumValueDecl263=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl263.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            RBRACE264=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4426); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE264);


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
            // 339:50: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
            {
                // Haxe.g:339:53: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE262, RBRACE264)
                , root_1);

                // Haxe.g:339:101: ( enumValueDecl )*
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
    // Haxe.g:342:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER265=null;
        Token LPAREN266=null;
        Token RPAREN268=null;
        Token SEMI269=null;
        Token IDENTIFIER270=null;
        Token SEMI271=null;
        HaxeParser.paramList_return paramList267 =null;


        Object IDENTIFIER265_tree=null;
        Object LPAREN266_tree=null;
        Object RPAREN268_tree=null;
        Object SEMI269_tree=null;
        Object IDENTIFIER270_tree=null;
        Object SEMI271_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:342:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==IDENTIFIER) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==LPAREN) ) {
                    alt78=1;
                }
                else if ( (LA78_1==SEMI) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // Haxe.g:342:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER265=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4466); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER265_tree = 
                    new VarDeclarationNode(IDENTIFIER265) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER265_tree, root_0);
                    }

                    LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4472); if (state.failed) return retval;

                    // Haxe.g:342:59: ( paramList )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==IDENTIFIER||LA77_0==QUES) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // Haxe.g:342:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4475);
                            paramList267=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList267.getTree());

                            }
                            break;

                    }


                    RPAREN268=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4478); if (state.failed) return retval;

                    SEMI269=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4481); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:343:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER270=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4504); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER270_tree = 
                    new VarDeclarationNode(IDENTIFIER270) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER270_tree);
                    }

                    SEMI271=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4509); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:347:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS273=null;
        Token IDENTIFIER274=null;
        HaxeParser.topLevelAccess_return topLevelAccess272 =null;

        HaxeParser.typeParam_return typeParam275 =null;

        HaxeParser.inheritList_return inheritList276 =null;

        HaxeParser.classBodyScope_return classBodyScope277 =null;


        Object CLASS273_tree=null;
        Object IDENTIFIER274_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:347:17: ( ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) )
            // Haxe.g:347:19: ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope
            {
            // Haxe.g:347:19: ( topLevelAccess )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==EXTERN||LA79_0==PRIVATE) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Haxe.g:347:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4558);
                    topLevelAccess272=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess272.getTree());

                    }
                    break;

            }


            CLASS273=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS273);


            IDENTIFIER274=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4563); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER274);


            // Haxe.g:347:52: ( typeParam )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==LT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:347:52: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4565);
                    typeParam275=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam275.getTree());

                    }
                    break;

            }


            // Haxe.g:347:63: ( inheritList )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==EXTENDS||LA81_0==IMPLEMENTS) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:347:63: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_classDecl4568);
                    inheritList276=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList276.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4571);
            classBodyScope277=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope277.getTree());

            // AST REWRITE
            // elements: typeParam, IDENTIFIER, inheritList, topLevelAccess, classBodyScope
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 348:21: -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
            {
                // Haxe.g:348:24: ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new ClassNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:348:48: ( topLevelAccess )?
                if ( stream_topLevelAccess.hasNext() ) {
                    adaptor.addChild(root_1, stream_topLevelAccess.nextTree());

                }
                stream_topLevelAccess.reset();

                // Haxe.g:348:64: ( typeParam )?
                if ( stream_typeParam.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeParam.nextTree());

                }
                stream_typeParam.reset();

                // Haxe.g:348:75: ( inheritList )?
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
    // Haxe.g:351:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE278=null;
        Token RBRACE280=null;
        HaxeParser.classMember_return classMember279 =null;


        Object LBRACE278_tree=null;
        Object RBRACE280_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:351:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:351:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE278=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4638); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE278);


            // Haxe.g:351:26: ( classMember )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==DYNAMIC||LA82_0==FUNCTION||LA82_0==INLINE||LA82_0==OVERRIDE||LA82_0==PRIVATE||LA82_0==PUBLIC||LA82_0==STATIC||LA82_0==VAR) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // Haxe.g:351:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4641);
            	    classMember279=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember279.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            RBRACE280=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE280);


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
            // 351:48: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
            {
                // Haxe.g:351:51: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new BlockScopeNode(BLOCK_SCOPE, LBRACE278, RBRACE280)
                , root_1);

                // Haxe.g:351:99: ( classMember )*
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
    // Haxe.g:354:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass281 =null;

        HaxeParser.funcDecl_return funcDecl282 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:354:17: ( varDeclClass | funcDecl )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // Haxe.g:354:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4691);
                    varDeclClass281=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass281.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:355:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4711);
                    funcDecl282=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl282.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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


    public static class varDeclClass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclClass"
    // Haxe.g:359:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR284=null;
        Token IDENTIFIER285=null;
        Token SEMI289=null;
        HaxeParser.declAttrList_return declAttrList283 =null;

        HaxeParser.propDecl_return propDecl286 =null;

        HaxeParser.typeTag_return typeTag287 =null;

        HaxeParser.varInit_return varInit288 =null;


        Object VAR284_tree=null;
        Object IDENTIFIER285_tree=null;
        Object SEMI289_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:359:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:359:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:359:19: ( declAttrList )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==DYNAMIC||LA84_0==INLINE||LA84_0==OVERRIDE||LA84_0==PRIVATE||LA84_0==PUBLIC||LA84_0==STATIC) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Haxe.g:359:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4753);
                    declAttrList283=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList283.getTree());

                    }
                    break;

            }


            VAR284=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR284);


            IDENTIFIER285=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4758); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER285);


            // Haxe.g:359:48: ( propDecl )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LPAREN) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:359:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4760);
                    propDecl286=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl286.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass4763);
            typeTag287=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag287.getTree());

            // Haxe.g:359:66: ( varInit )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==EQ) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:359:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4765);
                    varInit288=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit288.getTree());

                    }
                    break;

            }


            SEMI289=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI289);


            // AST REWRITE
            // elements: propDecl, IDENTIFIER, varInit, typeTag, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 359:80: -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
            {
                // Haxe.g:359:83: ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:359:116: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();

                // Haxe.g:359:130: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                adaptor.addChild(root_1, stream_typeTag.nextTree());

                // Haxe.g:359:148: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 57, varDeclClass_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclClass"


    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDecl"
    // Haxe.g:362:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR290=null;
        Token COMMA292=null;
        Token SEMI294=null;
        HaxeParser.varDeclPartList_return varDeclPartList291 =null;

        HaxeParser.varDeclPartList_return varDeclPartList293 =null;


        Object VAR290_tree=null;
        Object COMMA292_tree=null;
        Object SEMI294_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:362:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:362:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR290=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4837); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl4840);
            varDeclPartList291=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList291.getTree());

            // Haxe.g:362:40: ( COMMA ! varDeclPartList )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==COMMA) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // Haxe.g:362:41: COMMA ! varDeclPartList
            	    {
            	    COMMA292=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl4843); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl4846);
            	    varDeclPartList293=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList293.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            SEMI294=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4850); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, varDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDecl"


    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varDeclPartList"
    // Haxe.g:365:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER295=null;
        HaxeParser.propDecl_return propDecl296 =null;

        HaxeParser.typeTag_return typeTag297 =null;

        HaxeParser.varInit_return varInit298 =null;


        Object IDENTIFIER295_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:365:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:365:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER295=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList4876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER295);


            // Haxe.g:365:30: ( propDecl )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==LPAREN) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // Haxe.g:365:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList4878);
                    propDecl296=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl296.getTree());

                    }
                    break;

            }


            // Haxe.g:365:40: ( typeTag )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==COLON) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:365:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList4881);
                    typeTag297=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag297.getTree());

                    }
                    break;

            }


            // Haxe.g:365:49: ( varInit )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==EQ) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:365:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList4884);
                    varInit298=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit298.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: varInit, typeTag, IDENTIFIER, propDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 365:58: -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
            {
                // Haxe.g:365:61: ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                new VarDeclarationNode(stream_IDENTIFIER.nextToken())
                , root_1);

                // Haxe.g:365:94: ( propDecl )?
                if ( stream_propDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_propDecl.nextTree());

                }
                stream_propDecl.reset();

                // Haxe.g:365:104: ( typeTag )?
                if ( stream_typeTag.hasNext() ) {
                    adaptor.addChild(root_1, stream_typeTag.nextTree());

                }
                stream_typeTag.reset();

                // Haxe.g:365:113: ( varInit )?
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
            if ( state.backtracking>0 ) { memoize(input, 59, varDeclPartList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varDeclPartList"


    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propDecl"
    // Haxe.g:368:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN299=null;
        Token COMMA300=null;
        Token RPAREN301=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN299_tree=null;
        Object COMMA300_tree=null;
        Object RPAREN301_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:368:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:368:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN299=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl4935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN299);


            pushFollow(FOLLOW_propAccessor_in_propDecl4939);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA300=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl4941); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA300);


            pushFollow(FOLLOW_propAccessor_in_propDecl4945);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN301=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl4947); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN301);


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
            // 368:71: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
            {
                // Haxe.g:368:74: ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2)
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
            if ( state.backtracking>0 ) { memoize(input, 60, propDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propDecl"


    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "propAccessor"
    // Haxe.g:371:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set302=null;

        Object set302_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:371:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set302=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set302)
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
            if ( state.backtracking>0 ) { memoize(input, 61, propAccessor_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "propAccessor"


    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "varInit"
    // Haxe.g:378:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ303=null;
        HaxeParser.expr_return expr304 =null;


        Object EQ303_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:378:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:378:19: EQ expr
            {
            EQ303=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ303);


            pushFollow(FOLLOW_expr_in_varInit5108);
            expr304=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr304.getTree());

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
            // 378:27: -> ^( VAR_INIT[\"VAR_INIT\"] expr )
            {
                // Haxe.g:378:30: ^( VAR_INIT[\"VAR_INIT\"] expr )
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
            if ( state.backtracking>0 ) { memoize(input, 62, varInit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "varInit"


    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDecl"
    // Haxe.g:381:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION306=null;
        Token NEW307=null;
        Token FUNCTION310=null;
        Token IDENTIFIER311=null;
        HaxeParser.declAttrList_return declAttrList305 =null;

        HaxeParser.funcDeclPart_return funcDeclPart308 =null;

        HaxeParser.declAttrList_return declAttrList309 =null;

        HaxeParser.typeParam_return typeParam312 =null;

        HaxeParser.funcDeclPart_return funcDeclPart313 =null;


        Object FUNCTION306_tree=null;
        Object NEW307_tree=null;
        Object FUNCTION310_tree=null;
        Object IDENTIFIER311_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:381:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // Haxe.g:381:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:381:19: ( declAttrList )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==DYNAMIC||LA91_0==INLINE||LA91_0==OVERRIDE||LA91_0==PRIVATE||LA91_0==PUBLIC||LA91_0==STATIC) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // Haxe.g:381:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5152);
                            declAttrList305=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());

                            }
                            break;

                    }


                    FUNCTION306=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION306);


                    NEW307=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW307);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5159);
                    funcDeclPart308=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart308.getTree());

                    // AST REWRITE
                    // elements: FUNCTION, funcDeclPart, NEW, declAttrList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 382:21: -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                    {
                        // Haxe.g:382:24: ^( FUNCTION NEW ( declAttrList )? funcDeclPart )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NEW.nextNode()
                        );

                        // Haxe.g:382:53: ( declAttrList )?
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
                    // Haxe.g:383:19: ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart
                    {
                    // Haxe.g:383:19: ( declAttrList )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DYNAMIC||LA92_0==INLINE||LA92_0==OVERRIDE||LA92_0==PRIVATE||LA92_0==PUBLIC||LA92_0==STATIC) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Haxe.g:383:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5217);
                            declAttrList309=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList309.getTree());

                            }
                            break;

                    }


                    FUNCTION310=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION310);


                    IDENTIFIER311=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER311);


                    // Haxe.g:383:53: ( typeParam )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==LT) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:383:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5224);
                            typeParam312=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam312.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5227);
                    funcDeclPart313=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart313.getTree());

                    // AST REWRITE
                    // elements: declAttrList, typeParam, IDENTIFIER, funcDeclPart, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 384:21: -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                    {
                        // Haxe.g:384:24: ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new FunctionNode(stream_FUNCTION.nextToken())
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_IDENTIFIER.nextNode()
                        );

                        // Haxe.g:384:60: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        adaptor.addChild(root_1, stream_funcDeclPart.nextTree());

                        // Haxe.g:384:87: ( typeParam )?
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
            if ( state.backtracking>0 ) { memoize(input, 63, funcDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDecl"


    public static class funcDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcDeclPart"
    // Haxe.g:387:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN314=null;
        Token RPAREN316=null;
        Token SEMI319=null;
        HaxeParser.paramList_return paramList315 =null;

        HaxeParser.typeTag_return typeTag317 =null;

        HaxeParser.block_return block318 =null;


        Object LPAREN314_tree=null;
        Object RPAREN316_tree=null;
        Object SEMI319_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:387:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !) )
            // Haxe.g:387:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? ( block | SEMI !)
            {
            root_0 = (Object)adaptor.nil();


            LPAREN314=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5311); if (state.failed) return retval;

            // Haxe.g:387:27: ( paramList )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==IDENTIFIER||LA95_0==QUES) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Haxe.g:387:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5314);
                    paramList315=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList315.getTree());

                    }
                    break;

            }


            RPAREN316=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5317); if (state.failed) return retval;

            // Haxe.g:387:46: ( typeTag )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==COLON) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:387:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5320);
                    typeTag317=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag317.getTree());

                    }
                    break;

            }


            // Haxe.g:387:55: ( block | SEMI !)
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==LBRACE) ) {
                alt97=1;
            }
            else if ( (LA97_0==SEMI) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;

            }
            switch (alt97) {
                case 1 :
                    // Haxe.g:387:56: block
                    {
                    pushFollow(FOLLOW_block_in_funcDeclPart5324);
                    block318=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block318.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:387:64: SEMI !
                    {
                    SEMI319=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcDeclPart5328); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 64, funcDeclPart_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funcDeclPart"


    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcProtoDecl"
    // Haxe.g:390:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION321=null;
        Token NEW322=null;
        Token LPAREN323=null;
        Token RPAREN325=null;
        Token SEMI327=null;
        Token FUNCTION329=null;
        Token IDENTIFIER330=null;
        Token LPAREN332=null;
        Token RPAREN334=null;
        Token SEMI336=null;
        Token FUNCTION337=null;
        Token NEW338=null;
        Token LPAREN339=null;
        Token RPAREN341=null;
        Token SEMI343=null;
        Token FUNCTION344=null;
        Token IDENTIFIER345=null;
        Token LPAREN347=null;
        Token RPAREN349=null;
        Token SEMI351=null;
        HaxeParser.declAttrList_return declAttrList320 =null;

        HaxeParser.paramList_return paramList324 =null;

        HaxeParser.typeTag_return typeTag326 =null;

        HaxeParser.declAttrList_return declAttrList328 =null;

        HaxeParser.typeParam_return typeParam331 =null;

        HaxeParser.paramList_return paramList333 =null;

        HaxeParser.typeTag_return typeTag335 =null;

        HaxeParser.paramList_return paramList340 =null;

        HaxeParser.typeTag_return typeTag342 =null;

        HaxeParser.typeParam_return typeParam346 =null;

        HaxeParser.paramList_return paramList348 =null;

        HaxeParser.typeTag_return typeTag350 =null;


        Object FUNCTION321_tree=null;
        Object NEW322_tree=null;
        Object LPAREN323_tree=null;
        Object RPAREN325_tree=null;
        Object SEMI327_tree=null;
        Object FUNCTION329_tree=null;
        Object IDENTIFIER330_tree=null;
        Object LPAREN332_tree=null;
        Object RPAREN334_tree=null;
        Object SEMI336_tree=null;
        Object FUNCTION337_tree=null;
        Object NEW338_tree=null;
        Object LPAREN339_tree=null;
        Object RPAREN341_tree=null;
        Object SEMI343_tree=null;
        Object FUNCTION344_tree=null;
        Object IDENTIFIER345_tree=null;
        Object LPAREN347_tree=null;
        Object RPAREN349_tree=null;
        Object SEMI351_tree=null;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }

            // Haxe.g:391:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt108=4;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // Haxe.g:391:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5365);
                    declAttrList320=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList320.getTree());

                    FUNCTION321=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION321);


                    NEW322=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW322);


                    LPAREN323=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN323);


                    // Haxe.g:391:42: ( paramList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==IDENTIFIER||LA98_0==QUES) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:391:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5373);
                            paramList324=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList324.getTree());

                            }
                            break;

                    }


                    RPAREN325=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN325);


                    // Haxe.g:391:60: ( typeTag )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==COLON) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:391:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5378);
                            typeTag326=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag326.getTree());

                            }
                            break;

                    }


                    SEMI327=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5381); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI327);


                    // AST REWRITE
                    // elements: paramList, declAttrList, typeTag, FUNCTION, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 392:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                    {
                        // Haxe.g:392:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:392:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:392:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:392:43: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:392:52: ( declAttrList )?
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
                    // Haxe.g:393:9: declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5422);
                    declAttrList328=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList328.getTree());

                    FUNCTION329=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5424); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION329);


                    IDENTIFIER330=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER330);


                    // Haxe.g:393:42: ( typeParam )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==LT) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:393:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5428);
                            typeParam331=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam331.getTree());

                            }
                            break;

                    }


                    LPAREN332=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5431); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN332);


                    // Haxe.g:393:60: ( paramList )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:393:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5433);
                            paramList333=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList333.getTree());

                            }
                            break;

                    }


                    RPAREN334=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5436); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN334);


                    // Haxe.g:393:78: ( typeTag )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==COLON) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:393:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5438);
                            typeTag335=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag335.getTree());

                            }
                            break;

                    }


                    SEMI336=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI336);


                    // AST REWRITE
                    // elements: typeTag, paramList, declAttrList, IDENTIFIER, typeParam, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                    {
                        // Haxe.g:394:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:394:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:394:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:394:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:394:59: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();

                        // Haxe.g:394:73: ( typeParam )?
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
                    // Haxe.g:395:9: FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION337=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5485); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION337);


                    NEW338=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW338);


                    LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5489); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN339);


                    // Haxe.g:395:29: ( paramList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER||LA103_0==QUES) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:395:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5491);
                            paramList340=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList340.getTree());

                            }
                            break;

                    }


                    RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN341);


                    // Haxe.g:395:47: ( typeTag )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==COLON) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:395:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5496);
                            typeTag342=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag342.getTree());

                            }
                            break;

                    }


                    SEMI343=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI343);


                    // AST REWRITE
                    // elements: typeTag, NEW, paramList, FUNCTION
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:13: -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                    {
                        // Haxe.g:396:16: ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:396:27: ( NEW )?
                        if ( stream_NEW.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_NEW.nextNode()
                            );

                        }
                        stream_NEW.reset();

                        // Haxe.g:396:32: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:396:43: ( typeTag )?
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
                    // Haxe.g:397:9: FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    FUNCTION344=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION344);


                    IDENTIFIER345=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER345);


                    // Haxe.g:397:29: ( typeParam )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==LT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:397:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5541);
                            typeParam346=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam346.getTree());

                            }
                            break;

                    }


                    LPAREN347=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN347);


                    // Haxe.g:397:47: ( paramList )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==IDENTIFIER||LA106_0==QUES) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:397:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5546);
                            paramList348=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList348.getTree());

                            }
                            break;

                    }


                    RPAREN349=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN349);


                    // Haxe.g:397:65: ( typeTag )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==COLON) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:397:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5551);
                            typeTag350=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag350.getTree());

                            }
                            break;

                    }


                    SEMI351=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI351);


                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, FUNCTION, typeParam, typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 398:13: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                    {
                        // Haxe.g:398:16: ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FUNCTION.nextNode()
                        , root_1);

                        // Haxe.g:398:27: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:398:39: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();

                        // Haxe.g:398:50: ( typeTag )?
                        if ( stream_typeTag.hasNext() ) {
                            adaptor.addChild(root_1, stream_typeTag.nextTree());

                        }
                        stream_typeTag.reset();

                        // Haxe.g:398:59: ( typeParam )?
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
    // Haxe.g:401:1: interfaceDecl : ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE353=null;
        Token LBRACE356=null;
        Token RBRACE358=null;
        HaxeParser.topLevelAccess_return topLevelAccess352 =null;

        HaxeParser.type_return type354 =null;

        HaxeParser.inheritList_return inheritList355 =null;

        HaxeParser.interfaceBody_return interfaceBody357 =null;


        Object INTERFACE353_tree=null;
        Object LBRACE356_tree=null;
        Object RBRACE358_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:402:5: ( ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:402:9: ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:402:9: ( topLevelAccess )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==EXTERN||LA109_0==PRIVATE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // Haxe.g:402:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5613);
                    topLevelAccess352=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess352.getTree());

                    }
                    break;

            }


            INTERFACE353=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5616); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE353_tree = 
            (Object)adaptor.create(INTERFACE353)
            ;
            adaptor.addChild(root_0, INTERFACE353_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5618);
            type354=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type354.getTree());

            // Haxe.g:402:40: ( inheritList )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==EXTENDS||LA110_0==IMPLEMENTS) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Haxe.g:402:40: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_interfaceDecl5620);
                    inheritList355=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritList355.getTree());

                    }
                    break;

            }


            LBRACE356=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5623); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5626);
            interfaceBody357=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody357.getTree());

            RBRACE358=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5628); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:405:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl359 =null;

        HaxeParser.interfaceBody_return interfaceBody360 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl361 =null;

        HaxeParser.interfaceBody_return interfaceBody362 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:406:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
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
                    // Haxe.g:406:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5652);
                    varDecl359=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl359.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5654);
                    interfaceBody360=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody360.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:407:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5664);
                    funcProtoDecl361=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl361.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5666);
                    interfaceBody362=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody362.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:410:5: 
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
    // Haxe.g:412:1: inheritList : inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA364=null;
        HaxeParser.inherit_return inherit363 =null;

        HaxeParser.inherit_return inherit365 =null;


        Object COMMA364_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_inherit=new RewriteRuleSubtreeStream(adaptor,"rule inherit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:412:17: ( inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) )
            // Haxe.g:412:19: inherit ( COMMA inherit )*
            {
            pushFollow(FOLLOW_inherit_in_inheritList5690);
            inherit363=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inherit.add(inherit363.getTree());

            // Haxe.g:412:27: ( COMMA inherit )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Haxe.g:412:28: COMMA inherit
            	    {
            	    COMMA364=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5693); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA364);


            	    pushFollow(FOLLOW_inherit_in_inheritList5695);
            	    inherit365=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inherit.add(inherit365.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
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
            // 412:44: -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
            {
                // Haxe.g:412:47: ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ )
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
            if ( state.backtracking>0 ) { memoize(input, 68, inheritList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inheritList"


    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inherit"
    // Haxe.g:415:1: inherit : ( EXTENDS ^ type | IMPLEMENTS ^ type );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS366=null;
        Token IMPLEMENTS368=null;
        HaxeParser.type_return type367 =null;

        HaxeParser.type_return type369 =null;


        Object EXTENDS366_tree=null;
        Object IMPLEMENTS368_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:415:17: ( EXTENDS ^ type | IMPLEMENTS ^ type )
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
                    // Haxe.g:415:19: EXTENDS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS366=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS366_tree = 
                    (Object)adaptor.create(EXTENDS366)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EXTENDS366_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5750);
                    type367=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type367.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:416:19: IMPLEMENTS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS368=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5770); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS368_tree = 
                    (Object)adaptor.create(IMPLEMENTS368)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLEMENTS368_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5773);
                    type369=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type369.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, inherit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "inherit"


    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedefDecl"
    // Haxe.g:419:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF370=null;
        Token IDENTIFIER371=null;
        Token EQ372=null;
        HaxeParser.funcType_return funcType373 =null;


        Object TYPEDEF370_tree=null;
        Object IDENTIFIER371_tree=null;
        Object EQ372_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:419:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:419:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF370=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5806); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF370_tree = 
            (Object)adaptor.create(TYPEDEF370)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF370_tree, root_0);
            }

            IDENTIFIER371=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5809); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER371_tree = 
            (Object)adaptor.create(IDENTIFIER371)
            ;
            adaptor.addChild(root_0, IDENTIFIER371_tree);
            }

            EQ372=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5811); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl5814);
            funcType373=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType373.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, typedefDecl_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typedefDecl"


    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typeExtend"
    // Haxe.g:422:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT374=null;
        HaxeParser.funcType_return funcType375 =null;


        Object GT374_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:422:17: ( GT ^ funcType )
            // Haxe.g:422:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT374=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5848); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT374_tree = 
            (Object)adaptor.create(GT374)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT374_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5851);
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
            if ( state.backtracking>0 ) { memoize(input, 71, typeExtend_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "typeExtend"


    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLit"
    // Haxe.g:425:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE376=null;
        Token RBRACE378=null;
        HaxeParser.objLitElemList_return objLitElemList377 =null;


        Object LBRACE376_tree=null;
        Object RBRACE378_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:425:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:425:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE376=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5885); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit5888);
            objLitElemList377=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList377.getTree());

            RBRACE378=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5890); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, objLit_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLit"


    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anonTypeField"
    // Haxe.g:428:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER379=null;
        Token COLON380=null;
        HaxeParser.funcType_return funcType381 =null;


        Object IDENTIFIER379_tree=null;
        Object COLON380_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:428:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:428:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER379=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5918); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER379_tree = 
            (Object)adaptor.create(IDENTIFIER379)
            ;
            adaptor.addChild(root_0, IDENTIFIER379_tree);
            }

            COLON380=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5920); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField5923);
            funcType381=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType381.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, anonTypeField_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "anonTypeField"


    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElemList"
    // Haxe.g:431:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA383=null;
        HaxeParser.objLitElem_return objLitElem382 =null;

        HaxeParser.objLitElem_return objLitElem384 =null;


        Object COMMA383_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:431:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:431:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList5953);
            objLitElem382=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem382.getTree());

            // Haxe.g:431:30: ( COMMA ! objLitElem )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Haxe.g:431:31: COMMA ! objLitElem
            	    {
            	    COMMA383=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5956); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5959);
            	    objLitElem384=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem384.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
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
            if ( state.backtracking>0 ) { memoize(input, 74, objLitElemList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElemList"


    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "objLitElem"
    // Haxe.g:434:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER385=null;
        Token COLON386=null;
        HaxeParser.expr_return expr387 =null;


        Object IDENTIFIER385_tree=null;
        Object COLON386_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:434:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:434:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER385=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem5995); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER385_tree = 
            (Object)adaptor.create(IDENTIFIER385)
            ;
            adaptor.addChild(root_0, IDENTIFIER385_tree);
            }

            COLON386=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem5997); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6000);
            expr387=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr387.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, objLitElem_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "objLitElem"


    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elementarySymbol"
    // Haxe.g:438:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL388=null;
        Token NULL389=null;
        Token INTLITERAL390=null;
        Token STRINGLITERAL391=null;
        Token CHARLITERAL392=null;
        Token FLOATNUM393=null;
        Token TRUE394=null;
        Token FALSE395=null;

        Object LONGLITERAL388_tree=null;
        Object NULL389_tree=null;
        Object INTLITERAL390_tree=null;
        Object STRINGLITERAL391_tree=null;
        Object CHARLITERAL392_tree=null;
        Object FLOATNUM393_tree=null;
        Object TRUE394_tree=null;
        Object FALSE395_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }

            // Haxe.g:439:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt115=8;
            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt115=1;
                }
                break;
            case NULL:
                {
                alt115=2;
                }
                break;
            case INTLITERAL:
                {
                alt115=3;
                }
                break;
            case STRINGLITERAL:
                {
                alt115=4;
                }
                break;
            case CHARLITERAL:
                {
                alt115=5;
                }
                break;
            case FLOATNUM:
                {
                alt115=6;
                }
                break;
            case TRUE:
                {
                alt115=7;
                }
                break;
            case FALSE:
                {
                alt115=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;

            }

            switch (alt115) {
                case 1 :
                    // Haxe.g:439:7: LONGLITERAL
                    {
                    LONGLITERAL388=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL388);


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
                    // 439:21: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(LONGLITERAL, LONGLITERAL388, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:440:7: NULL
                    {
                    NULL389=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6052); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL389);


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
                    // 440:21: -> NULL[$NULL,\"Unknown<0>\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(NULL, NULL389, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:441:7: INTLITERAL
                    {
                    INTLITERAL390=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL390);


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
                    // 441:21: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(INTLITERAL, INTLITERAL390, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:442:7: STRINGLITERAL
                    {
                    STRINGLITERAL391=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL391);


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
                    // 442:21: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL391, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:443:7: CHARLITERAL
                    {
                    CHARLITERAL392=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL392);


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
                    // 443:21: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(CHARLITERAL, CHARLITERAL392, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:444:7: FLOATNUM
                    {
                    FLOATNUM393=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6130); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM393);


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
                    // 444:21: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FLOATNUM, FLOATNUM393, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:445:7: TRUE
                    {
                    TRUE394=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE394);


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
                    // 445:21: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(TRUE, TRUE394, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:446:7: FALSE
                    {
                    FALSE395=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE395);


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
                    // 446:21: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        adaptor.addChild(root_0, 
                        new ConstantNode(FALSE, FALSE395, "BOOL")
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
            if ( state.backtracking>0 ) { memoize(input, 76, elementarySymbol_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred56_Haxe
    public final void synpred56_Haxe_fragment() throws RecognitionException {
        // Haxe.g:193:37: ( IDENTIFIER )
        // Haxe.g:193:37: IDENTIFIER
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred56_Haxe1828); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred56_Haxe

    // $ANTLR start synpred57_Haxe
    public final void synpred57_Haxe_fragment() throws RecognitionException {
        // Haxe.g:193:51: ( filepath )
        // Haxe.g:193:51: filepath
        {
        pushFollow(FOLLOW_filepath_in_synpred57_Haxe1833);
        filepath();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred57_Haxe

    // $ANTLR start synpred58_Haxe
    public final void synpred58_Haxe_fragment() throws RecognitionException {
        // Haxe.g:193:75: ( typeParam )
        // Haxe.g:193:75: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred58_Haxe1843);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred58_Haxe

    // $ANTLR start synpred60_Haxe
    public final void synpred60_Haxe_fragment() throws RecognitionException {
        // Haxe.g:204:19: ( block )
        // Haxe.g:204:19: block
        {
        pushFollow(FOLLOW_block_in_synpred60_Haxe1985);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred61_Haxe
    public final void synpred61_Haxe_fragment() throws RecognitionException {
        // Haxe.g:205:56: ( ELSE statement )
        // Haxe.g:205:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred61_Haxe2016); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred61_Haxe2019);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_Haxe

    // $ANTLR start synpred75_Haxe
    public final void synpred75_Haxe_fragment() throws RecognitionException {
        // Haxe.g:214:19: ( expr SEMI )
        // Haxe.g:214:19: expr SEMI
        {
        pushFollow(FOLLOW_expr_in_synpred75_Haxe2297);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,SEMI,FOLLOW_SEMI_in_synpred75_Haxe2299); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred75_Haxe

    // $ANTLR start synpred117_Haxe
    public final void synpred117_Haxe_fragment() throws RecognitionException {
        // Haxe.g:306:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:306:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred117_Haxe3939);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_Haxe3941); if (state.failed) return ;

        // Haxe.g:306:32: ( exprList )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==BANG||LA126_0==CAST||LA126_0==CHARLITERAL||LA126_0==FALSE||LA126_0==FLOATNUM||LA126_0==FUNCTION||LA126_0==IDENTIFIER||LA126_0==INTLITERAL||LA126_0==LBRACE||LA126_0==LONGLITERAL||(LA126_0 >= NEW && LA126_0 <= NULL)||LA126_0==PLUSPLUS||(LA126_0 >= STRINGLITERAL && LA126_0 <= SUB)||LA126_0==SUBSUB||LA126_0==THIS||LA126_0==TILDE||LA126_0==TRUE||LA126_0==UNTYPED) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // Haxe.g:306:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred117_Haxe3943);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred117_Haxe3946); if (state.failed) return ;

        // Haxe.g:306:49: ( pureCallOrSlice )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==DOT||LA127_0==LBRACKET) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // Haxe.g:306:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred117_Haxe3948);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred117_Haxe

    // $ANTLR start synpred119_Haxe
    public final void synpred119_Haxe_fragment() throws RecognitionException {
        // Haxe.g:308:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:308:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred119_Haxe3999);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred119_Haxe4001); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred119_Haxe4003);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred119_Haxe4005); if (state.failed) return ;

        // Haxe.g:308:48: ( pureCallOrSlice )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==DOT||LA128_0==LBRACKET) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // Haxe.g:308:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred119_Haxe4007);
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
        // Haxe.g:310:19: ( value pureCallOrSlice )
        // Haxe.g:310:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred120_Haxe4058);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe4061);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred127_Haxe
    public final void synpred127_Haxe_fragment() throws RecognitionException {
        // Haxe.g:326:12: ( typeParam )
        // Haxe.g:326:12: typeParam
        {
        pushFollow(FOLLOW_typeParam_in_synpred127_Haxe4244);
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


    protected DFA83 dfa83 = new DFA83(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA83_eotS =
        "\4\uffff";
    static final String DFA83_eofS =
        "\4\uffff";
    static final String DFA83_minS =
        "\2\46\2\uffff";
    static final String DFA83_maxS =
        "\2\u00a2\2\uffff";
    static final String DFA83_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA83_specialS =
        "\4\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1\30\uffff\1\2",
            "\1\1\22\uffff\1\3\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1\30\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "354:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA94_eotS =
        "\5\uffff";
    static final String DFA94_eofS =
        "\5\uffff";
    static final String DFA94_minS =
        "\2\46\1\105\2\uffff";
    static final String DFA94_maxS =
        "\2\u0089\1\142\2\uffff";
    static final String DFA94_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA94_specialS =
        "\5\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2\uffff"+
            "\1\1\13\uffff\1\1",
            "\1\1\22\uffff\1\2\22\uffff\1\1\30\uffff\1\1\24\uffff\1\1\2"+
            "\uffff\1\1\13\uffff\1\1",
            "\1\4\34\uffff\1\3",
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
            return "381:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
        }
    }
    static final String DFA108_eotS =
        "\10\uffff";
    static final String DFA108_eofS =
        "\10\uffff";
    static final String DFA108_minS =
        "\2\46\2\105\4\uffff";
    static final String DFA108_maxS =
        "\2\u0089\2\142\4\uffff";
    static final String DFA108_acceptS =
        "\4\uffff\1\3\1\4\1\1\1\2";
    static final String DFA108_specialS =
        "\10\uffff}>";
    static final String[] DFA108_transitionS = {
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
            return "390:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );";
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
    public static final BitSet FOLLOW_IDENTIFIER_in_type1828 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_filepath_in_type1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_anonType_in_type1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_type1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1879 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeParam1881 = new BitSet(new long[]{0x0800000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_typeParam1883 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typeConstraint1937 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1941 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2011 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2013 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2016 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2047 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2052 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_statement2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2057 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2086 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2108 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_statement2148 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2150 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2177 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2185 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2188 = new BitSet(new long[]{0x0000000200200000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2212 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B008L});
    public static final BitSet FOLLOW_expr_in_statement2218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2242 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2308 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2310 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_statement2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2358 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_parExpression2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2399 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00490060L,0x00000045035CB002L});
    public static final BitSet FOLLOW_blockStmt_in_block2402 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00490060L,0x00000045035CB002L});
    public static final BitSet FOLLOW_RBRACE_in_block2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2496 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2499 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2501 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2524 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2527 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_caseStmt2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2571 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_block_in_catchStmt2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2617 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2620 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_exprList2623 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2665 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2718 = new BitSet(new long[]{0x4000100000104082L,0x00000A0008000001L,0x0000000000004140L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2721 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2755 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2758 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2761 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2763 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2797 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2800 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2806 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2840 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2842 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2848 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2898 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2901 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2946 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2973 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3002 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3031 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3060 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3089 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3118 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3125 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3164 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3191 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3220 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3249 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3256 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3289 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3316 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3345 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3374 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3381 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3416 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3443 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3472 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3479 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3518 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_STAR_in_multExpr3545 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3574 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3603 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000000148B000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3610 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3658 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3677 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3696 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3715 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3734 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3761 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3812 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_prefixExpr3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3817 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3847 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3850 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3853 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3941 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3946 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4001 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4005 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4058 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4106 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B001L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4111 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4167 = new BitSet(new long[]{0x0288000002000000L,0x0000000800490020L,0x0000000001081000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4242 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeParam_in_value4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4360 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4365 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4419 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4422 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4472 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4558 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4563 = new BitSet(new long[]{0x0001000000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4565 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_classDecl4568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4638 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4641 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4758 = new BitSet(new long[]{0x0000000008000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4760 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4763 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4840 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_varDecl4843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4846 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList4876 = new BitSet(new long[]{0x0000100008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList4878 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList4881 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl4935 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4939 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl4941 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5106 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_varInit5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5152 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5155 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5217 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5311 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5317 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_funcDeclPart5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5365 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5367 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5371 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5376 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5422 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5426 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5431 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5436 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5485 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5489 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5494 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5539 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5544 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5549 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5616 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5618 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_interfaceDecl5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5623 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5626 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5652 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5664 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5690 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5693 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5695 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5747 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5770 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5809 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5811 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5848 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5888 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5918 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5920 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5953 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5959 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem5995 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem5997 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred56_Haxe1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filepath_in_synpred57_Haxe1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred58_Haxe1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred60_Haxe1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred61_Haxe2016 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00490060L,0x00000041035CB002L});
    public static final BitSet FOLLOW_statement_in_synpred61_Haxe2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred75_Haxe2297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_synpred75_Haxe2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred117_Haxe3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred117_Haxe3941 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_synpred117_Haxe3943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred117_Haxe3946 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred117_Haxe3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred119_Haxe3999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred119_Haxe4001 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00490020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_synpred119_Haxe4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred119_Haxe4005 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred119_Haxe4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred120_Haxe4058 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred127_Haxe4244 = new BitSet(new long[]{0x0000000000000002L});

}