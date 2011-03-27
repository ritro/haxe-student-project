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

import haxe.imp.parser.antlr.main.HaxeLexer;

// TODO: Auto-generated Javadoc
/**
 * The Interface HaxeParsersym.
 * 
 * @author Anatoly Kondratyev
 */
public interface HaxeParsersym {

	/** The Constant PACKAGE. */
	public static final int PACKAGE = HaxeLexer.PACKAGE;

	/** The Constant FUNCTION. */
	public static final int FUNCTION = HaxeLexer.FUNCTION;

	/** The Constant CAST. */
	public static final int CAST = HaxeLexer.CAST;

	/** The Constant EXPONENT. */
	public static final int EXPONENT = HaxeLexer.EXPONENT;

	/** The Constant LT. */
	public static final int LT = HaxeLexer.LT;

	/** The Constant STAR. */
	public static final int STAR = HaxeLexer.STAR;

	/** The Constant WHILE. */
	public static final int WHILE = HaxeLexer.WHILE;

	/** The Constant FLOATNUM. */
	public static final int FLOATNUM = HaxeLexer.FLOATNUM;

	/** The Constant CONST. */
	public static final int CONST = HaxeLexer.CONST;

	/** The Constant CASE. */
	public static final int CASE = HaxeLexer.CASE;
	public static final int THROW = HaxeLexer.THROW;
	
	public static final int FOR = HaxeLexer.FOR;
	public static final int IF = HaxeLexer.IF;
	public static final int ELSE = HaxeLexer.ELSE;
	public static final int TRY = HaxeLexer.TRY;
	public static final int CATCH = HaxeLexer.CATCH;

	/** The Constant NEW. */
	public static final int NEW = HaxeLexer.NEW;

	/** The Constant IMPORT. */
	public static final int IMPORT = HaxeLexer.IMPORT;

	/** The Constant RETURN. */
	public static final int RETURN = HaxeLexer.RETURN;

	/** The Constant VAR. */
	public static final int VAR = HaxeLexer.VAR;

	/** The Constant VOID. */
	public static final int VOID = HaxeLexer.VOID;

	/** The Constant COMMENT. */
	public static final int COMMENT = HaxeLexer.COMMENT;

	/** The Constant PREPROCESSOR_DIRECTIVE. */
	//public static final int PREPROCESSOR_DIRECTIVE = TinyHaxeTry1Lexer.PREPROCESSOR_DIRECTIVE;

	/** The Constant STATIC. */
	public static final int STATIC = HaxeLexer.STATIC;

	/** The Constant PRIVATE. */
	public static final int PRIVATE = HaxeLexer.PRIVATE;

	/** The Constant NULL. */
	public static final int NULL = HaxeLexer.NULL;
	/** The Constant INT. */
	public static final int INT = HaxeLexer.INT;

	/** The Constant CHARLITERAL. */
	public static final int CHARLITERAL = HaxeLexer.CHARLITERAL;

	/** The Constant CLASS. */
	public static final int CLASS = HaxeLexer.CLASS;

	/** The Constant FLOAT. */
	public static final int FLOAT = HaxeLexer.FLOAT;

	/** The Constant IN. */
	public static final int IN = HaxeLexer.IN;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = HaxeLexer.IMPLEMENTS;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = HaxeLexer.DEFAULT;

	/** The Constant TRUE. */
	public static final int TRUE = HaxeLexer.TRUE;

	/** The Constant FALSE. */
	public static final int FALSE = HaxeLexer.FALSE;

	/** The Constant ENUM. */
	public static final int ENUM = HaxeLexer.ENUM;

	/** The Constant STRINGLITERAL. */
	public static final int STRINGLITERAL = HaxeLexer.STRINGLITERAL;
	/** The Constant INTERFACE. */
	public static final int INTERFACE = HaxeLexer.INTERFACE;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = HaxeLexer.PUBLIC;

	/** The Constant EXTENDS. */
	public static final int EXTENDS = HaxeLexer.EXTENDS;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = HaxeLexer.BOOLEAN;

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
