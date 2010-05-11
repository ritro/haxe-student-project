// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g 2010-05-12 01:03:55

package haxe.imp.parser.antlr.main;

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.tree.specific.WhileNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class TinyHaxeTry1Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE", "SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG", "TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT", "ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT", "IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC", "OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ", "PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END", "PP_ERROR", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT", "BOOLEAN", "LT", "GT", "NEW", "IF", "ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT", "GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "CAST", "ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE", "PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS", "TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ"
    };
    public static final int CAST=93;
    public static final int FUNCTION=34;
    public static final int PACKAGE=15;
    public static final int EXPONENT=152;
    public static final int LT=51;
    public static final int STAR=86;
    public static final int WHILE=58;
    public static final int FLOATNUM=106;
    public static final int CONST=119;
    public static final int OCTAL_ESC=156;
    public static final int CASE=68;
    public static final int CHAR=118;
    public static final int NEW=53;
    public static final int EXTERN=96;
    public static final int DO=59;
    public static final int EOF=-1;
    public static final int GTGT=82;
    public static final int BREAK=66;
    public static final int LBRACKET=37;
    public static final int FINAL=121;
    public static final int RPAREN=36;
    public static final int IMPORT=19;
    public static final int SUBSUB=89;
    public static final int STAREQ=135;
    public static final int CARET=80;
    public static final int THIS=131;
    public static final int RETURN=64;
    public static final int DOUBLE=120;
    public static final int MONKEYS_AT=144;
    public static final int BARBAR=72;
    public static final int VAR=95;
    public static final int VOID=47;
    public static final int SUPER=130;
    public static final int GOTO=123;
    public static final int EQ=28;
    public static final int COMMENT=153;
    public static final int AMPAMP=73;
    public static final int VAR_INIT=13;
    public static final int LTLTEQ=148;
    public static final int QUES=27;
    public static final int EQEQ=74;
    public static final int HexPrefix=112;
    public static final int PP_IF=39;
    public static final int PERCENTDBBQ=140;
    public static final int RBRACE=63;
    public static final int STATIC=22;
    public static final int PRIVATE=21;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=61;
    public static final int NULL=92;
    public static final int GTGTEQ=149;
    public static final int STRICTFP=129;
    public static final int ELSE=55;
    public static final int NATIVE=126;
    public static final int ELLIPSIS=71;
    public static final int THROWS=132;
    public static final int INT=48;
    public static final int SLASHEQ=31;
    public static final int INTLITERAL=103;
    public static final int PERCENTBB=146;
    public static final int TRY=60;
    public static final int LongSuffix=111;
    public static final int LONGLITERAL=102;
    public static final int PERCENTLL=145;
    public static final int BANGEQQ=143;
    public static final int WS=109;
    public static final int PERCENTDLQ=138;
    public static final int INHERIT_LIST_OPT=11;
    public static final int CHARLITERAL=105;
    public static final int GT=52;
    public static final int INLINE=23;
    public static final int CATCH=70;
    public static final int FALSE=108;
    public static final int EscapeSequence=115;
    public static final int THROW=65;
    public static final int DYNAMIC=24;
    public static final int PROTECTED=127;
    public static final int CLASS=97;
    public static final int PP_ELSEIF=41;
    public static final int BAREQ=136;
    public static final int PP_ELSE=42;
    public static final int IntegerNumber=110;
    public static final int AMP=79;
    public static final int PLUSPLUS=90;
    public static final int LBRACE=62;
    public static final int TYPE_PARAM_OPT=10;
    public static final int LTEQ=77;
    public static final int SUBEQ=30;
    public static final int GTGTGT=83;
    public static final int Exponent=114;
    public static final int FOR=56;
    public static final int SUFFIX_EXPR=6;
    public static final int SUB=85;
    public static final int FLOAT=49;
    public static final int ABSTRACT=116;
    public static final int MINUS_BIGGER=46;
    public static final int PERCENTDBQ=139;
    public static final int HexDigit=113;
    public static final int PLUSEQ=29;
    public static final int LPAREN=35;
    public static final int IF=54;
    public static final int INTNUM=151;
    public static final int ESC_SEQ=157;
    public static final int PP_END=43;
    public static final int BOOLEAN=50;
    public static final int SLASH=87;
    public static final int IN=57;
    public static final int GTGTGTEQ=150;
    public static final int IMPLEMENTS=100;
    public static final int CONTINUE=67;
    public static final int COMMA=26;
    public static final int AMPEQ=33;
    public static final int TRANSIENT=133;
    public static final int IDENTIFIER=17;
    public static final int TILDE=91;
    public static final int BANGEQ=75;
    public static final int PLUS=84;
    public static final int RBRACKET=38;
    public static final int DOT=18;
    public static final int LTLT=81;
    public static final int BYTE=117;
    public static final int PERCENT=88;
    public static final int VOLATILE=134;
    public static final int DECL_ATTR_LIST=12;
    public static final int ASSIGN_OPERATOR=14;
    public static final int TYPEDEF=101;
    public static final int UNICODE_ESC=155;
    public static final int EQEQEQ=141;
    public static final int DEFAULT=69;
    public static final int HEX_DIGIT=154;
    public static final int SHORT=128;
    public static final int BANG=40;
    public static final int INSTANCEOF=124;
    public static final int PP_ERROR=44;
    public static final int GTEQ=76;
    public static final int MODULE=5;
    public static final int TRUE=107;
    public static final int SEMI=16;
    public static final int COLON=45;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=142;
    public static final int ENUM=94;
    public static final int FINALLY=122;
    public static final int PERCENTEQ=32;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=25;
    public static final int STRINGLITERAL=104;
    public static final int CARETEQ=137;
    public static final int PERCENTBBB=147;
    public static final int INTERFACE=98;
    public static final int LONG=125;
    public static final int EXTENDS=99;
    public static final int PUBLIC=20;
    public static final int TYPE_TAG=9;
    public static final int BAR=78;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "id", "parExpression", "synpred1_TinyHaxeTry1", 
        "continueStmt", "synpred92_TinyHaxeTry1", "synpred83_TinyHaxeTry1", 
        "catchStmt", "suffixExpr", "typeList", "synpred121_TinyHaxeTry1", 
        "synpred133_TinyHaxeTry1", "type", "synpred60_TinyHaxeTry1", "interfaceDecl", 
        "synpred87_TinyHaxeTry1", "synpred49_TinyHaxeTry1", "synpred78_TinyHaxeTry1", 
        "param", "synpred11_TinyHaxeTry1", "synpred110_TinyHaxeTry1", "myPackage", 
        "typeConstraint", "synpred20_TinyHaxeTry1", "synpred88_TinyHaxeTry1", 
        "synpred152_TinyHaxeTry1", "topLevelList", "synpred118_TinyHaxeTry1", 
        "synpred46_TinyHaxeTry1", "synpred90_TinyHaxeTry1", "synpred89_TinyHaxeTry1", 
        "pp", "synpred37_TinyHaxeTry1", "synpred109_TinyHaxeTry1", "shiftExpr", 
        "synpred127_TinyHaxeTry1", "synpred16_TinyHaxeTry1", "enumBody", 
        "caseStmt", "synpred137_TinyHaxeTry1", "synpred136_TinyHaxeTry1", 
        "synpred128_TinyHaxeTry1", "synpred105_TinyHaxeTry1", "enumValueDecl", 
        "logicOrExpr", "synpred85_TinyHaxeTry1", "synpred123_TinyHaxeTry1", 
        "synpred122_TinyHaxeTry1", "synpred156_TinyHaxeTry1", "synpred69_TinyHaxeTry1", 
        "synpred21_TinyHaxeTry1", "typeExtend", "synpred58_TinyHaxeTry1", 
        "varDeclPart", "multExpr", "iterExpr", "synpred42_TinyHaxeTry1", 
        "synpred150_TinyHaxeTry1", "interfaceBody", "ternaryExpr", "propDeclOpt", 
        "inheritList", "synpred134_TinyHaxeTry1", "synpred30_TinyHaxeTry1", 
        "synpred73_TinyHaxeTry1", "synpred96_TinyHaxeTry1", "synpred111_TinyHaxeTry1", 
        "ppElse", "synpred24_TinyHaxeTry1", "arrayLit", "synpred33_TinyHaxeTry1", 
        "cmpExpr", "synpred4_TinyHaxeTry1", "synpred29_TinyHaxeTry1", "objLitElemList", 
        "synpred3_TinyHaxeTry1", "synpred40_TinyHaxeTry1", "bitExpr", "synpred65_TinyHaxeTry1", 
        "synpred5_TinyHaxeTry1", "myImport", "synpred41_TinyHaxeTry1", "cast", 
        "anonTypeFieldList", "value", "synpred93_TinyHaxeTry1", "synpred95_TinyHaxeTry1", 
        "synpred59_TinyHaxeTry1", "synpred106_TinyHaxeTry1", "exprListOpt", 
        "elementarySymbol", "ppEnd", "module", "synpred36_TinyHaxeTry1", 
        "logicAndExpr", "synpred119_TinyHaxeTry1", "synpred154_TinyHaxeTry1", 
        "synpred66_TinyHaxeTry1", "synpred27_TinyHaxeTry1", "synpred32_TinyHaxeTry1", 
        "synpred153_TinyHaxeTry1", "synpred126_TinyHaxeTry1", "synpred145_TinyHaxeTry1", 
        "synpred48_TinyHaxeTry1", "synpred81_TinyHaxeTry1", "synpred151_TinyHaxeTry1", 
        "synpred149_TinyHaxeTry1", "objLit", "synpred79_TinyHaxeTry1", "funcDecl", 
        "funcType", "synpred70_TinyHaxeTry1", "synpred77_TinyHaxeTry1", 
        "synpred8_TinyHaxeTry1", "synpred82_TinyHaxeTry1", "synpred18_TinyHaxeTry1", 
        "synpred129_TinyHaxeTry1", "synpred107_TinyHaxeTry1", "dotIdent", 
        "synpred22_TinyHaxeTry1", "synpred25_TinyHaxeTry1", "synpred68_TinyHaxeTry1", 
        "synpred102_TinyHaxeTry1", "prefixExpr", "varInit", "synpred7_TinyHaxeTry1", 
        "synpred50_TinyHaxeTry1", "synpred141_TinyHaxeTry1", "synpred56_TinyHaxeTry1", 
        "synpred57_TinyHaxeTry1", "breakStmt", "synpred108_TinyHaxeTry1", 
        "synpred98_TinyHaxeTry1", "anonTypeField", "assignOp", "synpred43_TinyHaxeTry1", 
        "synpred75_TinyHaxeTry1", "synpred132_TinyHaxeTry1", "synpred2_TinyHaxeTry1", 
        "synpred64_TinyHaxeTry1", "propAccessor", "blockStmt", "synpred15_TinyHaxeTry1", 
        "funcProtoDecl", "varDecl", "ppElseIf", "topLevel", "synpred139_TinyHaxeTry1", 
        "synpred17_TinyHaxeTry1", "qualifiedIdentifier", "synpred116_TinyHaxeTry1", 
        "synpred117_TinyHaxeTry1", "classBodyScope", "synpred13_TinyHaxeTry1", 
        "topLevelDecl", "synpred97_TinyHaxeTry1", "typeTag", "synpred155_TinyHaxeTry1", 
        "synpred72_TinyHaxeTry1", "synpred55_TinyHaxeTry1", "synpred80_TinyHaxeTry1", 
        "synpred115_TinyHaxeTry1", "typeParamOpt", "synpred112_TinyHaxeTry1", 
        "inherit", "synpred114_TinyHaxeTry1", "synpred130_TinyHaxeTry1", 
        "declAttr", "synpred54_TinyHaxeTry1", "synpred74_TinyHaxeTry1", 
        "synpred120_TinyHaxeTry1", "synpred143_TinyHaxeTry1", "synpred62_TinyHaxeTry1", 
        "declAttrList", "synpred38_TinyHaxeTry1", "synpred19_TinyHaxeTry1", 
        "synpred84_TinyHaxeTry1", "synpred104_TinyHaxeTry1", "classBody", 
        "catchStmtList", "synpred47_TinyHaxeTry1", "synpred51_TinyHaxeTry1", 
        "defaultStmt", "newExpr", "synpred144_TinyHaxeTry1", "synpred131_TinyHaxeTry1", 
        "synpred146_TinyHaxeTry1", "synpred140_TinyHaxeTry1", "synpred52_TinyHaxeTry1", 
        "synpred148_TinyHaxeTry1", "inheritListOpt", "synpred53_TinyHaxeTry1", 
        "synpred101_TinyHaxeTry1", "synpred34_TinyHaxeTry1", "synpred142_TinyHaxeTry1", 
        "funcLit", "varDeclPartList", "synpred6_TinyHaxeTry1", "paramList", 
        "block", "synpred28_TinyHaxeTry1", "synpred86_TinyHaxeTry1", "typedefDecl", 
        "exprList", "access", "anonType", "synpred23_TinyHaxeTry1", "assignExpr", 
        "synpred61_TinyHaxeTry1", "typeParam", "synpred9_TinyHaxeTry1", 
        "synpred26_TinyHaxeTry1", "synpred113_TinyHaxeTry1", "synpred125_TinyHaxeTry1", 
        "synpred91_TinyHaxeTry1", "synpred14_TinyHaxeTry1", "varDeclList", 
        "synpred138_TinyHaxeTry1", "ppIf", "functionReturn", "functionVar", 
        "synpred100_TinyHaxeTry1", "synpred10_TinyHaxeTry1", "synpred67_TinyHaxeTry1", 
        "synpred99_TinyHaxeTry1", "objLitElem", "addExpr", "synpred35_TinyHaxeTry1", 
        "propDecl", "synpred63_TinyHaxeTry1", "synpred12_TinyHaxeTry1", 
        "ppError", "enumDecl", "statement", "synpred31_TinyHaxeTry1", "synpred147_TinyHaxeTry1", 
        "synpred44_TinyHaxeTry1", "synpred39_TinyHaxeTry1", "synpred45_TinyHaxeTry1", 
        "classDecl", "synpred71_TinyHaxeTry1", "synpred76_TinyHaxeTry1", 
        "typeTagOpt", "synpred124_TinyHaxeTry1", "expr", "synpred135_TinyHaxeTry1", 
        "synpred103_TinyHaxeTry1", "synpred94_TinyHaxeTry1"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[247+1];
             
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public TinyHaxeTry1Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
        this.state.ruleMemo = new HashMap[247+1];
         
         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:1: module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) ;
    public final TinyHaxeTry1Parser.module_return module() throws RecognitionException {
        TinyHaxeTry1Parser.module_return retval = new TinyHaxeTry1Parser.module_return();
        retval.start = input.LT(1);
        int module_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myPackage_return myPackage1 = null;

        TinyHaxeTry1Parser.topLevelList_return topLevelList2 = null;


        RewriteRuleSubtreeStream stream_myPackage=new RewriteRuleSubtreeStream(adaptor,"rule myPackage");
        RewriteRuleSubtreeStream stream_topLevelList=new RewriteRuleSubtreeStream(adaptor,"rule topLevelList");
        try { dbg.enterRule(getGrammarFileName(), "module");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:19: ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:21: ( myPackage )? topLevelList
            {
            dbg.location(46,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:21: ( myPackage )?
            int alt1=2;
            try { dbg.enterSubRule(1);
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: myPackage
                    {
                    dbg.location(46,21);
                    pushFollow(FOLLOW_myPackage_in_module119);
                    myPackage1=myPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_myPackage.add(myPackage1.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(1);}

            dbg.location(46,32);
            pushFollow(FOLLOW_topLevelList_in_module122);
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
            // 46:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
            {
                dbg.location(46,47);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:47: ^( MODULE[\"MODULE\",true] ( myPackage )? topLevelList )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(46,49);
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(MODULE, "MODULE", true), root_1);

                dbg.location(46,91);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:46:91: ( myPackage )?
                if ( stream_myPackage.hasNext() ) {
                    dbg.location(46,91);
                    adaptor.addChild(root_1, stream_myPackage.nextTree());

                }
                stream_myPackage.reset();
                dbg.location(46,102);
                adaptor.addChild(root_1, stream_topLevelList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, module_StartIndex); }
        }
        dbg.location(47, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "module");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "module"

    public static class topLevelList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:1: topLevelList : ( topLevel )* ;
    public final TinyHaxeTry1Parser.topLevelList_return topLevelList() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
        retval.start = input.LT(1);
        int topLevelList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.topLevel_return topLevel3 = null;



        try { dbg.enterRule(getGrammarFileName(), "topLevelList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:19: ( ( topLevel )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:22: ( topLevel )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(49,22);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:22: ( topLevel )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT||LA2_0==PP_IF||(LA2_0>=PP_ELSEIF && LA2_0<=PP_ERROR)||LA2_0==ENUM||(LA2_0>=EXTERN && LA2_0<=INTERFACE)||LA2_0==TYPEDEF) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:49:23: topLevel
            	    {
            	    dbg.location(49,23);
            	    pushFollow(FOLLOW_topLevel_in_topLevelList156);
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
            } finally {dbg.exitSubRule(2);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, topLevelList_StartIndex); }
        }
        dbg.location(50, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevelList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "topLevelList"

    public static class topLevel_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevel"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:51:1: topLevel : ( myImport | pp | topLevelDecl );
    public final TinyHaxeTry1Parser.topLevel_return topLevel() throws RecognitionException {
        TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
        retval.start = input.LT(1);
        int topLevel_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.myImport_return myImport4 = null;

        TinyHaxeTry1Parser.pp_return pp5 = null;

        TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl6 = null;



        try { dbg.enterRule(getGrammarFileName(), "topLevel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:51:19: ( myImport | pp | topLevelDecl )
            int alt3=3;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case IMPORT:
                {
                alt3=1;
                }
                break;
            case PP_IF:
            case PP_ELSEIF:
            case PP_ELSE:
            case PP_END:
            case PP_ERROR:
                {
                alt3=2;
                }
                break;
            case ENUM:
            case EXTERN:
            case CLASS:
            case INTERFACE:
            case TYPEDEF:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:51:21: myImport
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(51,21);
                    pushFollow(FOLLOW_myImport_in_topLevel175);
                    myImport4=myImport();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, myImport4.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:25: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(52,25);
                    pushFollow(FOLLOW_pp_in_topLevel201);
                    pp5=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp5.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:53:25: topLevelDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(53,25);
                    pushFollow(FOLLOW_topLevelDecl_in_topLevel227);
                    topLevelDecl6=topLevelDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, topLevelDecl6.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 3, topLevel_StartIndex); }
        }
        dbg.location(54, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "topLevel"

    public static class myPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myPackage"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:55:1: myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
    public final TinyHaxeTry1Parser.myPackage_return myPackage() throws RecognitionException {
        TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
        retval.start = input.LT(1);
        int myPackage_StartIndex = input.index();
        Object root_0 = null;

        Token PACKAGE7=null;
        Token SEMI9=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent8 = null;


        Object PACKAGE7_tree=null;
        Object SEMI9_tree=null;
        RewriteRuleTokenStream stream_PACKAGE=new RewriteRuleTokenStream(adaptor,"token PACKAGE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_dotIdent=new RewriteRuleSubtreeStream(adaptor,"rule dotIdent");
        try { dbg.enterRule(getGrammarFileName(), "myPackage");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:55:21: ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:55:23: PACKAGE dotIdent SEMI
            {
            dbg.location(55,23);
            PACKAGE7=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE.add(PACKAGE7);

            dbg.location(55,31);
            pushFollow(FOLLOW_dotIdent_in_myPackage248);
            dotIdent8=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dotIdent.add(dotIdent8.getTree());
            dbg.location(55,40);
            SEMI9=(Token)match(input,SEMI,FOLLOW_SEMI_in_myPackage250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI9);



            // AST REWRITE
            // elements: dotIdent, PACKAGE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:45: -> ^( PACKAGE dotIdent )
            {
                dbg.location(55,48);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:55:48: ^( PACKAGE dotIdent )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(55,50);
                root_1 = (Object)adaptor.becomeRoot(stream_PACKAGE.nextNode(), root_1);

                dbg.location(55,58);
                adaptor.addChild(root_1, stream_dotIdent.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, myPackage_StartIndex); }
        }
        dbg.location(56, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "myPackage");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "myPackage"

    public static class qualifiedIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:58:1: qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* ;
    public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        Object root_0 = null;

        Token a=null;
        Token ident=null;
        Token DOT10=null;

        Object a_tree=null;
        Object ident_tree=null;
        Object DOT10_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try { dbg.enterRule(getGrammarFileName(), "qualifiedIdentifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:5: ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:9: (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            {
            dbg.location(59,9);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:9: (a= IDENTIFIER -> $a)
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:12: a= IDENTIFIER
            {
            dbg.location(59,13);
            a=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier281); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(a);



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
            // 59:27: -> $a
            {
                dbg.location(59,31);
                adaptor.addChild(root_0, stream_a.nextNode());

            }

            retval.tree = root_0;}
            }

            dbg.location(59,37);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:37: ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier $ident) )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==DOT) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:41: DOT ident= IDENTIFIER
            	    {
            	    dbg.location(59,41);
            	    DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier297); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT10);

            	    dbg.location(59,50);
            	    ident=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_qualifiedIdentifier301); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENTIFIER.add(ident);



            	    // AST REWRITE
            	    // elements: qualifiedIdentifier, DOT, ident
            	    // token labels: ident
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleTokenStream stream_ident=new RewriteRuleTokenStream(adaptor,"token ident",ident);
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 59:63: -> ^( DOT $qualifiedIdentifier $ident)
            	    {
            	        dbg.location(59,67);
            	        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:67: ^( DOT $qualifiedIdentifier $ident)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(59,69);
            	        root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        dbg.location(59,73);
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        dbg.location(59,94);
            	        adaptor.addChild(root_1, stream_ident.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, qualifiedIdentifier_StartIndex); }
        }
        dbg.location(60, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qualifiedIdentifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class myImport_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "myImport"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:62:1: myImport : IMPORT dotIdent SEMI ;
    public final TinyHaxeTry1Parser.myImport_return myImport() throws RecognitionException {
        TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
        retval.start = input.LT(1);
        int myImport_StartIndex = input.index();
        Object root_0 = null;

        Token IMPORT11=null;
        Token SEMI13=null;
        TinyHaxeTry1Parser.dotIdent_return dotIdent12 = null;


        Object IMPORT11_tree=null;
        Object SEMI13_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "myImport");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(62, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:62:21: ( IMPORT dotIdent SEMI )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:62:23: IMPORT dotIdent SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(62,29);
            IMPORT11=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_myImport343); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT11_tree = (Object)adaptor.create(IMPORT11);
            root_0 = (Object)adaptor.becomeRoot(IMPORT11_tree, root_0);
            }
            dbg.location(62,31);
            pushFollow(FOLLOW_dotIdent_in_myImport346);
            dotIdent12=dotIdent();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent12.getTree());
            dbg.location(62,44);
            SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_myImport348); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, myImport_StartIndex); }
        }
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "myImport");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "myImport"

    public static class access_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "access"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:66:1: access : ( PUBLIC | PRIVATE );
    public final TinyHaxeTry1Parser.access_return access() throws RecognitionException {
        TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
        retval.start = input.LT(1);
        int access_StartIndex = input.index();
        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:66:19: ( PUBLIC | PRIVATE )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(66,19);
            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=PUBLIC && input.LA(1)<=PRIVATE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set14));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
            if ( state.backtracking>0 ) { memoize(input, 7, access_StartIndex); }
        }
        dbg.location(68, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "access");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "access"

    public static class declAttr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:69:1: declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
    public final TinyHaxeTry1Parser.declAttr_return declAttr() throws RecognitionException {
        TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
        retval.start = input.LT(1);
        int declAttr_StartIndex = input.index();
        Object root_0 = null;

        Token STATIC15=null;
        Token INLINE16=null;
        Token DYNAMIC17=null;
        Token OVERRIDE18=null;
        TinyHaxeTry1Parser.access_return access19 = null;


        Object STATIC15_tree=null;
        Object INLINE16_tree=null;
        Object DYNAMIC17_tree=null;
        Object OVERRIDE18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "declAttr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(69, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:69:19: ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
            int alt5=5;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt5=1;
                }
                break;
            case INLINE:
                {
                alt5=2;
                }
                break;
            case DYNAMIC:
                {
                alt5=3;
                }
                break;
            case OVERRIDE:
                {
                alt5=4;
                }
                break;
            case PUBLIC:
            case PRIVATE:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:69:21: STATIC
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(69,21);
                    STATIC15=(Token)match(input,STATIC,FOLLOW_STATIC_in_declAttr435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC15_tree = (Object)adaptor.create(STATIC15);
                    adaptor.addChild(root_0, STATIC15_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:70:24: INLINE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(70,24);
                    INLINE16=(Token)match(input,INLINE,FOLLOW_INLINE_in_declAttr460); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INLINE16_tree = (Object)adaptor.create(INLINE16);
                    adaptor.addChild(root_0, INLINE16_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:71:25: DYNAMIC
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(71,25);
                    DYNAMIC17=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declAttr486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DYNAMIC17_tree = (Object)adaptor.create(DYNAMIC17);
                    adaptor.addChild(root_0, DYNAMIC17_tree);
                    }

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:25: OVERRIDE
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(72,25);
                    OVERRIDE18=(Token)match(input,OVERRIDE,FOLLOW_OVERRIDE_in_declAttr512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OVERRIDE18_tree = (Object)adaptor.create(OVERRIDE18);
                    adaptor.addChild(root_0, OVERRIDE18_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:73:25: access
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(73,25);
                    pushFollow(FOLLOW_access_in_declAttr538);
                    access19=access();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access19.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, declAttr_StartIndex); }
        }
        dbg.location(74, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declAttr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declAttr"

    public static class declAttrList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttrList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:1: declAttrList : ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
    public final TinyHaxeTry1Parser.declAttrList_return declAttrList() throws RecognitionException {
        TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
        retval.start = input.LT(1);
        int declAttrList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.declAttr_return declAttr20 = null;


        RewriteRuleSubtreeStream stream_declAttr=new RewriteRuleSubtreeStream(adaptor,"rule declAttr");
        try { dbg.enterRule(getGrammarFileName(), "declAttrList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(75, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:19: ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:21: ( declAttr )+
            {
            dbg.location(75,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:21: ( declAttr )+
            int cnt6=0;
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PUBLIC && LA6_0<=OVERRIDE)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:22: declAttr
            	    {
            	    dbg.location(75,22);
            	    pushFollow(FOLLOW_declAttr_in_declAttrList553);
            	    declAttr20=declAttr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declAttr.add(declAttr20.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt6++;
            } while (true);
            } finally {dbg.exitSubRule(6);}



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
            // 75:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
            {
                dbg.location(75,36);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:75:36: ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(75,38);
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(DECL_ATTR_LIST, "DECL_ATTR_LIST", true), root_1);

                dbg.location(75,96);
                if ( !(stream_declAttr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_declAttr.hasNext() ) {
                    dbg.location(75,96);
                    adaptor.addChild(root_1, stream_declAttr.nextTree());

                }
                stream_declAttr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, declAttrList_StartIndex); }
        }
        dbg.location(76, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declAttrList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declAttrList"

    public static class paramList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:1: paramList : ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
    public final TinyHaxeTry1Parser.paramList_return paramList() throws RecognitionException {
        TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
        retval.start = input.LT(1);
        int paramList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA22=null;
        TinyHaxeTry1Parser.param_return param21 = null;

        TinyHaxeTry1Parser.param_return param23 = null;


        Object COMMA22_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try { dbg.enterRule(getGrammarFileName(), "paramList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(78, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:19: ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | )
            int alt8=2;
            try { dbg.enterDecision(8);

            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER||LA8_0==QUES) ) {
                alt8=1;
            }
            else if ( (LA8_0==RPAREN) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:21: param ( COMMA param )*
                    {
                    dbg.location(78,21);
                    pushFollow(FOLLOW_param_in_paramList594);
                    param21=param();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param.add(param21.getTree());
                    dbg.location(78,27);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:27: ( COMMA param )*
                    try { dbg.enterSubRule(7);

                    loop7:
                    do {
                        int alt7=2;
                        try { dbg.enterDecision(7);

                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        } finally {dbg.exitDecision(7);}

                        switch (alt7) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:28: COMMA param
                    	    {
                    	    dbg.location(78,28);
                    	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramList597); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA22);

                    	    dbg.location(78,34);
                    	    pushFollow(FOLLOW_param_in_paramList599);
                    	    param23=param();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_param.add(param23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(7);}



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
                    // 78:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                    {
                        dbg.location(78,45);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:78:45: ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(78,47);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PARAM_LIST, "PARAM_LIST", true), root_1);

                        dbg.location(78,97);
                        if ( !(stream_param.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_param.hasNext() ) {
                            dbg.location(78,97);
                            adaptor.addChild(root_1, stream_param.nextTree());

                        }
                        stream_param.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:80:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 10, paramList_StartIndex); }
        }
        dbg.location(80, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paramList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "paramList"

    public static class param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "param"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:1: param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) ;
    public final TinyHaxeTry1Parser.param_return param() throws RecognitionException {
        TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
        retval.start = input.LT(1);
        int param_StartIndex = input.index();
        Object root_0 = null;

        Token QUES24=null;
        Token IDENTIFIER25=null;
        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt26 = null;

        TinyHaxeTry1Parser.varInit_return varInit27 = null;


        Object QUES24_tree=null;
        Object IDENTIFIER25_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_QUES=new RewriteRuleTokenStream(adaptor,"token QUES");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_varInit=new RewriteRuleSubtreeStream(adaptor,"rule varInit");
        try { dbg.enterRule(getGrammarFileName(), "param");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:19: ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:20: ( QUES )? IDENTIFIER typeTagOpt varInit
            {
            dbg.location(81,20);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:20: ( QUES )?
            int alt9=2;
            try { dbg.enterSubRule(9);
            try { dbg.enterDecision(9);

            int LA9_0 = input.LA(1);

            if ( (LA9_0==QUES) ) {
                alt9=1;
            }
            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: QUES
                    {
                    dbg.location(81,20);
                    QUES24=(Token)match(input,QUES,FOLLOW_QUES_in_param638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUES.add(QUES24);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(9);}

            dbg.location(81,26);
            IDENTIFIER25=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param641); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER25);

            dbg.location(81,37);
            pushFollow(FOLLOW_typeTagOpt_in_param643);
            typeTagOpt26=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt26.getTree());
            dbg.location(81,48);
            pushFollow(FOLLOW_varInit_in_param645);
            varInit27=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varInit.add(varInit27.getTree());


            // AST REWRITE
            // elements: typeTagOpt, QUES, IDENTIFIER, varInit
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 81:56: -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
            {
                dbg.location(81,59);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:59: ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(81,61);
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, IDENTIFIER25, true), root_1);

                dbg.location(81,99);
                adaptor.addChild(root_1, new VarUsage(stream_IDENTIFIER.nextToken()));
                dbg.location(81,120);
                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                dbg.location(81,131);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:131: ( varInit )?
                if ( stream_varInit.hasNext() ) {
                    dbg.location(81,131);
                    adaptor.addChild(root_1, stream_varInit.nextTree());

                }
                stream_varInit.reset();
                dbg.location(81,140);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:140: ( QUES )?
                if ( stream_QUES.hasNext() ) {
                    dbg.location(81,140);
                    adaptor.addChild(root_1, stream_QUES.nextNode());

                }
                stream_QUES.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, param_StartIndex); }
        }
        dbg.location(82, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "param"

    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:84:1: id : IDENTIFIER ;
    public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
        TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
        retval.start = input.LT(1);
        int id_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER28=null;

        Object IDENTIFIER28_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "id");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:84:4: ( IDENTIFIER )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:84:6: IDENTIFIER
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(84,6);
            IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id679); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER28_tree = new VarUsage(IDENTIFIER28) ;
            adaptor.addChild(root_0, IDENTIFIER28_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, id_StartIndex); }
        }
        dbg.location(85, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "id"

    public static class dotIdent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotIdent"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:1: dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
    public final TinyHaxeTry1Parser.dotIdent_return dotIdent() throws RecognitionException {
        TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
        retval.start = input.LT(1);
        int dotIdent_StartIndex = input.index();
        Object root_0 = null;

        Token DOT30=null;
        TinyHaxeTry1Parser.id_return ident = null;

        TinyHaxeTry1Parser.id_return id29 = null;


        Object DOT30_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try { dbg.enterRule(getGrammarFileName(), "dotIdent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:9: ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:11: ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            {
            dbg.location(87,11);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:11: ( id -> id )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:12: id
            {
            dbg.location(87,12);
            pushFollow(FOLLOW_id_in_dotIdent693);
            id29=id();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_id.add(id29.getTree());


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
            // 87:15: -> id
            {
                dbg.location(87,18);
                adaptor.addChild(root_0, stream_id.nextTree());

            }

            retval.tree = root_0;}
            }

            dbg.location(87,22);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:22: ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==DOT) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:23: DOT ident= id
            	    {
            	    dbg.location(87,23);
            	    DOT30=(Token)match(input,DOT,FOLLOW_DOT_in_dotIdent701); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(DOT30);

            	    dbg.location(87,32);
            	    pushFollow(FOLLOW_id_in_dotIdent705);
            	    ident=id();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_id.add(ident.getTree());


            	    // AST REWRITE
            	    // elements: DOT, ident, dotIdent
            	    // token labels: 
            	    // rule labels: retval, ident
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident",ident!=null?ident.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 87:36: -> ^( DOT $dotIdent $ident)
            	    {
            	        dbg.location(87,38);
            	        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:87:38: ^( DOT $dotIdent $ident)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        dbg.location(87,40);
            	        root_1 = (Object)adaptor.becomeRoot(stream_DOT.nextNode(), root_1);

            	        dbg.location(87,44);
            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        dbg.location(87,54);
            	        adaptor.addChild(root_1, stream_ident.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, dotIdent_StartIndex); }
        }
        dbg.location(88, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dotIdent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "dotIdent"

    public static class assignOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignOp"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:1: assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
    public final TinyHaxeTry1Parser.assignOp_return assignOp() throws RecognitionException {
        TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
        retval.start = input.LT(1);
        int assignOp_StartIndex = input.index();
        Object root_0 = null;

        Token EQ31=null;
        Token PLUSEQ32=null;
        Token SUBEQ33=null;
        Token SLASHEQ34=null;
        Token PERCENTEQ35=null;
        Token AMPEQ36=null;

        Object EQ31_tree=null;
        Object PLUSEQ32_tree=null;
        Object SUBEQ33_tree=null;
        Object SLASHEQ34_tree=null;
        Object PERCENTEQ35_tree=null;
        Object AMPEQ36_tree=null;
        RewriteRuleTokenStream stream_SUBEQ=new RewriteRuleTokenStream(adaptor,"token SUBEQ");
        RewriteRuleTokenStream stream_SLASHEQ=new RewriteRuleTokenStream(adaptor,"token SLASHEQ");
        RewriteRuleTokenStream stream_PERCENTEQ=new RewriteRuleTokenStream(adaptor,"token PERCENTEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_AMPEQ=new RewriteRuleTokenStream(adaptor,"token AMPEQ");
        RewriteRuleTokenStream stream_PLUSEQ=new RewriteRuleTokenStream(adaptor,"token PLUSEQ");

        try { dbg.enterRule(getGrammarFileName(), "assignOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:9: ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ -> SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ -> PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
            int alt11=6;
            try { dbg.enterDecision(11);

            switch ( input.LA(1) ) {
            case EQ:
                {
                alt11=1;
                }
                break;
            case PLUSEQ:
                {
                alt11=2;
                }
                break;
            case SUBEQ:
                {
                alt11=3;
                }
                break;
            case SLASHEQ:
                {
                alt11=4;
                }
                break;
            case PERCENTEQ:
                {
                alt11=5;
                }
                break;
            case AMPEQ:
                {
                alt11=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:110:11: EQ
                    {
                    dbg.location(110,11);
                    EQ31=(Token)match(input,EQ,FOLLOW_EQ_in_assignOp737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ31);



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
                    // 110:14: -> EQ[$EQ]
                    {
                        dbg.location(110,17);
                        adaptor.addChild(root_0, new AssignOperationNode(EQ, EQ31));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:111:11: PLUSEQ
                    {
                    dbg.location(111,11);
                    PLUSEQ32=(Token)match(input,PLUSEQ,FOLLOW_PLUSEQ_in_assignOp757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSEQ.add(PLUSEQ32);



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
                    // 111:19: -> PLUSEQ[$PLUSEQ]
                    {
                        dbg.location(111,22);
                        adaptor.addChild(root_0, new AssignOperationNode(PLUSEQ, PLUSEQ32));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:112:11: SUBEQ
                    {
                    dbg.location(112,11);
                    SUBEQ33=(Token)match(input,SUBEQ,FOLLOW_SUBEQ_in_assignOp778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBEQ.add(SUBEQ33);



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
                    // 112:17: -> SUBEQ[$SUBEQ]
                    {
                        dbg.location(112,20);
                        adaptor.addChild(root_0, new AssignOperationNode(SUBEQ, SUBEQ33));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:113:11: SLASHEQ
                    {
                    dbg.location(113,11);
                    SLASHEQ34=(Token)match(input,SLASHEQ,FOLLOW_SLASHEQ_in_assignOp798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SLASHEQ.add(SLASHEQ34);



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
                    // 113:19: -> SLASHEQ[$SLASHEQ]
                    {
                        dbg.location(113,22);
                        adaptor.addChild(root_0, new AssignOperationNode(SLASHEQ, SLASHEQ34));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:114:4: PERCENTEQ
                    {
                    dbg.location(114,4);
                    PERCENTEQ35=(Token)match(input,PERCENTEQ,FOLLOW_PERCENTEQ_in_assignOp811); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PERCENTEQ.add(PERCENTEQ35);



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
                    // 115:4: -> PERCENTEQ[$PERCENTEQ]
                    {
                        dbg.location(115,7);
                        adaptor.addChild(root_0, new AssignOperationNode(PERCENTEQ, PERCENTEQ35));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:116:4: AMPEQ
                    {
                    dbg.location(116,4);
                    AMPEQ36=(Token)match(input,AMPEQ,FOLLOW_AMPEQ_in_assignOp827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AMPEQ.add(AMPEQ36);



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
                    // 116:10: -> AMPEQ[$AMPEQ]
                    {
                        dbg.location(116,13);
                        adaptor.addChild(root_0, new AssignOperationNode(AMPEQ, AMPEQ36));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 14, assignOp_StartIndex); }
        }
        dbg.location(122, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignOp"

    public static class funcLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:1: funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) ;
    public final TinyHaxeTry1Parser.funcLit_return funcLit() throws RecognitionException {
        TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
        retval.start = input.LT(1);
        int funcLit_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION37=null;
        Token LPAREN38=null;
        Token RPAREN40=null;
        TinyHaxeTry1Parser.paramList_return paramList39 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt41 = null;

        TinyHaxeTry1Parser.block_return block42 = null;


        Object FUNCTION37_tree=null;
        Object LPAREN38_tree=null;
        Object RPAREN40_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "funcLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:19: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION paramList typeTagOpt block ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:21: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            dbg.location(125,21);
            FUNCTION37=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcLit867); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION37);

            dbg.location(125,30);
            LPAREN38=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcLit869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN38);

            dbg.location(125,37);
            pushFollow(FOLLOW_paramList_in_funcLit871);
            paramList39=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList39.getTree());
            dbg.location(125,47);
            RPAREN40=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcLit873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN40);

            dbg.location(125,54);
            pushFollow(FOLLOW_typeTagOpt_in_funcLit875);
            typeTagOpt41=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt41.getTree());
            dbg.location(125,65);
            pushFollow(FOLLOW_block_in_funcLit877);
            block42=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block42.getTree());


            // AST REWRITE
            // elements: paramList, block, typeTagOpt, FUNCTION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:71: -> ^( FUNCTION paramList typeTagOpt block )
            {
                dbg.location(125,74);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:125:74: ^( FUNCTION paramList typeTagOpt block )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(125,76);
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                dbg.location(125,99);
                adaptor.addChild(root_1, stream_paramList.nextTree());
                dbg.location(125,109);
                adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                dbg.location(125,120);
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, funcLit_StartIndex); }
        }
        dbg.location(126, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "funcLit"

    public static class arrayLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:1: arrayLit : LBRACKET exprListOpt RBRACKET ;
    public final TinyHaxeTry1Parser.arrayLit_return arrayLit() throws RecognitionException {
        TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
        retval.start = input.LT(1);
        int arrayLit_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACKET43=null;
        Token RBRACKET45=null;
        TinyHaxeTry1Parser.exprListOpt_return exprListOpt44 = null;


        Object LBRACKET43_tree=null;
        Object RBRACKET45_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:18: ( LBRACKET exprListOpt RBRACKET )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:127:20: LBRACKET exprListOpt RBRACKET
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(127,28);
            LBRACKET43=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit909); if (state.failed) return retval;
            dbg.location(127,30);
            pushFollow(FOLLOW_exprListOpt_in_arrayLit912);
            exprListOpt44=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exprListOpt44.getTree());
            dbg.location(127,50);
            RBRACKET45=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit914); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, arrayLit_StartIndex); }
        }
        dbg.location(128, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayLit"

    public static class pp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pp"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    public final TinyHaxeTry1Parser.pp_return pp() throws RecognitionException {
        TinyHaxeTry1Parser.pp_return retval = new TinyHaxeTry1Parser.pp_return();
        retval.start = input.LT(1);
        int pp_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.ppIf_return ppIf46 = null;

        TinyHaxeTry1Parser.ppElseIf_return ppElseIf47 = null;

        TinyHaxeTry1Parser.ppElse_return ppElse48 = null;

        TinyHaxeTry1Parser.ppEnd_return ppEnd49 = null;

        TinyHaxeTry1Parser.ppError_return ppError50 = null;



        try { dbg.enterRule(getGrammarFileName(), "pp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
            int alt12=5;
            try { dbg.enterDecision(12);

            switch ( input.LA(1) ) {
            case PP_IF:
                {
                alt12=1;
                }
                break;
            case PP_ELSEIF:
                {
                alt12=2;
                }
                break;
            case PP_ELSE:
                {
                alt12=3;
                }
                break;
            case PP_END:
                {
                alt12=4;
                }
                break;
            case PP_ERROR:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:134:21: ppIf
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(134,21);
                    pushFollow(FOLLOW_ppIf_in_pp942);
                    ppIf46=ppIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppIf46.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:135:25: ppElseIf
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(135,25);
                    pushFollow(FOLLOW_ppElseIf_in_pp968);
                    ppElseIf47=ppElseIf();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElseIf47.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:136:25: ppElse
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(136,25);
                    pushFollow(FOLLOW_ppElse_in_pp994);
                    ppElse48=ppElse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppElse48.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:25: ppEnd
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(137,25);
                    pushFollow(FOLLOW_ppEnd_in_pp1020);
                    ppEnd49=ppEnd();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppEnd49.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:138:25: ppError
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(138,25);
                    pushFollow(FOLLOW_ppError_in_pp1046);
                    ppError50=ppError();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ppError50.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 17, pp_StartIndex); }
        }
        dbg.location(139, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pp"

    public static class ppIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppIf"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:140:1: ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppIf_return ppIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppIf_return retval = new TinyHaxeTry1Parser.ppIf_return();
        retval.start = input.LT(1);
        int ppIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_IF51=null;
        Token IDENTIFIER52=null;
        Token PP_IF53=null;
        Token BANG54=null;
        Token IDENTIFIER55=null;

        Object PP_IF51_tree=null;
        Object IDENTIFIER52_tree=null;
        Object PP_IF53_tree=null;
        Object BANG54_tree=null;
        Object IDENTIFIER55_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppIf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(140, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:140:19: ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
            int alt13=2;
            try { dbg.enterDecision(13);

            int LA13_0 = input.LA(1);

            if ( (LA13_0==PP_IF) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==IDENTIFIER) ) {
                    alt13=1;
                }
                else if ( (LA13_1==BANG) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:140:21: PP_IF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(140,21);
                    PP_IF51=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1068); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF51_tree = (Object)adaptor.create(PP_IF51);
                    adaptor.addChild(root_0, PP_IF51_tree);
                    }
                    dbg.location(140,27);
                    IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1070); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER52_tree = (Object)adaptor.create(IDENTIFIER52);
                    adaptor.addChild(root_0, IDENTIFIER52_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:25: PP_IF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(141,25);
                    PP_IF53=(Token)match(input,PP_IF,FOLLOW_PP_IF_in_ppIf1096); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_IF53_tree = (Object)adaptor.create(PP_IF53);
                    adaptor.addChild(root_0, PP_IF53_tree);
                    }
                    dbg.location(141,31);
                    BANG54=(Token)match(input,BANG,FOLLOW_BANG_in_ppIf1098); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG54_tree = (Object)adaptor.create(BANG54);
                    adaptor.addChild(root_0, BANG54_tree);
                    }
                    dbg.location(141,36);
                    IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1100); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER55_tree = (Object)adaptor.create(IDENTIFIER55);
                    adaptor.addChild(root_0, IDENTIFIER55_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, ppIf_StartIndex); }
        }
        dbg.location(142, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppIf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppIf"

    public static class ppElseIf_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElseIf"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:143:1: ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
    public final TinyHaxeTry1Parser.ppElseIf_return ppElseIf() throws RecognitionException {
        TinyHaxeTry1Parser.ppElseIf_return retval = new TinyHaxeTry1Parser.ppElseIf_return();
        retval.start = input.LT(1);
        int ppElseIf_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSEIF56=null;
        Token IDENTIFIER57=null;
        Token PP_ELSEIF58=null;
        Token BANG59=null;
        Token IDENTIFIER60=null;

        Object PP_ELSEIF56_tree=null;
        Object IDENTIFIER57_tree=null;
        Object PP_ELSEIF58_tree=null;
        Object BANG59_tree=null;
        Object IDENTIFIER60_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppElseIf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:143:19: ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==PP_ELSEIF) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==IDENTIFIER) ) {
                    alt14=1;
                }
                else if ( (LA14_1==BANG) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:143:21: PP_ELSEIF IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(143,21);
                    PP_ELSEIF56=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1118); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF56_tree = (Object)adaptor.create(PP_ELSEIF56);
                    adaptor.addChild(root_0, PP_ELSEIF56_tree);
                    }
                    dbg.location(143,31);
                    IDENTIFIER57=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER57_tree = (Object)adaptor.create(IDENTIFIER57);
                    adaptor.addChild(root_0, IDENTIFIER57_tree);
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:24: PP_ELSEIF BANG IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(144,24);
                    PP_ELSEIF58=(Token)match(input,PP_ELSEIF,FOLLOW_PP_ELSEIF_in_ppElseIf1145); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PP_ELSEIF58_tree = (Object)adaptor.create(PP_ELSEIF58);
                    adaptor.addChild(root_0, PP_ELSEIF58_tree);
                    }
                    dbg.location(144,34);
                    BANG59=(Token)match(input,BANG,FOLLOW_BANG_in_ppElseIf1147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BANG59_tree = (Object)adaptor.create(BANG59);
                    adaptor.addChild(root_0, BANG59_tree);
                    }
                    dbg.location(144,39);
                    IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER60_tree = (Object)adaptor.create(IDENTIFIER60);
                    adaptor.addChild(root_0, IDENTIFIER60_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 19, ppElseIf_StartIndex); }
        }
        dbg.location(145, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppElseIf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppElseIf"

    public static class ppElse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppElse"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:146:1: ppElse : PP_ELSE ;
    public final TinyHaxeTry1Parser.ppElse_return ppElse() throws RecognitionException {
        TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
        retval.start = input.LT(1);
        int ppElse_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ELSE61=null;

        Object PP_ELSE61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppElse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(146, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:146:19: ( PP_ELSE )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:146:21: PP_ELSE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(146,21);
            PP_ELSE61=(Token)match(input,PP_ELSE,FOLLOW_PP_ELSE_in_ppElse1169); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ELSE61_tree = (Object)adaptor.create(PP_ELSE61);
            adaptor.addChild(root_0, PP_ELSE61_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ppElse_StartIndex); }
        }
        dbg.location(147, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppElse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppElse"

    public static class ppEnd_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppEnd"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:1: ppEnd : PP_END ;
    public final TinyHaxeTry1Parser.ppEnd_return ppEnd() throws RecognitionException {
        TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
        retval.start = input.LT(1);
        int ppEnd_StartIndex = input.index();
        Object root_0 = null;

        Token PP_END62=null;

        Object PP_END62_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppEnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:19: ( PP_END )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:148:21: PP_END
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(148,21);
            PP_END62=(Token)match(input,PP_END,FOLLOW_PP_END_in_ppEnd1190); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_END62_tree = (Object)adaptor.create(PP_END62);
            adaptor.addChild(root_0, PP_END62_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, ppEnd_StartIndex); }
        }
        dbg.location(149, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppEnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppEnd"

    public static class ppError_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ppError"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:150:1: ppError : PP_ERROR ;
    public final TinyHaxeTry1Parser.ppError_return ppError() throws RecognitionException {
        TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
        retval.start = input.LT(1);
        int ppError_StartIndex = input.index();
        Object root_0 = null;

        Token PP_ERROR63=null;

        Object PP_ERROR63_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ppError");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:150:19: ( PP_ERROR )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:150:21: PP_ERROR
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(150,21);
            PP_ERROR63=(Token)match(input,PP_ERROR,FOLLOW_PP_ERROR_in_ppError1209); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PP_ERROR63_tree = (Object)adaptor.create(PP_ERROR63);
            adaptor.addChild(root_0, PP_ERROR63_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, ppError_StartIndex); }
        }
        dbg.location(151, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppError");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ppError"

    public static class typeTag_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTag"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:155:1: typeTag : COLON funcType ;
    public final TinyHaxeTry1Parser.typeTag_return typeTag() throws RecognitionException {
        TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
        retval.start = input.LT(1);
        int typeTag_StartIndex = input.index();
        Object root_0 = null;

        Token COLON64=null;
        TinyHaxeTry1Parser.funcType_return funcType65 = null;


        Object COLON64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeTag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:155:9: ( COLON funcType )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:155:11: COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(155,16);
            COLON64=(Token)match(input,COLON,FOLLOW_COLON_in_typeTag1222); if (state.failed) return retval;
            dbg.location(155,18);
            pushFollow(FOLLOW_funcType_in_typeTag1225);
            funcType65=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType65.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, typeTag_StartIndex); }
        }
        dbg.location(156, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeTag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeTag"

    public static class typeTagOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeTagOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:1: typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | );
    public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
        retval.start = input.LT(1);
        int typeTagOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeTag_return typeTag66 = null;


        RewriteRuleSubtreeStream stream_typeTag=new RewriteRuleSubtreeStream(adaptor,"rule typeTag");
        try { dbg.enterRule(getGrammarFileName(), "typeTagOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:2: ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | )
            int alt15=2;
            try { dbg.enterDecision(15);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==COLON) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF||LA15_0==SEMI||LA15_0==COMMA||LA15_0==EQ||LA15_0==RPAREN||LA15_0==LBRACE) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:4: typeTag
                    {
                    dbg.location(159,4);
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1237);
                    typeTag66=typeTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTag.add(typeTag66.getTree());


                    // AST REWRITE
                    // elements: typeTag
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                    {
                        dbg.location(159,15);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:159:15: ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(159,17);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_TAG, "TYPE_TAG", true), root_1);

                        dbg.location(159,63);
                        adaptor.addChild(root_1, stream_typeTag.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 24, typeTagOpt_StartIndex); }
        }
        dbg.location(161, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeTagOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeTagOpt"

    public static class typeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );
    public final TinyHaxeTry1Parser.typeList_return typeList() throws RecognitionException {
        TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
        retval.start = input.LT(1);
        int typeList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA68=null;
        Token COMMA71=null;
        TinyHaxeTry1Parser.funcType_return funcType67 = null;

        TinyHaxeTry1Parser.funcType_return funcType69 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint70 = null;

        TinyHaxeTry1Parser.typeConstraint_return typeConstraint72 = null;


        Object COMMA68_tree=null;
        Object COMMA71_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:9: ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* )
            int alt18=2;
            try { dbg.enterDecision(18);

            int LA18_0 = input.LA(1);

            if ( (LA18_0==DYNAMIC||LA18_0==COMMA||LA18_0==RPAREN||(LA18_0>=MINUS_BIGGER && LA18_0<=BOOLEAN)||LA18_0==GT||LA18_0==LBRACE) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENTIFIER) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==COLON) ) {
                    alt18=2;
                }
                else if ( (LA18_2==DOT||LA18_2==COMMA||LA18_2==RPAREN||LA18_2==MINUS_BIGGER||(LA18_2>=LT && LA18_2<=GT)) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(18);}

            switch (alt18) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:11: funcType ( COMMA funcType )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(163,11);
                    pushFollow(FOLLOW_funcType_in_typeList1262);
                    funcType67=funcType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType67.getTree());
                    dbg.location(163,20);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:20: ( COMMA funcType )*
                    try { dbg.enterSubRule(16);

                    loop16:
                    do {
                        int alt16=2;
                        try { dbg.enterDecision(16);

                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        } finally {dbg.exitDecision(16);}

                        switch (alt16) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:163:21: COMMA funcType
                    	    {
                    	    dbg.location(163,26);
                    	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1265); if (state.failed) return retval;
                    	    dbg.location(163,28);
                    	    pushFollow(FOLLOW_funcType_in_typeList1268);
                    	    funcType69=funcType();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType69.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(16);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:164:4: typeConstraint ( COMMA typeConstraint )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(164,4);
                    pushFollow(FOLLOW_typeConstraint_in_typeList1276);
                    typeConstraint70=typeConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint70.getTree());
                    dbg.location(164,19);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:164:19: ( COMMA typeConstraint )*
                    try { dbg.enterSubRule(17);

                    loop17:
                    do {
                        int alt17=2;
                        try { dbg.enterDecision(17);

                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        } finally {dbg.exitDecision(17);}

                        switch (alt17) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:164:20: COMMA typeConstraint
                    	    {
                    	    dbg.location(164,25);
                    	    COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeList1279); if (state.failed) return retval;
                    	    dbg.location(164,27);
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1282);
                    	    typeConstraint72=typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeConstraint72.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(17);}


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
            if ( state.backtracking>0 ) { memoize(input, 25, typeList_StartIndex); }
        }
        dbg.location(165, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeList"

    public static class funcType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcType"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:1: funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
    public final TinyHaxeTry1Parser.funcType_return funcType() throws RecognitionException {
        TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
        retval.start = input.LT(1);
        int funcType_StartIndex = input.index();
        Object root_0 = null;

        Token MINUS_BIGGER74=null;
        Token VOID76=null;
        TinyHaxeTry1Parser.type_return type73 = null;

        TinyHaxeTry1Parser.type_return type75 = null;


        Object MINUS_BIGGER74_tree=null;
        Object VOID76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "funcType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(167, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:9: ( ( type ) ( MINUS_BIGGER type )* | VOID )
            int alt20=2;
            try { dbg.enterDecision(20);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||(LA20_0>=SEMI && LA20_0<=IDENTIFIER)||LA20_0==IMPORT||LA20_0==DYNAMIC||LA20_0==COMMA||LA20_0==EQ||LA20_0==RPAREN||LA20_0==PP_IF||(LA20_0>=PP_ELSEIF && LA20_0<=PP_ERROR)||LA20_0==MINUS_BIGGER||(LA20_0>=INT && LA20_0<=BOOLEAN)||LA20_0==GT||(LA20_0>=LBRACE && LA20_0<=RBRACE)||LA20_0==ENUM||(LA20_0>=EXTERN && LA20_0<=INTERFACE)||LA20_0==TYPEDEF) ) {
                alt20=1;
            }
            else if ( (LA20_0==VOID) ) {
                int LA20_2 = input.LA(2);

                if ( (synpred32_TinyHaxeTry1()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:11: ( type ) ( MINUS_BIGGER type )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(167,11);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:11: ( type )
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:12: type
                    {
                    dbg.location(167,12);
                    pushFollow(FOLLOW_type_in_funcType1297);
                    type73=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type73.getTree());

                    }

                    dbg.location(167,18);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:18: ( MINUS_BIGGER type )*
                    try { dbg.enterSubRule(19);

                    loop19:
                    do {
                        int alt19=2;
                        try { dbg.enterDecision(19);

                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==MINUS_BIGGER) ) {
                            alt19=1;
                        }


                        } finally {dbg.exitDecision(19);}

                        switch (alt19) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:19: MINUS_BIGGER type
                    	    {
                    	    dbg.location(167,31);
                    	    MINUS_BIGGER74=(Token)match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_funcType1301); if (state.failed) return retval;
                    	    dbg.location(167,33);
                    	    pushFollow(FOLLOW_type_in_funcType1304);
                    	    type75=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type75.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(19);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:4: VOID
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(168,4);
                    VOID76=(Token)match(input,VOID,FOLLOW_VOID_in_funcType1311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID76_tree = (Object)adaptor.create(VOID76);
                    adaptor.addChild(root_0, VOID76_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 26, funcType_StartIndex); }
        }
        dbg.location(169, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "funcType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );
    public final TinyHaxeTry1Parser.type_return type() throws RecognitionException {
        TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Object root_0 = null;

        Token INT79=null;
        Token FLOAT80=null;
        Token DYNAMIC81=null;
        Token BOOLEAN82=null;
        Token VOID83=null;
        TinyHaxeTry1Parser.anonType_return anonType77 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent78 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam84 = null;


        Object INT79_tree=null;
        Object FLOAT80_tree=null;
        Object DYNAMIC81_tree=null;
        Object BOOLEAN82_tree=null;
        Object VOID83_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:6: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | )
            int alt23=2;
            try { dbg.enterDecision(23);

            try {
                isCyclicDecision = true;
                alt23 = dfa23.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(171,8);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
                    int alt21=7;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    switch ( input.LA(1) ) {
                    case LBRACE:
                        {
                        alt21=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt21=2;
                        }
                        break;
                    case INT:
                        {
                        alt21=3;
                        }
                        break;
                    case FLOAT:
                        {
                        alt21=4;
                        }
                        break;
                    case DYNAMIC:
                        {
                        alt21=5;
                        }
                        break;
                    case BOOLEAN:
                        {
                        alt21=6;
                        }
                        break;
                    case VOID:
                        {
                        alt21=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:9: anonType
                            {
                            dbg.location(171,9);
                            pushFollow(FOLLOW_anonType_in_type1323);
                            anonType77=anonType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonType77.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:20: dotIdent
                            {
                            dbg.location(171,20);
                            pushFollow(FOLLOW_dotIdent_in_type1327);
                            dotIdent78=dotIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent78.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:30: INT
                            {
                            dbg.location(171,30);
                            INT79=(Token)match(input,INT,FOLLOW_INT_in_type1330); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INT79_tree = (Object)adaptor.create(INT79);
                            adaptor.addChild(root_0, INT79_tree);
                            }

                            }
                            break;
                        case 4 :
                            dbg.enterAlt(4);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:35: FLOAT
                            {
                            dbg.location(171,35);
                            FLOAT80=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_type1333); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FLOAT80_tree = (Object)adaptor.create(FLOAT80);
                            adaptor.addChild(root_0, FLOAT80_tree);
                            }

                            }
                            break;
                        case 5 :
                            dbg.enterAlt(5);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:42: DYNAMIC
                            {
                            dbg.location(171,42);
                            DYNAMIC81=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_type1336); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DYNAMIC81_tree = (Object)adaptor.create(DYNAMIC81);
                            adaptor.addChild(root_0, DYNAMIC81_tree);
                            }

                            }
                            break;
                        case 6 :
                            dbg.enterAlt(6);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:50: BOOLEAN
                            {
                            dbg.location(171,50);
                            BOOLEAN82=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type1338); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BOOLEAN82_tree = (Object)adaptor.create(BOOLEAN82);
                            adaptor.addChild(root_0, BOOLEAN82_tree);
                            }

                            }
                            break;
                        case 7 :
                            dbg.enterAlt(7);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:58: VOID
                            {
                            dbg.location(171,58);
                            VOID83=(Token)match(input,VOID,FOLLOW_VOID_in_type1340); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VOID83_tree = (Object)adaptor.create(VOID83);
                            adaptor.addChild(root_0, VOID83_tree);
                            }

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(171,64);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:64: ( typeParam )*
                    try { dbg.enterSubRule(22);

                    loop22:
                    do {
                        int alt22=2;
                        try { dbg.enterDecision(22);

                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==LT) ) {
                            alt22=1;
                        }


                        } finally {dbg.exitDecision(22);}

                        switch (alt22) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:65: typeParam
                    	    {
                    	    dbg.location(171,65);
                    	    pushFollow(FOLLOW_typeParam_in_type1344);
                    	    typeParam84=typeParam();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParam84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(22);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:173:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 27, type_StartIndex); }
        }
        dbg.location(173, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class typeParam_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParam"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:1: typeParam : LT typeList GT ;
    public final TinyHaxeTry1Parser.typeParam_return typeParam() throws RecognitionException {
        TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
        retval.start = input.LT(1);
        int typeParam_StartIndex = input.index();
        Object root_0 = null;

        Token LT85=null;
        Token GT87=null;
        TinyHaxeTry1Parser.typeList_return typeList86 = null;


        Object LT85_tree=null;
        Object GT87_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeParam");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:176:2: ( LT typeList GT )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:176:4: LT typeList GT
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(176,6);
            LT85=(Token)match(input,LT,FOLLOW_LT_in_typeParam1362); if (state.failed) return retval;
            dbg.location(176,8);
            pushFollow(FOLLOW_typeList_in_typeParam1365);
            typeList86=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList86.getTree());
            dbg.location(176,19);
            GT87=(Token)match(input,GT,FOLLOW_GT_in_typeParam1367); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, typeParam_StartIndex); }
        }
        dbg.location(177, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParam");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeParam"

    public static class typeParamOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeParamOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );
    public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt() throws RecognitionException {
        TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
        retval.start = input.LT(1);
        int typeParamOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.typeParam_return typeParam88 = null;


        RewriteRuleSubtreeStream stream_typeParam=new RewriteRuleSubtreeStream(adaptor,"rule typeParam");
        try { dbg.enterRule(getGrammarFileName(), "typeParamOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(179, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:19: ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | )
            int alt24=2;
            try { dbg.enterDecision(24);

            try {
                isCyclicDecision = true;
                alt24 = dfa24.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:21: typeParam
                    {
                    dbg.location(179,21);
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1384);
                    typeParam88=typeParam();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParam.add(typeParam88.getTree());


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
                    // 179:30: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
                    {
                        dbg.location(179,32);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:32: ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(179,34);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(TYPE_PARAM_OPT, "TYPE_PARAM_OPT", true), root_1);

                        dbg.location(179,92);
                        adaptor.addChild(root_1, stream_typeParam.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:181:8: 
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
            if ( state.backtracking>0 ) { memoize(input, 29, typeParamOpt_StartIndex); }
        }
        dbg.location(181, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParamOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeParamOpt"

    public static class typeConstraint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeConstraint"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:1: typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) ;
    public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint() throws RecognitionException {
        TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
        retval.start = input.LT(1);
        int typeConstraint_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER89=null;
        Token COLON90=null;
        Token LPAREN91=null;
        Token RPAREN93=null;
        TinyHaxeTry1Parser.typeList_return typeList92 = null;


        Object IDENTIFIER89_tree=null;
        Object COLON90_tree=null;
        Object LPAREN91_tree=null;
        Object RPAREN93_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_typeList=new RewriteRuleSubtreeStream(adaptor,"rule typeList");
        try { dbg.enterRule(getGrammarFileName(), "typeConstraint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:19: ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint IDENTIFIER typeList ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:21: IDENTIFIER COLON LPAREN typeList RPAREN
            {
            dbg.location(182,21);
            IDENTIFIER89=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1416); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER89);

            dbg.location(182,32);
            COLON90=(Token)match(input,COLON,FOLLOW_COLON_in_typeConstraint1418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(COLON90);

            dbg.location(182,38);
            LPAREN91=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1420); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN91);

            dbg.location(182,45);
            pushFollow(FOLLOW_typeList_in_typeConstraint1422);
            typeList92=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeList.add(typeList92.getTree());
            dbg.location(182,54);
            RPAREN93=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN93);



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
            // 182:61: -> ^( $typeConstraint IDENTIFIER typeList )
            {
                dbg.location(182,64);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:64: ^( $typeConstraint IDENTIFIER typeList )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(182,66);
                root_1 = (Object)adaptor.becomeRoot(stream_retval.nextNode(), root_1);

                dbg.location(182,82);
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                dbg.location(182,93);
                adaptor.addChild(root_1, stream_typeList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, typeConstraint_StartIndex); }
        }
        dbg.location(183, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeConstraint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeConstraint"

    public static class functionReturn_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionReturn"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:1: functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) ;
    public final TinyHaxeTry1Parser.functionReturn_return functionReturn() throws RecognitionException {
        TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
        retval.start = input.LT(1);
        int functionReturn_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION95=null;
        Token NEW96=null;
        Token LPAREN97=null;
        Token RPAREN99=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList94 = null;

        TinyHaxeTry1Parser.paramList_return paramList98 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt100 = null;

        TinyHaxeTry1Parser.block_return block101 = null;


        Object FUNCTION95_tree=null;
        Object NEW96_tree=null;
        Object LPAREN97_tree=null;
        Object RPAREN99_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "functionReturn");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(186, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:2: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:4: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
            {
            dbg.location(187,4);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:4: ( declAttrList )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25);

            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=PUBLIC && LA25_0<=OVERRIDE)) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: declAttrList
                    {
                    dbg.location(187,4);
                    pushFollow(FOLLOW_declAttrList_in_functionReturn1448);
                    declAttrList94=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList94.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(187,18);
            FUNCTION95=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionReturn1451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION95);

            dbg.location(187,27);
            NEW96=(Token)match(input,NEW,FOLLOW_NEW_in_functionReturn1453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW96);

            dbg.location(187,31);
            LPAREN97=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionReturn1455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN97);

            dbg.location(187,38);
            pushFollow(FOLLOW_paramList_in_functionReturn1457);
            paramList98=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList98.getTree());
            dbg.location(187,48);
            RPAREN99=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionReturn1459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN99);

            dbg.location(187,55);
            pushFollow(FOLLOW_typeTagOpt_in_functionReturn1461);
            typeTagOpt100=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt100.getTree());
            dbg.location(187,66);
            pushFollow(FOLLOW_block_in_functionReturn1463);
            block101=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block101.getTree());


            // AST REWRITE
            // elements: FUNCTION, block, typeTagOpt, NEW, paramList, declAttrList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
            {
                dbg.location(187,75);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:75: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(187,77);
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                dbg.location(187,100);
                adaptor.addChild(root_1, stream_NEW.nextNode());
                dbg.location(187,104);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:104: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    dbg.location(187,104);
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                dbg.location(187,118);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:118: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    dbg.location(187,118);
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                dbg.location(187,129);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:129: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    dbg.location(187,129);
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                dbg.location(187,141);
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, functionReturn_StartIndex); }
        }
        dbg.location(188, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionReturn");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionReturn"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );
    public final TinyHaxeTry1Parser.statement_return statement() throws RecognitionException {
        TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        Token SEMI104=null;
        Token IF106=null;
        Token ELSE108=null;
        Token FOR109=null;
        Token LPAREN110=null;
        Token IN111=null;
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
        Token BREAK138=null;
        Token IDENTIFIER139=null;
        Token SEMI140=null;
        Token CONTINUE141=null;
        Token IDENTIFIER142=null;
        Token SEMI143=null;
        Token SEMI145=null;
        Token IDENTIFIER146=null;
        Token COLON147=null;
        Token SEMI149=null;
        TinyHaxeTry1Parser.statement_return st1 = null;

        TinyHaxeTry1Parser.statement_return st2 = null;

        TinyHaxeTry1Parser.expr_return exp1 = null;

        TinyHaxeTry1Parser.expr_return exp2 = null;

        TinyHaxeTry1Parser.block_return block102 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr103 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl105 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression107 = null;

        TinyHaxeTry1Parser.statement_return statement113 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression115 = null;

        TinyHaxeTry1Parser.statement_return statement116 = null;

        TinyHaxeTry1Parser.statement_return statement118 = null;

        TinyHaxeTry1Parser.parExpression_return parExpression120 = null;

        TinyHaxeTry1Parser.block_return block123 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList124 = null;

        TinyHaxeTry1Parser.expr_return expr127 = null;

        TinyHaxeTry1Parser.caseStmt_return caseStmt130 = null;

        TinyHaxeTry1Parser.expr_return expr133 = null;

        TinyHaxeTry1Parser.expr_return expr136 = null;

        TinyHaxeTry1Parser.expr_return expr144 = null;

        TinyHaxeTry1Parser.statement_return statement148 = null;


        Object SEMI104_tree=null;
        Object IF106_tree=null;
        Object ELSE108_tree=null;
        Object FOR109_tree=null;
        Object LPAREN110_tree=null;
        Object IN111_tree=null;
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
        Object BREAK138_tree=null;
        Object IDENTIFIER139_tree=null;
        Object SEMI140_tree=null;
        Object CONTINUE141_tree=null;
        Object IDENTIFIER142_tree=null;
        Object SEMI143_tree=null;
        Object SEMI145_tree=null;
        Object IDENTIFIER146_tree=null;
        Object COLON147_tree=null;
        Object SEMI149_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_parExpression=new RewriteRuleSubtreeStream(adaptor,"rule parExpression");
        RewriteRuleSubtreeStream stream_caseStmt=new RewriteRuleSubtreeStream(adaptor,"rule caseStmt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_catchStmtList=new RewriteRuleSubtreeStream(adaptor,"rule catchStmtList");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:2: ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI )
            int alt31=16;
            try { dbg.enterDecision(31);

            try {
                isCyclicDecision = true;
                alt31 = dfa31.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:4: block
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(191,4);
                    pushFollow(FOLLOW_block_in_statement1499);
                    block102=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block102.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:4: assignExpr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(192,4);
                    pushFollow(FOLLOW_assignExpr_in_statement1504);
                    assignExpr103=assignExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr103.getTree());
                    dbg.location(192,19);
                    SEMI104=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1506); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:193:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(193,4);
                    pushFollow(FOLLOW_varDecl_in_statement1512);
                    varDecl105=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl105.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:4: IF parExpression st1= statement ( ELSE st2= statement )?
                    {
                    dbg.location(194,4);
                    IF106=(Token)match(input,IF,FOLLOW_IF_in_statement1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF106);

                    dbg.location(194,7);
                    pushFollow(FOLLOW_parExpression_in_statement1519);
                    parExpression107=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression107.getTree());
                    dbg.location(194,24);
                    pushFollow(FOLLOW_statement_in_statement1523);
                    st1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(st1.getTree());
                    dbg.location(194,35);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:35: ( ELSE st2= statement )?
                    int alt26=2;
                    try { dbg.enterSubRule(26);
                    try { dbg.enterDecision(26);

                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ELSE) ) {
                        int LA26_1 = input.LA(2);

                        if ( (synpred46_TinyHaxeTry1()) ) {
                            alt26=1;
                        }
                    }
                    } finally {dbg.exitDecision(26);}

                    switch (alt26) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:36: ELSE st2= statement
                            {
                            dbg.location(194,36);
                            ELSE108=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement1526); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(ELSE108);

                            dbg.location(194,44);
                            pushFollow(FOLLOW_statement_in_statement1530);
                            st2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(st2.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(26);}



                    // AST REWRITE
                    // elements: st1, st2, ELSE, parExpression, IF
                    // token labels: 
                    // rule labels: retval, st1, st2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_st1=new RewriteRuleSubtreeStream(adaptor,"rule st1",st1!=null?st1.tree:null);
                    RewriteRuleSubtreeStream stream_st2=new RewriteRuleSubtreeStream(adaptor,"rule st2",st2!=null?st2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:57: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                    {
                        dbg.location(194,60);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:60: ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(194,62);
                        root_1 = (Object)adaptor.becomeRoot(new IfNode(stream_IF.nextToken()), root_1);

                        dbg.location(194,73);
                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        dbg.location(194,87);
                        adaptor.addChild(root_1, stream_st1.nextTree());
                        dbg.location(194,92);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:92: ( ^( ELSE $st2) )?
                        if ( stream_st2.hasNext()||stream_ELSE.hasNext() ) {
                            dbg.location(194,92);
                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:92: ^( ELSE $st2)
                            {
                            Object root_2 = (Object)adaptor.nil();
                            dbg.location(194,94);
                            root_2 = (Object)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                            dbg.location(194,99);
                            adaptor.addChild(root_2, stream_st2.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_st2.reset();
                        stream_ELSE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:4: FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
                    {
                    dbg.location(195,4);
                    FOR109=(Token)match(input,FOR,FOLLOW_FOR_in_statement1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR.add(FOR109);

                    dbg.location(195,8);
                    LPAREN110=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN110);

                    dbg.location(195,19);
                    pushFollow(FOLLOW_expr_in_statement1575);
                    exp1=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp1.getTree());
                    dbg.location(195,25);
                    IN111=(Token)match(input,IN,FOLLOW_IN_in_statement1577); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(IN111);

                    dbg.location(195,32);
                    pushFollow(FOLLOW_expr_in_statement1581);
                    exp2=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(exp2.getTree());
                    dbg.location(195,38);
                    RPAREN112=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1583); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN112);

                    dbg.location(195,45);
                    pushFollow(FOLLOW_statement_in_statement1585);
                    statement113=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());


                    // AST REWRITE
                    // elements: statement, FOR, IN, exp2, exp1
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
                    // 195:55: -> ^( FOR ^( IN $exp1 $exp2) statement )
                    {
                        dbg.location(195,58);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:58: ^( FOR ^( IN $exp1 $exp2) statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(195,60);
                        root_1 = (Object)adaptor.becomeRoot(new ForNode(stream_FOR.nextToken()), root_1);

                        dbg.location(195,73);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:195:73: ^( IN $exp1 $exp2)
                        {
                        Object root_2 = (Object)adaptor.nil();
                        dbg.location(195,75);
                        root_2 = (Object)adaptor.becomeRoot(stream_IN.nextNode(), root_2);

                        dbg.location(195,78);
                        adaptor.addChild(root_2, stream_exp1.nextTree());
                        dbg.location(195,84);
                        adaptor.addChild(root_2, stream_exp2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(195,91);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:196:4: WHILE parExpression statement
                    {
                    dbg.location(196,4);
                    WHILE114=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE114);

                    dbg.location(196,10);
                    pushFollow(FOLLOW_parExpression_in_statement1613);
                    parExpression115=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression115.getTree());
                    dbg.location(196,24);
                    pushFollow(FOLLOW_statement_in_statement1615);
                    statement116=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement116.getTree());


                    // AST REWRITE
                    // elements: WHILE, statement, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 196:34: -> ^( WHILE parExpression statement )
                    {
                        dbg.location(196,37);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:196:37: ^( WHILE parExpression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(196,39);
                        root_1 = (Object)adaptor.becomeRoot(new WhileNode(stream_WHILE.nextToken()), root_1);

                        dbg.location(196,56);
                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        dbg.location(196,70);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:197:4: DO statement WHILE parExpression SEMI
                    {
                    dbg.location(197,4);
                    DO117=(Token)match(input,DO,FOLLOW_DO_in_statement1633); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO.add(DO117);

                    dbg.location(197,7);
                    pushFollow(FOLLOW_statement_in_statement1635);
                    statement118=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement118.getTree());
                    dbg.location(197,17);
                    WHILE119=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE.add(WHILE119);

                    dbg.location(197,23);
                    pushFollow(FOLLOW_parExpression_in_statement1639);
                    parExpression120=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parExpression.add(parExpression120.getTree());
                    dbg.location(197,37);
                    SEMI121=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI121);



                    // AST REWRITE
                    // elements: statement, DO, parExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:42: -> ^( DO parExpression statement )
                    {
                        dbg.location(197,45);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:197:45: ^( DO parExpression statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(197,47);
                        root_1 = (Object)adaptor.becomeRoot(new DoWhileNode(stream_DO.nextToken()), root_1);

                        dbg.location(197,63);
                        adaptor.addChild(root_1, stream_parExpression.nextTree());
                        dbg.location(197,77);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:198:4: TRY block catchStmtList
                    {
                    dbg.location(198,4);
                    TRY122=(Token)match(input,TRY,FOLLOW_TRY_in_statement1659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY.add(TRY122);

                    dbg.location(198,8);
                    pushFollow(FOLLOW_block_in_statement1661);
                    block123=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block123.getTree());
                    dbg.location(198,14);
                    pushFollow(FOLLOW_catchStmtList_in_statement1663);
                    catchStmtList124=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_catchStmtList.add(catchStmtList124.getTree());


                    // AST REWRITE
                    // elements: block, catchStmtList, TRY
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:28: -> ^( TRY block catchStmtList )
                    {
                        dbg.location(198,31);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:198:31: ^( TRY block catchStmtList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(198,33);
                        root_1 = (Object)adaptor.becomeRoot(new TryNode(stream_TRY.nextToken()), root_1);

                        dbg.location(198,46);
                        adaptor.addChild(root_1, stream_block.nextTree());
                        dbg.location(198,52);
                        adaptor.addChild(root_1, stream_catchStmtList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:4: SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
                    {
                    dbg.location(199,4);
                    SWITCH125=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_statement1681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH.add(SWITCH125);

                    dbg.location(199,11);
                    LPAREN126=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_statement1683); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN126);

                    dbg.location(199,18);
                    pushFollow(FOLLOW_expr_in_statement1685);
                    expr127=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr127.getTree());
                    dbg.location(199,23);
                    RPAREN128=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_statement1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN128);

                    dbg.location(199,30);
                    LBRACE129=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_statement1689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE129);

                    dbg.location(199,37);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:37: ( caseStmt )+
                    int cnt27=0;
                    try { dbg.enterSubRule(27);

                    loop27:
                    do {
                        int alt27=2;
                        try { dbg.enterDecision(27);

                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=CASE && LA27_0<=DEFAULT)) ) {
                            alt27=1;
                        }


                        } finally {dbg.exitDecision(27);}

                        switch (alt27) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: caseStmt
                    	    {
                    	    dbg.location(199,37);
                    	    pushFollow(FOLLOW_caseStmt_in_statement1691);
                    	    caseStmt130=caseStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_caseStmt.add(caseStmt130.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt27++;
                    } while (true);
                    } finally {dbg.exitSubRule(27);}

                    dbg.location(199,47);
                    RBRACE131=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_statement1694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE131);



                    // AST REWRITE
                    // elements: caseStmt, expr, SWITCH
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:54: -> ^( SWITCH expr ( caseStmt )+ )
                    {
                        dbg.location(199,57);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:199:57: ^( SWITCH expr ( caseStmt )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(199,59);
                        root_1 = (Object)adaptor.becomeRoot(new SwitchNode(stream_SWITCH.nextToken()), root_1);

                        dbg.location(199,78);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(199,83);
                        if ( !(stream_caseStmt.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_caseStmt.hasNext() ) {
                            dbg.location(199,83);
                            adaptor.addChild(root_1, stream_caseStmt.nextTree());

                        }
                        stream_caseStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:4: RETURN ( expr )? SEMI
                    {
                    dbg.location(200,4);
                    RETURN132=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement1713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN.add(RETURN132);

                    dbg.location(200,11);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:11: ( expr )?
                    int alt28=2;
                    try { dbg.enterSubRule(28);
                    try { dbg.enterDecision(28);

                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENTIFIER||(LA28_0>=QUES && LA28_0<=LPAREN)||LA28_0==LBRACKET||LA28_0==BANG||(LA28_0>=LT && LA28_0<=NEW)||LA28_0==LBRACE||(LA28_0>=ELLIPSIS && LA28_0<=CAST)||(LA28_0>=LONGLITERAL && LA28_0<=FALSE)) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==SEMI) ) {
                        int LA28_2 = input.LA(2);

                        if ( (synpred54_TinyHaxeTry1()) ) {
                            alt28=1;
                        }
                    }
                    } finally {dbg.exitDecision(28);}

                    switch (alt28) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:12: expr
                            {
                            dbg.location(200,12);
                            pushFollow(FOLLOW_expr_in_statement1716);
                            expr133=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr133.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(28);}

                    dbg.location(200,19);
                    SEMI134=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI134);



                    // AST REWRITE
                    // elements: expr, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:23: -> ^( RETURN ( expr )? )
                    {
                        dbg.location(200,26);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:26: ^( RETURN ( expr )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(200,28);
                        root_1 = (Object)adaptor.becomeRoot(stream_RETURN.nextNode(), root_1);

                        dbg.location(200,35);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:35: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            dbg.location(200,35);
                            adaptor.addChild(root_1, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:4: THROW expr SEMI
                    {
                    dbg.location(201,4);
                    THROW135=(Token)match(input,THROW,FOLLOW_THROW_in_statement1733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW.add(THROW135);

                    dbg.location(201,10);
                    pushFollow(FOLLOW_expr_in_statement1735);
                    expr136=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr136.getTree());
                    dbg.location(201,15);
                    SEMI137=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI137);



                    // AST REWRITE
                    // elements: expr, THROW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:20: -> ^( THROW expr )
                    {
                        dbg.location(201,23);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:23: ^( THROW expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(201,25);
                        root_1 = (Object)adaptor.becomeRoot(stream_THROW.nextNode(), root_1);

                        dbg.location(201,31);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:4: BREAK ( IDENTIFIER )? SEMI
                    {
                    dbg.location(202,4);
                    BREAK138=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK.add(BREAK138);

                    dbg.location(202,10);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:10: ( IDENTIFIER )?
                    int alt29=2;
                    try { dbg.enterSubRule(29);
                    try { dbg.enterDecision(29);

                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==IDENTIFIER) ) {
                        alt29=1;
                    }
                    } finally {dbg.exitDecision(29);}

                    switch (alt29) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:11: IDENTIFIER
                            {
                            dbg.location(202,11);
                            IDENTIFIER139=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1753); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER139);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(29);}

                    dbg.location(202,24);
                    SEMI140=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1757); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI140);



                    // AST REWRITE
                    // elements: IDENTIFIER, BREAK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:29: -> ^( BREAK ( IDENTIFIER )? )
                    {
                        dbg.location(202,32);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:32: ^( BREAK ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(202,34);
                        root_1 = (Object)adaptor.becomeRoot(stream_BREAK.nextNode(), root_1);

                        dbg.location(202,40);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:40: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            dbg.location(202,40);
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:203:4: CONTINUE ( IDENTIFIER )? SEMI
                    {
                    dbg.location(203,4);
                    CONTINUE141=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE.add(CONTINUE141);

                    dbg.location(203,13);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:203:13: ( IDENTIFIER )?
                    int alt30=2;
                    try { dbg.enterSubRule(30);
                    try { dbg.enterDecision(30);

                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==IDENTIFIER) ) {
                        alt30=1;
                    }
                    } finally {dbg.exitDecision(30);}

                    switch (alt30) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:203:14: IDENTIFIER
                            {
                            dbg.location(203,14);
                            IDENTIFIER142=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1774); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER142);


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(30);}

                    dbg.location(203,27);
                    SEMI143=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI143);



                    // AST REWRITE
                    // elements: IDENTIFIER, CONTINUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:32: -> ^( CONTINUE ( IDENTIFIER )? )
                    {
                        dbg.location(203,35);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:203:35: ^( CONTINUE ( IDENTIFIER )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(203,37);
                        root_1 = (Object)adaptor.becomeRoot(stream_CONTINUE.nextNode(), root_1);

                        dbg.location(203,46);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:203:46: ( IDENTIFIER )?
                        if ( stream_IDENTIFIER.hasNext() ) {
                            dbg.location(203,46);
                            adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                        }
                        stream_IDENTIFIER.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:4: expr SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(204,4);
                    pushFollow(FOLLOW_expr_in_statement1792);
                    expr144=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr144.getTree());
                    dbg.location(204,14);
                    SEMI145=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1795); if (state.failed) return retval;

                    }
                    break;
                case 15 :
                    dbg.enterAlt(15);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:205:4: IDENTIFIER COLON statement
                    {
                    dbg.location(205,4);
                    IDENTIFIER146=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER146);

                    dbg.location(205,15);
                    COLON147=(Token)match(input,COLON,FOLLOW_COLON_in_statement1803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON147);

                    dbg.location(205,21);
                    pushFollow(FOLLOW_statement_in_statement1805);
                    statement148=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement148.getTree());


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
                    // 205:31: -> ^( COLON IDENTIFIER statement )
                    {
                        dbg.location(205,34);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:205:34: ^( COLON IDENTIFIER statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(205,36);
                        root_1 = (Object)adaptor.becomeRoot(stream_COLON.nextNode(), root_1);

                        dbg.location(205,42);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(205,53);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    dbg.enterAlt(16);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(206,8);
                    SEMI149=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement1820); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 32, statement_StartIndex); }
        }
        dbg.location(207, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class functionVar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionVar"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:209:1: functionVar : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? block ) ;
    public final TinyHaxeTry1Parser.functionVar_return functionVar() throws RecognitionException {
        TinyHaxeTry1Parser.functionVar_return retval = new TinyHaxeTry1Parser.functionVar_return();
        retval.start = input.LT(1);
        int functionVar_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION150=null;
        Token LPAREN151=null;
        Token RPAREN153=null;
        TinyHaxeTry1Parser.paramList_return paramList152 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt154 = null;

        TinyHaxeTry1Parser.block_return block155 = null;


        Object FUNCTION150_tree=null;
        Object LPAREN151_tree=null;
        Object RPAREN153_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "functionVar");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:2: ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION ( paramList )? ( typeTagOpt )? block ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:4: FUNCTION LPAREN paramList RPAREN typeTagOpt block
            {
            dbg.location(210,4);
            FUNCTION150=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionVar1832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION150);

            dbg.location(210,13);
            LPAREN151=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_functionVar1834); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN151);

            dbg.location(210,20);
            pushFollow(FOLLOW_paramList_in_functionVar1836);
            paramList152=paramList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_paramList.add(paramList152.getTree());
            dbg.location(210,30);
            RPAREN153=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_functionVar1838); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN153);

            dbg.location(210,37);
            pushFollow(FOLLOW_typeTagOpt_in_functionVar1840);
            typeTagOpt154=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt154.getTree());
            dbg.location(210,48);
            pushFollow(FOLLOW_block_in_functionVar1842);
            block155=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block155.getTree());


            // AST REWRITE
            // elements: block, FUNCTION, typeTagOpt, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 210:54: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? block )
            {
                dbg.location(210,57);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:57: ^( FUNCTION ( paramList )? ( typeTagOpt )? block )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(210,59);
                root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                dbg.location(210,82);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:82: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    dbg.location(210,82);
                    adaptor.addChild(root_1, stream_paramList.nextTree());

                }
                stream_paramList.reset();
                dbg.location(210,93);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:210:93: ( typeTagOpt )?
                if ( stream_typeTagOpt.hasNext() ) {
                    dbg.location(210,93);
                    adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                }
                stream_typeTagOpt.reset();
                dbg.location(210,105);
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, functionVar_StartIndex); }
        }
        dbg.location(211, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "functionVar");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "functionVar"

    public static class parExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:213:1: parExpression : LPAREN expr RPAREN ;
    public final TinyHaxeTry1Parser.parExpression_return parExpression() throws RecognitionException {
        TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN156=null;
        Token RPAREN158=null;
        TinyHaxeTry1Parser.expr_return expr157 = null;


        Object LPAREN156_tree=null;
        Object RPAREN158_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "parExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:5: ( LPAREN expr RPAREN )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:9: LPAREN expr RPAREN
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(214,15);
            LPAREN156=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1880); if (state.failed) return retval;
            dbg.location(214,17);
            pushFollow(FOLLOW_expr_in_parExpression1883);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());
            dbg.location(214,28);
            RPAREN158=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1885); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, parExpression_StartIndex); }
        }
        dbg.location(215, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "parExpression"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:1: block : ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI );
    public final TinyHaxeTry1Parser.block_return block() throws RecognitionException {
        TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE159=null;
        Token RBRACE161=null;
        Token SEMI162=null;
        TinyHaxeTry1Parser.blockStmt_return blockStmt160 = null;


        Object LBRACE159_tree=null;
        Object RBRACE161_tree=null;
        Object SEMI162_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_blockStmt=new RewriteRuleSubtreeStream(adaptor,"rule blockStmt");
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:15: ( LBRACE ( blockStmt )* RBRACE -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI )
            int alt33=2;
            try { dbg.enterDecision(33);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==LBRACE) ) {
                alt33=1;
            }
            else if ( (LA33_0==SEMI) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:17: LBRACE ( blockStmt )* RBRACE
                    {
                    dbg.location(217,17);
                    LBRACE159=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block1907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE159);

                    dbg.location(217,24);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:24: ( blockStmt )*
                    try { dbg.enterSubRule(32);

                    loop32:
                    do {
                        int alt32=2;
                        try { dbg.enterDecision(32);

                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=SEMI && LA32_0<=IDENTIFIER)||(LA32_0>=PUBLIC && LA32_0<=OVERRIDE)||(LA32_0>=QUES && LA32_0<=LPAREN)||LA32_0==LBRACKET||LA32_0==BANG||(LA32_0>=LT && LA32_0<=IF)||LA32_0==FOR||(LA32_0>=WHILE && LA32_0<=LBRACE)||(LA32_0>=RETURN && LA32_0<=CONTINUE)||(LA32_0>=ELLIPSIS && LA32_0<=CAST)||(LA32_0>=VAR && LA32_0<=CLASS)||(LA32_0>=LONGLITERAL && LA32_0<=FALSE)) ) {
                            alt32=1;
                        }


                        } finally {dbg.exitDecision(32);}

                        switch (alt32) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:25: blockStmt
                    	    {
                    	    dbg.location(217,25);
                    	    pushFollow(FOLLOW_blockStmt_in_block1910);
                    	    blockStmt160=blockStmt();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_blockStmt.add(blockStmt160.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(32);}

                    dbg.location(217,37);
                    RBRACE161=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block1914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE161);



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
                    // 217:44: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                    {
                        dbg.location(217,46);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:46: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(217,48);
                        root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                        dbg.location(217,96);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:96: ( blockStmt )*
                        while ( stream_blockStmt.hasNext() ) {
                            dbg.location(217,96);
                            adaptor.addChild(root_1, stream_blockStmt.nextTree());

                        }
                        stream_blockStmt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:4: SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(218,8);
                    SEMI162=(Token)match(input,SEMI,FOLLOW_SEMI_in_block1932); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 35, block_StartIndex); }
        }
        dbg.location(219, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    public static class blockStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:1: blockStmt : ( varDecl | classDecl | statement );
    public final TinyHaxeTry1Parser.blockStmt_return blockStmt() throws RecognitionException {
        TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
        retval.start = input.LT(1);
        int blockStmt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl163 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl164 = null;

        TinyHaxeTry1Parser.statement_return statement165 = null;



        try { dbg.enterRule(getGrammarFileName(), "blockStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:222:2: ( varDecl | classDecl | statement )
            int alt34=3;
            try { dbg.enterDecision(34);

            try {
                isCyclicDecision = true;
                alt34 = dfa34.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:222:4: varDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(222,4);
                    pushFollow(FOLLOW_varDecl_in_blockStmt1945);
                    varDecl163=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl163.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:223:4: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(223,4);
                    pushFollow(FOLLOW_classDecl_in_blockStmt1950);
                    classDecl164=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl164.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:224:4: statement
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(224,4);
                    pushFollow(FOLLOW_statement_in_blockStmt1955);
                    statement165=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement165.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 36, blockStmt_StartIndex); }
        }
        dbg.location(225, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "blockStmt"

    public static class breakStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:1: breakStmt : BREAK SEMI ;
    public final TinyHaxeTry1Parser.breakStmt_return breakStmt() throws RecognitionException {
        TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
        retval.start = input.LT(1);
        int breakStmt_StartIndex = input.index();
        Object root_0 = null;

        Token BREAK166=null;
        Token SEMI167=null;

        Object BREAK166_tree=null;
        Object SEMI167_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "breakStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:19: ( BREAK SEMI )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:228:21: BREAK SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(228,21);
            BREAK166=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStmt1986); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BREAK166_tree = (Object)adaptor.create(BREAK166);
            adaptor.addChild(root_0, BREAK166_tree);
            }
            dbg.location(228,31);
            SEMI167=(Token)match(input,SEMI,FOLLOW_SEMI_in_breakStmt1988); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, breakStmt_StartIndex); }
        }
        dbg.location(229, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "breakStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "breakStmt"

    public static class continueStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:1: continueStmt : CONTINUE SEMI ;
    public final TinyHaxeTry1Parser.continueStmt_return continueStmt() throws RecognitionException {
        TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
        retval.start = input.LT(1);
        int continueStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CONTINUE168=null;
        Token SEMI169=null;

        Object CONTINUE168_tree=null;
        Object SEMI169_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "continueStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:19: ( CONTINUE SEMI )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:21: CONTINUE SEMI
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(230,21);
            CONTINUE168=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt2003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONTINUE168_tree = (Object)adaptor.create(CONTINUE168);
            adaptor.addChild(root_0, CONTINUE168_tree);
            }
            dbg.location(230,34);
            SEMI169=(Token)match(input,SEMI,FOLLOW_SEMI_in_continueStmt2005); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, continueStmt_StartIndex); }
        }
        dbg.location(231, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "continueStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "continueStmt"

    public static class caseStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:1: caseStmt : ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) );
    public final TinyHaxeTry1Parser.caseStmt_return caseStmt() throws RecognitionException {
        TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
        retval.start = input.LT(1);
        int caseStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CASE170=null;
        Token COLON172=null;
        Token DEFAULT174=null;
        Token COLON175=null;
        TinyHaxeTry1Parser.exprList_return exprList171 = null;

        TinyHaxeTry1Parser.statement_return statement173 = null;

        TinyHaxeTry1Parser.statement_return statement176 = null;


        Object CASE170_tree=null;
        Object COLON172_tree=null;
        Object DEFAULT174_tree=null;
        Object COLON175_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try { dbg.enterRule(getGrammarFileName(), "caseStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:9: ( CASE exprList COLON statement -> ^( CASE exprList statement ) | DEFAULT COLON statement -> ^( DEFAULT statement ) )
            int alt35=2;
            try { dbg.enterDecision(35);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==CASE) ) {
                alt35=1;
            }
            else if ( (LA35_0==DEFAULT) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:11: CASE exprList COLON statement
                    {
                    dbg.location(233,11);
                    CASE170=(Token)match(input,CASE,FOLLOW_CASE_in_caseStmt2016); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(CASE170);

                    dbg.location(233,16);
                    pushFollow(FOLLOW_exprList_in_caseStmt2018);
                    exprList171=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprList.add(exprList171.getTree());
                    dbg.location(233,25);
                    COLON172=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON172);

                    dbg.location(233,31);
                    pushFollow(FOLLOW_statement_in_caseStmt2022);
                    statement173=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement173.getTree());


                    // AST REWRITE
                    // elements: statement, exprList, CASE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:41: -> ^( CASE exprList statement )
                    {
                        dbg.location(233,44);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:44: ^( CASE exprList statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(233,46);
                        root_1 = (Object)adaptor.becomeRoot(stream_CASE.nextNode(), root_1);

                        dbg.location(233,51);
                        adaptor.addChild(root_1, stream_exprList.nextTree());
                        dbg.location(233,60);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:234:4: DEFAULT COLON statement
                    {
                    dbg.location(234,4);
                    DEFAULT174=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_caseStmt2037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT.add(DEFAULT174);

                    dbg.location(234,12);
                    COLON175=(Token)match(input,COLON,FOLLOW_COLON_in_caseStmt2039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(COLON175);

                    dbg.location(234,18);
                    pushFollow(FOLLOW_statement_in_caseStmt2041);
                    statement176=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement176.getTree());


                    // AST REWRITE
                    // elements: DEFAULT, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 234:28: -> ^( DEFAULT statement )
                    {
                        dbg.location(234,30);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:234:30: ^( DEFAULT statement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(234,32);
                        root_1 = (Object)adaptor.becomeRoot(stream_DEFAULT.nextNode(), root_1);

                        dbg.location(234,40);
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 39, caseStmt_StartIndex); }
        }
        dbg.location(235, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "caseStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "caseStmt"

    public static class defaultStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:1: defaultStmt : DEFAULT COLON ;
    public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt() throws RecognitionException {
        TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
        retval.start = input.LT(1);
        int defaultStmt_StartIndex = input.index();
        Object root_0 = null;

        Token DEFAULT177=null;
        Token COLON178=null;

        Object DEFAULT177_tree=null;
        Object COLON178_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "defaultStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(237, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:19: ( DEFAULT COLON )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:21: DEFAULT COLON
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(237,21);
            DEFAULT177=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt2065); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT177_tree = (Object)adaptor.create(DEFAULT177);
            adaptor.addChild(root_0, DEFAULT177_tree);
            }
            dbg.location(237,34);
            COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_defaultStmt2067); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, defaultStmt_StartIndex); }
        }
        dbg.location(238, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defaultStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "defaultStmt"

    public static class catchStmtList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmtList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:1: catchStmtList : ( catchStmt catchStmtList | );
    public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
        retval.start = input.LT(1);
        int catchStmtList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.catchStmt_return catchStmt179 = null;

        TinyHaxeTry1Parser.catchStmtList_return catchStmtList180 = null;



        try { dbg.enterRule(getGrammarFileName(), "catchStmtList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(239, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:19: ( catchStmt catchStmtList | )
            int alt36=2;
            try { dbg.enterDecision(36);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==CATCH) ) {
                alt36=1;
            }
            else if ( (LA36_0==EOF||(LA36_0>=SEMI && LA36_0<=IDENTIFIER)||(LA36_0>=PUBLIC && LA36_0<=RBRACKET)||LA36_0==BANG||LA36_0==COLON||(LA36_0>=LT && LA36_0<=DEFAULT)||(LA36_0>=ELLIPSIS && LA36_0<=CAST)||(LA36_0>=VAR && LA36_0<=CLASS)||(LA36_0>=EXTENDS && LA36_0<=IMPLEMENTS)||(LA36_0>=LONGLITERAL && LA36_0<=FALSE)) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:21: catchStmt catchStmtList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(239,21);
                    pushFollow(FOLLOW_catchStmt_in_catchStmtList2081);
                    catchStmt179=catchStmt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmt179.getTree());
                    dbg.location(239,31);
                    pushFollow(FOLLOW_catchStmtList_in_catchStmtList2083);
                    catchStmtList180=catchStmtList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchStmtList180.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 41, catchStmtList_StartIndex); }
        }
        dbg.location(241, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "catchStmtList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "catchStmtList"

    public static class catchStmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchStmt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:1: catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
    public final TinyHaxeTry1Parser.catchStmt_return catchStmt() throws RecognitionException {
        TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
        retval.start = input.LT(1);
        int catchStmt_StartIndex = input.index();
        Object root_0 = null;

        Token CATCH181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        TinyHaxeTry1Parser.param_return param183 = null;

        TinyHaxeTry1Parser.block_return block185 = null;


        Object CATCH181_tree=null;
        Object LPAREN182_tree=null;
        Object RPAREN184_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "catchStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(242, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:19: ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:21: CATCH LPAREN param RPAREN block
            {
            dbg.location(242,21);
            CATCH181=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchStmt2122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH.add(CATCH181);

            dbg.location(242,27);
            LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);

            dbg.location(242,34);
            pushFollow(FOLLOW_param_in_catchStmt2126);
            param183=param();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_param.add(param183.getTree());
            dbg.location(242,40);
            RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2128); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

            dbg.location(242,47);
            pushFollow(FOLLOW_block_in_catchStmt2130);
            block185=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block185.getTree());


            // AST REWRITE
            // elements: CATCH, block, param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 242:53: -> ^( CATCH param block )
            {
                dbg.location(242,56);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:242:56: ^( CATCH param block )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(242,58);
                root_1 = (Object)adaptor.becomeRoot(stream_CATCH.nextNode(), root_1);

                dbg.location(242,64);
                adaptor.addChild(root_1, stream_param.nextTree());
                dbg.location(242,70);
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, catchStmt_StartIndex); }
        }
        dbg.location(243, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "catchStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "catchStmt"

    public static class exprListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprListOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:1: exprListOpt : ( exprList | );
    public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
        retval.start = input.LT(1);
        int exprListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.exprList_return exprList186 = null;



        try { dbg.enterRule(getGrammarFileName(), "exprListOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(246, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:19: ( exprList | )
            int alt37=2;
            try { dbg.enterDecision(37);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case FUNCTION:
            case LPAREN:
            case LBRACKET:
            case BANG:
            case LT:
            case GT:
            case NEW:
            case LBRACE:
            case ELLIPSIS:
            case BARBAR:
            case AMPAMP:
            case EQEQ:
            case BANGEQ:
            case GTEQ:
            case LTEQ:
            case BAR:
            case AMP:
            case CARET:
            case LTLT:
            case GTGT:
            case GTGTGT:
            case PLUS:
            case SUB:
            case STAR:
            case SLASH:
            case PERCENT:
            case SUBSUB:
            case PLUSPLUS:
            case TILDE:
            case NULL:
            case CAST:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt37=1;
                }
                break;
            case RBRACKET:
                {
                int LA37_2 = input.LA(2);

                if ( (synpred69_TinyHaxeTry1()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case RPAREN:
                {
                int LA37_3 = input.LA(2);

                if ( (synpred69_TinyHaxeTry1()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(37);}

            switch (alt37) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:21: exprList
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(246,21);
                    pushFollow(FOLLOW_exprList_in_exprListOpt2157);
                    exprList186=exprList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exprList186.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:248:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 43, exprListOpt_StartIndex); }
        }
        dbg.location(248, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprListOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprListOpt"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:1: exprList : expr ( COMMA expr )* ;
    public final TinyHaxeTry1Parser.exprList_return exprList() throws RecognitionException {
        TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
        retval.start = input.LT(1);
        int exprList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA188=null;
        TinyHaxeTry1Parser.expr_return expr187 = null;

        TinyHaxeTry1Parser.expr_return expr189 = null;


        Object COMMA188_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "exprList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(249, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:19: ( expr ( COMMA expr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:21: expr ( COMMA expr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(249,21);
            pushFollow(FOLLOW_expr_in_exprList2197);
            expr187=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr187.getTree());
            dbg.location(249,26);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:26: ( COMMA expr )*
            try { dbg.enterSubRule(38);

            loop38:
            do {
                int alt38=2;
                try { dbg.enterDecision(38);

                int LA38_0 = input.LA(1);

                if ( (LA38_0==COMMA) ) {
                    alt38=1;
                }


                } finally {dbg.exitDecision(38);}

                switch (alt38) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:27: COMMA expr
            	    {
            	    dbg.location(249,32);
            	    COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_exprList2200); if (state.failed) return retval;
            	    dbg.location(249,34);
            	    pushFollow(FOLLOW_expr_in_exprList2203);
            	    expr189=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr189.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);
            } finally {dbg.exitSubRule(38);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, exprList_StartIndex); }
        }
        dbg.location(250, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exprList"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:251:1: expr : assignExpr ;
    public final TinyHaxeTry1Parser.expr_return expr() throws RecognitionException {
        TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.assignExpr_return assignExpr190 = null;



        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(251, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:251:19: ( assignExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:251:21: assignExpr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(251,21);
            pushFollow(FOLLOW_assignExpr_in_expr2227);
            assignExpr190=assignExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpr190.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, expr_StartIndex); }
        }
        dbg.location(252, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class assignExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:253:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final TinyHaxeTry1Parser.assignExpr_return assignExpr() throws RecognitionException {
        TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
        retval.start = input.LT(1);
        int assignExpr_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr191 = null;

        TinyHaxeTry1Parser.assignOp_return assignOp192 = null;

        TinyHaxeTry1Parser.iterExpr_return iterExpr193 = null;



        try { dbg.enterRule(getGrammarFileName(), "assignExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(253, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:253:19: ( iterExpr ( assignOp iterExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:253:21: iterExpr ( assignOp iterExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(253,21);
            pushFollow(FOLLOW_iterExpr_in_assignExpr2243);
            iterExpr191=iterExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr191.getTree());
            dbg.location(253,30);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:253:30: ( assignOp iterExpr )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=2;
                try { dbg.enterDecision(39);

                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=EQ && LA39_0<=AMPEQ)) ) {
                    alt39=1;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:253:31: assignOp iterExpr
            	    {
            	    dbg.location(253,39);
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2246);
            	    assignOp192=assignOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (Object)adaptor.becomeRoot(assignOp192.getTree(), root_0);
            	    dbg.location(253,41);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2249);
            	    iterExpr193=iterExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterExpr193.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, assignExpr_StartIndex); }
        }
        dbg.location(254, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignExpr"

    public static class iterExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:1: iterExpr : ( ternaryExpr ( ELLIPSIS ternaryExpr )* | functionVar );
    public final TinyHaxeTry1Parser.iterExpr_return iterExpr() throws RecognitionException {
        TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
        retval.start = input.LT(1);
        int iterExpr_StartIndex = input.index();
        Object root_0 = null;

        Token ELLIPSIS195=null;
        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr194 = null;

        TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr196 = null;

        TinyHaxeTry1Parser.functionVar_return functionVar197 = null;


        Object ELLIPSIS195_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "iterExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(256, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:9: ( ternaryExpr ( ELLIPSIS ternaryExpr )* | functionVar )
            int alt41=2;
            try { dbg.enterDecision(41);

            try {
                isCyclicDecision = true;
                alt41 = dfa41.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(256,11);
                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2262);
                    ternaryExpr194=ternaryExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr194.getTree());
                    dbg.location(256,23);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:23: ( ELLIPSIS ternaryExpr )*
                    try { dbg.enterSubRule(40);

                    loop40:
                    do {
                        int alt40=2;
                        try { dbg.enterDecision(40);

                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==ELLIPSIS) ) {
                            alt40=1;
                        }


                        } finally {dbg.exitDecision(40);}

                        switch (alt40) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:24: ELLIPSIS ternaryExpr
                    	    {
                    	    dbg.location(256,32);
                    	    ELLIPSIS195=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2265); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ELLIPSIS195_tree = (Object)adaptor.create(ELLIPSIS195);
                    	    root_0 = (Object)adaptor.becomeRoot(ELLIPSIS195_tree, root_0);
                    	    }
                    	    dbg.location(256,34);
                    	    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2268);
                    	    ternaryExpr196=ternaryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ternaryExpr196.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(40);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:4: functionVar
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(257,4);
                    pushFollow(FOLLOW_functionVar_in_iterExpr2275);
                    functionVar197=functionVar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionVar197.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 47, iterExpr_StartIndex); }
        }
        dbg.location(258, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iterExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "iterExpr"

    public static class ternaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ternaryExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:1: ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
    public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr() throws RecognitionException {
        TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
        retval.start = input.LT(1);
        int ternaryExpr_StartIndex = input.index();
        Object root_0 = null;

        Token QUES199=null;
        Token COLON201=null;
        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr198 = null;

        TinyHaxeTry1Parser.expr_return expr200 = null;

        TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr202 = null;


        Object QUES199_tree=null;
        Object COLON201_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ternaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:19: ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:21: logicOrExpr ( QUES expr COLON logicOrExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(260,21);
            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2306);
            logicOrExpr198=logicOrExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr198.getTree());
            dbg.location(260,33);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:33: ( QUES expr COLON logicOrExpr )*
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( (LA42_0==QUES) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:34: QUES expr COLON logicOrExpr
            	    {
            	    dbg.location(260,38);
            	    QUES199=(Token)match(input,QUES,FOLLOW_QUES_in_ternaryExpr2309); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    QUES199_tree = (Object)adaptor.create(QUES199);
            	    root_0 = (Object)adaptor.becomeRoot(QUES199_tree, root_0);
            	    }
            	    dbg.location(260,40);
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2312);
            	    expr200=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr200.getTree());
            	    dbg.location(260,50);
            	    COLON201=(Token)match(input,COLON,FOLLOW_COLON_in_ternaryExpr2314); if (state.failed) return retval;
            	    dbg.location(260,52);
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2317);
            	    logicOrExpr202=logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicOrExpr202.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);
            } finally {dbg.exitSubRule(42);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ternaryExpr_StartIndex); }
        }
        dbg.location(261, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ternaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ternaryExpr"

    public static class logicOrExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicOrExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:1: logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
    public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
        retval.start = input.LT(1);
        int logicOrExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BARBAR204=null;
        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr203 = null;

        TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr205 = null;


        Object BARBAR204_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logicOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:19: ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:21: ( logicAndExpr ) ( BARBAR logicAndExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(262,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:21: ( logicAndExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:22: logicAndExpr
            {
            dbg.location(262,22);
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2335);
            logicAndExpr203=logicAndExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr203.getTree());

            }

            dbg.location(262,36);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:36: ( BARBAR logicAndExpr )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==BARBAR) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:37: BARBAR logicAndExpr
            	    {
            	    dbg.location(262,43);
            	    BARBAR204=(Token)match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2339); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BARBAR204_tree = (Object)adaptor.create(BARBAR204);
            	    root_0 = (Object)adaptor.becomeRoot(BARBAR204_tree, root_0);
            	    }
            	    dbg.location(262,45);
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2342);
            	    logicAndExpr205=logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, logicAndExpr205.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, logicOrExpr_StartIndex); }
        }
        dbg.location(263, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicOrExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logicOrExpr"

    public static class logicAndExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicAndExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:1: logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
    public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr() throws RecognitionException {
        TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
        retval.start = input.LT(1);
        int logicAndExpr_StartIndex = input.index();
        Object root_0 = null;

        Token AMPAMP207=null;
        TinyHaxeTry1Parser.cmpExpr_return cmpExpr206 = null;

        TinyHaxeTry1Parser.cmpExpr_return cmpExpr208 = null;


        Object AMPAMP207_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "logicAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:19: ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:21: ( cmpExpr ) ( AMPAMP cmpExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(264,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:21: ( cmpExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:22: cmpExpr
            {
            dbg.location(264,22);
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2359);
            cmpExpr206=cmpExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr206.getTree());

            }

            dbg.location(264,31);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:31: ( AMPAMP cmpExpr )*
            try { dbg.enterSubRule(44);

            loop44:
            do {
                int alt44=2;
                try { dbg.enterDecision(44);

                int LA44_0 = input.LA(1);

                if ( (LA44_0==AMPAMP) ) {
                    alt44=1;
                }


                } finally {dbg.exitDecision(44);}

                switch (alt44) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:264:32: AMPAMP cmpExpr
            	    {
            	    dbg.location(264,38);
            	    AMPAMP207=(Token)match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2363); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMPAMP207_tree = (Object)adaptor.create(AMPAMP207);
            	    root_0 = (Object)adaptor.becomeRoot(AMPAMP207_tree, root_0);
            	    }
            	    dbg.location(264,40);
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2366);
            	    cmpExpr208=cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cmpExpr208.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);
            } finally {dbg.exitSubRule(44);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, logicAndExpr_StartIndex); }
        }
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicAndExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "logicAndExpr"

    public static class cmpExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cmpExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:1: cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* ;
    public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr() throws RecognitionException {
        TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
        retval.start = input.LT(1);
        int cmpExpr_StartIndex = input.index();
        Object root_0 = null;

        Token EQEQ210=null;
        Token BANGEQ211=null;
        Token GTEQ212=null;
        Token LTEQ213=null;
        Token GT214=null;
        Token LT215=null;
        TinyHaxeTry1Parser.bitExpr_return bitExpr209 = null;

        TinyHaxeTry1Parser.bitExpr_return bitExpr216 = null;


        Object EQEQ210_tree=null;
        Object BANGEQ211_tree=null;
        Object GTEQ212_tree=null;
        Object LTEQ213_tree=null;
        Object GT214_tree=null;
        Object LT215_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cmpExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:19: ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:21: ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(266,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:21: ( bitExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:22: bitExpr
            {
            dbg.location(266,22);
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2388);
            bitExpr209=bitExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr209.getTree());

            }

            dbg.location(266,31);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:31: ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
            try { dbg.enterSubRule(46);

            loop46:
            do {
                int alt46=2;
                try { dbg.enterDecision(46);

                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=LT && LA46_0<=GT)||(LA46_0>=EQEQ && LA46_0<=LTEQ)) ) {
                    alt46=1;
                }


                } finally {dbg.exitDecision(46);}

                switch (alt46) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
            	    {
            	    dbg.location(266,32);
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:32: ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
            	    int alt45=6;
            	    try { dbg.enterSubRule(45);
            	    try { dbg.enterDecision(45);

            	    switch ( input.LA(1) ) {
            	    case EQEQ:
            	        {
            	        alt45=1;
            	        }
            	        break;
            	    case BANGEQ:
            	        {
            	        alt45=2;
            	        }
            	        break;
            	    case GTEQ:
            	        {
            	        alt45=3;
            	        }
            	        break;
            	    case LTEQ:
            	        {
            	        alt45=4;
            	        }
            	        break;
            	    case GT:
            	        {
            	        alt45=5;
            	        }
            	        break;
            	    case LT:
            	        {
            	        alt45=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 45, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(45);}

            	    switch (alt45) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:33: EQEQ
            	            {
            	            dbg.location(266,37);
            	            EQEQ210=(Token)match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2393); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            EQEQ210_tree = (Object)adaptor.create(EQEQ210);
            	            root_0 = (Object)adaptor.becomeRoot(EQEQ210_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:40: BANGEQ
            	            {
            	            dbg.location(266,46);
            	            BANGEQ211=(Token)match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2397); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BANGEQ211_tree = (Object)adaptor.create(BANGEQ211);
            	            root_0 = (Object)adaptor.becomeRoot(BANGEQ211_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:50: GTEQ
            	            {
            	            dbg.location(266,54);
            	            GTEQ212=(Token)match(input,GTEQ,FOLLOW_GTEQ_in_cmpExpr2402); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GTEQ212_tree = (Object)adaptor.create(GTEQ212);
            	            root_0 = (Object)adaptor.becomeRoot(GTEQ212_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:58: LTEQ
            	            {
            	            dbg.location(266,62);
            	            LTEQ213=(Token)match(input,LTEQ,FOLLOW_LTEQ_in_cmpExpr2407); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LTEQ213_tree = (Object)adaptor.create(LTEQ213);
            	            root_0 = (Object)adaptor.becomeRoot(LTEQ213_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            dbg.enterAlt(5);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:66: GT
            	            {
            	            dbg.location(266,68);
            	            GT214=(Token)match(input,GT,FOLLOW_GT_in_cmpExpr2412); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            GT214_tree = (Object)adaptor.create(GT214);
            	            root_0 = (Object)adaptor.becomeRoot(GT214_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 6 :
            	            dbg.enterAlt(6);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:72: LT
            	            {
            	            dbg.location(266,74);
            	            LT215=(Token)match(input,LT,FOLLOW_LT_in_cmpExpr2417); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            LT215_tree = (Object)adaptor.create(LT215);
            	            root_0 = (Object)adaptor.becomeRoot(LT215_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(45);}

            	    dbg.location(266,78);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2422);
            	    bitExpr216=bitExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, bitExpr216.getTree());

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);
            } finally {dbg.exitSubRule(46);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, cmpExpr_StartIndex); }
        }
        dbg.location(267, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmpExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cmpExpr"

    public static class bitExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:1: bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* ;
    public final TinyHaxeTry1Parser.bitExpr_return bitExpr() throws RecognitionException {
        TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
        retval.start = input.LT(1);
        int bitExpr_StartIndex = input.index();
        Object root_0 = null;

        Token BAR218=null;
        Token AMP220=null;
        Token CARET222=null;
        TinyHaxeTry1Parser.shiftExpr_return shiftExpr217 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr219 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr221 = null;

        TinyHaxeTry1Parser.shiftExpr_return shiftExpr223 = null;


        Object BAR218_tree=null;
        Object AMP220_tree=null;
        Object CARET222_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "bitExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(268, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:19: ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:21: ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(268,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:21: ( shiftExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:22: shiftExpr
            {
            dbg.location(268,22);
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2444);
            shiftExpr217=shiftExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr217.getTree());

            }

            dbg.location(268,33);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:33: ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
            try { dbg.enterSubRule(47);

            loop47:
            do {
                int alt47=4;
                try { dbg.enterDecision(47);

                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt47=1;
                    }
                    break;
                case AMP:
                    {
                    alt47=2;
                    }
                    break;
                case CARET:
                    {
                    alt47=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(47);}

                switch (alt47) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:34: BAR shiftExpr
            	    {
            	    dbg.location(268,37);
            	    BAR218=(Token)match(input,BAR,FOLLOW_BAR_in_bitExpr2448); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BAR218_tree = (Object)adaptor.create(BAR218);
            	    root_0 = (Object)adaptor.becomeRoot(BAR218_tree, root_0);
            	    }
            	    dbg.location(268,39);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2451);
            	    shiftExpr219=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr219.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:51: AMP shiftExpr
            	    {
            	    dbg.location(268,54);
            	    AMP220=(Token)match(input,AMP,FOLLOW_AMP_in_bitExpr2455); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AMP220_tree = (Object)adaptor.create(AMP220);
            	    root_0 = (Object)adaptor.becomeRoot(AMP220_tree, root_0);
            	    }
            	    dbg.location(268,56);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2458);
            	    shiftExpr221=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr221.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:67: CARET shiftExpr
            	    {
            	    dbg.location(268,72);
            	    CARET222=(Token)match(input,CARET,FOLLOW_CARET_in_bitExpr2461); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CARET222_tree = (Object)adaptor.create(CARET222);
            	    root_0 = (Object)adaptor.becomeRoot(CARET222_tree, root_0);
            	    }
            	    dbg.location(268,74);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2464);
            	    shiftExpr223=shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpr223.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);
            } finally {dbg.exitSubRule(47);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, bitExpr_StartIndex); }
        }
        dbg.location(269, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bitExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "bitExpr"

    public static class shiftExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:1: shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* ;
    public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr() throws RecognitionException {
        TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
        retval.start = input.LT(1);
        int shiftExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LTLT225=null;
        Token GTGT227=null;
        Token GTGTGT229=null;
        TinyHaxeTry1Parser.addExpr_return addExpr224 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr226 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr228 = null;

        TinyHaxeTry1Parser.addExpr_return addExpr230 = null;


        Object LTLT225_tree=null;
        Object GTGT227_tree=null;
        Object GTGTGT229_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "shiftExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:19: ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:21: ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(271,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:21: ( addExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:22: addExpr
            {
            dbg.location(271,22);
            pushFollow(FOLLOW_addExpr_in_shiftExpr2485);
            addExpr224=addExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr224.getTree());

            }

            dbg.location(271,31);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:31: ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
            try { dbg.enterSubRule(48);

            loop48:
            do {
                int alt48=4;
                try { dbg.enterDecision(48);

                switch ( input.LA(1) ) {
                case LTLT:
                    {
                    alt48=1;
                    }
                    break;
                case GTGT:
                    {
                    alt48=2;
                    }
                    break;
                case GTGTGT:
                    {
                    alt48=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(48);}

                switch (alt48) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:32: LTLT addExpr
            	    {
            	    dbg.location(271,36);
            	    LTLT225=(Token)match(input,LTLT,FOLLOW_LTLT_in_shiftExpr2489); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LTLT225_tree = (Object)adaptor.create(LTLT225);
            	    root_0 = (Object)adaptor.becomeRoot(LTLT225_tree, root_0);
            	    }
            	    dbg.location(271,39);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2493);
            	    addExpr226=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr226.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:49: GTGT addExpr
            	    {
            	    dbg.location(271,53);
            	    GTGT227=(Token)match(input,GTGT,FOLLOW_GTGT_in_shiftExpr2497); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGT227_tree = (Object)adaptor.create(GTGT227);
            	    root_0 = (Object)adaptor.becomeRoot(GTGT227_tree, root_0);
            	    }
            	    dbg.location(271,56);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2501);
            	    addExpr228=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr228.getTree());

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:271:66: GTGTGT addExpr
            	    {
            	    dbg.location(271,72);
            	    GTGTGT229=(Token)match(input,GTGTGT,FOLLOW_GTGTGT_in_shiftExpr2505); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    GTGTGT229_tree = (Object)adaptor.create(GTGTGT229);
            	    root_0 = (Object)adaptor.becomeRoot(GTGTGT229_tree, root_0);
            	    }
            	    dbg.location(271,74);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2508);
            	    addExpr230=addExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, addExpr230.getTree());

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);
            } finally {dbg.exitSubRule(48);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, shiftExpr_StartIndex); }
        }
        dbg.location(272, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "shiftExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "shiftExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:1: addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
    public final TinyHaxeTry1Parser.addExpr_return addExpr() throws RecognitionException {
        TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
        retval.start = input.LT(1);
        int addExpr_StartIndex = input.index();
        Object root_0 = null;

        Token PLUS232=null;
        Token SUB233=null;
        TinyHaxeTry1Parser.multExpr_return multExpr231 = null;

        TinyHaxeTry1Parser.multExpr_return multExpr234 = null;


        Object PLUS232_tree=null;
        Object SUB233_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "addExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:19: ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:21: ( multExpr ) ( ( PLUS | SUB ) multExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(274,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:21: ( multExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:22: multExpr
            {
            dbg.location(274,22);
            pushFollow(FOLLOW_multExpr_in_addExpr2531);
            multExpr231=multExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr231.getTree());

            }

            dbg.location(274,32);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:32: ( ( PLUS | SUB ) multExpr )*
            try { dbg.enterSubRule(50);

            loop50:
            do {
                int alt50=2;
                try { dbg.enterDecision(50);

                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=PLUS && LA50_0<=SUB)) ) {
                    alt50=1;
                }


                } finally {dbg.exitDecision(50);}

                switch (alt50) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:33: ( PLUS | SUB ) multExpr
            	    {
            	    dbg.location(274,33);
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:33: ( PLUS | SUB )
            	    int alt49=2;
            	    try { dbg.enterSubRule(49);
            	    try { dbg.enterDecision(49);

            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==PLUS) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==SUB) ) {
            	        alt49=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(49);}

            	    switch (alt49) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:34: PLUS
            	            {
            	            dbg.location(274,38);
            	            PLUS232=(Token)match(input,PLUS,FOLLOW_PLUS_in_addExpr2536); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS232_tree = (Object)adaptor.create(PLUS232);
            	            root_0 = (Object)adaptor.becomeRoot(PLUS232_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:42: SUB
            	            {
            	            dbg.location(274,45);
            	            SUB233=(Token)match(input,SUB,FOLLOW_SUB_in_addExpr2541); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SUB233_tree = (Object)adaptor.create(SUB233);
            	            root_0 = (Object)adaptor.becomeRoot(SUB233_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(49);}

            	    dbg.location(274,48);
            	    pushFollow(FOLLOW_multExpr_in_addExpr2545);
            	    multExpr234=multExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multExpr234.getTree());

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);
            } finally {dbg.exitSubRule(50);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, addExpr_StartIndex); }
        }
        dbg.location(275, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "addExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:1: multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
    public final TinyHaxeTry1Parser.multExpr_return multExpr() throws RecognitionException {
        TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
        retval.start = input.LT(1);
        int multExpr_StartIndex = input.index();
        Object root_0 = null;

        Token STAR236=null;
        Token SLASH237=null;
        Token PERCENT238=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr235 = null;

        TinyHaxeTry1Parser.prefixExpr_return prefixExpr239 = null;


        Object STAR236_tree=null;
        Object SLASH237_tree=null;
        Object PERCENT238_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(276, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:19: ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:21: ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(276,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:21: ( prefixExpr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:22: prefixExpr
            {
            dbg.location(276,22);
            pushFollow(FOLLOW_prefixExpr_in_multExpr2567);
            prefixExpr235=prefixExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr235.getTree());

            }

            dbg.location(276,34);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:34: ( ( STAR | SLASH | PERCENT ) prefixExpr )*
            try { dbg.enterSubRule(52);

            loop52:
            do {
                int alt52=2;
                try { dbg.enterDecision(52);

                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=STAR && LA52_0<=PERCENT)) ) {
                    alt52=1;
                }


                } finally {dbg.exitDecision(52);}

                switch (alt52) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:35: ( STAR | SLASH | PERCENT ) prefixExpr
            	    {
            	    dbg.location(276,35);
            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:35: ( STAR | SLASH | PERCENT )
            	    int alt51=3;
            	    try { dbg.enterSubRule(51);
            	    try { dbg.enterDecision(51);

            	    switch ( input.LA(1) ) {
            	    case STAR:
            	        {
            	        alt51=1;
            	        }
            	        break;
            	    case SLASH:
            	        {
            	        alt51=2;
            	        }
            	        break;
            	    case PERCENT:
            	        {
            	        alt51=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }

            	    } finally {dbg.exitDecision(51);}

            	    switch (alt51) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:36: STAR
            	            {
            	            dbg.location(276,40);
            	            STAR236=(Token)match(input,STAR,FOLLOW_STAR_in_multExpr2572); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            STAR236_tree = (Object)adaptor.create(STAR236);
            	            root_0 = (Object)adaptor.becomeRoot(STAR236_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:42: SLASH
            	            {
            	            dbg.location(276,47);
            	            SLASH237=(Token)match(input,SLASH,FOLLOW_SLASH_in_multExpr2575); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SLASH237_tree = (Object)adaptor.create(SLASH237);
            	            root_0 = (Object)adaptor.becomeRoot(SLASH237_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:49: PERCENT
            	            {
            	            dbg.location(276,56);
            	            PERCENT238=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2578); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PERCENT238_tree = (Object)adaptor.create(PERCENT238);
            	            root_0 = (Object)adaptor.becomeRoot(PERCENT238_tree, root_0);
            	            }

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(51);}

            	    dbg.location(276,59);
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2582);
            	    prefixExpr239=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr239.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);
            } finally {dbg.exitSubRule(52);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, multExpr_StartIndex); }
        }
        dbg.location(277, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "multExpr"

    public static class prefixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefixExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:1: prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr );
    public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
        retval.start = input.LT(1);
        int prefixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token set240=null;
        TinyHaxeTry1Parser.prefixExpr_return prefixExpr241 = null;

        TinyHaxeTry1Parser.newExpr_return newExpr242 = null;

        TinyHaxeTry1Parser.cast_return cast243 = null;

        TinyHaxeTry1Parser.suffixExpr_return suffixExpr244 = null;


        Object set240_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "prefixExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:19: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr | cast | suffixExpr )
            int alt53=4;
            try { dbg.enterDecision(53);

            switch ( input.LA(1) ) {
            case PLUSPLUS:
                {
                int LA53_1 = input.LA(2);

                if ( (synpred98_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case NEW:
                {
                alt53=2;
                }
                break;
            case CAST:
                {
                alt53=3;
                }
                break;
            case EOF:
            case SEMI:
            case IDENTIFIER:
            case COMMA:
            case QUES:
            case EQ:
            case PLUSEQ:
            case SUBEQ:
            case SLASHEQ:
            case PERCENTEQ:
            case AMPEQ:
            case FUNCTION:
            case LPAREN:
            case RPAREN:
            case LBRACKET:
            case RBRACKET:
            case COLON:
            case LT:
            case GT:
            case IN:
            case LBRACE:
            case RBRACE:
            case ELLIPSIS:
            case BARBAR:
            case AMPAMP:
            case EQEQ:
            case BANGEQ:
            case GTEQ:
            case LTEQ:
            case BAR:
            case AMP:
            case CARET:
            case LTLT:
            case GTGT:
            case GTGTGT:
            case PLUS:
            case STAR:
            case SLASH:
            case PERCENT:
            case NULL:
            case LONGLITERAL:
            case INTLITERAL:
            case STRINGLITERAL:
            case CHARLITERAL:
            case FLOATNUM:
            case TRUE:
            case FALSE:
                {
                alt53=4;
                }
                break;
            case SUBSUB:
                {
                int LA53_5 = input.LA(2);

                if ( (synpred98_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case SUB:
                {
                int LA53_6 = input.LA(2);

                if ( (synpred98_TinyHaxeTry1()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case BANG:
            case TILDE:
                {
                alt53=1;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(278,21);
                    set240=(Token)input.LT(1);
                    if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set240));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(278,54);
                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2612);
                    prefixExpr241=prefixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefixExpr241.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:279:25: newExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(279,25);
                    pushFollow(FOLLOW_newExpr_in_prefixExpr2638);
                    newExpr242=newExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpr242.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:280:25: cast
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(280,25);
                    pushFollow(FOLLOW_cast_in_prefixExpr2664);
                    cast243=cast();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast243.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:281:25: suffixExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(281,25);
                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2690);
                    suffixExpr244=suffixExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, suffixExpr244.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 56, prefixExpr_StartIndex); }
        }
        dbg.location(282, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prefixExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prefixExpr"

    public static class suffixExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "suffixExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:284:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );
    public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr() throws RecognitionException {
        TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
        retval.start = input.LT(1);
        int suffixExpr_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN246=null;
        Token RPAREN248=null;
        Token LBRACKET250=null;
        Token RBRACKET252=null;
        Token PLUSPLUS254=null;
        Token SUBSUB256=null;
        TinyHaxeTry1Parser.value_return value245 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt247 = null;

        TinyHaxeTry1Parser.value_return value249 = null;

        TinyHaxeTry1Parser.expr_return expr251 = null;

        TinyHaxeTry1Parser.value_return value253 = null;

        TinyHaxeTry1Parser.value_return value255 = null;

        TinyHaxeTry1Parser.value_return value257 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt258 = null;


        Object LPAREN246_tree=null;
        Object RPAREN248_tree=null;
        Object LBRACKET250_tree=null;
        Object RBRACKET252_tree=null;
        Object PLUSPLUS254_tree=null;
        Object SUBSUB256_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SUBSUB=new RewriteRuleTokenStream(adaptor,"token SUBSUB");
        RewriteRuleTokenStream stream_PLUSPLUS=new RewriteRuleTokenStream(adaptor,"token PLUSPLUS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try { dbg.enterRule(getGrammarFileName(), "suffixExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(284, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:2: ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt )
            int alt54=5;
            try { dbg.enterDecision(54);

            try {
                isCyclicDecision = true;
                alt54 = dfa54.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(54);}

            switch (alt54) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:4: value LPAREN exprListOpt RPAREN
                    {
                    dbg.location(285,4);
                    pushFollow(FOLLOW_value_in_suffixExpr2709);
                    value245=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value245.getTree());
                    dbg.location(285,10);
                    LPAREN246=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN246);

                    dbg.location(285,17);
                    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2713);
                    exprListOpt247=exprListOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt247.getTree());
                    dbg.location(285,29);
                    RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN248);



                    // AST REWRITE
                    // elements: value, exprListOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 285:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                    {
                        dbg.location(285,39);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:39: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(285,41);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        dbg.location(285,93);
                        adaptor.addChild(root_1, stream_value.nextTree());
                        dbg.location(285,99);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:99: ( exprListOpt )?
                        if ( stream_exprListOpt.hasNext() ) {
                            dbg.location(285,99);
                            adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                        }
                        stream_exprListOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:286:4: value LBRACKET expr RBRACKET
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(286,4);
                    pushFollow(FOLLOW_value_in_suffixExpr2735);
                    value249=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value249.getTree());
                    dbg.location(286,10);
                    LBRACKET250=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2737); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LBRACKET250_tree = (Object)adaptor.create(LBRACKET250);
                    adaptor.addChild(root_0, LBRACKET250_tree);
                    }
                    dbg.location(286,19);
                    pushFollow(FOLLOW_expr_in_suffixExpr2739);
                    expr251=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr251.getTree());
                    dbg.location(286,24);
                    RBRACKET252=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2741); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RBRACKET252_tree = (Object)adaptor.create(RBRACKET252);
                    adaptor.addChild(root_0, RBRACKET252_tree);
                    }

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:287:4: value PLUSPLUS
                    {
                    dbg.location(287,4);
                    pushFollow(FOLLOW_value_in_suffixExpr2746);
                    value253=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value253.getTree());
                    dbg.location(287,10);
                    PLUSPLUS254=(Token)match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUSPLUS.add(PLUSPLUS254);



                    // AST REWRITE
                    // elements: value, PLUSPLUS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 287:19: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
                    {
                        dbg.location(287,21);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:287:21: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(287,23);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        dbg.location(287,75);
                        adaptor.addChild(root_1, stream_value.nextTree());
                        dbg.location(287,81);
                        adaptor.addChild(root_1, stream_PLUSPLUS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:288:4: value SUBSUB
                    {
                    dbg.location(288,4);
                    pushFollow(FOLLOW_value_in_suffixExpr2766);
                    value255=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value255.getTree());
                    dbg.location(288,10);
                    SUBSUB256=(Token)match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SUBSUB.add(SUBSUB256);



                    // AST REWRITE
                    // elements: value, SUBSUB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 288:17: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
                    {
                        dbg.location(288,20);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:288:20: ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(288,22);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(SUFFIX_EXPR, "SUFFIX_EXPR", true), root_1);

                        dbg.location(288,74);
                        adaptor.addChild(root_1, stream_value.nextTree());
                        dbg.location(288,80);
                        adaptor.addChild(root_1, stream_SUBSUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:289:4: value typeParamOpt
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(289,4);
                    pushFollow(FOLLOW_value_in_suffixExpr2787);
                    value257=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value257.getTree());
                    dbg.location(289,10);
                    pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2789);
                    typeParamOpt258=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeParamOpt258.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 57, suffixExpr_StartIndex); }
        }
        dbg.location(290, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "suffixExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "suffixExpr"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );
    public final TinyHaxeTry1Parser.value_return value() throws RecognitionException {
        TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
        retval.start = input.LT(1);
        int value_StartIndex = input.index();
        Object root_0 = null;

        Token NULL262=null;
        Token LPAREN264=null;
        Token RPAREN267=null;
        TinyHaxeTry1Parser.funcLit_return funcLit259 = null;

        TinyHaxeTry1Parser.arrayLit_return arrayLit260 = null;

        TinyHaxeTry1Parser.objLit_return objLit261 = null;

        TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol263 = null;

        TinyHaxeTry1Parser.expr_return expr265 = null;

        TinyHaxeTry1Parser.statement_return statement266 = null;

        TinyHaxeTry1Parser.dotIdent_return dotIdent268 = null;


        Object NULL262_tree=null;
        Object LPAREN264_tree=null;
        Object RPAREN267_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(292, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:7: ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | )
            int alt56=8;
            try { dbg.enterDecision(56);

            try {
                isCyclicDecision = true;
                alt56 = dfa56.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:9: funcLit
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(292,9);
                    pushFollow(FOLLOW_funcLit_in_value2798);
                    funcLit259=funcLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcLit259.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:293:4: arrayLit
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(293,4);
                    pushFollow(FOLLOW_arrayLit_in_value2804);
                    arrayLit260=arrayLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayLit260.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:294:14: objLit
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(294,14);
                    pushFollow(FOLLOW_objLit_in_value2819);
                    objLit261=objLit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLit261.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:295:14: NULL
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(295,14);
                    NULL262=(Token)match(input,NULL,FOLLOW_NULL_in_value2834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL262_tree = (Object)adaptor.create(NULL262);
                    adaptor.addChild(root_0, NULL262_tree);
                    }

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:296:14: elementarySymbol
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(296,14);
                    pushFollow(FOLLOW_elementarySymbol_in_value2849);
                    elementarySymbol263=elementarySymbol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elementarySymbol263.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:14: LPAREN ( expr | statement ) RPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(297,20);
                    LPAREN264=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value2864); if (state.failed) return retval;
                    dbg.location(297,22);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:22: ( expr | statement )
                    int alt55=2;
                    try { dbg.enterSubRule(55);
                    try { dbg.enterDecision(55);

                    try {
                        isCyclicDecision = true;
                        alt55 = dfa55.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(55);}

                    switch (alt55) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:23: expr
                            {
                            dbg.location(297,23);
                            pushFollow(FOLLOW_expr_in_value2868);
                            expr265=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr265.getTree());

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:28: statement
                            {
                            dbg.location(297,28);
                            pushFollow(FOLLOW_statement_in_value2870);
                            statement266=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement266.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(55);}

                    dbg.location(297,45);
                    RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value2873); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:298:11: dotIdent
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(298,11);
                    pushFollow(FOLLOW_dotIdent_in_value2886);
                    dotIdent268=dotIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotIdent268.getTree());

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:9: 
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
            if ( state.backtracking>0 ) { memoize(input, 58, value_StartIndex); }
        }
        dbg.location(300, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "value"

    public static class newExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpr"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:1: newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) ;
    public final TinyHaxeTry1Parser.newExpr_return newExpr() throws RecognitionException {
        TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
        retval.start = input.LT(1);
        int newExpr_StartIndex = input.index();
        Object root_0 = null;

        Token NEW269=null;
        Token LPAREN271=null;
        Token RPAREN273=null;
        TinyHaxeTry1Parser.type_return type270 = null;

        TinyHaxeTry1Parser.exprListOpt_return exprListOpt272 = null;


        Object NEW269_tree=null;
        Object LPAREN271_tree=null;
        Object RPAREN273_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_exprListOpt=new RewriteRuleSubtreeStream(adaptor,"rule exprListOpt");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "newExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(302, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:19: ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:21: NEW type LPAREN exprListOpt RPAREN
            {
            dbg.location(302,21);
            NEW269=(Token)match(input,NEW,FOLLOW_NEW_in_newExpr2931); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEW.add(NEW269);

            dbg.location(302,25);
            pushFollow(FOLLOW_type_in_newExpr2933);
            type270=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type270.getTree());
            dbg.location(302,30);
            LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2935); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN271);

            dbg.location(302,37);
            pushFollow(FOLLOW_exprListOpt_in_newExpr2937);
            exprListOpt272=exprListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exprListOpt.add(exprListOpt272.getTree());
            dbg.location(302,49);
            RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2939); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN273);



            // AST REWRITE
            // elements: exprListOpt, type, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 302:56: -> ^( NEW type exprListOpt )
            {
                dbg.location(302,58);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:58: ^( NEW type exprListOpt )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(302,60);
                root_1 = (Object)adaptor.becomeRoot(stream_NEW.nextNode(), root_1);

                dbg.location(302,64);
                adaptor.addChild(root_1, stream_type.nextTree());
                dbg.location(302,69);
                adaptor.addChild(root_1, stream_exprListOpt.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, newExpr_StartIndex); }
        }
        dbg.location(303, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "newExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "newExpr"

    public static class cast_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:1: cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
    public final TinyHaxeTry1Parser.cast_return cast() throws RecognitionException {
        TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
        retval.start = input.LT(1);
        int cast_StartIndex = input.index();
        Object root_0 = null;

        Token CAST274=null;
        Token LPAREN275=null;
        Token COMMA277=null;
        Token RPAREN279=null;
        Token CAST280=null;
        Token LPAREN281=null;
        Token RPAREN283=null;
        TinyHaxeTry1Parser.expr_return expr276 = null;

        TinyHaxeTry1Parser.funcType_return funcType278 = null;

        TinyHaxeTry1Parser.expr_return expr282 = null;


        Object CAST274_tree=null;
        Object LPAREN275_tree=null;
        Object COMMA277_tree=null;
        Object RPAREN279_tree=null;
        Object CAST280_tree=null;
        Object LPAREN281_tree=null;
        Object RPAREN283_tree=null;
        RewriteRuleTokenStream stream_CAST=new RewriteRuleTokenStream(adaptor,"token CAST");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_funcType=new RewriteRuleSubtreeStream(adaptor,"rule funcType");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "cast");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(304, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:9: ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
            int alt58=2;
            try { dbg.enterDecision(58);

            int LA58_0 = input.LA(1);

            if ( (LA58_0==CAST) ) {
                int LA58_1 = input.LA(2);

                if ( (synpred114_TinyHaxeTry1()) ) {
                    alt58=1;
                }
                else if ( (true) ) {
                    alt58=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(58);}

            switch (alt58) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
                    {
                    dbg.location(304,11);
                    CAST274=(Token)match(input,CAST,FOLLOW_CAST_in_cast2960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST274);

                    dbg.location(304,16);
                    LPAREN275=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN275);

                    dbg.location(304,23);
                    pushFollow(FOLLOW_expr_in_cast2964);
                    expr276=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr276.getTree());
                    dbg.location(304,28);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:28: ( COMMA funcType )?
                    int alt57=2;
                    try { dbg.enterSubRule(57);
                    try { dbg.enterDecision(57);

                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COMMA) ) {
                        alt57=1;
                    }
                    } finally {dbg.exitDecision(57);}

                    switch (alt57) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:29: COMMA funcType
                            {
                            dbg.location(304,29);
                            COMMA277=(Token)match(input,COMMA,FOLLOW_COMMA_in_cast2967); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA277);

                            dbg.location(304,35);
                            pushFollow(FOLLOW_funcType_in_cast2969);
                            funcType278=funcType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_funcType.add(funcType278.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(57);}

                    dbg.location(304,46);
                    RPAREN279=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2973); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN279);



                    // AST REWRITE
                    // elements: expr, funcType, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 304:53: -> ^( CAST expr ( funcType )? )
                    {
                        dbg.location(304,56);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:56: ^( CAST expr ( funcType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(304,58);
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        dbg.location(304,63);
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        dbg.location(304,68);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:68: ( funcType )?
                        if ( stream_funcType.hasNext() ) {
                            dbg.location(304,68);
                            adaptor.addChild(root_1, stream_funcType.nextTree());

                        }
                        stream_funcType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:4: CAST LPAREN expr RPAREN
                    {
                    dbg.location(305,4);
                    CAST280=(Token)match(input,CAST,FOLLOW_CAST_in_cast2989); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CAST.add(CAST280);

                    dbg.location(305,9);
                    LPAREN281=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_cast2991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN281);

                    dbg.location(305,16);
                    pushFollow(FOLLOW_expr_in_cast2993);
                    expr282=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr282.getTree());
                    dbg.location(305,21);
                    RPAREN283=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_cast2995); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN283);



                    // AST REWRITE
                    // elements: expr, CAST
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 305:28: -> ^( CAST expr )
                    {
                        dbg.location(305,30);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:305:30: ^( CAST expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(305,32);
                        root_1 = (Object)adaptor.becomeRoot(stream_CAST.nextNode(), root_1);

                        dbg.location(305,37);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 60, cast_StartIndex); }
        }
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cast");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cast"

    public static class topLevelDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topLevelDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl() throws RecognitionException {
        TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
        retval.start = input.LT(1);
        int topLevelDecl_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classDecl_return classDecl284 = null;

        TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl285 = null;

        TinyHaxeTry1Parser.enumDecl_return enumDecl286 = null;

        TinyHaxeTry1Parser.typedefDecl_return typedefDecl287 = null;



        try { dbg.enterRule(getGrammarFileName(), "topLevelDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt59=4;
            try { dbg.enterDecision(59);

            switch ( input.LA(1) ) {
            case EXTERN:
            case CLASS:
                {
                alt59=1;
                }
                break;
            case INTERFACE:
                {
                alt59=2;
                }
                break;
            case ENUM:
                {
                alt59=3;
                }
                break;
            case TYPEDEF:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(59);}

            switch (alt59) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:21: classDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(309,21);
                    pushFollow(FOLLOW_classDecl_in_topLevelDecl3018);
                    classDecl284=classDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDecl284.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:310:25: interfaceDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(310,25);
                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3044);
                    interfaceDecl285=interfaceDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDecl285.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:311:25: enumDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(311,25);
                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3070);
                    enumDecl286=enumDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumDecl286.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:25: typedefDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(312,25);
                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3096);
                    typedefDecl287=typedefDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typedefDecl287.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 61, topLevelDecl_StartIndex); }
        }
        dbg.location(313, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevelDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "topLevelDecl"

    public static class enumDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:1: enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) ;
    public final TinyHaxeTry1Parser.enumDecl_return enumDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
        retval.start = input.LT(1);
        int enumDecl_StartIndex = input.index();
        Object root_0 = null;

        Token ENUM288=null;
        Token IDENTIFIER289=null;
        Token LBRACE291=null;
        Token RBRACE293=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt290 = null;

        TinyHaxeTry1Parser.enumBody_return enumBody292 = null;


        Object ENUM288_tree=null;
        Object IDENTIFIER289_tree=null;
        Object LBRACE291_tree=null;
        Object RBRACE293_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_enumBody=new RewriteRuleSubtreeStream(adaptor,"rule enumBody");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try { dbg.enterRule(getGrammarFileName(), "enumDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:19: ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM IDENTIFIER typeParamOpt enumBody ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:21: ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
            {
            dbg.location(314,21);
            ENUM288=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumDecl3114); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ENUM.add(ENUM288);

            dbg.location(314,26);
            IDENTIFIER289=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3116); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER289);

            dbg.location(314,37);
            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3118);
            typeParamOpt290=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt290.getTree());
            dbg.location(314,50);
            LBRACE291=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE291);

            dbg.location(314,57);
            pushFollow(FOLLOW_enumBody_in_enumDecl3122);
            enumBody292=enumBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_enumBody.add(enumBody292.getTree());
            dbg.location(314,66);
            RBRACE293=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3124); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE293);



            // AST REWRITE
            // elements: IDENTIFIER, ENUM, typeParamOpt, enumBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 314:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
            {
                dbg.location(314,76);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:76: ^( ENUM IDENTIFIER typeParamOpt enumBody )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(314,78);
                root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                dbg.location(314,83);
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                dbg.location(314,94);
                adaptor.addChild(root_1, stream_typeParamOpt.nextTree());
                dbg.location(314,107);
                adaptor.addChild(root_1, stream_enumBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, enumDecl_StartIndex); }
        }
        dbg.location(315, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "enumDecl"

    public static class enumBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:316:1: enumBody : ( enumValueDecl )+ ;
    public final TinyHaxeTry1Parser.enumBody_return enumBody() throws RecognitionException {
        TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
        retval.start = input.LT(1);
        int enumBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl294 = null;



        try { dbg.enterRule(getGrammarFileName(), "enumBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:316:19: ( ( enumValueDecl )+ )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:316:21: ( enumValueDecl )+
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(316,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:316:21: ( enumValueDecl )+
            int cnt60=0;
            try { dbg.enterSubRule(60);

            loop60:
            do {
                int alt60=2;
                try { dbg.enterDecision(60);

                int LA60_0 = input.LA(1);

                if ( (LA60_0==IDENTIFIER||LA60_0==PP_IF||(LA60_0>=PP_ELSEIF && LA60_0<=PP_ERROR)) ) {
                    alt60=1;
                }


                } finally {dbg.exitDecision(60);}

                switch (alt60) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:316:22: enumValueDecl
            	    {
            	    dbg.location(316,22);
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3155);
            	    enumValueDecl294=enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumValueDecl294.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt60++;
            } while (true);
            } finally {dbg.exitSubRule(60);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, enumBody_StartIndex); }
        }
        dbg.location(317, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "enumBody"

    public static class enumValueDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumValueDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:319:1: enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp );
    public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl() throws RecognitionException {
        TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
        retval.start = input.LT(1);
        int enumValueDecl_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER295=null;
        Token LPAREN296=null;
        Token RPAREN298=null;
        Token SEMI299=null;
        Token IDENTIFIER300=null;
        Token SEMI301=null;
        TinyHaxeTry1Parser.paramList_return paramList297 = null;

        TinyHaxeTry1Parser.pp_return pp302 = null;


        Object IDENTIFIER295_tree=null;
        Object LPAREN296_tree=null;
        Object RPAREN298_tree=null;
        Object SEMI299_tree=null;
        Object IDENTIFIER300_tree=null;
        Object SEMI301_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "enumValueDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(319, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:320:2: ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp )
            int alt61=3;
            try { dbg.enterDecision(61);

            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==LPAREN) ) {
                    alt61=1;
                }
                else if ( (LA61_1==SEMI) ) {
                    alt61=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA61_0==PP_IF||(LA61_0>=PP_ELSEIF && LA61_0<=PP_ERROR)) ) {
                alt61=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(61);}

            switch (alt61) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:320:4: IDENTIFIER LPAREN paramList RPAREN SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(320,4);
                    IDENTIFIER295=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER295_tree = (Object)adaptor.create(IDENTIFIER295);
                    adaptor.addChild(root_0, IDENTIFIER295_tree);
                    }
                    dbg.location(320,21);
                    LPAREN296=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3176); if (state.failed) return retval;
                    dbg.location(320,23);
                    pushFollow(FOLLOW_paramList_in_enumValueDecl3179);
                    paramList297=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramList297.getTree());
                    dbg.location(320,39);
                    RPAREN298=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3181); if (state.failed) return retval;
                    dbg.location(320,45);
                    SEMI299=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3184); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:321:4: IDENTIFIER SEMI
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(321,4);
                    IDENTIFIER300=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER300_tree = (Object)adaptor.create(IDENTIFIER300);
                    adaptor.addChild(root_0, IDENTIFIER300_tree);
                    }
                    dbg.location(321,19);
                    SEMI301=(Token)match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3193); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:322:4: pp
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(322,4);
                    pushFollow(FOLLOW_pp_in_enumValueDecl3200);
                    pp302=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp302.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 64, enumValueDecl_StartIndex); }
        }
        dbg.location(323, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumValueDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "enumValueDecl"

    public static class varDeclList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:325:1: varDeclList : varDecl varDeclList ;
    public final TinyHaxeTry1Parser.varDeclList_return varDeclList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
        retval.start = input.LT(1);
        int varDeclList_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl303 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList304 = null;



        try { dbg.enterRule(getGrammarFileName(), "varDeclList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(325, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:325:19: ( varDecl varDeclList )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:325:21: varDecl varDeclList
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(325,21);
            pushFollow(FOLLOW_varDecl_in_varDeclList3217);
            varDecl303=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl303.getTree());
            dbg.location(325,29);
            pushFollow(FOLLOW_varDeclList_in_varDeclList3219);
            varDeclList304=varDeclList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList304.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclList_StartIndex); }
        }
        dbg.location(326, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDeclList"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:1: varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) ;
    public final TinyHaxeTry1Parser.varDecl_return varDecl() throws RecognitionException {
        TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
        retval.start = input.LT(1);
        int varDecl_StartIndex = input.index();
        Object root_0 = null;

        Token VAR306=null;
        Token SEMI308=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList305 = null;

        TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList307 = null;


        Object VAR306_tree=null;
        Object SEMI308_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_varDeclPartList=new RewriteRuleSubtreeStream(adaptor,"rule varDeclPartList");
        try { dbg.enterRule(getGrammarFileName(), "varDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(328, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:19: ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:21: ( declAttrList )? VAR varDeclPartList SEMI
            {
            dbg.location(328,21);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:21: ( declAttrList )?
            int alt62=2;
            try { dbg.enterSubRule(62);
            try { dbg.enterDecision(62);

            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=PUBLIC && LA62_0<=OVERRIDE)) ) {
                alt62=1;
            }
            } finally {dbg.exitDecision(62);}

            switch (alt62) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:22: declAttrList
                    {
                    dbg.location(328,22);
                    pushFollow(FOLLOW_declAttrList_in_varDecl3241);
                    declAttrList305=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList305.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(62);}

            dbg.location(328,37);
            VAR306=(Token)match(input,VAR,FOLLOW_VAR_in_varDecl3245); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR306);

            dbg.location(328,41);
            pushFollow(FOLLOW_varDeclPartList_in_varDecl3247);
            varDeclPartList307=varDeclPartList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDeclPartList.add(varDeclPartList307.getTree());
            dbg.location(328,57);
            SEMI308=(Token)match(input,SEMI,FOLLOW_SEMI_in_varDecl3249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI.add(SEMI308);



            // AST REWRITE
            // elements: varDeclPartList, declAttrList, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:62: -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
            {
                dbg.location(328,64);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:64: ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(328,66);
                root_1 = (Object)adaptor.becomeRoot(new VarDeclaration(VAR, VAR306), root_1);

                dbg.location(328,92);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:92: ( declAttrList )?
                if ( stream_declAttrList.hasNext() ) {
                    dbg.location(328,92);
                    adaptor.addChild(root_1, stream_declAttrList.nextTree());

                }
                stream_declAttrList.reset();
                dbg.location(328,106);
                adaptor.addChild(root_1, stream_varDeclPartList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, varDecl_StartIndex); }
        }
        dbg.location(329, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDecl"

    public static class varDeclPartList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPartList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:1: varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
    public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
        retval.start = input.LT(1);
        int varDeclPartList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA310=null;
        TinyHaxeTry1Parser.varDeclPart_return varDeclPart309 = null;

        TinyHaxeTry1Parser.varDeclPart_return varDeclPart311 = null;


        Object COMMA310_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "varDeclPartList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:19: ( varDeclPart ( COMMA varDeclPart )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:21: varDeclPart ( COMMA varDeclPart )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(331,21);
            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3277);
            varDeclPart309=varDeclPart();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart309.getTree());
            dbg.location(331,33);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:33: ( COMMA varDeclPart )*
            try { dbg.enterSubRule(63);

            loop63:
            do {
                int alt63=2;
                try { dbg.enterDecision(63);

                int LA63_0 = input.LA(1);

                if ( (LA63_0==COMMA) ) {
                    alt63=1;
                }


                } finally {dbg.exitDecision(63);}

                switch (alt63) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:331:34: COMMA varDeclPart
            	    {
            	    dbg.location(331,39);
            	    COMMA310=(Token)match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3280); if (state.failed) return retval;
            	    dbg.location(331,41);
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3283);
            	    varDeclPart311=varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclPart311.getTree());

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);
            } finally {dbg.exitSubRule(63);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, varDeclPartList_StartIndex); }
        }
        dbg.location(332, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclPartList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDeclPartList"

    public static class varDeclPart_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclPart"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:333:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
    public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart() throws RecognitionException {
        TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
        retval.start = input.LT(1);
        int varDeclPart_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER312=null;
        TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt313 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt314 = null;

        TinyHaxeTry1Parser.varInit_return varInit315 = null;


        Object IDENTIFIER312_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "varDeclPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(333, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:333:19: ( IDENTIFIER propDeclOpt typeTagOpt varInit )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:333:20: IDENTIFIER propDeclOpt typeTagOpt varInit
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(333,20);
            IDENTIFIER312=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3299); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER312_tree = new VarUsage(IDENTIFIER312) ;
            adaptor.addChild(root_0, IDENTIFIER312_tree);
            }
            dbg.location(333,41);
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3304);
            propDeclOpt313=propDeclOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, propDeclOpt313.getTree());
            dbg.location(333,53);
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3306);
            typeTagOpt314=typeTagOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeTagOpt314.getTree());
            dbg.location(333,64);
            pushFollow(FOLLOW_varInit_in_varDeclPart3308);
            varInit315=varInit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, varInit315.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, varDeclPart_StartIndex); }
        }
        dbg.location(334, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDeclPart"

    public static class propDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:1: propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) ;
    public final TinyHaxeTry1Parser.propDecl_return propDecl() throws RecognitionException {
        TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
        retval.start = input.LT(1);
        int propDecl_StartIndex = input.index();
        Object root_0 = null;

        Token LPAREN316=null;
        Token COMMA317=null;
        Token RPAREN318=null;
        TinyHaxeTry1Parser.propAccessor_return a1 = null;

        TinyHaxeTry1Parser.propAccessor_return a2 = null;


        Object LPAREN316_tree=null;
        Object COMMA317_tree=null;
        Object RPAREN318_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_propAccessor=new RewriteRuleSubtreeStream(adaptor,"rule propAccessor");
        try { dbg.enterRule(getGrammarFileName(), "propDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:9: ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:11: LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
            {
            dbg.location(336,11);
            LPAREN316=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN316);

            dbg.location(336,20);
            pushFollow(FOLLOW_propAccessor_in_propDecl3322);
            a1=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a1.getTree());
            dbg.location(336,34);
            COMMA317=(Token)match(input,COMMA,FOLLOW_COMMA_in_propDecl3324); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COMMA.add(COMMA317);

            dbg.location(336,42);
            pushFollow(FOLLOW_propAccessor_in_propDecl3328);
            a2=propAccessor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_propAccessor.add(a2.getTree());
            dbg.location(336,56);
            RPAREN318=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3330); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN318);



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
            // 336:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
            {
                dbg.location(336,66);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:66: ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(336,68);
                root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(PROPERTY_DECL, "PROPERTY_DECL", true), root_1);

                dbg.location(336,124);
                adaptor.addChild(root_1, stream_a1.nextTree());
                dbg.location(336,128);
                adaptor.addChild(root_1, stream_a2.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, propDecl_StartIndex); }
        }
        dbg.location(337, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "propDecl"

    public static class propAccessor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propAccessor"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:339:1: propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
    public final TinyHaxeTry1Parser.propAccessor_return propAccessor() throws RecognitionException {
        TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
        retval.start = input.LT(1);
        int propAccessor_StartIndex = input.index();
        Object root_0 = null;

        Token set319=null;

        Object set319_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "propAccessor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(339, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:340:2: ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(340,2);
            set319=(Token)input.LT(1);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DYNAMIC||input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set319));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
            if ( state.backtracking>0 ) { memoize(input, 70, propAccessor_StartIndex); }
        }
        dbg.location(344, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propAccessor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "propAccessor"

    public static class propDeclOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propDeclOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:346:1: propDeclOpt : ( propDecl | );
    public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt() throws RecognitionException {
        TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
        retval.start = input.LT(1);
        int propDeclOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.propDecl_return propDecl320 = null;



        try { dbg.enterRule(getGrammarFileName(), "propDeclOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(346, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:347:2: ( propDecl | )
            int alt64=2;
            try { dbg.enterDecision(64);

            int LA64_0 = input.LA(1);

            if ( (LA64_0==LPAREN) ) {
                alt64=1;
            }
            else if ( (LA64_0==EOF||LA64_0==SEMI||LA64_0==COMMA||LA64_0==EQ||LA64_0==RPAREN||LA64_0==COLON||LA64_0==LBRACE) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:347:4: propDecl
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(347,4);
                    pushFollow(FOLLOW_propDecl_in_propDeclOpt3388);
                    propDecl320=propDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, propDecl320.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:349:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 71, propDeclOpt_StartIndex); }
        }
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propDeclOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "propDeclOpt"

    public static class varInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varInit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:1: varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | );
    public final TinyHaxeTry1Parser.varInit_return varInit() throws RecognitionException {
        TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
        retval.start = input.LT(1);
        int varInit_StartIndex = input.index();
        Object root_0 = null;

        Token EQ321=null;
        TinyHaxeTry1Parser.expr_return expr322 = null;


        Object EQ321_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "varInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(351, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:9: ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | )
            int alt65=2;
            try { dbg.enterDecision(65);

            int LA65_0 = input.LA(1);

            if ( (LA65_0==EQ) ) {
                alt65=1;
            }
            else if ( (LA65_0==EOF||LA65_0==SEMI||LA65_0==COMMA||LA65_0==RPAREN) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(65);}

            switch (alt65) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:11: EQ expr
                    {
                    dbg.location(351,11);
                    EQ321=(Token)match(input,EQ,FOLLOW_EQ_in_varInit3403); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQ.add(EQ321);

                    dbg.location(351,14);
                    pushFollow(FOLLOW_expr_in_varInit3405);
                    expr322=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr322.getTree());


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
                    // 351:19: -> ^( VAR_INIT[\"VAR_INIT\",true] expr )
                    {
                        dbg.location(351,21);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:21: ^( VAR_INIT[\"VAR_INIT\",true] expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(351,23);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(VAR_INIT, "VAR_INIT", true), root_1);

                        dbg.location(351,69);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:353:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 72, varInit_StartIndex); }
        }
        dbg.location(353, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varInit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varInit"

    public static class funcDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );
    public final TinyHaxeTry1Parser.funcDecl_return funcDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
        retval.start = input.LT(1);
        int funcDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION324=null;
        Token NEW325=null;
        Token LPAREN326=null;
        Token RPAREN328=null;
        Token FUNCTION332=null;
        Token IDENTIFIER333=null;
        Token LPAREN335=null;
        Token RPAREN337=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList323 = null;

        TinyHaxeTry1Parser.paramList_return paramList327 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt329 = null;

        TinyHaxeTry1Parser.block_return block330 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList331 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt334 = null;

        TinyHaxeTry1Parser.paramList_return paramList336 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt338 = null;

        TinyHaxeTry1Parser.block_return block339 = null;


        Object FUNCTION324_tree=null;
        Object NEW325_tree=null;
        Object LPAREN326_tree=null;
        Object RPAREN328_tree=null;
        Object FUNCTION332_tree=null;
        Object IDENTIFIER333_tree=null;
        Object LPAREN335_tree=null;
        Object RPAREN337_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try { dbg.enterRule(getGrammarFileName(), "funcDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:9: ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) )
            int alt68=2;
            try { dbg.enterDecision(68);

            try {
                isCyclicDecision = true;
                alt68 = dfa68.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(68);}

            switch (alt68) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:11: ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block
                    {
                    dbg.location(355,11);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:11: ( declAttrList )?
                    int alt66=2;
                    try { dbg.enterSubRule(66);
                    try { dbg.enterDecision(66);

                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=PUBLIC && LA66_0<=OVERRIDE)) ) {
                        alt66=1;
                    }
                    } finally {dbg.exitDecision(66);}

                    switch (alt66) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            dbg.location(355,11);
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3430);
                            declAttrList323=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList323.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(66);}

                    dbg.location(355,25);
                    FUNCTION324=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3433); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION324);

                    dbg.location(355,34);
                    NEW325=(Token)match(input,NEW,FOLLOW_NEW_in_funcDecl3435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW325);

                    dbg.location(355,38);
                    LPAREN326=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN326);

                    dbg.location(355,45);
                    pushFollow(FOLLOW_paramList_in_funcDecl3439);
                    paramList327=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList327.getTree());
                    dbg.location(355,55);
                    RPAREN328=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN328);

                    dbg.location(355,62);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3443);
                    typeTagOpt329=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt329.getTree());
                    dbg.location(355,73);
                    pushFollow(FOLLOW_block_in_funcDecl3445);
                    block330=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block330.getTree());


                    // AST REWRITE
                    // elements: typeTagOpt, block, declAttrList, paramList, FUNCTION, NEW
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 355:79: -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                    {
                        dbg.location(355,82);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:82: ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(355,84);
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        dbg.location(355,107);
                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        dbg.location(355,111);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:111: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            dbg.location(355,111);
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        dbg.location(355,125);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:125: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            dbg.location(355,125);
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        dbg.location(355,136);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:136: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            dbg.location(355,136);
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        dbg.location(355,148);
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:4: ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
                    {
                    dbg.location(356,4);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:4: ( declAttrList )?
                    int alt67=2;
                    try { dbg.enterSubRule(67);
                    try { dbg.enterDecision(67);

                    int LA67_0 = input.LA(1);

                    if ( ((LA67_0>=PUBLIC && LA67_0<=OVERRIDE)) ) {
                        alt67=1;
                    }
                    } finally {dbg.exitDecision(67);}

                    switch (alt67) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: declAttrList
                            {
                            dbg.location(356,4);
                            pushFollow(FOLLOW_declAttrList_in_funcDecl3473);
                            declAttrList331=declAttrList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList331.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(67);}

                    dbg.location(356,18);
                    FUNCTION332=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcDecl3476); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION332);

                    dbg.location(356,27);
                    IDENTIFIER333=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER333);

                    dbg.location(356,38);
                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3480);
                    typeParamOpt334=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt334.getTree());
                    dbg.location(356,51);
                    LPAREN335=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN335);

                    dbg.location(356,58);
                    pushFollow(FOLLOW_paramList_in_funcDecl3484);
                    paramList336=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList336.getTree());
                    dbg.location(356,68);
                    RPAREN337=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3486); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN337);

                    dbg.location(356,75);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3488);
                    typeTagOpt338=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt338.getTree());
                    dbg.location(356,86);
                    pushFollow(FOLLOW_block_in_funcDecl3490);
                    block339=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block339.getTree());


                    // AST REWRITE
                    // elements: typeParamOpt, typeTagOpt, declAttrList, paramList, FUNCTION, block, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 356:92: -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                    {
                        dbg.location(356,94);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:94: ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(356,96);
                        root_1 = (Object)adaptor.becomeRoot(new FunctionNode(stream_FUNCTION.nextToken()), root_1);

                        dbg.location(356,119);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(356,130);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:130: ( declAttrList )?
                        if ( stream_declAttrList.hasNext() ) {
                            dbg.location(356,130);
                            adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        }
                        stream_declAttrList.reset();
                        dbg.location(356,144);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:144: ( paramList )?
                        if ( stream_paramList.hasNext() ) {
                            dbg.location(356,144);
                            adaptor.addChild(root_1, stream_paramList.nextTree());

                        }
                        stream_paramList.reset();
                        dbg.location(356,155);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:155: ( typeTagOpt )?
                        if ( stream_typeTagOpt.hasNext() ) {
                            dbg.location(356,155);
                            adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        }
                        stream_typeTagOpt.reset();
                        dbg.location(356,167);
                        adaptor.addChild(root_1, stream_block.nextTree());
                        dbg.location(356,173);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:173: ( typeParamOpt )?
                        if ( stream_typeParamOpt.hasNext() ) {
                            dbg.location(356,173);
                            adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        }
                        stream_typeParamOpt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 73, funcDecl_StartIndex); }
        }
        dbg.location(357, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "funcDecl"

    public static class funcProtoDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funcProtoDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:359:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
    public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl() throws RecognitionException {
        TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
        retval.start = input.LT(1);
        int funcProtoDecl_StartIndex = input.index();
        Object root_0 = null;

        Token FUNCTION341=null;
        Token NEW342=null;
        Token LPAREN343=null;
        Token RPAREN345=null;
        Token SEMI347=null;
        Token FUNCTION349=null;
        Token IDENTIFIER350=null;
        Token LPAREN352=null;
        Token RPAREN354=null;
        Token SEMI356=null;
        Token FUNCTION357=null;
        Token NEW358=null;
        Token LPAREN359=null;
        Token RPAREN361=null;
        Token SEMI363=null;
        Token FUNCTION364=null;
        Token IDENTIFIER365=null;
        Token LPAREN367=null;
        Token RPAREN369=null;
        Token SEMI371=null;
        TinyHaxeTry1Parser.declAttrList_return declAttrList340 = null;

        TinyHaxeTry1Parser.paramList_return paramList344 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt346 = null;

        TinyHaxeTry1Parser.declAttrList_return declAttrList348 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt351 = null;

        TinyHaxeTry1Parser.paramList_return paramList353 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt355 = null;

        TinyHaxeTry1Parser.paramList_return paramList360 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt362 = null;

        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt366 = null;

        TinyHaxeTry1Parser.paramList_return paramList368 = null;

        TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt370 = null;


        Object FUNCTION341_tree=null;
        Object NEW342_tree=null;
        Object LPAREN343_tree=null;
        Object RPAREN345_tree=null;
        Object SEMI347_tree=null;
        Object FUNCTION349_tree=null;
        Object IDENTIFIER350_tree=null;
        Object LPAREN352_tree=null;
        Object RPAREN354_tree=null;
        Object SEMI356_tree=null;
        Object FUNCTION357_tree=null;
        Object NEW358_tree=null;
        Object LPAREN359_tree=null;
        Object RPAREN361_tree=null;
        Object SEMI363_tree=null;
        Object FUNCTION364_tree=null;
        Object IDENTIFIER365_tree=null;
        Object LPAREN367_tree=null;
        Object RPAREN369_tree=null;
        Object SEMI371_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_declAttrList=new RewriteRuleSubtreeStream(adaptor,"rule declAttrList");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_typeTagOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeTagOpt");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        try { dbg.enterRule(getGrammarFileName(), "funcProtoDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(359, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:360:2: ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) )
            int alt69=4;
            try { dbg.enterDecision(69);

            try {
                isCyclicDecision = true;
                alt69 = dfa69.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:360:4: declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    dbg.location(360,4);
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3526);
                    declAttrList340=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList340.getTree());
                    dbg.location(360,17);
                    FUNCTION341=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3528); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION341);

                    dbg.location(360,26);
                    NEW342=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3530); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW342);

                    dbg.location(360,30);
                    LPAREN343=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN343);

                    dbg.location(360,37);
                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3534);
                    paramList344=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList344.getTree());
                    dbg.location(360,47);
                    RPAREN345=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3536); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN345);

                    dbg.location(360,54);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3538);
                    typeTagOpt346=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt346.getTree());
                    dbg.location(360,65);
                    SEMI347=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI347);



                    // AST REWRITE
                    // elements: FUNCTION, NEW, paramList, declAttrList, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 360:70: -> ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                    {
                        dbg.location(360,73);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:360:73: ^( FUNCTION NEW paramList typeTagOpt declAttrList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(360,75);
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        dbg.location(360,84);
                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        dbg.location(360,88);
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        dbg.location(360,98);
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        dbg.location(360,109);
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:361:4: declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    dbg.location(361,4);
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3559);
                    declAttrList348=declAttrList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declAttrList.add(declAttrList348.getTree());
                    dbg.location(361,17);
                    FUNCTION349=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3561); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION349);

                    dbg.location(361,26);
                    IDENTIFIER350=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3563); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER350);

                    dbg.location(361,37);
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3565);
                    typeParamOpt351=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt351.getTree());
                    dbg.location(361,50);
                    LPAREN352=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3567); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN352);

                    dbg.location(361,57);
                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3569);
                    paramList353=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList353.getTree());
                    dbg.location(361,67);
                    RPAREN354=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3571); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN354);

                    dbg.location(361,74);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3573);
                    typeTagOpt355=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt355.getTree());
                    dbg.location(361,85);
                    SEMI356=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3575); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI356);



                    // AST REWRITE
                    // elements: paramList, IDENTIFIER, FUNCTION, declAttrList, typeTagOpt, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 361:90: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                    {
                        dbg.location(361,92);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:361:92: ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(361,94);
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        dbg.location(361,103);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(361,114);
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        dbg.location(361,124);
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        dbg.location(361,135);
                        adaptor.addChild(root_1, stream_declAttrList.nextTree());
                        dbg.location(361,148);
                        adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:362:4: FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    dbg.location(362,4);
                    FUNCTION357=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3595); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION357);

                    dbg.location(362,13);
                    NEW358=(Token)match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW.add(NEW358);

                    dbg.location(362,17);
                    LPAREN359=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3599); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN359);

                    dbg.location(362,24);
                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3601);
                    paramList360=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList360.getTree());
                    dbg.location(362,34);
                    RPAREN361=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN361);

                    dbg.location(362,41);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3605);
                    typeTagOpt362=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt362.getTree());
                    dbg.location(362,52);
                    SEMI363=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI363);



                    // AST REWRITE
                    // elements: paramList, NEW, FUNCTION, typeTagOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 362:57: -> ^( FUNCTION NEW paramList typeTagOpt )
                    {
                        dbg.location(362,60);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:362:60: ^( FUNCTION NEW paramList typeTagOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(362,62);
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        dbg.location(362,71);
                        adaptor.addChild(root_1, stream_NEW.nextNode());
                        dbg.location(362,75);
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        dbg.location(362,85);
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:363:4: FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI
                    {
                    dbg.location(363,4);
                    FUNCTION364=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_funcProtoDecl3624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION.add(FUNCTION364);

                    dbg.location(363,13);
                    IDENTIFIER365=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER365);

                    dbg.location(363,24);
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3628);
                    typeParamOpt366=typeParamOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt366.getTree());
                    dbg.location(363,37);
                    LPAREN367=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN367);

                    dbg.location(363,44);
                    pushFollow(FOLLOW_paramList_in_funcProtoDecl3632);
                    paramList368=paramList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_paramList.add(paramList368.getTree());
                    dbg.location(363,54);
                    RPAREN369=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN369);

                    dbg.location(363,61);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3636);
                    typeTagOpt370=typeTagOpt();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeTagOpt.add(typeTagOpt370.getTree());
                    dbg.location(363,72);
                    SEMI371=(Token)match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI.add(SEMI371);



                    // AST REWRITE
                    // elements: paramList, FUNCTION, IDENTIFIER, typeTagOpt, typeParamOpt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 363:77: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                    {
                        dbg.location(363,79);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:363:79: ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(363,81);
                        root_1 = (Object)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                        dbg.location(363,90);
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        dbg.location(363,101);
                        adaptor.addChild(root_1, stream_paramList.nextTree());
                        dbg.location(363,111);
                        adaptor.addChild(root_1, stream_typeTagOpt.nextTree());
                        dbg.location(363,122);
                        adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 74, funcProtoDecl_StartIndex); }
        }
        dbg.location(364, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcProtoDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "funcProtoDecl"

    public static class classDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:366:1: classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
    public final TinyHaxeTry1Parser.classDecl_return classDecl() throws RecognitionException {
        TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
        retval.start = input.LT(1);
        int classDecl_StartIndex = input.index();
        Object root_0 = null;

        Token EXTERN372=null;
        Token CLASS373=null;
        Token IDENTIFIER374=null;
        Token LBRACE377=null;
        Token RBRACE379=null;
        TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt375 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt376 = null;

        TinyHaxeTry1Parser.classBodyScope_return classBodyScope378 = null;


        Object EXTERN372_tree=null;
        Object CLASS373_tree=null;
        Object IDENTIFIER374_tree=null;
        Object LBRACE377_tree=null;
        Object RBRACE379_tree=null;
        RewriteRuleTokenStream stream_EXTERN=new RewriteRuleTokenStream(adaptor,"token EXTERN");
        RewriteRuleTokenStream stream_CLASS=new RewriteRuleTokenStream(adaptor,"token CLASS");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_classBodyScope=new RewriteRuleSubtreeStream(adaptor,"rule classBodyScope");
        RewriteRuleSubtreeStream stream_typeParamOpt=new RewriteRuleSubtreeStream(adaptor,"rule typeParamOpt");
        RewriteRuleSubtreeStream stream_inheritListOpt=new RewriteRuleSubtreeStream(adaptor,"rule inheritListOpt");
        try { dbg.enterRule(getGrammarFileName(), "classDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(366, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:2: ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:4: ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE classBodyScope RBRACE
            {
            dbg.location(367,4);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:4: ( EXTERN )?
            int alt70=2;
            try { dbg.enterSubRule(70);
            try { dbg.enterDecision(70);

            int LA70_0 = input.LA(1);

            if ( (LA70_0==EXTERN) ) {
                alt70=1;
            }
            } finally {dbg.exitDecision(70);}

            switch (alt70) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0: EXTERN
                    {
                    dbg.location(367,4);
                    EXTERN372=(Token)match(input,EXTERN,FOLLOW_EXTERN_in_classDecl3663); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTERN.add(EXTERN372);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(70);}

            dbg.location(367,12);
            CLASS373=(Token)match(input,CLASS,FOLLOW_CLASS_in_classDecl3666); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CLASS.add(CLASS373);

            dbg.location(367,18);
            IDENTIFIER374=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3668); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER374);

            dbg.location(367,29);
            pushFollow(FOLLOW_typeParamOpt_in_classDecl3670);
            typeParamOpt375=typeParamOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_typeParamOpt.add(typeParamOpt375.getTree());
            dbg.location(367,42);
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3672);
            inheritListOpt376=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inheritListOpt.add(inheritListOpt376.getTree());
            dbg.location(367,57);
            LBRACE377=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classDecl3674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE377);

            dbg.location(367,64);
            pushFollow(FOLLOW_classBodyScope_in_classDecl3676);
            classBodyScope378=classBodyScope();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBodyScope.add(classBodyScope378.getTree());
            dbg.location(367,79);
            RBRACE379=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classDecl3678); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE379);



            // AST REWRITE
            // elements: IDENTIFIER, CLASS, classBodyScope, inheritListOpt, typeParamOpt, EXTERN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 367:86: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
            {
                dbg.location(367,88);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:88: ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(367,90);
                root_1 = (Object)adaptor.becomeRoot(new ClassNode(stream_CLASS.nextToken()), root_1);

                dbg.location(367,107);
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                dbg.location(367,118);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:118: ( EXTERN )?
                if ( stream_EXTERN.hasNext() ) {
                    dbg.location(367,118);
                    adaptor.addChild(root_1, stream_EXTERN.nextNode());

                }
                stream_EXTERN.reset();
                dbg.location(367,126);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:126: ( typeParamOpt )?
                if ( stream_typeParamOpt.hasNext() ) {
                    dbg.location(367,126);
                    adaptor.addChild(root_1, stream_typeParamOpt.nextTree());

                }
                stream_typeParamOpt.reset();
                dbg.location(367,140);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:140: ( inheritListOpt )?
                if ( stream_inheritListOpt.hasNext() ) {
                    dbg.location(367,140);
                    adaptor.addChild(root_1, stream_inheritListOpt.nextTree());

                }
                stream_inheritListOpt.reset();
                dbg.location(367,156);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:156: ( classBodyScope )?
                if ( stream_classBodyScope.hasNext() ) {
                    dbg.location(367,156);
                    adaptor.addChild(root_1, stream_classBodyScope.nextTree());

                }
                stream_classBodyScope.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, classDecl_StartIndex); }
        }
        dbg.location(368, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classDecl"

    public static class classBodyScope_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBodyScope"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:370:1: classBodyScope : classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? ) ;
    public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope() throws RecognitionException {
        TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
        retval.start = input.LT(1);
        int classBodyScope_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.classBody_return classBody380 = null;


        RewriteRuleSubtreeStream stream_classBody=new RewriteRuleSubtreeStream(adaptor,"rule classBody");
        try { dbg.enterRule(getGrammarFileName(), "classBodyScope");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(370, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:371:2: ( classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? ) )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:371:4: classBody
            {
            dbg.location(371,4);
            pushFollow(FOLLOW_classBody_in_classBodyScope3712);
            classBody380=classBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_classBody.add(classBody380.getTree());


            // AST REWRITE
            // elements: classBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 371:14: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? )
            {
                dbg.location(371,17);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:371:17: ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(371,19);
                root_1 = (Object)adaptor.becomeRoot(new BlockScopeNode(BLOCK_SCOPE, "BLOCK_SCOPE", true), root_1);

                dbg.location(371,67);
                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:371:67: ( classBody )?
                if ( stream_classBody.hasNext() ) {
                    dbg.location(371,67);
                    adaptor.addChild(root_1, stream_classBody.nextTree());

                }
                stream_classBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, classBodyScope_StartIndex); }
        }
        dbg.location(372, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBodyScope");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classBodyScope"

    public static class classBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:374:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
    public final TinyHaxeTry1Parser.classBody_return classBody() throws RecognitionException {
        TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
        retval.start = input.LT(1);
        int classBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl381 = null;

        TinyHaxeTry1Parser.classBody_return classBody382 = null;

        TinyHaxeTry1Parser.funcDecl_return funcDecl383 = null;

        TinyHaxeTry1Parser.classBody_return classBody384 = null;

        TinyHaxeTry1Parser.pp_return pp385 = null;

        TinyHaxeTry1Parser.classBody_return classBody386 = null;



        try { dbg.enterRule(getGrammarFileName(), "classBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(374, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:375:2: ( varDecl classBody | funcDecl classBody | pp classBody | )
            int alt71=4;
            try { dbg.enterDecision(71);

            try {
                isCyclicDecision = true;
                alt71 = dfa71.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:375:4: varDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(375,4);
                    pushFollow(FOLLOW_varDecl_in_classBody3737);
                    varDecl381=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl381.getTree());
                    dbg.location(375,12);
                    pushFollow(FOLLOW_classBody_in_classBody3739);
                    classBody382=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody382.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:376:4: funcDecl classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(376,4);
                    pushFollow(FOLLOW_funcDecl_in_classBody3744);
                    funcDecl383=funcDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcDecl383.getTree());
                    dbg.location(376,13);
                    pushFollow(FOLLOW_classBody_in_classBody3746);
                    classBody384=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody384.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:377:4: pp classBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(377,4);
                    pushFollow(FOLLOW_pp_in_classBody3751);
                    pp385=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp385.getTree());
                    dbg.location(377,7);
                    pushFollow(FOLLOW_classBody_in_classBody3753);
                    classBody386=classBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classBody386.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:379:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 77, classBody_StartIndex); }
        }
        dbg.location(379, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "classBody"

    public static class interfaceDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:381:1: interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE ;
    public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
        retval.start = input.LT(1);
        int interfaceDecl_StartIndex = input.index();
        Object root_0 = null;

        Token INTERFACE387=null;
        Token LBRACE390=null;
        Token RBRACE392=null;
        TinyHaxeTry1Parser.type_return type388 = null;

        TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt389 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody391 = null;


        Object INTERFACE387_tree=null;
        Object LBRACE390_tree=null;
        Object RBRACE392_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "interfaceDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:2: ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:4: INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(382,4);
            INTERFACE387=(Token)match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3773); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE387_tree = (Object)adaptor.create(INTERFACE387);
            adaptor.addChild(root_0, INTERFACE387_tree);
            }
            dbg.location(382,14);
            pushFollow(FOLLOW_type_in_interfaceDecl3775);
            type388=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type388.getTree());
            dbg.location(382,19);
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3777);
            inheritListOpt389=inheritListOpt();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inheritListOpt389.getTree());
            dbg.location(382,40);
            LBRACE390=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3779); if (state.failed) return retval;
            dbg.location(382,42);
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3782);
            interfaceBody391=interfaceBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody391.getTree());
            dbg.location(382,62);
            RBRACE392=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3784); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, interfaceDecl_StartIndex); }
        }
        dbg.location(383, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interfaceDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "interfaceDecl"

    public static class interfaceBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceBody"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:385:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );
    public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody() throws RecognitionException {
        TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
        retval.start = input.LT(1);
        int interfaceBody_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.varDecl_return varDecl393 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody394 = null;

        TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl395 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody396 = null;

        TinyHaxeTry1Parser.pp_return pp397 = null;

        TinyHaxeTry1Parser.interfaceBody_return interfaceBody398 = null;



        try { dbg.enterRule(getGrammarFileName(), "interfaceBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(385, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:386:2: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | )
            int alt72=4;
            try { dbg.enterDecision(72);

            try {
                isCyclicDecision = true;
                alt72 = dfa72.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(72);}

            switch (alt72) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:386:4: varDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(386,4);
                    pushFollow(FOLLOW_varDecl_in_interfaceBody3797);
                    varDecl393=varDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDecl393.getTree());
                    dbg.location(386,12);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3799);
                    interfaceBody394=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody394.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:387:4: funcProtoDecl interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(387,4);
                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3804);
                    funcProtoDecl395=funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funcProtoDecl395.getTree());
                    dbg.location(387,18);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3806);
                    interfaceBody396=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody396.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:388:4: pp interfaceBody
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(388,4);
                    pushFollow(FOLLOW_pp_in_interfaceBody3811);
                    pp397=pp();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pp397.getTree());
                    dbg.location(388,7);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3813);
                    interfaceBody398=interfaceBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceBody398.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:390:2: 
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
            if ( state.backtracking>0 ) { memoize(input, 79, interfaceBody_StartIndex); }
        }
        dbg.location(390, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interfaceBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "interfaceBody"

    public static class inheritList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:392:1: inheritList : inherit ( COMMA inherit )* ;
    public final TinyHaxeTry1Parser.inheritList_return inheritList() throws RecognitionException {
        TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
        retval.start = input.LT(1);
        int inheritList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA400=null;
        TinyHaxeTry1Parser.inherit_return inherit399 = null;

        TinyHaxeTry1Parser.inherit_return inherit401 = null;


        Object COMMA400_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "inheritList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(392, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:393:2: ( inherit ( COMMA inherit )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:393:4: inherit ( COMMA inherit )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(393,4);
            pushFollow(FOLLOW_inherit_in_inheritList3834);
            inherit399=inherit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit399.getTree());
            dbg.location(393,12);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:393:12: ( COMMA inherit )*
            try { dbg.enterSubRule(73);

            loop73:
            do {
                int alt73=2;
                try { dbg.enterDecision(73);

                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA) ) {
                    alt73=1;
                }


                } finally {dbg.exitDecision(73);}

                switch (alt73) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:393:13: COMMA inherit
            	    {
            	    dbg.location(393,18);
            	    COMMA400=(Token)match(input,COMMA,FOLLOW_COMMA_in_inheritList3837); if (state.failed) return retval;
            	    dbg.location(393,20);
            	    pushFollow(FOLLOW_inherit_in_inheritList3840);
            	    inherit401=inherit();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inherit401.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);
            } finally {dbg.exitSubRule(73);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, inheritList_StartIndex); }
        }
        dbg.location(394, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inheritList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inheritList"

    public static class inheritListOpt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inheritListOpt"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:396:1: inheritListOpt : ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | );
    public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt() throws RecognitionException {
        TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
        retval.start = input.LT(1);
        int inheritListOpt_StartIndex = input.index();
        Object root_0 = null;

        TinyHaxeTry1Parser.inheritList_return inheritList402 = null;


        RewriteRuleSubtreeStream stream_inheritList=new RewriteRuleSubtreeStream(adaptor,"rule inheritList");
        try { dbg.enterRule(getGrammarFileName(), "inheritListOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(396, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:397:2: ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | )
            int alt74=2;
            try { dbg.enterDecision(74);

            int LA74_0 = input.LA(1);

            if ( ((LA74_0>=EXTENDS && LA74_0<=IMPLEMENTS)) ) {
                alt74=1;
            }
            else if ( (LA74_0==LBRACE) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:397:4: inheritList
                    {
                    dbg.location(397,4);
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt3858);
                    inheritList402=inheritList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inheritList.add(inheritList402.getTree());


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
                    // 397:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                    {
                        dbg.location(397,18);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:397:18: ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(397,20);
                        root_1 = (Object)adaptor.becomeRoot(new ExtendedCommonTree(INHERIT_LIST_OPT, "INHERIT_LIST_OPT", true), root_1);

                        dbg.location(397,82);
                        adaptor.addChild(root_1, stream_inheritList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:399:6: 
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
            if ( state.backtracking>0 ) { memoize(input, 81, inheritListOpt_StartIndex); }
        }
        dbg.location(399, 6);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inheritListOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inheritListOpt"

    public static class inherit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inherit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:401:1: inherit : ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) );
    public final TinyHaxeTry1Parser.inherit_return inherit() throws RecognitionException {
        TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
        retval.start = input.LT(1);
        int inherit_StartIndex = input.index();
        Object root_0 = null;

        Token EXTENDS403=null;
        Token IMPLEMENTS405=null;
        TinyHaxeTry1Parser.type_return type404 = null;

        TinyHaxeTry1Parser.type_return type406 = null;


        Object EXTENDS403_tree=null;
        Object IMPLEMENTS405_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTS=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS");
        RewriteRuleTokenStream stream_EXTENDS=new RewriteRuleTokenStream(adaptor,"token EXTENDS");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "inherit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(401, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:401:9: ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^( IMPLEMENTS type ) )
            int alt75=2;
            try { dbg.enterDecision(75);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==EXTENDS) ) {
                alt75=1;
            }
            else if ( (LA75_0==IMPLEMENTS) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:401:11: EXTENDS type
                    {
                    dbg.location(401,11);
                    EXTENDS403=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3892); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXTENDS.add(EXTENDS403);

                    dbg.location(401,19);
                    pushFollow(FOLLOW_type_in_inherit3894);
                    type404=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type404.getTree());


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
                    // 401:24: -> ^( EXTENDS type )
                    {
                        dbg.location(401,27);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:401:27: ^( EXTENDS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(401,29);
                        root_1 = (Object)adaptor.becomeRoot(stream_EXTENDS.nextNode(), root_1);

                        dbg.location(401,37);
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:402:11: IMPLEMENTS type
                    {
                    dbg.location(402,11);
                    IMPLEMENTS405=(Token)match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit3914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTS.add(IMPLEMENTS405);

                    dbg.location(402,22);
                    pushFollow(FOLLOW_type_in_inherit3916);
                    type406=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type406.getTree());


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
                    // 402:27: -> ^( IMPLEMENTS type )
                    {
                        dbg.location(402,30);
                        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:402:30: ^( IMPLEMENTS type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(402,32);
                        root_1 = (Object)adaptor.becomeRoot(stream_IMPLEMENTS.nextNode(), root_1);

                        dbg.location(402,43);
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 82, inherit_StartIndex); }
        }
        dbg.location(403, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inherit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "inherit"

    public static class typedefDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typedefDecl"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:405:1: typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
    public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl() throws RecognitionException {
        TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
        retval.start = input.LT(1);
        int typedefDecl_StartIndex = input.index();
        Object root_0 = null;

        Token TYPEDEF407=null;
        Token IDENTIFIER408=null;
        Token EQ409=null;
        TinyHaxeTry1Parser.funcType_return funcType410 = null;


        Object TYPEDEF407_tree=null;
        Object IDENTIFIER408_tree=null;
        Object EQ409_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typedefDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(405, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:2: ( TYPEDEF IDENTIFIER EQ funcType )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:4: TYPEDEF IDENTIFIER EQ funcType
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(406,4);
            TYPEDEF407=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedefDecl3943); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPEDEF407_tree = (Object)adaptor.create(TYPEDEF407);
            adaptor.addChild(root_0, TYPEDEF407_tree);
            }
            dbg.location(406,12);
            IDENTIFIER408=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl3945); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER408_tree = (Object)adaptor.create(IDENTIFIER408);
            adaptor.addChild(root_0, IDENTIFIER408_tree);
            }
            dbg.location(406,23);
            EQ409=(Token)match(input,EQ,FOLLOW_EQ_in_typedefDecl3947); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ409_tree = (Object)adaptor.create(EQ409);
            adaptor.addChild(root_0, EQ409_tree);
            }
            dbg.location(406,26);
            pushFollow(FOLLOW_funcType_in_typedefDecl3949);
            funcType410=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType410.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, typedefDecl_StartIndex); }
        }
        dbg.location(407, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typedefDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typedefDecl"

    public static class typeExtend_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeExtend"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:409:1: typeExtend : GT funcType COMMA ;
    public final TinyHaxeTry1Parser.typeExtend_return typeExtend() throws RecognitionException {
        TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
        retval.start = input.LT(1);
        int typeExtend_StartIndex = input.index();
        Object root_0 = null;

        Token GT411=null;
        Token COMMA413=null;
        TinyHaxeTry1Parser.funcType_return funcType412 = null;


        Object GT411_tree=null;
        Object COMMA413_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "typeExtend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(409, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:410:9: ( GT funcType COMMA )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:410:11: GT funcType COMMA
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(410,11);
            GT411=(Token)match(input,GT,FOLLOW_GT_in_typeExtend3968); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GT411_tree = (Object)adaptor.create(GT411);
            adaptor.addChild(root_0, GT411_tree);
            }
            dbg.location(410,14);
            pushFollow(FOLLOW_funcType_in_typeExtend3970);
            funcType412=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType412.getTree());
            dbg.location(410,28);
            COMMA413=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeExtend3972); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, typeExtend_StartIndex); }
        }
        dbg.location(411, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeExtend");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeExtend"

    public static class anonType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonType"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:413:1: anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE ;
    public final TinyHaxeTry1Parser.anonType_return anonType() throws RecognitionException {
        TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
        retval.start = input.LT(1);
        int anonType_StartIndex = input.index();
        Object root_0 = null;

        Token LBRACE414=null;
        Token RBRACE420=null;
        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList415 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList416 = null;

        TinyHaxeTry1Parser.typeExtend_return typeExtend417 = null;

        TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList418 = null;

        TinyHaxeTry1Parser.varDeclList_return varDeclList419 = null;


        Object LBRACE414_tree=null;
        Object RBRACE420_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anonType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(413, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:413:9: ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:413:11: LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) RBRACE
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(413,17);
            LBRACE414=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_anonType3983); if (state.failed) return retval;
            dbg.location(414,4);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:414:4: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt77=4;
            try { dbg.enterSubRule(77);
            try { dbg.enterDecision(77);

            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt77=1;
                }
                break;
            case IDENTIFIER:
                {
                alt77=2;
                }
                break;
            case PUBLIC:
            case PRIVATE:
            case STATIC:
            case INLINE:
            case DYNAMIC:
            case OVERRIDE:
            case VAR:
                {
                alt77=3;
                }
                break;
            case GT:
                {
                alt77=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(77);}

            switch (alt77) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:415:22: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:415:27: anonTypeFieldList
                    {
                    dbg.location(415,27);
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4018);
                    anonTypeFieldList415=anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList415.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:416:26: varDeclList
                    {
                    dbg.location(416,26);
                    pushFollow(FOLLOW_varDeclList_in_anonType4046);
                    varDeclList416=varDeclList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList416.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:27: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    dbg.location(417,27);
                    pushFollow(FOLLOW_typeExtend_in_anonType4075);
                    typeExtend417=typeExtend();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeExtend417.getTree());
                    dbg.location(417,38);
                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:38: ( | anonTypeFieldList | varDeclList )
                    int alt76=3;
                    try { dbg.enterSubRule(76);
                    try { dbg.enterDecision(76);

                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt76=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt76=2;
                        }
                        break;
                    case PUBLIC:
                    case PRIVATE:
                    case STATIC:
                    case INLINE:
                    case DYNAMIC:
                    case OVERRIDE:
                    case VAR:
                        {
                        alt76=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(76);}

                    switch (alt76) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:418:24: 
                            {
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:418:25: anonTypeFieldList
                            {
                            dbg.location(418,25);
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4103);
                            anonTypeFieldList418=anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeFieldList418.getTree());

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:419:25: varDeclList
                            {
                            dbg.location(419,25);
                            pushFollow(FOLLOW_varDeclList_in_anonType4129);
                            varDeclList419=varDeclList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclList419.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(76);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(77);}

            dbg.location(421,23);
            RBRACE420=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_anonType4173); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, anonType_StartIndex); }
        }
        dbg.location(422, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anonType"

    public static class anonTypeFieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeFieldList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:424:1: anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
    public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
        retval.start = input.LT(1);
        int anonTypeFieldList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA422=null;
        TinyHaxeTry1Parser.anonTypeField_return anonTypeField421 = null;

        TinyHaxeTry1Parser.anonTypeField_return anonTypeField423 = null;


        Object COMMA422_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anonTypeFieldList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(424, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:2: ( anonTypeField ( COMMA anonTypeField )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:4: anonTypeField ( COMMA anonTypeField )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(425,4);
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4187);
            anonTypeField421=anonTypeField();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField421.getTree());
            dbg.location(425,18);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:18: ( COMMA anonTypeField )*
            try { dbg.enterSubRule(78);

            loop78:
            do {
                int alt78=2;
                try { dbg.enterDecision(78);

                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                } finally {dbg.exitDecision(78);}

                switch (alt78) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:19: COMMA anonTypeField
            	    {
            	    dbg.location(425,24);
            	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4190); if (state.failed) return retval;
            	    dbg.location(425,26);
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4193);
            	    anonTypeField423=anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, anonTypeField423.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);
            } finally {dbg.exitSubRule(78);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, anonTypeFieldList_StartIndex); }
        }
        dbg.location(426, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonTypeFieldList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anonTypeFieldList"

    public static class objLit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLit"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:428:1: objLit : '{' objLitElemList '}' ;
    public final TinyHaxeTry1Parser.objLit_return objLit() throws RecognitionException {
        TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
        retval.start = input.LT(1);
        int objLit_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal424=null;
        Token char_literal426=null;
        TinyHaxeTry1Parser.objLitElemList_return objLitElemList425 = null;


        Object char_literal424_tree=null;
        Object char_literal426_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "objLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(428, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:428:8: ( '{' objLitElemList '}' )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:428:10: '{' objLitElemList '}'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(428,13);
            char_literal424=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objLit4205); if (state.failed) return retval;
            dbg.location(428,15);
            pushFollow(FOLLOW_objLitElemList_in_objLit4208);
            objLitElemList425=objLitElemList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElemList425.getTree());
            dbg.location(428,33);
            char_literal426=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objLit4210); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, objLit_StartIndex); }
        }
        dbg.location(429, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "objLit"

    public static class anonTypeField_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "anonTypeField"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:431:1: anonTypeField : IDENTIFIER COLON funcType ;
    public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField() throws RecognitionException {
        TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
        retval.start = input.LT(1);
        int anonTypeField_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER427=null;
        Token COLON428=null;
        TinyHaxeTry1Parser.funcType_return funcType429 = null;


        Object IDENTIFIER427_tree=null;
        Object COLON428_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anonTypeField");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(431, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:432:2: ( IDENTIFIER COLON funcType )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:432:4: IDENTIFIER COLON funcType
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(432,4);
            IDENTIFIER427=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4222); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER427_tree = (Object)adaptor.create(IDENTIFIER427);
            adaptor.addChild(root_0, IDENTIFIER427_tree);
            }
            dbg.location(432,20);
            COLON428=(Token)match(input,COLON,FOLLOW_COLON_in_anonTypeField4224); if (state.failed) return retval;
            dbg.location(432,22);
            pushFollow(FOLLOW_funcType_in_anonTypeField4227);
            funcType429=funcType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, funcType429.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, anonTypeField_StartIndex); }
        }
        dbg.location(433, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonTypeField");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anonTypeField"

    public static class objLitElemList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElemList"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:435:1: objLitElemList : objLitElem ( COMMA objLitElem )* ;
    public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
        retval.start = input.LT(1);
        int objLitElemList_StartIndex = input.index();
        Object root_0 = null;

        Token COMMA431=null;
        TinyHaxeTry1Parser.objLitElem_return objLitElem430 = null;

        TinyHaxeTry1Parser.objLitElem_return objLitElem432 = null;


        Object COMMA431_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "objLitElemList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(435, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:436:2: ( objLitElem ( COMMA objLitElem )* )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:436:4: objLitElem ( COMMA objLitElem )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(436,4);
            pushFollow(FOLLOW_objLitElem_in_objLitElemList4243);
            objLitElem430=objLitElem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem430.getTree());
            dbg.location(436,15);
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:436:15: ( COMMA objLitElem )*
            try { dbg.enterSubRule(79);

            loop79:
            do {
                int alt79=2;
                try { dbg.enterDecision(79);

                int LA79_0 = input.LA(1);

                if ( (LA79_0==COMMA) ) {
                    alt79=1;
                }


                } finally {dbg.exitDecision(79);}

                switch (alt79) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:436:16: COMMA objLitElem
            	    {
            	    dbg.location(436,21);
            	    COMMA431=(Token)match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4246); if (state.failed) return retval;
            	    dbg.location(436,23);
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4249);
            	    objLitElem432=objLitElem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, objLitElem432.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);
            } finally {dbg.exitSubRule(79);}


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, objLitElemList_StartIndex); }
        }
        dbg.location(437, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLitElemList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "objLitElemList"

    public static class objLitElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objLitElem"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:439:1: objLitElem : IDENTIFIER COLON expr ;
    public final TinyHaxeTry1Parser.objLitElem_return objLitElem() throws RecognitionException {
        TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
        retval.start = input.LT(1);
        int objLitElem_StartIndex = input.index();
        Object root_0 = null;

        Token IDENTIFIER433=null;
        Token COLON434=null;
        TinyHaxeTry1Parser.expr_return expr435 = null;


        Object IDENTIFIER433_tree=null;
        Object COLON434_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "objLitElem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(439, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:440:9: ( IDENTIFIER COLON expr )
            dbg.enterAlt(1);

            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:440:11: IDENTIFIER COLON expr
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(440,11);
            IDENTIFIER433=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER433_tree = (Object)adaptor.create(IDENTIFIER433);
            adaptor.addChild(root_0, IDENTIFIER433_tree);
            }
            dbg.location(440,27);
            COLON434=(Token)match(input,COLON,FOLLOW_COLON_in_objLitElem4272); if (state.failed) return retval;
            dbg.location(440,29);
            pushFollow(FOLLOW_expr_in_objLitElem4275);
            expr435=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr435.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, objLitElem_StartIndex); }
        }
        dbg.location(441, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLitElem");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "objLitElem"

    public static class elementarySymbol_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementarySymbol"
    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:443:1: elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] );
    public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol() throws RecognitionException {
        TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
        retval.start = input.LT(1);
        int elementarySymbol_StartIndex = input.index();
        Object root_0 = null;

        Token LONGLITERAL436=null;
        Token INTLITERAL437=null;
        Token STRINGLITERAL438=null;
        Token CHARLITERAL439=null;
        Token FLOATNUM440=null;
        Token TRUE441=null;
        Token FALSE442=null;

        Object LONGLITERAL436_tree=null;
        Object INTLITERAL437_tree=null;
        Object STRINGLITERAL438_tree=null;
        Object CHARLITERAL439_tree=null;
        Object FLOATNUM440_tree=null;
        Object TRUE441_tree=null;
        Object FALSE442_tree=null;
        RewriteRuleTokenStream stream_INTLITERAL=new RewriteRuleTokenStream(adaptor,"token INTLITERAL");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FLOATNUM=new RewriteRuleTokenStream(adaptor,"token FLOATNUM");
        RewriteRuleTokenStream stream_STRINGLITERAL=new RewriteRuleTokenStream(adaptor,"token STRINGLITERAL");
        RewriteRuleTokenStream stream_CHARLITERAL=new RewriteRuleTokenStream(adaptor,"token CHARLITERAL");
        RewriteRuleTokenStream stream_LONGLITERAL=new RewriteRuleTokenStream(adaptor,"token LONGLITERAL");

        try { dbg.enterRule(getGrammarFileName(), "elementarySymbol");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(443, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return retval; }
            // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:444:2: ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL -> CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE -> FALSE[$FALSE,\"BOOL\"] )
            int alt80=7;
            try { dbg.enterDecision(80);

            switch ( input.LA(1) ) {
            case LONGLITERAL:
                {
                alt80=1;
                }
                break;
            case INTLITERAL:
                {
                alt80=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt80=3;
                }
                break;
            case CHARLITERAL:
                {
                alt80=4;
                }
                break;
            case FLOATNUM:
                {
                alt80=5;
                }
                break;
            case TRUE:
                {
                alt80=6;
                }
                break;
            case FALSE:
                {
                alt80=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(80);}

            switch (alt80) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:444:4: LONGLITERAL
                    {
                    dbg.location(444,4);
                    LONGLITERAL436=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_elementarySymbol4287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LONGLITERAL.add(LONGLITERAL436);



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
                    // 444:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
                    {
                        dbg.location(444,19);
                        adaptor.addChild(root_0, new VarUsage(LONGLITERAL, LONGLITERAL436, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:445:4: INTLITERAL
                    {
                    dbg.location(445,4);
                    INTLITERAL437=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_elementarySymbol4300); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTLITERAL.add(INTLITERAL437);



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
                    // 445:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
                    {
                        dbg.location(445,18);
                        adaptor.addChild(root_0, new VarUsage(INTLITERAL, INTLITERAL437, "INT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:446:4: STRINGLITERAL
                    {
                    dbg.location(446,4);
                    STRINGLITERAL438=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_elementarySymbol4313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRINGLITERAL.add(STRINGLITERAL438);



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
                    // 446:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
                    {
                        dbg.location(446,21);
                        adaptor.addChild(root_0, new VarUsage(STRINGLITERAL, STRINGLITERAL438, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:447:4: CHARLITERAL
                    {
                    dbg.location(447,4);
                    CHARLITERAL439=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_elementarySymbol4326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARLITERAL.add(CHARLITERAL439);



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
                    // 447:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
                    {
                        dbg.location(447,19);
                        adaptor.addChild(root_0, new VarUsage(CHARLITERAL, CHARLITERAL439, "STRING"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:448:4: FLOATNUM
                    {
                    dbg.location(448,4);
                    FLOATNUM440=(Token)match(input,FLOATNUM,FOLLOW_FLOATNUM_in_elementarySymbol4339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOATNUM.add(FLOATNUM440);



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
                    // 448:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
                    {
                        dbg.location(448,16);
                        adaptor.addChild(root_0, new VarUsage(FLOATNUM, FLOATNUM440, "FLOAT"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:449:4: TRUE
                    {
                    dbg.location(449,4);
                    TRUE441=(Token)match(input,TRUE,FOLLOW_TRUE_in_elementarySymbol4352); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE441);



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
                    // 449:10: -> TRUE[$TRUE,\"BOOL\"]
                    {
                        dbg.location(449,13);
                        adaptor.addChild(root_0, new VarUsage(TRUE, TRUE441, "BOOL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:450:4: FALSE
                    {
                    dbg.location(450,4);
                    FALSE442=(Token)match(input,FALSE,FOLLOW_FALSE_in_elementarySymbol4366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE442);



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
                    // 450:11: -> FALSE[$FALSE,\"BOOL\"]
                    {
                        dbg.location(450,14);
                        adaptor.addChild(root_0, new VarUsage(FALSE, FALSE442, "BOOL"));

                    }

                    retval.tree = root_0;}
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
            if ( state.backtracking>0 ) { memoize(input, 91, elementarySymbol_StartIndex); }
        }
        dbg.location(451, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elementarySymbol");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elementarySymbol"

    // $ANTLR start synpred32_TinyHaxeTry1
    public final void synpred32_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:11: ( ( type ) ( MINUS_BIGGER type )* )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:11: ( type ) ( MINUS_BIGGER type )*
        {
        dbg.location(167,11);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:11: ( type )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:12: type
        {
        dbg.location(167,12);
        pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry11297);
        type();

        state._fsp--;
        if (state.failed) return ;

        }

        dbg.location(167,18);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:18: ( MINUS_BIGGER type )*
        try { dbg.enterSubRule(83);

        loop83:
        do {
            int alt83=2;
            try { dbg.enterDecision(83);

            int LA83_0 = input.LA(1);

            if ( (LA83_0==MINUS_BIGGER) ) {
                alt83=1;
            }


            } finally {dbg.exitDecision(83);}

            switch (alt83) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:167:19: MINUS_BIGGER type
        	    {
        	    dbg.location(167,19);
        	    match(input,MINUS_BIGGER,FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11301); if (state.failed) return ;
        	    dbg.location(167,33);
        	    pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry11304);
        	    type();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop83;
            }
        } while (true);
        } finally {dbg.exitSubRule(83);}


        }
    }
    // $ANTLR end synpred32_TinyHaxeTry1

    // $ANTLR start synpred40_TinyHaxeTry1
    public final void synpred40_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:8: ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )*
        {
        dbg.location(171,8);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:8: ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
        int alt84=7;
        try { dbg.enterSubRule(84);
        try { dbg.enterDecision(84);

        switch ( input.LA(1) ) {
        case LBRACE:
            {
            alt84=1;
            }
            break;
        case IDENTIFIER:
            {
            alt84=2;
            }
            break;
        case INT:
            {
            alt84=3;
            }
            break;
        case FLOAT:
            {
            alt84=4;
            }
            break;
        case DYNAMIC:
            {
            alt84=5;
            }
            break;
        case BOOLEAN:
            {
            alt84=6;
            }
            break;
        case VOID:
            {
            alt84=7;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 84, 0, input);

            dbg.recognitionException(nvae);
            throw nvae;
        }

        } finally {dbg.exitDecision(84);}

        switch (alt84) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:9: anonType
                {
                dbg.location(171,9);
                pushFollow(FOLLOW_anonType_in_synpred40_TinyHaxeTry11323);
                anonType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:20: dotIdent
                {
                dbg.location(171,20);
                pushFollow(FOLLOW_dotIdent_in_synpred40_TinyHaxeTry11327);
                dotIdent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                dbg.enterAlt(3);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:30: INT
                {
                dbg.location(171,30);
                match(input,INT,FOLLOW_INT_in_synpred40_TinyHaxeTry11330); if (state.failed) return ;

                }
                break;
            case 4 :
                dbg.enterAlt(4);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:35: FLOAT
                {
                dbg.location(171,35);
                match(input,FLOAT,FOLLOW_FLOAT_in_synpred40_TinyHaxeTry11333); if (state.failed) return ;

                }
                break;
            case 5 :
                dbg.enterAlt(5);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:42: DYNAMIC
                {
                dbg.location(171,42);
                match(input,DYNAMIC,FOLLOW_DYNAMIC_in_synpred40_TinyHaxeTry11336); if (state.failed) return ;

                }
                break;
            case 6 :
                dbg.enterAlt(6);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:50: BOOLEAN
                {
                dbg.location(171,50);
                match(input,BOOLEAN,FOLLOW_BOOLEAN_in_synpred40_TinyHaxeTry11338); if (state.failed) return ;

                }
                break;
            case 7 :
                dbg.enterAlt(7);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:58: VOID
                {
                dbg.location(171,58);
                match(input,VOID,FOLLOW_VOID_in_synpred40_TinyHaxeTry11340); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(84);}

        dbg.location(171,64);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:64: ( typeParam )*
        try { dbg.enterSubRule(85);

        loop85:
        do {
            int alt85=2;
            try { dbg.enterDecision(85);

            int LA85_0 = input.LA(1);

            if ( (LA85_0==LT) ) {
                alt85=1;
            }


            } finally {dbg.exitDecision(85);}

            switch (alt85) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:171:65: typeParam
        	    {
        	    dbg.location(171,65);
        	    pushFollow(FOLLOW_typeParam_in_synpred40_TinyHaxeTry11344);
        	    typeParam();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop85;
            }
        } while (true);
        } finally {dbg.exitSubRule(85);}


        }
    }
    // $ANTLR end synpred40_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:21: ( typeParam )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:21: typeParam
        {
        dbg.location(179,21);
        pushFollow(FOLLOW_typeParam_in_synpred41_TinyHaxeTry11384);
        typeParam();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred43_TinyHaxeTry1
    public final void synpred43_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:4: ( block )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:4: block
        {
        dbg.location(191,4);
        pushFollow(FOLLOW_block_in_synpred43_TinyHaxeTry11499);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_TinyHaxeTry1

    // $ANTLR start synpred44_TinyHaxeTry1
    public final void synpred44_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:4: ( assignExpr SEMI )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:4: assignExpr SEMI
        {
        dbg.location(192,4);
        pushFollow(FOLLOW_assignExpr_in_synpred44_TinyHaxeTry11504);
        assignExpr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(192,15);
        match(input,SEMI,FOLLOW_SEMI_in_synpred44_TinyHaxeTry11506); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_TinyHaxeTry1

    // $ANTLR start synpred46_TinyHaxeTry1
    public final void synpred46_TinyHaxeTry1_fragment() throws RecognitionException {   
        TinyHaxeTry1Parser.statement_return st2 = null;


        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:36: ( ELSE st2= statement )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:36: ELSE st2= statement
        {
        dbg.location(194,36);
        match(input,ELSE,FOLLOW_ELSE_in_synpred46_TinyHaxeTry11526); if (state.failed) return ;
        dbg.location(194,44);
        pushFollow(FOLLOW_statement_in_synpred46_TinyHaxeTry11530);
        st2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_TinyHaxeTry1

    // $ANTLR start synpred54_TinyHaxeTry1
    public final void synpred54_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:12: ( expr )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:200:12: expr
        {
        dbg.location(200,12);
        pushFollow(FOLLOW_expr_in_synpred54_TinyHaxeTry11716);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_TinyHaxeTry1

    // $ANTLR start synpred61_TinyHaxeTry1
    public final void synpred61_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:4: ( expr SEMI )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:204:4: expr SEMI
        {
        dbg.location(204,4);
        pushFollow(FOLLOW_expr_in_synpred61_TinyHaxeTry11792);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(204,10);
        match(input,SEMI,FOLLOW_SEMI_in_synpred61_TinyHaxeTry11795); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_TinyHaxeTry1

    // $ANTLR start synpred62_TinyHaxeTry1
    public final void synpred62_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:205:4: ( IDENTIFIER COLON statement )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:205:4: IDENTIFIER COLON statement
        {
        dbg.location(205,4);
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred62_TinyHaxeTry11801); if (state.failed) return ;
        dbg.location(205,15);
        match(input,COLON,FOLLOW_COLON_in_synpred62_TinyHaxeTry11803); if (state.failed) return ;
        dbg.location(205,21);
        pushFollow(FOLLOW_statement_in_synpred62_TinyHaxeTry11805);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_TinyHaxeTry1

    // $ANTLR start synpred65_TinyHaxeTry1
    public final void synpred65_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:222:4: ( varDecl )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:222:4: varDecl
        {
        dbg.location(222,4);
        pushFollow(FOLLOW_varDecl_in_synpred65_TinyHaxeTry11945);
        varDecl();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_TinyHaxeTry1

    // $ANTLR start synpred69_TinyHaxeTry1
    public final void synpred69_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:21: ( exprList )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:246:21: exprList
        {
        dbg.location(246,21);
        pushFollow(FOLLOW_exprList_in_synpred69_TinyHaxeTry12157);
        exprList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_TinyHaxeTry1

    // $ANTLR start synpred73_TinyHaxeTry1
    public final void synpred73_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:11: ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:11: ternaryExpr ( ELLIPSIS ternaryExpr )*
        {
        dbg.location(256,11);
        pushFollow(FOLLOW_ternaryExpr_in_synpred73_TinyHaxeTry12262);
        ternaryExpr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(256,23);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:23: ( ELLIPSIS ternaryExpr )*
        try { dbg.enterSubRule(92);

        loop92:
        do {
            int alt92=2;
            try { dbg.enterDecision(92);

            int LA92_0 = input.LA(1);

            if ( (LA92_0==ELLIPSIS) ) {
                alt92=1;
            }


            } finally {dbg.exitDecision(92);}

            switch (alt92) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:256:24: ELLIPSIS ternaryExpr
        	    {
        	    dbg.location(256,24);
        	    match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_synpred73_TinyHaxeTry12265); if (state.failed) return ;
        	    dbg.location(256,34);
        	    pushFollow(FOLLOW_ternaryExpr_in_synpred73_TinyHaxeTry12268);
        	    ternaryExpr();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop92;
            }
        } while (true);
        } finally {dbg.exitSubRule(92);}


        }
    }
    // $ANTLR end synpred73_TinyHaxeTry1

    // $ANTLR start synpred98_TinyHaxeTry1
    public final void synpred98_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:21: ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:21: ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
        {
        dbg.location(278,21);
        if ( input.LA(1)==BANG||input.LA(1)==SUB||(input.LA(1)>=SUBSUB && input.LA(1)<=TILDE) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            dbg.recognitionException(mse);
            throw mse;
        }

        dbg.location(278,54);
        pushFollow(FOLLOW_prefixExpr_in_synpred98_TinyHaxeTry12612);
        prefixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred98_TinyHaxeTry1

    // $ANTLR start synpred101_TinyHaxeTry1
    public final void synpred101_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:4: ( value LPAREN exprListOpt RPAREN )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:4: value LPAREN exprListOpt RPAREN
        {
        dbg.location(285,4);
        pushFollow(FOLLOW_value_in_synpred101_TinyHaxeTry12709);
        value();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(285,10);
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred101_TinyHaxeTry12711); if (state.failed) return ;
        dbg.location(285,17);
        pushFollow(FOLLOW_exprListOpt_in_synpred101_TinyHaxeTry12713);
        exprListOpt();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(285,29);
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred101_TinyHaxeTry12715); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_TinyHaxeTry1

    // $ANTLR start synpred102_TinyHaxeTry1
    public final void synpred102_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:286:4: ( value LBRACKET expr RBRACKET )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:286:4: value LBRACKET expr RBRACKET
        {
        dbg.location(286,4);
        pushFollow(FOLLOW_value_in_synpred102_TinyHaxeTry12735);
        value();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(286,10);
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred102_TinyHaxeTry12737); if (state.failed) return ;
        dbg.location(286,19);
        pushFollow(FOLLOW_expr_in_synpred102_TinyHaxeTry12739);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(286,24);
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred102_TinyHaxeTry12741); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred102_TinyHaxeTry1

    // $ANTLR start synpred103_TinyHaxeTry1
    public final void synpred103_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:287:4: ( value PLUSPLUS )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:287:4: value PLUSPLUS
        {
        dbg.location(287,4);
        pushFollow(FOLLOW_value_in_synpred103_TinyHaxeTry12746);
        value();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(287,10);
        match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_synpred103_TinyHaxeTry12748); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_TinyHaxeTry1

    // $ANTLR start synpred104_TinyHaxeTry1
    public final void synpred104_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:288:4: ( value SUBSUB )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:288:4: value SUBSUB
        {
        dbg.location(288,4);
        pushFollow(FOLLOW_value_in_synpred104_TinyHaxeTry12766);
        value();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(288,10);
        match(input,SUBSUB,FOLLOW_SUBSUB_in_synpred104_TinyHaxeTry12768); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred104_TinyHaxeTry1

    // $ANTLR start synpred106_TinyHaxeTry1
    public final void synpred106_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:293:4: ( arrayLit )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:293:4: arrayLit
        {
        dbg.location(293,4);
        pushFollow(FOLLOW_arrayLit_in_synpred106_TinyHaxeTry12804);
        arrayLit();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_TinyHaxeTry1

    // $ANTLR start synpred110_TinyHaxeTry1
    public final void synpred110_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:23: ( expr )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:23: expr
        {
        dbg.location(297,23);
        pushFollow(FOLLOW_expr_in_synpred110_TinyHaxeTry12868);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_TinyHaxeTry1

    // $ANTLR start synpred111_TinyHaxeTry1
    public final void synpred111_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:14: ( LPAREN ( expr | statement ) RPAREN )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:14: LPAREN ( expr | statement ) RPAREN
        {
        dbg.location(297,14);
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred111_TinyHaxeTry12864); if (state.failed) return ;
        dbg.location(297,22);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:22: ( expr | statement )
        int alt93=2;
        try { dbg.enterSubRule(93);
        try { dbg.enterDecision(93);

        try {
            isCyclicDecision = true;
            alt93 = dfa93.predict(input);
        }
        catch (NoViableAltException nvae) {
            dbg.recognitionException(nvae);
            throw nvae;
        }
        } finally {dbg.exitDecision(93);}

        switch (alt93) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:23: expr
                {
                dbg.location(297,23);
                pushFollow(FOLLOW_expr_in_synpred111_TinyHaxeTry12868);
                expr();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                dbg.enterAlt(2);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:28: statement
                {
                dbg.location(297,28);
                pushFollow(FOLLOW_statement_in_synpred111_TinyHaxeTry12870);
                statement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(93);}

        dbg.location(297,39);
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred111_TinyHaxeTry12873); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_TinyHaxeTry1

    // $ANTLR start synpred114_TinyHaxeTry1
    public final void synpred114_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:11: ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
        dbg.enterAlt(1);

        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:11: CAST LPAREN expr ( COMMA funcType )? RPAREN
        {
        dbg.location(304,11);
        match(input,CAST,FOLLOW_CAST_in_synpred114_TinyHaxeTry12960); if (state.failed) return ;
        dbg.location(304,16);
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12962); if (state.failed) return ;
        dbg.location(304,23);
        pushFollow(FOLLOW_expr_in_synpred114_TinyHaxeTry12964);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(304,28);
        // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:28: ( COMMA funcType )?
        int alt94=2;
        try { dbg.enterSubRule(94);
        try { dbg.enterDecision(94);

        int LA94_0 = input.LA(1);

        if ( (LA94_0==COMMA) ) {
            alt94=1;
        }
        } finally {dbg.exitDecision(94);}

        switch (alt94) {
            case 1 :
                dbg.enterAlt(1);

                // C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:304:29: COMMA funcType
                {
                dbg.location(304,29);
                match(input,COMMA,FOLLOW_COMMA_in_synpred114_TinyHaxeTry12967); if (state.failed) return ;
                dbg.location(304,35);
                pushFollow(FOLLOW_funcType_in_synpred114_TinyHaxeTry12969);
                funcType();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(94);}

        dbg.location(304,46);
        match(input,RPAREN,FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12973); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_TinyHaxeTry1

    // Delegated rules

    public final boolean synpred104_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred104_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred65_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred106_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred32_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred73_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred46_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred110_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred40_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred101_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred43_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred69_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred102_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred61_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred44_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred62_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred103_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred54_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred41_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred114_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred111_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred98_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String DFA23_eotS =
        "\36\uffff";
    static final String DFA23_eofS =
        "\1\10\35\uffff";
    static final String DFA23_minS =
        "\1\20\1\0\34\uffff";
    static final String DFA23_maxS =
        "\1\145\1\0\34\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\5\uffff\1\2\25\uffff";
    static final String DFA23_specialS =
        "\1\uffff\1\0\34\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\1\10\1\uffff\1\10"+
            "\6\uffff\2\10\2\uffff\1\10\1\uffff\4\10\1\uffff\1\10\4\2\1\uffff"+
            "\1\10\11\uffff\1\1\1\10\36\uffff\1\10\1\uffff\6\10",
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
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "171:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_TinyHaxeTry1()) ) {s = 2;}

                        else if ( (true) ) {s = 8;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA24_eotS =
        "\51\uffff";
    static final String DFA24_eofS =
        "\1\2\50\uffff";
    static final String DFA24_minS =
        "\1\20\1\0\47\uffff";
    static final String DFA24_maxS =
        "\1\144\1\0\47\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\45\uffff\1\1";
    static final String DFA24_specialS =
        "\1\uffff\1\0\47\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\11\uffff\10\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\5\uffff"+
            "\1\1\1\2\4\uffff\1\2\4\uffff\2\2\7\uffff\22\2\12\uffff\2\2",
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
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "179:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_1 = input.LA(1);

                         
                        int index24_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_TinyHaxeTry1()) ) {s = 40;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index24_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\104\uffff";
    static final String DFA31_eofS =
        "\104\uffff";
    static final String DFA31_minS =
        "\1\20\56\0\25\uffff";
    static final String DFA31_maxS =
        "\1\154\56\0\25\uffff";
    static final String DFA31_acceptS =
        "\57\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\1\1\2\1\16\1\20\1\17";
    static final String DFA31_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\25\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\1\21\2\uffff\6\57\1\uffff\1\47\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\6\1\20\1\uffff\1\7\2\uffff\1\31\12\uffff\1\24\1\44\1"+
            "\4\1\65\1\uffff\1\66\1\uffff\1\67\1\70\1\71\1\72\1\1\1\uffff"+
            "\1\73\1\74\1\75\1\76\3\uffff\1\50\1\46\1\45\1\40\1\41\1\42\1"+
            "\43\1\35\1\36\1\37\1\32\1\33\1\34\1\30\1\23\1\25\1\26\1\27\1"+
            "\22\1\3\1\31\1\10\1\5\1\uffff\1\57\6\uffff\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "190:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_TinyHaxeTry1()) ) {s = 63;}

                        else if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 66;}

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_12 = input.LA(1);

                         
                        int index31_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (synpred62_TinyHaxeTry1()) ) {s = 67;}

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_18 = input.LA(1);

                         
                        int index31_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA31_29 = input.LA(1);

                         
                        int index31_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA31_35 = input.LA(1);

                         
                        int index31_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA31_36 = input.LA(1);

                         
                        int index31_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA31_37 = input.LA(1);

                         
                        int index31_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA31_38 = input.LA(1);

                         
                        int index31_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA31_39 = input.LA(1);

                         
                        int index31_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA31_40 = input.LA(1);

                         
                        int index31_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA31_41 = input.LA(1);

                         
                        int index31_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA31_42 = input.LA(1);

                         
                        int index31_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA31_43 = input.LA(1);

                         
                        int index31_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA31_44 = input.LA(1);

                         
                        int index31_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA31_45 = input.LA(1);

                         
                        int index31_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_45);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA31_46 = input.LA(1);

                         
                        int index31_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred44_TinyHaxeTry1()) ) {s = 64;}

                        else if ( (synpred61_TinyHaxeTry1()) ) {s = 65;}

                         
                        input.seek(index31_46);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\102\uffff";
    static final String DFA34_eofS =
        "\102\uffff";
    static final String DFA34_minS =
        "\1\20\6\0\73\uffff";
    static final String DFA34_maxS =
        "\1\154\6\0\73\uffff";
    static final String DFA34_acceptS =
        "\7\uffff\1\2\1\uffff\1\3\67\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\73\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"+
            "\2\uffff\1\11\12\uffff\4\11\1\uffff\1\11\1\uffff\5\11\1\uffff"+
            "\4\11\3\uffff\27\11\1\uffff\1\6\2\7\4\uffff\7\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "221:1: blockStmt : ( varDecl | classDecl | statement );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_3 = input.LA(1);

                         
                        int index34_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA34_4 = input.LA(1);

                         
                        int index34_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA34_5 = input.LA(1);

                         
                        int index34_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA34_6 = input.LA(1);

                         
                        int index34_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_TinyHaxeTry1()) ) {s = 65;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index34_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\67\uffff";
    static final String DFA41_eofS =
        "\1\1\66\uffff";
    static final String DFA41_minS =
        "\1\20\3\uffff\1\0\62\uffff";
    static final String DFA41_maxS =
        "\1\154\3\uffff\1\0\62\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\64\uffff\1\2";
    static final String DFA41_specialS =
        "\4\uffff\1\0\62\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\10\uffff\10\1\1\4\4\1\1\uffff\1\1\4\uffff\1\1\5\uffff"+
            "\3\1\3\uffff\1\1\4\uffff\2\1\7\uffff\27\1\10\uffff\7\1",
            "",
            "",
            "",
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
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "256:1: iterExpr : ( ternaryExpr ( ELLIPSIS ternaryExpr )* | functionVar );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_4 = input.LA(1);

                         
                        int index41_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_TinyHaxeTry1()) ) {s = 1;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index41_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\65\uffff";
    static final String DFA54_eofS =
        "\1\20\64\uffff";
    static final String DFA54_minS =
        "\1\20\15\0\47\uffff";
    static final String DFA54_maxS =
        "\1\154\15\0\47\uffff";
    static final String DFA54_acceptS =
        "\16\uffff\1\3\1\4\1\5\42\uffff\1\1\1\2";
    static final String DFA54_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\47\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\1\20\6\uffff\1"+
            "\20\5\uffff\2\20\4\uffff\1\20\4\uffff\1\3\1\20\7\uffff\22\20"+
            "\1\17\1\16\1\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "284:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred101_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (synpred102_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (synpred103_TinyHaxeTry1()) ) {s = 14;}

                        else if ( (synpred104_TinyHaxeTry1()) ) {s = 15;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\65\uffff";
    static final String DFA56_eofS =
        "\1\16\64\uffff";
    static final String DFA56_minS =
        "\1\20\1\uffff\1\0\11\uffff\1\0\50\uffff";
    static final String DFA56_maxS =
        "\1\154\1\uffff\1\0\11\uffff\1\0\50\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\44\uffff\1\2"+
        "\1\6";
    static final String DFA56_specialS =
        "\2\uffff\1\0\11\uffff\1\1\50\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\1\16\6\uffff\1"+
            "\16\5\uffff\2\16\4\uffff\1\16\4\uffff\1\3\1\16\7\uffff\24\16"+
            "\1\uffff\1\4\11\uffff\7\5",
            "",
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
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "292:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_TinyHaxeTry1()) ) {s = 51;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred111_TinyHaxeTry1()) ) {s = 52;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\100\uffff";
    static final String DFA55_eofS =
        "\100\uffff";
    static final String DFA55_minS =
        "\1\20\55\0\22\uffff";
    static final String DFA55_maxS =
        "\1\154\55\0\22\uffff";
    static final String DFA55_acceptS =
        "\56\uffff\1\1\1\2\20\uffff";
    static final String DFA55_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\22\uffff}>";
    static final String[] DFA55_transitionS = {
            "\1\57\1\20\2\uffff\6\57\1\uffff\1\46\1\50\1\51\1\52\1\53\1"+
            "\54\1\55\1\4\1\17\1\56\1\5\2\uffff\1\30\12\uffff\1\23\1\43\1"+
            "\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1"+
            "\47\1\45\1\44\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\32\1"+
            "\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff\1"+
            "\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "297:22: ( expr | statement )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_1 = input.LA(1);

                         
                        int index55_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_2 = input.LA(1);

                         
                        int index55_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_3 = input.LA(1);

                         
                        int index55_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_4 = input.LA(1);

                         
                        int index55_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_5 = input.LA(1);

                         
                        int index55_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_6 = input.LA(1);

                         
                        int index55_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_8 = input.LA(1);

                         
                        int index55_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_9 = input.LA(1);

                         
                        int index55_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_10 = input.LA(1);

                         
                        int index55_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_11 = input.LA(1);

                         
                        int index55_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_12 = input.LA(1);

                         
                        int index55_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_13 = input.LA(1);

                         
                        int index55_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_14 = input.LA(1);

                         
                        int index55_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_15 = input.LA(1);

                         
                        int index55_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA55_16 = input.LA(1);

                         
                        int index55_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA55_17 = input.LA(1);

                         
                        int index55_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA55_18 = input.LA(1);

                         
                        int index55_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA55_19 = input.LA(1);

                         
                        int index55_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA55_20 = input.LA(1);

                         
                        int index55_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA55_22 = input.LA(1);

                         
                        int index55_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA55_23 = input.LA(1);

                         
                        int index55_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA55_24 = input.LA(1);

                         
                        int index55_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA55_25 = input.LA(1);

                         
                        int index55_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA55_26 = input.LA(1);

                         
                        int index55_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA55_27 = input.LA(1);

                         
                        int index55_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA55_28 = input.LA(1);

                         
                        int index55_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA55_29 = input.LA(1);

                         
                        int index55_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA55_30 = input.LA(1);

                         
                        int index55_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA55_31 = input.LA(1);

                         
                        int index55_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA55_32 = input.LA(1);

                         
                        int index55_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA55_33 = input.LA(1);

                         
                        int index55_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA55_34 = input.LA(1);

                         
                        int index55_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA55_35 = input.LA(1);

                         
                        int index55_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA55_36 = input.LA(1);

                         
                        int index55_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA55_37 = input.LA(1);

                         
                        int index55_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA55_38 = input.LA(1);

                         
                        int index55_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA55_39 = input.LA(1);

                         
                        int index55_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA55_40 = input.LA(1);

                         
                        int index55_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA55_41 = input.LA(1);

                         
                        int index55_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA55_42 = input.LA(1);

                         
                        int index55_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA55_43 = input.LA(1);

                         
                        int index55_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA55_44 = input.LA(1);

                         
                        int index55_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA55_45 = input.LA(1);

                         
                        int index55_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index55_45);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\11\uffff";
    static final String DFA68_eofS =
        "\11\uffff";
    static final String DFA68_minS =
        "\6\24\1\21\2\uffff";
    static final String DFA68_maxS =
        "\6\42\1\65\2\uffff";
    static final String DFA68_acceptS =
        "\7\uffff\1\1\1\2";
    static final String DFA68_specialS =
        "\11\uffff}>";
    static final String[] DFA68_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\1\10\43\uffff\1\7",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "355:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA69_eotS =
        "\14\uffff";
    static final String DFA69_eofS =
        "\14\uffff";
    static final String DFA69_minS =
        "\6\24\2\21\4\uffff";
    static final String DFA69_maxS =
        "\6\42\2\65\4\uffff";
    static final String DFA69_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    static final String DFA69_specialS =
        "\14\uffff}>";
    static final String[] DFA69_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
            "\1\11\43\uffff\1\10",
            "\1\12\43\uffff\1\13",
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
            return "359:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA71_eotS =
        "\12\uffff";
    static final String DFA71_eofS =
        "\1\11\11\uffff";
    static final String DFA71_minS =
        "\6\24\4\uffff";
    static final String DFA71_maxS =
        "\6\137\4\uffff";
    static final String DFA71_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA71_specialS =
        "\12\uffff}>";
    static final String[] DFA71_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\22\uffff\1\11\37\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "374:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA72_eotS =
        "\12\uffff";
    static final String DFA72_eofS =
        "\1\11\11\uffff";
    static final String DFA72_minS =
        "\6\24\4\uffff";
    static final String DFA72_maxS =
        "\6\137\4\uffff";
    static final String DFA72_acceptS =
        "\6\uffff\1\1\1\2\1\3\1\4";
    static final String DFA72_specialS =
        "\12\uffff}>";
    static final String[] DFA72_transitionS = {
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"+
            "\22\uffff\1\11\37\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "385:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA93_eotS =
        "\100\uffff";
    static final String DFA93_eofS =
        "\100\uffff";
    static final String DFA93_minS =
        "\1\20\55\0\22\uffff";
    static final String DFA93_maxS =
        "\1\154\55\0\22\uffff";
    static final String DFA93_acceptS =
        "\56\uffff\1\1\1\2\20\uffff";
    static final String DFA93_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\22\uffff}>";
    static final String[] DFA93_transitionS = {
            "\1\57\1\20\2\uffff\6\57\1\uffff\1\46\1\50\1\51\1\52\1\53\1"+
            "\54\1\55\1\4\1\17\1\56\1\5\2\uffff\1\30\12\uffff\1\23\1\43\1"+
            "\2\1\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1"+
            "\47\1\45\1\44\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\32\1"+
            "\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff\1"+
            "\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
    static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
    static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
    static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
    static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
    static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
    static final short[][] DFA93_transition;

    static {
        int numStates = DFA93_transitionS.length;
        DFA93_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
        }
    }

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = DFA93_eot;
            this.eof = DFA93_eof;
            this.min = DFA93_min;
            this.max = DFA93_max;
            this.accept = DFA93_accept;
            this.special = DFA93_special;
            this.transition = DFA93_transition;
        }
        public String getDescription() {
            return "297:22: ( expr | statement )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA93_1 = input.LA(1);

                         
                        int index93_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA93_2 = input.LA(1);

                         
                        int index93_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA93_3 = input.LA(1);

                         
                        int index93_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA93_4 = input.LA(1);

                         
                        int index93_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA93_5 = input.LA(1);

                         
                        int index93_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA93_6 = input.LA(1);

                         
                        int index93_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA93_7 = input.LA(1);

                         
                        int index93_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA93_8 = input.LA(1);

                         
                        int index93_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA93_9 = input.LA(1);

                         
                        int index93_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA93_10 = input.LA(1);

                         
                        int index93_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA93_11 = input.LA(1);

                         
                        int index93_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA93_12 = input.LA(1);

                         
                        int index93_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA93_13 = input.LA(1);

                         
                        int index93_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA93_14 = input.LA(1);

                         
                        int index93_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA93_15 = input.LA(1);

                         
                        int index93_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA93_16 = input.LA(1);

                         
                        int index93_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA93_17 = input.LA(1);

                         
                        int index93_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA93_18 = input.LA(1);

                         
                        int index93_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA93_19 = input.LA(1);

                         
                        int index93_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA93_20 = input.LA(1);

                         
                        int index93_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA93_21 = input.LA(1);

                         
                        int index93_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA93_22 = input.LA(1);

                         
                        int index93_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA93_23 = input.LA(1);

                         
                        int index93_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA93_24 = input.LA(1);

                         
                        int index93_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA93_25 = input.LA(1);

                         
                        int index93_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA93_26 = input.LA(1);

                         
                        int index93_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA93_27 = input.LA(1);

                         
                        int index93_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA93_28 = input.LA(1);

                         
                        int index93_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA93_29 = input.LA(1);

                         
                        int index93_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA93_30 = input.LA(1);

                         
                        int index93_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA93_31 = input.LA(1);

                         
                        int index93_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_31);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA93_32 = input.LA(1);

                         
                        int index93_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_32);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA93_33 = input.LA(1);

                         
                        int index93_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_33);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA93_34 = input.LA(1);

                         
                        int index93_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_34);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA93_35 = input.LA(1);

                         
                        int index93_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_35);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA93_36 = input.LA(1);

                         
                        int index93_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_36);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA93_37 = input.LA(1);

                         
                        int index93_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_37);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA93_38 = input.LA(1);

                         
                        int index93_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_38);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA93_39 = input.LA(1);

                         
                        int index93_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_39);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA93_40 = input.LA(1);

                         
                        int index93_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_40);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA93_41 = input.LA(1);

                         
                        int index93_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_41);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA93_42 = input.LA(1);

                         
                        int index93_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_42);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA93_43 = input.LA(1);

                         
                        int index93_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_43);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA93_44 = input.LA(1);

                         
                        int index93_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_44);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA93_45 = input.LA(1);

                         
                        int index93_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_TinyHaxeTry1()) ) {s = 46;}

                        else if ( (true) ) {s = 47;}

                         
                        input.seek(index93_45);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 93, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module119 = new BitSet(new long[]{0x00001E8000080000L,0x0000002740000000L});
    public static final BitSet FOLLOW_topLevelList_in_module122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList156 = new BitSet(new long[]{0x00001E8000080002L,0x0000002740000000L});
    public static final BitSet FOLLOW_myImport_in_topLevel175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage248 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myPackage250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier281 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier297 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier301 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dotIdent_in_myImport346 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_myImport348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INLINE_in_declAttr460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_declAttr486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OVERRIDE_in_declAttr512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList553 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_param_in_paramList594 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_paramList597 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_paramList599 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_QUES_in_param638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param641 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param643 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_varInit_in_param645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_dotIdent693 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_DOT_in_dotIdent701 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_id_in_dotIdent705 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_EQ_in_assignOp737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUSEQ_in_assignOp757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBEQ_in_assignOp778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHEQ_in_assignOp798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENTEQ_in_assignOp811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AMPEQ_in_assignOp827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcLit867 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit869 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcLit871 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit873 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit875 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_funcLit877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit909 = new BitSet(new long[]{0x4028016C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit912 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1068 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_IF_in_ppIf1096 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1098 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1118 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1145 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1147 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ELSE_in_ppElse1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_END_in_ppEnd1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PP_ERROR_in_ppError1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1222 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_typeTag1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1262 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1265 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_typeList1268 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1276 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_typeList1279 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1282 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_type_in_funcType1297 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1301 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_type_in_funcType1304 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VOID_in_funcType1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonType_in_type1323 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_type1327 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INT_in_type1330 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_type1333 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_type1336 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type1338 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_VOID_in_type1340 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_type1344 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_LT_in_typeParam1362 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_typeList_in_typeParam1365 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1416 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1418 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1420 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1422 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_functionReturn1448 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionReturn1451 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_functionReturn1453 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionReturn1455 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_functionReturn1457 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionReturn1459 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1461 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_functionReturn1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_statement1504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1517 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1519 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1523 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1526 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_statement1569 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1571 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_statement1575 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_IN_in_statement1577 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_statement1581 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1583 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1611 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1613 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1633 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1635 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_WHILE_in_statement1637 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_parExpression_in_statement1639 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_statement1659 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_statement1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_catchStmtList_in_statement1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_statement1681 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_statement1683 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_statement1685 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_statement1687 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_statement1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_caseStmt_in_statement1691 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_RBRACE_in_statement1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1713 = new BitSet(new long[]{0x4028012C00030000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_statement1716 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1733 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_statement1735 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1750 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1753 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1771 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1774 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1792 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_statement1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1801 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_statement1803 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_statement1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionVar1832 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_functionVar1834 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_functionVar1836 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_functionVar1838 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_functionVar1840 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_functionVar1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1880 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_parExpression1883 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1907 = new BitSet(new long[]{0xFD68212C03F30000L,0x00001FC3BE20000FL});
    public static final BitSet FOLLOW_blockStmt_in_block1910 = new BitSet(new long[]{0xFD68212C03F30000L,0x00001FC3BE20000FL});
    public static final BitSet FOLLOW_RBRACE_in_block1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_block1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1986 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt2003 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt2016 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_exprList_in_caseStmt2018 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2020 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_caseStmt2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_caseStmt2037 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt2039 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_caseStmt2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2065 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2122 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2124 = new BitSet(new long[]{0x0000000008020000L});
    public static final BitSet FOLLOW_param_in_catchStmt2126 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2128 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_catchStmt2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2197 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_exprList2200 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_exprList2203 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_assignExpr_in_expr2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2243 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2246 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2249 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2265 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_functionVar_in_iterExpr2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2306 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2309 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2312 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2314 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2317 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2339 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2342 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2363 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2366 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2388 = new BitSet(new long[]{0x0018000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2393 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2397 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_GTEQ_in_cmpExpr2402 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_LTEQ_in_cmpExpr2407 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2412 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2417 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2422 = new BitSet(new long[]{0x0018000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2444 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2448 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2451 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2455 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2458 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2461 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2464 = new BitSet(new long[]{0x0000000000000002L,0x000000000001C000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2485 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_LTLT_in_shiftExpr2489 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2493 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_GTGT_in_shiftExpr2497 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2501 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2505 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2508 = new BitSet(new long[]{0x0000000000000002L,0x00000000000E0000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2531 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2536 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2541 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2567 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2572 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2575 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2578 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2582 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2600 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2709 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2711 = new BitSet(new long[]{0x4028013C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2713 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2735 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2737 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2739 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2746 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2787 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcLit_in_value2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementarySymbol_in_value2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2864 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_expr_in_value2868 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_statement_in_value2870 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_value2873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_value2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2931 = new BitSet(new long[]{0x4007800801020000L});
    public static final BitSet FOLLOW_type_in_newExpr2933 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2935 = new BitSet(new long[]{0x4028013C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2937 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2960 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2962 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_cast2964 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_COMMA_in_cast2967 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_cast2969 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_cast2989 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_cast2991 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_cast2993 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_cast2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3114 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3116 = new BitSet(new long[]{0x4008000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3118 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3120 = new BitSet(new long[]{0x00001E8000020000L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3122 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3155 = new BitSet(new long[]{0x00001E8000020002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3174 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3176 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_enumValueDecl3179 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3191 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3217 = new BitSet(new long[]{0x0000000003F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3241 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_VAR_in_varDecl3245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3247 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3277 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3283 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3299 = new BitSet(new long[]{0x0000200810000000L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3304 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3306 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_varInit_in_varDeclPart3308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3318 = new BitSet(new long[]{0x0000000001020000L,0x0000000010000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3322 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3324 = new BitSet(new long[]{0x0000000001020000L,0x0000000010000020L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3328 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3403 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_varInit3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3430 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3433 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3435 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3437 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3439 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3441 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3443 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3473 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcDecl3476 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3478 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3480 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3482 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcDecl3484 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3486 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3488 = new BitSet(new long[]{0x4000200000010000L});
    public static final BitSet FOLLOW_block_in_funcDecl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3526 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3528 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3530 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3532 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3534 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3536 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3538 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3559 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3561 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3563 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3565 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3567 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3569 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3571 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3595 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3597 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3599 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3601 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3603 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3605 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3624 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3626 = new BitSet(new long[]{0x0008000800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3628 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3630 = new BitSet(new long[]{0x0000001008020000L});
    public static final BitSet FOLLOW_paramList_in_funcProtoDecl3632 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3634 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3636 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERN_in_classDecl3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3666 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3668 = new BitSet(new long[]{0x4008000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3670 = new BitSet(new long[]{0x4000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3672 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl3674 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_classBodyScope_in_classDecl3676 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classBody_in_classBodyScope3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody3737 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_classBody_in_classBody3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody3744 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_classBody_in_classBody3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody3751 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_classBody_in_classBody3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3773 = new BitSet(new long[]{0x4007800001020000L,0x0000001800000000L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3775 = new BitSet(new long[]{0x4000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3777 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3779 = new BitSet(new long[]{0x80001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3782 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3797 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3804 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody3811 = new BitSet(new long[]{0x00001E8403F00000L,0x0000000080000000L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3834 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3837 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3840 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3892 = new BitSet(new long[]{0x4007800001020000L});
    public static final BitSet FOLLOW_type_in_inherit3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3914 = new BitSet(new long[]{0x4007800001020000L});
    public static final BitSet FOLLOW_type_in_inherit3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3943 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3945 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl3947 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl3949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend3968 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_typeExtend3970 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType3983 = new BitSet(new long[]{0x8010000003F20000L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4018 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4046 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4075 = new BitSet(new long[]{0x8000000003F20000L,0x0000000080000000L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4103 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4129 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4187 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4190 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4193 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4205 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4208 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4222 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4224 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4243 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4249 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4270 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem4272 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_objLitElem4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_elementarySymbol4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_elementarySymbol4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry11297 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11301 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry11304 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_anonType_in_synpred40_TinyHaxeTry11323 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_dotIdent_in_synpred40_TinyHaxeTry11327 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_INT_in_synpred40_TinyHaxeTry11330 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_synpred40_TinyHaxeTry11333 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_DYNAMIC_in_synpred40_TinyHaxeTry11336 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_synpred40_TinyHaxeTry11338 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_VOID_in_synpred40_TinyHaxeTry11340 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred40_TinyHaxeTry11344 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_typeParam_in_synpred41_TinyHaxeTry11384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred43_TinyHaxeTry11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpr_in_synpred44_TinyHaxeTry11504 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred44_TinyHaxeTry11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred46_TinyHaxeTry11526 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_synpred46_TinyHaxeTry11530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred54_TinyHaxeTry11716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred61_TinyHaxeTry11792 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SEMI_in_synpred61_TinyHaxeTry11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred62_TinyHaxeTry11801 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_COLON_in_synpred62_TinyHaxeTry11803 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_statement_in_synpred62_TinyHaxeTry11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_synpred65_TinyHaxeTry11945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_synpred69_TinyHaxeTry12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred73_TinyHaxeTry12262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ELLIPSIS_in_synpred73_TinyHaxeTry12265 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_ternaryExpr_in_synpred73_TinyHaxeTry12268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_synpred98_TinyHaxeTry12600 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_prefixExpr_in_synpred98_TinyHaxeTry12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred101_TinyHaxeTry12709 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred101_TinyHaxeTry12711 = new BitSet(new long[]{0x4028013C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_exprListOpt_in_synpred101_TinyHaxeTry12713 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred101_TinyHaxeTry12715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred102_TinyHaxeTry12735 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred102_TinyHaxeTry12737 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_synpred102_TinyHaxeTry12739 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred102_TinyHaxeTry12741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred103_TinyHaxeTry12746 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PLUSPLUS_in_synpred103_TinyHaxeTry12748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred104_TinyHaxeTry12766 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_SUBSUB_in_synpred104_TinyHaxeTry12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_synpred106_TinyHaxeTry12804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred110_TinyHaxeTry12868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred111_TinyHaxeTry12864 = new BitSet(new long[]{0x7D68212C03F30000L,0x00001FC0BE20000FL});
    public static final BitSet FOLLOW_expr_in_synpred111_TinyHaxeTry12868 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_statement_in_synpred111_TinyHaxeTry12870 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred111_TinyHaxeTry12873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAST_in_synpred114_TinyHaxeTry12960 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12962 = new BitSet(new long[]{0x4028012C00020000L,0x00001FC03E200000L});
    public static final BitSet FOLLOW_expr_in_synpred114_TinyHaxeTry12964 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_COMMA_in_synpred114_TinyHaxeTry12967 = new BitSet(new long[]{0x4007C00001020000L});
    public static final BitSet FOLLOW_funcType_in_synpred114_TinyHaxeTry12969 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12973 = new BitSet(new long[]{0x0000000000000002L});

}