// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g 2010-05-02 19:20:51

package haxe.imp.parser.antlr.main;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class TinyHaxeTry1Lexer extends Lexer {
	public static final int CAST = 90;
	public static final int PACKAGE = 15;
	public static final int FUNCTION = 34;
	public static final int EXPONENT = 152;
	public static final int LT = 49;
	public static final int STAR = 82;
	public static final int WHILE = 54;
	public static final int FLOATNUM = 103;
	public static final int CONST = 117;
	public static final int OCTAL_ESC = 156;
	public static final int CASE = 64;
	public static final int CHAR = 116;
	public static final int NEW = 89;
	public static final int EXTERN = 93;
	public static final int DO = 55;
	public static final int EOF = -1;
	public static final int GTGT = 78;
	public static final int BREAK = 62;
	public static final int LBRACKET = 37;
	public static final int RPAREN = 36;
	public static final int FINAL = 119;
	public static final int IMPORT = 19;
	public static final int SUBSUB = 85;
	public static final int STAREQ = 135;
	public static final int CARET = 76;
	public static final int RETURN = 60;
	public static final int THIS = 131;
	public static final int DOUBLE = 118;
	public static final int MONKEYS_AT = 144;
	public static final int BARBAR = 68;
	public static final int VAR = 92;
	public static final int VOID = 47;
	public static final int SUPER = 130;
	public static final int EQ = 28;
	public static final int GOTO = 122;
	public static final int AMPAMP = 69;
	public static final int COMMENT = 153;
	public static final int VAR_INIT = 13;
	public static final int QUES = 27;
	public static final int LTLTEQ = 148;
	public static final int EQEQ = 70;
	public static final int HexPrefix = 109;
	public static final int PP_IF = 39;
	public static final int PERCENTDBBQ = 140;
	public static final int RBRACE = 59;
	public static final int STATIC = 22;
	public static final int PRIVATE = 21;
	public static final int BLOCK_SCOPE = 7;
	public static final int SWITCH = 57;
	public static final int NULL = 88;
	public static final int GTGTEQ = 149;
	public static final int STRICTFP = 129;
	public static final int ELSE = 51;
	public static final int NATIVE = 126;
	public static final int ELLIPSIS = 67;
	public static final int THROWS = 132;
	public static final int INT = 124;
	public static final int SLASHEQ = 31;
	public static final int INTLITERAL = 100;
	public static final int PERCENTBB = 146;
	public static final int TRY = 56;
	public static final int LongSuffix = 108;
	public static final int LONGLITERAL = 99;
	public static final int PERCENTLL = 145;
	public static final int BANGEQQ = 143;
	public static final int WS = 106;
	public static final int PERCENTDLQ = 138;
	public static final int INHERIT_LIST_OPT = 11;
	public static final int CHARLITERAL = 102;
	public static final int GT = 48;
	public static final int INLINE = 23;
	public static final int CATCH = 66;
	public static final int FALSE = 105;
	public static final int EscapeSequence = 112;
	public static final int THROW = 61;
	public static final int DYNAMIC = 24;
	public static final int PROTECTED = 127;
	public static final int CLASS = 94;
	public static final int PP_ELSEIF = 41;
	public static final int BAREQ = 136;
	public static final int PP_ELSE = 42;
	public static final int IntegerNumber = 107;
	public static final int AMP = 75;
	public static final int PLUSPLUS = 86;
	public static final int LBRACE = 58;
	public static final int TYPE_PARAM_OPT = 10;
	public static final int LTEQ = 73;
	public static final int SUBEQ = 30;
	public static final int GTGTGT = 79;
	public static final int FOR = 52;
	public static final int Exponent = 111;
	public static final int SUB = 81;
	public static final int SUFFIX_EXPR = 6;
	public static final int FLOAT = 121;
	public static final int ABSTRACT = 113;
	public static final int MINUS_BIGGER = 46;
	public static final int PERCENTDBQ = 139;
	public static final int HexDigit = 110;
	public static final int PLUSEQ = 29;
	public static final int LPAREN = 35;
	public static final int IF = 50;
	public static final int INTNUM = 151;
	public static final int SLASH = 83;
	public static final int PP_END = 43;
	public static final int BOOLEAN = 114;
	public static final int ESC_SEQ = 157;
	public static final int IN = 53;
	public static final int IMPLEMENTS = 97;
	public static final int GTGTGTEQ = 150;
	public static final int CONTINUE = 63;
	public static final int COMMA = 26;
	public static final int AMPEQ = 33;
	public static final int IDENTIFIER = 17;
	public static final int TRANSIENT = 133;
	public static final int TILDE = 87;
	public static final int BANGEQ = 71;
	public static final int PLUS = 80;
	public static final int RBRACKET = 38;
	public static final int DOT = 18;
	public static final int LTLT = 77;
	public static final int BYTE = 115;
	public static final int PERCENT = 84;
	public static final int VOLATILE = 134;
	public static final int DECL_ATTR_LIST = 12;
	public static final int ASSIGN_OPERATOR = 14;
	public static final int TYPEDEF = 98;
	public static final int UNICODE_ESC = 155;
	public static final int DEFAULT = 65;
	public static final int EQEQEQ = 141;
	public static final int HEX_DIGIT = 154;
	public static final int SHORT = 128;
	public static final int BANG = 40;
	public static final int INSTANCEOF = 123;
	public static final int GTEQ = 72;
	public static final int PP_ERROR = 44;
	public static final int MODULE = 5;
	public static final int SEMI = 16;
	public static final int TRUE = 104;
	public static final int COLON = 45;
	public static final int PARAM_LIST = 8;
	public static final int PERCENTLESQ = 142;
	public static final int ENUM = 91;
	public static final int PERCENTEQ = 32;
	public static final int FINALLY = 120;
	public static final int PROPERTY_DECL = 4;
	public static final int OVERRIDE = 25;
	public static final int STRINGLITERAL = 101;
	public static final int CARETEQ = 137;
	public static final int PERCENTBBB = 147;
	public static final int INTERFACE = 95;
	public static final int LONG = 125;
	public static final int PUBLIC = 20;
	public static final int EXTENDS = 96;
	public static final int TYPE_TAG = 9;
	public static final int BAR = 74;

	// delegates
	// delegators

	public TinyHaxeTry1Lexer() {
		;
	}

	public TinyHaxeTry1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public TinyHaxeTry1Lexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	@Override
	public String getGrammarFileName() {
		return "C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g";
	}

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:434:5:
			// ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:434:9:
			// ( ' ' | '\\t' | '\\r' | '\\n' )
			{
				if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
						|| input.LA(1) == '\r' || input.LA(1) == ' ') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				_channel = HIDDEN;

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WS"

	// $ANTLR start "LONGLITERAL"
	public final void mLONGLITERAL() throws RecognitionException {
		try {
			int _type = LONGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:445:5:
			// ( IntegerNumber LongSuffix )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:445:9:
			// IntegerNumber LongSuffix
			{
				mIntegerNumber();
				mLongSuffix();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LONGLITERAL"

	// $ANTLR start "INTLITERAL"
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:450:5:
			// ( IntegerNumber )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:450:9:
			// IntegerNumber
			{
				mIntegerNumber();

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INTLITERAL"

	// $ANTLR start "IntegerNumber"
	public final void mIntegerNumber() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:455:5:
			// ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ |
			// HexPrefix ( HexDigit )+ )
			int alt4 = 4;
			int LA4_0 = input.LA(1);

			if ((LA4_0 == '0')) {
				switch (input.LA(2)) {
				case 'X':
				case 'x': {
					alt4 = 4;
				}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7': {
					alt4 = 3;
				}
					break;
				default:
					alt4 = 1;
				}

			} else if (((LA4_0 >= '1' && LA4_0 <= '9'))) {
				alt4 = 2;
			} else {
				NoViableAltException nvae = new NoViableAltException("", 4, 0,
						input);

				throw nvae;
			}
			switch (alt4) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:455:9:
				// '0'
			{
				match('0');

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:456:9:
				// '1' .. '9' ( '0' .. '9' )*
			{
				matchRange('1', '9');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:456:18:
				// ( '0' .. '9' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:456:19:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:457:9:
				// '0' ( '0' .. '7' )+
			{
				match('0');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:457:13:
				// ( '0' .. '7' )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if (((LA2_0 >= '0' && LA2_0 <= '7'))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:457:14:
						// '0' .. '7'
					{
						matchRange('0', '7');

					}
						break;

					default:
						if (cnt2 >= 1)
							break loop2;
						EarlyExitException eee = new EarlyExitException(2,
								input);
						throw eee;
					}
					cnt2++;
				} while (true);

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:458:9:
				// HexPrefix ( HexDigit )+
			{
				mHexPrefix();
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:458:19:
				// ( HexDigit )+
				int cnt3 = 0;
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if (((LA3_0 >= '0' && LA3_0 <= '9')
							|| (LA3_0 >= 'A' && LA3_0 <= 'F') || (LA3_0 >= 'a' && LA3_0 <= 'f'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:458:19:
						// HexDigit
					{
						mHexDigit();

					}
						break;

					default:
						if (cnt3 >= 1)
							break loop3;
						EarlyExitException eee = new EarlyExitException(3,
								input);
						throw eee;
					}
					cnt3++;
				} while (true);

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end "IntegerNumber"

	// $ANTLR start "HexPrefix"
	public final void mHexPrefix() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:463:5:
			// ( '0x' | '0X' )
			int alt5 = 2;
			int LA5_0 = input.LA(1);

			if ((LA5_0 == '0')) {
				int LA5_1 = input.LA(2);

				if ((LA5_1 == 'x')) {
					alt5 = 1;
				} else if ((LA5_1 == 'X')) {
					alt5 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 5,
							1, input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 5, 0,
						input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:463:9:
				// '0x'
			{
				match("0x");

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:463:16:
				// '0X'
			{
				match("0X");

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end "HexPrefix"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:468:5:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:468:9:
			// ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			{
				if ((input.LA(1) >= '0' && input.LA(1) <= '9')
						|| (input.LA(1) >= 'A' && input.LA(1) <= 'F')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "HexDigit"

	// $ANTLR start "LongSuffix"
	public final void mLongSuffix() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:473:5:
			// ( 'l' | 'L' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
			{
				if (input.LA(1) == 'L' || input.LA(1) == 'l') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "LongSuffix"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:478:5:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:478:9:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:478:23:
				// ( '+' | '-' )?
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if ((LA6_0 == '+' || LA6_0 == '-')) {
					alt6 = 1;
				}
				switch (alt6) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

				}
					break;

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:478:38:
				// ( '0' .. '9' )+
				int cnt7 = 0;
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 >= '0' && LA7_0 <= '9'))) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:478:40:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt7 >= 1)
							break loop7;
						EarlyExitException eee = new EarlyExitException(7,
								input);
						throw eee;
					}
					cnt7++;
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end "Exponent"

	// $ANTLR start "CHARLITERAL"
	public final void mCHARLITERAL() throws RecognitionException {
		try {
			int _type = CHARLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:482:5:
			// ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\'' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:482:9:
			// '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\''
			{
				match('\'');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:483:9:
				// ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
				int alt8 = 2;
				int LA8_0 = input.LA(1);

				if ((LA8_0 == '\\')) {
					alt8 = 1;
				} else if (((LA8_0 >= '\u0000' && LA8_0 <= '\t')
						|| (LA8_0 >= '\u000B' && LA8_0 <= '\f')
						|| (LA8_0 >= '\u000E' && LA8_0 <= '&')
						|| (LA8_0 >= '(' && LA8_0 <= '[') || (LA8_0 >= ']' && LA8_0 <= '\uFFFF'))) {
					alt8 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 8,
							0, input);

					throw nvae;
				}
				switch (alt8) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:483:13:
					// EscapeSequence
				{
					mEscapeSequence();

				}
					break;
				case 2:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:484:13:
					// ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
				{
					if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
							|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
							|| (input.LA(1) >= '\u000E' && input.LA(1) <= '&')
							|| (input.LA(1) >= '(' && input.LA(1) <= '[')
							|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
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
		} finally {
		}
	}

	// $ANTLR end "CHARLITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:492:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\'
			// | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:492:9:
			// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' |
			// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) )
			{
				match('\\');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:492:14:
				// ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | (
				// '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
				// '0' .. '7' ) | ( '0' .. '7' ) )
				int alt9 = 11;
				alt9 = dfa9.predict(input);
				switch (alt9) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:493:18:
					// 'b'
				{
					match('b');

				}
					break;
				case 2:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:494:18:
					// 't'
				{
					match('t');

				}
					break;
				case 3:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:495:18:
					// 'n'
				{
					match('n');

				}
					break;
				case 4:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:496:18:
					// 'f'
				{
					match('f');

				}
					break;
				case 5:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:497:18:
					// 'r'
				{
					match('r');

				}
					break;
				case 6:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:498:18:
					// '\\\"'
				{
					match('\"');

				}
					break;
				case 7:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:499:18:
					// '\\''
				{
					match('\'');

				}
					break;
				case 8:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:500:18:
					// '\\\\'
				{
					match('\\');

				}
					break;
				case 9:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:18:
					// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:18:
					// ( '0' .. '3' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:19:
					// '0' .. '3'
					{
						matchRange('0', '3');

					}

					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:29:
					// ( '0' .. '7' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:30:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:40:
					// ( '0' .. '7' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:502:41:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

				}
					break;
				case 10:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:504:18:
					// ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:504:18:
					// ( '0' .. '7' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:504:19:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:504:29:
					// ( '0' .. '7' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:504:30:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

				}
					break;
				case 11:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:506:18:
					// ( '0' .. '7' )
				{
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:506:18:
					// ( '0' .. '7' )
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:506:19:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

				}
					break;

				}

			}

		} finally {
		}
	}

	// $ANTLR end "EscapeSequence"

	// $ANTLR start "ABSTRACT"
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:511:5:
			// ( 'abstract' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:511:9:
			// 'abstract'
			{
				match("abstract");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ABSTRACT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:515:5:
			// ( 'boolean' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:515:9:
			// 'boolean'
			{
				match("boolean");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:519:5:
			// ( 'break' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:519:9:
			// 'break'
			{
				match("break");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BREAK"

	// $ANTLR start "BYTE"
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:523:5:
			// ( 'byte' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:523:9:
			// 'byte'
			{
				match("byte");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BYTE"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:527:5:
			// ( 'case' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:527:9:
			// 'case'
			{
				match("case");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CASE"

	// $ANTLR start "CATCH"
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:531:5:
			// ( 'catch' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:531:9:
			// 'catch'
			{
				match("catch");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CATCH"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:535:5:
			// ( 'char' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:535:9:
			// 'char'
			{
				match("char");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CHAR"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:539:5:
			// ( 'class' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:539:9:
			// 'class'
			{
				match("class");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CLASS"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:543:5:
			// ( 'const' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:543:9:
			// 'const'
			{
				match("const");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CONST"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:547:5:
			// ( 'continue' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:547:9:
			// 'continue'
			{
				match("continue");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CONTINUE"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:551:5:
			// ( 'default' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:551:9:
			// 'default'
			{
				match("default");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DEFAULT"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:555:5:
			// ( 'do' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:555:9:
			// 'do'
			{
				match("do");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DO"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:559:5:
			// ( 'double' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:559:9:
			// 'double'
			{
				match("double");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DOUBLE"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:563:5:
			// ( 'else' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:563:9:
			// 'else'
			{
				match("else");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ELSE"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:567:5:
			// ( 'enum' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:567:9:
			// 'enum'
			{
				match("enum");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ENUM"

	// $ANTLR start "EXTENDS"
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:571:5:
			// ( 'extends' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:571:9:
			// 'extends'
			{
				match("extends");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EXTENDS"

	// $ANTLR start "FINAL"
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:575:5:
			// ( 'final' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:575:9:
			// 'final'
			{
				match("final");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FINAL"

	// $ANTLR start "FINALLY"
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:579:5:
			// ( 'finally' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:579:9:
			// 'finally'
			{
				match("finally");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FINALLY"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:583:5:
			// ( 'float' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:583:9:
			// 'float'
			{
				match("float");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FLOAT"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:587:5:
			// ( 'for' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:587:9:
			// 'for'
			{
				match("for");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FOR"

	// $ANTLR start "GOTO"
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:591:5:
			// ( 'goto' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:591:9:
			// 'goto'
			{
				match("goto");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GOTO"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:595:5:
			// ( 'if' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:595:9:
			// 'if'
			{
				match("if");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IF"

	// $ANTLR start "IMPLEMENTS"
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:599:5:
			// ( 'implements' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:599:9:
			// 'implements'
			{
				match("implements");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IMPLEMENTS"

	// $ANTLR start "IMPORT"
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:603:5:
			// ( 'import' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:603:9:
			// 'import'
			{
				match("import");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IMPORT"

	// $ANTLR start "INSTANCEOF"
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:607:5:
			// ( 'instanceof' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:607:9:
			// 'instanceof'
			{
				match("instanceof");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INSTANCEOF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:611:5:
			// ( 'int' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:611:9:
			// 'int'
			{
				match("int");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INT"

	// $ANTLR start "INTERFACE"
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:615:5:
			// ( 'interface' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:615:9:
			// 'interface'
			{
				match("interface");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INTERFACE"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:619:5:
			// ( 'long' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:619:9:
			// 'long'
			{
				match("long");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LONG"

	// $ANTLR start "NATIVE"
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:623:5:
			// ( 'native' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:623:9:
			// 'native'
			{
				match("native");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NATIVE"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:627:5:
			// ( 'new' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:627:9:
			// 'new'
			{
				match("new");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NEW"

	// $ANTLR start "PACKAGE"
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:631:5:
			// ( 'package' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:631:9:
			// 'package'
			{
				match("package");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PACKAGE"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:635:5:
			// ( 'private' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:635:9:
			// 'private'
			{
				match("private");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:639:5:
			// ( 'protected' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:639:9:
			// 'protected'
			{
				match("protected");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PROTECTED"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:643:5:
			// ( 'public' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:643:9:
			// 'public'
			{
				match("public");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PUBLIC"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:647:5:
			// ( 'return' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:647:9:
			// 'return'
			{
				match("return");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RETURN"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:651:5:
			// ( 'short' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:651:9:
			// 'short'
			{
				match("short");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SHORT"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:655:5:
			// ( 'static' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:655:9:
			// 'static'
			{
				match("static");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STATIC"

	// $ANTLR start "INLINE"
	public final void mINLINE() throws RecognitionException {
		try {
			int _type = INLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:659:2:
			// ( 'inline' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:659:4:
			// 'inline'
			{
				match("inline");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INLINE"

	// $ANTLR start "DYNAMIC"
	public final void mDYNAMIC() throws RecognitionException {
		try {
			int _type = DYNAMIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:663:2:
			// ( 'dynamic' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:663:3:
			// 'dynamic'
			{
				match("dynamic");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DYNAMIC"

	// $ANTLR start "OVERRIDE"
	public final void mOVERRIDE() throws RecognitionException {
		try {
			int _type = OVERRIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:667:2:
			// ( 'override' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:667:3:
			// 'override'
			{
				match("override");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "OVERRIDE"

	// $ANTLR start "STRICTFP"
	public final void mSTRICTFP() throws RecognitionException {
		try {
			int _type = STRICTFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:671:5:
			// ( 'strictfp' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:671:9:
			// 'strictfp'
			{
				match("strictfp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STRICTFP"

	// $ANTLR start "SUPER"
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:675:5:
			// ( 'super' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:675:9:
			// 'super'
			{
				match("super");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SUPER"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:679:5:
			// ( 'switch' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:679:9:
			// 'switch'
			{
				match("switch");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SWITCH"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:683:5:
			// ( 'this' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:683:9:
			// 'this'
			{
				match("this");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THIS"

	// $ANTLR start "THROW"
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:687:5:
			// ( 'throw' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:687:9:
			// 'throw'
			{
				match("throw");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THROW"

	// $ANTLR start "THROWS"
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:691:5:
			// ( 'throws' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:691:9:
			// 'throws'
			{
				match("throws");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "THROWS"

	// $ANTLR start "TRANSIENT"
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:695:5:
			// ( 'transient' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:695:9:
			// 'transient'
			{
				match("transient");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TRANSIENT"

	// $ANTLR start "TRY"
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:699:5:
			// ( 'try' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:699:9:
			// 'try'
			{
				match("try");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TRY"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:703:5:
			// ( 'void' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:703:9:
			// 'void'
			{
				match("void");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VOID"

	// $ANTLR start "VOLATILE"
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:707:5:
			// ( 'volatile' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:707:9:
			// 'volatile'
			{
				match("volatile");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VOLATILE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:711:5:
			// ( 'while' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:711:9:
			// 'while'
			{
				match("while");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "WHILE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:715:5:
			// ( 'true' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:715:9:
			// 'true'
			{
				match("true");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:719:5:
			// ( 'false' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:719:9:
			// 'false'
			{
				match("false");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FALSE"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:723:5:
			// ( 'null' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:723:9:
			// 'null'
			{
				match("null");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "NULL"

	// $ANTLR start "CAST"
	public final void mCAST() throws RecognitionException {
		try {
			int _type = CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:725:6:
			// ( 'cast' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:725:8:
			// 'cast'
			{
				match("cast");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CAST"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:729:2:
			// ( 'function' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:729:4:
			// 'function'
			{
				match("function");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FUNCTION"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:732:4:
			// ( 'in' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:732:6:
			// 'in'
			{
				match("in");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IN"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:734:5:
			// ( 'var' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:734:7:
			// 'var'
			{
				match("var");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VAR"

	// $ANTLR start "TYPEDEF"
	public final void mTYPEDEF() throws RecognitionException {
		try {
			int _type = TYPEDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:736:9:
			// ( 'typedef' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:736:11:
			// 'typedef'
			{
				match("typedef");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TYPEDEF"

	// $ANTLR start "EXTERN"
	public final void mEXTERN() throws RecognitionException {
		try {
			int _type = EXTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:738:8:
			// ( 'extern' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:738:10:
			// 'extern'
			{
				match("extern");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EXTERN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:742:5:
			// ( '(' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:742:9:
			// '('
			{
				match('(');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:746:5:
			// ( ')' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:746:9:
			// ')'
			{
				match(')');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:750:5:
			// ( '{' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:750:9:
			// '{'
			{
				match('{');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:754:5:
			// ( '}' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:754:9:
			// '}'
			{
				match('}');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RBRACE"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:758:5:
			// ( '[' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:758:9:
			// '['
			{
				match('[');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:762:5:
			// ( ']' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:762:9:
			// ']'
			{
				match(']');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "RBRACKET"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:766:5:
			// ( ';' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:766:9:
			// ';'
			{
				match(';');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SEMI"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:770:5:
			// ( ',' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:770:9:
			// ','
			{
				match(',');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COMMA"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:774:5:
			// ( '.' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:774:9:
			// '.'
			{
				match('.');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "DOT"

	// $ANTLR start "ELLIPSIS"
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:778:5:
			// ( '...' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:778:9:
			// '...'
			{
				match("...");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "ELLIPSIS"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:782:5:
			// ( '=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:782:9:
			// '='
			{
				match('=');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EQ"

	// $ANTLR start "BANG"
	public final void mBANG() throws RecognitionException {
		try {
			int _type = BANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:786:5:
			// ( '!' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:786:9:
			// '!'
			{
				match('!');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BANG"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:790:5:
			// ( '~' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:790:9:
			// '~'
			{
				match('~');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "TILDE"

	// $ANTLR start "QUES"
	public final void mQUES() throws RecognitionException {
		try {
			int _type = QUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:794:5:
			// ( '?' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:794:9:
			// '?'
			{
				match('?');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "QUES"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:798:5:
			// ( ':' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:798:9:
			// ':'
			{
				match(':');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COLON"

	// $ANTLR start "EQEQ"
	public final void mEQEQ() throws RecognitionException {
		try {
			int _type = EQEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:802:5:
			// ( '==' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:802:9:
			// '=='
			{
				match("==");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EQEQ"

	// $ANTLR start "AMPAMP"
	public final void mAMPAMP() throws RecognitionException {
		try {
			int _type = AMPAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:806:5:
			// ( '&&' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:806:9:
			// '&&'
			{
				match("&&");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "AMPAMP"

	// $ANTLR start "BARBAR"
	public final void mBARBAR() throws RecognitionException {
		try {
			int _type = BARBAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:810:5:
			// ( '||' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:810:9:
			// '||'
			{
				match("||");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BARBAR"

	// $ANTLR start "PLUSPLUS"
	public final void mPLUSPLUS() throws RecognitionException {
		try {
			int _type = PLUSPLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:814:5:
			// ( '++' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:814:9:
			// '++'
			{
				match("++");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PLUSPLUS"

	// $ANTLR start "SUBSUB"
	public final void mSUBSUB() throws RecognitionException {
		try {
			int _type = SUBSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:818:5:
			// ( '--' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:818:9:
			// '--'
			{
				match("--");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SUBSUB"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:822:5:
			// ( '+' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:822:9:
			// '+'
			{
				match('+');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PLUS"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:826:5:
			// ( '-' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:826:9:
			// '-'
			{
				match('-');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SUB"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:830:5:
			// ( '*' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:830:9:
			// '*'
			{
				match('*');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STAR"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:834:5:
			// ( '/' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:834:9:
			// '/'
			{
				match('/');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SLASH"

	// $ANTLR start "AMP"
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:838:5:
			// ( '&' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:838:9:
			// '&'
			{
				match('&');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "AMP"

	// $ANTLR start "BAR"
	public final void mBAR() throws RecognitionException {
		try {
			int _type = BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:842:5:
			// ( '|' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:842:9:
			// '|'
			{
				match('|');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BAR"

	// $ANTLR start "CARET"
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:846:5:
			// ( '^' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:846:9:
			// '^'
			{
				match('^');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CARET"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:850:5:
			// ( '%' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:850:9:
			// '%'
			{
				match('%');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENT"

	// $ANTLR start "PLUSEQ"
	public final void mPLUSEQ() throws RecognitionException {
		try {
			int _type = PLUSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:854:5:
			// ( '+=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:854:9:
			// '+='
			{
				match("+=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PLUSEQ"

	// $ANTLR start "SUBEQ"
	public final void mSUBEQ() throws RecognitionException {
		try {
			int _type = SUBEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:858:5:
			// ( '-=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:858:9:
			// '-='
			{
				match("-=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SUBEQ"

	// $ANTLR start "STAREQ"
	public final void mSTAREQ() throws RecognitionException {
		try {
			int _type = STAREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:862:5:
			// ( '*=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:862:9:
			// '*='
			{
				match("*=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STAREQ"

	// $ANTLR start "SLASHEQ"
	public final void mSLASHEQ() throws RecognitionException {
		try {
			int _type = SLASHEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:866:5:
			// ( '/=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:866:9:
			// '/='
			{
				match("/=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "SLASHEQ"

	// $ANTLR start "AMPEQ"
	public final void mAMPEQ() throws RecognitionException {
		try {
			int _type = AMPEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:870:5:
			// ( '&=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:870:9:
			// '&='
			{
				match("&=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "AMPEQ"

	// $ANTLR start "BAREQ"
	public final void mBAREQ() throws RecognitionException {
		try {
			int _type = BAREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:874:5:
			// ( '|=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:874:9:
			// '|='
			{
				match("|=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BAREQ"

	// $ANTLR start "CARETEQ"
	public final void mCARETEQ() throws RecognitionException {
		try {
			int _type = CARETEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:878:5:
			// ( '^=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:878:9:
			// '^='
			{
				match("^=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "CARETEQ"

	// $ANTLR start "PERCENTEQ"
	public final void mPERCENTEQ() throws RecognitionException {
		try {
			int _type = PERCENTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:882:5:
			// ( '%=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:882:9:
			// '%='
			{
				match("%=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTEQ"

	// $ANTLR start "PERCENTDLQ"
	public final void mPERCENTDLQ() throws RecognitionException {
		try {
			int _type = PERCENTDLQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:886:2:
			// ( '%%<<%%=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:886:4:
			// '%%<<%%='
			{
				match("%%<<%%=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTDLQ"

	// $ANTLR start "PERCENTDBQ"
	public final void mPERCENTDBQ() throws RecognitionException {
		try {
			int _type = PERCENTDBQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:889:2:
			// ( '%%>>%%=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:889:4:
			// '%%>>%%='
			{
				match("%%>>%%=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTDBQ"

	// $ANTLR start "PERCENTDBBQ"
	public final void mPERCENTDBBQ() throws RecognitionException {
		try {
			int _type = PERCENTDBBQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:892:2:
			// ( '%%>>>%%=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:892:4:
			// '%%>>>%%='
			{
				match("%%>>>%%=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTDBBQ"

	// $ANTLR start "EQEQEQ"
	public final void mEQEQEQ() throws RecognitionException {
		try {
			int _type = EQEQEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:895:2:
			// ( '===' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:895:3:
			// '==='
			{
				match("===");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "EQEQEQ"

	// $ANTLR start "PERCENTLESQ"
	public final void mPERCENTLESQ() throws RecognitionException {
		try {
			int _type = PERCENTLESQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:899:1:
			// ( '%%<=%%' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:899:3:
			// '%%<=%%'
			{
				match("%%<=%%");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTLESQ"

	// $ANTLR start "BANGEQQ"
	public final void mBANGEQQ() throws RecognitionException {
		try {
			int _type = BANGEQQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:903:2:
			// ( '!==' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:903:3:
			// '!=='
			{
				match("!==");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BANGEQQ"

	// $ANTLR start "MONKEYS_AT"
	public final void mMONKEYS_AT() throws RecognitionException {
		try {
			int _type = MONKEYS_AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:907:5:
			// ( '@' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:907:9:
			// '@'
			{
				match('@');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "MONKEYS_AT"

	// $ANTLR start "BANGEQ"
	public final void mBANGEQ() throws RecognitionException {
		try {
			int _type = BANGEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:911:5:
			// ( '!=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:911:9:
			// '!='
			{
				match("!=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BANGEQ"

	// $ANTLR start "MINUS_BIGGER"
	public final void mMINUS_BIGGER() throws RecognitionException {
		try {
			int _type = MINUS_BIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:914:2:
			// ( '->' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:914:4:
			// '->'
			{
				match("->");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "MINUS_BIGGER"

	// $ANTLR start "PERCENTLL"
	public final void mPERCENTLL() throws RecognitionException {
		try {
			int _type = PERCENTLL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:918:2:
			// ( '%%<<%%' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:918:3:
			// '%%<<%%'
			{
				match("%%<<%%");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTLL"

	// $ANTLR start "PERCENTBB"
	public final void mPERCENTBB() throws RecognitionException {
		try {
			int _type = PERCENTBB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:921:2:
			// ( '%%>>%%' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:921:3:
			// '%%>>%%'
			{
				match("%%>>%%");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTBB"

	// $ANTLR start "PERCENTBBB"
	public final void mPERCENTBBB() throws RecognitionException {
		try {
			int _type = PERCENTBBB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:924:2:
			// ( '%%>>>%%' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:924:3:
			// '%%>>>%%'
			{
				match("%%>>>%%");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PERCENTBBB"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:927:5:
			// ( '>' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:927:9:
			// '>'
			{
				match('>');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GT"

	// $ANTLR start "GTGT"
	public final void mGTGT() throws RecognitionException {
		try {
			int _type = GTGT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:929:6:
			// ( '>>' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:929:8:
			// '>>'
			{
				match(">>");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GTGT"

	// $ANTLR start "LTLT"
	public final void mLTLT() throws RecognitionException {
		try {
			int _type = LTLT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:931:6:
			// ( '<<' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:931:8:
			// '<<'
			{
				match("<<");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LTLT"

	// $ANTLR start "GTGTGT"
	public final void mGTGTGT() throws RecognitionException {
		try {
			int _type = GTGTGT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:933:8:
			// ( '>>>' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:933:10:
			// '>>>'
			{
				match(">>>");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GTGTGT"

	// $ANTLR start "LTLTEQ"
	public final void mLTLTEQ() throws RecognitionException {
		try {
			int _type = LTLTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:936:8:
			// ( '<<=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:936:10:
			// '<<='
			{
				match("<<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LTLTEQ"

	// $ANTLR start "GTGTEQ"
	public final void mGTGTEQ() throws RecognitionException {
		try {
			int _type = GTGTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:939:8:
			// ( '>>=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:939:10:
			// '>>='
			{
				match(">>=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GTGTEQ"

	// $ANTLR start "GTGTGTEQ"
	public final void mGTGTGTEQ() throws RecognitionException {
		try {
			int _type = GTGTGTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:942:9:
			// ( '>>>=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:942:11:
			// '>>>='
			{
				match(">>>=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GTGTGTEQ"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:945:6:
			// ( '>=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:945:8:
			// '>='
			{
				match(">=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "GTEQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:947:6:
			// ( '<=' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:947:8:
			// '<='
			{
				match("<=");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LTEQ"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:951:5:
			// ( '<' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:951:9:
			// '<'
			{
				match('<');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "LT"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:955:5:
			// ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' |
			// '0' .. '9' | '_' )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:955:8:
			// ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0'
			// .. '9' | '_' )*
			{
				if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
						|| input.LA(1) == '_'
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:955:32:
				// ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if (((LA10_0 >= '0' && LA10_0 <= '9')
							|| (LA10_0 >= 'A' && LA10_0 <= 'Z')
							|| LA10_0 == '_' || (LA10_0 >= 'a' && LA10_0 <= 'z'))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
					{
						if ((input.LA(1) >= '0' && input.LA(1) <= '9')
								|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
								|| input.LA(1) == '_'
								|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop10;
					}
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "INTNUM"
	public final void mINTNUM() throws RecognitionException {
		try {
			int _type = INTNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:958:8:
			// ( ( '0' .. '9' )+ )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:958:10:
			// ( '0' .. '9' )+
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:958:10:
				// ( '0' .. '9' )+
				int cnt11 = 0;
				loop11: do {
					int alt11 = 2;
					int LA11_0 = input.LA(1);

					if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:958:10:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt11 >= 1)
							break loop11;
						EarlyExitException eee = new EarlyExitException(11,
								input);
						throw eee;
					}
					cnt11++;
				} while (true);

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INTNUM"

	// $ANTLR start "FLOATNUM"
	public final void mFLOATNUM() throws RecognitionException {
		try {
			int _type = FLOATNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:5:
			// ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0'
			// .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt18 = 3;
			alt18 = dfa18.predict(input);
			switch (alt18) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:9:
				// ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:9:
				// ( '0' .. '9' )+
				int cnt12 = 0;
				loop12: do {
					int alt12 = 2;
					int LA12_0 = input.LA(1);

					if (((LA12_0 >= '0' && LA12_0 <= '9'))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:10:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt12 >= 1)
							break loop12;
						EarlyExitException eee = new EarlyExitException(12,
								input);
						throw eee;
					}
					cnt12++;
				} while (true);

				match('.');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:25:
				// ( '0' .. '9' )*
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:26:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						break loop13;
					}
				} while (true);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:37:
				// ( EXPONENT )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);

				if ((LA14_0 == 'E' || LA14_0 == 'e')) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:962:37:
					// EXPONENT
				{
					mEXPONENT();

				}
					break;

				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:963:9:
				// '.' ( '0' .. '9' )+ ( EXPONENT )?
			{
				match('.');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:963:13:
				// ( '0' .. '9' )+
				int cnt15 = 0;
				loop15: do {
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if (((LA15_0 >= '0' && LA15_0 <= '9'))) {
						alt15 = 1;
					}

					switch (alt15) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:963:14:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt15 >= 1)
							break loop15;
						EarlyExitException eee = new EarlyExitException(15,
								input);
						throw eee;
					}
					cnt15++;
				} while (true);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:963:25:
				// ( EXPONENT )?
				int alt16 = 2;
				int LA16_0 = input.LA(1);

				if ((LA16_0 == 'E' || LA16_0 == 'e')) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:963:25:
					// EXPONENT
				{
					mEXPONENT();

				}
					break;

				}

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:964:9:
				// ( '0' .. '9' )+ EXPONENT
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:964:9:
				// ( '0' .. '9' )+
				int cnt17 = 0;
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if (((LA17_0 >= '0' && LA17_0 <= '9'))) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:964:10:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt17 >= 1)
							break loop17;
						EarlyExitException eee = new EarlyExitException(17,
								input);
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
		} finally {
		}
	}

	// $ANTLR end "FLOATNUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:5:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options
			// {greedy=false; } : . )* '*/' )
			int alt22 = 2;
			int LA22_0 = input.LA(1);

			if ((LA22_0 == '/')) {
				int LA22_1 = input.LA(2);

				if ((LA22_1 == '/')) {
					alt22 = 1;
				} else if ((LA22_1 == '*')) {
					alt22 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							22, 1, input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 22, 0,
						input);

				throw nvae;
			}
			switch (alt22) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:9:
				// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				match("//");

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:14:
				// (~ ( '\\n' | '\\r' ) )*
				loop19: do {
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if (((LA19_0 >= '\u0000' && LA19_0 <= '\t')
							|| (LA19_0 >= '\u000B' && LA19_0 <= '\f') || (LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF'))) {
						alt19 = 1;
					}

					switch (alt19) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:14:
						// ~ ( '\\n' | '\\r' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop19;
					}
				} while (true);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:28:
				// ( '\\r' )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);

				if ((LA20_0 == '\r')) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:968:28:
					// '\\r'
				{
					match('\r');

				}
					break;

				}

				match('\n');
				_channel = HIDDEN;

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:969:9:
				// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:969:14:
				// ( options {greedy=false; } : . )*
				loop21: do {
					int alt21 = 2;
					int LA21_0 = input.LA(1);

					if ((LA21_0 == '*')) {
						int LA21_1 = input.LA(2);

						if ((LA21_1 == '/')) {
							alt21 = 2;
						} else if (((LA21_1 >= '\u0000' && LA21_1 <= '.') || (LA21_1 >= '0' && LA21_1 <= '\uFFFF'))) {
							alt21 = 1;
						}

					} else if (((LA21_0 >= '\u0000' && LA21_0 <= ')') || (LA21_0 >= '+' && LA21_0 <= '\uFFFF'))) {
						alt21 = 1;
					}

					switch (alt21) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:969:42:
						// .
					{
						matchAny();

					}
						break;

					default:
						break loop21;
					}
				} while (true);

				match("*/");

				_channel = HIDDEN;

			}
				break;

			}
			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COMMENT"

	// $ANTLR start "STRINGLITERAL"
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:974:5:
			// ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:974:9:
			// '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"'
			{
				match('\"');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:975:9:
				// ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
				loop23: do {
					int alt23 = 3;
					int LA23_0 = input.LA(1);

					if ((LA23_0 == '\\')) {
						alt23 = 1;
					} else if (((LA23_0 >= '\u0000' && LA23_0 <= '\t')
							|| (LA23_0 >= '\u000B' && LA23_0 <= '\f')
							|| (LA23_0 >= '\u000E' && LA23_0 <= '!')
							|| (LA23_0 >= '#' && LA23_0 <= '[') || (LA23_0 >= ']' && LA23_0 <= '\uFFFF'))) {
						alt23 = 2;
					}

					switch (alt23) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:975:13:
						// EscapeSequence
					{
						mEscapeSequence();

					}
						break;
					case 2:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:976:13:
						// ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
					{
						if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
								|| (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
								|| (input.LA(1) >= '\u000E' && input.LA(1) <= '!')
								|| (input.LA(1) >= '#' && input.LA(1) <= '[')
								|| (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
							input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, input);
							recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop23;
					}
				} while (true);

				match('\"');

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "PP_IF"
	public final void mPP_IF() throws RecognitionException {
		try {
			int _type = PP_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:982:7:
			// ( '#if' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:982:9:
			// '#if'
			{
				match("#if");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PP_IF"

	// $ANTLR start "PP_ELSEIF"
	public final void mPP_ELSEIF() throws RecognitionException {
		try {
			int _type = PP_ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:985:2:
			// ( '#elseif' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:985:4:
			// '#elseif'
			{
				match("#elseif");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PP_ELSEIF"

	// $ANTLR start "PP_ELSE"
	public final void mPP_ELSE() throws RecognitionException {
		try {
			int _type = PP_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:987:9:
			// ( '#else' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:987:11:
			// '#else'
			{
				match("#else");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PP_ELSE"

	// $ANTLR start "PP_END"
	public final void mPP_END() throws RecognitionException {
		try {
			int _type = PP_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:989:8:
			// ( '#end' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:989:10:
			// '#end'
			{
				match("#end");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PP_END"

	// $ANTLR start "PP_ERROR"
	public final void mPP_ERROR() throws RecognitionException {
		try {
			int _type = PP_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:991:9:
			// ( '#error' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:991:11:
			// '#error'
			{
				match("#error");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PP_ERROR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:995:10:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:995:12:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
				if (input.LA(1) == 'E' || input.LA(1) == 'e') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:995:22:
				// ( '+' | '-' )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);

				if ((LA24_0 == '+' || LA24_0 == '-')) {
					alt24 = 1;
				}
				switch (alt24) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
				{
					if (input.LA(1) == '+' || input.LA(1) == '-') {
						input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}

				}
					break;

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:995:33:
				// ( '0' .. '9' )+
				int cnt25 = 0;
				loop25: do {
					int alt25 = 2;
					int LA25_0 = input.LA(1);

					if (((LA25_0 >= '0' && LA25_0 <= '9'))) {
						alt25 = 1;
					}

					switch (alt25) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:995:34:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						if (cnt25 >= 1)
							break loop25;
						EarlyExitException eee = new EarlyExitException(25,
								input);
						throw eee;
					}
					cnt25++;
				} while (true);

			}

		} finally {
		}
	}

	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:998:11:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:998:13:
			// ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			{
				if ((input.LA(1) >= '0' && input.LA(1) <= '9')
						|| (input.LA(1) >= 'A' && input.LA(1) <= 'F')
						|| (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}

		} finally {
		}
	}

	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1002:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\'
			// ) | UNICODE_ESC | OCTAL_ESC )
			int alt26 = 3;
			int LA26_0 = input.LA(1);

			if ((LA26_0 == '\\')) {
				switch (input.LA(2)) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't': {
					alt26 = 1;
				}
					break;
				case 'u': {
					alt26 = 2;
				}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7': {
					alt26 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("",
							26, 1, input);

					throw nvae;
				}

			} else {
				NoViableAltException nvae = new NoViableAltException("", 26, 0,
						input);

				throw nvae;
			}
			switch (alt26) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1002:9:
				// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' |
				// '\\\\' )
			{
				match('\\');
				if (input.LA(1) == '\"' || input.LA(1) == '\''
						|| input.LA(1) == '\\' || input.LA(1) == 'b'
						|| input.LA(1) == 'f' || input.LA(1) == 'n'
						|| input.LA(1) == 'r' || input.LA(1) == 't') {
					input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					recover(mse);
					throw mse;
				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1003:9:
				// UNICODE_ESC
			{
				mUNICODE_ESC();

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1004:9:
				// OCTAL_ESC
			{
				mOCTAL_ESC();

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:5:
			// ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' (
			// '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt27 = 3;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == '\\')) {
				int LA27_1 = input.LA(2);

				if (((LA27_1 >= '0' && LA27_1 <= '3'))) {
					int LA27_2 = input.LA(3);

					if (((LA27_2 >= '0' && LA27_2 <= '7'))) {
						int LA27_5 = input.LA(4);

						if (((LA27_5 >= '0' && LA27_5 <= '7'))) {
							alt27 = 1;
						} else {
							alt27 = 2;
						}
					} else {
						alt27 = 3;
					}
				} else if (((LA27_1 >= '4' && LA27_1 <= '7'))) {
					int LA27_3 = input.LA(3);

					if (((LA27_3 >= '0' && LA27_3 <= '7'))) {
						alt27 = 2;
					} else {
						alt27 = 3;
					}
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							27, 1, input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 27, 0,
						input);

				throw nvae;
			}
			switch (alt27) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:9:
				// '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:14:
				// ( '0' .. '3' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:15:
				// '0' .. '3'
				{
					matchRange('0', '3');

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:25:
				// ( '0' .. '7' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:26:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:36:
				// ( '0' .. '7' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1009:37:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1010:9:
				// '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1010:14:
				// ( '0' .. '7' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1010:15:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1010:25:
				// ( '0' .. '7' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1010:26:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1011:9:
				// '\\\\' ( '0' .. '7' )
			{
				match('\\');
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1011:14:
				// ( '0' .. '7' )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1011:15:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

			}
				break;

			}
		} finally {
		}
	}

	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1016:5:
			// ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1016:9:
			// '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
				match('\\');
				match('u');
				mHEX_DIGIT();
				mHEX_DIGIT();
				mHEX_DIGIT();
				mHEX_DIGIT();

			}

		} finally {
		}
	}

	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:8:
		// ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN |
		// BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE |
		// DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY |
		// FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT |
		// INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED |
		// PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE |
		// STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY |
		// VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN
		// | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE |
		// LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG |
		// TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB |
		// PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ |
		// SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ |
		// PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ |
		// BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB
		// | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ
		// | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT |
		// STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR )
		int alt28 = 132;
		alt28 = dfa28.predict(input);
		switch (alt28) {
		case 1:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:10:
			// WS
		{
			mWS();

		}
			break;
		case 2:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:13:
			// LONGLITERAL
		{
			mLONGLITERAL();

		}
			break;
		case 3:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:25:
			// INTLITERAL
		{
			mINTLITERAL();

		}
			break;
		case 4:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:36:
			// CHARLITERAL
		{
			mCHARLITERAL();

		}
			break;
		case 5:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:48:
			// ABSTRACT
		{
			mABSTRACT();

		}
			break;
		case 6:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:57:
			// BOOLEAN
		{
			mBOOLEAN();

		}
			break;
		case 7:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:65:
			// BREAK
		{
			mBREAK();

		}
			break;
		case 8:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:71:
			// BYTE
		{
			mBYTE();

		}
			break;
		case 9:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:76:
			// CASE
		{
			mCASE();

		}
			break;
		case 10:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:81:
			// CATCH
		{
			mCATCH();

		}
			break;
		case 11:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:87:
			// CHAR
		{
			mCHAR();

		}
			break;
		case 12:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:92:
			// CLASS
		{
			mCLASS();

		}
			break;
		case 13:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:98:
			// CONST
		{
			mCONST();

		}
			break;
		case 14:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:104:
			// CONTINUE
		{
			mCONTINUE();

		}
			break;
		case 15:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:113:
			// DEFAULT
		{
			mDEFAULT();

		}
			break;
		case 16:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:121:
			// DO
		{
			mDO();

		}
			break;
		case 17:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:124:
			// DOUBLE
		{
			mDOUBLE();

		}
			break;
		case 18:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:131:
			// ELSE
		{
			mELSE();

		}
			break;
		case 19:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:136:
			// ENUM
		{
			mENUM();

		}
			break;
		case 20:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:141:
			// EXTENDS
		{
			mEXTENDS();

		}
			break;
		case 21:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:149:
			// FINAL
		{
			mFINAL();

		}
			break;
		case 22:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:155:
			// FINALLY
		{
			mFINALLY();

		}
			break;
		case 23:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:163:
			// FLOAT
		{
			mFLOAT();

		}
			break;
		case 24:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:169:
			// FOR
		{
			mFOR();

		}
			break;
		case 25:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:173:
			// GOTO
		{
			mGOTO();

		}
			break;
		case 26:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:178:
			// IF
		{
			mIF();

		}
			break;
		case 27:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:181:
			// IMPLEMENTS
		{
			mIMPLEMENTS();

		}
			break;
		case 28:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:192:
			// IMPORT
		{
			mIMPORT();

		}
			break;
		case 29:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:199:
			// INSTANCEOF
		{
			mINSTANCEOF();

		}
			break;
		case 30:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:210:
			// INT
		{
			mINT();

		}
			break;
		case 31:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:214:
			// INTERFACE
		{
			mINTERFACE();

		}
			break;
		case 32:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:224:
			// LONG
		{
			mLONG();

		}
			break;
		case 33:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:229:
			// NATIVE
		{
			mNATIVE();

		}
			break;
		case 34:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:236:
			// NEW
		{
			mNEW();

		}
			break;
		case 35:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:240:
			// PACKAGE
		{
			mPACKAGE();

		}
			break;
		case 36:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:248:
			// PRIVATE
		{
			mPRIVATE();

		}
			break;
		case 37:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:256:
			// PROTECTED
		{
			mPROTECTED();

		}
			break;
		case 38:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:266:
			// PUBLIC
		{
			mPUBLIC();

		}
			break;
		case 39:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:273:
			// RETURN
		{
			mRETURN();

		}
			break;
		case 40:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:280:
			// SHORT
		{
			mSHORT();

		}
			break;
		case 41:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:286:
			// STATIC
		{
			mSTATIC();

		}
			break;
		case 42:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:293:
			// INLINE
		{
			mINLINE();

		}
			break;
		case 43:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:300:
			// DYNAMIC
		{
			mDYNAMIC();

		}
			break;
		case 44:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:308:
			// OVERRIDE
		{
			mOVERRIDE();

		}
			break;
		case 45:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:317:
			// STRICTFP
		{
			mSTRICTFP();

		}
			break;
		case 46:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:326:
			// SUPER
		{
			mSUPER();

		}
			break;
		case 47:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:332:
			// SWITCH
		{
			mSWITCH();

		}
			break;
		case 48:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:339:
			// THIS
		{
			mTHIS();

		}
			break;
		case 49:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:344:
			// THROW
		{
			mTHROW();

		}
			break;
		case 50:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:350:
			// THROWS
		{
			mTHROWS();

		}
			break;
		case 51:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:357:
			// TRANSIENT
		{
			mTRANSIENT();

		}
			break;
		case 52:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:367:
			// TRY
		{
			mTRY();

		}
			break;
		case 53:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:371:
			// VOID
		{
			mVOID();

		}
			break;
		case 54:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:376:
			// VOLATILE
		{
			mVOLATILE();

		}
			break;
		case 55:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:385:
			// WHILE
		{
			mWHILE();

		}
			break;
		case 56:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:391:
			// TRUE
		{
			mTRUE();

		}
			break;
		case 57:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:396:
			// FALSE
		{
			mFALSE();

		}
			break;
		case 58:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:402:
			// NULL
		{
			mNULL();

		}
			break;
		case 59:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:407:
			// CAST
		{
			mCAST();

		}
			break;
		case 60:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:412:
			// FUNCTION
		{
			mFUNCTION();

		}
			break;
		case 61:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:421:
			// IN
		{
			mIN();

		}
			break;
		case 62:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:424:
			// VAR
		{
			mVAR();

		}
			break;
		case 63:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:428:
			// TYPEDEF
		{
			mTYPEDEF();

		}
			break;
		case 64:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:436:
			// EXTERN
		{
			mEXTERN();

		}
			break;
		case 65:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:443:
			// LPAREN
		{
			mLPAREN();

		}
			break;
		case 66:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:450:
			// RPAREN
		{
			mRPAREN();

		}
			break;
		case 67:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:457:
			// LBRACE
		{
			mLBRACE();

		}
			break;
		case 68:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:464:
			// RBRACE
		{
			mRBRACE();

		}
			break;
		case 69:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:471:
			// LBRACKET
		{
			mLBRACKET();

		}
			break;
		case 70:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:480:
			// RBRACKET
		{
			mRBRACKET();

		}
			break;
		case 71:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:489:
			// SEMI
		{
			mSEMI();

		}
			break;
		case 72:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:494:
			// COMMA
		{
			mCOMMA();

		}
			break;
		case 73:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:500:
			// DOT
		{
			mDOT();

		}
			break;
		case 74:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:504:
			// ELLIPSIS
		{
			mELLIPSIS();

		}
			break;
		case 75:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:513:
			// EQ
		{
			mEQ();

		}
			break;
		case 76:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:516:
			// BANG
		{
			mBANG();

		}
			break;
		case 77:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:521:
			// TILDE
		{
			mTILDE();

		}
			break;
		case 78:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:527:
			// QUES
		{
			mQUES();

		}
			break;
		case 79:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:532:
			// COLON
		{
			mCOLON();

		}
			break;
		case 80:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:538:
			// EQEQ
		{
			mEQEQ();

		}
			break;
		case 81:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:543:
			// AMPAMP
		{
			mAMPAMP();

		}
			break;
		case 82:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:550:
			// BARBAR
		{
			mBARBAR();

		}
			break;
		case 83:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:557:
			// PLUSPLUS
		{
			mPLUSPLUS();

		}
			break;
		case 84:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:566:
			// SUBSUB
		{
			mSUBSUB();

		}
			break;
		case 85:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:573:
			// PLUS
		{
			mPLUS();

		}
			break;
		case 86:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:578:
			// SUB
		{
			mSUB();

		}
			break;
		case 87:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:582:
			// STAR
		{
			mSTAR();

		}
			break;
		case 88:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:587:
			// SLASH
		{
			mSLASH();

		}
			break;
		case 89:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:593:
			// AMP
		{
			mAMP();

		}
			break;
		case 90:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:597:
			// BAR
		{
			mBAR();

		}
			break;
		case 91:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:601:
			// CARET
		{
			mCARET();

		}
			break;
		case 92:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:607:
			// PERCENT
		{
			mPERCENT();

		}
			break;
		case 93:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:615:
			// PLUSEQ
		{
			mPLUSEQ();

		}
			break;
		case 94:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:622:
			// SUBEQ
		{
			mSUBEQ();

		}
			break;
		case 95:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:628:
			// STAREQ
		{
			mSTAREQ();

		}
			break;
		case 96:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:635:
			// SLASHEQ
		{
			mSLASHEQ();

		}
			break;
		case 97:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:643:
			// AMPEQ
		{
			mAMPEQ();

		}
			break;
		case 98:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:649:
			// BAREQ
		{
			mBAREQ();

		}
			break;
		case 99:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:655:
			// CARETEQ
		{
			mCARETEQ();

		}
			break;
		case 100:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:663:
			// PERCENTEQ
		{
			mPERCENTEQ();

		}
			break;
		case 101:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:673:
			// PERCENTDLQ
		{
			mPERCENTDLQ();

		}
			break;
		case 102:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:684:
			// PERCENTDBQ
		{
			mPERCENTDBQ();

		}
			break;
		case 103:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:695:
			// PERCENTDBBQ
		{
			mPERCENTDBBQ();

		}
			break;
		case 104:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:707:
			// EQEQEQ
		{
			mEQEQEQ();

		}
			break;
		case 105:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:714:
			// PERCENTLESQ
		{
			mPERCENTLESQ();

		}
			break;
		case 106:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:726:
			// BANGEQQ
		{
			mBANGEQQ();

		}
			break;
		case 107:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:734:
			// MONKEYS_AT
		{
			mMONKEYS_AT();

		}
			break;
		case 108:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:745:
			// BANGEQ
		{
			mBANGEQ();

		}
			break;
		case 109:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:752:
			// MINUS_BIGGER
		{
			mMINUS_BIGGER();

		}
			break;
		case 110:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:765:
			// PERCENTLL
		{
			mPERCENTLL();

		}
			break;
		case 111:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:775:
			// PERCENTBB
		{
			mPERCENTBB();

		}
			break;
		case 112:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:785:
			// PERCENTBBB
		{
			mPERCENTBBB();

		}
			break;
		case 113:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:796:
			// GT
		{
			mGT();

		}
			break;
		case 114:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:799:
			// GTGT
		{
			mGTGT();

		}
			break;
		case 115:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:804:
			// LTLT
		{
			mLTLT();

		}
			break;
		case 116:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:809:
			// GTGTGT
		{
			mGTGTGT();

		}
			break;
		case 117:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:816:
			// LTLTEQ
		{
			mLTLTEQ();

		}
			break;
		case 118:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:823:
			// GTGTEQ
		{
			mGTGTEQ();

		}
			break;
		case 119:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:830:
			// GTGTGTEQ
		{
			mGTGTGTEQ();

		}
			break;
		case 120:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:839:
			// GTEQ
		{
			mGTEQ();

		}
			break;
		case 121:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:844:
			// LTEQ
		{
			mLTEQ();

		}
			break;
		case 122:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:849:
			// LT
		{
			mLT();

		}
			break;
		case 123:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:852:
			// IDENTIFIER
		{
			mIDENTIFIER();

		}
			break;
		case 124:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:863:
			// INTNUM
		{
			mINTNUM();

		}
			break;
		case 125:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:870:
			// FLOATNUM
		{
			mFLOATNUM();

		}
			break;
		case 126:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:879:
			// COMMENT
		{
			mCOMMENT();

		}
			break;
		case 127:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:887:
			// STRINGLITERAL
		{
			mSTRINGLITERAL();

		}
			break;
		case 128:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:901:
			// PP_IF
		{
			mPP_IF();

		}
			break;
		case 129:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:907:
			// PP_ELSEIF
		{
			mPP_ELSEIF();

		}
			break;
		case 130:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:917:
			// PP_ELSE
		{
			mPP_ELSE();

		}
			break;
		case 131:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:925:
			// PP_END
		{
			mPP_END();

		}
			break;
		case 132:
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:1:932:
			// PP_ERROR
		{
			mPP_ERROR();

		}
			break;

		}

	}

	protected DFA9 dfa9 = new DFA9(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA28 dfa28 = new DFA28(this);
	static final String DFA9_eotS = "\11\uffff\2\14\1\15\3\uffff";
	static final String DFA9_eofS = "\17\uffff";
	static final String DFA9_minS = "\1\42\10\uffff\3\60\3\uffff";
	static final String DFA9_maxS = "\1\164\10\uffff\3\67\3\uffff";
	static final String DFA9_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\12\1\11";
	static final String DFA9_specialS = "\17\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\6\4\uffff\1\7\10\uffff\4\11\4\12\44\uffff\1\10\5\uffff\1"
					+ "\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2", "",
			"", "", "", "", "", "", "", "\10\13", "\10\15", "\10\16", "", "",
			"" };

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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

		@Override
		public String getDescription() {
			return "492:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
		}
	}

	static final String DFA18_eotS = "\5\uffff";
	static final String DFA18_eofS = "\5\uffff";
	static final String DFA18_minS = "\2\56\3\uffff";
	static final String DFA18_maxS = "\1\71\1\145\3\uffff";
	static final String DFA18_acceptS = "\2\uffff\1\2\1\3\1\1";
	static final String DFA18_specialS = "\5\uffff}>";
	static final String[] DFA18_transitionS = { "\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3", "", "", "" };

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA
			.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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

		@Override
		public String getDescription() {
			return "961:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA28_eotS = "\2\uffff\2\67\1\uffff\21\57\10\uffff\1\145\1\147\1\151\3\uffff"
			+ "\1\154\1\157\1\162\1\166\1\170\1\173\1\175\1\u0080\1\uffff\1\u0083"
			+ "\1\u0086\6\uffff\1\67\1\u008a\2\uffff\1\67\11\57\1\u0096\12\57\1"
			+ "\u00a1\1\57\1\u00a6\23\57\2\uffff\1\u00c1\1\uffff\1\u00c3\30\uffff"
			+ "\1\u00c8\2\uffff\1\u00ca\4\uffff\1\67\1\uffff\13\57\1\uffff\6\57"
			+ "\1\u00e1\3\57\1\uffff\2\57\1\u00e9\1\57\1\uffff\2\57\1\u00ed\17"
			+ "\57\1\u00fd\4\57\1\u0102\1\57\6\uffff\1\u0108\7\uffff\3\57\1\u010d"
			+ "\1\u010e\1\u010f\1\57\1\u0111\6\57\1\u0118\1\u0119\3\57\1\uffff"
			+ "\2\57\1\u0120\4\57\1\uffff\1\57\1\u0126\1\57\1\uffff\1\u0128\13"
			+ "\57\1\u0134\2\57\1\uffff\1\u0137\1\57\1\u0139\1\57\1\uffff\1\57"
			+ "\6\uffff\2\57\1\u0142\3\uffff\1\u0143\1\uffff\1\u0144\1\u0145\4"
			+ "\57\2\uffff\2\57\1\u014d\1\u014e\1\u014f\1\57\1\uffff\5\57\1\uffff"
			+ "\1\57\1\uffff\5\57\1\u015c\2\57\1\u015f\2\57\1\uffff\1\u0163\1\57"
			+ "\1\uffff\1\57\1\uffff\1\57\1\u0167\3\uffff\1\u016c\2\57\4\uffff"
			+ "\2\57\1\u0171\2\57\1\u0174\1\57\3\uffff\2\57\1\u0178\2\57\1\u017b"
			+ "\1\u017c\3\57\1\u0180\1\u0181\1\uffff\1\u0182\1\57\1\uffff\1\u0184"
			+ "\1\57\1\u0186\1\uffff\3\57\1\uffff\1\u018b\1\u018d\3\uffff\1\57"
			+ "\1\u0190\1\57\1\u0192\1\uffff\1\u0193\1\u0194\1\uffff\1\u0195\2"
			+ "\57\1\uffff\2\57\2\uffff\1\u019a\1\u019b\1\57\3\uffff\1\57\1\uffff"
			+ "\1\57\1\uffff\1\57\1\u01a0\1\57\4\uffff\1\u01a3\1\u01a4\1\uffff"
			+ "\1\u01a5\4\uffff\1\u01a6\3\57\2\uffff\1\57\1\u01ab\1\u01ac\1\57"
			+ "\1\uffff\1\u01ae\5\uffff\2\57\1\u01b1\1\u01b2\2\uffff\1\u01b3\1"
			+ "\uffff\1\u01b4\1\u01b5\5\uffff";
	static final String DFA28_eofS = "\u01b6\uffff";
	static final String DFA28_minS = "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\141\1\145\1\154\1\141"
			+ "\1\157\1\146\1\157\2\141\1\145\1\150\1\166\1\150\1\141\1\150\10"
			+ "\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\55\1\75\1\52\1\75\1\45"
			+ "\1\uffff\1\75\1\74\2\uffff\1\145\2\60\1\uffff\2\56\2\uffff\1\56"
			+ "\1\163\1\157\1\145\1\164\1\163\2\141\1\156\1\146\1\60\1\156\1\163"
			+ "\1\165\1\164\1\156\1\157\1\162\1\154\1\156\1\164\1\60\1\160\1\60"
			+ "\1\156\1\164\1\167\1\154\1\143\1\151\1\142\1\164\1\157\1\141\1\160"
			+ "\1\151\1\145\1\151\1\141\1\160\1\151\1\162\1\151\2\uffff\1\75\1"
			+ "\uffff\1\75\26\uffff\1\74\1\uffff\1\75\2\uffff\1\75\3\uffff\1\154"
			+ "\1\60\1\uffff\1\164\1\154\1\141\2\145\1\143\1\162\2\163\1\141\1"
			+ "\142\1\uffff\1\141\1\145\1\155\1\145\2\141\1\60\1\163\1\143\1\157"
			+ "\1\uffff\1\154\1\164\1\60\1\151\1\uffff\1\147\1\151\1\60\1\154\1"
			+ "\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\162"
			+ "\1\163\1\157\1\156\1\60\2\145\1\144\1\141\1\60\1\154\4\uffff\1\74"
			+ "\1\76\1\75\4\uffff\1\163\2\uffff\1\162\1\145\1\153\3\60\1\150\1"
			+ "\60\1\163\1\164\1\151\1\165\1\154\1\155\2\60\1\156\1\154\1\164\1"
			+ "\uffff\1\145\1\164\1\60\1\145\1\162\1\141\1\162\1\uffff\1\156\1"
			+ "\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1\164\1\151\1\143"
			+ "\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff\1\60\1\144\1\60\1\164"
			+ "\1\uffff\1\145\1\45\1\uffff\1\45\2\uffff\1\145\2\141\1\60\3\uffff"
			+ "\1\60\1\uffff\2\60\1\156\1\154\1\145\1\151\2\uffff\1\144\1\156\3"
			+ "\60\1\151\1\uffff\1\155\1\164\1\156\1\146\1\145\1\uffff\1\145\1"
			+ "\uffff\1\147\1\164\2\143\1\156\1\60\1\143\1\164\1\60\1\150\1\151"
			+ "\1\uffff\1\60\1\151\1\uffff\1\145\1\uffff\1\151\1\60\3\45\1\151"
			+ "\1\143\1\156\4\uffff\1\165\1\164\1\60\1\143\1\163\1\60\1\171\3\uffff"
			+ "\1\157\1\145\1\60\1\143\1\141\2\60\2\145\1\164\2\60\1\uffff\1\60"
			+ "\1\146\1\uffff\1\60\1\144\1\60\1\uffff\1\145\1\146\1\154\1\uffff"
			+ "\2\75\1\45\2\uffff\1\164\1\60\1\145\1\60\1\uffff\2\60\1\uffff\1"
			+ "\60\2\156\1\uffff\1\145\1\143\2\uffff\2\60\1\145\3\uffff\1\160\1"
			+ "\uffff\1\145\1\uffff\1\156\1\60\1\145\4\uffff\1\75\1\60\1\uffff"
			+ "\1\60\4\uffff\1\60\1\164\1\157\1\145\2\uffff\1\144\2\60\1\164\1"
			+ "\uffff\1\60\5\uffff\1\163\1\146\2\60\2\uffff\1\60\1\uffff\2\60\5"
			+ "\uffff";
	static final String DFA28_maxS = "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\171\1\157\1\171\1\170"
			+ "\1\165\1\157\1\156\1\157\2\165\1\145\1\167\1\166\1\171\1\157\1\150"
			+ "\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1\76\4\75\1\uffff\1"
			+ "\76\1\75\2\uffff\1\151\2\146\1\uffff\1\154\1\145\2\uffff\1\154\1"
			+ "\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1\156\1\163\1\165"
			+ "\1\164\1\156\1\157\1\162\1\154\1\156\1\164\1\172\1\160\1\172\1\156"
			+ "\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162\1\160\1\151"
			+ "\1\145\1\162\1\171\1\160\1\154\1\162\1\151\2\uffff\1\75\1\uffff"
			+ "\1\75\26\uffff\1\76\1\uffff\1\76\2\uffff\1\75\3\uffff\1\162\1\154"
			+ "\1\uffff\1\164\1\154\1\141\1\145\1\164\1\143\1\162\1\163\1\164\1"
			+ "\141\1\142\1\uffff\1\141\1\145\1\155\1\145\2\141\1\172\1\163\1\143"
			+ "\1\157\1\uffff\1\157\1\164\1\172\1\151\1\uffff\1\147\1\151\1\172"
			+ "\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164\1\151\1\145\1\164"
			+ "\1\162\1\163\1\157\1\156\1\172\2\145\1\144\1\141\1\172\1\154\4\uffff"
			+ "\1\75\1\76\1\75\4\uffff\1\163\2\uffff\1\162\1\145\1\153\3\172\1"
			+ "\150\1\172\1\163\1\164\1\151\1\165\1\154\1\155\2\172\1\162\1\154"
			+ "\1\164\1\uffff\1\145\1\164\1\172\1\145\1\162\1\141\1\162\1\uffff"
			+ "\1\156\1\172\1\166\1\uffff\1\172\2\141\1\145\1\151\1\162\1\164\1"
			+ "\151\1\143\1\162\1\143\1\162\1\172\1\167\1\163\1\uffff\1\172\1\144"
			+ "\1\172\1\164\1\uffff\1\145\1\45\1\uffff\1\76\2\uffff\1\145\2\141"
			+ "\1\172\3\uffff\1\172\1\uffff\2\172\1\156\1\154\1\145\1\151\2\uffff"
			+ "\1\144\1\156\3\172\1\151\1\uffff\1\155\1\164\1\156\1\146\1\145\1"
			+ "\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1\164\1"
			+ "\172\1\150\1\151\1\uffff\1\172\1\151\1\uffff\1\145\1\uffff\1\151"
			+ "\1\172\3\45\1\151\1\143\1\156\4\uffff\1\165\1\164\1\172\1\143\1"
			+ "\163\1\172\1\171\3\uffff\1\157\1\145\1\172\1\143\1\141\2\172\2\145"
			+ "\1\164\2\172\1\uffff\1\172\1\146\1\uffff\1\172\1\144\1\172\1\uffff"
			+ "\1\145\1\146\1\154\1\uffff\2\75\1\45\2\uffff\1\164\1\172\1\145\1"
			+ "\172\1\uffff\2\172\1\uffff\1\172\2\156\1\uffff\1\145\1\143\2\uffff"
			+ "\2\172\1\145\3\uffff\1\160\1\uffff\1\145\1\uffff\1\156\1\172\1\145"
			+ "\4\uffff\1\75\1\172\1\uffff\1\172\4\uffff\1\172\1\164\1\157\1\145"
			+ "\2\uffff\1\144\2\172\1\164\1\uffff\1\172\5\uffff\1\163\1\146\2\172"
			+ "\2\uffff\1\172\1\uffff\2\172\5\uffff";
	static final String DFA28_acceptS = "\1\uffff\1\1\2\uffff\1\4\21\uffff\1\101\1\102\1\103\1\104\1\105"
			+ "\1\106\1\107\1\110\3\uffff\1\115\1\116\1\117\10\uffff\1\153\2\uffff"
			+ "\1\173\1\177\3\uffff\1\175\2\uffff\1\3\1\2\53\uffff\1\112\1\111"
			+ "\1\uffff\1\113\1\uffff\1\114\1\121\1\141\1\131\1\122\1\142\1\132"
			+ "\1\123\1\135\1\125\1\124\1\136\1\155\1\126\1\137\1\127\1\140\1\176"
			+ "\1\130\1\143\1\133\1\144\1\uffff\1\134\1\uffff\1\170\1\161\1\uffff"
			+ "\1\171\1\172\1\u0080\2\uffff\1\174\13\uffff\1\20\12\uffff\1\32\4"
			+ "\uffff\1\75\31\uffff\1\150\1\120\1\152\1\154\3\uffff\1\166\1\162"
			+ "\1\165\1\163\1\uffff\1\u0083\1\u0084\23\uffff\1\30\7\uffff\1\36"
			+ "\3\uffff\1\42\17\uffff\1\64\4\uffff\1\76\2\uffff\1\151\1\uffff\1"
			+ "\167\1\164\4\uffff\1\10\1\11\1\73\1\uffff\1\13\6\uffff\1\22\1\23"
			+ "\6\uffff\1\31\5\uffff\1\40\1\uffff\1\72\13\uffff\1\60\2\uffff\1"
			+ "\70\1\uffff\1\65\10\uffff\1\7\1\12\1\14\1\15\7\uffff\1\25\1\27\1"
			+ "\71\14\uffff\1\50\2\uffff\1\56\3\uffff\1\61\3\uffff\1\67\3\uffff"
			+ "\1\u0081\1\u0082\4\uffff\1\21\2\uffff\1\100\3\uffff\1\34\2\uffff"
			+ "\1\52\1\41\3\uffff\1\46\1\47\1\51\1\uffff\1\57\1\uffff\1\62\3\uffff"
			+ "\1\145\1\156\1\146\1\157\2\uffff\1\6\1\uffff\1\17\1\53\1\24\1\26"
			+ "\4\uffff\1\43\1\44\4\uffff\1\77\1\uffff\1\147\1\160\1\5\1\16\1\74"
			+ "\4\uffff\1\55\1\54\1\uffff\1\66\2\uffff\1\37\1\45\1\63\1\33\1\35";
	static final String DFA28_specialS = "\u01b6\uffff}>";
	static final String[] DFA28_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\1\40\1\60\1\61\1\uffff\1\53\1"
					+ "\44\1\4\1\26\1\27\1\50\1\46\1\35\1\47\1\36\1\51\1\2\11\3\1\43"
					+ "\1\34\1\56\1\37\1\55\1\42\1\54\32\57\1\32\1\uffff\1\33\1\52"
					+ "\1\57\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\57\1\14\2\57"
					+ "\1\15\1\57\1\16\1\22\1\17\1\57\1\20\1\21\1\23\1\57\1\24\1\25"
					+ "\3\57\1\30\1\45\1\31\1\41",
			"",
			"\1\64\1\uffff\10\65\2\66\13\uffff\1\64\6\uffff\1\70\13\uffff"
					+ "\1\63\14\uffff\1\64\6\uffff\1\70\13\uffff\1\62",
			"\1\64\1\uffff\12\71\13\uffff\1\64\6\uffff\1\70\30\uffff\1"
					+ "\64\6\uffff\1\70",
			"",
			"\1\72",
			"\1\73\2\uffff\1\74\6\uffff\1\75",
			"\1\76\6\uffff\1\77\3\uffff\1\100\2\uffff\1\101",
			"\1\102\11\uffff\1\103\11\uffff\1\104",
			"\1\105\1\uffff\1\106\11\uffff\1\107",
			"\1\113\7\uffff\1\110\2\uffff\1\111\2\uffff\1\112\5\uffff\1"
					+ "\114",
			"\1\115",
			"\1\116\6\uffff\1\117\1\120",
			"\1\121",
			"\1\122\3\uffff\1\123\17\uffff\1\124",
			"\1\125\20\uffff\1\126\2\uffff\1\127",
			"\1\130",
			"\1\131\13\uffff\1\132\1\133\1\uffff\1\134",
			"\1\135",
			"\1\136\11\uffff\1\137\6\uffff\1\140",
			"\1\142\15\uffff\1\141",
			"\1\143",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\144\1\uffff\12\64",
			"\1\146",
			"\1\150",
			"",
			"",
			"",
			"\1\152\26\uffff\1\153",
			"\1\156\76\uffff\1\155",
			"\1\160\21\uffff\1\161",
			"\1\163\17\uffff\1\164\1\165",
			"\1\167",
			"\1\172\4\uffff\1\172\15\uffff\1\171",
			"\1\174",
			"\1\177\27\uffff\1\176",
			"",
			"\1\u0082\1\u0081",
			"\1\u0084\1\u0085",
			"",
			"",
			"\1\u0088\3\uffff\1\u0087",
			"\12\u0089\7\uffff\6\u0089\32\uffff\6\u0089",
			"\12\u0089\7\uffff\6\u0089\32\uffff\6\u0089",
			"",
			"\1\64\1\uffff\10\65\2\66\13\uffff\1\64\6\uffff\1\70\30\uffff"
					+ "\1\64\6\uffff\1\70",
			"\1\64\1\uffff\12\66\13\uffff\1\64\37\uffff\1\64",
			"",
			"",
			"\1\64\1\uffff\12\71\13\uffff\1\64\6\uffff\1\70\30\uffff\1"
					+ "\64\6\uffff\1\70",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0095\5" + "\57",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00a2",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a5\6"
					+ "\57\1\u00a3\1\u00a4\6\57",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac\5\uffff\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1\20\uffff\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6\10\uffff\1\u00b7",
			"\1\u00b8\23\uffff\1\u00ba\3\uffff\1\u00b9",
			"\1\u00bb",
			"\1\u00bc\2\uffff\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"",
			"",
			"\1\u00c0",
			"",
			"\1\u00c2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00c4\1\uffff\1\u00c5",
			"",
			"\1\u00c7\1\u00c6",
			"",
			"",
			"\1\u00c9",
			"",
			"",
			"",
			"\1\u00cb\1\uffff\1\u00cc\3\uffff\1\u00cd",
			"\12\u0089\7\uffff\6\u0089\5\uffff\1\70\24\uffff\6\u0089\5"
					+ "\uffff\1\70",
			"",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2\16\uffff\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"",
			"\1\u00e5\2\uffff\1\u00e6",
			"\1\u00e7",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00e8\25" + "\57",
			"\1\u00ea",
			"",
			"\1\u00eb",
			"\1\u00ec",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00ee",
			"\1\u00ef",
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
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0103",
			"",
			"",
			"",
			"",
			"\1\u0104\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"",
			"",
			"",
			"",
			"\1\u0109",
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
			"\1\u011a\3\uffff\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"",
			"\1\u011e",
			"\1\u011f",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"",
			"\1\u0125",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0127",
			"",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
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
			"\1\u0133",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0135",
			"\1\u0136",
			"",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0138",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u013a",
			"",
			"\1\u013b",
			"\1\u013c",
			"",
			"\1\u013d\30\uffff\1\u013e",
			"",
			"",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"",
			"",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"",
			"",
			"\1\u014a",
			"\1\u014b",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u014c\16"
					+ "\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0150",
			"",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u015d",
			"\1\u015e",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0160",
			"\1\u0161",
			"",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u0162\7" + "\57",
			"\1\u0164", "", "\1\u0165", "", "\1\u0166",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0168",
			"\1\u0169", "\1\u016a", "\1\u016b", "\1\u016d", "\1\u016e", "", "",
			"", "", "\1\u016f", "\1\u0170",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0172",
			"\1\u0173", "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0175", "", "", "", "\1\u0176", "\1\u0177",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0179",
			"\1\u017a", "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u017d",
			"\1\u017e", "\1\u017f",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0183", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0185",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "", "\1\u0187",
			"\1\u0188", "\1\u0189", "", "\1\u018a", "\1\u018c", "\1\u018e", "",
			"", "\1\u018f", "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\1\u0191", "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u0196",
			"\1\u0197", "", "\1\u0198", "\1\u0199", "", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u019c", "",
			"", "", "\1\u019d", "", "\1\u019e", "", "\1\u019f",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u01a1", "",
			"", "", "", "\1\u01a2",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "", "", "", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u01a7",
			"\1\u01a8", "\1\u01a9", "", "", "\1\u01aa",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "\1\u01ad", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "", "", "", "",
			"", "\1\u01af", "\1\u01b0",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
			"\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57", "", "", "", "",
			"" };

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA
			.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR );";
		}
	}

}