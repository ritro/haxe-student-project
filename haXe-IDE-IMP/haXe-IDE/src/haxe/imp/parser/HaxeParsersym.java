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
package haxe.imp.parser;

// TODO: Auto-generated Javadoc
/**
 * The Interface HaxeParsersym.
 * 
 * @author Anatoly Kondratyev
 */
public interface HaxeParsersym {

	/** The Constant PACKAGE. */
	public static final int PACKAGE = 15;

	/** The Constant FUNCTION. */
	public static final int FUNCTION = 34;

	/** The Constant CAST. */
	public static final int CAST = 92;

	/** The Constant EXPONENT. */
	public static final int EXPONENT = 152;

	/** The Constant LT. */
	public static final int LT = 51;

	/** The Constant STAR. */
	public static final int STAR = 84;

	/** The Constant WHILE. */
	public static final int WHILE = 56;

	/** The Constant FLOATNUM. */
	public static final int FLOATNUM = 105;

	/** The Constant CONST. */
	public static final int CONST = 119;

	/** The Constant OCTAL_ESC. */
	public static final int OCTAL_ESC = 156;

	/** The Constant CASE. */
	public static final int CASE = 66;

	/** The Constant CHAR. */
	public static final int CHAR = 118;

	/** The Constant NEW. */
	public static final int NEW = 91;

	/** The Constant EXTERN. */
	public static final int EXTERN = 95;

	/** The Constant DO. */
	public static final int DO = 57;

	/** The Constant EOF. */
	public static final int EOF = -1;

	/** The Constant GTGT. */
	public static final int GTGT = 80;

	/** The Constant BREAK. */
	public static final int BREAK = 64;

	/** The Constant LBRACKET. */
	public static final int LBRACKET = 37;

	/** The Constant RPAREN. */
	public static final int RPAREN = 36;

	/** The Constant FINAL. */
	public static final int FINAL = 121;

	/** The Constant IMPORT. */
	public static final int IMPORT = 19;

	/** The Constant SUBSUB. */
	public static final int SUBSUB = 87;

	/** The Constant STAREQ. */
	public static final int STAREQ = 135;

	/** The Constant CARET. */
	public static final int CARET = 78;

	/** The Constant RETURN. */
	public static final int RETURN = 62;

	/** The Constant THIS. */
	public static final int THIS = 131;

	/** The Constant DOUBLE. */
	public static final int DOUBLE = 120;

	/** The Constant MONKEYS_AT. */
	public static final int MONKEYS_AT = 144;

	/** The Constant BARBAR. */
	public static final int BARBAR = 70;

	/** The Constant VAR. */
	public static final int VAR = 94;

	/** The Constant VOID. */
	public static final int VOID = 47;

	/** The Constant SUPER. */
	public static final int SUPER = 130;

	/** The Constant EQ. */
	public static final int EQ = 28;

	/** The Constant GOTO. */
	public static final int GOTO = 123;

	/** The Constant AMPAMP. */
	public static final int AMPAMP = 71;

	/** The Constant COMMENT. */
	public static final int COMMENT = 153;

	/** The Constant VAR_INIT. */
	public static final int VAR_INIT = 13;

	/** The Constant QUES. */
	public static final int QUES = 27;

	/** The Constant LTLTEQ. */
	public static final int LTLTEQ = 148;

	/** The Constant EQEQ. */
	public static final int EQEQ = 72;

	/** The Constant HexPrefix. */
	public static final int HexPrefix = 111;

	/** The Constant PP_IF. */
	public static final int PP_IF = 39;

	/** The Constant PERCENTDBBQ. */
	public static final int PERCENTDBBQ = 140;

	/** The Constant RBRACE. */
	public static final int RBRACE = 61;

	/** The Constant STATIC. */
	public static final int STATIC = 22;

	/** The Constant PRIVATE. */
	public static final int PRIVATE = 21;

	/** The Constant BLOCK_SCOPE. */
	public static final int BLOCK_SCOPE = 7;

	/** The Constant SWITCH. */
	public static final int SWITCH = 59;

	/** The Constant NULL. */
	public static final int NULL = 90;

	/** The Constant GTGTEQ. */
	public static final int GTGTEQ = 149;

	/** The Constant STRICTFP. */
	public static final int STRICTFP = 129;

	/** The Constant ELSE. */
	public static final int ELSE = 53;

	/** The Constant NATIVE. */
	public static final int NATIVE = 126;

	/** The Constant ELLIPSIS. */
	public static final int ELLIPSIS = 69;

	/** The Constant THROWS. */
	public static final int THROWS = 132;

	/** The Constant INT. */
	public static final int INT = 48;

	/** The Constant SLASHEQ. */
	public static final int SLASHEQ = 31;

	/** The Constant INTLITERAL. */
	public static final int INTLITERAL = 102;

	/** The Constant PERCENTBB. */
	public static final int PERCENTBB = 146;

	/** The Constant TRY. */
	public static final int TRY = 58;

	/** The Constant LongSuffix. */
	public static final int LongSuffix = 110;

	/** The Constant LONGLITERAL. */
	public static final int LONGLITERAL = 101;

	/** The Constant PERCENTLL. */
	public static final int PERCENTLL = 145;

	/** The Constant BANGEQQ. */
	public static final int BANGEQQ = 143;

	/** The Constant WS. */
	public static final int WS = 108;

	/** The Constant PERCENTDLQ. */
	public static final int PERCENTDLQ = 138;

	/** The Constant INHERIT_LIST_OPT. */
	public static final int INHERIT_LIST_OPT = 11;

	/** The Constant CHARLITERAL. */
	public static final int CHARLITERAL = 104;

	/** The Constant GT. */
	public static final int GT = 50;

	/** The Constant INLINE. */
	public static final int INLINE = 23;

	/** The Constant CATCH. */
	public static final int CATCH = 68;

	/** The Constant FALSE. */
	public static final int FALSE = 107;

	/** The Constant EscapeSequence. */
	public static final int EscapeSequence = 114;

	/** The Constant THROW. */
	public static final int THROW = 63;

	/** The Constant DYNAMIC. */
	public static final int DYNAMIC = 24;

	/** The Constant PROTECTED. */
	public static final int PROTECTED = 127;

	/** The Constant CLASS. */
	public static final int CLASS = 96;

	/** The Constant PP_ELSEIF. */
	public static final int PP_ELSEIF = 41;

	/** The Constant BAREQ. */
	public static final int BAREQ = 136;

	/** The Constant PP_ELSE. */
	public static final int PP_ELSE = 42;

	/** The Constant IntegerNumber. */
	public static final int IntegerNumber = 109;

	/** The Constant AMP. */
	public static final int AMP = 77;

	/** The Constant PLUSPLUS. */
	public static final int PLUSPLUS = 88;

	/** The Constant LBRACE. */
	public static final int LBRACE = 60;

	/** The Constant TYPE_PARAM_OPT. */
	public static final int TYPE_PARAM_OPT = 10;

	/** The Constant LTEQ. */
	public static final int LTEQ = 75;

	/** The Constant SUBEQ. */
	public static final int SUBEQ = 30;

	/** The Constant GTGTGT. */
	public static final int GTGTGT = 81;

	/** The Constant FOR. */
	public static final int FOR = 54;

	/** The Constant Exponent. */
	public static final int Exponent = 113;

	/** The Constant SUB. */
	public static final int SUB = 83;

	/** The Constant SUFFIX_EXPR. */
	public static final int SUFFIX_EXPR = 6;

	/** The Constant FLOAT. */
	public static final int FLOAT = 49;

	/** The Constant ABSTRACT. */
	public static final int ABSTRACT = 115;

	/** The Constant MINUS_BIGGER. */
	public static final int MINUS_BIGGER = 46;

	/** The Constant PERCENTDBQ. */
	public static final int PERCENTDBQ = 139;

	/** The Constant HexDigit. */
	public static final int HexDigit = 112;

	/** The Constant PLUSEQ. */
	public static final int PLUSEQ = 29;

	/** The Constant LPAREN. */
	public static final int LPAREN = 35;

	/** The Constant IF. */
	public static final int IF = 52;

	/** The Constant INTNUM. */
	public static final int INTNUM = 151;

	/** The Constant SLASH. */
	public static final int SLASH = 85;

	/** The Constant PP_END. */
	public static final int PP_END = 43;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = 116;

	/** The Constant ESC_SEQ. */
	public static final int ESC_SEQ = 157;

	/** The Constant IN. */
	public static final int IN = 55;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = 99;

	/** The Constant GTGTGTEQ. */
	public static final int GTGTGTEQ = 150;

	/** The Constant CONTINUE. */
	public static final int CONTINUE = 65;

	/** The Constant COMMA. */
	public static final int COMMA = 26;

	/** The Constant AMPEQ. */
	public static final int AMPEQ = 33;

	/** The Constant IDENTIFIER. */
	public static final int IDENTIFIER = 17;

	/** The Constant TRANSIENT. */
	public static final int TRANSIENT = 133;

	/** The Constant TILDE. */
	public static final int TILDE = 89;

	/** The Constant BANGEQ. */
	public static final int BANGEQ = 73;

	/** The Constant PLUS. */
	public static final int PLUS = 82;

	/** The Constant RBRACKET. */
	public static final int RBRACKET = 38;

	/** The Constant DOT. */
	public static final int DOT = 18;

	/** The Constant LTLT. */
	public static final int LTLT = 79;

	/** The Constant BYTE. */
	public static final int BYTE = 117;

	/** The Constant PERCENT. */
	public static final int PERCENT = 86;

	/** The Constant VOLATILE. */
	public static final int VOLATILE = 134;

	/** The Constant DECL_ATTR_LIST. */
	public static final int DECL_ATTR_LIST = 12;

	/** The Constant ASSIGN_OPERATOR. */
	public static final int ASSIGN_OPERATOR = 14;

	/** The Constant TYPEDEF. */
	public static final int TYPEDEF = 100;

	/** The Constant UNICODE_ESC. */
	public static final int UNICODE_ESC = 155;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = 67;

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
	public static final int GTEQ = 74;

	/** The Constant PP_ERROR. */
	public static final int PP_ERROR = 44;

	/** The Constant MODULE. */
	public static final int MODULE = 5;

	/** The Constant SEMI. */
	public static final int SEMI = 16;

	/** The Constant TRUE. */
	public static final int TRUE = 106;

	/** The Constant COLON. */
	public static final int COLON = 45;

	/** The Constant PARAM_LIST. */
	public static final int PARAM_LIST = 8;

	/** The Constant PERCENTLESQ. */
	public static final int PERCENTLESQ = 142;

	/** The Constant ENUM. */
	public static final int ENUM = 93;

	/** The Constant PERCENTEQ. */
	public static final int PERCENTEQ = 32;

	/** The Constant FINALLY. */
	public static final int FINALLY = 122;

	/** The Constant PROPERTY_DECL. */
	public static final int PROPERTY_DECL = 4;

	/** The Constant OVERRIDE. */
	public static final int OVERRIDE = 25;

	/** The Constant STRINGLITERAL. */
	public static final int STRINGLITERAL = 103;

	/** The Constant CARETEQ. */
	public static final int CARETEQ = 137;

	/** The Constant PERCENTBBB. */
	public static final int PERCENTBBB = 147;

	/** The Constant INTERFACE. */
	public static final int INTERFACE = 97;

	/** The Constant LONG. */
	public static final int LONG = 125;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = 20;

	/** The Constant EXTENDS. */
	public static final int EXTENDS = 98;

	/** The Constant TYPE_TAG. */
	public static final int TYPE_TAG = 9;

	/** The Constant BAR. */
	public static final int BAR = 76;

	/** The Constant TK_ERROR_TOKEN. */
	public final static int

	TK_COMMA = 21, TK_SEMICOLON = 1, TK_PLUS = 2, TK_MINUS = 3, TK_ASSIGN = 22,
			TK_TIMES = 4, TK_DIVIDE = 5, TK_GREATER = 6, TK_LESS = 7,
			TK_EQUAL = 8, TK_NOTEQUAL = 9, TK_LEFTPAREN = 11,
			TK_RIGHTPAREN = 15, TK_LEFTBRACE = 16, TK_RIGHTBRACE = 26,
			TK_boolean = 12, TK_double = 13, TK_else = 27, TK_false = 17,
			TK_if = 23, TK_int = 14, TK_return = 24, TK_true = 18,
			TK_void = 28, TK_while = 25, TK_EOF_TOKEN = 29,
			TK_SINGLE_LINE_COMMENT = 31, TK_IDENTIFIER = 10, TK_NUMBER = 19,
			TK_DoubleLiteral = 20, TK_MissingExpression = 30,
			TK_ERROR_TOKEN = 32;

	/** The Constant orderedTerminalSymbols. */
	public final static String orderedTerminalSymbols[] = { "", "SEMICOLON",
			"PLUS", "MINUS", "TIMES", "DIVIDE", "GREATER", "LESS", "EQUAL",
			"NOTEQUAL", "IDENTIFIER", "LEFTPAREN", "boolean", "double", "int",
			"RIGHTPAREN", "LEFTBRACE", "false", "true", "NUMBER",
			"DoubleLiteral", "COMMA", "ASSIGN", "if", "return", "while",
			"RIGHTBRACE", "else", "void", "EOF_TOKEN", "MissingExpression",
			"SINGLE_LINE_COMMENT", "ERROR_TOKEN" };

	/** The Constant numTokenKinds. */
	public final static int numTokenKinds = orderedTerminalSymbols.length;

	/** The Constant isValidForParser. */
	public final static boolean isValidForParser = true;
}
