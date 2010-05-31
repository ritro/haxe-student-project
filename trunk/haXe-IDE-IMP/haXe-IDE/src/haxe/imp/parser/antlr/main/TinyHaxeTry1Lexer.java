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

/**
 * The Class TinyHaxeTry1Lexer.
 * 
 * @author Anatoly Kondratyev
 */
public class TinyHaxeTry1Lexer extends Lexer {

	/** The Constant CAST. */
	public static final int CAST = 88;

	/** The Constant PACKAGE. */
	public static final int PACKAGE = 15;

	/** The Constant FUNCTION. */
	public static final int FUNCTION = 34;

	/** The Constant EXPONENT. */
	public static final int EXPONENT = 147;

	/** The Constant LT. */
	public static final int LT = 45;

	/** The Constant STAR. */
	public static final int STAR = 80;

	/** The Constant WHILE. */
	public static final int WHILE = 53;

	/** The Constant FLOATNUM. */
	public static final int FLOATNUM = 101;

	/** The Constant CONST. */
	public static final int CONST = 114;

	/** The Constant OCTAL_ESC. */
	public static final int OCTAL_ESC = 152;

	/** The Constant CASE. */
	public static final int CASE = 63;

	/** The Constant CHAR. */
	public static final int CHAR = 113;

	/** The Constant NEW. */
	public static final int NEW = 48;

	/** The Constant DO. */
	public static final int DO = 54;

	/** The Constant EXTERN. */
	public static final int EXTERN = 91;

	/** The Constant EOF. */
	public static final int EOF = -1;

	/** The Constant GTGT. */
	public static final int GTGT = 47;

	/** The Constant BREAK. */
	public static final int BREAK = 61;

	/** The Constant LBRACKET. */
	public static final int LBRACKET = 37;

	/** The Constant RPAREN. */
	public static final int RPAREN = 36;

	/** The Constant FINAL. */
	public static final int FINAL = 116;

	/** The Constant IMPORT. */
	public static final int IMPORT = 19;

	/** The Constant SUBSUB. */
	public static final int SUBSUB = 83;

	/** The Constant STAREQ. */
	public static final int STAREQ = 130;

	/** The Constant CARET. */
	public static final int CARET = 75;

	/** The Constant RETURN. */
	public static final int RETURN = 59;

	/** The Constant THIS. */
	public static final int THIS = 126;

	/** The Constant DOUBLE. */
	public static final int DOUBLE = 115;

	/** The Constant MONKEYS_AT. */
	public static final int MONKEYS_AT = 139;

	/** The Constant BARBAR. */
	public static final int BARBAR = 67;

	/** The Constant VAR. */
	public static final int VAR = 90;

	/** The Constant VOID. */
	public static final int VOID = 41;

	/** The Constant SUPER. */
	public static final int SUPER = 125;

	/** The Constant EQ. */
	public static final int EQ = 28;

	/** The Constant GOTO. */
	public static final int GOTO = 118;

	/** The Constant AMPAMP. */
	public static final int AMPAMP = 68;

	/** The Constant COMMENT. */
	public static final int COMMENT = 148;

	/** The Constant VAR_INIT. */
	public static final int VAR_INIT = 13;

	/** The Constant QUES. */
	public static final int QUES = 27;

	/** The Constant LTLTEQ. */
	public static final int LTLTEQ = 143;

	/** The Constant EQEQ. */
	public static final int EQEQ = 69;

	/** The Constant HexPrefix. */
	public static final int HexPrefix = 107;

	/** The Constant PERCENTDBBQ. */
	public static final int PERCENTDBBQ = 135;

	/** The Constant RBRACE. */
	public static final int RBRACE = 58;

	/** The Constant STATIC. */
	public static final int STATIC = 22;

	/** The Constant PRIVATE. */
	public static final int PRIVATE = 21;

	/** The Constant BLOCK_SCOPE. */
	public static final int BLOCK_SCOPE = 7;

	/** The Constant SWITCH. */
	public static final int SWITCH = 56;

	/** The Constant NULL. */
	public static final int NULL = 87;

	/** The Constant GTGTEQ. */
	public static final int GTGTEQ = 144;

	/** The Constant STRICTFP. */
	public static final int STRICTFP = 124;

	/** The Constant ELSE. */
	public static final int ELSE = 50;

	/** The Constant NATIVE. */
	public static final int NATIVE = 121;

	/** The Constant ELLIPSIS. */
	public static final int ELLIPSIS = 66;

	/** The Constant THROWS. */
	public static final int THROWS = 127;

	/** The Constant INT. */
	public static final int INT = 42;

	/** The Constant SLASHEQ. */
	public static final int SLASHEQ = 31;

	/** The Constant INTLITERAL. */
	public static final int INTLITERAL = 98;

	/** The Constant PERCENTBB. */
	public static final int PERCENTBB = 141;

	/** The Constant TRY. */
	public static final int TRY = 55;

	/** The Constant LongSuffix. */
	public static final int LongSuffix = 106;

	/** The Constant LONGLITERAL. */
	public static final int LONGLITERAL = 97;

	/** The Constant PERCENTLL. */
	public static final int PERCENTLL = 140;

	/** The Constant BANGEQQ. */
	public static final int BANGEQQ = 138;

	/** The Constant WS. */
	public static final int WS = 104;

	/** The Constant PERCENTDLQ. */
	public static final int PERCENTDLQ = 133;

	/** The Constant INHERIT_LIST_OPT. */
	public static final int INHERIT_LIST_OPT = 11;

	/** The Constant CHARLITERAL. */
	public static final int CHARLITERAL = 100;

	/** The Constant GT. */
	public static final int GT = 46;

	/** The Constant INLINE. */
	public static final int INLINE = 23;

	/** The Constant CATCH. */
	public static final int CATCH = 65;

	/** The Constant FALSE. */
	public static final int FALSE = 103;

	/** The Constant EscapeSequence. */
	public static final int EscapeSequence = 110;

	/** The Constant THROW. */
	public static final int THROW = 60;

	/** The Constant DYNAMIC. */
	public static final int DYNAMIC = 24;

	/** The Constant PROTECTED. */
	public static final int PROTECTED = 122;

	/** The Constant CLASS. */
	public static final int CLASS = 92;

	/** The Constant BAREQ. */
	public static final int BAREQ = 131;

	/** The Constant IntegerNumber. */
	public static final int IntegerNumber = 105;

	/** The Constant AMP. */
	public static final int AMP = 74;

	/** The Constant PLUSPLUS. */
	public static final int PLUSPLUS = 84;

	/** The Constant LBRACE. */
	public static final int LBRACE = 57;

	/** The Constant TYPE_PARAM_OPT. */
	public static final int TYPE_PARAM_OPT = 10;

	/** The Constant LTEQ. */
	public static final int LTEQ = 72;

	/** The Constant SUBEQ. */
	public static final int SUBEQ = 30;

	/** The Constant GTGTGT. */
	public static final int GTGTGT = 77;

	/** The Constant Exponent. */
	public static final int Exponent = 109;

	/** The Constant FOR. */
	public static final int FOR = 51;

	/** The Constant SUB. */
	public static final int SUB = 79;

	/** The Constant SUFFIX_EXPR. */
	public static final int SUFFIX_EXPR = 6;

	/** The Constant FLOAT. */
	public static final int FLOAT = 43;

	/** The Constant ABSTRACT. */
	public static final int ABSTRACT = 111;

	/** The Constant MINUS_BIGGER. */
	public static final int MINUS_BIGGER = 40;

	/** The Constant PERCENTDBQ. */
	public static final int PERCENTDBQ = 134;

	/** The Constant HexDigit. */
	public static final int HexDigit = 108;

	/** The Constant PLUSEQ. */
	public static final int PLUSEQ = 29;

	/** The Constant LPAREN. */
	public static final int LPAREN = 35;

	/** The Constant IF. */
	public static final int IF = 49;

	/** The Constant INTNUM. */
	public static final int INTNUM = 146;

	/** The Constant SLASH. */
	public static final int SLASH = 81;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = 44;

	/** The Constant ESC_SEQ. */
	public static final int ESC_SEQ = 153;

	/** The Constant IN. */
	public static final int IN = 52;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = 95;

	/** The Constant GTGTGTEQ. */
	public static final int GTGTGTEQ = 145;

	/** The Constant CONTINUE. */
	public static final int CONTINUE = 62;

	/** The Constant COMMA. */
	public static final int COMMA = 26;

	/** The Constant AMPEQ. */
	public static final int AMPEQ = 33;

	/** The Constant IDENTIFIER. */
	public static final int IDENTIFIER = 17;

	/** The Constant TRANSIENT. */
	public static final int TRANSIENT = 128;

	/** The Constant TILDE. */
	public static final int TILDE = 86;

	/** The Constant BANGEQ. */
	public static final int BANGEQ = 70;

	/** The Constant PLUS. */
	public static final int PLUS = 78;

	/** The Constant RBRACKET. */
	public static final int RBRACKET = 38;

	/** The Constant DOT. */
	public static final int DOT = 18;

	/** The Constant LTLT. */
	public static final int LTLT = 76;

	/** The Constant BYTE. */
	public static final int BYTE = 112;

	/** The Constant PROCESSORCOMMAND. */
	public static final int PROCESSORCOMMAND = 149;

	/** The Constant PERCENT. */
	public static final int PERCENT = 82;

	/** The Constant VOLATILE. */
	public static final int VOLATILE = 129;

	/** The Constant DECL_ATTR_LIST. */
	public static final int DECL_ATTR_LIST = 12;

	/** The Constant ASSIGN_OPERATOR. */
	public static final int ASSIGN_OPERATOR = 14;

	/** The Constant TYPEDEF. */
	public static final int TYPEDEF = 96;

	/** The Constant UNICODE_ESC. */
	public static final int UNICODE_ESC = 151;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = 64;

	/** The Constant EQEQEQ. */
	public static final int EQEQEQ = 136;

	/** The Constant HEX_DIGIT. */
	public static final int HEX_DIGIT = 150;

	/** The Constant SHORT. */
	public static final int SHORT = 123;

	/** The Constant BANG. */
	public static final int BANG = 85;

	/** The Constant INSTANCEOF. */
	public static final int INSTANCEOF = 119;

	/** The Constant GTEQ. */
	public static final int GTEQ = 71;

	/** The Constant MODULE. */
	public static final int MODULE = 5;

	/** The Constant SEMI. */
	public static final int SEMI = 16;

	/** The Constant TRUE. */
	public static final int TRUE = 102;

	/** The Constant COLON. */
	public static final int COLON = 39;

	/** The Constant PARAM_LIST. */
	public static final int PARAM_LIST = 8;

	/** The Constant PERCENTLESQ. */
	public static final int PERCENTLESQ = 137;

	/** The Constant ENUM. */
	public static final int ENUM = 89;

	/** The Constant PERCENTEQ. */
	public static final int PERCENTEQ = 32;

	/** The Constant FINALLY. */
	public static final int FINALLY = 117;

	/** The Constant PROPERTY_DECL. */
	public static final int PROPERTY_DECL = 4;

	/** The Constant OVERRIDE. */
	public static final int OVERRIDE = 25;

	/** The Constant STRINGLITERAL. */
	public static final int STRINGLITERAL = 99;

	/** The Constant CARETEQ. */
	public static final int CARETEQ = 132;

	/** The Constant PERCENTBBB. */
	public static final int PERCENTBBB = 142;

	/** The Constant INTERFACE. */
	public static final int INTERFACE = 93;

	/** The Constant LONG. */
	public static final int LONG = 120;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = 20;

	/** The Constant EXTENDS. */
	public static final int EXTENDS = 94;

	/** The Constant TYPE_TAG. */
	public static final int TYPE_TAG = 9;

	/** The Constant BAR. */
	public static final int BAR = 73;

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
	public TinyHaxeTry1Lexer(final CharStream input) {
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
	public TinyHaxeTry1Lexer(final CharStream input,
			final RecognizerSharedState state) {
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:469:5:
			// ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:469:9:
			// ( ' ' | '\\t' | '\\r' | '\\n' )
			{
				if ((this.input.LA(1) >= '\t' && this.input.LA(1) <= '\n')
						|| this.input.LA(1) == '\r' || this.input.LA(1) == ' ') {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
					throw mse;
				}

				_channel = HIDDEN;

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:480:5:
			// ( IntegerNumber LongSuffix )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:480:9:
			// IntegerNumber LongSuffix
			{
				this.mIntegerNumber();
				this.mLongSuffix();

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:485:5:
			// ( IntegerNumber )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:485:9:
			// IntegerNumber
			{
				this.mIntegerNumber();

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:490:5:
			// ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ |
			// HexPrefix ( HexDigit )+ )
			int alt4 = 4;
			int LA4_0 = this.input.LA(1);

			if ((LA4_0 == '0')) {
				switch (this.input.LA(2)) {
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
						this.input);

				throw nvae;
			}
			switch (alt4) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:490:9:
				// '0'
			{
				this.match('0');

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:491:9:
				// '1' .. '9' ( '0' .. '9' )*
			{
				this.matchRange('1', '9');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:491:18:
				// ( '0' .. '9' )*
				loop1: do {
					int alt1 = 2;
					int LA1_0 = this.input.LA(1);

					if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:491:19:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						break loop1;
					}
				} while (true);

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:492:9:
				// '0' ( '0' .. '7' )+
			{
				this.match('0');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:492:13:
				// ( '0' .. '7' )+
				int cnt2 = 0;
				loop2: do {
					int alt2 = 2;
					int LA2_0 = this.input.LA(1);

					if (((LA2_0 >= '0' && LA2_0 <= '7'))) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:492:14:
						// '0' .. '7'
					{
						this.matchRange('0', '7');

					}
						break;

					default:
						if (cnt2 >= 1) {
							break loop2;
						}
						EarlyExitException eee = new EarlyExitException(2,
								this.input);
						throw eee;
					}
					cnt2++;
				} while (true);

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:493:9:
				// HexPrefix ( HexDigit )+
			{
				this.mHexPrefix();
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:493:19:
				// ( HexDigit )+
				int cnt3 = 0;
				loop3: do {
					int alt3 = 2;
					int LA3_0 = this.input.LA(1);

					if (((LA3_0 >= '0' && LA3_0 <= '9')
							|| (LA3_0 >= 'A' && LA3_0 <= 'F') || (LA3_0 >= 'a' && LA3_0 <= 'f'))) {
						alt3 = 1;
					}

					switch (alt3) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:493:19:
						// HexDigit
					{
						this.mHexDigit();

					}
						break;

					default:
						if (cnt3 >= 1) {
							break loop3;
						}
						EarlyExitException eee = new EarlyExitException(3,
								this.input);
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:498:5:
			// ( '0x' | '0X' )
			int alt5 = 2;
			int LA5_0 = this.input.LA(1);

			if ((LA5_0 == '0')) {
				int LA5_1 = this.input.LA(2);

				if ((LA5_1 == 'x')) {
					alt5 = 1;
				} else if ((LA5_1 == 'X')) {
					alt5 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 5,
							1, this.input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 5, 0,
						this.input);

				throw nvae;
			}
			switch (alt5) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:498:9:
				// '0x'
			{
				this.match("0x");

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:498:16:
				// '0X'
			{
				this.match("0X");

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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:503:5:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:503:9:
			// ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			{
				if ((this.input.LA(1) >= '0' && this.input.LA(1) <= '9')
						|| (this.input.LA(1) >= 'A' && this.input.LA(1) <= 'F')
						|| (this.input.LA(1) >= 'a' && this.input.LA(1) <= 'f')) {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:508:5:
			// ( 'l' | 'L' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
			{
				if (this.input.LA(1) == 'L' || this.input.LA(1) == 'l') {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:5:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:9:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
				if (this.input.LA(1) == 'E' || this.input.LA(1) == 'e') {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
					throw mse;
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:23:
				// ( '+' | '-' )?
				int alt6 = 2;
				int LA6_0 = this.input.LA(1);

				if ((LA6_0 == '+' || LA6_0 == '-')) {
					alt6 = 1;
				}
				switch (alt6) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
				{
					if (this.input.LA(1) == '+' || this.input.LA(1) == '-') {
						this.input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, this.input);
						this.recover(mse);
						throw mse;
					}

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:38:
				// ( '0' .. '9' )+
				int cnt7 = 0;
				loop7: do {
					int alt7 = 2;
					int LA7_0 = this.input.LA(1);

					if (((LA7_0 >= '0' && LA7_0 <= '9'))) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:513:40:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt7 >= 1) {
							break loop7;
						}
						EarlyExitException eee = new EarlyExitException(7,
								this.input);
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:517:5:
			// ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\'' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:517:9:
			// '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
			// '\\''
			{
				this.match('\'');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:518:9:
				// ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
				int alt8 = 2;
				int LA8_0 = this.input.LA(1);

				if ((LA8_0 == '\\')) {
					alt8 = 1;
				} else if (((LA8_0 >= '\u0000' && LA8_0 <= '\t')
						|| (LA8_0 >= '\u000B' && LA8_0 <= '\f')
						|| (LA8_0 >= '\u000E' && LA8_0 <= '&')
						|| (LA8_0 >= '(' && LA8_0 <= '[') || (LA8_0 >= ']' && LA8_0 <= '\uFFFF'))) {
					alt8 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("", 8,
							0, this.input);

					throw nvae;
				}
				switch (alt8) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:518:13:
					// EscapeSequence
				{
					this.mEscapeSequence();

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:519:13:
					// ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
				{
					if ((this.input.LA(1) >= '\u0000' && this.input.LA(1) <= '\t')
							|| (this.input.LA(1) >= '\u000B' && this.input
									.LA(1) <= '\f')
							|| (this.input.LA(1) >= '\u000E' && this.input
									.LA(1) <= '&')
							|| (this.input.LA(1) >= '(' && this.input.LA(1) <= '[')
							|| (this.input.LA(1) >= ']' && this.input.LA(1) <= '\uFFFF')) {
						this.input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, this.input);
						this.recover(mse);
						throw mse;
					}

				}
					break;

				}

				this.match('\'');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:527:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\'
			// | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:527:9:
			// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' |
			// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
			// '0' .. '7' ) | ( '0' .. '7' ) )
			{
				this.match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:527:14:
				// ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | (
				// '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) (
				// '0' .. '7' ) | ( '0' .. '7' ) )
				int alt9 = 11;
				alt9 = this.dfa9.predict(this.input);
				switch (alt9) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:528:18:
					// 'b'
				{
					this.match('b');

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:529:18:
					// 't'
				{
					this.match('t');

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:530:18:
					// 'n'
				{
					this.match('n');

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:531:18:
					// 'f'
				{
					this.match('f');

				}
					break;
				case 5:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:532:18:
					// 'r'
				{
					this.match('r');

				}
					break;
				case 6:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:533:18:
					// '\\\"'
				{
					this.match('\"');

				}
					break;
				case 7:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:534:18:
					// '\\''
				{
					this.match('\'');

				}
					break;
				case 8:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:535:18:
					// '\\\\'
				{
					this.match('\\');

				}
					break;
				case 9:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:18:
					// ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:18:
					// ( '0' .. '3' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:19:
					// '0' .. '3'
					{
						this.matchRange('0', '3');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:29:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:30:
					// '0' .. '7'
					{
						this.matchRange('0', '7');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:40:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:537:41:
					// '0' .. '7'
					{
						this.matchRange('0', '7');

					}

				}
					break;
				case 10:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:539:18:
					// ( '0' .. '7' ) ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:539:18:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:539:19:
					// '0' .. '7'
					{
						this.matchRange('0', '7');

					}

					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:539:29:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:539:30:
					// '0' .. '7'
					{
						this.matchRange('0', '7');

					}

				}
					break;
				case 11:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:541:18:
					// ( '0' .. '7' )
				{
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:541:18:
					// ( '0' .. '7' )
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:541:19:
					// '0' .. '7'
					{
						this.matchRange('0', '7');

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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:546:5:
			// ( 'abstract' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:546:9:
			// 'abstract'
			{
				this.match("abstract");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:550:5:
			// ( 'Bool' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:550:9:
			// 'Bool'
			{
				this.match("Bool");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:554:5:
			// ( 'break' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:554:9:
			// 'break'
			{
				this.match("break");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:558:5:
			// ( 'byte' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:558:9:
			// 'byte'
			{
				this.match("byte");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:562:5:
			// ( 'case' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:562:9:
			// 'case'
			{
				this.match("case");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:566:5:
			// ( 'catch' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:566:9:
			// 'catch'
			{
				this.match("catch");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:570:5:
			// ( 'char' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:570:9:
			// 'char'
			{
				this.match("char");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:574:5:
			// ( 'class' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:574:9:
			// 'class'
			{
				this.match("class");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:578:5:
			// ( 'const' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:578:9:
			// 'const'
			{
				this.match("const");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:582:5:
			// ( 'continue' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:582:9:
			// 'continue'
			{
				this.match("continue");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:586:5:
			// ( 'default' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:586:9:
			// 'default'
			{
				this.match("default");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:590:5:
			// ( 'do' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:590:9:
			// 'do'
			{
				this.match("do");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:594:5:
			// ( 'double' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:594:9:
			// 'double'
			{
				this.match("double");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:598:5:
			// ( 'else' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:598:9:
			// 'else'
			{
				this.match("else");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:602:5:
			// ( 'enum' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:602:9:
			// 'enum'
			{
				this.match("enum");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:606:5:
			// ( 'extends' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:606:9:
			// 'extends'
			{
				this.match("extends");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:610:5:
			// ( 'final' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:610:9:
			// 'final'
			{
				this.match("final");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:614:5:
			// ( 'finally' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:614:9:
			// 'finally'
			{
				this.match("finally");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:618:5:
			// ( 'Float' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:618:9:
			// 'Float'
			{
				this.match("Float");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:622:5:
			// ( 'for' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:622:9:
			// 'for'
			{
				this.match("for");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:626:5:
			// ( 'goto' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:626:9:
			// 'goto'
			{
				this.match("goto");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:630:5:
			// ( 'if' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:630:9:
			// 'if'
			{
				this.match("if");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:634:5:
			// ( 'implements' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:634:9:
			// 'implements'
			{
				this.match("implements");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:638:5:
			// ( 'import' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:638:9:
			// 'import'
			{
				this.match("import");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:642:5:
			// ( 'instanceof' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:642:9:
			// 'instanceof'
			{
				this.match("instanceof");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:646:5:
			// ( 'Int' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:646:9:
			// 'Int'
			{
				this.match("Int");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:650:5:
			// ( 'interface' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:650:9:
			// 'interface'
			{
				this.match("interface");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:654:5:
			// ( 'long' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:654:9:
			// 'long'
			{
				this.match("long");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:658:5:
			// ( 'native' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:658:9:
			// 'native'
			{
				this.match("native");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:662:5:
			// ( 'new' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:662:9:
			// 'new'
			{
				this.match("new");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:666:5:
			// ( 'package' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:666:9:
			// 'package'
			{
				this.match("package");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:670:5:
			// ( 'private' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:670:9:
			// 'private'
			{
				this.match("private");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:674:5:
			// ( 'protected' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:674:9:
			// 'protected'
			{
				this.match("protected");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:678:5:
			// ( 'public' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:678:9:
			// 'public'
			{
				this.match("public");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:682:5:
			// ( 'return' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:682:9:
			// 'return'
			{
				this.match("return");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:686:5:
			// ( 'short' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:686:9:
			// 'short'
			{
				this.match("short");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:690:5:
			// ( 'static' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:690:9:
			// 'static'
			{
				this.match("static");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:694:2:
			// ( 'inline' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:694:4:
			// 'inline'
			{
				this.match("inline");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:698:2:
			// ( 'dynamic' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:698:3:
			// 'dynamic'
			{
				this.match("dynamic");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:702:2:
			// ( 'override' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:702:3:
			// 'override'
			{
				this.match("override");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:706:5:
			// ( 'strictfp' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:706:9:
			// 'strictfp'
			{
				this.match("strictfp");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:710:5:
			// ( 'super' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:710:9:
			// 'super'
			{
				this.match("super");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:714:5:
			// ( 'switch' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:714:9:
			// 'switch'
			{
				this.match("switch");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:718:5:
			// ( 'this' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:718:9:
			// 'this'
			{
				this.match("this");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:722:5:
			// ( 'throw' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:722:9:
			// 'throw'
			{
				this.match("throw");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:726:5:
			// ( 'throws' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:726:9:
			// 'throws'
			{
				this.match("throws");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:730:5:
			// ( 'transient' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:730:9:
			// 'transient'
			{
				this.match("transient");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:734:5:
			// ( 'try' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:734:9:
			// 'try'
			{
				this.match("try");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:738:5:
			// ( 'Void' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:738:9:
			// 'Void'
			{
				this.match("Void");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:742:5:
			// ( 'volatile' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:742:9:
			// 'volatile'
			{
				this.match("volatile");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:746:5:
			// ( 'while' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:746:9:
			// 'while'
			{
				this.match("while");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:750:5:
			// ( 'true' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:750:9:
			// 'true'
			{
				this.match("true");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:754:5:
			// ( 'false' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:754:9:
			// 'false'
			{
				this.match("false");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:758:5:
			// ( 'null' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:758:9:
			// 'null'
			{
				this.match("null");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:760:6:
			// ( 'cast' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:760:8:
			// 'cast'
			{
				this.match("cast");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:764:2:
			// ( 'function' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:764:4:
			// 'function'
			{
				this.match("function");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:767:4:
			// ( 'in' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:767:6:
			// 'in'
			{
				this.match("in");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:769:5:
			// ( 'var' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:769:7:
			// 'var'
			{
				this.match("var");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:771:9:
			// ( 'typedef' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:771:11:
			// 'typedef'
			{
				this.match("typedef");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:773:8:
			// ( 'extern' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:773:10:
			// 'extern'
			{
				this.match("extern");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:777:5:
			// ( '(' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:777:9:
			// '('
			{
				this.match('(');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:781:5:
			// ( ')' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:781:9:
			// ')'
			{
				this.match(')');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:785:5:
			// ( '{' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:785:9:
			// '{'
			{
				this.match('{');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:789:5:
			// ( '}' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:789:9:
			// '}'
			{
				this.match('}');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:793:5:
			// ( '[' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:793:9:
			// '['
			{
				this.match('[');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:797:5:
			// ( ']' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:797:9:
			// ']'
			{
				this.match(']');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:801:5:
			// ( ';' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:801:9:
			// ';'
			{
				this.match(';');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:805:5:
			// ( ',' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:805:9:
			// ','
			{
				this.match(',');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:809:5:
			// ( '.' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:809:9:
			// '.'
			{
				this.match('.');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:813:5:
			// ( '...' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:813:9:
			// '...'
			{
				this.match("...");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:817:5:
			// ( '=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:817:9:
			// '='
			{
				this.match('=');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:821:5:
			// ( '!' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:821:9:
			// '!'
			{
				this.match('!');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:825:5:
			// ( '~' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:825:9:
			// '~'
			{
				this.match('~');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:829:5:
			// ( '?' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:829:9:
			// '?'
			{
				this.match('?');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:833:5:
			// ( ':' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:833:9:
			// ':'
			{
				this.match(':');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:837:5:
			// ( '==' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:837:9:
			// '=='
			{
				this.match("==");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:841:5:
			// ( '&&' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:841:9:
			// '&&'
			{
				this.match("&&");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:845:5:
			// ( '||' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:845:9:
			// '||'
			{
				this.match("||");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:849:5:
			// ( '++' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:849:9:
			// '++'
			{
				this.match("++");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:853:5:
			// ( '--' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:853:9:
			// '--'
			{
				this.match("--");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:857:5:
			// ( '+' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:857:9:
			// '+'
			{
				this.match('+');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:861:5:
			// ( '-' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:861:9:
			// '-'
			{
				this.match('-');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:865:5:
			// ( '*' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:865:9:
			// '*'
			{
				this.match('*');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:869:5:
			// ( '/' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:869:9:
			// '/'
			{
				this.match('/');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:873:5:
			// ( '&' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:873:9:
			// '&'
			{
				this.match('&');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:877:5:
			// ( '|' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:877:9:
			// '|'
			{
				this.match('|');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:881:5:
			// ( '^' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:881:9:
			// '^'
			{
				this.match('^');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:885:5:
			// ( '%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:885:9:
			// '%'
			{
				this.match('%');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:889:5:
			// ( '+=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:889:9:
			// '+='
			{
				this.match("+=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:893:5:
			// ( '-=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:893:9:
			// '-='
			{
				this.match("-=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:897:5:
			// ( '*=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:897:9:
			// '*='
			{
				this.match("*=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:901:5:
			// ( '/=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:901:9:
			// '/='
			{
				this.match("/=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:905:5:
			// ( '&=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:905:9:
			// '&='
			{
				this.match("&=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:909:5:
			// ( '|=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:909:9:
			// '|='
			{
				this.match("|=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:913:5:
			// ( '^=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:913:9:
			// '^='
			{
				this.match("^=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:917:5:
			// ( '%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:917:9:
			// '%='
			{
				this.match("%=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:921:2:
			// ( '%%<<%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:921:4:
			// '%%<<%%='
			{
				this.match("%%<<%%=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:924:2:
			// ( '%%>>%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:924:4:
			// '%%>>%%='
			{
				this.match("%%>>%%=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:927:2:
			// ( '%%>>>%%=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:927:4:
			// '%%>>>%%='
			{
				this.match("%%>>>%%=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:930:2:
			// ( '===' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:930:3:
			// '==='
			{
				this.match("===");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:934:1:
			// ( '%%<=%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:934:3:
			// '%%<=%%'
			{
				this.match("%%<=%%");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:938:2:
			// ( '!==' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:938:3:
			// '!=='
			{
				this.match("!==");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:942:5:
			// ( '@' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:942:9:
			// '@'
			{
				this.match('@');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:945:8:
			// ( '!=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:945:10:
			// '!='
			{
				this.match("!=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:949:2:
			// ( '->' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:949:4:
			// '->'
			{
				this.match("->");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:953:2:
			// ( '%%<<%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:953:3:
			// '%%<<%%'
			{
				this.match("%%<<%%");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:956:2:
			// ( '%%>>%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:956:3:
			// '%%>>%%'
			{
				this.match("%%>>%%");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:959:2:
			// ( '%%>>>%%' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:959:3:
			// '%%>>>%%'
			{
				this.match("%%>>>%%");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:962:4:
			// ( '>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:962:6:
			// '>'
			{
				this.match('>');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:965:6:
			// ( '>>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:965:8:
			// '>>'
			{
				this.match(">>");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:968:6:
			// ( '<<' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:968:8:
			// '<<'
			{
				this.match("<<");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:970:8:
			// ( '>>>' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:970:10:
			// '>>>'
			{
				this.match(">>>");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:973:8:
			// ( '<<=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:973:10:
			// '<<='
			{
				this.match("<<=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:976:8:
			// ( '>>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:976:10:
			// '>>='
			{
				this.match(">>=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:979:9:
			// ( '>>>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:979:11:
			// '>>>='
			{
				this.match(">>>=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:6:
			// ( '>=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:982:8:
			// '>='
			{
				this.match(">=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:984:6:
			// ( '<=' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:984:8:
			// '<='
			{
				this.match("<=");

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:5:
			// ( '<' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:988:9:
			// '<'
			{
				this.match('<');

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:992:5:
			// ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' |
			// '0' .. '9' | '_' )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:992:8:
			// ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0'
			// .. '9' | '_' )*
			{
				if ((this.input.LA(1) >= 'A' && this.input.LA(1) <= 'Z')
						|| this.input.LA(1) == '_'
						|| (this.input.LA(1) >= 'a' && this.input.LA(1) <= 'z')) {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
					throw mse;
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:992:32:
				// ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = this.input.LA(1);

					if (((LA10_0 >= '0' && LA10_0 <= '9')
							|| (LA10_0 >= 'A' && LA10_0 <= 'Z')
							|| LA10_0 == '_' || (LA10_0 >= 'a' && LA10_0 <= 'z'))) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
					{
						if ((this.input.LA(1) >= '0' && this.input.LA(1) <= '9')
								|| (this.input.LA(1) >= 'A' && this.input.LA(1) <= 'Z')
								|| this.input.LA(1) == '_'
								|| (this.input.LA(1) >= 'a' && this.input.LA(1) <= 'z')) {
							this.input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, this.input);
							this.recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop10;
					}
				} while (true);

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:8:
			// ( ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:10:
			// ( '0' .. '9' )+
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:10:
				// ( '0' .. '9' )+
				int cnt11 = 0;
				loop11: do {
					int alt11 = 2;
					int LA11_0 = this.input.LA(1);

					if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
						alt11 = 1;
					}

					switch (alt11) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:995:10:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt11 >= 1) {
							break loop11;
						}
						EarlyExitException eee = new EarlyExitException(11,
								this.input);
						throw eee;
					}
					cnt11++;
				} while (true);

			}

			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:5:
			// ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0'
			// .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt18 = 3;
			alt18 = this.dfa18.predict(this.input);
			switch (alt18) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:9:
				// ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:9:
				// ( '0' .. '9' )+
				int cnt12 = 0;
				loop12: do {
					int alt12 = 2;
					int LA12_0 = this.input.LA(1);

					if (((LA12_0 >= '0' && LA12_0 <= '9'))) {
						alt12 = 1;
					}

					switch (alt12) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:10:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt12 >= 1) {
							break loop12;
						}
						EarlyExitException eee = new EarlyExitException(12,
								this.input);
						throw eee;
					}
					cnt12++;
				} while (true);

				this.match('.');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:25:
				// ( '0' .. '9' )*
				loop13: do {
					int alt13 = 2;
					int LA13_0 = this.input.LA(1);

					if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
						alt13 = 1;
					}

					switch (alt13) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:26:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						break loop13;
					}
				} while (true);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:37:
				// ( EXPONENT )?
				int alt14 = 2;
				int LA14_0 = this.input.LA(1);

				if ((LA14_0 == 'E' || LA14_0 == 'e')) {
					alt14 = 1;
				}
				switch (alt14) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:999:37:
					// EXPONENT
				{
					this.mEXPONENT();

				}
					break;

				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1000:9:
				// '.' ( '0' .. '9' )+ ( EXPONENT )?
			{
				this.match('.');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1000:13:
				// ( '0' .. '9' )+
				int cnt15 = 0;
				loop15: do {
					int alt15 = 2;
					int LA15_0 = this.input.LA(1);

					if (((LA15_0 >= '0' && LA15_0 <= '9'))) {
						alt15 = 1;
					}

					switch (alt15) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1000:14:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt15 >= 1) {
							break loop15;
						}
						EarlyExitException eee = new EarlyExitException(15,
								this.input);
						throw eee;
					}
					cnt15++;
				} while (true);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1000:25:
				// ( EXPONENT )?
				int alt16 = 2;
				int LA16_0 = this.input.LA(1);

				if ((LA16_0 == 'E' || LA16_0 == 'e')) {
					alt16 = 1;
				}
				switch (alt16) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1000:25:
					// EXPONENT
				{
					this.mEXPONENT();

				}
					break;

				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1001:9:
				// ( '0' .. '9' )+ EXPONENT
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1001:9:
				// ( '0' .. '9' )+
				int cnt17 = 0;
				loop17: do {
					int alt17 = 2;
					int LA17_0 = this.input.LA(1);

					if (((LA17_0 >= '0' && LA17_0 <= '9'))) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1001:10:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt17 >= 1) {
							break loop17;
						}
						EarlyExitException eee = new EarlyExitException(17,
								this.input);
						throw eee;
					}
					cnt17++;
				} while (true);

				this.mEXPONENT();

			}
				break;

			}
			this.state.type = _type;
			this.state.channel = _channel;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:5:
			// ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options
			// {greedy=false; } : . )* '*/' )
			int alt22 = 2;
			int LA22_0 = this.input.LA(1);

			if ((LA22_0 == '/')) {
				int LA22_1 = this.input.LA(2);

				if ((LA22_1 == '/')) {
					alt22 = 1;
				} else if ((LA22_1 == '*')) {
					alt22 = 2;
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							22, 1, this.input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 22, 0,
						this.input);

				throw nvae;
			}
			switch (alt22) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:9:
				// '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
				this.match("//");

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:14:
				// (~ ( '\\n' | '\\r' ) )*
				loop19: do {
					int alt19 = 2;
					int LA19_0 = this.input.LA(1);

					if (((LA19_0 >= '\u0000' && LA19_0 <= '\t')
							|| (LA19_0 >= '\u000B' && LA19_0 <= '\f') || (LA19_0 >= '\u000E' && LA19_0 <= '\uFFFF'))) {
						alt19 = 1;
					}

					switch (alt19) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:14:
						// ~ ( '\\n' | '\\r' )
					{
						if ((this.input.LA(1) >= '\u0000' && this.input.LA(1) <= '\t')
								|| (this.input.LA(1) >= '\u000B' && this.input
										.LA(1) <= '\f')
								|| (this.input.LA(1) >= '\u000E' && this.input
										.LA(1) <= '\uFFFF')) {
							this.input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, this.input);
							this.recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop19;
					}
				} while (true);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:28:
				// ( '\\r' )?
				int alt20 = 2;
				int LA20_0 = this.input.LA(1);

				if ((LA20_0 == '\r')) {
					alt20 = 1;
				}
				switch (alt20) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1005:28:
					// '\\r'
				{
					this.match('\r');

				}
					break;

				}

				this.match('\n');
				_channel = HIDDEN;

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1006:9:
				// '/*' ( options {greedy=false; } : . )* '*/'
			{
				this.match("/*");

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1006:14:
				// ( options {greedy=false; } : . )*
				loop21: do {
					int alt21 = 2;
					int LA21_0 = this.input.LA(1);

					if ((LA21_0 == '*')) {
						int LA21_1 = this.input.LA(2);

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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1006:42:
						// .
					{
						this.matchAny();

					}
						break;

					default:
						break loop21;
					}
				} while (true);

				this.match("*/");

				_channel = HIDDEN;

			}
				break;

			}
			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "COMMENT"

	// $ANTLR start "PROCESSORCOMMAND"
	/**
	 * M processorcommand.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mPROCESSORCOMMAND() throws RecognitionException {
		try {
			int _type = PROCESSORCOMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1010:2:
			// ( '#if' ( options {greedy=false; } : . )* '#end' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1010:5:
			// '#if' ( options {greedy=false; } : . )* '#end'
			{
				this.match("#if");

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1010:11:
				// ( options {greedy=false; } : . )*
				loop23: do {
					int alt23 = 2;
					int LA23_0 = this.input.LA(1);

					if ((LA23_0 == '#')) {
						int LA23_1 = this.input.LA(2);

						if ((LA23_1 == 'e')) {
							int LA23_3 = this.input.LA(3);

							if ((LA23_3 == 'n')) {
								int LA23_4 = this.input.LA(4);

								if ((LA23_4 == 'd')) {
									alt23 = 2;
								} else if (((LA23_4 >= '\u0000' && LA23_4 <= 'c') || (LA23_4 >= 'e' && LA23_4 <= '\uFFFF'))) {
									alt23 = 1;
								}

							} else if (((LA23_3 >= '\u0000' && LA23_3 <= 'm') || (LA23_3 >= 'o' && LA23_3 <= '\uFFFF'))) {
								alt23 = 1;
							}

						} else if (((LA23_1 >= '\u0000' && LA23_1 <= 'd') || (LA23_1 >= 'f' && LA23_1 <= '\uFFFF'))) {
							alt23 = 1;
						}

					} else if (((LA23_0 >= '\u0000' && LA23_0 <= '\"') || (LA23_0 >= '$' && LA23_0 <= '\uFFFF'))) {
						alt23 = 1;
					}

					switch (alt23) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1010:39:
						// .
					{
						this.matchAny();

					}
						break;

					default:
						break loop23;
					}
				} while (true);

				this.match("#end");

				_channel = HIDDEN;

			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "PROCESSORCOMMAND"

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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1014:5:
			// ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1014:9:
			// '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
			// '\"'
			{
				this.match('\"');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:9:
				// ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
				loop24: do {
					int alt24 = 3;
					int LA24_0 = this.input.LA(1);

					if ((LA24_0 == '\\')) {
						alt24 = 1;
					} else if (((LA24_0 >= '\u0000' && LA24_0 <= '\t')
							|| (LA24_0 >= '\u000B' && LA24_0 <= '\f')
							|| (LA24_0 >= '\u000E' && LA24_0 <= '!')
							|| (LA24_0 >= '#' && LA24_0 <= '[') || (LA24_0 >= ']' && LA24_0 <= '\uFFFF'))) {
						alt24 = 2;
					}

					switch (alt24) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1015:13:
						// EscapeSequence
					{
						this.mEscapeSequence();

					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1016:13:
						// ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
					{
						if ((this.input.LA(1) >= '\u0000' && this.input.LA(1) <= '\t')
								|| (this.input.LA(1) >= '\u000B' && this.input
										.LA(1) <= '\f')
								|| (this.input.LA(1) >= '\u000E' && this.input
										.LA(1) <= '!')
								|| (this.input.LA(1) >= '#' && this.input.LA(1) <= '[')
								|| (this.input.LA(1) >= ']' && this.input.LA(1) <= '\uFFFF')) {
							this.input.consume();

						} else {
							MismatchedSetException mse = new MismatchedSetException(
									null, this.input);
							this.recover(mse);
							throw mse;
						}

					}
						break;

					default:
						break loop24;
					}
				} while (true);

				this.match('\"');

			}

			this.state.type = _type;
			this.state.channel = _channel;
		} finally {
		}
	}

	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "EXPONENT"
	/**
	 * M exponent.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1035:10:
			// ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1035:12:
			// ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
				if (this.input.LA(1) == 'E' || this.input.LA(1) == 'e') {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
					throw mse;
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1035:22:
				// ( '+' | '-' )?
				int alt25 = 2;
				int LA25_0 = this.input.LA(1);

				if ((LA25_0 == '+' || LA25_0 == '-')) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
				{
					if (this.input.LA(1) == '+' || this.input.LA(1) == '-') {
						this.input.consume();

					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, this.input);
						this.recover(mse);
						throw mse;
					}

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1035:33:
				// ( '0' .. '9' )+
				int cnt26 = 0;
				loop26: do {
					int alt26 = 2;
					int LA26_0 = this.input.LA(1);

					if (((LA26_0 >= '0' && LA26_0 <= '9'))) {
						alt26 = 1;
					}

					switch (alt26) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1035:34:
						// '0' .. '9'
					{
						this.matchRange('0', '9');

					}
						break;

					default:
						if (cnt26 >= 1) {
							break loop26;
						}
						EarlyExitException eee = new EarlyExitException(26,
								this.input);
						throw eee;
					}
					cnt26++;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1038:11:
			// ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1038:13:
			// ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
			{
				if ((this.input.LA(1) >= '0' && this.input.LA(1) <= '9')
						|| (this.input.LA(1) >= 'A' && this.input.LA(1) <= 'F')
						|| (this.input.LA(1) >= 'a' && this.input.LA(1) <= 'f')) {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1042:5:
			// ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\'
			// ) | UNICODE_ESC | OCTAL_ESC )
			int alt27 = 3;
			int LA27_0 = this.input.LA(1);

			if ((LA27_0 == '\\')) {
				switch (this.input.LA(2)) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't': {
					alt27 = 1;
				}
					break;
				case 'u': {
					alt27 = 2;
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
					alt27 = 3;
				}
					break;
				default:
					NoViableAltException nvae = new NoViableAltException("",
							27, 1, this.input);

					throw nvae;
				}

			} else {
				NoViableAltException nvae = new NoViableAltException("", 27, 0,
						this.input);

				throw nvae;
			}
			switch (alt27) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1042:9:
				// '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' |
				// '\\\\' )
			{
				this.match('\\');
				if (this.input.LA(1) == '\"' || this.input.LA(1) == '\''
						|| this.input.LA(1) == '\\' || this.input.LA(1) == 'b'
						|| this.input.LA(1) == 'f' || this.input.LA(1) == 'n'
						|| this.input.LA(1) == 'r' || this.input.LA(1) == 't') {
					this.input.consume();

				} else {
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					this.recover(mse);
					throw mse;
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1043:9:
				// UNICODE_ESC
			{
				this.mUNICODE_ESC();

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1044:9:
				// OCTAL_ESC
			{
				this.mOCTAL_ESC();

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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:5:
			// ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' (
			// '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt28 = 3;
			int LA28_0 = this.input.LA(1);

			if ((LA28_0 == '\\')) {
				int LA28_1 = this.input.LA(2);

				if (((LA28_1 >= '0' && LA28_1 <= '3'))) {
					int LA28_2 = this.input.LA(3);

					if (((LA28_2 >= '0' && LA28_2 <= '7'))) {
						int LA28_5 = this.input.LA(4);

						if (((LA28_5 >= '0' && LA28_5 <= '7'))) {
							alt28 = 1;
						} else {
							alt28 = 2;
						}
					} else {
						alt28 = 3;
					}
				} else if (((LA28_1 >= '4' && LA28_1 <= '7'))) {
					int LA28_3 = this.input.LA(3);

					if (((LA28_3 >= '0' && LA28_3 <= '7'))) {
						alt28 = 2;
					} else {
						alt28 = 3;
					}
				} else {
					NoViableAltException nvae = new NoViableAltException("",
							28, 1, this.input);

					throw nvae;
				}
			} else {
				NoViableAltException nvae = new NoViableAltException("", 28, 0,
						this.input);

				throw nvae;
			}
			switch (alt28) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:9:
				// '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
			{
				this.match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:14:
				// ( '0' .. '3' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:15:
				// '0' .. '3'
				{
					this.matchRange('0', '3');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:25:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:26:
				// '0' .. '7'
				{
					this.matchRange('0', '7');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:36:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1049:37:
				// '0' .. '7'
				{
					this.matchRange('0', '7');

				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1050:9:
				// '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
			{
				this.match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1050:14:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1050:15:
				// '0' .. '7'
				{
					this.matchRange('0', '7');

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1050:25:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1050:26:
				// '0' .. '7'
				{
					this.matchRange('0', '7');

				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1051:9:
				// '\\\\' ( '0' .. '7' )
			{
				this.match('\\');
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1051:14:
				// ( '0' .. '7' )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1051:15:
				// '0' .. '7'
				{
					this.matchRange('0', '7');

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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1056:5:
			// ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1056:9:
			// '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
				this.match('\\');
				this.match('u');
				this.mHEX_DIGIT();
				this.mHEX_DIGIT();
				this.mHEX_DIGIT();
				this.mHEX_DIGIT();

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
		// PROCESSORCOMMAND | STRINGLITERAL )
		int alt29 = 128;
		alt29 = this.dfa29.predict(this.input);
		switch (alt29) {
		case 1:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:10:
			// WS
		{
			this.mWS();

		}
			break;
		case 2:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:13:
			// LONGLITERAL
		{
			this.mLONGLITERAL();

		}
			break;
		case 3:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:25:
			// INTLITERAL
		{
			this.mINTLITERAL();

		}
			break;
		case 4:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:36:
			// CHARLITERAL
		{
			this.mCHARLITERAL();

		}
			break;
		case 5:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:48:
			// ABSTRACT
		{
			this.mABSTRACT();

		}
			break;
		case 6:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:57:
			// BOOLEAN
		{
			this.mBOOLEAN();

		}
			break;
		case 7:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:65:
			// BREAK
		{
			this.mBREAK();

		}
			break;
		case 8:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:71:
			// BYTE
		{
			this.mBYTE();

		}
			break;
		case 9:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:76:
			// CASE
		{
			this.mCASE();

		}
			break;
		case 10:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:81:
			// CATCH
		{
			this.mCATCH();

		}
			break;
		case 11:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:87:
			// CHAR
		{
			this.mCHAR();

		}
			break;
		case 12:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:92:
			// CLASS
		{
			this.mCLASS();

		}
			break;
		case 13:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:98:
			// CONST
		{
			this.mCONST();

		}
			break;
		case 14:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:104:
			// CONTINUE
		{
			this.mCONTINUE();

		}
			break;
		case 15:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:113:
			// DEFAULT
		{
			this.mDEFAULT();

		}
			break;
		case 16:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:121:
			// DO
		{
			this.mDO();

		}
			break;
		case 17:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:124:
			// DOUBLE
		{
			this.mDOUBLE();

		}
			break;
		case 18:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:131:
			// ELSE
		{
			this.mELSE();

		}
			break;
		case 19:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:136:
			// ENUM
		{
			this.mENUM();

		}
			break;
		case 20:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:141:
			// EXTENDS
		{
			this.mEXTENDS();

		}
			break;
		case 21:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:149:
			// FINAL
		{
			this.mFINAL();

		}
			break;
		case 22:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:155:
			// FINALLY
		{
			this.mFINALLY();

		}
			break;
		case 23:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:163:
			// FLOAT
		{
			this.mFLOAT();

		}
			break;
		case 24:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:169:
			// FOR
		{
			this.mFOR();

		}
			break;
		case 25:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:173:
			// GOTO
		{
			this.mGOTO();

		}
			break;
		case 26:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:178:
			// IF
		{
			this.mIF();

		}
			break;
		case 27:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:181:
			// IMPLEMENTS
		{
			this.mIMPLEMENTS();

		}
			break;
		case 28:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:192:
			// IMPORT
		{
			this.mIMPORT();

		}
			break;
		case 29:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:199:
			// INSTANCEOF
		{
			this.mINSTANCEOF();

		}
			break;
		case 30:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:210:
			// INT
		{
			this.mINT();

		}
			break;
		case 31:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:214:
			// INTERFACE
		{
			this.mINTERFACE();

		}
			break;
		case 32:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:224:
			// LONG
		{
			this.mLONG();

		}
			break;
		case 33:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:229:
			// NATIVE
		{
			this.mNATIVE();

		}
			break;
		case 34:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:236:
			// NEW
		{
			this.mNEW();

		}
			break;
		case 35:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:240:
			// PACKAGE
		{
			this.mPACKAGE();

		}
			break;
		case 36:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:248:
			// PRIVATE
		{
			this.mPRIVATE();

		}
			break;
		case 37:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:256:
			// PROTECTED
		{
			this.mPROTECTED();

		}
			break;
		case 38:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:266:
			// PUBLIC
		{
			this.mPUBLIC();

		}
			break;
		case 39:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:273:
			// RETURN
		{
			this.mRETURN();

		}
			break;
		case 40:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:280:
			// SHORT
		{
			this.mSHORT();

		}
			break;
		case 41:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:286:
			// STATIC
		{
			this.mSTATIC();

		}
			break;
		case 42:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:293:
			// INLINE
		{
			this.mINLINE();

		}
			break;
		case 43:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:300:
			// DYNAMIC
		{
			this.mDYNAMIC();

		}
			break;
		case 44:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:308:
			// OVERRIDE
		{
			this.mOVERRIDE();

		}
			break;
		case 45:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:317:
			// STRICTFP
		{
			this.mSTRICTFP();

		}
			break;
		case 46:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:326:
			// SUPER
		{
			this.mSUPER();

		}
			break;
		case 47:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:332:
			// SWITCH
		{
			this.mSWITCH();

		}
			break;
		case 48:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:339:
			// THIS
		{
			this.mTHIS();

		}
			break;
		case 49:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:344:
			// THROW
		{
			this.mTHROW();

		}
			break;
		case 50:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:350:
			// THROWS
		{
			this.mTHROWS();

		}
			break;
		case 51:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:357:
			// TRANSIENT
		{
			this.mTRANSIENT();

		}
			break;
		case 52:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:367:
			// TRY
		{
			this.mTRY();

		}
			break;
		case 53:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:371:
			// VOID
		{
			this.mVOID();

		}
			break;
		case 54:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:376:
			// VOLATILE
		{
			this.mVOLATILE();

		}
			break;
		case 55:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:385:
			// WHILE
		{
			this.mWHILE();

		}
			break;
		case 56:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:391:
			// TRUE
		{
			this.mTRUE();

		}
			break;
		case 57:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:396:
			// FALSE
		{
			this.mFALSE();

		}
			break;
		case 58:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:402:
			// NULL
		{
			this.mNULL();

		}
			break;
		case 59:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:407:
			// CAST
		{
			this.mCAST();

		}
			break;
		case 60:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:412:
			// FUNCTION
		{
			this.mFUNCTION();

		}
			break;
		case 61:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:421:
			// IN
		{
			this.mIN();

		}
			break;
		case 62:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:424:
			// VAR
		{
			this.mVAR();

		}
			break;
		case 63:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:428:
			// TYPEDEF
		{
			this.mTYPEDEF();

		}
			break;
		case 64:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:436:
			// EXTERN
		{
			this.mEXTERN();

		}
			break;
		case 65:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:443:
			// LPAREN
		{
			this.mLPAREN();

		}
			break;
		case 66:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:450:
			// RPAREN
		{
			this.mRPAREN();

		}
			break;
		case 67:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:457:
			// LBRACE
		{
			this.mLBRACE();

		}
			break;
		case 68:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:464:
			// RBRACE
		{
			this.mRBRACE();

		}
			break;
		case 69:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:471:
			// LBRACKET
		{
			this.mLBRACKET();

		}
			break;
		case 70:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:480:
			// RBRACKET
		{
			this.mRBRACKET();

		}
			break;
		case 71:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:489:
			// SEMI
		{
			this.mSEMI();

		}
			break;
		case 72:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:494:
			// COMMA
		{
			this.mCOMMA();

		}
			break;
		case 73:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:500:
			// DOT
		{
			this.mDOT();

		}
			break;
		case 74:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:504:
			// ELLIPSIS
		{
			this.mELLIPSIS();

		}
			break;
		case 75:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:513:
			// EQ
		{
			this.mEQ();

		}
			break;
		case 76:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:516:
			// BANG
		{
			this.mBANG();

		}
			break;
		case 77:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:521:
			// TILDE
		{
			this.mTILDE();

		}
			break;
		case 78:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:527:
			// QUES
		{
			this.mQUES();

		}
			break;
		case 79:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:532:
			// COLON
		{
			this.mCOLON();

		}
			break;
		case 80:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:538:
			// EQEQ
		{
			this.mEQEQ();

		}
			break;
		case 81:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:543:
			// AMPAMP
		{
			this.mAMPAMP();

		}
			break;
		case 82:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:550:
			// BARBAR
		{
			this.mBARBAR();

		}
			break;
		case 83:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:557:
			// PLUSPLUS
		{
			this.mPLUSPLUS();

		}
			break;
		case 84:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:566:
			// SUBSUB
		{
			this.mSUBSUB();

		}
			break;
		case 85:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:573:
			// PLUS
		{
			this.mPLUS();

		}
			break;
		case 86:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:578:
			// SUB
		{
			this.mSUB();

		}
			break;
		case 87:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:582:
			// STAR
		{
			this.mSTAR();

		}
			break;
		case 88:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:587:
			// SLASH
		{
			this.mSLASH();

		}
			break;
		case 89:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:593:
			// AMP
		{
			this.mAMP();

		}
			break;
		case 90:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:597:
			// BAR
		{
			this.mBAR();

		}
			break;
		case 91:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:601:
			// CARET
		{
			this.mCARET();

		}
			break;
		case 92:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:607:
			// PERCENT
		{
			this.mPERCENT();

		}
			break;
		case 93:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:615:
			// PLUSEQ
		{
			this.mPLUSEQ();

		}
			break;
		case 94:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:622:
			// SUBEQ
		{
			this.mSUBEQ();

		}
			break;
		case 95:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:628:
			// STAREQ
		{
			this.mSTAREQ();

		}
			break;
		case 96:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:635:
			// SLASHEQ
		{
			this.mSLASHEQ();

		}
			break;
		case 97:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:643:
			// AMPEQ
		{
			this.mAMPEQ();

		}
			break;
		case 98:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:649:
			// BAREQ
		{
			this.mBAREQ();

		}
			break;
		case 99:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:655:
			// CARETEQ
		{
			this.mCARETEQ();

		}
			break;
		case 100:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:663:
			// PERCENTEQ
		{
			this.mPERCENTEQ();

		}
			break;
		case 101:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:673:
			// PERCENTDLQ
		{
			this.mPERCENTDLQ();

		}
			break;
		case 102:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:684:
			// PERCENTDBQ
		{
			this.mPERCENTDBQ();

		}
			break;
		case 103:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:695:
			// PERCENTDBBQ
		{
			this.mPERCENTDBBQ();

		}
			break;
		case 104:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:707:
			// EQEQEQ
		{
			this.mEQEQEQ();

		}
			break;
		case 105:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:714:
			// PERCENTLESQ
		{
			this.mPERCENTLESQ();

		}
			break;
		case 106:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:726:
			// BANGEQQ
		{
			this.mBANGEQQ();

		}
			break;
		case 107:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:734:
			// MONKEYS_AT
		{
			this.mMONKEYS_AT();

		}
			break;
		case 108:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:745:
			// BANGEQ
		{
			this.mBANGEQ();

		}
			break;
		case 109:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:752:
			// MINUS_BIGGER
		{
			this.mMINUS_BIGGER();

		}
			break;
		case 110:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:765:
			// PERCENTLL
		{
			this.mPERCENTLL();

		}
			break;
		case 111:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:775:
			// PERCENTBB
		{
			this.mPERCENTBB();

		}
			break;
		case 112:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:785:
			// PERCENTBBB
		{
			this.mPERCENTBBB();

		}
			break;
		case 113:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:796:
			// GT
		{
			this.mGT();

		}
			break;
		case 114:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:799:
			// GTGT
		{
			this.mGTGT();

		}
			break;
		case 115:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:804:
			// LTLT
		{
			this.mLTLT();

		}
			break;
		case 116:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:809:
			// GTGTGT
		{
			this.mGTGTGT();

		}
			break;
		case 117:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:816:
			// LTLTEQ
		{
			this.mLTLTEQ();

		}
			break;
		case 118:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:823:
			// GTGTEQ
		{
			this.mGTGTEQ();

		}
			break;
		case 119:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:830:
			// GTGTGTEQ
		{
			this.mGTGTGTEQ();

		}
			break;
		case 120:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:839:
			// GTEQ
		{
			this.mGTEQ();

		}
			break;
		case 121:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:844:
			// LTEQ
		{
			this.mLTEQ();

		}
			break;
		case 122:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:849:
			// LT
		{
			this.mLT();

		}
			break;
		case 123:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:852:
			// IDENTIFIER
		{
			this.mIDENTIFIER();

		}
			break;
		case 124:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:863:
			// INTNUM
		{
			this.mINTNUM();

		}
			break;
		case 125:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:870:
			// FLOATNUM
		{
			this.mFLOATNUM();

		}
			break;
		case 126:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:879:
			// COMMENT
		{
			this.mCOMMENT();

		}
			break;
		case 127:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:887:
			// PROCESSORCOMMAND
		{
			this.mPROCESSORCOMMAND();

		}
			break;
		case 128:
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:1:904:
			// STRINGLITERAL
		{
			this.mSTRINGLITERAL();

		}
			break;

		}

	}

	/** The dfa9. */
	protected DFA9 dfa9 = new DFA9(this);

	/** The dfa18. */
	protected DFA18 dfa18 = new DFA18(this);

	/** The dfa29. */
	protected DFA29 dfa29 = new DFA29(this);

	/** The Constant DFA9_eotS. */
	static final String DFA9_eotS = "\11\uffff\2\13\1\uffff\1\15\2\uffff";

	/** The Constant DFA9_eofS. */
	static final String DFA9_eofS = "\17\uffff";

	/** The Constant DFA9_minS. */
	static final String DFA9_minS = "\1\42\10\uffff\2\60\1\uffff\1\60\2\uffff";

	/** The Constant DFA9_maxS. */
	static final String DFA9_maxS = "\1\164\10\uffff\2\67\1\uffff\1\67\2\uffff";

	/** The Constant DFA9_acceptS. */
	static final String DFA9_acceptS = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff\1\13\1\uffff"
			+ "\1\12\1\11";

	/** The Constant DFA9_specialS. */
	static final String DFA9_specialS = "\17\uffff}>";

	/** The Constant DFA9_transitionS. */
	static final String[] DFA9_transitionS = {
			"\1\6\4\uffff\1\7\10\uffff\4\11\4\12\44\uffff\1\10\5\uffff\1"
					+ "\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2", "",
			"", "", "", "", "", "", "", "\10\14", "\10\15", "", "\10\16", "",
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
		public DFA9(final BaseRecognizer recognizer) {
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
			return "527:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )";
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
	static final String DFA18_acceptS = "\2\uffff\1\2\1\1\1\3";

	/** The Constant DFA18_specialS. */
	static final String DFA18_specialS = "\5\uffff}>";

	/** The Constant DFA18_transitionS. */
	static final String[] DFA18_transitionS = { "\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4", "", "", "" };

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
		public DFA18(final BaseRecognizer recognizer) {
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
			return "998:1: FLOATNUM : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	/** The Constant DFA29_eotS. */
	static final String DFA29_eotS = "\2\uffff\2\70\1\uffff\25\63\10\uffff\1\153\1\155\1\157\3\uffff"
			+ "\1\162\1\165\1\170\1\174\1\176\1\u0081\1\u0083\1\u0086\1\uffff\1"
			+ "\u0089\1\u008c\7\uffff\1\70\1\u008e\1\uffff\1\70\11\63\1\u009a\12"
			+ "\63\1\u00a5\1\63\1\u00aa\25\63\2\uffff\1\u00c6\1\uffff\1\u00c8\30"
			+ "\uffff\1\u00cd\2\uffff\1\u00cf\2\uffff\1\70\1\uffff\13\63\1\uffff"
			+ "\5\63\1\u00e2\4\63\1\uffff\4\63\1\uffff\1\u00ec\2\63\1\u00ef\17"
			+ "\63\1\u00ff\4\63\1\u0104\1\63\6\uffff\1\u010a\4\uffff\1\63\1\u010c"
			+ "\1\63\1\u010e\1\u010f\1\u0110\1\63\1\u0112\6\63\1\u0119\1\u011a"
			+ "\2\63\1\uffff\3\63\1\u0121\5\63\1\uffff\1\u0127\1\63\1\uffff\1\u0129"
			+ "\13\63\1\u0135\2\63\1\uffff\1\u0138\1\63\1\u013a\1\63\1\uffff\1"
			+ "\63\5\uffff\1\63\1\uffff\1\u0141\3\uffff\1\u0142\1\uffff\1\u0143"
			+ "\1\u0144\4\63\2\uffff\2\63\1\u014c\1\u014d\1\63\1\u014f\1\uffff"
			+ "\5\63\1\uffff\1\63\1\uffff\5\63\1\u015b\2\63\1\u015e\2\63\1\uffff"
			+ "\1\u0162\1\63\1\uffff\1\63\1\uffff\1\63\1\u0166\3\uffff\1\63\4\uffff"
			+ "\2\63\1\u016d\2\63\1\u0170\1\63\2\uffff\1\63\1\uffff\1\63\1\u0174"
			+ "\2\63\1\u0177\1\u0178\3\63\1\u017c\1\u017d\1\uffff\1\u017e\1\63"
			+ "\1\uffff\1\u0180\1\63\1\u0182\1\uffff\3\63\1\uffff\1\u0187\1\u0189"
			+ "\1\uffff\2\63\1\u018d\1\uffff\1\u018e\1\u018f\1\uffff\1\u0190\2"
			+ "\63\1\uffff\2\63\2\uffff\1\u0195\1\u0196\1\63\3\uffff\1\63\1\uffff"
			+ "\1\63\1\uffff\1\63\1\u019b\1\63\4\uffff\1\u019e\1\u019f\1\u01a0"
			+ "\4\uffff\1\u01a1\3\63\2\uffff\1\63\1\u01a6\1\u01a7\1\63\1\uffff"
			+ "\1\u01a9\5\uffff\2\63\1\u01ac\1\u01ad\2\uffff\1\u01ae\1\uffff\1"
			+ "\u01af\1\u01b0\5\uffff";

	/** The Constant DFA29_eofS. */
	static final String DFA29_eofS = "\u01b1\uffff";

	/** The Constant DFA29_minS. */
	static final String DFA29_minS = "\1\11\1\uffff\2\56\1\uffff\1\142\1\157\1\162\1\141\1\145\1\154"
			+ "\1\141\1\154\1\157\1\146\1\156\1\157\2\141\1\145\1\150\1\166\1\150"
			+ "\1\157\1\141\1\150\10\uffff\1\56\2\75\3\uffff\1\46\1\75\1\53\1\55"
			+ "\1\75\1\52\1\75\1\45\1\uffff\1\75\1\74\3\uffff\2\60\2\uffff\2\56"
			+ "\1\uffff\1\56\1\163\1\157\1\145\1\164\1\163\2\141\1\156\1\146\1"
			+ "\60\1\156\1\163\1\165\1\164\1\156\1\162\1\154\1\156\1\157\1\164"
			+ "\1\60\1\160\1\60\1\164\1\156\1\164\1\167\1\154\1\143\1\151\1\142"
			+ "\1\164\1\157\1\141\1\160\1\151\1\145\1\151\1\141\1\160\1\151\1\154"
			+ "\1\162\1\151\2\uffff\1\75\1\uffff\1\75\26\uffff\1\74\1\uffff\1\75"
			+ "\2\uffff\1\75\2\uffff\1\60\1\uffff\1\164\1\154\1\141\2\145\1\143"
			+ "\1\162\2\163\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\1\141\1"
			+ "\60\1\163\1\143\1\141\1\157\1\uffff\1\154\1\164\1\145\1\151\1\uffff"
			+ "\1\60\1\147\1\151\1\60\1\154\1\153\1\166\1\164\1\154\1\165\1\162"
			+ "\1\164\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\60\2\145\1\144"
			+ "\1\141\1\60\1\154\4\uffff\1\74\1\76\1\75\4\uffff\1\162\1\60\1\153"
			+ "\3\60\1\150\1\60\1\163\1\164\1\151\1\165\1\154\1\155\2\60\1\156"
			+ "\1\154\1\uffff\1\145\2\164\1\60\1\145\1\162\1\141\1\162\1\156\1"
			+ "\uffff\1\60\1\166\1\uffff\1\60\2\141\1\145\1\151\1\162\1\164\1\151"
			+ "\1\143\1\162\1\143\1\162\1\60\1\167\1\163\1\uffff\1\60\1\144\1\60"
			+ "\1\164\1\uffff\1\145\1\45\1\uffff\1\45\2\uffff\1\141\1\uffff\1\60"
			+ "\3\uffff\1\60\1\uffff\2\60\1\156\1\154\1\145\1\151\2\uffff\1\144"
			+ "\1\156\2\60\1\151\1\60\1\uffff\1\155\1\164\1\156\1\146\1\145\1\uffff"
			+ "\1\145\1\uffff\1\147\1\164\2\143\1\156\1\60\1\143\1\164\1\60\1\150"
			+ "\1\151\1\uffff\1\60\1\151\1\uffff\1\145\1\uffff\1\151\1\60\3\45"
			+ "\1\143\4\uffff\1\165\1\164\1\60\1\143\1\163\1\60\1\171\2\uffff\1"
			+ "\157\1\uffff\1\145\1\60\1\143\1\141\2\60\2\145\1\164\2\60\1\uffff"
			+ "\1\60\1\146\1\uffff\1\60\1\144\1\60\1\uffff\1\145\1\146\1\154\1"
			+ "\uffff\2\75\1\45\1\164\1\145\1\60\1\uffff\2\60\1\uffff\1\60\2\156"
			+ "\1\uffff\1\145\1\143\2\uffff\2\60\1\145\3\uffff\1\160\1\uffff\1"
			+ "\145\1\uffff\1\156\1\60\1\145\4\uffff\1\75\2\60\4\uffff\1\60\1\164"
			+ "\1\157\1\145\2\uffff\1\144\2\60\1\164\1\uffff\1\60\5\uffff\1\163"
			+ "\1\146\2\60\2\uffff\1\60\1\uffff\2\60\5\uffff";

	/** The Constant DFA29_maxS. */
	static final String DFA29_maxS = "\1\176\1\uffff\1\170\1\154\1\uffff\1\142\1\157\1\171\1\157\1\171"
			+ "\1\170\1\165\1\154\1\157\2\156\1\157\2\165\1\145\1\167\1\166\1\171"
			+ "\2\157\1\150\10\uffff\1\71\2\75\3\uffff\1\75\1\174\1\75\1\76\4\75"
			+ "\1\uffff\1\76\1\75\3\uffff\2\146\2\uffff\1\154\1\145\1\uffff\1\154"
			+ "\1\163\1\157\1\145\2\164\2\141\1\156\1\146\1\172\1\156\1\163\1\165"
			+ "\1\164\1\156\1\162\1\154\1\156\1\157\1\164\1\172\1\160\1\172\1\164"
			+ "\1\156\1\164\1\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162\1\160"
			+ "\1\151\1\145\1\162\1\171\1\160\1\151\1\154\1\162\1\151\2\uffff\1"
			+ "\75\1\uffff\1\75\26\uffff\1\76\1\uffff\1\76\2\uffff\1\75\2\uffff"
			+ "\1\154\1\uffff\1\164\1\154\1\141\1\145\1\164\1\143\1\162\1\163\1"
			+ "\164\1\141\1\142\1\uffff\1\141\1\145\1\155\1\145\1\141\1\172\1\163"
			+ "\1\143\1\141\1\157\1\uffff\1\157\1\164\1\145\1\151\1\uffff\1\172"
			+ "\1\147\1\151\1\172\1\154\1\153\1\166\1\164\1\154\1\165\1\162\1\164"
			+ "\1\151\1\145\1\164\1\162\1\163\1\157\1\156\1\172\2\145\1\144\1\141"
			+ "\1\172\1\154\4\uffff\1\75\1\76\1\75\4\uffff\1\162\1\172\1\153\3"
			+ "\172\1\150\1\172\1\163\1\164\1\151\1\165\1\154\1\155\2\172\1\162"
			+ "\1\154\1\uffff\1\145\2\164\1\172\1\145\1\162\1\141\1\162\1\156\1"
			+ "\uffff\1\172\1\166\1\uffff\1\172\2\141\1\145\1\151\1\162\1\164\1"
			+ "\151\1\143\1\162\1\143\1\162\1\172\1\167\1\163\1\uffff\1\172\1\144"
			+ "\1\172\1\164\1\uffff\1\145\1\45\1\uffff\1\76\2\uffff\1\141\1\uffff"
			+ "\1\172\3\uffff\1\172\1\uffff\2\172\1\156\1\154\1\145\1\151\2\uffff"
			+ "\1\144\1\156\2\172\1\151\1\172\1\uffff\1\155\1\164\1\156\1\146\1"
			+ "\145\1\uffff\1\145\1\uffff\1\147\1\164\2\143\1\156\1\172\1\143\1"
			+ "\164\1\172\1\150\1\151\1\uffff\1\172\1\151\1\uffff\1\145\1\uffff"
			+ "\1\151\1\172\3\45\1\143\4\uffff\1\165\1\164\1\172\1\143\1\163\1"
			+ "\172\1\171\2\uffff\1\157\1\uffff\1\145\1\172\1\143\1\141\2\172\2"
			+ "\145\1\164\2\172\1\uffff\1\172\1\146\1\uffff\1\172\1\144\1\172\1"
			+ "\uffff\1\145\1\146\1\154\1\uffff\2\75\1\45\1\164\1\145\1\172\1\uffff"
			+ "\2\172\1\uffff\1\172\2\156\1\uffff\1\145\1\143\2\uffff\2\172\1\145"
			+ "\3\uffff\1\160\1\uffff\1\145\1\uffff\1\156\1\172\1\145\4\uffff\1"
			+ "\75\2\172\4\uffff\1\172\1\164\1\157\1\145\2\uffff\1\144\2\172\1"
			+ "\164\1\uffff\1\172\5\uffff\1\163\1\146\2\172\2\uffff\1\172\1\uffff"
			+ "\2\172\5\uffff";

	/** The Constant DFA29_acceptS. */
	static final String DFA29_acceptS = "\1\uffff\1\1\2\uffff\1\4\25\uffff\1\101\1\102\1\103\1\104\1\105"
			+ "\1\106\1\107\1\110\3\uffff\1\115\1\116\1\117\10\uffff\1\153\2\uffff"
			+ "\1\173\1\177\1\u0080\2\uffff\1\3\1\175\2\uffff\1\2\55\uffff\1\112"
			+ "\1\111\1\uffff\1\113\1\uffff\1\114\1\121\1\141\1\131\1\122\1\142"
			+ "\1\132\1\123\1\135\1\125\1\124\1\136\1\155\1\126\1\137\1\127\1\140"
			+ "\1\176\1\130\1\143\1\133\1\144\1\uffff\1\134\1\uffff\1\170\1\161"
			+ "\1\uffff\1\171\1\172\1\uffff\1\174\13\uffff\1\20\12\uffff\1\32\4"
			+ "\uffff\1\75\32\uffff\1\150\1\120\1\152\1\154\3\uffff\1\166\1\162"
			+ "\1\165\1\163\22\uffff\1\30\11\uffff\1\36\2\uffff\1\42\17\uffff\1"
			+ "\64\4\uffff\1\76\2\uffff\1\151\1\uffff\1\167\1\164\1\uffff\1\6\1"
			+ "\uffff\1\10\1\11\1\73\1\uffff\1\13\6\uffff\1\22\1\23\6\uffff\1\31"
			+ "\5\uffff\1\40\1\uffff\1\72\13\uffff\1\60\2\uffff\1\70\1\uffff\1"
			+ "\65\6\uffff\1\7\1\12\1\14\1\15\7\uffff\1\25\1\71\1\uffff\1\27\13"
			+ "\uffff\1\50\2\uffff\1\56\3\uffff\1\61\3\uffff\1\67\6\uffff\1\21"
			+ "\2\uffff\1\100\3\uffff\1\34\2\uffff\1\52\1\41\3\uffff\1\46\1\47"
			+ "\1\51\1\uffff\1\57\1\uffff\1\62\3\uffff\1\145\1\156\1\146\1\157"
			+ "\3\uffff\1\17\1\53\1\24\1\26\4\uffff\1\43\1\44\4\uffff\1\77\1\uffff"
			+ "\1\147\1\160\1\5\1\16\1\74\4\uffff\1\55\1\54\1\uffff\1\66\2\uffff"
			+ "\1\37\1\45\1\63\1\33\1\35";

	/** The Constant DFA29_specialS. */
	static final String DFA29_specialS = "\u01b1\uffff}>";

	/** The Constant DFA29_transitionS. */
	static final String[] DFA29_transitionS = {
			"\2\1\2\uffff\1\1\22\uffff\1\1\1\44\1\65\1\64\1\uffff\1\57\1"
					+ "\50\1\4\1\32\1\33\1\54\1\52\1\41\1\53\1\42\1\55\1\2\11\3\1\47"
					+ "\1\40\1\62\1\43\1\61\1\46\1\60\1\63\1\6\3\63\1\14\2\63\1\17"
					+ "\14\63\1\27\4\63\1\36\1\uffff\1\37\1\56\1\63\1\uffff\1\5\1\7"
					+ "\1\10\1\11\1\12\1\13\1\15\1\63\1\16\2\63\1\20\1\63\1\21\1\25"
					+ "\1\22\1\63\1\23\1\24\1\26\1\63\1\30\1\31\3\63\1\34\1\51\1\35"
					+ "\1\45",
			"",
			"\1\71\1\uffff\10\72\2\73\13\uffff\1\71\6\uffff\1\74\13\uffff"
					+ "\1\67\14\uffff\1\71\6\uffff\1\74\13\uffff\1\66",
			"\1\71\1\uffff\12\75\13\uffff\1\71\6\uffff\1\74\30\uffff\1"
					+ "\71\6\uffff\1\74",
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
			"\1\152\1\uffff\12\71",
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
			"",
			"\1\71\1\uffff\10\72\2\73\13\uffff\1\71\6\uffff\1\74\30\uffff"
					+ "\1\71\6\uffff\1\74",
			"\1\71\1\uffff\12\73\13\uffff\1\71\37\uffff\1\71",
			"",
			"\1\71\1\uffff\12\75\13\uffff\1\71\6\uffff\1\74\30\uffff\1"
					+ "\71\6\uffff\1\74",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\24\63\1\u0099\5" + "\63",
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
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u00a9\6"
					+ "\63\1\u00a7\1\u00a8\6\63",
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
			"\12\u008d\7\uffff\6\u008d\5\uffff\1\74\24\uffff\6\u008d\5"
					+ "\uffff\1\74",
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
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\13\63\1\u014b\16"
					+ "\63",
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
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\22\63\1\u0161\7" + "\63",
			"\1\u0163", "", "\1\u0164", "", "\1\u0165",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0167",
			"\1\u0168", "\1\u0169", "\1\u016a", "", "", "", "", "\1\u016b",
			"\1\u016c", "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\1\u016e", "\1\u016f",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0171", "",
			"", "\1\u0172", "", "\1\u0173",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0175",
			"\1\u0176", "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0179",
			"\1\u017a", "\1\u017b",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u017f", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0181",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "\1\u0183",
			"\1\u0184", "\1\u0185", "", "\1\u0186", "\1\u0188", "\1\u018a",
			"\1\u018b", "\1\u018c",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0191",
			"\1\u0192", "", "\1\u0193", "\1\u0194", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u0197", "",
			"", "", "\1\u0198", "", "\1\u0199", "", "\1\u019a",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u019c", "",
			"", "", "", "\1\u019d",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01a2",
			"\1\u01a3", "\1\u01a4", "", "", "\1\u01a5",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "\1\u01a8", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"", "\1\u01aa", "\1\u01ab",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63", "", "", "", "",
			"" };

	/** The Constant DFA29_eot. */
	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);

	/** The Constant DFA29_eof. */
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);

	/** The Constant DFA29_min. */
	static final char[] DFA29_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA29_minS);

	/** The Constant DFA29_max. */
	static final char[] DFA29_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA29_maxS);

	/** The Constant DFA29_accept. */
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);

	/** The Constant DFA29_special. */
	static final short[] DFA29_special = DFA
			.unpackEncodedString(DFA29_specialS);

	/** The Constant DFA29_transition. */
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	/**
	 * The Class DFA29.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA29 extends DFA {

		/**
		 * Instantiates a new dF a29.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA29(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WS | LONGLITERAL | INTLITERAL | CHARLITERAL | ABSTRACT | BOOLEAN | BREAK | BYTE | CASE | CATCH | CHAR | CLASS | CONST | CONTINUE | DEFAULT | DO | DOUBLE | ELSE | ENUM | EXTENDS | FINAL | FINALLY | FLOAT | FOR | GOTO | IF | IMPLEMENTS | IMPORT | INSTANCEOF | INT | INTERFACE | LONG | NATIVE | NEW | PACKAGE | PRIVATE | PROTECTED | PUBLIC | RETURN | SHORT | STATIC | INLINE | DYNAMIC | OVERRIDE | STRICTFP | SUPER | SWITCH | THIS | THROW | THROWS | TRANSIENT | TRY | VOID | VOLATILE | WHILE | TRUE | FALSE | NULL | CAST | FUNCTION | IN | VAR | TYPEDEF | EXTERN | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | SEMI | COMMA | DOT | ELLIPSIS | EQ | BANG | TILDE | QUES | COLON | EQEQ | AMPAMP | BARBAR | PLUSPLUS | SUBSUB | PLUS | SUB | STAR | SLASH | AMP | BAR | CARET | PERCENT | PLUSEQ | SUBEQ | STAREQ | SLASHEQ | AMPEQ | BAREQ | CARETEQ | PERCENTEQ | PERCENTDLQ | PERCENTDBQ | PERCENTDBBQ | EQEQEQ | PERCENTLESQ | BANGEQQ | MONKEYS_AT | BANGEQ | MINUS_BIGGER | PERCENTLL | PERCENTBB | PERCENTBBB | GT | GTGT | LTLT | GTGTGT | LTLTEQ | GTGTEQ | GTGTGTEQ | GTEQ | LTEQ | LT | IDENTIFIER | INTNUM | FLOATNUM | COMMENT | PROCESSORCOMMAND | STRINGLITERAL );";
		}
	}

}