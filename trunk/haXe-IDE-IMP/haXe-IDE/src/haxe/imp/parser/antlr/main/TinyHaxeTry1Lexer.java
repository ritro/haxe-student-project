/*******************************************************************************
 * Copyright (c) 2009 Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License, version 2
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-2.0.html
 *
 * Contributors:
 *    Anatoly Kondratyev (anatoly.kondratyev@googlemail.com)
 *******************************************************************************/

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

// TODO: Auto-generated Javadoc
/**
 * The Class TinyHaxeTry1Lexer.
 * 
 * @author Anatoly Kondratyev
 */
public class TinyHaxeTry1Lexer extends Lexer {

	/** The Constant PACKAGE. */
	public static final int PACKAGE = 15;

	/** The Constant FUNCTION. */
	public static final int FUNCTION = 34;

	/** The Constant CAST. */
	public static final int CAST = 93;

	/** The Constant EXPONENT. */
	public static final int EXPONENT = 152;

	/** The Constant LT. */
	public static final int LT = 51;

	/** The Constant STAR. */
	public static final int STAR = 86;

	/** The Constant WHILE. */
	public static final int WHILE = 59;

	/** The Constant FLOATNUM. */
	public static final int FLOATNUM = 106;

	/** The Constant CONST. */
	public static final int CONST = 119;

	/** The Constant OCTAL_ESC. */
	public static final int OCTAL_ESC = 156;

	/** The Constant CASE. */
	public static final int CASE = 69;

	/** The Constant CHAR. */
	public static final int CHAR = 118;

	/** The Constant NEW. */
	public static final int NEW = 54;

	/** The Constant EXTERN. */
	public static final int EXTERN = 96;

	/** The Constant DO. */
	public static final int DO = 60;

	/** The Constant EOF. */
	public static final int EOF = -1;

	/** The Constant GTGT. */
	public static final int GTGT = 53;

	/** The Constant BREAK. */
	public static final int BREAK = 67;

	/** The Constant LBRACKET. */
	public static final int LBRACKET = 37;

	/** The Constant RPAREN. */
	public static final int RPAREN = 36;

	/** The Constant FINAL. */
	public static final int FINAL = 121;

	/** The Constant IMPORT. */
	public static final int IMPORT = 19;

	/** The Constant SUBSUB. */
	public static final int SUBSUB = 89;

	/** The Constant STAREQ. */
	public static final int STAREQ = 135;

	/** The Constant CARET. */
	public static final int CARET = 81;

	/** The Constant RETURN. */
	public static final int RETURN = 65;

	/** The Constant THIS. */
	public static final int THIS = 131;

	/** The Constant DOUBLE. */
	public static final int DOUBLE = 120;

	/** The Constant MONKEYS_AT. */
	public static final int MONKEYS_AT = 144;

	/** The Constant BARBAR. */
	public static final int BARBAR = 73;

	/** The Constant VAR. */
	public static final int VAR = 95;

	/** The Constant VOID. */
	public static final int VOID = 47;

	/** The Constant SUPER. */
	public static final int SUPER = 130;

	/** The Constant EQ. */
	public static final int EQ = 28;

	/** The Constant GOTO. */
	public static final int GOTO = 123;

	/** The Constant AMPAMP. */
	public static final int AMPAMP = 74;

	/** The Constant COMMENT. */
	public static final int COMMENT = 153;

	/** The Constant VAR_INIT. */
	public static final int VAR_INIT = 13;

	/** The Constant QUES. */
	public static final int QUES = 27;

	/** The Constant LTLTEQ. */
	public static final int LTLTEQ = 148;

	/** The Constant EQEQ. */
	public static final int EQEQ = 75;

	/** The Constant HexPrefix. */
	public static final int HexPrefix = 112;

	/** The Constant PP_IF. */
	public static final int PP_IF = 39;

	/** The Constant PERCENTDBBQ. */
	public static final int PERCENTDBBQ = 140;

	/** The Constant RBRACE. */
	public static final int RBRACE = 64;

	/** The Constant STATIC. */
	public static final int STATIC = 22;

	/** The Constant PRIVATE. */
	public static final int PRIVATE = 21;

	/** The Constant BLOCK_SCOPE. */
	public static final int BLOCK_SCOPE = 7;

	/** The Constant SWITCH. */
	public static final int SWITCH = 62;

	/** The Constant NULL. */
	public static final int NULL = 92;

	/** The Constant GTGTEQ. */
	public static final int GTGTEQ = 149;

	/** The Constant STRICTFP. */
	public static final int STRICTFP = 129;

	/** The Constant ELSE. */
	public static final int ELSE = 56;

	/** The Constant NATIVE. */
	public static final int NATIVE = 126;

	/** The Constant ELLIPSIS. */
	public static final int ELLIPSIS = 72;

	/** The Constant THROWS. */
	public static final int THROWS = 132;

	/** The Constant INT. */
	public static final int INT = 48;

	/** The Constant SLASHEQ. */
	public static final int SLASHEQ = 31;

	/** The Constant INTLITERAL. */
	public static final int INTLITERAL = 103;

	/** The Constant PERCENTBB. */
	public static final int PERCENTBB = 146;

	/** The Constant TRY. */
	public static final int TRY = 61;

	/** The Constant LongSuffix. */
	public static final int LongSuffix = 111;

	/** The Constant LONGLITERAL. */
	public static final int LONGLITERAL = 102;

	/** The Constant PERCENTLL. */
	public static final int PERCENTLL = 145;

	/** The Constant BANGEQQ. */
	public static final int BANGEQQ = 143;

	/** The Constant WS. */
	public static final int WS = 109;

	/** The Constant PERCENTDLQ. */
	public static final int PERCENTDLQ = 138;

	/** The Constant INHERIT_LIST_OPT. */
	public static final int INHERIT_LIST_OPT = 11;

	/** The Constant CHARLITERAL. */
	public static final int CHARLITERAL = 105;

	/** The Constant GT. */
	public static final int GT = 52;

	/** The Constant INLINE. */
	public static final int INLINE = 23;

	/** The Constant CATCH. */
	public static final int CATCH = 71;

	/** The Constant FALSE. */
	public static final int FALSE = 108;

	/** The Constant EscapeSequence. */
	public static final int EscapeSequence = 115;

	/** The Constant THROW. */
	public static final int THROW = 66;

	/** The Constant DYNAMIC. */
	public static final int DYNAMIC = 24;

	/** The Constant PROTECTED. */
	public static final int PROTECTED = 127;

	/** The Constant CLASS. */
	public static final int CLASS = 97;

	/** The Constant PP_ELSEIF. */
	public static final int PP_ELSEIF = 41;

	/** The Constant BAREQ. */
	public static final int BAREQ = 136;

	/** The Constant PP_ELSE. */
	public static final int PP_ELSE = 42;

	/** The Constant IntegerNumber. */
	public static final int IntegerNumber = 110;

	/** The Constant AMP. */
	public static final int AMP = 80;

	/** The Constant PLUSPLUS. */
	public static final int PLUSPLUS = 90;

	/** The Constant LBRACE. */
	public static final int LBRACE = 63;

	/** The Constant TYPE_PARAM_OPT. */
	public static final int TYPE_PARAM_OPT = 10;

	/** The Constant LTEQ. */
	public static final int LTEQ = 78;

	/** The Constant SUBEQ. */
	public static final int SUBEQ = 30;

	/** The Constant GTGTGT. */
	public static final int GTGTGT = 83;

	/** The Constant FOR. */
	public static final int FOR = 57;

	/** The Constant Exponent. */
	public static final int Exponent = 114;

	/** The Constant SUB. */
	public static final int SUB = 85;

	/** The Constant SUFFIX_EXPR. */
	public static final int SUFFIX_EXPR = 6;

	/** The Constant FLOAT. */
	public static final int FLOAT = 49;

	/** The Constant ABSTRACT. */
	public static final int ABSTRACT = 116;

	/** The Constant MINUS_BIGGER. */
	public static final int MINUS_BIGGER = 46;

	/** The Constant PERCENTDBQ. */
	public static final int PERCENTDBQ = 139;

	/** The Constant HexDigit. */
	public static final int HexDigit = 113;

	/** The Constant PLUSEQ. */
	public static final int PLUSEQ = 29;

	/** The Constant LPAREN. */
	public static final int LPAREN = 35;

	/** The Constant IF. */
	public static final int IF = 55;

	/** The Constant INTNUM. */
	public static final int INTNUM = 151;

	/** The Constant SLASH. */
	public static final int SLASH = 87;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = 50;

	/** The Constant PP_END. */
	public static final int PP_END = 43;

	/** The Constant ESC_SEQ. */
	public static final int ESC_SEQ = 157;

	/** The Constant IN. */
	public static final int IN = 58;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = 100;

	/** The Constant GTGTGTEQ. */
	public static final int GTGTGTEQ = 150;

	/** The Constant CONTINUE. */
	public static final int CONTINUE = 68;

	/** The Constant COMMA. */
	public static final int COMMA = 26;

	/** The Constant AMPEQ. */
	public static final int AMPEQ = 33;

	/** The Constant IDENTIFIER. */
	public static final int IDENTIFIER = 17;

	/** The Constant TRANSIENT. */
	public static final int TRANSIENT = 133;

	/** The Constant TILDE. */
	public static final int TILDE = 91;

	/** The Constant BANGEQ. */
	public static final int BANGEQ = 76;

	/** The Constant PLUS. */
	public static final int PLUS = 84;

	/** The Constant RBRACKET. */
	public static final int RBRACKET = 38;

	/** The Constant DOT. */
	public static final int DOT = 18;

	/** The Constant LTLT. */
	public static final int LTLT = 82;

	/** The Constant BYTE. */
	public static final int BYTE = 117;

	/** The Constant PERCENT. */
	public static final int PERCENT = 88;

	/** The Constant VOLATILE. */
	public static final int VOLATILE = 134;

	/** The Constant DECL_ATTR_LIST. */
	public static final int DECL_ATTR_LIST = 12;

	/** The Constant ASSIGN_OPERATOR. */
	public static final int ASSIGN_OPERATOR = 14;

	/** The Constant TYPEDEF. */
	public static final int TYPEDEF = 101;

	/** The Constant UNICODE_ESC. */
	public static final int UNICODE_ESC = 155;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = 70;

	/** The Constant EQEQEQ. */
	public static final int EQEQEQ = 141;

	/** The Constant HEX_DIGIT. */
	public static final int HEX_DIGIT = 154;

	/** The Constant SHORT. */
	public static final int SHORT = 128;

	/** The Constant BANG. */
	public static final int BANG = 40;

	/** The Constant INSTANCEOF. */
	public static final int INSTANCEOF = 124;

	/** The Constant GTEQ. */
	public static final int GTEQ = 77;

	/** The Constant PP_ERROR. */
	public static final int PP_ERROR = 44;

	/** The Constant MODULE. */
	public static final int MODULE = 5;

	/** The Constant SEMI. */
	public static final int SEMI = 16;

	/** The Constant TRUE. */
	public static final int TRUE = 107;

	/** The Constant COLON. */
	public static final int COLON = 45;

	/** The Constant PARAM_LIST. */
	public static final int PARAM_LIST = 8;

	/** The Constant PERCENTLESQ. */
	public static final int PERCENTLESQ = 142;

	/** The Constant ENUM. */
	public static final int ENUM = 94;

	/** The Constant PERCENTEQ. */
	public static final int PERCENTEQ = 32;

	/** The Constant FINALLY. */
	public static final int FINALLY = 122;

	/** The Constant PROPERTY_DECL. */
	public static final int PROPERTY_DECL = 4;

	/** The Constant OVERRIDE. */
	public static final int OVERRIDE = 25;

	/** The Constant STRINGLITERAL. */
	public static final int STRINGLITERAL = 104;

	/** The Constant CARETEQ. */
	public static final int CARETEQ = 137;

	/** The Constant PERCENTBBB. */
	public static final int PERCENTBBB = 147;

	/** The Constant INTERFACE. */
	public static final int INTERFACE = 98;

	/** The Constant LONG. */
	public static final int LONG = 125;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = 20;

	/** The Constant EXTENDS. */
	public static final int EXTENDS = 99;

	/** The Constant TYPE_TAG. */
	public static final int TYPE_TAG = 9;

	/** The Constant BAR. */
	public static final int BAR = 79;

	// delegates
	// delegators

	/**
	 * Instantiates a new tiny haxe try1 lexer.
	 */
	public TinyHaxeTry1Lexer() {
		;
	}

	/**
	 * Instantiates a new tiny haxe try1 lexer.
	 * 
	 * @param input
	 *            the input
	 */
	public TinyHaxeTry1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	/**
	 * Instantiates a new tiny haxe try1 lexer.
	 * 
	 * @param input
	 *            the input
	 * @param state
	 *            the state
	 */
	public TinyHaxeTry1Lexer(CharStream input, RecognizerSharedState state) {
		super(input, state);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.BaseRecognizer#getGrammarFileName()
	 */
	@Override
	public String getGrammarFileName() {
		return "C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g";
	}

	// $ANTLR start "WS"
	/**
	 * M ws.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:5:
			// ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:9:
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
	/**
	 * M longliteral.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLONGLITERAL() throws RecognitionException {
		try {
			int _type = LONGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:463:5:
			// ( IntegerNumber LongSuffix )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:463:9:
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
	/**
	 * M intliteral.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:468:5:
			// ( IntegerNumber )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:468:9:
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
	/**
	 * M integer number.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIntegerNumber() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:473:5:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:473:9:
				// '0'
			{
				match('0');

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:474:9:
				// '1' .. '9' ( '0' .. '9' )*
			{
				matchRange('1', '9');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:474:18:
				// ( '0' .. '9' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:474:19:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:475:9:
				// '0' ( '0' .. '7' )+
			{
				match('0');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:475:13:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:475:14:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:476:9:
				// HexPrefix ( HexDigit )+
			{
				mHexPrefix();
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:476:19:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:476:19:
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
	/**
	 * M hex prefix.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mHexPrefix() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:481:5:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:481:9:
				// '0x'
			{
				match("0x");

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:481:16:
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
	/**
	 * M hex digit.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mHexDigit() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:486:5:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:486:9:
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
	/**
	 * M long suffix.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLongSuffix() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:491:5:
			// ( 'l' | 'L' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
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
	/**
	 * M exponent.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mExponent() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:496:5:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:496:9:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:496:23:
				// ( '+' | '-' )?
				int alt6 = 2;
				int LA6_0 = input.LA(1);

				if ((LA6_0 == '+' || LA6_0 == '-')) {
					alt6 = 1;
				}
				switch (alt6) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:496:38:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:496:40:
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
	/**
	 * M charliteral.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCHARLITERAL() throws RecognitionException {
		try {
			int _type = CHARLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:500:5:
			// ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\'' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:500:9:
			// '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\''
			{
				match('\'');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:501:9:
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
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:501:13:
					// EscapeSequence
				{
					mEscapeSequence();

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:502:13:
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
	/**
	 * M escape sequence.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:510:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\'
			// | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:510:9:
			// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' |
			// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) )
			{
				match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:510:14:
				// ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | (
				// '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
				// '0' .. '7' ) | ( '0' .. '7' ) )
				int alt9 = 11;
				alt9 = dfa9.predict(input);
				switch (alt9) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:511:18:
					// 'b'
				{
					match('b');

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:512:18:
					// 't'
				{
					match('t');

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:18:
					// 'n'
				{
					match('n');

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:514:18:
					// 'f'
				{
					match('f');

				}
					break;
				case 5:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:515:18:
					// 'r'
				{
					match('r');

				}
					break;
				case 6:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:516:18:
					// '\\\"'
				{
					match('\"');

				}
					break;
				case 7:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:517:18:
					// '\\''
				{
					match('\'');

				}
					break;
				case 8:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:518:18:
					// '\\\\'
				{
					match('\\');

				}
					break;
				case 9:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:18:
					// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:18:
					// ( '0' .. '3' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:19:
					// '0' .. '3'
					{
						matchRange('0', '3');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:29:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:30:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:40:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:520:41:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

				}
					break;
				case 10:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:522:18:
					// ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:522:18:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:522:19:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:522:29:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:522:30:
					// '0' .. '7'
					{
						matchRange('0', '7');

					}

				}
					break;
				case 11:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:524:18:
					// ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:524:18:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:524:19:
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
	/**
	 * M abstract.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mABSTRACT() throws RecognitionException {
		try {
			int _type = ABSTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:529:5:
			// ( 'abstract' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:529:9:
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
	/**
	 * M boolean.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:533:5:
			// ( 'Bool' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:533:9:
			// 'Bool'
			{
				match("Bool");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "BOOLEAN"

	// $ANTLR start "BREAK"
	/**
	 * M break.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:5:
			// ( 'break' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:9:
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
	/**
	 * M byte.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBYTE() throws RecognitionException {
		try {
			int _type = BYTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:541:5:
			// ( 'byte' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:541:9:
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
	/**
	 * M case.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:545:5:
			// ( 'case' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:545:9:
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
	/**
	 * M catch.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCATCH() throws RecognitionException {
		try {
			int _type = CATCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:549:5:
			// ( 'catch' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:549:9:
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
	/**
	 * M char.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:553:5:
			// ( 'char' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:553:9:
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
	/**
	 * M class.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:557:5:
			// ( 'class' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:557:9:
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
	/**
	 * M const.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:561:5:
			// ( 'const' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:561:9:
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
	/**
	 * M continue.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:565:5:
			// ( 'continue' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:565:9:
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
	/**
	 * M default.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:569:5:
			// ( 'default' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:569:9:
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
	/**
	 * M do.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:573:5:
			// ( 'do' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:573:9:
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
	/**
	 * M double.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:577:5:
			// ( 'double' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:577:9:
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
	/**
	 * M else.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:581:5:
			// ( 'else' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:581:9:
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
	/**
	 * M enum.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:585:5:
			// ( 'enum' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:585:9:
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
	/**
	 * M extends.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEXTENDS() throws RecognitionException {
		try {
			int _type = EXTENDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:589:5:
			// ( 'extends' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:589:9:
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
	/**
	 * M final.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFINAL() throws RecognitionException {
		try {
			int _type = FINAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:593:5:
			// ( 'final' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:593:9:
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
	/**
	 * M finally.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFINALLY() throws RecognitionException {
		try {
			int _type = FINALLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:597:5:
			// ( 'finally' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:597:9:
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
	/**
	 * M float.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:601:5:
			// ( 'Float' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:601:9:
			// 'Float'
			{
				match("Float");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "FLOAT"

	// $ANTLR start "FOR"
	/**
	 * M for.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:605:5:
			// ( 'for' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:605:9:
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
	/**
	 * M goto.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGOTO() throws RecognitionException {
		try {
			int _type = GOTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:609:5:
			// ( 'goto' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:609:9:
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
	/**
	 * M if.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:613:5:
			// ( 'if' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:613:9:
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
	/**
	 * M implements.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIMPLEMENTS() throws RecognitionException {
		try {
			int _type = IMPLEMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:617:5:
			// ( 'implements' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:617:9:
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
	/**
	 * M import.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIMPORT() throws RecognitionException {
		try {
			int _type = IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:621:5:
			// ( 'import' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:621:9:
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
	/**
	 * M instanceof.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINSTANCEOF() throws RecognitionException {
		try {
			int _type = INSTANCEOF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:625:5:
			// ( 'instanceof' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:625:9:
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
	/**
	 * M int.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:629:5:
			// ( 'Int' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:629:9:
			// 'Int'
			{
				match("Int");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "INT"

	// $ANTLR start "INTERFACE"
	/**
	 * M interface.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINTERFACE() throws RecognitionException {
		try {
			int _type = INTERFACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:633:5:
			// ( 'interface' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:633:9:
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
	/**
	 * M long.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:637:5:
			// ( 'long' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:637:9:
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
	/**
	 * M native.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mNATIVE() throws RecognitionException {
		try {
			int _type = NATIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:641:5:
			// ( 'native' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:641:9:
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
	/**
	 * M new.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:645:5:
			// ( 'new' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:645:9:
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
	/**
	 * M package.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPACKAGE() throws RecognitionException {
		try {
			int _type = PACKAGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:649:5:
			// ( 'package' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:649:9:
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
	/**
	 * M private.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:653:5:
			// ( 'private' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:653:9:
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
	/**
	 * M protected.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:657:5:
			// ( 'protected' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:657:9:
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
	/**
	 * M public.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:661:5:
			// ( 'public' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:661:9:
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
	/**
	 * M return.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:665:5:
			// ( 'return' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:665:9:
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
	/**
	 * M short.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:669:5:
			// ( 'short' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:669:9:
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
	/**
	 * M static.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:673:5:
			// ( 'static' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:673:9:
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
	/**
	 * M inline.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINLINE() throws RecognitionException {
		try {
			int _type = INLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:677:2:
			// ( 'inline' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:677:4:
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
	/**
	 * M dynamic.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mDYNAMIC() throws RecognitionException {
		try {
			int _type = DYNAMIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:681:2:
			// ( 'dynamic' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:681:3:
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
	/**
	 * M override.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mOVERRIDE() throws RecognitionException {
		try {
			int _type = OVERRIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:685:2:
			// ( 'override' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:685:3:
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
	/**
	 * M strictfp.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSTRICTFP() throws RecognitionException {
		try {
			int _type = STRICTFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:689:5:
			// ( 'strictfp' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:689:9:
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
	/**
	 * M super.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSUPER() throws RecognitionException {
		try {
			int _type = SUPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:693:5:
			// ( 'super' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:693:9:
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
	/**
	 * M switch.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:697:5:
			// ( 'switch' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:697:9:
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
	/**
	 * M this.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:701:5:
			// ( 'this' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:701:9:
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
	/**
	 * M throw.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTHROW() throws RecognitionException {
		try {
			int _type = THROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:705:5:
			// ( 'throw' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:705:9:
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
	/**
	 * M throws.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTHROWS() throws RecognitionException {
		try {
			int _type = THROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:709:5:
			// ( 'throws' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:709:9:
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
	/**
	 * M transient.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTRANSIENT() throws RecognitionException {
		try {
			int _type = TRANSIENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:713:5:
			// ( 'transient' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:713:9:
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
	/**
	 * M try.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTRY() throws RecognitionException {
		try {
			int _type = TRY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:717:5:
			// ( 'try' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:717:9:
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
	/**
	 * M void.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:721:5:
			// ( 'Void' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:721:9:
			// 'Void'
			{
				match("Void");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "VOID"

	// $ANTLR start "VOLATILE"
	/**
	 * M volatile.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mVOLATILE() throws RecognitionException {
		try {
			int _type = VOLATILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:725:5:
			// ( 'volatile' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:725:9:
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
	/**
	 * M while.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:729:5:
			// ( 'while' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:729:9:
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
	/**
	 * M true.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:733:5:
			// ( 'true' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:733:9:
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
	/**
	 * M false.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:737:5:
			// ( 'false' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:737:9:
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
	/**
	 * M null.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:741:5:
			// ( 'null' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:741:9:
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
	/**
	 * M cast.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCAST() throws RecognitionException {
		try {
			int _type = CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:743:6:
			// ( 'cast' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:743:8:
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
	/**
	 * M function.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:747:2:
			// ( 'function' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:747:4:
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
	/**
	 * M in.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:750:4:
			// ( 'in' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:750:6:
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
	/**
	 * M var.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:752:5:
			// ( 'var' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:752:7:
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
	/**
	 * M typedef.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTYPEDEF() throws RecognitionException {
		try {
			int _type = TYPEDEF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:754:9:
			// ( 'typedef' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:754:11:
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
	/**
	 * M extern.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEXTERN() throws RecognitionException {
		try {
			int _type = EXTERN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:756:8:
			// ( 'extern' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:756:10:
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
	/**
	 * M lparen.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:760:5:
			// ( '(' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:760:9:
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
	/**
	 * M rparen.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:764:5:
			// ( ')' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:764:9:
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
	/**
	 * M lbrace.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:768:5:
			// ( '{' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:768:9:
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
	/**
	 * M rbrace.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:772:5:
			// ( '}' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:772:9:
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
	/**
	 * M lbracket.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:776:5:
			// ( '[' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:776:9:
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
	/**
	 * M rbracket.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:780:5:
			// ( ']' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:780:9:
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
	/**
	 * M semi.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:784:5:
			// ( ';' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:784:9:
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
	/**
	 * M comma.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:788:5:
			// ( ',' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:788:9:
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
	/**
	 * M dot.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:792:5:
			// ( '.' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:792:9:
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
	/**
	 * M ellipsis.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mELLIPSIS() throws RecognitionException {
		try {
			int _type = ELLIPSIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:796:5:
			// ( '...' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:796:9:
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
	/**
	 * M eq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:800:5:
			// ( '=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:800:9:
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
	/**
	 * M bang.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBANG() throws RecognitionException {
		try {
			int _type = BANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:804:5:
			// ( '!' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:804:9:
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
	/**
	 * M tilde.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:808:5:
			// ( '~' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:808:9:
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
	/**
	 * M ques.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mQUES() throws RecognitionException {
		try {
			int _type = QUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:812:5:
			// ( '?' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:812:9:
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
	/**
	 * M colon.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:816:5:
			// ( ':' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:816:9:
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
	/**
	 * M eqeq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEQEQ() throws RecognitionException {
		try {
			int _type = EQEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:820:5:
			// ( '==' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:820:9:
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
	/**
	 * M ampamp.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mAMPAMP() throws RecognitionException {
		try {
			int _type = AMPAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:824:5:
			// ( '&&' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:824:9:
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
	/**
	 * M barbar.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBARBAR() throws RecognitionException {
		try {
			int _type = BARBAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:828:5:
			// ( '||' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:828:9:
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
	/**
	 * M plusplus.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPLUSPLUS() throws RecognitionException {
		try {
			int _type = PLUSPLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:832:5:
			// ( '++' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:832:9:
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
	/**
	 * M subsub.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSUBSUB() throws RecognitionException {
		try {
			int _type = SUBSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:836:5:
			// ( '--' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:836:9:
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
	/**
	 * M plus.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:840:5:
			// ( '+' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:840:9:
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
	/**
	 * M sub.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:844:5:
			// ( '-' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:844:9:
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
	/**
	 * M star.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:848:5:
			// ( '*' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:848:9:
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
	/**
	 * M slash.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:852:5:
			// ( '/' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:852:9:
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
	/**
	 * M amp.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:856:5:
			// ( '&' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:856:9:
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
	/**
	 * M bar.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBAR() throws RecognitionException {
		try {
			int _type = BAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:860:5:
			// ( '|' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:860:9:
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
	/**
	 * M caret.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:864:5:
			// ( '^' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:864:9:
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
	/**
	 * M percent.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:868:5:
			// ( '%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:868:9:
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
	/**
	 * M pluseq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPLUSEQ() throws RecognitionException {
		try {
			int _type = PLUSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:872:5:
			// ( '+=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:872:9:
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
	/**
	 * M subeq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSUBEQ() throws RecognitionException {
		try {
			int _type = SUBEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:876:5:
			// ( '-=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:876:9:
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
	/**
	 * M stareq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSTAREQ() throws RecognitionException {
		try {
			int _type = STAREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:880:5:
			// ( '*=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:880:9:
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
	/**
	 * M slasheq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSLASHEQ() throws RecognitionException {
		try {
			int _type = SLASHEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:884:5:
			// ( '/=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:884:9:
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
	/**
	 * M ampeq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mAMPEQ() throws RecognitionException {
		try {
			int _type = AMPEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:888:5:
			// ( '&=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:888:9:
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
	/**
	 * M bareq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBAREQ() throws RecognitionException {
		try {
			int _type = BAREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:892:5:
			// ( '|=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:892:9:
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
	/**
	 * M careteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCARETEQ() throws RecognitionException {
		try {
			int _type = CARETEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:896:5:
			// ( '^=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:896:9:
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
	/**
	 * M percenteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTEQ() throws RecognitionException {
		try {
			int _type = PERCENTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:900:5:
			// ( '%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:900:9:
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
	/**
	 * M percentdlq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTDLQ() throws RecognitionException {
		try {
			int _type = PERCENTDLQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:904:2:
			// ( '%%<<%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:904:4:
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
	/**
	 * M percentdbq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTDBQ() throws RecognitionException {
		try {
			int _type = PERCENTDBQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:907:2:
			// ( '%%>>%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:907:4:
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
	/**
	 * M percentdbbq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTDBBQ() throws RecognitionException {
		try {
			int _type = PERCENTDBBQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:910:2:
			// ( '%%>>>%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:910:4:
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
	/**
	 * M eqeqeq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEQEQEQ() throws RecognitionException {
		try {
			int _type = EQEQEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:913:2:
			// ( '===' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:913:3:
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
	/**
	 * M percentlesq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTLESQ() throws RecognitionException {
		try {
			int _type = PERCENTLESQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:917:1:
			// ( '%%<=%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:917:3:
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
	/**
	 * M bangeqq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBANGEQQ() throws RecognitionException {
		try {
			int _type = BANGEQQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:921:2:
			// ( '!==' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:921:3:
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
	/**
	 * M monkey s_ at.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mMONKEYS_AT() throws RecognitionException {
		try {
			int _type = MONKEYS_AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:925:5:
			// ( '@' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:925:9:
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
	/**
	 * M bangeq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mBANGEQ() throws RecognitionException {
		try {
			int _type = BANGEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:928:8:
			// ( '!=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:928:10:
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
	/**
	 * M minu s_ bigger.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mMINUS_BIGGER() throws RecognitionException {
		try {
			int _type = MINUS_BIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:932:2:
			// ( '->' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:932:4:
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
	/**
	 * M percentll.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTLL() throws RecognitionException {
		try {
			int _type = PERCENTLL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:936:2:
			// ( '%%<<%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:936:3:
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
	/**
	 * M percentbb.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTBB() throws RecognitionException {
		try {
			int _type = PERCENTBB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:939:2:
			// ( '%%>>%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:939:3:
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
	/**
	 * M percentbbb.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPERCENTBBB() throws RecognitionException {
		try {
			int _type = PERCENTBBB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:942:2:
			// ( '%%>>>%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:942:3:
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
	/**
	 * M gt.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:945:4:
			// ( '>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:945:6:
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
	/**
	 * M gtgt.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGTGT() throws RecognitionException {
		try {
			int _type = GTGT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:948:6:
			// ( '>>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:948:8:
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
	/**
	 * M ltlt.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLTLT() throws RecognitionException {
		try {
			int _type = LTLT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:951:6:
			// ( '<<' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:951:8:
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
	/**
	 * M gtgtgt.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGTGTGT() throws RecognitionException {
		try {
			int _type = GTGTGT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:953:8:
			// ( '>>>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:953:10:
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
	/**
	 * M ltlteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLTLTEQ() throws RecognitionException {
		try {
			int _type = LTLTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:956:8:
			// ( '<<=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:956:10:
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
	/**
	 * M gtgteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGTGTEQ() throws RecognitionException {
		try {
			int _type = GTGTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:959:8:
			// ( '>>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:959:10:
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
	/**
	 * M gtgtgteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGTGTGTEQ() throws RecognitionException {
		try {
			int _type = GTGTGTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:962:9:
			// ( '>>>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:962:11:
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
	/**
	 * M gteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:965:6:
			// ( '>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:965:8:
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
	/**
	 * M lteq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:967:6:
			// ( '<=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:967:8:
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
	/**
	 * M lt.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:971:5:
			// ( '<' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:971:9:
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
	/**
	 * M identifier.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:975:5:
			// ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' |
			// '0' .. '9' | '_' )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:975:8:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:975:32:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
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
	/**
	 * M intnum.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mINTNUM() throws RecognitionException {
		try {
			int _type = INTNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:978:8:
			// ( ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:978:10:
			// ( '0' .. '9' )+
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:978:10:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:978:10:
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
	/**
	 * M floatnum.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mFLOATNUM() throws RecognitionException {
		try {
			int _type = FLOATNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:5:
			// ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0'
			// .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt18 = 3;
			alt18 = dfa18.predict(input);
			switch (alt18) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:9:
				// ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:9:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:10:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:25:
				// ( '0' .. '9' )*
				loop13: do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

					if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:26:
						// '0' .. '9'
					{
						matchRange('0', '9');

					}
						break;

					default:
						break loop13;
					}
				} while (true);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:37:
				// ( EXPONENT )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);

				if ((LA14_0 == 'E' || LA14_0 == 'e')) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:37:
					// EXPONENT
				{
					mEXPONENT();

				}
					break;

				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:983:9:
				// '.' ( '0' .. '9' )+ ( EXPONENT )?
			{
				match('.');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:983:13:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:983:14:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:983:25:
				// ( EXPONENT )?
				int alt16 = 2;
				int LA16_0 = input.LA(1);

				if ((LA16_0 == 'E' || LA16_0 == 'e')) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:983:25:
					// EXPONENT
				{
					mEXPONENT();

				}
					break;

				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:984:9:
				// ( '0' .. '9' )+ EXPONENT
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:984:9:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:984:10:
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
	/**
	 * M comment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:5:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:9:
				// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				match("//");

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:14:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:14:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:28:
				// ( '\\r' )?
				int alt20 = 2;
				int LA20_0 = input.LA(1);

				if ((LA20_0 == '\r')) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:28:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:989:9:
				// '/*' ( options {greedy=false; } : . )* '*/'
			{
				match("/*");

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:989:14:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:989:42:
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
	/**
	 * M stringliteral.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:994:5:
			// ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:994:9:
			// '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"'
			{
				match('\"');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:9:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:13:
						// EscapeSequence
					{
						mEscapeSequence();

					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:996:13:
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
	/**
	 * M p p_ if.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPP_IF() throws RecognitionException {
		try {
			int _type = PP_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1002:7:
			// ( '#if' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1002:9:
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
	/**
	 * M p p_ elseif.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPP_ELSEIF() throws RecognitionException {
		try {
			int _type = PP_ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:2:
			// ( '#elseif' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:4:
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
	/**
	 * M p p_ else.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPP_ELSE() throws RecognitionException {
		try {
			int _type = PP_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1007:9:
			// ( '#else' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1007:11:
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
	/**
	 * M p p_ end.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPP_END() throws RecognitionException {
		try {
			int _type = PP_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1009:8:
			// ( '#end' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1009:10:
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
	/**
	 * M p p_ error.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPP_ERROR() throws RecognitionException {
		try {
			int _type = PP_ERROR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1011:9:
			// ( '#error' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1011:11:
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
	/**
	 * M exponent.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:10:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:12:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:22:
				// ( '+' | '-' )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);

				if ((LA24_0 == '+' || LA24_0 == '-')) {
					alt24 = 1;
				}
				switch (alt24) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
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

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:33:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:34:
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
	/**
	 * M he x_ digit.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1018:11:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1018:13:
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
	/**
	 * M es c_ seq.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1022:5:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1022:9:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1023:9:
				// UNICODE_ESC
			{
				mUNICODE_ESC();

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1024:9:
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
	/**
	 * M octa l_ esc.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:5:
			// ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' (
			// '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt27 = 3;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == '\\')) {
				int LA27_1 = input.LA(2);

				if (((LA27_1 >= '0' && LA27_1 <= '3'))) {
					int LA27_2 = input.LA(3);

					if (((LA27_2 >= '0' && LA27_2 <= '7'))) {
						int LA27_4 = input.LA(4);

						if (((LA27_4 >= '0' && LA27_4 <= '7'))) {
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:9:
				// '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:14:
				// ( '0' .. '3' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:15:
				// '0' .. '3'
				{
					matchRange('0', '3');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:25:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:26:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:36:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1029:37:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1030:9:
				// '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
			{
				match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1030:14:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1030:15:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1030:25:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1030:26:
				// '0' .. '7'
				{
					matchRange('0', '7');

				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1031:9:
				// '\\\\' ( '0' .. '7' )
			{
				match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1031:14:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1031:15:
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
	/**
	 * M unicod e_ esc.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1036:5:
			// ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1036:9:
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.Lexer#mTokens()
	 */
	@Override
	public void mTokens() throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:8:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:10:
			// WS
		{
			mWS();

		}
			break;
		case 2:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:13:
			// LONGLITERAL
		{
			mLONGLITERAL();

		}
			break;
		case 3:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:25:
			// INTLITERAL
		{
			mINTLITERAL();

		}
			break;
		case 4:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:36:
			// CHARLITERAL
		{
			mCHARLITERAL();

		}
			break;
		case 5:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:48:
			// ABSTRACT
		{
			mABSTRACT();

		}
			break;
		case 6:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:57:
			// BOOLEAN
		{
			mBOOLEAN();

		}
			break;
		case 7:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:65:
			// BREAK
		{
			mBREAK();

		}
			break;
		case 8:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:71:
			// BYTE
		{
			mBYTE();

		}
			break;
		case 9:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:76:
			// CASE
		{
			mCASE();

		}
			break;
		case 10:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:81:
			// CATCH
		{
			mCATCH();

		}
			break;
		case 11:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:87:
			// CHAR
		{
			mCHAR();

		}
			break;
		case 12:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:92:
			// CLASS
		{
			mCLASS();

		}
			break;
		case 13:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:98:
			// CONST
		{
			mCONST();

		}
			break;
		case 14:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:104:
			// CONTINUE
		{
			mCONTINUE();

		}
			break;
		case 15:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:113:
			// DEFAULT
		{
			mDEFAULT();

		}
			break;
		case 16:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:121:
			// DO
		{
			mDO();

		}
			break;
		case 17:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:124:
			// DOUBLE
		{
			mDOUBLE();

		}
			break;
		case 18:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:131:
			// ELSE
		{
			mELSE();

		}
			break;
		case 19:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:136:
			// ENUM
		{
			mENUM();

		}
			break;
		case 20:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:141:
			// EXTENDS
		{
			mEXTENDS();

		}
			break;
		case 21:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:149:
			// FINAL
		{
			mFINAL();

		}
			break;
		case 22:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:155:
			// FINALLY
		{
			mFINALLY();

		}
			break;
		case 23:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:163:
			// FLOAT
		{
			mFLOAT();

		}
			break;
		case 24:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:169:
			// FOR
		{
			mFOR();

		}
			break;
		case 25:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:173:
			// GOTO
		{
			mGOTO();

		}
			break;
		case 26:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:178:
			// IF
		{
			mIF();

		}
			break;
		case 27:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:181:
			// IMPLEMENTS
		{
			mIMPLEMENTS();

		}
			break;
		case 28:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:192:
			// IMPORT
		{
			mIMPORT();

		}
			break;
		case 29:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:199:
			// INSTANCEOF
		{
			mINSTANCEOF();

		}
			break;
		case 30:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:210:
			// INT
		{
			mINT();

		}
			break;
		case 31:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:214:
			// INTERFACE
		{
			mINTERFACE();

		}
			break;
		case 32:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:224:
			// LONG
		{
			mLONG();

		}
			break;
		case 33:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:229:
			// NATIVE
		{
			mNATIVE();

		}
			break;
		case 34:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:236:
			// NEW
		{
			mNEW();

		}
			break;
		case 35:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:240:
			// PACKAGE
		{
			mPACKAGE();

		}
			break;
		case 36:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:248:
			// PRIVATE
		{
			mPRIVATE();

		}
			break;
		case 37:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:256:
			// PROTECTED
		{
			mPROTECTED();

		}
			break;
		case 38:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:266:
			// PUBLIC
		{
			mPUBLIC();

		}
			break;
		case 39:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:273:
			// RETURN
		{
			mRETURN();

		}
			break;
		case 40:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:280:
			// SHORT
		{
			mSHORT();

		}
			break;
		case 41:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:286:
			// STATIC
		{
			mSTATIC();

		}
			break;
		case 42:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:293:
			// INLINE
		{
			mINLINE();

		}
			break;
		case 43:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:300:
			// DYNAMIC
		{
			mDYNAMIC();

		}
			break;
		case 44:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:308:
			// OVERRIDE
		{
			mOVERRIDE();

		}
			break;
		case 45:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:317:
			// STRICTFP
		{
			mSTRICTFP();

		}
			break;
		case 46:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:326:
			// SUPER
		{
			mSUPER();

		}
			break;
		case 47:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:332:
			// SWITCH
		{
			mSWITCH();

		}
			break;
		case 48:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:339:
			// THIS
		{
			mTHIS();

		}
			break;
		case 49:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:344:
			// THROW
		{
			mTHROW();

		}
			break;
		case 50:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:350:
			// THROWS
		{
			mTHROWS();

		}
			break;
		case 51:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:357:
			// TRANSIENT
		{
			mTRANSIENT();

		}
			break;
		case 52:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:367:
			// TRY
		{
			mTRY();

		}
			break;
		case 53:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:371:
			// VOID
		{
			mVOID();

		}
			break;
		case 54:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:376:
			// VOLATILE
		{
			mVOLATILE();

		}
			break;
		case 55:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:385:
			// WHILE
		{
			mWHILE();

		}
			break;
		case 56:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:391:
			// TRUE
		{
			mTRUE();

		}
			break;
		case 57:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:396:
			// FALSE
		{
			mFALSE();

		}
			break;
		case 58:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:402:
			// NULL
		{
			mNULL();

		}
			break;
		case 59:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:407:
			// CAST
		{
			mCAST();

		}
			break;
		case 60:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:412:
			// FUNCTION
		{
			mFUNCTION();

		}
			break;
		case 61:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:421:
			// IN
		{
			mIN();

		}
			break;
		case 62:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:424:
			// VAR
		{
			mVAR();

		}
			break;
		case 63:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:428:
			// TYPEDEF
		{
			mTYPEDEF();

		}
			break;
		case 64:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:436:
			// EXTERN
		{
			mEXTERN();

		}
			break;
		case 65:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:443:
			// LPAREN
		{
			mLPAREN();

		}
			break;
		case 66:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:450:
			// RPAREN
		{
			mRPAREN();

		}
			break;
		case 67:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:457:
			// LBRACE
		{
			mLBRACE();

		}
			break;
		case 68:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:464:
			// RBRACE
		{
			mRBRACE();

		}
			break;
		case 69:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:471:
			// LBRACKET
		{
			mLBRACKET();

		}
			break;
		case 70:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:480:
			// RBRACKET
		{
			mRBRACKET();

		}
			break;
		case 71:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:489:
			// SEMI
		{
			mSEMI();

		}
			break;
		case 72:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:494:
			// COMMA
		{
			mCOMMA();

		}
			break;
		case 73:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:500:
			// DOT
		{
			mDOT();

		}
			break;
		case 74:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:504:
			// ELLIPSIS
		{
			mELLIPSIS();

		}
			break;
		case 75:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:513:
			// EQ
		{
			mEQ();

		}
			break;
		case 76:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:516:
			// BANG
		{
			mBANG();

		}
			break;
		case 77:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:521:
			// TILDE
		{
			mTILDE();

		}
			break;
		case 78:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:527:
			// QUES
		{
			mQUES();

		}
			break;
		case 79:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:532:
			// COLON
		{
			mCOLON();

		}
			break;
		case 80:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:538:
			// EQEQ
		{
			mEQEQ();

		}
			break;
		case 81:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:543:
			// AMPAMP
		{
			mAMPAMP();

		}
			break;
		case 82:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:550:
			// BARBAR
		{
			mBARBAR();

		}
			break;
		case 83:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:557:
			// PLUSPLUS
		{
			mPLUSPLUS();

		}
			break;
		case 84:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:566:
			// SUBSUB
		{
			mSUBSUB();

		}
			break;
		case 85:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:573:
			// PLUS
		{
			mPLUS();

		}
			break;
		case 86:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:578:
			// SUB
		{
			mSUB();

		}
			break;
		case 87:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:582:
			// STAR
		{
			mSTAR();

		}
			break;
		case 88:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:587:
			// SLASH
		{
			mSLASH();

		}
			break;
		case 89:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:593:
			// AMP
		{
			mAMP();

		}
			break;
		case 90:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:597:
			// BAR
		{
			mBAR();

		}
			break;
		case 91:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:601:
			// CARET
		{
			mCARET();

		}
			break;
		case 92:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:607:
			// PERCENT
		{
			mPERCENT();

		}
			break;
		case 93:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:615:
			// PLUSEQ
		{
			mPLUSEQ();

		}
			break;
		case 94:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:622:
			// SUBEQ
		{
			mSUBEQ();

		}
			break;
		case 95:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:628:
			// STAREQ
		{
			mSTAREQ();

		}
			break;
		case 96:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:635:
			// SLASHEQ
		{
			mSLASHEQ();

		}
			break;
		case 97:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:643:
			// AMPEQ
		{
			mAMPEQ();

		}
			break;
		case 98:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:649:
			// BAREQ
		{
			mBAREQ();

		}
			break;
		case 99:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:655:
			// CARETEQ
		{
			mCARETEQ();

		}
			break;
		case 100:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:663:
			// PERCENTEQ
		{
			mPERCENTEQ();

		}
			break;
		case 101:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:673:
			// PERCENTDLQ
		{
			mPERCENTDLQ();

		}
			break;
		case 102:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:684:
			// PERCENTDBQ
		{
			mPERCENTDBQ();

		}
			break;
		case 103:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:695:
			// PERCENTDBBQ
		{
			mPERCENTDBBQ();

		}
			break;
		case 104:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:707:
			// EQEQEQ
		{
			mEQEQEQ();

		}
			break;
		case 105:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:714:
			// PERCENTLESQ
		{
			mPERCENTLESQ();

		}
			break;
		case 106:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:726:
			// BANGEQQ
		{
			mBANGEQQ();

		}
			break;
		case 107:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:734:
			// MONKEYS_AT
		{
			mMONKEYS_AT();

		}
			break;
		case 108:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:745:
			// BANGEQ
		{
			mBANGEQ();

		}
			break;
		case 109:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:752:
			// MINUS_BIGGER
		{
			mMINUS_BIGGER();

		}
			break;
		case 110:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:765:
			// PERCENTLL
		{
			mPERCENTLL();

		}
			break;
		case 111:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:775:
			// PERCENTBB
		{
			mPERCENTBB();

		}
			break;
		case 112:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:785:
			// PERCENTBBB
		{
			mPERCENTBBB();

		}
			break;
		case 113:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:796:
			// GT
		{
			mGT();

		}
			break;
		case 114:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:799:
			// GTGT
		{
			mGTGT();

		}
			break;
		case 115:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:804:
			// LTLT
		{
			mLTLT();

		}
			break;
		case 116:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:809:
			// GTGTGT
		{
			mGTGTGT();

		}
			break;
		case 117:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:816:
			// LTLTEQ
		{
			mLTLTEQ();

		}
			break;
		case 118:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:823:
			// GTGTEQ
		{
			mGTGTEQ();

		}
			break;
		case 119:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:830:
			// GTGTGTEQ
		{
			mGTGTGTEQ();

		}
			break;
		case 120:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:839:
			// GTEQ
		{
			mGTEQ();

		}
			break;
		case 121:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:844:
			// LTEQ
		{
			mLTEQ();

		}
			break;
		case 122:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:849:
			// LT
		{
			mLT();

		}
			break;
		case 123:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:852:
			// IDENTIFIER
		{
			mIDENTIFIER();

		}
			break;
		case 124:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:863:
			// INTNUM
		{
			mINTNUM();

		}
			break;
		case 125:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:870:
			// FLOATNUM
		{
			mFLOATNUM();

		}
			break;
		case 126:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:879:
			// COMMENT
		{
			mCOMMENT();

		}
			break;
		case 127:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:887:
			// STRINGLITERAL
		{
			mSTRINGLITERAL();

		}
			break;
		case 128:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:901:
			// PP_IF
		{
			mPP_IF();

		}
			break;
		case 129:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:907:
			// PP_ELSEIF
		{
			mPP_ELSEIF();

		}
			break;
		case 130:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:917:
			// PP_ELSE
		{
			mPP_ELSE();

		}
			break;
		case 131:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:925:
			// PP_END
		{
			mPP_END();

		}
			break;
		case 132:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:932:
			// PP_ERROR
		{
			mPP_ERROR();

		}
			break;

		}

	}

	/** The dfa9. */
	protected DFA9 dfa9 = new DFA9(this);

	/** The dfa18. */
	protected DFA18 dfa18 = new DFA18(this);

	/** The dfa28. */
	protected DFA28 dfa28 = new DFA28(this);

	/** The Constant DFA9_eotS. */
	static final String DFA9_eotS = "\11\uffff\2\14\1\15\3\uffff";

	/** The Constant DFA9_eofS. */
	static final String DFA9_eofS = "\17\uffff";

	/** The Constant DFA9_minS. */
	static final String DFA9_minS = "\1\42\10\uffff\3\60\3\uffff";

	/** The Constant DFA9_maxS. */
	static final String DFA9_maxS = "\1\164\10\uffff\3\67\3\uffff";

	/** The Constant DFA9_acceptS. */
	static final String DFA9_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\12\1\11";

	/** The Constant DFA9_specialS. */
	static final String DFA9_specialS = "\17\uffff}>";

	/** The Constant DFA9_transitionS. */
	static final String[] DFA9_transitionS = {
			"\1\6\4\uffff\1\7\10\uffff\4\11\4\12\44\uffff\1\10\5\uffff\1"
					+ "\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2", "",
			"", "", "", "", "", "", "", "\10\13", "\10\15", "\10\16", "", "",
			"" };

	/** The Constant DFA9_eot. */
	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);

	/** The Constant DFA9_eof. */
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);

	/** The Constant DFA9_min. */
	static final char[] DFA9_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_minS);

	/** The Constant DFA9_max. */
	static final char[] DFA9_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA9_maxS);

	/** The Constant DFA9_accept. */
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);

	/** The Constant DFA9_special. */
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);

	/** The Constant DFA9_transition. */
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	/**
	 * The Class DFA9.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA9 extends DFA {

		/**
		 * Instantiates a new dF a9.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
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

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "510:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
		}
	}

	/** The Constant DFA18_eotS. */
	static final String DFA18_eotS = "\5\uffff";

	/** The Constant DFA18_eofS. */
	static final String DFA18_eofS = "\5\uffff";

	/** The Constant DFA18_minS. */
	static final String DFA18_minS = "\2\56\3\uffff";

	/** The Constant DFA18_maxS. */
	static final String DFA18_maxS = "\1\71\1\145\3\uffff";

	/** The Constant DFA18_acceptS. */
	static final String DFA18_acceptS = "\2\uffff\1\2\1\3\1\1";

	/** The Constant DFA18_specialS. */
	static final String DFA18_specialS = "\5\uffff}>";

	/** The Constant DFA18_transitionS. */
	static final String[] DFA18_transitionS = { "\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3", "", "", "" };

	/** The Constant DFA18_eot. */
	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);

	/** The Constant DFA18_eof. */
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);

	/** The Constant DFA18_min. */
	static final char[] DFA18_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA18_minS);

	/** The Constant DFA18_max. */
	static final char[] DFA18_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA18_maxS);

	/** The Constant DFA18_accept. */
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);

	/** The Constant DFA18_special. */
	static final short[] DFA18_special = DFA
			.unpackEncodedString(DFA18_specialS);

	/** The Constant DFA18_transition. */
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	/**
	 * The Class DFA18.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA18 extends DFA {

		/**
		 * Instantiates a new dF a18.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
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

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "981:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	/** The Constant DFA28_eotS. */
	static final String DFA28_eotS = "\2\uffff\2\70\1\uffff\25\63\10\uffff\1\153\1\155\1\157\3\uffff"
			+ "\1\162\1\165\1\170\1\174\1\176\1\u0081\1\u0083\1\u0086\1\uffff\1"
			+ "\u0089\1\u008c\6\uffff\1\70\1\u0090\2\uffff\1\70\11\63\1\u009c\12"
			+ "\63\1\u00a7\1\63\1\u00ac\25\63\2\uffff\1\u00c8\1\uffff\1\u00ca\30"
			+ "\uffff\1\u00cf\2\uffff\1\u00d1\4\uffff\1\70\1\uffff\13\63\1\uffff"
			+ "\5\63\1\u00e7\4\63\1\uffff\4\63\1\uffff\1\u00f1\2\63\1\u00f4\17"
			+ "\63\1\u0104\4\63\1\u0109\1\63\6\uffff\1\u010f\7\uffff\1\63\1\u0112"
			+ "\1\63\1\u0114\1\u0115\1\u0116\1\63\1\u0118\6\63\1\u011f\1\u0120"
			+ "\2\63\1\uffff\3\63\1\u0127\5\63\1\uffff\1\u012d\1\63\1\uffff\1\u012f"
			+ "\13\63\1\u013b\2\63\1\uffff\1\u013e\1\63\1\u0140\1\63\1\uffff\1"
			+ "\63\6\uffff\1\63\1\uffff\1\u0148\3\uffff\1\u0149\1\uffff\1\u014a"
			+ "\1\u014b\4\63\2\uffff\2\63\1\u0153\1\u0154\1\63\1\u0156\1\uffff"
			+ "\5\63\1\uffff\1\63\1\uffff\5\63\1\u0162\2\63\1\u0165\2\63\1\uffff"
			+ "\1\u0169\1\63\1\uffff\1\63\1\uffff\1\63\1\u016d\3\uffff\1\u0172"
			+ "\1\63\4\uffff\2\63\1\u0176\2\63\1\u0179\1\63\2\uffff\1\63\1\uffff"
			+ "\1\63\1\u017d\2\63\1\u0180\1\u0181\3\63\1\u0185\1\u0186\1\uffff"
			+ "\1\u0187\1\63\1\uffff\1\u0189\1\63\1\u018b\1\uffff\3\63\1\uffff"
			+ "\1\u0190\1\u0192\3\uffff\2\63\1\u0196\1\uffff\1\u0197\1\u0198\1"
			+ "\uffff\1\u0199\2\63\1\uffff\2\63\2\uffff\1\u019e\1\u019f\1\63\3"
			+ "\uffff\1\63\1\uffff\1\63\1\uffff\1\63\1\u01a4\1\63\4\uffff\1\u01a7"
			+ "\1\u01a8\1\u01a9\4\uffff\1\u01aa\3\63\2\uffff\1\63\1\u01af\1\u01b0"
			+ "\1\63\1\uffff\1\u01b2\5\uffff\2\63\1\u01b5\1\u01b6\2\uffff\1\u01b7"
			+ "\1\uffff\1\u01b8\1\u01b9\5\uffff";

	/** The Constant DFA28_eofS. */
	static final String DFA28_eofS = "\u01ba\uffff";

	/** The Constant DFA28_minS. */
	static final String DFA28_minS = "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\162\1\141\1\145\1\154"
			+ "\1\141\1\154\1\157\1\146\1\156\1\157\2\141\1\145\1\150\1\166\1\150"
			+ "\1\157\1\141\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\55"
			+ "\1\75\1\52\1\75\1\45\1\uffff\1\75\1\74\2\uffff\1\145\2\60\1\uffff"
			+ "\2\56\2\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2\141\1\156\1\146"
			+ "\1\60\1\156\1\163\1\165\1\164\1\156\1\162\1\154\1\156\1\157\1\164"
			+ "\1\60\1\160\1\60\1\164\1\156\1\164\1\167\1\154\1\143\1\151\1\142"
			+ "\1\164\1\157\1\141\1\160\1\151\1\145\1\151\1\141\1\160\1\151\1\154"
			+ "\1\162\1\151\2\uffff\1\75\1\uffff\1\75\26\uffff\1\74\1\uffff\1\75"
			+ "\2\uffff\1\75\3\uffff\1\154\1\60\1\uffff\1\164\1\154\1\141\2\145"
			+ "\1\143\1\162\2\163\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\1"
			+ "\141\1\60\1\163\1\143\1\141\1\157\1\uffff\1\154\1\164\1\145\1\151"
			+ "\1\uffff\1\60\1\147\1\151\1\60\1\154\1\153\1\166\1\164\1\154\1\165"
			+ "\1\162\1\164\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\60\2\145"
			+ "\1\144\1\141\1\60\1\154\4\uffff\1\74\1\76\1\75\4\uffff\1\163\2\uffff"
			+ "\1\162\1\60\1\153\3\60\1\150\1\60\1\163\1\164\1\151\1\165\1\154"
			+ "\1\155\2\60\1\156\1\154\1\uffff\1\145\2\164\1\60\1\145\1\162\1\141"
			+ "\1\162\1\156\1\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1"
			+ "\162\1\164\1\151\1\143\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff"
			+ "\1\60\1\144\1\60\1\164\1\uffff\1\145\1\45\1\uffff\1\45\2\uffff\1"
			+ "\145\1\141\1\uffff\1\60\3\uffff\1\60\1\uffff\2\60\1\156\1\154\1"
			+ "\145\1\151\2\uffff\1\144\1\156\2\60\1\151\1\60\1\uffff\1\155\1\164"
			+ "\1\156\1\146\1\145\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156"
			+ "\1\60\1\143\1\164\1\60\1\150\1\151\1\uffff\1\60\1\151\1\uffff\1"
			+ "\145\1\uffff\1\151\1\60\3\45\1\151\1\143\4\uffff\1\165\1\164\1\60"
			+ "\1\143\1\163\1\60\1\171\2\uffff\1\157\1\uffff\1\145\1\60\1\143\1"
			+ "\141\2\60\2\145\1\164\2\60\1\uffff\1\60\1\146\1\uffff\1\60\1\144"
			+ "\1\60\1\uffff\1\145\1\146\1\154\1\uffff\2\75\1\45\2\uffff\1\164"
			+ "\1\145\1\60\1\uffff\2\60\1\uffff\1\60\2\156\1\uffff\1\145\1\143"
			+ "\2\uffff\2\60\1\145\3\uffff\1\160\1\uffff\1\145\1\uffff\1\156\1"
			+ "\60\1\145\4\uffff\1\75\2\60\4\uffff\1\60\1\164\1\157\1\145\2\uffff"
			+ "\1\144\2\60\1\164\1\uffff\1\60\5\uffff\1\163\1\146\2\60\2\uffff"
			+ "\1\60\1\uffff\2\60\5\uffff";

	/** The Constant DFA28_maxS. */
	static final String DFA28_maxS = "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\157\1\171\1\157\1\171"
			+ "\1\170\1\165\1\154\1\157\2\156\1\157\2\165\1\145\1\167\1\166\1\171"
			+ "\2\157\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1\76\4\75"
			+ "\1\uffff\1\76\1\75\2\uffff\1\151\2\146\1\uffff\1\154\1\145\2\uffff"
			+ "\1\154\1\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1\156\1\163"
			+ "\1\165\1\164\1\156\1\162\1\154\1\156\1\157\1\164\1\172\1\160\1\172"
			+ "\1\164\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162"
			+ "\1\160\1\151\1\145\1\162\1\171\1\160\1\151\1\154\1\162\1\151\2\uffff"
			+ "\1\75\1\uffff\1\75\26\uffff\1\76\1\uffff\1\76\2\uffff\1\75\3\uffff"
			+ "\1\162\1\154\1\uffff\1\164\1\154\1\141\1\145\1\164\1\143\1\162\1"
			+ "\163\1\164\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\1\141\1\172"
			+ "\1\163\1\143\1\141\1\157\1\uffff\1\157\1\164\1\145\1\151\1\uffff"
			+ "\1\172\1\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162"
			+ "\1\164\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\172\2\145\1\144"
			+ "\1\141\1\172\1\154\4\uffff\1\75\1\76\1\75\4\uffff\1\163\2\uffff"
			+ "\1\162\1\172\1\153\3\172\1\150\1\172\1\163\1\164\1\151\1\165\1\154"
			+ "\1\155\2\172\1\162\1\154\1\uffff\1\145\2\164\1\172\1\145\1\162\1"
			+ "\141\1\162\1\156\1\uffff\1\172\1\166\1\uffff\1\172\2\141\1\145\1"
			+ "\151\1\162\1\164\1\151\1\143\1\162\1\143\1\162\1\172\1\167\1\163"
			+ "\1\uffff\1\172\1\144\1\172\1\164\1\uffff\1\145\1\45\1\uffff\1\76"
			+ "\2\uffff\1\145\1\141\1\uffff\1\172\3\uffff\1\172\1\uffff\2\172\1"
			+ "\156\1\154\1\145\1\151\2\uffff\1\144\1\156\2\172\1\151\1\172\1\uffff"
			+ "\1\155\1\164\1\156\1\146\1\145\1\uffff\1\145\1\uffff\1\147\1\164"
			+ "\2\143\1\156\1\172\1\143\1\164\1\172\1\150\1\151\1\uffff\1\172\1"
			+ "\151\1\uffff\1\145\1\uffff\1\151\1\172\3\45\1\151\1\143\4\uffff"
			+ "\1\165\1\164\1\172\1\143\1\163\1\172\1\171\2\uffff\1\157\1\uffff"
			+ "\1\145\1\172\1\143\1\141\2\172\2\145\1\164\2\172\1\uffff\1\172\1"
			+ "\146\1\uffff\1\172\1\144\1\172\1\uffff\1\145\1\146\1\154\1\uffff"
			+ "\2\75\1\45\2\uffff\1\164\1\145\1\172\1\uffff\2\172\1\uffff\1\172"
			+ "\2\156\1\uffff\1\145\1\143\2\uffff\2\172\1\145\3\uffff\1\160\1\uffff"
			+ "\1\145\1\uffff\1\156\1\172\1\145\4\uffff\1\75\2\172\4\uffff\1\172"
			+ "\1\164\1\157\1\145\2\uffff\1\144\2\172\1\164\1\uffff\1\172\5\uffff"
			+ "\1\163\1\146\2\172\2\uffff\1\172\1\uffff\2\172\5\uffff";

	/** The Constant DFA28_acceptS. */
	static final String DFA28_acceptS = "\1\uffff\1\1\2\uffff\1\4\25\uffff\1\101\1\102\1\103\1\104\1\105"
			+ "\1\106\1\107\1\110\3\uffff\1\115\1\116\1\117\10\uffff\1\153\2\uffff"
			+ "\1\173\1\177\3\uffff\1\3\2\uffff\1\2\1\175\55\uffff\1\112\1\111"
			+ "\1\uffff\1\113\1\uffff\1\114\1\121\1\141\1\131\1\122\1\142\1\132"
			+ "\1\123\1\135\1\125\1\124\1\136\1\155\1\126\1\137\1\127\1\140\1\176"
			+ "\1\130\1\143\1\133\1\144\1\uffff\1\134\1\uffff\1\170\1\161\1\uffff"
			+ "\1\171\1\172\1\u0080\2\uffff\1\174\13\uffff\1\20\12\uffff\1\32\4"
			+ "\uffff\1\75\32\uffff\1\150\1\120\1\152\1\154\3\uffff\1\166\1\162"
			+ "\1\165\1\163\1\uffff\1\u0083\1\u0084\22\uffff\1\30\11\uffff\1\36"
			+ "\2\uffff\1\42\17\uffff\1\64\4\uffff\1\76\2\uffff\1\151\1\uffff\1"
			+ "\167\1\164\2\uffff\1\6\1\uffff\1\10\1\11\1\73\1\uffff\1\13\6\uffff"
			+ "\1\22\1\23\6\uffff\1\31\5\uffff\1\40\1\uffff\1\72\13\uffff\1\60"
			+ "\2\uffff\1\70\1\uffff\1\65\7\uffff\1\7\1\12\1\14\1\15\7\uffff\1"
			+ "\25\1\71\1\uffff\1\27\13\uffff\1\50\2\uffff\1\56\3\uffff\1\61\3"
			+ "\uffff\1\67\3\uffff\1\u0081\1\u0082\3\uffff\1\21\2\uffff\1\100\3"
			+ "\uffff\1\34\2\uffff\1\52\1\41\3\uffff\1\46\1\47\1\51\1\uffff\1\57"
			+ "\1\uffff\1\62\3\uffff\1\145\1\156\1\146\1\157\3\uffff\1\17\1\53"
			+ "\1\24\1\26\4\uffff\1\43\1\44\4\uffff\1\77\1\uffff\1\147\1\160\1"
			+ "\5\1\16\1\74\4\uffff\1\55\1\54\1\uffff\1\66\2\uffff\1\37\1\45\1"
			+ "\63\1\33\1\35";

	/** The Constant DFA28_specialS. */
	static final String DFA28_specialS = "\u01ba\uffff}>";

	/** The Constant DFA28_transitionS. */
	static final String[] DFA28_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\1\44\1\64\1\65\1\uffff\1\57\1"
					+ "\50\1\4\1\32\1\33\1\54\1\52\1\41\1\53\1\42\1\55\1\2\11\3\1\47"
					+ "\1\40\1\62\1\43\1\61\1\46\1\60\1\63\1\6\3\63\1\14\2\63\1\17"
					+ "\14\63\1\27\4\63\1\36\1\uffff\1\37\1\56\1\63\1\uffff\1\5\1\7"
					+ "\1\10\1\11\1\12\1\13\1\15\1\63\1\16\2\63\1\20\1\63\1\21\1\25"
					+ "\1\22\1\63\1\23\1\24\1\26\1\63\1\30\1\31\3\63\1\34\1\51\1\35"
					+ "\1\45",
			"",
			"\1\74\1\uffff\10\71\2\72\13\uffff\1\74\6\uffff\1\73\13\uffff"
					+ "\1\67\14\uffff\1\74\6\uffff\1\73\13\uffff\1\66",
			"\1\74\1\uffff\12\75\13\uffff\1\74\6\uffff\1\73\30\uffff\1"
					+ "\74\6\uffff\1\73",
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
			"\1\152\1\uffff\12\74",
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
			"\1\u008e\3\uffff\1\u008d",
			"\12\u008f\7\uffff\6\u008f\32\uffff\6\u008f",
			"\12\u008f\7\uffff\6\u008f\32\uffff\6\u008f",
			"",
			"\1\74\1\uffff\10\71\2\72\13\uffff\1\74\6\uffff\1\73\30\uffff"
					+ "\1\74\6\uffff\1\73",
			"\1\74\1\uffff\12\72\13\uffff\1\74\37\uffff\1\74",
			"",
			"",
			"\1\74\1\uffff\12\75\13\uffff\1\74\6\uffff\1\73\30\uffff\1"
					+ "\74\6\uffff\1\73",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u009b\5" + "\63",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00a8",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00ab\6"
					+ "\63\1\u00a9\1\u00aa\6\63",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3\5\uffff\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8\20\uffff\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd\10\uffff\1\u00be",
			"\1\u00bf\23\uffff\1\u00c1\3\uffff\1\u00c0",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"",
			"",
			"\1\u00c7",
			"",
			"\1\u00c9",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00cb\1\uffff\1\u00cc",
			"",
			"\1\u00ce\1\u00cd",
			"",
			"",
			"\1\u00d0",
			"",
			"",
			"",
			"\1\u00d2\1\uffff\1\u00d3\3\uffff\1\u00d4",
			"\12\u008f\7\uffff\6\u008f\5\uffff\1\73\24\uffff\6\u008f\5"
					+ "\uffff\1\73",
			"",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9\16\uffff\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"",
			"\1\u00ec\2\uffff\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u00f2",
			"\1\u00f3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
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
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u010a",
			"",
			"",
			"",
			"",
			"\1\u010b\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"",
			"",
			"",
			"",
			"\1\u0110",
			"",
			"",
			"\1\u0111",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0113",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0117",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0121\3\uffff\1\u0122",
			"\1\u0123",
			"",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u012e",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u013c",
			"\1\u013d",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u013f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0141",
			"",
			"\1\u0142",
			"\1\u0143",
			"",
			"\1\u0144\30\uffff\1\u0145",
			"",
			"",
			"\1\u0146",
			"\1\u0147",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"",
			"",
			"\1\u0150",
			"\1\u0151",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u0152\16"
					+ "\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0155",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"",
			"\1\u015c",
			"",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0163",
			"\1\u0164",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u0166",
			"\1\u0167",
			"",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0168\7" + "\63",
			"\1\u016a", "", "\1\u016b", "", "\1\u016c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u016e",
			"\1\u016f", "\1\u0170", "\1\u0171", "\1\u0173", "", "", "", "",
			"\1\u0174", "\1\u0175",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0177",
			"\1\u0178", "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u017a", "", "", "\1\u017b", "", "\1\u017c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u017e",
			"\1\u017f", "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0182",
			"\1\u0183", "\1\u0184",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0188", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u018a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "\1\u018c",
			"\1\u018d", "\1\u018e", "", "\1\u018f", "\1\u0191", "\1\u0193", "",
			"", "\1\u0194", "\1\u0195",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u019a",
			"\1\u019b", "", "\1\u019c", "\1\u019d", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01a0", "",
			"", "", "\1\u01a1", "", "\1\u01a2", "", "\1\u01a3",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01a5", "",
			"", "", "", "\1\u01a6",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01ab",
			"\1\u01ac", "\1\u01ad", "", "", "\1\u01ae",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01b1", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"", "\1\u01b3", "\1\u01b4",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"" };

	/** The Constant DFA28_eot. */
	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);

	/** The Constant DFA28_eof. */
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);

	/** The Constant DFA28_min. */
	static final char[] DFA28_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA28_minS);

	/** The Constant DFA28_max. */
	static final char[] DFA28_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA28_maxS);

	/** The Constant DFA28_accept. */
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);

	/** The Constant DFA28_special. */
	static final short[] DFA28_special = DFA
			.unpackEncodedString(DFA28_specialS);

	/** The Constant DFA28_transition. */
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	/**
	 * The Class DFA28.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA28 extends DFA {

		/**
		 * Instantiates a new dF a28.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
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

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | STRINGLITERAL | PP_IF | PP_ELSEIF | PP_ELSE | PP_END | PP_ERROR );";
		}
	}

}