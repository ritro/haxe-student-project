// $ANTLR 3.3 Nov 30, 2010 12:50:56 Haxe.g 2011-03-29 23:03:41

package haxe.imp.parser.antlr.main;

import java.util.HashMap;
//import java.util.Stack; // imported by ANTLR


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class HaxeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int PROPERTY_DECL=4;
    public static final int MODULE=5;
    public static final int SUFFIX_EXPR=6;
    public static final int BLOCK_SCOPE=7;
    public static final int PARAM_LIST=8;
    public static final int TYPE_TAG=9;
    public static final int TYPE_PARAM_OPT=10;
    public static final int INHERIT_LIST_OPT=11;
    public static final int DECL_ATTR_LIST=12;
    public static final int VAR_INIT=13;
    public static final int IDENT=14;
    public static final int ASSIGN_OPERATOR=15;
    public static final int PACKAGE=16;
    public static final int SEMI=17;
    public static final int MONKEYS_AT=18;
    public static final int LPAREN=19;
    public static final int RPAREN=20;
    public static final int IDENTIFIER=21;
    public static final int COLON=22;
    public static final int EXTERN=23;
    public static final int PRIVATE=24;
    public static final int DOT=25;
    public static final int IMPORT=26;
    public static final int USING=27;
    public static final int PUBLIC=28;
    public static final int STATIC=29;
    public static final int INLINE=30;
    public static final int DYNAMIC=31;
    public static final int OVERRIDE=32;
    public static final int COMMA=33;
    public static final int QUES=34;
    public static final int THIS=35;
    public static final int EQ=36;
    public static final int PLUSEQ=37;
    public static final int SUBEQ=38;
    public static final int SLASHEQ=39;
    public static final int PERCENTEQ=40;
    public static final int AMPEQ=41;
    public static final int FUNCTION=42;
    public static final int LBRACKET=43;
    public static final int RBRACKET=44;
    public static final int MINUS_BIGGER=45;
    public static final int VOID=46;
    public static final int INT=47;
    public static final int FLOAT=48;
    public static final int BOOLEAN=49;
    public static final int LT=50;
    public static final int GT=51;
    public static final int GTGT=52;
    public static final int GTGTGT=53;
    public static final int NEW=54;
    public static final int IF=55;
    public static final int ELSE=56;
    public static final int FOR=57;
    public static final int IN=58;
    public static final int WHILE=59;
    public static final int DO=60;
    public static final int TRY=61;
    public static final int SWITCH=62;
    public static final int LBRACE=63;
    public static final int RBRACE=64;
    public static final int RETURN=65;
    public static final int THROW=66;
    public static final int BREAK=67;
    public static final int CONTINUE=68;
    public static final int CASE=69;
    public static final int DEFAULT=70;
    public static final int CATCH=71;
    public static final int UNTYPED=72;
    public static final int ELLIPSIS=73;
    public static final int BARBAR=74;
    public static final int AMPAMP=75;
    public static final int EQEQ=76;
    public static final int BANGEQ=77;
    public static final int GTEQ=78;
    public static final int LTEQ=79;
    public static final int BAR=80;
    public static final int AMP=81;
    public static final int CARET=82;
    public static final int LTLT=83;
    public static final int PLUS=84;
    public static final int SUB=85;
    public static final int STAR=86;
    public static final int SLASH=87;
    public static final int PERCENT=88;
    public static final int SUBSUB=89;
    public static final int PLUSPLUS=90;
    public static final int BANG=91;
    public static final int TILDE=92;
    public static final int NULL=93;
    public static final int CAST=94;
    public static final int ENUM=95;
    public static final int VAR=96;
    public static final int CLASS=97;
    public static final int INTERFACE=98;
    public static final int EXTENDS=99;
    public static final int IMPLEMENTS=100;
    public static final int TYPEDEF=101;
    public static final int LONGLITERAL=102;
    public static final int INTLITERAL=103;
    public static final int STRINGLITERAL=104;
    public static final int CHARLITERAL=105;
    public static final int FLOATNUM=106;
    public static final int TRUE=107;
    public static final int FALSE=108;
    public static final int WS=109;
    public static final int IntegerNumber=110;
    public static final int LongSuffix=111;
    public static final int HexPrefix=112;
    public static final int HexDigit=113;
    public static final int Exponent=114;
    public static final int EscapeSequence=115;
    public static final int ABSTRACT=116;
    public static final int BYTE=117;
    public static final int CHAR=118;
    public static final int CONST=119;
    public static final int DOUBLE=120;
    public static final int FINAL=121;
    public static final int FINALLY=122;
    public static final int GOTO=123;
    public static final int INSTANCEOF=124;
    public static final int LONG=125;
    public static final int NATIVE=126;
    public static final int PROTECTED=127;
    public static final int SHORT=128;
    public static final int STRICTFP=129;
    public static final int SUPER=130;
    public static final int THROWS=131;
    public static final int TRANSIENT=132;
    public static final int VOLATILE=133;
    public static final int STAREQ=134;
    public static final int BAREQ=135;
    public static final int CARETEQ=136;
    public static final int PERCENTDLQ=137;
    public static final int PERCENTDBQ=138;
    public static final int PERCENTDBBQ=139;
    public static final int EQEQEQ=140;
    public static final int PERCENTLESQ=141;
    public static final int BANGEQQ=142;
    public static final int PERCENTLL=143;
    public static final int PERCENTBB=144;
    public static final int PERCENTBBB=145;
    public static final int LTLTEQ=146;
    public static final int GTGTEQ=147;
    public static final int GTGTGTEQ=148;
    public static final int INTNUM=149;
    public static final int EXPONENT=150;
    public static final int COMMENT=151;
    public static final int PP_IF=152;
    public static final int PP_ELSEIF=153;
    public static final int PP_ELSE=154;
    public static final int PP_END=155;
    public static final int PP_ERROR=156;
    public static final int TS=157;
    public static final int PP_CONDITIONAL=158;
    public static final int PREPROCESSOR_DIRECTIVE=159;
    public static final int IF_TOKEN=160;
    public static final int ELSE_TOKEN=161;
    public static final int ENDIF_TOKEN=162;
    public static final int PP_EXPRESSION=163;
    public static final int PP_OR_EXPRESSION=164;
    public static final int PP_AND_EXPRESSION=165;
    public static final int PP_UNARY_EXPRESSION=166;
    public static final int PP_PRIMARY_EXPRESSION=167;
    public static final int HEX_DIGIT=168;
    public static final int UNICODE_ESC=169;
    public static final int OCTAL_ESC=170;
    public static final int ESC_SEQ=171;

    	// Preprocessor Data Structures - see lexer section below and PreProcessor.cs
    	protected HashMap<String,String> macroDefines = new HashMap<String,String>();	
    	protected Stack<Boolean> processing = new Stack<Boolean>();

    	// Uggh, lexer rules don't return values, so use a stack to return values.
    	protected Stack<Boolean> returns = new Stack<Boolean>();


    // delegates
    // delegators

    public HaxeLexer() {;} 
    public HaxeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HaxeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Haxe.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:528:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Haxe.g:528:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // Haxe.g:539:5: ( IntegerNumber LongSuffix )
            // Haxe.g:539:9: IntegerNumber LongSuffix
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
            // Haxe.g:544:5: ( IntegerNumber )
            // Haxe.g:544:9: IntegerNumber
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
            // Haxe.g:549:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
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
                    // Haxe.g:549:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Haxe.g:550:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // Haxe.g:550:18: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Haxe.g:550:19: '0' .. '9'
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
                    // Haxe.g:551:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // Haxe.g:551:13: ( '0' .. '7' )+
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
                    	    // Haxe.g:551:14: '0' .. '7'
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
                    // Haxe.g:552:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // Haxe.g:552:19: ( HexDigit )+
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
                    	    // Haxe.g:552:19: HexDigit
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
            // Haxe.g:557:5: ( '0x' | '0X' )
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
                    // Haxe.g:557:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // Haxe.g:557:16: '0X'
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
            // Haxe.g:562:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Haxe.g:562:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // Haxe.g:567:5: ( 'l' | 'L' )
            // Haxe.g:
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
            // Haxe.g:572:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Haxe.g:572:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Haxe.g:572:23: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Haxe.g:
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

            // Haxe.g:572:38: ( '0' .. '9' )+
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
            	    // Haxe.g:572:40: '0' .. '9'
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
            // Haxe.g:576:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // Haxe.g:576:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // Haxe.g:577:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
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
                    // Haxe.g:577:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // Haxe.g:578:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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
            // Haxe.g:586:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // Haxe.g:586:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 
            // Haxe.g:586:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt9=11;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Haxe.g:587:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // Haxe.g:588:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // Haxe.g:589:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // Haxe.g:590:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // Haxe.g:591:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // Haxe.g:592:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // Haxe.g:593:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // Haxe.g:594:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // Haxe.g:596:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // Haxe.g:596:18: ( '0' .. '3' )
                    // Haxe.g:596:19: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // Haxe.g:596:29: ( '0' .. '7' )
                    // Haxe.g:596:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Haxe.g:596:40: ( '0' .. '7' )
                    // Haxe.g:596:41: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 10 :
                    // Haxe.g:598:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // Haxe.g:598:18: ( '0' .. '7' )
                    // Haxe.g:598:19: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Haxe.g:598:29: ( '0' .. '7' )
                    // Haxe.g:598:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 11 :
                    // Haxe.g:600:18: ( '0' .. '7' )
                    {
                    // Haxe.g:600:18: ( '0' .. '7' )
                    // Haxe.g:600:19: '0' .. '7'
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
            // Haxe.g:604:9: ( 'abstract' )
            // Haxe.g:604:11: 'abstract'
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
            // Haxe.g:605:8: ( 'Bool' )
            // Haxe.g:605:10: 'Bool'
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
            // Haxe.g:606:6: ( 'break' )
            // Haxe.g:606:9: 'break'
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
            // Haxe.g:607:5: ( 'byte' )
            // Haxe.g:607:8: 'byte'
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
            // Haxe.g:608:5: ( 'case' )
            // Haxe.g:608:8: 'case'
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
            // Haxe.g:609:6: ( 'catch' )
            // Haxe.g:609:9: 'catch'
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
            // Haxe.g:610:5: ( 'char' )
            // Haxe.g:610:8: 'char'
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
            // Haxe.g:611:6: ( 'class' )
            // Haxe.g:611:9: 'class'
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
            // Haxe.g:612:6: ( 'const' )
            // Haxe.g:612:9: 'const'
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
            // Haxe.g:613:9: ( 'continue' )
            // Haxe.g:613:11: 'continue'
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
            // Haxe.g:614:8: ( 'default' )
            // Haxe.g:614:10: 'default'
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
            // Haxe.g:615:3: ( 'do' )
            // Haxe.g:615:6: 'do'
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
            // Haxe.g:616:7: ( 'double' )
            // Haxe.g:616:10: 'double'
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
            // Haxe.g:617:5: ( 'else' )
            // Haxe.g:617:8: 'else'
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
            // Haxe.g:618:5: ( 'enum' )
            // Haxe.g:618:8: 'enum'
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
            // Haxe.g:619:8: ( 'extends' )
            // Haxe.g:619:10: 'extends'
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

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:620:7: ( 'extern' )
            // Haxe.g:620:10: 'extern'
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

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:621:6: ( 'final' )
            // Haxe.g:621:9: 'final'
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
            // Haxe.g:622:8: ( 'finally' )
            // Haxe.g:622:10: 'finally'
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
            // Haxe.g:623:6: ( 'Float' )
            // Haxe.g:623:9: 'Float'
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
            // Haxe.g:624:4: ( 'for' )
            // Haxe.g:624:7: 'for'
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
            // Haxe.g:625:5: ( 'goto' )
            // Haxe.g:625:8: 'goto'
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
            // Haxe.g:626:3: ( 'if' )
            // Haxe.g:626:6: 'if'
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
            // Haxe.g:627:11: ( 'implements' )
            // Haxe.g:627:13: 'implements'
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
            // Haxe.g:628:7: ( 'import' )
            // Haxe.g:628:10: 'import'
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
            // Haxe.g:629:11: ( 'instanceof' )
            // Haxe.g:629:13: 'instanceof'
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
            // Haxe.g:630:4: ( 'Int' )
            // Haxe.g:630:7: 'Int'
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
            // Haxe.g:631:10: ( 'interface' )
            // Haxe.g:631:12: 'interface'
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
            // Haxe.g:632:5: ( 'long' )
            // Haxe.g:632:8: 'long'
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
            // Haxe.g:633:7: ( 'native' )
            // Haxe.g:633:10: 'native'
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
            // Haxe.g:634:4: ( 'new' )
            // Haxe.g:634:7: 'new'
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
            // Haxe.g:635:8: ( 'package' )
            // Haxe.g:635:10: 'package'
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
            // Haxe.g:636:8: ( 'private' )
            // Haxe.g:636:10: 'private'
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
            // Haxe.g:637:10: ( 'protected' )
            // Haxe.g:637:12: 'protected'
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
            // Haxe.g:638:7: ( 'public' )
            // Haxe.g:638:10: 'public'
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
            // Haxe.g:639:7: ( 'return' )
            // Haxe.g:639:10: 'return'
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
            // Haxe.g:640:6: ( 'short' )
            // Haxe.g:640:9: 'short'
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
            // Haxe.g:641:7: ( 'static' )
            // Haxe.g:641:10: 'static'
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
            // Haxe.g:642:7: ( 'inline' )
            // Haxe.g:642:10: 'inline'
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
            // Haxe.g:643:8: ( 'dynamic' )
            // Haxe.g:643:10: 'dynamic'
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
            // Haxe.g:644:9: ( 'override' )
            // Haxe.g:644:11: 'override'
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
            // Haxe.g:645:9: ( 'strictfp' )
            // Haxe.g:645:11: 'strictfp'
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
            // Haxe.g:646:6: ( 'super' )
            // Haxe.g:646:9: 'super'
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
            // Haxe.g:647:7: ( 'switch' )
            // Haxe.g:647:10: 'switch'
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
            // Haxe.g:648:5: ( 'this' )
            // Haxe.g:648:8: 'this'
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
            // Haxe.g:649:6: ( 'throw' )
            // Haxe.g:649:9: 'throw'
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
            // Haxe.g:650:7: ( 'throws' )
            // Haxe.g:650:10: 'throws'
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
            // Haxe.g:651:10: ( 'transient' )
            // Haxe.g:651:12: 'transient'
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
            // Haxe.g:652:4: ( 'try' )
            // Haxe.g:652:7: 'try'
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

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:653:8: ( 'typedef' )
            // Haxe.g:653:10: 'typedef'
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

    // $ANTLR start "UNTYPED"
    public final void mUNTYPED() throws RecognitionException {
        try {
            int _type = UNTYPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:654:8: ( 'untyped' )
            // Haxe.g:654:10: 'untyped'
            {
            match("untyped"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTYPED"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:655:6: ( 'using' )
            // Haxe.g:655:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:656:4: ( 'var' )
            // Haxe.g:656:7: 'var'
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

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:657:5: ( 'Void' )
            // Haxe.g:657:8: 'Void'
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
            // Haxe.g:658:9: ( 'volatile' )
            // Haxe.g:658:11: 'volatile'
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
            // Haxe.g:659:6: ( 'while' )
            // Haxe.g:659:9: 'while'
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
            // Haxe.g:660:5: ( 'true' )
            // Haxe.g:660:8: 'true'
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
            // Haxe.g:661:6: ( 'false' )
            // Haxe.g:661:9: 'false'
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
            // Haxe.g:662:5: ( 'null' )
            // Haxe.g:662:8: 'null'
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
            // Haxe.g:663:5: ( 'cast' )
            // Haxe.g:663:8: 'cast'
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
            // Haxe.g:664:9: ( 'function' )
            // Haxe.g:664:11: 'function'
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
            // Haxe.g:665:3: ( 'in' )
            // Haxe.g:665:6: 'in'
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

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:668:5: ( '(' )
            // Haxe.g:668:9: '('
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
            // Haxe.g:672:5: ( ')' )
            // Haxe.g:672:9: ')'
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
            // Haxe.g:676:5: ( '{' )
            // Haxe.g:676:9: '{'
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
            // Haxe.g:680:5: ( '}' )
            // Haxe.g:680:9: '}'
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
            // Haxe.g:684:5: ( '[' )
            // Haxe.g:684:9: '['
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
            // Haxe.g:688:5: ( ']' )
            // Haxe.g:688:9: ']'
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
            // Haxe.g:692:5: ( ';' )
            // Haxe.g:692:9: ';'
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
            // Haxe.g:696:5: ( ',' )
            // Haxe.g:696:9: ','
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
            // Haxe.g:700:5: ( '.' )
            // Haxe.g:700:9: '.'
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
            // Haxe.g:704:5: ( '...' )
            // Haxe.g:704:9: '...'
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
            // Haxe.g:708:5: ( '=' )
            // Haxe.g:708:9: '='
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
            // Haxe.g:712:5: ( '!' )
            // Haxe.g:712:9: '!'
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
            // Haxe.g:716:5: ( '~' )
            // Haxe.g:716:9: '~'
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
            // Haxe.g:720:5: ( '?' )
            // Haxe.g:720:9: '?'
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
            // Haxe.g:724:5: ( ':' )
            // Haxe.g:724:9: ':'
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
            // Haxe.g:728:5: ( '==' )
            // Haxe.g:728:9: '=='
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
            // Haxe.g:732:5: ( '&&' )
            // Haxe.g:732:9: '&&'
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
            // Haxe.g:736:5: ( '||' )
            // Haxe.g:736:9: '||'
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
            // Haxe.g:740:5: ( '++' )
            // Haxe.g:740:9: '++'
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
            // Haxe.g:744:5: ( '--' )
            // Haxe.g:744:9: '--'
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
            // Haxe.g:748:5: ( '+' )
            // Haxe.g:748:9: '+'
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
            // Haxe.g:752:5: ( '-' )
            // Haxe.g:752:9: '-'
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
            // Haxe.g:756:5: ( '*' )
            // Haxe.g:756:9: '*'
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
            // Haxe.g:760:5: ( '/' )
            // Haxe.g:760:9: '/'
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
            // Haxe.g:764:5: ( '&' )
            // Haxe.g:764:9: '&'
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
            // Haxe.g:768:5: ( '|' )
            // Haxe.g:768:9: '|'
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
            // Haxe.g:772:5: ( '^' )
            // Haxe.g:772:9: '^'
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
            // Haxe.g:776:5: ( '%' )
            // Haxe.g:776:9: '%'
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
            // Haxe.g:780:5: ( '+=' )
            // Haxe.g:780:9: '+='
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
            // Haxe.g:784:5: ( '-=' )
            // Haxe.g:784:9: '-='
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
            // Haxe.g:788:5: ( '*=' )
            // Haxe.g:788:9: '*='
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
            // Haxe.g:792:5: ( '/=' )
            // Haxe.g:792:9: '/='
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
            // Haxe.g:796:5: ( '&=' )
            // Haxe.g:796:9: '&='
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
            // Haxe.g:800:5: ( '|=' )
            // Haxe.g:800:9: '|='
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
            // Haxe.g:804:5: ( '^=' )
            // Haxe.g:804:9: '^='
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
            // Haxe.g:808:5: ( '%=' )
            // Haxe.g:808:9: '%='
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
            // Haxe.g:812:2: ( '%%<<%%=' )
            // Haxe.g:812:4: '%%<<%%='
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
            // Haxe.g:815:2: ( '%%>>%%=' )
            // Haxe.g:815:4: '%%>>%%='
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
            // Haxe.g:818:2: ( '%%>>>%%=' )
            // Haxe.g:818:4: '%%>>>%%='
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
            // Haxe.g:821:2: ( '===' )
            // Haxe.g:821:3: '==='
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
            // Haxe.g:825:2: ( '%%<=%%' )
            // Haxe.g:825:4: '%%<=%%'
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
            // Haxe.g:829:2: ( '!==' )
            // Haxe.g:829:3: '!=='
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
            // Haxe.g:833:2: ( '@' )
            // Haxe.g:833:6: '@'
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
            // Haxe.g:836:8: ( '!=' )
            // Haxe.g:836:10: '!='
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
            // Haxe.g:840:2: ( '->' )
            // Haxe.g:840:4: '->'
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
            // Haxe.g:844:2: ( '%%<<%%' )
            // Haxe.g:844:3: '%%<<%%'
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
            // Haxe.g:847:2: ( '%%>>%%' )
            // Haxe.g:847:3: '%%>>%%'
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
            // Haxe.g:850:2: ( '%%>>>%%' )
            // Haxe.g:850:3: '%%>>>%%'
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
            // Haxe.g:853:4: ( '>' )
            // Haxe.g:853:6: '>'
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
            // Haxe.g:856:6: ( '>>' )
            // Haxe.g:856:8: '>>'
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
            // Haxe.g:859:6: ( '<<' )
            // Haxe.g:859:8: '<<'
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
            // Haxe.g:861:8: ( '>>>' )
            // Haxe.g:861:10: '>>>'
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
            // Haxe.g:864:8: ( '<<=' )
            // Haxe.g:864:10: '<<='
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
            // Haxe.g:867:8: ( '>>=' )
            // Haxe.g:867:10: '>>='
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
            // Haxe.g:870:9: ( '>>>=' )
            // Haxe.g:870:11: '>>>='
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
            // Haxe.g:873:6: ( '>=' )
            // Haxe.g:873:8: '>='
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
            // Haxe.g:875:6: ( '<=' )
            // Haxe.g:875:8: '<='
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
            // Haxe.g:879:5: ( '<' )
            // Haxe.g:879:9: '<'
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
            // Haxe.g:883:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // Haxe.g:883:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Haxe.g:883:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Haxe.g:
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
            // Haxe.g:886:8: ( ( '0' .. '9' )+ )
            // Haxe.g:886:10: ( '0' .. '9' )+
            {
            // Haxe.g:886:10: ( '0' .. '9' )+
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
            	    // Haxe.g:886:10: '0' .. '9'
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
            // Haxe.g:890:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // Haxe.g:890:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // Haxe.g:890:9: ( '0' .. '9' )+
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
                    	    // Haxe.g:890:10: '0' .. '9'
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
                    // Haxe.g:890:25: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Haxe.g:890:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // Haxe.g:890:37: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Haxe.g:890:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:891:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // Haxe.g:891:13: ( '0' .. '9' )+
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
                    	    // Haxe.g:891:14: '0' .. '9'
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

                    // Haxe.g:891:25: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Haxe.g:891:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:892:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // Haxe.g:892:9: ( '0' .. '9' )+
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
                    	    // Haxe.g:892:10: '0' .. '9'
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
            // Haxe.g:896:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // Haxe.g:896:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // Haxe.g:896:14: (~ ( '\\n' | '\\r' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Haxe.g:896:14: ~ ( '\\n' | '\\r' )
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

                    // Haxe.g:896:28: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Haxe.g:896:28: '\\r'
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
                    // Haxe.g:897:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // Haxe.g:897:14: ( options {greedy=false; } : . )*
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
                    	    // Haxe.g:897:42: .
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
            // Haxe.g:901:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // Haxe.g:901:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // Haxe.g:902:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // Haxe.g:902:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:903:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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

    // $ANTLR start "PP_IF"
    public final void mPP_IF() throws RecognitionException {
        try {
            int _type = PP_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:915:7: ( '#if' )
            // Haxe.g:915:9: '#if'
            {
            match("#if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PP_IF"

    // $ANTLR start "PP_ELSEIF"
    public final void mPP_ELSEIF() throws RecognitionException {
        try {
            int _type = PP_ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:918:2: ( '#elseif' )
            // Haxe.g:918:4: '#elseif'
            {
            match("#elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PP_ELSEIF"

    // $ANTLR start "PP_ELSE"
    public final void mPP_ELSE() throws RecognitionException {
        try {
            int _type = PP_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:920:9: ( '#else' )
            // Haxe.g:920:11: '#else'
            {
            match("#else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PP_ELSE"

    // $ANTLR start "PP_END"
    public final void mPP_END() throws RecognitionException {
        try {
            int _type = PP_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:922:8: ( '#end' )
            // Haxe.g:922:10: '#end'
            {
            match("#end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PP_END"

    // $ANTLR start "PP_ERROR"
    public final void mPP_ERROR() throws RecognitionException {
        try {
            int _type = PP_ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:924:9: ( '#error' )
            // Haxe.g:924:11: '#error'
            {
            match("#error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PP_ERROR"

    // $ANTLR start "TS"
    public final void mTS() throws RecognitionException {
        try {
            // Haxe.g:931:3: ( ( ' ' | '\\t' ) )
            // Haxe.g:932:5: ( ' ' | '\\t' )
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
            // Haxe.g:936:2: ( | PP_CONDITIONAL )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='#') ) {
                alt24=2;
            }
            else {
                alt24=1;}
            switch (alt24) {
                case 1 :
                    // Haxe.g:937:2: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:937:4: PP_CONDITIONAL
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
            // Haxe.g:941:15: ( ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN ) )
            // Haxe.g:942:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            {
            // Haxe.g:942:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // Haxe.g:942:3: IF_TOKEN
                    {
                    mIF_TOKEN(); 

                    }
                    break;
                case 2 :
                    // Haxe.g:943:4: ELSE_TOKEN
                    {
                    mELSE_TOKEN(); 

                    }
                    break;
                case 3 :
                    // Haxe.g:944:4: ENDIF_TOKEN
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
            // Haxe.g:948:35: ( ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION ) )
            // Haxe.g:949:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            {
            // Haxe.g:949:2: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            // Haxe.g:949:3: '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION
            {
            match('#'); 
            // Haxe.g:949:9: ( TS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Haxe.g:949:9: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("if"); 

            // Haxe.g:949:21: ( TS )+
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
            	    // Haxe.g:949:21: TS
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

            int ppeStart2804 = getCharIndex();
            int ppeStartLine2804 = getLine();
            int ppeStartCharPos2804 = getCharPositionInLine();
            mPP_EXPRESSION(); 
            ppe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ppeStart2804, getCharIndex()-1);
            ppe.setLine(ppeStartLine2804);
            ppe.setCharPositionInLine(ppeStartCharPos2804);

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

            // Haxe.g:959:11: ( ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION ) )
            // Haxe.g:960:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            {
            // Haxe.g:960:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // Haxe.g:960:4: '#' ( TS )* e= 'else'
                    {
                    match('#'); 
                    // Haxe.g:960:10: ( TS )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\t'||LA28_0==' ') ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Haxe.g:960:10: TS
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
                    int eStartLine2833 = getLine();
                    int eStartCharPos2833 = getCharPositionInLine();
                    e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
                    e.setLine(eStartLine2833);
                    e.setCharPositionInLine(eStartCharPos2833);

                    }
                    break;
                case 2 :
                    // Haxe.g:961:4: '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION
                    {
                    match('#'); 
                    // Haxe.g:961:10: ( TS )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\t'||LA29_0==' ') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Haxe.g:961:10: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match("elseif"); 

                    // Haxe.g:961:27: ( TS )+
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
                    	    // Haxe.g:961:27: TS
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
            // Haxe.g:1001:12: ( '#' 'end' )
            // Haxe.g:1002:2: '#' 'end'
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
            // Haxe.g:1013:14: ( PP_OR_EXPRESSION )
            // Haxe.g:1014:2: PP_OR_EXPRESSION
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
            // Haxe.g:1017:17: ( PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )* )
            // Haxe.g:1018:2: PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            {
            mPP_AND_EXPRESSION(); 
            // Haxe.g:1018:22: ( TS )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\t'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Haxe.g:1018:22: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // Haxe.g:1018:28: ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='|') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // Haxe.g:1018:29: '||' ( TS )* PP_AND_EXPRESSION ( TS )*
            	    {
            	    match("||"); 

            	    // Haxe.g:1018:36: ( TS )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0=='\t'||LA33_0==' ') ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // Haxe.g:1018:36: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    mPP_AND_EXPRESSION(); 
            	    // Haxe.g:1018:62: ( TS )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0=='\t'||LA34_0==' ') ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // Haxe.g:1018:62: TS
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
            // Haxe.g:1021:18: ( PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )* )
            // Haxe.g:1022:2: PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            {
            mPP_UNARY_EXPRESSION(); 
            // Haxe.g:1022:24: ( TS )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='\t'||LA36_0==' ') ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Haxe.g:1022:24: TS
            	    {
            	    mTS(); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // Haxe.g:1022:30: ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='&') ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // Haxe.g:1022:31: '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )*
            	    {
            	    match("&&"); 

            	    // Haxe.g:1022:38: ( TS )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0=='\t'||LA37_0==' ') ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // Haxe.g:1022:38: TS
            	    	    {
            	    	    mTS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    mPP_UNARY_EXPRESSION(); 
            	    // Haxe.g:1022:66: ( TS )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0=='\t'||LA38_0==' ') ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // Haxe.g:1022:66: TS
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

            // Haxe.g:1025:20: (pe= PP_PRIMARY_EXPRESSION | '!' ( TS )* ue= PP_UNARY_EXPRESSION )
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
                    // Haxe.g:1026:2: pe= PP_PRIMARY_EXPRESSION
                    {
                    int peStart2990 = getCharIndex();
                    int peStartLine2990 = getLine();
                    int peStartCharPos2990 = getCharPositionInLine();
                    mPP_PRIMARY_EXPRESSION(); 
                    pe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, peStart2990, getCharIndex()-1);
                    pe.setLine(peStartLine2990);
                    pe.setCharPositionInLine(peStartCharPos2990);

                    }
                    break;
                case 2 :
                    // Haxe.g:1027:4: '!' ( TS )* ue= PP_UNARY_EXPRESSION
                    {
                    match('!'); 
                    // Haxe.g:1027:10: ( TS )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\t'||LA40_0==' ') ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Haxe.g:1027:10: TS
                    	    {
                    	    mTS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    int ueStart3008 = getCharIndex();
                    int ueStartLine3008 = getLine();
                    int ueStartCharPos3008 = getCharPositionInLine();
                    mPP_UNARY_EXPRESSION(); 
                    ue = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ueStart3008, getCharIndex()-1);
                    ue.setLine(ueStartLine3008);
                    ue.setCharPositionInLine(ueStartCharPos3008);
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

            // Haxe.g:1031:22: ( IDENTIFIER | '(' PP_EXPRESSION ')' )
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
                    // Haxe.g:1032:2: IDENTIFIER
                    {
                    int IDENTIFIER1Start3025 = getCharIndex();
                    int IDENTIFIER1StartLine3025 = getLine();
                    int IDENTIFIER1StartCharPos3025 = getCharPositionInLine();
                    mIDENTIFIER(); 
                    IDENTIFIER1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, IDENTIFIER1Start3025, getCharIndex()-1);
                    IDENTIFIER1.setLine(IDENTIFIER1StartLine3025);
                    IDENTIFIER1.setCharPositionInLine(IDENTIFIER1StartCharPos3025);
                     
                    		//returns.push(MacroDefines.ContainsKey(IDENTIFIER1.Text));
                    		returns.push(false); // TODO
                    	

                    }
                    break;
                case 2 :
                    // Haxe.g:1037:4: '(' PP_EXPRESSION ')'
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
            // Haxe.g:1045:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Haxe.g:1045:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Haxe.g:1045:22: ( '+' | '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='+'||LA43_0=='-') ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // Haxe.g:
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

            // Haxe.g:1045:33: ( '0' .. '9' )+
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
            	    // Haxe.g:1045:34: '0' .. '9'
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
            // Haxe.g:1048:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Haxe.g:1048:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // Haxe.g:1052:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // Haxe.g:1052:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // Haxe.g:1053:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // Haxe.g:1054:9: OCTAL_ESC
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
            // Haxe.g:1059:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // Haxe.g:1059:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Haxe.g:1059:14: ( '0' .. '3' )
                    // Haxe.g:1059:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // Haxe.g:1059:25: ( '0' .. '7' )
                    // Haxe.g:1059:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Haxe.g:1059:36: ( '0' .. '7' )
                    // Haxe.g:1059:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:1060:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Haxe.g:1060:14: ( '0' .. '7' )
                    // Haxe.g:1060:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // Haxe.g:1060:25: ( '0' .. '7' )
                    // Haxe.g:1060:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:1061:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // Haxe.g:1061:14: ( '0' .. '7' )
                    // Haxe.g:1061:15: '0' .. '7'
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
            // Haxe.g:1066:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Haxe.g:1066:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // Haxe.g:1:8: ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | EXTERN | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | TYPEDEF | UNTYPED | USING | VAR | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR | PREPROCESSOR_DIRECTIVE )
        int alt47=135;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // Haxe.g:1:10: WS
                {
                mWS(); 

                }
                break;
            case 2 :
                // Haxe.g:1:13: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 3 :
                // Haxe.g:1:25: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 4 :
                // Haxe.g:1:36: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 5 :
                // Haxe.g:1:48: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 6 :
                // Haxe.g:1:57: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 7 :
                // Haxe.g:1:65: BREAK
                {
                mBREAK(); 

                }
                break;
            case 8 :
                // Haxe.g:1:71: BYTE
                {
                mBYTE(); 

                }
                break;
            case 9 :
                // Haxe.g:1:76: CASE
                {
                mCASE(); 

                }
                break;
            case 10 :
                // Haxe.g:1:81: CATCH
                {
                mCATCH(); 

                }
                break;
            case 11 :
                // Haxe.g:1:87: CHAR
                {
                mCHAR(); 

                }
                break;
            case 12 :
                // Haxe.g:1:92: CLASS
                {
                mCLASS(); 

                }
                break;
            case 13 :
                // Haxe.g:1:98: CONST
                {
                mCONST(); 

                }
                break;
            case 14 :
                // Haxe.g:1:104: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 15 :
                // Haxe.g:1:113: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 16 :
                // Haxe.g:1:121: DO
                {
                mDO(); 

                }
                break;
            case 17 :
                // Haxe.g:1:124: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 18 :
                // Haxe.g:1:131: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // Haxe.g:1:136: ENUM
                {
                mENUM(); 

                }
                break;
            case 20 :
                // Haxe.g:1:141: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 21 :
                // Haxe.g:1:149: EXTERN
                {
                mEXTERN(); 

                }
                break;
            case 22 :
                // Haxe.g:1:156: FINAL
                {
                mFINAL(); 

                }
                break;
            case 23 :
                // Haxe.g:1:162: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 24 :
                // Haxe.g:1:170: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 25 :
                // Haxe.g:1:176: FOR
                {
                mFOR(); 

                }
                break;
            case 26 :
                // Haxe.g:1:180: GOTO
                {
                mGOTO(); 

                }
                break;
            case 27 :
                // Haxe.g:1:185: IF
                {
                mIF(); 

                }
                break;
            case 28 :
                // Haxe.g:1:188: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 29 :
                // Haxe.g:1:199: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 30 :
                // Haxe.g:1:206: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 31 :
                // Haxe.g:1:217: INT
                {
                mINT(); 

                }
                break;
            case 32 :
                // Haxe.g:1:221: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 33 :
                // Haxe.g:1:231: LONG
                {
                mLONG(); 

                }
                break;
            case 34 :
                // Haxe.g:1:236: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 35 :
                // Haxe.g:1:243: NEW
                {
                mNEW(); 

                }
                break;
            case 36 :
                // Haxe.g:1:247: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 37 :
                // Haxe.g:1:255: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 38 :
                // Haxe.g:1:263: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 39 :
                // Haxe.g:1:273: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 40 :
                // Haxe.g:1:280: RETURN
                {
                mRETURN(); 

                }
                break;
            case 41 :
                // Haxe.g:1:287: SHORT
                {
                mSHORT(); 

                }
                break;
            case 42 :
                // Haxe.g:1:293: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 43 :
                // Haxe.g:1:300: INLINE
                {
                mINLINE(); 

                }
                break;
            case 44 :
                // Haxe.g:1:307: DYNAMIC
                {
                mDYNAMIC(); 

                }
                break;
            case 45 :
                // Haxe.g:1:315: OVERRIDE
                {
                mOVERRIDE(); 

                }
                break;
            case 46 :
                // Haxe.g:1:324: STRICTFP
                {
                mSTRICTFP(); 

                }
                break;
            case 47 :
                // Haxe.g:1:333: SUPER
                {
                mSUPER(); 

                }
                break;
            case 48 :
                // Haxe.g:1:339: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 49 :
                // Haxe.g:1:346: THIS
                {
                mTHIS(); 

                }
                break;
            case 50 :
                // Haxe.g:1:351: THROW
                {
                mTHROW(); 

                }
                break;
            case 51 :
                // Haxe.g:1:357: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 52 :
                // Haxe.g:1:364: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 53 :
                // Haxe.g:1:374: TRY
                {
                mTRY(); 

                }
                break;
            case 54 :
                // Haxe.g:1:378: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 55 :
                // Haxe.g:1:386: UNTYPED
                {
                mUNTYPED(); 

                }
                break;
            case 56 :
                // Haxe.g:1:394: USING
                {
                mUSING(); 

                }
                break;
            case 57 :
                // Haxe.g:1:400: VAR
                {
                mVAR(); 

                }
                break;
            case 58 :
                // Haxe.g:1:404: VOID
                {
                mVOID(); 

                }
                break;
            case 59 :
                // Haxe.g:1:409: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 60 :
                // Haxe.g:1:418: WHILE
                {
                mWHILE(); 

                }
                break;
            case 61 :
                // Haxe.g:1:424: TRUE
                {
                mTRUE(); 

                }
                break;
            case 62 :
                // Haxe.g:1:429: FALSE
                {
                mFALSE(); 

                }
                break;
            case 63 :
                // Haxe.g:1:435: NULL
                {
                mNULL(); 

                }
                break;
            case 64 :
                // Haxe.g:1:440: CAST
                {
                mCAST(); 

                }
                break;
            case 65 :
                // Haxe.g:1:445: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 66 :
                // Haxe.g:1:454: IN
                {
                mIN(); 

                }
                break;
            case 67 :
                // Haxe.g:1:457: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 68 :
                // Haxe.g:1:464: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 69 :
                // Haxe.g:1:471: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 70 :
                // Haxe.g:1:478: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 71 :
                // Haxe.g:1:485: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 72 :
                // Haxe.g:1:494: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 73 :
                // Haxe.g:1:503: SEMI
                {
                mSEMI(); 

                }
                break;
            case 74 :
                // Haxe.g:1:508: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 75 :
                // Haxe.g:1:514: DOT
                {
                mDOT(); 

                }
                break;
            case 76 :
                // Haxe.g:1:518: ELLIPSIS
                {
                mELLIPSIS(); 

                }
                break;
            case 77 :
                // Haxe.g:1:527: EQ
                {
                mEQ(); 

                }
                break;
            case 78 :
                // Haxe.g:1:530: BANG
                {
                mBANG(); 

                }
                break;
            case 79 :
                // Haxe.g:1:535: TILDE
                {
                mTILDE(); 

                }
                break;
            case 80 :
                // Haxe.g:1:541: QUES
                {
                mQUES(); 

                }
                break;
            case 81 :
                // Haxe.g:1:546: COLON
                {
                mCOLON(); 

                }
                break;
            case 82 :
                // Haxe.g:1:552: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 83 :
                // Haxe.g:1:557: AMPAMP
                {
                mAMPAMP(); 

                }
                break;
            case 84 :
                // Haxe.g:1:564: BARBAR
                {
                mBARBAR(); 

                }
                break;
            case 85 :
                // Haxe.g:1:571: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 86 :
                // Haxe.g:1:580: SUBSUB
                {
                mSUBSUB(); 

                }
                break;
            case 87 :
                // Haxe.g:1:587: PLUS
                {
                mPLUS(); 

                }
                break;
            case 88 :
                // Haxe.g:1:592: SUB
                {
                mSUB(); 

                }
                break;
            case 89 :
                // Haxe.g:1:596: STAR
                {
                mSTAR(); 

                }
                break;
            case 90 :
                // Haxe.g:1:601: SLASH
                {
                mSLASH(); 

                }
                break;
            case 91 :
                // Haxe.g:1:607: AMP
                {
                mAMP(); 

                }
                break;
            case 92 :
                // Haxe.g:1:611: BAR
                {
                mBAR(); 

                }
                break;
            case 93 :
                // Haxe.g:1:615: CARET
                {
                mCARET(); 

                }
                break;
            case 94 :
                // Haxe.g:1:621: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 95 :
                // Haxe.g:1:629: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 96 :
                // Haxe.g:1:636: SUBEQ
                {
                mSUBEQ(); 

                }
                break;
            case 97 :
                // Haxe.g:1:642: STAREQ
                {
                mSTAREQ(); 

                }
                break;
            case 98 :
                // Haxe.g:1:649: SLASHEQ
                {
                mSLASHEQ(); 

                }
                break;
            case 99 :
                // Haxe.g:1:657: AMPEQ
                {
                mAMPEQ(); 

                }
                break;
            case 100 :
                // Haxe.g:1:663: BAREQ
                {
                mBAREQ(); 

                }
                break;
            case 101 :
                // Haxe.g:1:669: CARETEQ
                {
                mCARETEQ(); 

                }
                break;
            case 102 :
                // Haxe.g:1:677: PERCENTEQ
                {
                mPERCENTEQ(); 

                }
                break;
            case 103 :
                // Haxe.g:1:687: PERCENTDLQ
                {
                mPERCENTDLQ(); 

                }
                break;
            case 104 :
                // Haxe.g:1:698: PERCENTDBQ
                {
                mPERCENTDBQ(); 

                }
                break;
            case 105 :
                // Haxe.g:1:709: PERCENTDBBQ
                {
                mPERCENTDBBQ(); 

                }
                break;
            case 106 :
                // Haxe.g:1:721: EQEQEQ
                {
                mEQEQEQ(); 

                }
                break;
            case 107 :
                // Haxe.g:1:728: PERCENTLESQ
                {
                mPERCENTLESQ(); 

                }
                break;
            case 108 :
                // Haxe.g:1:740: BANGEQQ
                {
                mBANGEQQ(); 

                }
                break;
            case 109 :
                // Haxe.g:1:748: MONKEYS_AT
                {
                mMONKEYS_AT(); 

                }
                break;
            case 110 :
                // Haxe.g:1:759: BANGEQ
                {
                mBANGEQ(); 

                }
                break;
            case 111 :
                // Haxe.g:1:766: MINUS_BIGGER
                {
                mMINUS_BIGGER(); 

                }
                break;
            case 112 :
                // Haxe.g:1:779: PERCENTLL
                {
                mPERCENTLL(); 

                }
                break;
            case 113 :
                // Haxe.g:1:789: PERCENTBB
                {
                mPERCENTBB(); 

                }
                break;
            case 114 :
                // Haxe.g:1:799: PERCENTBBB
                {
                mPERCENTBBB(); 

                }
                break;
            case 115 :
                // Haxe.g:1:810: GT
                {
                mGT(); 

                }
                break;
            case 116 :
                // Haxe.g:1:813: GTGT
                {
                mGTGT(); 

                }
                break;
            case 117 :
                // Haxe.g:1:818: LTLT
                {
                mLTLT(); 

                }
                break;
            case 118 :
                // Haxe.g:1:823: GTGTGT
                {
                mGTGTGT(); 

                }
                break;
            case 119 :
                // Haxe.g:1:830: LTLTEQ
                {
                mLTLTEQ(); 

                }
                break;
            case 120 :
                // Haxe.g:1:837: GTGTEQ
                {
                mGTGTEQ(); 

                }
                break;
            case 121 :
                // Haxe.g:1:844: GTGTGTEQ
                {
                mGTGTGTEQ(); 

                }
                break;
            case 122 :
                // Haxe.g:1:853: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 123 :
                // Haxe.g:1:858: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 124 :
                // Haxe.g:1:863: LT
                {
                mLT(); 

                }
                break;
            case 125 :
                // Haxe.g:1:866: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 126 :
                // Haxe.g:1:877: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 127 :
                // Haxe.g:1:884: FLOATNUM
                {
                mFLOATNUM(); 

                }
                break;
            case 128 :
                // Haxe.g:1:893: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 129 :
                // Haxe.g:1:901: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 130 :
                // Haxe.g:1:915: PP_IF
                {
                mPP_IF(); 

                }
                break;
            case 131 :
                // Haxe.g:1:921: PP_ELSEIF
                {
                mPP_ELSEIF(); 

                }
                break;
            case 132 :
                // Haxe.g:1:931: PP_ELSE
                {
                mPP_ELSE(); 

                }
                break;
            case 133 :
                // Haxe.g:1:939: PP_END
                {
                mPP_END(); 

                }
                break;
            case 134 :
                // Haxe.g:1:946: PP_ERROR
                {
                mPP_ERROR(); 

                }
                break;
            case 135 :
                // Haxe.g:1:955: PREPROCESSOR_DIRECTIVE
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
        "\11\uffff\2\14\1\15\3\uffff";
    static final String DFA9_eofS =
        "\17\uffff";
    static final String DFA9_minS =
        "\1\42\10\uffff\3\60\3\uffff";
    static final String DFA9_maxS =
        "\1\164\10\uffff\3\67\3\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\12\1\11";
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
            "\10\13",
            "\10\15",
            "\10\16",
            "",
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
            return "586:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
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
            return "889:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
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
            return "942:2: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )";
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
            return "960:2: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )";
        }
    }
    static final String DFA47_eotS =
        "\1\67\1\uffff\2\72\1\uffff\26\64\10\uffff\1\157\1\161\1\163\3\uffff"+
        "\1\166\1\171\1\174\1\u0080\1\u0082\1\u0085\1\u0087\1\u008a\1\uffff"+
        "\1\u008d\1\u0090\10\uffff\1\72\1\u0094\1\uffff\1\72\11\64\1\u00a0"+
        "\12\64\1\u00ab\1\64\1\u00b0\27\64\2\uffff\1\u00ce\1\uffff\1\u00d0"+
        "\30\uffff\1\u00d5\2\uffff\1\u00d7\4\uffff\1\72\1\uffff\13\64\1\uffff"+
        "\5\64\1\u00ee\4\64\1\uffff\4\64\1\uffff\1\u00f8\2\64\1\u00fb\17"+
        "\64\1\u010b\4\64\1\u0110\3\64\6\uffff\1\u0118\4\uffff\1\u0119\3"+
        "\uffff\1\64\1\u011d\1\64\1\u011f\1\u0120\1\u0121\1\64\1\u0123\6"+
        "\64\1\u012a\1\u012b\2\64\1\uffff\3\64\1\u0132\5\64\1\uffff\1\u0138"+
        "\1\64\1\uffff\1\u013a\13\64\1\u0146\2\64\1\uffff\1\u0149\3\64\1"+
        "\uffff\1\64\1\u014e\1\64\10\uffff\1\64\1\uffff\1\u0156\3\uffff\1"+
        "\u0157\1\uffff\1\u0158\1\u0159\4\64\2\uffff\2\64\1\u0161\1\u0162"+
        "\1\64\1\u0164\1\uffff\5\64\1\uffff\1\64\1\uffff\5\64\1\u0170\2\64"+
        "\1\u0173\2\64\1\uffff\1\u0177\1\64\1\uffff\2\64\1\u017b\1\64\1\uffff"+
        "\1\u017d\3\uffff\1\u0182\1\uffff\1\64\4\uffff\2\64\1\u0186\2\64"+
        "\1\u0189\1\64\2\uffff\1\64\1\uffff\1\64\1\u018d\2\64\1\u0190\1\u0191"+
        "\3\64\1\u0195\1\u0196\1\uffff\1\u0197\1\64\1\uffff\1\u0199\1\64"+
        "\1\u019b\1\uffff\3\64\1\uffff\1\64\1\uffff\1\u01a1\1\u01a3\3\uffff"+
        "\2\64\1\u01a8\1\uffff\1\u01a9\1\u01aa\1\uffff\1\u01ab\2\64\1\uffff"+
        "\2\64\2\uffff\1\u01b0\1\u01b1\1\64\3\uffff\1\64\1\uffff\1\64\1\uffff"+
        "\1\64\1\u01b6\1\u01b7\1\64\4\uffff\1\u01ba\1\u01bb\1\u01bc\1\u01bd"+
        "\4\uffff\1\u01be\3\64\2\uffff\1\64\1\u01c3\1\u01c4\1\64\2\uffff"+
        "\1\u01c6\6\uffff\2\64\1\u01c9\1\u01ca\2\uffff\1\u01cb\1\uffff\1"+
        "\u01cc\1\u01cd\5\uffff";
    static final String DFA47_eofS =
        "\u01ce\uffff";
    static final String DFA47_minS =
        "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\162\1\141\1\145\1\154"+
        "\1\141\1\154\1\157\1\146\1\156\1\157\2\141\1\145\1\150\1\166\1\150"+
        "\1\156\1\141\1\157\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1"+
        "\53\1\55\1\75\1\52\1\75\1\45\1\uffff\1\75\1\74\2\uffff\1\11\1\uffff"+
        "\2\60\2\uffff\2\56\1\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2"+
        "\141\1\156\1\146\1\60\1\156\1\163\1\165\1\164\1\156\1\162\1\154"+
        "\1\156\1\157\1\164\1\60\1\160\1\60\1\164\1\156\1\164\1\167\1\154"+
        "\1\143\1\151\1\142\1\164\1\157\1\141\1\160\1\151\1\145\1\151\1\141"+
        "\1\160\1\164\1\151\1\162\1\154\2\151\2\uffff\1\75\1\uffff\1\75\26"+
        "\uffff\1\74\1\uffff\1\75\2\uffff\1\75\2\uffff\1\146\1\154\1\60\1"+
        "\uffff\1\164\1\154\1\141\2\145\1\143\1\162\2\163\1\141\1\142\1\uffff"+
        "\1\141\1\145\1\155\1\145\1\141\1\60\1\163\1\143\1\141\1\157\1\uffff"+
        "\1\154\1\164\1\145\1\151\1\uffff\1\60\1\147\1\151\1\60\1\154\1\153"+
        "\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\162\1\163"+
        "\1\157\1\156\1\60\2\145\1\171\1\156\1\60\1\141\1\144\1\154\4\uffff"+
        "\1\74\1\76\1\75\4\uffff\1\11\1\163\1\144\1\uffff\1\162\1\60\1\153"+
        "\3\60\1\150\1\60\1\163\1\164\1\151\1\165\1\154\1\155\2\60\1\156"+
        "\1\154\1\uffff\1\145\2\164\1\60\1\145\1\162\1\141\1\162\1\156\1"+
        "\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1\164\1\151"+
        "\1\143\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff\1\60\1\144\1\160"+
        "\1\147\1\uffff\1\164\1\60\1\145\1\45\1\uffff\1\45\3\uffff\1\145"+
        "\1\uffff\1\141\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60\1\156\1\154"+
        "\1\145\1\151\2\uffff\1\144\1\156\2\60\1\151\1\60\1\uffff\1\155\1"+
        "\164\1\156\1\146\1\145\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1"+
        "\156\1\60\1\143\1\164\1\60\1\150\1\151\1\uffff\1\60\1\151\1\uffff"+
        "\2\145\1\60\1\151\1\uffff\1\60\3\45\1\151\1\uffff\1\143\4\uffff"+
        "\1\165\1\164\1\60\1\143\1\163\1\60\1\171\2\uffff\1\157\1\uffff\1"+
        "\145\1\60\1\143\1\141\2\60\2\145\1\164\2\60\1\uffff\1\60\1\146\1"+
        "\uffff\1\60\1\144\1\60\1\uffff\1\145\1\146\1\144\1\uffff\1\154\1"+
        "\uffff\2\75\1\45\1\146\1\uffff\1\164\1\145\1\60\1\uffff\2\60\1\uffff"+
        "\1\60\2\156\1\uffff\1\145\1\143\2\uffff\2\60\1\145\3\uffff\1\160"+
        "\1\uffff\1\145\1\uffff\1\156\2\60\1\145\4\uffff\1\75\1\11\2\60\4"+
        "\uffff\1\60\1\164\1\157\1\145\2\uffff\1\144\2\60\1\164\2\uffff\1"+
        "\60\6\uffff\1\163\1\146\2\60\2\uffff\1\60\1\uffff\2\60\5\uffff";
    static final String DFA47_maxS =
        "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\157\1\171\1\157\1\171"+
        "\1\170\1\165\1\154\1\157\2\156\1\157\2\165\1\145\1\167\1\166\1\171"+
        "\1\163\2\157\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1"+
        "\76\4\75\1\uffff\1\76\1\75\2\uffff\1\151\1\uffff\2\146\2\uffff\1"+
        "\154\1\145\1\uffff\1\154\1\163\1\157\1\145\2\164\2\141\1\156\1\146"+
        "\1\172\1\156\1\163\1\165\1\164\1\156\1\162\1\154\1\156\1\157\1\164"+
        "\1\172\1\160\1\172\1\164\1\156\1\164\1\167\1\154\1\143\1\157\1\142"+
        "\1\164\1\157\1\162\1\160\1\151\1\145\1\162\1\171\1\160\1\164\1\151"+
        "\1\162\1\154\2\151\2\uffff\1\75\1\uffff\1\75\26\uffff\1\76\1\uffff"+
        "\1\76\2\uffff\1\75\2\uffff\1\146\1\162\1\154\1\uffff\1\164\1\154"+
        "\1\141\1\145\1\164\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff\1"+
        "\141\1\145\1\155\1\145\1\141\1\172\1\163\1\143\1\141\1\157\1\uffff"+
        "\1\157\1\164\1\145\1\151\1\uffff\1\172\1\147\1\151\1\172\1\154\1"+
        "\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\162"+
        "\1\163\1\157\1\156\1\172\2\145\1\171\1\156\1\172\1\141\1\144\1\154"+
        "\4\uffff\1\75\1\76\1\75\4\uffff\1\40\1\163\1\144\1\uffff\1\162\1"+
        "\172\1\153\3\172\1\150\1\172\1\163\1\164\1\151\1\165\1\154\1\155"+
        "\2\172\1\162\1\154\1\uffff\1\145\2\164\1\172\1\145\1\162\1\141\1"+
        "\162\1\156\1\uffff\1\172\1\166\1\uffff\1\172\2\141\1\145\1\151\1"+
        "\162\1\164\1\151\1\143\1\162\1\143\1\162\1\172\1\167\1\163\1\uffff"+
        "\1\172\1\144\1\160\1\147\1\uffff\1\164\1\172\1\145\1\45\1\uffff"+
        "\1\76\3\uffff\1\145\1\uffff\1\141\1\uffff\1\172\3\uffff\1\172\1"+
        "\uffff\2\172\1\156\1\154\1\145\1\151\2\uffff\1\144\1\156\2\172\1"+
        "\151\1\172\1\uffff\1\155\1\164\1\156\1\146\1\145\1\uffff\1\145\1"+
        "\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1\164\1\172\1\150\1\151"+
        "\1\uffff\1\172\1\151\1\uffff\2\145\1\172\1\151\1\uffff\1\172\3\45"+
        "\1\151\1\uffff\1\143\4\uffff\1\165\1\164\1\172\1\143\1\163\1\172"+
        "\1\171\2\uffff\1\157\1\uffff\1\145\1\172\1\143\1\141\2\172\2\145"+
        "\1\164\2\172\1\uffff\1\172\1\146\1\uffff\1\172\1\144\1\172\1\uffff"+
        "\1\145\1\146\1\144\1\uffff\1\154\1\uffff\2\75\1\45\1\146\1\uffff"+
        "\1\164\1\145\1\172\1\uffff\2\172\1\uffff\1\172\2\156\1\uffff\1\145"+
        "\1\143\2\uffff\2\172\1\145\3\uffff\1\160\1\uffff\1\145\1\uffff\1"+
        "\156\2\172\1\145\4\uffff\1\75\1\40\2\172\4\uffff\1\172\1\164\1\157"+
        "\1\145\2\uffff\1\144\2\172\1\164\2\uffff\1\172\6\uffff\1\163\1\146"+
        "\2\172\2\uffff\1\172\1\uffff\2\172\5\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\26\uffff\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\3\uffff\1\117\1\120\1\121\10\uffff\1\155\2\uffff"+
        "\1\175\1\u0081\1\uffff\1\u0087\2\uffff\1\3\1\2\2\uffff\1\177\57"+
        "\uffff\1\114\1\113\1\uffff\1\115\1\uffff\1\116\1\123\1\143\1\133"+
        "\1\124\1\144\1\134\1\125\1\137\1\127\1\126\1\140\1\157\1\130\1\141"+
        "\1\131\1\142\1\u0080\1\132\1\145\1\135\1\146\1\uffff\1\136\1\uffff"+
        "\1\172\1\163\1\uffff\1\173\1\174\3\uffff\1\176\13\uffff\1\20\12"+
        "\uffff\1\33\4\uffff\1\102\34\uffff\1\152\1\122\1\154\1\156\3\uffff"+
        "\1\170\1\164\1\167\1\165\3\uffff\1\u0086\22\uffff\1\31\11\uffff"+
        "\1\37\2\uffff\1\43\17\uffff\1\65\4\uffff\1\71\4\uffff\1\153\1\uffff"+
        "\1\171\1\166\1\u0082\1\uffff\1\u0085\1\uffff\1\6\1\uffff\1\10\1"+
        "\11\1\100\1\uffff\1\13\6\uffff\1\22\1\23\6\uffff\1\32\5\uffff\1"+
        "\41\1\uffff\1\77\13\uffff\1\61\2\uffff\1\75\4\uffff\1\72\5\uffff"+
        "\1\u0085\1\uffff\1\7\1\12\1\14\1\15\7\uffff\1\26\1\76\1\uffff\1"+
        "\30\13\uffff\1\51\2\uffff\1\57\3\uffff\1\62\3\uffff\1\70\1\uffff"+
        "\1\74\4\uffff\1\u0084\3\uffff\1\21\2\uffff\1\25\3\uffff\1\35\2\uffff"+
        "\1\53\1\42\3\uffff\1\47\1\50\1\52\1\uffff\1\60\1\uffff\1\63\4\uffff"+
        "\1\147\1\160\1\150\1\161\4\uffff\1\17\1\54\1\24\1\27\4\uffff\1\44"+
        "\1\45\4\uffff\1\66\1\67\1\uffff\1\151\1\162\1\u0083\1\5\1\16\1\101"+
        "\4\uffff\1\56\1\55\1\uffff\1\73\2\uffff\1\40\1\46\1\64\1\34\1\36";
    static final String DFA47_specialS =
        "\u01ce\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\1\45\1\65\1\66\1\uffff\1\60\1"+
            "\51\1\4\1\33\1\34\1\55\1\53\1\42\1\54\1\43\1\56\1\2\11\3\1\50"+
            "\1\41\1\63\1\44\1\62\1\47\1\61\1\64\1\6\3\64\1\14\2\64\1\17"+
            "\14\64\1\31\4\64\1\37\1\uffff\1\40\1\57\1\64\1\uffff\1\5\1\7"+
            "\1\10\1\11\1\12\1\13\1\15\1\64\1\16\2\64\1\20\1\64\1\21\1\25"+
            "\1\22\1\64\1\23\1\24\1\26\1\27\1\30\1\32\3\64\1\35\1\52\1\36"+
            "\1\46",
            "",
            "\1\76\1\uffff\10\74\2\75\13\uffff\1\76\6\uffff\1\73\13\uffff"+
            "\1\71\14\uffff\1\76\6\uffff\1\73\13\uffff\1\70",
            "\1\76\1\uffff\12\77\13\uffff\1\76\6\uffff\1\73\30\uffff\1"+
            "\76\6\uffff\1\73",
            "",
            "\1\100",
            "\1\101",
            "\1\102\6\uffff\1\103",
            "\1\104\6\uffff\1\105\3\uffff\1\106\2\uffff\1\107",
            "\1\110\11\uffff\1\111\11\uffff\1\112",
            "\1\113\1\uffff\1\114\11\uffff\1\115",
            "\1\120\7\uffff\1\116\5\uffff\1\117\5\uffff\1\121",
            "\1\122",
            "\1\123",
            "\1\124\6\uffff\1\125\1\126",
            "\1\127",
            "\1\130",
            "\1\131\3\uffff\1\132\17\uffff\1\133",
            "\1\134\20\uffff\1\135\2\uffff\1\136",
            "\1\137",
            "\1\140\13\uffff\1\141\1\142\1\uffff\1\143",
            "\1\144",
            "\1\145\11\uffff\1\146\6\uffff\1\147",
            "\1\150\4\uffff\1\151",
            "\1\152\15\uffff\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156\1\uffff\12\76",
            "\1\160",
            "\1\162",
            "",
            "",
            "",
            "\1\164\26\uffff\1\165",
            "\1\170\76\uffff\1\167",
            "\1\172\21\uffff\1\173",
            "\1\175\17\uffff\1\176\1\177",
            "\1\u0081",
            "\1\u0084\4\uffff\1\u0084\15\uffff\1\u0083",
            "\1\u0086",
            "\1\u0089\27\uffff\1\u0088",
            "",
            "\1\u008c\1\u008b",
            "\1\u008e\1\u008f",
            "",
            "",
            "\1\67\26\uffff\1\67\104\uffff\1\u0092\3\uffff\1\u0091",
            "",
            "\12\u0093\7\uffff\6\u0093\32\uffff\6\u0093",
            "\12\u0093\7\uffff\6\u0093\32\uffff\6\u0093",
            "",
            "",
            "\1\76\1\uffff\10\74\2\75\13\uffff\1\76\6\uffff\1\73\30\uffff"+
            "\1\76\6\uffff\1\73",
            "\1\76\1\uffff\12\75\13\uffff\1\76\37\uffff\1\76",
            "",
            "\1\76\1\uffff\12\77\13\uffff\1\76\6\uffff\1\73\30\uffff\1"+
            "\76\6\uffff\1\73",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u009f\5"+
            "\64",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ac",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00af\6"+
            "\64\1\u00ad\1\u00ae\6\64",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\5\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc\20\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\10\uffff\1\u00c2",
            "\1\u00c3\23\uffff\1\u00c5\3\uffff\1\u00c4",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "",
            "\1\u00cd",
            "",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d1\1\uffff\1\u00d2",
            "",
            "\1\u00d4\1\u00d3",
            "",
            "",
            "\1\u00d6",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9\1\uffff\1\u00da\3\uffff\1\u00db",
            "\12\u0093\7\uffff\6\u0093\5\uffff\1\73\24\uffff\6\u0093\5"+
            "\uffff\1\73",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0\16\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3\2\uffff\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00f9",
            "\1\u00fa",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "",
            "",
            "",
            "",
            "\1\u0114\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "",
            "\1\67\26\uffff\1\67",
            "\1\u011a",
            "\1\u011b",
            "",
            "\1\u011c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u011e",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0122",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u012c\3\uffff\1\u012d",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0139",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0147",
            "\1\u0148",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151\30\uffff\1\u0152",
            "",
            "",
            "",
            "\1\u0153",
            "",
            "\1\u0155",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "",
            "",
            "\1\u015e",
            "\1\u015f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0160\16"+
            "\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0163",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0171",
            "\1\u0172",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0174",
            "\1\u0175",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0176\7"+
            "\64",
            "\1\u0178",
            "",
            "\1\u0179",
            "\1\u017a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u017c",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "",
            "\1\u0183",
            "",
            "",
            "",
            "",
            "\1\u0184",
            "\1\u0185",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0187",
            "\1\u0188",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u018a",
            "",
            "",
            "\1\u018b",
            "",
            "\1\u018c",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u018e",
            "\1\u018f",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0198",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u019a",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "",
            "\1\u01a0",
            "\1\u01a2",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01b2",
            "",
            "",
            "",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01b8",
            "",
            "",
            "",
            "",
            "\1\u01b9",
            "\1\67\26\uffff\1\67",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "",
            "\1\u01c2",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u01c5",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
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
            return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | EXTERN | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | TYPEDEF | UNTYPED | USING | VAR | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR | PREPROCESSOR_DIRECTIVE );";
        }
    }
 

}