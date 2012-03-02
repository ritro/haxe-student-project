// $ANTLR 3.4 Haxe.g 2012-03-03 01:22:35

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
    // Haxe.g:204:1: statement : ( block | ( assignExpr | expr ) SEMI !| IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN expr IN iterExpr RPAREN statement -> ^( FOR expr iterExpr statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !);
    public final HaxeParser.statement_return statement() throws RecognitionException {
        HaxeParser.statement_return retval = new HaxeParser.statement_return();
        retval.start = input.LT(1);

        int statement_StartIndex = input.index();

        Object root_0 = null;

        Token SEMI96=null;
        Token IF97=null;
        Token ELSE100=null;
        Token FOR102=null;
        Token LPAREN103=null;
        Token IN105=null;
        Token RPAREN107=null;
        Token WHILE109=null;
        Token DO112=null;
        Token WHILE114=null;
        Token SEMI116=null;
        Token TRY117=null;
        Token SWITCH120=null;
        Token LPAREN121=null;
        Token RPAREN123=null;
        Token LBRACE124=null;
        Token RBRACE126=null;
        Token RETURN127=null;
        Token SEMI129=null;
        Token THROW130=null;
        Token SEMI132=null;
        Token set133=null;
        Token SEMI134=null;
        Token IDENTIFIER135=null;
        Token COLON136=null;
        Token SEMI138=null;
        HaxeParser.block_return block93 =null;

        HaxeParser.assignExpr_return assignExpr94 =null;

        HaxeParser.expr_return expr95 =null;

        HaxeParser.parExpression_return parExpression98 =null;

        HaxeParser.statement_return statement99 =null;

        HaxeParser.statement_return statement101 =null;

        HaxeParser.expr_return expr104 =null;

        HaxeParser.iterExpr_return iterExpr106 =null;

        HaxeParser.statement_return statement108 =null;

        HaxeParser.parExpression_return parExpression110 =null;

        HaxeParser.statement_return statement111 =null;

        HaxeParser.statement_return statement113 =null;

        HaxeParser.parExpression_return parExpression115 =null;

        HaxeParser.block_return block118 =null;

        HaxeParser.catchStmt_return catchStmt119 =null;

        HaxeParser.expr_return expr122 =null;

        HaxeParser.caseStmt_return caseStmt125 =null;

        HaxeParser.expr_return expr128 =null;

        HaxeParser.expr_return expr131 =null;

        HaxeParser.statement_return statement137 =null;


        Object SEMI96_tree=null;
        Object IF97_tree=null;
        Object ELSE100_tree=null;
        Object FOR102_tree=null;
        Object LPAREN103_tree=null;
        Object IN105_tree=null;
        Object RPAREN107_tree=null;
        Object WHILE109_tree=null;
        Object DO112_tree=null;
        Object WHILE114_tree=null;
        Object SEMI116_tree=null;
        Object TRY117_tree=null;
        Object SWITCH120_tree=null;
        Object LPAREN121_tree=null;
        Object RPAREN123_tree=null;
        Object LBRACE124_tree=null;
        Object RBRACE126_tree=null;
        Object RETURN127_tree=null;
        Object SEMI129_tree=null;
        Object THROW130_tree=null;
        Object SEMI132_tree=null;
        Object set133_tree=null;
        Object SEMI134_tree=null;
        Object IDENTIFIER135_tree=null;
        Object COLON136_tree=null;
        Object SEMI138_tree=null;
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

            // Haxe.g:205:5: ( block | ( assignExpr | expr ) SEMI !| IF ^ parExpression statement ( ELSE ! statement )? | FOR LPAREN expr IN iterExpr RPAREN statement -> ^( FOR expr iterExpr statement ) | WHILE ^ parExpression statement | DO ^ statement WHILE ! parExpression SEMI !| TRY ^ block ( catchStmt )+ | SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !| RETURN ^ ( expr )? SEMI !| THROW ^ expr SEMI !| ( BREAK | CONTINUE ) SEMI !| IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI !)
            int alt38=13;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred60_Haxe()) ) {
                    alt38=1;
                }
                else if ( (synpred62_Haxe()) ) {
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

                if ( (synpred60_Haxe()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=13;
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
                int LA38_20 = input.LA(2);

                if ( (synpred62_Haxe()) ) {
                    alt38=2;
                }
                else if ( (synpred77_Haxe()) ) {
                    alt38=12;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 20, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt38=3;
                }
                break;
            case FOR:
                {
                alt38=4;
                }
                break;
            case WHILE:
                {
                alt38=5;
                }
                break;
            case DO:
                {
                alt38=6;
                }
                break;
            case TRY:
                {
                alt38=7;
                }
                break;
            case SWITCH:
                {
                alt38=8;
                }
                break;
            case RETURN:
                {
                alt38=9;
                }
                break;
            case THROW:
                {
                alt38=10;
                }
                break;
            case BREAK:
            case CONTINUE:
                {
                alt38=11;
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
                    // Haxe.g:205:10: block
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement1987);
                    block93=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block93.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:206:10: ( assignExpr | expr ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:206:10: ( assignExpr | expr )
                    int alt33=2;
                    switch ( input.LA(1) ) {
                    case SUB:
                        {
                        int LA33_1 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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

                        if ( (synpred61_Haxe()) ) {
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
                    case LONGLITERAL:
                        {
                        int LA33_10 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case NULL:
                        {
                        int LA33_11 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case INTLITERAL:
                        {
                        int LA33_12 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case STRINGLITERAL:
                        {
                        int LA33_13 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case CHARLITERAL:
                        {
                        int LA33_14 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case FLOATNUM:
                        {
                        int LA33_15 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case TRUE:
                        {
                        int LA33_16 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case FALSE:
                        {
                        int LA33_17 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case LPAREN:
                        {
                        int LA33_18 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case IDENTIFIER:
                        {
                        int LA33_19 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                    case THIS:
                        {
                        int LA33_20 = input.LA(2);

                        if ( (synpred61_Haxe()) ) {
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
                            // Haxe.g:206:11: assignExpr
                            {
                            pushFollow(FOLLOW_assignExpr_in_statement1999);
                            assignExpr94=assignExpr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr94.getTree());

                            }
                            break;
                        case 2 :
                            // Haxe.g:206:22: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2001);
                            expr95=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr95.getTree());

                            }
                            break;

                    }


                    SEMI96=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2004); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:207:19: IF ^ parExpression statement ( ELSE ! statement )?
                    {
                    root_0 = (Object)adaptor.nil();


                    IF97=(Token)match(input,IF,FOLLOW_IF_in_statement2025); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF97_tree = 
                    new IfNode(IF97) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IF97_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2031);
                    parExpression98=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression98.getTree());

                    pushFollow(FOLLOW_statement_in_statement2033);
                    statement99=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement99.getTree());

                    // Haxe.g:207:55: ( ELSE ! statement )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ELSE) ) {
                        int LA34_1 = input.LA(2);

                        if ( (synpred63_Haxe()) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // Haxe.g:207:56: ELSE ! statement
                            {
                            ELSE100=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement2036); if (state.failed) return retval;

                            pushFollow(FOLLOW_statement_in_statement2039);
                            statement101=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement101.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // Haxe.g:208:19: FOR LPAREN expr IN iterExpr RPAREN statement
                    {
                    FOR102=(Token)match(input,FOR,FOLLOW_FOR_in_statement2061); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR102);


                    LPAREN103=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2063); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN103);


                    pushFollow(FOLLOW_expr_in_statement2065);
                    expr104=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr104.getTree());

                    IN105=(Token)match(input,IN,FOLLOW_IN_in_statement2067); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN105);


                    pushFollow(FOLLOW_iterExpr_in_statement2069);
                    iterExpr106=iterExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_iterExpr.add(iterExpr106.getTree());

                    RPAREN107=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN107);


                    pushFollow(FOLLOW_statement_in_statement2073);
                    statement108=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement108.getTree());

                    // AST REWRITE
                    // elements: statement, FOR, iterExpr, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:64: -> ^( FOR expr iterExpr statement )
                    {
                        // Haxe.g:208:67: ^( FOR expr iterExpr statement )
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
                case 5 :
                    // Haxe.g:209:19: WHILE ^ parExpression statement
                    {
                    root_0 = (Object)adaptor.nil();


                    WHILE109=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE109_tree = 
                    new WhileNode(WHILE109) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(WHILE109_tree, root_0);
                    }

                    pushFollow(FOLLOW_parExpression_in_statement2114);
                    parExpression110=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression110.getTree());

                    pushFollow(FOLLOW_statement_in_statement2116);
                    statement111=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement111.getTree());

                    }
                    break;
                case 6 :
                    // Haxe.g:210:19: DO ^ statement WHILE ! parExpression SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    DO112=(Token)match(input,DO,FOLLOW_DO_in_statement2136); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO112_tree = 
                    new DoWhileNode(DO112) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DO112_tree, root_0);
                    }

                    pushFollow(FOLLOW_statement_in_statement2142);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement113.getTree());

                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement2144); if (state.failed) return retval;

                    pushFollow(FOLLOW_parExpression_in_statement2147);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression115.getTree());

                    SEMI116=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2149); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // Haxe.g:211:19: TRY ^ block ( catchStmt )+
                    {
                    root_0 = (Object)adaptor.nil();


                    TRY117=(Token)match(input,TRY,FOLLOW_TRY_in_statement2170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY117_tree = 
                    new TryNode(TRY117) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(TRY117_tree, root_0);
                    }

                    pushFollow(FOLLOW_block_in_statement2176);
                    block118=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block118.getTree());

                    // Haxe.g:211:39: ( catchStmt )+
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
                    	    // Haxe.g:211:39: catchStmt
                    	    {
                    	    pushFollow(FOLLOW_catchStmt_in_statement2178);
                    	    catchStmt119=catchStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt119.getTree());

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
                case 8 :
                    // Haxe.g:212:19: SWITCH ^ LPAREN ! expr RPAREN ! LBRACE ! ( caseStmt )+ RBRACE !
                    {
                    root_0 = (Object)adaptor.nil();


                    SWITCH120=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement2199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH120_tree = 
                    new SwitchNode(SWITCH120) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(SWITCH120_tree, root_0);
                    }

                    LPAREN121=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement2205); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_statement2208);
                    expr122=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr122.getTree());

                    RPAREN123=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement2210); if (state.failed) return retval;

                    LBRACE124=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement2213); if (state.failed) return retval;

                    // Haxe.g:212:68: ( caseStmt )+
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
                    	    // Haxe.g:212:68: caseStmt
                    	    {
                    	    pushFollow(FOLLOW_caseStmt_in_statement2216);
                    	    caseStmt125=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStmt125.getTree());

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


                    RBRACE126=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement2219); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // Haxe.g:213:19: RETURN ^ ( expr )? SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    RETURN127=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement2240); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN127_tree = 
                    new ReturnNode(RETURN127) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(RETURN127_tree, root_0);
                    }

                    // Haxe.g:213:39: ( expr )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==BANG||LA37_0==CAST||LA37_0==CHARLITERAL||LA37_0==FALSE||LA37_0==FLOATNUM||LA37_0==FUNCTION||LA37_0==IDENTIFIER||LA37_0==INTLITERAL||LA37_0==LBRACE||(LA37_0 >= LONGLITERAL && LA37_0 <= LPAREN)||(LA37_0 >= NEW && LA37_0 <= NULL)||LA37_0==PLUSPLUS||(LA37_0 >= STRINGLITERAL && LA37_0 <= SUB)||LA37_0==SUBSUB||LA37_0==THIS||LA37_0==TILDE||LA37_0==TRUE||LA37_0==UNTYPED) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Haxe.g:213:39: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement2246);
                            expr128=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr128.getTree());

                            }
                            break;

                    }


                    SEMI129=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2249); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // Haxe.g:214:19: THROW ^ expr SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    THROW130=(Token)match(input,THROW,FOLLOW_THROW_in_statement2270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW130_tree = 
                    (Object)adaptor.create(THROW130)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(THROW130_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_statement2273);
                    expr131=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr131.getTree());

                    SEMI132=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2275); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // Haxe.g:215:19: ( BREAK | CONTINUE ) SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    set133=(Token)input.LT(1);

                    if ( input.LA(1)==BREAK||input.LA(1)==CONTINUE ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (Object)adaptor.create(set133)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    SEMI134=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2304); if (state.failed) return retval;

                    }
                    break;
                case 12 :
                    // Haxe.g:216:8: IDENTIFIER COLON statement
                    {
                    IDENTIFIER135=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement2314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER135);


                    COLON136=(Token)match(input,COLON,FOLLOW_COLON_in_statement2316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON136);


                    pushFollow(FOLLOW_statement_in_statement2318);
                    statement137=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement137.getTree());

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
                    // 216:51: -> ^( COLON ( IDENTIFIER )? ( statement )? )
                    {
                        // Haxe.g:216:54: ^( COLON ( IDENTIFIER )? ( statement )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_COLON.nextNode()
                        , root_1);

                        // Haxe.g:216:62: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_IDENTIFIER.nextNode()
                            );

                        }
                        stream_IDENTIFIER.reset();

                        // Haxe.g:216:74: ( statement )?
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
                case 13 :
                    // Haxe.g:217:10: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI138=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement2357); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:220:1: parExpression : LPAREN ! expr RPAREN !;
    public final HaxeParser.parExpression_return parExpression() throws RecognitionException {
        HaxeParser.parExpression_return retval = new HaxeParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN139=null;
        Token RPAREN141=null;
        HaxeParser.expr_return expr140 =null;


        Object LPAREN139_tree=null;
        Object RPAREN141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

            // Haxe.g:221:5: ( LPAREN ! expr RPAREN !)
            // Haxe.g:221:9: LPAREN ! expr RPAREN !
            {
            root_0 = (Object)adaptor.nil();


            LPAREN139=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression2381); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_parExpression2384);
            expr140=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr140.getTree());

            RPAREN141=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression2386); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:224:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !);
    public final HaxeParser.block_return block() throws RecognitionException {
        HaxeParser.block_return retval = new HaxeParser.block_return();
        retval.start = input.LT(1);

        int block_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE142=null;
        Token RBRACE144=null;
        Token SEMI145=null;
        HaxeParser.blockStmt_return blockStmt143 =null;


        Object LBRACE142_tree=null;
        Object RBRACE144_tree=null;
        Object SEMI145_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

            // Haxe.g:224:17: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* ) | SEMI !)
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
                    // Haxe.g:224:19: LBRACE ( blockStmt )* RBRACE
                    {
                    LBRACE142=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE142);


                    // Haxe.g:224:26: ( blockStmt )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==BANG||LA39_0==BREAK||LA39_0==CAST||(LA39_0 >= CHARLITERAL && LA39_0 <= CLASS)||LA39_0==CONTINUE||LA39_0==DO||LA39_0==EXTERN||LA39_0==FALSE||(LA39_0 >= FLOATNUM && LA39_0 <= FUNCTION)||(LA39_0 >= IDENTIFIER && LA39_0 <= IF)||LA39_0==INTLITERAL||LA39_0==LBRACE||(LA39_0 >= LONGLITERAL && LA39_0 <= LPAREN)||(LA39_0 >= NEW && LA39_0 <= NULL)||LA39_0==PLUSPLUS||LA39_0==PRIVATE||LA39_0==RETURN||LA39_0==SEMI||(LA39_0 >= STRINGLITERAL && LA39_0 <= SUB)||LA39_0==SUBSUB||(LA39_0 >= SWITCH && LA39_0 <= THROW)||LA39_0==TILDE||(LA39_0 >= TRUE && LA39_0 <= TRY)||LA39_0==UNTYPED||LA39_0==VAR||LA39_0==WHILE) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Haxe.g:224:27: blockStmt
                    	    {
                    	    pushFollow(FOLLOW_blockStmt_in_block2413);
                    	    blockStmt143=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt143.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    RBRACE144=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE144);


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
                    // 224:46: -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                    {
                        // Haxe.g:224:49: ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new BlockScopeNode(BLOCK_SCOPE, LBRACE142, RBRACE144)
                        , root_1);

                        // Haxe.g:224:97: ( blockStmt )*
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
                    // Haxe.g:225:19: SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_block2451); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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

        HaxeParser.varDecl_return varDecl146 =null;

        HaxeParser.classDecl_return classDecl147 =null;

        HaxeParser.statement_return statement148 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

            // Haxe.g:229:5: ( varDecl | classDecl | statement )
            int alt41=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt41=1;
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
                    // Haxe.g:229:10: varDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_blockStmt2484);
                    varDecl146=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl146.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:230:10: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_blockStmt2495);
                    classDecl147=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl147.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:231:10: statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_statement_in_blockStmt2506);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement148.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:234:1: caseStmt : ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement );
    public final HaxeParser.caseStmt_return caseStmt() throws RecognitionException {
        HaxeParser.caseStmt_return retval = new HaxeParser.caseStmt_return();
        retval.start = input.LT(1);

        int caseStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CASE149=null;
        Token COLON151=null;
        Token DEFAULT153=null;
        Token COLON154=null;
        HaxeParser.exprList_return exprList150 =null;

        HaxeParser.statement_return statement152 =null;

        HaxeParser.statement_return statement155 =null;


        Object CASE149_tree=null;
        Object COLON151_tree=null;
        Object DEFAULT153_tree=null;
        Object COLON154_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

            // Haxe.g:234:17: ( CASE ^ exprList COLON ! statement | DEFAULT ^ COLON ! statement )
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
                    // Haxe.g:234:19: CASE ^ exprList COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    CASE149=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2530); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CASE149_tree = 
                    (Object)adaptor.create(CASE149)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CASE149_tree, root_0);
                    }

                    pushFollow(FOLLOW_exprList_in_caseStmt2533);
                    exprList150=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList150.getTree());

                    COLON151=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2535); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2538);
                    statement152=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement152.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:235:19: DEFAULT ^ COLON ! statement
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT153=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFAULT153_tree = 
                    (Object)adaptor.create(DEFAULT153)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DEFAULT153_tree, root_0);
                    }

                    COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2561); if (state.failed) return retval;

                    pushFollow(FOLLOW_statement_in_caseStmt2564);
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
    // Haxe.g:238:1: catchStmt : CATCH ^ LPAREN ! param RPAREN ! block ;
    public final HaxeParser.catchStmt_return catchStmt() throws RecognitionException {
        HaxeParser.catchStmt_return retval = new HaxeParser.catchStmt_return();
        retval.start = input.LT(1);

        int catchStmt_StartIndex = input.index();

        Object root_0 = null;

        Token CATCH156=null;
        Token LPAREN157=null;
        Token RPAREN159=null;
        HaxeParser.param_return param158 =null;

        HaxeParser.block_return block160 =null;


        Object CATCH156_tree=null;
        Object LPAREN157_tree=null;
        Object RPAREN159_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

            // Haxe.g:238:17: ( CATCH ^ LPAREN ! param RPAREN ! block )
            // Haxe.g:238:19: CATCH ^ LPAREN ! param RPAREN ! block
            {
            root_0 = (Object)adaptor.nil();


            CATCH156=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2599); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH156_tree = 
            new HaxeTree(CATCH156) 
            ;
            root_0 = (Object)adaptor.becomeRoot(CATCH156_tree, root_0);
            }

            LPAREN157=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2605); if (state.failed) return retval;

            pushFollow(FOLLOW_param_in_catchStmt2608);
            param158=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param158.getTree());

            RPAREN159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2610); if (state.failed) return retval;

            pushFollow(FOLLOW_block_in_catchStmt2613);
            block160=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block160.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:242:1: exprList : expr ( COMMA ! expr )* ;
    public final HaxeParser.exprList_return exprList() throws RecognitionException {
        HaxeParser.exprList_return retval = new HaxeParser.exprList_return();
        retval.start = input.LT(1);

        int exprList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA162=null;
        HaxeParser.expr_return expr161 =null;

        HaxeParser.expr_return expr163 =null;


        Object COMMA162_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

            // Haxe.g:242:17: ( expr ( COMMA ! expr )* )
            // Haxe.g:242:19: expr ( COMMA ! expr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expr_in_exprList2651);
            expr161=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr161.getTree());

            // Haxe.g:242:24: ( COMMA ! expr )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMA) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // Haxe.g:242:25: COMMA ! expr
            	    {
            	    COMMA162=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2654); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_exprList2657);
            	    expr163=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr163.getTree());

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
    // Haxe.g:245:1: expr : ( UNTYPED ^ assignExpr | assignExpr );
    public final HaxeParser.expr_return expr() throws RecognitionException {
        HaxeParser.expr_return retval = new HaxeParser.expr_return();
        retval.start = input.LT(1);

        int expr_StartIndex = input.index();

        Object root_0 = null;

        Token UNTYPED164=null;
        HaxeParser.assignExpr_return assignExpr165 =null;

        HaxeParser.assignExpr_return assignExpr166 =null;


        Object UNTYPED164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

            // Haxe.g:245:17: ( UNTYPED ^ assignExpr | assignExpr )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==UNTYPED) ) {
                alt44=1;
            }
            else if ( (LA44_0==BANG||LA44_0==CAST||LA44_0==CHARLITERAL||LA44_0==FALSE||LA44_0==FLOATNUM||LA44_0==FUNCTION||LA44_0==IDENTIFIER||LA44_0==INTLITERAL||LA44_0==LBRACE||(LA44_0 >= LONGLITERAL && LA44_0 <= LPAREN)||(LA44_0 >= NEW && LA44_0 <= NULL)||LA44_0==PLUSPLUS||(LA44_0 >= STRINGLITERAL && LA44_0 <= SUB)||LA44_0==SUBSUB||LA44_0==THIS||LA44_0==TILDE||LA44_0==TRUE) ) {
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
                    // Haxe.g:245:19: UNTYPED ^ assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    UNTYPED164=(Token)match(input,UNTYPED,FOLLOW_UNTYPED_in_expr2699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTYPED164_tree = 
                    (Object)adaptor.create(UNTYPED164)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(UNTYPED164_tree, root_0);
                    }

                    pushFollow(FOLLOW_assignExpr_in_expr2702);
                    assignExpr165=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr165.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:246:19: assignExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_assignExpr_in_expr2722);
                    assignExpr166=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr166.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:249:1: assignExpr : ternaryExpr ( assignOp ^ ternaryExpr )? ;
    public final HaxeParser.assignExpr_return assignExpr() throws RecognitionException {
        HaxeParser.assignExpr_return retval = new HaxeParser.assignExpr_return();
        retval.start = input.LT(1);

        int assignExpr_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.ternaryExpr_return ternaryExpr167 =null;

        HaxeParser.assignOp_return assignOp168 =null;

        HaxeParser.ternaryExpr_return ternaryExpr169 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

            // Haxe.g:249:17: ( ternaryExpr ( assignOp ^ ternaryExpr )? )
            // Haxe.g:249:19: ternaryExpr ( assignOp ^ ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_ternaryExpr_in_assignExpr2752);
            ternaryExpr167=ternaryExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr167.getTree());

            // Haxe.g:249:31: ( assignOp ^ ternaryExpr )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AMPEQ||LA45_0==BAREQ||LA45_0==CARETEQ||LA45_0==EQ||LA45_0==GTGTEQ||LA45_0==GTGTGTEQ||LA45_0==LTLTEQ||LA45_0==PERCENTEQ||LA45_0==PLUSEQ||LA45_0==SLASHEQ||LA45_0==STAREQ||LA45_0==SUBEQ) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // Haxe.g:249:32: assignOp ^ ternaryExpr
                    {
                    pushFollow(FOLLOW_assignOp_in_assignExpr2755);
                    assignOp168=assignOp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp168.getTree(), root_0);

                    pushFollow(FOLLOW_ternaryExpr_in_assignExpr2758);
                    ternaryExpr169=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr169.getTree());

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
    // Haxe.g:252:1: ternaryExpr : logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? ;
    public final HaxeParser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        HaxeParser.ternaryExpr_return retval = new HaxeParser.ternaryExpr_return();
        retval.start = input.LT(1);

        int ternaryExpr_StartIndex = input.index();

        Object root_0 = null;

        Token QUES171=null;
        Token COLON173=null;
        HaxeParser.logicOrExpr_return logicOrExpr170 =null;

        HaxeParser.expr_return expr172 =null;

        HaxeParser.ternaryExpr_return ternaryExpr174 =null;


        Object QUES171_tree=null;
        Object COLON173_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

            // Haxe.g:252:17: ( logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )? )
            // Haxe.g:252:19: logicOrExpr ( QUES ^ expr COLON ! ternaryExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2789);
            logicOrExpr170=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr170.getTree());

            // Haxe.g:252:31: ( QUES ^ expr COLON ! ternaryExpr )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==QUES) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Haxe.g:252:32: QUES ^ expr COLON ! ternaryExpr
                    {
                    QUES171=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUES171_tree = 
                    (Object)adaptor.create(QUES171)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(QUES171_tree, root_0);
                    }

                    pushFollow(FOLLOW_expr_in_ternaryExpr2795);
                    expr172=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr172.getTree());

                    COLON173=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2797); if (state.failed) return retval;

                    pushFollow(FOLLOW_ternaryExpr_in_ternaryExpr2800);
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
    // Haxe.g:255:1: logicOrExpr : logicAndExpr ( BARBAR ^ logicAndExpr )* ;
    public final HaxeParser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        HaxeParser.logicOrExpr_return retval = new HaxeParser.logicOrExpr_return();
        retval.start = input.LT(1);

        int logicOrExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BARBAR176=null;
        HaxeParser.logicAndExpr_return logicAndExpr175 =null;

        HaxeParser.logicAndExpr_return logicAndExpr177 =null;


        Object BARBAR176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

            // Haxe.g:255:17: ( logicAndExpr ( BARBAR ^ logicAndExpr )* )
            // Haxe.g:255:19: logicAndExpr ( BARBAR ^ logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2831);
            logicAndExpr175=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr175.getTree());

            // Haxe.g:255:32: ( BARBAR ^ logicAndExpr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==BARBAR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // Haxe.g:255:33: BARBAR ^ logicAndExpr
            	    {
            	    BARBAR176=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2834); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR176_tree = 
            	    new BinaryExpressionNode(BARBAR176) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR176_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2840);
            	    logicAndExpr177=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr177.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // Haxe.g:258:1: logicAndExpr : iterExpr ( AMPAMP ^ iterExpr )* ;
    public final HaxeParser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        HaxeParser.logicAndExpr_return retval = new HaxeParser.logicAndExpr_return();
        retval.start = input.LT(1);

        int logicAndExpr_StartIndex = input.index();

        Object root_0 = null;

        Token AMPAMP179=null;
        HaxeParser.iterExpr_return iterExpr178 =null;

        HaxeParser.iterExpr_return iterExpr180 =null;


        Object AMPAMP179_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

            // Haxe.g:258:17: ( iterExpr ( AMPAMP ^ iterExpr )* )
            // Haxe.g:258:19: iterExpr ( AMPAMP ^ iterExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_iterExpr_in_logicAndExpr2874);
            iterExpr178=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr178.getTree());

            // Haxe.g:258:27: ( AMPAMP ^ iterExpr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==AMPAMP) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // Haxe.g:258:28: AMPAMP ^ iterExpr
            	    {
            	    AMPAMP179=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2876); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP179_tree = 
            	    new BinaryExpressionNode(AMPAMP179) 
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP179_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_iterExpr_in_logicAndExpr2882);
            	    iterExpr180=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr180.getTree());

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
    // Haxe.g:261:1: iterExpr : cmpExpr ( ELLIPSIS ^ cmpExpr )? ;
    public final HaxeParser.iterExpr_return iterExpr() throws RecognitionException {
        HaxeParser.iterExpr_return retval = new HaxeParser.iterExpr_return();
        retval.start = input.LT(1);

        int iterExpr_StartIndex = input.index();

        Object root_0 = null;

        Token ELLIPSIS182=null;
        HaxeParser.cmpExpr_return cmpExpr181 =null;

        HaxeParser.cmpExpr_return cmpExpr183 =null;


        Object ELLIPSIS182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

            // Haxe.g:261:17: ( cmpExpr ( ELLIPSIS ^ cmpExpr )? )
            // Haxe.g:261:19: cmpExpr ( ELLIPSIS ^ cmpExpr )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_cmpExpr_in_iterExpr2932);
            cmpExpr181=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr181.getTree());

            // Haxe.g:261:27: ( ELLIPSIS ^ cmpExpr )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ELLIPSIS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Haxe.g:261:28: ELLIPSIS ^ cmpExpr
                    {
                    ELLIPSIS182=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2935); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELLIPSIS182_tree = 
                    new BinaryExpressionNode(ELLIPSIS182) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS182_tree, root_0);
                    }

                    pushFollow(FOLLOW_cmpExpr_in_iterExpr2941);
                    cmpExpr183=cmpExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr183.getTree());

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
    // Haxe.g:264:1: cmpExpr : bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* ;
    public final HaxeParser.cmpExpr_return cmpExpr() throws RecognitionException {
        HaxeParser.cmpExpr_return retval = new HaxeParser.cmpExpr_return();
        retval.start = input.LT(1);

        int cmpExpr_StartIndex = input.index();

        Object root_0 = null;

        Token EQEQ185=null;
        Token BANGEQ186=null;
        Token GTEQ187=null;
        Token LTEQ188=null;
        Token GT189=null;
        Token LT190=null;
        HaxeParser.bitExpr_return bitExpr184 =null;

        HaxeParser.bitExpr_return bitExpr191 =null;


        Object EQEQ185_tree=null;
        Object BANGEQ186_tree=null;
        Object GTEQ187_tree=null;
        Object LTEQ188_tree=null;
        Object GT189_tree=null;
        Object LT190_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

            // Haxe.g:264:17: ( bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )* )
            // Haxe.g:264:19: bitExpr ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_bitExpr_in_cmpExpr2980);
            bitExpr184=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr184.getTree());

            // Haxe.g:264:27: ( ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==BANGEQ||LA51_0==EQEQ||(LA51_0 >= GT && LA51_0 <= GTEQ)||(LA51_0 >= LT && LA51_0 <= LTEQ)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // Haxe.g:264:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^) bitExpr
            	    {
            	    // Haxe.g:264:28: ( EQEQ ^| BANGEQ ^| GTEQ ^| LTEQ ^| GT ^| LT ^)
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
            	            // Haxe.g:265:23: EQEQ ^
            	            {
            	            EQEQ185=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr3007); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ185_tree = 
            	            new BinaryExpressionNode(EQEQ185) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ185_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:266:23: BANGEQ ^
            	            {
            	            BANGEQ186=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr3036); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ186_tree = 
            	            new BinaryExpressionNode(BANGEQ186) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ186_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:267:23: GTEQ ^
            	            {
            	            GTEQ187=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr3065); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ187_tree = 
            	            new BinaryExpressionNode(GTEQ187) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ187_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // Haxe.g:268:23: LTEQ ^
            	            {
            	            LTEQ188=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr3094); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ188_tree = 
            	            new BinaryExpressionNode(LTEQ188) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ188_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // Haxe.g:269:23: GT ^
            	            {
            	            GT189=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr3123); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT189_tree = 
            	            new BinaryExpressionNode(GT189) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GT189_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // Haxe.g:270:23: LT ^
            	            {
            	            LT190=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr3152); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT190_tree = 
            	            new BinaryExpressionNode(LT190) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LT190_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr3159);
            	    bitExpr191=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr191.getTree());

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
    // Haxe.g:273:1: bitExpr : shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* ;
    public final HaxeParser.bitExpr_return bitExpr() throws RecognitionException {
        HaxeParser.bitExpr_return retval = new HaxeParser.bitExpr_return();
        retval.start = input.LT(1);

        int bitExpr_StartIndex = input.index();

        Object root_0 = null;

        Token BAR193=null;
        Token AMP194=null;
        Token CARET195=null;
        HaxeParser.shiftExpr_return shiftExpr192 =null;

        HaxeParser.shiftExpr_return shiftExpr196 =null;


        Object BAR193_tree=null;
        Object AMP194_tree=null;
        Object CARET195_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

            // Haxe.g:273:17: ( shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )* )
            // Haxe.g:273:19: shiftExpr ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_shiftExpr_in_bitExpr3198);
            shiftExpr192=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr192.getTree());

            // Haxe.g:273:29: ( ( BAR ^| AMP ^| CARET ^) shiftExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AMP||LA53_0==BAR||LA53_0==CARET) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // Haxe.g:273:30: ( BAR ^| AMP ^| CARET ^) shiftExpr
            	    {
            	    // Haxe.g:273:30: ( BAR ^| AMP ^| CARET ^)
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
            	            // Haxe.g:274:23: BAR ^
            	            {
            	            BAR193=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr3225); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BAR193_tree = 
            	            new BinaryExpressionNode(BAR193) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(BAR193_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:275:23: AMP ^
            	            {
            	            AMP194=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr3254); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            AMP194_tree = 
            	            new BinaryExpressionNode(AMP194) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(AMP194_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:276:23: CARET ^
            	            {
            	            CARET195=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr3283); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            CARET195_tree = 
            	            new BinaryExpressionNode(CARET195) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(CARET195_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr3290);
            	    shiftExpr196=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr196.getTree());

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
    // Haxe.g:279:1: shiftExpr : addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* ;
    public final HaxeParser.shiftExpr_return shiftExpr() throws RecognitionException {
        HaxeParser.shiftExpr_return retval = new HaxeParser.shiftExpr_return();
        retval.start = input.LT(1);

        int shiftExpr_StartIndex = input.index();

        Object root_0 = null;

        Token LTLT198=null;
        Token GTGT199=null;
        Token GTGTGT200=null;
        HaxeParser.addExpr_return addExpr197 =null;

        HaxeParser.addExpr_return addExpr201 =null;


        Object LTLT198_tree=null;
        Object GTGT199_tree=null;
        Object GTGTGT200_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

            // Haxe.g:279:17: ( addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )* )
            // Haxe.g:279:19: addExpr ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_addExpr_in_shiftExpr3323);
            addExpr197=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr197.getTree());

            // Haxe.g:279:27: ( ( LTLT ^| GTGT ^| GTGTGT ^) addExpr )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==GTGT||LA55_0==GTGTGT||LA55_0==LTLT) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Haxe.g:279:28: ( LTLT ^| GTGT ^| GTGTGT ^) addExpr
            	    {
            	    // Haxe.g:279:28: ( LTLT ^| GTGT ^| GTGTGT ^)
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
            	            // Haxe.g:280:23: LTLT ^
            	            {
            	            LTLT198=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr3350); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTLT198_tree = 
            	            new BinaryExpressionNode(LTLT198) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(LTLT198_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:281:23: GTGT ^
            	            {
            	            GTGT199=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr3379); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGT199_tree = 
            	            new BinaryExpressionNode(GTGT199) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGT199_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:282:23: GTGTGT ^
            	            {
            	            GTGTGT200=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr3408); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTGTGT200_tree = 
            	            new BinaryExpressionNode(GTGTGT200) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(GTGTGT200_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_addExpr_in_shiftExpr3415);
            	    addExpr201=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr201.getTree());

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
    // Haxe.g:285:1: addExpr : multExpr ( ( PLUS ^| SUB ^) multExpr )* ;
    public final HaxeParser.addExpr_return addExpr() throws RecognitionException {
        HaxeParser.addExpr_return retval = new HaxeParser.addExpr_return();
        retval.start = input.LT(1);

        int addExpr_StartIndex = input.index();

        Object root_0 = null;

        Token PLUS203=null;
        Token SUB204=null;
        HaxeParser.multExpr_return multExpr202 =null;

        HaxeParser.multExpr_return multExpr205 =null;


        Object PLUS203_tree=null;
        Object SUB204_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

            // Haxe.g:285:17: ( multExpr ( ( PLUS ^| SUB ^) multExpr )* )
            // Haxe.g:285:19: multExpr ( ( PLUS ^| SUB ^) multExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_addExpr3450);
            multExpr202=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr202.getTree());

            // Haxe.g:285:28: ( ( PLUS ^| SUB ^) multExpr )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==PLUS||LA57_0==SUB) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // Haxe.g:285:29: ( PLUS ^| SUB ^) multExpr
            	    {
            	    // Haxe.g:285:29: ( PLUS ^| SUB ^)
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
            	            // Haxe.g:286:23: PLUS ^
            	            {
            	            PLUS203=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr3477); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS203_tree = 
            	            new BinaryExpressionNode(PLUS203) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PLUS203_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:287:23: SUB ^
            	            {
            	            SUB204=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr3506); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB204_tree = 
            	            new BinaryExpressionNode(SUB204) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SUB204_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multExpr_in_addExpr3513);
            	    multExpr205=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr205.getTree());

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
    // Haxe.g:290:1: multExpr : unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* ;
    public final HaxeParser.multExpr_return multExpr() throws RecognitionException {
        HaxeParser.multExpr_return retval = new HaxeParser.multExpr_return();
        retval.start = input.LT(1);

        int multExpr_StartIndex = input.index();

        Object root_0 = null;

        Token STAR207=null;
        Token SLASH208=null;
        Token PERCENT209=null;
        HaxeParser.unarExpr_return unarExpr206 =null;

        HaxeParser.unarExpr_return unarExpr210 =null;


        Object STAR207_tree=null;
        Object SLASH208_tree=null;
        Object PERCENT209_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

            // Haxe.g:290:17: ( unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )* )
            // Haxe.g:290:19: unarExpr ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_unarExpr_in_multExpr3552);
            unarExpr206=unarExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr206.getTree());

            // Haxe.g:290:28: ( ( STAR ^| SLASH ^| PERCENT ^) unarExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==PERCENT||LA59_0==SLASH||LA59_0==STAR) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // Haxe.g:290:29: ( STAR ^| SLASH ^| PERCENT ^) unarExpr
            	    {
            	    // Haxe.g:290:29: ( STAR ^| SLASH ^| PERCENT ^)
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
            	            // Haxe.g:291:23: STAR ^
            	            {
            	            STAR207=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr3579); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR207_tree = 
            	            new BinaryExpressionNode(STAR207) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(STAR207_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // Haxe.g:292:23: SLASH ^
            	            {
            	            SLASH208=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr3608); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH208_tree = 
            	            new BinaryExpressionNode(SLASH208) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(SLASH208_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // Haxe.g:293:23: PERCENT ^
            	            {
            	            PERCENT209=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr3637); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT209_tree = 
            	            new BinaryExpressionNode(PERCENT209) 
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT209_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unarExpr_in_multExpr3644);
            	    unarExpr210=unarExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unarExpr210.getTree());

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
    // Haxe.g:296:1: unarExpr : ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? );
    public final HaxeParser.unarExpr_return unarExpr() throws RecognitionException {
        HaxeParser.unarExpr_return retval = new HaxeParser.unarExpr_return();
        retval.start = input.LT(1);

        int unarExpr_StartIndex = input.index();

        Object root_0 = null;

        Token SUB211=null;
        Token SUBSUB212=null;
        Token PLUSPLUS213=null;
        Token BANG214=null;
        Token TILDE215=null;
        Token PLUSPLUS218=null;
        Token SUBSUB219=null;
        HaxeParser.prefixExpr_return prefixExpr216 =null;

        HaxeParser.prefixExpr_return prefixExpr217 =null;


        Object SUB211_tree=null;
        Object SUBSUB212_tree=null;
        Object PLUSPLUS213_tree=null;
        Object BANG214_tree=null;
        Object TILDE215_tree=null;
        Object PLUSPLUS218_tree=null;
        Object SUBSUB219_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

            // Haxe.g:296:17: ( ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr | prefixExpr ( PLUSPLUS ^| SUBSUB ^)? )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==BANG||LA62_0==PLUSPLUS||LA62_0==SUB||LA62_0==SUBSUB||LA62_0==TILDE) ) {
                alt62=1;
            }
            else if ( (LA62_0==CAST||LA62_0==CHARLITERAL||LA62_0==FALSE||LA62_0==FLOATNUM||LA62_0==FUNCTION||LA62_0==IDENTIFIER||LA62_0==INTLITERAL||LA62_0==LBRACE||(LA62_0 >= LONGLITERAL && LA62_0 <= LPAREN)||(LA62_0 >= NEW && LA62_0 <= NULL)||LA62_0==STRINGLITERAL||LA62_0==THIS||LA62_0==TRUE) ) {
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
                    // Haxe.g:296:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();


                    // Haxe.g:296:19: ( SUB ^| SUBSUB ^| PLUSPLUS ^| BANG ^| TILDE ^)
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
                            // Haxe.g:297:13: SUB ^
                            {
                            SUB211=(Token)match(input,SUB,FOLLOW_SUB_in_unarExpr3692); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUB211_tree = 
                            new UnarExpressionNode(SUB211) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUB211_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:298:13: SUBSUB ^
                            {
                            SUBSUB212=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3711); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB212_tree = 
                            new UnarExpressionNode(SUBSUB212) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB212_tree, root_0);
                            }

                            }
                            break;
                        case 3 :
                            // Haxe.g:299:13: PLUSPLUS ^
                            {
                            PLUSPLUS213=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3730); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS213_tree = 
                            new UnarExpressionNode(PLUSPLUS213) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS213_tree, root_0);
                            }

                            }
                            break;
                        case 4 :
                            // Haxe.g:300:13: BANG ^
                            {
                            BANG214=(Token)match(input,BANG,FOLLOW_BANG_in_unarExpr3749); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BANG214_tree = 
                            new UnarExpressionNode(BANG214) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(BANG214_tree, root_0);
                            }

                            }
                            break;
                        case 5 :
                            // Haxe.g:301:13: TILDE ^
                            {
                            TILDE215=(Token)match(input,TILDE,FOLLOW_TILDE_in_unarExpr3768); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            TILDE215_tree = 
                            new UnarExpressionNode(TILDE215) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(TILDE215_tree, root_0);
                            }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3775);
                    prefixExpr216=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr216.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:302:19: prefixExpr ( PLUSPLUS ^| SUBSUB ^)?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_prefixExpr_in_unarExpr3795);
                    prefixExpr217=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr217.getTree());

                    // Haxe.g:302:30: ( PLUSPLUS ^| SUBSUB ^)?
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
                            // Haxe.g:302:31: PLUSPLUS ^
                            {
                            PLUSPLUS218=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_unarExpr3798); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            PLUSPLUS218_tree = 
                            new UnarExpressionNode(PLUSPLUS218) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(PLUSPLUS218_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // Haxe.g:302:61: SUBSUB ^
                            {
                            SUBSUB219=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_unarExpr3804); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            SUBSUB219_tree = 
                            new UnarExpressionNode(SUBSUB219) 
                            ;
                            root_0 = (Object)adaptor.becomeRoot(SUBSUB219_tree, root_0);
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
    // Haxe.g:305:1: prefixExpr : ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice );
    public final HaxeParser.prefixExpr_return prefixExpr() throws RecognitionException {
        HaxeParser.prefixExpr_return retval = new HaxeParser.prefixExpr_return();
        retval.start = input.LT(1);

        int prefixExpr_StartIndex = input.index();

        Object root_0 = null;

        Token NEW220=null;
        Token LPAREN222=null;
        Token RPAREN224=null;
        Token CAST225=null;
        Token LPAREN226=null;
        Token COMMA228=null;
        Token RPAREN230=null;
        HaxeParser.type_return type221 =null;

        HaxeParser.exprList_return exprList223 =null;

        HaxeParser.expr_return expr227 =null;

        HaxeParser.funcType_return funcType229 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice231 =null;


        Object NEW220_tree=null;
        Object LPAREN222_tree=null;
        Object RPAREN224_tree=null;
        Object CAST225_tree=null;
        Object LPAREN226_tree=null;
        Object COMMA228_tree=null;
        Object RPAREN230_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

            // Haxe.g:305:17: ( NEW ^ type LPAREN ! ( exprList )? RPAREN !| CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !| methodCallOrSlice )
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
                    // Haxe.g:305:19: NEW ^ type LPAREN ! ( exprList )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    NEW220=(Token)match(input,NEW,FOLLOW_NEW_in_prefixExpr3846); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEW220_tree = 
                    (Object)adaptor.create(NEW220)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(NEW220_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_prefixExpr3849);
                    type221=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type221.getTree());

                    LPAREN222=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3851); if (state.failed) return retval;

                    // Haxe.g:305:37: ( exprList )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==BANG||LA63_0==CAST||LA63_0==CHARLITERAL||LA63_0==FALSE||LA63_0==FLOATNUM||LA63_0==FUNCTION||LA63_0==IDENTIFIER||LA63_0==INTLITERAL||LA63_0==LBRACE||(LA63_0 >= LONGLITERAL && LA63_0 <= LPAREN)||(LA63_0 >= NEW && LA63_0 <= NULL)||LA63_0==PLUSPLUS||(LA63_0 >= STRINGLITERAL && LA63_0 <= SUB)||LA63_0==SUBSUB||LA63_0==THIS||LA63_0==TILDE||LA63_0==TRUE||LA63_0==UNTYPED) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // Haxe.g:305:37: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_prefixExpr3854);
                            exprList223=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList223.getTree());

                            }
                            break;

                    }


                    RPAREN224=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3857); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:306:19: CAST ^ LPAREN ! expr ( COMMA ! funcType )? RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    CAST225=(Token)match(input,CAST,FOLLOW_CAST_in_prefixExpr3878); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST225_tree = 
                    (Object)adaptor.create(CAST225)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(CAST225_tree, root_0);
                    }

                    LPAREN226=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_prefixExpr3881); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_prefixExpr3884);
                    expr227=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr227.getTree());

                    // Haxe.g:306:38: ( COMMA ! funcType )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==COMMA) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // Haxe.g:306:39: COMMA ! funcType
                            {
                            COMMA228=(Token)match(input,COMMA,FOLLOW_COMMA_in_prefixExpr3887); if (state.failed) return retval;

                            pushFollow(FOLLOW_funcType_in_prefixExpr3890);
                            funcType229=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType229.getTree());

                            }
                            break;

                    }


                    RPAREN230=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_prefixExpr3894); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // Haxe.g:307:19: methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_methodCallOrSlice_in_prefixExpr3915);
                    methodCallOrSlice231=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice231.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:310:1: methodCallOrSlice : ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value );
    public final HaxeParser.methodCallOrSlice_return methodCallOrSlice() throws RecognitionException {
        HaxeParser.methodCallOrSlice_return retval = new HaxeParser.methodCallOrSlice_return();
        retval.start = input.LT(1);

        int methodCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN233=null;
        Token RPAREN235=null;
        Token LBRACKET238=null;
        Token RBRACKET240=null;
        HaxeParser.value_return value232 =null;

        HaxeParser.exprList_return exprList234 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice236 =null;

        HaxeParser.value_return value237 =null;

        HaxeParser.expr_return expr239 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice241 =null;

        HaxeParser.value_return value242 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice243 =null;

        HaxeParser.value_return value244 =null;


        Object LPAREN233_tree=null;
        Object RPAREN235_tree=null;
        Object LBRACKET238_tree=null;
        Object RBRACKET240_tree=null;
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

            // Haxe.g:311:17: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? ) | value LBRACKET expr RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? ) | value ^ pureCallOrSlice | value )
            int alt69=4;
            switch ( input.LA(1) ) {
            case LBRACE:
                {
                int LA69_1 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }
                }
                break;
            case FUNCTION:
                {
                int LA69_2 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 2, input);

                    throw nvae;

                }
                }
                break;
            case LONGLITERAL:
                {
                int LA69_3 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 3, input);

                    throw nvae;

                }
                }
                break;
            case NULL:
                {
                int LA69_4 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    throw nvae;

                }
                }
                break;
            case INTLITERAL:
                {
                int LA69_5 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 5, input);

                    throw nvae;

                }
                }
                break;
            case STRINGLITERAL:
                {
                int LA69_6 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 6, input);

                    throw nvae;

                }
                }
                break;
            case CHARLITERAL:
                {
                int LA69_7 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 7, input);

                    throw nvae;

                }
                }
                break;
            case FLOATNUM:
                {
                int LA69_8 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 8, input);

                    throw nvae;

                }
                }
                break;
            case TRUE:
                {
                int LA69_9 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 9, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
                {
                int LA69_10 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 10, input);

                    throw nvae;

                }
                }
                break;
            case LPAREN:
                {
                int LA69_11 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 11, input);

                    throw nvae;

                }
                }
                break;
            case IDENTIFIER:
                {
                int LA69_12 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 12, input);

                    throw nvae;

                }
                }
                break;
            case THIS:
                {
                int LA69_13 = input.LA(2);

                if ( (synpred120_Haxe()) ) {
                    alt69=1;
                }
                else if ( (synpred122_Haxe()) ) {
                    alt69=2;
                }
                else if ( (synpred123_Haxe()) ) {
                    alt69=3;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 13, input);

                    throw nvae;

                }
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
                    // Haxe.g:311:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice3973);
                    value232=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value232.getTree());

                    LPAREN233=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_methodCallOrSlice3975); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN233);


                    // Haxe.g:311:32: ( exprList )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==BANG||LA66_0==CAST||LA66_0==CHARLITERAL||LA66_0==FALSE||LA66_0==FLOATNUM||LA66_0==FUNCTION||LA66_0==IDENTIFIER||LA66_0==INTLITERAL||LA66_0==LBRACE||(LA66_0 >= LONGLITERAL && LA66_0 <= LPAREN)||(LA66_0 >= NEW && LA66_0 <= NULL)||LA66_0==PLUSPLUS||(LA66_0 >= STRINGLITERAL && LA66_0 <= SUB)||LA66_0==SUBSUB||LA66_0==THIS||LA66_0==TILDE||LA66_0==TRUE||LA66_0==UNTYPED) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // Haxe.g:311:32: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_methodCallOrSlice3977);
                            exprList234=exprList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_exprList.add(exprList234.getTree());

                            }
                            break;

                    }


                    RPAREN235=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_methodCallOrSlice3980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN235);


                    // Haxe.g:311:49: ( pureCallOrSlice )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==DOT||LA67_0==LBRACKET) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Haxe.g:311:49: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice3982);
                            pureCallOrSlice236=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice236.getTree());

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
                    // 312:13: -> ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:312:16: ^( SUFFIX_EXPR[\"MethodCall\", $LPAREN, $RPAREN] value ( exprList )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "MethodCall", LPAREN233, RPAREN235)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        // Haxe.g:312:78: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        // Haxe.g:312:88: ( pureCallOrSlice )?
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
                    // Haxe.g:313:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
                    {
                    pushFollow(FOLLOW_value_in_methodCallOrSlice4033);
                    value237=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value237.getTree());

                    LBRACKET238=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_methodCallOrSlice4035); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET238);


                    pushFollow(FOLLOW_expr_in_methodCallOrSlice4037);
                    expr239=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr239.getTree());

                    RBRACKET240=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_methodCallOrSlice4039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET240);


                    // Haxe.g:313:48: ( pureCallOrSlice )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==DOT||LA68_0==LBRACKET) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Haxe.g:313:48: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4041);
                            pureCallOrSlice241=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice241.getTree());

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
                    // 314:13: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                    {
                        // Haxe.g:314:16: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] value expr ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET238, RBRACKET240)
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        // Haxe.g:314:82: ( pureCallOrSlice )?
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
                    // Haxe.g:315:19: value ^ pureCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4092);
                    value242=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(value242.getTree(), root_0);

                    pushFollow(FOLLOW_pureCallOrSlice_in_methodCallOrSlice4095);
                    pureCallOrSlice243=pureCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pureCallOrSlice243.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:316:19: value
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_value_in_methodCallOrSlice4115);
                    value244=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value244.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:319:1: pureCallOrSlice : ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice );
    public final HaxeParser.pureCallOrSlice_return pureCallOrSlice() throws RecognitionException {
        HaxeParser.pureCallOrSlice_return retval = new HaxeParser.pureCallOrSlice_return();
        retval.start = input.LT(1);

        int pureCallOrSlice_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACKET245=null;
        Token RBRACKET247=null;
        Token DOT249=null;
        HaxeParser.expr_return expr246 =null;

        HaxeParser.pureCallOrSlice_return pureCallOrSlice248 =null;

        HaxeParser.methodCallOrSlice_return methodCallOrSlice250 =null;


        Object LBRACKET245_tree=null;
        Object RBRACKET247_tree=null;
        Object DOT249_tree=null;
        RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
        RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
        RewriteRuleSubtreeStream stream_pureCallOrSlice=new RewriteRuleSubtreeStream(adaptor,"rule pureCallOrSlice");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

            // Haxe.g:319:17: ( LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )? -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? ) | DOT ^ methodCallOrSlice )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==LBRACKET) ) {
                alt72=1;
            }
            else if ( (LA72_0==DOT) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // Haxe.g:319:19: LBRACKET ( expr )? RBRACKET ( pureCallOrSlice )?
                    {
                    LBRACKET245=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_pureCallOrSlice4140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET245);


                    // Haxe.g:319:28: ( expr )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==BANG||LA70_0==CAST||LA70_0==CHARLITERAL||LA70_0==FALSE||LA70_0==FLOATNUM||LA70_0==FUNCTION||LA70_0==IDENTIFIER||LA70_0==INTLITERAL||LA70_0==LBRACE||(LA70_0 >= LONGLITERAL && LA70_0 <= LPAREN)||(LA70_0 >= NEW && LA70_0 <= NULL)||LA70_0==PLUSPLUS||(LA70_0 >= STRINGLITERAL && LA70_0 <= SUB)||LA70_0==SUBSUB||LA70_0==THIS||LA70_0==TILDE||LA70_0==TRUE||LA70_0==UNTYPED) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // Haxe.g:319:28: expr
                            {
                            pushFollow(FOLLOW_expr_in_pureCallOrSlice4142);
                            expr246=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr246.getTree());

                            }
                            break;

                    }


                    RBRACKET247=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_pureCallOrSlice4145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET247);


                    // Haxe.g:319:43: ( pureCallOrSlice )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==DOT||LA71_0==LBRACKET) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // Haxe.g:319:43: pureCallOrSlice
                            {
                            pushFollow(FOLLOW_pureCallOrSlice_in_pureCallOrSlice4147);
                            pureCallOrSlice248=pureCallOrSlice();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_pureCallOrSlice.add(pureCallOrSlice248.getTree());

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
                    // 319:60: -> ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                    {
                        // Haxe.g:319:63: ^( SUFFIX_EXPR[\"Slice\", $LBRACKET, $RBRACKET] ( expr )? ( pureCallOrSlice )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        new HaxeTree(SUFFIX_EXPR, "Slice", LBRACKET245, RBRACKET247)
                        , root_1);

                        // Haxe.g:320:70: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        // Haxe.g:320:76: ( pureCallOrSlice )?
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
                    // Haxe.g:321:19: DOT ^ methodCallOrSlice
                    {
                    root_0 = (Object)adaptor.nil();


                    DOT249=(Token)match(input,DOT,FOLLOW_DOT_in_pureCallOrSlice4201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT249_tree = 
                    (Object)adaptor.create(DOT249)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(DOT249_tree, root_0);
                    }

                    pushFollow(FOLLOW_methodCallOrSlice_in_pureCallOrSlice4204);
                    methodCallOrSlice250=methodCallOrSlice();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodCallOrSlice250.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:324:1: value : ( objLit | funcLit | elementarySymbol | LPAREN ! expr RPAREN !| id );
    public final HaxeParser.value_return value() throws RecognitionException {
        HaxeParser.value_return retval = new HaxeParser.value_return();
        retval.start = input.LT(1);

        int value_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN254=null;
        Token RPAREN256=null;
        HaxeParser.objLit_return objLit251 =null;

        HaxeParser.funcLit_return funcLit252 =null;

        HaxeParser.elementarySymbol_return elementarySymbol253 =null;

        HaxeParser.expr_return expr255 =null;

        HaxeParser.id_return id257 =null;


        Object LPAREN254_tree=null;
        Object RPAREN256_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

            // Haxe.g:326:5: ( objLit | funcLit | elementarySymbol | LPAREN ! expr RPAREN !| id )
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
            case CHARLITERAL:
            case FALSE:
            case FLOATNUM:
            case INTLITERAL:
            case LONGLITERAL:
            case NULL:
            case STRINGLITERAL:
            case TRUE:
                {
                alt73=3;
                }
                break;
            case LPAREN:
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
                    // Haxe.g:326:9: objLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_objLit_in_value4240);
                    objLit251=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit251.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:327:7: funcLit
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcLit_in_value4248);
                    funcLit252=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit252.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:328:7: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_elementarySymbol_in_value4256);
                    elementarySymbol253=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol253.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:329:9: LPAREN ! expr RPAREN !
                    {
                    root_0 = (Object)adaptor.nil();


                    LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value4266); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value4269);
                    expr255=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr255.getTree());

                    RPAREN256=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value4271); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // Haxe.g:331:9: id
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_id_in_value4287);
                    id257=id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, id257.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:335:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final HaxeParser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        HaxeParser.topLevelDecl_return retval = new HaxeParser.topLevelDecl_return();
        retval.start = input.LT(1);

        int topLevelDecl_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.classDecl_return classDecl258 =null;

        HaxeParser.interfaceDecl_return interfaceDecl259 =null;

        HaxeParser.enumDecl_return enumDecl260 =null;

        HaxeParser.typedefDecl_return typedefDecl261 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

            // Haxe.g:335:17: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
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
                    // Haxe.g:335:19: classDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_classDecl_in_topLevelDecl4306);
                    classDecl258=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl258.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:336:19: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl4326);
                    interfaceDecl259=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl259.getTree());

                    }
                    break;
                case 3 :
                    // Haxe.g:337:19: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl4346);
                    enumDecl260=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl260.getTree());

                    }
                    break;
                case 4 :
                    // Haxe.g:338:19: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl4366);
                    typedefDecl261=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl261.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:341:1: enumDecl : ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) ;
    public final HaxeParser.enumDecl_return enumDecl() throws RecognitionException {
        HaxeParser.enumDecl_return retval = new HaxeParser.enumDecl_return();
        retval.start = input.LT(1);

        int enumDecl_StartIndex = input.index();

        Object root_0 = null;

        Token ENUM263=null;
        Token IDENTIFIER264=null;
        HaxeParser.topLevelAccess_return topLevelAccess262 =null;

        HaxeParser.typeParam_return typeParam265 =null;

        HaxeParser.enumBody_return enumBody266 =null;


        Object ENUM263_tree=null;
        Object IDENTIFIER264_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

            // Haxe.g:341:17: ( ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? enumBody ) )
            // Haxe.g:341:19: ( topLevelAccess )? ENUM IDENTIFIER ( typeParam )? enumBody
            {
            // Haxe.g:341:19: ( topLevelAccess )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==EXTERN||LA75_0==PRIVATE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // Haxe.g:341:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_enumDecl4402);
                    topLevelAccess262=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess262.getTree());

                    }
                    break;

            }


            ENUM263=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl4405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM263);


            IDENTIFIER264=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl4407); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER264);


            // Haxe.g:341:51: ( typeParam )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // Haxe.g:341:51: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_enumDecl4409);
                    typeParam265=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam265.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_enumBody_in_enumDecl4412);
            enumBody266=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody266.getTree());

            // AST REWRITE
            // elements: enumBody, topLevelAccess, IDENTIFIER, typeParam
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
    // Haxe.g:344:1: enumBody : LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) ;
    public final HaxeParser.enumBody_return enumBody() throws RecognitionException {
        HaxeParser.enumBody_return retval = new HaxeParser.enumBody_return();
        retval.start = input.LT(1);

        int enumBody_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE267=null;
        Token RBRACE269=null;
        HaxeParser.enumValueDecl_return enumValueDecl268 =null;


        Object LBRACE267_tree=null;
        Object RBRACE269_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumValueDecl=new RewriteRuleSubtreeStream(adaptor,"rule enumValueDecl");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

            // Haxe.g:344:17: ( LBRACE ( enumValueDecl )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( enumValueDecl )* ) )
            // Haxe.g:344:19: LBRACE ( enumValueDecl )* RBRACE
            {
            LBRACE267=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumBody4461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE267);


            // Haxe.g:344:26: ( enumValueDecl )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==IDENTIFIER) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Haxe.g:344:27: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody4464);
            	    enumValueDecl268=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_enumValueDecl.add(enumValueDecl268.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            RBRACE269=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumBody4468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE269);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE267, RBRACE269)
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
    // Haxe.g:347:1: enumValueDecl : ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !);
    public final HaxeParser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        HaxeParser.enumValueDecl_return retval = new HaxeParser.enumValueDecl_return();
        retval.start = input.LT(1);

        int enumValueDecl_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER270=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        Token SEMI274=null;
        Token IDENTIFIER275=null;
        Token SEMI276=null;
        HaxeParser.paramList_return paramList272 =null;


        Object IDENTIFIER270_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        Object SEMI274_tree=null;
        Object IDENTIFIER275_tree=null;
        Object SEMI276_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }

            // Haxe.g:347:17: ( IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !| IDENTIFIER SEMI !)
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
                    // Haxe.g:347:19: IDENTIFIER ^ LPAREN ! ( paramList )? RPAREN ! SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER270=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4508); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER270_tree = 
                    new VarDeclarationNode(IDENTIFIER270) 
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IDENTIFIER270_tree, root_0);
                    }

                    LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl4514); if (state.failed) return retval;

                    // Haxe.g:347:59: ( paramList )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==IDENTIFIER||LA78_0==QUES) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // Haxe.g:347:59: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_enumValueDecl4517);
                            paramList272=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList272.getTree());

                            }
                            break;

                    }


                    RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl4520); if (state.failed) return retval;

                    SEMI274=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4523); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // Haxe.g:348:19: IDENTIFIER SEMI !
                    {
                    root_0 = (Object)adaptor.nil();


                    IDENTIFIER275=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl4546); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER275_tree = 
                    new VarDeclarationNode(IDENTIFIER275) 
                    ;
                    adaptor.addChild(root_0, IDENTIFIER275_tree);
                    }

                    SEMI276=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl4551); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:352:1: classDecl : ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) ;
    public final HaxeParser.classDecl_return classDecl() throws RecognitionException {
        HaxeParser.classDecl_return retval = new HaxeParser.classDecl_return();
        retval.start = input.LT(1);

        int classDecl_StartIndex = input.index();

        Object root_0 = null;

        Token CLASS278=null;
        Token IDENTIFIER279=null;
        HaxeParser.topLevelAccess_return topLevelAccess277 =null;

        HaxeParser.typeParam_return typeParam280 =null;

        HaxeParser.inheritList_return inheritList281 =null;

        HaxeParser.classBodyScope_return classBodyScope282 =null;


        Object CLASS278_tree=null;
        Object IDENTIFIER279_tree=null;
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_topLevelAccess=new RewriteRuleSubtreeStream(adaptor,"rule topLevelAccess");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }

            // Haxe.g:352:17: ( ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope -> ^( IDENTIFIER ( topLevelAccess )? ( typeParam )? ( inheritList )? classBodyScope ) )
            // Haxe.g:352:19: ( topLevelAccess )? CLASS IDENTIFIER ( typeParam )? ( inheritList )? classBodyScope
            {
            // Haxe.g:352:19: ( topLevelAccess )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==EXTERN||LA80_0==PRIVATE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // Haxe.g:352:19: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_classDecl4600);
                    topLevelAccess277=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_topLevelAccess.add(topLevelAccess277.getTree());

                    }
                    break;

            }


            CLASS278=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl4603); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS278);


            IDENTIFIER279=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl4605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER279);


            // Haxe.g:352:52: ( typeParam )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==LT) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // Haxe.g:352:52: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_classDecl4607);
                    typeParam280=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam280.getTree());

                    }
                    break;

            }


            // Haxe.g:352:63: ( inheritList )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==EXTENDS||LA82_0==IMPLEMENTS) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // Haxe.g:352:63: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_classDecl4610);
                    inheritList281=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList281.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_classBodyScope_in_classDecl4613);
            classBodyScope282=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope282.getTree());

            // AST REWRITE
            // elements: topLevelAccess, IDENTIFIER, classBodyScope, inheritList, typeParam
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
    // Haxe.g:356:1: classBodyScope : LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) ;
    public final HaxeParser.classBodyScope_return classBodyScope() throws RecognitionException {
        HaxeParser.classBodyScope_return retval = new HaxeParser.classBodyScope_return();
        retval.start = input.LT(1);

        int classBodyScope_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE283=null;
        Token RBRACE285=null;
        HaxeParser.classMember_return classMember284 =null;


        Object LBRACE283_tree=null;
        Object RBRACE285_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classMember=new RewriteRuleSubtreeStream(adaptor,"rule classMember");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }

            // Haxe.g:356:17: ( LBRACE ( classMember )* RBRACE -> ^( BLOCK_SCOPE[$LBRACE, $RBRACE] ( classMember )* ) )
            // Haxe.g:356:19: LBRACE ( classMember )* RBRACE
            {
            LBRACE283=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBodyScope4680); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE283);


            // Haxe.g:356:26: ( classMember )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DYNAMIC||LA83_0==FUNCTION||LA83_0==INLINE||LA83_0==OVERRIDE||LA83_0==PRIVATE||LA83_0==PUBLIC||LA83_0==STATIC||LA83_0==VAR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // Haxe.g:356:27: classMember
            	    {
            	    pushFollow(FOLLOW_classMember_in_classBodyScope4683);
            	    classMember284=classMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_classMember.add(classMember284.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            RBRACE285=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBodyScope4687); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE285);


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
                new BlockScopeNode(BLOCK_SCOPE, LBRACE283, RBRACE285)
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
    // Haxe.g:359:1: classMember : ( varDeclClass | funcDecl );
    public final HaxeParser.classMember_return classMember() throws RecognitionException {
        HaxeParser.classMember_return retval = new HaxeParser.classMember_return();
        retval.start = input.LT(1);

        int classMember_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDeclClass_return varDeclClass286 =null;

        HaxeParser.funcDecl_return funcDecl287 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }

            // Haxe.g:359:17: ( varDeclClass | funcDecl )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // Haxe.g:359:19: varDeclClass
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDeclClass_in_classMember4733);
                    varDeclClass286=varDeclClass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclClass286.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:360:19: funcDecl
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcDecl_in_classMember4753);
                    funcDecl287=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl287.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:364:1: varDeclClass : ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) ;
    public final HaxeParser.varDeclClass_return varDeclClass() throws RecognitionException {
        HaxeParser.varDeclClass_return retval = new HaxeParser.varDeclClass_return();
        retval.start = input.LT(1);

        int varDeclClass_StartIndex = input.index();

        Object root_0 = null;

        Token VAR289=null;
        Token IDENTIFIER290=null;
        Token SEMI294=null;
        HaxeParser.declAttrList_return declAttrList288 =null;

        HaxeParser.propDecl_return propDecl291 =null;

        HaxeParser.typeTag_return typeTag292 =null;

        HaxeParser.varInit_return varInit293 =null;


        Object VAR289_tree=null;
        Object IDENTIFIER290_tree=null;
        Object SEMI294_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }

            // Haxe.g:364:17: ( ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI -> ^( IDENTIFIER ( declAttrList )? ( propDecl )? typeTag ( varInit )? ) )
            // Haxe.g:364:19: ( declAttrList )? VAR IDENTIFIER ( propDecl )? typeTag ( varInit )? SEMI
            {
            // Haxe.g:364:19: ( declAttrList )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==DYNAMIC||LA85_0==INLINE||LA85_0==OVERRIDE||LA85_0==PRIVATE||LA85_0==PUBLIC||LA85_0==STATIC) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Haxe.g:364:19: declAttrList
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDeclClass4795);
                    declAttrList288=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList288.getTree());

                    }
                    break;

            }


            VAR289=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclClass4798); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR289);


            IDENTIFIER290=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclClass4800); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER290);


            // Haxe.g:364:48: ( propDecl )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==LPAREN) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // Haxe.g:364:48: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclClass4802);
                    propDecl291=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl291.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_typeTag_in_varDeclClass4805);
            typeTag292=typeTag();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTag.add(typeTag292.getTree());

            // Haxe.g:364:66: ( varInit )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==EQ) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Haxe.g:364:66: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclClass4807);
                    varInit293=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit293.getTree());

                    }
                    break;

            }


            SEMI294=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDeclClass4810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI294);


            // AST REWRITE
            // elements: varInit, IDENTIFIER, propDecl, typeTag, declAttrList
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
    // Haxe.g:367:1: varDecl : VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !;
    public final HaxeParser.varDecl_return varDecl() throws RecognitionException {
        HaxeParser.varDecl_return retval = new HaxeParser.varDecl_return();
        retval.start = input.LT(1);

        int varDecl_StartIndex = input.index();

        Object root_0 = null;

        Token VAR295=null;
        Token COMMA297=null;
        Token SEMI299=null;
        HaxeParser.varDeclPartList_return varDeclPartList296 =null;

        HaxeParser.varDeclPartList_return varDeclPartList298 =null;


        Object VAR295_tree=null;
        Object COMMA297_tree=null;
        Object SEMI299_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }

            // Haxe.g:367:17: ( VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !)
            // Haxe.g:367:19: VAR ! varDeclPartList ( COMMA ! varDeclPartList )* SEMI !
            {
            root_0 = (Object)adaptor.nil();


            VAR295=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl4879); if (state.failed) return retval;

            pushFollow(FOLLOW_varDeclPartList_in_varDecl4882);
            varDeclPartList296=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList296.getTree());

            // Haxe.g:367:40: ( COMMA ! varDeclPartList )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==COMMA) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // Haxe.g:367:41: COMMA ! varDeclPartList
            	    {
            	    COMMA297=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDecl4885); if (state.failed) return retval;

            	    pushFollow(FOLLOW_varDeclPartList_in_varDecl4888);
            	    varDeclPartList298=varDeclPartList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPartList298.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            SEMI299=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl4892); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:370:1: varDeclPartList : IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) ;
    public final HaxeParser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        HaxeParser.varDeclPartList_return retval = new HaxeParser.varDeclPartList_return();
        retval.start = input.LT(1);

        int varDeclPartList_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER300=null;
        HaxeParser.propDecl_return propDecl301 =null;

        HaxeParser.typeTag_return typeTag302 =null;

        HaxeParser.varInit_return varInit303 =null;


        Object IDENTIFIER300_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        RewriteRuleSubtreeStream stream_propDecl=new RewriteRuleSubtreeStream(adaptor,"rule propDecl");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }

            // Haxe.g:370:17: ( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? -> ^( IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )? ) )
            // Haxe.g:370:19: IDENTIFIER ( propDecl )? ( typeTag )? ( varInit )?
            {
            IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPartList4918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER300);


            // Haxe.g:370:30: ( propDecl )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==LPAREN) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Haxe.g:370:30: propDecl
                    {
                    pushFollow(FOLLOW_propDecl_in_varDeclPartList4920);
                    propDecl301=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_propDecl.add(propDecl301.getTree());

                    }
                    break;

            }


            // Haxe.g:370:40: ( typeTag )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==COLON) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // Haxe.g:370:40: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_varDeclPartList4923);
                    typeTag302=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag302.getTree());

                    }
                    break;

            }


            // Haxe.g:370:49: ( varInit )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==EQ) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // Haxe.g:370:49: varInit
                    {
                    pushFollow(FOLLOW_varInit_in_varDeclPartList4926);
                    varInit303=varInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varInit.add(varInit303.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: propDecl, typeTag, varInit, IDENTIFIER
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
    // Haxe.g:373:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) ;
    public final HaxeParser.propDecl_return propDecl() throws RecognitionException {
        HaxeParser.propDecl_return retval = new HaxeParser.propDecl_return();
        retval.start = input.LT(1);

        int propDecl_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN304=null;
        Token COMMA305=null;
        Token RPAREN306=null;
        HaxeParser.propAccessor_return a1 =null;

        HaxeParser.propAccessor_return a2 =null;


        Object LPAREN304_tree=null;
        Object COMMA305_tree=null;
        Object RPAREN306_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }

            // Haxe.g:373:17: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\"] $a1 $a2) )
            // Haxe.g:373:19: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            LPAREN304=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl4977); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN304);


            pushFollow(FOLLOW_propAccessor_in_propDecl4981);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());

            COMMA305=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl4983); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA305);


            pushFollow(FOLLOW_propAccessor_in_propDecl4987);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());

            RPAREN306=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl4989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN306);


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
    // Haxe.g:376:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER );
    public final HaxeParser.propAccessor_return propAccessor() throws RecognitionException {
        HaxeParser.propAccessor_return retval = new HaxeParser.propAccessor_return();
        retval.start = input.LT(1);

        int propAccessor_StartIndex = input.index();

        Object root_0 = null;

        Token set307=null;

        Object set307_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }

            // Haxe.g:376:17: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC | NEVER )
            // Haxe.g:
            {
            root_0 = (Object)adaptor.nil();


            set307=(Token)input.LT(1);

            if ( input.LA(1)==DEFAULT||input.LA(1)==DYNAMIC||input.LA(1)==IDENTIFIER||input.LA(1)==NEVER||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set307)
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
    // Haxe.g:383:1: varInit : EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) ;
    public final HaxeParser.varInit_return varInit() throws RecognitionException {
        HaxeParser.varInit_return retval = new HaxeParser.varInit_return();
        retval.start = input.LT(1);

        int varInit_StartIndex = input.index();

        Object root_0 = null;

        Token EQ308=null;
        HaxeParser.expr_return expr309 =null;


        Object EQ308_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }

            // Haxe.g:383:17: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\"] expr ) )
            // Haxe.g:383:19: EQ expr
            {
            EQ308=(Token)match(input,EQ,FOLLOW_EQ_in_varInit5148); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ308);


            pushFollow(FOLLOW_expr_in_varInit5150);
            expr309=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr309.getTree());

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
    // Haxe.g:386:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );
    public final HaxeParser.funcDecl_return funcDecl() throws RecognitionException {
        HaxeParser.funcDecl_return retval = new HaxeParser.funcDecl_return();
        retval.start = input.LT(1);

        int funcDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION311=null;
        Token NEW312=null;
        Token FUNCTION315=null;
        Token IDENTIFIER316=null;
        HaxeParser.declAttrList_return declAttrList310 =null;

        HaxeParser.funcDeclPart_return funcDeclPart313 =null;

        HaxeParser.declAttrList_return declAttrList314 =null;

        HaxeParser.typeParam_return typeParam317 =null;

        HaxeParser.funcDeclPart_return funcDeclPart318 =null;


        Object FUNCTION311_tree=null;
        Object NEW312_tree=null;
        Object FUNCTION315_tree=null;
        Object IDENTIFIER316_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        RewriteRuleSubtreeStream stream_funcDeclPart=new RewriteRuleSubtreeStream(adaptor,"rule funcDeclPart");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }

            // Haxe.g:386:17: ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) )
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // Haxe.g:386:19: ( declAttrList )? FUNCTION NEW funcDeclPart
                    {
                    // Haxe.g:386:19: ( declAttrList )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==DYNAMIC||LA92_0==INLINE||LA92_0==OVERRIDE||LA92_0==PRIVATE||LA92_0==PUBLIC||LA92_0==STATIC) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // Haxe.g:386:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5194);
                            declAttrList310=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList310.getTree());

                            }
                            break;

                    }


                    FUNCTION311=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5197); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION311);


                    NEW312=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl5199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW312);


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5201);
                    funcDeclPart313=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart313.getTree());

                    // AST REWRITE
                    // elements: declAttrList, NEW, funcDeclPart, FUNCTION
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
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==DYNAMIC||LA93_0==INLINE||LA93_0==OVERRIDE||LA93_0==PRIVATE||LA93_0==PUBLIC||LA93_0==STATIC) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // Haxe.g:388:19: declAttrList
                            {
                            pushFollow(FOLLOW_declAttrList_in_funcDecl5259);
                            declAttrList314=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList314.getTree());

                            }
                            break;

                    }


                    FUNCTION315=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl5262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION315);


                    IDENTIFIER316=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl5264); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER316);


                    // Haxe.g:388:53: ( typeParam )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==LT) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Haxe.g:388:53: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcDecl5266);
                            typeParam317=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam317.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_funcDeclPart_in_funcDecl5269);
                    funcDeclPart318=funcDeclPart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_funcDeclPart.add(funcDeclPart318.getTree());

                    // AST REWRITE
                    // elements: funcDeclPart, IDENTIFIER, declAttrList, typeParam, FUNCTION
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
    // Haxe.g:392:1: funcDeclPart : LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block ;
    public final HaxeParser.funcDeclPart_return funcDeclPart() throws RecognitionException {
        HaxeParser.funcDeclPart_return retval = new HaxeParser.funcDeclPart_return();
        retval.start = input.LT(1);

        int funcDeclPart_StartIndex = input.index();

        Object root_0 = null;

        Token LPAREN319=null;
        Token RPAREN321=null;
        HaxeParser.paramList_return paramList320 =null;

        HaxeParser.typeTag_return typeTag322 =null;

        HaxeParser.block_return block323 =null;


        Object LPAREN319_tree=null;
        Object RPAREN321_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }

            // Haxe.g:392:17: ( LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block )
            // Haxe.g:392:19: LPAREN ! ( paramList )? RPAREN ! ( typeTag )? block
            {
            root_0 = (Object)adaptor.nil();


            LPAREN319=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDeclPart5353); if (state.failed) return retval;

            // Haxe.g:392:27: ( paramList )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==IDENTIFIER||LA96_0==QUES) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // Haxe.g:392:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_funcDeclPart5356);
                    paramList320=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList320.getTree());

                    }
                    break;

            }


            RPAREN321=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDeclPart5359); if (state.failed) return retval;

            // Haxe.g:392:46: ( typeTag )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==COLON) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // Haxe.g:392:46: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_funcDeclPart5362);
                    typeTag322=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTag322.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_block_in_funcDeclPart5365);
            block323=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, block323.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:395:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) );
    public final HaxeParser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        HaxeParser.funcProtoDecl_return retval = new HaxeParser.funcProtoDecl_return();
        retval.start = input.LT(1);

        int funcProtoDecl_StartIndex = input.index();

        Object root_0 = null;

        Token FUNCTION325=null;
        Token NEW326=null;
        Token LPAREN327=null;
        Token RPAREN329=null;
        Token SEMI331=null;
        Token FUNCTION333=null;
        Token IDENTIFIER334=null;
        Token LPAREN336=null;
        Token RPAREN338=null;
        Token SEMI340=null;
        Token FUNCTION341=null;
        Token NEW342=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token SEMI347=null;
        Token FUNCTION348=null;
        Token IDENTIFIER349=null;
        Token LPAREN351=null;
        Token RPAREN353=null;
        Token SEMI355=null;
        HaxeParser.declAttrList_return declAttrList324 =null;

        HaxeParser.paramList_return paramList328 =null;

        HaxeParser.typeTag_return typeTag330 =null;

        HaxeParser.declAttrList_return declAttrList332 =null;

        HaxeParser.typeParam_return typeParam335 =null;

        HaxeParser.paramList_return paramList337 =null;

        HaxeParser.typeTag_return typeTag339 =null;

        HaxeParser.paramList_return paramList344 =null;

        HaxeParser.typeTag_return typeTag346 =null;

        HaxeParser.typeParam_return typeParam350 =null;

        HaxeParser.paramList_return paramList352 =null;

        HaxeParser.typeTag_return typeTag354 =null;


        Object FUNCTION325_tree=null;
        Object NEW326_tree=null;
        Object LPAREN327_tree=null;
        Object RPAREN329_tree=null;
        Object SEMI331_tree=null;
        Object FUNCTION333_tree=null;
        Object IDENTIFIER334_tree=null;
        Object LPAREN336_tree=null;
        Object RPAREN338_tree=null;
        Object SEMI340_tree=null;
        Object FUNCTION341_tree=null;
        Object NEW342_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object SEMI347_tree=null;
        Object FUNCTION348_tree=null;
        Object IDENTIFIER349_tree=null;
        Object LPAREN351_tree=null;
        Object RPAREN353_tree=null;
        Object SEMI355_tree=null;
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

            // Haxe.g:396:5: ( declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( declAttrList )? ( typeParam )? ) | FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTag )? ) | FUNCTION IDENTIFIER ( typeParam )? LPAREN ( paramList )? RPAREN ( typeTag )? SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTag )? ( typeParam )? ) )
            int alt108=4;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // Haxe.g:396:9: declAttrList FUNCTION NEW LPAREN ( paramList )? RPAREN ( typeTag )? SEMI
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5400);
                    declAttrList324=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList324.getTree());

                    FUNCTION325=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION325);


                    NEW326=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW326);


                    LPAREN327=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN327);


                    // Haxe.g:396:42: ( paramList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==IDENTIFIER||LA98_0==QUES) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Haxe.g:396:42: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5408);
                            paramList328=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList328.getTree());

                            }
                            break;

                    }


                    RPAREN329=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN329);


                    // Haxe.g:396:60: ( typeTag )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==COLON) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // Haxe.g:396:60: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5413);
                            typeTag330=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag330.getTree());

                            }
                            break;

                    }


                    SEMI331=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI331);


                    // AST REWRITE
                    // elements: declAttrList, typeTag, paramList, FUNCTION, NEW
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
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl5457);
                    declAttrList332=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList332.getTree());

                    FUNCTION333=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5459); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION333);


                    IDENTIFIER334=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER334);


                    // Haxe.g:398:42: ( typeParam )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==LT) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // Haxe.g:398:42: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5463);
                            typeParam335=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam335.getTree());

                            }
                            break;

                    }


                    LPAREN336=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN336);


                    // Haxe.g:398:60: ( paramList )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==IDENTIFIER||LA101_0==QUES) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // Haxe.g:398:60: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5468);
                            paramList337=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList337.getTree());

                            }
                            break;

                    }


                    RPAREN338=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN338);


                    // Haxe.g:398:78: ( typeTag )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==COLON) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // Haxe.g:398:78: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5473);
                            typeTag339=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag339.getTree());

                            }
                            break;

                    }


                    SEMI340=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI340);


                    // AST REWRITE
                    // elements: declAttrList, IDENTIFIER, typeTag, paramList, FUNCTION, typeParam
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
                    FUNCTION341=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION341);


                    NEW342=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl5522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW342);


                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN343);


                    // Haxe.g:400:29: ( paramList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==IDENTIFIER||LA103_0==QUES) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Haxe.g:400:29: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5526);
                            paramList344=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList344.getTree());

                            }
                            break;

                    }


                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN345);


                    // Haxe.g:400:47: ( typeTag )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==COLON) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Haxe.g:400:47: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5531);
                            typeTag346=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag346.getTree());

                            }
                            break;

                    }


                    SEMI347=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);


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
                    FUNCTION348=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl5572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION348);


                    IDENTIFIER349=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl5574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER349);


                    // Haxe.g:402:29: ( typeParam )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==LT) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // Haxe.g:402:29: typeParam
                            {
                            pushFollow(FOLLOW_typeParam_in_funcProtoDecl5576);
                            typeParam350=typeParam();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeParam.add(typeParam350.getTree());

                            }
                            break;

                    }


                    LPAREN351=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl5579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN351);


                    // Haxe.g:402:47: ( paramList )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==IDENTIFIER||LA106_0==QUES) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // Haxe.g:402:47: paramList
                            {
                            pushFollow(FOLLOW_paramList_in_funcProtoDecl5581);
                            paramList352=paramList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_paramList.add(paramList352.getTree());

                            }
                            break;

                    }


                    RPAREN353=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl5584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN353);


                    // Haxe.g:402:65: ( typeTag )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==COLON) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // Haxe.g:402:65: typeTag
                            {
                            pushFollow(FOLLOW_typeTag_in_funcProtoDecl5586);
                            typeTag354=typeTag();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_typeTag.add(typeTag354.getTree());

                            }
                            break;

                    }


                    SEMI355=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl5589); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI355);


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
    // Haxe.g:406:1: interfaceDecl : ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !;
    public final HaxeParser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        HaxeParser.interfaceDecl_return retval = new HaxeParser.interfaceDecl_return();
        retval.start = input.LT(1);

        int interfaceDecl_StartIndex = input.index();

        Object root_0 = null;

        Token INTERFACE357=null;
        Token LBRACE360=null;
        Token RBRACE362=null;
        HaxeParser.topLevelAccess_return topLevelAccess356 =null;

        HaxeParser.type_return type358 =null;

        HaxeParser.inheritList_return inheritList359 =null;

        HaxeParser.interfaceBody_return interfaceBody361 =null;


        Object INTERFACE357_tree=null;
        Object LBRACE360_tree=null;
        Object RBRACE362_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }

            // Haxe.g:407:5: ( ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !)
            // Haxe.g:407:9: ( topLevelAccess )? INTERFACE type ( inheritList )? LBRACE ! interfaceBody RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            // Haxe.g:407:9: ( topLevelAccess )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==EXTERN||LA109_0==PRIVATE) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // Haxe.g:407:9: topLevelAccess
                    {
                    pushFollow(FOLLOW_topLevelAccess_in_interfaceDecl5648);
                    topLevelAccess356=topLevelAccess();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelAccess356.getTree());

                    }
                    break;

            }


            INTERFACE357=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl5651); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE357_tree = 
            (Object)adaptor.create(INTERFACE357)
            ;
            adaptor.addChild(root_0, INTERFACE357_tree);
            }

            pushFollow(FOLLOW_type_in_interfaceDecl5653);
            type358=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type358.getTree());

            // Haxe.g:407:40: ( inheritList )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==EXTENDS||LA110_0==IMPLEMENTS) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // Haxe.g:407:40: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_interfaceDecl5655);
                    inheritList359=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritList359.getTree());

                    }
                    break;

            }


            LBRACE360=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl5658); if (state.failed) return retval;

            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl5661);
            interfaceBody361=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody361.getTree());

            RBRACE362=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl5663); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:410:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |);
    public final HaxeParser.interfaceBody_return interfaceBody() throws RecognitionException {
        HaxeParser.interfaceBody_return retval = new HaxeParser.interfaceBody_return();
        retval.start = input.LT(1);

        int interfaceBody_StartIndex = input.index();

        Object root_0 = null;

        HaxeParser.varDecl_return varDecl363 =null;

        HaxeParser.interfaceBody_return interfaceBody364 =null;

        HaxeParser.funcProtoDecl_return funcProtoDecl365 =null;

        HaxeParser.interfaceBody_return interfaceBody366 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }

            // Haxe.g:411:5: ( varDecl interfaceBody | funcProtoDecl interfaceBody |)
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
                    // Haxe.g:411:9: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_varDecl_in_interfaceBody5687);
                    varDecl363=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl363.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5689);
                    interfaceBody364=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody364.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:412:9: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody5699);
                    funcProtoDecl365=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl365.getTree());

                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody5701);
                    interfaceBody366=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody366.getTree());

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
    // Haxe.g:417:1: inheritList : inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) ;
    public final HaxeParser.inheritList_return inheritList() throws RecognitionException {
        HaxeParser.inheritList_return retval = new HaxeParser.inheritList_return();
        retval.start = input.LT(1);

        int inheritList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA368=null;
        HaxeParser.inherit_return inherit367 =null;

        HaxeParser.inherit_return inherit369 =null;


        Object COMMA368_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_inherit=new RewriteRuleSubtreeStream(adaptor,"rule inherit");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }

            // Haxe.g:417:17: ( inherit ( COMMA inherit )* -> ^( INHERIT_LIST[\"INHERIT_LIST\"] ( inherit )+ ) )
            // Haxe.g:417:19: inherit ( COMMA inherit )*
            {
            pushFollow(FOLLOW_inherit_in_inheritList5725);
            inherit367=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inherit.add(inherit367.getTree());

            // Haxe.g:417:27: ( COMMA inherit )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // Haxe.g:417:28: COMMA inherit
            	    {
            	    COMMA368=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList5728); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA368);


            	    pushFollow(FOLLOW_inherit_in_inheritList5730);
            	    inherit369=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_inherit.add(inherit369.getTree());

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
    // Haxe.g:420:1: inherit : ( EXTENDS ^ type | IMPLEMENTS ^ type );
    public final HaxeParser.inherit_return inherit() throws RecognitionException {
        HaxeParser.inherit_return retval = new HaxeParser.inherit_return();
        retval.start = input.LT(1);

        int inherit_StartIndex = input.index();

        Object root_0 = null;

        Token EXTENDS370=null;
        Token IMPLEMENTS372=null;
        HaxeParser.type_return type371 =null;

        HaxeParser.type_return type373 =null;


        Object EXTENDS370_tree=null;
        Object IMPLEMENTS372_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }

            // Haxe.g:420:17: ( EXTENDS ^ type | IMPLEMENTS ^ type )
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
                    // Haxe.g:420:19: EXTENDS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    EXTENDS370=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit5782); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS370_tree = 
                    (Object)adaptor.create(EXTENDS370)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(EXTENDS370_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5785);
                    type371=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type371.getTree());

                    }
                    break;
                case 2 :
                    // Haxe.g:421:19: IMPLEMENTS ^ type
                    {
                    root_0 = (Object)adaptor.nil();


                    IMPLEMENTS372=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit5805); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IMPLEMENTS372_tree = 
                    (Object)adaptor.create(IMPLEMENTS372)
                    ;
                    root_0 = (Object)adaptor.becomeRoot(IMPLEMENTS372_tree, root_0);
                    }

                    pushFollow(FOLLOW_type_in_inherit5808);
                    type373=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type373.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:424:1: typedefDecl : TYPEDEF ^ IDENTIFIER EQ ! funcType ;
    public final HaxeParser.typedefDecl_return typedefDecl() throws RecognitionException {
        HaxeParser.typedefDecl_return retval = new HaxeParser.typedefDecl_return();
        retval.start = input.LT(1);

        int typedefDecl_StartIndex = input.index();

        Object root_0 = null;

        Token TYPEDEF374=null;
        Token IDENTIFIER375=null;
        Token EQ376=null;
        HaxeParser.funcType_return funcType377 =null;


        Object TYPEDEF374_tree=null;
        Object IDENTIFIER375_tree=null;
        Object EQ376_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }

            // Haxe.g:424:17: ( TYPEDEF ^ IDENTIFIER EQ ! funcType )
            // Haxe.g:424:19: TYPEDEF ^ IDENTIFIER EQ ! funcType
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF374=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl5841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF374_tree = 
            (Object)adaptor.create(TYPEDEF374)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF374_tree, root_0);
            }

            IDENTIFIER375=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl5844); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER375_tree = 
            (Object)adaptor.create(IDENTIFIER375)
            ;
            adaptor.addChild(root_0, IDENTIFIER375_tree);
            }

            EQ376=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl5846); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_typedefDecl5849);
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
    // Haxe.g:427:1: typeExtend : GT ^ funcType ;
    public final HaxeParser.typeExtend_return typeExtend() throws RecognitionException {
        HaxeParser.typeExtend_return retval = new HaxeParser.typeExtend_return();
        retval.start = input.LT(1);

        int typeExtend_StartIndex = input.index();

        Object root_0 = null;

        Token GT378=null;
        HaxeParser.funcType_return funcType379 =null;


        Object GT378_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }

            // Haxe.g:427:17: ( GT ^ funcType )
            // Haxe.g:427:19: GT ^ funcType
            {
            root_0 = (Object)adaptor.nil();


            GT378=(Token)match(input,GT,FOLLOW_GT_in_typeExtend5883); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT378_tree = 
            (Object)adaptor.create(GT378)
            ;
            root_0 = (Object)adaptor.becomeRoot(GT378_tree, root_0);
            }

            pushFollow(FOLLOW_funcType_in_typeExtend5886);
            funcType379=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType379.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:430:1: objLit : LBRACE ! objLitElemList RBRACE !;
    public final HaxeParser.objLit_return objLit() throws RecognitionException {
        HaxeParser.objLit_return retval = new HaxeParser.objLit_return();
        retval.start = input.LT(1);

        int objLit_StartIndex = input.index();

        Object root_0 = null;

        Token LBRACE380=null;
        Token RBRACE382=null;
        HaxeParser.objLitElemList_return objLitElemList381 =null;


        Object LBRACE380_tree=null;
        Object RBRACE382_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }

            // Haxe.g:430:17: ( LBRACE ! objLitElemList RBRACE !)
            // Haxe.g:430:19: LBRACE ! objLitElemList RBRACE !
            {
            root_0 = (Object)adaptor.nil();


            LBRACE380=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit5920); if (state.failed) return retval;

            pushFollow(FOLLOW_objLitElemList_in_objLit5923);
            objLitElemList381=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList381.getTree());

            RBRACE382=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit5925); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:433:1: anonTypeField : IDENTIFIER COLON ! funcType ;
    public final HaxeParser.anonTypeField_return anonTypeField() throws RecognitionException {
        HaxeParser.anonTypeField_return retval = new HaxeParser.anonTypeField_return();
        retval.start = input.LT(1);

        int anonTypeField_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER383=null;
        Token COLON384=null;
        HaxeParser.funcType_return funcType385 =null;


        Object IDENTIFIER383_tree=null;
        Object COLON384_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }

            // Haxe.g:433:17: ( IDENTIFIER COLON ! funcType )
            // Haxe.g:433:19: IDENTIFIER COLON ! funcType
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER383=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField5953); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER383_tree = 
            (Object)adaptor.create(IDENTIFIER383)
            ;
            adaptor.addChild(root_0, IDENTIFIER383_tree);
            }

            COLON384=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField5955); if (state.failed) return retval;

            pushFollow(FOLLOW_funcType_in_anonTypeField5958);
            funcType385=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType385.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:436:1: objLitElemList : objLitElem ( COMMA ! objLitElem )* ;
    public final HaxeParser.objLitElemList_return objLitElemList() throws RecognitionException {
        HaxeParser.objLitElemList_return retval = new HaxeParser.objLitElemList_return();
        retval.start = input.LT(1);

        int objLitElemList_StartIndex = input.index();

        Object root_0 = null;

        Token COMMA387=null;
        HaxeParser.objLitElem_return objLitElem386 =null;

        HaxeParser.objLitElem_return objLitElem388 =null;


        Object COMMA387_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }

            // Haxe.g:436:17: ( objLitElem ( COMMA ! objLitElem )* )
            // Haxe.g:436:19: objLitElem ( COMMA ! objLitElem )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_objLitElem_in_objLitElemList5988);
            objLitElem386=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem386.getTree());

            // Haxe.g:436:30: ( COMMA ! objLitElem )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // Haxe.g:436:31: COMMA ! objLitElem
            	    {
            	    COMMA387=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList5991); if (state.failed) return retval;

            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList5994);
            	    objLitElem388=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem388.getTree());

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
    // Haxe.g:439:1: objLitElem : IDENTIFIER COLON ! expr ;
    public final HaxeParser.objLitElem_return objLitElem() throws RecognitionException {
        HaxeParser.objLitElem_return retval = new HaxeParser.objLitElem_return();
        retval.start = input.LT(1);

        int objLitElem_StartIndex = input.index();

        Object root_0 = null;

        Token IDENTIFIER389=null;
        Token COLON390=null;
        HaxeParser.expr_return expr391 =null;


        Object IDENTIFIER389_tree=null;
        Object COLON390_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }

            // Haxe.g:439:17: ( IDENTIFIER COLON ! expr )
            // Haxe.g:439:19: IDENTIFIER COLON ! expr
            {
            root_0 = (Object)adaptor.nil();


            IDENTIFIER389=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem6030); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER389_tree = 
            (Object)adaptor.create(IDENTIFIER389)
            ;
            adaptor.addChild(root_0, IDENTIFIER389_tree);
            }

            COLON390=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem6032); if (state.failed) return retval;

            pushFollow(FOLLOW_expr_in_objLitElem6035);
            expr391=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr391.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
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
    // Haxe.g:443:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final HaxeParser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        HaxeParser.elementarySymbol_return retval = new HaxeParser.elementarySymbol_return();
        retval.start = input.LT(1);

        int elementarySymbol_StartIndex = input.index();

        Object root_0 = null;

        Token LONGLITERAL392=null;
        Token NULL393=null;
        Token INTLITERAL394=null;
        Token STRINGLITERAL395=null;
        Token CHARLITERAL396=null;
        Token FLOATNUM397=null;
        Token TRUE398=null;
        Token FALSE399=null;

        Object LONGLITERAL392_tree=null;
        Object NULL393_tree=null;
        Object INTLITERAL394_tree=null;
        Object STRINGLITERAL395_tree=null;
        Object CHARLITERAL396_tree=null;
        Object FLOATNUM397_tree=null;
        Object TRUE398_tree=null;
        Object FALSE399_tree=null;
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

            // Haxe.g:444:5: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | NULL -> NULL[$NULL,\"Unknown<0>\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
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
                    // Haxe.g:444:7: LONGLITERAL
                    {
                    LONGLITERAL392=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol6069); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL392);


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
                        new ConstantNode(LONGLITERAL, LONGLITERAL392, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // Haxe.g:445:7: NULL
                    {
                    NULL393=(Token)match(input,NULL,FOLLOW_NULL_in_elementarySymbol6087); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NULL.add(NULL393);


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
                        new ConstantNode(NULL, NULL393, "Unknown<0>")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // Haxe.g:446:7: INTLITERAL
                    {
                    INTLITERAL394=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol6112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL394);


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
                        new ConstantNode(INTLITERAL, INTLITERAL394, "INT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // Haxe.g:447:7: STRINGLITERAL
                    {
                    STRINGLITERAL395=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol6131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL395);


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
                        new ConstantNode(STRINGLITERAL, STRINGLITERAL395, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // Haxe.g:448:7: CHARLITERAL
                    {
                    CHARLITERAL396=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol6147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL396);


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
                        new ConstantNode(CHARLITERAL, CHARLITERAL396, "STRING")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // Haxe.g:449:7: FLOATNUM
                    {
                    FLOATNUM397=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol6165); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM397);


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
                        new ConstantNode(FLOATNUM, FLOATNUM397, "FLOAT")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // Haxe.g:450:7: TRUE
                    {
                    TRUE398=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol6186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE398);


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
                        new ConstantNode(TRUE, TRUE398, "BOOL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // Haxe.g:451:7: FALSE
                    {
                    FALSE399=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol6211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE399);


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
                        new ConstantNode(FALSE, FALSE399, "BOOL")
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
        // Haxe.g:205:10: ( block )
        // Haxe.g:205:10: block
        {
        pushFollow(FOLLOW_block_in_synpred60_Haxe1987);
        block();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred60_Haxe

    // $ANTLR start synpred61_Haxe
    public final void synpred61_Haxe_fragment() throws RecognitionException {
        // Haxe.g:206:11: ( assignExpr )
        // Haxe.g:206:11: assignExpr
        {
        pushFollow(FOLLOW_assignExpr_in_synpred61_Haxe1999);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred61_Haxe

    // $ANTLR start synpred62_Haxe
    public final void synpred62_Haxe_fragment() throws RecognitionException {
        // Haxe.g:206:10: ( ( assignExpr | expr ) SEMI )
        // Haxe.g:206:10: ( assignExpr | expr ) SEMI
        {
        // Haxe.g:206:10: ( assignExpr | expr )
        int alt120=2;
        switch ( input.LA(1) ) {
        case SUB:
            {
            int LA120_1 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 1, input);

                throw nvae;

            }
            }
            break;
        case SUBSUB:
            {
            int LA120_2 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 2, input);

                throw nvae;

            }
            }
            break;
        case PLUSPLUS:
            {
            int LA120_3 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 3, input);

                throw nvae;

            }
            }
            break;
        case BANG:
            {
            int LA120_4 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 4, input);

                throw nvae;

            }
            }
            break;
        case TILDE:
            {
            int LA120_5 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 5, input);

                throw nvae;

            }
            }
            break;
        case NEW:
            {
            int LA120_6 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 6, input);

                throw nvae;

            }
            }
            break;
        case CAST:
            {
            int LA120_7 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 7, input);

                throw nvae;

            }
            }
            break;
        case LBRACE:
            {
            int LA120_8 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 8, input);

                throw nvae;

            }
            }
            break;
        case FUNCTION:
            {
            int LA120_9 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 9, input);

                throw nvae;

            }
            }
            break;
        case LONGLITERAL:
            {
            int LA120_10 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 10, input);

                throw nvae;

            }
            }
            break;
        case NULL:
            {
            int LA120_11 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 11, input);

                throw nvae;

            }
            }
            break;
        case INTLITERAL:
            {
            int LA120_12 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 12, input);

                throw nvae;

            }
            }
            break;
        case STRINGLITERAL:
            {
            int LA120_13 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 13, input);

                throw nvae;

            }
            }
            break;
        case CHARLITERAL:
            {
            int LA120_14 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 14, input);

                throw nvae;

            }
            }
            break;
        case FLOATNUM:
            {
            int LA120_15 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 15, input);

                throw nvae;

            }
            }
            break;
        case TRUE:
            {
            int LA120_16 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 16, input);

                throw nvae;

            }
            }
            break;
        case FALSE:
            {
            int LA120_17 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 17, input);

                throw nvae;

            }
            }
            break;
        case LPAREN:
            {
            int LA120_18 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 18, input);

                throw nvae;

            }
            }
            break;
        case IDENTIFIER:
            {
            int LA120_19 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 19, input);

                throw nvae;

            }
            }
            break;
        case THIS:
            {
            int LA120_20 = input.LA(2);

            if ( (synpred61_Haxe()) ) {
                alt120=1;
            }
            else if ( (true) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 20, input);

                throw nvae;

            }
            }
            break;
        case UNTYPED:
            {
            alt120=2;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 120, 0, input);

            throw nvae;

        }

        switch (alt120) {
            case 1 :
                // Haxe.g:206:11: assignExpr
                {
                pushFollow(FOLLOW_assignExpr_in_synpred62_Haxe1999);
                assignExpr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // Haxe.g:206:22: expr
                {
                pushFollow(FOLLOW_expr_in_synpred62_Haxe2001);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SEMI,FOLLOW_SEMI_in_synpred62_Haxe2004); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred62_Haxe

    // $ANTLR start synpred63_Haxe
    public final void synpred63_Haxe_fragment() throws RecognitionException {
        // Haxe.g:207:56: ( ELSE statement )
        // Haxe.g:207:56: ELSE statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred63_Haxe2036); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred63_Haxe2039);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_Haxe

    // $ANTLR start synpred77_Haxe
    public final void synpred77_Haxe_fragment() throws RecognitionException {
        // Haxe.g:216:8: ( IDENTIFIER COLON statement )
        // Haxe.g:216:8: IDENTIFIER COLON statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred77_Haxe2314); if (state.failed) return ;

        match(input,COLON,FOLLOW_COLON_in_synpred77_Haxe2316); if (state.failed) return ;

        pushFollow(FOLLOW_statement_in_synpred77_Haxe2318);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred77_Haxe

    // $ANTLR start synpred120_Haxe
    public final void synpred120_Haxe_fragment() throws RecognitionException {
        // Haxe.g:311:19: ( value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )? )
        // Haxe.g:311:19: value LPAREN ( exprList )? RPAREN ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred120_Haxe3973);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred120_Haxe3975); if (state.failed) return ;

        // Haxe.g:311:32: ( exprList )?
        int alt128=2;
        int LA128_0 = input.LA(1);

        if ( (LA128_0==BANG||LA128_0==CAST||LA128_0==CHARLITERAL||LA128_0==FALSE||LA128_0==FLOATNUM||LA128_0==FUNCTION||LA128_0==IDENTIFIER||LA128_0==INTLITERAL||LA128_0==LBRACE||(LA128_0 >= LONGLITERAL && LA128_0 <= LPAREN)||(LA128_0 >= NEW && LA128_0 <= NULL)||LA128_0==PLUSPLUS||(LA128_0 >= STRINGLITERAL && LA128_0 <= SUB)||LA128_0==SUBSUB||LA128_0==THIS||LA128_0==TILDE||LA128_0==TRUE||LA128_0==UNTYPED) ) {
            alt128=1;
        }
        switch (alt128) {
            case 1 :
                // Haxe.g:311:32: exprList
                {
                pushFollow(FOLLOW_exprList_in_synpred120_Haxe3977);
                exprList();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,RPAREN,FOLLOW_RPAREN_in_synpred120_Haxe3980); if (state.failed) return ;

        // Haxe.g:311:49: ( pureCallOrSlice )?
        int alt129=2;
        int LA129_0 = input.LA(1);

        if ( (LA129_0==DOT||LA129_0==LBRACKET) ) {
            alt129=1;
        }
        switch (alt129) {
            case 1 :
                // Haxe.g:311:49: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred120_Haxe3982);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred120_Haxe

    // $ANTLR start synpred122_Haxe
    public final void synpred122_Haxe_fragment() throws RecognitionException {
        // Haxe.g:313:19: ( value LBRACKET expr RBRACKET ( pureCallOrSlice )? )
        // Haxe.g:313:19: value LBRACKET expr RBRACKET ( pureCallOrSlice )?
        {
        pushFollow(FOLLOW_value_in_synpred122_Haxe4033);
        value();

        state._fsp--;
        if (state.failed) return ;

        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred122_Haxe4035); if (state.failed) return ;

        pushFollow(FOLLOW_expr_in_synpred122_Haxe4037);
        expr();

        state._fsp--;
        if (state.failed) return ;

        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred122_Haxe4039); if (state.failed) return ;

        // Haxe.g:313:48: ( pureCallOrSlice )?
        int alt130=2;
        int LA130_0 = input.LA(1);

        if ( (LA130_0==DOT||LA130_0==LBRACKET) ) {
            alt130=1;
        }
        switch (alt130) {
            case 1 :
                // Haxe.g:313:48: pureCallOrSlice
                {
                pushFollow(FOLLOW_pureCallOrSlice_in_synpred122_Haxe4041);
                pureCallOrSlice();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred122_Haxe

    // $ANTLR start synpred123_Haxe
    public final void synpred123_Haxe_fragment() throws RecognitionException {
        // Haxe.g:315:19: ( value pureCallOrSlice )
        // Haxe.g:315:19: value pureCallOrSlice
        {
        pushFollow(FOLLOW_value_in_synpred123_Haxe4092);
        value();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_pureCallOrSlice_in_synpred123_Haxe4095);
        pureCallOrSlice();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_Haxe

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
    public final boolean synpred123_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred123_Haxe_fragment(); // can never throw exception
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
    public final boolean synpred62_Haxe() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_Haxe_fragment(); // can never throw exception
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
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA84_eotS =
        "\4\uffff";
    static final String DFA84_eofS =
        "\4\uffff";
    static final String DFA84_minS =
        "\2\46\2\uffff";
    static final String DFA84_maxS =
        "\2\u00a2\2\uffff";
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
            return "359:1: classMember : ( varDeclClass | funcDecl );";
        }
    }
    static final String DFA95_eotS =
        "\5\uffff";
    static final String DFA95_eofS =
        "\5\uffff";
    static final String DFA95_minS =
        "\2\46\1\105\2\uffff";
    static final String DFA95_maxS =
        "\2\u0089\1\142\2\uffff";
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
            return "386:1: funcDecl : ( ( declAttrList )? FUNCTION NEW funcDeclPart -> ^( FUNCTION NEW ( declAttrList )? funcDeclPart ) | ( declAttrList )? FUNCTION IDENTIFIER ( typeParam )? funcDeclPart -> ^( FUNCTION IDENTIFIER ( declAttrList )? funcDeclPart ( typeParam )? ) );";
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
    public static final BitSet FOLLOW_RPAREN_in_funcLit1366 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcLit1369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
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
    public static final BitSet FOLLOW_block_in_statement1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_statement2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement2025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2031 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2033 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement2036 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2063 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_IN_in_statement2067 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_statement2069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2071 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2114 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement2136 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_parExpression_in_statement2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2176 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_catchStmt_in_statement2178 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_SWITCH_in_statement2199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_statement2205 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_statement2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_statement2213 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_caseStmt_in_statement2216 = new BitSet(new long[]{0x0000000200200000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_statement2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement2240 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B008L});
    public static final BitSet FOLLOW_expr_in_statement2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement2270 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_statement2273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_statement2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement2314 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_statement2316 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_statement2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression2381 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_parExpression2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block2410 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00C90060L,0x00000045035CB00AL});
    public static final BitSet FOLLOW_blockStmt_in_block2413 = new BitSet(new long[]{0x038A000886420200L,0x8400100C00C90060L,0x00000045035CB00AL});
    public static final BitSet FOLLOW_RBRACE_in_block2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2530 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2533 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2535 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_caseStmt2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2558 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2561 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_caseStmt2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2605 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L});
    public static final BitSet FOLLOW_param_in_catchStmt2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_catchStmt2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2651 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2654 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_exprList2657 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_UNTYPED_in_expr2699 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_assignExpr_in_expr2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2752 = new BitSet(new long[]{0x4000100000104082L,0x00000A0008000001L,0x0000000000004140L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2755 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_assignExpr2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2789 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2792 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2795 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2797 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_ternaryExpr_in_ternaryExpr2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2831 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2834 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2840 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2874 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2876 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_iterExpr_in_logicAndExpr2882 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2932 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2935 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_cmpExpr_in_iterExpr2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2980 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr3007 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr3036 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr3065 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr3094 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr3123 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr3152 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr3159 = new BitSet(new long[]{0x1800200000000402L,0x0000000003000000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3198 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_BAR_in_bitExpr3225 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr3254 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr3283 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr3290 = new BitSet(new long[]{0x0000000000081022L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3323 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr3350 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr3379 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr3408 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr3415 = new BitSet(new long[]{0xA000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3450 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr3477 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SUB_in_addExpr3506 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr3513 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3552 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_STAR_in_multExpr3579 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr3608 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr3637 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000000148B000L});
    public static final BitSet FOLLOW_unarExpr_in_multExpr3644 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_SUB_in_unarExpr3692 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3711 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3730 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_BANG_in_unarExpr3749 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_TILDE_in_unarExpr3768 = new BitSet(new long[]{0x0288000002400000L,0x0000000C00C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_unarExpr3795 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_unarExpr3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBSUB_in_unarExpr3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_prefixExpr3846 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_prefixExpr3849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3851 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_prefixExpr3854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_prefixExpr3878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_prefixExpr3881 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_prefixExpr3884 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_COMMA_in_prefixExpr3887 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_prefixExpr3890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_prefixExpr3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_prefixExpr3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice3973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_methodCallOrSlice3975 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_methodCallOrSlice3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_methodCallOrSlice3980 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_methodCallOrSlice4035 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_methodCallOrSlice4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_methodCallOrSlice4039 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4092 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_methodCallOrSlice4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_methodCallOrSlice4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_pureCallOrSlice4140 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B001L});
    public static final BitSet FOLLOW_expr_in_pureCallOrSlice4142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_pureCallOrSlice4145 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_pureCallOrSlice4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_pureCallOrSlice4201 = new BitSet(new long[]{0x0288000002000000L,0x0000000800C90020L,0x0000000001081000L});
    public static final BitSet FOLLOW_methodCallOrSlice_in_pureCallOrSlice4204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value4256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value4266 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_value4269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_value4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_value4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_enumDecl4402 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl4405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl4407 = new BitSet(new long[]{0x0000000000000000L,0x0000000001080000L});
    public static final BitSet FOLLOW_typeParam_in_enumDecl4409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_enumBody4461 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody4464 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000020L});
    public static final BitSet FOLLOW_RBRACE_in_enumBody4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl4514 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl4520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl4546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_classDecl4600 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl4603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl4605 = new BitSet(new long[]{0x0001000000000000L,0x0000000001080100L});
    public static final BitSet FOLLOW_typeParam_in_classDecl4607 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_classDecl4610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_classBodyScope4680 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_classMember_in_classBodyScope4683 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_RBRACE_in_classBodyScope4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclClass_in_classMember4733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classMember4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDeclClass4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_VAR_in_varDeclClass4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclClass4800 = new BitSet(new long[]{0x0000000008000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclClass4802 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_typeTag_in_varDeclClass4805 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_varInit_in_varDeclClass4807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDeclClass4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDecl4879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4882 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COMMA_in_varDecl4885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl4888 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_varDecl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPartList4918 = new BitSet(new long[]{0x0000100008000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_propDecl_in_varDeclPartList4920 = new BitSet(new long[]{0x0000100008000002L});
    public static final BitSet FOLLOW_typeTag_in_varDeclPartList4923 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_varInit_in_varDeclPartList4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl4977 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4981 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl4983 = new BitSet(new long[]{0x0000004200000000L,0x0000000A00000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl4987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl4989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit5148 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_varInit5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5194 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5197 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl5199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl5259 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl5264 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcDecl5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_funcDeclPart_in_funcDecl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_funcDeclPart5353 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcDeclPart5356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcDeclPart5359 = new BitSet(new long[]{0x0000000008000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcDeclPart5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_funcDeclPart5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5400 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5402 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5406 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5411 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl5457 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5461 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5466 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5471 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5473 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5520 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5524 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5529 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl5572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl5574 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_typeParam_in_funcProtoDecl5576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl5579 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl5584 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_typeTag_in_funcProtoDecl5586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelAccess_in_interfaceDecl5648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl5651 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_interfaceDecl5653 = new BitSet(new long[]{0x0001000000000000L,0x0000000000080100L});
    public static final BitSet FOLLOW_inheritList_in_interfaceDecl5655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl5658 = new BitSet(new long[]{0x0200004000000000L,0xA400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl5661 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody5687 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody5699 = new BitSet(new long[]{0x0200004000000000L,0x2400002000001000L,0x0000000400000200L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList5725 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList5728 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_inherit_in_inheritList5730 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit5782 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit5805 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_type_in_inherit5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl5844 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl5846 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend5883 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_typeExtend5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit5920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit5923 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField5953 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField5955 = new BitSet(new long[]{0x0040004000010000L,0x0000000000084020L,0x0000001000000800L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5988 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList5991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList5994 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem6030 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem6032 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_objLitElem6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_elementarySymbol6087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol6131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol6165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred56_Haxe1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filepath_in_synpred57_Haxe1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred58_Haxe1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred60_Haxe1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred61_Haxe1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred62_Haxe1999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_expr_in_synpred62_Haxe2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_SEMI_in_synpred62_Haxe2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred63_Haxe2036 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_synpred63_Haxe2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred77_Haxe2314 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_in_synpred77_Haxe2316 = new BitSet(new long[]{0x0388000882420200L,0x0000100C00C90060L,0x00000041035CB00AL});
    public static final BitSet FOLLOW_statement_in_synpred77_Haxe2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred120_Haxe3973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred120_Haxe3975 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B004L});
    public static final BitSet FOLLOW_exprList_in_synpred120_Haxe3977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_synpred120_Haxe3980 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred120_Haxe3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred122_Haxe4033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred122_Haxe4035 = new BitSet(new long[]{0x0288000002400200L,0x0000100C00C90020L,0x000000010148B000L});
    public static final BitSet FOLLOW_expr_in_synpred122_Haxe4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred122_Haxe4039 = new BitSet(new long[]{0x0000001000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred122_Haxe4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred123_Haxe4092 = new BitSet(new long[]{0x0000001000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_pureCallOrSlice_in_synpred123_Haxe4095 = new BitSet(new long[]{0x0000000000000002L});

}