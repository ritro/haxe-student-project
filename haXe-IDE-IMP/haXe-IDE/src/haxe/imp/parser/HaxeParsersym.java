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

import haxe.imp.parser.antlr.main.TinyHaxeTry1Lexer;

// TODO: Auto-generated Javadoc
/**
 * The Interface HaxeParsersym.
 * 
 * @author Anatoly Kondratyev
 */
public interface HaxeParsersym {

	/** The Constant PACKAGE. */
	public static final int PACKAGE = TinyHaxeTry1Lexer.PACKAGE;

	/** The Constant FUNCTION. */
	public static final int FUNCTION = TinyHaxeTry1Lexer.FUNCTION;

	/** The Constant CAST. */
	public static final int CAST = TinyHaxeTry1Lexer.CAST;

	/** The Constant EXPONENT. */
	public static final int EXPONENT = TinyHaxeTry1Lexer.EXPONENT;

	/** The Constant LT. */
	public static final int LT = TinyHaxeTry1Lexer.LT;

	/** The Constant STAR. */
	public static final int STAR = TinyHaxeTry1Lexer.STAR;

	/** The Constant WHILE. */
	public static final int WHILE = TinyHaxeTry1Lexer.WHILE;

	/** The Constant FLOATNUM. */
	public static final int FLOATNUM = TinyHaxeTry1Lexer.FLOATNUM;

	/** The Constant CONST. */
	public static final int CONST = TinyHaxeTry1Lexer.CONST;

	/** The Constant CASE. */
	public static final int CASE = TinyHaxeTry1Lexer.CASE;

	/** The Constant NEW. */
	public static final int NEW = TinyHaxeTry1Lexer.NEW;

	/** The Constant IMPORT. */
	public static final int IMPORT = TinyHaxeTry1Lexer.IMPORT;

	/** The Constant RETURN. */
	public static final int RETURN = TinyHaxeTry1Lexer.RETURN;

	/** The Constant VAR. */
	public static final int VAR = TinyHaxeTry1Lexer.VAR;

	/** The Constant VOID. */
	public static final int VOID = TinyHaxeTry1Lexer.VOID;

	/** The Constant COMMENT. */
	public static final int COMMENT = TinyHaxeTry1Lexer.COMMENT;

	/** The Constant PROCESSORCOMMAND. */
	public static final int PROCESSORCOMMAND = TinyHaxeTry1Lexer.PROCESSORCOMMAND;

	/** The Constant STATIC. */
	public static final int STATIC = TinyHaxeTry1Lexer.STATIC;

	/** The Constant PRIVATE. */
	public static final int PRIVATE = TinyHaxeTry1Lexer.PRIVATE;

	/** The Constant NULL. */
	public static final int NULL = TinyHaxeTry1Lexer.NULL;
	/** The Constant INT. */
	public static final int INT = TinyHaxeTry1Lexer.INT;

	/** The Constant CHARLITERAL. */
	public static final int CHARLITERAL = TinyHaxeTry1Lexer.CHARLITERAL;

	/** The Constant CLASS. */
	public static final int CLASS = TinyHaxeTry1Lexer.CLASS;

	/** The Constant FLOAT. */
	public static final int FLOAT = TinyHaxeTry1Lexer.FLOAT;

	/** The Constant IN. */
	public static final int IN = TinyHaxeTry1Lexer.IN;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = TinyHaxeTry1Lexer.IMPLEMENTS;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = TinyHaxeTry1Lexer.DEFAULT;

	/** The Constant TRUE. */
	public static final int TRUE = TinyHaxeTry1Lexer.TRUE;

	/** The Constant FALSE. */
	public static final int FALSE = TinyHaxeTry1Lexer.FALSE;

	/** The Constant ENUM. */
	public static final int ENUM = TinyHaxeTry1Lexer.ENUM;

	/** The Constant STRINGLITERAL. */
	public static final int STRINGLITERAL = TinyHaxeTry1Lexer.STRINGLITERAL;
	/** The Constant INTERFACE. */
	public static final int INTERFACE = TinyHaxeTry1Lexer.INTERFACE;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = TinyHaxeTry1Lexer.PUBLIC;

	/** The Constant EXTENDS. */
	public static final int EXTENDS = TinyHaxeTry1Lexer.EXTENDS;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = TinyHaxeTry1Lexer.BOOLEAN;

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
