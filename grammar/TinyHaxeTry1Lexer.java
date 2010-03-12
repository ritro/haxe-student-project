// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-12 04:42:30

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TinyHaxeTry1Lexer extends Lexer {
    public static final int CAST=87;
    public static final int PACKAGE=19;
    public static final int FUNCTION=32;
    public static final int EXPONENT=152;
    public static final int LT=46;
    public static final int STAR=79;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int WHILE=49;
    public static final int FLOATNUM=100;
    public static final int CONST=112;
    public static final int OCTAL_ESC=156;
    public static final int CASE=59;
    public static final int CHAR=111;
    public static final int NEW=86;
    public static final int T__160=160;
    public static final int DO=50;
    public static final int VAR_DECLARATION=16;
    public static final int GTGT=75;
    public static final int EOF=-1;
    public static final int BREAK=53;
    public static final int UNARY_PLUS=5;
    public static final int LBRACKET=35;
    public static final int RPAREN=34;
    public static final int FINAL=114;
    public static final int IMPORT=23;
    public static final int SUBSUB=82;
    public static final int STAREQ=135;
    public static final int CARET=73;
    public static final int RETURN=51;
    public static final int THIS=126;
    public static final int DOUBLE=113;
    public static final int MONKEYS_AT=147;
    public static final int BARBAR=65;
    public static final int VAR=89;
    public static final int VOID=129;
    public static final int SUPER=125;
    public static final int EQ=90;
    public static final int GOTO=117;
    public static final int AMPAMP=66;
    public static final int COMMENT=153;
    public static final int VAR_INIT=18;
    public static final int QUES=31;
    public static final int EQEQ=67;
    public static final int HexPrefix=104;
    public static final int PP_IF=37;
    public static final int PERCENTDBBQ=143;
    public static final int RBRACE=56;
    public static final int STATIC=26;
    public static final int PRIVATE=25;
    public static final int BLOCK_SCOPE=11;
    public static final int SWITCH=61;
    public static final int NULL=85;
    public static final int STRICTFP=124;
    public static final int ELSE=48;
    public static final int NATIVE=121;
    public static final int ELLIPSIS=64;
    public static final int THROWS=127;
    public static final int UNARY_MINUS=4;
    public static final int INT=119;
    public static final int SLASHEQ=136;
    public static final int INTLITERAL=97;
    public static final int PERCENTBB=149;
    public static final int TRY=62;
    public static final int LongSuffix=103;
    public static final int LONGLITERAL=96;
    public static final int PERCENTLL=148;
    public static final int BANGEQQ=146;
    public static final int WS=101;
    public static final int PERCENTDLQ=141;
    public static final int INHERIT_LIST_OPT=15;
    public static final int CHARLITERAL=99;
    public static final int GT=45;
    public static final int INLINE=27;
    public static final int CATCH=63;
    public static final int FALSE=132;
    public static final int EscapeSequence=107;
    public static final int THROW=52;
    public static final int DYNAMIC=28;
    public static final int PROTECTED=122;
    public static final int CLASS=91;
    public static final int PP_ELSEIF=39;
    public static final int BAREQ=138;
    public static final int PP_ELSE=40;
    public static final int IntegerNumber=102;
    public static final int AMP=72;
    public static final int PLUSPLUS=83;
    public static final int LBRACE=55;
    public static final int LTEQ=70;
    public static final int TYPE_PARAM_OPT=14;
    public static final int GTGTGT=76;
    public static final int SUBEQ=134;
    public static final int FOR=57;
    public static final int Exponent=106;
    public static final int SUB=78;
    public static final int SUFFIX_EXPR=9;
    public static final int FLOAT=116;
    public static final int ABSTRACT=108;
    public static final int MINUS_BIGGER=44;
    public static final int PERCENTDBQ=142;
    public static final int HexDigit=105;
    public static final int PLUSEQ=133;
    public static final int LPAREN=33;
    public static final int IF=47;
    public static final int INTNUM=151;
    public static final int SLASH=80;
    public static final int PP_END=41;
    public static final int BOOLEAN=109;
    public static final int ESC_SEQ=157;
    public static final int IN=58;
    public static final int IMPLEMENTS=94;
    public static final int CONTINUE=54;
    public static final int COMMA=30;
    public static final int AMPEQ=137;
    public static final int IDENTIFIER=21;
    public static final int TRANSIENT=128;
    public static final int TILDE=84;
    public static final int BANGEQ=68;
    public static final int PLUS=77;
    public static final int RBRACKET=36;
    public static final int DOT=22;
    public static final int LTLT=74;
    public static final int BYTE=110;
    public static final int PERCENT=81;
    public static final int VOLATILE=130;
    public static final int DECL_ATTR_LIST=17;
    public static final int TYPEDEF=95;
    public static final int UNICODE_ESC=155;
    public static final int DEFAULT=60;
    public static final int STAtEMENT=10;
    public static final int EQEQEQ=144;
    public static final int PREFIX_EXPR=6;
    public static final int HEX_DIGIT=154;
    public static final int SHORT=123;
    public static final int BANG=38;
    public static final int INSTANCEOF=118;
    public static final int GTEQ=69;
    public static final int PP_ERROR=42;
    public static final int MODULE=8;
    public static final int SEMI=20;
    public static final int TRUE=131;
    public static final int COLON=43;
    public static final int PARAM_LIST=12;
    public static final int PERCENTLESQ=145;
    public static final int ENUM=88;
    public static final int FINALLY=115;
    public static final int PERCENTEQ=140;
    public static final int PROPERTY_DECL=7;
    public static final int OVERRIDE=29;
    public static final int STRINGLITERAL=98;
    public static final int CARETEQ=139;
    public static final int PERCENTBBB=150;
    public static final int INTERFACE=92;
    public static final int LONG=120;
    public static final int PUBLIC=24;
    public static final int EXTENDS=93;
    public static final int TYPE_TAG=13;
    public static final int BAR=71;

    // delegates
    // delegators

    public TinyHaxeTry1Lexer() {;} 
    public TinyHaxeTry1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TinyHaxeTry1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\antlr\\TinyHaxeTry1.g"; }

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:3:8: ( '<<=' )
            // C:\\antlr\\TinyHaxeTry1.g:3:10: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:4:8: ( '>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:4:10: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:5:8: ( '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:5:10: '>>>='
            {
            match(">>>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:366:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\antlr\\TinyHaxeTry1.g:366:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\antlr\\TinyHaxeTry1.g:377:5: ( IntegerNumber LongSuffix )
            // C:\\antlr\\TinyHaxeTry1.g:377:9: IntegerNumber LongSuffix
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
            // C:\\antlr\\TinyHaxeTry1.g:382:5: ( IntegerNumber )
            // C:\\antlr\\TinyHaxeTry1.g:382:9: IntegerNumber
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
            // C:\\antlr\\TinyHaxeTry1.g:387:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
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
                    // C:\\antlr\\TinyHaxeTry1.g:387:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:388:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // C:\\antlr\\TinyHaxeTry1.g:388:18: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:388:19: '0' .. '9'
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
                    // C:\\antlr\\TinyHaxeTry1.g:389:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // C:\\antlr\\TinyHaxeTry1.g:389:13: ( '0' .. '7' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:389:14: '0' .. '7'
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
                    // C:\\antlr\\TinyHaxeTry1.g:390:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // C:\\antlr\\TinyHaxeTry1.g:390:19: ( HexDigit )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:390:19: HexDigit
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
            // C:\\antlr\\TinyHaxeTry1.g:395:5: ( '0x' | '0X' )
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
                    // C:\\antlr\\TinyHaxeTry1.g:395:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:395:16: '0X'
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
            // C:\\antlr\\TinyHaxeTry1.g:400:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\antlr\\TinyHaxeTry1.g:400:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\antlr\\TinyHaxeTry1.g:405:5: ( 'l' | 'L' )
            // C:\\antlr\\TinyHaxeTry1.g:
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
            // C:\\antlr\\TinyHaxeTry1.g:410:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:410:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:410:23: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:
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

            // C:\\antlr\\TinyHaxeTry1.g:410:38: ( '0' .. '9' )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:410:40: '0' .. '9'
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
            // C:\\antlr\\TinyHaxeTry1.g:414:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // C:\\antlr\\TinyHaxeTry1.g:414:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // C:\\antlr\\TinyHaxeTry1.g:415:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
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
                    // C:\\antlr\\TinyHaxeTry1.g:415:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:416:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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
            // C:\\antlr\\TinyHaxeTry1.g:424:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // C:\\antlr\\TinyHaxeTry1.g:424:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 
            // C:\\antlr\\TinyHaxeTry1.g:424:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt9=11;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:425:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:426:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:427:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:428:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:429:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:430:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:431:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:432:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // C:\\antlr\\TinyHaxeTry1.g:434:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:434:18: ( '0' .. '3' )
                    // C:\\antlr\\TinyHaxeTry1.g:434:19: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:434:29: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:434:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:434:40: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:434:41: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 10 :
                    // C:\\antlr\\TinyHaxeTry1.g:436:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:436:18: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:436:19: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:436:29: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:436:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 11 :
                    // C:\\antlr\\TinyHaxeTry1.g:438:18: ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:438:18: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:438:19: '0' .. '7'
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
            // C:\\antlr\\TinyHaxeTry1.g:443:5: ( 'abstract' )
            // C:\\antlr\\TinyHaxeTry1.g:443:9: 'abstract'
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
            // C:\\antlr\\TinyHaxeTry1.g:447:5: ( 'boolean' )
            // C:\\antlr\\TinyHaxeTry1.g:447:9: 'boolean'
            {
            match("boolean"); 


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
            // C:\\antlr\\TinyHaxeTry1.g:451:5: ( 'break' )
            // C:\\antlr\\TinyHaxeTry1.g:451:9: 'break'
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
            // C:\\antlr\\TinyHaxeTry1.g:455:5: ( 'byte' )
            // C:\\antlr\\TinyHaxeTry1.g:455:9: 'byte'
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
            // C:\\antlr\\TinyHaxeTry1.g:459:5: ( 'case' )
            // C:\\antlr\\TinyHaxeTry1.g:459:9: 'case'
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
            // C:\\antlr\\TinyHaxeTry1.g:463:5: ( 'catch' )
            // C:\\antlr\\TinyHaxeTry1.g:463:9: 'catch'
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
            // C:\\antlr\\TinyHaxeTry1.g:467:5: ( 'char' )
            // C:\\antlr\\TinyHaxeTry1.g:467:9: 'char'
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
            // C:\\antlr\\TinyHaxeTry1.g:471:5: ( 'class' )
            // C:\\antlr\\TinyHaxeTry1.g:471:9: 'class'
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
            // C:\\antlr\\TinyHaxeTry1.g:475:5: ( 'const' )
            // C:\\antlr\\TinyHaxeTry1.g:475:9: 'const'
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
            // C:\\antlr\\TinyHaxeTry1.g:479:5: ( 'continue' )
            // C:\\antlr\\TinyHaxeTry1.g:479:9: 'continue'
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
            // C:\\antlr\\TinyHaxeTry1.g:483:5: ( 'default' )
            // C:\\antlr\\TinyHaxeTry1.g:483:9: 'default'
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
            // C:\\antlr\\TinyHaxeTry1.g:487:5: ( 'do' )
            // C:\\antlr\\TinyHaxeTry1.g:487:9: 'do'
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
            // C:\\antlr\\TinyHaxeTry1.g:491:5: ( 'double' )
            // C:\\antlr\\TinyHaxeTry1.g:491:9: 'double'
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
            // C:\\antlr\\TinyHaxeTry1.g:495:5: ( 'else' )
            // C:\\antlr\\TinyHaxeTry1.g:495:9: 'else'
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
            // C:\\antlr\\TinyHaxeTry1.g:499:5: ( 'enum' )
            // C:\\antlr\\TinyHaxeTry1.g:499:9: 'enum'
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
            // C:\\antlr\\TinyHaxeTry1.g:503:5: ( 'extends' )
            // C:\\antlr\\TinyHaxeTry1.g:503:9: 'extends'
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
            // C:\\antlr\\TinyHaxeTry1.g:507:5: ( 'final' )
            // C:\\antlr\\TinyHaxeTry1.g:507:9: 'final'
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
            // C:\\antlr\\TinyHaxeTry1.g:511:5: ( 'finally' )
            // C:\\antlr\\TinyHaxeTry1.g:511:9: 'finally'
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
            // C:\\antlr\\TinyHaxeTry1.g:515:5: ( 'float' )
            // C:\\antlr\\TinyHaxeTry1.g:515:9: 'float'
            {
            match("float"); 


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
            // C:\\antlr\\TinyHaxeTry1.g:519:5: ( 'for' )
            // C:\\antlr\\TinyHaxeTry1.g:519:9: 'for'
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
            // C:\\antlr\\TinyHaxeTry1.g:523:5: ( 'goto' )
            // C:\\antlr\\TinyHaxeTry1.g:523:9: 'goto'
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
            // C:\\antlr\\TinyHaxeTry1.g:527:5: ( 'if' )
            // C:\\antlr\\TinyHaxeTry1.g:527:9: 'if'
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
            // C:\\antlr\\TinyHaxeTry1.g:531:5: ( 'implements' )
            // C:\\antlr\\TinyHaxeTry1.g:531:9: 'implements'
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
            // C:\\antlr\\TinyHaxeTry1.g:535:5: ( 'import' )
            // C:\\antlr\\TinyHaxeTry1.g:535:9: 'import'
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
            // C:\\antlr\\TinyHaxeTry1.g:539:5: ( 'instanceof' )
            // C:\\antlr\\TinyHaxeTry1.g:539:9: 'instanceof'
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
            // C:\\antlr\\TinyHaxeTry1.g:543:5: ( 'int' )
            // C:\\antlr\\TinyHaxeTry1.g:543:9: 'int'
            {
            match("int"); 


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
            // C:\\antlr\\TinyHaxeTry1.g:547:5: ( 'interface' )
            // C:\\antlr\\TinyHaxeTry1.g:547:9: 'interface'
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
            // C:\\antlr\\TinyHaxeTry1.g:551:5: ( 'long' )
            // C:\\antlr\\TinyHaxeTry1.g:551:9: 'long'
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
            // C:\\antlr\\TinyHaxeTry1.g:555:5: ( 'native' )
            // C:\\antlr\\TinyHaxeTry1.g:555:9: 'native'
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
            // C:\\antlr\\TinyHaxeTry1.g:559:5: ( 'new' )
            // C:\\antlr\\TinyHaxeTry1.g:559:9: 'new'
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
            // C:\\antlr\\TinyHaxeTry1.g:563:5: ( 'package' )
            // C:\\antlr\\TinyHaxeTry1.g:563:9: 'package'
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
            // C:\\antlr\\TinyHaxeTry1.g:567:5: ( 'private' )
            // C:\\antlr\\TinyHaxeTry1.g:567:9: 'private'
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
            // C:\\antlr\\TinyHaxeTry1.g:571:5: ( 'protected' )
            // C:\\antlr\\TinyHaxeTry1.g:571:9: 'protected'
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
            // C:\\antlr\\TinyHaxeTry1.g:575:5: ( 'public' )
            // C:\\antlr\\TinyHaxeTry1.g:575:9: 'public'
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
            // C:\\antlr\\TinyHaxeTry1.g:579:5: ( 'return' )
            // C:\\antlr\\TinyHaxeTry1.g:579:9: 'return'
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
            // C:\\antlr\\TinyHaxeTry1.g:583:5: ( 'short' )
            // C:\\antlr\\TinyHaxeTry1.g:583:9: 'short'
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
            // C:\\antlr\\TinyHaxeTry1.g:587:5: ( 'static' )
            // C:\\antlr\\TinyHaxeTry1.g:587:9: 'static'
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
            // C:\\antlr\\TinyHaxeTry1.g:591:2: ( 'inline' )
            // C:\\antlr\\TinyHaxeTry1.g:591:4: 'inline'
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
            // C:\\antlr\\TinyHaxeTry1.g:595:2: ( 'dynamic' )
            // C:\\antlr\\TinyHaxeTry1.g:595:3: 'dynamic'
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
            // C:\\antlr\\TinyHaxeTry1.g:599:2: ( 'override' )
            // C:\\antlr\\TinyHaxeTry1.g:599:3: 'override'
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
            // C:\\antlr\\TinyHaxeTry1.g:603:5: ( 'strictfp' )
            // C:\\antlr\\TinyHaxeTry1.g:603:9: 'strictfp'
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
            // C:\\antlr\\TinyHaxeTry1.g:607:5: ( 'super' )
            // C:\\antlr\\TinyHaxeTry1.g:607:9: 'super'
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
            // C:\\antlr\\TinyHaxeTry1.g:611:5: ( 'switch' )
            // C:\\antlr\\TinyHaxeTry1.g:611:9: 'switch'
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
            // C:\\antlr\\TinyHaxeTry1.g:615:5: ( 'this' )
            // C:\\antlr\\TinyHaxeTry1.g:615:9: 'this'
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
            // C:\\antlr\\TinyHaxeTry1.g:619:5: ( 'throw' )
            // C:\\antlr\\TinyHaxeTry1.g:619:9: 'throw'
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
            // C:\\antlr\\TinyHaxeTry1.g:623:5: ( 'throws' )
            // C:\\antlr\\TinyHaxeTry1.g:623:9: 'throws'
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
            // C:\\antlr\\TinyHaxeTry1.g:627:5: ( 'transient' )
            // C:\\antlr\\TinyHaxeTry1.g:627:9: 'transient'
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
            // C:\\antlr\\TinyHaxeTry1.g:631:5: ( 'try' )
            // C:\\antlr\\TinyHaxeTry1.g:631:9: 'try'
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
            // C:\\antlr\\TinyHaxeTry1.g:635:5: ( 'void' )
            // C:\\antlr\\TinyHaxeTry1.g:635:9: 'void'
            {
            match("void"); 


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
            // C:\\antlr\\TinyHaxeTry1.g:639:5: ( 'volatile' )
            // C:\\antlr\\TinyHaxeTry1.g:639:9: 'volatile'
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
            // C:\\antlr\\TinyHaxeTry1.g:643:5: ( 'while' )
            // C:\\antlr\\TinyHaxeTry1.g:643:9: 'while'
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
            // C:\\antlr\\TinyHaxeTry1.g:647:5: ( 'true' )
            // C:\\antlr\\TinyHaxeTry1.g:647:9: 'true'
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
            // C:\\antlr\\TinyHaxeTry1.g:651:5: ( 'false' )
            // C:\\antlr\\TinyHaxeTry1.g:651:9: 'false'
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
            // C:\\antlr\\TinyHaxeTry1.g:655:5: ( 'null' )
            // C:\\antlr\\TinyHaxeTry1.g:655:9: 'null'
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
            // C:\\antlr\\TinyHaxeTry1.g:657:6: ( 'cast' )
            // C:\\antlr\\TinyHaxeTry1.g:657:8: 'cast'
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
            // C:\\antlr\\TinyHaxeTry1.g:661:2: ( 'function' )
            // C:\\antlr\\TinyHaxeTry1.g:661:4: 'function'
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
            // C:\\antlr\\TinyHaxeTry1.g:664:4: ( 'in' )
            // C:\\antlr\\TinyHaxeTry1.g:664:6: 'in'
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
            // C:\\antlr\\TinyHaxeTry1.g:666:5: ( 'var' )
            // C:\\antlr\\TinyHaxeTry1.g:666:7: 'var'
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
            // C:\\antlr\\TinyHaxeTry1.g:668:9: ( 'typedef' )
            // C:\\antlr\\TinyHaxeTry1.g:668:11: 'typedef'
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

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:672:5: ( '(' )
            // C:\\antlr\\TinyHaxeTry1.g:672:9: '('
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
            // C:\\antlr\\TinyHaxeTry1.g:676:5: ( ')' )
            // C:\\antlr\\TinyHaxeTry1.g:676:9: ')'
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
            // C:\\antlr\\TinyHaxeTry1.g:680:5: ( '{' )
            // C:\\antlr\\TinyHaxeTry1.g:680:9: '{'
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
            // C:\\antlr\\TinyHaxeTry1.g:684:5: ( '}' )
            // C:\\antlr\\TinyHaxeTry1.g:684:9: '}'
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
            // C:\\antlr\\TinyHaxeTry1.g:688:5: ( '[' )
            // C:\\antlr\\TinyHaxeTry1.g:688:9: '['
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
            // C:\\antlr\\TinyHaxeTry1.g:692:5: ( ']' )
            // C:\\antlr\\TinyHaxeTry1.g:692:9: ']'
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
            // C:\\antlr\\TinyHaxeTry1.g:696:5: ( ';' )
            // C:\\antlr\\TinyHaxeTry1.g:696:9: ';'
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
            // C:\\antlr\\TinyHaxeTry1.g:700:5: ( ',' )
            // C:\\antlr\\TinyHaxeTry1.g:700:9: ','
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
            // C:\\antlr\\TinyHaxeTry1.g:704:5: ( '.' )
            // C:\\antlr\\TinyHaxeTry1.g:704:9: '.'
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
            // C:\\antlr\\TinyHaxeTry1.g:708:5: ( '...' )
            // C:\\antlr\\TinyHaxeTry1.g:708:9: '...'
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
            // C:\\antlr\\TinyHaxeTry1.g:712:5: ( '=' )
            // C:\\antlr\\TinyHaxeTry1.g:712:9: '='
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
            // C:\\antlr\\TinyHaxeTry1.g:716:5: ( '!' )
            // C:\\antlr\\TinyHaxeTry1.g:716:9: '!'
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
            // C:\\antlr\\TinyHaxeTry1.g:720:5: ( '~' )
            // C:\\antlr\\TinyHaxeTry1.g:720:9: '~'
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
            // C:\\antlr\\TinyHaxeTry1.g:724:5: ( '?' )
            // C:\\antlr\\TinyHaxeTry1.g:724:9: '?'
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
            // C:\\antlr\\TinyHaxeTry1.g:728:5: ( ':' )
            // C:\\antlr\\TinyHaxeTry1.g:728:9: ':'
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
            // C:\\antlr\\TinyHaxeTry1.g:732:5: ( '==' )
            // C:\\antlr\\TinyHaxeTry1.g:732:9: '=='
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
            // C:\\antlr\\TinyHaxeTry1.g:736:5: ( '&&' )
            // C:\\antlr\\TinyHaxeTry1.g:736:9: '&&'
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
            // C:\\antlr\\TinyHaxeTry1.g:740:5: ( '||' )
            // C:\\antlr\\TinyHaxeTry1.g:740:9: '||'
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
            // C:\\antlr\\TinyHaxeTry1.g:744:5: ( '++' )
            // C:\\antlr\\TinyHaxeTry1.g:744:9: '++'
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
            // C:\\antlr\\TinyHaxeTry1.g:748:5: ( '--' )
            // C:\\antlr\\TinyHaxeTry1.g:748:9: '--'
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
            // C:\\antlr\\TinyHaxeTry1.g:752:5: ( '+' )
            // C:\\antlr\\TinyHaxeTry1.g:752:9: '+'
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
            // C:\\antlr\\TinyHaxeTry1.g:756:5: ( '-' )
            // C:\\antlr\\TinyHaxeTry1.g:756:9: '-'
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
            // C:\\antlr\\TinyHaxeTry1.g:760:5: ( '*' )
            // C:\\antlr\\TinyHaxeTry1.g:760:9: '*'
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
            // C:\\antlr\\TinyHaxeTry1.g:764:5: ( '/' )
            // C:\\antlr\\TinyHaxeTry1.g:764:9: '/'
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
            // C:\\antlr\\TinyHaxeTry1.g:768:5: ( '&' )
            // C:\\antlr\\TinyHaxeTry1.g:768:9: '&'
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
            // C:\\antlr\\TinyHaxeTry1.g:772:5: ( '|' )
            // C:\\antlr\\TinyHaxeTry1.g:772:9: '|'
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
            // C:\\antlr\\TinyHaxeTry1.g:776:5: ( '^' )
            // C:\\antlr\\TinyHaxeTry1.g:776:9: '^'
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
            // C:\\antlr\\TinyHaxeTry1.g:780:5: ( '%' )
            // C:\\antlr\\TinyHaxeTry1.g:780:9: '%'
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
            // C:\\antlr\\TinyHaxeTry1.g:784:5: ( '+=' )
            // C:\\antlr\\TinyHaxeTry1.g:784:9: '+='
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
            // C:\\antlr\\TinyHaxeTry1.g:788:5: ( '-=' )
            // C:\\antlr\\TinyHaxeTry1.g:788:9: '-='
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
            // C:\\antlr\\TinyHaxeTry1.g:792:5: ( '*=' )
            // C:\\antlr\\TinyHaxeTry1.g:792:9: '*='
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
            // C:\\antlr\\TinyHaxeTry1.g:796:5: ( '/=' )
            // C:\\antlr\\TinyHaxeTry1.g:796:9: '/='
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
            // C:\\antlr\\TinyHaxeTry1.g:800:5: ( '&=' )
            // C:\\antlr\\TinyHaxeTry1.g:800:9: '&='
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
            // C:\\antlr\\TinyHaxeTry1.g:804:5: ( '|=' )
            // C:\\antlr\\TinyHaxeTry1.g:804:9: '|='
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
            // C:\\antlr\\TinyHaxeTry1.g:808:5: ( '^=' )
            // C:\\antlr\\TinyHaxeTry1.g:808:9: '^='
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
            // C:\\antlr\\TinyHaxeTry1.g:812:5: ( '%=' )
            // C:\\antlr\\TinyHaxeTry1.g:812:9: '%='
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
            // C:\\antlr\\TinyHaxeTry1.g:816:2: ( '%%<<%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:816:4: '%%<<%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:819:2: ( '%%>>%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:819:4: '%%>>%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:822:2: ( '%%>>>%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:822:4: '%%>>>%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:825:2: ( '===' )
            // C:\\antlr\\TinyHaxeTry1.g:825:3: '==='
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
            // C:\\antlr\\TinyHaxeTry1.g:829:1: ( '%%<=%%' )
            // C:\\antlr\\TinyHaxeTry1.g:829:3: '%%<=%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:833:2: ( '!==' )
            // C:\\antlr\\TinyHaxeTry1.g:833:3: '!=='
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
            // C:\\antlr\\TinyHaxeTry1.g:837:5: ( '@' )
            // C:\\antlr\\TinyHaxeTry1.g:837:9: '@'
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
            // C:\\antlr\\TinyHaxeTry1.g:841:5: ( '!=' )
            // C:\\antlr\\TinyHaxeTry1.g:841:9: '!='
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
            // C:\\antlr\\TinyHaxeTry1.g:844:2: ( '->' )
            // C:\\antlr\\TinyHaxeTry1.g:844:4: '->'
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
            // C:\\antlr\\TinyHaxeTry1.g:848:2: ( '%%<<%%' )
            // C:\\antlr\\TinyHaxeTry1.g:848:3: '%%<<%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:851:2: ( '%%>>%%' )
            // C:\\antlr\\TinyHaxeTry1.g:851:3: '%%>>%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:854:2: ( '%%>>>%%' )
            // C:\\antlr\\TinyHaxeTry1.g:854:3: '%%>>>%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:857:5: ( '>' )
            // C:\\antlr\\TinyHaxeTry1.g:857:9: '>'
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
            // C:\\antlr\\TinyHaxeTry1.g:859:6: ( '>>' )
            // C:\\antlr\\TinyHaxeTry1.g:859:8: '>>'
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
            // C:\\antlr\\TinyHaxeTry1.g:861:6: ( '<<' )
            // C:\\antlr\\TinyHaxeTry1.g:861:8: '<<'
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
            // C:\\antlr\\TinyHaxeTry1.g:863:8: ( '>>>' )
            // C:\\antlr\\TinyHaxeTry1.g:863:10: '>>>'
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

    // $ANTLR start "GTEQ"
    public final void mGTEQ() throws RecognitionException {
        try {
            int _type = GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:866:6: ( '>=' )
            // C:\\antlr\\TinyHaxeTry1.g:866:8: '>='
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
            // C:\\antlr\\TinyHaxeTry1.g:868:6: ( '<=' )
            // C:\\antlr\\TinyHaxeTry1.g:868:8: '<='
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
            // C:\\antlr\\TinyHaxeTry1.g:872:5: ( '<' )
            // C:\\antlr\\TinyHaxeTry1.g:872:9: '<'
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
            // C:\\antlr\\TinyHaxeTry1.g:876:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\antlr\\TinyHaxeTry1.g:876:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:876:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:
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
            // C:\\antlr\\TinyHaxeTry1.g:879:8: ( ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:879:10: ( '0' .. '9' )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:879:10: ( '0' .. '9' )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:879:10: '0' .. '9'
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
            // C:\\antlr\\TinyHaxeTry1.g:883:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:883:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:883:9: ( '0' .. '9' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:883:10: '0' .. '9'
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
                    // C:\\antlr\\TinyHaxeTry1.g:883:25: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:883:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:883:37: ( EXPONENT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:883:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:884:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\antlr\\TinyHaxeTry1.g:884:13: ( '0' .. '9' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:884:14: '0' .. '9'
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

                    // C:\\antlr\\TinyHaxeTry1.g:884:25: ( EXPONENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:884:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:885:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:885:9: ( '0' .. '9' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:885:10: '0' .. '9'
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
            // C:\\antlr\\TinyHaxeTry1.g:889:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // C:\\antlr\\TinyHaxeTry1.g:889:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\antlr\\TinyHaxeTry1.g:889:14: (~ ( '\\n' | '\\r' ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:889:14: ~ ( '\\n' | '\\r' )
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

                    // C:\\antlr\\TinyHaxeTry1.g:889:28: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:889:28: '\\r'
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
                    // C:\\antlr\\TinyHaxeTry1.g:890:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\antlr\\TinyHaxeTry1.g:890:14: ( options {greedy=false; } : . )*
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:890:42: .
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
            // C:\\antlr\\TinyHaxeTry1.g:895:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // C:\\antlr\\TinyHaxeTry1.g:895:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // C:\\antlr\\TinyHaxeTry1.g:896:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // C:\\antlr\\TinyHaxeTry1.g:896:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:897:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
            // C:\\antlr\\TinyHaxeTry1.g:903:7: ( '#if' )
            // C:\\antlr\\TinyHaxeTry1.g:903:9: '#if'
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
            // C:\\antlr\\TinyHaxeTry1.g:906:2: ( '#elseif' )
            // C:\\antlr\\TinyHaxeTry1.g:906:4: '#elseif'
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
            // C:\\antlr\\TinyHaxeTry1.g:908:9: ( '#else' )
            // C:\\antlr\\TinyHaxeTry1.g:908:11: '#else'
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
            // C:\\antlr\\TinyHaxeTry1.g:910:8: ( '#end' )
            // C:\\antlr\\TinyHaxeTry1.g:910:10: '#end'
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
            // C:\\antlr\\TinyHaxeTry1.g:912:9: ( '#error' )
            // C:\\antlr\\TinyHaxeTry1.g:912:11: '#error'
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

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\antlr\\TinyHaxeTry1.g:916:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:916:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:916:22: ( '+' | '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='+'||LA24_0=='-') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:
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

            // C:\\antlr\\TinyHaxeTry1.g:916:33: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:916:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // C:\\antlr\\TinyHaxeTry1.g:919:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\antlr\\TinyHaxeTry1.g:919:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\antlr\\TinyHaxeTry1.g:923:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
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
                    alt26=1;
                    }
                    break;
                case 'u':
                    {
                    alt26=2;
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
                    alt26=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:923:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\antlr\\TinyHaxeTry1.g:924:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:925:9: OCTAL_ESC
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
            // C:\\antlr\\TinyHaxeTry1.g:930:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>='0' && LA27_1<='3')) ) {
                    int LA27_2 = input.LA(3);

                    if ( ((LA27_2>='0' && LA27_2<='7')) ) {
                        int LA27_4 = input.LA(4);

                        if ( ((LA27_4>='0' && LA27_4<='7')) ) {
                            alt27=1;
                        }
                        else {
                            alt27=2;}
                    }
                    else {
                        alt27=3;}
                }
                else if ( ((LA27_1>='4' && LA27_1<='7')) ) {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3>='0' && LA27_3<='7')) ) {
                        alt27=2;
                    }
                    else {
                        alt27=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:930:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:930:14: ( '0' .. '3' )
                    // C:\\antlr\\TinyHaxeTry1.g:930:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:930:25: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:930:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:930:36: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:930:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:931:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:931:14: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:931:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:931:25: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:931:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:932:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:932:14: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:932:15: '0' .. '7'
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
            // C:\\antlr\\TinyHaxeTry1.g:937:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\antlr\\TinyHaxeTry1.g:937:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\antlr\\TinyHaxeTry1.g:1:8: ( T__158 | T__159 | T__160 | WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR )
        int alt28=131;
        alt28 = dfa28.predict(input);
        switch (alt28) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:1:10: T__158
                {
                mT__158(); 

                }
                break;
            case 2 :
                // C:\\antlr\\TinyHaxeTry1.g:1:17: T__159
                {
                mT__159(); 

                }
                break;
            case 3 :
                // C:\\antlr\\TinyHaxeTry1.g:1:24: T__160
                {
                mT__160(); 

                }
                break;
            case 4 :
                // C:\\antlr\\TinyHaxeTry1.g:1:31: WS
                {
                mWS(); 

                }
                break;
            case 5 :
                // C:\\antlr\\TinyHaxeTry1.g:1:34: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 6 :
                // C:\\antlr\\TinyHaxeTry1.g:1:46: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 7 :
                // C:\\antlr\\TinyHaxeTry1.g:1:57: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 8 :
                // C:\\antlr\\TinyHaxeTry1.g:1:69: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 9 :
                // C:\\antlr\\TinyHaxeTry1.g:1:78: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 10 :
                // C:\\antlr\\TinyHaxeTry1.g:1:86: BREAK
                {
                mBREAK(); 

                }
                break;
            case 11 :
                // C:\\antlr\\TinyHaxeTry1.g:1:92: BYTE
                {
                mBYTE(); 

                }
                break;
            case 12 :
                // C:\\antlr\\TinyHaxeTry1.g:1:97: CASE
                {
                mCASE(); 

                }
                break;
            case 13 :
                // C:\\antlr\\TinyHaxeTry1.g:1:102: CATCH
                {
                mCATCH(); 

                }
                break;
            case 14 :
                // C:\\antlr\\TinyHaxeTry1.g:1:108: CHAR
                {
                mCHAR(); 

                }
                break;
            case 15 :
                // C:\\antlr\\TinyHaxeTry1.g:1:113: CLASS
                {
                mCLASS(); 

                }
                break;
            case 16 :
                // C:\\antlr\\TinyHaxeTry1.g:1:119: CONST
                {
                mCONST(); 

                }
                break;
            case 17 :
                // C:\\antlr\\TinyHaxeTry1.g:1:125: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 18 :
                // C:\\antlr\\TinyHaxeTry1.g:1:134: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 19 :
                // C:\\antlr\\TinyHaxeTry1.g:1:142: DO
                {
                mDO(); 

                }
                break;
            case 20 :
                // C:\\antlr\\TinyHaxeTry1.g:1:145: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 21 :
                // C:\\antlr\\TinyHaxeTry1.g:1:152: ELSE
                {
                mELSE(); 

                }
                break;
            case 22 :
                // C:\\antlr\\TinyHaxeTry1.g:1:157: ENUM
                {
                mENUM(); 

                }
                break;
            case 23 :
                // C:\\antlr\\TinyHaxeTry1.g:1:162: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 24 :
                // C:\\antlr\\TinyHaxeTry1.g:1:170: FINAL
                {
                mFINAL(); 

                }
                break;
            case 25 :
                // C:\\antlr\\TinyHaxeTry1.g:1:176: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 26 :
                // C:\\antlr\\TinyHaxeTry1.g:1:184: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 27 :
                // C:\\antlr\\TinyHaxeTry1.g:1:190: FOR
                {
                mFOR(); 

                }
                break;
            case 28 :
                // C:\\antlr\\TinyHaxeTry1.g:1:194: GOTO
                {
                mGOTO(); 

                }
                break;
            case 29 :
                // C:\\antlr\\TinyHaxeTry1.g:1:199: IF
                {
                mIF(); 

                }
                break;
            case 30 :
                // C:\\antlr\\TinyHaxeTry1.g:1:202: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 31 :
                // C:\\antlr\\TinyHaxeTry1.g:1:213: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 32 :
                // C:\\antlr\\TinyHaxeTry1.g:1:220: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 33 :
                // C:\\antlr\\TinyHaxeTry1.g:1:231: INT
                {
                mINT(); 

                }
                break;
            case 34 :
                // C:\\antlr\\TinyHaxeTry1.g:1:235: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 35 :
                // C:\\antlr\\TinyHaxeTry1.g:1:245: LONG
                {
                mLONG(); 

                }
                break;
            case 36 :
                // C:\\antlr\\TinyHaxeTry1.g:1:250: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 37 :
                // C:\\antlr\\TinyHaxeTry1.g:1:257: NEW
                {
                mNEW(); 

                }
                break;
            case 38 :
                // C:\\antlr\\TinyHaxeTry1.g:1:261: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 39 :
                // C:\\antlr\\TinyHaxeTry1.g:1:269: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 40 :
                // C:\\antlr\\TinyHaxeTry1.g:1:277: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 41 :
                // C:\\antlr\\TinyHaxeTry1.g:1:287: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 42 :
                // C:\\antlr\\TinyHaxeTry1.g:1:294: RETURN
                {
                mRETURN(); 

                }
                break;
            case 43 :
                // C:\\antlr\\TinyHaxeTry1.g:1:301: SHORT
                {
                mSHORT(); 

                }
                break;
            case 44 :
                // C:\\antlr\\TinyHaxeTry1.g:1:307: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 45 :
                // C:\\antlr\\TinyHaxeTry1.g:1:314: INLINE
                {
                mINLINE(); 

                }
                break;
            case 46 :
                // C:\\antlr\\TinyHaxeTry1.g:1:321: DYNAMIC
                {
                mDYNAMIC(); 

                }
                break;
            case 47 :
                // C:\\antlr\\TinyHaxeTry1.g:1:329: OVERRIDE
                {
                mOVERRIDE(); 

                }
                break;
            case 48 :
                // C:\\antlr\\TinyHaxeTry1.g:1:338: STRICTFP
                {
                mSTRICTFP(); 

                }
                break;
            case 49 :
                // C:\\antlr\\TinyHaxeTry1.g:1:347: SUPER
                {
                mSUPER(); 

                }
                break;
            case 50 :
                // C:\\antlr\\TinyHaxeTry1.g:1:353: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 51 :
                // C:\\antlr\\TinyHaxeTry1.g:1:360: THIS
                {
                mTHIS(); 

                }
                break;
            case 52 :
                // C:\\antlr\\TinyHaxeTry1.g:1:365: THROW
                {
                mTHROW(); 

                }
                break;
            case 53 :
                // C:\\antlr\\TinyHaxeTry1.g:1:371: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 54 :
                // C:\\antlr\\TinyHaxeTry1.g:1:378: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 55 :
                // C:\\antlr\\TinyHaxeTry1.g:1:388: TRY
                {
                mTRY(); 

                }
                break;
            case 56 :
                // C:\\antlr\\TinyHaxeTry1.g:1:392: VOID
                {
                mVOID(); 

                }
                break;
            case 57 :
                // C:\\antlr\\TinyHaxeTry1.g:1:397: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 58 :
                // C:\\antlr\\TinyHaxeTry1.g:1:406: WHILE
                {
                mWHILE(); 

                }
                break;
            case 59 :
                // C:\\antlr\\TinyHaxeTry1.g:1:412: TRUE
                {
                mTRUE(); 

                }
                break;
            case 60 :
                // C:\\antlr\\TinyHaxeTry1.g:1:417: FALSE
                {
                mFALSE(); 

                }
                break;
            case 61 :
                // C:\\antlr\\TinyHaxeTry1.g:1:423: NULL
                {
                mNULL(); 

                }
                break;
            case 62 :
                // C:\\antlr\\TinyHaxeTry1.g:1:428: CAST
                {
                mCAST(); 

                }
                break;
            case 63 :
                // C:\\antlr\\TinyHaxeTry1.g:1:433: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 64 :
                // C:\\antlr\\TinyHaxeTry1.g:1:442: IN
                {
                mIN(); 

                }
                break;
            case 65 :
                // C:\\antlr\\TinyHaxeTry1.g:1:445: VAR
                {
                mVAR(); 

                }
                break;
            case 66 :
                // C:\\antlr\\TinyHaxeTry1.g:1:449: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 67 :
                // C:\\antlr\\TinyHaxeTry1.g:1:457: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 68 :
                // C:\\antlr\\TinyHaxeTry1.g:1:464: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 69 :
                // C:\\antlr\\TinyHaxeTry1.g:1:471: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 70 :
                // C:\\antlr\\TinyHaxeTry1.g:1:478: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 71 :
                // C:\\antlr\\TinyHaxeTry1.g:1:485: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 72 :
                // C:\\antlr\\TinyHaxeTry1.g:1:494: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 73 :
                // C:\\antlr\\TinyHaxeTry1.g:1:503: SEMI
                {
                mSEMI(); 

                }
                break;
            case 74 :
                // C:\\antlr\\TinyHaxeTry1.g:1:508: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 75 :
                // C:\\antlr\\TinyHaxeTry1.g:1:514: DOT
                {
                mDOT(); 

                }
                break;
            case 76 :
                // C:\\antlr\\TinyHaxeTry1.g:1:518: ELLIPSIS
                {
                mELLIPSIS(); 

                }
                break;
            case 77 :
                // C:\\antlr\\TinyHaxeTry1.g:1:527: EQ
                {
                mEQ(); 

                }
                break;
            case 78 :
                // C:\\antlr\\TinyHaxeTry1.g:1:530: BANG
                {
                mBANG(); 

                }
                break;
            case 79 :
                // C:\\antlr\\TinyHaxeTry1.g:1:535: TILDE
                {
                mTILDE(); 

                }
                break;
            case 80 :
                // C:\\antlr\\TinyHaxeTry1.g:1:541: QUES
                {
                mQUES(); 

                }
                break;
            case 81 :
                // C:\\antlr\\TinyHaxeTry1.g:1:546: COLON
                {
                mCOLON(); 

                }
                break;
            case 82 :
                // C:\\antlr\\TinyHaxeTry1.g:1:552: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 83 :
                // C:\\antlr\\TinyHaxeTry1.g:1:557: AMPAMP
                {
                mAMPAMP(); 

                }
                break;
            case 84 :
                // C:\\antlr\\TinyHaxeTry1.g:1:564: BARBAR
                {
                mBARBAR(); 

                }
                break;
            case 85 :
                // C:\\antlr\\TinyHaxeTry1.g:1:571: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 86 :
                // C:\\antlr\\TinyHaxeTry1.g:1:580: SUBSUB
                {
                mSUBSUB(); 

                }
                break;
            case 87 :
                // C:\\antlr\\TinyHaxeTry1.g:1:587: PLUS
                {
                mPLUS(); 

                }
                break;
            case 88 :
                // C:\\antlr\\TinyHaxeTry1.g:1:592: SUB
                {
                mSUB(); 

                }
                break;
            case 89 :
                // C:\\antlr\\TinyHaxeTry1.g:1:596: STAR
                {
                mSTAR(); 

                }
                break;
            case 90 :
                // C:\\antlr\\TinyHaxeTry1.g:1:601: SLASH
                {
                mSLASH(); 

                }
                break;
            case 91 :
                // C:\\antlr\\TinyHaxeTry1.g:1:607: AMP
                {
                mAMP(); 

                }
                break;
            case 92 :
                // C:\\antlr\\TinyHaxeTry1.g:1:611: BAR
                {
                mBAR(); 

                }
                break;
            case 93 :
                // C:\\antlr\\TinyHaxeTry1.g:1:615: CARET
                {
                mCARET(); 

                }
                break;
            case 94 :
                // C:\\antlr\\TinyHaxeTry1.g:1:621: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 95 :
                // C:\\antlr\\TinyHaxeTry1.g:1:629: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 96 :
                // C:\\antlr\\TinyHaxeTry1.g:1:636: SUBEQ
                {
                mSUBEQ(); 

                }
                break;
            case 97 :
                // C:\\antlr\\TinyHaxeTry1.g:1:642: STAREQ
                {
                mSTAREQ(); 

                }
                break;
            case 98 :
                // C:\\antlr\\TinyHaxeTry1.g:1:649: SLASHEQ
                {
                mSLASHEQ(); 

                }
                break;
            case 99 :
                // C:\\antlr\\TinyHaxeTry1.g:1:657: AMPEQ
                {
                mAMPEQ(); 

                }
                break;
            case 100 :
                // C:\\antlr\\TinyHaxeTry1.g:1:663: BAREQ
                {
                mBAREQ(); 

                }
                break;
            case 101 :
                // C:\\antlr\\TinyHaxeTry1.g:1:669: CARETEQ
                {
                mCARETEQ(); 

                }
                break;
            case 102 :
                // C:\\antlr\\TinyHaxeTry1.g:1:677: PERCENTEQ
                {
                mPERCENTEQ(); 

                }
                break;
            case 103 :
                // C:\\antlr\\TinyHaxeTry1.g:1:687: PERCENTDLQ
                {
                mPERCENTDLQ(); 

                }
                break;
            case 104 :
                // C:\\antlr\\TinyHaxeTry1.g:1:698: PERCENTDBQ
                {
                mPERCENTDBQ(); 

                }
                break;
            case 105 :
                // C:\\antlr\\TinyHaxeTry1.g:1:709: PERCENTDBBQ
                {
                mPERCENTDBBQ(); 

                }
                break;
            case 106 :
                // C:\\antlr\\TinyHaxeTry1.g:1:721: EQEQEQ
                {
                mEQEQEQ(); 

                }
                break;
            case 107 :
                // C:\\antlr\\TinyHaxeTry1.g:1:728: PERCENTLESQ
                {
                mPERCENTLESQ(); 

                }
                break;
            case 108 :
                // C:\\antlr\\TinyHaxeTry1.g:1:740: BANGEQQ
                {
                mBANGEQQ(); 

                }
                break;
            case 109 :
                // C:\\antlr\\TinyHaxeTry1.g:1:748: MONKEYS_AT
                {
                mMONKEYS_AT(); 

                }
                break;
            case 110 :
                // C:\\antlr\\TinyHaxeTry1.g:1:759: BANGEQ
                {
                mBANGEQ(); 

                }
                break;
            case 111 :
                // C:\\antlr\\TinyHaxeTry1.g:1:766: MINUS_BIGGER
                {
                mMINUS_BIGGER(); 

                }
                break;
            case 112 :
                // C:\\antlr\\TinyHaxeTry1.g:1:779: PERCENTLL
                {
                mPERCENTLL(); 

                }
                break;
            case 113 :
                // C:\\antlr\\TinyHaxeTry1.g:1:789: PERCENTBB
                {
                mPERCENTBB(); 

                }
                break;
            case 114 :
                // C:\\antlr\\TinyHaxeTry1.g:1:799: PERCENTBBB
                {
                mPERCENTBBB(); 

                }
                break;
            case 115 :
                // C:\\antlr\\TinyHaxeTry1.g:1:810: GT
                {
                mGT(); 

                }
                break;
            case 116 :
                // C:\\antlr\\TinyHaxeTry1.g:1:813: GTGT
                {
                mGTGT(); 

                }
                break;
            case 117 :
                // C:\\antlr\\TinyHaxeTry1.g:1:818: LTLT
                {
                mLTLT(); 

                }
                break;
            case 118 :
                // C:\\antlr\\TinyHaxeTry1.g:1:823: GTGTGT
                {
                mGTGTGT(); 

                }
                break;
            case 119 :
                // C:\\antlr\\TinyHaxeTry1.g:1:830: GTEQ
                {
                mGTEQ(); 

                }
                break;
            case 120 :
                // C:\\antlr\\TinyHaxeTry1.g:1:835: LTEQ
                {
                mLTEQ(); 

                }
                break;
            case 121 :
                // C:\\antlr\\TinyHaxeTry1.g:1:840: LT
                {
                mLT(); 

                }
                break;
            case 122 :
                // C:\\antlr\\TinyHaxeTry1.g:1:843: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 123 :
                // C:\\antlr\\TinyHaxeTry1.g:1:854: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 124 :
                // C:\\antlr\\TinyHaxeTry1.g:1:861: FLOATNUM
                {
                mFLOATNUM(); 

                }
                break;
            case 125 :
                // C:\\antlr\\TinyHaxeTry1.g:1:870: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 126 :
                // C:\\antlr\\TinyHaxeTry1.g:1:878: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 127 :
                // C:\\antlr\\TinyHaxeTry1.g:1:892: PP_IF
                {
                mPP_IF(); 

                }
                break;
            case 128 :
                // C:\\antlr\\TinyHaxeTry1.g:1:898: PP_ELSEIF
                {
                mPP_ELSEIF(); 

                }
                break;
            case 129 :
                // C:\\antlr\\TinyHaxeTry1.g:1:908: PP_ELSE
                {
                mPP_ELSE(); 

                }
                break;
            case 130 :
                // C:\\antlr\\TinyHaxeTry1.g:1:916: PP_END
                {
                mPP_END(); 

                }
                break;
            case 131 :
                // C:\\antlr\\TinyHaxeTry1.g:1:923: PP_ERROR
                {
                mPP_ERROR(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA28 dfa28 = new DFA28(this);
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
            return "424:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
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
            return "882:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA28_eotS =
        "\1\uffff\1\64\1\67\1\uffff\2\72\1\uffff\21\57\10\uffff\1\153\1"+
        "\155\1\157\3\uffff\1\162\1\165\1\170\1\174\1\176\1\u0081\1\u0083"+
        "\1\u0086\4\uffff\1\u008a\2\uffff\1\u008d\5\uffff\1\72\1\u008f\2"+
        "\uffff\1\72\11\57\1\u009b\12\57\1\u00a6\1\57\1\u00ab\23\57\2\uffff"+
        "\1\u00c6\1\uffff\1\u00c8\35\uffff\1\u00cf\1\uffff\1\72\1\uffff\13"+
        "\57\1\uffff\6\57\1\u00e3\3\57\1\uffff\2\57\1\u00eb\1\57\1\uffff"+
        "\2\57\1\u00ef\17\57\1\u00ff\4\57\1\u0104\1\57\13\uffff\3\57\1\u010d"+
        "\1\u010e\1\u010f\1\57\1\u0111\6\57\1\u0118\1\u0119\3\57\1\uffff"+
        "\2\57\1\u011f\4\57\1\uffff\1\57\1\u0125\1\57\1\uffff\1\u0127\13"+
        "\57\1\u0133\2\57\1\uffff\1\u0136\1\57\1\u0138\1\57\1\uffff\1\57"+
        "\4\uffff\2\57\1\u0141\3\uffff\1\u0142\1\uffff\1\u0143\1\u0144\4"+
        "\57\2\uffff\1\57\1\u014b\1\u014c\1\u014d\1\57\1\uffff\5\57\1\uffff"+
        "\1\57\1\uffff\5\57\1\u015a\2\57\1\u015d\2\57\1\uffff\1\u0161\1\57"+
        "\1\uffff\1\57\1\uffff\1\57\1\u0165\3\uffff\1\u016a\2\57\4\uffff"+
        "\2\57\1\u016f\3\57\3\uffff\2\57\1\u0175\2\57\1\u0178\1\u0179\3\57"+
        "\1\u017d\1\u017e\1\uffff\1\u017f\1\57\1\uffff\1\u0181\1\57\1\u0183"+
        "\1\uffff\3\57\1\uffff\1\u0188\1\u018a\3\uffff\1\57\1\u018d\1\57"+
        "\1\u018f\1\uffff\1\u0190\1\u0191\1\u0192\2\57\1\uffff\2\57\2\uffff"+
        "\1\u0197\1\u0198\1\57\3\uffff\1\57\1\uffff\1\57\1\uffff\1\57\1\u019d"+
        "\1\57\4\uffff\1\u01a0\1\u01a1\1\uffff\1\u01a2\4\uffff\1\u01a3\3"+
        "\57\2\uffff\1\57\1\u01a8\1\u01a9\1\57\1\uffff\1\u01ab\5\uffff\2"+
        "\57\1\u01ae\1\u01af\2\uffff\1\u01b0\1\uffff\1\u01b1\1\u01b2\5\uffff";
    static final String DFA28_eofS =
        "\u01b3\uffff";
    static final String DFA28_minS =
        "\1\11\1\74\1\75\1\uffff\2\56\1\uffff\1\142\1\157\1\141\1\145\1"+
        "\154\1\141\1\157\1\146\1\157\2\141\1\145\1\150\1\166\1\150\1\141"+
        "\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\55\1\75\1\52"+
        "\1\75\1\45\3\uffff\1\145\1\75\2\uffff\1\75\2\uffff\2\60\1\uffff"+
        "\2\56\2\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2\141\1\156\1\146"+
        "\1\60\1\156\1\163\1\165\1\164\1\156\1\157\1\162\1\154\1\156\1\164"+
        "\1\60\1\160\1\60\1\156\1\164\1\167\1\154\1\143\1\151\1\142\1\164"+
        "\1\157\1\141\1\160\1\151\1\145\1\151\1\141\1\160\1\151\1\162\1\151"+
        "\2\uffff\1\75\1\uffff\1\75\26\uffff\1\74\2\uffff\1\154\3\uffff\1"+
        "\75\1\uffff\1\60\1\uffff\1\164\1\154\1\141\2\145\1\143\1\162\2\163"+
        "\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\2\141\1\60\1\163\1"+
        "\143\1\157\1\uffff\1\154\1\164\1\60\1\151\1\uffff\1\147\1\151\1"+
        "\60\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145"+
        "\1\164\1\162\1\163\1\157\1\156\1\60\2\145\1\144\1\141\1\60\1\154"+
        "\4\uffff\1\74\1\76\1\163\4\uffff\1\162\1\145\1\153\3\60\1\150\1"+
        "\60\1\163\1\164\1\151\1\165\1\154\1\155\2\60\1\156\1\154\1\164\1"+
        "\uffff\1\145\1\164\1\60\1\145\1\162\1\141\1\162\1\uffff\1\156\1"+
        "\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1\164\1\151\1\143"+
        "\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff\1\60\1\144\1\60\1\164"+
        "\1\uffff\1\145\1\45\1\uffff\1\45\1\145\2\141\1\60\3\uffff\1\60\1"+
        "\uffff\2\60\1\156\1\154\1\145\1\151\2\uffff\1\144\3\60\1\151\1\uffff"+
        "\1\155\1\164\1\156\1\146\1\145\1\uffff\1\145\1\uffff\1\147\1\164"+
        "\2\143\1\156\1\60\1\143\1\164\1\60\1\150\1\151\1\uffff\1\60\1\151"+
        "\1\uffff\1\145\1\uffff\1\151\1\60\3\45\1\151\1\143\1\156\4\uffff"+
        "\1\165\1\164\1\60\1\143\1\163\1\171\3\uffff\1\157\1\145\1\60\1\143"+
        "\1\141\2\60\2\145\1\164\2\60\1\uffff\1\60\1\146\1\uffff\1\60\1\144"+
        "\1\60\1\uffff\1\145\1\146\1\154\1\uffff\2\75\1\45\2\uffff\1\164"+
        "\1\60\1\145\1\60\1\uffff\3\60\2\156\1\uffff\1\145\1\143\2\uffff"+
        "\2\60\1\145\3\uffff\1\160\1\uffff\1\145\1\uffff\1\156\1\60\1\145"+
        "\4\uffff\1\75\1\60\1\uffff\1\60\4\uffff\1\60\1\164\1\157\1\145\2"+
        "\uffff\1\144\2\60\1\164\1\uffff\1\60\5\uffff\1\163\1\146\2\60\2"+
        "\uffff\1\60\1\uffff\2\60\5\uffff";
    static final String DFA28_maxS =
        "\1\176\1\75\1\76\1\uffff\1\170\1\154\1\uffff\1\142\1\171\1\157"+
        "\1\171\1\170\1\165\1\157\1\156\1\157\2\165\1\145\1\167\1\166\1\171"+
        "\1\157\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1\76\4\75"+
        "\3\uffff\1\151\1\75\2\uffff\1\76\2\uffff\2\146\1\uffff\1\154\1\145"+
        "\2\uffff\1\154\1\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1"+
        "\156\1\163\1\165\1\164\1\156\1\157\1\162\1\154\1\156\1\164\1\172"+
        "\1\160\1\172\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157"+
        "\1\162\1\160\1\151\1\145\1\162\1\171\1\160\1\154\1\162\1\151\2\uffff"+
        "\1\75\1\uffff\1\75\26\uffff\1\76\2\uffff\1\162\3\uffff\1\75\1\uffff"+
        "\1\154\1\uffff\1\164\1\154\1\141\1\145\1\164\1\143\1\162\1\163\1"+
        "\164\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\2\141\1\172\1\163"+
        "\1\143\1\157\1\uffff\1\157\1\164\1\172\1\151\1\uffff\1\147\1\151"+
        "\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145"+
        "\1\164\1\162\1\163\1\157\1\156\1\172\2\145\1\144\1\141\1\172\1\154"+
        "\4\uffff\1\75\1\76\1\163\4\uffff\1\162\1\145\1\153\3\172\1\150\1"+
        "\172\1\163\1\164\1\151\1\165\1\154\1\155\2\172\1\156\1\154\1\164"+
        "\1\uffff\1\145\1\164\1\172\1\145\1\162\1\141\1\162\1\uffff\1\156"+
        "\1\172\1\166\1\uffff\1\172\2\141\1\145\1\151\1\162\1\164\1\151\1"+
        "\143\1\162\1\143\1\162\1\172\1\167\1\163\1\uffff\1\172\1\144\1\172"+
        "\1\164\1\uffff\1\145\1\45\1\uffff\1\76\1\145\2\141\1\172\3\uffff"+
        "\1\172\1\uffff\2\172\1\156\1\154\1\145\1\151\2\uffff\1\144\3\172"+
        "\1\151\1\uffff\1\155\1\164\1\156\1\146\1\145\1\uffff\1\145\1\uffff"+
        "\1\147\1\164\2\143\1\156\1\172\1\143\1\164\1\172\1\150\1\151\1\uffff"+
        "\1\172\1\151\1\uffff\1\145\1\uffff\1\151\1\172\3\45\1\151\1\143"+
        "\1\156\4\uffff\1\165\1\164\1\172\1\143\1\163\1\171\3\uffff\1\157"+
        "\1\145\1\172\1\143\1\141\2\172\2\145\1\164\2\172\1\uffff\1\172\1"+
        "\146\1\uffff\1\172\1\144\1\172\1\uffff\1\145\1\146\1\154\1\uffff"+
        "\2\75\1\45\2\uffff\1\164\1\172\1\145\1\172\1\uffff\3\172\2\156\1"+
        "\uffff\1\145\1\143\2\uffff\2\172\1\145\3\uffff\1\160\1\uffff\1\145"+
        "\1\uffff\1\156\1\172\1\145\4\uffff\1\75\1\172\1\uffff\1\172\4\uffff"+
        "\1\172\1\164\1\157\1\145\2\uffff\1\144\2\172\1\164\1\uffff\1\172"+
        "\5\uffff\1\163\1\146\2\172\2\uffff\1\172\1\uffff\2\172\5\uffff";
    static final String DFA28_acceptS =
        "\3\uffff\1\4\2\uffff\1\7\21\uffff\1\103\1\104\1\105\1\106\1\107"+
        "\1\110\1\111\1\112\3\uffff\1\117\1\120\1\121\10\uffff\1\155\1\172"+
        "\1\176\2\uffff\1\170\1\171\1\uffff\1\167\1\163\2\uffff\1\6\2\uffff"+
        "\1\5\1\174\53\uffff\1\114\1\113\1\uffff\1\115\1\uffff\1\116\1\123"+
        "\1\143\1\133\1\124\1\144\1\134\1\125\1\137\1\127\1\126\1\140\1\157"+
        "\1\130\1\141\1\131\1\142\1\175\1\132\1\145\1\135\1\146\1\uffff\1"+
        "\136\1\177\1\uffff\1\1\1\165\1\2\1\uffff\1\164\1\uffff\1\173\13"+
        "\uffff\1\23\12\uffff\1\35\4\uffff\1\100\31\uffff\1\152\1\122\1\154"+
        "\1\156\3\uffff\1\u0082\1\u0083\1\3\1\166\23\uffff\1\33\7\uffff\1"+
        "\41\3\uffff\1\45\17\uffff\1\67\4\uffff\1\101\2\uffff\1\153\5\uffff"+
        "\1\13\1\14\1\76\1\uffff\1\16\6\uffff\1\25\1\26\5\uffff\1\34\5\uffff"+
        "\1\43\1\uffff\1\75\13\uffff\1\63\2\uffff\1\73\1\uffff\1\70\10\uffff"+
        "\1\12\1\15\1\17\1\20\6\uffff\1\30\1\32\1\74\14\uffff\1\53\2\uffff"+
        "\1\61\3\uffff\1\64\3\uffff\1\72\3\uffff\1\u0080\1\u0081\4\uffff"+
        "\1\24\5\uffff\1\37\2\uffff\1\55\1\44\3\uffff\1\51\1\52\1\54\1\uffff"+
        "\1\62\1\uffff\1\65\3\uffff\1\147\1\160\1\150\1\161\2\uffff\1\11"+
        "\1\uffff\1\22\1\56\1\27\1\31\4\uffff\1\46\1\47\4\uffff\1\102\1\uffff"+
        "\1\151\1\162\1\10\1\21\1\77\4\uffff\1\60\1\57\1\uffff\1\71\2\uffff"+
        "\1\42\1\50\1\66\1\36\1\40";
    static final String DFA28_specialS =
        "\u01b3\uffff}>";
    static final String[] DFA28_transitionS = {
            "\2\3\2\uffff\1\3\22\uffff\1\3\1\42\1\60\1\61\1\uffff\1\55\1"+
            "\46\1\6\1\30\1\31\1\52\1\50\1\37\1\51\1\40\1\53\1\4\11\5\1\45"+
            "\1\36\1\1\1\41\1\2\1\44\1\56\32\57\1\34\1\uffff\1\35\1\54\1"+
            "\57\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\57\1\16\2\57"+
            "\1\17\1\57\1\20\1\24\1\21\1\57\1\22\1\23\1\25\1\57\1\26\1\27"+
            "\3\57\1\32\1\47\1\33\1\43",
            "\1\62\1\63",
            "\1\66\1\65",
            "",
            "\1\76\1\uffff\10\73\2\74\13\uffff\1\76\6\uffff\1\75\13\uffff"+
            "\1\71\14\uffff\1\76\6\uffff\1\75\13\uffff\1\70",
            "\1\76\1\uffff\12\77\13\uffff\1\76\6\uffff\1\75\30\uffff\1"+
            "\76\6\uffff\1\75",
            "",
            "\1\100",
            "\1\101\2\uffff\1\102\6\uffff\1\103",
            "\1\104\6\uffff\1\105\3\uffff\1\106\2\uffff\1\107",
            "\1\110\11\uffff\1\111\11\uffff\1\112",
            "\1\113\1\uffff\1\114\11\uffff\1\115",
            "\1\121\7\uffff\1\116\2\uffff\1\117\2\uffff\1\120\5\uffff\1"+
            "\122",
            "\1\123",
            "\1\124\6\uffff\1\125\1\126",
            "\1\127",
            "\1\130\3\uffff\1\131\17\uffff\1\132",
            "\1\133\20\uffff\1\134\2\uffff\1\135",
            "\1\136",
            "\1\137\13\uffff\1\140\1\141\1\uffff\1\142",
            "\1\143",
            "\1\144\11\uffff\1\145\6\uffff\1\146",
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
            "\1\152\1\uffff\12\76",
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
            "",
            "",
            "\1\u0088\3\uffff\1\u0087",
            "\1\u0089",
            "",
            "",
            "\1\u008b\1\u008c",
            "",
            "",
            "\12\u008e\7\uffff\6\u008e\32\uffff\6\u008e",
            "\12\u008e\7\uffff\6\u008e\32\uffff\6\u008e",
            "",
            "\1\76\1\uffff\10\73\2\74\13\uffff\1\76\6\uffff\1\75\30\uffff"+
            "\1\76\6\uffff\1\75",
            "\1\76\1\uffff\12\74\13\uffff\1\76\37\uffff\1\76",
            "",
            "",
            "\1\76\1\uffff\12\77\13\uffff\1\76\6\uffff\1\75\30\uffff\1"+
            "\76\6\uffff\1\75",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u009a\5"+
            "\57",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00a7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00aa\6"+
            "\57\1\u00a8\1\u00a9\6\57",
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
            "\1\u00c1\2\uffff\1\u00c2",
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
            "",
            "\1\u00cb\1\uffff\1\u00cc\3\uffff\1\u00cd",
            "",
            "",
            "",
            "\1\u00ce",
            "",
            "\12\u008e\7\uffff\6\u008e\5\uffff\1\75\24\uffff\6\u008e\5"+
            "\uffff\1\75",
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
            "\1\u00e2",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\1\u00e7\2\uffff\1\u00e8",
            "\1\u00e9",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00ea\25"+
            "\57",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0110",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0126",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0134",
            "\1\u0135",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0137",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\u013b",
            "",
            "\1\u013c\30\uffff\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "",
            "\1\u0149",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u014a\16"+
            "\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015b",
            "\1\u015c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015e",
            "\1\u015f",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0160\7"+
            "\57",
            "\1\u0162",
            "",
            "\1\u0163",
            "",
            "\1\u0164",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016b",
            "\1\u016c",
            "",
            "",
            "",
            "",
            "\1\u016d",
            "\1\u016e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0176",
            "\1\u0177",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0180",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0182",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0189",
            "\1\u018b",
            "",
            "",
            "\1\u018c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u018e",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0193",
            "\1\u0194",
            "",
            "\1\u0195",
            "\1\u0196",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0199",
            "",
            "",
            "",
            "\1\u019a",
            "",
            "\1\u019b",
            "",
            "\1\u019c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u019e",
            "",
            "",
            "",
            "",
            "\1\u019f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "",
            "",
            "\1\u01a7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u01aa",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\u01ac",
            "\1\u01ad",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__158 | T__159 | T__160 | WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR );";
        }
    }
 

}