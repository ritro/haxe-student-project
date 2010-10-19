// $ANTLR 3.2 Sep 23, 2009 12:02:23 TinyHaxeTry1.g 2010-10-19 22:47:28

package haxe.imp.parser.antlr.main;

import java.util.HashMap;
//import java.util.Stack; // imported by ANTLR


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TinyHaxeTry1Lexer extends Lexer {
    public static final int CAST=88;
    public static final int PACKAGE=15;
    public static final int FUNCTION=34;
    public static final int EXPONENT=147;
    public static final int LT=45;
    public static final int STAR=80;
    public static final int WHILE=53;
    public static final int PP_OR_EXPRESSION=156;
    public static final int FLOATNUM=101;
    public static final int CONST=114;
    public static final int OCTAL_ESC=162;
    public static final int CASE=63;
    public static final int CHAR=113;
    public static final int NEW=48;
    public static final int DO=54;
    public static final int EXTERN=91;
    public static final int GTGT=47;
    public static final int EOF=-1;
    public static final int BREAK=61;
    public static final int LBRACKET=37;
    public static final int ELSE_TOKEN=153;
    public static final int RPAREN=36;
    public static final int FINAL=116;
    public static final int IMPORT=19;
    public static final int SUBSUB=83;
    public static final int STAREQ=130;
    public static final int CARET=75;
    public static final int PP_AND_EXPRESSION=157;
    public static final int RETURN=59;
    public static final int THIS=126;
    public static final int DOUBLE=115;
    public static final int MONKEYS_AT=139;
    public static final int BARBAR=67;
    public static final int VAR=90;
    public static final int VOID=41;
    public static final int SUPER=125;
    public static final int EQ=28;
    public static final int GOTO=118;
    public static final int AMPAMP=68;
    public static final int COMMENT=148;
    public static final int VAR_INIT=13;
    public static final int LTLTEQ=143;
    public static final int QUES=27;
    public static final int EQEQ=69;
    public static final int HexPrefix=107;
    public static final int PERCENTDBBQ=135;
    public static final int RBRACE=58;
    public static final int STATIC=22;
    public static final int PRIVATE=21;
    public static final int BLOCK_SCOPE=7;
    public static final int SWITCH=56;
    public static final int NULL=87;
    public static final int GTGTEQ=144;
    public static final int STRICTFP=124;
    public static final int ELSE=50;
    public static final int NATIVE=121;
    public static final int ELLIPSIS=66;
    public static final int THROWS=127;
    public static final int INT=42;
    public static final int SLASHEQ=31;
    public static final int INTLITERAL=98;
    public static final int PERCENTBB=141;
    public static final int TRY=55;
    public static final int IF_TOKEN=152;
    public static final int LongSuffix=106;
    public static final int LONGLITERAL=97;
    public static final int ENDIF_TOKEN=154;
    public static final int PERCENTLL=140;
    public static final int BANGEQQ=138;
    public static final int WS=104;
    public static final int PP_PRIMARY_EXPRESSION=159;
    public static final int PERCENTDLQ=133;
    public static final int INHERIT_LIST_OPT=11;
    public static final int CHARLITERAL=100;
    public static final int GT=46;
    public static final int PP_CONDITIONAL=150;
    public static final int INLINE=23;
    public static final int CATCH=65;
    public static final int FALSE=103;
    public static final int EscapeSequence=110;
    public static final int THROW=60;
    public static final int DYNAMIC=24;
    public static final int PROTECTED=122;
    public static final int CLASS=92;
    public static final int BAREQ=131;
    public static final int IntegerNumber=105;
    public static final int PP_EXPRESSION=155;
    public static final int AMP=74;
    public static final int PLUSPLUS=84;
    public static final int LBRACE=57;
    public static final int LTEQ=72;
    public static final int TYPE_PARAM_OPT=10;
    public static final int GTGTGT=77;
    public static final int SUBEQ=30;
    public static final int FOR=51;
    public static final int Exponent=109;
    public static final int SUB=79;
    public static final int SUFFIX_EXPR=6;
    public static final int FLOAT=43;
    public static final int ABSTRACT=111;
    public static final int MINUS_BIGGER=40;
    public static final int PERCENTDBQ=134;
    public static final int HexDigit=108;
    public static final int PLUSEQ=29;
    public static final int LPAREN=35;
    public static final int IF=49;
    public static final int INTNUM=146;
    public static final int SLASH=81;
    public static final int BOOLEAN=44;
    public static final int ESC_SEQ=163;
    public static final int IN=52;
    public static final int IMPLEMENTS=95;
    public static final int GTGTGTEQ=145;
    public static final int CONTINUE=62;
    public static final int COMMA=26;
    public static final int AMPEQ=33;
    public static final int PREPROCESSOR_DIRECTIVE=151;
    public static final int IDENTIFIER=17;
    public static final int TRANSIENT=128;
    public static final int TILDE=86;
    public static final int BANGEQ=70;
    public static final int PLUS=78;
    public static final int RBRACKET=38;
    public static final int DOT=18;
    public static final int LTLT=76;
    public static final int BYTE=112;
    public static final int PERCENT=82;
    public static final int VOLATILE=129;
    public static final int DECL_ATTR_LIST=12;
    public static final int ASSIGN_OPERATOR=14;
    public static final int TYPEDEF=96;
    public static final int TS=149;
    public static final int UNICODE_ESC=161;
    public static final int DEFAULT=64;
    public static final int EQEQEQ=136;
    public static final int HEX_DIGIT=160;
    public static final int SHORT=123;
    public static final int BANG=85;
    public static final int INSTANCEOF=119;
    public static final int GTEQ=71;
    public static final int MODULE=5;
    public static final int SEMI=16;
    public static final int TRUE=102;
    public static final int COLON=39;
    public static final int PARAM_LIST=8;
    public static final int PERCENTLESQ=137;
    public static final int ENUM=89;
    public static final int PERCENTEQ=32;
    public static final int FINALLY=117;
    public static final int PROPERTY_DECL=4;
    public static final int OVERRIDE=25;
    public static final int STRINGLITERAL=99;
    public static final int CARETEQ=132;
    public static final int PERCENTBBB=142;
    public static final int INTERFACE=93;
    public static final int PP_UNARY_EXPRESSION=158;
    public static final int LONG=120;
    public static final int PUBLIC=20;
    public static final int EXTENDS=94;
    public static final int TYPE_TAG=9;
    public static final int BAR=73;

    	// Preprocessor Data Structures - see lexer section below and PreProcessor.cs
    	protected HashMap<String,String> macroDefines = new HashMap<String,String>();	
    	protected Stack<Boolean> processing = new Stack<Boolean>();

    	// Uggh, lexer rules don't return values, so use a stack to return values.
    	protected Stack<Boolean> returns = new Stack<Boolean>();


    // delegates
    // delegators

    public TinyHaxeTry1Lexer() {;} 
    public TinyHaxeTry1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TinyHaxeTry1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "TinyHaxeTry1.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:488:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // TinyHaxeTry1.g:488:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LONGLITERAL"
    public final void mLONGLITERAL() throws RecognitionException {
        try {
            int _type = LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:499:5: ( IntegerNumber LongSuffix )
            // TinyHaxeTry1.g:499:9: IntegerNumber LongSuffix
            {
            mIntegerNumber(); 
            mLongSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONGLITERAL"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:504:5: ( IntegerNumber )
            // TinyHaxeTry1.g:504:9: IntegerNumber
            {
            mIntegerNumber(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:509:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt4=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    alt4=1;}

            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // TinyHaxeTry1.g:509:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:510:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // TinyHaxeTry1.g:510:18: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:510:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:511:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // TinyHaxeTry1.g:511:13: ( '0' .. '7' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='7')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:511:14: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:512:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // TinyHaxeTry1.g:512:19: ( HexDigit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:512:19: HexDigit
                    	    {
                    	    mHexDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "IntegerNumber"

    // $ANTLR start "HexPrefix"
    public final void mHexPrefix() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:517:5: ( '0x' | '0X' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='x') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='X') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // TinyHaxeTry1.g:517:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:517:16: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "HexPrefix"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:522:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // TinyHaxeTry1.g:522:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "LongSuffix"
    public final void mLongSuffix() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:527:5: ( 'l' | 'L' )
            // TinyHaxeTry1.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LongSuffix"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:532:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // TinyHaxeTry1.g:532:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // TinyHaxeTry1.g:532:23: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // TinyHaxeTry1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // TinyHaxeTry1.g:532:38: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // TinyHaxeTry1.g:532:40: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:536:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // TinyHaxeTry1.g:536:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // TinyHaxeTry1.g:537:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // TinyHaxeTry1.g:537:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:538:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:546:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // TinyHaxeTry1.g:546:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 
            // TinyHaxeTry1.g:546:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt9=11;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // TinyHaxeTry1.g:547:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:548:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:549:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // TinyHaxeTry1.g:550:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // TinyHaxeTry1.g:551:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // TinyHaxeTry1.g:552:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // TinyHaxeTry1.g:553:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // TinyHaxeTry1.g:554:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // TinyHaxeTry1.g:556:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // TinyHaxeTry1.g:556:18: ( '0' .. '3' )
                    // TinyHaxeTry1.g:556:19: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // TinyHaxeTry1.g:556:29: ( '0' .. '7' )
                    // TinyHaxeTry1.g:556:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // TinyHaxeTry1.g:556:40: ( '0' .. '7' )
                    // TinyHaxeTry1.g:556:41: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 10 :
                    // TinyHaxeTry1.g:558:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // TinyHaxeTry1.g:558:18: ( '0' .. '7' )
                    // TinyHaxeTry1.g:558:19: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // TinyHaxeTry1.g:558:29: ( '0' .. '7' )
                    // TinyHaxeTry1.g:558:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 11 :
                    // TinyHaxeTry1.g:560:18: ( '0' .. '7' )
                    {
                    // TinyHaxeTry1.g:560:18: ( '0' .. '7' )
                    // TinyHaxeTry1.g:560:19: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:565:5: ( 'abstract' )
            // TinyHaxeTry1.g:565:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:569:5: ( 'Bool' )
            // TinyHaxeTry1.g:569:9: 'Bool'
            {
            match("Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:573:5: ( 'break' )
            // TinyHaxeTry1.g:573:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:577:5: ( 'byte' )
            // TinyHaxeTry1.g:577:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:581:5: ( 'case' )
            // TinyHaxeTry1.g:581:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:585:5: ( 'catch' )
            // TinyHaxeTry1.g:585:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:589:5: ( 'char' )
            // TinyHaxeTry1.g:589:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:593:5: ( 'class' )
            // TinyHaxeTry1.g:593:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:597:5: ( 'const' )
            // TinyHaxeTry1.g:597:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:601:5: ( 'continue' )
            // TinyHaxeTry1.g:601:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:605:5: ( 'default' )
            // TinyHaxeTry1.g:605:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:609:5: ( 'do' )
            // TinyHaxeTry1.g:609:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:613:5: ( 'double' )
            // TinyHaxeTry1.g:613:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:617:5: ( 'else' )
            // TinyHaxeTry1.g:617:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:621:5: ( 'enum' )
            // TinyHaxeTry1.g:621:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:625:5: ( 'extends' )
            // TinyHaxeTry1.g:625:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:629:5: ( 'final' )
            // TinyHaxeTry1.g:629:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:633:5: ( 'finally' )
            // TinyHaxeTry1.g:633:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:637:5: ( 'Float' )
            // TinyHaxeTry1.g:637:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:641:5: ( 'for' )
            // TinyHaxeTry1.g:641:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:645:5: ( 'goto' )
            // TinyHaxeTry1.g:645:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:649:5: ( 'if' )
            // TinyHaxeTry1.g:649:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:653:5: ( 'implements' )
            // TinyHaxeTry1.g:653:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:657:5: ( 'import' )
            // TinyHaxeTry1.g:657:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:661:5: ( 'instanceof' )
            // TinyHaxeTry1.g:661:9: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:665:5: ( 'Int' )
            // TinyHaxeTry1.g:665:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:669:5: ( 'interface' )
            // TinyHaxeTry1.g:669:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:673:5: ( 'long' )
            // TinyHaxeTry1.g:673:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:677:5: ( 'native' )
            // TinyHaxeTry1.g:677:9: 'native'
            {
            match("native"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:681:5: ( 'new' )
            // TinyHaxeTry1.g:681:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:685:5: ( 'package' )
            // TinyHaxeTry1.g:685:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:689:5: ( 'private' )
            // TinyHaxeTry1.g:689:9: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:693:5: ( 'protected' )
            // TinyHaxeTry1.g:693:9: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:697:5: ( 'public' )
            // TinyHaxeTry1.g:697:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:701:5: ( 'return' )
            // TinyHaxeTry1.g:701:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:705:5: ( 'short' )
            // TinyHaxeTry1.g:705:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:709:5: ( 'static' )
            // TinyHaxeTry1.g:709:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "INLINE"
    public final void mINLINE() throws RecognitionException {
        try {
            int _type = INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:713:2: ( 'inline' )
            // TinyHaxeTry1.g:713:4: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INLINE"

    // $ANTLR start "DYNAMIC"
    public final void mDYNAMIC() throws RecognitionException {
        try {
            int _type = DYNAMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:717:2: ( 'dynamic' )
            // TinyHaxeTry1.g:717:3: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DYNAMIC"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:721:2: ( 'override' )
            // TinyHaxeTry1.g:721:3: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "STRICTFP"
    public final void mSTRICTFP() throws RecognitionException {
        try {
            int _type = STRICTFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:725:5: ( 'strictfp' )
            // TinyHaxeTry1.g:725:9: 'strictfp'
            {
            match("strictfp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRICTFP"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:729:5: ( 'super' )
            // TinyHaxeTry1.g:729:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:733:5: ( 'switch' )
            // TinyHaxeTry1.g:733:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:737:5: ( 'this' )
            // TinyHaxeTry1.g:737:9: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:741:5: ( 'throw' )
            // TinyHaxeTry1.g:741:9: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:745:5: ( 'throws' )
            // TinyHaxeTry1.g:745:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "TRANSIENT"
    public final void mTRANSIENT() throws RecognitionException {
        try {
            int _type = TRANSIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:749:5: ( 'transient' )
            // TinyHaxeTry1.g:749:9: 'transient'
            {
            match("transient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRANSIENT"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:753:5: ( 'try' )
            // TinyHaxeTry1.g:753:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:757:5: ( 'Void' )
            // TinyHaxeTry1.g:757:9: 'Void'
            {
            match("Void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:761:5: ( 'volatile' )
            // TinyHaxeTry1.g:761:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:765:5: ( 'while' )
            // TinyHaxeTry1.g:765:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:769:5: ( 'true' )
            // TinyHaxeTry1.g:769:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:773:5: ( 'false' )
            // TinyHaxeTry1.g:773:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:777:5: ( 'null' )
            // TinyHaxeTry1.g:777:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:779:6: ( 'cast' )
            // TinyHaxeTry1.g:779:8: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:783:2: ( 'function' )
            // TinyHaxeTry1.g:783:4: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:786:4: ( 'in' )
            // TinyHaxeTry1.g:786:6: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:788:5: ( 'var' )
            // TinyHaxeTry1.g:788:7: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:790:9: ( 'typedef' )
            // TinyHaxeTry1.g:790:11: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:792:8: ( 'extern' )
            // TinyHaxeTry1.g:792:10: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:796:5: ( '(' )
            // TinyHaxeTry1.g:796:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:800:5: ( ')' )
            // TinyHaxeTry1.g:800:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:804:5: ( '{' )
            // TinyHaxeTry1.g:804:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:808:5: ( '}' )
            // TinyHaxeTry1.g:808:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:812:5: ( '[' )
            // TinyHaxeTry1.g:812:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:816:5: ( ']' )
            // TinyHaxeTry1.g:816:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:820:5: ( ';' )
            // TinyHaxeTry1.g:820:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:824:5: ( ',' )
            // TinyHaxeTry1.g:824:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:828:5: ( '.' )
            // TinyHaxeTry1.g:828:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:832:5: ( '...' )
            // TinyHaxeTry1.g:832:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELLIPSIS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:836:5: ( '=' )
            // TinyHaxeTry1.g:836:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:840:5: ( '!' )
            // TinyHaxeTry1.g:840:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:844:5: ( '~' )
            // TinyHaxeTry1.g:844:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "QUES"
    public final void mQUES() throws RecognitionException {
        try {
            int _type = QUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:848:5: ( '?' )
            // TinyHaxeTry1.g:848:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUES"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:852:5: ( ':' )
            // TinyHaxeTry1.g:852:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:856:5: ( '==' )
            // TinyHaxeTry1.g:856:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "AMPAMP"
    public final void mAMPAMP() throws RecognitionException {
        try {
            int _type = AMPAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:860:5: ( '&&' )
            // TinyHaxeTry1.g:860:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPAMP"

    // $ANTLR start "BARBAR"
    public final void mBARBAR() throws RecognitionException {
        try {
            int _type = BARBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:864:5: ( '||' )
            // TinyHaxeTry1.g:864:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BARBAR"

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:868:5: ( '++' )
            // TinyHaxeTry1.g:868:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSPLUS"

    // $ANTLR start "SUBSUB"
    public final void mSUBSUB() throws RecognitionException {
        try {
            int _type = SUBSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:872:5: ( '--' )
            // TinyHaxeTry1.g:872:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBSUB"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:876:5: ( '+' )
            // TinyHaxeTry1.g:876:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:880:5: ( '-' )
            // TinyHaxeTry1.g:880:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:884:5: ( '*' )
            // TinyHaxeTry1.g:884:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:888:5: ( '/' )
            // TinyHaxeTry1.g:888:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:892:5: ( '&' )
            // TinyHaxeTry1.g:892:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:896:5: ( '|' )
            // TinyHaxeTry1.g:896:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:900:5: ( '^' )
            // TinyHaxeTry1.g:900:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:904:5: ( '%' )
            // TinyHaxeTry1.g:904:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PLUSEQ"
    public final void mPLUSEQ() throws RecognitionException {
        try {
            int _type = PLUSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:908:5: ( '+=' )
            // TinyHaxeTry1.g:908:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQ"

    // $ANTLR start "SUBEQ"
    public final void mSUBEQ() throws RecognitionException {
        try {
            int _type = SUBEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:912:5: ( '-=' )
            // TinyHaxeTry1.g:912:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBEQ"

    // $ANTLR start "STAREQ"
    public final void mSTAREQ() throws RecognitionException {
        try {
            int _type = STAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:916:5: ( '*=' )
            // TinyHaxeTry1.g:916:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQ"

    // $ANTLR start "SLASHEQ"
    public final void mSLASHEQ() throws RecognitionException {
        try {
            int _type = SLASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:920:5: ( '/=' )
            // TinyHaxeTry1.g:920:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQ"

    // $ANTLR start "AMPEQ"
    public final void mAMPEQ() throws RecognitionException {
        try {
            int _type = AMPEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:924:5: ( '&=' )
            // TinyHaxeTry1.g:924:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPEQ"

    // $ANTLR start "BAREQ"
    public final void mBAREQ() throws RecognitionException {
        try {
            int _type = BAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:928:5: ( '|=' )
            // TinyHaxeTry1.g:928:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAREQ"

    // $ANTLR start "CARETEQ"
    public final void mCARETEQ() throws RecognitionException {
        try {
            int _type = CARETEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:932:5: ( '^=' )
            // TinyHaxeTry1.g:932:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CARETEQ"

    // $ANTLR start "PERCENTEQ"
    public final void mPERCENTEQ() throws RecognitionException {
        try {
            int _type = PERCENTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:936:5: ( '%=' )
            // TinyHaxeTry1.g:936:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTEQ"

    // $ANTLR start "PERCENTDLQ"
    public final void mPERCENTDLQ() throws RecognitionException {
        try {
            int _type = PERCENTDLQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:940:2: ( '%%<<%%=' )
            // TinyHaxeTry1.g:940:4: '%%<<%%='
            {
            match("%%<<%%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTDLQ"

    // $ANTLR start "PERCENTDBQ"
    public final void mPERCENTDBQ() throws RecognitionException {
        try {
            int _type = PERCENTDBQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:943:2: ( '%%>>%%=' )
            // TinyHaxeTry1.g:943:4: '%%>>%%='
            {
            match("%%>>%%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTDBQ"

    // $ANTLR start "PERCENTDBBQ"
    public final void mPERCENTDBBQ() throws RecognitionException {
        try {
            int _type = PERCENTDBBQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:946:2: ( '%%>>>%%=' )
            // TinyHaxeTry1.g:946:4: '%%>>>%%='
            {
            match("%%>>>%%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTDBBQ"

    // $ANTLR start "EQEQEQ"
    public final void mEQEQEQ() throws RecognitionException {
        try {
            int _type = EQEQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:949:2: ( '===' )
            // TinyHaxeTry1.g:949:3: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQEQEQ"

    // $ANTLR start "PERCENTLESQ"
    public final void mPERCENTLESQ() throws RecognitionException {
        try {
            int _type = PERCENTLESQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:953:1: ( '%%<=%%' )
            // TinyHaxeTry1.g:953:3: '%%<=%%'
            {
            match("%%<=%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTLESQ"

    // $ANTLR start "BANGEQQ"
    public final void mBANGEQQ() throws RecognitionException {
        try {
            int _type = BANGEQQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:957:2: ( '!==' )
            // TinyHaxeTry1.g:957:3: '!=='
            {
            match("!=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANGEQQ"

    // $ANTLR start "MONKEYS_AT"
    public final void mMONKEYS_AT() throws RecognitionException {
        try {
            int _type = MONKEYS_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:961:5: ( '@' )
            // TinyHaxeTry1.g:961:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONKEYS_AT"

    // $ANTLR start "BANGEQ"
    public final void mBANGEQ() throws RecognitionException {
        try {
            int _type = BANGEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:964:8: ( '!=' )
            // TinyHaxeTry1.g:964:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BANGEQ"

    // $ANTLR start "MINUS_BIGGER"
    public final void mMINUS_BIGGER() throws RecognitionException {
        try {
            int _type = MINUS_BIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:968:2: ( '->' )
            // TinyHaxeTry1.g:968:4: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_BIGGER"

    // $ANTLR start "PERCENTLL"
    public final void mPERCENTLL() throws RecognitionException {
        try {
            int _type = PERCENTLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:972:2: ( '%%<<%%' )
            // TinyHaxeTry1.g:972:3: '%%<<%%'
            {
            match("%%<<%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTLL"

    // $ANTLR start "PERCENTBB"
    public final void mPERCENTBB() throws RecognitionException {
        try {
            int _type = PERCENTBB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:975:2: ( '%%>>%%' )
            // TinyHaxeTry1.g:975:3: '%%>>%%'
            {
            match("%%>>%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTBB"

    // $ANTLR start "PERCENTBBB"
    public final void mPERCENTBBB() throws RecognitionException {
        try {
            int _type = PERCENTBBB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:978:2: ( '%%>>>%%' )
            // TinyHaxeTry1.g:978:3: '%%>>>%%'
            {
            match("%%>>>%%"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTBBB"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:981:4: ( '>' )
            // TinyHaxeTry1.g:981:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTGT"
    public final void mGTGT() throws RecognitionException {
        try {
            int _type = GTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:984:6: ( '>>' )
            // TinyHaxeTry1.g:984:8: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTGT"

    // $ANTLR start "LTLT"
    public final void mLTLT() throws RecognitionException {
        try {
            int _type = LTLT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:987:6: ( '<<' )
            // TinyHaxeTry1.g:987:8: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTLT"

    // $ANTLR start "GTGTGT"
    public final void mGTGTGT() throws RecognitionException {
        try {
            int _type = GTGTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:989:8: ( '>>>' )
            // TinyHaxeTry1.g:989:10: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTGTGT"

    // $ANTLR start "LTLTEQ"
    public final void mLTLTEQ() throws RecognitionException {
        try {
            int _type = LTLTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:992:8: ( '<<=' )
            // TinyHaxeTry1.g:992:10: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTLTEQ"

    // $ANTLR start "GTGTEQ"
    public final void mGTGTEQ() throws RecognitionException {
        try {
            int _type = GTGTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:995:8: ( '>>=' )
            // TinyHaxeTry1.g:995:10: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTGTEQ"

    // $ANTLR start "GTGTGTEQ"
    public final void mGTGTGTEQ() throws RecognitionException {
        try {
            int _type = GTGTGTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:998:9: ( '>>>=' )
            // TinyHaxeTry1.g:998:11: '>>>='
            {
            match(">>>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTGTGTEQ"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1001:6: ( '>=' )
            // TinyHaxeTry1.g:1001:8: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1003:6: ( '<=' )
            // TinyHaxeTry1.g:1003:8: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1007:5: ( '<' )
            // TinyHaxeTry1.g:1007:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1011:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // TinyHaxeTry1.g:1011:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // TinyHaxeTry1.g:1011:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // TinyHaxeTry1.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTNUM"
    public final void mINTNUM() throws RecognitionException {
        try {
            int _type = INTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1014:8: ( ( '0' .. '9' )+ )
            // TinyHaxeTry1.g:1014:10: ( '0' .. '9' )+
            {
            // TinyHaxeTry1.g:1014:10: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // TinyHaxeTry1.g:1014:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTNUM"

    // $ANTLR start "FLOATNUM"
    public final void mFLOATNUM() throws RecognitionException {
        try {
            int _type = FLOATNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1018:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // TinyHaxeTry1.g:1018:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // TinyHaxeTry1.g:1018:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1018:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    match('.'); 
                    // TinyHaxeTry1.g:1018:25: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1018:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // TinyHaxeTry1.g:1018:37: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // TinyHaxeTry1.g:1018:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1019:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // TinyHaxeTry1.g:1019:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1019:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // TinyHaxeTry1.g:1019:25: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // TinyHaxeTry1.g:1019:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:1020:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // TinyHaxeTry1.g:1020:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1020:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    mEXPONENT(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATNUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1024:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='/') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='/') ) {
                    alt22=1;
                }
                else if ( (LA22_1=='*') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // TinyHaxeTry1.g:1024:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // TinyHaxeTry1.g:1024:14: (~ ( '\\n' | '\\r' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1024:14: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // TinyHaxeTry1.g:1024:28: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // TinyHaxeTry1.g:1024:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1025:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // TinyHaxeTry1.g:1025:14: ( options {greedy=false; } : . )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0=='*') ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1=='/') ) {
                                alt21=2;
                            }
                            else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                                alt21=1;
                            }


                        }
                        else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1025:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1029:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // TinyHaxeTry1.g:1029:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // TinyHaxeTry1.g:1030:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\\') ) {
                    alt23=1;
                }
                else if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='[')||(LA23_0>=']' && LA23_0<='\uFFFF')) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // TinyHaxeTry1.g:1030:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // TinyHaxeTry1.g:1031:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "TS"
    public final void mTS() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1060:3: ( ( ' ' | '\\t' ) )
            // TinyHaxeTry1.g:1061:5: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "TS"

    // $ANTLR start "PREPROCESSOR_DIRECTIVE"
    public final void mPREPROCESSOR_DIRECTIVE() throws RecognitionException {
        try {
            int _type = PREPROCESSOR_DIRECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // TinyHaxeTry1.g:1064:23: ( | PP_CONDITIONAL )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='#') ) {
                alt24=2;
            }
            else {
                alt24=1;}
            switch (alt24) {
                case 1 :
                    // TinyHaxeTry1.g:1065:2: 
                    {
                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1065:4: PP_CONDITIONAL
                    {
                    mPP_CONDITIONAL(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREPROCESSOR_DIRECTIVE"

    // $ANTLR start "PP_CONDITIONAL"
    public final void mPP_CONDITIONAL() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1068:15: ( ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN ) )
            // TinyHaxeTry1.g:1069:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            {
            // TinyHaxeTry1.g:1069:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // TinyHaxeTry1.g:1069:3: IF_TOKEN
                    {
                    mIF_TOKEN(); 

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1070:4: ELSE_TOKEN
                    {
                    mELSE_TOKEN(); 

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:1071:4: ENDIF_TOKEN
                    {
                    mENDIF_TOKEN(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PP_CONDITIONAL"

    // $ANTLR start "IF_TOKEN"
    public final void mIF_TOKEN() throws RecognitionException {
        try {
            CommonToken ppe=null;

             boolean process = true; 
            // TinyHaxeTry1.g:1075:35: ( ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION ) )
            // TinyHaxeTry1.g:1076:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            {
            // TinyHaxeTry1.g:1076:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            // TinyHaxeTry1.g:1076:3: '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION
            {
            match('#'); 
            // TinyHaxeTry1.g:1076:9: ( TS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // TinyHaxeTry1.g:1076:9: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("if"); 

            // TinyHaxeTry1.g:1076:21: ( TS )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\t'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // TinyHaxeTry1.g:1076:21: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            int ppeStart3443 = getCharIndex();
            mPP_EXPRESSION(); 
            ppe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ppeStart3443, getCharIndex()-1);

            }


                // if our parent is processing check this if
                //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  IF_TOKEN");
                if (!processing.empty() && processing.peek())
                    processing.push(returns.pop());
                else
                    processing.push(false);


            }

        }
        finally {
        }
    }
    // $ANTLR end "IF_TOKEN"

    // $ANTLR start "ELSE_TOKEN"
    public final void mELSE_TOKEN() throws RecognitionException {
        try {
            CommonToken e=null;

            // TinyHaxeTry1.g:1086:11: ( ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION ) )
            // TinyHaxeTry1.g:1087:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            {
            // TinyHaxeTry1.g:1087:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // TinyHaxeTry1.g:1087:4: '#' ( TS )* e= 'else'
                    {
                    match('#'); 
                    // TinyHaxeTry1.g:1087:10: ( TS )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\t'||LA28_0==' ') ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1087:10: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    int eStart = getCharIndex();
                    match("else"); 
                    e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1088:4: '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION
                    {
                    match('#'); 
                    // TinyHaxeTry1.g:1088:10: ( TS )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\t'||LA29_0==' ') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1088:10: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match("elseif"); 

                    // TinyHaxeTry1.g:1088:27: ( TS )+
                    int cnt30=0;
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\t'||LA30_0==' ') ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1088:27: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt30 >= 1 ) break loop30;
                                EarlyExitException eee =
                                    new EarlyExitException(30, input);
                                throw eee;
                        }
                        cnt30++;
                    } while (true);

                    mPP_EXPRESSION(); 

                    }
                    break;

            }


            		// We are in elseif
                   	if (e == null)
            	{
            	    //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  ELIF_TOKEN");
            		if (!processing.empty() && !processing.peek())
            		{
            			processing.pop();
            			// if our parent was processing, do else logic
            		    //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing.  ELIF_TOKEN2");
            			if (!processing.empty() && processing.peek())
            				processing.push(returns.pop());
            			else
            				processing.push(false);
            		}
            		else
            		{
            			processing.pop();
            			processing.push(false);
            		}
            	}
            	else
            	{
            		// we are in a else
            		if (!processing.empty())
            		{
            			boolean bDoElse = !processing.pop();

            			// if our parent was processing				
            		    //Debug.Assert(Processing.Count > 0, "Stack underflow preprocessing, ELSE_TOKEN");
            			if (!processing.empty() && processing.peek())
            				processing.push(bDoElse);
            			else
            				processing.push(false);
            		}
            	}
            	skip();
            	

            }

        }
        finally {
        }
    }
    // $ANTLR end "ELSE_TOKEN"

    // $ANTLR start "ENDIF_TOKEN"
    public final void mENDIF_TOKEN() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1128:12: ( '#' 'end' )
            // TinyHaxeTry1.g:1129:2: '#' 'end'
            {
            match('#'); 
            match("end"); 


            		if (!processing.empty())
            			processing.pop();
            		skip();
            	

            }

        }
        finally {
        }
    }
    // $ANTLR end "ENDIF_TOKEN"

    // $ANTLR start "PP_EXPRESSION"
    public final void mPP_EXPRESSION() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1140:14: ( PP_OR_EXPRESSION )
            // TinyHaxeTry1.g:1141:2: PP_OR_EXPRESSION
            {
            mPP_OR_EXPRESSION(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "PP_EXPRESSION"

    // $ANTLR start "PP_OR_EXPRESSION"
    public final void mPP_OR_EXPRESSION() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1144:17: ( PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )* )
            // TinyHaxeTry1.g:1145:2: PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            {
            mPP_AND_EXPRESSION(); 
            // TinyHaxeTry1.g:1145:22: ( TS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\t'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // TinyHaxeTry1.g:1145:22: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // TinyHaxeTry1.g:1145:28: ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='|') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // TinyHaxeTry1.g:1145:29: '||' ( TS )* PP_AND_EXPRESSION ( TS )*
            	    {
            	    match("||"); 

            	    // TinyHaxeTry1.g:1145:36: ( TS )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0=='\t'||LA33_0==' ') ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // TinyHaxeTry1.g:1145:36: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    mPP_AND_EXPRESSION(); 
            	    // TinyHaxeTry1.g:1145:62: ( TS )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0=='\t'||LA34_0==' ') ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // TinyHaxeTry1.g:1145:62: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "PP_OR_EXPRESSION"

    // $ANTLR start "PP_AND_EXPRESSION"
    public final void mPP_AND_EXPRESSION() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1148:18: ( PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )* )
            // TinyHaxeTry1.g:1149:2: PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            {
            mPP_UNARY_EXPRESSION(); 
            // TinyHaxeTry1.g:1149:24: ( TS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='\t'||LA36_0==' ') ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // TinyHaxeTry1.g:1149:24: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // TinyHaxeTry1.g:1149:30: ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='&') ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // TinyHaxeTry1.g:1149:31: '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )*
            	    {
            	    match("&&"); 

            	    // TinyHaxeTry1.g:1149:38: ( TS )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0=='\t'||LA37_0==' ') ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // TinyHaxeTry1.g:1149:38: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    mPP_UNARY_EXPRESSION(); 
            	    // TinyHaxeTry1.g:1149:66: ( TS )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0=='\t'||LA38_0==' ') ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // TinyHaxeTry1.g:1149:66: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "PP_AND_EXPRESSION"

    // $ANTLR start "PP_UNARY_EXPRESSION"
    public final void mPP_UNARY_EXPRESSION() throws RecognitionException {
        try {
            CommonToken pe=null;
            CommonToken ue=null;

            // TinyHaxeTry1.g:1152:20: (pe= PP_PRIMARY_EXPRESSION | '!' ( TS )* ue= PP_UNARY_EXPRESSION )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='('||(LA41_0>='A' && LA41_0<='Z')||LA41_0=='_'||(LA41_0>='a' && LA41_0<='z')) ) {
                alt41=1;
            }
            else if ( (LA41_0=='!') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // TinyHaxeTry1.g:1153:2: pe= PP_PRIMARY_EXPRESSION
                    {
                    int peStart3629 = getCharIndex();
                    mPP_PRIMARY_EXPRESSION(); 
                    pe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, peStart3629, getCharIndex()-1);

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1154:4: '!' ( TS )* ue= PP_UNARY_EXPRESSION
                    {
                    match('!'); 
                    // TinyHaxeTry1.g:1154:10: ( TS )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\t'||LA40_0==' ') ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // TinyHaxeTry1.g:1154:10: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    int ueStart3647 = getCharIndex();
                    mPP_UNARY_EXPRESSION(); 
                    ue = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ueStart3647, getCharIndex()-1);
                     returns.push(!returns.pop()); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PP_UNARY_EXPRESSION"

    // $ANTLR start "PP_PRIMARY_EXPRESSION"
    public final void mPP_PRIMARY_EXPRESSION() throws RecognitionException {
        try {
            CommonToken IDENTIFIER1=null;

            // TinyHaxeTry1.g:1158:22: ( IDENTIFIER | '(' PP_EXPRESSION ')' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>='A' && LA42_0<='Z')||LA42_0=='_'||(LA42_0>='a' && LA42_0<='z')) ) {
                alt42=1;
            }
            else if ( (LA42_0=='(') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // TinyHaxeTry1.g:1159:2: IDENTIFIER
                    {
                    int IDENTIFIER1Start3664 = getCharIndex();
                    mIDENTIFIER(); 
                    IDENTIFIER1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, IDENTIFIER1Start3664, getCharIndex()-1);
                     
                    		//returns.push(MacroDefines.ContainsKey(IDENTIFIER1.Text));
                    		returns.push(false); // TODO
                    	

                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1164:4: '(' PP_EXPRESSION ')'
                    {
                    match('('); 
                    mPP_EXPRESSION(); 
                    match(')'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PP_PRIMARY_EXPRESSION"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1172:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // TinyHaxeTry1.g:1172:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // TinyHaxeTry1.g:1172:22: ( '+' | '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='+'||LA43_0=='-') ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // TinyHaxeTry1.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // TinyHaxeTry1.g:1172:33: ( '0' .. '9' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='0' && LA44_0<='9')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // TinyHaxeTry1.g:1172:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1175:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // TinyHaxeTry1.g:1175:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1179:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt45=1;
                    }
                    break;
                case 'u':
                    {
                    alt45=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // TinyHaxeTry1.g:1179:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1180:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:1181:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1186:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\\') ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>='0' && LA46_1<='3')) ) {
                    int LA46_2 = input.LA(3);

                    if ( ((LA46_2>='0' && LA46_2<='7')) ) {
                        int LA46_4 = input.LA(4);

                        if ( ((LA46_4>='0' && LA46_4<='7')) ) {
                            alt46=1;
                        }
                        else {
                            alt46=2;}
                    }
                    else {
                        alt46=3;}
                }
                else if ( ((LA46_1>='4' && LA46_1<='7')) ) {
                    int LA46_3 = input.LA(3);

                    if ( ((LA46_3>='0' && LA46_3<='7')) ) {
                        alt46=2;
                    }
                    else {
                        alt46=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // TinyHaxeTry1.g:1186:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // TinyHaxeTry1.g:1186:14: ( '0' .. '3' )
                    // TinyHaxeTry1.g:1186:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // TinyHaxeTry1.g:1186:25: ( '0' .. '7' )
                    // TinyHaxeTry1.g:1186:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // TinyHaxeTry1.g:1186:36: ( '0' .. '7' )
                    // TinyHaxeTry1.g:1186:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // TinyHaxeTry1.g:1187:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // TinyHaxeTry1.g:1187:14: ( '0' .. '7' )
                    // TinyHaxeTry1.g:1187:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // TinyHaxeTry1.g:1187:25: ( '0' .. '7' )
                    // TinyHaxeTry1.g:1187:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // TinyHaxeTry1.g:1188:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // TinyHaxeTry1.g:1188:14: ( '0' .. '7' )
                    // TinyHaxeTry1.g:1188:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // TinyHaxeTry1.g:1193:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // TinyHaxeTry1.g:1193:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 
            match('u'); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 
            mHEX_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // TinyHaxeTry1.g:1:8: ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PREPROCESSOR_DIRECTIVE )
        int alt47=128;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // TinyHaxeTry1.g:1:10: WS
                {
                mWS(); 

                }
                break;
            case 2 :
                // TinyHaxeTry1.g:1:13: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 3 :
                // TinyHaxeTry1.g:1:25: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 4 :
                // TinyHaxeTry1.g:1:36: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 5 :
                // TinyHaxeTry1.g:1:48: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 6 :
                // TinyHaxeTry1.g:1:57: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 7 :
                // TinyHaxeTry1.g:1:65: BREAK
                {
                mBREAK(); 

                }
                break;
            case 8 :
                // TinyHaxeTry1.g:1:71: BYTE
                {
                mBYTE(); 

                }
                break;
            case 9 :
                // TinyHaxeTry1.g:1:76: CASE
                {
                mCASE(); 

                }
                break;
            case 10 :
                // TinyHaxeTry1.g:1:81: CATCH
                {
                mCATCH(); 

                }
                break;
            case 11 :
                // TinyHaxeTry1.g:1:87: CHAR
                {
                mCHAR(); 

                }
                break;
            case 12 :
                // TinyHaxeTry1.g:1:92: CLASS
                {
                mCLASS(); 

                }
                break;
            case 13 :
                // TinyHaxeTry1.g:1:98: CONST
                {
                mCONST(); 

                }
                break;
            case 14 :
                // TinyHaxeTry1.g:1:104: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 15 :
                // TinyHaxeTry1.g:1:113: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 16 :
                // TinyHaxeTry1.g:1:121: DO
                {
                mDO(); 

                }
                break;
            case 17 :
                // TinyHaxeTry1.g:1:124: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 18 :
                // TinyHaxeTry1.g:1:131: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // TinyHaxeTry1.g:1:136: ENUM
                {
                mENUM(); 

                }
                break;
            case 20 :
                // TinyHaxeTry1.g:1:141: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 21 :
                // TinyHaxeTry1.g:1:149: FINAL
                {
                mFINAL(); 

                }
                break;
            case 22 :
                // TinyHaxeTry1.g:1:155: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 23 :
                // TinyHaxeTry1.g:1:163: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 24 :
                // TinyHaxeTry1.g:1:169: FOR
                {
                mFOR(); 

                }
                break;
            case 25 :
                // TinyHaxeTry1.g:1:173: GOTO
                {
                mGOTO(); 

                }
                break;
            case 26 :
                // TinyHaxeTry1.g:1:178: IF
                {
                mIF(); 

                }
                break;
            case 27 :
                // TinyHaxeTry1.g:1:181: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 28 :
                // TinyHaxeTry1.g:1:192: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 29 :
                // TinyHaxeTry1.g:1:199: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 30 :
                // TinyHaxeTry1.g:1:210: INT
                {
                mINT(); 

                }
                break;
            case 31 :
                // TinyHaxeTry1.g:1:214: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 32 :
                // TinyHaxeTry1.g:1:224: LONG
                {
                mLONG(); 

                }
                break;
            case 33 :
                // TinyHaxeTry1.g:1:229: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 34 :
                // TinyHaxeTry1.g:1:236: NEW
                {
                mNEW(); 

                }
                break;
            case 35 :
                // TinyHaxeTry1.g:1:240: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 36 :
                // TinyHaxeTry1.g:1:248: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 37 :
                // TinyHaxeTry1.g:1:256: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 38 :
                // TinyHaxeTry1.g:1:266: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 39 :
                // TinyHaxeTry1.g:1:273: RETURN
                {
                mRETURN(); 

                }
                break;
            case 40 :
                // TinyHaxeTry1.g:1:280: SHORT
                {
                mSHORT(); 

                }
                break;
            case 41 :
                // TinyHaxeTry1.g:1:286: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 42 :
                // TinyHaxeTry1.g:1:293: INLINE
                {
                mINLINE(); 

                }
                break;
            case 43 :
                // TinyHaxeTry1.g:1:300: DYNAMIC
                {
                mDYNAMIC(); 

                }
                break;
            case 44 :
                // TinyHaxeTry1.g:1:308: OVERRIDE
                {
                mOVERRIDE(); 

                }
                break;
            case 45 :
                // TinyHaxeTry1.g:1:317: STRICTFP
                {
                mSTRICTFP(); 

                }
                break;
            case 46 :
                // TinyHaxeTry1.g:1:326: SUPER
                {
                mSUPER(); 

                }
                break;
            case 47 :
                // TinyHaxeTry1.g:1:332: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 48 :
                // TinyHaxeTry1.g:1:339: THIS
                {
                mTHIS(); 

                }
                break;
            case 49 :
                // TinyHaxeTry1.g:1:344: THROW
                {
                mTHROW(); 

                }
                break;
            case 50 :
                // TinyHaxeTry1.g:1:350: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 51 :
                // TinyHaxeTry1.g:1:357: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 52 :
                // TinyHaxeTry1.g:1:367: TRY
                {
                mTRY(); 

                }
                break;
            case 53 :
                // TinyHaxeTry1.g:1:371: VOID
                {
                mVOID(); 

                }
                break;
            case 54 :
                // TinyHaxeTry1.g:1:376: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 55 :
                // TinyHaxeTry1.g:1:385: WHILE
                {
                mWHILE(); 

                }
                break;
            case 56 :
                // TinyHaxeTry1.g:1:391: TRUE
                {
                mTRUE(); 

                }
                break;
            case 57 :
                // TinyHaxeTry1.g:1:396: FALSE
                {
                mFALSE(); 

                }
                break;
            case 58 :
                // TinyHaxeTry1.g:1:402: NULL
                {
                mNULL(); 

                }
                break;
            case 59 :
                // TinyHaxeTry1.g:1:407: CAST
                {
                mCAST(); 

                }
                break;
            case 60 :
                // TinyHaxeTry1.g:1:412: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 61 :
                // TinyHaxeTry1.g:1:421: IN
                {
                mIN(); 

                }
                break;
            case 62 :
                // TinyHaxeTry1.g:1:424: VAR
                {
                mVAR(); 

                }
                break;
            case 63 :
                // TinyHaxeTry1.g:1:428: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 64 :
                // TinyHaxeTry1.g:1:436: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 65 :
                // TinyHaxeTry1.g:1:443: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 66 :
                // TinyHaxeTry1.g:1:450: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 67 :
                // TinyHaxeTry1.g:1:457: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 68 :
                // TinyHaxeTry1.g:1:464: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 69 :
                // TinyHaxeTry1.g:1:471: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 70 :
                // TinyHaxeTry1.g:1:480: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 71 :
                // TinyHaxeTry1.g:1:489: SEMI
                {
                mSEMI(); 

                }
                break;
            case 72 :
                // TinyHaxeTry1.g:1:494: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 73 :
                // TinyHaxeTry1.g:1:500: DOT
                {
                mDOT(); 

                }
                break;
            case 74 :
                // TinyHaxeTry1.g:1:504: ELLIPSIS
                {
                mELLIPSIS(); 

                }
                break;
            case 75 :
                // TinyHaxeTry1.g:1:513: EQ
                {
                mEQ(); 

                }
                break;
            case 76 :
                // TinyHaxeTry1.g:1:516: BANG
                {
                mBANG(); 

                }
                break;
            case 77 :
                // TinyHaxeTry1.g:1:521: TILDE
                {
                mTILDE(); 

                }
                break;
            case 78 :
                // TinyHaxeTry1.g:1:527: QUES
                {
                mQUES(); 

                }
                break;
            case 79 :
                // TinyHaxeTry1.g:1:532: COLON
                {
                mCOLON(); 

                }
                break;
            case 80 :
                // TinyHaxeTry1.g:1:538: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 81 :
                // TinyHaxeTry1.g:1:543: AMPAMP
                {
                mAMPAMP(); 

                }
                break;
            case 82 :
                // TinyHaxeTry1.g:1:550: BARBAR
                {
                mBARBAR(); 

                }
                break;
            case 83 :
                // TinyHaxeTry1.g:1:557: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 84 :
                // TinyHaxeTry1.g:1:566: SUBSUB
                {
                mSUBSUB(); 

                }
                break;
            case 85 :
                // TinyHaxeTry1.g:1:573: PLUS
                {
                mPLUS(); 

                }
                break;
            case 86 :
                // TinyHaxeTry1.g:1:578: SUB
                {
                mSUB(); 

                }
                break;
            case 87 :
                // TinyHaxeTry1.g:1:582: STAR
                {
                mSTAR(); 

                }
                break;
            case 88 :
                // TinyHaxeTry1.g:1:587: SLASH
                {
                mSLASH(); 

                }
                break;
            case 89 :
                // TinyHaxeTry1.g:1:593: AMP
                {
                mAMP(); 

                }
                break;
            case 90 :
                // TinyHaxeTry1.g:1:597: BAR
                {
                mBAR(); 

                }
                break;
            case 91 :
                // TinyHaxeTry1.g:1:601: CARET
                {
                mCARET(); 

                }
                break;
            case 92 :
                // TinyHaxeTry1.g:1:607: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 93 :
                // TinyHaxeTry1.g:1:615: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 94 :
                // TinyHaxeTry1.g:1:622: SUBEQ
                {
                mSUBEQ(); 

                }
                break;
            case 95 :
                // TinyHaxeTry1.g:1:628: STAREQ
                {
                mSTAREQ(); 

                }
                break;
            case 96 :
                // TinyHaxeTry1.g:1:635: SLASHEQ
                {
                mSLASHEQ(); 

                }
                break;
            case 97 :
                // TinyHaxeTry1.g:1:643: AMPEQ
                {
                mAMPEQ(); 

                }
                break;
            case 98 :
                // TinyHaxeTry1.g:1:649: BAREQ
                {
                mBAREQ(); 

                }
                break;
            case 99 :
                // TinyHaxeTry1.g:1:655: CARETEQ
                {
                mCARETEQ(); 

                }
                break;
            case 100 :
                // TinyHaxeTry1.g:1:663: PERCENTEQ
                {
                mPERCENTEQ(); 

                }
                break;
            case 101 :
                // TinyHaxeTry1.g:1:673: PERCENTDLQ
                {
                mPERCENTDLQ(); 

                }
                break;
            case 102 :
                // TinyHaxeTry1.g:1:684: PERCENTDBQ
                {
                mPERCENTDBQ(); 

                }
                break;
            case 103 :
                // TinyHaxeTry1.g:1:695: PERCENTDBBQ
                {
                mPERCENTDBBQ(); 

                }
                break;
            case 104 :
                // TinyHaxeTry1.g:1:707: EQEQEQ
                {
                mEQEQEQ(); 

                }
                break;
            case 105 :
                // TinyHaxeTry1.g:1:714: PERCENTLESQ
                {
                mPERCENTLESQ(); 

                }
                break;
            case 106 :
                // TinyHaxeTry1.g:1:726: BANGEQQ
                {
                mBANGEQQ(); 

                }
                break;
            case 107 :
                // TinyHaxeTry1.g:1:734: MONKEYS_AT
                {
                mMONKEYS_AT(); 

                }
                break;
            case 108 :
                // TinyHaxeTry1.g:1:745: BANGEQ
                {
                mBANGEQ(); 

                }
                break;
            case 109 :
                // TinyHaxeTry1.g:1:752: MINUS_BIGGER
                {
                mMINUS_BIGGER(); 

                }
                break;
            case 110 :
                // TinyHaxeTry1.g:1:765: PERCENTLL
                {
                mPERCENTLL(); 

                }
                break;
            case 111 :
                // TinyHaxeTry1.g:1:775: PERCENTBB
                {
                mPERCENTBB(); 

                }
                break;
            case 112 :
                // TinyHaxeTry1.g:1:785: PERCENTBBB
                {
                mPERCENTBBB(); 

                }
                break;
            case 113 :
                // TinyHaxeTry1.g:1:796: GT
                {
                mGT(); 

                }
                break;
            case 114 :
                // TinyHaxeTry1.g:1:799: GTGT
                {
                mGTGT(); 

                }
                break;
            case 115 :
                // TinyHaxeTry1.g:1:804: LTLT
                {
                mLTLT(); 

                }
                break;
            case 116 :
                // TinyHaxeTry1.g:1:809: GTGTGT
                {
                mGTGTGT(); 

                }
                break;
            case 117 :
                // TinyHaxeTry1.g:1:816: LTLTEQ
                {
                mLTLTEQ(); 

                }
                break;
            case 118 :
                // TinyHaxeTry1.g:1:823: GTGTEQ
                {
                mGTGTEQ(); 

                }
                break;
            case 119 :
                // TinyHaxeTry1.g:1:830: GTGTGTEQ
                {
                mGTGTGTEQ(); 

                }
                break;
            case 120 :
                // TinyHaxeTry1.g:1:839: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 121 :
                // TinyHaxeTry1.g:1:844: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 122 :
                // TinyHaxeTry1.g:1:849: LT
                {
                mLT(); 

                }
                break;
            case 123 :
                // TinyHaxeTry1.g:1:852: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 124 :
                // TinyHaxeTry1.g:1:863: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 125 :
                // TinyHaxeTry1.g:1:870: FLOATNUM
                {
                mFLOATNUM(); 

                }
                break;
            case 126 :
                // TinyHaxeTry1.g:1:879: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 127 :
                // TinyHaxeTry1.g:1:887: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 128 :
                // TinyHaxeTry1.g:1:901: PREPROCESSOR_DIRECTIVE
                {
                mPREPROCESSOR_DIRECTIVE(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA9_eotS =
        "\11\uffff\2\13\1\uffff\1\15\2\uffff";
    static final String DFA9_eofS =
        "\17\uffff";
    static final String DFA9_minS =
        "\1\42\10\uffff\2\60\1\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\164\10\uffff\2\67\1\uffff\1\67\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\13\1\uffff"+
        "\1\12\1\11";
    static final String DFA9_specialS =
        "\17\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\6\4\uffff\1\7\10\uffff\4\11\4\12\44\uffff\1\10\5\uffff\1"+
            "\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\10\14",
            "\10\15",
            "",
            "\10\16",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "546:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
        }
    }
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\2\56\3\uffff";
    static final String DFA18_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1017:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA25_eotS =
        "\7\uffff";
    static final String DFA25_eofS =
        "\7\uffff";
    static final String DFA25_minS =
        "\1\43\1\11\1\154\1\11\3\uffff";
    static final String DFA25_maxS =
        "\1\43\1\151\1\156\1\151\3\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\1\1\3\1\2";
    static final String DFA25_specialS =
        "\7\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\3\26\uffff\1\3\104\uffff\1\2\3\uffff\1\4",
            "\1\6\1\uffff\1\5",
            "\1\3\26\uffff\1\3\104\uffff\1\6\3\uffff\1\4",
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
            return "1069:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )";
        }
    }
    static final String DFA31_eotS =
        "\6\uffff\1\10\2\uffff";
    static final String DFA31_eofS =
        "\11\uffff";
    static final String DFA31_minS =
        "\1\43\2\11\1\154\1\163\1\145\1\151\2\uffff";
    static final String DFA31_maxS =
        "\1\43\2\145\1\154\1\163\1\145\1\151\2\uffff";
    static final String DFA31_acceptS =
        "\7\uffff\1\2\1\1";
    static final String DFA31_specialS =
        "\11\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1",
            "\1\2\26\uffff\1\2\104\uffff\1\3",
            "\1\2\26\uffff\1\2\104\uffff\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
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
            return "1087:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )";
        }
    }
    static final String DFA47_eotS =
        "\1\65\1\uffff\2\70\1\uffff\25\63\10\uffff\1\153\1\155\1\157\3\uffff"+
        "\1\162\1\165\1\170\1\174\1\176\1\u0081\1\u0083\1\u0086\1\uffff\1"+
        "\u0089\1\u008c\6\uffff\1\70\1\uffff\1\u008e\1\uffff\1\70\11\63\1"+
        "\u009a\12\63\1\u00a5\1\63\1\u00aa\25\63\2\uffff\1\u00c6\1\uffff"+
        "\1\u00c8\30\uffff\1\u00cd\2\uffff\1\u00cf\2\uffff\1\70\1\uffff\13"+
        "\63\1\uffff\5\63\1\u00e2\4\63\1\uffff\4\63\1\uffff\1\u00ec\2\63"+
        "\1\u00ef\17\63\1\u00ff\4\63\1\u0104\1\63\6\uffff\1\u010a\4\uffff"+
        "\1\63\1\u010c\1\63\1\u010e\1\u010f\1\u0110\1\63\1\u0112\6\63\1\u0119"+
        "\1\u011a\2\63\1\uffff\3\63\1\u0121\5\63\1\uffff\1\u0127\1\63\1\uffff"+
        "\1\u0129\13\63\1\u0135\2\63\1\uffff\1\u0138\1\63\1\u013a\1\63\1"+
        "\uffff\1\63\5\uffff\1\63\1\uffff\1\u0141\3\uffff\1\u0142\1\uffff"+
        "\1\u0143\1\u0144\4\63\2\uffff\2\63\1\u014c\1\u014d\1\63\1\u014f"+
        "\1\uffff\5\63\1\uffff\1\63\1\uffff\5\63\1\u015b\2\63\1\u015e\2\63"+
        "\1\uffff\1\u0162\1\63\1\uffff\1\63\1\uffff\1\63\1\u0166\3\uffff"+
        "\1\63\4\uffff\2\63\1\u016d\2\63\1\u0170\1\63\2\uffff\1\63\1\uffff"+
        "\1\63\1\u0174\2\63\1\u0177\1\u0178\3\63\1\u017c\1\u017d\1\uffff"+
        "\1\u017e\1\63\1\uffff\1\u0180\1\63\1\u0182\1\uffff\3\63\1\uffff"+
        "\1\u0187\1\u0189\1\uffff\2\63\1\u018d\1\uffff\1\u018e\1\u018f\1"+
        "\uffff\1\u0190\2\63\1\uffff\2\63\2\uffff\1\u0195\1\u0196\1\63\3"+
        "\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\u019b\1\63\4\uffff\1\u019e"+
        "\1\u019f\1\u01a0\4\uffff\1\u01a1\3\63\2\uffff\1\63\1\u01a6\1\u01a7"+
        "\1\63\1\uffff\1\u01a9\5\uffff\2\63\1\u01ac\1\u01ad\2\uffff\1\u01ae"+
        "\1\uffff\1\u01af\1\u01b0\5\uffff";
    static final String DFA47_eofS =
        "\u01b1\uffff";
    static final String DFA47_minS =
        "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\162\1\141\1\145\1\154"+
        "\1\141\1\154\1\157\1\146\1\156\1\157\2\141\1\145\1\150\1\166\1\150"+
        "\1\157\1\141\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\55"+
        "\1\75\1\52\1\75\1\45\1\uffff\1\75\1\74\3\uffff\2\60\1\uffff\1\56"+
        "\1\uffff\1\56\1\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2\141\1"+
        "\156\1\146\1\60\1\156\1\163\1\165\1\164\1\156\1\162\1\154\1\156"+
        "\1\157\1\164\1\60\1\160\1\60\1\164\1\156\1\164\1\167\1\154\1\143"+
        "\1\151\1\142\1\164\1\157\1\141\1\160\1\151\1\145\1\151\1\141\1\160"+
        "\1\151\1\154\1\162\1\151\2\uffff\1\75\1\uffff\1\75\26\uffff\1\74"+
        "\1\uffff\1\75\2\uffff\1\75\2\uffff\1\60\1\uffff\1\164\1\154\1\141"+
        "\2\145\1\143\1\162\2\163\1\141\1\142\1\uffff\1\141\1\145\1\155\1"+
        "\145\1\141\1\60\1\163\1\143\1\141\1\157\1\uffff\1\154\1\164\1\145"+
        "\1\151\1\uffff\1\60\1\147\1\151\1\60\1\154\1\153\1\166\1\164\1\154"+
        "\1\165\1\162\1\164\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\60"+
        "\2\145\1\144\1\141\1\60\1\154\4\uffff\1\74\1\76\1\75\4\uffff\1\162"+
        "\1\60\1\153\3\60\1\150\1\60\1\163\1\164\1\151\1\165\1\154\1\155"+
        "\2\60\1\156\1\154\1\uffff\1\145\2\164\1\60\1\145\1\162\1\141\1\162"+
        "\1\156\1\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1"+
        "\164\1\151\1\143\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff\1\60"+
        "\1\144\1\60\1\164\1\uffff\1\145\1\45\1\uffff\1\45\2\uffff\1\141"+
        "\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60\1\156\1\154\1\145\1\151"+
        "\2\uffff\1\144\1\156\2\60\1\151\1\60\1\uffff\1\155\1\164\1\156\1"+
        "\146\1\145\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\60\1"+
        "\143\1\164\1\60\1\150\1\151\1\uffff\1\60\1\151\1\uffff\1\145\1\uffff"+
        "\1\151\1\60\3\45\1\143\4\uffff\1\165\1\164\1\60\1\143\1\163\1\60"+
        "\1\171\2\uffff\1\157\1\uffff\1\145\1\60\1\143\1\141\2\60\2\145\1"+
        "\164\2\60\1\uffff\1\60\1\146\1\uffff\1\60\1\144\1\60\1\uffff\1\145"+
        "\1\146\1\154\1\uffff\2\75\1\45\1\164\1\145\1\60\1\uffff\2\60\1\uffff"+
        "\1\60\2\156\1\uffff\1\145\1\143\2\uffff\2\60\1\145\3\uffff\1\160"+
        "\1\uffff\1\145\1\uffff\1\156\1\60\1\145\4\uffff\1\75\2\60\4\uffff"+
        "\1\60\1\164\1\157\1\145\2\uffff\1\144\2\60\1\164\1\uffff\1\60\5"+
        "\uffff\1\163\1\146\2\60\2\uffff\1\60\1\uffff\2\60\5\uffff";
    static final String DFA47_maxS =
        "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\157\1\171\1\157\1\171"+
        "\1\170\1\165\1\154\1\157\2\156\1\157\2\165\1\145\1\167\1\166\1\171"+
        "\2\157\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1\76\4\75"+
        "\1\uffff\1\76\1\75\3\uffff\2\146\1\uffff\1\154\1\uffff\1\145\1\uffff"+
        "\1\154\1\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1\156\1\163"+
        "\1\165\1\164\1\156\1\162\1\154\1\156\1\157\1\164\1\172\1\160\1\172"+
        "\1\164\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162"+
        "\1\160\1\151\1\145\1\162\1\171\1\160\1\151\1\154\1\162\1\151\2\uffff"+
        "\1\75\1\uffff\1\75\26\uffff\1\76\1\uffff\1\76\2\uffff\1\75\2\uffff"+
        "\1\154\1\uffff\1\164\1\154\1\141\1\145\1\164\1\143\1\162\1\163\1"+
        "\164\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\1\141\1\172\1\163"+
        "\1\143\1\141\1\157\1\uffff\1\157\1\164\1\145\1\151\1\uffff\1\172"+
        "\1\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164"+
        "\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\172\2\145\1\144\1\141"+
        "\1\172\1\154\4\uffff\1\75\1\76\1\75\4\uffff\1\162\1\172\1\153\3"+
        "\172\1\150\1\172\1\163\1\164\1\151\1\165\1\154\1\155\2\172\1\162"+
        "\1\154\1\uffff\1\145\2\164\1\172\1\145\1\162\1\141\1\162\1\156\1"+
        "\uffff\1\172\1\166\1\uffff\1\172\2\141\1\145\1\151\1\162\1\164\1"+
        "\151\1\143\1\162\1\143\1\162\1\172\1\167\1\163\1\uffff\1\172\1\144"+
        "\1\172\1\164\1\uffff\1\145\1\45\1\uffff\1\76\2\uffff\1\141\1\uffff"+
        "\1\172\3\uffff\1\172\1\uffff\2\172\1\156\1\154\1\145\1\151\2\uffff"+
        "\1\144\1\156\2\172\1\151\1\172\1\uffff\1\155\1\164\1\156\1\146\1"+
        "\145\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1"+
        "\164\1\172\1\150\1\151\1\uffff\1\172\1\151\1\uffff\1\145\1\uffff"+
        "\1\151\1\172\3\45\1\143\4\uffff\1\165\1\164\1\172\1\143\1\163\1"+
        "\172\1\171\2\uffff\1\157\1\uffff\1\145\1\172\1\143\1\141\2\172\2"+
        "\145\1\164\2\172\1\uffff\1\172\1\146\1\uffff\1\172\1\144\1\172\1"+
        "\uffff\1\145\1\146\1\154\1\uffff\2\75\1\45\1\164\1\145\1\172\1\uffff"+
        "\2\172\1\uffff\1\172\2\156\1\uffff\1\145\1\143\2\uffff\2\172\1\145"+
        "\3\uffff\1\160\1\uffff\1\145\1\uffff\1\156\1\172\1\145\4\uffff\1"+
        "\75\2\172\4\uffff\1\172\1\164\1\157\1\145\2\uffff\1\144\2\172\1"+
        "\164\1\uffff\1\172\5\uffff\1\163\1\146\2\172\2\uffff\1\172\1\uffff"+
        "\2\172\5\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\25\uffff\1\101\1\102\1\103\1\104\1\105"+
        "\1\106\1\107\1\110\3\uffff\1\115\1\116\1\117\10\uffff\1\153\2\uffff"+
        "\1\173\1\177\1\u0080\2\uffff\1\3\1\uffff\1\175\1\uffff\1\2\55\uffff"+
        "\1\112\1\111\1\uffff\1\113\1\uffff\1\114\1\121\1\141\1\131\1\122"+
        "\1\142\1\132\1\123\1\135\1\125\1\124\1\136\1\155\1\126\1\137\1\127"+
        "\1\140\1\176\1\130\1\143\1\133\1\144\1\uffff\1\134\1\uffff\1\170"+
        "\1\161\1\uffff\1\171\1\172\1\uffff\1\174\13\uffff\1\20\12\uffff"+
        "\1\32\4\uffff\1\75\32\uffff\1\150\1\120\1\152\1\154\3\uffff\1\166"+
        "\1\162\1\165\1\163\22\uffff\1\30\11\uffff\1\36\2\uffff\1\42\17\uffff"+
        "\1\64\4\uffff\1\76\2\uffff\1\151\1\uffff\1\167\1\164\1\uffff\1\6"+
        "\1\uffff\1\10\1\11\1\73\1\uffff\1\13\6\uffff\1\22\1\23\6\uffff\1"+
        "\31\5\uffff\1\40\1\uffff\1\72\13\uffff\1\60\2\uffff\1\70\1\uffff"+
        "\1\65\6\uffff\1\7\1\12\1\14\1\15\7\uffff\1\25\1\71\1\uffff\1\27"+
        "\13\uffff\1\50\2\uffff\1\56\3\uffff\1\61\3\uffff\1\67\6\uffff\1"+
        "\21\2\uffff\1\100\3\uffff\1\34\2\uffff\1\52\1\41\3\uffff\1\46\1"+
        "\47\1\51\1\uffff\1\57\1\uffff\1\62\3\uffff\1\145\1\156\1\146\1\157"+
        "\3\uffff\1\17\1\53\1\24\1\26\4\uffff\1\43\1\44\4\uffff\1\77\1\uffff"+
        "\1\147\1\160\1\5\1\16\1\74\4\uffff\1\55\1\54\1\uffff\1\66\2\uffff"+
        "\1\37\1\45\1\63\1\33\1\35";
    static final String DFA47_specialS =
        "\u01b1\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\1\44\1\64\2\uffff\1\57\1\50\1"+
            "\4\1\32\1\33\1\54\1\52\1\41\1\53\1\42\1\55\1\2\11\3\1\47\1\40"+
            "\1\62\1\43\1\61\1\46\1\60\1\63\1\6\3\63\1\14\2\63\1\17\14\63"+
            "\1\27\4\63\1\36\1\uffff\1\37\1\56\1\63\1\uffff\1\5\1\7\1\10"+
            "\1\11\1\12\1\13\1\15\1\63\1\16\2\63\1\20\1\63\1\21\1\25\1\22"+
            "\1\63\1\23\1\24\1\26\1\63\1\30\1\31\3\63\1\34\1\51\1\35\1\45",
            "",
            "\1\72\1\uffff\10\71\2\73\13\uffff\1\72\6\uffff\1\74\13\uffff"+
            "\1\67\14\uffff\1\72\6\uffff\1\74\13\uffff\1\66",
            "\1\72\1\uffff\12\75\13\uffff\1\72\6\uffff\1\74\30\uffff\1"+
            "\72\6\uffff\1\74",
            "",
            "\1\76",
            "\1\77",
            "\1\100\6\uffff\1\101",
            "\1\102\6\uffff\1\103\3\uffff\1\104\2\uffff\1\105",
            "\1\106\11\uffff\1\107\11\uffff\1\110",
            "\1\111\1\uffff\1\112\11\uffff\1\113",
            "\1\116\7\uffff\1\114\5\uffff\1\115\5\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\6\uffff\1\123\1\124",
            "\1\125",
            "\1\126",
            "\1\127\3\uffff\1\130\17\uffff\1\131",
            "\1\132\20\uffff\1\133\2\uffff\1\134",
            "\1\135",
            "\1\136\13\uffff\1\137\1\140\1\uffff\1\141",
            "\1\142",
            "\1\143\11\uffff\1\144\6\uffff\1\145",
            "\1\146",
            "\1\150\15\uffff\1\147",
            "\1\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\152\1\uffff\12\72",
            "\1\154",
            "\1\156",
            "",
            "",
            "",
            "\1\160\26\uffff\1\161",
            "\1\164\76\uffff\1\163",
            "\1\166\21\uffff\1\167",
            "\1\171\17\uffff\1\172\1\173",
            "\1\175",
            "\1\u0080\4\uffff\1\u0080\15\uffff\1\177",
            "\1\u0082",
            "\1\u0085\27\uffff\1\u0084",
            "",
            "\1\u0088\1\u0087",
            "\1\u008a\1\u008b",
            "",
            "",
            "",
            "\12\u008d\7\uffff\6\u008d\32\uffff\6\u008d",
            "\12\u008d\7\uffff\6\u008d\32\uffff\6\u008d",
            "",
            "\1\72\1\uffff\10\71\2\73\13\uffff\1\72\6\uffff\1\74\30\uffff"+
            "\1\72\6\uffff\1\74",
            "",
            "\1\72\1\uffff\12\73\13\uffff\1\72\37\uffff\1\72",
            "",
            "\1\72\1\uffff\12\75\13\uffff\1\72\6\uffff\1\74\30\uffff\1"+
            "\72\6\uffff\1\74",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u0099\5"+
            "\63",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00a6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00a9\6"+
            "\63\1\u00a7\1\u00a8\6\63",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1\5\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6\20\uffff\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\10\uffff\1\u00bc",
            "\1\u00bd\23\uffff\1\u00bf\3\uffff\1\u00be",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\1\u00c5",
            "",
            "\1\u00c7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c9\1\uffff\1\u00ca",
            "",
            "\1\u00cc\1\u00cb",
            "",
            "",
            "\1\u00ce",
            "",
            "",
            "\12\u008d\7\uffff\6\u008d\5\uffff\1\74\24\uffff\6\u008d\5"+
            "\uffff\1\74",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4\16\uffff\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7\2\uffff\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00ed",
            "\1\u00ee",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0105",
            "",
            "",
            "",
            "",
            "\1\u0106\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "",
            "",
            "\1\u010b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u010d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0111",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u011b\3\uffff\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0128",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0136",
            "\1\u0137",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0139",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013b",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e\30\uffff\1\u013f",
            "",
            "",
            "\1\u0140",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "\1\u0149",
            "\1\u014a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u014b\16"+
            "\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u014e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015c",
            "\1\u015d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015f",
            "\1\u0160",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0161\7"+
            "\63",
            "\1\u0163",
            "",
            "\1\u0164",
            "",
            "\1\u0165",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u016e",
            "\1\u016f",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0171",
            "",
            "",
            "\1\u0172",
            "",
            "\1\u0173",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0175",
            "\1\u0176",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u017f",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0181",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0188",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0191",
            "\1\u0192",
            "",
            "\1\u0193",
            "\1\u0194",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0197",
            "",
            "",
            "",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u019c",
            "",
            "",
            "",
            "",
            "\1\u019d",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "",
            "\1\u01a5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01a8",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
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
            return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PREPROCESSOR_DIRECTIVE );";
        }
    }
 

}