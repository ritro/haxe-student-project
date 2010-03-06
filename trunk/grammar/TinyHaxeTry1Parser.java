// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-06 03:03:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class TinyHaxeTry1Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "STRINGLITERAL", "WS", "IntegerNumber", "LongSuffix", "LONGLITERAL", "INTLITERAL", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "EscapeSequence", "CHARLITERAL", "ABSTRACT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "GOTO", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "TRUE", "FALSE", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "SEMI", "COMMA", "DOT", "ELLIPSIS", "EQ", "BANG", "TILDE", "QUES", "COLON", "EQEQ", "AMPAMP", "BARBAR", "PLUSPLUS", "SUBSUB", "PLUS", "SUB", "STAR", "SLASH", "AMP", "BAR", "CARET", "PERCENT", "PLUSEQ", "SUBEQ", "STAREQ", "SLASHEQ", "AMPEQ", "BAREQ", "CARETEQ", "PERCENTEQ", "PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ", "BANGEQQ", "MONKEYS_AT", "BANGEQ", "PERCENTLL", "PERCENTBB", "PERCENTBBB", "GT", "LT", "INTNUM", "EXPONENT", "FLOATNUM", "COMMENT", "ESC_SEQ", "STRING", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'inline'", "'dynamic'", "'override'", "'<<='", "'>>='", "'>>>='", "'function'", "'#if'", "'#elseif'", "'#else'", "'#end'", "'#error'", "'->'", "'in'", "'>='", "'<='", "'<<'", "'>>'", "'>>>'", "'cast'", "'var'", "'typedef'"
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
    public static final int NonIntegerNumber=14;
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
    public static final int HexPrefix=11;
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
    public static final int INTLITERAL=10;
    public static final int T__141=141;
    public static final int PERCENTBB=113;
    public static final int T__142=142;
    public static final int T__140=140;
    public static final int T__145=145;
    public static final int TRY=61;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int LONGLITERAL=9;
    public static final int LongSuffix=8;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__128=128;
    public static final int PERCENTLL=112;
    public static final int BANGEQQ=109;
    public static final int T__127=127;
    public static final int WS=6;
    public static final int T__129=129;
    public static final int PERCENTDLQ=104;
    public static final int CHARLITERAL=16;
    public static final int GT=115;
    public static final int CATCH=22;
    public static final int FALSE=66;
    public static final int T__130=130;
    public static final int EscapeSequence=15;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int THROW=58;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int PROTECTED=49;
    public static final int CLASS=24;
    public static final int BAREQ=101;
    public static final int IntegerNumber=7;
    public static final int AMP=92;
    public static final int PLUSPLUS=86;
    public static final int LBRACE=70;
    public static final int SUBEQ=97;
    public static final int Exponent=13;
    public static final int FOR=36;
    public static final int SUB=89;
    public static final int FLOAT=35;
    public static final int ABSTRACT=17;
    public static final int PERCENTDBQ=105;
    public static final int HexDigit=12;
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
    public static final int STRINGLITERAL=5;
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


        public TinyHaxeTry1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[226+1];
             
             
        }
        

    public String[] getTokenNames() { return TinyHaxeTry1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\antlr\\TinyHaxeTry1.g"; }



    // $ANTLR start "module"
    // C:\\antlr\\TinyHaxeTry1.g:9:1: module : ( myPackage topLevelList | topLevelList );
    public final void module() throws RecognitionException {
        int module_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:9:19: ( myPackage topLevelList | topLevelList )
            int alt1=2;
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

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:9:21: myPackage topLevelList
                    {
                    pushFollow(FOLLOW_myPackage_in_module45);
                    myPackage();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_topLevelList_in_module47);
                    topLevelList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:10:25: topLevelList
                    {
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
        return ;
    }
    // $ANTLR end "module"


    // $ANTLR start "topLevelList"
    // C:\\antlr\\TinyHaxeTry1.g:12:1: topLevelList : ( topLevel )* ;
    public final void topLevelList() throws RecognitionException {
        int topLevelList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:12:19: ( ( topLevel )* )
            // C:\\antlr\\TinyHaxeTry1.g:12:22: ( topLevel )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:12:22: ( topLevel )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CLASS||LA2_0==ENUM||LA2_0==IMPORT||LA2_0==INTERFACE||(LA2_0>=133 && LA2_0<=137)||LA2_0==147) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:12:23: topLevel
            	    {
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


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, topLevelList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "topLevelList"


    // $ANTLR start "topLevel"
    // C:\\antlr\\TinyHaxeTry1.g:14:1: topLevel : ( myImport | pp | topLevelDecl );
    public final void topLevel() throws RecognitionException {
        int topLevel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:14:19: ( myImport | pp | topLevelDecl )
            int alt3=3;
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

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:14:21: myImport
                    {
                    pushFollow(FOLLOW_myImport_in_topLevel108);
                    myImport();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:15:25: pp
                    {
                    pushFollow(FOLLOW_pp_in_topLevel134);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:16:25: topLevelDecl
                    {
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
        return ;
    }
    // $ANTLR end "topLevel"


    // $ANTLR start "myPackage"
    // C:\\antlr\\TinyHaxeTry1.g:18:1: myPackage : 'package' dotIdent ';' ;
    public final void myPackage() throws RecognitionException {
        int myPackage_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:18:21: ( 'package' dotIdent ';' )
            // C:\\antlr\\TinyHaxeTry1.g:18:23: 'package' dotIdent ';'
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_myPackage179); if (state.failed) return ;
            pushFollow(FOLLOW_dotIdent_in_myPackage181);
            dotIdent();

            state._fsp--;
            if (state.failed) return ;
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
        return ;
    }
    // $ANTLR end "myPackage"


    // $ANTLR start "myImport"
    // C:\\antlr\\TinyHaxeTry1.g:20:1: myImport : 'import' dotIdent ';' ;
    public final void myImport() throws RecognitionException {
        int myImport_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:20:21: ( 'import' dotIdent ';' )
            // C:\\antlr\\TinyHaxeTry1.g:20:23: 'import' dotIdent ';'
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_myImport203); if (state.failed) return ;
            pushFollow(FOLLOW_dotIdent_in_myImport205);
            dotIdent();

            state._fsp--;
            if (state.failed) return ;
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
        return ;
    }
    // $ANTLR end "myImport"


    // $ANTLR start "access"
    // C:\\antlr\\TinyHaxeTry1.g:24:1: access : ( 'public' | 'private' );
    public final void access() throws RecognitionException {
        int access_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:24:19: ( 'public' | 'private' )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            if ( input.LA(1)==PRIVATE||input.LA(1)==PUBLIC ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "access"


    // $ANTLR start "declAttr"
    // C:\\antlr\\TinyHaxeTry1.g:27:1: declAttr : ( 'static' | 'inline' | 'dynamic' | 'override' | access );
    public final void declAttr() throws RecognitionException {
        int declAttr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:27:19: ( 'static' | 'inline' | 'dynamic' | 'override' | access )
            int alt4=5;
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

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:27:21: 'static'
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_declAttr293); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:28:25: 'inline'
                    {
                    match(input,126,FOLLOW_126_in_declAttr319); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:29:25: 'dynamic'
                    {
                    match(input,127,FOLLOW_127_in_declAttr345); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:30:25: 'override'
                    {
                    match(input,128,FOLLOW_128_in_declAttr371); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:31:25: access
                    {
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
        return ;
    }
    // $ANTLR end "declAttr"


    // $ANTLR start "declAttrList"
    // C:\\antlr\\TinyHaxeTry1.g:33:1: declAttrList : ( declAttr )+ ;
    public final void declAttrList() throws RecognitionException {
        int declAttrList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:33:19: ( ( declAttr )+ )
            // C:\\antlr\\TinyHaxeTry1.g:33:21: ( declAttr )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:33:21: ( declAttr )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PRIVATE||LA5_0==PUBLIC||LA5_0==STATIC||(LA5_0>=126 && LA5_0<=128)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:33:22: declAttr
            	    {
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
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, declAttrList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "declAttrList"


    // $ANTLR start "paramListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:41:1: paramListOpt : ( paramList | );
    public final void paramListOpt() throws RecognitionException {
        int paramListOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:41:19: ( paramList | )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER||LA6_0==QUES) ) {
                alt6=1;
            }
            else if ( (LA6_0==RPAREN) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:41:21: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_paramListOpt440);
                    paramList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:43:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, paramListOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "paramListOpt"


    // $ANTLR start "paramList"
    // C:\\antlr\\TinyHaxeTry1.g:44:1: paramList : param ( ',' param )* ;
    public final void paramList() throws RecognitionException {
        int paramList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:44:19: ( param ( ',' param )* )
            // C:\\antlr\\TinyHaxeTry1.g:44:21: param ( ',' param )*
            {
            pushFollow(FOLLOW_param_in_paramList479);
            param();

            state._fsp--;
            if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:44:27: ( ',' param )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:44:28: ',' param
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_paramList482); if (state.failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList484);
            	    param();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, paramList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "param"
    // C:\\antlr\\TinyHaxeTry1.g:46:1: param : ( IDENTIFIER typeTagOpt varInitOpt | '?' IDENTIFIER typeTagOpt varInitOpt );
    public final void param() throws RecognitionException {
        int param_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:46:19: ( IDENTIFIER typeTagOpt varInitOpt | '?' IDENTIFIER typeTagOpt varInitOpt )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENTIFIER) ) {
                alt8=1;
            }
            else if ( (LA8_0==QUES) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:46:20: IDENTIFIER typeTagOpt varInitOpt
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param506); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_param508);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_varInitOpt_in_param510);
                    varInitOpt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:47:25: '?' IDENTIFIER typeTagOpt varInitOpt
                    {
                    match(input,QUES,FOLLOW_QUES_in_param536); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_param537); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_param539);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_varInitOpt_in_param541);
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
        return ;
    }
    // $ANTLR end "param"


    // $ANTLR start "dotIdent"
    // C:\\antlr\\TinyHaxeTry1.g:49:1: dotIdent : ( IDENTIFIER ) ( '.' IDENTIFIER )* ;
    public final void dotIdent() throws RecognitionException {
        int dotIdent_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:49:19: ( ( IDENTIFIER ) ( '.' IDENTIFIER )* )
            // C:\\antlr\\TinyHaxeTry1.g:49:21: ( IDENTIFIER ) ( '.' IDENTIFIER )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:49:21: ( IDENTIFIER )
            // C:\\antlr\\TinyHaxeTry1.g:49:22: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent560); if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:49:34: ( '.' IDENTIFIER )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==DOT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:49:35: '.' IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_dotIdent564); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_dotIdent565); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, dotIdent_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dotIdent"


    // $ANTLR start "assignOp"
    // C:\\antlr\\TinyHaxeTry1.g:51:1: assignOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' );
    public final void assignOp() throws RecognitionException {
        int assignOp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:51:19: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            if ( input.LA(1)==EQ||(input.LA(1)>=PLUSEQ && input.LA(1)<=PERCENTEQ)||(input.LA(1)>=129 && input.LA(1)<=131) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return ;
    }
    // $ANTLR end "assignOp"


    // $ANTLR start "funcLit"
    // C:\\antlr\\TinyHaxeTry1.g:64:1: funcLit : 'function' '(' paramListOpt ')' typeTagOpt block ;
    public final void funcLit() throws RecognitionException {
        int funcLit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:64:19: ( 'function' '(' paramListOpt ')' typeTagOpt block )
            // C:\\antlr\\TinyHaxeTry1.g:64:21: 'function' '(' paramListOpt ')' typeTagOpt block
            {
            match(input,132,FOLLOW_132_in_funcLit890); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_funcLit892); if (state.failed) return ;
            pushFollow(FOLLOW_paramListOpt_in_funcLit894);
            paramListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_funcLit896); if (state.failed) return ;
            pushFollow(FOLLOW_typeTagOpt_in_funcLit898);
            typeTagOpt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_funcLit900);
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
        return ;
    }
    // $ANTLR end "funcLit"


    // $ANTLR start "arrayLit"
    // C:\\antlr\\TinyHaxeTry1.g:66:1: arrayLit : '[' exprListOpt ']' ;
    public final void arrayLit() throws RecognitionException {
        int arrayLit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:66:18: ( '[' exprListOpt ']' )
            // C:\\antlr\\TinyHaxeTry1.g:66:20: '[' exprListOpt ']'
            {
            match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayLit917); if (state.failed) return ;
            pushFollow(FOLLOW_exprListOpt_in_arrayLit919);
            exprListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayLit921); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, arrayLit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "arrayLit"


    // $ANTLR start "pp"
    // C:\\antlr\\TinyHaxeTry1.g:73:1: pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
    public final void pp() throws RecognitionException {
        int pp_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:73:19: ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt10=1;
                }
                break;
            case 134:
                {
                alt10=2;
                }
                break;
            case 135:
                {
                alt10=3;
                }
                break;
            case 136:
                {
                alt10=4;
                }
                break;
            case 137:
                {
                alt10=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:73:21: ppIf
                    {
                    pushFollow(FOLLOW_ppIf_in_pp948);
                    ppIf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:74:25: ppElseIf
                    {
                    pushFollow(FOLLOW_ppElseIf_in_pp974);
                    ppElseIf();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:75:25: ppElse
                    {
                    pushFollow(FOLLOW_ppElse_in_pp1000);
                    ppElse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:76:25: ppEnd
                    {
                    pushFollow(FOLLOW_ppEnd_in_pp1026);
                    ppEnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:77:25: ppError
                    {
                    pushFollow(FOLLOW_ppError_in_pp1052);
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
        return ;
    }
    // $ANTLR end "pp"


    // $ANTLR start "ppIf"
    // C:\\antlr\\TinyHaxeTry1.g:79:1: ppIf : ( '#if' IDENTIFIER | '#if' '!' IDENTIFIER );
    public final void ppIf() throws RecognitionException {
        int ppIf_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:79:19: ( '#if' IDENTIFIER | '#if' '!' IDENTIFIER )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==133) ) {
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

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:79:21: '#if' IDENTIFIER
                    {
                    match(input,133,FOLLOW_133_in_ppIf1074); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1075); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:80:25: '#if' '!' IDENTIFIER
                    {
                    match(input,133,FOLLOW_133_in_ppIf1101); if (state.failed) return ;
                    match(input,BANG,FOLLOW_BANG_in_ppIf1103); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppIf1104); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "ppIf"


    // $ANTLR start "ppElseIf"
    // C:\\antlr\\TinyHaxeTry1.g:82:1: ppElseIf : ( '#elseif' IDENTIFIER | '#elseif' '!' IDENTIFIER );
    public final void ppElseIf() throws RecognitionException {
        int ppElseIf_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:82:19: ( '#elseif' IDENTIFIER | '#elseif' '!' IDENTIFIER )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==134) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==IDENTIFIER) ) {
                    alt12=1;
                }
                else if ( (LA12_1==BANG) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:82:21: '#elseif' IDENTIFIER
                    {
                    match(input,134,FOLLOW_134_in_ppElseIf1122); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1123); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:83:25: '#elseif' '!' IDENTIFIER
                    {
                    match(input,134,FOLLOW_134_in_ppElseIf1149); if (state.failed) return ;
                    match(input,BANG,FOLLOW_BANG_in_ppElseIf1151); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_ppElseIf1152); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "ppElseIf"


    // $ANTLR start "ppElse"
    // C:\\antlr\\TinyHaxeTry1.g:85:1: ppElse : '#else' ;
    public final void ppElse() throws RecognitionException {
        int ppElse_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:85:19: ( '#else' )
            // C:\\antlr\\TinyHaxeTry1.g:85:21: '#else'
            {
            match(input,135,FOLLOW_135_in_ppElse1172); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, ppElse_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ppElse"


    // $ANTLR start "ppEnd"
    // C:\\antlr\\TinyHaxeTry1.g:87:1: ppEnd : '#end' ;
    public final void ppEnd() throws RecognitionException {
        int ppEnd_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:87:19: ( '#end' )
            // C:\\antlr\\TinyHaxeTry1.g:87:21: '#end'
            {
            match(input,136,FOLLOW_136_in_ppEnd1193); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, ppEnd_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ppEnd"


    // $ANTLR start "ppError"
    // C:\\antlr\\TinyHaxeTry1.g:89:1: ppError : '#error' ;
    public final void ppError() throws RecognitionException {
        int ppError_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:89:19: ( '#error' )
            // C:\\antlr\\TinyHaxeTry1.g:89:21: '#error'
            {
            match(input,137,FOLLOW_137_in_ppError1212); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, ppError_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ppError"


    // $ANTLR start "typeTag"
    // C:\\antlr\\TinyHaxeTry1.g:93:1: typeTag : ':' funcType ;
    public final void typeTag() throws RecognitionException {
        int typeTag_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:93:19: ( ':' funcType )
            // C:\\antlr\\TinyHaxeTry1.g:93:21: ':' funcType
            {
            match(input,COLON,FOLLOW_COLON_in_typeTag1233); if (state.failed) return ;
            pushFollow(FOLLOW_funcType_in_typeTag1235);
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
        return ;
    }
    // $ANTLR end "typeTag"


    // $ANTLR start "typeTagOpt"
    // C:\\antlr\\TinyHaxeTry1.g:95:1: typeTagOpt : ( typeTag | );
    public final void typeTagOpt() throws RecognitionException {
        int typeTagOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:95:19: ( typeTag | )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLON) ) {
                alt13=1;
            }
            else if ( (LA13_0==LBRACE||LA13_0==SEMI||LA13_0==EQ) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:95:21: typeTag
                    {
                    pushFollow(FOLLOW_typeTag_in_typeTagOpt1251);
                    typeTag();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:97:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, typeTagOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeTagOpt"


    // $ANTLR start "typeList"
    // C:\\antlr\\TinyHaxeTry1.g:98:1: typeList : ( funcType ( ',' funcType )* | typeConstraint ( ',' typeConstraint )* );
    public final void typeList() throws RecognitionException {
        int typeList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:98:19: ( funcType ( ',' funcType )* | typeConstraint ( ',' typeConstraint )* )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACE) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENTIFIER) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==COLON) ) {
                    alt16=2;
                }
                else if ( (LA16_2==RPAREN||(LA16_2>=COMMA && LA16_2<=DOT)||(LA16_2>=GT && LA16_2<=LT)||LA16_2==138) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:98:21: funcType ( ',' funcType )*
                    {
                    pushFollow(FOLLOW_funcType_in_typeList1291);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:98:30: ( ',' funcType )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:98:31: ',' funcType
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_typeList1294); if (state.failed) return ;
                    	    pushFollow(FOLLOW_funcType_in_typeList1296);
                    	    funcType();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:99:25: typeConstraint ( ',' typeConstraint )*
                    {
                    pushFollow(FOLLOW_typeConstraint_in_typeList1324);
                    typeConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:99:40: ( ',' typeConstraint )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:99:41: ',' typeConstraint
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_typeList1327); if (state.failed) return ;
                    	    pushFollow(FOLLOW_typeConstraint_in_typeList1329);
                    	    typeConstraint();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "typeList"


    // $ANTLR start "funcType"
    // C:\\antlr\\TinyHaxeTry1.g:110:1: funcType : ( type ) ( '->' type )* ;
    public final void funcType() throws RecognitionException {
        int funcType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:110:19: ( ( type ) ( '->' type )* )
            // C:\\antlr\\TinyHaxeTry1.g:110:21: ( type ) ( '->' type )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:110:21: ( type )
            // C:\\antlr\\TinyHaxeTry1.g:110:22: type
            {
            pushFollow(FOLLOW_type_in_funcType1371);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:110:28: ( '->' type )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==138) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:110:29: '->' type
            	    {
            	    match(input,138,FOLLOW_138_in_funcType1375); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_funcType1377);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, funcType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcType"


    // $ANTLR start "type"
    // C:\\antlr\\TinyHaxeTry1.g:112:1: type : ( anonType | dotIdent ) ( typeParam )* ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:112:19: ( ( anonType | dotIdent ) ( typeParam )* )
            // C:\\antlr\\TinyHaxeTry1.g:112:21: ( anonType | dotIdent ) ( typeParam )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:112:21: ( anonType | dotIdent )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LBRACE) ) {
                alt18=1;
            }
            else if ( (LA18_0==IDENTIFIER) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:112:22: anonType
                    {
                    pushFollow(FOLLOW_anonType_in_type1402);
                    anonType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:112:33: dotIdent
                    {
                    pushFollow(FOLLOW_dotIdent_in_type1406);
                    dotIdent();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // C:\\antlr\\TinyHaxeTry1.g:112:43: ( typeParam )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:112:44: typeParam
            	    {
            	    pushFollow(FOLLOW_typeParam_in_type1410);
            	    typeParam();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeParam"
    // C:\\antlr\\TinyHaxeTry1.g:114:1: typeParam : '<' typeList '>' ;
    public final void typeParam() throws RecognitionException {
        int typeParam_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:114:19: ( '<' typeList '>' )
            // C:\\antlr\\TinyHaxeTry1.g:114:21: '<' typeList '>'
            {
            match(input,LT,FOLLOW_LT_in_typeParam1429); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_typeParam1431);
            typeList();

            state._fsp--;
            if (state.failed) return ;
            match(input,GT,FOLLOW_GT_in_typeParam1433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, typeParam_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeParam"


    // $ANTLR start "typeParamOpt"
    // C:\\antlr\\TinyHaxeTry1.g:116:1: typeParamOpt : ( typeParam | );
    public final void typeParamOpt() throws RecognitionException {
        int typeParamOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:116:19: ( typeParam | )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LT) ) {
                alt20=1;
            }
            else if ( (LA20_0==EXTENDS||LA20_0==IMPLEMENTS||LA20_0==LPAREN||LA20_0==LBRACE) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:116:21: typeParam
                    {
                    pushFollow(FOLLOW_typeParam_in_typeParamOpt1447);
                    typeParam();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:119:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, typeParamOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeParamOpt"


    // $ANTLR start "typeConstraint"
    // C:\\antlr\\TinyHaxeTry1.g:120:1: typeConstraint : IDENTIFIER ':' '(' typeList ')' ;
    public final void typeConstraint() throws RecognitionException {
        int typeConstraint_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:120:19: ( IDENTIFIER ':' '(' typeList ')' )
            // C:\\antlr\\TinyHaxeTry1.g:120:20: IDENTIFIER ':' '(' typeList ')'
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typeConstraint1472); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_typeConstraint1474); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_typeConstraint1476); if (state.failed) return ;
            pushFollow(FOLLOW_typeList_in_typeConstraint1478);
            typeList();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_typeConstraint1480); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, typeConstraint_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeConstraint"


    // $ANTLR start "statement"
    // C:\\antlr\\TinyHaxeTry1.g:128:1: statement : ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:129:5: ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' )
            int alt25=14;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:129:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement1505);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:130:9: 'if' parExpression statement ( 'else' statement )?
                    {
                    match(input,IF,FOLLOW_IF_in_statement1515); if (state.failed) return ;
                    pushFollow(FOLLOW_parExpression_in_statement1517);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1519);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:130:38: ( 'else' statement )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ELSE) ) {
                        int LA21_1 = input.LA(2);

                        if ( (synpred41_TinyHaxeTry1()) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:130:39: 'else' statement
                            {
                            match(input,ELSE,FOLLOW_ELSE_in_statement1522); if (state.failed) return ;
                            pushFollow(FOLLOW_statement_in_statement1524);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:131:9: forStmt
                    {
                    pushFollow(FOLLOW_forStmt_in_statement1546);
                    forStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:132:9: 'while' parExpression statement
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement1556); if (state.failed) return ;
                    pushFollow(FOLLOW_parExpression_in_statement1558);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1560);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:133:9: 'do' statement 'while' parExpression ';'
                    {
                    match(input,DO,FOLLOW_DO_in_statement1570); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1572);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,WHILE,FOLLOW_WHILE_in_statement1574); if (state.failed) return ;
                    pushFollow(FOLLOW_parExpression_in_statement1576);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_statement1578); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:134:9: tryStmt
                    {
                    pushFollow(FOLLOW_tryStmt_in_statement1588);
                    tryStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:136:6: switchStmt
                    {
                    pushFollow(FOLLOW_switchStmt_in_statement1598);
                    switchStmt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:137:9: 'return' ( expr )? ';'
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement1608); if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:137:18: ( expr )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=IDENTIFIER && LA22_0<=STRINGLITERAL)||LA22_0==NEW||(LA22_0>=NULL && LA22_0<=LPAREN)||LA22_0==LBRACE||LA22_0==LBRACKET||(LA22_0>=BANG && LA22_0<=TILDE)||(LA22_0>=PLUSPLUS && LA22_0<=SUBSUB)||LA22_0==SUB||LA22_0==132||LA22_0==145) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:137:19: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement1611);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement1615); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\antlr\\TinyHaxeTry1.g:138:9: 'throw' expr ';'
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement1625); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_statement1627);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_statement1629); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\antlr\\TinyHaxeTry1.g:139:9: 'break' ( IDENTIFIER )? ';'
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement1639); if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:139:17: ( IDENTIFIER )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==IDENTIFIER) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:139:18: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1642); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement1646); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\antlr\\TinyHaxeTry1.g:140:9: 'continue' ( IDENTIFIER )? ';'
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement1656); if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:140:20: ( IDENTIFIER )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==IDENTIFIER) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:140:21: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1659); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,SEMI,FOLLOW_SEMI_in_statement1663); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // C:\\antlr\\TinyHaxeTry1.g:141:9: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement1673);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_statement1676); if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // C:\\antlr\\TinyHaxeTry1.g:142:9: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement1691); if (state.failed) return ;
                    match(input,COLON,FOLLOW_COLON_in_statement1693); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_statement1695);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // C:\\antlr\\TinyHaxeTry1.g:143:9: ';'
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement1705); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "parExpression"
    // C:\\antlr\\TinyHaxeTry1.g:146:1: parExpression : '(' expr ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:147:5: ( '(' expr ')' )
            // C:\\antlr\\TinyHaxeTry1.g:147:9: '(' expr ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_parExpression1729); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_parExpression1731);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_parExpression1733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parExpression"


    // $ANTLR start "block"
    // C:\\antlr\\TinyHaxeTry1.g:167:1: block : '{' ( blockStmt )* '}' ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:167:15: ( '{' ( blockStmt )* '}' )
            // C:\\antlr\\TinyHaxeTry1.g:167:17: '{' ( blockStmt )* '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_block1756); if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:167:21: ( blockStmt )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=IDENTIFIER && LA26_0<=STRINGLITERAL)||LA26_0==BREAK||LA26_0==CLASS||LA26_0==CONTINUE||LA26_0==DO||LA26_0==FOR||LA26_0==IF||LA26_0==NEW||LA26_0==PRIVATE||(LA26_0>=PUBLIC && LA26_0<=RETURN)||LA26_0==STATIC||LA26_0==SWITCH||LA26_0==THROW||LA26_0==TRY||LA26_0==WHILE||(LA26_0>=NULL && LA26_0<=LPAREN)||LA26_0==LBRACE||LA26_0==LBRACKET||LA26_0==SEMI||(LA26_0>=BANG && LA26_0<=TILDE)||(LA26_0>=PLUSPLUS && LA26_0<=SUBSUB)||LA26_0==SUB||(LA26_0>=126 && LA26_0<=128)||LA26_0==132||(LA26_0>=145 && LA26_0<=146)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:167:22: blockStmt
            	    {
            	    pushFollow(FOLLOW_blockStmt_in_block1759);
            	    blockStmt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match(input,RBRACE,FOLLOW_RBRACE_in_block1763); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, block_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "blockStmt"
    // C:\\antlr\\TinyHaxeTry1.g:169:1: blockStmt : ( varDecl | classDecl | statement );
    public final void blockStmt() throws RecognitionException {
        int blockStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:170:2: ( varDecl | classDecl | statement )
            int alt27=3;
            switch ( input.LA(1) ) {
            case PRIVATE:
            case PUBLIC:
            case STATIC:
            case 126:
            case 127:
            case 128:
            case 146:
                {
                alt27=1;
                }
                break;
            case CLASS:
                {
                alt27=2;
                }
                break;
            case IDENTIFIER:
            case STRINGLITERAL:
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
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:170:4: varDecl
                    {
                    pushFollow(FOLLOW_varDecl_in_blockStmt1773);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:171:4: classDecl
                    {
                    pushFollow(FOLLOW_classDecl_in_blockStmt1778);
                    classDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:172:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStmt1783);
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
        return ;
    }
    // $ANTLR end "blockStmt"


    // $ANTLR start "forStmt"
    // C:\\antlr\\TinyHaxeTry1.g:182:1: forStmt : 'for' '(' expr 'in' expr ')' statement ;
    public final void forStmt() throws RecognitionException {
        int forStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:182:19: ( 'for' '(' expr 'in' expr ')' statement )
            // C:\\antlr\\TinyHaxeTry1.g:182:21: 'for' '(' expr 'in' expr ')' statement
            {
            match(input,FOR,FOLLOW_FOR_in_forStmt1854); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_forStmt1856); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_forStmt1858);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,139,FOLLOW_139_in_forStmt1860); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_forStmt1862);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_forStmt1864); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_forStmt1866);
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
        return ;
    }
    // $ANTLR end "forStmt"


    // $ANTLR start "breakStmt"
    // C:\\antlr\\TinyHaxeTry1.g:190:1: breakStmt : 'break' ';' ;
    public final void breakStmt() throws RecognitionException {
        int breakStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:190:19: ( 'break' ';' )
            // C:\\antlr\\TinyHaxeTry1.g:190:21: 'break' ';'
            {
            match(input,BREAK,FOLLOW_BREAK_in_breakStmt1893); if (state.failed) return ;
            match(input,SEMI,FOLLOW_SEMI_in_breakStmt1895); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, breakStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "breakStmt"


    // $ANTLR start "continueStmt"
    // C:\\antlr\\TinyHaxeTry1.g:192:1: continueStmt : 'continue' ';' ;
    public final void continueStmt() throws RecognitionException {
        int continueStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:192:19: ( 'continue' ';' )
            // C:\\antlr\\TinyHaxeTry1.g:192:21: 'continue' ';'
            {
            match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStmt1909); if (state.failed) return ;
            match(input,SEMI,FOLLOW_SEMI_in_continueStmt1911); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, continueStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "continueStmt"


    // $ANTLR start "caseStmt"
    // C:\\antlr\\TinyHaxeTry1.g:194:1: caseStmt : 'case' exprList ':' ;
    public final void caseStmt() throws RecognitionException {
        int caseStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:194:19: ( 'case' exprList ':' )
            // C:\\antlr\\TinyHaxeTry1.g:194:21: 'case' exprList ':'
            {
            match(input,CASE,FOLLOW_CASE_in_caseStmt1929); if (state.failed) return ;
            pushFollow(FOLLOW_exprList_in_caseStmt1931);
            exprList();

            state._fsp--;
            if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_caseStmt1933); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, caseStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "caseStmt"


    // $ANTLR start "defaultStmt"
    // C:\\antlr\\TinyHaxeTry1.g:196:1: defaultStmt : 'default' ':' ;
    public final void defaultStmt() throws RecognitionException {
        int defaultStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:196:19: ( 'default' ':' )
            // C:\\antlr\\TinyHaxeTry1.g:196:21: 'default' ':'
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultStmt1948); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_defaultStmt1950); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, defaultStmt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "defaultStmt"


    // $ANTLR start "switchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:198:1: switchStmt : 'switch' '(' expr ')' block ;
    public final void switchStmt() throws RecognitionException {
        int switchStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:198:19: ( 'switch' '(' expr ')' block )
            // C:\\antlr\\TinyHaxeTry1.g:198:21: 'switch' '(' expr ')' block
            {
            match(input,SWITCH,FOLLOW_SWITCH_in_switchStmt1966); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_switchStmt1968); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_switchStmt1970);
            expr();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_switchStmt1972); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_switchStmt1974);
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
        return ;
    }
    // $ANTLR end "switchStmt"


    // $ANTLR start "tryStmt"
    // C:\\antlr\\TinyHaxeTry1.g:202:1: tryStmt : 'try' block catchStmtList ;
    public final void tryStmt() throws RecognitionException {
        int tryStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:202:19: ( 'try' block catchStmtList )
            // C:\\antlr\\TinyHaxeTry1.g:202:21: 'try' block catchStmtList
            {
            match(input,TRY,FOLLOW_TRY_in_tryStmt1995); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_tryStmt1997);
            block();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_catchStmtList_in_tryStmt1999);
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
        return ;
    }
    // $ANTLR end "tryStmt"


    // $ANTLR start "catchStmtList"
    // C:\\antlr\\TinyHaxeTry1.g:204:1: catchStmtList : catchStmt catchStmtList ;
    public final void catchStmtList() throws RecognitionException {
        int catchStmtList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:204:19: ( catchStmt catchStmtList )
            // C:\\antlr\\TinyHaxeTry1.g:204:21: catchStmt catchStmtList
            {
            pushFollow(FOLLOW_catchStmt_in_catchStmtList2012);
            catchStmt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_catchStmtList_in_catchStmtList2014);
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
        return ;
    }
    // $ANTLR end "catchStmtList"


    // $ANTLR start "catchStmt"
    // C:\\antlr\\TinyHaxeTry1.g:207:1: catchStmt : 'catch' '(' param ')' block ;
    public final void catchStmt() throws RecognitionException {
        int catchStmt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:207:19: ( 'catch' '(' param ')' block )
            // C:\\antlr\\TinyHaxeTry1.g:207:21: 'catch' '(' param ')' block
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchStmt2041); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_catchStmt2043); if (state.failed) return ;
            pushFollow(FOLLOW_param_in_catchStmt2045);
            param();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_catchStmt2047); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_catchStmt2049);
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
        return ;
    }
    // $ANTLR end "catchStmt"


    // $ANTLR start "exprListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:211:1: exprListOpt : ( exprList | );
    public final void exprListOpt() throws RecognitionException {
        int exprListOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:211:19: ( exprList | )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IDENTIFIER && LA28_0<=STRINGLITERAL)||LA28_0==NEW||(LA28_0>=NULL && LA28_0<=LPAREN)||LA28_0==LBRACE||LA28_0==LBRACKET||(LA28_0>=BANG && LA28_0<=TILDE)||(LA28_0>=PLUSPLUS && LA28_0<=SUBSUB)||LA28_0==SUB||LA28_0==132||LA28_0==145) ) {
                alt28=1;
            }
            else if ( (LA28_0==RPAREN||LA28_0==RBRACKET) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:211:21: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_exprListOpt2066);
                    exprList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:213:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, exprListOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exprListOpt"


    // $ANTLR start "exprList"
    // C:\\antlr\\TinyHaxeTry1.g:214:1: exprList : ( expr ) ( ',' expr )* ;
    public final void exprList() throws RecognitionException {
        int exprList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:214:19: ( ( expr ) ( ',' expr )* )
            // C:\\antlr\\TinyHaxeTry1.g:214:21: ( expr ) ( ',' expr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:214:21: ( expr )
            // C:\\antlr\\TinyHaxeTry1.g:214:22: expr
            {
            pushFollow(FOLLOW_expr_in_exprList2107);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:214:28: ( ',' expr )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==COMMA) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:214:29: ',' expr
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprList2111); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_exprList2113);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, exprList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "exprList"


    // $ANTLR start "expr"
    // C:\\antlr\\TinyHaxeTry1.g:216:1: expr : assignExpr ;
    public final void expr() throws RecognitionException {
        int expr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:216:19: ( assignExpr )
            // C:\\antlr\\TinyHaxeTry1.g:216:21: assignExpr
            {
            pushFollow(FOLLOW_assignExpr_in_expr2137);
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
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "assignExpr"
    // C:\\antlr\\TinyHaxeTry1.g:218:1: assignExpr : iterExpr ( assignOp iterExpr )* ;
    public final void assignExpr() throws RecognitionException {
        int assignExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:218:19: ( iterExpr ( assignOp iterExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:218:21: iterExpr ( assignOp iterExpr )*
            {
            pushFollow(FOLLOW_iterExpr_in_assignExpr2153);
            iterExpr();

            state._fsp--;
            if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:218:30: ( assignOp iterExpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==EQ||(LA30_0>=PLUSEQ && LA30_0<=PERCENTEQ)||(LA30_0>=129 && LA30_0<=131)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:218:31: assignOp iterExpr
            	    {
            	    pushFollow(FOLLOW_assignOp_in_assignExpr2156);
            	    assignOp();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_iterExpr_in_assignExpr2158);
            	    iterExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, assignExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignExpr"


    // $ANTLR start "iterExpr"
    // C:\\antlr\\TinyHaxeTry1.g:220:1: iterExpr : ternaryExpr ( '...' ternaryExpr )? ;
    public final void iterExpr() throws RecognitionException {
        int iterExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:220:19: ( ternaryExpr ( '...' ternaryExpr )? )
            // C:\\antlr\\TinyHaxeTry1.g:220:21: ternaryExpr ( '...' ternaryExpr )?
            {
            pushFollow(FOLLOW_ternaryExpr_in_iterExpr2178);
            ternaryExpr();

            state._fsp--;
            if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:220:33: ( '...' ternaryExpr )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ELLIPSIS) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:220:34: '...' ternaryExpr
                    {
                    match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_iterExpr2181); if (state.failed) return ;
                    pushFollow(FOLLOW_ternaryExpr_in_iterExpr2183);
                    ternaryExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, iterExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "iterExpr"


    // $ANTLR start "ternaryExpr"
    // C:\\antlr\\TinyHaxeTry1.g:222:1: ternaryExpr : logicOrExpr ( '?' expr ':' logicOrExpr )* ;
    public final void ternaryExpr() throws RecognitionException {
        int ternaryExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:222:19: ( logicOrExpr ( '?' expr ':' logicOrExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:222:21: logicOrExpr ( '?' expr ':' logicOrExpr )*
            {
            pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2206);
            logicOrExpr();

            state._fsp--;
            if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:222:33: ( '?' expr ':' logicOrExpr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==QUES) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:222:34: '?' expr ':' logicOrExpr
            	    {
            	    match(input,QUES,FOLLOW_QUES_in_ternaryExpr2209); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_ternaryExpr2211);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,COLON,FOLLOW_COLON_in_ternaryExpr2213); if (state.failed) return ;
            	    pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2215);
            	    logicOrExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, ternaryExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "ternaryExpr"


    // $ANTLR start "logicOrExpr"
    // C:\\antlr\\TinyHaxeTry1.g:229:1: logicOrExpr : ( logicAndExpr ) ( '||' logicAndExpr )* ;
    public final void logicOrExpr() throws RecognitionException {
        int logicOrExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:229:19: ( ( logicAndExpr ) ( '||' logicAndExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:229:21: ( logicAndExpr ) ( '||' logicAndExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:229:21: ( logicAndExpr )
            // C:\\antlr\\TinyHaxeTry1.g:229:22: logicAndExpr
            {
            pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2249);
            logicAndExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:229:36: ( '||' logicAndExpr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==BARBAR) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:229:37: '||' logicAndExpr
            	    {
            	    match(input,BARBAR,FOLLOW_BARBAR_in_logicOrExpr2253); if (state.failed) return ;
            	    pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2255);
            	    logicAndExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, logicOrExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicOrExpr"


    // $ANTLR start "logicAndExpr"
    // C:\\antlr\\TinyHaxeTry1.g:231:1: logicAndExpr : ( cmpExpr ) ( '&&' cmpExpr )* ;
    public final void logicAndExpr() throws RecognitionException {
        int logicAndExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:231:19: ( ( cmpExpr ) ( '&&' cmpExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:231:21: ( cmpExpr ) ( '&&' cmpExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:231:21: ( cmpExpr )
            // C:\\antlr\\TinyHaxeTry1.g:231:22: cmpExpr
            {
            pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2272);
            cmpExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:231:31: ( '&&' cmpExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AMPAMP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:231:32: '&&' cmpExpr
            	    {
            	    match(input,AMPAMP,FOLLOW_AMPAMP_in_logicAndExpr2276); if (state.failed) return ;
            	    pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2278);
            	    cmpExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, logicAndExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicAndExpr"


    // $ANTLR start "cmpExpr"
    // C:\\antlr\\TinyHaxeTry1.g:233:1: cmpExpr : ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )* ;
    public final void cmpExpr() throws RecognitionException {
        int cmpExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:233:19: ( ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:233:21: ( bitExpr ) ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:233:21: ( bitExpr )
            // C:\\antlr\\TinyHaxeTry1.g:233:22: bitExpr
            {
            pushFollow(FOLLOW_bitExpr_in_cmpExpr2300);
            bitExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:233:31: ( '==' bitExpr | '!=' bitExpr | '>=' bitExpr | '<=' bitExpr | '>' bitExpr | '<' bitExpr )*
            loop35:
            do {
                int alt35=7;
                switch ( input.LA(1) ) {
                case EQEQ:
                    {
                    alt35=1;
                    }
                    break;
                case BANGEQ:
                    {
                    alt35=2;
                    }
                    break;
                case 140:
                    {
                    alt35=3;
                    }
                    break;
                case 141:
                    {
                    alt35=4;
                    }
                    break;
                case GT:
                    {
                    alt35=5;
                    }
                    break;
                case LT:
                    {
                    alt35=6;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:32: '==' bitExpr
            	    {
            	    match(input,EQEQ,FOLLOW_EQEQ_in_cmpExpr2304); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2306);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:47: '!=' bitExpr
            	    {
            	    match(input,BANGEQ,FOLLOW_BANGEQ_in_cmpExpr2310); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2312);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:62: '>=' bitExpr
            	    {
            	    match(input,140,FOLLOW_140_in_cmpExpr2316); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2318);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:77: '<=' bitExpr
            	    {
            	    match(input,141,FOLLOW_141_in_cmpExpr2322); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2324);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:92: '>' bitExpr
            	    {
            	    match(input,GT,FOLLOW_GT_in_cmpExpr2328); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2331);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // C:\\antlr\\TinyHaxeTry1.g:233:107: '<' bitExpr
            	    {
            	    match(input,LT,FOLLOW_LT_in_cmpExpr2335); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitExpr_in_cmpExpr2338);
            	    bitExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, cmpExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cmpExpr"


    // $ANTLR start "bitExpr"
    // C:\\antlr\\TinyHaxeTry1.g:235:1: bitExpr : ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )* ;
    public final void bitExpr() throws RecognitionException {
        int bitExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:235:19: ( ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:235:21: ( shiftExpr ) ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:235:21: ( shiftExpr )
            // C:\\antlr\\TinyHaxeTry1.g:235:22: shiftExpr
            {
            pushFollow(FOLLOW_shiftExpr_in_bitExpr2360);
            shiftExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:235:33: ( '|' shiftExpr | '&' shiftExpr | '^' shiftExpr )*
            loop36:
            do {
                int alt36=4;
                switch ( input.LA(1) ) {
                case BAR:
                    {
                    alt36=1;
                    }
                    break;
                case AMP:
                    {
                    alt36=2;
                    }
                    break;
                case CARET:
                    {
                    alt36=3;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:235:34: '|' shiftExpr
            	    {
            	    match(input,BAR,FOLLOW_BAR_in_bitExpr2364); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2366);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:235:50: '&' shiftExpr
            	    {
            	    match(input,AMP,FOLLOW_AMP_in_bitExpr2370); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2372);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:235:66: '^' shiftExpr
            	    {
            	    match(input,CARET,FOLLOW_CARET_in_bitExpr2376); if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpr_in_bitExpr2378);
            	    shiftExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, bitExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitExpr"


    // $ANTLR start "shiftExpr"
    // C:\\antlr\\TinyHaxeTry1.g:237:1: shiftExpr : ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )* ;
    public final void shiftExpr() throws RecognitionException {
        int shiftExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:237:19: ( ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:237:21: ( addExpr ) ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:237:21: ( addExpr )
            // C:\\antlr\\TinyHaxeTry1.g:237:22: addExpr
            {
            pushFollow(FOLLOW_addExpr_in_shiftExpr2398);
            addExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:237:31: ( '<<' addExpr | '>>' addExpr | '>>>' addExpr )*
            loop37:
            do {
                int alt37=4;
                switch ( input.LA(1) ) {
                case 142:
                    {
                    alt37=1;
                    }
                    break;
                case 143:
                    {
                    alt37=2;
                    }
                    break;
                case 144:
                    {
                    alt37=3;
                    }
                    break;

                }

                switch (alt37) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:237:32: '<<' addExpr
            	    {
            	    match(input,142,FOLLOW_142_in_shiftExpr2402); if (state.failed) return ;
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2405);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:237:48: '>>' addExpr
            	    {
            	    match(input,143,FOLLOW_143_in_shiftExpr2409); if (state.failed) return ;
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2412);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:237:64: '>>>' addExpr
            	    {
            	    match(input,144,FOLLOW_144_in_shiftExpr2416); if (state.failed) return ;
            	    pushFollow(FOLLOW_addExpr_in_shiftExpr2418);
            	    addExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, shiftExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "shiftExpr"


    // $ANTLR start "addExpr"
    // C:\\antlr\\TinyHaxeTry1.g:263:1: addExpr : ( multExpr ) ( '+' multExpr | '-' multExpr )* ;
    public final void addExpr() throws RecognitionException {
        int addExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:263:19: ( ( multExpr ) ( '+' multExpr | '-' multExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:263:21: ( multExpr ) ( '+' multExpr | '-' multExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:263:21: ( multExpr )
            // C:\\antlr\\TinyHaxeTry1.g:263:22: multExpr
            {
            pushFollow(FOLLOW_multExpr_in_addExpr2443);
            multExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:263:32: ( '+' multExpr | '-' multExpr )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==PLUS) ) {
                    alt38=1;
                }
                else if ( (LA38_0==SUB) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:263:33: '+' multExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_addExpr2447); if (state.failed) return ;
            	    pushFollow(FOLLOW_multExpr_in_addExpr2449);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:263:48: '-' multExpr
            	    {
            	    match(input,SUB,FOLLOW_SUB_in_addExpr2453); if (state.failed) return ;
            	    pushFollow(FOLLOW_multExpr_in_addExpr2455);
            	    multExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, addExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "addExpr"


    // $ANTLR start "multExpr"
    // C:\\antlr\\TinyHaxeTry1.g:265:1: multExpr : ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )* ;
    public final void multExpr() throws RecognitionException {
        int multExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:265:19: ( ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )* )
            // C:\\antlr\\TinyHaxeTry1.g:265:21: ( prefixExpr ) ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:265:21: ( prefixExpr )
            // C:\\antlr\\TinyHaxeTry1.g:265:22: prefixExpr
            {
            pushFollow(FOLLOW_prefixExpr_in_multExpr2476);
            prefixExpr();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:265:34: ( '*' prefixExpr | '/' prefixExpr | '%' prefixExpr )*
            loop39:
            do {
                int alt39=4;
                switch ( input.LA(1) ) {
                case STAR:
                    {
                    alt39=1;
                    }
                    break;
                case SLASH:
                    {
                    alt39=2;
                    }
                    break;
                case PERCENT:
                    {
                    alt39=3;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:265:35: '*' prefixExpr
            	    {
            	    match(input,STAR,FOLLOW_STAR_in_multExpr2480); if (state.failed) return ;
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2482);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:265:52: '/' prefixExpr
            	    {
            	    match(input,SLASH,FOLLOW_SLASH_in_multExpr2486); if (state.failed) return ;
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2488);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:265:69: '%' prefixExpr
            	    {
            	    match(input,PERCENT,FOLLOW_PERCENT_in_multExpr2492); if (state.failed) return ;
            	    pushFollow(FOLLOW_prefixExpr_in_multExpr2494);
            	    prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, multExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multExpr"


    // $ANTLR start "prefixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:267:1: prefixExpr : ( ( '-' | '--' | '++' | '!' | '~' ) prefixExpr | newExpr | cast | suffixExpr | funcCallExpr );
    public final void prefixExpr() throws RecognitionException {
        int prefixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:267:19: ( ( '-' | '--' | '++' | '!' | '~' ) prefixExpr | newExpr | cast | suffixExpr | funcCallExpr )
            int alt40=5;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:267:21: ( '-' | '--' | '++' | '!' | '~' ) prefixExpr
                    {
                    if ( (input.LA(1)>=BANG && input.LA(1)<=TILDE)||(input.LA(1)>=PLUSPLUS && input.LA(1)<=SUBSUB)||input.LA(1)==SUB ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr2524);
                    prefixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:268:25: newExpr
                    {
                    pushFollow(FOLLOW_newExpr_in_prefixExpr2550);
                    newExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:269:25: cast
                    {
                    pushFollow(FOLLOW_cast_in_prefixExpr2576);
                    cast();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:270:25: suffixExpr
                    {
                    pushFollow(FOLLOW_suffixExpr_in_prefixExpr2602);
                    suffixExpr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:271:23: funcCallExpr
                    {
                    pushFollow(FOLLOW_funcCallExpr_in_prefixExpr2626);
                    funcCallExpr();

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
        return ;
    }
    // $ANTLR end "prefixExpr"


    // $ANTLR start "funcCallExpr"
    // C:\\antlr\\TinyHaxeTry1.g:274:1: funcCallExpr : IDENTIFIER '(' exprListOpt ')' ;
    public final void funcCallExpr() throws RecognitionException {
        int funcCallExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:274:14: ( IDENTIFIER '(' exprListOpt ')' )
            // C:\\antlr\\TinyHaxeTry1.g:274:15: IDENTIFIER '(' exprListOpt ')'
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcCallExpr2636); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_funcCallExpr2638); if (state.failed) return ;
            pushFollow(FOLLOW_exprListOpt_in_funcCallExpr2639);
            exprListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_funcCallExpr2641); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, funcCallExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcCallExpr"


    // $ANTLR start "suffixExpr"
    // C:\\antlr\\TinyHaxeTry1.g:276:1: suffixExpr : ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )* ;
    public final void suffixExpr() throws RecognitionException {
        int suffixExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:276:19: ( ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )* )
            // C:\\antlr\\TinyHaxeTry1.g:276:21: ( value ) ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:276:21: ( value )
            // C:\\antlr\\TinyHaxeTry1.g:276:22: value
            {
            pushFollow(FOLLOW_value_in_suffixExpr2657);
            value();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:276:29: ( '(' exprListOpt ')' | '.' IDENTIFIER | '[' expr ']' | '++' | '--' )*
            loop41:
            do {
                int alt41=6;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt41=1;
                    }
                    break;
                case DOT:
                    {
                    alt41=2;
                    }
                    break;
                case LBRACKET:
                    {
                    alt41=3;
                    }
                    break;
                case PLUSPLUS:
                    {
                    alt41=4;
                    }
                    break;
                case SUBSUB:
                    {
                    alt41=5;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:276:30: '(' exprListOpt ')'
            	    {
            	    match(input,LPAREN,FOLLOW_LPAREN_in_suffixExpr2661); if (state.failed) return ;
            	    pushFollow(FOLLOW_exprListOpt_in_suffixExpr2663);
            	    exprListOpt();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,RPAREN,FOLLOW_RPAREN_in_suffixExpr2665); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:276:52: '.' IDENTIFIER
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_suffixExpr2669); if (state.failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_suffixExpr2670); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C:\\antlr\\TinyHaxeTry1.g:276:68: '[' expr ']'
            	    {
            	    match(input,LBRACKET,FOLLOW_LBRACKET_in_suffixExpr2674); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_suffixExpr2676);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,RBRACKET,FOLLOW_RBRACKET_in_suffixExpr2678); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // C:\\antlr\\TinyHaxeTry1.g:276:83: '++'
            	    {
            	    match(input,PLUSPLUS,FOLLOW_PLUSPLUS_in_suffixExpr2682); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // C:\\antlr\\TinyHaxeTry1.g:276:90: '--'
            	    {
            	    match(input,SUBSUB,FOLLOW_SUBSUB_in_suffixExpr2686); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, suffixExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "suffixExpr"


    // $ANTLR start "value"
    // C:\\antlr\\TinyHaxeTry1.g:278:1: value : ( funcLit | arrayLit | objLit | 'null' | IDENTIFIER | STRINGLITERAL | '(' ( expr | statement ) ')' );
    public final void value() throws RecognitionException {
        int value_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:278:14: ( funcLit | arrayLit | objLit | 'null' | IDENTIFIER | STRINGLITERAL | '(' ( expr | statement ) ')' )
            int alt43=7;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt43=1;
                }
                break;
            case LBRACKET:
                {
                alt43=2;
                }
                break;
            case LBRACE:
                {
                alt43=3;
                }
                break;
            case NULL:
                {
                alt43=4;
                }
                break;
            case IDENTIFIER:
                {
                alt43=5;
                }
                break;
            case STRINGLITERAL:
                {
                alt43=6;
                }
                break;
            case LPAREN:
                {
                alt43=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:283:24: funcLit
                    {
                    pushFollow(FOLLOW_funcLit_in_value2728);
                    funcLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:284:25: arrayLit
                    {
                    pushFollow(FOLLOW_arrayLit_in_value2755);
                    arrayLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:285:25: objLit
                    {
                    pushFollow(FOLLOW_objLit_in_value2781);
                    objLit();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:286:25: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_value2807); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:287:24: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_value2832); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:288:22: STRINGLITERAL
                    {
                    match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_value2855); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:290:25: '(' ( expr | statement ) ')'
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_value2890); if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:290:29: ( expr | statement )
                    int alt42=2;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:290:30: expr
                            {
                            pushFollow(FOLLOW_expr_in_value2893);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:290:35: statement
                            {
                            pushFollow(FOLLOW_statement_in_value2895);
                            statement();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_value2898); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, value_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "value"


    // $ANTLR start "newExpr"
    // C:\\antlr\\TinyHaxeTry1.g:293:1: newExpr : 'new' type '(' exprListOpt ')' ;
    public final void newExpr() throws RecognitionException {
        int newExpr_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:293:19: ( 'new' type '(' exprListOpt ')' )
            // C:\\antlr\\TinyHaxeTry1.g:293:21: 'new' type '(' exprListOpt ')'
            {
            match(input,NEW,FOLLOW_NEW_in_newExpr2933); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_newExpr2935);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_newExpr2937); if (state.failed) return ;
            pushFollow(FOLLOW_exprListOpt_in_newExpr2939);
            exprListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_newExpr2941); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, newExpr_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "newExpr"


    // $ANTLR start "cast"
    // C:\\antlr\\TinyHaxeTry1.g:295:1: cast : 'cast' '(' expr ( ',' funcType )? ')' ;
    public final void cast() throws RecognitionException {
        int cast_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:295:19: ( 'cast' '(' expr ( ',' funcType )? ')' )
            // C:\\antlr\\TinyHaxeTry1.g:295:21: 'cast' '(' expr ( ',' funcType )? ')'
            {
            match(input,145,FOLLOW_145_in_cast2963); if (state.failed) return ;
            match(input,LPAREN,FOLLOW_LPAREN_in_cast2965); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_cast2967);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:295:37: ( ',' funcType )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COMMA) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:295:38: ',' funcType
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_cast2970); if (state.failed) return ;
                    pushFollow(FOLLOW_funcType_in_cast2972);
                    funcType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_cast2976); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, cast_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "cast"


    // $ANTLR start "topLevelDecl"
    // C:\\antlr\\TinyHaxeTry1.g:300:1: topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
    public final void topLevelDecl() throws RecognitionException {
        int topLevelDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:300:19: ( classDecl | interfaceDecl | enumDecl | typedefDecl )
            int alt45=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt45=1;
                }
                break;
            case INTERFACE:
                {
                alt45=2;
                }
                break;
            case ENUM:
                {
                alt45=3;
                }
                break;
            case 147:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:300:21: classDecl
                    {
                    pushFollow(FOLLOW_classDecl_in_topLevelDecl2993);
                    classDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:301:25: interfaceDecl
                    {
                    pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3019);
                    interfaceDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:302:25: enumDecl
                    {
                    pushFollow(FOLLOW_enumDecl_in_topLevelDecl3045);
                    enumDecl();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:303:25: typedefDecl
                    {
                    pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3071);
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
            if ( state.backtracking>0 ) { memoize(input, 62, topLevelDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "topLevelDecl"


    // $ANTLR start "enumDecl"
    // C:\\antlr\\TinyHaxeTry1.g:305:1: enumDecl : 'enum' IDENTIFIER typeParamOpt '{' enumBody '}' ;
    public final void enumDecl() throws RecognitionException {
        int enumDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:305:19: ( 'enum' IDENTIFIER typeParamOpt '{' enumBody '}' )
            // C:\\antlr\\TinyHaxeTry1.g:305:21: 'enum' IDENTIFIER typeParamOpt '{' enumBody '}'
            {
            match(input,ENUM,FOLLOW_ENUM_in_enumDecl3089); if (state.failed) return ;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumDecl3090); if (state.failed) return ;
            pushFollow(FOLLOW_typeParamOpt_in_enumDecl3092);
            typeParamOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,LBRACE,FOLLOW_LBRACE_in_enumDecl3094); if (state.failed) return ;
            pushFollow(FOLLOW_enumBody_in_enumDecl3096);
            enumBody();

            state._fsp--;
            if (state.failed) return ;
            match(input,RBRACE,FOLLOW_RBRACE_in_enumDecl3098); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, enumDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumDecl"


    // $ANTLR start "enumBody"
    // C:\\antlr\\TinyHaxeTry1.g:307:1: enumBody : ( enumValueDecl )+ ;
    public final void enumBody() throws RecognitionException {
        int enumBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:307:19: ( ( enumValueDecl )+ )
            // C:\\antlr\\TinyHaxeTry1.g:307:21: ( enumValueDecl )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:307:21: ( enumValueDecl )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==IDENTIFIER||(LA46_0>=133 && LA46_0<=137)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:307:22: enumValueDecl
            	    {
            	    pushFollow(FOLLOW_enumValueDecl_in_enumBody3117);
            	    enumValueDecl();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, enumBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumBody"


    // $ANTLR start "enumValueDecl"
    // C:\\antlr\\TinyHaxeTry1.g:309:1: enumValueDecl : ( IDENTIFIER '(' paramListOpt ')' ';' | IDENTIFIER ';' | pp );
    public final void enumValueDecl() throws RecognitionException {
        int enumValueDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:309:19: ( IDENTIFIER '(' paramListOpt ')' ';' | IDENTIFIER ';' | pp )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENTIFIER) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==LPAREN) ) {
                    alt47=1;
                }
                else if ( (LA47_1==SEMI) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA47_0>=133 && LA47_0<=137)) ) {
                alt47=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:309:20: IDENTIFIER '(' paramListOpt ')' ';'
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3131); if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_enumValueDecl3133); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_enumValueDecl3135);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_enumValueDecl3137); if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3139); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:310:24: IDENTIFIER ';'
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumValueDecl3164); if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_enumValueDecl3166); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:311:25: pp
                    {
                    pushFollow(FOLLOW_pp_in_enumValueDecl3192);
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
            if ( state.backtracking>0 ) { memoize(input, 65, enumValueDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "enumValueDecl"


    // $ANTLR start "varDeclList"
    // C:\\antlr\\TinyHaxeTry1.g:313:1: varDeclList : varDecl varDeclList ;
    public final void varDeclList() throws RecognitionException {
        int varDeclList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:313:19: ( varDecl varDeclList )
            // C:\\antlr\\TinyHaxeTry1.g:313:21: varDecl varDeclList
            {
            pushFollow(FOLLOW_varDecl_in_varDeclList3207);
            varDecl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_varDeclList_in_varDeclList3209);
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
            if ( state.backtracking>0 ) { memoize(input, 66, varDeclList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varDeclList"


    // $ANTLR start "varDecl"
    // C:\\antlr\\TinyHaxeTry1.g:315:1: varDecl : ( declAttrList 'var' varDeclPartList ';' | 'var' varDeclPartList ';' );
    public final void varDecl() throws RecognitionException {
        int varDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:315:19: ( declAttrList 'var' varDeclPartList ';' | 'var' varDeclPartList ';' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==PRIVATE||LA48_0==PUBLIC||LA48_0==STATIC||(LA48_0>=126 && LA48_0<=128)) ) {
                alt48=1;
            }
            else if ( (LA48_0==146) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:315:21: declAttrList 'var' varDeclPartList ';'
                    {
                    pushFollow(FOLLOW_declAttrList_in_varDecl3228);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,146,FOLLOW_146_in_varDecl3230); if (state.failed) return ;
                    pushFollow(FOLLOW_varDeclPartList_in_varDecl3232);
                    varDeclPartList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_varDecl3234); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:316:25: 'var' varDeclPartList ';'
                    {
                    match(input,146,FOLLOW_146_in_varDecl3260); if (state.failed) return ;
                    pushFollow(FOLLOW_varDeclPartList_in_varDecl3262);
                    varDeclPartList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_varDecl3264); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, varDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varDecl"


    // $ANTLR start "varDeclPartList"
    // C:\\antlr\\TinyHaxeTry1.g:318:1: varDeclPartList : ( varDeclPart ) ( ',' varDeclPart )* ;
    public final void varDeclPartList() throws RecognitionException {
        int varDeclPartList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:318:19: ( ( varDeclPart ) ( ',' varDeclPart )* )
            // C:\\antlr\\TinyHaxeTry1.g:318:21: ( varDeclPart ) ( ',' varDeclPart )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:318:21: ( varDeclPart )
            // C:\\antlr\\TinyHaxeTry1.g:318:22: varDeclPart
            {
            pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3276);
            varDeclPart();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:318:35: ( ',' varDeclPart )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:318:36: ',' varDeclPart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_varDeclPartList3280); if (state.failed) return ;
            	    pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3282);
            	    varDeclPart();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, varDeclPartList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varDeclPartList"


    // $ANTLR start "varDeclPart"
    // C:\\antlr\\TinyHaxeTry1.g:320:1: varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInitOpt ;
    public final void varDeclPart() throws RecognitionException {
        int varDeclPart_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:320:19: ( IDENTIFIER propDeclOpt typeTagOpt varInitOpt )
            // C:\\antlr\\TinyHaxeTry1.g:320:20: IDENTIFIER propDeclOpt typeTagOpt varInitOpt
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_varDeclPart3298); if (state.failed) return ;
            pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3300);
            propDeclOpt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3302);
            typeTagOpt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_varInitOpt_in_varDeclPart3304);
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
            if ( state.backtracking>0 ) { memoize(input, 69, varDeclPart_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varDeclPart"


    // $ANTLR start "propDecl"
    // C:\\antlr\\TinyHaxeTry1.g:322:1: propDecl : '(' propAccessor ',' propAccessor ')' ;
    public final void propDecl() throws RecognitionException {
        int propDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:322:19: ( '(' propAccessor ',' propAccessor ')' )
            // C:\\antlr\\TinyHaxeTry1.g:322:21: '(' propAccessor ',' propAccessor ')'
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_propDecl3322); if (state.failed) return ;
            pushFollow(FOLLOW_propAccessor_in_propDecl3324);
            propAccessor();

            state._fsp--;
            if (state.failed) return ;
            match(input,COMMA,FOLLOW_COMMA_in_propDecl3326); if (state.failed) return ;
            pushFollow(FOLLOW_propAccessor_in_propDecl3328);
            propAccessor();

            state._fsp--;
            if (state.failed) return ;
            match(input,RPAREN,FOLLOW_RPAREN_in_propDecl3330); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, propDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "propDecl"


    // $ANTLR start "propAccessor"
    // C:\\antlr\\TinyHaxeTry1.g:324:1: propAccessor : ( IDENTIFIER | 'null' | 'default' | 'dynamic' );
    public final void propAccessor() throws RecognitionException {
        int propAccessor_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:324:19: ( IDENTIFIER | 'null' | 'default' | 'dynamic' )
            // C:\\antlr\\TinyHaxeTry1.g:
            {
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==DEFAULT||input.LA(1)==NULL||input.LA(1)==127 ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, propAccessor_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "propAccessor"


    // $ANTLR start "propDeclOpt"
    // C:\\antlr\\TinyHaxeTry1.g:329:1: propDeclOpt : propDecl ;
    public final void propDeclOpt() throws RecognitionException {
        int propDeclOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:329:19: ( propDecl )
            // C:\\antlr\\TinyHaxeTry1.g:329:21: propDecl
            {
            pushFollow(FOLLOW_propDecl_in_propDeclOpt3436);
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
            if ( state.backtracking>0 ) { memoize(input, 72, propDeclOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "propDeclOpt"


    // $ANTLR start "varInitOpt"
    // C:\\antlr\\TinyHaxeTry1.g:332:1: varInitOpt : varInit ;
    public final void varInitOpt() throws RecognitionException {
        int varInitOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:332:19: ( varInit )
            // C:\\antlr\\TinyHaxeTry1.g:332:21: varInit
            {
            pushFollow(FOLLOW_varInit_in_varInitOpt3462);
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
            if ( state.backtracking>0 ) { memoize(input, 73, varInitOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varInitOpt"


    // $ANTLR start "varInit"
    // C:\\antlr\\TinyHaxeTry1.g:335:1: varInit : '=' expr ;
    public final void varInit() throws RecognitionException {
        int varInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:335:19: ( '=' expr )
            // C:\\antlr\\TinyHaxeTry1.g:335:21: '=' expr
            {
            match(input,EQ,FOLLOW_EQ_in_varInit3491); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_varInit3493);
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
            if ( state.backtracking>0 ) { memoize(input, 74, varInit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "varInit"


    // $ANTLR start "funcDecl"
    // C:\\antlr\\TinyHaxeTry1.g:337:1: funcDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block );
    public final void funcDecl() throws RecognitionException {
        int funcDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:337:19: ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block )
            int alt50=4;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:337:21: declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3511);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,132,FOLLOW_132_in_funcDecl3513); if (state.failed) return ;
                    match(input,NEW,FOLLOW_NEW_in_funcDecl3515); if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3517); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3519);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3521); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3523);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_funcDecl3525);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:338:25: declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcDecl3551);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,132,FOLLOW_132_in_funcDecl3553); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3554); if (state.failed) return ;
                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3556);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3558); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3560);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3562); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3564);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_funcDecl3566);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:339:25: 'function' 'new' '(' paramListOpt ')' typeTagOpt block
                    {
                    match(input,132,FOLLOW_132_in_funcDecl3592); if (state.failed) return ;
                    match(input,NEW,FOLLOW_NEW_in_funcDecl3594); if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3596); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3598);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3600); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3602);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_funcDecl3604);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:340:25: 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block
                    {
                    match(input,132,FOLLOW_132_in_funcDecl3630); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcDecl3631); if (state.failed) return ;
                    pushFollow(FOLLOW_typeParamOpt_in_funcDecl3633);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcDecl3635); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcDecl3637);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcDecl3639); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcDecl3641);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_funcDecl3643);
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
            if ( state.backtracking>0 ) { memoize(input, 75, funcDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcDecl"


    // $ANTLR start "funcProtoDecl"
    // C:\\antlr\\TinyHaxeTry1.g:342:1: funcProtoDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' );
    public final void funcProtoDecl() throws RecognitionException {
        int funcProtoDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:342:19: ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' )
            int alt51=4;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:342:21: declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3656);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,132,FOLLOW_132_in_funcProtoDecl3658); if (state.failed) return ;
                    match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3660); if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3662); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3664);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3666); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3668);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3670); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:343:25: declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
                    {
                    pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3696);
                    declAttrList();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,132,FOLLOW_132_in_funcProtoDecl3698); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3699); if (state.failed) return ;
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3701);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3703); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3705);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3707); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3709);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3711); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:344:25: 'function' 'new' '(' paramListOpt ')' typeTagOpt ';'
                    {
                    match(input,132,FOLLOW_132_in_funcProtoDecl3737); if (state.failed) return ;
                    match(input,NEW,FOLLOW_NEW_in_funcProtoDecl3739); if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3741); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3743);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3745); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3747);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3749); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:345:25: 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';'
                    {
                    match(input,132,FOLLOW_132_in_funcProtoDecl3775); if (state.failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_funcProtoDecl3776); if (state.failed) return ;
                    pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3778);
                    typeParamOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,LPAREN,FOLLOW_LPAREN_in_funcProtoDecl3780); if (state.failed) return ;
                    pushFollow(FOLLOW_paramListOpt_in_funcProtoDecl3782);
                    paramListOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,RPAREN,FOLLOW_RPAREN_in_funcProtoDecl3784); if (state.failed) return ;
                    pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3786);
                    typeTagOpt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,SEMI,FOLLOW_SEMI_in_funcProtoDecl3788); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, funcProtoDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "funcProtoDecl"


    // $ANTLR start "classDecl"
    // C:\\antlr\\TinyHaxeTry1.g:347:1: classDecl : 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}' ;
    public final void classDecl() throws RecognitionException {
        int classDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:347:19: ( 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}' )
            // C:\\antlr\\TinyHaxeTry1.g:347:21: 'class' IDENTIFIER typeParamOpt inheritListOpt '{' classBody '}'
            {
            match(input,CLASS,FOLLOW_CLASS_in_classDecl3805); if (state.failed) return ;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classDecl3806); if (state.failed) return ;
            pushFollow(FOLLOW_typeParamOpt_in_classDecl3808);
            typeParamOpt();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_inheritListOpt_in_classDecl3810);
            inheritListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,LBRACE,FOLLOW_LBRACE_in_classDecl3812); if (state.failed) return ;
            pushFollow(FOLLOW_classBody_in_classDecl3814);
            classBody();

            state._fsp--;
            if (state.failed) return ;
            match(input,RBRACE,FOLLOW_RBRACE_in_classDecl3816); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, classDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classDecl"


    // $ANTLR start "classBody"
    // C:\\antlr\\TinyHaxeTry1.g:349:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody );
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:349:19: ( varDecl classBody | funcDecl classBody | pp classBody )
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:349:21: varDecl classBody
                    {
                    pushFollow(FOLLOW_varDecl_in_classBody3833);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_classBody_in_classBody3835);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:350:25: funcDecl classBody
                    {
                    pushFollow(FOLLOW_funcDecl_in_classBody3861);
                    funcDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_classBody_in_classBody3863);
                    classBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:351:25: pp classBody
                    {
                    pushFollow(FOLLOW_pp_in_classBody3889);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_classBody_in_classBody3891);
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
            if ( state.backtracking>0 ) { memoize(input, 78, classBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "interfaceDecl"
    // C:\\antlr\\TinyHaxeTry1.g:354:1: interfaceDecl : 'interface' type inheritListOpt '{' interfaceBody '}' ;
    public final void interfaceDecl() throws RecognitionException {
        int interfaceDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:354:19: ( 'interface' type inheritListOpt '{' interfaceBody '}' )
            // C:\\antlr\\TinyHaxeTry1.g:354:21: 'interface' type inheritListOpt '{' interfaceBody '}'
            {
            match(input,INTERFACE,FOLLOW_INTERFACE_in_interfaceDecl3914); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_interfaceDecl3916);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3918);
            inheritListOpt();

            state._fsp--;
            if (state.failed) return ;
            match(input,LBRACE,FOLLOW_LBRACE_in_interfaceDecl3920); if (state.failed) return ;
            pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3922);
            interfaceBody();

            state._fsp--;
            if (state.failed) return ;
            match(input,RBRACE,FOLLOW_RBRACE_in_interfaceDecl3924); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, interfaceDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceDecl"


    // $ANTLR start "interfaceBody"
    // C:\\antlr\\TinyHaxeTry1.g:356:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody );
    public final void interfaceBody() throws RecognitionException {
        int interfaceBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:356:19: ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:356:21: varDecl interfaceBody
                    {
                    pushFollow(FOLLOW_varDecl_in_interfaceBody3937);
                    varDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3939);
                    interfaceBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:357:25: funcProtoDecl interfaceBody
                    {
                    pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3965);
                    funcProtoDecl();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3967);
                    interfaceBody();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:358:25: pp interfaceBody
                    {
                    pushFollow(FOLLOW_pp_in_interfaceBody3993);
                    pp();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_interfaceBody_in_interfaceBody3995);
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
            if ( state.backtracking>0 ) { memoize(input, 80, interfaceBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceBody"


    // $ANTLR start "inheritListOpt"
    // C:\\antlr\\TinyHaxeTry1.g:361:1: inheritListOpt : ( inheritList | );
    public final void inheritListOpt() throws RecognitionException {
        int inheritListOpt_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:361:19: ( inheritList | )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EXTENDS||LA54_0==IMPLEMENTS) ) {
                alt54=1;
            }
            else if ( (LA54_0==LBRACE) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:361:21: inheritList
                    {
                    pushFollow(FOLLOW_inheritList_in_inheritListOpt4016);
                    inheritList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:364:2: 
                    {
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, inheritListOpt_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inheritListOpt"


    // $ANTLR start "inheritList"
    // C:\\antlr\\TinyHaxeTry1.g:365:1: inheritList : ( inherit ) ( ',' inherit )* ;
    public final void inheritList() throws RecognitionException {
        int inheritList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:365:19: ( ( inherit ) ( ',' inherit )* )
            // C:\\antlr\\TinyHaxeTry1.g:365:21: ( inherit ) ( ',' inherit )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:365:21: ( inherit )
            // C:\\antlr\\TinyHaxeTry1.g:365:22: inherit
            {
            pushFollow(FOLLOW_inherit_in_inheritList4057);
            inherit();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:365:31: ( ',' inherit )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==COMMA) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:365:32: ',' inherit
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_inheritList4061); if (state.failed) return ;
            	    pushFollow(FOLLOW_inherit_in_inheritList4063);
            	    inherit();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, inheritList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inheritList"


    // $ANTLR start "inherit"
    // C:\\antlr\\TinyHaxeTry1.g:367:1: inherit : ( 'extends' type | 'implements' type );
    public final void inherit() throws RecognitionException {
        int inherit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:367:19: ( 'extends' type | 'implements' type )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EXTENDS) ) {
                alt56=1;
            }
            else if ( (LA56_0==IMPLEMENTS) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:367:21: 'extends' type
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_inherit4084); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_inherit4086);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:368:25: 'implements' type
                    {
                    match(input,IMPLEMENTS,FOLLOW_IMPLEMENTS_in_inherit4112); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_inherit4114);
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
            if ( state.backtracking>0 ) { memoize(input, 83, inherit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inherit"


    // $ANTLR start "typedefDecl"
    // C:\\antlr\\TinyHaxeTry1.g:370:1: typedefDecl : 'typedef' IDENTIFIER '=' funcType ;
    public final void typedefDecl() throws RecognitionException {
        int typedefDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:370:19: ( 'typedef' IDENTIFIER '=' funcType )
            // C:\\antlr\\TinyHaxeTry1.g:370:21: 'typedef' IDENTIFIER '=' funcType
            {
            match(input,147,FOLLOW_147_in_typedefDecl4129); if (state.failed) return ;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_typedefDecl4130); if (state.failed) return ;
            match(input,EQ,FOLLOW_EQ_in_typedefDecl4132); if (state.failed) return ;
            pushFollow(FOLLOW_funcType_in_typedefDecl4134);
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
            if ( state.backtracking>0 ) { memoize(input, 84, typedefDecl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typedefDecl"


    // $ANTLR start "typeExtend"
    // C:\\antlr\\TinyHaxeTry1.g:372:1: typeExtend : '>' funcType ',' ;
    public final void typeExtend() throws RecognitionException {
        int typeExtend_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:372:19: ( '>' funcType ',' )
            // C:\\antlr\\TinyHaxeTry1.g:372:21: '>' funcType ','
            {
            match(input,GT,FOLLOW_GT_in_typeExtend4150); if (state.failed) return ;
            pushFollow(FOLLOW_funcType_in_typeExtend4152);
            funcType();

            state._fsp--;
            if (state.failed) return ;
            match(input,COMMA,FOLLOW_COMMA_in_typeExtend4154); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, typeExtend_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeExtend"


    // $ANTLR start "anonType"
    // C:\\antlr\\TinyHaxeTry1.g:374:1: anonType : '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}' ;
    public final void anonType() throws RecognitionException {
        int anonType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:374:19: ( '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}' )
            // C:\\antlr\\TinyHaxeTry1.g:374:21: '{' ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) ) '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_anonType4172); if (state.failed) return ;
            // C:\\antlr\\TinyHaxeTry1.g:374:24: ( | anonTypeFieldList | varDeclList | typeExtend ( | anonTypeFieldList | varDeclList ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RBRACE:
                {
                alt58=1;
                }
                break;
            case IDENTIFIER:
                {
                alt58=2;
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
                alt58=3;
                }
                break;
            case GT:
                {
                alt58=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:375:21: 
                    {
                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:375:26: anonTypeFieldList
                    {
                    pushFollow(FOLLOW_anonTypeFieldList_in_anonType4201);
                    anonTypeFieldList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:376:26: varDeclList
                    {
                    pushFollow(FOLLOW_varDeclList_in_anonType4229);
                    varDeclList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:377:26: typeExtend ( | anonTypeFieldList | varDeclList )
                    {
                    pushFollow(FOLLOW_typeExtend_in_anonType4257);
                    typeExtend();

                    state._fsp--;
                    if (state.failed) return ;
                    // C:\\antlr\\TinyHaxeTry1.g:377:37: ( | anonTypeFieldList | varDeclList )
                    int alt57=3;
                    switch ( input.LA(1) ) {
                    case RBRACE:
                        {
                        alt57=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt57=2;
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
                        alt57=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }

                    switch (alt57) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:378:24: 
                            {
                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:378:25: anonTypeFieldList
                            {
                            pushFollow(FOLLOW_anonTypeFieldList_in_anonType4285);
                            anonTypeFieldList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // C:\\antlr\\TinyHaxeTry1.g:379:25: varDeclList
                            {
                            pushFollow(FOLLOW_varDeclList_in_anonType4311);
                            varDeclList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RBRACE,FOLLOW_RBRACE_in_anonType4337); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, anonType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "anonType"


    // $ANTLR start "anonTypeFieldList"
    // C:\\antlr\\TinyHaxeTry1.g:382:1: anonTypeFieldList : ( anonTypeField ) ( ',' anonTypeField )* ;
    public final void anonTypeFieldList() throws RecognitionException {
        int anonTypeFieldList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:382:19: ( ( anonTypeField ) ( ',' anonTypeField )* )
            // C:\\antlr\\TinyHaxeTry1.g:382:21: ( anonTypeField ) ( ',' anonTypeField )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:382:21: ( anonTypeField )
            // C:\\antlr\\TinyHaxeTry1.g:382:22: anonTypeField
            {
            pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4347);
            anonTypeField();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:382:37: ( ',' anonTypeField )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==COMMA) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:382:38: ',' anonTypeField
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_anonTypeFieldList4351); if (state.failed) return ;
            	    pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4353);
            	    anonTypeField();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, anonTypeFieldList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "anonTypeFieldList"


    // $ANTLR start "anonTypeField"
    // C:\\antlr\\TinyHaxeTry1.g:384:1: anonTypeField : IDENTIFIER ':' funcType ;
    public final void anonTypeField() throws RecognitionException {
        int anonTypeField_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:384:19: ( IDENTIFIER ':' funcType )
            // C:\\antlr\\TinyHaxeTry1.g:384:20: IDENTIFIER ':' funcType
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_anonTypeField4367); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_anonTypeField4369); if (state.failed) return ;
            pushFollow(FOLLOW_funcType_in_anonTypeField4371);
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
            if ( state.backtracking>0 ) { memoize(input, 88, anonTypeField_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "anonTypeField"


    // $ANTLR start "objLit"
    // C:\\antlr\\TinyHaxeTry1.g:386:1: objLit : '{' objLitElemList '}' ;
    public final void objLit() throws RecognitionException {
        int objLit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:386:19: ( '{' objLitElemList '}' )
            // C:\\antlr\\TinyHaxeTry1.g:386:21: '{' objLitElemList '}'
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_objLit4391); if (state.failed) return ;
            pushFollow(FOLLOW_objLitElemList_in_objLit4393);
            objLitElemList();

            state._fsp--;
            if (state.failed) return ;
            match(input,RBRACE,FOLLOW_RBRACE_in_objLit4395); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 89, objLit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "objLit"


    // $ANTLR start "objLitElemList"
    // C:\\antlr\\TinyHaxeTry1.g:388:1: objLitElemList : ( objLitElem ) ( ',' objLitElem )* ;
    public final void objLitElemList() throws RecognitionException {
        int objLitElemList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:388:19: ( ( objLitElem ) ( ',' objLitElem )* )
            // C:\\antlr\\TinyHaxeTry1.g:388:21: ( objLitElem ) ( ',' objLitElem )*
            {
            // C:\\antlr\\TinyHaxeTry1.g:388:21: ( objLitElem )
            // C:\\antlr\\TinyHaxeTry1.g:388:22: objLitElem
            {
            pushFollow(FOLLOW_objLitElem_in_objLitElemList4407);
            objLitElem();

            state._fsp--;
            if (state.failed) return ;

            }

            // C:\\antlr\\TinyHaxeTry1.g:388:34: ( ',' objLitElem )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMA) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:388:35: ',' objLitElem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_objLitElemList4411); if (state.failed) return ;
            	    pushFollow(FOLLOW_objLitElem_in_objLitElemList4413);
            	    objLitElem();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, objLitElemList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "objLitElemList"


    // $ANTLR start "objLitElem"
    // C:\\antlr\\TinyHaxeTry1.g:390:1: objLitElem : IDENTIFIER ':' expr ;
    public final void objLitElem() throws RecognitionException {
        int objLitElem_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // C:\\antlr\\TinyHaxeTry1.g:390:19: ( IDENTIFIER ':' expr )
            // C:\\antlr\\TinyHaxeTry1.g:390:20: IDENTIFIER ':' expr
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_objLitElem4430); if (state.failed) return ;
            match(input,COLON,FOLLOW_COLON_in_objLitElem4432); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_objLitElem4434);
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
            if ( state.backtracking>0 ) { memoize(input, 91, objLitElem_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "objLitElem"

    // $ANTLR start synpred40_TinyHaxeTry1
    public final void synpred40_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:129:9: ( block )
        // C:\\antlr\\TinyHaxeTry1.g:129:9: block
        {
        pushFollow(FOLLOW_block_in_synpred40_TinyHaxeTry11505);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_TinyHaxeTry1

    // $ANTLR start synpred41_TinyHaxeTry1
    public final void synpred41_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:130:39: ( 'else' statement )
        // C:\\antlr\\TinyHaxeTry1.g:130:39: 'else' statement
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred41_TinyHaxeTry11522); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred41_TinyHaxeTry11524);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_TinyHaxeTry1

    // $ANTLR start synpred55_TinyHaxeTry1
    public final void synpred55_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:141:9: ( expr ';' )
        // C:\\antlr\\TinyHaxeTry1.g:141:9: expr ';'
        {
        pushFollow(FOLLOW_expr_in_synpred55_TinyHaxeTry11673);
        expr();

        state._fsp--;
        if (state.failed) return ;
        match(input,SEMI,FOLLOW_SEMI_in_synpred55_TinyHaxeTry11676); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_TinyHaxeTry1

    // $ANTLR start synpred56_TinyHaxeTry1
    public final void synpred56_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:142:9: ( IDENTIFIER ':' statement )
        // C:\\antlr\\TinyHaxeTry1.g:142:9: IDENTIFIER ':' statement
        {
        match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred56_TinyHaxeTry11691); if (state.failed) return ;
        match(input,COLON,FOLLOW_COLON_in_synpred56_TinyHaxeTry11693); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred56_TinyHaxeTry11695);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_TinyHaxeTry1

    // $ANTLR start synpred91_TinyHaxeTry1
    public final void synpred91_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:270:25: ( suffixExpr )
        // C:\\antlr\\TinyHaxeTry1.g:270:25: suffixExpr
        {
        pushFollow(FOLLOW_suffixExpr_in_synpred91_TinyHaxeTry12602);
        suffixExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_TinyHaxeTry1

    // $ANTLR start synpred103_TinyHaxeTry1
    public final void synpred103_TinyHaxeTry1_fragment() throws RecognitionException {   
        // C:\\antlr\\TinyHaxeTry1.g:290:30: ( expr )
        // C:\\antlr\\TinyHaxeTry1.g:290:30: expr
        {
        pushFollow(FOLLOW_expr_in_synpred103_TinyHaxeTry12893);
        expr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_TinyHaxeTry1

    // Delegated rules

    public final boolean synpred103_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_TinyHaxeTry1() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_TinyHaxeTry1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA25_eotS =
        "\30\uffff";
    static final String DFA25_eofS =
        "\30\uffff";
    static final String DFA25_minS =
        "\1\4\1\0\20\uffff\1\0\5\uffff";
    static final String DFA25_maxS =
        "\1\u0091\1\0\20\uffff\1\0\5\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\10\uffff"+
        "\1\16\1\1\1\15";
    static final String DFA25_specialS =
        "\1\uffff\1\0\20\uffff\1\1\5\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\22\1\14\15\uffff\1\12\6\uffff\1\13\1\uffff\1\5\7\uffff\1"+
            "\3\1\uffff\1\2\7\uffff\1\14\4\uffff\1\10\4\uffff\1\7\1\uffff"+
            "\1\11\2\uffff\1\6\2\uffff\1\4\2\uffff\2\14\1\uffff\1\1\1\uffff"+
            "\1\14\1\uffff\1\25\4\uffff\2\14\5\uffff\2\14\1\uffff\1\14\52"+
            "\uffff\1\14\14\uffff\1\14",
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
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "128:1: statement : ( block | 'if' parExpression statement ( 'else' statement )? | forStmt | 'while' parExpression statement | 'do' statement 'while' parExpression ';' | tryStmt | switchStmt | 'return' ( expr )? ';' | 'throw' expr ';' | 'break' ( IDENTIFIER )? ';' | 'continue' ( IDENTIFIER )? ';' | expr ';' | IDENTIFIER ':' statement | ';' );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (synpred55_TinyHaxeTry1()) ) {s = 12;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_18 = input.LA(1);

                         
                        int index25_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_TinyHaxeTry1()) ) {s = 12;}

                        else if ( (synpred56_TinyHaxeTry1()) ) {s = 23;}

                         
                        input.seek(index25_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\14\uffff";
    static final String DFA40_eofS =
        "\14\uffff";
    static final String DFA40_minS =
        "\1\4\7\uffff\1\0\3\uffff";
    static final String DFA40_maxS =
        "\1\u0091\7\uffff\1\0\3\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\5";
    static final String DFA40_specialS =
        "\10\uffff\1\0\3\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\10\1\4\50\uffff\1\2\24\uffff\2\4\1\uffff\1\4\1\uffff\1\4"+
            "\6\uffff\2\1\5\uffff\2\1\1\uffff\1\1\52\uffff\1\4\14\uffff\1"+
            "\3",
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
            ""
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "267:1: prefixExpr : ( ( '-' | '--' | '++' | '!' | '~' ) prefixExpr | newExpr | cast | suffixExpr | funcCallExpr );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_8 = input.LA(1);

                         
                        int index40_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_TinyHaxeTry1()) ) {s = 4;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index40_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\27\uffff";
    static final String DFA42_eofS =
        "\27\uffff";
    static final String DFA42_minS =
        "\1\4\12\0\14\uffff";
    static final String DFA42_maxS =
        "\1\u0091\12\0\14\uffff";
    static final String DFA42_acceptS =
        "\13\uffff\1\2\12\uffff\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\10\1\11\15\uffff\1\13\6\uffff\1\13\1\uffff\1\13\7\uffff"+
            "\1\13\1\uffff\1\13\7\uffff\1\2\4\uffff\1\13\4\uffff\1\13\1\uffff"+
            "\1\13\2\uffff\1\13\2\uffff\1\13\2\uffff\1\7\1\12\1\uffff\1\6"+
            "\1\uffff\1\5\1\uffff\1\13\4\uffff\2\1\5\uffff\2\1\1\uffff\1"+
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

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "290:29: ( expr | statement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_4 = input.LA(1);

                         
                        int index42_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_5 = input.LA(1);

                         
                        int index42_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_6 = input.LA(1);

                         
                        int index42_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_7 = input.LA(1);

                         
                        int index42_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_8 = input.LA(1);

                         
                        int index42_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_9 = input.LA(1);

                         
                        int index42_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_10 = input.LA(1);

                         
                        int index42_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred103_TinyHaxeTry1()) ) {s = 22;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index42_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\14\uffff";
    static final String DFA50_eofS =
        "\14\uffff";
    static final String DFA50_minS =
        "\6\60\2\4\4\uffff";
    static final String DFA50_maxS =
        "\6\u0084\2\56\4\uffff";
    static final String DFA50_acceptS =
        "\10\uffff\1\3\1\4\1\2\1\1";
    static final String DFA50_specialS =
        "\14\uffff}>";
    static final String[] DFA50_transitionS = {
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "337:1: funcDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt block | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block | 'function' 'new' '(' paramListOpt ')' typeTagOpt block | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt block );";
        }
    }
    static final String DFA51_eotS =
        "\14\uffff";
    static final String DFA51_eofS =
        "\14\uffff";
    static final String DFA51_minS =
        "\6\60\2\4\4\uffff";
    static final String DFA51_maxS =
        "\6\u0084\2\56\4\uffff";
    static final String DFA51_acceptS =
        "\10\uffff\1\3\1\4\1\1\1\2";
    static final String DFA51_specialS =
        "\14\uffff}>";
    static final String[] DFA51_transitionS = {
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "342:1: funcProtoDecl : ( declAttrList 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | declAttrList 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' | 'function' 'new' '(' paramListOpt ')' typeTagOpt ';' | 'function' IDENTIFIER typeParamOpt '(' paramListOpt ')' typeTagOpt ';' );";
        }
    }
    static final String DFA52_eotS =
        "\11\uffff";
    static final String DFA52_eofS =
        "\11\uffff";
    static final String DFA52_minS =
        "\6\60\3\uffff";
    static final String DFA52_maxS =
        "\6\u0092\3\uffff";
    static final String DFA52_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA52_specialS =
        "\11\uffff}>";
    static final String[] DFA52_transitionS = {
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "349:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody );";
        }
    }
    static final String DFA53_eotS =
        "\11\uffff";
    static final String DFA53_eofS =
        "\11\uffff";
    static final String DFA53_minS =
        "\6\60\3\uffff";
    static final String DFA53_maxS =
        "\6\u0092\3\uffff";
    static final String DFA53_acceptS =
        "\6\uffff\1\1\1\2\1\3";
    static final String DFA53_specialS =
        "\11\uffff}>";
    static final String[] DFA53_transitionS = {
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "356:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody );";
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
    public static final BitSet FOLLOW_param_in_paramList479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_paramList482 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_param_in_paramList484 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_varInitOpt_in_param510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUES_in_param536 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_param537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_typeTagOpt_in_param539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_varInitOpt_in_param541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent560 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_DOT_in_dotIdent564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_dotIdent565 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_set_in_assignOp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcLit890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcLit892 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcLit894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcLit896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcLit898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_funcLit900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_arrayLit917 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18358L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_arrayLit919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_arrayLit921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppIf_in_pp948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElseIf_in_pp974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppElse_in_pp1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppEnd_in_pp1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ppError_in_pp1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ppIf1074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ppIf1101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_BANG_in_ppIf1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ppElseIf1122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ppElseIf1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_BANG_in_ppElseIf1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ppElse1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ppEnd1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ppError1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_typeTag1233 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeTag1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeTag_in_typeTagOpt1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcType_in_typeList1291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeList1294 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeList1296 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1324 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeList1327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeConstraint_in_typeList1329 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_funcType1371 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_funcType1375 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_funcType1377 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_anonType_in_type1402 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_dotIdent_in_type1406 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_typeParam_in_type1410 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LT_in_typeParam1429 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeList_in_typeParam1431 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_GT_in_typeParam1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeParam_in_typeParamOpt1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_typeConstraint1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_typeConstraint1476 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_typeList_in_typeConstraint1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_typeConstraint1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_statement1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1517 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1519 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ELSE_in_statement1522 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_statement1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_statement1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1558 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_statement1570 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_WHILE_in_statement1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_parExpression_in_statement1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStmt_in_statement1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStmt_in_statement1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement1608 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18558L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_statement1611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_statement1625 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_statement1627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement1639 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement1656 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_statement1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_statement1691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_statement1693 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_statement1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_parExpression1729 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_parExpression1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_parExpression1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block1756 = new BitSet(new long[]{0x252D405015080030L,0xC000000002C585D9L,0x0000000000060011L});
    public static final BitSet FOLLOW_blockStmt_in_block1759 = new BitSet(new long[]{0x252D405015080030L,0xC000000002C585D9L,0x0000000000060011L});
    public static final BitSet FOLLOW_RBRACE_in_block1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_blockStmt1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_blockStmt1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStmt1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt1854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_forStmt1856 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_forStmt1858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_forStmt1860 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_forStmt1862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_forStmt1864 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_forStmt1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStmt1893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_breakStmt1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStmt1909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_continueStmt1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStmt1929 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprList_in_caseStmt1931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_caseStmt1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_defaultStmt1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStmt1966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_switchStmt1968 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_switchStmt1970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_switchStmt1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_switchStmt1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStmt1995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_tryStmt1997 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_catchStmtList_in_tryStmt1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchStmt_in_catchStmtList2012 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchStmt2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_catchStmt2043 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_param_in_catchStmt2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_catchStmt2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_catchStmt2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprList_in_exprListOpt2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_exprList2107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_exprList2111 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_exprList2113 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_assignExpr_in_expr2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2153 = new BitSet(new long[]{0x0000000000000002L,0x000000FF00004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_assignOp_in_assignExpr2156 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_iterExpr_in_assignExpr2158 = new BitSet(new long[]{0x0000000000000002L,0x000000FF00004000L,0x000000000000000EL});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2181 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2206 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_QUES_in_ternaryExpr2209 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_ternaryExpr2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_ternaryExpr2213 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2253 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2272 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2276 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2278 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2300 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_EQEQ_in_cmpExpr2304 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2306 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2310 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2312 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_140_in_cmpExpr2316 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2318 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_141_in_cmpExpr2322 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2324 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_GT_in_cmpExpr2328 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2331 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_LT_in_cmpExpr2335 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_bitExpr_in_cmpExpr2338 = new BitSet(new long[]{0x0000000000000002L,0x0018800000080000L,0x0000000000003000L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2360 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_BAR_in_bitExpr2364 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2366 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_AMP_in_bitExpr2370 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2372 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_CARET_in_bitExpr2376 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_shiftExpr_in_bitExpr2378 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_142_in_shiftExpr2402 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_143_in_shiftExpr2409 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_144_in_shiftExpr2416 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_addExpr_in_shiftExpr2418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2443 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_PLUS_in_addExpr2447 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2449 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_SUB_in_addExpr2453 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_multExpr_in_addExpr2455 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2476 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_STAR_in_multExpr2480 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2482 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_SLASH_in_multExpr2486 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2488 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_PERCENT_in_multExpr2492 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_multExpr2494 = new BitSet(new long[]{0x0000000000000002L,0x000000008C000000L});
    public static final BitSet FOLLOW_set_in_prefixExpr2512 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpr_in_prefixExpr2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_in_prefixExpr2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcCallExpr_in_prefixExpr2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcCallExpr2636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcCallExpr2638 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18178L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_funcCallExpr2639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcCallExpr2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_suffixExpr2657 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_LPAREN_in_suffixExpr2661 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18178L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_suffixExpr2665 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_DOT_in_suffixExpr2669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_suffixExpr2670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2674 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_suffixExpr2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2678 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2686 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C01110L});
    public static final BitSet FOLLOW_funcLit_in_value2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLit_in_value2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLit_in_value2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_value2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_value2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value2890 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_value2893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_statement_in_value2895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_value2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpr2933 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_newExpr2935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_newExpr2937 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18178L,0x0000000000020010L});
    public static final BitSet FOLLOW_exprListOpt_in_newExpr2939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_newExpr2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_cast2963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_cast2965 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_cast2967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000820L});
    public static final BitSet FOLLOW_COMMA_in_cast2970 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_cast2972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_cast2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDecl_in_topLevelDecl2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumDecl3089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3090 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000040L});
    public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_enumDecl3094 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_enumBody_in_enumDecl3096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_enumDecl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumValueDecl_in_enumBody3117 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3133 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_enumValueDecl3135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_enumValueDecl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_enumValueDecl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_varDeclList3207 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x0000000000040001L});
    public static final BitSet FOLLOW_varDeclList_in_varDeclList3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_varDecl3228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_varDecl3230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_varDecl3260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPartList_in_varDecl3262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_varDecl3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_varDeclPartList3280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000044000L});
    public static final BitSet FOLLOW_varInitOpt_in_varDeclPart3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_propDecl3322 = new BitSet(new long[]{0x0000000008000010L,0x8000000000000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_propDecl3326 = new BitSet(new long[]{0x0000000008000010L,0x8000000000000008L});
    public static final BitSet FOLLOW_propAccessor_in_propDecl3328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_propDecl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propDecl_in_propDeclOpt3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varInit_in_varInitOpt3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_varInit3491 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_varInit3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcDecl3513 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3517 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_funcDecl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcDecl3551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcDecl3553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3554 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000010L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3558 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_funcDecl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcDecl3592 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcDecl3594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3596 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_funcDecl3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcDecl3630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3631 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000010L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcDecl3635 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcDecl3637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcDecl3639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040040L});
    public static final BitSet FOLLOW_block_in_funcDecl3643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3658 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3662 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3699 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000010L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3703 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3737 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_NEW_in_funcProtoDecl3739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3741 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_funcProtoDecl3775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3776 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000010L});
    public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3780 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020020L});
    public static final BitSet FOLLOW_paramListOpt_in_funcProtoDecl3782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040400L});
    public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_classDecl3805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3806 = new BitSet(new long[]{0x0000008100000000L,0x0010000000000040L});
    public static final BitSet FOLLOW_typeParamOpt_in_classDecl3808 = new BitSet(new long[]{0x0000008100000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_inheritListOpt_in_classDecl3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_classDecl3812 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classDecl3814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_classDecl3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_classBody3833 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcDecl_in_classBody3861 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_classBody3889 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_classBody_in_classBody3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3914 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_interfaceDecl3916 = new BitSet(new long[]{0x0000008100000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3920 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_interfaceBody3937 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3965 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pp_in_interfaceBody3993 = new BitSet(new long[]{0x0025000000000000L,0xC000000000000000L,0x00000000000403F1L});
    public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inheritList_in_inheritListOpt4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inherit_in_inheritList4057 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_inheritList4061 = new BitSet(new long[]{0x0000008100000000L});
    public static final BitSet FOLLOW_inherit_in_inheritList4063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_EXTENDS_in_inherit4084 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_inherit4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_in_inherit4112 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_type_in_inherit4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_typedefDecl4129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_EQ_in_typedefDecl4132 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typedefDecl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_typeExtend4150 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_typeExtend4152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_typeExtend4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_anonType4172 = new BitSet(new long[]{0x0025000000000010L,0xC008000000000080L,0x0000000000040001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_typeExtend_in_anonType4257 = new BitSet(new long[]{0x0025000000000010L,0xC000000000000080L,0x0000000000040001L});
    public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_varDeclList_in_anonType4311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_anonType4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_anonTypeField4369 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_funcType_in_anonTypeField4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objLit4391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElemList_in_objLit4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACE_in_objLit4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_COMMA_in_objLitElemList4411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_objLitElem_in_objLitElemList4413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_objLitElem4432 = new BitSet(new long[]{0x0000400000000030L,0x0000000002C18158L,0x0000000000020010L});
    public static final BitSet FOLLOW_expr_in_objLitElem4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_synpred40_TinyHaxeTry11505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_synpred41_TinyHaxeTry11522 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_synpred41_TinyHaxeTry11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred55_TinyHaxeTry11673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMI_in_synpred55_TinyHaxeTry11676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred56_TinyHaxeTry11691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_synpred56_TinyHaxeTry11693 = new BitSet(new long[]{0x2508405014080030L,0x0000000002C58559L,0x0000000000020010L});
    public static final BitSet FOLLOW_statement_in_synpred56_TinyHaxeTry11695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_suffixExpr_in_synpred91_TinyHaxeTry12602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_synpred103_TinyHaxeTry12893 = new BitSet(new long[]{0x0000000000000002L});

}