// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-02-18 02:37:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.runtime.debug.*;
import java.io.IOException;
public class TinyHaxeTry1Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "WS", "IntegerNumber", "LongSuffix", "LONGLITERAL", "INTLITERAL", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "EscapeSequence", "CHARLITERAL", "STRINGLITERAL", "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "ELLIPSIS", "EQ", "BANG", "TILDE", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "BANGEQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "GT", "LT", "INTNUM", "EXPONENT", "FLOATNUM", "COMMENT", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'inline'", "'dynamic'", "'override'", "'<<='", "'>>='", "'>>>='", "'function'", "'#if'", "'#elseif'", "'#else'", "'#end'", "'#error'", "'->'", "'in'", "'>='", "'<='", "'<<'", "'>>'", "'>>>'", "'cast'", "'var'", "'typedef'"
    };
    public static final int PACKAGE=47;
    public static final int EXPONENT=118;
    public static final int LT=116;
    public static final int STAR=90;
    public static final int WHILE=64;
    public static final int FLOATNUM=119;
    public static final int CONST=25;
    public static final int OCTAL_ESC=125;
    public static final int CASE=21;
    public static final int CHAR=23;
    public static final int NEW=46;
    public static final int DO=28;
    public static final int EOF=-1;
    public static final int BREAK=19;
    public static final int LBRACKET=72;
    public static final int FINAL=33;
    public static final int RPAREN=69;
    public static final int IMPORT=40;
    public static final int T__147=147;
    public static final int SUBSUB=87;
    public static final int STAREQ=98;
    public static final int NonIntegerNumber=13;
    public static final int CARET=94;
    public static final int RETURN=51;
    public static final int THIS=57;
    public static final int DOUBLE=29;
    public static final int MONKEYS_AT=110;
    public static final int BARBAR=85;
    public static final int VOID=62;
    public static final int SUPER=55;
    public static final int EQ=78;
    public static final int GOTO=37;
    public static final int COMMENT=120;
    public static final int AMPAMP=84;
    public static final int QUES=81;
    public static final int EQEQ=83;
    public static final int HexPrefix=10;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int PERCENTDBBQ=106;
    public static final int RBRACE=71;
    public static final int PRIVATE=48;
    public static final int STATIC=53;
    public static final int SWITCH=56;
    public static final int NULL=67;
    public static final int ELSE=30;
    public static final int STRICTFP=54;
    public static final int ELLIPSIS=77;
    public static final int NATIVE=45;
    public static final int THROWS=59;
    public static final int INT=42;
    public static final int SLASHEQ=99;
    public static final int INTLITERAL=9;
    public static final int T__141=141;
    public static final int PERCENTBB=113;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int TRY=61;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int LONGLITERAL=8;
    public static final int LongSuffix=7;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__128=128;
    public static final int PERCENTLL=112;
    public static final int BANGEQQ=109;
    public static final int T__127=127;
    public static final int WS=5;
    public static final int T__129=129;
    public static final int PERCENTDLQ=104;
    public static final int CHARLITERAL=15;
    public static final int GT=115;
    public static final int CATCH=22;
    public static final int FALSE=66;
    public static final int T__130=130;
    public static final int EscapeSequence=14;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int THROW=58;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int PROTECTED=49;
    public static final int CLASS=24;
    public static final int BAREQ=101;
    public static final int IntegerNumber=6;
    public static final int AMP=92;
    public static final int PLUSPLUS=86;
    public static final int LBRACE=70;
    public static final int SUBEQ=97;
    public static final int Exponent=12;
    public static final int FOR=36;
    public static final int SUB=89;
    public static final int FLOAT=35;
    public static final int ABSTRACT=17;
    public static final int PERCENTDBQ=105;
    public static final int HexDigit=11;
    public static final int PLUSEQ=96;
    public static final int LPAREN=68;
    public static final int IF=38;
    public static final int INTNUM=117;
    public static final int ESC_SEQ=121;
    public static final int SLASH=91;
    public static final int BOOLEAN=18;
    public static final int IMPLEMENTS=39;
    public static final int CONTINUE=26;
    public static final int COMMA=75;
    public static final int AMPEQ=100;
    public static final int IDENTIFIER=4;
    public static final int TRANSIENT=60;
    public static final int TILDE=80;
    public static final int BANGEQ=111;
    public static final int PLUS=88;
    public static final int RBRACKET=73;
    public static final int DOT=76;
    public static final int BYTE=20;
    public static final int PERCENT=95;
    public static final int VOLATILE=63;
    public static final int UNICODE_ESC=124;
    public static final int EQEQEQ=107;
    public static final int DEFAULT=27;
    public static final int HEX_DIGIT=123;
    public static final int SHORT=52;
    public static final int BANG=79;
    public static final int INSTANCEOF=41;
    public static final int SEMI=74;
    public static final int TRUE=65;
    public static final int COLON=82;
    public static final int PERCENTLESQ=108;
    public static final int ENUM=31;
    public static final int PERCENTEQ=103;
    public static final int FINALLY=34;
    public static final int STRINGLITERAL=16;
    public static final int CARETEQ=102;
    public static final int PERCENTBBB=114;
    public static final int INTERFACE=43;
    public static final int LONG=44;
    public static final int EXTENDS=32;
    public static final int PUBLIC=50;
    public static final int BAR=93;
    public static final int STRING=122;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "synpred31_TinyHaxeTry1", "synpred4_TinyHaxeTry1", 
        "synpred96_TinyHaxeTry1", "synpred41_TinyHaxeTry1", "synpred81_TinyHaxeTry1", 
        "topLevelDecl", "synpred46_TinyHaxeTry1", "synpred21_TinyHaxeTry1", 
        "synpred47_TinyHaxeTry1", "synpred86_TinyHaxeTry1", "synpred109_TinyHaxeTry1", 
        "interfaceDecl", "declAttrList", "synpred65_TinyHaxeTry1", "inheritList", 
        "synpred35_TinyHaxeTry1", "synpred104_TinyHaxeTry1", "parExpression", 
        "synpred79_TinyHaxeTry1", "inherit", "synpred64_TinyHaxeTry1", "synpred88_TinyHaxeTry1", 
        "synpred87_TinyHaxeTry1", "synpred19_TinyHaxeTry1", "synpred44_TinyHaxeTry1", 
        "synpred28_TinyHaxeTry1", "propDeclOpt", "synpred116_TinyHaxeTry1", 
        "assignExpr", "synpred110_TinyHaxeTry1", "ternaryExpr", "paramListOpt", 
        "synpred53_TinyHaxeTry1", "typeConstraint", "synpred43_TinyHaxeTry1", 
        "synpred51_TinyHaxeTry1", "synpred68_TinyHaxeTry1", "synpred30_TinyHaxeTry1", 
        "synpred60_TinyHaxeTry1", "cmpExpr", "iterExpr", "synpred66_TinyHaxeTry1", 
        "synpred91_TinyHaxeTry1", "addExpr", "synpred90_TinyHaxeTry1", "synpred89_TinyHaxeTry1", 
        "typeTag", "synpred5_TinyHaxeTry1", "topLevelList", "synpred124_TinyHaxeTry1", 
        "synpred61_TinyHaxeTry1", "suffixExpr", "synpred67_TinyHaxeTry1", 
        "assignOp", "multExpr", "synpred74_TinyHaxeTry1", "synpred56_TinyHaxeTry1", 
        "statement", "synpred78_TinyHaxeTry1", "arrayLit", "varDeclPartList", 
        "synpred125_TinyHaxeTry1", "objLit", "synpred2_TinyHaxeTry1", "caseStmt", 
        "forStmt", "module", "synpred83_TinyHaxeTry1", "synpred108_TinyHaxeTry1", 
        "synpred63_TinyHaxeTry1", "synpred118_TinyHaxeTry1", "anonTypeFieldList", 
        "synpred12_TinyHaxeTry1", "synpred36_TinyHaxeTry1", "synpred16_TinyHaxeTry1", 
        "breakStmt", "synpred49_TinyHaxeTry1", "switchStmt", "myImport", 
        "synpred77_TinyHaxeTry1", "synpred33_TinyHaxeTry1", "synpred39_TinyHaxeTry1", 
        "cast", "synpred69_TinyHaxeTry1", "synpred72_TinyHaxeTry1", "funcLit", 
        "synpred117_TinyHaxeTry1", "access", "synpred42_TinyHaxeTry1", "logicAndExpr", 
        "exprList", "synpred80_TinyHaxeTry1", "typeParamOpt", "synpred57_TinyHaxeTry1", 
        "synpred37_TinyHaxeTry1", "varDecl", "param", "varDeclList", "ppElse", 
        "synpred127_TinyHaxeTry1", "synpred94_TinyHaxeTry1", "synpred100_TinyHaxeTry1", 
        "synpred102_TinyHaxeTry1", "synpred8_TinyHaxeTry1", "synpred24_TinyHaxeTry1", 
        "synpred29_TinyHaxeTry1", "typedefDecl", "synpred95_TinyHaxeTry1", 
        "catchStmtList", "synpred10_TinyHaxeTry1", "typeParam", "synpred15_TinyHaxeTry1", 
        "synpred18_TinyHaxeTry1", "type", "synpred23_TinyHaxeTry1", "synpred128_TinyHaxeTry1", 
        "synpred99_TinyHaxeTry1", "synpred48_TinyHaxeTry1", "synpred40_TinyHaxeTry1", 
        "paramList", "synpred7_TinyHaxeTry1", "newExpr", "objLitElemList", 
        "enumBody", "typeList", "continueStmt", "block", "topLevel", "blockStmt", 
        "exprListOpt", "synpred73_TinyHaxeTry1", "synpred55_TinyHaxeTry1", 
        "enumValueDecl", "synpred92_TinyHaxeTry1", "objLitElem", "myPackage", 
        "varDeclPart", "ppElseIf", "synpred97_TinyHaxeTry1", "anonTypeField", 
        "interfaceBody", "propAccessor", "synpred106_TinyHaxeTry1", "declAttr", 
        "synpred76_TinyHaxeTry1", "synpred11_TinyHaxeTry1", "synpred101_TinyHaxeTry1", 
        "classBody", "defaultStmt", "varInitOpt", "ppEnd", "bitExpr", "synpred120_TinyHaxeTry1", 
        "synpred75_TinyHaxeTry1", "synpred98_TinyHaxeTry1", "synpred126_TinyHaxeTry1", 
        "synpred1_TinyHaxeTry1", "shiftExpr", "anonType", "synpred121_TinyHaxeTry1", 
        "pp", "enumDecl", "synpred112_TinyHaxeTry1", "synpred9_TinyHaxeTry1", 
        "synpred62_TinyHaxeTry1", "synpred59_TinyHaxeTry1", "prefixExpr", 
        "synpred50_TinyHaxeTry1", "synpred13_TinyHaxeTry1", "synpred27_TinyHaxeTry1", 
        "typeExtend", "synpred93_TinyHaxeTry1", "synpred25_TinyHaxeTry1", 
        "synpred52_TinyHaxeTry1", "funcProtoDecl", "synpred114_TinyHaxeTry1", 
        "typeTagOpt", "varInit", "synpred34_TinyHaxeTry1", "synpred115_TinyHaxeTry1", 
        "synpred3_TinyHaxeTry1", "synpred70_TinyHaxeTry1", "funcDecl", "synpred58_TinyHaxeTry1", 
        "synpred111_TinyHaxeTry1", "dotIdent", "tryStmt", "synpred119_TinyHaxeTry1", 
        "funcType", "synpred85_TinyHaxeTry1", "propDecl", "ppError", "synpred17_TinyHaxeTry1", 
        "synpred84_TinyHaxeTry1", "synpred123_TinyHaxeTry1", "synpred45_TinyHaxeTry1", 
        "classDecl", "synpred54_TinyHaxeTry1", "synpred32_TinyHaxeTry1", 
        "synpred6_TinyHaxeTry1", "synpred122_TinyHaxeTry1", "value", "synpred20_TinyHaxeTry1", 
        "synpred38_TinyHaxeTry1", "synpred71_TinyHaxeTry1", "expr", "logicOrExpr", 
        "synpred107_TinyHaxeTry1", "inheritListOpt", "ppIf", "synpred26_TinyHaxeTry1", 
        "synpred113_TinyHaxeTry1", "catchStmt", "synpred22_TinyHaxeTry1", 
        "synpred103_TinyHaxeTry1", "synpred14_TinyHaxeTry1", "synpred82_TinyHaxeTry1", 
        "synpred105_TinyHaxeTry1"
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
            this.state.ruleMemo = new HashMap[218+1];
             
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public TinyHaxeTry1Parser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());
        this.state.ruleMemo = new HashMap[218+1];
         
    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\antlr\\TinyHaxeTry1.g"; }



    // $ANTLR start "module"
    // C:\\antlr\\TinyHaxeTry1.g:9:1: module : ( myPackage topLevelList | topLevelList );
    public final void module() throws RecognitionException {
        int module_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "module");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:9:19: ( myPackage topLevelList | topLevelList )
            int alt1=2;
            try { dbg.enterDecision(1);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||LA1_0==CLASS||LA1_0==ENUM||LA1_0==IMPORT||LA1_0==INTERFACE||(LA1_0>=133 && LA1_0<=137)||LA1_0==147) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:9:21: myPackage topLevelList
                    {
                    dbg.location(9,21);
                    pushFollow(FOLLOW_myPackage_in_module45);
                    myPackage();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(9,31);
                    pushFollow(FOLLOW_topLevelList_in_module47);
                    topLevelList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:10:25: topLevelList
                    {
                    dbg.location(10,25);
                    pushFollow(FOLLOW_topLevelList_in_module73);
                    topLevelList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, module_StartIndex); }
        }
        dbg.location(11, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "module");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "module"


    // $ANTLR start "topLevelList"
    // C:\\antlr\\TinyHaxeTry1.g:12:1: topLevelList : ( topLevel )* ;
    public final void topLevelList() throws RecognitionException {
        int topLevelList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "topLevelList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:12:19: ( ( topLevel )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:12:22: ( topLevel )*
            {
            dbg.location(12,22);
            // C:\\antlr\\TinyHaxeTry1.g:12:22: ( topLevel )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ENUM||LA2_0==IMPORT||LA2_0==INTERFACE||(LA2_0>=133 && LA2_0<=137)||LA2_0==147) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:12:23: topLevel
            	    {
            	    dbg.location(12,23);
            	    pushFollow(FOLLOW_topLevel_in_topLevelList89);
            	    topLevel();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, topLevelList_StartIndex); }
        }
        dbg.location(13, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevelList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "topLevelList"


    // $ANTLR start "topLevel"
    // C:\\antlr\\TinyHaxeTry1.g:14:1: topLevel : ( myImport | pp | topLevelDecl );
    public final void topLevel() throws RecognitionException {
        int topLevel_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "topLevel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:14:19: ( myImport | pp | topLevelDecl )
            int alt3=3;
            try { dbg.enterDecision(3);

            switch ( input.LA(1) ) {
            case IMPORT:
                {
                alt3=1;
                }
                break;
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
                {
                alt3=2;
                }
                break;
            case CLASS:
            case ENUM:
            case INTERFACE:
            case 147:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:14:21: myImport
                    {
                    dbg.location(14,21);
                    pushFollow(FOLLOW_myImport_in_topLevel108);
                    myImport();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:15:25: pp
                    {
                    dbg.location(15,25);
                    pushFollow(FOLLOW_pp_in_topLevel134);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:16:25: topLevelDecl
                    {
                    dbg.location(16,25);
                    pushFollow(FOLLOW_topLevelDecl_in_topLevel160);
                    topLevelDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, topLevel_StartIndex); }
        }
        dbg.location(17, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "topLevel"


    // $ANTLR start "myPackage"
    // C:\\antlr\\TinyHaxeTry1.g:18:1: myPackage : 'package' dotIdent ';' ;
    public final void myPackage() throws RecognitionException {
        int myPackage_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "myPackage");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:18:21: ( 'package' dotIdent ';' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:18:23: 'package' dotIdent ';'
            {
            dbg.location(18,23);
            match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage179); if (state.failed) return ;
            dbg.location(18,33);
            pushFollow(FOLLOW_dotIdent_in_myPackage181);
            dotIdent();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(18,42);
            match(input,SEMI,FOLLOW_SEMI_in_myPackage183); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, myPackage_StartIndex); }
        }
        dbg.location(19, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "myPackage");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "myPackage"


    // $ANTLR start "myImport"
    // C:\\antlr\\TinyHaxeTry1.g:20:1: myImport : 'import' dotIdent ';' ;
    public final void myImport() throws RecognitionException {
        int myImport_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "myImport");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:20:21: ( 'import' dotIdent ';' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:20:23: 'import' dotIdent ';'
            {
            dbg.location(20,23);
            match(input,IMPORT,FOLLOW_IMPORT_in_myImport203); if (state.failed) return ;
            dbg.location(20,32);
            pushFollow(FOLLOW_dotIdent_in_myImport205);
            dotIdent();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(20,41);
            match(input,SEMI,FOLLOW_SEMI_in_myImport207); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, myImport_StartIndex); }
        }
        dbg.location(21, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "myImport");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "myImport"


    // $ANTLR start "access"
    // C:\\antlr\\TinyHaxeTry1.g:24:1: access : ( 'public' | 'private' );
    public final void access() throws RecognitionException {
        int access_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "access");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:24:19: ( 'public' | 'private' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:
            {
            dbg.location(24,19);
            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, access_StartIndex); }
        }
        dbg.location(26, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "access");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "access"


    // $ANTLR start "declAttr"
    // C:\\antlr\\TinyHaxeTry1.g:27:1: declAttr : ( 'static' | 'inline' | 'dynamic' | 'override' | access );
    public final void declAttr() throws RecognitionException {
        int declAttr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "declAttr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:27:19: ( 'static' | 'inline' | 'dynamic' | 'override' | access )
            int alt4=5;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case STATIC:
                {
                alt4=1;
                }
                break;
            case 126:
                {
                alt4=2;
                }
                break;
            case 127:
                {
                alt4=3;
                }
                break;
            case 128:
                {
                alt4=4;
                }
                break;
            case PRIVATE:
            case PUBLIC:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:27:21: 'static'
                    {
                    dbg.location(27,21);
                    match(input,STATIC,FOLLOW_STATIC_in_declAttr293); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:28:25: 'inline'
                    {
                    dbg.location(28,25);
                    match(input,126,FOLLOW_126_in_declAttr319); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:29:25: 'dynamic'
                    {
                    dbg.location(29,25);
                    match(input,127,FOLLOW_127_in_declAttr345); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:30:25: 'override'
                    {
                    dbg.location(30,25);
                    match(input,128,FOLLOW_128_in_declAttr371); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\antlr\\TinyHaxeTry1.g:31:25: access
                    {
                    dbg.location(31,25);
                    pushFollow(FOLLOW_access_in_declAttr397);
                    access();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, declAttr_StartIndex); }
        }
        dbg.location(32, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declAttr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declAttr"


    // $ANTLR start "declAttrList"
    // C:\\antlr\\TinyHaxeTry1.g:33:1: declAttrList : ( declAttr )+ ;
    public final void declAttrList() throws RecognitionException {
        int declAttrList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "declAttrList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:33:19: ( ( declAttr )+ )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:33:21: ( declAttr )+
            {
            dbg.location(33,21);
            // C:\\antlr\\TinyHaxeTry1.g:33:21: ( declAttr )+
            int cnt5=0;
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==PRIVATE||LA5_0==PUBLIC||LA5_0==STATIC||(LA5_0>=126 && LA5_0<=128)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:33:22: declAttr
            	    {
            	    dbg.location(33,22);
            	    pushFollow(FOLLOW_declAttr_in_declAttrList412);
            	    declAttr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt5++;
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, declAttrList_StartIndex); }
        }
        dbg.location(34, 10);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declAttrList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "declAttrList"


    // $ANTLR start "paramListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:41:1: paramListOpt : paramList ;
    public final void paramListOpt() throws RecognitionException {
        int paramListOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "paramListOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:41:19: ( paramList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:41:21: paramList
            {
            dbg.location(41,21);
            pushFollow(FOLLOW_paramList_in_paramListOpt440);
            paramList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, paramListOpt_StartIndex); }
        }
        dbg.location(43, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paramListOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "paramListOpt"


    // $ANTLR start "paramList"
    // C:\\antlr\\TinyHaxeTry1.g:44:1: paramList : param ( ',' param )* ;
    public final void paramList() throws RecognitionException {
        int paramList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "paramList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(44, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:44:19: ( param ( ',' param )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:44:21: param ( ',' param )*
            {
            dbg.location(44,21);
            pushFollow(FOLLOW_param_in_paramList466);
            param();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(44,27);
            // C:\\antlr\\TinyHaxeTry1.g:44:27: ( ',' param )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:44:28: ',' param
            	    {
            	    dbg.location(44,28);
            	    match(input,COMMA,FOLLOW_COMMA_in_paramList469); if (state.failed) return ;
            	    dbg.location(44,32);
            	    pushFollow(FOLLOW_param_in_paramList471);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, paramList_StartIndex); }
        }
        dbg.location(45, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "paramList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "param"
    // C:\\antlr\\TinyHaxeTry1.g:46:1: param : ( IDENTIFIER typeTagOpt varInitOpt | '?' IDENTIFIER typeTagOpt varInitOpt );
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "param");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:46:19: ( IDENTIFIER typeTagOpt varInitOpt | '?' IDENTIFIER typeTagOpt varInitOpt )
            int alt7=2;
            try { dbg.enterDecision(7);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==QUES) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:46:20: IDENTIFIER typeTagOpt varInitOpt
                    {
                    dbg.location(46,20);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param493); if (state.failed) return ;
                    dbg.location(46,31);
                    pushFollow(FOLLOW_typeTagOpt_in_param495);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(46,42);
                    pushFollow(FOLLOW_varInitOpt_in_param497);
                    varInitOpt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:47:25: '?' IDENTIFIER typeTagOpt varInitOpt
                    {
                    dbg.location(47,25);
                    match(input,QUES,FOLLOW_QUES_in_param523); if (state.failed) return ;
                    dbg.location(47,28);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param524); if (state.failed) return ;
                    dbg.location(47,39);
                    pushFollow(FOLLOW_typeTagOpt_in_param526);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(47,50);
                    pushFollow(FOLLOW_varInitOpt_in_param528);
                    varInitOpt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, param_StartIndex); }
        }
        dbg.location(48, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "param"


    // $ANTLR start "dotIdent"
    // C:\\antlr\\TinyHaxeTry1.g:49:1: dotIdent : ( IDENTIFIER ) ( '.' IDENTIFIER )* ;
    public final void dotIdent() throws RecognitionException {
        int dotIdent_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "dotIdent");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:49:19: ( ( IDENTIFIER ) ( '.' IDENTIFIER )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:49:21: ( IDENTIFIER ) ( '.' IDENTIFIER )*
            {
            dbg.location(49,21);
            // C:\\antlr\\TinyHaxeTry1.g:49:21: ( IDENTIFIER )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:49:22: IDENTIFIER
            {
            dbg.location(49,22);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent547); if (state.failed) return ;

            }

            dbg.location(49,34);
            // C:\\antlr\\TinyHaxeTry1.g:49:34: ( '.' IDENTIFIER )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==DOT) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:49:35: '.' IDENTIFIER
            	    {
            	    dbg.location(49,35);
            	    match(input,DOT,FOLLOW_DOT_in_dotIdent551); if (state.failed) return ;
            	    dbg.location(49,38);
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent552); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, dotIdent_StartIndex); }
        }
        dbg.location(50, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "dotIdent");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "dotIdent"


    // $ANTLR start "assignOp"
    // C:\\antlr\\TinyHaxeTry1.g:51:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "assignOp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:51:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:
            {
            dbg.location(51,19);
            if ( input.LA(1)==EQ||(input.LA(1)>=PLUSEQ && input.LA(1)<=PERCENTEQ)||(input.LA(1)>=129 && input.LA(1)<=131) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, assignOp_StartIndex); }
        }
        dbg.location(63, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignOp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignOp"


    // $ANTLR start "funcLit"
    // C:\\antlr\\TinyHaxeTry1.g:64:1: funcLit : 'function' '(' paramListOpt ')' typeTagOpt block ;
    public final void funcLit() throws RecognitionException {
        int funcLit_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "funcLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(64, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:64:19: ( 'function' '(' paramListOpt ')' typeTagOpt block )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:64:21: 'function' '(' paramListOpt ')' typeTagOpt block
            {
            dbg.location(64,21);
            match(input,132,FOLLOW_132_in_funcLit877); if (state.failed) return ;
            dbg.location(64,32);
            match(input,LPAREN,FOLLOW_LPAREN_in_funcLit879); if (state.failed) return ;
            dbg.location(64,36);
            pushFollow(FOLLOW_paramListOpt_in_funcLit881);
            paramListOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(64,49);
            match(input,RPAREN,FOLLOW_RPAREN_in_funcLit883); if (state.failed) return ;
            dbg.location(64,53);
            pushFollow(FOLLOW_typeTagOpt_in_funcLit885);
            typeTagOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(64,64);
            pushFollow(FOLLOW_block_in_funcLit887);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, funcLit_StartIndex); }
        }
        dbg.location(65, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcLit"


    // $ANTLR start "arrayLit"
    // C:\\antlr\\TinyHaxeTry1.g:66:1: arrayLit : '[' exprListOpt ']' ;
    public final void arrayLit() throws RecognitionException {
        int arrayLit_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "arrayLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:66:18: ( '[' exprListOpt ']' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:66:20: '[' exprListOpt ']'
            {
            dbg.location(66,20);
            match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit904); if (state.failed) return ;
            dbg.location(66,24);
            pushFollow(FOLLOW_exprListOpt_in_arrayLit906);
            exprListOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(66,36);
            match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit908); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, arrayLit_StartIndex); }
        }
        dbg.location(67, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arrayLit"


    // $ANTLR start "pp"
    // C:\\antlr\\TinyHaxeTry1.g:73:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    public final void pp() throws RecognitionException {
        int pp_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "pp");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:73:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
            int alt9=5;
            try { dbg.enterDecision(9);

            switch ( input.LA(1) ) {
            case 133:
                {
                alt9=1;
                }
                break;
            case 134:
                {
                alt9=2;
                }
                break;
            case 135:
                {
                alt9=3;
                }
                break;
            case 136:
                {
                alt9=4;
                }
                break;
            case 137:
                {
                alt9=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:73:21: ppIf
                    {
                    dbg.location(73,21);
                    pushFollow(FOLLOW_ppIf_in_pp935);
                    ppIf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:74:25: ppElseIf
                    {
                    dbg.location(74,25);
                    pushFollow(FOLLOW_ppElseIf_in_pp961);
                    ppElseIf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:75:25: ppElse
                    {
                    dbg.location(75,25);
                    pushFollow(FOLLOW_ppElse_in_pp987);
                    ppElse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:76:25: ppEnd
                    {
                    dbg.location(76,25);
                    pushFollow(FOLLOW_ppEnd_in_pp1013);
                    ppEnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\antlr\\TinyHaxeTry1.g:77:25: ppError
                    {
                    dbg.location(77,25);
                    pushFollow(FOLLOW_ppError_in_pp1039);
                    ppError();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, pp_StartIndex); }
        }
        dbg.location(78, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pp");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pp"


    // $ANTLR start "ppIf"
    // C:\\antlr\\TinyHaxeTry1.g:79:1: ppIf : ( '#if' IDENTIFIER | '#if' '!' IDENTIFIER );
    public final void ppIf() throws RecognitionException {
        int ppIf_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ppIf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:79:19: ( '#if' IDENTIFIER | '#if' '!' IDENTIFIER )
            int alt10=2;
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( (LA10_0==133) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==IDENTIFIER) ) {
                    alt10=1;
                }
                else if ( (LA10_1==BANG) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:79:21: '#if' IDENTIFIER
                    {
                    dbg.location(79,21);
                    match(input,133,FOLLOW_133_in_ppIf1061); if (state.failed) return ;
                    dbg.location(79,26);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1062); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:80:25: '#if' '!' IDENTIFIER
                    {
                    dbg.location(80,25);
                    match(input,133,FOLLOW_133_in_ppIf1088); if (state.failed) return ;
                    dbg.location(80,31);
                    match(input,BANG,FOLLOW_BANG_in_ppIf1090); if (state.failed) return ;
                    dbg.location(80,34);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1091); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, ppIf_StartIndex); }
        }
        dbg.location(81, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppIf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppIf"


    // $ANTLR start "ppElseIf"
    // C:\\antlr\\TinyHaxeTry1.g:82:1: ppElseIf : ( '#elseif' IDENTIFIER | '#elseif' '!' IDENTIFIER );
    public final void ppElseIf() throws RecognitionException {
        int ppElseIf_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ppElseIf");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:82:19: ( '#elseif' IDENTIFIER | '#elseif' '!' IDENTIFIER )
            int alt11=2;
            try { dbg.enterDecision(11);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==134) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==IDENTIFIER) ) {
                    alt11=1;
                }
                else if ( (LA11_1==BANG) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:82:21: '#elseif' IDENTIFIER
                    {
                    dbg.location(82,21);
                    match(input,134,FOLLOW_134_in_ppElseIf1109); if (state.failed) return ;
                    dbg.location(82,30);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1110); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:83:25: '#elseif' '!' IDENTIFIER
                    {
                    dbg.location(83,25);
                    match(input,134,FOLLOW_134_in_ppElseIf1136); if (state.failed) return ;
                    dbg.location(83,35);
                    match(input,BANG,FOLLOW_BANG_in_ppElseIf1138); if (state.failed) return ;
                    dbg.location(83,38);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1139); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, ppElseIf_StartIndex); }
        }
        dbg.location(84, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppElseIf");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppElseIf"


    // $ANTLR start "ppElse"
    // C:\\antlr\\TinyHaxeTry1.g:85:1: ppElse : '#else' ;
    public final void ppElse() throws RecognitionException {
        int ppElse_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ppElse");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:85:19: ( '#else' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:85:21: '#else'
            {
            dbg.location(85,21);
            match(input,135,FOLLOW_135_in_ppElse1159); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, ppElse_StartIndex); }
        }
        dbg.location(86, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppElse");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppElse"


    // $ANTLR start "ppEnd"
    // C:\\antlr\\TinyHaxeTry1.g:87:1: ppEnd : '#end' ;
    public final void ppEnd() throws RecognitionException {
        int ppEnd_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ppEnd");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(87, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:87:19: ( '#end' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:87:21: '#end'
            {
            dbg.location(87,21);
            match(input,136,FOLLOW_136_in_ppEnd1180); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ppEnd_StartIndex); }
        }
        dbg.location(88, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppEnd");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppEnd"


    // $ANTLR start "ppError"
    // C:\\antlr\\TinyHaxeTry1.g:89:1: ppError : '#error' ;
    public final void ppError() throws RecognitionException {
        int ppError_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ppError");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:89:19: ( '#error' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:89:21: '#error'
            {
            dbg.location(89,21);
            match(input,137,FOLLOW_137_in_ppError1199); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, ppError_StartIndex); }
        }
        dbg.location(90, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ppError");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ppError"


    // $ANTLR start "typeTag"
    // C:\\antlr\\TinyHaxeTry1.g:93:1: typeTag : ':' funcType ;
    public final void typeTag() throws RecognitionException {
        int typeTag_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeTag");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(93, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:93:19: ( ':' funcType )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:93:21: ':' funcType
            {
            dbg.location(93,21);
            match(input,COLON,FOLLOW_COLON_in_typeTag1220); if (state.failed) return ;
            dbg.location(93,25);
            pushFollow(FOLLOW_funcType_in_typeTag1222);
            funcType();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, typeTag_StartIndex); }
        }
        dbg.location(94, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeTag");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeTag"


    // $ANTLR start "typeTagOpt"
    // C:\\antlr\\TinyHaxeTry1.g:95:1: typeTagOpt : typeTag ;
    public final void typeTagOpt() throws RecognitionException {
        int typeTagOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeTagOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:95:19: ( typeTag )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:95:21: typeTag
            {
            dbg.location(95,21);
            pushFollow(FOLLOW_typeTag_in_typeTagOpt1238);
            typeTag();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, typeTagOpt_StartIndex); }
        }
        dbg.location(97, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeTagOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeTagOpt"


    // $ANTLR start "typeList"
    // C:\\antlr\\TinyHaxeTry1.g:98:1: typeList : ( funcType ( ',' funcType )* | typeConstraint ( ',' typeConstraint )* );
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:98:19: ( funcType ( ',' funcType )* | typeConstraint ( ',' typeConstraint )* )
            int alt14=2;
            try { dbg.enterDecision(14);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==LBRACE) ) {
                alt14=1;
            }
            else if ( (LA14_0==IDENTIFIER) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==COLON) ) {
                    alt14=2;
                }
                else if ( (LA14_2==RPAREN||(LA14_2>=COMMA && LA14_2<=DOT)||(LA14_2>=GT && LA14_2<=LT)||LA14_2==138) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:98:21: funcType ( ',' funcType )*
                    {
                    dbg.location(98,21);
                    pushFollow(FOLLOW_funcType_in_typeList1266);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(98,30);
                    // C:\\antlr\\TinyHaxeTry1.g:98:30: ( ',' funcType )*
                    try { dbg.enterSubRule(12);

                    loop12:
                    do {
                        int alt12=2;
                        try { dbg.enterDecision(12);

                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        } finally {dbg.exitDecision(12);}

                        switch (alt12) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\antlr\\TinyHaxeTry1.g:98:31: ',' funcType
                    	    {
                    	    dbg.location(98,31);
                    	    match(input,COMMA,FOLLOW_COMMA_in_typeList1269); if (state.failed) return ;
                    	    dbg.location(98,35);
                    	    pushFollow(FOLLOW_funcType_in_typeList1271);
                    	    funcType();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:99:25: typeConstraint ( ',' typeConstraint )*
                    {
                    dbg.location(99,25);
                    pushFollow(FOLLOW_typeConstraint_in_typeList1299);
                    typeConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(99,40);
                    // C:\\antlr\\TinyHaxeTry1.g:99:40: ( ',' typeConstraint )*
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\antlr\\TinyHaxeTry1.g:99:41: ',' typeConstraint
                    	    {
                    	    dbg.location(99,41);
                    	    match(input,COMMA,FOLLOW_COMMA_in_typeList1302); if (state.failed) return ;
                    	    dbg.location(99,45);
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1304);
                    	    typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, typeList_StartIndex); }
        }
        dbg.location(100, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeList"


    // $ANTLR start "funcType"
    // C:\\antlr\\TinyHaxeTry1.g:110:1: funcType : ( type ) ( '->' type )* ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "funcType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:110:19: ( ( type ) ( '->' type )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:110:21: ( type ) ( '->' type )*
            {
            dbg.location(110,21);
            // C:\\antlr\\TinyHaxeTry1.g:110:21: ( type )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:110:22: type
            {
            dbg.location(110,22);
            pushFollow(FOLLOW_type_in_funcType1346);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(110,28);
            // C:\\antlr\\TinyHaxeTry1.g:110:28: ( '->' type )*
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==138) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:110:29: '->' type
            	    {
            	    dbg.location(110,29);
            	    match(input,138,FOLLOW_138_in_funcType1350); if (state.failed) return ;
            	    dbg.location(110,34);
            	    pushFollow(FOLLOW_type_in_funcType1352);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);
            } finally {dbg.exitSubRule(15);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, funcType_StartIndex); }
        }
        dbg.location(111, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcType"


    // $ANTLR start "type"
    // C:\\antlr\\TinyHaxeTry1.g:112:1: type : ( anonType | dotIdent ) ( typeParam )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:112:19: ( ( anonType | dotIdent ) ( typeParam )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:112:21: ( anonType | dotIdent ) ( typeParam )*
            {
            dbg.location(112,21);
            // C:\\antlr\\TinyHaxeTry1.g:112:21: ( anonType | dotIdent )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACE) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENTIFIER) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:112:22: anonType
                    {
                    dbg.location(112,22);
                    pushFollow(FOLLOW_anonType_in_type1377);
                    anonType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:112:33: dotIdent
                    {
                    dbg.location(112,33);
                    pushFollow(FOLLOW_dotIdent_in_type1381);
                    dotIdent();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(112,43);
            // C:\\antlr\\TinyHaxeTry1.g:112:43: ( typeParam )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==LT) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:112:44: typeParam
            	    {
            	    dbg.location(112,44);
            	    pushFollow(FOLLOW_typeParam_in_type1385);
            	    typeParam();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, type_StartIndex); }
        }
        dbg.location(113, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeParam"
    // C:\\antlr\\TinyHaxeTry1.g:114:1: typeParam : '<' typeList '>' ;
    public final void typeParam() throws RecognitionException {
        int typeParam_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeParam");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:114:19: ( '<' typeList '>' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:114:21: '<' typeList '>'
            {
            dbg.location(114,21);
            match(input,LT,FOLLOW_LT_in_typeParam1404); if (state.failed) return ;
            dbg.location(114,25);
            pushFollow(FOLLOW_typeList_in_typeParam1406);
            typeList();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(114,34);
            match(input,GT,FOLLOW_GT_in_typeParam1408); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, typeParam_StartIndex); }
        }
        dbg.location(115, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParam");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeParam"


    // $ANTLR start "typeParamOpt"
    // C:\\antlr\\TinyHaxeTry1.g:116:1: typeParamOpt : typeParam ;
    public final void typeParamOpt() throws RecognitionException {
        int typeParamOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeParamOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:116:19: ( typeParam )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:116:21: typeParam
            {
            dbg.location(116,21);
            pushFollow(FOLLOW_typeParam_in_typeParamOpt1422);
            typeParam();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, typeParamOpt_StartIndex); }
        }
        dbg.location(118, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeParamOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeParamOpt"


    // $ANTLR start "typeConstraint"
    // C:\\antlr\\TinyHaxeTry1.g:119:1: typeConstraint : IDENTIFIER ':' '(' typeList ')' ;
    public final void typeConstraint() throws RecognitionException {
        int typeConstraint_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeConstraint");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(119, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:119:19: ( IDENTIFIER ':' '(' typeList ')' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:119:20: IDENTIFIER ':' '(' typeList ')'
            {
            dbg.location(119,20);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1443); if (state.failed) return ;
            dbg.location(119,31);
            match(input,COLON,FOLLOW_COLON_in_typeConstraint1445); if (state.failed) return ;
            dbg.location(119,35);
            match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1447); if (state.failed) return ;
            dbg.location(119,39);
            pushFollow(FOLLOW_typeList_in_typeConstraint1449);
            typeList();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(119,48);
            match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1451); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, typeConstraint_StartIndex); }
        }
        dbg.location(120, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeConstraint");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeConstraint"


    // $ANTLR start "statement"
    // C:\\antlr\\TinyHaxeTry1.g:127:1: statement : ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:128:5: ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' )
            int alt22=14;
            try { dbg.enterDecision(22);

            try {
                isCyclicDecision = true;
                alt22 = dfa22.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:128:9: block
                    {
                    dbg.location(128,9);
                    pushFollow(FOLLOW_block_in_statement1476);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:129:9: 'if' parExpression statement ( 'else' statement )?
                    {
                    dbg.location(129,9);
                    match(input,IF,FOLLOW_IF_in_statement1486); if (state.failed) return ;
                    dbg.location(129,14);
                    pushFollow(FOLLOW_parExpression_in_statement1488);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(129,28);
                    pushFollow(FOLLOW_statement_in_statement1490);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(129,38);
                    // C:\\antlr\\TinyHaxeTry1.g:129:38: ( 'else' statement )?
                    int alt18=2;
                    try { dbg.enterSubRule(18);
                    try { dbg.enterDecision(18);

                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ELSE) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred38_TinyHaxeTry1()) ) {
                            alt18=1;
                        }
                    }
                    } finally {dbg.exitDecision(18);}

                    switch (alt18) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:129:39: 'else' statement
                            {
                            dbg.location(129,39);
                            match(input,ELSE,FOLLOW_ELSE_in_statement1493); if (state.failed) return ;
                            dbg.location(129,46);
                            pushFollow(FOLLOW_statement_in_statement1495);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(18);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:130:9: forStmt
                    {
                    dbg.location(130,9);
                    pushFollow(FOLLOW_forStmt_in_statement1517);
                    forStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:131:9: 'while' parExpression statement
                    {
                    dbg.location(131,9);
                    match(input,WHILE,FOLLOW_WHILE_in_statement1527); if (state.failed) return ;
                    dbg.location(131,17);
                    pushFollow(FOLLOW_parExpression_in_statement1529);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(131,31);
                    pushFollow(FOLLOW_statement_in_statement1531);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\antlr\\TinyHaxeTry1.g:132:9: 'do' statement 'while' parExpression ';'
                    {
                    dbg.location(132,9);
                    match(input,DO,FOLLOW_DO_in_statement1541); if (state.failed) return ;
                    dbg.location(132,14);
                    pushFollow(FOLLOW_statement_in_statement1543);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(132,24);
                    match(input,WHILE,FOLLOW_WHILE_in_statement1545); if (state.failed) return ;
                    dbg.location(132,32);
                    pushFollow(FOLLOW_parExpression_in_statement1547);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(132,46);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1549); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\antlr\\TinyHaxeTry1.g:133:9: tryStmt
                    {
                    dbg.location(133,9);
                    pushFollow(FOLLOW_tryStmt_in_statement1559);
                    tryStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // C:\\antlr\\TinyHaxeTry1.g:135:6: switchStmt
                    {
                    dbg.location(135,6);
                    pushFollow(FOLLOW_switchStmt_in_statement1569);
                    switchStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // C:\\antlr\\TinyHaxeTry1.g:136:9: 'return' ( expr )? ';'
                    {
                    dbg.location(136,9);
                    match(input,RETURN,FOLLOW_RETURN_in_statement1579); if (state.failed) return ;
                    dbg.location(136,18);
                    // C:\\antlr\\TinyHaxeTry1.g:136:18: ( expr )?
                    int alt19=2;
                    try { dbg.enterSubRule(19);
                    try { dbg.enterDecision(19);

                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==IDENTIFIER||LA19_0==NEW||(LA19_0>=NULL && LA19_0<=LPAREN)||LA19_0==LBRACE||LA19_0==LBRACKET||(LA19_0>=BANG && LA19_0<=TILDE)||(LA19_0>=PLUSPLUS && LA19_0<=SUBSUB)||LA19_0==SUB||LA19_0==132||LA19_0==145) ) {
                        alt19=1;
                    }
                    } finally {dbg.exitDecision(19);}

                    switch (alt19) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:136:19: expr
                            {
                            dbg.location(136,19);
                            pushFollow(FOLLOW_expr_in_statement1582);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(19);}

                    dbg.location(136,26);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1586); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    dbg.enterAlt(9);

                    // C:\\antlr\\TinyHaxeTry1.g:137:9: 'throw' expr ';'
                    {
                    dbg.location(137,9);
                    match(input,THROW,FOLLOW_THROW_in_statement1596); if (state.failed) return ;
                    dbg.location(137,17);
                    pushFollow(FOLLOW_expr_in_statement1598);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(137,22);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1600); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    dbg.enterAlt(10);

                    // C:\\antlr\\TinyHaxeTry1.g:138:9: 'break' ( IDENTIFIER )? ';'
                    {
                    dbg.location(138,9);
                    match(input,BREAK,FOLLOW_BREAK_in_statement1610); if (state.failed) return ;
                    dbg.location(138,17);
                    // C:\\antlr\\TinyHaxeTry1.g:138:17: ( IDENTIFIER )?
                    int alt20=2;
                    try { dbg.enterSubRule(20);
                    try { dbg.enterDecision(20);

                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==IDENTIFIER) ) {
                        alt20=1;
                    }
                    } finally {dbg.exitDecision(20);}

                    switch (alt20) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:138:18: IDENTIFIER
                            {
                            dbg.location(138,18);
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1613); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(20);}

                    dbg.location(138,31);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1617); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    dbg.enterAlt(11);

                    // C:\\antlr\\TinyHaxeTry1.g:139:9: 'continue' ( IDENTIFIER )? ';'
                    {
                    dbg.location(139,9);
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1627); if (state.failed) return ;
                    dbg.location(139,20);
                    // C:\\antlr\\TinyHaxeTry1.g:139:20: ( IDENTIFIER )?
                    int alt21=2;
                    try { dbg.enterSubRule(21);
                    try { dbg.enterDecision(21);

                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==IDENTIFIER) ) {
                        alt21=1;
                    }
                    } finally {dbg.exitDecision(21);}

                    switch (alt21) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:139:21: IDENTIFIER
                            {
                            dbg.location(139,21);
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1630); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(21);}

                    dbg.location(139,34);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1634); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    dbg.enterAlt(12);

                    // C:\\antlr\\TinyHaxeTry1.g:140:9: expr ';'
                    {
                    dbg.location(140,9);
                    pushFollow(FOLLOW_expr_in_statement1644);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(140,15);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1647); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    dbg.enterAlt(13);

                    // C:\\antlr\\TinyHaxeTry1.g:141:9: IDENTIFIER ':' statement
                    {
                    dbg.location(141,9);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1662); if (state.failed) return ;
                    dbg.location(141,20);
                    match(input,COLON,FOLLOW_COLON_in_statement1664); if (state.failed) return ;
                    dbg.location(141,24);
                    pushFollow(FOLLOW_statement_in_statement1666);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    dbg.enterAlt(14);

                    // C:\\antlr\\TinyHaxeTry1.g:142:9: ';'
                    {
                    dbg.location(142,9);
                    match(input,SEMI,FOLLOW_SEMI_in_statement1676); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, statement_StartIndex); }
        }
        dbg.location(143, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "parExpression"
    // C:\\antlr\\TinyHaxeTry1.g:145:1: parExpression : '(' expr ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "parExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(145, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:146:5: ( '(' expr ')' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:146:9: '(' expr ')'
            {
            dbg.location(146,9);
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1700); if (state.failed) return ;
            dbg.location(146,13);
            pushFollow(FOLLOW_expr_in_parExpression1702);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(146,18);
            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1704); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parExpression_StartIndex); }
        }
        dbg.location(147, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "parExpression"


    // $ANTLR start "block"
    // C:\\antlr\\TinyHaxeTry1.g:166:1: block : '{' ( blockStmt )* '}' ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(166, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:166:15: ( '{' ( blockStmt )* '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:166:17: '{' ( blockStmt )* '}'
            {
            dbg.location(166,17);
            match(input,LBRACE,FOLLOW_LBRACE_in_block1727); if (state.failed) return ;
            dbg.location(166,21);
            // C:\\antlr\\TinyHaxeTry1.g:166:21: ( blockStmt )*
            try { dbg.enterSubRule(23);

            loop23:
            do {
                int alt23=2;
                try { dbg.enterDecision(23);

                int LA23_0 = input.LA(1);

                if ( (LA23_0==IDENTIFIER||LA23_0==BREAK||LA23_0==CLASS||LA23_0==CONTINUE||LA23_0==DO||LA23_0==FOR||LA23_0==IF||LA23_0==NEW||LA23_0==PRIVATE||(LA23_0>=PUBLIC && LA23_0<=RETURN)||LA23_0==STATIC||LA23_0==SWITCH||LA23_0==THROW||LA23_0==TRY||LA23_0==WHILE||(LA23_0>=NULL && LA23_0<=LPAREN)||LA23_0==LBRACE||LA23_0==LBRACKET||LA23_0==SEMI||(LA23_0>=BANG && LA23_0<=TILDE)||(LA23_0>=PLUSPLUS && LA23_0<=SUBSUB)||LA23_0==SUB||(LA23_0>=126 && LA23_0<=128)||LA23_0==132||(LA23_0>=145 && LA23_0<=146)) ) {
                    alt23=1;
                }


                } finally {dbg.exitDecision(23);}

                switch (alt23) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:166:22: blockStmt
            	    {
            	    dbg.location(166,22);
            	    pushFollow(FOLLOW_blockStmt_in_block1730);
            	    blockStmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);
            } finally {dbg.exitSubRule(23);}

            dbg.location(166,34);
            match(input,RBRACE,FOLLOW_RBRACE_in_block1734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, block_StartIndex); }
        }
        dbg.location(167, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "blockStmt"
    // C:\\antlr\\TinyHaxeTry1.g:168:1: blockStmt : ( varDecl | classDecl | statement );
    public final void blockStmt() throws RecognitionException {
        int blockStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "blockStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(168, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:169:2: ( varDecl | classDecl | statement )
            int alt24=3;
            try { dbg.enterDecision(24);

            switch ( input.LA(1) ) {
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case 126:
            case 127:
            case 128:
            case 146:
                {
                alt24=1;
                }
                break;
            case CLASS:
                {
                alt24=2;
                }
                break;
            case IDENTIFIER:
            case BREAK:
            case CONTINUE:
            case DO:
            case FOR:
            case IF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THROW:
            case TRY:
            case WHILE:
            case NULL:
            case LPAREN:
            case LBRACE:
            case LBRACKET:
            case SEMI:
            case BANG:
            case TILDE:
            case PLUSPLUS:
            case SUBSUB:
            case SUB:
            case 132:
            case 145:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:169:4: varDecl
                    {
                    dbg.location(169,4);
                    pushFollow(FOLLOW_varDecl_in_blockStmt1744);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:170:4: classDecl
                    {
                    dbg.location(170,4);
                    pushFollow(FOLLOW_classDecl_in_blockStmt1749);
                    classDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:171:4: statement
                    {
                    dbg.location(171,4);
                    pushFollow(FOLLOW_statement_in_blockStmt1754);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, blockStmt_StartIndex); }
        }
        dbg.location(172, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "blockStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "blockStmt"


    // $ANTLR start "forStmt"
    // C:\\antlr\\TinyHaxeTry1.g:181:1: forStmt : 'for' '(' expr 'in' expr ')' statement ;
    public final void forStmt() throws RecognitionException {
        int forStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "forStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(181, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:181:19: ( 'for' '(' expr 'in' expr ')' statement )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:181:21: 'for' '(' expr 'in' expr ')' statement
            {
            dbg.location(181,21);
            match(input,FOR,FOLLOW_FOR_in_forStmt1825); if (state.failed) return ;
            dbg.location(181,27);
            match(input,LPAREN,FOLLOW_LPAREN_in_forStmt1827); if (state.failed) return ;
            dbg.location(181,31);
            pushFollow(FOLLOW_expr_in_forStmt1829);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(181,36);
            match(input,139,FOLLOW_139_in_forStmt1831); if (state.failed) return ;
            dbg.location(181,41);
            pushFollow(FOLLOW_expr_in_forStmt1833);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(181,46);
            match(input,RPAREN,FOLLOW_RPAREN_in_forStmt1835); if (state.failed) return ;
            dbg.location(181,50);
            pushFollow(FOLLOW_statement_in_forStmt1837);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, forStmt_StartIndex); }
        }
        dbg.location(182, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "forStmt"


    // $ANTLR start "breakStmt"
    // C:\\antlr\\TinyHaxeTry1.g:189:1: breakStmt : 'break' ';' ;
    public final void breakStmt() throws RecognitionException {
        int breakStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "breakStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:189:19: ( 'break' ';' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:189:21: 'break' ';'
            {
            dbg.location(189,21);
            match(input,BREAK,FOLLOW_BREAK_in_breakStmt1864); if (state.failed) return ;
            dbg.location(189,29);
            match(input,SEMI,FOLLOW_SEMI_in_breakStmt1866); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, breakStmt_StartIndex); }
        }
        dbg.location(190, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "breakStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "breakStmt"


    // $ANTLR start "continueStmt"
    // C:\\antlr\\TinyHaxeTry1.g:191:1: continueStmt : 'continue' ';' ;
    public final void continueStmt() throws RecognitionException {
        int continueStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "continueStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:191:19: ( 'continue' ';' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:191:21: 'continue' ';'
            {
            dbg.location(191,21);
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1880); if (state.failed) return ;
            dbg.location(191,32);
            match(input,SEMI,FOLLOW_SEMI_in_continueStmt1882); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, continueStmt_StartIndex); }
        }
        dbg.location(192, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "continueStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "continueStmt"


    // $ANTLR start "caseStmt"
    // C:\\antlr\\TinyHaxeTry1.g:193:1: caseStmt : 'case' exprList ':' ;
    public final void caseStmt() throws RecognitionException {
        int caseStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "caseStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:193:19: ( 'case' exprList ':' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:193:21: 'case' exprList ':'
            {
            dbg.location(193,21);
            match(input,CASE,FOLLOW_CASE_in_caseStmt1900); if (state.failed) return ;
            dbg.location(193,28);
            pushFollow(FOLLOW_exprList_in_caseStmt1902);
            exprList();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(193,37);
            match(input,COLON,FOLLOW_COLON_in_caseStmt1904); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, caseStmt_StartIndex); }
        }
        dbg.location(194, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "caseStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "caseStmt"


    // $ANTLR start "defaultStmt"
    // C:\\antlr\\TinyHaxeTry1.g:195:1: defaultStmt : 'default' ':' ;
    public final void defaultStmt() throws RecognitionException {
        int defaultStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "defaultStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(195, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:195:19: ( 'default' ':' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:195:21: 'default' ':'
            {
            dbg.location(195,21);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1919); if (state.failed) return ;
            dbg.location(195,31);
            match(input,COLON,FOLLOW_COLON_in_defaultStmt1921); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, defaultStmt_StartIndex); }
        }
        dbg.location(196, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "defaultStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "defaultStmt"


    // $ANTLR start "switchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:197:1: switchStmt : 'switch' '(' expr ')' block ;
    public final void switchStmt() throws RecognitionException {
        int switchStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "switchStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:197:19: ( 'switch' '(' expr ')' block )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:197:21: 'switch' '(' expr ')' block
            {
            dbg.location(197,21);
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt1937); if (state.failed) return ;
            dbg.location(197,30);
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt1939); if (state.failed) return ;
            dbg.location(197,34);
            pushFollow(FOLLOW_expr_in_switchStmt1941);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(197,39);
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt1943); if (state.failed) return ;
            dbg.location(197,43);
            pushFollow(FOLLOW_block_in_switchStmt1945);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, switchStmt_StartIndex); }
        }
        dbg.location(198, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "switchStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "switchStmt"


    // $ANTLR start "tryStmt"
    // C:\\antlr\\TinyHaxeTry1.g:201:1: tryStmt : 'try' block catchStmtList ;
    public final void tryStmt() throws RecognitionException {
        int tryStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "tryStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:201:19: ( 'try' block catchStmtList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:201:21: 'try' block catchStmtList
            {
            dbg.location(201,21);
            match(input,TRY,FOLLOW_TRY_in_tryStmt1966); if (state.failed) return ;
            dbg.location(201,27);
            pushFollow(FOLLOW_block_in_tryStmt1968);
            block();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(201,33);
            pushFollow(FOLLOW_catchStmtList_in_tryStmt1970);
            catchStmtList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, tryStmt_StartIndex); }
        }
        dbg.location(202, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "tryStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "tryStmt"


    // $ANTLR start "catchStmtList"
    // C:\\antlr\\TinyHaxeTry1.g:203:1: catchStmtList : catchStmt catchStmtList ;
    public final void catchStmtList() throws RecognitionException {
        int catchStmtList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "catchStmtList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(203, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:203:19: ( catchStmt catchStmtList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:203:21: catchStmt catchStmtList
            {
            dbg.location(203,21);
            pushFollow(FOLLOW_catchStmt_in_catchStmtList1983);
            catchStmt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(203,31);
            pushFollow(FOLLOW_catchStmtList_in_catchStmtList1985);
            catchStmtList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, catchStmtList_StartIndex); }
        }
        dbg.location(205, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "catchStmtList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "catchStmtList"


    // $ANTLR start "catchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:206:1: catchStmt : 'catch' '(' param ')' block ;
    public final void catchStmt() throws RecognitionException {
        int catchStmt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "catchStmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:206:19: ( 'catch' '(' param ')' block )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:206:21: 'catch' '(' param ')' block
            {
            dbg.location(206,21);
            match(input,CATCH,FOLLOW_CATCH_in_catchStmt2012); if (state.failed) return ;
            dbg.location(206,29);
            match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2014); if (state.failed) return ;
            dbg.location(206,33);
            pushFollow(FOLLOW_param_in_catchStmt2016);
            param();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(206,39);
            match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2018); if (state.failed) return ;
            dbg.location(206,43);
            pushFollow(FOLLOW_block_in_catchStmt2020);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, catchStmt_StartIndex); }
        }
        dbg.location(207, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "catchStmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "catchStmt"


    // $ANTLR start "exprListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:210:1: exprListOpt : exprList ;
    public final void exprListOpt() throws RecognitionException {
        int exprListOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "exprListOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:210:19: ( exprList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:210:21: exprList
            {
            dbg.location(210,21);
            pushFollow(FOLLOW_exprList_in_exprListOpt2037);
            exprList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, exprListOpt_StartIndex); }
        }
        dbg.location(212, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprListOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprListOpt"


    // $ANTLR start "exprList"
    // C:\\antlr\\TinyHaxeTry1.g:213:1: exprList : ( expr ) ( ',' expr )* ;
    public final void exprList() throws RecognitionException {
        int exprList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "exprList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:213:19: ( ( expr ) ( ',' expr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:213:21: ( expr ) ( ',' expr )*
            {
            dbg.location(213,21);
            // C:\\antlr\\TinyHaxeTry1.g:213:21: ( expr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:213:22: expr
            {
            dbg.location(213,22);
            pushFollow(FOLLOW_expr_in_exprList2059);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(213,28);
            // C:\\antlr\\TinyHaxeTry1.g:213:28: ( ',' expr )*
            try { dbg.enterSubRule(25);

            loop25:
            do {
                int alt25=2;
                try { dbg.enterDecision(25);

                int LA25_0 = input.LA(1);

                if ( (LA25_0==COMMA) ) {
                    alt25=1;
                }


                } finally {dbg.exitDecision(25);}

                switch (alt25) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:213:29: ',' expr
            	    {
            	    dbg.location(213,29);
            	    match(input,COMMA,FOLLOW_COMMA_in_exprList2063); if (state.failed) return ;
            	    dbg.location(213,33);
            	    pushFollow(FOLLOW_expr_in_exprList2065);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);
            } finally {dbg.exitSubRule(25);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, exprList_StartIndex); }
        }
        dbg.location(214, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exprList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "expr"
    // C:\\antlr\\TinyHaxeTry1.g:215:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:215:19: ( assignExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:215:21: assignExpr
            {
            dbg.location(215,21);
            pushFollow(FOLLOW_assignExpr_in_expr2089);
            assignExpr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, expr_StartIndex); }
        }
        dbg.location(216, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "assignExpr"
    // C:\\antlr\\TinyHaxeTry1.g:217:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "assignExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(217, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:217:19: ( iterExpr ( assignOp iterExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:217:21: iterExpr ( assignOp iterExpr )*
            {
            dbg.location(217,21);
            pushFollow(FOLLOW_iterExpr_in_assignExpr2105);
            iterExpr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(217,30);
            // C:\\antlr\\TinyHaxeTry1.g:217:30: ( assignOp iterExpr )*
            try { dbg.enterSubRule(26);

            loop26:
            do {
                int alt26=2;
                try { dbg.enterDecision(26);

                int LA26_0 = input.LA(1);

                if ( (LA26_0==EQ||(LA26_0>=PLUSEQ && LA26_0<=PERCENTEQ)||(LA26_0>=129 && LA26_0<=131)) ) {
                    alt26=1;
                }


                } finally {dbg.exitDecision(26);}

                switch (alt26) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:217:31: assignOp iterExpr
            	    {
            	    dbg.location(217,31);
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2108);
            	    assignOp();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(217,40);
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2110);
            	    iterExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);
            } finally {dbg.exitSubRule(26);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, assignExpr_StartIndex); }
        }
        dbg.location(218, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assignExpr"


    // $ANTLR start "iterExpr"
    // C:\\antlr\\TinyHaxeTry1.g:219:1: iterExpr : ternaryExpr ( '...' ternaryExpr )? ;
    public final void iterExpr() throws RecognitionException {
        int iterExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "iterExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(219, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:219:19: ( ternaryExpr ( '...' ternaryExpr )? )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:219:21: ternaryExpr ( '...' ternaryExpr )?
            {
            dbg.location(219,21);
            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2130);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(219,33);
            // C:\\antlr\\TinyHaxeTry1.g:219:33: ( '...' ternaryExpr )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==ELLIPSIS) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:219:34: '...' ternaryExpr
                    {
                    dbg.location(219,34);
                    match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2133); if (state.failed) return ;
                    dbg.location(219,40);
                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2135);
                    ternaryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, iterExpr_StartIndex); }
        }
        dbg.location(220, 8);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "iterExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "iterExpr"


    // $ANTLR start "ternaryExpr"
    // C:\\antlr\\TinyHaxeTry1.g:221:1: ternaryExpr : logicOrExpr ( '?' expr ':' logicOrExpr )* ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "ternaryExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(221, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:221:19: ( logicOrExpr ( '?' expr ':' logicOrExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:221:21: logicOrExpr ( '?' expr ':' logicOrExpr )*
            {
            dbg.location(221,21);
            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2158);
            logicOrExpr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(221,33);
            // C:\\antlr\\TinyHaxeTry1.g:221:33: ( '?' expr ':' logicOrExpr )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==QUES) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:221:34: '?' expr ':' logicOrExpr
            	    {
            	    dbg.location(221,34);
            	    match(input,QUES,FOLLOW_QUES_in_ternaryExpr2161); if (state.failed) return ;
            	    dbg.location(221,38);
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2163);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(221,43);
            	    match(input,COLON,FOLLOW_COLON_in_ternaryExpr2165); if (state.failed) return ;
            	    dbg.location(221,47);
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2167);
            	    logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ternaryExpr_StartIndex); }
        }
        dbg.location(227, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ternaryExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ternaryExpr"


    // $ANTLR start "logicOrExpr"
    // C:\\antlr\\TinyHaxeTry1.g:228:1: logicOrExpr : ( logicAndExpr ) ( '||' logicAndExpr )* ;
    public final void logicOrExpr() throws RecognitionException {
        int logicOrExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "logicOrExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:228:19: ( ( logicAndExpr ) ( '||' logicAndExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:228:21: ( logicAndExpr ) ( '||' logicAndExpr )*
            {
            dbg.location(228,21);
            // C:\\antlr\\TinyHaxeTry1.g:228:21: ( logicAndExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:228:22: logicAndExpr
            {
            dbg.location(228,22);
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2201);
            logicAndExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(228,36);
            // C:\\antlr\\TinyHaxeTry1.g:228:36: ( '||' logicAndExpr )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==BARBAR) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:228:37: '||' logicAndExpr
            	    {
            	    dbg.location(228,37);
            	    match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2205); if (state.failed) return ;
            	    dbg.location(228,42);
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2207);
            	    logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, logicOrExpr_StartIndex); }
        }
        dbg.location(229, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicOrExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logicOrExpr"


    // $ANTLR start "logicAndExpr"
    // C:\\antlr\\TinyHaxeTry1.g:230:1: logicAndExpr : ( cmpExpr ) ( '&&' cmpExpr )* ;
    public final void logicAndExpr() throws RecognitionException {
        int logicAndExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "logicAndExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(230, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:230:19: ( ( cmpExpr ) ( '&&' cmpExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:230:21: ( cmpExpr ) ( '&&' cmpExpr )*
            {
            dbg.location(230,21);
            // C:\\antlr\\TinyHaxeTry1.g:230:21: ( cmpExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:230:22: cmpExpr
            {
            dbg.location(230,22);
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2224);
            cmpExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(230,31);
            // C:\\antlr\\TinyHaxeTry1.g:230:31: ( '&&' cmpExpr )*
            try { dbg.enterSubRule(30);

            loop30:
            do {
                int alt30=2;
                try { dbg.enterDecision(30);

                int LA30_0 = input.LA(1);

                if ( (LA30_0==AMPAMP) ) {
                    alt30=1;
                }


                } finally {dbg.exitDecision(30);}

                switch (alt30) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:230:32: '&&' cmpExpr
            	    {
            	    dbg.location(230,32);
            	    match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2228); if (state.failed) return ;
            	    dbg.location(230,37);
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2230);
            	    cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);
            } finally {dbg.exitSubRule(30);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, logicAndExpr_StartIndex); }
        }
        dbg.location(231, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "logicAndExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "logicAndExpr"


    // $ANTLR start "cmpExpr"
    // C:\\antlr\\TinyHaxeTry1.g:232:1: cmpExpr : ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )* ;
    public final void cmpExpr() throws RecognitionException {
        int cmpExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "cmpExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(232, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:232:19: ( ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:232:21: ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )*
            {
            dbg.location(232,21);
            // C:\\antlr\\TinyHaxeTry1.g:232:21: ( bitExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:232:22: bitExpr
            {
            dbg.location(232,22);
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2252);
            bitExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(232,31);
            // C:\\antlr\\TinyHaxeTry1.g:232:31: ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )*
            try { dbg.enterSubRule(31);

            loop31:
            do {
                int alt31=7;
                try { dbg.enterDecision(31);

                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    alt31=1;
                    }
                    break;
                case BANGEQ:
                    {
                    alt31=2;
                    }
                    break;
                case 140:
                    {
                    alt31=3;
                    }
                    break;
                case 141:
                    {
                    alt31=4;
                    }
                    break;
                case GT:
                    {
                    alt31=5;
                    }
                    break;
                case LT:
                    {
                    alt31=6;
                    }
                    break;

                }

                } finally {dbg.exitDecision(31);}

                switch (alt31) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:32: '==' bitExpr
            	    {
            	    dbg.location(232,32);
            	    match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2256); if (state.failed) return ;
            	    dbg.location(232,37);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2258);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:47: '!=' bitExpr
            	    {
            	    dbg.location(232,47);
            	    match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2262); if (state.failed) return ;
            	    dbg.location(232,52);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2264);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:62: '>=' bitExpr
            	    {
            	    dbg.location(232,62);
            	    match(input,140,FOLLOW_140_in_cmpExpr2268); if (state.failed) return ;
            	    dbg.location(232,67);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2270);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:77: '<=' bitExpr
            	    {
            	    dbg.location(232,77);
            	    match(input,141,FOLLOW_141_in_cmpExpr2274); if (state.failed) return ;
            	    dbg.location(232,82);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2276);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:92: '>' bitExpr
            	    {
            	    dbg.location(232,92);
            	    match(input,GT,FOLLOW_GT_in_cmpExpr2280); if (state.failed) return ;
            	    dbg.location(232,97);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2283);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    dbg.enterAlt(6);

            	    // C:\\antlr\\TinyHaxeTry1.g:232:107: '<' bitExpr
            	    {
            	    dbg.location(232,107);
            	    match(input,LT,FOLLOW_LT_in_cmpExpr2287); if (state.failed) return ;
            	    dbg.location(232,112);
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2290);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);
            } finally {dbg.exitSubRule(31);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, cmpExpr_StartIndex); }
        }
        dbg.location(233, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cmpExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cmpExpr"


    // $ANTLR start "bitExpr"
    // C:\\antlr\\TinyHaxeTry1.g:234:1: bitExpr : ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )* ;
    public final void bitExpr() throws RecognitionException {
        int bitExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "bitExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:234:19: ( ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:234:21: ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )*
            {
            dbg.location(234,21);
            // C:\\antlr\\TinyHaxeTry1.g:234:21: ( shiftExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:234:22: shiftExpr
            {
            dbg.location(234,22);
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2312);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(234,33);
            // C:\\antlr\\TinyHaxeTry1.g:234:33: ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=4;
                try { dbg.enterDecision(32);

                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt32=1;
                    }
                    break;
                case AMP:
                    {
                    alt32=2;
                    }
                    break;
                case CARET:
                    {
                    alt32=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:234:34: '|' shiftExpr
            	    {
            	    dbg.location(234,34);
            	    match(input,BAR,FOLLOW_BAR_in_bitExpr2316); if (state.failed) return ;
            	    dbg.location(234,38);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2318);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:234:50: '&' shiftExpr
            	    {
            	    dbg.location(234,50);
            	    match(input,AMP,FOLLOW_AMP_in_bitExpr2322); if (state.failed) return ;
            	    dbg.location(234,54);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2324);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\antlr\\TinyHaxeTry1.g:234:66: '^' shiftExpr
            	    {
            	    dbg.location(234,66);
            	    match(input,CARET,FOLLOW_CARET_in_bitExpr2328); if (state.failed) return ;
            	    dbg.location(234,70);
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2330);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, bitExpr_StartIndex); }
        }
        dbg.location(235, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "bitExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "bitExpr"


    // $ANTLR start "shiftExpr"
    // C:\\antlr\\TinyHaxeTry1.g:236:1: shiftExpr : ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "shiftExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:236:19: ( ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:236:21: ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )*
            {
            dbg.location(236,21);
            // C:\\antlr\\TinyHaxeTry1.g:236:21: ( addExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:236:22: addExpr
            {
            dbg.location(236,22);
            pushFollow(FOLLOW_addExpr_in_shiftExpr2350);
            addExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(236,31);
            // C:\\antlr\\TinyHaxeTry1.g:236:31: ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )*
            try { dbg.enterSubRule(33);

            loop33:
            do {
                int alt33=4;
                try { dbg.enterDecision(33);

                switch ( input.LA(1) ) {
                case 142:
                    {
                    alt33=1;
                    }
                    break;
                case 143:
                    {
                    alt33=2;
                    }
                    break;
                case 144:
                    {
                    alt33=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(33);}

                switch (alt33) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:236:32: '<<' addExpr
            	    {
            	    dbg.location(236,32);
            	    match(input,142,FOLLOW_142_in_shiftExpr2354); if (state.failed) return ;
            	    dbg.location(236,38);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2357);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:236:48: '>>' addExpr
            	    {
            	    dbg.location(236,48);
            	    match(input,143,FOLLOW_143_in_shiftExpr2361); if (state.failed) return ;
            	    dbg.location(236,54);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2364);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\antlr\\TinyHaxeTry1.g:236:64: '>>>' addExpr
            	    {
            	    dbg.location(236,64);
            	    match(input,144,FOLLOW_144_in_shiftExpr2368); if (state.failed) return ;
            	    dbg.location(236,70);
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2370);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);
            } finally {dbg.exitSubRule(33);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, shiftExpr_StartIndex); }
        }
        dbg.location(237, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "shiftExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "shiftExpr"


    // $ANTLR start "addExpr"
    // C:\\antlr\\TinyHaxeTry1.g:262:1: addExpr : ( multExpr ) ( '+' multExpr | '-' multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "addExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(262, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:262:19: ( ( multExpr ) ( '+' multExpr | '-' multExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:262:21: ( multExpr ) ( '+' multExpr | '-' multExpr )*
            {
            dbg.location(262,21);
            // C:\\antlr\\TinyHaxeTry1.g:262:21: ( multExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:262:22: multExpr
            {
            dbg.location(262,22);
            pushFollow(FOLLOW_multExpr_in_addExpr2395);
            multExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(262,32);
            // C:\\antlr\\TinyHaxeTry1.g:262:32: ( '+' multExpr | '-' multExpr )*
            try { dbg.enterSubRule(34);

            loop34:
            do {
                int alt34=3;
                try { dbg.enterDecision(34);

                int LA34_0 = input.LA(1);

                if ( (LA34_0==PLUS) ) {
                    alt34=1;
                }
                else if ( (LA34_0==SUB) ) {
                    alt34=2;
                }


                } finally {dbg.exitDecision(34);}

                switch (alt34) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:262:33: '+' multExpr
            	    {
            	    dbg.location(262,33);
            	    match(input,PLUS,FOLLOW_PLUS_in_addExpr2399); if (state.failed) return ;
            	    dbg.location(262,37);
            	    pushFollow(FOLLOW_multExpr_in_addExpr2401);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:262:48: '-' multExpr
            	    {
            	    dbg.location(262,48);
            	    match(input,SUB,FOLLOW_SUB_in_addExpr2405); if (state.failed) return ;
            	    dbg.location(262,52);
            	    pushFollow(FOLLOW_multExpr_in_addExpr2407);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);
            } finally {dbg.exitSubRule(34);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, addExpr_StartIndex); }
        }
        dbg.location(263, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "addExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "addExpr"


    // $ANTLR start "multExpr"
    // C:\\antlr\\TinyHaxeTry1.g:264:1: multExpr : ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "multExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:264:19: ( ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:264:21: ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )*
            {
            dbg.location(264,21);
            // C:\\antlr\\TinyHaxeTry1.g:264:21: ( prefixExpr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:264:22: prefixExpr
            {
            dbg.location(264,22);
            pushFollow(FOLLOW_prefixExpr_in_multExpr2428);
            prefixExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(264,34);
            // C:\\antlr\\TinyHaxeTry1.g:264:34: ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )*
            try { dbg.enterSubRule(35);

            loop35:
            do {
                int alt35=4;
                try { dbg.enterDecision(35);

                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt35=1;
                    }
                    break;
                case SLASH:
                    {
                    alt35=2;
                    }
                    break;
                case PERCENT:
                    {
                    alt35=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(35);}

                switch (alt35) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:264:35: '*' prefixExpr
            	    {
            	    dbg.location(264,35);
            	    match(input,STAR,FOLLOW_STAR_in_multExpr2432); if (state.failed) return ;
            	    dbg.location(264,39);
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2434);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:264:52: '/' prefixExpr
            	    {
            	    dbg.location(264,52);
            	    match(input,SLASH,FOLLOW_SLASH_in_multExpr2438); if (state.failed) return ;
            	    dbg.location(264,56);
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2440);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\antlr\\TinyHaxeTry1.g:264:69: '%' prefixExpr
            	    {
            	    dbg.location(264,69);
            	    match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2444); if (state.failed) return ;
            	    dbg.location(264,73);
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2446);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);
            } finally {dbg.exitSubRule(35);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, multExpr_StartIndex); }
        }
        dbg.location(265, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "multExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "multExpr"


    // $ANTLR start "prefixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:266:1: prefixExpr : ( ( '-' | '--' | '++' | '!' | '~' ) prefixExpr | newExpr | cast | suffixExpr );
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "prefixExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(266, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:266:19: ( ( '-' | '--' | '++' | '!' | '~' ) prefixExpr | newExpr | cast | suffixExpr )
            int alt36=4;
            try { dbg.enterDecision(36);

            switch ( input.LA(1) ) {
            case BANG:
            case TILDE:
            case PLUSPLUS:
            case SUBSUB:
            case SUB:
                {
                alt36=1;
                }
                break;
            case NEW:
                {
                alt36=2;
                }
                break;
            case 145:
                {
                alt36=3;
                }
                break;
            case IDENTIFIER:
            case NULL:
            case LPAREN:
            case LBRACE:
            case LBRACKET:
            case 132:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:266:21: ( '-' | '--' | '++' | '!' | '~' ) prefixExpr
                    {
                    dbg.location(266,21);
                    if ( (input.LA(1)>=BANG && input.LA(1)<=TILDE)||(input.LA(1)>=PLUSPLUS && input.LA(1)<=SUBSUB)||input.LA(1)==SUB ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(266,45);
                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2476);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:267:25: newExpr
                    {
                    dbg.location(267,25);
                    pushFollow(FOLLOW_newExpr_in_prefixExpr2502);
                    newExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:268:25: cast
                    {
                    dbg.location(268,25);
                    pushFollow(FOLLOW_cast_in_prefixExpr2528);
                    cast();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:269:25: suffixExpr
                    {
                    dbg.location(269,25);
                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2554);
                    suffixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, prefixExpr_StartIndex); }
        }
        dbg.location(270, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prefixExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "prefixExpr"


    // $ANTLR start "suffixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:271:1: suffixExpr : ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )* ;
    public final void suffixExpr() throws RecognitionException {
        int suffixExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "suffixExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(271, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:271:19: ( ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:271:21: ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )*
            {
            dbg.location(271,21);
            // C:\\antlr\\TinyHaxeTry1.g:271:21: ( value )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:271:22: value
            {
            dbg.location(271,22);
            pushFollow(FOLLOW_value_in_suffixExpr2572);
            value();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(271,29);
            // C:\\antlr\\TinyHaxeTry1.g:271:29: ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )*
            try { dbg.enterSubRule(37);

            loop37:
            do {
                int alt37=6;
                try { dbg.enterDecision(37);

                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt37=1;
                    }
                    break;
                case DOT:
                    {
                    alt37=2;
                    }
                    break;
                case LBRACKET:
                    {
                    alt37=3;
                    }
                    break;
                case PLUSPLUS:
                    {
                    alt37=4;
                    }
                    break;
                case SUBSUB:
                    {
                    alt37=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(37);}

                switch (alt37) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:271:30: '(' exprListOpt ')'
            	    {
            	    dbg.location(271,30);
            	    match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2576); if (state.failed) return ;
            	    dbg.location(271,34);
            	    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2578);
            	    exprListOpt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(271,46);
            	    match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2580); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\antlr\\TinyHaxeTry1.g:271:52: '.' IDENTIFIER
            	    {
            	    dbg.location(271,52);
            	    match(input,DOT,FOLLOW_DOT_in_suffixExpr2584); if (state.failed) return ;
            	    dbg.location(271,55);
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_suffixExpr2585); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // C:\\antlr\\TinyHaxeTry1.g:271:68: '[' expr ']'
            	    {
            	    dbg.location(271,68);
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2589); if (state.failed) return ;
            	    dbg.location(271,72);
            	    pushFollow(FOLLOW_expr_in_suffixExpr2591);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(271,77);
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2593); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // C:\\antlr\\TinyHaxeTry1.g:271:83: '++'
            	    {
            	    dbg.location(271,83);
            	    match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2597); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // C:\\antlr\\TinyHaxeTry1.g:271:90: '--'
            	    {
            	    dbg.location(271,90);
            	    match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2601); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);
            } finally {dbg.exitSubRule(37);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, suffixExpr_StartIndex); }
        }
        dbg.location(272, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "suffixExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "suffixExpr"


    // $ANTLR start "value"
    // C:\\antlr\\TinyHaxeTry1.g:273:1: value : ( funcLit | arrayLit | objLit | 'null' | IDENTIFIER | '(' ( expr | statement ) ')' );
    public final void value() throws RecognitionException {
        int value_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(273, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:273:14: ( funcLit | arrayLit | objLit | 'null' | IDENTIFIER | '(' ( expr | statement ) ')' )
            int alt39=6;
            try { dbg.enterDecision(39);

            switch ( input.LA(1) ) {
            case 132:
                {
                alt39=1;
                }
                break;
            case LBRACKET:
                {
                alt39=2;
                }
                break;
            case LBRACE:
                {
                alt39=3;
                }
                break;
            case NULL:
                {
                alt39=4;
                }
                break;
            case IDENTIFIER:
                {
                alt39=5;
                }
                break;
            case LPAREN:
                {
                alt39=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(39);}

            switch (alt39) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:278:24: funcLit
                    {
                    dbg.location(278,24);
                    pushFollow(FOLLOW_funcLit_in_value2643);
                    funcLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:279:25: arrayLit
                    {
                    dbg.location(279,25);
                    pushFollow(FOLLOW_arrayLit_in_value2670);
                    arrayLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:280:25: objLit
                    {
                    dbg.location(280,25);
                    pushFollow(FOLLOW_objLit_in_value2696);
                    objLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:281:25: 'null'
                    {
                    dbg.location(281,25);
                    match(input,NULL,FOLLOW_NULL_in_value2722); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\antlr\\TinyHaxeTry1.g:282:24: IDENTIFIER
                    {
                    dbg.location(282,24);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value2747); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\antlr\\TinyHaxeTry1.g:284:25: '(' ( expr | statement ) ')'
                    {
                    dbg.location(284,25);
                    match(input,LPAREN,FOLLOW_LPAREN_in_value2782); if (state.failed) return ;
                    dbg.location(284,29);
                    // C:\\antlr\\TinyHaxeTry1.g:284:29: ( expr | statement )
                    int alt38=2;
                    try { dbg.enterSubRule(38);
                    try { dbg.enterDecision(38);

                    try {
                        isCyclicDecision = true;
                        alt38 = dfa38.predict(input);
                    }
                    catch (NoViableAltException nvae) {
                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(38);}

                    switch (alt38) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:284:30: expr
                            {
                            dbg.location(284,30);
                            pushFollow(FOLLOW_expr_in_value2785);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\antlr\\TinyHaxeTry1.g:284:35: statement
                            {
                            dbg.location(284,35);
                            pushFollow(FOLLOW_statement_in_value2787);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(38);}

                    dbg.location(284,46);
                    match(input,RPAREN,FOLLOW_RPAREN_in_value2790); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, value_StartIndex); }
        }
        dbg.location(286, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value"


    // $ANTLR start "newExpr"
    // C:\\antlr\\TinyHaxeTry1.g:287:1: newExpr : 'new' type '(' exprListOpt ')' ;
    public final void newExpr() throws RecognitionException {
        int newExpr_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "newExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(287, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:287:19: ( 'new' type '(' exprListOpt ')' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:287:21: 'new' type '(' exprListOpt ')'
            {
            dbg.location(287,21);
            match(input,NEW,FOLLOW_NEW_in_newExpr2825); if (state.failed) return ;
            dbg.location(287,27);
            pushFollow(FOLLOW_type_in_newExpr2827);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(287,32);
            match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2829); if (state.failed) return ;
            dbg.location(287,36);
            pushFollow(FOLLOW_exprListOpt_in_newExpr2831);
            exprListOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(287,48);
            match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2833); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, newExpr_StartIndex); }
        }
        dbg.location(288, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "newExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "newExpr"


    // $ANTLR start "cast"
    // C:\\antlr\\TinyHaxeTry1.g:289:1: cast : 'cast' '(' expr ( ',' funcType )? ')' ;
    public final void cast() throws RecognitionException {
        int cast_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "cast");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(289, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:289:19: ( 'cast' '(' expr ( ',' funcType )? ')' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:289:21: 'cast' '(' expr ( ',' funcType )? ')'
            {
            dbg.location(289,21);
            match(input,145,FOLLOW_145_in_cast2855); if (state.failed) return ;
            dbg.location(289,28);
            match(input,LPAREN,FOLLOW_LPAREN_in_cast2857); if (state.failed) return ;
            dbg.location(289,32);
            pushFollow(FOLLOW_expr_in_cast2859);
            expr();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(289,37);
            // C:\\antlr\\TinyHaxeTry1.g:289:37: ( ',' funcType )?
            int alt40=2;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==COMMA) ) {
                alt40=1;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:289:38: ',' funcType
                    {
                    dbg.location(289,38);
                    match(input,COMMA,FOLLOW_COMMA_in_cast2862); if (state.failed) return ;
                    dbg.location(289,42);
                    pushFollow(FOLLOW_funcType_in_cast2864);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(289,53);
            match(input,RPAREN,FOLLOW_RPAREN_in_cast2868); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, cast_StartIndex); }
        }
        dbg.location(291, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cast");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cast"


    // $ANTLR start "topLevelDecl"
    // C:\\antlr\\TinyHaxeTry1.g:294:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final void topLevelDecl() throws RecognitionException {
        int topLevelDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "topLevelDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:294:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt41=4;
            try { dbg.enterDecision(41);

            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt41=1;
                }
                break;
            case INTERFACE:
                {
                alt41=2;
                }
                break;
            case ENUM:
                {
                alt41=3;
                }
                break;
            case 147:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:294:21: classDecl
                    {
                    dbg.location(294,21);
                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2885);
                    classDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:295:25: interfaceDecl
                    {
                    dbg.location(295,25);
                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2911);
                    interfaceDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:296:25: enumDecl
                    {
                    dbg.location(296,25);
                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl2937);
                    enumDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:297:25: typedefDecl
                    {
                    dbg.location(297,25);
                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2963);
                    typedefDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, topLevelDecl_StartIndex); }
        }
        dbg.location(298, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "topLevelDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "topLevelDecl"


    // $ANTLR start "enumDecl"
    // C:\\antlr\\TinyHaxeTry1.g:299:1: enumDecl : 'enum' IDENTIFIER typeParamOpt '{' enumBody '}' ;
    public final void enumDecl() throws RecognitionException {
        int enumDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "enumDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(299, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:299:19: ( 'enum' IDENTIFIER typeParamOpt '{' enumBody '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:299:21: 'enum' IDENTIFIER typeParamOpt '{' enumBody '}'
            {
            dbg.location(299,21);
            match(input,ENUM,FOLLOW_ENUM_in_enumDecl2981); if (state.failed) return ;
            dbg.location(299,27);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl2982); if (state.failed) return ;
            dbg.location(299,38);
            pushFollow(FOLLOW_typeParamOpt_in_enumDecl2984);
            typeParamOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(299,51);
            match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl2986); if (state.failed) return ;
            dbg.location(299,55);
            pushFollow(FOLLOW_enumBody_in_enumDecl2988);
            enumBody();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(299,64);
            match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl2990); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, enumDecl_StartIndex); }
        }
        dbg.location(300, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "enumDecl"


    // $ANTLR start "enumBody"
    // C:\\antlr\\TinyHaxeTry1.g:301:1: enumBody : ( enumValueDecl )+ ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "enumBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(301, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:301:19: ( ( enumValueDecl )+ )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:301:21: ( enumValueDecl )+
            {
            dbg.location(301,21);
            // C:\\antlr\\TinyHaxeTry1.g:301:21: ( enumValueDecl )+
            int cnt42=0;
            try { dbg.enterSubRule(42);

            loop42:
            do {
                int alt42=2;
                try { dbg.enterDecision(42);

                int LA42_0 = input.LA(1);

                if ( (LA42_0==IDENTIFIER||(LA42_0>=133 && LA42_0<=137)) ) {
                    alt42=1;
                }


                } finally {dbg.exitDecision(42);}

                switch (alt42) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:301:22: enumValueDecl
            	    {
            	    dbg.location(301,22);
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3009);
            	    enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt42++;
            } while (true);
            } finally {dbg.exitSubRule(42);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, enumBody_StartIndex); }
        }
        dbg.location(302, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "enumBody"


    // $ANTLR start "enumValueDecl"
    // C:\\antlr\\TinyHaxeTry1.g:303:1: enumValueDecl : ( IDENTIFIER '(' paramListOpt ')' ';' | IDENTIFIER ';' | pp );
    public final void enumValueDecl() throws RecognitionException {
        int enumValueDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "enumValueDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(303, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:303:19: ( IDENTIFIER '(' paramListOpt ')' ';' | IDENTIFIER ';' | pp )
            int alt43=3;
            try { dbg.enterDecision(43);

            int LA43_0 = input.LA(1);

            if ( (LA43_0==IDENTIFIER) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==LPAREN) ) {
                    alt43=1;
                }
                else if ( (LA43_1==SEMI) ) {
                    alt43=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( ((LA43_0>=133 && LA43_0<=137)) ) {
                alt43=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(43);}

            switch (alt43) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:303:20: IDENTIFIER '(' paramListOpt ')' ';'
                    {
                    dbg.location(303,20);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3023); if (state.failed) return ;
                    dbg.location(303,31);
                    match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3025); if (state.failed) return ;
                    dbg.location(303,35);
                    pushFollow(FOLLOW_paramListOpt_in_enumValueDecl3027);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(303,48);
                    match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3029); if (state.failed) return ;
                    dbg.location(303,52);
                    match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3031); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:304:24: IDENTIFIER ';'
                    {
                    dbg.location(304,24);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3056); if (state.failed) return ;
                    dbg.location(304,35);
                    match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3058); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:305:25: pp
                    {
                    dbg.location(305,25);
                    pushFollow(FOLLOW_pp_in_enumValueDecl3084);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, enumValueDecl_StartIndex); }
        }
        dbg.location(306, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "enumValueDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "enumValueDecl"


    // $ANTLR start "varDeclList"
    // C:\\antlr\\TinyHaxeTry1.g:307:1: varDeclList : varDecl varDeclList ;
    public final void varDeclList() throws RecognitionException {
        int varDeclList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varDeclList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(307, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:307:19: ( varDecl varDeclList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:307:21: varDecl varDeclList
            {
            dbg.location(307,21);
            pushFollow(FOLLOW_varDecl_in_varDeclList3099);
            varDecl();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(307,29);
            pushFollow(FOLLOW_varDeclList_in_varDeclList3101);
            varDeclList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, varDeclList_StartIndex); }
        }
        dbg.location(308, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varDeclList"


    // $ANTLR start "varDecl"
    // C:\\antlr\\TinyHaxeTry1.g:309:1: varDecl : ( declAttrList 'var' varDeclPartList ';' | 'var' varDeclPartList ';' );
    public final void varDecl() throws RecognitionException {
        int varDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(309, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:309:19: ( declAttrList 'var' varDeclPartList ';' | 'var' varDeclPartList ';' )
            int alt44=2;
            try { dbg.enterDecision(44);

            int LA44_0 = input.LA(1);

            if ( (LA44_0==PRIVATE||LA44_0==PUBLIC||LA44_0==STATIC||(LA44_0>=126 && LA44_0<=128)) ) {
                alt44=1;
            }
            else if ( (LA44_0==146) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:309:21: declAttrList 'var' varDeclPartList ';'
                    {
                    dbg.location(309,21);
                    pushFollow(FOLLOW_declAttrList_in_varDecl3120);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(309,34);
                    match(input,146,FOLLOW_146_in_varDecl3122); if (state.failed) return ;
                    dbg.location(309,40);
                    pushFollow(FOLLOW_varDeclPartList_in_varDecl3124);
                    varDeclPartList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(309,56);
                    match(input,SEMI,FOLLOW_SEMI_in_varDecl3126); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:310:25: 'var' varDeclPartList ';'
                    {
                    dbg.location(310,25);
                    match(input,146,FOLLOW_146_in_varDecl3152); if (state.failed) return ;
                    dbg.location(310,31);
                    pushFollow(FOLLOW_varDeclPartList_in_varDecl3154);
                    varDeclPartList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(310,47);
                    match(input,SEMI,FOLLOW_SEMI_in_varDecl3156); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, varDecl_StartIndex); }
        }
        dbg.location(311, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varDecl"


    // $ANTLR start "varDeclPartList"
    // C:\\antlr\\TinyHaxeTry1.g:312:1: varDeclPartList : ( varDeclPart ) ( ',' varDeclPart )* ;
    public final void varDeclPartList() throws RecognitionException {
        int varDeclPartList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varDeclPartList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(312, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:312:19: ( ( varDeclPart ) ( ',' varDeclPart )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:312:21: ( varDeclPart ) ( ',' varDeclPart )*
            {
            dbg.location(312,21);
            // C:\\antlr\\TinyHaxeTry1.g:312:21: ( varDeclPart )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:312:22: varDeclPart
            {
            dbg.location(312,22);
            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3168);
            varDeclPart();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(312,35);
            // C:\\antlr\\TinyHaxeTry1.g:312:35: ( ',' varDeclPart )*
            try { dbg.enterSubRule(45);

            loop45:
            do {
                int alt45=2;
                try { dbg.enterDecision(45);

                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                } finally {dbg.exitDecision(45);}

                switch (alt45) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:312:36: ',' varDeclPart
            	    {
            	    dbg.location(312,36);
            	    match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3172); if (state.failed) return ;
            	    dbg.location(312,40);
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3174);
            	    varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);
            } finally {dbg.exitSubRule(45);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, varDeclPartList_StartIndex); }
        }
        dbg.location(313, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclPartList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varDeclPartList"


    // $ANTLR start "varDeclPart"
    // C:\\antlr\\TinyHaxeTry1.g:314:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInitOpt ;
    public final void varDeclPart() throws RecognitionException {
        int varDeclPart_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varDeclPart");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(314, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:314:19: ( IDENTIFIER propDeclOpt typeTagOpt varInitOpt )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:314:20: IDENTIFIER propDeclOpt typeTagOpt varInitOpt
            {
            dbg.location(314,20);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3190); if (state.failed) return ;
            dbg.location(314,31);
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3192);
            propDeclOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(314,43);
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3194);
            typeTagOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(314,54);
            pushFollow(FOLLOW_varInitOpt_in_varDeclPart3196);
            varInitOpt();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, varDeclPart_StartIndex); }
        }
        dbg.location(315, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclPart");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varDeclPart"


    // $ANTLR start "propDecl"
    // C:\\antlr\\TinyHaxeTry1.g:316:1: propDecl : '(' propAccessor ',' propAccessor ')' ;
    public final void propDecl() throws RecognitionException {
        int propDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "propDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(316, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:316:19: ( '(' propAccessor ',' propAccessor ')' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:316:21: '(' propAccessor ',' propAccessor ')'
            {
            dbg.location(316,21);
            match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3214); if (state.failed) return ;
            dbg.location(316,25);
            pushFollow(FOLLOW_propAccessor_in_propDecl3216);
            propAccessor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(316,38);
            match(input,COMMA,FOLLOW_COMMA_in_propDecl3218); if (state.failed) return ;
            dbg.location(316,42);
            pushFollow(FOLLOW_propAccessor_in_propDecl3220);
            propAccessor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(316,55);
            match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3222); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, propDecl_StartIndex); }
        }
        dbg.location(317, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "propDecl"


    // $ANTLR start "propAccessor"
    // C:\\antlr\\TinyHaxeTry1.g:318:1: propAccessor : ( IDENTIFIER | 'null' | 'default' | 'dynamic' );
    public final void propAccessor() throws RecognitionException {
        int propAccessor_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "propAccessor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(318, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:318:19: ( IDENTIFIER | 'null' | 'default' | 'dynamic' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:
            {
            dbg.location(318,19);
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DEFAULT||input.LA(1)==NULL||input.LA(1)==127 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, propAccessor_StartIndex); }
        }
        dbg.location(322, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propAccessor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "propAccessor"


    // $ANTLR start "propDeclOpt"
    // C:\\antlr\\TinyHaxeTry1.g:323:1: propDeclOpt : propDecl ;
    public final void propDeclOpt() throws RecognitionException {
        int propDeclOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "propDeclOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(323, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:323:19: ( propDecl )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:323:21: propDecl
            {
            dbg.location(323,21);
            pushFollow(FOLLOW_propDecl_in_propDeclOpt3328);
            propDecl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, propDeclOpt_StartIndex); }
        }
        dbg.location(325, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "propDeclOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "propDeclOpt"


    // $ANTLR start "varInitOpt"
    // C:\\antlr\\TinyHaxeTry1.g:326:1: varInitOpt : varInit ;
    public final void varInitOpt() throws RecognitionException {
        int varInitOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varInitOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(326, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:326:19: ( varInit )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:326:21: varInit
            {
            dbg.location(326,21);
            pushFollow(FOLLOW_varInit_in_varInitOpt3354);
            varInit();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, varInitOpt_StartIndex); }
        }
        dbg.location(328, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varInitOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varInitOpt"


    // $ANTLR start "varInit"
    // C:\\antlr\\TinyHaxeTry1.g:329:1: varInit : '=' expr ;
    public final void varInit() throws RecognitionException {
        int varInit_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "varInit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(329, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:329:19: ( '=' expr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:329:21: '=' expr
            {
            dbg.location(329,21);
            match(input,EQ,FOLLOW_EQ_in_varInit3383); if (state.failed) return ;
            dbg.location(329,25);
            pushFollow(FOLLOW_expr_in_varInit3385);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, varInit_StartIndex); }
        }
        dbg.location(330, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varInit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "varInit"


    // $ANTLR start "funcDecl"
    // C:\\antlr\\TinyHaxeTry1.g:331:1: funcDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block );
    public final void funcDecl() throws RecognitionException {
        int funcDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "funcDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(331, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:331:19: ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block )
            int alt46=4;
            try { dbg.enterDecision(46);

            try {
                isCyclicDecision = true;
                alt46 = dfa46.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:331:21: declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    {
                    dbg.location(331,21);
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3403);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(331,34);
                    match(input,132,FOLLOW_132_in_funcDecl3405); if (state.failed) return ;
                    dbg.location(331,45);
                    match(input,NEW,FOLLOW_NEW_in_funcDecl3407); if (state.failed) return ;
                    dbg.location(331,51);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3409); if (state.failed) return ;
                    dbg.location(331,55);
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3411);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(331,68);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3413); if (state.failed) return ;
                    dbg.location(331,72);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3415);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(331,83);
                    pushFollow(FOLLOW_block_in_funcDecl3417);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:332:25: declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
                    {
                    dbg.location(332,25);
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3443);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(332,38);
                    match(input,132,FOLLOW_132_in_funcDecl3445); if (state.failed) return ;
                    dbg.location(332,48);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3446); if (state.failed) return ;
                    dbg.location(332,59);
                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3448);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(332,72);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3450); if (state.failed) return ;
                    dbg.location(332,76);
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3452);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(332,89);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3454); if (state.failed) return ;
                    dbg.location(332,93);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3456);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(332,104);
                    pushFollow(FOLLOW_block_in_funcDecl3458);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:333:25: 'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    {
                    dbg.location(333,25);
                    match(input,132,FOLLOW_132_in_funcDecl3484); if (state.failed) return ;
                    dbg.location(333,36);
                    match(input,NEW,FOLLOW_NEW_in_funcDecl3486); if (state.failed) return ;
                    dbg.location(333,42);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3488); if (state.failed) return ;
                    dbg.location(333,46);
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3490);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(333,59);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3492); if (state.failed) return ;
                    dbg.location(333,63);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3494);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(333,74);
                    pushFollow(FOLLOW_block_in_funcDecl3496);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:334:25: 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
                    {
                    dbg.location(334,25);
                    match(input,132,FOLLOW_132_in_funcDecl3522); if (state.failed) return ;
                    dbg.location(334,35);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3523); if (state.failed) return ;
                    dbg.location(334,46);
                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3525);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(334,59);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3527); if (state.failed) return ;
                    dbg.location(334,63);
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3529);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(334,76);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3531); if (state.failed) return ;
                    dbg.location(334,80);
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3533);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(334,91);
                    pushFollow(FOLLOW_block_in_funcDecl3535);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, funcDecl_StartIndex); }
        }
        dbg.location(335, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcDecl"


    // $ANTLR start "funcProtoDecl"
    // C:\\antlr\\TinyHaxeTry1.g:336:1: funcProtoDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' );
    public final void funcProtoDecl() throws RecognitionException {
        int funcProtoDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "funcProtoDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(336, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:336:19: ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' )
            int alt47=4;
            try { dbg.enterDecision(47);

            try {
                isCyclicDecision = true;
                alt47 = dfa47.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:336:21: declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    {
                    dbg.location(336,21);
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3548);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(336,34);
                    match(input,132,FOLLOW_132_in_funcProtoDecl3550); if (state.failed) return ;
                    dbg.location(336,45);
                    match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3552); if (state.failed) return ;
                    dbg.location(336,51);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3554); if (state.failed) return ;
                    dbg.location(336,55);
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3556);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(336,68);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3558); if (state.failed) return ;
                    dbg.location(336,72);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3560);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(336,83);
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3562); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:337:25: declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
                    {
                    dbg.location(337,25);
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3588);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(337,38);
                    match(input,132,FOLLOW_132_in_funcProtoDecl3590); if (state.failed) return ;
                    dbg.location(337,48);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3591); if (state.failed) return ;
                    dbg.location(337,59);
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3593);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(337,72);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3595); if (state.failed) return ;
                    dbg.location(337,76);
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3597);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(337,89);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3599); if (state.failed) return ;
                    dbg.location(337,93);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3601);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(337,104);
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3603); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:338:25: 'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    {
                    dbg.location(338,25);
                    match(input,132,FOLLOW_132_in_funcProtoDecl3629); if (state.failed) return ;
                    dbg.location(338,36);
                    match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3631); if (state.failed) return ;
                    dbg.location(338,42);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3633); if (state.failed) return ;
                    dbg.location(338,46);
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3635);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(338,59);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3637); if (state.failed) return ;
                    dbg.location(338,63);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3639);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(338,74);
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3641); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:339:25: 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
                    {
                    dbg.location(339,25);
                    match(input,132,FOLLOW_132_in_funcProtoDecl3667); if (state.failed) return ;
                    dbg.location(339,35);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3668); if (state.failed) return ;
                    dbg.location(339,46);
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3670);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(339,59);
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3672); if (state.failed) return ;
                    dbg.location(339,63);
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3674);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(339,76);
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3676); if (state.failed) return ;
                    dbg.location(339,80);
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3678);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(339,91);
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3680); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, funcProtoDecl_StartIndex); }
        }
        dbg.location(340, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "funcProtoDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "funcProtoDecl"


    // $ANTLR start "classDecl"
    // C:\\antlr\\TinyHaxeTry1.g:341:1: classDecl : 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}' ;
    public final void classDecl() throws RecognitionException {
        int classDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "classDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(341, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:341:19: ( 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:341:21: 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}'
            {
            dbg.location(341,21);
            match(input,CLASS,FOLLOW_CLASS_in_classDecl3697); if (state.failed) return ;
            dbg.location(341,28);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3698); if (state.failed) return ;
            dbg.location(341,39);
            pushFollow(FOLLOW_typeParamOpt_in_classDecl3700);
            typeParamOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(341,52);
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3702);
            inheritListOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(341,67);
            match(input,LBRACE,FOLLOW_LBRACE_in_classDecl3704); if (state.failed) return ;
            dbg.location(341,71);
            pushFollow(FOLLOW_classBody_in_classDecl3706);
            classBody();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(341,81);
            match(input,RBRACE,FOLLOW_RBRACE_in_classDecl3708); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, classDecl_StartIndex); }
        }
        dbg.location(342, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "classDecl"


    // $ANTLR start "classBody"
    // C:\\antlr\\TinyHaxeTry1.g:343:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody );
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "classBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:343:19: ( varDecl classBody | funcDecl classBody | pp classBody )
            int alt48=3;
            try { dbg.enterDecision(48);

            try {
                isCyclicDecision = true;
                alt48 = dfa48.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:343:21: varDecl classBody
                    {
                    dbg.location(343,21);
                    pushFollow(FOLLOW_varDecl_in_classBody3725);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(343,29);
                    pushFollow(FOLLOW_classBody_in_classBody3727);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:344:25: funcDecl classBody
                    {
                    dbg.location(344,25);
                    pushFollow(FOLLOW_funcDecl_in_classBody3753);
                    funcDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(344,34);
                    pushFollow(FOLLOW_classBody_in_classBody3755);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:345:25: pp classBody
                    {
                    dbg.location(345,25);
                    pushFollow(FOLLOW_pp_in_classBody3781);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(345,28);
                    pushFollow(FOLLOW_classBody_in_classBody3783);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, classBody_StartIndex); }
        }
        dbg.location(347, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "classBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "interfaceDecl"
    // C:\\antlr\\TinyHaxeTry1.g:348:1: interfaceDecl : 'interface' type inheritListOpt '{' interfaceBody '}' ;
    public final void interfaceDecl() throws RecognitionException {
        int interfaceDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "interfaceDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(348, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:348:19: ( 'interface' type inheritListOpt '{' interfaceBody '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:348:21: 'interface' type inheritListOpt '{' interfaceBody '}'
            {
            dbg.location(348,21);
            match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3806); if (state.failed) return ;
            dbg.location(348,33);
            pushFollow(FOLLOW_type_in_interfaceDecl3808);
            type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(348,38);
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3810);
            inheritListOpt();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(348,53);
            match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3812); if (state.failed) return ;
            dbg.location(348,57);
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3814);
            interfaceBody();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(348,71);
            match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3816); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, interfaceDecl_StartIndex); }
        }
        dbg.location(349, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interfaceDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "interfaceDecl"


    // $ANTLR start "interfaceBody"
    // C:\\antlr\\TinyHaxeTry1.g:350:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody );
    public final void interfaceBody() throws RecognitionException {
        int interfaceBody_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "interfaceBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:350:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody )
            int alt49=3;
            try { dbg.enterDecision(49);

            try {
                isCyclicDecision = true;
                alt49 = dfa49.predict(input);
            }
            catch (NoViableAltException nvae) {
                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(49);}

            switch (alt49) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:350:21: varDecl interfaceBody
                    {
                    dbg.location(350,21);
                    pushFollow(FOLLOW_varDecl_in_interfaceBody3829);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(350,29);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3831);
                    interfaceBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:351:25: funcProtoDecl interfaceBody
                    {
                    dbg.location(351,25);
                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3857);
                    funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(351,39);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3859);
                    interfaceBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:352:25: pp interfaceBody
                    {
                    dbg.location(352,25);
                    pushFollow(FOLLOW_pp_in_interfaceBody3885);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(352,28);
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3887);
                    interfaceBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, interfaceBody_StartIndex); }
        }
        dbg.location(354, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "interfaceBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "interfaceBody"


    // $ANTLR start "inheritListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:355:1: inheritListOpt : inheritList ;
    public final void inheritListOpt() throws RecognitionException {
        int inheritListOpt_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "inheritListOpt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(355, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:355:19: ( inheritList )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:355:21: inheritList
            {
            dbg.location(355,21);
            pushFollow(FOLLOW_inheritList_in_inheritListOpt3908);
            inheritList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, inheritListOpt_StartIndex); }
        }
        dbg.location(357, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inheritListOpt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inheritListOpt"


    // $ANTLR start "inheritList"
    // C:\\antlr\\TinyHaxeTry1.g:358:1: inheritList : ( inherit ) ( ',' inherit )* ;
    public final void inheritList() throws RecognitionException {
        int inheritList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "inheritList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(358, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:358:19: ( ( inherit ) ( ',' inherit )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:358:21: ( inherit ) ( ',' inherit )*
            {
            dbg.location(358,21);
            // C:\\antlr\\TinyHaxeTry1.g:358:21: ( inherit )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:358:22: inherit
            {
            dbg.location(358,22);
            pushFollow(FOLLOW_inherit_in_inheritList3945);
            inherit();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(358,31);
            // C:\\antlr\\TinyHaxeTry1.g:358:31: ( ',' inherit )*
            try { dbg.enterSubRule(50);

            loop50:
            do {
                int alt50=2;
                try { dbg.enterDecision(50);

                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                } finally {dbg.exitDecision(50);}

                switch (alt50) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:358:32: ',' inherit
            	    {
            	    dbg.location(358,32);
            	    match(input,COMMA,FOLLOW_COMMA_in_inheritList3949); if (state.failed) return ;
            	    dbg.location(358,36);
            	    pushFollow(FOLLOW_inherit_in_inheritList3951);
            	    inherit();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);
            } finally {dbg.exitSubRule(50);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, inheritList_StartIndex); }
        }
        dbg.location(359, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inheritList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inheritList"


    // $ANTLR start "inherit"
    // C:\\antlr\\TinyHaxeTry1.g:360:1: inherit : ( 'extends' type | 'implements' type );
    public final void inherit() throws RecognitionException {
        int inherit_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "inherit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(360, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:360:19: ( 'extends' type | 'implements' type )
            int alt51=2;
            try { dbg.enterDecision(51);

            int LA51_0 = input.LA(1);

            if ( (LA51_0==EXTENDS) ) {
                alt51=1;
            }
            else if ( (LA51_0==IMPLEMENTS) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(51);}

            switch (alt51) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:360:21: 'extends' type
                    {
                    dbg.location(360,21);
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit3972); if (state.failed) return ;
                    dbg.location(360,31);
                    pushFollow(FOLLOW_type_in_inherit3974);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:361:25: 'implements' type
                    {
                    dbg.location(361,25);
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4000); if (state.failed) return ;
                    dbg.location(361,38);
                    pushFollow(FOLLOW_type_in_inherit4002);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, inherit_StartIndex); }
        }
        dbg.location(362, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "inherit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "inherit"


    // $ANTLR start "typedefDecl"
    // C:\\antlr\\TinyHaxeTry1.g:363:1: typedefDecl : 'typedef' IDENTIFIER '=' funcType ;
    public final void typedefDecl() throws RecognitionException {
        int typedefDecl_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typedefDecl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(363, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:363:19: ( 'typedef' IDENTIFIER '=' funcType )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:363:21: 'typedef' IDENTIFIER '=' funcType
            {
            dbg.location(363,21);
            match(input,147,FOLLOW_147_in_typedefDecl4017); if (state.failed) return ;
            dbg.location(363,30);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4018); if (state.failed) return ;
            dbg.location(363,41);
            match(input,EQ,FOLLOW_EQ_in_typedefDecl4020); if (state.failed) return ;
            dbg.location(363,45);
            pushFollow(FOLLOW_funcType_in_typedefDecl4022);
            funcType();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, typedefDecl_StartIndex); }
        }
        dbg.location(364, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typedefDecl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typedefDecl"


    // $ANTLR start "typeExtend"
    // C:\\antlr\\TinyHaxeTry1.g:365:1: typeExtend : '>' funcType ',' ;
    public final void typeExtend() throws RecognitionException {
        int typeExtend_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "typeExtend");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(365, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:365:19: ( '>' funcType ',' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:365:21: '>' funcType ','
            {
            dbg.location(365,21);
            match(input,GT,FOLLOW_GT_in_typeExtend4038); if (state.failed) return ;
            dbg.location(365,25);
            pushFollow(FOLLOW_funcType_in_typeExtend4040);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(365,34);
            match(input,COMMA,FOLLOW_COMMA_in_typeExtend4042); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, typeExtend_StartIndex); }
        }
        dbg.location(366, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeExtend");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "typeExtend"


    // $ANTLR start "anonType"
    // C:\\antlr\\TinyHaxeTry1.g:367:1: anonType : '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}' ;
    public final void anonType() throws RecognitionException {
        int anonType_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "anonType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:367:19: ( '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:367:21: '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}'
            {
            dbg.location(367,21);
            match(input,LBRACE,FOLLOW_LBRACE_in_anonType4060); if (state.failed) return ;
            dbg.location(367,24);
            // C:\\antlr\\TinyHaxeTry1.g:367:24: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt53=4;
            try { dbg.enterSubRule(53);
            try { dbg.enterDecision(53);

            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt53=1;
                }
                break;
            case IDENTIFIER:
                {
                alt53=2;
                }
                break;
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case 126:
            case 127:
            case 128:
            case 146:
                {
                alt53=3;
                }
                break;
            case GT:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(53);}

            switch (alt53) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\antlr\\TinyHaxeTry1.g:368:21: 
                    {
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\antlr\\TinyHaxeTry1.g:368:26: anonTypeFieldList
                    {
                    dbg.location(368,26);
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4089);
                    anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\antlr\\TinyHaxeTry1.g:369:26: varDeclList
                    {
                    dbg.location(369,26);
                    pushFollow(FOLLOW_varDeclList_in_anonType4117);
                    varDeclList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\antlr\\TinyHaxeTry1.g:370:26: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    dbg.location(370,26);
                    pushFollow(FOLLOW_typeExtend_in_anonType4145);
                    typeExtend();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(370,37);
                    // C:\\antlr\\TinyHaxeTry1.g:370:37: ( | anonTypeFieldList | varDeclList )
                    int alt52=3;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52);

                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt52=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt52=2;
                        }
                        break;
                    case PRIVATE:
                    case PUBLIC:
                    case STATIC:
                    case 126:
                    case 127:
                    case 128:
                    case 146:
                        {
                        alt52=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }

                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\antlr\\TinyHaxeTry1.g:371:24: 
                            {
                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // C:\\antlr\\TinyHaxeTry1.g:371:25: anonTypeFieldList
                            {
                            dbg.location(371,25);
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4173);
                            anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            dbg.enterAlt(3);

                            // C:\\antlr\\TinyHaxeTry1.g:372:25: varDeclList
                            {
                            dbg.location(372,25);
                            pushFollow(FOLLOW_varDeclList_in_anonType4199);
                            varDeclList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(53);}

            dbg.location(373,23);
            match(input,RBRACE,FOLLOW_RBRACE_in_anonType4225); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, anonType_StartIndex); }
        }
        dbg.location(374, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "anonType"


    // $ANTLR start "anonTypeFieldList"
    // C:\\antlr\\TinyHaxeTry1.g:375:1: anonTypeFieldList : ( anonTypeField ) ( ',' anonTypeField )* ;
    public final void anonTypeFieldList() throws RecognitionException {
        int anonTypeFieldList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "anonTypeFieldList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(375, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:375:19: ( ( anonTypeField ) ( ',' anonTypeField )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:375:21: ( anonTypeField ) ( ',' anonTypeField )*
            {
            dbg.location(375,21);
            // C:\\antlr\\TinyHaxeTry1.g:375:21: ( anonTypeField )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:375:22: anonTypeField
            {
            dbg.location(375,22);
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4235);
            anonTypeField();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(375,37);
            // C:\\antlr\\TinyHaxeTry1.g:375:37: ( ',' anonTypeField )*
            try { dbg.enterSubRule(54);

            loop54:
            do {
                int alt54=2;
                try { dbg.enterDecision(54);

                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMA) ) {
                    alt54=1;
                }


                } finally {dbg.exitDecision(54);}

                switch (alt54) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:375:38: ',' anonTypeField
            	    {
            	    dbg.location(375,38);
            	    match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4239); if (state.failed) return ;
            	    dbg.location(375,42);
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4241);
            	    anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);
            } finally {dbg.exitSubRule(54);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, anonTypeFieldList_StartIndex); }
        }
        dbg.location(376, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonTypeFieldList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "anonTypeFieldList"


    // $ANTLR start "anonTypeField"
    // C:\\antlr\\TinyHaxeTry1.g:377:1: anonTypeField : IDENTIFIER ':' funcType ;
    public final void anonTypeField() throws RecognitionException {
        int anonTypeField_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "anonTypeField");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(377, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:377:19: ( IDENTIFIER ':' funcType )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:377:20: IDENTIFIER ':' funcType
            {
            dbg.location(377,20);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4255); if (state.failed) return ;
            dbg.location(377,31);
            match(input,COLON,FOLLOW_COLON_in_anonTypeField4257); if (state.failed) return ;
            dbg.location(377,35);
            pushFollow(FOLLOW_funcType_in_anonTypeField4259);
            funcType();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, anonTypeField_StartIndex); }
        }
        dbg.location(378, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anonTypeField");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "anonTypeField"


    // $ANTLR start "objLit"
    // C:\\antlr\\TinyHaxeTry1.g:379:1: objLit : '{' objLitElemList '}' ;
    public final void objLit() throws RecognitionException {
        int objLit_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "objLit");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(379, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:379:19: ( '{' objLitElemList '}' )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:379:21: '{' objLitElemList '}'
            {
            dbg.location(379,21);
            match(input,LBRACE,FOLLOW_LBRACE_in_objLit4279); if (state.failed) return ;
            dbg.location(379,25);
            pushFollow(FOLLOW_objLitElemList_in_objLit4281);
            objLitElemList();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(379,40);
            match(input,RBRACE,FOLLOW_RBRACE_in_objLit4283); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, objLit_StartIndex); }
        }
        dbg.location(380, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLit");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "objLit"


    // $ANTLR start "objLitElemList"
    // C:\\antlr\\TinyHaxeTry1.g:381:1: objLitElemList : ( objLitElem ) ( ',' objLitElem )* ;
    public final void objLitElemList() throws RecognitionException {
        int objLitElemList_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "objLitElemList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(381, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:381:19: ( ( objLitElem ) ( ',' objLitElem )* )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:381:21: ( objLitElem ) ( ',' objLitElem )*
            {
            dbg.location(381,21);
            // C:\\antlr\\TinyHaxeTry1.g:381:21: ( objLitElem )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:381:22: objLitElem
            {
            dbg.location(381,22);
            pushFollow(FOLLOW_objLitElem_in_objLitElemList4295);
            objLitElem();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(381,34);
            // C:\\antlr\\TinyHaxeTry1.g:381:34: ( ',' objLitElem )*
            try { dbg.enterSubRule(55);

            loop55:
            do {
                int alt55=2;
                try { dbg.enterDecision(55);

                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                } finally {dbg.exitDecision(55);}

                switch (alt55) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\antlr\\TinyHaxeTry1.g:381:35: ',' objLitElem
            	    {
            	    dbg.location(381,35);
            	    match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4299); if (state.failed) return ;
            	    dbg.location(381,39);
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4301);
            	    objLitElem();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);
            } finally {dbg.exitSubRule(55);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, objLitElemList_StartIndex); }
        }
        dbg.location(382, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLitElemList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "objLitElemList"


    // $ANTLR start "objLitElem"
    // C:\\antlr\\TinyHaxeTry1.g:383:1: objLitElem : IDENTIFIER ':' expr ;
    public final void objLitElem() throws RecognitionException {
        int objLitElem_StartIndex = input.index();
        try { dbg.enterRule(getGrammarFileName(), "objLitElem");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(383, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:383:19: ( IDENTIFIER ':' expr )
            dbg.enterAlt(1);

            // C:\\antlr\\TinyHaxeTry1.g:383:20: IDENTIFIER ':' expr
            {
            dbg.location(383,20);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4318); if (state.failed) return ;
            dbg.location(383,31);
            match(input,COLON,FOLLOW_COLON_in_objLitElem4320); if (state.failed) return ;
            dbg.location(383,35);
            pushFollow(FOLLOW_expr_in_objLitElem4322);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, objLitElem_StartIndex); }
        }
        dbg.location(384, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "objLitElem");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "objLitElem"

    // $ANTLR start synpred37_TinyHaxeTry1
    public final void synpred37_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:128:9: ( block )
        dbg.enterAlt(1);

        // C:\\antlr\\TinyHaxeTry1.g:128:9: block
        {
        dbg.location(128,9);
        pushFollow(FOLLOW_block_in_synpred37_TinyHaxeTry11476);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_TinyHaxeTry1

    // $ANTLR start synpred38_TinyHaxeTry1
    public final void synpred38_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:129:39: ( 'else' statement )
        dbg.enterAlt(1);

        // C:\\antlr\\TinyHaxeTry1.g:129:39: 'else' statement
        {
        dbg.location(129,39);
        match(input,ELSE,FOLLOW_ELSE_in_synpred38_TinyHaxeTry11493); if (state.failed) return ;
        dbg.location(129,46);
        pushFollow(FOLLOW_statement_in_synpred38_TinyHaxeTry11495);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_TinyHaxeTry1

    // $ANTLR start synpred52_TinyHaxeTry1
    public final void synpred52_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:140:9: ( expr ';' )
        dbg.enterAlt(1);

        // C:\\antlr\\TinyHaxeTry1.g:140:9: expr ';'
        {
        dbg.location(140,9);
        pushFollow(FOLLOW_expr_in_synpred52_TinyHaxeTry11644);
        expr();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(140,15);
        match(input,SEMI,FOLLOW_SEMI_in_synpred52_TinyHaxeTry11647); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_TinyHaxeTry1

    // $ANTLR start synpred53_TinyHaxeTry1
    public final void synpred53_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:141:9: ( IDENTIFIER ':' statement )
        dbg.enterAlt(1);

        // C:\\antlr\\TinyHaxeTry1.g:141:9: IDENTIFIER ':' statement
        {
        dbg.location(141,9);
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred53_TinyHaxeTry11662); if (state.failed) return ;
        dbg.location(141,20);
        match(input,COLON,FOLLOW_COLON_in_synpred53_TinyHaxeTry11664); if (state.failed) return ;
        dbg.location(141,24);
        pushFollow(FOLLOW_statement_in_synpred53_TinyHaxeTry11666);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_TinyHaxeTry1

    // $ANTLR start synpred97_TinyHaxeTry1
    public final void synpred97_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:284:30: ( expr )
        dbg.enterAlt(1);

        // C:\\antlr\\TinyHaxeTry1.g:284:30: expr
        {
        dbg.location(284,30);
        pushFollow(FOLLOW_expr_in_synpred97_TinyHaxeTry12785);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_TinyHaxeTry1

    // Delegated rules

    public final boolean synpred52_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred52_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred37_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred37_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred97_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred97_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred53_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred53_TinyHaxeTry1_fragment(); // can never throw exception
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
    public final boolean synpred38_TinyHaxeTry1() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred38_TinyHaxeTry1_fragment(); // can never throw exception
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


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA22_eotS =
        "\27\uffff";
    static final String DFA22_eofS =
        "\27\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\20\uffff\1\0\4\uffff";
    static final String DFA22_maxS =
        "\1\u0091\1\0\20\uffff\1\0\4\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\7\uffff"+
        "\1\16\1\1\1\15";
    static final String DFA22_specialS =
        "\1\uffff\1\0\20\uffff\1\1\4\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\22\16\uffff\1\12\6\uffff\1\13\1\uffff\1\5\7\uffff\1\3\1"+
            "\uffff\1\2\7\uffff\1\14\4\uffff\1\10\4\uffff\1\7\1\uffff\1\11"+
            "\2\uffff\1\6\2\uffff\1\4\2\uffff\2\14\1\uffff\1\1\1\uffff\1"+
            "\14\1\uffff\1\24\4\uffff\2\14\5\uffff\2\14\1\uffff\1\14\52\uffff"+
            "\1\14\14\uffff\1\14",
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
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "127:1: statement : ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (synpred52_TinyHaxeTry1()) ) {s = 12;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_18 = input.LA(1);

                         
                        int index22_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_TinyHaxeTry1()) ) {s = 12;}

                        else if ( (synpred53_TinyHaxeTry1()) ) {s = 22;}

                         
                        input.seek(index22_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA38_eotS =
        "\26\uffff";
    static final String DFA38_eofS =
        "\26\uffff";
    static final String DFA38_minS =
        "\1\4\11\0\14\uffff";
    static final String DFA38_maxS =
        "\1\u0091\11\0\14\uffff";
    static final String DFA38_acceptS =
        "\12\uffff\1\2\12\uffff\1\1";
    static final String DFA38_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\14\uffff}>";
    static final String[] DFA38_transitionS = {
            "\1\10\16\uffff\1\12\6\uffff\1\12\1\uffff\1\12\7\uffff\1\12"+
            "\1\uffff\1\12\7\uffff\1\2\4\uffff\1\12\4\uffff\1\12\1\uffff"+
            "\1\12\2\uffff\1\12\2\uffff\1\12\2\uffff\1\7\1\11\1\uffff\1\6"+
            "\1\uffff\1\5\1\uffff\1\12\4\uffff\2\1\5\uffff\2\1\1\uffff\1"+
            "\1\52\uffff\1\4\14\uffff\1\3",
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "284:29: ( expr | statement )";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_1 = input.LA(1);

                         
                        int index38_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_2 = input.LA(1);

                         
                        int index38_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_3 = input.LA(1);

                         
                        int index38_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_4 = input.LA(1);

                         
                        int index38_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_6 = input.LA(1);

                         
                        int index38_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_7 = input.LA(1);

                         
                        int index38_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA38_8 = input.LA(1);

                         
                        int index38_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA38_9 = input.LA(1);

                         
                        int index38_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_TinyHaxeTry1()) ) {s = 21;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index38_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA46_eotS =
        "\14\uffff";
    static final String DFA46_eofS =
        "\14\uffff";
    static final String DFA46_minS =
        "\6\60\2\4\4\uffff";
    static final String DFA46_maxS =
        "\6\u0084\2\56\4\uffff";
    static final String DFA46_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    static final String DFA46_specialS =
        "\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\11\51\uffff\1\10",
            "\1\12\51\uffff\1\13",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "331:1: funcDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA47_eotS =
        "\14\uffff";
    static final String DFA47_eofS =
        "\14\uffff";
    static final String DFA47_minS =
        "\6\60\2\4\4\uffff";
    static final String DFA47_maxS =
        "\6\u0084\2\56\4\uffff";
    static final String DFA47_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA47_specialS =
        "\14\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7",
            "\1\11\51\uffff\1\10",
            "\1\13\51\uffff\1\12",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "336:1: funcProtoDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA48_eotS =
        "\11\uffff";
    static final String DFA48_eofS =
        "\11\uffff";
    static final String DFA48_minS =
        "\6\60\3\uffff";
    static final String DFA48_maxS =
        "\6\u0092\3\uffff";
    static final String DFA48_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA48_specialS =
        "\11\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\5\10\10\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "343:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
    static final String DFA49_eotS =
        "\11\uffff";
    static final String DFA49_eofS =
        "\11\uffff";
    static final String DFA49_minS =
        "\6\60\3\uffff";
    static final String DFA49_maxS =
        "\6\u0092\3\uffff";
    static final String DFA49_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA49_specialS =
        "\11\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\5\10\10\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "\1\5\1\uffff\1\5\2\uffff\1\1\110\uffff\1\2\1\3\1\4\3\uffff"+
            "\1\7\15\uffff\1\6",
            "",
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "350:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody );";
        }
        public void error(NoViableAltException nvae) {
            dbg.recognitionException(nvae);
        }
    }
 

    public static final BitSet FOLLOW_myPackage_in_module45 = new BitSet(new long[]{0x0000090081000000L,0x0000000000000000L,0x00000000000803E0L});
    public static final BitSet FOLLOW_topLevelList_in_module47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelList_in_module73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevel_in_topLevelList89 = new BitSet(new long[]{0x0000090081000002L,0x0000000000000000L,0x00000000000803E0L});
    public static final BitSet FOLLOW_myImport_in_topLevel108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_topLevel134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topLevelDecl_in_topLevel160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKAGE_in_myPackage179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_dotIdent_in_myPackage181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_myPackage183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_myImport203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_dotIdent_in_myImport205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_myImport207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_access0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_declAttr293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_declAttr319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_declAttr345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_declAttr371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_access_in_declAttr397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttr_in_declAttrList412 = new BitSet(new long[]{0x0025000000000002L,0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_paramList_in_paramListOpt440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_paramList469 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_param_in_paramList471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_varInitOpt_in_param497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_param523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_varInitOpt_in_param528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcLit877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit879 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcLit881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_funcLit887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit904 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ppIf1061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ppIf1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1090 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ppElseIf1109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ppElseIf1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ppElse1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ppEnd1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ppError1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1220 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeTag1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeList1269 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeList1271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeList1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_funcType1346 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_funcType1350 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_funcType1352 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_anonType_in_type1377 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_dotIdent_in_type1381 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParam_in_type1385 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1404 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeList_in_typeParam1406 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1447 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1488 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1490 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1493 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1529 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1541 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHILE_in_statement1545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStmt_in_statement1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1579 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18558L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_statement1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1596 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_statement1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1610 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1627 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_statement1664 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1700 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_parExpression1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1727 = new BitSet(new long[]{0x252D405015080010L,0xC000000002C185D9L,0x0000000000060011L});
    public static final BitSet FOLLOW_blockStmt_in_block1730 = new BitSet(new long[]{0x252D405015080010L,0xC000000002C185D9L,0x0000000000060011L});
    public static final BitSet FOLLOW_RBRACE_in_block1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt1825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_forStmt1827 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_forStmt1829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_forStmt1831 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_forStmt1833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_forStmt1835 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_forStmt1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1900 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt1937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt1939 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_switchStmt1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_switchStmt1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStmt1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_tryStmt1968 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_catchStmtList_in_tryStmt1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList1983 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2014 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_param_in_catchStmt2016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_catchStmt2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_exprList2063 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_exprList2065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_assignExpr_in_expr2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2105 = new BitSet(new long[]{0x0000000000000002L,0x000000FF00004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2108 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2110 = new BitSet(new long[]{0x0000000000000002L,0x000000FF00004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2133 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2161 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2165 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2205 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2207 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2228 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2252 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2256 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2258 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2262 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2264 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_cmpExpr2268 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2270 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_cmpExpr2274 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2276 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2280 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2283 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2287 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2290 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2312 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2316 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2318 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2322 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2324 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2328 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2330 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_142_in_shiftExpr2354 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_143_in_shiftExpr2361 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2364 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_144_in_shiftExpr2368 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2395 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2399 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2401 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2405 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2407 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2428 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2432 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2434 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2438 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2440 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2444 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2446 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2464 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2572 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2576 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2580 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_DOT_in_suffixExpr2584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_suffixExpr2585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2589 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2601 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_funcLit_in_value2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_value2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2782 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_value2785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_statement_in_value2787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_value2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2825 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_newExpr2827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2829 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_cast2855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_cast2857 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_cast2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_COMMA_in_cast2862 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_cast2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_cast2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2982 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl2986 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl2988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3009 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3025 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_enumValueDecl3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3099 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x0000000000040001L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_varDecl3122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_varDecl3152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_varInitOpt_in_varDeclPart3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3214 = new BitSet(new long[]{0x0000000008000010L,0x8000000000000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3218 = new BitSet(new long[]{0x0000000008000010L,0x8000000000000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varInitOpt3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3383 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_varInit3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcDecl3405 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3409 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_funcDecl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcDecl3445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3446 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3450 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_funcDecl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcDecl3484 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3488 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_funcDecl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcDecl3522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3523 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3527 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_block_in_funcDecl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3550 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3554 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3591 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3595 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3629 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3633 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3668 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3672 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3698 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3700 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl3704 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classDecl3706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody3725 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody3753 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody3781 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3806 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3808 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3812 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3829 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3857 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody3885 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList3945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_inheritList3949 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList3951 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit3972 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_inherit3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4000 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_inherit4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_typedefDecl4017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4020 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4038 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4060 = new BitSet(new long[]{0x0025000000000010L,0xC008000000000080L,0x0000000000040001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4145 = new BitSet(new long[]{0x0025000000000010L,0xC000000000000080L,0x0000000000040001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4257 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem4320 = new BitSet(new long[]{0x0000400000000010L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_objLitElem4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred37_TinyHaxeTry11476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred38_TinyHaxeTry11493 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_synpred38_TinyHaxeTry11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred52_TinyHaxeTry11644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_synpred52_TinyHaxeTry11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred53_TinyHaxeTry11662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_synpred53_TinyHaxeTry11664 = new BitSet(new long[]{0x2508405014080010L,0x0000000002C18559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_synpred53_TinyHaxeTry11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred97_TinyHaxeTry12785 = new BitSet(new long[]{0x0000000000000002L});

}