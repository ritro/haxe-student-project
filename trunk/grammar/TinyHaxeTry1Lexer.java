// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\antlr\\TinyHaxeTry1.g 2010-03-06 03:03:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TinyHaxeTry1Lexer extends Lexer {
    public static final int PACKAGE=47;
    public static final int LT=116;
    public static final int EXPONENT=118;
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
    public static final int NonIntegerNumber=14;
    public static final int STAREQ=98;
    public static final int CARET=94;
    public static final int THIS=57;
    public static final int RETURN=51;
    public static final int DOUBLE=29;
    public static final int MONKEYS_AT=110;
    public static final int BARBAR=85;
    public static final int VOID=62;
    public static final int SUPER=55;
    public static final int GOTO=37;
    public static final int EQ=78;
    public static final int AMPAMP=84;
    public static final int COMMENT=120;
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
    public static final int FOR=36;
    public static final int Exponent=13;
    public static final int SUB=89;
    public static final int FLOAT=35;
    public static final int ABSTRACT=17;
    public static final int PERCENTDBQ=105;
    public static final int HexDigit=12;
    public static final int PLUSEQ=96;
    public static final int LPAREN=68;
    public static final int IF=38;
    public static final int INTNUM=117;
    public static final int BOOLEAN=18;
    public static final int SLASH=91;
    public static final int ESC_SEQ=121;
    public static final int IMPLEMENTS=39;
    public static final int CONTINUE=26;
    public static final int COMMA=75;
    public static final int AMPEQ=100;
    public static final int TRANSIENT=60;
    public static final int IDENTIFIER=4;
    public static final int TILDE=80;
    public static final int BANGEQ=111;
    public static final int PLUS=88;
    public static final int RBRACKET=73;
    public static final int DOT=76;
    public static final int BYTE=20;
    public static final int PERCENT=95;
    public static final int VOLATILE=63;
    public static final int UNICODE_ESC=124;
    public static final int DEFAULT=27;
    public static final int EQEQEQ=107;
    public static final int HEX_DIGIT=123;
    public static final int SHORT=52;
    public static final int BANG=79;
    public static final int INSTANCEOF=41;
    public static final int TRUE=65;
    public static final int SEMI=74;
    public static final int COLON=82;
    public static final int PERCENTLESQ=108;
    public static final int ENUM=31;
    public static final int FINALLY=34;
    public static final int PERCENTEQ=103;
    public static final int STRINGLITERAL=5;
    public static final int CARETEQ=102;
    public static final int PERCENTBBB=114;
    public static final int INTERFACE=43;
    public static final int LONG=44;
    public static final int PUBLIC=50;
    public static final int EXTENDS=32;
    public static final int BAR=93;
    public static final int STRING=122;

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

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:3:8: ( 'inline' )
            // C:\\antlr\\TinyHaxeTry1.g:3:10: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:4:8: ( 'dynamic' )
            // C:\\antlr\\TinyHaxeTry1.g:4:10: 'dynamic'
            {
            match("dynamic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:5:8: ( 'override' )
            // C:\\antlr\\TinyHaxeTry1.g:5:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:6:8: ( '<<=' )
            // C:\\antlr\\TinyHaxeTry1.g:6:10: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:7:8: ( '>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:7:10: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:8:8: ( '>>>=' )
            // C:\\antlr\\TinyHaxeTry1.g:8:10: '>>>='
            {
            match(">>>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:9:8: ( 'function' )
            // C:\\antlr\\TinyHaxeTry1.g:9:10: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:10:8: ( '#if' )
            // C:\\antlr\\TinyHaxeTry1.g:10:10: '#if'
            {
            match("#if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:11:8: ( '#elseif' )
            // C:\\antlr\\TinyHaxeTry1.g:11:10: '#elseif'
            {
            match("#elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:12:8: ( '#else' )
            // C:\\antlr\\TinyHaxeTry1.g:12:10: '#else'
            {
            match("#else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:13:8: ( '#end' )
            // C:\\antlr\\TinyHaxeTry1.g:13:10: '#end'
            {
            match("#end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:14:8: ( '#error' )
            // C:\\antlr\\TinyHaxeTry1.g:14:10: '#error'
            {
            match("#error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:15:8: ( '->' )
            // C:\\antlr\\TinyHaxeTry1.g:15:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:16:8: ( 'in' )
            // C:\\antlr\\TinyHaxeTry1.g:16:10: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:17:8: ( '>=' )
            // C:\\antlr\\TinyHaxeTry1.g:17:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:18:8: ( '<=' )
            // C:\\antlr\\TinyHaxeTry1.g:18:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:19:8: ( '<<' )
            // C:\\antlr\\TinyHaxeTry1.g:19:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:20:8: ( '>>' )
            // C:\\antlr\\TinyHaxeTry1.g:20:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:21:8: ( '>>>' )
            // C:\\antlr\\TinyHaxeTry1.g:21:10: '>>>'
            {
            match(">>>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:22:8: ( 'cast' )
            // C:\\antlr\\TinyHaxeTry1.g:22:10: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:23:8: ( 'var' )
            // C:\\antlr\\TinyHaxeTry1.g:23:10: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:24:8: ( 'typedef' )
            // C:\\antlr\\TinyHaxeTry1.g:24:10: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:394:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\antlr\\TinyHaxeTry1.g:394:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // C:\\antlr\\TinyHaxeTry1.g:405:5: ( IntegerNumber LongSuffix )
            // C:\\antlr\\TinyHaxeTry1.g:405:9: IntegerNumber LongSuffix
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
            // C:\\antlr\\TinyHaxeTry1.g:410:5: ( IntegerNumber )
            // C:\\antlr\\TinyHaxeTry1.g:410:9: IntegerNumber
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
            // C:\\antlr\\TinyHaxeTry1.g:415:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
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
                    // C:\\antlr\\TinyHaxeTry1.g:415:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:416:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // C:\\antlr\\TinyHaxeTry1.g:416:18: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:416:19: '0' .. '9'
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
                    // C:\\antlr\\TinyHaxeTry1.g:417:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // C:\\antlr\\TinyHaxeTry1.g:417:13: ( '0' .. '7' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:417:14: '0' .. '7'
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
                    // C:\\antlr\\TinyHaxeTry1.g:418:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // C:\\antlr\\TinyHaxeTry1.g:418:19: ( HexDigit )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:418:19: HexDigit
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
            // C:\\antlr\\TinyHaxeTry1.g:423:5: ( '0x' | '0X' )
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
                    // C:\\antlr\\TinyHaxeTry1.g:423:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:423:16: '0X'
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
            // C:\\antlr\\TinyHaxeTry1.g:428:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\antlr\\TinyHaxeTry1.g:428:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\antlr\\TinyHaxeTry1.g:433:5: ( 'l' | 'L' )
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
            // C:\\antlr\\TinyHaxeTry1.g:438:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:438:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:438:23: ( '+' | '-' )?
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

            // C:\\antlr\\TinyHaxeTry1.g:438:38: ( '0' .. '9' )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:438:40: '0' .. '9'
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

    // $ANTLR start "NonIntegerNumber"
    public final void mNonIntegerNumber() throws RecognitionException {
        try {
            // C:\\antlr\\TinyHaxeTry1.g:443:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:443:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:443:9: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:443:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);

                    match('.'); 
                    // C:\\antlr\\TinyHaxeTry1.g:443:27: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:443:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:443:41: ( Exponent )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:443:41: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:444:9: '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    match('.'); 
                    // C:\\antlr\\TinyHaxeTry1.g:444:13: ( '0' .. '9' )+
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
                    	    // C:\\antlr\\TinyHaxeTry1.g:444:15: '0' .. '9'
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

                    // C:\\antlr\\TinyHaxeTry1.g:444:29: ( Exponent )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:444:29: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:445:9: ( '0' .. '9' )+ Exponent
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:445:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:445:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mExponent(); 

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:446:9: ( '0' .. '9' )+
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:446:9: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:446:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:448:9: HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    mHexPrefix(); 
                    // C:\\antlr\\TinyHaxeTry1.g:448:19: ( HexDigit )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')||(LA15_0>='a' && LA15_0<='f')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:448:20: HexDigit
                    	    {
                    	    mHexDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:449:9: ( () | ( '.' ( HexDigit )* ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='P'||LA17_0=='p') ) {
                        alt17=1;
                    }
                    else if ( (LA17_0=='.') ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:449:14: ()
                            {
                            // C:\\antlr\\TinyHaxeTry1.g:449:14: ()
                            // C:\\antlr\\TinyHaxeTry1.g:449:15: 
                            {
                            }


                            }
                            break;
                        case 2 :
                            // C:\\antlr\\TinyHaxeTry1.g:450:14: ( '.' ( HexDigit )* )
                            {
                            // C:\\antlr\\TinyHaxeTry1.g:450:14: ( '.' ( HexDigit )* )
                            // C:\\antlr\\TinyHaxeTry1.g:450:15: '.' ( HexDigit )*
                            {
                            match('.'); 
                            // C:\\antlr\\TinyHaxeTry1.g:450:19: ( HexDigit )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||(LA16_0>='a' && LA16_0<='f')) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // C:\\antlr\\TinyHaxeTry1.g:450:20: HexDigit
                            	    {
                            	    mHexDigit(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // C:\\antlr\\TinyHaxeTry1.g:453:9: ( '+' | '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='+'||LA18_0=='-') ) {
                        alt18=1;
                    }
                    switch (alt18) {
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

                    // C:\\antlr\\TinyHaxeTry1.g:454:9: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:454:11: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NonIntegerNumber"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:458:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // C:\\antlr\\TinyHaxeTry1.g:458:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // C:\\antlr\\TinyHaxeTry1.g:459:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                alt21=1;
            }
            else if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:459:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:460:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:466:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // C:\\antlr\\TinyHaxeTry1.g:466:9: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            match('\"'); 
            // C:\\antlr\\TinyHaxeTry1.g:467:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:467:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:468:13: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
            	    break loop22;
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

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // C:\\antlr\\TinyHaxeTry1.g:475:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
            // C:\\antlr\\TinyHaxeTry1.g:475:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            {
            match('\\'); 
            // C:\\antlr\\TinyHaxeTry1.g:475:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
            int alt23=11;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:476:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:477:18: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:478:18: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // C:\\antlr\\TinyHaxeTry1.g:479:18: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // C:\\antlr\\TinyHaxeTry1.g:480:18: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // C:\\antlr\\TinyHaxeTry1.g:481:18: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // C:\\antlr\\TinyHaxeTry1.g:482:18: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // C:\\antlr\\TinyHaxeTry1.g:483:18: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // C:\\antlr\\TinyHaxeTry1.g:485:18: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:485:18: ( '0' .. '3' )
                    // C:\\antlr\\TinyHaxeTry1.g:485:19: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:485:29: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:485:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:485:40: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:485:41: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 10 :
                    // C:\\antlr\\TinyHaxeTry1.g:487:18: ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:487:18: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:487:19: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:487:29: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:487:30: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 11 :
                    // C:\\antlr\\TinyHaxeTry1.g:489:18: ( '0' .. '7' )
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:489:18: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:489:19: '0' .. '7'
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
            // C:\\antlr\\TinyHaxeTry1.g:494:5: ( 'abstract' )
            // C:\\antlr\\TinyHaxeTry1.g:494:9: 'abstract'
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
            // C:\\antlr\\TinyHaxeTry1.g:498:5: ( 'boolean' )
            // C:\\antlr\\TinyHaxeTry1.g:498:9: 'boolean'
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
            // C:\\antlr\\TinyHaxeTry1.g:502:5: ( 'break' )
            // C:\\antlr\\TinyHaxeTry1.g:502:9: 'break'
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
            // C:\\antlr\\TinyHaxeTry1.g:506:5: ( 'byte' )
            // C:\\antlr\\TinyHaxeTry1.g:506:9: 'byte'
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
            // C:\\antlr\\TinyHaxeTry1.g:510:5: ( 'case' )
            // C:\\antlr\\TinyHaxeTry1.g:510:9: 'case'
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
            // C:\\antlr\\TinyHaxeTry1.g:514:5: ( 'catch' )
            // C:\\antlr\\TinyHaxeTry1.g:514:9: 'catch'
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
            // C:\\antlr\\TinyHaxeTry1.g:518:5: ( 'char' )
            // C:\\antlr\\TinyHaxeTry1.g:518:9: 'char'
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
            // C:\\antlr\\TinyHaxeTry1.g:522:5: ( 'class' )
            // C:\\antlr\\TinyHaxeTry1.g:522:9: 'class'
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
            // C:\\antlr\\TinyHaxeTry1.g:526:5: ( 'const' )
            // C:\\antlr\\TinyHaxeTry1.g:526:9: 'const'
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
            // C:\\antlr\\TinyHaxeTry1.g:530:5: ( 'continue' )
            // C:\\antlr\\TinyHaxeTry1.g:530:9: 'continue'
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
            // C:\\antlr\\TinyHaxeTry1.g:534:5: ( 'default' )
            // C:\\antlr\\TinyHaxeTry1.g:534:9: 'default'
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
            // C:\\antlr\\TinyHaxeTry1.g:538:5: ( 'do' )
            // C:\\antlr\\TinyHaxeTry1.g:538:9: 'do'
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
            // C:\\antlr\\TinyHaxeTry1.g:542:5: ( 'double' )
            // C:\\antlr\\TinyHaxeTry1.g:542:9: 'double'
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
            // C:\\antlr\\TinyHaxeTry1.g:546:5: ( 'else' )
            // C:\\antlr\\TinyHaxeTry1.g:546:9: 'else'
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
            // C:\\antlr\\TinyHaxeTry1.g:550:5: ( 'enum' )
            // C:\\antlr\\TinyHaxeTry1.g:550:9: 'enum'
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
            // C:\\antlr\\TinyHaxeTry1.g:554:5: ( 'extends' )
            // C:\\antlr\\TinyHaxeTry1.g:554:9: 'extends'
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
            // C:\\antlr\\TinyHaxeTry1.g:558:5: ( 'final' )
            // C:\\antlr\\TinyHaxeTry1.g:558:9: 'final'
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
            // C:\\antlr\\TinyHaxeTry1.g:562:5: ( 'finally' )
            // C:\\antlr\\TinyHaxeTry1.g:562:9: 'finally'
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
            // C:\\antlr\\TinyHaxeTry1.g:566:5: ( 'float' )
            // C:\\antlr\\TinyHaxeTry1.g:566:9: 'float'
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
            // C:\\antlr\\TinyHaxeTry1.g:570:5: ( 'for' )
            // C:\\antlr\\TinyHaxeTry1.g:570:9: 'for'
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
            // C:\\antlr\\TinyHaxeTry1.g:574:5: ( 'goto' )
            // C:\\antlr\\TinyHaxeTry1.g:574:9: 'goto'
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
            // C:\\antlr\\TinyHaxeTry1.g:578:5: ( 'if' )
            // C:\\antlr\\TinyHaxeTry1.g:578:9: 'if'
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
            // C:\\antlr\\TinyHaxeTry1.g:582:5: ( 'implements' )
            // C:\\antlr\\TinyHaxeTry1.g:582:9: 'implements'
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
            // C:\\antlr\\TinyHaxeTry1.g:586:5: ( 'import' )
            // C:\\antlr\\TinyHaxeTry1.g:586:9: 'import'
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
            // C:\\antlr\\TinyHaxeTry1.g:590:5: ( 'instanceof' )
            // C:\\antlr\\TinyHaxeTry1.g:590:9: 'instanceof'
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
            // C:\\antlr\\TinyHaxeTry1.g:594:5: ( 'int' )
            // C:\\antlr\\TinyHaxeTry1.g:594:9: 'int'
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
            // C:\\antlr\\TinyHaxeTry1.g:598:5: ( 'interface' )
            // C:\\antlr\\TinyHaxeTry1.g:598:9: 'interface'
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
            // C:\\antlr\\TinyHaxeTry1.g:602:5: ( 'long' )
            // C:\\antlr\\TinyHaxeTry1.g:602:9: 'long'
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
            // C:\\antlr\\TinyHaxeTry1.g:606:5: ( 'native' )
            // C:\\antlr\\TinyHaxeTry1.g:606:9: 'native'
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
            // C:\\antlr\\TinyHaxeTry1.g:610:5: ( 'new' )
            // C:\\antlr\\TinyHaxeTry1.g:610:9: 'new'
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
            // C:\\antlr\\TinyHaxeTry1.g:614:5: ( 'package' )
            // C:\\antlr\\TinyHaxeTry1.g:614:9: 'package'
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
            // C:\\antlr\\TinyHaxeTry1.g:618:5: ( 'private' )
            // C:\\antlr\\TinyHaxeTry1.g:618:9: 'private'
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
            // C:\\antlr\\TinyHaxeTry1.g:622:5: ( 'protected' )
            // C:\\antlr\\TinyHaxeTry1.g:622:9: 'protected'
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
            // C:\\antlr\\TinyHaxeTry1.g:626:5: ( 'public' )
            // C:\\antlr\\TinyHaxeTry1.g:626:9: 'public'
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
            // C:\\antlr\\TinyHaxeTry1.g:630:5: ( 'return' )
            // C:\\antlr\\TinyHaxeTry1.g:630:9: 'return'
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
            // C:\\antlr\\TinyHaxeTry1.g:634:5: ( 'short' )
            // C:\\antlr\\TinyHaxeTry1.g:634:9: 'short'
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
            // C:\\antlr\\TinyHaxeTry1.g:638:5: ( 'static' )
            // C:\\antlr\\TinyHaxeTry1.g:638:9: 'static'
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

    // $ANTLR start "STRICTFP"
    public final void mSTRICTFP() throws RecognitionException {
        try {
            int _type = STRICTFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:642:5: ( 'strictfp' )
            // C:\\antlr\\TinyHaxeTry1.g:642:9: 'strictfp'
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
            // C:\\antlr\\TinyHaxeTry1.g:646:5: ( 'super' )
            // C:\\antlr\\TinyHaxeTry1.g:646:9: 'super'
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
            // C:\\antlr\\TinyHaxeTry1.g:650:5: ( 'switch' )
            // C:\\antlr\\TinyHaxeTry1.g:650:9: 'switch'
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
            // C:\\antlr\\TinyHaxeTry1.g:654:5: ( 'this' )
            // C:\\antlr\\TinyHaxeTry1.g:654:9: 'this'
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
            // C:\\antlr\\TinyHaxeTry1.g:658:5: ( 'throw' )
            // C:\\antlr\\TinyHaxeTry1.g:658:9: 'throw'
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
            // C:\\antlr\\TinyHaxeTry1.g:662:5: ( 'throws' )
            // C:\\antlr\\TinyHaxeTry1.g:662:9: 'throws'
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
            // C:\\antlr\\TinyHaxeTry1.g:666:5: ( 'transient' )
            // C:\\antlr\\TinyHaxeTry1.g:666:9: 'transient'
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
            // C:\\antlr\\TinyHaxeTry1.g:670:5: ( 'try' )
            // C:\\antlr\\TinyHaxeTry1.g:670:9: 'try'
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
            // C:\\antlr\\TinyHaxeTry1.g:674:5: ( 'void' )
            // C:\\antlr\\TinyHaxeTry1.g:674:9: 'void'
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
            // C:\\antlr\\TinyHaxeTry1.g:678:5: ( 'volatile' )
            // C:\\antlr\\TinyHaxeTry1.g:678:9: 'volatile'
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
            // C:\\antlr\\TinyHaxeTry1.g:682:5: ( 'while' )
            // C:\\antlr\\TinyHaxeTry1.g:682:9: 'while'
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
            // C:\\antlr\\TinyHaxeTry1.g:686:5: ( 'true' )
            // C:\\antlr\\TinyHaxeTry1.g:686:9: 'true'
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
            // C:\\antlr\\TinyHaxeTry1.g:690:5: ( 'false' )
            // C:\\antlr\\TinyHaxeTry1.g:690:9: 'false'
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
            // C:\\antlr\\TinyHaxeTry1.g:694:5: ( 'null' )
            // C:\\antlr\\TinyHaxeTry1.g:694:9: 'null'
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

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:698:5: ( '(' )
            // C:\\antlr\\TinyHaxeTry1.g:698:9: '('
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
            // C:\\antlr\\TinyHaxeTry1.g:702:5: ( ')' )
            // C:\\antlr\\TinyHaxeTry1.g:702:9: ')'
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
            // C:\\antlr\\TinyHaxeTry1.g:706:5: ( '{' )
            // C:\\antlr\\TinyHaxeTry1.g:706:9: '{'
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
            // C:\\antlr\\TinyHaxeTry1.g:710:5: ( '}' )
            // C:\\antlr\\TinyHaxeTry1.g:710:9: '}'
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
            // C:\\antlr\\TinyHaxeTry1.g:714:5: ( '[' )
            // C:\\antlr\\TinyHaxeTry1.g:714:9: '['
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
            // C:\\antlr\\TinyHaxeTry1.g:718:5: ( ']' )
            // C:\\antlr\\TinyHaxeTry1.g:718:9: ']'
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
            // C:\\antlr\\TinyHaxeTry1.g:722:5: ( ';' )
            // C:\\antlr\\TinyHaxeTry1.g:722:9: ';'
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
            // C:\\antlr\\TinyHaxeTry1.g:726:5: ( ',' )
            // C:\\antlr\\TinyHaxeTry1.g:726:9: ','
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
            // C:\\antlr\\TinyHaxeTry1.g:730:5: ( '.' )
            // C:\\antlr\\TinyHaxeTry1.g:730:9: '.'
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
            // C:\\antlr\\TinyHaxeTry1.g:734:5: ( '...' )
            // C:\\antlr\\TinyHaxeTry1.g:734:9: '...'
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
            // C:\\antlr\\TinyHaxeTry1.g:738:5: ( '=' )
            // C:\\antlr\\TinyHaxeTry1.g:738:9: '='
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
            // C:\\antlr\\TinyHaxeTry1.g:742:5: ( '!' )
            // C:\\antlr\\TinyHaxeTry1.g:742:9: '!'
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
            // C:\\antlr\\TinyHaxeTry1.g:746:5: ( '~' )
            // C:\\antlr\\TinyHaxeTry1.g:746:9: '~'
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
            // C:\\antlr\\TinyHaxeTry1.g:750:5: ( '?' )
            // C:\\antlr\\TinyHaxeTry1.g:750:9: '?'
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
            // C:\\antlr\\TinyHaxeTry1.g:754:5: ( ':' )
            // C:\\antlr\\TinyHaxeTry1.g:754:9: ':'
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
            // C:\\antlr\\TinyHaxeTry1.g:758:5: ( '==' )
            // C:\\antlr\\TinyHaxeTry1.g:758:9: '=='
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
            // C:\\antlr\\TinyHaxeTry1.g:762:5: ( '&&' )
            // C:\\antlr\\TinyHaxeTry1.g:762:9: '&&'
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
            // C:\\antlr\\TinyHaxeTry1.g:766:5: ( '||' )
            // C:\\antlr\\TinyHaxeTry1.g:766:9: '||'
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
            // C:\\antlr\\TinyHaxeTry1.g:770:5: ( '++' )
            // C:\\antlr\\TinyHaxeTry1.g:770:9: '++'
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
            // C:\\antlr\\TinyHaxeTry1.g:774:5: ( '--' )
            // C:\\antlr\\TinyHaxeTry1.g:774:9: '--'
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
            // C:\\antlr\\TinyHaxeTry1.g:778:5: ( '+' )
            // C:\\antlr\\TinyHaxeTry1.g:778:9: '+'
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
            // C:\\antlr\\TinyHaxeTry1.g:782:5: ( '-' )
            // C:\\antlr\\TinyHaxeTry1.g:782:9: '-'
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
            // C:\\antlr\\TinyHaxeTry1.g:786:5: ( '*' )
            // C:\\antlr\\TinyHaxeTry1.g:786:9: '*'
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
            // C:\\antlr\\TinyHaxeTry1.g:790:5: ( '/' )
            // C:\\antlr\\TinyHaxeTry1.g:790:9: '/'
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
            // C:\\antlr\\TinyHaxeTry1.g:794:5: ( '&' )
            // C:\\antlr\\TinyHaxeTry1.g:794:9: '&'
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
            // C:\\antlr\\TinyHaxeTry1.g:798:5: ( '|' )
            // C:\\antlr\\TinyHaxeTry1.g:798:9: '|'
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
            // C:\\antlr\\TinyHaxeTry1.g:802:5: ( '^' )
            // C:\\antlr\\TinyHaxeTry1.g:802:9: '^'
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
            // C:\\antlr\\TinyHaxeTry1.g:806:5: ( '%' )
            // C:\\antlr\\TinyHaxeTry1.g:806:9: '%'
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
            // C:\\antlr\\TinyHaxeTry1.g:810:5: ( '+=' )
            // C:\\antlr\\TinyHaxeTry1.g:810:9: '+='
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
            // C:\\antlr\\TinyHaxeTry1.g:814:5: ( '-=' )
            // C:\\antlr\\TinyHaxeTry1.g:814:9: '-='
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
            // C:\\antlr\\TinyHaxeTry1.g:818:5: ( '*=' )
            // C:\\antlr\\TinyHaxeTry1.g:818:9: '*='
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
            // C:\\antlr\\TinyHaxeTry1.g:822:5: ( '/=' )
            // C:\\antlr\\TinyHaxeTry1.g:822:9: '/='
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
            // C:\\antlr\\TinyHaxeTry1.g:826:5: ( '&=' )
            // C:\\antlr\\TinyHaxeTry1.g:826:9: '&='
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
            // C:\\antlr\\TinyHaxeTry1.g:830:5: ( '|=' )
            // C:\\antlr\\TinyHaxeTry1.g:830:9: '|='
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
            // C:\\antlr\\TinyHaxeTry1.g:834:5: ( '^=' )
            // C:\\antlr\\TinyHaxeTry1.g:834:9: '^='
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
            // C:\\antlr\\TinyHaxeTry1.g:838:5: ( '%=' )
            // C:\\antlr\\TinyHaxeTry1.g:838:9: '%='
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
            // C:\\antlr\\TinyHaxeTry1.g:842:2: ( '%%<<%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:842:4: '%%<<%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:845:2: ( '%%>>%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:845:4: '%%>>%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:848:2: ( '%%>>>%%=' )
            // C:\\antlr\\TinyHaxeTry1.g:848:4: '%%>>>%%='
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
            // C:\\antlr\\TinyHaxeTry1.g:851:2: ( '===' )
            // C:\\antlr\\TinyHaxeTry1.g:851:3: '==='
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
            // C:\\antlr\\TinyHaxeTry1.g:855:1: ( '%%<=%%' )
            // C:\\antlr\\TinyHaxeTry1.g:855:3: '%%<=%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:859:2: ( '!==' )
            // C:\\antlr\\TinyHaxeTry1.g:859:3: '!=='
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
            // C:\\antlr\\TinyHaxeTry1.g:863:5: ( '@' )
            // C:\\antlr\\TinyHaxeTry1.g:863:9: '@'
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
            // C:\\antlr\\TinyHaxeTry1.g:867:5: ( '!=' )
            // C:\\antlr\\TinyHaxeTry1.g:867:9: '!='
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

    // $ANTLR start "PERCENTLL"
    public final void mPERCENTLL() throws RecognitionException {
        try {
            int _type = PERCENTLL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:871:2: ( '%%<<%%' )
            // C:\\antlr\\TinyHaxeTry1.g:871:3: '%%<<%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:874:2: ( '%%>>%%' )
            // C:\\antlr\\TinyHaxeTry1.g:874:3: '%%>>%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:877:2: ( '%%>>>%%' )
            // C:\\antlr\\TinyHaxeTry1.g:877:3: '%%>>>%%'
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
            // C:\\antlr\\TinyHaxeTry1.g:880:5: ( '>' )
            // C:\\antlr\\TinyHaxeTry1.g:880:9: '>'
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

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:884:5: ( '<' )
            // C:\\antlr\\TinyHaxeTry1.g:884:9: '<'
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
            // C:\\antlr\\TinyHaxeTry1.g:888:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\antlr\\TinyHaxeTry1.g:888:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:888:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }


                switch (alt24) {
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
            	    break loop24;
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
            // C:\\antlr\\TinyHaxeTry1.g:890:8: ( ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:890:10: ( '0' .. '9' )+
            {
            // C:\\antlr\\TinyHaxeTry1.g:890:10: ( '0' .. '9' )+
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
            	    // C:\\antlr\\TinyHaxeTry1.g:890:10: '0' .. '9'
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
            // C:\\antlr\\TinyHaxeTry1.g:894:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt32=3;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:894:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:894:9: ( '0' .. '9' )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:894:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    match('.'); 
                    // C:\\antlr\\TinyHaxeTry1.g:894:25: ( '0' .. '9' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:894:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:894:37: ( EXPONENT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='E'||LA28_0=='e') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:894:37: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:895:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 
                    // C:\\antlr\\TinyHaxeTry1.g:895:13: ( '0' .. '9' )+
                    int cnt29=0;
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:895:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt29 >= 1 ) break loop29;
                                EarlyExitException eee =
                                    new EarlyExitException(29, input);
                                throw eee;
                        }
                        cnt29++;
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:895:25: ( EXPONENT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='E'||LA30_0=='e') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:895:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:896:9: ( '0' .. '9' )+ EXPONENT
                    {
                    // C:\\antlr\\TinyHaxeTry1.g:896:9: ( '0' .. '9' )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:896:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
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
            // C:\\antlr\\TinyHaxeTry1.g:900:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='/') ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1=='/') ) {
                    alt36=1;
                }
                else if ( (LA36_1=='*') ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:900:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // C:\\antlr\\TinyHaxeTry1.g:900:14: (~ ( '\\n' | '\\r' ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFF')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:900:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop33;
                        }
                    } while (true);

                    // C:\\antlr\\TinyHaxeTry1.g:900:28: ( '\\r' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='\r') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\antlr\\TinyHaxeTry1.g:900:28: '\\r'
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
                    // C:\\antlr\\TinyHaxeTry1.g:901:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // C:\\antlr\\TinyHaxeTry1.g:901:14: ( options {greedy=false; } : . )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='*') ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1=='/') ) {
                                alt35=2;
                            }
                            else if ( ((LA35_1>='\u0000' && LA35_1<='.')||(LA35_1>='0' && LA35_1<='\uFFFF')) ) {
                                alt35=1;
                            }


                        }
                        else if ( ((LA35_0>='\u0000' && LA35_0<=')')||(LA35_0>='+' && LA35_0<='\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\antlr\\TinyHaxeTry1.g:901:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\antlr\\TinyHaxeTry1.g:905:5: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\antlr\\TinyHaxeTry1.g:905:8: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C:\\antlr\\TinyHaxeTry1.g:905:12: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0=='\\') ) {
                    alt37=1;
                }
                else if ( ((LA37_0>='\u0000' && LA37_0<='!')||(LA37_0>='#' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFF')) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:905:14: ESC_SEQ
            	    {
            	    mESC_SEQ(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\antlr\\TinyHaxeTry1.g:905:24: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "STRING"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // C:\\antlr\\TinyHaxeTry1.g:909:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\antlr\\TinyHaxeTry1.g:909:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\antlr\\TinyHaxeTry1.g:909:22: ( '+' | '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='+'||LA38_0=='-') ) {
                alt38=1;
            }
            switch (alt38) {
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

            // C:\\antlr\\TinyHaxeTry1.g:909:33: ( '0' .. '9' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='0' && LA39_0<='9')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\antlr\\TinyHaxeTry1.g:909:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
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
            // C:\\antlr\\TinyHaxeTry1.g:912:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\antlr\\TinyHaxeTry1.g:912:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // C:\\antlr\\TinyHaxeTry1.g:916:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\\') ) {
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
                    alt40=1;
                    }
                    break;
                case 'u':
                    {
                    alt40=2;
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
                    alt40=3;
                    }
                    break;
                default:
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
                    // C:\\antlr\\TinyHaxeTry1.g:916:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // C:\\antlr\\TinyHaxeTry1.g:917:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:918:9: OCTAL_ESC
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
            // C:\\antlr\\TinyHaxeTry1.g:923:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\\') ) {
                int LA41_1 = input.LA(2);

                if ( ((LA41_1>='0' && LA41_1<='3')) ) {
                    int LA41_2 = input.LA(3);

                    if ( ((LA41_2>='0' && LA41_2<='7')) ) {
                        int LA41_4 = input.LA(4);

                        if ( ((LA41_4>='0' && LA41_4<='7')) ) {
                            alt41=1;
                        }
                        else {
                            alt41=2;}
                    }
                    else {
                        alt41=3;}
                }
                else if ( ((LA41_1>='4' && LA41_1<='7')) ) {
                    int LA41_3 = input.LA(3);

                    if ( ((LA41_3>='0' && LA41_3<='7')) ) {
                        alt41=2;
                    }
                    else {
                        alt41=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\antlr\\TinyHaxeTry1.g:923:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:923:14: ( '0' .. '3' )
                    // C:\\antlr\\TinyHaxeTry1.g:923:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:923:25: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:923:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:923:36: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:923:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\antlr\\TinyHaxeTry1.g:924:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:924:14: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:924:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\antlr\\TinyHaxeTry1.g:924:25: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:924:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\antlr\\TinyHaxeTry1.g:925:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\antlr\\TinyHaxeTry1.g:925:14: ( '0' .. '7' )
                    // C:\\antlr\\TinyHaxeTry1.g:925:15: '0' .. '7'
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
            // C:\\antlr\\TinyHaxeTry1.g:930:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // C:\\antlr\\TinyHaxeTry1.g:930:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // C:\\antlr\\TinyHaxeTry1.g:1:8: ( T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | WS | LONGLITERAL | INTLITERAL | CHARLITERAL | STRINGLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | PERCENTLL | PERCENTBB | PERCENTBBB | GT | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRING )
        int alt42=132;
        alt42 = dfa42.predict(input);
        switch (alt42) {
            case 1 :
                // C:\\antlr\\TinyHaxeTry1.g:1:10: T__126
                {
                mT__126(); 

                }
                break;
            case 2 :
                // C:\\antlr\\TinyHaxeTry1.g:1:17: T__127
                {
                mT__127(); 

                }
                break;
            case 3 :
                // C:\\antlr\\TinyHaxeTry1.g:1:24: T__128
                {
                mT__128(); 

                }
                break;
            case 4 :
                // C:\\antlr\\TinyHaxeTry1.g:1:31: T__129
                {
                mT__129(); 

                }
                break;
            case 5 :
                // C:\\antlr\\TinyHaxeTry1.g:1:38: T__130
                {
                mT__130(); 

                }
                break;
            case 6 :
                // C:\\antlr\\TinyHaxeTry1.g:1:45: T__131
                {
                mT__131(); 

                }
                break;
            case 7 :
                // C:\\antlr\\TinyHaxeTry1.g:1:52: T__132
                {
                mT__132(); 

                }
                break;
            case 8 :
                // C:\\antlr\\TinyHaxeTry1.g:1:59: T__133
                {
                mT__133(); 

                }
                break;
            case 9 :
                // C:\\antlr\\TinyHaxeTry1.g:1:66: T__134
                {
                mT__134(); 

                }
                break;
            case 10 :
                // C:\\antlr\\TinyHaxeTry1.g:1:73: T__135
                {
                mT__135(); 

                }
                break;
            case 11 :
                // C:\\antlr\\TinyHaxeTry1.g:1:80: T__136
                {
                mT__136(); 

                }
                break;
            case 12 :
                // C:\\antlr\\TinyHaxeTry1.g:1:87: T__137
                {
                mT__137(); 

                }
                break;
            case 13 :
                // C:\\antlr\\TinyHaxeTry1.g:1:94: T__138
                {
                mT__138(); 

                }
                break;
            case 14 :
                // C:\\antlr\\TinyHaxeTry1.g:1:101: T__139
                {
                mT__139(); 

                }
                break;
            case 15 :
                // C:\\antlr\\TinyHaxeTry1.g:1:108: T__140
                {
                mT__140(); 

                }
                break;
            case 16 :
                // C:\\antlr\\TinyHaxeTry1.g:1:115: T__141
                {
                mT__141(); 

                }
                break;
            case 17 :
                // C:\\antlr\\TinyHaxeTry1.g:1:122: T__142
                {
                mT__142(); 

                }
                break;
            case 18 :
                // C:\\antlr\\TinyHaxeTry1.g:1:129: T__143
                {
                mT__143(); 

                }
                break;
            case 19 :
                // C:\\antlr\\TinyHaxeTry1.g:1:136: T__144
                {
                mT__144(); 

                }
                break;
            case 20 :
                // C:\\antlr\\TinyHaxeTry1.g:1:143: T__145
                {
                mT__145(); 

                }
                break;
            case 21 :
                // C:\\antlr\\TinyHaxeTry1.g:1:150: T__146
                {
                mT__146(); 

                }
                break;
            case 22 :
                // C:\\antlr\\TinyHaxeTry1.g:1:157: T__147
                {
                mT__147(); 

                }
                break;
            case 23 :
                // C:\\antlr\\TinyHaxeTry1.g:1:164: WS
                {
                mWS(); 

                }
                break;
            case 24 :
                // C:\\antlr\\TinyHaxeTry1.g:1:167: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 25 :
                // C:\\antlr\\TinyHaxeTry1.g:1:179: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 26 :
                // C:\\antlr\\TinyHaxeTry1.g:1:190: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 27 :
                // C:\\antlr\\TinyHaxeTry1.g:1:202: STRINGLITERAL
                {
                mSTRINGLITERAL(); 

                }
                break;
            case 28 :
                // C:\\antlr\\TinyHaxeTry1.g:1:216: ABSTRACT
                {
                mABSTRACT(); 

                }
                break;
            case 29 :
                // C:\\antlr\\TinyHaxeTry1.g:1:225: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 30 :
                // C:\\antlr\\TinyHaxeTry1.g:1:233: BREAK
                {
                mBREAK(); 

                }
                break;
            case 31 :
                // C:\\antlr\\TinyHaxeTry1.g:1:239: BYTE
                {
                mBYTE(); 

                }
                break;
            case 32 :
                // C:\\antlr\\TinyHaxeTry1.g:1:244: CASE
                {
                mCASE(); 

                }
                break;
            case 33 :
                // C:\\antlr\\TinyHaxeTry1.g:1:249: CATCH
                {
                mCATCH(); 

                }
                break;
            case 34 :
                // C:\\antlr\\TinyHaxeTry1.g:1:255: CHAR
                {
                mCHAR(); 

                }
                break;
            case 35 :
                // C:\\antlr\\TinyHaxeTry1.g:1:260: CLASS
                {
                mCLASS(); 

                }
                break;
            case 36 :
                // C:\\antlr\\TinyHaxeTry1.g:1:266: CONST
                {
                mCONST(); 

                }
                break;
            case 37 :
                // C:\\antlr\\TinyHaxeTry1.g:1:272: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 38 :
                // C:\\antlr\\TinyHaxeTry1.g:1:281: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 39 :
                // C:\\antlr\\TinyHaxeTry1.g:1:289: DO
                {
                mDO(); 

                }
                break;
            case 40 :
                // C:\\antlr\\TinyHaxeTry1.g:1:292: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 41 :
                // C:\\antlr\\TinyHaxeTry1.g:1:299: ELSE
                {
                mELSE(); 

                }
                break;
            case 42 :
                // C:\\antlr\\TinyHaxeTry1.g:1:304: ENUM
                {
                mENUM(); 

                }
                break;
            case 43 :
                // C:\\antlr\\TinyHaxeTry1.g:1:309: EXTENDS
                {
                mEXTENDS(); 

                }
                break;
            case 44 :
                // C:\\antlr\\TinyHaxeTry1.g:1:317: FINAL
                {
                mFINAL(); 

                }
                break;
            case 45 :
                // C:\\antlr\\TinyHaxeTry1.g:1:323: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 46 :
                // C:\\antlr\\TinyHaxeTry1.g:1:331: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 47 :
                // C:\\antlr\\TinyHaxeTry1.g:1:337: FOR
                {
                mFOR(); 

                }
                break;
            case 48 :
                // C:\\antlr\\TinyHaxeTry1.g:1:341: GOTO
                {
                mGOTO(); 

                }
                break;
            case 49 :
                // C:\\antlr\\TinyHaxeTry1.g:1:346: IF
                {
                mIF(); 

                }
                break;
            case 50 :
                // C:\\antlr\\TinyHaxeTry1.g:1:349: IMPLEMENTS
                {
                mIMPLEMENTS(); 

                }
                break;
            case 51 :
                // C:\\antlr\\TinyHaxeTry1.g:1:360: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 52 :
                // C:\\antlr\\TinyHaxeTry1.g:1:367: INSTANCEOF
                {
                mINSTANCEOF(); 

                }
                break;
            case 53 :
                // C:\\antlr\\TinyHaxeTry1.g:1:378: INT
                {
                mINT(); 

                }
                break;
            case 54 :
                // C:\\antlr\\TinyHaxeTry1.g:1:382: INTERFACE
                {
                mINTERFACE(); 

                }
                break;
            case 55 :
                // C:\\antlr\\TinyHaxeTry1.g:1:392: LONG
                {
                mLONG(); 

                }
                break;
            case 56 :
                // C:\\antlr\\TinyHaxeTry1.g:1:397: NATIVE
                {
                mNATIVE(); 

                }
                break;
            case 57 :
                // C:\\antlr\\TinyHaxeTry1.g:1:404: NEW
                {
                mNEW(); 

                }
                break;
            case 58 :
                // C:\\antlr\\TinyHaxeTry1.g:1:408: PACKAGE
                {
                mPACKAGE(); 

                }
                break;
            case 59 :
                // C:\\antlr\\TinyHaxeTry1.g:1:416: PRIVATE
                {
                mPRIVATE(); 

                }
                break;
            case 60 :
                // C:\\antlr\\TinyHaxeTry1.g:1:424: PROTECTED
                {
                mPROTECTED(); 

                }
                break;
            case 61 :
                // C:\\antlr\\TinyHaxeTry1.g:1:434: PUBLIC
                {
                mPUBLIC(); 

                }
                break;
            case 62 :
                // C:\\antlr\\TinyHaxeTry1.g:1:441: RETURN
                {
                mRETURN(); 

                }
                break;
            case 63 :
                // C:\\antlr\\TinyHaxeTry1.g:1:448: SHORT
                {
                mSHORT(); 

                }
                break;
            case 64 :
                // C:\\antlr\\TinyHaxeTry1.g:1:454: STATIC
                {
                mSTATIC(); 

                }
                break;
            case 65 :
                // C:\\antlr\\TinyHaxeTry1.g:1:461: STRICTFP
                {
                mSTRICTFP(); 

                }
                break;
            case 66 :
                // C:\\antlr\\TinyHaxeTry1.g:1:470: SUPER
                {
                mSUPER(); 

                }
                break;
            case 67 :
                // C:\\antlr\\TinyHaxeTry1.g:1:476: SWITCH
                {
                mSWITCH(); 

                }
                break;
            case 68 :
                // C:\\antlr\\TinyHaxeTry1.g:1:483: THIS
                {
                mTHIS(); 

                }
                break;
            case 69 :
                // C:\\antlr\\TinyHaxeTry1.g:1:488: THROW
                {
                mTHROW(); 

                }
                break;
            case 70 :
                // C:\\antlr\\TinyHaxeTry1.g:1:494: THROWS
                {
                mTHROWS(); 

                }
                break;
            case 71 :
                // C:\\antlr\\TinyHaxeTry1.g:1:501: TRANSIENT
                {
                mTRANSIENT(); 

                }
                break;
            case 72 :
                // C:\\antlr\\TinyHaxeTry1.g:1:511: TRY
                {
                mTRY(); 

                }
                break;
            case 73 :
                // C:\\antlr\\TinyHaxeTry1.g:1:515: VOID
                {
                mVOID(); 

                }
                break;
            case 74 :
                // C:\\antlr\\TinyHaxeTry1.g:1:520: VOLATILE
                {
                mVOLATILE(); 

                }
                break;
            case 75 :
                // C:\\antlr\\TinyHaxeTry1.g:1:529: WHILE
                {
                mWHILE(); 

                }
                break;
            case 76 :
                // C:\\antlr\\TinyHaxeTry1.g:1:535: TRUE
                {
                mTRUE(); 

                }
                break;
            case 77 :
                // C:\\antlr\\TinyHaxeTry1.g:1:540: FALSE
                {
                mFALSE(); 

                }
                break;
            case 78 :
                // C:\\antlr\\TinyHaxeTry1.g:1:546: NULL
                {
                mNULL(); 

                }
                break;
            case 79 :
                // C:\\antlr\\TinyHaxeTry1.g:1:551: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 80 :
                // C:\\antlr\\TinyHaxeTry1.g:1:558: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 81 :
                // C:\\antlr\\TinyHaxeTry1.g:1:565: LBRACE
                {
                mLBRACE(); 

                }
                break;
            case 82 :
                // C:\\antlr\\TinyHaxeTry1.g:1:572: RBRACE
                {
                mRBRACE(); 

                }
                break;
            case 83 :
                // C:\\antlr\\TinyHaxeTry1.g:1:579: LBRACKET
                {
                mLBRACKET(); 

                }
                break;
            case 84 :
                // C:\\antlr\\TinyHaxeTry1.g:1:588: RBRACKET
                {
                mRBRACKET(); 

                }
                break;
            case 85 :
                // C:\\antlr\\TinyHaxeTry1.g:1:597: SEMI
                {
                mSEMI(); 

                }
                break;
            case 86 :
                // C:\\antlr\\TinyHaxeTry1.g:1:602: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 87 :
                // C:\\antlr\\TinyHaxeTry1.g:1:608: DOT
                {
                mDOT(); 

                }
                break;
            case 88 :
                // C:\\antlr\\TinyHaxeTry1.g:1:612: ELLIPSIS
                {
                mELLIPSIS(); 

                }
                break;
            case 89 :
                // C:\\antlr\\TinyHaxeTry1.g:1:621: EQ
                {
                mEQ(); 

                }
                break;
            case 90 :
                // C:\\antlr\\TinyHaxeTry1.g:1:624: BANG
                {
                mBANG(); 

                }
                break;
            case 91 :
                // C:\\antlr\\TinyHaxeTry1.g:1:629: TILDE
                {
                mTILDE(); 

                }
                break;
            case 92 :
                // C:\\antlr\\TinyHaxeTry1.g:1:635: QUES
                {
                mQUES(); 

                }
                break;
            case 93 :
                // C:\\antlr\\TinyHaxeTry1.g:1:640: COLON
                {
                mCOLON(); 

                }
                break;
            case 94 :
                // C:\\antlr\\TinyHaxeTry1.g:1:646: EQEQ
                {
                mEQEQ(); 

                }
                break;
            case 95 :
                // C:\\antlr\\TinyHaxeTry1.g:1:651: AMPAMP
                {
                mAMPAMP(); 

                }
                break;
            case 96 :
                // C:\\antlr\\TinyHaxeTry1.g:1:658: BARBAR
                {
                mBARBAR(); 

                }
                break;
            case 97 :
                // C:\\antlr\\TinyHaxeTry1.g:1:665: PLUSPLUS
                {
                mPLUSPLUS(); 

                }
                break;
            case 98 :
                // C:\\antlr\\TinyHaxeTry1.g:1:674: SUBSUB
                {
                mSUBSUB(); 

                }
                break;
            case 99 :
                // C:\\antlr\\TinyHaxeTry1.g:1:681: PLUS
                {
                mPLUS(); 

                }
                break;
            case 100 :
                // C:\\antlr\\TinyHaxeTry1.g:1:686: SUB
                {
                mSUB(); 

                }
                break;
            case 101 :
                // C:\\antlr\\TinyHaxeTry1.g:1:690: STAR
                {
                mSTAR(); 

                }
                break;
            case 102 :
                // C:\\antlr\\TinyHaxeTry1.g:1:695: SLASH
                {
                mSLASH(); 

                }
                break;
            case 103 :
                // C:\\antlr\\TinyHaxeTry1.g:1:701: AMP
                {
                mAMP(); 

                }
                break;
            case 104 :
                // C:\\antlr\\TinyHaxeTry1.g:1:705: BAR
                {
                mBAR(); 

                }
                break;
            case 105 :
                // C:\\antlr\\TinyHaxeTry1.g:1:709: CARET
                {
                mCARET(); 

                }
                break;
            case 106 :
                // C:\\antlr\\TinyHaxeTry1.g:1:715: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 107 :
                // C:\\antlr\\TinyHaxeTry1.g:1:723: PLUSEQ
                {
                mPLUSEQ(); 

                }
                break;
            case 108 :
                // C:\\antlr\\TinyHaxeTry1.g:1:730: SUBEQ
                {
                mSUBEQ(); 

                }
                break;
            case 109 :
                // C:\\antlr\\TinyHaxeTry1.g:1:736: STAREQ
                {
                mSTAREQ(); 

                }
                break;
            case 110 :
                // C:\\antlr\\TinyHaxeTry1.g:1:743: SLASHEQ
                {
                mSLASHEQ(); 

                }
                break;
            case 111 :
                // C:\\antlr\\TinyHaxeTry1.g:1:751: AMPEQ
                {
                mAMPEQ(); 

                }
                break;
            case 112 :
                // C:\\antlr\\TinyHaxeTry1.g:1:757: BAREQ
                {
                mBAREQ(); 

                }
                break;
            case 113 :
                // C:\\antlr\\TinyHaxeTry1.g:1:763: CARETEQ
                {
                mCARETEQ(); 

                }
                break;
            case 114 :
                // C:\\antlr\\TinyHaxeTry1.g:1:771: PERCENTEQ
                {
                mPERCENTEQ(); 

                }
                break;
            case 115 :
                // C:\\antlr\\TinyHaxeTry1.g:1:781: PERCENTDLQ
                {
                mPERCENTDLQ(); 

                }
                break;
            case 116 :
                // C:\\antlr\\TinyHaxeTry1.g:1:792: PERCENTDBQ
                {
                mPERCENTDBQ(); 

                }
                break;
            case 117 :
                // C:\\antlr\\TinyHaxeTry1.g:1:803: PERCENTDBBQ
                {
                mPERCENTDBBQ(); 

                }
                break;
            case 118 :
                // C:\\antlr\\TinyHaxeTry1.g:1:815: EQEQEQ
                {
                mEQEQEQ(); 

                }
                break;
            case 119 :
                // C:\\antlr\\TinyHaxeTry1.g:1:822: PERCENTLESQ
                {
                mPERCENTLESQ(); 

                }
                break;
            case 120 :
                // C:\\antlr\\TinyHaxeTry1.g:1:834: BANGEQQ
                {
                mBANGEQQ(); 

                }
                break;
            case 121 :
                // C:\\antlr\\TinyHaxeTry1.g:1:842: MONKEYS_AT
                {
                mMONKEYS_AT(); 

                }
                break;
            case 122 :
                // C:\\antlr\\TinyHaxeTry1.g:1:853: BANGEQ
                {
                mBANGEQ(); 

                }
                break;
            case 123 :
                // C:\\antlr\\TinyHaxeTry1.g:1:860: PERCENTLL
                {
                mPERCENTLL(); 

                }
                break;
            case 124 :
                // C:\\antlr\\TinyHaxeTry1.g:1:870: PERCENTBB
                {
                mPERCENTBB(); 

                }
                break;
            case 125 :
                // C:\\antlr\\TinyHaxeTry1.g:1:880: PERCENTBBB
                {
                mPERCENTBBB(); 

                }
                break;
            case 126 :
                // C:\\antlr\\TinyHaxeTry1.g:1:891: GT
                {
                mGT(); 

                }
                break;
            case 127 :
                // C:\\antlr\\TinyHaxeTry1.g:1:894: LT
                {
                mLT(); 

                }
                break;
            case 128 :
                // C:\\antlr\\TinyHaxeTry1.g:1:897: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 129 :
                // C:\\antlr\\TinyHaxeTry1.g:1:908: INTNUM
                {
                mINTNUM(); 

                }
                break;
            case 130 :
                // C:\\antlr\\TinyHaxeTry1.g:1:915: FLOATNUM
                {
                mFLOATNUM(); 

                }
                break;
            case 131 :
                // C:\\antlr\\TinyHaxeTry1.g:1:924: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 132 :
                // C:\\antlr\\TinyHaxeTry1.g:1:932: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA20_eotS =
        "\1\uffff\1\6\1\uffff\1\6\4\uffff";
    static final String DFA20_eofS =
        "\10\uffff";
    static final String DFA20_minS =
        "\2\56\1\uffff\1\56\4\uffff";
    static final String DFA20_maxS =
        "\1\71\1\170\1\uffff\1\145\4\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\3\1\4\1\1";
    static final String DFA20_specialS =
        "\10\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\7\1\uffff\12\3\13\uffff\1\5\22\uffff\1\4\14\uffff\1\5\22"+
            "\uffff\1\4",
            "",
            "\1\7\1\uffff\12\3\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "441:1: fragment NonIntegerNumber : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ );";
        }
    }
    static final String DFA23_eotS =
        "\11\uffff\2\14\1\15\3\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\42\10\uffff\3\60\3\uffff";
    static final String DFA23_maxS =
        "\1\164\10\uffff\3\67\3\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\12\1\11";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
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
            return "475:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
        }
    }
    static final String DFA32_eotS =
        "\5\uffff";
    static final String DFA32_eofS =
        "\5\uffff";
    static final String DFA32_minS =
        "\2\56\3\uffff";
    static final String DFA32_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA32_specialS =
        "\5\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "893:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA42_eotS =
        "\1\uffff\3\61\1\73\1\76\1\61\1\uffff\1\111\3\61\1\uffff\2\125\2"+
        "\uffff\12\61\10\uffff\1\165\1\167\1\171\3\uffff\1\174\1\177\1\u0082"+
        "\1\u0084\1\u0087\1\u0089\1\u008c\2\uffff\1\u0090\1\u0091\3\61\1"+
        "\u0096\1\61\1\u0099\2\uffff\1\u009c\2\uffff\5\61\6\uffff\11\61\3"+
        "\uffff\1\125\2\uffff\1\u00b4\1\125\4\uffff\25\61\2\uffff\1\u00d8"+
        "\1\uffff\1\u00da\24\uffff\2\61\1\u00e0\2\uffff\4\61\1\uffff\1\61"+
        "\3\uffff\1\u00e8\1\uffff\3\61\1\u00ec\1\61\3\uffff\5\61\1\u00f6"+
        "\6\61\1\u00fd\1\61\1\125\14\uffff\12\61\1\u010b\14\61\6\uffff\3"+
        "\61\1\uffff\6\61\2\uffff\3\61\1\uffff\1\61\1\uffff\1\u0129\1\u012a"+
        "\1\61\1\u012c\3\61\1\uffff\1\u0130\2\61\1\u0133\2\61\1\uffff\1\u0136"+
        "\2\uffff\3\61\1\u013b\1\u013c\1\u013d\1\61\1\u013f\1\u0140\1\61"+
        "\1\uffff\1\u0142\13\61\3\uffff\12\61\1\u015c\1\u015d\1\u015e\1\u0160"+
        "\2\uffff\1\u0161\1\uffff\1\u0162\1\u0163\1\61\1\uffff\2\61\1\uffff"+
        "\1\u0168\1\61\2\uffff\2\61\1\u016c\3\uffff\1\61\2\uffff\1\61\1\uffff"+
        "\5\61\1\u0174\2\61\1\u0177\1\61\1\u0179\3\uffff\1\u017d\3\61\1\u0181"+
        "\2\61\1\u0184\3\61\10\uffff\3\61\1\u018b\1\uffff\3\61\1\uffff\1"+
        "\61\1\u0190\3\61\1\u0194\1\u0195\1\uffff\1\u0196\1\61\1\uffff\1"+
        "\u0198\1\uffff\1\u019a\1\u019c\2\uffff\3\61\1\uffff\1\u01a1\1\u01a2"+
        "\1\uffff\2\61\1\u01a5\2\61\1\u01a8\1\uffff\2\61\1\u01ab\1\u01ac"+
        "\1\uffff\1\u01ad\1\u01ae\1\61\3\uffff\1\61\5\uffff\1\u01b2\3\61"+
        "\2\uffff\1\u01b6\1\u01b7\1\uffff\1\u01b8\1\u01b9\1\uffff\1\61\1"+
        "\u01bb\4\uffff\1\61\1\u01bd\2\uffff\1\61\1\u01bf\1\61\4\uffff\1"+
        "\u01c1\1\uffff\1\u01c2\1\uffff\1\u01c3\1\uffff\1\u01c4\4\uffff";
    static final String DFA42_eofS =
        "\u01c5\uffff";
    static final String DFA42_minS =
        "\1\11\1\146\1\145\1\166\1\74\1\75\1\141\1\145\1\55\2\141\1\150"+
        "\1\uffff\2\56\1\uffff\1\0\1\142\1\157\1\154\2\157\2\141\1\145\2"+
        "\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\75\1\52\1\75\1"+
        "\45\2\uffff\2\60\1\160\1\156\1\146\1\60\1\145\1\75\2\uffff\1\75"+
        "\2\uffff\2\156\1\157\1\162\1\154\1\uffff\1\154\4\uffff\1\163\2\141"+
        "\1\156\1\162\1\151\1\160\1\151\1\141\2\60\1\uffff\1\56\2\uffff\2"+
        "\56\1\42\1\0\2\uffff\1\163\1\157\1\145\1\164\1\163\1\165\2\164\1"+
        "\156\1\164\1\167\1\154\1\143\1\151\1\142\1\164\1\157\1\141\1\160"+
        "\2\151\2\uffff\1\75\1\uffff\1\75\22\uffff\1\74\1\uffff\1\151\1\164"+
        "\1\60\2\uffff\1\154\2\141\1\142\1\uffff\1\162\3\uffff\1\75\1\uffff"+
        "\1\143\2\141\1\60\2\163\2\uffff\1\145\1\143\1\162\2\163\1\60\1\144"+
        "\1\141\1\145\1\163\1\157\1\156\1\60\1\145\1\60\1\uffff\12\0\1\uffff"+
        "\1\164\1\154\1\141\2\145\1\155\1\145\1\157\1\147\1\151\1\60\1\154"+
        "\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\154"+
        "\4\uffff\1\74\1\76\1\156\1\141\1\162\1\uffff\1\145\1\162\1\155\1"+
        "\165\1\154\1\162\2\uffff\1\164\1\154\1\164\1\uffff\2\145\2\60\1"+
        "\150\1\60\1\163\1\164\1\151\1\uffff\1\60\1\164\1\144\1\60\1\167"+
        "\1\163\1\uffff\1\60\2\0\1\162\1\145\1\153\3\60\1\156\2\60\1\166"+
        "\1\uffff\1\60\2\141\1\145\1\151\1\162\1\164\1\151\1\143\1\162\1"+
        "\143\1\145\1\45\1\uffff\1\45\1\145\1\156\1\146\1\155\1\164\1\151"+
        "\1\154\1\145\2\151\3\60\1\151\2\uffff\1\60\1\uffff\2\60\1\156\1"+
        "\uffff\1\151\1\145\1\uffff\1\60\1\151\1\uffff\1\0\2\141\1\60\3\uffff"+
        "\1\144\2\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\60\1\143"+
        "\1\164\1\60\1\150\1\60\3\45\1\60\1\143\1\141\1\145\1\60\1\143\1"+
        "\164\1\60\1\144\1\157\1\171\10\uffff\1\165\1\154\1\146\1\60\1\uffff"+
        "\1\145\1\143\1\156\1\uffff\1\163\1\60\2\145\1\164\2\60\1\uffff\1"+
        "\60\1\146\1\uffff\1\60\1\uffff\2\75\1\45\1\uffff\1\145\1\143\1\156"+
        "\1\uffff\2\60\1\uffff\1\145\1\156\1\60\2\145\1\60\1\uffff\1\156"+
        "\1\164\2\60\1\uffff\2\60\1\145\3\uffff\1\160\5\uffff\1\75\1\157"+
        "\1\145\1\164\2\uffff\2\60\1\uffff\2\60\1\uffff\1\164\1\60\4\uffff"+
        "\1\144\1\60\2\uffff\1\146\1\60\1\163\4\uffff\1\60\1\uffff\1\60\1"+
        "\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA42_maxS =
        "\1\176\1\156\1\171\1\166\1\75\1\76\1\165\1\151\1\76\2\157\1\171"+
        "\1\uffff\1\170\1\154\1\uffff\1\uffff\1\142\1\171\1\170\2\157\2\165"+
        "\1\145\1\167\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\5\75\2"+
        "\uffff\2\172\1\160\1\156\1\146\1\172\1\145\1\75\2\uffff\1\76\2\uffff"+
        "\2\156\1\157\1\162\1\154\1\uffff\1\162\4\uffff\1\164\2\141\1\156"+
        "\1\162\1\154\1\160\1\162\1\171\2\146\1\uffff\1\154\2\uffff\1\145"+
        "\1\154\1\165\1\uffff\2\uffff\1\163\1\157\1\145\1\164\1\163\1\165"+
        "\2\164\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162"+
        "\1\160\2\151\2\uffff\1\75\1\uffff\1\75\22\uffff\1\76\1\uffff\1\151"+
        "\1\164\1\172\2\uffff\1\157\2\141\1\142\1\uffff\1\162\3\uffff\1\75"+
        "\1\uffff\1\143\2\141\1\172\2\163\2\uffff\1\164\1\143\1\162\1\163"+
        "\1\164\1\172\1\144\1\141\1\145\1\163\1\157\1\156\1\172\1\145\1\154"+
        "\1\uffff\12\uffff\1\uffff\1\164\1\154\1\141\2\145\1\155\1\145\1"+
        "\157\1\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162"+
        "\1\164\1\151\1\145\1\164\1\154\4\uffff\1\75\1\76\1\156\1\141\1\162"+
        "\1\uffff\1\145\1\162\1\155\1\165\1\154\1\162\2\uffff\1\164\1\154"+
        "\1\164\1\uffff\2\145\2\172\1\150\1\172\1\163\1\164\1\151\1\uffff"+
        "\1\172\1\164\1\144\1\172\1\167\1\163\1\uffff\1\172\2\uffff\1\162"+
        "\1\145\1\153\3\172\1\156\2\172\1\166\1\uffff\1\172\2\141\1\145\1"+
        "\151\1\162\1\164\1\151\1\143\1\162\1\143\1\145\1\45\1\uffff\1\76"+
        "\1\145\1\156\1\146\1\155\1\164\1\151\1\154\1\145\2\151\3\172\1\151"+
        "\2\uffff\1\172\1\uffff\2\172\1\156\1\uffff\1\151\1\145\1\uffff\1"+
        "\172\1\151\1\uffff\1\uffff\2\141\1\172\3\uffff\1\144\2\uffff\1\145"+
        "\1\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1\164\1\172\1\150\1"+
        "\172\3\45\1\172\1\143\1\141\1\145\1\172\1\143\1\164\1\172\1\144"+
        "\1\157\1\171\10\uffff\1\165\1\154\1\146\1\172\1\uffff\1\145\1\143"+
        "\1\156\1\uffff\1\163\1\172\2\145\1\164\2\172\1\uffff\1\172\1\146"+
        "\1\uffff\1\172\1\uffff\2\75\1\45\1\uffff\1\145\1\143\1\156\1\uffff"+
        "\2\172\1\uffff\1\145\1\156\1\172\2\145\1\172\1\uffff\1\156\1\164"+
        "\2\172\1\uffff\2\172\1\145\3\uffff\1\160\5\uffff\1\75\1\157\1\145"+
        "\1\164\2\uffff\2\172\1\uffff\2\172\1\uffff\1\164\1\172\4\uffff\1"+
        "\144\1\172\2\uffff\1\146\1\172\1\163\4\uffff\1\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\1\172\4\uffff";
    static final String DFA42_acceptS =
        "\14\uffff\1\27\2\uffff\1\32\13\uffff\1\117\1\120\1\121\1\122\1"+
        "\123\1\124\1\125\1\126\3\uffff\1\133\1\134\1\135\7\uffff\1\171\1"+
        "\u0080\10\uffff\1\20\1\177\1\uffff\1\17\1\176\5\uffff\1\10\1\uffff"+
        "\1\15\1\142\1\154\1\144\13\uffff\1\31\1\uffff\1\30\1\u0082\4\uffff"+
        "\1\33\1\u0084\25\uffff\1\130\1\127\1\uffff\1\131\1\uffff\1\132\1"+
        "\137\1\157\1\147\1\140\1\160\1\150\1\141\1\153\1\143\1\155\1\145"+
        "\1\156\1\u0083\1\146\1\161\1\151\1\162\1\uffff\1\152\3\uffff\1\16"+
        "\1\61\4\uffff\1\47\1\uffff\1\4\1\21\1\5\1\uffff\1\22\6\uffff\1\13"+
        "\1\14\17\uffff\1\u0081\12\uffff\1\33\27\uffff\1\166\1\136\1\170"+
        "\1\172\5\uffff\1\65\6\uffff\1\6\1\23\3\uffff\1\57\11\uffff\1\25"+
        "\6\uffff\1\110\15\uffff\1\71\15\uffff\1\167\17\uffff\1\24\1\40\1"+
        "\uffff\1\42\3\uffff\1\111\2\uffff\1\104\2\uffff\1\114\4\uffff\1"+
        "\37\1\51\1\52\1\uffff\1\60\1\67\1\uffff\1\116\31\uffff\1\54\1\56"+
        "\1\115\1\11\1\12\1\41\1\43\1\44\4\uffff\1\105\3\uffff\1\36\7\uffff"+
        "\1\77\2\uffff\1\102\1\uffff\1\113\3\uffff\1\1\3\uffff\1\63\2\uffff"+
        "\1\50\6\uffff\1\106\4\uffff\1\70\3\uffff\1\75\1\76\1\100\1\uffff"+
        "\1\103\1\163\1\173\1\164\1\174\4\uffff\1\2\1\46\2\uffff\1\55\2\uffff"+
        "\1\26\2\uffff\1\35\1\53\1\72\1\73\2\uffff\1\165\1\175\3\uffff\1"+
        "\3\1\7\1\45\1\112\1\uffff\1\34\1\uffff\1\101\1\uffff\1\66\1\uffff"+
        "\1\107\1\74\1\64\1\62";
    static final String DFA42_specialS =
        "\20\uffff\1\14\113\uffff\1\2\130\uffff\1\7\1\16\1\15\1\5\1\6\1"+
        "\3\1\4\1\11\1\12\1\10\100\uffff\1\13\1\0\66\uffff\1\1\u008d\uffff}>";
    static final String[] DFA42_transitionS = {
            "\2\14\2\uffff\1\14\22\uffff\1\14\1\45\1\20\1\7\1\uffff\1\57"+
            "\1\51\1\17\1\33\1\34\1\54\1\53\1\42\1\10\1\43\1\55\1\15\11\16"+
            "\1\50\1\41\1\4\1\44\1\5\1\47\1\60\32\61\1\37\1\uffff\1\40\1"+
            "\56\1\61\1\uffff\1\21\1\22\1\11\1\2\1\23\1\6\1\24\1\61\1\1\2"+
            "\61\1\25\1\61\1\26\1\3\1\27\1\61\1\30\1\31\1\13\1\61\1\12\1"+
            "\32\3\61\1\35\1\52\1\36\1\46",
            "\1\63\6\uffff\1\64\1\62",
            "\1\66\11\uffff\1\67\11\uffff\1\65",
            "\1\70",
            "\1\71\1\72",
            "\1\75\1\74",
            "\1\103\7\uffff\1\100\2\uffff\1\101\2\uffff\1\102\5\uffff\1"+
            "\77",
            "\1\105\3\uffff\1\104",
            "\1\107\17\uffff\1\110\1\106",
            "\1\112\6\uffff\1\113\3\uffff\1\114\2\uffff\1\115",
            "\1\116\15\uffff\1\117",
            "\1\121\11\uffff\1\122\6\uffff\1\120",
            "",
            "\1\130\1\uffff\10\126\2\131\13\uffff\1\130\6\uffff\1\127\13"+
            "\uffff\1\124\14\uffff\1\130\6\uffff\1\127\13\uffff\1\123",
            "\1\130\1\uffff\12\132\13\uffff\1\130\6\uffff\1\127\30\uffff"+
            "\1\130\6\uffff\1\127",
            "",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\1\137",
            "\1\140\2\uffff\1\141\6\uffff\1\142",
            "\1\143\1\uffff\1\144\11\uffff\1\145",
            "\1\146",
            "\1\147",
            "\1\150\3\uffff\1\151\17\uffff\1\152",
            "\1\153\20\uffff\1\154\2\uffff\1\155",
            "\1\156",
            "\1\157\13\uffff\1\160\1\161\1\uffff\1\162",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164\1\uffff\12\130",
            "\1\166",
            "\1\170",
            "",
            "",
            "",
            "\1\172\26\uffff\1\173",
            "\1\176\76\uffff\1\175",
            "\1\u0080\21\uffff\1\u0081",
            "\1\u0083",
            "\1\u0086\4\uffff\1\u0086\15\uffff\1\u0085",
            "\1\u0088",
            "\1\u008b\27\uffff\1\u008a",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u008d\6"+
            "\61\1\u008e\1\u008f\6\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u0095\5"+
            "\61",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\1\u009a\1\u009b",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2\1\uffff\1\u00a3\3\uffff\1\u00a4",
            "",
            "",
            "",
            "",
            "\1\u00a5\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\2\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\10\uffff\1\u00af",
            "\1\u00b0\23\uffff\1\u00b2\3\uffff\1\u00b1",
            "\12\u00b3\7\uffff\6\u00b3\32\uffff\6\u00b3",
            "\12\u00b3\7\uffff\6\u00b3\32\uffff\6\u00b3",
            "",
            "\1\130\1\uffff\10\126\2\131\13\uffff\1\130\6\uffff\1\127\30"+
            "\uffff\1\130\6\uffff\1\127",
            "",
            "",
            "\1\130\1\uffff\12\131\13\uffff\1\130\37\uffff\1\130",
            "\1\130\1\uffff\12\132\13\uffff\1\130\6\uffff\1\127\30\uffff"+
            "\1\130\6\uffff\1\127",
            "\1\u00bc\4\uffff\1\u00bd\10\uffff\4\u00b6\4\u00b7\44\uffff"+
            "\1\u00be\5\uffff\1\u00b5\3\uffff\1\u00ba\7\uffff\1\u00b9\3\uffff"+
            "\1\u00bb\1\uffff\1\u00b8\1\136",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\5\uffff\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\20\uffff\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "\1\u00d7",
            "",
            "\1\u00d9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00db\1\uffff\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\4\61\1\u00df\25"+
            "\61",
            "",
            "",
            "\1\u00e1\2\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "",
            "",
            "",
            "\1\u00e7",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "",
            "\1\u00f0\16\uffff\1\u00ef",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4\1\u00f5",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00fe",
            "\12\u00b3\7\uffff\6\u00b3\5\uffff\1\127\24\uffff\6\u00b3\5"+
            "\uffff\1\127",
            "",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\15\134\10\u00ff\44"+
            "\134\1\133\uffa3\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\15\134\10\u0100\44"+
            "\134\1\133\uffa3\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "",
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
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "",
            "",
            "",
            "",
            "\1\u0118\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0131",
            "\1\u0132",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0134",
            "\1\u0135",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\134\1\136\2\134\1\136\24\134\1\135\15\134\10\u0137\44"+
            "\134\1\133\uffa3\134",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0141",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f\30\uffff\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\13\61\1\u015b\16"+
            "\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u015f",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0164",
            "",
            "\1\u0165",
            "\1\u0166",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u0167\7"+
            "\61",
            "\1\u0169",
            "",
            "\12\134\1\136\2\134\1\136\24\134\1\135\71\134\1\133\uffa3"+
            "\134",
            "\1\u016a",
            "\1\u016b",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u016d",
            "",
            "",
            "\1\u016e",
            "",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0175",
            "\1\u0176",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0178",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0182",
            "\1\u0183",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "",
            "\1\u018f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0197",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0199",
            "\1\u019b",
            "\1\u019d",
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01a6",
            "\1\u01a7",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01af",
            "",
            "",
            "",
            "\1\u01b0",
            "",
            "",
            "",
            "",
            "",
            "\1\u01b1",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u01ba",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "",
            "\1\u01bc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u01be",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u01c0",
            "",
            "",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
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
            return "1:1: Tokens : ( T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | WS | LONGLITERAL | INTLITERAL | CHARLITERAL | STRINGLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | PERCENTLL | PERCENTBB | PERCENTBBB | GT | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRING );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_256 = input.LA(1);

                        s = -1;
                        if ( (LA42_256=='\"') ) {s = 93;}

                        else if ( (LA42_256=='\\') ) {s = 91;}

                        else if ( ((LA42_256>='\u0000' && LA42_256<='\t')||(LA42_256>='\u000B' && LA42_256<='\f')||(LA42_256>='\u000E' && LA42_256<='!')||(LA42_256>='#' && LA42_256<='[')||(LA42_256>=']' && LA42_256<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_256=='\n'||LA42_256=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_311 = input.LA(1);

                        s = -1;
                        if ( (LA42_311=='\"') ) {s = 93;}

                        else if ( (LA42_311=='\\') ) {s = 91;}

                        else if ( ((LA42_311>='\u0000' && LA42_311<='\t')||(LA42_311>='\u000B' && LA42_311<='\f')||(LA42_311>='\u000E' && LA42_311<='!')||(LA42_311>='#' && LA42_311<='[')||(LA42_311>=']' && LA42_311<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_311=='\n'||LA42_311=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_92 = input.LA(1);

                        s = -1;
                        if ( (LA42_92=='\"') ) {s = 93;}

                        else if ( (LA42_92=='\\') ) {s = 91;}

                        else if ( ((LA42_92>='\u0000' && LA42_92<='\t')||(LA42_92>='\u000B' && LA42_92<='\f')||(LA42_92>='\u000E' && LA42_92<='!')||(LA42_92>='#' && LA42_92<='[')||(LA42_92>=']' && LA42_92<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_92=='\n'||LA42_92=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA42_186 = input.LA(1);

                        s = -1;
                        if ( (LA42_186=='\"') ) {s = 93;}

                        else if ( (LA42_186=='\\') ) {s = 91;}

                        else if ( ((LA42_186>='\u0000' && LA42_186<='\t')||(LA42_186>='\u000B' && LA42_186<='\f')||(LA42_186>='\u000E' && LA42_186<='!')||(LA42_186>='#' && LA42_186<='[')||(LA42_186>=']' && LA42_186<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_186=='\n'||LA42_186=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA42_187 = input.LA(1);

                        s = -1;
                        if ( (LA42_187=='\"') ) {s = 93;}

                        else if ( (LA42_187=='\\') ) {s = 91;}

                        else if ( ((LA42_187>='\u0000' && LA42_187<='\t')||(LA42_187>='\u000B' && LA42_187<='\f')||(LA42_187>='\u000E' && LA42_187<='!')||(LA42_187>='#' && LA42_187<='[')||(LA42_187>=']' && LA42_187<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_187=='\n'||LA42_187=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA42_184 = input.LA(1);

                        s = -1;
                        if ( (LA42_184=='\"') ) {s = 93;}

                        else if ( (LA42_184=='\\') ) {s = 91;}

                        else if ( ((LA42_184>='\u0000' && LA42_184<='\t')||(LA42_184>='\u000B' && LA42_184<='\f')||(LA42_184>='\u000E' && LA42_184<='!')||(LA42_184>='#' && LA42_184<='[')||(LA42_184>=']' && LA42_184<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_184=='\n'||LA42_184=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA42_185 = input.LA(1);

                        s = -1;
                        if ( (LA42_185=='\"') ) {s = 93;}

                        else if ( (LA42_185=='\\') ) {s = 91;}

                        else if ( ((LA42_185>='\u0000' && LA42_185<='\t')||(LA42_185>='\u000B' && LA42_185<='\f')||(LA42_185>='\u000E' && LA42_185<='!')||(LA42_185>='#' && LA42_185<='[')||(LA42_185>=']' && LA42_185<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_185=='\n'||LA42_185=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA42_181 = input.LA(1);

                        s = -1;
                        if ( (LA42_181=='\"') ) {s = 93;}

                        else if ( (LA42_181=='\\') ) {s = 91;}

                        else if ( ((LA42_181>='\u0000' && LA42_181<='\t')||(LA42_181>='\u000B' && LA42_181<='\f')||(LA42_181>='\u000E' && LA42_181<='!')||(LA42_181>='#' && LA42_181<='[')||(LA42_181>=']' && LA42_181<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_181=='\n'||LA42_181=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA42_190 = input.LA(1);

                        s = -1;
                        if ( (LA42_190=='\"') ) {s = 93;}

                        else if ( (LA42_190=='\\') ) {s = 91;}

                        else if ( ((LA42_190>='\u0000' && LA42_190<='\t')||(LA42_190>='\u000B' && LA42_190<='\f')||(LA42_190>='\u000E' && LA42_190<='!')||(LA42_190>='#' && LA42_190<='[')||(LA42_190>=']' && LA42_190<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_190=='\n'||LA42_190=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA42_188 = input.LA(1);

                        s = -1;
                        if ( (LA42_188=='\"') ) {s = 93;}

                        else if ( (LA42_188=='\\') ) {s = 91;}

                        else if ( ((LA42_188>='\u0000' && LA42_188<='\t')||(LA42_188>='\u000B' && LA42_188<='\f')||(LA42_188>='\u000E' && LA42_188<='!')||(LA42_188>='#' && LA42_188<='[')||(LA42_188>=']' && LA42_188<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_188=='\n'||LA42_188=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA42_189 = input.LA(1);

                        s = -1;
                        if ( (LA42_189=='\"') ) {s = 93;}

                        else if ( (LA42_189=='\\') ) {s = 91;}

                        else if ( ((LA42_189>='\u0000' && LA42_189<='\t')||(LA42_189>='\u000B' && LA42_189<='\f')||(LA42_189>='\u000E' && LA42_189<='!')||(LA42_189>='#' && LA42_189<='[')||(LA42_189>=']' && LA42_189<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_189=='\n'||LA42_189=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA42_255 = input.LA(1);

                        s = -1;
                        if ( (LA42_255=='\"') ) {s = 93;}

                        else if ( (LA42_255=='\\') ) {s = 91;}

                        else if ( ((LA42_255>='0' && LA42_255<='7')) ) {s = 311;}

                        else if ( (LA42_255=='\n'||LA42_255=='\r') ) {s = 94;}

                        else if ( ((LA42_255>='\u0000' && LA42_255<='\t')||(LA42_255>='\u000B' && LA42_255<='\f')||(LA42_255>='\u000E' && LA42_255<='!')||(LA42_255>='#' && LA42_255<='/')||(LA42_255>='8' && LA42_255<='[')||(LA42_255>=']' && LA42_255<='\uFFFF')) ) {s = 92;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA42_16 = input.LA(1);

                        s = -1;
                        if ( (LA42_16=='\\') ) {s = 91;}

                        else if ( ((LA42_16>='\u0000' && LA42_16<='\t')||(LA42_16>='\u000B' && LA42_16<='\f')||(LA42_16>='\u000E' && LA42_16<='!')||(LA42_16>='#' && LA42_16<='[')||(LA42_16>=']' && LA42_16<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_16=='\"') ) {s = 93;}

                        else if ( (LA42_16=='\n'||LA42_16=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA42_183 = input.LA(1);

                        s = -1;
                        if ( ((LA42_183>='0' && LA42_183<='7')) ) {s = 256;}

                        else if ( (LA42_183=='\"') ) {s = 93;}

                        else if ( (LA42_183=='\\') ) {s = 91;}

                        else if ( ((LA42_183>='\u0000' && LA42_183<='\t')||(LA42_183>='\u000B' && LA42_183<='\f')||(LA42_183>='\u000E' && LA42_183<='!')||(LA42_183>='#' && LA42_183<='/')||(LA42_183>='8' && LA42_183<='[')||(LA42_183>=']' && LA42_183<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_183=='\n'||LA42_183=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA42_182 = input.LA(1);

                        s = -1;
                        if ( ((LA42_182>='0' && LA42_182<='7')) ) {s = 255;}

                        else if ( (LA42_182=='\"') ) {s = 93;}

                        else if ( (LA42_182=='\\') ) {s = 91;}

                        else if ( ((LA42_182>='\u0000' && LA42_182<='\t')||(LA42_182>='\u000B' && LA42_182<='\f')||(LA42_182>='\u000E' && LA42_182<='!')||(LA42_182>='#' && LA42_182<='/')||(LA42_182>='8' && LA42_182<='[')||(LA42_182>=']' && LA42_182<='\uFFFF')) ) {s = 92;}

                        else if ( (LA42_182=='\n'||LA42_182=='\r') ) {s = 94;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}