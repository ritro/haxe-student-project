// $ANTLR 3.4 Haxe.g 2012-03-05 00:51:45

package haxe.imp.parser.antlr.main;

import java.util.HashMap;
//import java.util.Stack; // imported by ANTLR


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class HaxeLexer extends Lexer {
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

        // Preprocessor Data Structures - see lexer section below and PreProcessor.cs
        protected HashMap<String,String> macroDefines = new HashMap<String,String>();    
        protected Stack<Boolean> processing = new Stack<Boolean>();

        // Uggh, lexer rules don't return values, so use a stack to return values.
        protected Stack<Boolean> returns = new Stack<Boolean>();


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public HaxeLexer() {} 
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
            // Haxe.g:448:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Haxe.g:448:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LONGLITERAL"
    public final void mLONGLITERAL() throws RecognitionException {
        try {
            int _type = LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:453:5: ( IntegerNumber LongSuffix )
            // Haxe.g:453:9: IntegerNumber LongSuffix
            {
            mIntegerNumber(); 


            mLongSuffix(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONGLITERAL"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:457:5: ( IntegerNumber )
            // Haxe.g:457:9: IntegerNumber
            {
            mIntegerNumber(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
        try {
            // Haxe.g:463:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
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
                    alt4=1;
                }

            }
            else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Haxe.g:463:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Haxe.g:464:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // Haxe.g:464:18: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Haxe.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Haxe.g:465:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 

                    // Haxe.g:465:13: ( '0' .. '7' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '7')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Haxe.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
                    // Haxe.g:466:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 


                    // Haxe.g:466:19: ( HexDigit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Haxe.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerNumber"

    // $ANTLR start "HexPrefix"
    public final void mHexPrefix() throws RecognitionException {
        try {
            // Haxe.g:471:5: ( '0x' | '0X' )
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
                    // Haxe.g:471:9: '0x'
                    {
                    match("0x"); 



                    }
                    break;
                case 2 :
                    // Haxe.g:471:16: '0X'
                    {
                    match("0X"); 



                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexPrefix"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // Haxe.g:476:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Haxe.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "LongSuffix"
    public final void mLongSuffix() throws RecognitionException {
        try {
            // Haxe.g:481:5: ( 'l' | 'L' )
            // Haxe.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LongSuffix"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:484:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // Haxe.g:484:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 

            // Haxe.g:485:9: ( EscapeSequence |~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Haxe.g:485:13: EscapeSequence
                    {
                    mEscapeSequence(); 


                    }
                    break;
                case 2 :
                    // Haxe.g:486:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // Haxe.g:495:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // Haxe.g:495:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 

            // Haxe.g:495:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt7=1;
                }
                break;
            case 't':
                {
                alt7=2;
                }
                break;
            case 'n':
                {
                alt7=3;
                }
                break;
            case 'f':
                {
                alt7=4;
                }
                break;
            case 'r':
                {
                alt7=5;
                }
                break;
            case '\"':
                {
                alt7=6;
                }
                break;
            case '\'':
                {
                alt7=7;
                }
                break;
            case '\\':
                {
                alt7=8;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
                {
                int LA7_9 = input.LA(2);

                if ( ((LA7_9 >= '0' && LA7_9 <= '7')) ) {
                    int LA7_11 = input.LA(3);

                    if ( ((LA7_11 >= '0' && LA7_11 <= '7')) ) {
                        alt7=9;
                    }
                    else {
                        alt7=10;
                    }
                }
                else {
                    alt7=11;
                }
                }
                break;
            case '4':
            case '5':
            case '6':
            case '7':
                {
                int LA7_10 = input.LA(2);

                if ( ((LA7_10 >= '0' && LA7_10 <= '7')) ) {
                    alt7=10;
                }
                else {
                    alt7=11;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Haxe.g:496:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // Haxe.g:497:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // Haxe.g:498:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // Haxe.g:499:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // Haxe.g:500:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // Haxe.g:501:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // Haxe.g:502:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // Haxe.g:503:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // Haxe.g:505:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 10 :
                    // Haxe.g:507:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 11 :
                    // Haxe.g:509:18: ( '0' .. '7' )
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "ABSTRACT"
    public final void mABSTRACT() throws RecognitionException {
        try {
            int _type = ABSTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:512:9: ( 'abstract' )
            // Haxe.g:512:13: 'abstract'
            {
            match("abstract"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ABSTRACT"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:513:8: ( 'Bool' )
            // Haxe.g:513:13: 'Bool'
            {
            match("Bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:514:6: ( 'break' )
            // Haxe.g:514:13: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "BYTE"
    public final void mBYTE() throws RecognitionException {
        try {
            int _type = BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:515:5: ( 'byte' )
            // Haxe.g:515:13: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BYTE"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:516:5: ( 'case' )
            // Haxe.g:516:13: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:517:6: ( 'catch' )
            // Haxe.g:517:13: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:518:5: ( 'char' )
            // Haxe.g:518:13: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:519:6: ( 'class' )
            // Haxe.g:519:13: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:520:6: ( 'const' )
            // Haxe.g:520:13: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:521:9: ( 'continue' )
            // Haxe.g:521:13: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:522:8: ( 'default' )
            // Haxe.g:522:13: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:523:3: ( 'do' )
            // Haxe.g:523:13: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:524:7: ( 'double' )
            // Haxe.g:524:13: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:525:5: ( 'else' )
            // Haxe.g:525:13: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:526:5: ( 'enum' )
            // Haxe.g:526:13: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:527:8: ( 'extends' )
            // Haxe.g:527:13: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "EXTERN"
    public final void mEXTERN() throws RecognitionException {
        try {
            int _type = EXTERN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:528:7: ( 'extern' )
            // Haxe.g:528:13: 'extern'
            {
            match("extern"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXTERN"

    // $ANTLR start "FINAL"
    public final void mFINAL() throws RecognitionException {
        try {
            int _type = FINAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:529:6: ( 'final' )
            // Haxe.g:529:13: 'final'
            {
            match("final"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINAL"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:530:8: ( 'finally' )
            // Haxe.g:530:13: 'finally'
            {
            match("finally"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:531:6: ( 'Float' )
            // Haxe.g:531:13: 'Float'
            {
            match("Float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:532:4: ( 'for' )
            // Haxe.g:532:13: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GOTO"
    public final void mGOTO() throws RecognitionException {
        try {
            int _type = GOTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:533:5: ( 'goto' )
            // Haxe.g:533:13: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GOTO"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:534:3: ( 'if' )
            // Haxe.g:534:13: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTS"
    public final void mIMPLEMENTS() throws RecognitionException {
        try {
            int _type = IMPLEMENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:535:11: ( 'implements' )
            // Haxe.g:535:13: 'implements'
            {
            match("implements"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLEMENTS"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:536:7: ( 'import' )
            // Haxe.g:536:13: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INSTANCEOF"
    public final void mINSTANCEOF() throws RecognitionException {
        try {
            int _type = INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:537:11: ( 'instanceof' )
            // Haxe.g:537:13: 'instanceof'
            {
            match("instanceof"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTANCEOF"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:538:4: ( 'Int' )
            // Haxe.g:538:13: 'Int'
            {
            match("Int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTERFACE"
    public final void mINTERFACE() throws RecognitionException {
        try {
            int _type = INTERFACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:539:10: ( 'interface' )
            // Haxe.g:539:13: 'interface'
            {
            match("interface"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTERFACE"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:540:5: ( 'long' )
            // Haxe.g:540:13: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LONG"

    // $ANTLR start "NATIVE"
    public final void mNATIVE() throws RecognitionException {
        try {
            int _type = NATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:541:7: ( 'native' )
            // Haxe.g:541:13: 'native'
            {
            match("native"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NATIVE"

    // $ANTLR start "NEW"
    public final void mNEW() throws RecognitionException {
        try {
            int _type = NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:542:4: ( 'new' )
            // Haxe.g:542:13: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEW"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:543:8: ( 'package' )
            // Haxe.g:543:13: 'package'
            {
            match("package"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "PRIVATE"
    public final void mPRIVATE() throws RecognitionException {
        try {
            int _type = PRIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:544:8: ( 'private' )
            // Haxe.g:544:13: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIVATE"

    // $ANTLR start "PROTECTED"
    public final void mPROTECTED() throws RecognitionException {
        try {
            int _type = PROTECTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:545:10: ( 'protected' )
            // Haxe.g:545:13: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROTECTED"

    // $ANTLR start "PUBLIC"
    public final void mPUBLIC() throws RecognitionException {
        try {
            int _type = PUBLIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:546:7: ( 'public' )
            // Haxe.g:546:13: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUBLIC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:547:7: ( 'return' )
            // Haxe.g:547:13: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SHORT"
    public final void mSHORT() throws RecognitionException {
        try {
            int _type = SHORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:548:6: ( 'short' )
            // Haxe.g:548:13: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHORT"

    // $ANTLR start "STATIC"
    public final void mSTATIC() throws RecognitionException {
        try {
            int _type = STATIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:549:7: ( 'static' )
            // Haxe.g:549:13: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STATIC"

    // $ANTLR start "INLINE"
    public final void mINLINE() throws RecognitionException {
        try {
            int _type = INLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:550:7: ( 'inline' )
            // Haxe.g:550:13: 'inline'
            {
            match("inline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INLINE"

    // $ANTLR start "DYNAMIC"
    public final void mDYNAMIC() throws RecognitionException {
        try {
            int _type = DYNAMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:551:8: ( 'dynamic' )
            // Haxe.g:551:13: 'dynamic'
            {
            match("dynamic"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DYNAMIC"

    // $ANTLR start "OVERRIDE"
    public final void mOVERRIDE() throws RecognitionException {
        try {
            int _type = OVERRIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:552:9: ( 'override' )
            // Haxe.g:552:13: 'override'
            {
            match("override"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OVERRIDE"

    // $ANTLR start "STRICTFP"
    public final void mSTRICTFP() throws RecognitionException {
        try {
            int _type = STRICTFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:553:9: ( 'strictfp' )
            // Haxe.g:553:13: 'strictfp'
            {
            match("strictfp"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRICTFP"

    // $ANTLR start "SUPER"
    public final void mSUPER() throws RecognitionException {
        try {
            int _type = SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:554:6: ( 'super' )
            // Haxe.g:554:13: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUPER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:555:7: ( 'String' )
            // Haxe.g:555:13: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "SWITCH"
    public final void mSWITCH() throws RecognitionException {
        try {
            int _type = SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:556:7: ( 'switch' )
            // Haxe.g:556:13: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SWITCH"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:557:5: ( 'this' )
            // Haxe.g:557:13: 'this'
            {
            match("this"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "THROW"
    public final void mTHROW() throws RecognitionException {
        try {
            int _type = THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:558:6: ( 'throw' )
            // Haxe.g:558:13: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROW"

    // $ANTLR start "THROWS"
    public final void mTHROWS() throws RecognitionException {
        try {
            int _type = THROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:559:7: ( 'throws' )
            // Haxe.g:559:13: 'throws'
            {
            match("throws"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THROWS"

    // $ANTLR start "TRANSIENT"
    public final void mTRANSIENT() throws RecognitionException {
        try {
            int _type = TRANSIENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:560:10: ( 'transient' )
            // Haxe.g:560:13: 'transient'
            {
            match("transient"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRANSIENT"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:561:4: ( 'try' )
            // Haxe.g:561:13: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:562:8: ( 'typedef' )
            // Haxe.g:562:13: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "UNTYPED"
    public final void mUNTYPED() throws RecognitionException {
        try {
            int _type = UNTYPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:563:8: ( 'untyped' )
            // Haxe.g:563:13: 'untyped'
            {
            match("untyped"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNTYPED"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:564:6: ( 'using' )
            // Haxe.g:564:13: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:565:4: ( 'var' )
            // Haxe.g:565:13: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:566:5: ( 'Void' )
            // Haxe.g:566:13: 'Void'
            {
            match("Void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "VOLATILE"
    public final void mVOLATILE() throws RecognitionException {
        try {
            int _type = VOLATILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:567:9: ( 'volatile' )
            // Haxe.g:567:13: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOLATILE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:568:6: ( 'while' )
            // Haxe.g:568:13: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:569:5: ( 'true' )
            // Haxe.g:569:13: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:570:6: ( 'false' )
            // Haxe.g:570:13: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:571:5: ( 'null' )
            // Haxe.g:571:13: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "NEVER"
    public final void mNEVER() throws RecognitionException {
        try {
            int _type = NEVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:572:6: ( 'never' )
            // Haxe.g:572:13: 'never'
            {
            match("never"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEVER"

    // $ANTLR start "CAST"
    public final void mCAST() throws RecognitionException {
        try {
            int _type = CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:573:5: ( 'cast' )
            // Haxe.g:573:13: 'cast'
            {
            match("cast"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CAST"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:574:9: ( 'function' )
            // Haxe.g:574:13: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:575:3: ( 'in' )
            // Haxe.g:575:13: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:577:13: ( '(' )
            // Haxe.g:577:17: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:578:13: ( ')' )
            // Haxe.g:578:17: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:579:13: ( '{' )
            // Haxe.g:579:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:580:13: ( '}' )
            // Haxe.g:580:17: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LBRACKET"
    public final void mLBRACKET() throws RecognitionException {
        try {
            int _type = LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:581:13: ( '[' )
            // Haxe.g:581:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACKET"

    // $ANTLR start "RBRACKET"
    public final void mRBRACKET() throws RecognitionException {
        try {
            int _type = RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:582:13: ( ']' )
            // Haxe.g:582:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACKET"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:583:13: ( ';' )
            // Haxe.g:583:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:584:13: ( ',' )
            // Haxe.g:584:17: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:585:13: ( '.' )
            // Haxe.g:585:17: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:586:13: ( '...' )
            // Haxe.g:586:17: '...'
            {
            match("..."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELLIPSIS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:587:13: ( '=' )
            // Haxe.g:587:17: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "BANG"
    public final void mBANG() throws RecognitionException {
        try {
            int _type = BANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:588:13: ( '!' )
            // Haxe.g:588:17: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BANG"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:589:13: ( '~' )
            // Haxe.g:589:17: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "QUES"
    public final void mQUES() throws RecognitionException {
        try {
            int _type = QUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:590:13: ( '?' )
            // Haxe.g:590:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUES"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:591:13: ( ':' )
            // Haxe.g:591:17: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "EQEQ"
    public final void mEQEQ() throws RecognitionException {
        try {
            int _type = EQEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:592:13: ( '==' )
            // Haxe.g:592:17: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQEQ"

    // $ANTLR start "AMPAMP"
    public final void mAMPAMP() throws RecognitionException {
        try {
            int _type = AMPAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:593:13: ( '&&' )
            // Haxe.g:593:17: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPAMP"

    // $ANTLR start "BARBAR"
    public final void mBARBAR() throws RecognitionException {
        try {
            int _type = BARBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:594:13: ( '||' )
            // Haxe.g:594:17: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BARBAR"

    // $ANTLR start "PLUSPLUS"
    public final void mPLUSPLUS() throws RecognitionException {
        try {
            int _type = PLUSPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:595:13: ( '++' )
            // Haxe.g:595:17: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSPLUS"

    // $ANTLR start "SUBSUB"
    public final void mSUBSUB() throws RecognitionException {
        try {
            int _type = SUBSUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:596:13: ( '--' )
            // Haxe.g:596:17: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBSUB"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:597:13: ( '+' )
            // Haxe.g:597:17: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:598:13: ( '-' )
            // Haxe.g:598:17: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:599:13: ( '*' )
            // Haxe.g:599:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:600:13: ( '/' )
            // Haxe.g:600:17: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "AMP"
    public final void mAMP() throws RecognitionException {
        try {
            int _type = AMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:601:13: ( '&' )
            // Haxe.g:601:17: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMP"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:602:13: ( '|' )
            // Haxe.g:602:17: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "CARET"
    public final void mCARET() throws RecognitionException {
        try {
            int _type = CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:603:13: ( '^' )
            // Haxe.g:603:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARET"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:604:13: ( '%' )
            // Haxe.g:604:17: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "PLUSEQ"
    public final void mPLUSEQ() throws RecognitionException {
        try {
            int _type = PLUSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:605:13: ( '+=' )
            // Haxe.g:605:17: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSEQ"

    // $ANTLR start "SUBEQ"
    public final void mSUBEQ() throws RecognitionException {
        try {
            int _type = SUBEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:606:13: ( '-=' )
            // Haxe.g:606:17: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBEQ"

    // $ANTLR start "STAREQ"
    public final void mSTAREQ() throws RecognitionException {
        try {
            int _type = STAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:607:13: ( '*=' )
            // Haxe.g:607:17: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAREQ"

    // $ANTLR start "SLASHEQ"
    public final void mSLASHEQ() throws RecognitionException {
        try {
            int _type = SLASHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:608:13: ( '/=' )
            // Haxe.g:608:17: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLASHEQ"

    // $ANTLR start "AMPEQ"
    public final void mAMPEQ() throws RecognitionException {
        try {
            int _type = AMPEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:609:13: ( '&=' )
            // Haxe.g:609:17: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPEQ"

    // $ANTLR start "BAREQ"
    public final void mBAREQ() throws RecognitionException {
        try {
            int _type = BAREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:610:13: ( '|=' )
            // Haxe.g:610:17: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAREQ"

    // $ANTLR start "CARETEQ"
    public final void mCARETEQ() throws RecognitionException {
        try {
            int _type = CARETEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:611:13: ( '^=' )
            // Haxe.g:611:17: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CARETEQ"

    // $ANTLR start "PERCENTEQ"
    public final void mPERCENTEQ() throws RecognitionException {
        try {
            int _type = PERCENTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:612:13: ( '%=' )
            // Haxe.g:612:17: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PERCENTEQ"

    // $ANTLR start "BANGEQQ"
    public final void mBANGEQQ() throws RecognitionException {
        try {
            int _type = BANGEQQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:613:13: ( '!==' )
            // Haxe.g:613:17: '!=='
            {
            match("!=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BANGEQQ"

    // $ANTLR start "MONKEYS_AT"
    public final void mMONKEYS_AT() throws RecognitionException {
        try {
            int _type = MONKEYS_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:614:13: ( '@' )
            // Haxe.g:614:17: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MONKEYS_AT"

    // $ANTLR start "BANGEQ"
    public final void mBANGEQ() throws RecognitionException {
        try {
            int _type = BANGEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:615:13: ( '!=' )
            // Haxe.g:615:17: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BANGEQ"

    // $ANTLR start "MINUS_BIGGER"
    public final void mMINUS_BIGGER() throws RecognitionException {
        try {
            int _type = MINUS_BIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:616:13: ( '->' )
            // Haxe.g:616:17: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS_BIGGER"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:617:9: ( '>' )
            // Haxe.g:617:13: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GTGT"
    public final void mGTGT() throws RecognitionException {
        try {
            int _type = GTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:618:9: ( '>>' )
            // Haxe.g:618:13: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTGT"

    // $ANTLR start "LTLT"
    public final void mLTLT() throws RecognitionException {
        try {
            int _type = LTLT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:619:9: ( '<<' )
            // Haxe.g:619:13: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTLT"

    // $ANTLR start "GTGTGT"
    public final void mGTGTGT() throws RecognitionException {
        try {
            int _type = GTGTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:620:9: ( '>>>' )
            // Haxe.g:620:13: '>>>'
            {
            match(">>>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTGTGT"

    // $ANTLR start "LTLTEQ"
    public final void mLTLTEQ() throws RecognitionException {
        try {
            int _type = LTLTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:621:9: ( '<<=' )
            // Haxe.g:621:13: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTLTEQ"

    // $ANTLR start "GTGTEQ"
    public final void mGTGTEQ() throws RecognitionException {
        try {
            int _type = GTGTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:622:9: ( '>>=' )
            // Haxe.g:622:13: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTGTEQ"

    // $ANTLR start "GTGTGTEQ"
    public final void mGTGTGTEQ() throws RecognitionException {
        try {
            int _type = GTGTGTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:623:9: ( '>>>=' )
            // Haxe.g:623:13: '>>>='
            {
            match(">>>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTGTGTEQ"

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:624:9: ( '>=' )
            // Haxe.g:624:13: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTEQ"

    // $ANTLR start "LTEQ"
    public final void mLTEQ() throws RecognitionException {
        try {
            int _type = LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:625:9: ( '<=' )
            // Haxe.g:625:13: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:626:9: ( '<' )
            // Haxe.g:626:13: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:629:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )* )
            // Haxe.g:629:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Haxe.g:629:32: ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTNUM"
    public final void mINTNUM() throws RecognitionException {
        try {
            int _type = INTNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:632:13: ( ( DIGIT )+ )
            // Haxe.g:632:15: ( DIGIT )+
            {
            // Haxe.g:632:15: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTNUM"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Haxe.g:637:7: ( '0' .. '9' )
            // Haxe.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "FLOATNUM"
    public final void mFLOATNUM() throws RecognitionException {
        try {
            int _type = FLOATNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:640:13: ( ( DIGIT )+ ( EXPONENT | DOT DIGIT ( DIGIT )* ) )
            // Haxe.g:640:15: ( DIGIT )+ ( EXPONENT | DOT DIGIT ( DIGIT )* )
            {
            // Haxe.g:640:15: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            // Haxe.g:640:22: ( EXPONENT | DOT DIGIT ( DIGIT )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='E'||LA12_0=='e') ) {
                alt12=1;
            }
            else if ( (LA12_0=='.') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // Haxe.g:640:23: EXPONENT
                    {
                    mEXPONENT(); 


                    }
                    break;
                case 2 :
                    // Haxe.g:640:34: DOT DIGIT ( DIGIT )*
                    {
                    mDOT(); 


                    mDIGIT(); 


                    // Haxe.g:640:44: ( DIGIT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Haxe.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATNUM"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:644:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='/') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='/') ) {
                    alt16=1;
                }
                else if ( (LA16_1=='*') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Haxe.g:644:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // Haxe.g:644:14: (~ ( '\\n' | '\\r' ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Haxe.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // Haxe.g:644:28: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Haxe.g:644:28: '\\r'
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
                    // Haxe.g:645:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // Haxe.g:645:14: ( options {greedy=false; } : . )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='*') ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1=='/') ) {
                                alt15=2;
                            }
                            else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Haxe.g:645:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:649:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // Haxe.g:649:9: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 

            // Haxe.g:650:9: ( EscapeSequence |~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='\\') ) {
                    alt17=1;
                }
                else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '\t')||(LA17_0 >= '\u000B' && LA17_0 <= '\f')||(LA17_0 >= '\u000E' && LA17_0 <= '!')||(LA17_0 >= '#' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // Haxe.g:650:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // Haxe.g:651:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "PP_IF"
    public final void mPP_IF() throws RecognitionException {
        try {
            int _type = PP_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:663:10: ( '#if' )
            // Haxe.g:663:15: '#if'
            {
            match("#if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_IF"

    // $ANTLR start "PP_ELSEIF"
    public final void mPP_ELSEIF() throws RecognitionException {
        try {
            int _type = PP_ELSEIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:666:5: ( '#elseif' )
            // Haxe.g:666:10: '#elseif'
            {
            match("#elseif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_ELSEIF"

    // $ANTLR start "PP_ELSE"
    public final void mPP_ELSE() throws RecognitionException {
        try {
            int _type = PP_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:668:12: ( '#else' )
            // Haxe.g:668:17: '#else'
            {
            match("#else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_ELSE"

    // $ANTLR start "PP_END"
    public final void mPP_END() throws RecognitionException {
        try {
            int _type = PP_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:670:11: ( '#end' )
            // Haxe.g:670:16: '#end'
            {
            match("#end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_END"

    // $ANTLR start "PP_ERROR"
    public final void mPP_ERROR() throws RecognitionException {
        try {
            int _type = PP_ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:672:9: ( '#error' )
            // Haxe.g:672:14: '#error'
            {
            match("#error"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_ERROR"

    // $ANTLR start "TS"
    public final void mTS() throws RecognitionException {
        try {
            // Haxe.g:680:3: ( ( ' ' | '\\t' ) )
            // Haxe.g:681:5: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             skip(); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TS"

    // $ANTLR start "PREPROCESSOR_DIRECTIVE"
    public final void mPREPROCESSOR_DIRECTIVE() throws RecognitionException {
        try {
            int _type = PREPROCESSOR_DIRECTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Haxe.g:684:5: (| PP_CONDITIONAL )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='#') ) {
                alt18=2;
            }
            else {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Haxe.g:685:5: 
                    {
                    }
                    break;
                case 2 :
                    // Haxe.g:685:7: PP_CONDITIONAL
                    {
                    mPP_CONDITIONAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREPROCESSOR_DIRECTIVE"

    // $ANTLR start "PP_CONDITIONAL"
    public final void mPP_CONDITIONAL() throws RecognitionException {
        try {
            // Haxe.g:690:15: ( ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN ) )
            // Haxe.g:691:5: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            {
            // Haxe.g:691:5: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // Haxe.g:691:6: IF_TOKEN
                    {
                    mIF_TOKEN(); 


                    }
                    break;
                case 2 :
                    // Haxe.g:692:7: ELSE_TOKEN
                    {
                    mELSE_TOKEN(); 


                    }
                    break;
                case 3 :
                    // Haxe.g:693:7: ENDIF_TOKEN
                    {
                    mENDIF_TOKEN(); 


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_CONDITIONAL"

    // $ANTLR start "IF_TOKEN"
    public final void mIF_TOKEN() throws RecognitionException {
        try {
            CommonToken ppe=null;

             boolean process = true; 
            // Haxe.g:697:38: ( ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION ) )
            // Haxe.g:698:5: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            {
            // Haxe.g:698:5: ( '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION )
            // Haxe.g:698:6: '#' ( TS )* 'if' ( TS )+ ppe= PP_EXPRESSION
            {
            match('#'); 

            // Haxe.g:698:12: ( TS )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\t'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Haxe.g:698:12: TS
            	    {
            	    mTS(); 


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match("if"); 



            // Haxe.g:698:24: ( TS )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='\t'||LA21_0==' ') ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // Haxe.g:698:24: TS
            	    {
            	    mTS(); 


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            int ppeStart2547 = getCharIndex();
            int ppeStartLine2547 = getLine();
            int ppeStartCharPos2547 = getCharPositionInLine();
            mPP_EXPRESSION(); 
            ppe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ppeStart2547, getCharIndex()-1);
            ppe.setLine(ppeStartLine2547);
            ppe.setCharPositionInLine(ppeStartCharPos2547);


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF_TOKEN"

    // $ANTLR start "ELSE_TOKEN"
    public final void mELSE_TOKEN() throws RecognitionException {
        try {
            CommonToken e=null;

            // Haxe.g:708:11: ( ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION ) )
            // Haxe.g:709:5: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            {
            // Haxe.g:709:5: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // Haxe.g:709:7: '#' ( TS )* e= 'else'
                    {
                    match('#'); 

                    // Haxe.g:709:13: ( TS )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\t'||LA22_0==' ') ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // Haxe.g:709:13: TS
                    	    {
                    	    mTS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    int eStart = getCharIndex();
                    match("else"); 
                    int eStartLine2578 = getLine();
                    int eStartCharPos2578 = getCharPositionInLine();
                    e = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, eStart, getCharIndex()-1);
                    e.setLine(eStartLine2578);
                    e.setCharPositionInLine(eStartCharPos2578);


                    }
                    break;
                case 2 :
                    // Haxe.g:710:7: '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION
                    {
                    match('#'); 

                    // Haxe.g:710:13: ( TS )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\t'||LA23_0==' ') ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Haxe.g:710:13: TS
                    	    {
                    	    mTS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    match("elseif"); 



                    // Haxe.g:710:30: ( TS )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0=='\t'||LA24_0==' ') ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Haxe.g:710:30: TS
                    	    {
                    	    mTS(); 


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE_TOKEN"

    // $ANTLR start "ENDIF_TOKEN"
    public final void mENDIF_TOKEN() throws RecognitionException {
        try {
            // Haxe.g:750:12: ( '#' 'end' )
            // Haxe.g:751:5: '#' 'end'
            {
            match('#'); 

            match("end"); 




                    if (!processing.empty())
                        processing.pop();
                    skip();
                

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF_TOKEN"

    // $ANTLR start "PP_EXPRESSION"
    public final void mPP_EXPRESSION() throws RecognitionException {
        try {
            // Haxe.g:762:14: ( PP_OR_EXPRESSION )
            // Haxe.g:763:5: PP_OR_EXPRESSION
            {
            mPP_OR_EXPRESSION(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_EXPRESSION"

    // $ANTLR start "PP_OR_EXPRESSION"
    public final void mPP_OR_EXPRESSION() throws RecognitionException {
        try {
            // Haxe.g:766:17: ( PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )* )
            // Haxe.g:767:5: PP_AND_EXPRESSION ( TS )* ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            {
            mPP_AND_EXPRESSION(); 


            // Haxe.g:767:25: ( TS )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // Haxe.g:767:25: TS
            	    {
            	    mTS(); 


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // Haxe.g:767:31: ( '||' ( TS )* PP_AND_EXPRESSION ( TS )* )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='|') ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // Haxe.g:767:32: '||' ( TS )* PP_AND_EXPRESSION ( TS )*
            	    {
            	    match("||"); 



            	    // Haxe.g:767:39: ( TS )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0=='\t'||LA27_0==' ') ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // Haxe.g:767:39: TS
            	    	    {
            	    	    mTS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);


            	    mPP_AND_EXPRESSION(); 


            	    // Haxe.g:767:65: ( TS )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0=='\t'||LA28_0==' ') ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // Haxe.g:767:65: TS
            	    	    {
            	    	    mTS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_OR_EXPRESSION"

    // $ANTLR start "PP_AND_EXPRESSION"
    public final void mPP_AND_EXPRESSION() throws RecognitionException {
        try {
            // Haxe.g:770:18: ( PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )* )
            // Haxe.g:771:5: PP_UNARY_EXPRESSION ( TS )* ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            {
            mPP_UNARY_EXPRESSION(); 


            // Haxe.g:771:27: ( TS )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='\t'||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Haxe.g:771:27: TS
            	    {
            	    mTS(); 


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // Haxe.g:771:33: ( '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )* )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='&') ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Haxe.g:771:34: '&&' ( TS )* PP_UNARY_EXPRESSION ( TS )*
            	    {
            	    match("&&"); 



            	    // Haxe.g:771:41: ( TS )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0=='\t'||LA31_0==' ') ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // Haxe.g:771:41: TS
            	    	    {
            	    	    mTS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    mPP_UNARY_EXPRESSION(); 


            	    // Haxe.g:771:69: ( TS )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0=='\t'||LA32_0==' ') ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // Haxe.g:771:69: TS
            	    	    {
            	    	    mTS(); 


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_AND_EXPRESSION"

    // $ANTLR start "PP_UNARY_EXPRESSION"
    public final void mPP_UNARY_EXPRESSION() throws RecognitionException {
        try {
            CommonToken pe=null;
            CommonToken ue=null;

            // Haxe.g:774:20: (pe= PP_PRIMARY_EXPRESSION | '!' ( TS )* ue= PP_UNARY_EXPRESSION )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='('||(LA35_0 >= 'A' && LA35_0 <= 'Z')||LA35_0=='_'||(LA35_0 >= 'a' && LA35_0 <= 'z')) ) {
                alt35=1;
            }
            else if ( (LA35_0=='!') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // Haxe.g:775:5: pe= PP_PRIMARY_EXPRESSION
                    {
                    int peStart2743 = getCharIndex();
                    int peStartLine2743 = getLine();
                    int peStartCharPos2743 = getCharPositionInLine();
                    mPP_PRIMARY_EXPRESSION(); 
                    pe = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, peStart2743, getCharIndex()-1);
                    pe.setLine(peStartLine2743);
                    pe.setCharPositionInLine(peStartCharPos2743);


                    }
                    break;
                case 2 :
                    // Haxe.g:776:7: '!' ( TS )* ue= PP_UNARY_EXPRESSION
                    {
                    match('!'); 

                    // Haxe.g:776:13: ( TS )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0=='\t'||LA34_0==' ') ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Haxe.g:776:13: TS
                    	    {
                    	    mTS(); 


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    int ueStart2764 = getCharIndex();
                    int ueStartLine2764 = getLine();
                    int ueStartCharPos2764 = getCharPositionInLine();
                    mPP_UNARY_EXPRESSION(); 
                    ue = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, ueStart2764, getCharIndex()-1);
                    ue.setLine(ueStartLine2764);
                    ue.setCharPositionInLine(ueStartCharPos2764);


                     returns.push(!returns.pop()); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_UNARY_EXPRESSION"

    // $ANTLR start "PP_PRIMARY_EXPRESSION"
    public final void mPP_PRIMARY_EXPRESSION() throws RecognitionException {
        try {
            CommonToken IDENTIFIER1=null;

            // Haxe.g:780:22: ( IDENTIFIER | '(' PP_EXPRESSION ')' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0 >= 'A' && LA36_0 <= 'Z')||LA36_0=='_'||(LA36_0 >= 'a' && LA36_0 <= 'z')) ) {
                alt36=1;
            }
            else if ( (LA36_0=='(') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // Haxe.g:781:5: IDENTIFIER
                    {
                    int IDENTIFIER1Start2785 = getCharIndex();
                    int IDENTIFIER1StartLine2785 = getLine();
                    int IDENTIFIER1StartCharPos2785 = getCharPositionInLine();
                    mIDENTIFIER(); 
                    IDENTIFIER1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, IDENTIFIER1Start2785, getCharIndex()-1);
                    IDENTIFIER1.setLine(IDENTIFIER1StartLine2785);
                    IDENTIFIER1.setCharPositionInLine(IDENTIFIER1StartCharPos2785);


                     
                            //returns.push(MacroDefines.ContainsKey(IDENTIFIER1.Text));
                            returns.push(false); // TODO
                        

                    }
                    break;
                case 2 :
                    // Haxe.g:786:7: '(' PP_EXPRESSION ')'
                    {
                    match('('); 

                    mPP_EXPRESSION(); 


                    match(')'); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PP_PRIMARY_EXPRESSION"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // Haxe.g:794:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Haxe.g:794:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Haxe.g:794:22: ( '+' | '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='+'||LA37_0=='-') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Haxe.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Haxe.g:794:33: ( '0' .. '9' )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // Haxe.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // Haxe.g:797:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Haxe.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // Haxe.g:801:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='\\') ) {
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
                    alt39=1;
                    }
                    break;
                case 'u':
                    {
                    alt39=2;
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
                    alt39=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Haxe.g:801:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:802:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // Haxe.g:803:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // Haxe.g:808:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\\') ) {
                int LA40_1 = input.LA(2);

                if ( ((LA40_1 >= '0' && LA40_1 <= '3')) ) {
                    int LA40_2 = input.LA(3);

                    if ( ((LA40_2 >= '0' && LA40_2 <= '7')) ) {
                        int LA40_4 = input.LA(4);

                        if ( ((LA40_4 >= '0' && LA40_4 <= '7')) ) {
                            alt40=1;
                        }
                        else {
                            alt40=2;
                        }
                    }
                    else {
                        alt40=3;
                    }
                }
                else if ( ((LA40_1 >= '4' && LA40_1 <= '7')) ) {
                    int LA40_3 = input.LA(3);

                    if ( ((LA40_3 >= '0' && LA40_3 <= '7')) ) {
                        alt40=2;
                    }
                    else {
                        alt40=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // Haxe.g:808:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Haxe.g:809:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // Haxe.g:810:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // Haxe.g:815:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // Haxe.g:815:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // Haxe.g:1:8: ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | EXTERN | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | STRING | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | TYPEDEF | UNTYPED | USING | VAR | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | NEVER | CAST | FUNCTION | IN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR | PREPROCESSOR_DIRECTIVE )
        int alt41=129;
        alt41 = dfa41.predict(input);
        switch (alt41) {
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
                // Haxe.g:1:339: STRING
                {
                mSTRING(); 


                }
                break;
            case 49 :
                // Haxe.g:1:346: SWITCH
                {
                mSWITCH(); 


                }
                break;
            case 50 :
                // Haxe.g:1:353: THIS
                {
                mTHIS(); 


                }
                break;
            case 51 :
                // Haxe.g:1:358: THROW
                {
                mTHROW(); 


                }
                break;
            case 52 :
                // Haxe.g:1:364: THROWS
                {
                mTHROWS(); 


                }
                break;
            case 53 :
                // Haxe.g:1:371: TRANSIENT
                {
                mTRANSIENT(); 


                }
                break;
            case 54 :
                // Haxe.g:1:381: TRY
                {
                mTRY(); 


                }
                break;
            case 55 :
                // Haxe.g:1:385: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 56 :
                // Haxe.g:1:393: UNTYPED
                {
                mUNTYPED(); 


                }
                break;
            case 57 :
                // Haxe.g:1:401: USING
                {
                mUSING(); 


                }
                break;
            case 58 :
                // Haxe.g:1:407: VAR
                {
                mVAR(); 


                }
                break;
            case 59 :
                // Haxe.g:1:411: VOID
                {
                mVOID(); 


                }
                break;
            case 60 :
                // Haxe.g:1:416: VOLATILE
                {
                mVOLATILE(); 


                }
                break;
            case 61 :
                // Haxe.g:1:425: WHILE
                {
                mWHILE(); 


                }
                break;
            case 62 :
                // Haxe.g:1:431: TRUE
                {
                mTRUE(); 


                }
                break;
            case 63 :
                // Haxe.g:1:436: FALSE
                {
                mFALSE(); 


                }
                break;
            case 64 :
                // Haxe.g:1:442: NULL
                {
                mNULL(); 


                }
                break;
            case 65 :
                // Haxe.g:1:447: NEVER
                {
                mNEVER(); 


                }
                break;
            case 66 :
                // Haxe.g:1:453: CAST
                {
                mCAST(); 


                }
                break;
            case 67 :
                // Haxe.g:1:458: FUNCTION
                {
                mFUNCTION(); 


                }
                break;
            case 68 :
                // Haxe.g:1:467: IN
                {
                mIN(); 


                }
                break;
            case 69 :
                // Haxe.g:1:470: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 70 :
                // Haxe.g:1:477: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 71 :
                // Haxe.g:1:484: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 72 :
                // Haxe.g:1:491: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 73 :
                // Haxe.g:1:498: LBRACKET
                {
                mLBRACKET(); 


                }
                break;
            case 74 :
                // Haxe.g:1:507: RBRACKET
                {
                mRBRACKET(); 


                }
                break;
            case 75 :
                // Haxe.g:1:516: SEMI
                {
                mSEMI(); 


                }
                break;
            case 76 :
                // Haxe.g:1:521: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 77 :
                // Haxe.g:1:527: DOT
                {
                mDOT(); 


                }
                break;
            case 78 :
                // Haxe.g:1:531: ELLIPSIS
                {
                mELLIPSIS(); 


                }
                break;
            case 79 :
                // Haxe.g:1:540: EQ
                {
                mEQ(); 


                }
                break;
            case 80 :
                // Haxe.g:1:543: BANG
                {
                mBANG(); 


                }
                break;
            case 81 :
                // Haxe.g:1:548: TILDE
                {
                mTILDE(); 


                }
                break;
            case 82 :
                // Haxe.g:1:554: QUES
                {
                mQUES(); 


                }
                break;
            case 83 :
                // Haxe.g:1:559: COLON
                {
                mCOLON(); 


                }
                break;
            case 84 :
                // Haxe.g:1:565: EQEQ
                {
                mEQEQ(); 


                }
                break;
            case 85 :
                // Haxe.g:1:570: AMPAMP
                {
                mAMPAMP(); 


                }
                break;
            case 86 :
                // Haxe.g:1:577: BARBAR
                {
                mBARBAR(); 


                }
                break;
            case 87 :
                // Haxe.g:1:584: PLUSPLUS
                {
                mPLUSPLUS(); 


                }
                break;
            case 88 :
                // Haxe.g:1:593: SUBSUB
                {
                mSUBSUB(); 


                }
                break;
            case 89 :
                // Haxe.g:1:600: PLUS
                {
                mPLUS(); 


                }
                break;
            case 90 :
                // Haxe.g:1:605: SUB
                {
                mSUB(); 


                }
                break;
            case 91 :
                // Haxe.g:1:609: STAR
                {
                mSTAR(); 


                }
                break;
            case 92 :
                // Haxe.g:1:614: SLASH
                {
                mSLASH(); 


                }
                break;
            case 93 :
                // Haxe.g:1:620: AMP
                {
                mAMP(); 


                }
                break;
            case 94 :
                // Haxe.g:1:624: BAR
                {
                mBAR(); 


                }
                break;
            case 95 :
                // Haxe.g:1:628: CARET
                {
                mCARET(); 


                }
                break;
            case 96 :
                // Haxe.g:1:634: PERCENT
                {
                mPERCENT(); 


                }
                break;
            case 97 :
                // Haxe.g:1:642: PLUSEQ
                {
                mPLUSEQ(); 


                }
                break;
            case 98 :
                // Haxe.g:1:649: SUBEQ
                {
                mSUBEQ(); 


                }
                break;
            case 99 :
                // Haxe.g:1:655: STAREQ
                {
                mSTAREQ(); 


                }
                break;
            case 100 :
                // Haxe.g:1:662: SLASHEQ
                {
                mSLASHEQ(); 


                }
                break;
            case 101 :
                // Haxe.g:1:670: AMPEQ
                {
                mAMPEQ(); 


                }
                break;
            case 102 :
                // Haxe.g:1:676: BAREQ
                {
                mBAREQ(); 


                }
                break;
            case 103 :
                // Haxe.g:1:682: CARETEQ
                {
                mCARETEQ(); 


                }
                break;
            case 104 :
                // Haxe.g:1:690: PERCENTEQ
                {
                mPERCENTEQ(); 


                }
                break;
            case 105 :
                // Haxe.g:1:700: BANGEQQ
                {
                mBANGEQQ(); 


                }
                break;
            case 106 :
                // Haxe.g:1:708: MONKEYS_AT
                {
                mMONKEYS_AT(); 


                }
                break;
            case 107 :
                // Haxe.g:1:719: BANGEQ
                {
                mBANGEQ(); 


                }
                break;
            case 108 :
                // Haxe.g:1:726: MINUS_BIGGER
                {
                mMINUS_BIGGER(); 


                }
                break;
            case 109 :
                // Haxe.g:1:739: GT
                {
                mGT(); 


                }
                break;
            case 110 :
                // Haxe.g:1:742: GTGT
                {
                mGTGT(); 


                }
                break;
            case 111 :
                // Haxe.g:1:747: LTLT
                {
                mLTLT(); 


                }
                break;
            case 112 :
                // Haxe.g:1:752: GTGTGT
                {
                mGTGTGT(); 


                }
                break;
            case 113 :
                // Haxe.g:1:759: LTLTEQ
                {
                mLTLTEQ(); 


                }
                break;
            case 114 :
                // Haxe.g:1:766: GTGTEQ
                {
                mGTGTEQ(); 


                }
                break;
            case 115 :
                // Haxe.g:1:773: GTGTGTEQ
                {
                mGTGTGTEQ(); 


                }
                break;
            case 116 :
                // Haxe.g:1:782: GTEQ
                {
                mGTEQ(); 


                }
                break;
            case 117 :
                // Haxe.g:1:787: LTEQ
                {
                mLTEQ(); 


                }
                break;
            case 118 :
                // Haxe.g:1:792: LT
                {
                mLT(); 


                }
                break;
            case 119 :
                // Haxe.g:1:795: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 120 :
                // Haxe.g:1:806: INTNUM
                {
                mINTNUM(); 


                }
                break;
            case 121 :
                // Haxe.g:1:813: FLOATNUM
                {
                mFLOATNUM(); 


                }
                break;
            case 122 :
                // Haxe.g:1:822: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 123 :
                // Haxe.g:1:830: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 124 :
                // Haxe.g:1:844: PP_IF
                {
                mPP_IF(); 


                }
                break;
            case 125 :
                // Haxe.g:1:850: PP_ELSEIF
                {
                mPP_ELSEIF(); 


                }
                break;
            case 126 :
                // Haxe.g:1:860: PP_ELSE
                {
                mPP_ELSE(); 


                }
                break;
            case 127 :
                // Haxe.g:1:868: PP_END
                {
                mPP_END(); 


                }
                break;
            case 128 :
                // Haxe.g:1:875: PP_ERROR
                {
                mPP_ERROR(); 


                }
                break;
            case 129 :
                // Haxe.g:1:884: PREPROCESSOR_DIRECTIVE
                {
                mPREPROCESSOR_DIRECTIVE(); 


                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA41 dfa41 = new DFA41(this);
    static final String DFA19_eotS =
        "\7\uffff";
    static final String DFA19_eofS =
        "\7\uffff";
    static final String DFA19_minS =
        "\1\43\1\11\1\154\1\11\3\uffff";
    static final String DFA19_maxS =
        "\1\43\1\151\1\156\1\151\3\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\1\1\3\1\2";
    static final String DFA19_specialS =
        "\7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\3\26\uffff\1\3\104\uffff\1\2\3\uffff\1\4",
            "\1\6\1\uffff\1\5",
            "\1\3\26\uffff\1\3\104\uffff\1\6\3\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "691:5: ( IF_TOKEN | ELSE_TOKEN | ENDIF_TOKEN )";
        }
    }
    static final String DFA25_eotS =
        "\6\uffff\1\10\2\uffff";
    static final String DFA25_eofS =
        "\11\uffff";
    static final String DFA25_minS =
        "\1\43\2\11\1\154\1\163\1\145\1\151\2\uffff";
    static final String DFA25_maxS =
        "\1\43\2\145\1\154\1\163\1\145\1\151\2\uffff";
    static final String DFA25_acceptS =
        "\7\uffff\1\2\1\1";
    static final String DFA25_specialS =
        "\11\uffff}>";
    static final String[] DFA25_transitionS = {
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
            return "709:5: ( '#' ( TS )* e= 'else' | '#' ( TS )* 'elseif' ( TS )+ PP_EXPRESSION )";
        }
    }
    static final String DFA41_eotS =
        "\1\70\1\uffff\2\73\1\uffff\27\65\10\uffff\1\161\1\163\1\165\3\uffff"+
        "\1\170\1\173\1\176\1\u0082\1\u0084\1\u0087\1\u0089\1\u008b\1\uffff"+
        "\1\u008e\1\u0091\10\uffff\1\73\1\u0095\1\uffff\1\73\11\65\1\u00a1"+
        "\12\65\1\u00ac\1\65\1\u00b1\30\65\4\uffff\1\u00d1\27\uffff\1\u00d4"+
        "\2\uffff\1\u00d6\4\uffff\1\73\1\uffff\13\65\1\uffff\5\65\1\u00ed"+
        "\4\65\1\uffff\4\65\1\uffff\1\u00f7\2\65\1\u00fa\21\65\1\u010c\4"+
        "\65\1\u0111\3\65\2\uffff\1\u0116\4\uffff\1\u0117\3\uffff\1\65\1"+
        "\u011b\1\65\1\u011d\1\u011e\1\u011f\1\65\1\u0121\6\65\1\u0128\1"+
        "\u0129\2\65\1\uffff\3\65\1\u0130\5\65\1\uffff\1\u0136\1\65\1\uffff"+
        "\1\65\1\u0139\14\65\1\u0146\2\65\1\uffff\1\u0149\3\65\1\uffff\1"+
        "\65\1\u014e\1\65\5\uffff\1\65\1\uffff\1\u0153\3\uffff\1\u0154\1"+
        "\uffff\1\u0155\1\u0156\4\65\2\uffff\2\65\1\u015e\1\u015f\1\65\1"+
        "\u0161\1\uffff\5\65\1\uffff\1\65\1\u0168\1\uffff\5\65\1\u016e\2"+
        "\65\1\u0171\3\65\1\uffff\1\u0176\1\65\1\uffff\2\65\1\u017a\1\65"+
        "\1\uffff\1\u017c\1\u017e\1\uffff\1\65\4\uffff\2\65\1\u0182\2\65"+
        "\1\u0185\1\65\2\uffff\1\65\1\uffff\1\65\1\u0189\2\65\1\u018c\1\u018d"+
        "\1\uffff\3\65\1\u0191\1\u0192\1\uffff\1\u0193\1\65\1\uffff\1\u0195"+
        "\1\65\1\u0197\1\u0198\1\uffff\3\65\1\uffff\1\65\3\uffff\2\65\1\u01a0"+
        "\1\uffff\1\u01a1\1\u01a2\1\uffff\1\u01a3\2\65\1\uffff\2\65\2\uffff"+
        "\1\u01a8\1\u01a9\1\65\3\uffff\1\65\1\uffff\1\65\2\uffff\1\65\1\u01ae"+
        "\1\u01af\1\65\1\u01b1\1\u01b2\1\u01b3\4\uffff\1\u01b4\3\65\2\uffff"+
        "\1\65\1\u01b9\1\u01ba\1\65\2\uffff\1\u01bc\4\uffff\2\65\1\u01bf"+
        "\1\u01c0\2\uffff\1\u01c1\1\uffff\1\u01c2\1\u01c3\5\uffff";
    static final String DFA41_eofS =
        "\u01c4\uffff";
    static final String DFA41_minS =
        "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\162\1\141\1\145\1\154\1"+
        "\141\1\154\1\157\1\146\1\156\1\157\2\141\1\145\1\150\1\166\1\164"+
        "\1\150\1\156\1\141\1\157\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1"+
        "\75\1\53\1\55\1\75\1\52\2\75\1\uffff\1\75\1\74\2\uffff\1\11\1\uffff"+
        "\2\60\2\uffff\2\56\1\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2"+
        "\141\1\156\1\146\1\60\1\156\1\163\1\165\1\164\1\156\1\162\1\154"+
        "\1\156\1\157\1\164\1\60\1\160\1\60\1\164\1\156\1\164\1\166\1\154"+
        "\1\143\1\151\1\142\1\164\1\157\1\141\1\160\1\151\1\145\1\162\1\151"+
        "\1\141\1\160\1\164\1\151\1\162\1\154\2\151\4\uffff\1\75\27\uffff"+
        "\1\75\2\uffff\1\75\2\uffff\1\146\1\154\1\60\1\uffff\1\164\1\154"+
        "\1\141\2\145\1\143\1\162\2\163\1\141\1\142\1\uffff\1\141\1\145\1"+
        "\155\1\145\1\141\1\60\1\163\1\143\1\141\1\157\1\uffff\1\154\1\164"+
        "\1\145\1\151\1\uffff\1\60\1\147\1\151\1\60\1\145\1\154\1\153\1\166"+
        "\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\162\1\151\1\163"+
        "\1\157\1\156\1\60\2\145\1\171\1\156\1\60\1\141\1\144\1\154\2\uffff"+
        "\1\75\4\uffff\1\11\1\163\1\144\1\uffff\1\162\1\60\1\153\3\60\1\150"+
        "\1\60\1\163\1\164\1\151\1\165\1\154\1\155\2\60\1\156\1\154\1\uffff"+
        "\1\145\2\164\1\60\1\145\1\162\1\141\1\162\1\156\1\uffff\1\60\1\166"+
        "\1\uffff\1\162\1\60\2\141\1\145\1\151\1\162\1\164\1\151\1\143\1"+
        "\162\1\143\1\162\1\156\1\60\1\167\1\163\1\uffff\1\60\1\144\1\160"+
        "\1\147\1\uffff\1\164\1\60\1\145\3\uffff\1\145\1\uffff\1\141\1\uffff"+
        "\1\60\3\uffff\1\60\1\uffff\2\60\1\156\1\154\1\145\1\151\2\uffff"+
        "\1\144\1\156\2\60\1\151\1\60\1\uffff\1\155\1\164\1\156\1\146\1\145"+
        "\1\uffff\1\145\1\60\1\uffff\1\147\1\164\2\143\1\156\1\60\1\143\1"+
        "\164\1\60\1\150\1\151\1\147\1\uffff\1\60\1\151\1\uffff\2\145\1\60"+
        "\1\151\1\uffff\1\60\1\151\1\uffff\1\143\4\uffff\1\165\1\164\1\60"+
        "\1\143\1\163\1\60\1\171\2\uffff\1\157\1\uffff\1\145\1\60\1\143\1"+
        "\141\2\60\1\uffff\2\145\1\164\2\60\1\uffff\1\60\1\146\1\uffff\1"+
        "\60\1\144\2\60\1\uffff\1\145\1\146\1\144\1\uffff\1\154\1\uffff\1"+
        "\146\1\uffff\1\164\1\145\1\60\1\uffff\2\60\1\uffff\1\60\2\156\1"+
        "\uffff\1\145\1\143\2\uffff\2\60\1\145\3\uffff\1\160\1\uffff\1\145"+
        "\2\uffff\1\156\2\60\1\145\1\11\2\60\4\uffff\1\60\1\164\1\157\1\145"+
        "\2\uffff\1\144\2\60\1\164\2\uffff\1\60\4\uffff\1\163\1\146\2\60"+
        "\2\uffff\1\60\1\uffff\2\60\5\uffff";
    static final String DFA41_maxS =
        "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\157\1\171\1\157\1\171"+
        "\1\170\1\165\1\154\1\157\2\156\1\157\2\165\1\145\1\167\1\166\1\164"+
        "\1\171\1\163\2\157\1\150\10\uffff\1\56\2\75\3\uffff\1\75\1\174\1"+
        "\75\1\76\4\75\1\uffff\1\76\1\75\2\uffff\1\151\1\uffff\2\146\2\uffff"+
        "\1\154\1\145\1\uffff\1\154\1\163\1\157\1\145\2\164\2\141\1\156\1"+
        "\146\1\172\1\156\1\163\1\165\1\164\1\156\1\162\1\154\1\156\1\157"+
        "\1\164\1\172\1\160\1\172\1\164\1\156\1\164\1\167\1\154\1\143\1\157"+
        "\1\142\1\164\1\157\1\162\1\160\1\151\1\145\2\162\1\171\1\160\1\164"+
        "\1\151\1\162\1\154\2\151\4\uffff\1\75\27\uffff\1\76\2\uffff\1\75"+
        "\2\uffff\1\146\1\162\1\154\1\uffff\1\164\1\154\1\141\1\145\1\164"+
        "\1\143\1\162\1\163\1\164\1\141\1\142\1\uffff\1\141\1\145\1\155\1"+
        "\145\1\141\1\172\1\163\1\143\1\141\1\157\1\uffff\1\157\1\164\1\145"+
        "\1\151\1\uffff\1\172\1\147\1\151\1\172\1\145\1\154\1\153\1\166\1"+
        "\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\162\1\151\1\163"+
        "\1\157\1\156\1\172\2\145\1\171\1\156\1\172\1\141\1\144\1\154\2\uffff"+
        "\1\75\4\uffff\1\40\1\163\1\144\1\uffff\1\162\1\172\1\153\3\172\1"+
        "\150\1\172\1\163\1\164\1\151\1\165\1\154\1\155\2\172\1\162\1\154"+
        "\1\uffff\1\145\2\164\1\172\1\145\1\162\1\141\1\162\1\156\1\uffff"+
        "\1\172\1\166\1\uffff\1\162\1\172\2\141\1\145\1\151\1\162\1\164\1"+
        "\151\1\143\1\162\1\143\1\162\1\156\1\172\1\167\1\163\1\uffff\1\172"+
        "\1\144\1\160\1\147\1\uffff\1\164\1\172\1\145\3\uffff\1\145\1\uffff"+
        "\1\141\1\uffff\1\172\3\uffff\1\172\1\uffff\2\172\1\156\1\154\1\145"+
        "\1\151\2\uffff\1\144\1\156\2\172\1\151\1\172\1\uffff\1\155\1\164"+
        "\1\156\1\146\1\145\1\uffff\1\145\1\172\1\uffff\1\147\1\164\2\143"+
        "\1\156\1\172\1\143\1\164\1\172\1\150\1\151\1\147\1\uffff\1\172\1"+
        "\151\1\uffff\2\145\1\172\1\151\1\uffff\1\172\1\151\1\uffff\1\143"+
        "\4\uffff\1\165\1\164\1\172\1\143\1\163\1\172\1\171\2\uffff\1\157"+
        "\1\uffff\1\145\1\172\1\143\1\141\2\172\1\uffff\2\145\1\164\2\172"+
        "\1\uffff\1\172\1\146\1\uffff\1\172\1\144\2\172\1\uffff\1\145\1\146"+
        "\1\144\1\uffff\1\154\1\uffff\1\146\1\uffff\1\164\1\145\1\172\1\uffff"+
        "\2\172\1\uffff\1\172\2\156\1\uffff\1\145\1\143\2\uffff\2\172\1\145"+
        "\3\uffff\1\160\1\uffff\1\145\2\uffff\1\156\2\172\1\145\1\40\2\172"+
        "\4\uffff\1\172\1\164\1\157\1\145\2\uffff\1\144\2\172\1\164\2\uffff"+
        "\1\172\4\uffff\1\163\1\146\2\172\2\uffff\1\172\1\uffff\2\172\5\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\27\uffff\1\105\1\106\1\107\1\110\1\111"+
        "\1\112\1\113\1\114\3\uffff\1\121\1\122\1\123\10\uffff\1\152\2\uffff"+
        "\1\167\1\173\1\uffff\1\u0081\2\uffff\1\3\1\2\2\uffff\1\171\60\uffff"+
        "\1\116\1\115\1\124\1\117\1\uffff\1\120\1\125\1\145\1\135\1\126\1"+
        "\146\1\136\1\127\1\141\1\131\1\130\1\142\1\154\1\132\1\143\1\133"+
        "\1\144\1\172\1\134\1\147\1\137\1\150\1\140\1\uffff\1\164\1\155\1"+
        "\uffff\1\165\1\166\3\uffff\1\170\13\uffff\1\20\12\uffff\1\33\4\uffff"+
        "\1\104\36\uffff\1\151\1\153\1\uffff\1\162\1\156\1\161\1\157\3\uffff"+
        "\1\u0080\22\uffff\1\31\11\uffff\1\37\2\uffff\1\43\21\uffff\1\66"+
        "\4\uffff\1\72\3\uffff\1\163\1\160\1\174\1\uffff\1\177\1\uffff\1"+
        "\6\1\uffff\1\10\1\11\1\102\1\uffff\1\13\6\uffff\1\22\1\23\6\uffff"+
        "\1\32\5\uffff\1\41\2\uffff\1\100\14\uffff\1\62\2\uffff\1\76\4\uffff"+
        "\1\73\2\uffff\1\177\1\uffff\1\7\1\12\1\14\1\15\7\uffff\1\26\1\77"+
        "\1\uffff\1\30\6\uffff\1\101\5\uffff\1\51\2\uffff\1\57\4\uffff\1"+
        "\63\3\uffff\1\71\1\uffff\1\75\1\uffff\1\176\3\uffff\1\21\2\uffff"+
        "\1\25\3\uffff\1\35\2\uffff\1\53\1\42\3\uffff\1\47\1\50\1\52\1\uffff"+
        "\1\61\1\uffff\1\60\1\64\7\uffff\1\17\1\54\1\24\1\27\4\uffff\1\44"+
        "\1\45\4\uffff\1\67\1\70\1\uffff\1\175\1\5\1\16\1\103\4\uffff\1\56"+
        "\1\55\1\uffff\1\74\2\uffff\1\40\1\46\1\65\1\34\1\36";
    static final String DFA41_specialS =
        "\u01c4\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\2\uffff\1\1\22\uffff\1\1\1\46\1\66\1\67\1\uffff\1\61\1"+
            "\52\1\4\1\34\1\35\1\56\1\54\1\43\1\55\1\44\1\57\1\2\11\3\1\51"+
            "\1\42\1\64\1\45\1\63\1\50\1\62\1\65\1\6\3\65\1\14\2\65\1\17"+
            "\11\65\1\26\2\65\1\32\4\65\1\40\1\uffff\1\41\1\60\1\65\1\uffff"+
            "\1\5\1\7\1\10\1\11\1\12\1\13\1\15\1\65\1\16\2\65\1\20\1\65\1"+
            "\21\1\25\1\22\1\65\1\23\1\24\1\27\1\30\1\31\1\33\3\65\1\36\1"+
            "\53\1\37\1\47",
            "",
            "\1\77\1\uffff\10\75\2\76\13\uffff\1\77\6\uffff\1\74\13\uffff"+
            "\1\72\14\uffff\1\77\6\uffff\1\74\13\uffff\1\71",
            "\1\77\1\uffff\12\100\13\uffff\1\77\6\uffff\1\74\30\uffff\1"+
            "\77\6\uffff\1\74",
            "",
            "\1\101",
            "\1\102",
            "\1\103\6\uffff\1\104",
            "\1\105\6\uffff\1\106\3\uffff\1\107\2\uffff\1\110",
            "\1\111\11\uffff\1\112\11\uffff\1\113",
            "\1\114\1\uffff\1\115\11\uffff\1\116",
            "\1\121\7\uffff\1\117\5\uffff\1\120\5\uffff\1\122",
            "\1\123",
            "\1\124",
            "\1\125\6\uffff\1\126\1\127",
            "\1\130",
            "\1\131",
            "\1\132\3\uffff\1\133\17\uffff\1\134",
            "\1\135\20\uffff\1\136\2\uffff\1\137",
            "\1\140",
            "\1\141\13\uffff\1\142\1\143\1\uffff\1\144",
            "\1\145",
            "\1\146",
            "\1\147\11\uffff\1\150\6\uffff\1\151",
            "\1\152\4\uffff\1\153",
            "\1\154\15\uffff\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\162",
            "\1\164",
            "",
            "",
            "",
            "\1\166\26\uffff\1\167",
            "\1\172\76\uffff\1\171",
            "\1\174\21\uffff\1\175",
            "\1\177\17\uffff\1\u0080\1\u0081",
            "\1\u0083",
            "\1\u0086\4\uffff\1\u0086\15\uffff\1\u0085",
            "\1\u0088",
            "\1\u008a",
            "",
            "\1\u008d\1\u008c",
            "\1\u008f\1\u0090",
            "",
            "",
            "\1\70\26\uffff\1\70\104\uffff\1\u0093\3\uffff\1\u0092",
            "",
            "\12\u0094\7\uffff\6\u0094\32\uffff\6\u0094",
            "\12\u0094\7\uffff\6\u0094\32\uffff\6\u0094",
            "",
            "",
            "\1\77\1\uffff\10\75\2\76\13\uffff\1\77\6\uffff\1\74\30\uffff"+
            "\1\77\6\uffff\1\74",
            "\1\77\1\uffff\12\76\13\uffff\1\77\37\uffff\1\77",
            "",
            "\1\77\1\uffff\12\100\13\uffff\1\77\6\uffff\1\74\30\uffff\1"+
            "\77\6\uffff\1\74",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00a0\5\65",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ad",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u00b0\6\65"+
            "\1\u00ae\1\u00af\6\65",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b6\1\u00b5",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\5\uffff\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\20\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4\10\uffff\1\u00c5",
            "\1\u00c6\23\uffff\1\u00c8\3\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d3\1\u00d2",
            "",
            "",
            "\1\u00d5",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8\1\uffff\1\u00d9\3\uffff\1\u00da",
            "\12\u0094\7\uffff\6\u0094\5\uffff\1\74\24\uffff\6\u0094\5\uffff"+
            "\1\74",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df\16\uffff\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2\2\uffff\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00f8",
            "\1\u00f9",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00fb",
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
            "\1\u010b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "",
            "",
            "",
            "",
            "\1\70\26\uffff\1\70",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u011c",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0120",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u012a\3\uffff\1\u012b",
            "\1\u012c",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0137",
            "",
            "\1\u0138",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u013a",
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
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0147",
            "\1\u0148",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "",
            "\1\u014d",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u014f",
            "",
            "",
            "",
            "\1\u0150",
            "",
            "\1\u0152",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "\1\u015b",
            "\1\u015c",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65\1\u015d\16"+
            "\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0160",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "",
            "\1\u0167",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u016f",
            "\1\u0170",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u0175\7\65",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017b",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017d",
            "",
            "\1\u017f",
            "",
            "",
            "",
            "",
            "\1\u0180",
            "\1\u0181",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0183",
            "\1\u0184",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0186",
            "",
            "",
            "\1\u0187",
            "",
            "\1\u0188",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u018a",
            "\1\u018b",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0194",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0196",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "\1\u019c",
            "",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\u019f",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01aa",
            "",
            "",
            "",
            "\1\u01ab",
            "",
            "\1\u01ac",
            "",
            "",
            "\1\u01ad",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01b0",
            "\1\70\26\uffff\1\70",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "",
            "\1\u01b8",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u01bb",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
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
            return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | EXTERN | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | STRING | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | TYPEDEF | UNTYPED | USING | VAR | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | NEVER | CAST | FUNCTION | IN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR | PREPROCESSOR_DIRECTIVE );";
        }
    }
 

}