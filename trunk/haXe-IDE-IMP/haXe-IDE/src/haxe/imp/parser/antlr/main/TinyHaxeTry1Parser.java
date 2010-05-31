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

import haxe.imp.parser.antlr.tree.ExtendedCommonTree;
import haxe.imp.parser.antlr.tree.specific.AssignOperationNode;
import haxe.imp.parser.antlr.tree.specific.BlockScopeNode;
import haxe.imp.parser.antlr.tree.specific.ClassNode;
import haxe.imp.parser.antlr.tree.specific.DoWhileNode;
import haxe.imp.parser.antlr.tree.specific.ForNode;
import haxe.imp.parser.antlr.tree.specific.FunctionNode;
import haxe.imp.parser.antlr.tree.specific.IfNode;
import haxe.imp.parser.antlr.tree.specific.SwitchNode;
import haxe.imp.parser.antlr.tree.specific.TryNode;
import haxe.imp.parser.antlr.tree.specific.VarDeclaration;
import haxe.imp.parser.antlr.tree.specific.VarUsage;
import haxe.imp.parser.antlr.tree.specific.WhileNode;

import java.util.HashMap;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

/**
 * The Class TinyHaxeTry1Parser.
 * 
 * @author Anatoly Kondratyev
 */
public class TinyHaxeTry1Parser extends Parser {

	/** The Constant tokenNames. */
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE",
			"SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG",
			"TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT",
			"ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT",
			"IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC",
			"OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ",
			"PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET",
			"RBRACKET", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT",
			"BOOLEAN", "LT", "GT", "GTGT", "NEW", "IF", "ELSE", "FOR", "IN",
			"WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN",
			"THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH",
			"ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ",
			"BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR",
			"SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "BANG", "TILDE", "NULL",
			"CAST", "ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS",
			"IMPLEMENTS", "TYPEDEF", "LONGLITERAL", "INTLITERAL",
			"STRINGLITERAL", "CHARLITERAL", "FLOATNUM", "TRUE", "FALSE", "WS",
			"IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent",
			"EscapeSequence", "ABSTRACT", "BYTE", "CHAR", "CONST", "DOUBLE",
			"FINAL", "FINALLY", "GOTO", "INSTANCEOF", "LONG", "NATIVE",
			"PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS",
			"TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ",
			"PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ",
			"BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB",
			"LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT",
			"PROCESSORCOMMAND", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC",
			"ESC_SEQ" };

	/** The Constant FUNCTION. */
	public static final int FUNCTION = 34;

	/** The Constant PACKAGE. */
	public static final int PACKAGE = 15;

	/** The Constant CAST. */
	public static final int CAST = 88;

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

	/** The Constant FINAL. */
	public static final int FINAL = 116;

	/** The Constant RPAREN. */
	public static final int RPAREN = 36;

	/** The Constant IMPORT. */
	public static final int IMPORT = 19;

	/** The Constant SUBSUB. */
	public static final int SUBSUB = 83;

	/** The Constant STAREQ. */
	public static final int STAREQ = 130;

	/** The Constant CARET. */
	public static final int CARET = 75;

	/** The Constant THIS. */
	public static final int THIS = 126;

	/** The Constant RETURN. */
	public static final int RETURN = 59;

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

	/** The Constant GOTO. */
	public static final int GOTO = 118;

	/** The Constant EQ. */
	public static final int EQ = 28;

	/** The Constant COMMENT. */
	public static final int COMMENT = 148;

	/** The Constant AMPAMP. */
	public static final int AMPAMP = 68;

	/** The Constant VAR_INIT. */
	public static final int VAR_INIT = 13;

	/** The Constant LTLTEQ. */
	public static final int LTLTEQ = 143;

	/** The Constant QUES. */
	public static final int QUES = 27;

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

	/** The Constant SUFFIX_EXPR. */
	public static final int SUFFIX_EXPR = 6;

	/** The Constant SUB. */
	public static final int SUB = 79;

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

	/** The Constant ESC_SEQ. */
	public static final int ESC_SEQ = 153;

	/** The Constant BOOLEAN. */
	public static final int BOOLEAN = 44;

	/** The Constant SLASH. */
	public static final int SLASH = 81;

	/** The Constant IN. */
	public static final int IN = 52;

	/** The Constant GTGTGTEQ. */
	public static final int GTGTGTEQ = 145;

	/** The Constant IMPLEMENTS. */
	public static final int IMPLEMENTS = 95;

	/** The Constant CONTINUE. */
	public static final int CONTINUE = 62;

	/** The Constant COMMA. */
	public static final int COMMA = 26;

	/** The Constant AMPEQ. */
	public static final int AMPEQ = 33;

	/** The Constant TRANSIENT. */
	public static final int TRANSIENT = 128;

	/** The Constant IDENTIFIER. */
	public static final int IDENTIFIER = 17;

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

	/** The Constant PROCESSORCOMMAND. */
	public static final int PROCESSORCOMMAND = 149;

	/** The Constant BYTE. */
	public static final int BYTE = 112;

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

	/** The Constant EQEQEQ. */
	public static final int EQEQEQ = 136;

	/** The Constant DEFAULT. */
	public static final int DEFAULT = 64;

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

	/** The Constant TRUE. */
	public static final int TRUE = 102;

	/** The Constant SEMI. */
	public static final int SEMI = 16;

	/** The Constant COLON. */
	public static final int COLON = 39;

	/** The Constant PARAM_LIST. */
	public static final int PARAM_LIST = 8;

	/** The Constant PERCENTLESQ. */
	public static final int PERCENTLESQ = 137;

	/** The Constant ENUM. */
	public static final int ENUM = 89;

	/** The Constant FINALLY. */
	public static final int FINALLY = 117;

	/** The Constant PERCENTEQ. */
	public static final int PERCENTEQ = 32;

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

	/** The Constant EXTENDS. */
	public static final int EXTENDS = 94;

	/** The Constant PUBLIC. */
	public static final int PUBLIC = 20;

	/** The Constant TYPE_TAG. */
	public static final int TYPE_TAG = 9;

	/** The Constant BAR. */
	public static final int BAR = 73;

	// delegates
	// delegators

	/**
	 * Instantiates a new tiny haxe try1 parser.
	 * 
	 * @param input
	 *            the input
	 */
	public TinyHaxeTry1Parser(final TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	/**
	 * Instantiates a new tiny haxe try1 parser.
	 * 
	 * @param input
	 *            the input
	 * @param state
	 *            the state
	 */
	public TinyHaxeTry1Parser(final TokenStream input,
			final RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[234 + 1];

	}

	/** The adaptor. */
	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	/**
	 * Sets the tree adaptor.
	 * 
	 * @param adaptor
	 *            the new tree adaptor
	 */
	public void setTreeAdaptor(final TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	/**
	 * Gets the tree adaptor.
	 * 
	 * @return the tree adaptor
	 */
	public TreeAdaptor getTreeAdaptor() {
		return this.adaptor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.antlr.runtime.BaseRecognizer#getTokenNames()
	 */
	@Override
	public String[] getTokenNames() {
		return TinyHaxeTry1Parser.tokenNames;
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

	/**
	 * The Class module_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class module_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "module"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:1:
	// module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
	// myPackage )? ( topLevelList )? ) ;
	/**
	 * Module.
	 * 
	 * @return the tiny haxe try1 parser.module_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.module_return module()
			throws RecognitionException {
		TinyHaxeTry1Parser.module_return retval = new TinyHaxeTry1Parser.module_return();
		retval.start = this.input.LT(1);
		int module_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.myPackage_return myPackage1 = null;

		TinyHaxeTry1Parser.topLevelList_return topLevelList2 = null;

		RewriteRuleSubtreeStream stream_myPackage = new RewriteRuleSubtreeStream(
				this.adaptor, "rule myPackage");
		RewriteRuleSubtreeStream stream_topLevelList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule topLevelList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 1)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:19:
			// ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
			// myPackage )? ( topLevelList )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21:
			// ( myPackage )? topLevelList
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21:
				// ( myPackage )?
				int alt1 = 2;
				int LA1_0 = this.input.LA(1);

				if ((LA1_0 == PACKAGE)) {
					alt1 = 1;
				}
				switch (alt1) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// myPackage
				{
					this.pushFollow(FOLLOW_myPackage_in_module119);
					myPackage1 = this.myPackage();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_myPackage.add(myPackage1.getTree());
					}

				}
					break;

				}

				this.pushFollow(FOLLOW_topLevelList_in_module122);
				topLevelList2 = this.topLevelList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_topLevelList.add(topLevelList2.getTree());
				}

				// AST REWRITE
				// elements: topLevelList, myPackage
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 46:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? (
					// topLevelList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:47:
						// ^( MODULE[\"MODULE\",true] ( myPackage )? (
						// topLevelList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(MODULE, "MODULE",
											true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:91:
							// ( myPackage )?
							if (stream_myPackage.hasNext()) {
								this.adaptor.addChild(root_1, stream_myPackage
										.nextTree());

							}
							stream_myPackage.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:102:
							// ( topLevelList )?
							if (stream_topLevelList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_topLevelList.nextTree());

							}
							stream_topLevelList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 1, module_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "module"

	/**
	 * The Class topLevelList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class topLevelList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "topLevelList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:1:
	// topLevelList : ( topLevel )* ;
	/**
	 * Top level list.
	 * 
	 * @return the tiny haxe try1 parser.top level list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.topLevelList_return topLevelList()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
		retval.start = this.input.LT(1);
		int topLevelList_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.topLevel_return topLevel3 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 2)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:19:
			// ( ( topLevel )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22:
			// ( topLevel )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22:
				// ( topLevel )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = this.input.LA(1);

					if ((LA2_0 == IMPORT || LA2_0 == ENUM
							|| (LA2_0 >= EXTERN && LA2_0 <= INTERFACE) || LA2_0 == TYPEDEF)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:23:
						// topLevel
					{
						this.pushFollow(FOLLOW_topLevel_in_topLevelList157);
						topLevel3 = this.topLevel();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, topLevel3.getTree());
						}

					}
						break;

					default:
						break loop2;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 2, topLevelList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevelList"

	/**
	 * The Class topLevel_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class topLevel_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "topLevel"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:1:
	// topLevel : ( myImport | topLevelDecl );
	/**
	 * Top level.
	 * 
	 * @return the tiny haxe try1 parser.top level_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.topLevel_return topLevel()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
		retval.start = this.input.LT(1);
		int topLevel_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.myImport_return myImport4 = null;

		TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl5 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 3)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:19:
			// ( myImport | topLevelDecl )
			int alt3 = 2;
			int LA3_0 = this.input.LA(1);

			if ((LA3_0 == IMPORT)) {
				alt3 = 1;
			} else if ((LA3_0 == ENUM
					|| (LA3_0 >= EXTERN && LA3_0 <= INTERFACE) || LA3_0 == TYPEDEF)) {
				alt3 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						this.input);

				throw nvae;
			}
			switch (alt3) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:21:
				// myImport
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_myImport_in_topLevel176);
				myImport4 = this.myImport();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, myImport4.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:53:25:
				// topLevelDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_topLevelDecl_in_topLevel203);
				topLevelDecl5 = this.topLevelDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, topLevelDecl5.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 3, topLevel_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevel"

	/**
	 * The Class myPackage_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class myPackage_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "myPackage"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:1:
	// myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
	/**
	 * My package.
	 * 
	 * @return the tiny haxe try1 parser.my package_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.myPackage_return myPackage()
			throws RecognitionException {
		TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
		retval.start = this.input.LT(1);
		int myPackage_StartIndex = this.input.index();
		Object root_0 = null;

		Token PACKAGE6 = null;
		Token SEMI8 = null;
		TinyHaxeTry1Parser.dotIdent_return dotIdent7 = null;

		Object PACKAGE6_tree = null;
		Object SEMI8_tree = null;
		RewriteRuleTokenStream stream_PACKAGE = new RewriteRuleTokenStream(
				this.adaptor, "token PACKAGE");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				this.adaptor, "token SEMI");
		RewriteRuleSubtreeStream stream_dotIdent = new RewriteRuleSubtreeStream(
				this.adaptor, "rule dotIdent");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 4)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:21:
			// ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:23:
			// PACKAGE dotIdent SEMI
			{
				PACKAGE6 = (Token) this.match(this.input, PACKAGE,
						FOLLOW_PACKAGE_in_myPackage222);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_PACKAGE.add(PACKAGE6);
				}

				this.pushFollow(FOLLOW_dotIdent_in_myPackage224);
				dotIdent7 = this.dotIdent();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_dotIdent.add(dotIdent7.getTree());
				}
				SEMI8 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_myPackage226);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI8);
				}

				// AST REWRITE
				// elements: dotIdent, PACKAGE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 55:45: -> ^( PACKAGE ( dotIdent )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:48:
						// ^( PACKAGE ( dotIdent )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_PACKAGE.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:58:
							// ( dotIdent )?
							if (stream_dotIdent.hasNext()) {
								this.adaptor.addChild(root_1, stream_dotIdent
										.nextTree());

							}
							stream_dotIdent.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 4, myPackage_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "myPackage"

	/**
	 * The Class qualifiedIdentifier_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class qualifiedIdentifier_return extends
			ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "qualifiedIdentifier"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:58:1:
	// qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^(
	// DOT $qualifiedIdentifier $ident) )* ;
	/**
	 * Qualified identifier.
	 * 
	 * @return the tiny haxe try1 parser.qualified identifier_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier()
			throws RecognitionException {
		TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
		retval.start = this.input.LT(1);
		int qualifiedIdentifier_StartIndex = this.input.index();
		Object root_0 = null;

		Token a = null;
		Token ident = null;
		Token DOT9 = null;

		Object a_tree = null;
		Object ident_tree = null;
		Object DOT9_tree = null;
		RewriteRuleTokenStream stream_DOT = new RewriteRuleTokenStream(
				this.adaptor, "token DOT");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 5)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:5:
			// ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT
			// $qualifiedIdentifier $ident) )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:9:
			// (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT
			// $qualifiedIdentifier $ident) )*
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:9:
				// (a= IDENTIFIER -> $a)
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:12:
				// a= IDENTIFIER
				{
					a = (Token) this.match(this.input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_qualifiedIdentifier258);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_IDENTIFIER.add(a);
					}

					// AST REWRITE
					// elements: a
					// token labels: a
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleTokenStream stream_a = new RewriteRuleTokenStream(
								this.adaptor, "token a", a);
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) this.adaptor.nil();
						// 59:27: -> $a
						{
							this.adaptor.addChild(root_0, stream_a.nextNode());

						}

						retval.tree = root_0;
					}
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:37:
				// ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier
				// $ident) )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = this.input.LA(1);

					if ((LA4_0 == DOT)) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:41:
						// DOT ident= IDENTIFIER
					{
						DOT9 = (Token) this.match(this.input, DOT,
								FOLLOW_DOT_in_qualifiedIdentifier274);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_DOT.add(DOT9);
						}

						ident = (Token) this.match(this.input, IDENTIFIER,
								FOLLOW_IDENTIFIER_in_qualifiedIdentifier278);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_IDENTIFIER.add(ident);
						}

						// AST REWRITE
						// elements: DOT, ident, qualifiedIdentifier
						// token labels: ident
						// rule labels: retval
						// token list labels:
						// rule list labels:
						// wildcard labels:
						if (this.state.backtracking == 0) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_ident = new RewriteRuleTokenStream(
									this.adaptor, "token ident", ident);
							RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
									this.adaptor, "rule retval",
									retval != null ? retval.tree : null);

							root_0 = (Object) this.adaptor.nil();
							// 59:63: -> ^( DOT $qualifiedIdentifier $ident)
							{
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:67:
								// ^( DOT $qualifiedIdentifier $ident)
								{
									Object root_1 = (Object) this.adaptor.nil();
									root_1 = (Object) this.adaptor.becomeRoot(
											stream_DOT.nextNode(), root_1);

									this.adaptor.addChild(root_1, stream_retval
											.nextTree());
									this.adaptor.addChild(root_1, stream_ident
											.nextNode());

									this.adaptor.addChild(root_0, root_1);
								}

							}

							retval.tree = root_0;
						}
					}
						break;

					default:
						break loop4;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 5, qualifiedIdentifier_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "qualifiedIdentifier"

	/**
	 * The Class myImport_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class myImport_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "myImport"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:1:
	// myImport : IMPORT dotIdent SEMI ;
	/**
	 * My import.
	 * 
	 * @return the tiny haxe try1 parser.my import_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.myImport_return myImport()
			throws RecognitionException {
		TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
		retval.start = this.input.LT(1);
		int myImport_StartIndex = this.input.index();
		Object root_0 = null;

		Token IMPORT10 = null;
		Token SEMI12 = null;
		TinyHaxeTry1Parser.dotIdent_return dotIdent11 = null;

		Object IMPORT10_tree = null;
		Object SEMI12_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 6)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:21:
			// ( IMPORT dotIdent SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:23:
			// IMPORT dotIdent SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				IMPORT10 = (Token) this.match(this.input, IMPORT,
						FOLLOW_IMPORT_in_myImport320);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IMPORT10_tree = (Object) this.adaptor.create(IMPORT10);
					root_0 = (Object) this.adaptor.becomeRoot(IMPORT10_tree,
							root_0);
				}
				this.pushFollow(FOLLOW_dotIdent_in_myImport323);
				dotIdent11 = this.dotIdent();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, dotIdent11.getTree());
				}
				SEMI12 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_myImport325);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 6, myImport_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "myImport"

	/**
	 * The Class access_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class access_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "access"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:1:
	// access : ( PUBLIC | PRIVATE );
	/**
	 * Access.
	 * 
	 * @return the tiny haxe try1 parser.access_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.access_return access()
			throws RecognitionException {
		TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
		retval.start = this.input.LT(1);
		int access_StartIndex = this.input.index();
		Object root_0 = null;

		Token set13 = null;

		Object set13_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 7)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:19:
			// ( PUBLIC | PRIVATE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
			{
				root_0 = (Object) this.adaptor.nil();

				set13 = (Token) this.input.LT(1);
				if ((this.input.LA(1) >= PUBLIC && this.input.LA(1) <= PRIVATE)) {
					this.input.consume();
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, (Object) this.adaptor
								.create(set13));
					}
					this.state.errorRecovery = false;
					this.state.failed = false;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					throw mse;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 7, access_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "access"

	/**
	 * The Class declAttr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class declAttr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "declAttr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:1:
	// declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
	/**
	 * Decl attr.
	 * 
	 * @return the tiny haxe try1 parser.decl attr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.declAttr_return declAttr()
			throws RecognitionException {
		TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
		retval.start = this.input.LT(1);
		int declAttr_StartIndex = this.input.index();
		Object root_0 = null;

		Token STATIC14 = null;
		Token INLINE15 = null;
		Token DYNAMIC16 = null;
		Token OVERRIDE17 = null;
		TinyHaxeTry1Parser.access_return access18 = null;

		Object STATIC14_tree = null;
		Object INLINE15_tree = null;
		Object DYNAMIC16_tree = null;
		Object OVERRIDE17_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 8)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:19:
			// ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
			int alt5 = 5;
			switch (this.input.LA(1)) {
			case STATIC: {
				alt5 = 1;
			}
				break;
			case INLINE: {
				alt5 = 2;
			}
				break;
			case DYNAMIC: {
				alt5 = 3;
			}
				break;
			case OVERRIDE: {
				alt5 = 4;
			}
				break;
			case PUBLIC:
			case PRIVATE: {
				alt5 = 5;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 5, 0,
						this.input);

				throw nvae;
			}

			switch (alt5) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:21:
				// STATIC
			{
				root_0 = (Object) this.adaptor.nil();

				STATIC14 = (Token) this.match(this.input, STATIC,
						FOLLOW_STATIC_in_declAttr412);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					STATIC14_tree = (Object) this.adaptor.create(STATIC14);
					this.adaptor.addChild(root_0, STATIC14_tree);
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:70:24:
				// INLINE
			{
				root_0 = (Object) this.adaptor.nil();

				INLINE15 = (Token) this.match(this.input, INLINE,
						FOLLOW_INLINE_in_declAttr437);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					INLINE15_tree = (Object) this.adaptor.create(INLINE15);
					this.adaptor.addChild(root_0, INLINE15_tree);
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:71:25:
				// DYNAMIC
			{
				root_0 = (Object) this.adaptor.nil();

				DYNAMIC16 = (Token) this.match(this.input, DYNAMIC,
						FOLLOW_DYNAMIC_in_declAttr463);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					DYNAMIC16_tree = (Object) this.adaptor.create(DYNAMIC16);
					this.adaptor.addChild(root_0, DYNAMIC16_tree);
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:72:25:
				// OVERRIDE
			{
				root_0 = (Object) this.adaptor.nil();

				OVERRIDE17 = (Token) this.match(this.input, OVERRIDE,
						FOLLOW_OVERRIDE_in_declAttr489);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					OVERRIDE17_tree = (Object) this.adaptor.create(OVERRIDE17);
					this.adaptor.addChild(root_0, OVERRIDE17_tree);
				}

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:73:25:
				// access
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_access_in_declAttr515);
				access18 = this.access();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, access18.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 8, declAttr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "declAttr"

	/**
	 * The Class declAttrList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class declAttrList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "declAttrList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:1:
	// declAttrList : ( declAttr )+ -> ^(
	// DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
	/**
	 * Decl attr list.
	 * 
	 * @return the tiny haxe try1 parser.decl attr list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.declAttrList_return declAttrList()
			throws RecognitionException {
		TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
		retval.start = this.input.LT(1);
		int declAttrList_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.declAttr_return declAttr19 = null;

		RewriteRuleSubtreeStream stream_declAttr = new RewriteRuleSubtreeStream(
				this.adaptor, "rule declAttr");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 9)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:19:
			// ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] (
			// declAttr )+ ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:21:
			// ( declAttr )+
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:21:
				// ( declAttr )+
				int cnt6 = 0;
				loop6: do {
					int alt6 = 2;
					int LA6_0 = this.input.LA(1);

					if (((LA6_0 >= PUBLIC && LA6_0 <= OVERRIDE))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:22:
						// declAttr
					{
						this.pushFollow(FOLLOW_declAttr_in_declAttrList530);
						declAttr19 = this.declAttr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_declAttr.add(declAttr19.getTree());
						}

					}
						break;

					default:
						if (cnt6 >= 1) {
							break loop6;
						}
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(6,
								this.input);
						throw eee;
					}
					cnt6++;
				} while (true);

				// AST REWRITE
				// elements: declAttr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 75:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] (
					// declAttr )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:36:
						// ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr
						// )+ )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(DECL_ATTR_LIST,
											"DECL_ATTR_LIST", true), root_1);

							if (!(stream_declAttr.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_declAttr.hasNext()) {
								this.adaptor.addChild(root_1, stream_declAttr
										.nextTree());

							}
							stream_declAttr.reset();

							this.adaptor.addChild(root_0, this
									.setLeftRightPositions(root_1));
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 9, declAttrList_StartIndex);
			}
		}
		return retval;
	}

	/**
	 * Sets the left right positions.
	 * 
	 * @param root_1
	 *            the root_1
	 * @return the extended common tree
	 */
	private ExtendedCommonTree setLeftRightPositions(final Object root_1) {
		int leftMostPosition = -1;
		int rightMostPosition = -1;
		ExtendedCommonTree declAttrList = (ExtendedCommonTree) root_1;
		try {
			if (declAttrList.getChildCount() > 0) {
				leftMostPosition = declAttrList.getChild(0)
						.getMostLeftPosition();
				rightMostPosition = declAttrList.getChild(
						declAttrList.getChildCount() - 1)
						.getMostRightPosition();
			}
		} catch (Exception exception) {

		}
		declAttrList.setMostLeftPosition(leftMostPosition);
		declAttrList.setMostRightPosition(rightMostPosition);
		return declAttrList;
	}

	// $ANTLR end "declAttrList"

	/**
	 * The Class paramList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class paramList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "paramList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:1:
	// paramList : ( param ( COMMA param )* -> ^(
	// PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
	/**
	 * Param list.
	 * 
	 * @return the tiny haxe try1 parser.param list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.paramList_return paramList()
			throws RecognitionException {
		TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
		retval.start = this.input.LT(1);
		int paramList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA21 = null;
		TinyHaxeTry1Parser.param_return param20 = null;

		TinyHaxeTry1Parser.param_return param22 = null;

		Object COMMA21_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				this.adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_param = new RewriteRuleSubtreeStream(
				this.adaptor, "rule param");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 10)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:19:
			// ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] (
			// param )+ ) | )
			int alt8 = 2;
			int LA8_0 = this.input.LA(1);

			if ((LA8_0 == IDENTIFIER || LA8_0 == QUES)) {
				alt8 = 1;
			} else if ((LA8_0 == RPAREN)) {
				alt8 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 8, 0,
						this.input);

				throw nvae;
			}
			switch (alt8) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:21:
				// param ( COMMA param )*
			{
				this.pushFollow(FOLLOW_param_in_paramList571);
				param20 = this.param();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_param.add(param20.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:27:
				// ( COMMA param )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = this.input.LA(1);

					if ((LA7_0 == COMMA)) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:28:
						// COMMA param
					{
						COMMA21 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_paramList574);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_COMMA.add(COMMA21);
						}

						this.pushFollow(FOLLOW_param_in_paramList576);
						param22 = this.param();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_param.add(param22.getTree());
						}

					}
						break;

					default:
						break loop7;
					}
				} while (true);

				// AST REWRITE
				// elements: param
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 78:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:45:
						// ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(PARAM_LIST,
											"PARAM_LIST", true), root_1);

							if (!(stream_param.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_param.hasNext()) {
								this.adaptor.addChild(root_1, stream_param
										.nextTree());

							}
							stream_param.reset();

							this.adaptor.addChild(root_0, this
									.setLeftRightPositions(root_1));
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:80:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 10, paramList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "paramList"

	/**
	 * The Class param_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class param_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "param"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:1:
	// param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^(
	// VAR[$IDENTIFIER,true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES
	// )? ) ;
	/**
	 * Param.
	 * 
	 * @return the tiny haxe try1 parser.param_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.param_return param()
			throws RecognitionException {
		TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
		retval.start = this.input.LT(1);
		int param_StartIndex = this.input.index();
		Object root_0 = null;

		Token QUES23 = null;
		Token IDENTIFIER24 = null;
		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt25 = null;

		TinyHaxeTry1Parser.varInit_return varInit26 = null;

		Object QUES23_tree = null;
		Object IDENTIFIER24_tree = null;
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_QUES = new RewriteRuleTokenStream(
				this.adaptor, "token QUES");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_varInit = new RewriteRuleSubtreeStream(
				this.adaptor, "rule varInit");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 11)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:19:
			// ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^(
			// VAR[$IDENTIFIER,true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit
			// )? ( QUES )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:20:
			// ( QUES )? IDENTIFIER typeTagOpt varInit
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:20:
				// ( QUES )?
				int alt9 = 2;
				int LA9_0 = this.input.LA(1);

				if ((LA9_0 == QUES)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// QUES
				{
					QUES23 = (Token) this.match(this.input, QUES,
							FOLLOW_QUES_in_param615);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_QUES.add(QUES23);
					}

				}
					break;

				}

				IDENTIFIER24 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_param618);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER24);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_param620);
				typeTagOpt25 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt25.getTree());
				}
				this.pushFollow(FOLLOW_varInit_in_param622);
				varInit26 = this.varInit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_varInit.add(varInit26.getTree());
				}

				// AST REWRITE
				// elements: QUES, typeTagOpt, varInit, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 81:56: -> ^( VAR[$IDENTIFIER,true] ( IDENTIFIER )? (
					// typeTagOpt )? ( varInit )? ( QUES )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:59:
						// ^( VAR[$IDENTIFIER,true] ( IDENTIFIER )? ( typeTagOpt
						// )? ( varInit )? ( QUES )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor
									.becomeRoot(new VarDeclaration(VAR,
											IDENTIFIER24, true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:99:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:121:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:133:
							// ( varInit )?
							if (stream_varInit.hasNext()) {
								this.adaptor.addChild(root_1, stream_varInit
										.nextTree());

							}
							stream_varInit.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:142:
							// ( QUES )?
							if (stream_QUES.hasNext()) {
								this.adaptor.addChild(root_1, stream_QUES
										.nextNode());

							}
							stream_QUES.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 11, param_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "param"

	/**
	 * The Class id_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class id_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "id"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:1:
	// id : IDENTIFIER ;
	/**
	 * Id.
	 * 
	 * @return the tiny haxe try1 parser.id_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
		TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
		retval.start = this.input.LT(1);
		int id_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER27 = null;

		Object IDENTIFIER27_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 12)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:4:
			// ( IDENTIFIER )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:6:
			// IDENTIFIER
			{
				root_0 = (Object) this.adaptor.nil();

				IDENTIFIER27 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_id658);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IDENTIFIER27_tree = new VarUsage(IDENTIFIER27);
					this.adaptor.addChild(root_0, IDENTIFIER27_tree);
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 12, id_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "id"

	/**
	 * The Class dotIdent_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class dotIdent_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "dotIdent"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:1:
	// dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
	/**
	 * Dot ident.
	 * 
	 * @return the tiny haxe try1 parser.dot ident_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.dotIdent_return dotIdent()
			throws RecognitionException {
		TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
		retval.start = this.input.LT(1);
		int dotIdent_StartIndex = this.input.index();
		Object root_0 = null;

		Token DOT29 = null;
		TinyHaxeTry1Parser.id_return ident = null;

		TinyHaxeTry1Parser.id_return id28 = null;

		Object DOT29_tree = null;
		RewriteRuleTokenStream stream_DOT = new RewriteRuleTokenStream(
				this.adaptor, "token DOT");
		RewriteRuleSubtreeStream stream_id = new RewriteRuleSubtreeStream(
				this.adaptor, "rule id");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 13)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:9:
			// ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:11:
			// ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:11:
				// ( id -> id )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:12:
				// id
				{
					this.pushFollow(FOLLOW_id_in_dotIdent672);
					id28 = this.id();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_id.add(id28.getTree());
					}

					// AST REWRITE
					// elements: id
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (this.state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								this.adaptor, "rule retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) this.adaptor.nil();
						// 87:15: -> id
						{
							this.adaptor.addChild(root_0, stream_id.nextTree());

						}

						retval.tree = root_0;
					}
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:22:
				// ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = this.input.LA(1);

					if ((LA10_0 == DOT)) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:23:
						// DOT ident= id
					{
						DOT29 = (Token) this.match(this.input, DOT,
								FOLLOW_DOT_in_dotIdent680);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_DOT.add(DOT29);
						}

						this.pushFollow(FOLLOW_id_in_dotIdent684);
						ident = this.id();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_id.add(ident.getTree());
						}

						// AST REWRITE
						// elements: ident, DOT, dotIdent
						// token labels:
						// rule labels: retval, ident
						// token list labels:
						// rule list labels:
						// wildcard labels:
						if (this.state.backtracking == 0) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
									this.adaptor, "rule retval",
									retval != null ? retval.tree : null);
							RewriteRuleSubtreeStream stream_ident = new RewriteRuleSubtreeStream(
									this.adaptor, "rule ident",
									ident != null ? ident.tree : null);

							root_0 = (Object) this.adaptor.nil();
							// 87:36: -> ^( DOT $dotIdent $ident)
							{
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:38:
								// ^( DOT $dotIdent $ident)
								{
									Object root_1 = (Object) this.adaptor.nil();
									root_1 = (Object) this.adaptor.becomeRoot(
											stream_DOT.nextNode(), root_1);

									this.adaptor.addChild(root_1, stream_retval
											.nextTree());
									this.adaptor.addChild(root_1, stream_ident
											.nextTree());

									this.adaptor.addChild(root_0, root_1);
								}

							}

							retval.tree = root_0;
						}
					}
						break;

					default:
						break loop10;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 13, dotIdent_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "dotIdent"

	/**
	 * The Class assignOp_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class assignOp_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "assignOp"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:1:
	// assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ ->
	// SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ ->
	// PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
	/**
	 * Assign op.
	 * 
	 * @return the tiny haxe try1 parser.assign op_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.assignOp_return assignOp()
			throws RecognitionException {
		TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
		retval.start = this.input.LT(1);
		int assignOp_StartIndex = this.input.index();
		Object root_0 = null;

		Token EQ30 = null;
		Token PLUSEQ31 = null;
		Token SUBEQ32 = null;
		Token SLASHEQ33 = null;
		Token PERCENTEQ34 = null;
		Token AMPEQ35 = null;

		Object EQ30_tree = null;
		Object PLUSEQ31_tree = null;
		Object SUBEQ32_tree = null;
		Object SLASHEQ33_tree = null;
		Object PERCENTEQ34_tree = null;
		Object AMPEQ35_tree = null;
		RewriteRuleTokenStream stream_SUBEQ = new RewriteRuleTokenStream(
				this.adaptor, "token SUBEQ");
		RewriteRuleTokenStream stream_SLASHEQ = new RewriteRuleTokenStream(
				this.adaptor, "token SLASHEQ");
		RewriteRuleTokenStream stream_PERCENTEQ = new RewriteRuleTokenStream(
				this.adaptor, "token PERCENTEQ");
		RewriteRuleTokenStream stream_EQ = new RewriteRuleTokenStream(
				this.adaptor, "token EQ");
		RewriteRuleTokenStream stream_AMPEQ = new RewriteRuleTokenStream(
				this.adaptor, "token AMPEQ");
		RewriteRuleTokenStream stream_PLUSEQ = new RewriteRuleTokenStream(
				this.adaptor, "token PLUSEQ");

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 14)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:9:
			// ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ ->
			// SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ ->
			// PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
			int alt11 = 6;
			switch (this.input.LA(1)) {
			case EQ: {
				alt11 = 1;
			}
				break;
			case PLUSEQ: {
				alt11 = 2;
			}
				break;
			case SUBEQ: {
				alt11 = 3;
			}
				break;
			case SLASHEQ: {
				alt11 = 4;
			}
				break;
			case PERCENTEQ: {
				alt11 = 5;
			}
				break;
			case AMPEQ: {
				alt11 = 6;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 11, 0,
						this.input);

				throw nvae;
			}

			switch (alt11) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:11:
				// EQ
			{
				EQ30 = (Token) this.match(this.input, EQ,
						FOLLOW_EQ_in_assignOp707);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_EQ.add(EQ30);
				}

				// AST REWRITE
				// elements: EQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 90:14: -> EQ[$EQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								EQ, EQ30));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:91:11:
				// PLUSEQ
			{
				PLUSEQ31 = (Token) this.match(this.input, PLUSEQ,
						FOLLOW_PLUSEQ_in_assignOp727);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_PLUSEQ.add(PLUSEQ31);
				}

				// AST REWRITE
				// elements: PLUSEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 91:19: -> PLUSEQ[$PLUSEQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								PLUSEQ, PLUSEQ31));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:92:11:
				// SUBEQ
			{
				SUBEQ32 = (Token) this.match(this.input, SUBEQ,
						FOLLOW_SUBEQ_in_assignOp748);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SUBEQ.add(SUBEQ32);
				}

				// AST REWRITE
				// elements: SUBEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 92:17: -> SUBEQ[$SUBEQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								SUBEQ, SUBEQ32));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:93:11:
				// SLASHEQ
			{
				SLASHEQ33 = (Token) this.match(this.input, SLASHEQ,
						FOLLOW_SLASHEQ_in_assignOp768);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SLASHEQ.add(SLASHEQ33);
				}

				// AST REWRITE
				// elements: SLASHEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 93:19: -> SLASHEQ[$SLASHEQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								SLASHEQ, SLASHEQ33));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:94:4:
				// PERCENTEQ
			{
				PERCENTEQ34 = (Token) this.match(this.input, PERCENTEQ,
						FOLLOW_PERCENTEQ_in_assignOp781);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_PERCENTEQ.add(PERCENTEQ34);
				}

				// AST REWRITE
				// elements: PERCENTEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 95:4: -> PERCENTEQ[$PERCENTEQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								PERCENTEQ, PERCENTEQ34));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:96:4:
				// AMPEQ
			{
				AMPEQ35 = (Token) this.match(this.input, AMPEQ,
						FOLLOW_AMPEQ_in_assignOp797);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_AMPEQ.add(AMPEQ35);
				}

				// AST REWRITE
				// elements: AMPEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 96:10: -> AMPEQ[$AMPEQ]
					{
						this.adaptor.addChild(root_0, new AssignOperationNode(
								AMPEQ, AMPEQ35));

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 14, assignOp_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "assignOp"

	/**
	 * The Class funcLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class funcLit_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "funcLit"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:1:
	// funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^(
	// FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
	/**
	 * Func lit.
	 * 
	 * @return the tiny haxe try1 parser.func lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.funcLit_return funcLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
		retval.start = this.input.LT(1);
		int funcLit_StartIndex = this.input.index();
		Object root_0 = null;

		Token FUNCTION36 = null;
		Token LPAREN37 = null;
		Token RPAREN39 = null;
		TinyHaxeTry1Parser.paramList_return paramList38 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt40 = null;

		TinyHaxeTry1Parser.block_return block41 = null;

		Object FUNCTION36_tree = null;
		Object LPAREN37_tree = null;
		Object RPAREN39_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				this.adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				this.adaptor, "rule block");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 15)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:19:
			// ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^(
			// FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:21:
			// FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
			{
				FUNCTION36 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcLit827);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION36);
				}

				LPAREN37 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcLit829);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN37);
				}

				this.pushFollow(FOLLOW_paramList_in_funcLit831);
				paramList38 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList38.getTree());
				}
				RPAREN39 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcLit833);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN39);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
				// ( typeTagOpt )?
				int alt12 = 2;
				switch (this.input.LA(1)) {
				case COLON: {
					alt12 = 1;
				}
					break;
				case LBRACE: {
					int LA12_2 = this.input.LA(2);

					if ((this.synpred20_TinyHaxeTry1())) {
						alt12 = 1;
					}
				}
					break;
				case SEMI: {
					int LA12_3 = this.input.LA(2);

					if ((this.synpred20_TinyHaxeTry1())) {
						alt12 = 1;
					}
				}
					break;
				}

				switch (alt12) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// typeTagOpt
				{
					this.pushFollow(FOLLOW_typeTagOpt_in_funcLit835);
					typeTagOpt40 = this.typeTagOpt();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_typeTagOpt.add(typeTagOpt40.getTree());
					}

				}
					break;

				}

				this.pushFollow(FOLLOW_block_in_funcLit838);
				block41 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block41.getTree());
				}

				// AST REWRITE
				// elements: block, typeTagOpt, FUNCTION, paramList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 100:72: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? (
					// block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:75:
						// ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )?
						// )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:100:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:111:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:123:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

							this.adaptor.addChild(root_0, root_1);
						}
					}
					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 15, funcLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcLit"

	/**
	 * The Class arrayLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class arrayLit_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "arrayLit"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:1:
	// arrayLit : LBRACKET exprListOpt RBRACKET ;
	/**
	 * Array lit.
	 * 
	 * @return the tiny haxe try1 parser.array lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.arrayLit_return arrayLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
		retval.start = this.input.LT(1);
		int arrayLit_StartIndex = this.input.index();
		Object root_0 = null;

		Token LBRACKET42 = null;
		Token RBRACKET44 = null;
		TinyHaxeTry1Parser.exprListOpt_return exprListOpt43 = null;

		Object LBRACKET42_tree = null;
		Object RBRACKET44_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 16)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:18:
			// ( LBRACKET exprListOpt RBRACKET )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:20:
			// LBRACKET exprListOpt RBRACKET
			{
				root_0 = (Object) this.adaptor.nil();

				LBRACKET42 = (Token) this.match(this.input, LBRACKET,
						FOLLOW_LBRACKET_in_arrayLit873);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_exprListOpt_in_arrayLit876);
				exprListOpt43 = this.exprListOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, exprListOpt43.getTree());
				}
				RBRACKET44 = (Token) this.match(this.input, RBRACKET,
						FOLLOW_RBRACKET_in_arrayLit878);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 16, arrayLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "arrayLit"

	/**
	 * The Class typeTag_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeTag_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeTag"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:1:
	// typeTag : COLON funcType ;
	/**
	 * Type tag.
	 * 
	 * @return the tiny haxe try1 parser.type tag_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeTag_return typeTag()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
		retval.start = this.input.LT(1);
		int typeTag_StartIndex = this.input.index();
		Object root_0 = null;

		Token COLON45 = null;
		TinyHaxeTry1Parser.funcType_return funcType46 = null;

		Object COLON45_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 17)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:9:
			// ( COLON funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:11:
			// COLON funcType
			{
				root_0 = (Object) this.adaptor.nil();

				COLON45 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_typeTag897);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_funcType_in_typeTag900);
				funcType46 = this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcType46.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 17, typeTag_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeTag"

	/**
	 * The Class typeTagOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeTagOpt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeTagOpt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:132:1:
	// typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) |
	// );
	/**
	 * Type tag opt.
	 * 
	 * @return the tiny haxe try1 parser.type tag opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
		retval.start = this.input.LT(1);
		int typeTagOpt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.typeTag_return typeTag47 = null;

		RewriteRuleSubtreeStream stream_typeTag = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTag");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 18)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:2:
			// ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
			int alt13 = 2;
			int LA13_0 = this.input.LA(1);

			if ((LA13_0 == COLON)) {
				alt13 = 1;
			} else if ((LA13_0 == EOF || LA13_0 == SEMI || LA13_0 == COMMA
					|| LA13_0 == EQ || LA13_0 == RPAREN || LA13_0 == LBRACE)) {
				alt13 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 13, 0,
						this.input);

				throw nvae;
			}
			switch (alt13) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:4:
				// typeTag
			{
				this.pushFollow(FOLLOW_typeTag_in_typeTagOpt912);
				typeTag47 = this.typeTag();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTag.add(typeTag47.getTree());
				}

				// AST REWRITE
				// elements: typeTag
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 133:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:15:
						// ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_TAG,
											"TYPE_TAG", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:63:
							// ( typeTag )?
							if (stream_typeTag.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTag
										.nextTree());

							}
							stream_typeTag.reset();

							this.adaptor.addChild(root_0, this
									.setLeftRightPositions(root_1));
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:135:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 18, typeTagOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeTagOpt"

	/**
	 * The Class typeList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:1:
	// typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA
	// typeConstraint )* );
	/**
	 * Type list.
	 * 
	 * @return the tiny haxe try1 parser.type list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeList_return typeList()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
		retval.start = this.input.LT(1);
		int typeList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA49 = null;
		Token COMMA52 = null;
		TinyHaxeTry1Parser.funcType_return funcType48 = null;

		TinyHaxeTry1Parser.funcType_return funcType50 = null;

		TinyHaxeTry1Parser.typeConstraint_return typeConstraint51 = null;

		TinyHaxeTry1Parser.typeConstraint_return typeConstraint53 = null;

		Object COMMA49_tree = null;
		Object COMMA52_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 19)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:9:
			// ( funcType ( COMMA funcType )* | typeConstraint ( COMMA
			// typeConstraint )* )
			int alt16 = 2;
			alt16 = this.dfa16.predict(this.input);
			switch (alt16) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
				// funcType ( COMMA funcType )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_funcType_in_typeList938);
				funcType48 = this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcType48.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:20:
				// ( COMMA funcType )*
				loop14: do {
					int alt14 = 2;
					int LA14_0 = this.input.LA(1);

					if ((LA14_0 == COMMA)) {
						int LA14_2 = this.input.LA(2);

						if ((this.synpred22_TinyHaxeTry1())) {
							alt14 = 1;
						}

					}

					switch (alt14) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
						// COMMA funcType
					{
						COMMA49 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_typeList941);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_funcType_in_typeList944);
						funcType50 = this.funcType();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, funcType50.getTree());
						}

					}
						break;

					default:
						break loop14;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:4:
				// typeConstraint ( COMMA typeConstraint )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_typeConstraint_in_typeList952);
				typeConstraint51 = this.typeConstraint();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, typeConstraint51.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:19:
				// ( COMMA typeConstraint )*
				loop15: do {
					int alt15 = 2;
					alt15 = this.dfa15.predict(this.input);
					switch (alt15) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
						// COMMA typeConstraint
					{
						COMMA52 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_typeList955);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_typeConstraint_in_typeList958);
						typeConstraint53 = this.typeConstraint();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, typeConstraint53
									.getTree());
						}

					}
						break;

					default:
						break loop15;
					}
				} while (true);

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 19, typeList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeList"

	/**
	 * The Class funcType_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class funcType_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "funcType"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:1:
	// funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
	/**
	 * Func type.
	 * 
	 * @return the tiny haxe try1 parser.func type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.funcType_return funcType()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
		retval.start = this.input.LT(1);
		int funcType_StartIndex = this.input.index();
		Object root_0 = null;

		Token MINUS_BIGGER55 = null;
		Token VOID57 = null;
		TinyHaxeTry1Parser.type_return type54 = null;

		TinyHaxeTry1Parser.type_return type56 = null;

		Object MINUS_BIGGER55_tree = null;
		Object VOID57_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 20)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:9:
			// ( ( type ) ( MINUS_BIGGER type )* | VOID )
			int alt18 = 2;
			int LA18_0 = this.input.LA(1);

			if ((LA18_0 == EOF || (LA18_0 >= SEMI && LA18_0 <= IDENTIFIER)
					|| LA18_0 == IMPORT || LA18_0 == DYNAMIC
					|| (LA18_0 >= COMMA && LA18_0 <= AMPEQ)
					|| (LA18_0 >= LPAREN && LA18_0 <= RPAREN)
					|| (LA18_0 >= RBRACKET && LA18_0 <= MINUS_BIGGER)
					|| (LA18_0 >= INT && LA18_0 <= GTGT) || LA18_0 == IN
					|| (LA18_0 >= LBRACE && LA18_0 <= RBRACE)
					|| (LA18_0 >= ELLIPSIS && LA18_0 <= PERCENT)
					|| LA18_0 == ENUM || (LA18_0 >= EXTERN && LA18_0 <= TYPEDEF))) {
				alt18 = 1;
			} else if ((LA18_0 == VOID)) {
				int LA18_2 = this.input.LA(2);

				if ((this.synpred26_TinyHaxeTry1())) {
					alt18 = 1;
				} else if ((true)) {
					alt18 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							18, 2, this.input);

					throw nvae;
				}
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 18, 0,
						this.input);

				throw nvae;
			}
			switch (alt18) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
				// ( type ) ( MINUS_BIGGER type )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
				// ( type )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:12:
				// type
				{
					this.pushFollow(FOLLOW_type_in_funcType973);
					type54 = this.type();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, type54.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:18:
				// ( MINUS_BIGGER type )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = this.input.LA(1);

					if ((LA17_0 == MINUS_BIGGER)) {
						int LA17_2 = this.input.LA(2);

						if ((this.synpred25_TinyHaxeTry1())) {
							alt17 = 1;
						}

					}

					switch (alt17) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
						// MINUS_BIGGER type
					{
						MINUS_BIGGER55 = (Token) this.match(this.input,
								MINUS_BIGGER,
								FOLLOW_MINUS_BIGGER_in_funcType977);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_type_in_funcType980);
						type56 = this.type();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, type56.getTree());
						}

					}
						break;

					default:
						break loop17;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:142:4:
				// VOID
			{
				root_0 = (Object) this.adaptor.nil();

				VOID57 = (Token) this.match(this.input, VOID,
						FOLLOW_VOID_in_funcType987);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					VOID57_tree = (Object) this.adaptor.create(VOID57);
					this.adaptor.addChild(root_0, VOID57_tree);
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 20, funcType_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcType"

	/**
	 * The Class type_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class type_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "type"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:1:
	// type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
	// ( typeParam )* | );
	/**
	 * Type.
	 * 
	 * @return the tiny haxe try1 parser.type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.type_return type()
			throws RecognitionException {
		TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
		retval.start = this.input.LT(1);
		int type_StartIndex = this.input.index();
		Object root_0 = null;

		Token INT60 = null;
		Token FLOAT61 = null;
		Token DYNAMIC62 = null;
		Token BOOLEAN63 = null;
		Token VOID64 = null;
		TinyHaxeTry1Parser.anonType_return anonType58 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent59 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam65 = null;

		Object INT60_tree = null;
		Object FLOAT61_tree = null;
		Object DYNAMIC62_tree = null;
		Object BOOLEAN63_tree = null;
		Object VOID64_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 21)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:6:
			// ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID
			// ) ( typeParam )* | )
			int alt21 = 2;
			alt21 = this.dfa21.predict(this.input);
			switch (alt21) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
				// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN |
				// VOID ) ( typeParam )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
				// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN |
				// VOID )
				int alt19 = 7;
				switch (this.input.LA(1)) {
				case LBRACE: {
					alt19 = 1;
				}
					break;
				case IDENTIFIER: {
					alt19 = 2;
				}
					break;
				case INT: {
					alt19 = 3;
				}
					break;
				case FLOAT: {
					alt19 = 4;
				}
					break;
				case DYNAMIC: {
					alt19 = 5;
				}
					break;
				case BOOLEAN: {
					alt19 = 6;
				}
					break;
				case VOID: {
					alt19 = 7;
				}
					break;
				default:
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							19, 0, this.input);

					throw nvae;
				}

				switch (alt19) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:9:
					// anonType
				{
					this.pushFollow(FOLLOW_anonType_in_type999);
					anonType58 = this.anonType();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, anonType58.getTree());
					}

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:20:
					// dotIdent
				{
					this.pushFollow(FOLLOW_dotIdent_in_type1003);
					dotIdent59 = this.dotIdent();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, dotIdent59.getTree());
					}

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:30:
					// INT
				{
					INT60 = (Token) this.match(this.input, INT,
							FOLLOW_INT_in_type1006);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						INT60_tree = (Object) this.adaptor.create(INT60);
						this.adaptor.addChild(root_0, INT60_tree);
					}

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:35:
					// FLOAT
				{
					FLOAT61 = (Token) this.match(this.input, FLOAT,
							FOLLOW_FLOAT_in_type1009);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						FLOAT61_tree = (Object) this.adaptor.create(FLOAT61);
						this.adaptor.addChild(root_0, FLOAT61_tree);
					}

				}
					break;
				case 5:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:42:
					// DYNAMIC
				{
					DYNAMIC62 = (Token) this.match(this.input, DYNAMIC,
							FOLLOW_DYNAMIC_in_type1012);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						DYNAMIC62_tree = (Object) this.adaptor
								.create(DYNAMIC62);
						this.adaptor.addChild(root_0, DYNAMIC62_tree);
					}

				}
					break;
				case 6:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:50:
					// BOOLEAN
				{
					BOOLEAN63 = (Token) this.match(this.input, BOOLEAN,
							FOLLOW_BOOLEAN_in_type1014);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						BOOLEAN63_tree = (Object) this.adaptor
								.create(BOOLEAN63);
						this.adaptor.addChild(root_0, BOOLEAN63_tree);
					}

				}
					break;
				case 7:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:58:
					// VOID
				{
					VOID64 = (Token) this.match(this.input, VOID,
							FOLLOW_VOID_in_type1016);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						VOID64_tree = (Object) this.adaptor.create(VOID64);
						this.adaptor.addChild(root_0, VOID64_tree);
					}

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:64:
				// ( typeParam )*
				loop20: do {
					int alt20 = 2;
					int LA20_0 = this.input.LA(1);

					if ((LA20_0 == LT)) {
						int LA20_2 = this.input.LA(2);

						if ((this.synpred33_TinyHaxeTry1())) {
							alt20 = 1;
						}

					}

					switch (alt20) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
						// typeParam
					{
						this.pushFollow(FOLLOW_typeParam_in_type1020);
						typeParam65 = this.typeParam();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor
									.addChild(root_0, typeParam65.getTree());
						}

					}
						break;

					default:
						break loop20;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:147:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 21, type_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "type"

	/**
	 * The Class typeParam_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeParam_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeParam"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:149:1:
	// typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
	/**
	 * Type param.
	 * 
	 * @return the tiny haxe try1 parser.type param_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeParam_return typeParam()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
		retval.start = this.input.LT(1);
		int typeParam_StartIndex = this.input.index();
		Object root_0 = null;

		Token LT66 = null;
		Token GT69 = null;
		Token GTGT70 = null;
		TinyHaxeTry1Parser.type_return type67 = null;

		TinyHaxeTry1Parser.typeList_return typeList68 = null;

		Object LT66_tree = null;
		Object GT69_tree = null;
		Object GTGT70_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 22)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:2:
			// ( LT ( type | typeList ) ( GT | GTGT | ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:4:
			// LT ( type | typeList ) ( GT | GTGT | )
			{
				root_0 = (Object) this.adaptor.nil();

				LT66 = (Token) this.match(this.input, LT,
						FOLLOW_LT_in_typeParam1038);
				if (this.state.failed) {
					return retval;
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:8:
				// ( type | typeList )
				int alt22 = 2;
				alt22 = this.dfa22.predict(this.input);
				switch (alt22) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
					// type
				{
					this.pushFollow(FOLLOW_type_in_typeParam1042);
					type67 = this.type();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, type67.getTree());
					}

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:14:
					// typeList
				{
					this.pushFollow(FOLLOW_typeList_in_typeParam1044);
					typeList68 = this.typeList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, typeList68.getTree());
					}

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:24:
				// ( GT | GTGT | )
				int alt23 = 3;
				switch (this.input.LA(1)) {
				case GT: {
					int LA23_1 = this.input.LA(2);

					if ((this.synpred36_TinyHaxeTry1())) {
						alt23 = 1;
					} else if ((true)) {
						alt23 = 3;
					} else {
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 23, 1, this.input);

						throw nvae;
					}
				}
					break;
				case GTGT: {
					int LA23_2 = this.input.LA(2);

					if ((this.synpred37_TinyHaxeTry1())) {
						alt23 = 2;
					} else if ((true)) {
						alt23 = 3;
					} else {
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 23, 2, this.input);

						throw nvae;
					}
				}
					break;
				case EOF:
				case SEMI:
				case IMPORT:
				case COMMA:
				case QUES:
				case EQ:
				case PLUSEQ:
				case SUBEQ:
				case SLASHEQ:
				case PERCENTEQ:
				case AMPEQ:
				case LPAREN:
				case RPAREN:
				case RBRACKET:
				case COLON:
				case MINUS_BIGGER:
				case LT:
				case IN:
				case LBRACE:
				case RBRACE:
				case ELLIPSIS:
				case BARBAR:
				case AMPAMP:
				case EQEQ:
				case BANGEQ:
				case GTEQ:
				case LTEQ:
				case BAR:
				case AMP:
				case CARET:
				case LTLT:
				case GTGTGT:
				case PLUS:
				case SUB:
				case STAR:
				case SLASH:
				case PERCENT:
				case ENUM:
				case EXTERN:
				case CLASS:
				case INTERFACE:
				case EXTENDS:
				case IMPLEMENTS:
				case TYPEDEF: {
					alt23 = 3;
				}
					break;
				default:
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							23, 0, this.input);

					throw nvae;
				}

				switch (alt23) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
					// GT
				{
					GT69 = (Token) this.match(this.input, GT,
							FOLLOW_GT_in_typeParam1048);
					if (this.state.failed) {
						return retval;
					}

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
					// GTGT
				{
					GTGT70 = (Token) this.match(this.input, GTGT,
							FOLLOW_GTGT_in_typeParam1051);
					if (this.state.failed) {
						return retval;
					}

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:35:
				{
				}
					break;

				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 22, typeParam_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeParam"

	/**
	 * The Class typeParamOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeParamOpt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeParamOpt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:154:1:
	// typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true]
	// ( typeParam )? ) | );
	/**
	 * Type param opt.
	 * 
	 * @return the tiny haxe try1 parser.type param opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
		retval.start = this.input.LT(1);
		int typeParamOpt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam71 = null;

		RewriteRuleSubtreeStream stream_typeParam = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeParam");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 23)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:2:
			// ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
			// typeParam )? ) | )
			int alt24 = 2;
			int LA24_0 = this.input.LA(1);

			if ((LA24_0 == LT)) {
				int LA24_1 = this.input.LA(2);

				if ((this.synpred38_TinyHaxeTry1())) {
					alt24 = 1;
				} else if ((true)) {
					alt24 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							24, 1, this.input);

					throw nvae;
				}
			} else if ((LA24_0 == EOF || LA24_0 == SEMI
					|| (LA24_0 >= COMMA && LA24_0 <= AMPEQ)
					|| (LA24_0 >= LPAREN && LA24_0 <= RPAREN)
					|| (LA24_0 >= RBRACKET && LA24_0 <= COLON) || LA24_0 == GT
					|| LA24_0 == IN || (LA24_0 >= LBRACE && LA24_0 <= RBRACE)
					|| (LA24_0 >= ELLIPSIS && LA24_0 <= PERCENT) || (LA24_0 >= EXTENDS && LA24_0 <= IMPLEMENTS))) {
				alt24 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 24, 0,
						this.input);

				throw nvae;
			}
			switch (alt24) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
				// typeParam
			{
				this.pushFollow(FOLLOW_typeParam_in_typeParamOpt1073);
				typeParam71 = this.typeParam();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParam.add(typeParam71.getTree());
				}

				// AST REWRITE
				// elements: typeParam
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 155:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
					// typeParam )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:15:
						// ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
						// typeParam )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_PARAM_OPT,
											"TYPE_PARAM_OPT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:75:
							// ( typeParam )?
							if (stream_typeParam.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeParam
										.nextTree());

							}
							stream_typeParam.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:157:9:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 23, typeParamOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeParamOpt"

	/**
	 * The Class typeConstraint_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeConstraint_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeConstraint"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:1:
	// typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^(
	// $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
	/**
	 * Type constraint.
	 * 
	 * @return the tiny haxe try1 parser.type constraint_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
		retval.start = this.input.LT(1);
		int typeConstraint_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER72 = null;
		Token COLON73 = null;
		Token LPAREN74 = null;
		Token RPAREN76 = null;
		TinyHaxeTry1Parser.typeList_return typeList75 = null;

		Object IDENTIFIER72_tree = null;
		Object COLON73_tree = null;
		Object LPAREN74_tree = null;
		Object RPAREN76_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				this.adaptor, "token COLON");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_typeList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 24)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:19:
			// ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint (
			// IDENTIFIER )? ( typeList )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:21:
			// IDENTIFIER COLON LPAREN typeList RPAREN
			{
				IDENTIFIER72 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typeConstraint1115);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER72);
				}

				COLON73 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_typeConstraint1117);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_COLON.add(COLON73);
				}

				LPAREN74 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_typeConstraint1119);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN74);
				}

				this.pushFollow(FOLLOW_typeList_in_typeConstraint1121);
				typeList75 = this.typeList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeList.add(typeList75.getTree());
				}
				RPAREN76 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_typeConstraint1123);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN76);
				}

				// AST REWRITE
				// elements: IDENTIFIER, typeConstraint, typeList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 159:61: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList
					// )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:64:
						// ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_retval.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:82:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:94:
							// ( typeList )?
							if (stream_typeList.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeList
										.nextTree());

							}
							stream_typeList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 24, typeConstraint_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeConstraint"

	/**
	 * The Class functionReturn_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class functionReturn_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "functionReturn"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:1:
	// functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
	// typeTagOpt )? ( block )? ) ;
	/**
	 * Function return.
	 * 
	 * @return the tiny haxe try1 parser.function return_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.functionReturn_return functionReturn()
			throws RecognitionException {
		TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
		retval.start = this.input.LT(1);
		int functionReturn_StartIndex = this.input.index();
		Object root_0 = null;

		Token FUNCTION78 = null;
		Token NEW79 = null;
		Token LPAREN80 = null;
		Token RPAREN82 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList77 = null;

		TinyHaxeTry1Parser.paramList_return paramList81 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt83 = null;

		TinyHaxeTry1Parser.block_return block84 = null;

		Object FUNCTION78_tree = null;
		Object NEW79_tree = null;
		Object LPAREN80_tree = null;
		Object RPAREN82_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				this.adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(
				this.adaptor, "token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				this.adaptor, "rule block");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 25)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:2:
			// ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
			// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList
			// )? ( typeTagOpt )? ( block )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:4:
			// ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
			// block
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:4:
				// ( declAttrList )?
				int alt25 = 2;
				int LA25_0 = this.input.LA(1);

				if (((LA25_0 >= PUBLIC && LA25_0 <= OVERRIDE))) {
					alt25 = 1;
				}
				switch (alt25) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					this.pushFollow(FOLLOW_declAttrList_in_functionReturn1149);
					declAttrList77 = this.declAttrList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_declAttrList.add(declAttrList77.getTree());
					}

				}
					break;

				}

				FUNCTION78 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_functionReturn1152);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION78);
				}

				NEW79 = (Token) this.match(this.input, NEW,
						FOLLOW_NEW_in_functionReturn1154);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NEW.add(NEW79);
				}

				LPAREN80 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_functionReturn1156);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN80);
				}

				this.pushFollow(FOLLOW_paramList_in_functionReturn1158);
				paramList81 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList81.getTree());
				}
				RPAREN82 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_functionReturn1160);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN82);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_functionReturn1162);
				typeTagOpt83 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt83.getTree());
				}
				this.pushFollow(FOLLOW_block_in_functionReturn1164);
				block84 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block84.getTree());
				}

				// AST REWRITE
				// elements: FUNCTION, block, paramList, typeTagOpt, NEW,
				// declAttrList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 164:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList
					// )? ( typeTagOpt )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:75:
						// ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
						// typeTagOpt )? ( block )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							this.adaptor
									.addChild(root_1, stream_NEW.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:104:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:118:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:129:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:141:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 25, functionReturn_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "functionReturn"

	/**
	 * The Class statement_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class statement_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "statement"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:167:1:
	// statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1=
	// statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE
	// $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^(
	// FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement
	// -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE
	// parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY
	// block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH
	// LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? (
	// caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW
	// expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^(
	// BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE (
	// IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON (
	// IDENTIFIER )? ( statement )? ) | SEMI );
	/**
	 * Statement.
	 * 
	 * @return the tiny haxe try1 parser.statement_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.statement_return statement()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
		retval.start = this.input.LT(1);
		int statement_StartIndex = this.input.index();
		Object root_0 = null;

		Token SEMI87 = null;
		Token IF89 = null;
		Token ELSE91 = null;
		Token FOR92 = null;
		Token LPAREN93 = null;
		Token IN94 = null;
		Token RPAREN95 = null;
		Token WHILE97 = null;
		Token DO100 = null;
		Token WHILE102 = null;
		Token SEMI104 = null;
		Token TRY105 = null;
		Token SWITCH108 = null;
		Token LPAREN109 = null;
		Token RPAREN111 = null;
		Token LBRACE112 = null;
		Token RBRACE114 = null;
		Token RETURN115 = null;
		Token SEMI117 = null;
		Token THROW118 = null;
		Token SEMI120 = null;
		Token BREAK121 = null;
		Token IDENTIFIER122 = null;
		Token SEMI123 = null;
		Token CONTINUE124 = null;
		Token IDENTIFIER125 = null;
		Token SEMI126 = null;
		Token SEMI128 = null;
		Token IDENTIFIER129 = null;
		Token COLON130 = null;
		Token SEMI132 = null;
		TinyHaxeTry1Parser.statement_return st1 = null;

		TinyHaxeTry1Parser.statement_return st2 = null;

		TinyHaxeTry1Parser.expr_return exp1 = null;

		TinyHaxeTry1Parser.expr_return exp2 = null;

		TinyHaxeTry1Parser.block_return block85 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr86 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl88 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression90 = null;

		TinyHaxeTry1Parser.statement_return statement96 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression98 = null;

		TinyHaxeTry1Parser.statement_return statement99 = null;

		TinyHaxeTry1Parser.statement_return statement101 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression103 = null;

		TinyHaxeTry1Parser.block_return block106 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList107 = null;

		TinyHaxeTry1Parser.expr_return expr110 = null;

		TinyHaxeTry1Parser.caseStmt_return caseStmt113 = null;

		TinyHaxeTry1Parser.expr_return expr116 = null;

		TinyHaxeTry1Parser.expr_return expr119 = null;

		TinyHaxeTry1Parser.expr_return expr127 = null;

		TinyHaxeTry1Parser.statement_return statement131 = null;

		Object SEMI87_tree = null;
		Object IF89_tree = null;
		Object ELSE91_tree = null;
		Object FOR92_tree = null;
		Object LPAREN93_tree = null;
		Object IN94_tree = null;
		Object RPAREN95_tree = null;
		Object WHILE97_tree = null;
		Object DO100_tree = null;
		Object WHILE102_tree = null;
		Object SEMI104_tree = null;
		Object TRY105_tree = null;
		Object SWITCH108_tree = null;
		Object LPAREN109_tree = null;
		Object RPAREN111_tree = null;
		Object LBRACE112_tree = null;
		Object RBRACE114_tree = null;
		Object RETURN115_tree = null;
		Object SEMI117_tree = null;
		Object THROW118_tree = null;
		Object SEMI120_tree = null;
		Object BREAK121_tree = null;
		Object IDENTIFIER122_tree = null;
		Object SEMI123_tree = null;
		Object CONTINUE124_tree = null;
		Object IDENTIFIER125_tree = null;
		Object SEMI126_tree = null;
		Object SEMI128_tree = null;
		Object IDENTIFIER129_tree = null;
		Object COLON130_tree = null;
		Object SEMI132_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				this.adaptor, "token COLON");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IN = new RewriteRuleTokenStream(
				this.adaptor, "token IN");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_WHILE = new RewriteRuleTokenStream(
				this.adaptor, "token WHILE");
		RewriteRuleTokenStream stream_CONTINUE = new RewriteRuleTokenStream(
				this.adaptor, "token CONTINUE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_SWITCH = new RewriteRuleTokenStream(
				this.adaptor, "token SWITCH");
		RewriteRuleTokenStream stream_ELSE = new RewriteRuleTokenStream(
				this.adaptor, "token ELSE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token LBRACE");
		RewriteRuleTokenStream stream_RETURN = new RewriteRuleTokenStream(
				this.adaptor, "token RETURN");
		RewriteRuleTokenStream stream_FOR = new RewriteRuleTokenStream(
				this.adaptor, "token FOR");
		RewriteRuleTokenStream stream_DO = new RewriteRuleTokenStream(
				this.adaptor, "token DO");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				this.adaptor, "token SEMI");
		RewriteRuleTokenStream stream_BREAK = new RewriteRuleTokenStream(
				this.adaptor, "token BREAK");
		RewriteRuleTokenStream stream_THROW = new RewriteRuleTokenStream(
				this.adaptor, "token THROW");
		RewriteRuleTokenStream stream_TRY = new RewriteRuleTokenStream(
				this.adaptor, "token TRY");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleTokenStream stream_IF = new RewriteRuleTokenStream(
				this.adaptor, "token IF");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				this.adaptor, "rule statement");
		RewriteRuleSubtreeStream stream_parExpression = new RewriteRuleSubtreeStream(
				this.adaptor, "rule parExpression");
		RewriteRuleSubtreeStream stream_caseStmt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule caseStmt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				this.adaptor, "rule block");
		RewriteRuleSubtreeStream stream_catchStmtList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule catchStmtList");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expr");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 26)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:2:
			// ( block | assignExpr SEMI | varDecl | IF parExpression st1=
			// statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 (
			// ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN
			// statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE
			// parExpression statement -> ^( WHILE ( parExpression )? (
			// statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO (
			// parExpression )? ( statement )? ) | TRY block catchStmtList -> ^(
			// TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN
			// LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+
			// ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr
			// SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^(
			// BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^(
			// CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON
			// statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI )
			int alt31 = 16;
			alt31 = this.dfa31.predict(this.input);
			switch (alt31) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
				// block
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_block_in_statement1201);
				block85 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, block85.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
				// assignExpr SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_assignExpr_in_statement1206);
				assignExpr86 = this.assignExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, assignExpr86.getTree());
				}
				SEMI87 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1208);
				if (this.state.failed) {
					return retval;
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:170:4:
				// varDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDecl_in_statement1214);
				varDecl88 = this.varDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDecl88.getTree());
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:4:
				// IF parExpression st1= statement ( ELSE st2= statement )?
			{
				IF89 = (Token) this.match(this.input, IF,
						FOLLOW_IF_in_statement1219);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IF.add(IF89);
				}

				this.pushFollow(FOLLOW_parExpression_in_statement1221);
				parExpression90 = this.parExpression();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_parExpression.add(parExpression90.getTree());
				}
				this.pushFollow(FOLLOW_statement_in_statement1225);
				st1 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(st1.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:35:
				// ( ELSE st2= statement )?
				int alt26 = 2;
				int LA26_0 = this.input.LA(1);

				if ((LA26_0 == ELSE)) {
					int LA26_1 = this.input.LA(2);

					if ((this.synpred43_TinyHaxeTry1())) {
						alt26 = 1;
					}
				}
				switch (alt26) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
					// ELSE st2= statement
				{
					ELSE91 = (Token) this.match(this.input, ELSE,
							FOLLOW_ELSE_in_statement1228);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_ELSE.add(ELSE91);
					}

					this.pushFollow(FOLLOW_statement_in_statement1232);
					st2 = this.statement();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_statement.add(st2.getTree());
					}

				}
					break;

				}

				// AST REWRITE
				// elements: st1, parExpression, IF, ELSE, st2
				// token labels:
				// rule labels: retval, st1, st2
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_st1 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule st1", st1 != null ? st1.tree
									: null);
					RewriteRuleSubtreeStream stream_st2 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule st2", st2 != null ? st2.tree
									: null);

					root_0 = (Object) this.adaptor.nil();
					// 171:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:61:
						// ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new IfNode(stream_IF.nextToken()), root_1);

							this.adaptor.addChild(root_1, stream_parExpression
									.nextTree());
							this.adaptor
									.addChild(root_1, stream_st1.nextTree());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:93:
							// ( ^( ELSE $st2) )?
							if (stream_ELSE.hasNext() || stream_st2.hasNext()) {
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:93:
								// ^( ELSE $st2)
								{
									Object root_2 = (Object) this.adaptor.nil();
									root_2 = (Object) this.adaptor.becomeRoot(
											stream_ELSE.nextNode(), root_2);

									this.adaptor.addChild(root_2, stream_st2
											.nextTree());

									this.adaptor.addChild(root_1, root_2);
								}

							}
							stream_ELSE.reset();
							stream_st2.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:4:
				// FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
			{
				FOR92 = (Token) this.match(this.input, FOR,
						FOLLOW_FOR_in_statement1272);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FOR.add(FOR92);
				}

				LPAREN93 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_statement1274);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN93);
				}

				this.pushFollow(FOLLOW_expr_in_statement1278);
				exp1 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(exp1.getTree());
				}
				IN94 = (Token) this.match(this.input, IN,
						FOLLOW_IN_in_statement1280);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IN.add(IN94);
				}

				this.pushFollow(FOLLOW_expr_in_statement1284);
				exp2 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(exp2.getTree());
				}
				RPAREN95 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_statement1286);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN95);
				}

				this.pushFollow(FOLLOW_statement_in_statement1288);
				statement96 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement96.getTree());
				}

				// AST REWRITE
				// elements: FOR, IN, exp1, statement, exp2
				// token labels:
				// rule labels: retval, exp2, exp1
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_exp2 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule exp2", exp2 != null ? exp2.tree
									: null);
					RewriteRuleSubtreeStream stream_exp1 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule exp1", exp1 != null ? exp1.tree
									: null);

					root_0 = (Object) this.adaptor.nil();
					// 172:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:59:
						// ^( FOR ^( IN $exp1 $exp2) ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor
									.becomeRoot(new ForNode(stream_FOR
											.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:74:
							// ^( IN $exp1 $exp2)
							{
								Object root_2 = (Object) this.adaptor.nil();
								root_2 = (Object) this.adaptor.becomeRoot(
										stream_IN.nextNode(), root_2);

								this.adaptor.addChild(root_2, stream_exp1
										.nextTree());
								this.adaptor.addChild(root_2, stream_exp2
										.nextTree());

								this.adaptor.addChild(root_1, root_2);
							}
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:92:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:4:
				// WHILE parExpression statement
			{
				WHILE97 = (Token) this.match(this.input, WHILE,
						FOLLOW_WHILE_in_statement1316);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_WHILE.add(WHILE97);
				}

				this.pushFollow(FOLLOW_parExpression_in_statement1318);
				parExpression98 = this.parExpression();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_parExpression.add(parExpression98.getTree());
				}
				this.pushFollow(FOLLOW_statement_in_statement1320);
				statement99 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement99.getTree());
				}

				// AST REWRITE
				// elements: WHILE, statement, parExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 173:38: -> ^( WHILE ( parExpression )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:41:
						// ^( WHILE ( parExpression )? ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new WhileNode(stream_WHILE.nextToken()),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:60:
							// ( parExpression )?
							if (stream_parExpression.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_parExpression.nextTree());

							}
							stream_parExpression.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:75:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:4:
				// DO statement WHILE parExpression SEMI
			{
				DO100 = (Token) this.match(this.input, DO,
						FOLLOW_DO_in_statement1344);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DO.add(DO100);
				}

				this.pushFollow(FOLLOW_statement_in_statement1346);
				statement101 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement101.getTree());
				}
				WHILE102 = (Token) this.match(this.input, WHILE,
						FOLLOW_WHILE_in_statement1348);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_WHILE.add(WHILE102);
				}

				this.pushFollow(FOLLOW_parExpression_in_statement1350);
				parExpression103 = this.parExpression();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_parExpression.add(parExpression103.getTree());
				}
				SEMI104 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1352);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI104);
				}

				// AST REWRITE
				// elements: DO, statement, parExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 174:45: -> ^( DO ( parExpression )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:48:
						// ^( DO ( parExpression )? ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new DoWhileNode(stream_DO.nextToken()),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:66:
							// ( parExpression )?
							if (stream_parExpression.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_parExpression.nextTree());

							}
							stream_parExpression.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:81:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 8:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:4:
				// TRY block catchStmtList
			{
				TRY105 = (Token) this.match(this.input, TRY,
						FOLLOW_TRY_in_statement1375);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_TRY.add(TRY105);
				}

				this.pushFollow(FOLLOW_block_in_statement1377);
				block106 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block106.getTree());
				}
				this.pushFollow(FOLLOW_catchStmtList_in_statement1379);
				catchStmtList107 = this.catchStmtList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_catchStmtList.add(catchStmtList107.getTree());
				}

				// AST REWRITE
				// elements: catchStmtList, block, TRY
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 175:32: -> ^( TRY ( block )? ( catchStmtList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:35:
						// ^( TRY ( block )? ( catchStmtList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor
									.becomeRoot(new TryNode(stream_TRY
											.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:50:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:57:
							// ( catchStmtList )?
							if (stream_catchStmtList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_catchStmtList.nextTree());

							}
							stream_catchStmtList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 9:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:4:
				// SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
			{
				SWITCH108 = (Token) this.match(this.input, SWITCH,
						FOLLOW_SWITCH_in_statement1403);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SWITCH.add(SWITCH108);
				}

				LPAREN109 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_statement1405);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN109);
				}

				this.pushFollow(FOLLOW_expr_in_statement1407);
				expr110 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(expr110.getTree());
				}
				RPAREN111 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_statement1409);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN111);
				}

				LBRACE112 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_statement1411);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LBRACE.add(LBRACE112);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:37:
				// ( caseStmt )+
				int cnt27 = 0;
				loop27: do {
					int alt27 = 2;
					int LA27_0 = this.input.LA(1);

					if (((LA27_0 >= CASE && LA27_0 <= DEFAULT))) {
						alt27 = 1;
					}

					switch (alt27) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
						// caseStmt
					{
						this.pushFollow(FOLLOW_caseStmt_in_statement1413);
						caseStmt113 = this.caseStmt();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_caseStmt.add(caseStmt113.getTree());
						}

					}
						break;

					default:
						if (cnt27 >= 1) {
							break loop27;
						}
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(27,
								this.input);
						throw eee;
					}
					cnt27++;
				} while (true);

				RBRACE114 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_statement1416);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RBRACE.add(RBRACE114);
				}

				// AST REWRITE
				// elements: expr, SWITCH, caseStmt
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 176:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:58:
						// ^( SWITCH ( expr )? ( caseStmt )+ )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new SwitchNode(stream_SWITCH.nextToken()),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:79:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();
							if (!(stream_caseStmt.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_caseStmt.hasNext()) {
								this.adaptor.addChild(root_1, stream_caseStmt
										.nextTree());

							}
							stream_caseStmt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 10:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:4:
				// RETURN ( expr )? SEMI
			{
				RETURN115 = (Token) this.match(this.input, RETURN,
						FOLLOW_RETURN_in_statement1437);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RETURN.add(RETURN115);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:11:
				// ( expr )?
				int alt28 = 2;
				int LA28_0 = this.input.LA(1);

				if ((LA28_0 == IDENTIFIER
						|| (LA28_0 >= QUES && LA28_0 <= LPAREN)
						|| LA28_0 == LBRACKET || (LA28_0 >= LT && LA28_0 <= GT)
						|| LA28_0 == NEW || LA28_0 == LBRACE
						|| (LA28_0 >= ELLIPSIS && LA28_0 <= CAST) || (LA28_0 >= LONGLITERAL && LA28_0 <= FALSE))) {
					alt28 = 1;
				} else if ((LA28_0 == SEMI)) {
					int LA28_2 = this.input.LA(2);

					if ((this.synpred51_TinyHaxeTry1())) {
						alt28 = 1;
					}
				}
				switch (alt28) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
					// expr
				{
					this.pushFollow(FOLLOW_expr_in_statement1440);
					expr116 = this.expr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_expr.add(expr116.getTree());
					}

				}
					break;

				}

				SEMI117 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1444);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI117);
				}

				// AST REWRITE
				// elements: expr, RETURN
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 177:28: -> ^( RETURN ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:31:
						// ^( RETURN ( expr )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_RETURN.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:40:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 11:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:4:
				// THROW expr SEMI
			{
				THROW118 = (Token) this.match(this.input, THROW,
						FOLLOW_THROW_in_statement1462);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_THROW.add(THROW118);
				}

				this.pushFollow(FOLLOW_expr_in_statement1464);
				expr119 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(expr119.getTree());
				}
				SEMI120 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1466);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI120);
				}

				// AST REWRITE
				// elements: expr, THROW
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 178:25: -> ^( THROW ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:28:
						// ^( THROW ( expr )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_THROW.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:36:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 12:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:4:
				// BREAK ( IDENTIFIER )? SEMI
			{
				BREAK121 = (Token) this.match(this.input, BREAK,
						FOLLOW_BREAK_in_statement1485);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_BREAK.add(BREAK121);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:10:
				// ( IDENTIFIER )?
				int alt29 = 2;
				int LA29_0 = this.input.LA(1);

				if ((LA29_0 == IDENTIFIER)) {
					alt29 = 1;
				}
				switch (alt29) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:11:
					// IDENTIFIER
				{
					IDENTIFIER122 = (Token) this.match(this.input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1488);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_IDENTIFIER.add(IDENTIFIER122);
					}

				}
					break;

				}

				SEMI123 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1492);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI123);
				}

				// AST REWRITE
				// elements: IDENTIFIER, BREAK
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 179:32: -> ^( BREAK ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:35:
						// ^( BREAK ( IDENTIFIER )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_BREAK.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:43:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 13:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:4:
				// CONTINUE ( IDENTIFIER )? SEMI
			{
				CONTINUE124 = (Token) this.match(this.input, CONTINUE,
						FOLLOW_CONTINUE_in_statement1509);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CONTINUE.add(CONTINUE124);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:13:
				// ( IDENTIFIER )?
				int alt30 = 2;
				int LA30_0 = this.input.LA(1);

				if ((LA30_0 == IDENTIFIER)) {
					alt30 = 1;
				}
				switch (alt30) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:14:
					// IDENTIFIER
				{
					IDENTIFIER125 = (Token) this.match(this.input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1512);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_IDENTIFIER.add(IDENTIFIER125);
					}

				}
					break;

				}

				SEMI126 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1516);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI126);
				}

				// AST REWRITE
				// elements: CONTINUE, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 180:36: -> ^( CONTINUE ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:39:
						// ^( CONTINUE ( IDENTIFIER )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_CONTINUE.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:50:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 14:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
				// expr SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_expr_in_statement1534);
				expr127 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, expr127.getTree());
				}
				SEMI128 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1537);
				if (this.state.failed) {
					return retval;
				}

			}
				break;
			case 15:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
				// IDENTIFIER COLON statement
			{
				IDENTIFIER129 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_statement1543);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER129);
				}

				COLON130 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_statement1545);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_COLON.add(COLON130);
				}

				this.pushFollow(FOLLOW_statement_in_statement1547);
				statement131 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement131.getTree());
				}

				// AST REWRITE
				// elements: statement, COLON, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 182:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:38:
						// ^( COLON ( IDENTIFIER )? ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_COLON.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:46:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:58:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 16:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:183:4:
				// SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				SEMI132 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_statement1568);
				if (this.state.failed) {
					return retval;
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 26, statement_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "statement"

	/**
	 * The Class parExpression_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class parExpression_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "parExpression"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:1:
	// parExpression : LPAREN expr RPAREN ;
	/**
	 * Par expression.
	 * 
	 * @return the tiny haxe try1 parser.par expression_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.parExpression_return parExpression()
			throws RecognitionException {
		TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
		retval.start = this.input.LT(1);
		int parExpression_StartIndex = this.input.index();
		Object root_0 = null;

		Token LPAREN133 = null;
		Token RPAREN135 = null;
		TinyHaxeTry1Parser.expr_return expr134 = null;

		Object LPAREN133_tree = null;
		Object RPAREN135_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 27)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:187:5:
			// ( LPAREN expr RPAREN )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:187:9:
			// LPAREN expr RPAREN
			{
				root_0 = (Object) this.adaptor.nil();

				LPAREN133 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_parExpression1589);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_expr_in_parExpression1592);
				expr134 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, expr134.getTree());
				}
				RPAREN135 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_parExpression1594);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 27, parExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "parExpression"

	/**
	 * The Class block_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class block_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "block"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:1:
	// block : ( LBRACE ( blockStmt )* RBRACE -> ^(
	// BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] ( blockStmt )* RBRACE ) | SEMI
	// );
	/**
	 * Block.
	 * 
	 * @return the tiny haxe try1 parser.block_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.block_return block()
			throws RecognitionException {
		TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
		retval.start = this.input.LT(1);
		int block_StartIndex = this.input.index();
		Object root_0 = null;

		Token LBRACE136 = null;
		Token RBRACE138 = null;
		Token SEMI139 = null;
		TinyHaxeTry1Parser.blockStmt_return blockStmt137 = null;

		Object LBRACE136_tree = null;
		Object RBRACE138_tree = null;
		Object SEMI139_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_blockStmt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule blockStmt");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 28)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:8:
			// ( LBRACE ( blockStmt )* RBRACE -> ^(
			// BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] ( blockStmt )* RBRACE )
			// | SEMI )
			int alt33 = 2;
			int LA33_0 = this.input.LA(1);

			if ((LA33_0 == LBRACE)) {
				alt33 = 1;
			} else if ((LA33_0 == SEMI)) {
				alt33 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 33, 0,
						this.input);

				throw nvae;
			}
			switch (alt33) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:10:
				// LBRACE ( blockStmt )* RBRACE
			{
				LBRACE136 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_block1609);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LBRACE.add(LBRACE136);
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:17:
				// ( blockStmt )*
				loop32: do {
					int alt32 = 2;
					int LA32_0 = this.input.LA(1);

					if (((LA32_0 >= SEMI && LA32_0 <= IDENTIFIER)
							|| (LA32_0 >= PUBLIC && LA32_0 <= OVERRIDE)
							|| (LA32_0 >= QUES && LA32_0 <= LPAREN)
							|| LA32_0 == LBRACKET
							|| (LA32_0 >= LT && LA32_0 <= GT)
							|| (LA32_0 >= NEW && LA32_0 <= IF) || LA32_0 == FOR
							|| (LA32_0 >= WHILE && LA32_0 <= LBRACE)
							|| (LA32_0 >= RETURN && LA32_0 <= CONTINUE)
							|| (LA32_0 >= ELLIPSIS && LA32_0 <= CAST)
							|| (LA32_0 >= VAR && LA32_0 <= CLASS) || (LA32_0 >= LONGLITERAL && LA32_0 <= FALSE))) {
						alt32 = 1;
					}

					switch (alt32) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:18:
						// blockStmt
					{
						this.pushFollow(FOLLOW_blockStmt_in_block1612);
						blockStmt137 = this.blockStmt();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							stream_blockStmt.add(blockStmt137.getTree());
						}

					}
						break;

					default:
						break loop32;
					}
				} while (true);

				RBRACE138 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_block1616);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RBRACE.add(RBRACE138);
				}

				// AST REWRITE
				// elements: RBRACE, blockStmt
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 190:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] (
					// blockStmt )* RBRACE )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:39:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] (
						// blockStmt )* RBRACE )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true, LBRACE136),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:97:
							// ( blockStmt )*
							while (stream_blockStmt.hasNext()) {
								this.adaptor.addChild(root_1, stream_blockStmt
										.nextTree());

							}
							stream_blockStmt.reset();

							if (stream_RBRACE.nextNode() instanceof ExtendedCommonTree) {
								ExtendedCommonTree rBracket = (ExtendedCommonTree) stream_RBRACE
										.nextNode();
								if (rBracket.getText().equals("}")) {
									((BlockScopeNode) root_1)
											.setrBracketPosition(((CommonToken) rBracket
													.getToken())
													.getStartIndex());
								}
							}
							// adaptor.addChild(root_1,
							// stream_RBRACE.nextNode());

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:191:4:
				// SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				SEMI139 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_block1636);
				if (this.state.failed) {
					return retval;
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 28, block_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "block"

	/**
	 * The Class blockStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class blockStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "blockStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:194:1:
	// blockStmt : ( varDecl | classDecl | statement );
	/**
	 * Block stmt.
	 * 
	 * @return the tiny haxe try1 parser.block stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.blockStmt_return blockStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
		retval.start = this.input.LT(1);
		int blockStmt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl140 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl141 = null;

		TinyHaxeTry1Parser.statement_return statement142 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 29)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:2:
			// ( varDecl | classDecl | statement )
			int alt34 = 3;
			alt34 = this.dfa34.predict(this.input);
			switch (alt34) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
				// varDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDecl_in_blockStmt1649);
				varDecl140 = this.varDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDecl140.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:196:4:
				// classDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_classDecl_in_blockStmt1654);
				classDecl141 = this.classDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, classDecl141.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:197:4:
				// statement
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_statement_in_blockStmt1659);
				statement142 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, statement142.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 29, blockStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "blockStmt"

	/**
	 * The Class breakStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class breakStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "breakStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:201:1:
	// breakStmt : BREAK SEMI ;
	/**
	 * Break stmt.
	 * 
	 * @return the tiny haxe try1 parser.break stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.breakStmt_return breakStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
		retval.start = this.input.LT(1);
		int breakStmt_StartIndex = this.input.index();
		Object root_0 = null;

		Token BREAK143 = null;
		Token SEMI144 = null;

		Object BREAK143_tree = null;
		Object SEMI144_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 30)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:2:
			// ( BREAK SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:4:
			// BREAK SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				BREAK143 = (Token) this.match(this.input, BREAK,
						FOLLOW_BREAK_in_breakStmt1692);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					BREAK143_tree = (Object) this.adaptor.create(BREAK143);
					this.adaptor.addChild(root_0, BREAK143_tree);
				}
				SEMI144 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_breakStmt1694);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 30, breakStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "breakStmt"

	/**
	 * The Class continueStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class continueStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "continueStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:205:1:
	// continueStmt : CONTINUE SEMI ;
	/**
	 * Continue stmt.
	 * 
	 * @return the tiny haxe try1 parser.continue stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.continueStmt_return continueStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
		retval.start = this.input.LT(1);
		int continueStmt_StartIndex = this.input.index();
		Object root_0 = null;

		Token CONTINUE145 = null;
		Token SEMI146 = null;

		Object CONTINUE145_tree = null;
		Object SEMI146_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 31)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:2:
			// ( CONTINUE SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:4:
			// CONTINUE SEMI
			{
				root_0 = (Object) this.adaptor.nil();

				CONTINUE145 = (Token) this.match(this.input, CONTINUE,
						FOLLOW_CONTINUE_in_continueStmt1713);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					CONTINUE145_tree = (Object) this.adaptor
							.create(CONTINUE145);
					this.adaptor.addChild(root_0, CONTINUE145_tree);
				}
				SEMI146 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_continueStmt1715);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 31, continueStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "continueStmt"

	/**
	 * The Class caseStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class caseStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "caseStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:1:
	// caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? (
	// statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? )
	// );
	/**
	 * Case stmt.
	 * 
	 * @return the tiny haxe try1 parser.case stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.caseStmt_return caseStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
		retval.start = this.input.LT(1);
		int caseStmt_StartIndex = this.input.index();
		Object root_0 = null;

		Token CASE147 = null;
		Token COLON149 = null;
		Token DEFAULT151 = null;
		Token COLON152 = null;
		TinyHaxeTry1Parser.exprList_return exprList148 = null;

		TinyHaxeTry1Parser.statement_return statement150 = null;

		TinyHaxeTry1Parser.statement_return statement153 = null;

		Object CASE147_tree = null;
		Object COLON149_tree = null;
		Object DEFAULT151_tree = null;
		Object COLON152_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				this.adaptor, "token COLON");
		RewriteRuleTokenStream stream_DEFAULT = new RewriteRuleTokenStream(
				this.adaptor, "token DEFAULT");
		RewriteRuleTokenStream stream_CASE = new RewriteRuleTokenStream(
				this.adaptor, "token CASE");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				this.adaptor, "rule statement");
		RewriteRuleSubtreeStream stream_exprList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule exprList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 32)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:9:
			// ( CASE exprList COLON statement -> ^( CASE ( exprList )? (
			// statement )? ) | DEFAULT COLON statement -> ^( DEFAULT (
			// statement )? ) )
			int alt35 = 2;
			int LA35_0 = this.input.LA(1);

			if ((LA35_0 == CASE)) {
				alt35 = 1;
			} else if ((LA35_0 == DEFAULT)) {
				alt35 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 35, 0,
						this.input);

				throw nvae;
			}
			switch (alt35) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:11:
				// CASE exprList COLON statement
			{
				CASE147 = (Token) this.match(this.input, CASE,
						FOLLOW_CASE_in_caseStmt1726);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CASE.add(CASE147);
				}

				this.pushFollow(FOLLOW_exprList_in_caseStmt1728);
				exprList148 = this.exprList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_exprList.add(exprList148.getTree());
				}
				COLON149 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_caseStmt1730);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_COLON.add(COLON149);
				}

				this.pushFollow(FOLLOW_statement_in_caseStmt1732);
				statement150 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement150.getTree());
				}

				// AST REWRITE
				// elements: statement, CASE, exprList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 209:42: -> ^( CASE ( exprList )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:45:
						// ^( CASE ( exprList )? ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_CASE.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:52:
							// ( exprList )?
							if (stream_exprList.hasNext()) {
								this.adaptor.addChild(root_1, stream_exprList
										.nextTree());

							}
							stream_exprList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:62:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:4:
				// DEFAULT COLON statement
			{
				DEFAULT151 = (Token) this.match(this.input, DEFAULT,
						FOLLOW_DEFAULT_in_caseStmt1750);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_DEFAULT.add(DEFAULT151);
				}

				COLON152 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_caseStmt1752);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_COLON.add(COLON152);
				}

				this.pushFollow(FOLLOW_statement_in_caseStmt1754);
				statement153 = this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_statement.add(statement153.getTree());
				}

				// AST REWRITE
				// elements: statement, DEFAULT
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 210:29: -> ^( DEFAULT ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:32:
						// ^( DEFAULT ( statement )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_DEFAULT.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:42:
							// ( statement )?
							if (stream_statement.hasNext()) {
								this.adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 32, caseStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "caseStmt"

	/**
	 * The Class defaultStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class defaultStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "defaultStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:213:1:
	// defaultStmt : DEFAULT COLON ;
	/**
	 * Default stmt.
	 * 
	 * @return the tiny haxe try1 parser.default stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
		retval.start = this.input.LT(1);
		int defaultStmt_StartIndex = this.input.index();
		Object root_0 = null;

		Token DEFAULT154 = null;
		Token COLON155 = null;

		Object DEFAULT154_tree = null;
		Object COLON155_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 33)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:9:
			// ( DEFAULT COLON )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:11:
			// DEFAULT COLON
			{
				root_0 = (Object) this.adaptor.nil();

				DEFAULT154 = (Token) this.match(this.input, DEFAULT,
						FOLLOW_DEFAULT_in_defaultStmt1783);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					DEFAULT154_tree = (Object) this.adaptor.create(DEFAULT154);
					this.adaptor.addChild(root_0, DEFAULT154_tree);
				}
				COLON155 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_defaultStmt1785);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 33, defaultStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "defaultStmt"

	/**
	 * The Class catchStmtList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class catchStmtList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "catchStmtList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:1:
	// catchStmtList : ( catchStmt catchStmtList | );
	/**
	 * Catch stmt list.
	 * 
	 * @return the tiny haxe try1 parser.catch stmt list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
		retval.start = this.input.LT(1);
		int catchStmtList_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.catchStmt_return catchStmt156 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList157 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 34)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:218:2:
			// ( catchStmt catchStmtList | )
			int alt36 = 2;
			int LA36_0 = this.input.LA(1);

			if ((LA36_0 == CATCH)) {
				alt36 = 1;
			} else if ((LA36_0 == EOF
					|| (LA36_0 >= SEMI && LA36_0 <= IDENTIFIER)
					|| (LA36_0 >= PUBLIC && LA36_0 <= COLON)
					|| (LA36_0 >= LT && LA36_0 <= GT)
					|| (LA36_0 >= NEW && LA36_0 <= DEFAULT)
					|| (LA36_0 >= ELLIPSIS && LA36_0 <= CAST)
					|| (LA36_0 >= VAR && LA36_0 <= CLASS)
					|| (LA36_0 >= EXTENDS && LA36_0 <= IMPLEMENTS) || (LA36_0 >= LONGLITERAL && LA36_0 <= FALSE))) {
				alt36 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 36, 0,
						this.input);

				throw nvae;
			}
			switch (alt36) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:218:4:
				// catchStmt catchStmtList
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_catchStmt_in_catchStmtList1798);
				catchStmt156 = this.catchStmt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, catchStmt156.getTree());
				}
				this.pushFollow(FOLLOW_catchStmtList_in_catchStmtList1800);
				catchStmtList157 = this.catchStmtList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, catchStmtList157.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:220:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 34, catchStmtList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "catchStmtList"

	/**
	 * The Class catchStmt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class catchStmt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "catchStmt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:1:
	// catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? (
	// block )? ) ;
	/**
	 * Catch stmt.
	 * 
	 * @return the tiny haxe try1 parser.catch stmt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.catchStmt_return catchStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
		retval.start = this.input.LT(1);
		int catchStmt_StartIndex = this.input.index();
		Object root_0 = null;

		Token CATCH158 = null;
		Token LPAREN159 = null;
		Token RPAREN161 = null;
		TinyHaxeTry1Parser.param_return param160 = null;

		TinyHaxeTry1Parser.block_return block162 = null;

		Object CATCH158_tree = null;
		Object LPAREN159_tree = null;
		Object RPAREN161_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_CATCH = new RewriteRuleTokenStream(
				this.adaptor, "token CATCH");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_param = new RewriteRuleSubtreeStream(
				this.adaptor, "rule param");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				this.adaptor, "rule block");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 35)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:9:
			// ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block
			// )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:11:
			// CATCH LPAREN param RPAREN block
			{
				CATCH158 = (Token) this.match(this.input, CATCH,
						FOLLOW_CATCH_in_catchStmt1829);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CATCH.add(CATCH158);
				}

				LPAREN159 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_catchStmt1831);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN159);
				}

				this.pushFollow(FOLLOW_param_in_catchStmt1833);
				param160 = this.param();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_param.add(param160.getTree());
				}
				RPAREN161 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_catchStmt1835);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN161);
				}

				this.pushFollow(FOLLOW_block_in_catchStmt1837);
				block162 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block162.getTree());
				}

				// AST REWRITE
				// elements: block, param, CATCH
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 223:43: -> ^( CATCH ( param )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:46:
						// ^( CATCH ( param )? ( block )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_CATCH.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:54:
							// ( param )?
							if (stream_param.hasNext()) {
								this.adaptor.addChild(root_1, stream_param
										.nextTree());

							}
							stream_param.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:61:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 35, catchStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "catchStmt"

	/**
	 * The Class exprListOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class exprListOpt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "exprListOpt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:228:1:
	// exprListOpt : ( exprList | );
	/**
	 * Expr list opt.
	 * 
	 * @return the tiny haxe try1 parser.expr list opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
		retval.start = this.input.LT(1);
		int exprListOpt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.exprList_return exprList163 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 36)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:2:
			// ( exprList | )
			int alt37 = 2;
			switch (this.input.LA(1)) {
			case IDENTIFIER:
			case COMMA:
			case QUES:
			case EQ:
			case PLUSEQ:
			case SUBEQ:
			case SLASHEQ:
			case PERCENTEQ:
			case AMPEQ:
			case FUNCTION:
			case LPAREN:
			case LBRACKET:
			case LT:
			case GT:
			case NEW:
			case LBRACE:
			case ELLIPSIS:
			case BARBAR:
			case AMPAMP:
			case EQEQ:
			case BANGEQ:
			case GTEQ:
			case LTEQ:
			case BAR:
			case AMP:
			case CARET:
			case LTLT:
			case GTGTGT:
			case PLUS:
			case SUB:
			case STAR:
			case SLASH:
			case PERCENT:
			case SUBSUB:
			case PLUSPLUS:
			case BANG:
			case TILDE:
			case NULL:
			case CAST:
			case LONGLITERAL:
			case INTLITERAL:
			case STRINGLITERAL:
			case CHARLITERAL:
			case FLOATNUM:
			case TRUE:
			case FALSE: {
				alt37 = 1;
			}
				break;
			case RBRACKET: {
				int LA37_2 = this.input.LA(2);

				if ((this.synpred66_TinyHaxeTry1())) {
					alt37 = 1;
				} else if ((true)) {
					alt37 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							37, 2, this.input);

					throw nvae;
				}
			}
				break;
			case RPAREN: {
				int LA37_3 = this.input.LA(2);

				if ((this.synpred66_TinyHaxeTry1())) {
					alt37 = 1;
				} else if ((true)) {
					alt37 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							37, 3, this.input);

					throw nvae;
				}
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 37, 0,
						this.input);

				throw nvae;
			}

			switch (alt37) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
				// exprList
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_exprList_in_exprListOpt1863);
				exprList163 = this.exprList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, exprList163.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:231:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 36, exprListOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "exprListOpt"

	/**
	 * The Class exprList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class exprList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "exprList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:1:
	// exprList : expr ( COMMA expr )* ;
	/**
	 * Expr list.
	 * 
	 * @return the tiny haxe try1 parser.expr list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.exprList_return exprList()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
		retval.start = this.input.LT(1);
		int exprList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA165 = null;
		TinyHaxeTry1Parser.expr_return expr164 = null;

		TinyHaxeTry1Parser.expr_return expr166 = null;

		Object COMMA165_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 37)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:9:
			// ( expr ( COMMA expr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:11:
			// expr ( COMMA expr )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_expr_in_exprList1883);
				expr164 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, expr164.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:16:
				// ( COMMA expr )*
				loop38: do {
					int alt38 = 2;
					int LA38_0 = this.input.LA(1);

					if ((LA38_0 == COMMA)) {
						alt38 = 1;
					}

					switch (alt38) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:17:
						// COMMA expr
					{
						COMMA165 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_exprList1886);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_expr_in_exprList1889);
						expr166 = this.expr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, expr166.getTree());
						}

					}
						break;

					default:
						break loop38;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 37, exprList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "exprList"

	/**
	 * The Class expr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class expr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "expr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:1:
	// expr : assignExpr ;
	/**
	 * Expr.
	 * 
	 * @return the tiny haxe try1 parser.expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.expr_return expr()
			throws RecognitionException {
		TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
		retval.start = this.input.LT(1);
		int expr_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr167 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 38)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:6:
			// ( assignExpr )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:8:
			// assignExpr
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_assignExpr_in_expr1902);
				assignExpr167 = this.assignExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, assignExpr167.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 38, expr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "expr"

	/**
	 * The Class assignExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class assignExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "assignExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:239:1:
	// assignExpr : iterExpr ( assignOp iterExpr )* ;
	/**
	 * Assign expr.
	 * 
	 * @return the tiny haxe try1 parser.assign expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.assignExpr_return assignExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
		retval.start = this.input.LT(1);
		int assignExpr_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr168 = null;

		TinyHaxeTry1Parser.assignOp_return assignOp169 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr170 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 39)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:9:
			// ( iterExpr ( assignOp iterExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:12:
			// iterExpr ( assignOp iterExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_iterExpr_in_assignExpr1922);
				iterExpr168 = this.iterExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, iterExpr168.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:21:
				// ( assignOp iterExpr )*
				loop39: do {
					int alt39 = 2;
					int LA39_0 = this.input.LA(1);

					if (((LA39_0 >= EQ && LA39_0 <= AMPEQ))) {
						alt39 = 1;
					}

					switch (alt39) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:22:
						// assignOp iterExpr
					{
						this.pushFollow(FOLLOW_assignOp_in_assignExpr1925);
						assignOp169 = this.assignOp();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							root_0 = (Object) this.adaptor.becomeRoot(
									assignOp169.getTree(), root_0);
						}
						this.pushFollow(FOLLOW_iterExpr_in_assignExpr1928);
						iterExpr170 = this.iterExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor
									.addChild(root_0, iterExpr170.getTree());
						}

					}
						break;

					default:
						break loop39;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 39, assignExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "assignExpr"

	/**
	 * The Class ternaryExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class ternaryExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "ternaryExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:244:1:
	// ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
	/**
	 * Ternary expr.
	 * 
	 * @return the tiny haxe try1 parser.ternary expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
		retval.start = this.input.LT(1);
		int ternaryExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token QUES172 = null;
		Token COLON174 = null;
		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr171 = null;

		TinyHaxeTry1Parser.expr_return expr173 = null;

		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr175 = null;

		Object QUES172_tree = null;
		Object COLON174_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 40)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:2:
			// ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:4:
			// logicOrExpr ( QUES expr COLON logicOrExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1951);
				logicOrExpr171 = this.logicOrExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, logicOrExpr171.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:16:
				// ( QUES expr COLON logicOrExpr )*
				loop40: do {
					int alt40 = 2;
					int LA40_0 = this.input.LA(1);

					if ((LA40_0 == QUES)) {
						alt40 = 1;
					}

					switch (alt40) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:17:
						// QUES expr COLON logicOrExpr
					{
						QUES172 = (Token) this.match(this.input, QUES,
								FOLLOW_QUES_in_ternaryExpr1954);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							QUES172_tree = (Object) this.adaptor
									.create(QUES172);
							root_0 = (Object) this.adaptor.becomeRoot(
									QUES172_tree, root_0);
						}
						this.pushFollow(FOLLOW_expr_in_ternaryExpr1957);
						expr173 = this.expr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, expr173.getTree());
						}
						COLON174 = (Token) this.match(this.input, COLON,
								FOLLOW_COLON_in_ternaryExpr1959);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr1962);
						logicOrExpr175 = this.logicOrExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, logicOrExpr175
									.getTree());
						}

					}
						break;

					default:
						break loop40;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 40, ternaryExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ternaryExpr"

	/**
	 * The Class iterExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class iterExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "iterExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:1:
	// iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
	/**
	 * Iter expr.
	 * 
	 * @return the tiny haxe try1 parser.iter expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.iterExpr_return iterExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
		retval.start = this.input.LT(1);
		int iterExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token ELLIPSIS177 = null;
		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr176 = null;

		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr178 = null;

		Object ELLIPSIS177_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 41)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:9:
			// ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:11:
			// ternaryExpr ( ELLIPSIS ternaryExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_ternaryExpr_in_iterExpr1974);
				ternaryExpr176 = this.ternaryExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, ternaryExpr176.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:23:
				// ( ELLIPSIS ternaryExpr )*
				loop41: do {
					int alt41 = 2;
					int LA41_0 = this.input.LA(1);

					if ((LA41_0 == ELLIPSIS)) {
						alt41 = 1;
					}

					switch (alt41) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:24:
						// ELLIPSIS ternaryExpr
					{
						ELLIPSIS177 = (Token) this.match(this.input, ELLIPSIS,
								FOLLOW_ELLIPSIS_in_iterExpr1977);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							ELLIPSIS177_tree = (Object) this.adaptor
									.create(ELLIPSIS177);
							root_0 = (Object) this.adaptor.becomeRoot(
									ELLIPSIS177_tree, root_0);
						}
						this.pushFollow(FOLLOW_ternaryExpr_in_iterExpr1980);
						ternaryExpr178 = this.ternaryExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, ternaryExpr178
									.getTree());
						}

					}
						break;

					default:
						break loop41;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 41, iterExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "iterExpr"

	/**
	 * The Class logicOrExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class logicOrExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "logicOrExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:251:1:
	// logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
	/**
	 * Logic or expr.
	 * 
	 * @return the tiny haxe try1 parser.logic or expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
		retval.start = this.input.LT(1);
		int logicOrExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token BARBAR180 = null;
		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr179 = null;

		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr181 = null;

		Object BARBAR180_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 42)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:2:
			// ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:4:
			// ( logicAndExpr ) ( BARBAR logicAndExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:4:
				// ( logicAndExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:5:
				// logicAndExpr
				{
					this.pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2009);
					logicAndExpr179 = this.logicAndExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor
								.addChild(root_0, logicAndExpr179.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:19:
				// ( BARBAR logicAndExpr )*
				loop42: do {
					int alt42 = 2;
					int LA42_0 = this.input.LA(1);

					if ((LA42_0 == BARBAR)) {
						alt42 = 1;
					}

					switch (alt42) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:20:
						// BARBAR logicAndExpr
					{
						BARBAR180 = (Token) this.match(this.input, BARBAR,
								FOLLOW_BARBAR_in_logicOrExpr2013);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							BARBAR180_tree = (Object) this.adaptor
									.create(BARBAR180);
							root_0 = (Object) this.adaptor.becomeRoot(
									BARBAR180_tree, root_0);
						}
						this.pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2016);
						logicAndExpr181 = this.logicAndExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, logicAndExpr181
									.getTree());
						}

					}
						break;

					default:
						break loop42;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 42, logicOrExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "logicOrExpr"

	/**
	 * The Class logicAndExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class logicAndExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "logicAndExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:255:1:
	// logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
	/**
	 * Logic and expr.
	 * 
	 * @return the tiny haxe try1 parser.logic and expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
		retval.start = this.input.LT(1);
		int logicAndExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token AMPAMP183 = null;
		TinyHaxeTry1Parser.cmpExpr_return cmpExpr182 = null;

		TinyHaxeTry1Parser.cmpExpr_return cmpExpr184 = null;

		Object AMPAMP183_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 43)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:2:
			// ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:4:
			// ( cmpExpr ) ( AMPAMP cmpExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:4:
				// ( cmpExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:5:
				// cmpExpr
				{
					this.pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2037);
					cmpExpr182 = this.cmpExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, cmpExpr182.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:14:
				// ( AMPAMP cmpExpr )*
				loop43: do {
					int alt43 = 2;
					int LA43_0 = this.input.LA(1);

					if ((LA43_0 == AMPAMP)) {
						alt43 = 1;
					}

					switch (alt43) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:15:
						// AMPAMP cmpExpr
					{
						AMPAMP183 = (Token) this.match(this.input, AMPAMP,
								FOLLOW_AMPAMP_in_logicAndExpr2041);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							AMPAMP183_tree = (Object) this.adaptor
									.create(AMPAMP183);
							root_0 = (Object) this.adaptor.becomeRoot(
									AMPAMP183_tree, root_0);
						}
						this.pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2044);
						cmpExpr184 = this.cmpExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, cmpExpr184.getTree());
						}

					}
						break;

					default:
						break loop43;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 43, logicAndExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "logicAndExpr"

	/**
	 * The Class cmpExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class cmpExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "cmpExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:1:
	// cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
	// )* ;
	/**
	 * Cmp expr.
	 * 
	 * @return the tiny haxe try1 parser.cmp expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
		retval.start = this.input.LT(1);
		int cmpExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token EQEQ186 = null;
		Token BANGEQ187 = null;
		Token GTEQ188 = null;
		Token LTEQ189 = null;
		Token GT190 = null;
		Token LT191 = null;
		TinyHaxeTry1Parser.bitExpr_return bitExpr185 = null;

		TinyHaxeTry1Parser.bitExpr_return bitExpr192 = null;

		Object EQEQ186_tree = null;
		Object BANGEQ187_tree = null;
		Object GTEQ188_tree = null;
		Object LTEQ189_tree = null;
		Object GT190_tree = null;
		Object LT191_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 44)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:9:
			// ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:11:
			// ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:11:
				// ( bitExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:12:
				// bitExpr
				{
					this.pushFollow(FOLLOW_bitExpr_in_cmpExpr2058);
					bitExpr185 = this.bitExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, bitExpr185.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:21:
				// ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
				loop45: do {
					int alt45 = 2;
					int LA45_0 = this.input.LA(1);

					if (((LA45_0 >= LT && LA45_0 <= GT) || (LA45_0 >= EQEQ && LA45_0 <= LTEQ))) {
						alt45 = 1;
					}

					switch (alt45) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:22:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:22:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
						int alt44 = 6;
						switch (this.input.LA(1)) {
						case EQEQ: {
							alt44 = 1;
						}
							break;
						case BANGEQ: {
							alt44 = 2;
						}
							break;
						case GTEQ: {
							alt44 = 3;
						}
							break;
						case LTEQ: {
							alt44 = 4;
						}
							break;
						case GT: {
							alt44 = 5;
						}
							break;
						case LT: {
							alt44 = 6;
						}
							break;
						default:
							if (this.state.backtracking > 0) {
								this.state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 44, 0, this.input);

							throw nvae;
						}

						switch (alt44) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:23:
							// EQEQ
						{
							EQEQ186 = (Token) this.match(this.input, EQEQ,
									FOLLOW_EQEQ_in_cmpExpr2063);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								EQEQ186_tree = (Object) this.adaptor
										.create(EQEQ186);
								root_0 = (Object) this.adaptor.becomeRoot(
										EQEQ186_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:30:
							// BANGEQ
						{
							BANGEQ187 = (Token) this.match(this.input, BANGEQ,
									FOLLOW_BANGEQ_in_cmpExpr2067);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								BANGEQ187_tree = (Object) this.adaptor
										.create(BANGEQ187);
								root_0 = (Object) this.adaptor.becomeRoot(
										BANGEQ187_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:40:
							// GTEQ
						{
							GTEQ188 = (Token) this.match(this.input, GTEQ,
									FOLLOW_GTEQ_in_cmpExpr2072);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								GTEQ188_tree = (Object) this.adaptor
										.create(GTEQ188);
								root_0 = (Object) this.adaptor.becomeRoot(
										GTEQ188_tree, root_0);
							}

						}
							break;
						case 4:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:48:
							// LTEQ
						{
							LTEQ189 = (Token) this.match(this.input, LTEQ,
									FOLLOW_LTEQ_in_cmpExpr2077);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								LTEQ189_tree = (Object) this.adaptor
										.create(LTEQ189);
								root_0 = (Object) this.adaptor.becomeRoot(
										LTEQ189_tree, root_0);
							}

						}
							break;
						case 5:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:56:
							// GT
						{
							GT190 = (Token) this.match(this.input, GT,
									FOLLOW_GT_in_cmpExpr2082);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								GT190_tree = (Object) this.adaptor
										.create(GT190);
								root_0 = (Object) this.adaptor.becomeRoot(
										GT190_tree, root_0);
							}

						}
							break;
						case 6:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:62:
							// LT
						{
							LT191 = (Token) this.match(this.input, LT,
									FOLLOW_LT_in_cmpExpr2087);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								LT191_tree = (Object) this.adaptor
										.create(LT191);
								root_0 = (Object) this.adaptor.becomeRoot(
										LT191_tree, root_0);
							}

						}
							break;

						}

						this.pushFollow(FOLLOW_bitExpr_in_cmpExpr2092);
						bitExpr192 = this.bitExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, bitExpr192.getTree());
						}

					}
						break;

					default:
						break loop45;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 44, cmpExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "cmpExpr"

	/**
	 * The Class bitExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class bitExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "bitExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:1:
	// bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
	// )* ;
	/**
	 * Bit expr.
	 * 
	 * @return the tiny haxe try1 parser.bit expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.bitExpr_return bitExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
		retval.start = this.input.LT(1);
		int bitExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token BAR194 = null;
		Token AMP196 = null;
		Token CARET198 = null;
		TinyHaxeTry1Parser.shiftExpr_return shiftExpr193 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr195 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr197 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr199 = null;

		Object BAR194_tree = null;
		Object AMP196_tree = null;
		Object CARET198_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 45)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:9:
			// ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:11:
			// ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:11:
				// ( shiftExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:12:
				// shiftExpr
				{
					this.pushFollow(FOLLOW_shiftExpr_in_bitExpr2106);
					shiftExpr193 = this.shiftExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, shiftExpr193.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:23:
				// ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
				loop46: do {
					int alt46 = 4;
					switch (this.input.LA(1)) {
					case BAR: {
						alt46 = 1;
					}
						break;
					case AMP: {
						alt46 = 2;
					}
						break;
					case CARET: {
						alt46 = 3;
					}
						break;

					}

					switch (alt46) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:24:
						// BAR shiftExpr
					{
						BAR194 = (Token) this.match(this.input, BAR,
								FOLLOW_BAR_in_bitExpr2110);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							BAR194_tree = (Object) this.adaptor.create(BAR194);
							root_0 = (Object) this.adaptor.becomeRoot(
									BAR194_tree, root_0);
						}
						this.pushFollow(FOLLOW_shiftExpr_in_bitExpr2113);
						shiftExpr195 = this.shiftExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, shiftExpr195
									.getTree());
						}

					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:41:
						// AMP shiftExpr
					{
						AMP196 = (Token) this.match(this.input, AMP,
								FOLLOW_AMP_in_bitExpr2117);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							AMP196_tree = (Object) this.adaptor.create(AMP196);
							root_0 = (Object) this.adaptor.becomeRoot(
									AMP196_tree, root_0);
						}
						this.pushFollow(FOLLOW_shiftExpr_in_bitExpr2120);
						shiftExpr197 = this.shiftExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, shiftExpr197
									.getTree());
						}

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:57:
						// CARET shiftExpr
					{
						CARET198 = (Token) this.match(this.input, CARET,
								FOLLOW_CARET_in_bitExpr2123);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							CARET198_tree = (Object) this.adaptor
									.create(CARET198);
							root_0 = (Object) this.adaptor.becomeRoot(
									CARET198_tree, root_0);
						}
						this.pushFollow(FOLLOW_shiftExpr_in_bitExpr2126);
						shiftExpr199 = this.shiftExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, shiftExpr199
									.getTree());
						}

					}
						break;

					default:
						break loop46;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 45, bitExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "bitExpr"

	/**
	 * The Class shiftExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class shiftExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "shiftExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:1:
	// shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT
	// addExpr )* ;
	/**
	 * Shift expr.
	 * 
	 * @return the tiny haxe try1 parser.shift expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
		retval.start = this.input.LT(1);
		int shiftExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token LTLT201 = null;
		Token GT203 = null;
		Token GT204 = null;
		Token GTGTGT206 = null;
		TinyHaxeTry1Parser.addExpr_return addExpr200 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr202 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr205 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr207 = null;

		Object LTLT201_tree = null;
		Object GT203_tree = null;
		Object GT204_tree = null;
		Object GTGTGT206_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 46)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:2:
			// ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:4:
			// ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr
			// )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:4:
				// ( addExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:5:
				// addExpr
				{
					this.pushFollow(FOLLOW_addExpr_in_shiftExpr2140);
					addExpr200 = this.addExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, addExpr200.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:14:
				// ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
				loop47: do {
					int alt47 = 4;
					switch (this.input.LA(1)) {
					case GT: {
						int LA47_2 = this.input.LA(2);

						if ((LA47_2 == GT)) {
							int LA47_5 = this.input.LA(3);

							if ((this.synpred83_TinyHaxeTry1())) {
								alt47 = 2;
							}

						}

					}
						break;
					case LTLT: {
						alt47 = 1;
					}
						break;
					case GTGTGT: {
						alt47 = 3;
					}
						break;

					}

					switch (alt47) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:15:
						// LTLT addExpr
					{
						LTLT201 = (Token) this.match(this.input, LTLT,
								FOLLOW_LTLT_in_shiftExpr2144);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							LTLT201_tree = (Object) this.adaptor
									.create(LTLT201);
							root_0 = (Object) this.adaptor.becomeRoot(
									LTLT201_tree, root_0);
						}
						this.pushFollow(FOLLOW_addExpr_in_shiftExpr2148);
						addExpr202 = this.addExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, addExpr202.getTree());
						}

					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:32:
						// ( GT GT ) addExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:32:
						// ( GT GT )
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:33:
						// GT GT
						{
							GT203 = (Token) this.match(this.input, GT,
									FOLLOW_GT_in_shiftExpr2153);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								GT203_tree = (Object) this.adaptor
										.create(GT203);
								this.adaptor.addChild(root_0, GT203_tree);
							}
							GT204 = (Token) this.match(this.input, GT,
									FOLLOW_GT_in_shiftExpr2155);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								GT204_tree = (Object) this.adaptor
										.create(GT204);
								this.adaptor.addChild(root_0, GT204_tree);
							}

						}

						this.pushFollow(FOLLOW_addExpr_in_shiftExpr2160);
						addExpr205 = this.addExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, addExpr205.getTree());
						}

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:52:
						// GTGTGT addExpr
					{
						GTGTGT206 = (Token) this.match(this.input, GTGTGT,
								FOLLOW_GTGTGT_in_shiftExpr2164);
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							GTGTGT206_tree = (Object) this.adaptor
									.create(GTGTGT206);
							root_0 = (Object) this.adaptor.becomeRoot(
									GTGTGT206_tree, root_0);
						}
						this.pushFollow(FOLLOW_addExpr_in_shiftExpr2167);
						addExpr207 = this.addExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, addExpr207.getTree());
						}

					}
						break;

					default:
						break loop47;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 46, shiftExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "shiftExpr"

	/**
	 * The Class addExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class addExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "addExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:1:
	// addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
	/**
	 * Adds the expr.
	 * 
	 * @return the tiny haxe try1 parser.add expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.addExpr_return addExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
		retval.start = this.input.LT(1);
		int addExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token PLUS209 = null;
		Token SUB210 = null;
		TinyHaxeTry1Parser.multExpr_return multExpr208 = null;

		TinyHaxeTry1Parser.multExpr_return multExpr211 = null;

		Object PLUS209_tree = null;
		Object SUB210_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 47)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:9:
			// ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:12:
			// ( multExpr ) ( ( PLUS | SUB ) multExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:12:
				// ( multExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:13:
				// multExpr
				{
					this.pushFollow(FOLLOW_multExpr_in_addExpr2181);
					multExpr208 = this.multExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, multExpr208.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:23:
				// ( ( PLUS | SUB ) multExpr )*
				loop49: do {
					int alt49 = 2;
					int LA49_0 = this.input.LA(1);

					if (((LA49_0 >= PLUS && LA49_0 <= SUB))) {
						alt49 = 1;
					}

					switch (alt49) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:24:
						// ( PLUS | SUB ) multExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:24:
						// ( PLUS | SUB )
						int alt48 = 2;
						int LA48_0 = this.input.LA(1);

						if ((LA48_0 == PLUS)) {
							alt48 = 1;
						} else if ((LA48_0 == SUB)) {
							alt48 = 2;
						} else {
							if (this.state.backtracking > 0) {
								this.state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 48, 0, this.input);

							throw nvae;
						}
						switch (alt48) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:25:
							// PLUS
						{
							PLUS209 = (Token) this.match(this.input, PLUS,
									FOLLOW_PLUS_in_addExpr2186);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								PLUS209_tree = (Object) this.adaptor
										.create(PLUS209);
								root_0 = (Object) this.adaptor.becomeRoot(
										PLUS209_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:33:
							// SUB
						{
							SUB210 = (Token) this.match(this.input, SUB,
									FOLLOW_SUB_in_addExpr2191);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								SUB210_tree = (Object) this.adaptor
										.create(SUB210);
								root_0 = (Object) this.adaptor.becomeRoot(
										SUB210_tree, root_0);
							}

						}
							break;

						}

						this.pushFollow(FOLLOW_multExpr_in_addExpr2195);
						multExpr211 = this.multExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor
									.addChild(root_0, multExpr211.getTree());
						}

					}
						break;

					default:
						break loop49;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 47, addExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "addExpr"

	/**
	 * The Class multExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class multExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "multExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:1:
	// multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
	/**
	 * Mult expr.
	 * 
	 * @return the tiny haxe try1 parser.mult expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.multExpr_return multExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
		retval.start = this.input.LT(1);
		int multExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token STAR213 = null;
		Token SLASH214 = null;
		Token PERCENT215 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr212 = null;

		TinyHaxeTry1Parser.prefixExpr_return prefixExpr216 = null;

		Object STAR213_tree = null;
		Object SLASH214_tree = null;
		Object PERCENT215_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 48)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:9:
			// ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:11:
			// ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:11:
				// ( prefixExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:12:
				// prefixExpr
				{
					this.pushFollow(FOLLOW_prefixExpr_in_multExpr2209);
					prefixExpr212 = this.prefixExpr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, prefixExpr212.getTree());
					}

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:24:
				// ( ( STAR | SLASH | PERCENT ) prefixExpr )*
				loop51: do {
					int alt51 = 2;
					int LA51_0 = this.input.LA(1);

					if (((LA51_0 >= STAR && LA51_0 <= PERCENT))) {
						alt51 = 1;
					}

					switch (alt51) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:25:
						// ( STAR | SLASH | PERCENT ) prefixExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:25:
						// ( STAR | SLASH | PERCENT )
						int alt50 = 3;
						switch (this.input.LA(1)) {
						case STAR: {
							alt50 = 1;
						}
							break;
						case SLASH: {
							alt50 = 2;
						}
							break;
						case PERCENT: {
							alt50 = 3;
						}
							break;
						default:
							if (this.state.backtracking > 0) {
								this.state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 50, 0, this.input);

							throw nvae;
						}

						switch (alt50) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:26:
							// STAR
						{
							STAR213 = (Token) this.match(this.input, STAR,
									FOLLOW_STAR_in_multExpr2214);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								STAR213_tree = (Object) this.adaptor
										.create(STAR213);
								root_0 = (Object) this.adaptor.becomeRoot(
										STAR213_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:32:
							// SLASH
						{
							SLASH214 = (Token) this.match(this.input, SLASH,
									FOLLOW_SLASH_in_multExpr2217);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								SLASH214_tree = (Object) this.adaptor
										.create(SLASH214);
								root_0 = (Object) this.adaptor.becomeRoot(
										SLASH214_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:39:
							// PERCENT
						{
							PERCENT215 = (Token) this.match(this.input,
									PERCENT, FOLLOW_PERCENT_in_multExpr2220);
							if (this.state.failed) {
								return retval;
							}
							if (this.state.backtracking == 0) {
								PERCENT215_tree = (Object) this.adaptor
										.create(PERCENT215);
								root_0 = (Object) this.adaptor.becomeRoot(
										PERCENT215_tree, root_0);
							}

						}
							break;

						}

						this.pushFollow(FOLLOW_prefixExpr_in_multExpr2224);
						prefixExpr216 = this.prefixExpr();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, prefixExpr216
									.getTree());
						}

					}
						break;

					default:
						break loop51;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 48, multExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "multExpr"

	/**
	 * The Class prefixExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class prefixExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "prefixExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:1:
	// prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr |
	// newExpr | cast | suffixExpr );
	/**
	 * Prefix expr.
	 * 
	 * @return the tiny haxe try1 parser.prefix expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
		retval.start = this.input.LT(1);
		int prefixExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token set217 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr218 = null;

		TinyHaxeTry1Parser.newExpr_return newExpr219 = null;

		TinyHaxeTry1Parser.cast_return cast220 = null;

		TinyHaxeTry1Parser.suffixExpr_return suffixExpr221 = null;

		Object set217_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 49)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:9:
			// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr
			// | cast | suffixExpr )
			int alt52 = 4;
			switch (this.input.LA(1)) {
			case PLUSPLUS: {
				int LA52_1 = this.input.LA(2);

				if ((this.synpred94_TinyHaxeTry1())) {
					alt52 = 1;
				} else if ((true)) {
					alt52 = 4;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							52, 1, this.input);

					throw nvae;
				}
			}
				break;
			case NEW: {
				alt52 = 2;
			}
				break;
			case CAST: {
				alt52 = 3;
			}
				break;
			case EOF:
			case SEMI:
			case IDENTIFIER:
			case COMMA:
			case QUES:
			case EQ:
			case PLUSEQ:
			case SUBEQ:
			case SLASHEQ:
			case PERCENTEQ:
			case AMPEQ:
			case FUNCTION:
			case LPAREN:
			case RPAREN:
			case LBRACKET:
			case RBRACKET:
			case COLON:
			case LT:
			case GT:
			case IN:
			case LBRACE:
			case RBRACE:
			case ELLIPSIS:
			case BARBAR:
			case AMPAMP:
			case EQEQ:
			case BANGEQ:
			case GTEQ:
			case LTEQ:
			case BAR:
			case AMP:
			case CARET:
			case LTLT:
			case GTGTGT:
			case PLUS:
			case STAR:
			case SLASH:
			case PERCENT:
			case NULL:
			case LONGLITERAL:
			case INTLITERAL:
			case STRINGLITERAL:
			case CHARLITERAL:
			case FLOATNUM:
			case TRUE:
			case FALSE: {
				alt52 = 4;
			}
				break;
			case SUBSUB: {
				int LA52_5 = this.input.LA(2);

				if ((this.synpred94_TinyHaxeTry1())) {
					alt52 = 1;
				} else if ((true)) {
					alt52 = 4;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							52, 5, this.input);

					throw nvae;
				}
			}
				break;
			case SUB: {
				int LA52_6 = this.input.LA(2);

				if ((this.synpred94_TinyHaxeTry1())) {
					alt52 = 1;
				} else if ((true)) {
					alt52 = 4;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							52, 6, this.input);

					throw nvae;
				}
			}
				break;
			case BANG:
			case TILDE: {
				alt52 = 1;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 52, 0,
						this.input);

				throw nvae;
			}

			switch (alt52) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
				// ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
			{
				root_0 = (Object) this.adaptor.nil();

				set217 = (Token) this.input.LT(1);
				if (this.input.LA(1) == SUB
						|| (this.input.LA(1) >= SUBSUB && this.input.LA(1) <= TILDE)) {
					this.input.consume();
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, (Object) this.adaptor
								.create(set217));
					}
					this.state.errorRecovery = false;
					this.state.failed = false;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					throw mse;
				}

				this.pushFollow(FOLLOW_prefixExpr_in_prefixExpr2257);
				prefixExpr218 = this.prefixExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, prefixExpr218.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:11:
				// newExpr
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_newExpr_in_prefixExpr2269);
				newExpr219 = this.newExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, newExpr219.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:278:11:
				// cast
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_cast_in_prefixExpr2281);
				cast220 = this.cast();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, cast220.getTree());
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:279:11:
				// suffixExpr
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_suffixExpr_in_prefixExpr2293);
				suffixExpr221 = this.suffixExpr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, suffixExpr221.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 49, prefixExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "prefixExpr"

	/**
	 * The Class suffixExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class suffixExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "suffixExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:282:1:
	// suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value
	// LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value
	// SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) |
	// value typeParamOpt );
	/**
	 * Suffix expr.
	 * 
	 * @return the tiny haxe try1 parser.suffix expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
		retval.start = this.input.LT(1);
		int suffixExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token LPAREN223 = null;
		Token RPAREN225 = null;
		Token LBRACKET227 = null;
		Token RBRACKET229 = null;
		Token PLUSPLUS231 = null;
		Token SUBSUB233 = null;
		TinyHaxeTry1Parser.value_return value222 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt224 = null;

		TinyHaxeTry1Parser.value_return value226 = null;

		TinyHaxeTry1Parser.expr_return expr228 = null;

		TinyHaxeTry1Parser.value_return value230 = null;

		TinyHaxeTry1Parser.value_return value232 = null;

		TinyHaxeTry1Parser.value_return value234 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt235 = null;

		Object LPAREN223_tree = null;
		Object RPAREN225_tree = null;
		Object LBRACKET227_tree = null;
		Object RBRACKET229_tree = null;
		Object PLUSPLUS231_tree = null;
		Object SUBSUB233_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SUBSUB = new RewriteRuleTokenStream(
				this.adaptor, "token SUBSUB");
		RewriteRuleTokenStream stream_PLUSPLUS = new RewriteRuleTokenStream(
				this.adaptor, "token PLUSPLUS");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_exprListOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule exprListOpt");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(
				this.adaptor, "rule value");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 50)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:2:
			// ( value LPAREN exprListOpt RPAREN -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) |
			// value LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) |
			// value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )?
			// SUBSUB ) | value typeParamOpt )
			int alt53 = 5;
			alt53 = this.dfa53.predict(this.input);
			switch (alt53) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
				// value LPAREN exprListOpt RPAREN
			{
				this.pushFollow(FOLLOW_value_in_suffixExpr2312);
				value222 = this.value();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_value.add(value222.getTree());
				}
				LPAREN223 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_suffixExpr2314);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN223);
				}

				this.pushFollow(FOLLOW_exprListOpt_in_suffixExpr2316);
				exprListOpt224 = this.exprListOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_exprListOpt.add(exprListOpt224.getTree());
				}
				RPAREN225 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_suffixExpr2318);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN225);
				}

				// AST REWRITE
				// elements: value, exprListOpt
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 283:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? ( exprListOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:39:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? (
						// exprListOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:93:
							// ( value )?
							if (stream_value.hasNext()) {
								this.adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:100:
							// ( exprListOpt )?
							if (stream_exprListOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_exprListOpt.nextTree());

							}
							stream_exprListOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
				// value LBRACKET expr RBRACKET
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_value_in_suffixExpr2339);
				value226 = this.value();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, value226.getTree());
				}
				LBRACKET227 = (Token) this.match(this.input, LBRACKET,
						FOLLOW_LBRACKET_in_suffixExpr2341);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					LBRACKET227_tree = (Object) this.adaptor
							.create(LBRACKET227);
					this.adaptor.addChild(root_0, LBRACKET227_tree);
				}
				this.pushFollow(FOLLOW_expr_in_suffixExpr2343);
				expr228 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, expr228.getTree());
				}
				RBRACKET229 = (Token) this.match(this.input, RBRACKET,
						FOLLOW_RBRACKET_in_suffixExpr2345);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					RBRACKET229_tree = (Object) this.adaptor
							.create(RBRACKET229);
					this.adaptor.addChild(root_0, RBRACKET229_tree);
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
				// value PLUSPLUS
			{
				this.pushFollow(FOLLOW_value_in_suffixExpr2350);
				value230 = this.value();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_value.add(value230.getTree());
				}
				PLUSPLUS231 = (Token) this.match(this.input, PLUSPLUS,
						FOLLOW_PLUSPLUS_in_suffixExpr2352);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_PLUSPLUS.add(PLUSPLUS231);
				}

				// AST REWRITE
				// elements: value, PLUSPLUS
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 285:22: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? ( PLUSPLUS )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:25:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? (
						// PLUSPLUS )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:79:
							// ( value )?
							if (stream_value.hasNext()) {
								this.adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:86:
							// ( PLUSPLUS )?
							if (stream_PLUSPLUS.hasNext()) {
								this.adaptor.addChild(root_1, stream_PLUSPLUS
										.nextNode());

							}
							stream_PLUSPLUS.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4:
				// value SUBSUB
			{
				this.pushFollow(FOLLOW_value_in_suffixExpr2376);
				value232 = this.value();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_value.add(value232.getTree());
				}
				SUBSUB233 = (Token) this.match(this.input, SUBSUB,
						FOLLOW_SUBSUB_in_suffixExpr2378);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SUBSUB.add(SUBSUB233);
				}

				// AST REWRITE
				// elements: value, SUBSUB
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 286:20: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? SUBSUB )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:23:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )?
						// SUBSUB )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:77:
							// ( value )?
							if (stream_value.hasNext()) {
								this.adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							this.adaptor.addChild(root_1, stream_SUBSUB
									.nextNode());

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:287:4:
				// value typeParamOpt
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_value_in_suffixExpr2401);
				value234 = this.value();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, value234.getTree());
				}
				this.pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2403);
				typeParamOpt235 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, typeParamOpt235.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 50, suffixExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "suffixExpr"

	/**
	 * The Class value_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class value_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "value"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:1:
	// value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
	// ( expr | statement ) RPAREN | dotIdent | );
	/**
	 * Value.
	 * 
	 * @return the tiny haxe try1 parser.value_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.value_return value()
			throws RecognitionException {
		TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
		retval.start = this.input.LT(1);
		int value_StartIndex = this.input.index();
		Object root_0 = null;

		Token NULL239 = null;
		Token LPAREN241 = null;
		Token RPAREN244 = null;
		TinyHaxeTry1Parser.funcLit_return funcLit236 = null;

		TinyHaxeTry1Parser.arrayLit_return arrayLit237 = null;

		TinyHaxeTry1Parser.objLit_return objLit238 = null;

		TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol240 = null;

		TinyHaxeTry1Parser.expr_return expr242 = null;

		TinyHaxeTry1Parser.statement_return statement243 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent245 = null;

		Object NULL239_tree = null;
		Object LPAREN241_tree = null;
		Object RPAREN244_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 51)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:7:
			// ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
			// ( expr | statement ) RPAREN | dotIdent | )
			int alt55 = 8;
			alt55 = this.dfa55.predict(this.input);
			switch (alt55) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:9:
				// funcLit
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_funcLit_in_value2412);
				funcLit236 = this.funcLit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcLit236.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
				// arrayLit
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_arrayLit_in_value2418);
				arrayLit237 = this.arrayLit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, arrayLit237.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:292:14:
				// objLit
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_objLit_in_value2433);
				objLit238 = this.objLit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, objLit238.getTree());
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:293:14:
				// NULL
			{
				root_0 = (Object) this.adaptor.nil();

				NULL239 = (Token) this.match(this.input, NULL,
						FOLLOW_NULL_in_value2448);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					NULL239_tree = (Object) this.adaptor.create(NULL239);
					this.adaptor.addChild(root_0, NULL239_tree);
				}

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:294:14:
				// elementarySymbol
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_elementarySymbol_in_value2463);
				elementarySymbol240 = this.elementarySymbol();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor
							.addChild(root_0, elementarySymbol240.getTree());
				}

			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
				// LPAREN ( expr | statement ) RPAREN
			{
				root_0 = (Object) this.adaptor.nil();

				LPAREN241 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_value2478);
				if (this.state.failed) {
					return retval;
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:22:
				// ( expr | statement )
				int alt54 = 2;
				alt54 = this.dfa54.predict(this.input);
				switch (alt54) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
					// expr
				{
					this.pushFollow(FOLLOW_expr_in_value2482);
					expr242 = this.expr();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, expr242.getTree());
					}

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:28:
					// statement
				{
					this.pushFollow(FOLLOW_statement_in_value2484);
					statement243 = this.statement();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, statement243.getTree());
					}

				}
					break;

				}

				RPAREN244 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_value2487);
				if (this.state.failed) {
					return retval;
				}

			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:11:
				// dotIdent
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_dotIdent_in_value2500);
				dotIdent245 = this.dotIdent();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, dotIdent245.getTree());
				}

			}
				break;
			case 8:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:298:9:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 51, value_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "value"

	/**
	 * The Class newExpr_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class newExpr_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "newExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:300:1:
	// newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? (
	// exprListOpt )? ) ;
	/**
	 * New expr.
	 * 
	 * @return the tiny haxe try1 parser.new expr_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.newExpr_return newExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
		retval.start = this.input.LT(1);
		int newExpr_StartIndex = this.input.index();
		Object root_0 = null;

		Token NEW246 = null;
		Token LPAREN248 = null;
		Token RPAREN250 = null;
		TinyHaxeTry1Parser.type_return type247 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt249 = null;

		Object NEW246_tree = null;
		Object LPAREN248_tree = null;
		Object RPAREN250_tree = null;
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(
				this.adaptor, "token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_exprListOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule exprListOpt");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
				this.adaptor, "rule type");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 52)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:2:
			// ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? (
			// exprListOpt )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:4:
			// NEW type LPAREN exprListOpt RPAREN
			{
				NEW246 = (Token) this.match(this.input, NEW,
						FOLLOW_NEW_in_newExpr2547);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NEW.add(NEW246);
				}

				this.pushFollow(FOLLOW_type_in_newExpr2549);
				type247 = this.type();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_type.add(type247.getTree());
				}
				LPAREN248 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_newExpr2551);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN248);
				}

				this.pushFollow(FOLLOW_exprListOpt_in_newExpr2553);
				exprListOpt249 = this.exprListOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_exprListOpt.add(exprListOpt249.getTree());
				}
				RPAREN250 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_newExpr2555);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN250);
				}

				// AST REWRITE
				// elements: exprListOpt, NEW, type
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 301:39: -> ^( NEW ( type )? ( exprListOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:42:
						// ^( NEW ( type )? ( exprListOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_NEW.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:48:
							// ( type )?
							if (stream_type.hasNext()) {
								this.adaptor.addChild(root_1, stream_type
										.nextTree());

							}
							stream_type.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:54:
							// ( exprListOpt )?
							if (stream_exprListOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_exprListOpt.nextTree());

							}
							stream_exprListOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 52, newExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "newExpr"

	/**
	 * The Class cast_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class cast_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "cast"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:1:
	// cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )?
	// ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
	/**
	 * Cast.
	 * 
	 * @return the tiny haxe try1 parser.cast_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.cast_return cast()
			throws RecognitionException {
		TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
		retval.start = this.input.LT(1);
		int cast_StartIndex = this.input.index();
		Object root_0 = null;

		Token CAST251 = null;
		Token LPAREN252 = null;
		Token COMMA254 = null;
		Token RPAREN256 = null;
		Token CAST257 = null;
		Token LPAREN258 = null;
		Token RPAREN260 = null;
		TinyHaxeTry1Parser.expr_return expr253 = null;

		TinyHaxeTry1Parser.funcType_return funcType255 = null;

		TinyHaxeTry1Parser.expr_return expr259 = null;

		Object CAST251_tree = null;
		Object LPAREN252_tree = null;
		Object COMMA254_tree = null;
		Object RPAREN256_tree = null;
		Object CAST257_tree = null;
		Object LPAREN258_tree = null;
		Object RPAREN260_tree = null;
		RewriteRuleTokenStream stream_CAST = new RewriteRuleTokenStream(
				this.adaptor, "token CAST");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				this.adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_funcType = new RewriteRuleSubtreeStream(
				this.adaptor, "rule funcType");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expr");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 53)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:9:
			// ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr
			// )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )?
			// ) )
			int alt57 = 2;
			int LA57_0 = this.input.LA(1);

			if ((LA57_0 == CAST)) {
				int LA57_1 = this.input.LA(2);

				if ((this.synpred110_TinyHaxeTry1())) {
					alt57 = 1;
				} else if ((true)) {
					alt57 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							57, 1, this.input);

					throw nvae;
				}
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 57, 0,
						this.input);

				throw nvae;
			}
			switch (alt57) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
				// CAST LPAREN expr ( COMMA funcType )? RPAREN
			{
				CAST251 = (Token) this.match(this.input, CAST,
						FOLLOW_CAST_in_cast2581);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CAST.add(CAST251);
				}

				LPAREN252 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_cast2583);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN252);
				}

				this.pushFollow(FOLLOW_expr_in_cast2585);
				expr253 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(expr253.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:28:
				// ( COMMA funcType )?
				int alt56 = 2;
				int LA56_0 = this.input.LA(1);

				if ((LA56_0 == COMMA)) {
					alt56 = 1;
				}
				switch (alt56) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:29:
					// COMMA funcType
				{
					COMMA254 = (Token) this.match(this.input, COMMA,
							FOLLOW_COMMA_in_cast2588);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_COMMA.add(COMMA254);
					}

					this.pushFollow(FOLLOW_funcType_in_cast2590);
					funcType255 = this.funcType();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_funcType.add(funcType255.getTree());
					}

				}
					break;

				}

				RPAREN256 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_cast2594);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN256);
				}

				// AST REWRITE
				// elements: CAST, funcType, expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 304:54: -> ^( CAST ( expr )? ( funcType )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:57:
						// ^( CAST ( expr )? ( funcType )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_CAST.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:64:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:70:
							// ( funcType )?
							if (stream_funcType.hasNext()) {
								this.adaptor.addChild(root_1, stream_funcType
										.nextTree());

							}
							stream_funcType.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:4:
				// CAST LPAREN expr RPAREN
			{
				CAST257 = (Token) this.match(this.input, CAST,
						FOLLOW_CAST_in_cast2612);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CAST.add(CAST257);
				}

				LPAREN258 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_cast2614);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN258);
				}

				this.pushFollow(FOLLOW_expr_in_cast2616);
				expr259 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(expr259.getTree());
				}
				RPAREN260 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_cast2618);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN260);
				}

				// AST REWRITE
				// elements: CAST, expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 305:31: -> ^( CAST ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:34:
						// ^( CAST ( expr )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_CAST.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:41:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 53, cast_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "cast"

	/**
	 * The Class topLevelDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class topLevelDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "topLevelDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:310:1:
	// topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
	/**
	 * Top level decl.
	 * 
	 * @return the tiny haxe try1 parser.top level decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
		retval.start = this.input.LT(1);
		int topLevelDecl_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl261 = null;

		TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl262 = null;

		TinyHaxeTry1Parser.enumDecl_return enumDecl263 = null;

		TinyHaxeTry1Parser.typedefDecl_return typedefDecl264 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 54)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:311:2:
			// ( classDecl | interfaceDecl | enumDecl | typedefDecl )
			int alt58 = 4;
			switch (this.input.LA(1)) {
			case EXTERN:
			case CLASS: {
				alt58 = 1;
			}
				break;
			case INTERFACE: {
				alt58 = 2;
			}
				break;
			case ENUM: {
				alt58 = 3;
			}
				break;
			case TYPEDEF: {
				alt58 = 4;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 58, 0,
						this.input);

				throw nvae;
			}

			switch (alt58) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:311:4:
				// classDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_classDecl_in_topLevelDecl2650);
				classDecl261 = this.classDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, classDecl261.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:312:4:
				// interfaceDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2655);
				interfaceDecl262 = this.interfaceDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, interfaceDecl262.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:11:
				// enumDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_enumDecl_in_topLevelDecl2667);
				enumDecl263 = this.enumDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, enumDecl263.getTree());
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:314:4:
				// typedefDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2672);
				typedefDecl264 = this.typedefDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, typedefDecl264.getTree());
				}

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 54, topLevelDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevelDecl"

	/**
	 * The Class enumDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class enumDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "enumDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:1:
	// enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
	// ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
	/**
	 * Enum decl.
	 * 
	 * @return the tiny haxe try1 parser.enum decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.enumDecl_return enumDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
		retval.start = this.input.LT(1);
		int enumDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token ENUM265 = null;
		Token IDENTIFIER266 = null;
		Token LBRACE268 = null;
		Token RBRACE270 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt267 = null;

		TinyHaxeTry1Parser.enumBody_return enumBody269 = null;

		Object ENUM265_tree = null;
		Object IDENTIFIER266_tree = null;
		Object LBRACE268_tree = null;
		Object RBRACE270_tree = null;
		RewriteRuleTokenStream stream_ENUM = new RewriteRuleTokenStream(
				this.adaptor, "token ENUM");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_enumBody = new RewriteRuleSubtreeStream(
				this.adaptor, "rule enumBody");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeParamOpt");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 55)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:9:
			// ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
			// ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:11:
			// ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
			{
				ENUM265 = (Token) this.match(this.input, ENUM,
						FOLLOW_ENUM_in_enumDecl2682);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_ENUM.add(ENUM265);
				}

				IDENTIFIER266 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumDecl2684);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER266);
				}

				this.pushFollow(FOLLOW_typeParamOpt_in_enumDecl2686);
				typeParamOpt267 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParamOpt.add(typeParamOpt267.getTree());
				}
				LBRACE268 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_enumDecl2688);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LBRACE.add(LBRACE268);
				}

				this.pushFollow(FOLLOW_enumBody_in_enumDecl2690);
				enumBody269 = this.enumBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_enumBody.add(enumBody269.getTree());
				}
				RBRACE270 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_enumDecl2692);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RBRACE.add(RBRACE270);
				}

				// AST REWRITE
				// elements: typeParamOpt, enumBody, IDENTIFIER, ENUM
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 317:63: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? (
					// enumBody )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:66:
						// ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody
						// )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_ENUM.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:73:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:85:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_typeParamOpt.nextTree());

							}
							stream_typeParamOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:99:
							// ( enumBody )?
							if (stream_enumBody.hasNext()) {
								this.adaptor.addChild(root_1, stream_enumBody
										.nextTree());

							}
							stream_enumBody.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 55, enumDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumDecl"

	/**
	 * The Class enumBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class enumBody_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "enumBody"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:1:
	// enumBody : ( enumValueDecl )* ;
	/**
	 * Enum body.
	 * 
	 * @return the tiny haxe try1 parser.enum body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.enumBody_return enumBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
		retval.start = this.input.LT(1);
		int enumBody_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl271 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 56)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:9:
			// ( ( enumValueDecl )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:11:
			// ( enumValueDecl )*
			{
				root_0 = (Object) this.adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:11:
				// ( enumValueDecl )*
				loop59: do {
					int alt59 = 2;
					int LA59_0 = this.input.LA(1);

					if ((LA59_0 == IDENTIFIER)) {
						alt59 = 1;
					}

					switch (alt59) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:12:
						// enumValueDecl
					{
						this.pushFollow(FOLLOW_enumValueDecl_in_enumBody2718);
						enumValueDecl271 = this.enumValueDecl();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, enumValueDecl271
									.getTree());
						}

					}
						break;

					default:
						break loop59;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 56, enumBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumBody"

	/**
	 * The Class enumValueDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class enumValueDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "enumValueDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:323:1:
	// enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^(
	// IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER
	// SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) );
	/**
	 * Enum value decl.
	 * 
	 * @return the tiny haxe try1 parser.enum value decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
		retval.start = this.input.LT(1);
		int enumValueDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER272 = null;
		Token LPAREN273 = null;
		Token RPAREN275 = null;
		Token SEMI276 = null;
		Token IDENTIFIER277 = null;
		Token SEMI278 = null;
		TinyHaxeTry1Parser.paramList_return paramList274 = null;

		Object IDENTIFIER272_tree = null;
		Object LPAREN273_tree = null;
		Object RPAREN275_tree = null;
		Object SEMI276_tree = null;
		Object IDENTIFIER277_tree = null;
		Object SEMI278_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				this.adaptor, "token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule paramList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 57)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:2:
			// ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^(
			// IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) |
			// IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) )
			int alt60 = 2;
			int LA60_0 = this.input.LA(1);

			if ((LA60_0 == IDENTIFIER)) {
				int LA60_1 = this.input.LA(2);

				if ((LA60_1 == LPAREN)) {
					alt60 = 1;
				} else if ((LA60_1 == SEMI)) {
					alt60 = 2;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							60, 1, this.input);

					throw nvae;
				}
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 60, 0,
						this.input);

				throw nvae;
			}
			switch (alt60) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:4:
				// IDENTIFIER LPAREN paramList RPAREN SEMI
			{
				IDENTIFIER272 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl2737);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER272);
				}

				LPAREN273 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_enumValueDecl2739);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN273);
				}

				this.pushFollow(FOLLOW_paramList_in_enumValueDecl2741);
				paramList274 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList274.getTree());
				}
				RPAREN275 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_enumValueDecl2743);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN275);
				}

				SEMI276 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl2745);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI276);
				}

				// AST REWRITE
				// elements: paramList, IDENTIFIER, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 324:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? (
					// paramList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:46:
						// ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? (
						// paramList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new VarDeclaration(IDENTIFIER,
											IDENTIFIER272), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:88:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:110:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:325:4:
				// IDENTIFIER SEMI
			{
				IDENTIFIER277 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl2770);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER277);
				}

				SEMI278 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl2772);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI278);
				}

				// AST REWRITE
				// elements: IDENTIFIER, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 325:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:325:25:
						// ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new VarDeclaration(IDENTIFIER,
											IDENTIFIER277), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:325:67:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 57, enumValueDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumValueDecl"

	/**
	 * The Class varDeclList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class varDeclList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "varDeclList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:329:1:
	// varDeclList : varDecl varDeclList ;
	/**
	 * Var decl list.
	 * 
	 * @return the tiny haxe try1 parser.var decl list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.varDeclList_return varDeclList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
		retval.start = this.input.LT(1);
		int varDeclList_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl279 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList280 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 58)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:2:
			// ( varDecl varDeclList )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:4:
			// varDecl varDeclList
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDecl_in_varDeclList2810);
				varDecl279 = this.varDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDecl279.getTree());
				}
				this.pushFollow(FOLLOW_varDeclList_in_varDeclList2812);
				varDeclList280 = this.varDeclList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDeclList280.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 58, varDeclList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclList"

	/**
	 * The Class varDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class varDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "varDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:1:
	// varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] (
	// declAttrList )? ( varDeclPartList )? ) ;
	/**
	 * Var decl.
	 * 
	 * @return the tiny haxe try1 parser.var decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.varDecl_return varDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
		retval.start = this.input.LT(1);
		int varDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token VAR282 = null;
		Token SEMI284 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList281 = null;

		TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList283 = null;

		Object VAR282_tree = null;
		Object SEMI284_tree = null;
		RewriteRuleTokenStream stream_VAR = new RewriteRuleTokenStream(
				this.adaptor, "token VAR");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				this.adaptor, "token SEMI");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_varDeclPartList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule varDeclPartList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 59)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:9:
			// ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] (
			// declAttrList )? ( varDeclPartList )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:11:
			// ( declAttrList )? VAR varDeclPartList SEMI
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:11:
				// ( declAttrList )?
				int alt61 = 2;
				int LA61_0 = this.input.LA(1);

				if (((LA61_0 >= PUBLIC && LA61_0 <= OVERRIDE))) {
					alt61 = 1;
				}
				switch (alt61) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:12:
					// declAttrList
				{
					this.pushFollow(FOLLOW_declAttrList_in_varDecl2824);
					declAttrList281 = this.declAttrList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_declAttrList.add(declAttrList281.getTree());
					}

				}
					break;

				}

				VAR282 = (Token) this.match(this.input, VAR,
						FOLLOW_VAR_in_varDecl2828);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_VAR.add(VAR282);
				}

				this.pushFollow(FOLLOW_varDeclPartList_in_varDecl2830);
				varDeclPartList283 = this.varDeclPartList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_varDeclPartList.add(varDeclPartList283.getTree());
				}
				SEMI284 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_varDecl2832);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI284);
				}

				// AST REWRITE
				// elements: declAttrList, varDeclPartList, VAR
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 333:52: -> ^( VAR[$VAR] ( declAttrList )? (
					// varDeclPartList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:54:
						// ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new VarDeclaration(VAR, VAR282), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:82:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:96:
							// ( varDeclPartList )?
							if (stream_varDeclPartList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_varDeclPartList.nextTree());

							}
							stream_varDeclPartList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 59, varDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDecl"

	/**
	 * The Class varDeclPartList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class varDeclPartList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "varDeclPartList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:336:1:
	// varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
	/**
	 * Var decl part list.
	 * 
	 * @return the tiny haxe try1 parser.var decl part list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
		retval.start = this.input.LT(1);
		int varDeclPartList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA286 = null;
		TinyHaxeTry1Parser.varDeclPart_return varDeclPart285 = null;

		TinyHaxeTry1Parser.varDeclPart_return varDeclPart287 = null;

		Object COMMA286_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 60)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:2:
			// ( varDeclPart ( COMMA varDeclPart )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:4:
			// varDeclPart ( COMMA varDeclPart )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2862);
				varDeclPart285 = this.varDeclPart();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDeclPart285.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:16:
				// ( COMMA varDeclPart )*
				loop62: do {
					int alt62 = 2;
					int LA62_0 = this.input.LA(1);

					if ((LA62_0 == COMMA)) {
						alt62 = 1;
					}

					switch (alt62) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:17:
						// COMMA varDeclPart
					{
						COMMA286 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_varDeclPartList2865);
						if (this.state.failed) {
							return retval;
						}
						this
								.pushFollow(FOLLOW_varDeclPart_in_varDeclPartList2868);
						varDeclPart287 = this.varDeclPart();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, varDeclPart287
									.getTree());
						}

					}
						break;

					default:
						break loop62;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 60, varDeclPartList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclPartList"

	/**
	 * The Class varDeclPart_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class varDeclPart_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "varDeclPart"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:340:1:
	// varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
	/**
	 * Var decl part.
	 * 
	 * @return the tiny haxe try1 parser.var decl part_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
		retval.start = this.input.LT(1);
		int varDeclPart_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER288 = null;
		TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt289 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt290 = null;

		TinyHaxeTry1Parser.varInit_return varInit291 = null;

		Object IDENTIFIER288_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 61)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:341:2:
			// ( IDENTIFIER propDeclOpt typeTagOpt varInit )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:341:4:
			// IDENTIFIER propDeclOpt typeTagOpt varInit
			{
				root_0 = (Object) this.adaptor.nil();

				IDENTIFIER288 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_varDeclPart2882);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IDENTIFIER288_tree = new VarUsage(IDENTIFIER288);
					this.adaptor.addChild(root_0, IDENTIFIER288_tree);
				}
				this.pushFollow(FOLLOW_propDeclOpt_in_varDeclPart2887);
				propDeclOpt289 = this.propDeclOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, propDeclOpt289.getTree());
				}
				this.pushFollow(FOLLOW_typeTagOpt_in_varDeclPart2889);
				typeTagOpt290 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, typeTagOpt290.getTree());
				}
				this.pushFollow(FOLLOW_varInit_in_varDeclPart2891);
				varInit291 = this.varInit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varInit291.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 61, varDeclPart_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclPart"

	/**
	 * The Class propDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class propDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "propDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:1:
	// propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
	// PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
	/**
	 * Prop decl.
	 * 
	 * @return the tiny haxe try1 parser.prop decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.propDecl_return propDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
		retval.start = this.input.LT(1);
		int propDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token LPAREN292 = null;
		Token COMMA293 = null;
		Token RPAREN294 = null;
		TinyHaxeTry1Parser.propAccessor_return a1 = null;

		TinyHaxeTry1Parser.propAccessor_return a2 = null;

		Object LPAREN292_tree = null;
		Object COMMA293_tree = null;
		Object RPAREN294_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				this.adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_propAccessor = new RewriteRuleSubtreeStream(
				this.adaptor, "rule propAccessor");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 62)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:9:
			// ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
			// PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:11:
			// LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
			{
				LPAREN292 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_propDecl2901);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN292);
				}

				this.pushFollow(FOLLOW_propAccessor_in_propDecl2905);
				a1 = this.propAccessor();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propAccessor.add(a1.getTree());
				}
				COMMA293 = (Token) this.match(this.input, COMMA,
						FOLLOW_COMMA_in_propDecl2907);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_COMMA.add(COMMA293);
				}

				this.pushFollow(FOLLOW_propAccessor_in_propDecl2911);
				a2 = this.propAccessor();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_propAccessor.add(a2.getTree());
				}
				RPAREN294 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_propDecl2913);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN294);
				}

				// AST REWRITE
				// elements: a2, a1
				// token labels:
				// rule labels: retval, a1, a2
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_a1 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule a1", a1 != null ? a1.tree
									: null);
					RewriteRuleSubtreeStream stream_a2 = new RewriteRuleSubtreeStream(
							this.adaptor, "rule a2", a2 != null ? a2.tree
									: null);

					root_0 = (Object) this.adaptor.nil();
					// 344:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] (
					// $a1)? ( $a2)? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:66:
						// ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? (
						// $a2)? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(PROPERTY_DECL,
											"PROPERTY_DECL", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:124:
							// ( $a1)?
							if (stream_a1.hasNext()) {
								this.adaptor.addChild(root_1, stream_a1
										.nextTree());

							}
							stream_a1.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:129:
							// ( $a2)?
							if (stream_a2.hasNext()) {
								this.adaptor.addChild(root_1, stream_a2
										.nextTree());

							}
							stream_a2.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 62, propDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propDecl"

	/**
	 * The Class propAccessor_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class propAccessor_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "propAccessor"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:347:1:
	// propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
	/**
	 * Prop accessor.
	 * 
	 * @return the tiny haxe try1 parser.prop accessor_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.propAccessor_return propAccessor()
			throws RecognitionException {
		TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
		retval.start = this.input.LT(1);
		int propAccessor_StartIndex = this.input.index();
		Object root_0 = null;

		Token set295 = null;

		Object set295_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 63)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:348:2:
			// ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
			{
				root_0 = (Object) this.adaptor.nil();

				set295 = (Token) this.input.LT(1);
				if (this.input.LA(1) == IDENTIFIER
						|| this.input.LA(1) == DYNAMIC
						|| this.input.LA(1) == DEFAULT
						|| this.input.LA(1) == NULL) {
					this.input.consume();
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, (Object) this.adaptor
								.create(set295));
					}
					this.state.errorRecovery = false;
					this.state.failed = false;
				} else {
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, this.input);
					throw mse;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 63, propAccessor_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propAccessor"

	/**
	 * The Class propDeclOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class propDeclOpt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "propDeclOpt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:1:
	// propDeclOpt : ( propDecl | );
	/**
	 * Prop decl opt.
	 * 
	 * @return the tiny haxe try1 parser.prop decl opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
		retval.start = this.input.LT(1);
		int propDeclOpt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.propDecl_return propDecl296 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 64)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:2:
			// ( propDecl | )
			int alt63 = 2;
			int LA63_0 = this.input.LA(1);

			if ((LA63_0 == LPAREN)) {
				alt63 = 1;
			} else if ((LA63_0 == EOF || LA63_0 == SEMI || LA63_0 == COMMA
					|| LA63_0 == EQ || LA63_0 == RPAREN || LA63_0 == COLON || LA63_0 == LBRACE)) {
				alt63 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 63, 0,
						this.input);

				throw nvae;
			}
			switch (alt63) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:4:
				// propDecl
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_propDecl_in_propDeclOpt2973);
				propDecl296 = this.propDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, propDecl296.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:357:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 64, propDeclOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propDeclOpt"

	/**
	 * The Class varInit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class varInit_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "varInit"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:1:
	// varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
	/**
	 * Var init.
	 * 
	 * @return the tiny haxe try1 parser.var init_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.varInit_return varInit()
			throws RecognitionException {
		TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
		retval.start = this.input.LT(1);
		int varInit_StartIndex = this.input.index();
		Object root_0 = null;

		Token EQ297 = null;
		TinyHaxeTry1Parser.expr_return expr298 = null;

		Object EQ297_tree = null;
		RewriteRuleTokenStream stream_EQ = new RewriteRuleTokenStream(
				this.adaptor, "token EQ");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				this.adaptor, "rule expr");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 65)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:9:
			// ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
			int alt64 = 2;
			int LA64_0 = this.input.LA(1);

			if ((LA64_0 == EQ)) {
				alt64 = 1;
			} else if ((LA64_0 == EOF || LA64_0 == SEMI || LA64_0 == COMMA || LA64_0 == RPAREN)) {
				alt64 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 64, 0,
						this.input);

				throw nvae;
			}
			switch (alt64) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:11:
				// EQ expr
			{
				EQ297 = (Token) this.match(this.input, EQ,
						FOLLOW_EQ_in_varInit2988);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_EQ.add(EQ297);
				}

				this.pushFollow(FOLLOW_expr_in_varInit2990);
				expr298 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_expr.add(expr298.getTree());
				}

				// AST REWRITE
				// elements: expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 359:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:21:
						// ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(VAR_INIT,
											"VAR_INIT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:69:
							// ( expr )?
							if (stream_expr.hasNext()) {
								this.adaptor.addChild(root_1, stream_expr
										.nextTree());

							}
							stream_expr.reset();

							this.adaptor.addChild(root_0, this
									.setLeftRightPositions(root_1));
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:361:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 65, varInit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varInit"

	/**
	 * The Class funcDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class funcDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "funcDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:1:
	// funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
	// typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER
	// typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION
	// IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? (
	// typeParamOpt )? ) );
	/**
	 * Func decl.
	 * 
	 * @return the tiny haxe try1 parser.func decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.funcDecl_return funcDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
		retval.start = this.input.LT(1);
		int funcDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token FUNCTION300 = null;
		Token NEW301 = null;
		Token LPAREN302 = null;
		Token RPAREN304 = null;
		Token FUNCTION308 = null;
		Token IDENTIFIER309 = null;
		Token LPAREN311 = null;
		Token RPAREN313 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList299 = null;

		TinyHaxeTry1Parser.paramList_return paramList303 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt305 = null;

		TinyHaxeTry1Parser.block_return block306 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList307 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt310 = null;

		TinyHaxeTry1Parser.paramList_return paramList312 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt314 = null;

		TinyHaxeTry1Parser.block_return block315 = null;

		Object FUNCTION300_tree = null;
		Object NEW301_tree = null;
		Object LPAREN302_tree = null;
		Object RPAREN304_tree = null;
		Object FUNCTION308_tree = null;
		Object IDENTIFIER309_tree = null;
		Object LPAREN311_tree = null;
		Object RPAREN313_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				this.adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(
				this.adaptor, "token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				this.adaptor, "rule block");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeParamOpt");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 66)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:9:
			// ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
			// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList
			// )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION
			// IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
			// -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? (
			// typeTagOpt )? ( block )? ( typeParamOpt )? ) )
			int alt67 = 2;
			alt67 = this.dfa67.predict(this.input);
			switch (alt67) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:11:
				// ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
				// typeTagOpt block
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:11:
				// ( declAttrList )?
				int alt65 = 2;
				int LA65_0 = this.input.LA(1);

				if (((LA65_0 >= PUBLIC && LA65_0 <= OVERRIDE))) {
					alt65 = 1;
				}
				switch (alt65) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					this.pushFollow(FOLLOW_declAttrList_in_funcDecl3016);
					declAttrList299 = this.declAttrList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_declAttrList.add(declAttrList299.getTree());
					}

				}
					break;

				}

				FUNCTION300 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3019);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION300);
				}

				NEW301 = (Token) this.match(this.input, NEW,
						FOLLOW_NEW_in_funcDecl3021);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NEW.add(NEW301);
				}

				LPAREN302 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3023);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN302);
				}

				this.pushFollow(FOLLOW_paramList_in_funcDecl3025);
				paramList303 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList303.getTree());
				}
				RPAREN304 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3027);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN304);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcDecl3029);
				typeTagOpt305 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt305.getTree());
				}
				this.pushFollow(FOLLOW_block_in_funcDecl3031);
				block306 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block306.getTree());
				}

				// AST REWRITE
				// elements: block, FUNCTION, typeTagOpt, NEW, paramList,
				// declAttrList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 364:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList
					// )? ( typeTagOpt )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:7:
						// ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
						// typeTagOpt )? ( block )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							this.adaptor
									.addChild(root_1, stream_NEW.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:36:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:50:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:61:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:73:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:365:4:
				// ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN
				// paramList RPAREN typeTagOpt block
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:365:4:
				// ( declAttrList )?
				int alt66 = 2;
				int LA66_0 = this.input.LA(1);

				if (((LA66_0 >= PUBLIC && LA66_0 <= OVERRIDE))) {
					alt66 = 1;
				}
				switch (alt66) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					this.pushFollow(FOLLOW_declAttrList_in_funcDecl3064);
					declAttrList307 = this.declAttrList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_declAttrList.add(declAttrList307.getTree());
					}

				}
					break;

				}

				FUNCTION308 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3067);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION308);
				}

				IDENTIFIER309 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcDecl3069);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER309);
				}

				this.pushFollow(FOLLOW_typeParamOpt_in_funcDecl3071);
				typeParamOpt310 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParamOpt.add(typeParamOpt310.getTree());
				}
				LPAREN311 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3073);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN311);
				}

				this.pushFollow(FOLLOW_paramList_in_funcDecl3075);
				paramList312 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList312.getTree());
				}
				RPAREN313 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3077);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN313);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcDecl3079);
				typeTagOpt314 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt314.getTree());
				}
				this.pushFollow(FOLLOW_block_in_funcDecl3081);
				block315 = this.block();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_block.add(block315.getTree());
				}

				// AST REWRITE
				// elements: typeTagOpt, block, IDENTIFIER, typeParamOpt,
				// FUNCTION, paramList, declAttrList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 366:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? (
					// paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )?
					// )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:6:
						// ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList
						// )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							this.adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:42:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:56:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:67:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:79:
							// ( block )?
							if (stream_block.hasNext()) {
								this.adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:86:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_typeParamOpt.nextTree());

							}
							stream_typeParamOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 66, funcDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcDecl"

	/**
	 * The Class funcProtoDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class funcProtoDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "funcProtoDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:369:1:
	// funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? (
	// declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN
	// paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? (
	// paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) |
	// FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW
	// )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt
	// LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? (
	// paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );
	/**
	 * Func proto decl.
	 * 
	 * @return the tiny haxe try1 parser.func proto decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
		retval.start = this.input.LT(1);
		int funcProtoDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token FUNCTION317 = null;
		Token NEW318 = null;
		Token LPAREN319 = null;
		Token RPAREN321 = null;
		Token SEMI323 = null;
		Token FUNCTION325 = null;
		Token IDENTIFIER326 = null;
		Token LPAREN328 = null;
		Token RPAREN330 = null;
		Token SEMI332 = null;
		Token FUNCTION333 = null;
		Token NEW334 = null;
		Token LPAREN335 = null;
		Token RPAREN337 = null;
		Token SEMI339 = null;
		Token FUNCTION340 = null;
		Token IDENTIFIER341 = null;
		Token LPAREN343 = null;
		Token RPAREN345 = null;
		Token SEMI347 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList316 = null;

		TinyHaxeTry1Parser.paramList_return paramList320 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt322 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList324 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt327 = null;

		TinyHaxeTry1Parser.paramList_return paramList329 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt331 = null;

		TinyHaxeTry1Parser.paramList_return paramList336 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt338 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt342 = null;

		TinyHaxeTry1Parser.paramList_return paramList344 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt346 = null;

		Object FUNCTION317_tree = null;
		Object NEW318_tree = null;
		Object LPAREN319_tree = null;
		Object RPAREN321_tree = null;
		Object SEMI323_tree = null;
		Object FUNCTION325_tree = null;
		Object IDENTIFIER326_tree = null;
		Object LPAREN328_tree = null;
		Object RPAREN330_tree = null;
		Object SEMI332_tree = null;
		Object FUNCTION333_tree = null;
		Object NEW334_tree = null;
		Object LPAREN335_tree = null;
		Object RPAREN337_tree = null;
		Object SEMI339_tree = null;
		Object FUNCTION340_tree = null;
		Object IDENTIFIER341_tree = null;
		Object LPAREN343_tree = null;
		Object RPAREN345_tree = null;
		Object SEMI347_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				this.adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(
				this.adaptor, "token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				this.adaptor, "token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				this.adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeParamOpt");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 67)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:2:
			// ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
			// SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? (
			// declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt
			// LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION (
			// IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? (
			// typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN
			// typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? (
			// typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN
			// paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? (
			// paramList )? ( typeTagOpt )? ( typeParamOpt )? ) )
			int alt68 = 4;
			alt68 = this.dfa68.predict(this.input);
			switch (alt68) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:4:
				// declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
				// SEMI
			{
				this.pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3122);
				declAttrList316 = this.declAttrList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_declAttrList.add(declAttrList316.getTree());
				}
				FUNCTION317 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3124);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION317);
				}

				NEW318 = (Token) this.match(this.input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3126);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NEW.add(NEW318);
				}

				LPAREN319 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3128);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN319);
				}

				this.pushFollow(FOLLOW_paramList_in_funcProtoDecl3130);
				paramList320 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList320.getTree());
				}
				RPAREN321 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3132);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN321);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3134);
				typeTagOpt322 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt322.getTree());
				}
				SEMI323 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3136);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI323);
				}

				// AST REWRITE
				// elements: declAttrList, FUNCTION, paramList, typeTagOpt, NEW
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 371:4: -> ^( FUNCTION ( NEW )? ( paramList )? (
					// typeTagOpt )? ( declAttrList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:7:
						// ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? (
						// declAttrList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:18:
							// ( NEW )?
							if (stream_NEW.hasNext()) {
								this.adaptor.addChild(root_1, stream_NEW
										.nextNode());

							}
							stream_NEW.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:23:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:34:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:46:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:372:4:
				// declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN
				// paramList RPAREN typeTagOpt SEMI
			{
				this.pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3163);
				declAttrList324 = this.declAttrList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_declAttrList.add(declAttrList324.getTree());
				}
				FUNCTION325 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3165);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION325);
				}

				IDENTIFIER326 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3167);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER326);
				}

				this.pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3169);
				typeParamOpt327 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParamOpt.add(typeParamOpt327.getTree());
				}
				LPAREN328 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3171);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN328);
				}

				this.pushFollow(FOLLOW_paramList_in_funcProtoDecl3173);
				paramList329 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList329.getTree());
				}
				RPAREN330 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3175);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN330);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3177);
				typeTagOpt331 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt331.getTree());
				}
				SEMI332 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3179);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI332);
				}

				// AST REWRITE
				// elements: typeParamOpt, typeTagOpt, paramList, declAttrList,
				// IDENTIFIER, FUNCTION
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 373:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
					// typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:6:
						// ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
						// typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:17:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:29:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:40:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:52:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_declAttrList.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:66:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_typeParamOpt.nextTree());

							}
							stream_typeParamOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:374:4:
				// FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
			{
				FUNCTION333 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3208);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION333);
				}

				NEW334 = (Token) this.match(this.input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3210);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_NEW.add(NEW334);
				}

				LPAREN335 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3212);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN335);
				}

				this.pushFollow(FOLLOW_paramList_in_funcProtoDecl3214);
				paramList336 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList336.getTree());
				}
				RPAREN337 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3216);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN337);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3218);
				typeTagOpt338 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt338.getTree());
				}
				SEMI339 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3220);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI339);
				}

				// AST REWRITE
				// elements: paramList, FUNCTION, NEW, typeTagOpt
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 375:4: -> ^( FUNCTION ( NEW )? ( paramList )? (
					// typeTagOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:7:
						// ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:18:
							// ( NEW )?
							if (stream_NEW.hasNext()) {
								this.adaptor.addChild(root_1, stream_NEW
										.nextNode());

							}
							stream_NEW.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:23:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:34:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:376:4:
				// FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN
				// typeTagOpt SEMI
			{
				FUNCTION340 = (Token) this.match(this.input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3244);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FUNCTION.add(FUNCTION340);
				}

				IDENTIFIER341 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3246);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER341);
				}

				this.pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3248);
				typeParamOpt342 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParamOpt.add(typeParamOpt342.getTree());
				}
				LPAREN343 = (Token) this.match(this.input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3250);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LPAREN.add(LPAREN343);
				}

				this.pushFollow(FOLLOW_paramList_in_funcProtoDecl3252);
				paramList344 = this.paramList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_paramList.add(paramList344.getTree());
				}
				RPAREN345 = (Token) this.match(this.input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3254);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RPAREN.add(RPAREN345);
				}

				this.pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3256);
				typeTagOpt346 = this.typeTagOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeTagOpt.add(typeTagOpt346.getTree());
				}
				SEMI347 = (Token) this.match(this.input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3258);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_SEMI.add(SEMI347);
				}

				// AST REWRITE
				// elements: IDENTIFIER, FUNCTION, typeParamOpt, typeTagOpt,
				// paramList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 377:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
					// typeTagOpt )? ( typeParamOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:6:
						// ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
						// typeTagOpt )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:17:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								this.adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:29:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								this.adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:40:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								this.adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:52:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_typeParamOpt.nextTree());

							}
							stream_typeParamOpt.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 67, funcProtoDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcProtoDecl"

	/**
	 * The Class classDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class classDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "classDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:380:1:
	// classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt lb=
	// LBRACE classBodyScope[$lb] RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? (
	// typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? RBRACE[$RBRACE,
	// true] ) ;
	/**
	 * Class decl.
	 * 
	 * @return the tiny haxe try1 parser.class decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.classDecl_return classDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
		retval.start = this.input.LT(1);
		int classDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token lb = null;
		Token EXTERN348 = null;
		Token CLASS349 = null;
		Token IDENTIFIER350 = null;
		Token RBRACE354 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt351 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt352 = null;

		TinyHaxeTry1Parser.classBodyScope_return classBodyScope353 = null;

		Object lb_tree = null;
		Object EXTERN348_tree = null;
		Object CLASS349_tree = null;
		Object IDENTIFIER350_tree = null;
		Object RBRACE354_tree = null;
		RewriteRuleTokenStream stream_EXTERN = new RewriteRuleTokenStream(
				this.adaptor, "token EXTERN");
		RewriteRuleTokenStream stream_CLASS = new RewriteRuleTokenStream(
				this.adaptor, "token CLASS");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				this.adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				this.adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_classBodyScope = new RewriteRuleSubtreeStream(
				this.adaptor, "rule classBodyScope");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule typeParamOpt");
		RewriteRuleSubtreeStream stream_inheritListOpt = new RewriteRuleSubtreeStream(
				this.adaptor, "rule inheritListOpt");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 68)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:381:2:
			// ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt lb=
			// LBRACE classBodyScope[$lb] RBRACE -> ^( CLASS IDENTIFIER ( EXTERN
			// )? ( typeParamOpt )? ( inheritListOpt )? ( classBodyScope )?
			// RBRACE[$RBRACE, true] ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:381:4:
			// ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt lb=
			// LBRACE classBodyScope[$lb] RBRACE
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:381:4:
				// ( EXTERN )?
				int alt69 = 2;
				int LA69_0 = this.input.LA(1);

				if ((LA69_0 == EXTERN)) {
					alt69 = 1;
				}
				switch (alt69) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// EXTERN
				{
					EXTERN348 = (Token) this.match(this.input, EXTERN,
							FOLLOW_EXTERN_in_classDecl3291);
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						stream_EXTERN.add(EXTERN348);
					}

				}
					break;

				}

				CLASS349 = (Token) this.match(this.input, CLASS,
						FOLLOW_CLASS_in_classDecl3294);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CLASS.add(CLASS349);
				}

				IDENTIFIER350 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_classDecl3296);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IDENTIFIER.add(IDENTIFIER350);
				}

				this.pushFollow(FOLLOW_typeParamOpt_in_classDecl3298);
				typeParamOpt351 = this.typeParamOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_typeParamOpt.add(typeParamOpt351.getTree());
				}
				this.pushFollow(FOLLOW_inheritListOpt_in_classDecl3300);
				inheritListOpt352 = this.inheritListOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_inheritListOpt.add(inheritListOpt352.getTree());
				}
				lb = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_classDecl3304);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LBRACE.add(lb);
				}

				this.pushFollow(FOLLOW_classBodyScope_in_classDecl3306);
				classBodyScope353 = this.classBodyScope(lb);

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_classBodyScope.add(classBodyScope353.getTree());
				}
				RBRACE354 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_classDecl3309);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_RBRACE.add(RBRACE354);
				}

				// AST REWRITE
				// elements: inheritListOpt, classBodyScope, EXTERN,
				// typeParamOpt, RBRACE, CLASS, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 382:4: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt
					// )? ( inheritListOpt )? ( classBodyScope )?
					// RBRACE[$RBRACE, true] )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:7:
						// ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? (
						// inheritListOpt )? ( classBodyScope )? RBRACE[$RBRACE,
						// true] )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ClassNode(stream_CLASS.nextToken()),
									root_1);

							this.adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:37:
							// ( EXTERN )?
							if (stream_EXTERN.hasNext()) {
								this.adaptor.addChild(root_1, stream_EXTERN
										.nextNode());

							}
							stream_EXTERN.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:45:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_typeParamOpt.nextTree());

							}
							stream_typeParamOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:59:
							// ( inheritListOpt )?
							if (stream_inheritListOpt.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_inheritListOpt.nextTree());

							}
							stream_inheritListOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:75:
							// ( classBodyScope )?
							if (stream_classBodyScope.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_classBodyScope.nextTree());

							}
							stream_classBodyScope.reset();
							if (root_1 instanceof ClassNode) {
								int childCount = ((ClassNode) root_1)
										.getChildCount();
								if (childCount > 0) {
									if (((ClassNode) root_1)
											.getChild(childCount - 1) instanceof BlockScopeNode) {
										BlockScopeNode blockScopeNode = (BlockScopeNode) ((ClassNode) root_1)
												.getChild(childCount - 1);
										blockScopeNode
												.setrBracketPosition(((CommonToken) RBRACE354)
														.getStartIndex());
									}
								}
							}
							// adaptor.addChild(root_1, new
							// ExtendedCommonTree(RBRACE, RBRACE374, true));

							this.adaptor.addChild(root_0, root_1);

						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 68, classDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classDecl"

	/**
	 * The Class classBodyScope_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class classBodyScope_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "classBodyScope"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:385:1:
	// classBodyScope[Token lBracket] : classBody -> ^(
	// BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] ( classBody )? ) ;
	/**
	 * Class body scope.
	 * 
	 * @param lBracket
	 *            the l bracket
	 * @return the tiny haxe try1 parser.class body scope_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope(
			final Token lBracket) throws RecognitionException {
		TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
		retval.start = this.input.LT(1);
		int classBodyScope_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classBody_return classBody355 = null;

		RewriteRuleSubtreeStream stream_classBody = new RewriteRuleSubtreeStream(
				this.adaptor, "rule classBody");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 69)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:2:
			// ( classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] (
			// classBody )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:4:
			// classBody
			{
				this.pushFollow(FOLLOW_classBody_in_classBodyScope3355);
				classBody355 = this.classBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_classBody.add(classBody355.getTree());
				}

				// AST REWRITE
				// elements: classBody
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 386:14: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,
					// $lBracket] ( classBody )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:17:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] (
						// classBody )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true, lBracket),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:78:
							// ( classBody )?
							if (stream_classBody.hasNext()) {
								this.adaptor.addChild(root_1, stream_classBody
										.nextTree());

							}
							stream_classBody.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 69, classBodyScope_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBodyScope"

	/**
	 * The Class classBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class classBody_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "classBody"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:389:1:
	// classBody : ( varDecl classBody | funcDecl classBody | enumDecl classBody
	// | );
	/**
	 * Class body.
	 * 
	 * @return the tiny haxe try1 parser.class body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.classBody_return classBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
		retval.start = this.input.LT(1);
		int classBody_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl356 = null;

		TinyHaxeTry1Parser.classBody_return classBody357 = null;

		TinyHaxeTry1Parser.funcDecl_return funcDecl358 = null;

		TinyHaxeTry1Parser.classBody_return classBody359 = null;

		TinyHaxeTry1Parser.enumDecl_return enumDecl360 = null;

		TinyHaxeTry1Parser.classBody_return classBody361 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 70)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:390:2:
			// ( varDecl classBody | funcDecl classBody | enumDecl classBody | )
			int alt70 = 4;
			alt70 = this.dfa70.predict(this.input);
			switch (alt70) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:390:4:
				// varDecl classBody
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDecl_in_classBody3379);
				varDecl356 = this.varDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDecl356.getTree());
				}
				this.pushFollow(FOLLOW_classBody_in_classBody3381);
				classBody357 = this.classBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, classBody357.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:391:4:
				// funcDecl classBody
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_funcDecl_in_classBody3386);
				funcDecl358 = this.funcDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcDecl358.getTree());
				}
				this.pushFollow(FOLLOW_classBody_in_classBody3388);
				classBody359 = this.classBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, classBody359.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:393:4:
				// enumDecl classBody
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_enumDecl_in_classBody3394);
				enumDecl360 = this.enumDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, enumDecl360.getTree());
				}
				this.pushFollow(FOLLOW_classBody_in_classBody3396);
				classBody361 = this.classBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, classBody361.getTree());
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:395:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 70, classBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBody"

	/**
	 * The Class interfaceDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class interfaceDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "interfaceDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:397:1:
	// interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
	// ;
	/**
	 * Interface decl.
	 * 
	 * @return the tiny haxe try1 parser.interface decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
		retval.start = this.input.LT(1);
		int interfaceDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token INTERFACE362 = null;
		Token LBRACE365 = null;
		Token RBRACE367 = null;
		TinyHaxeTry1Parser.type_return type363 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt364 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody366 = null;

		Object INTERFACE362_tree = null;
		Object LBRACE365_tree = null;
		Object RBRACE367_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 71)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:398:2:
			// ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:398:4:
			// INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
			{
				root_0 = (Object) this.adaptor.nil();

				INTERFACE362 = (Token) this.match(this.input, INTERFACE,
						FOLLOW_INTERFACE_in_interfaceDecl3416);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					INTERFACE362_tree = (Object) this.adaptor
							.create(INTERFACE362);
					this.adaptor.addChild(root_0, INTERFACE362_tree);
				}
				this.pushFollow(FOLLOW_type_in_interfaceDecl3418);
				type363 = this.type();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, type363.getTree());
				}
				this.pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3420);
				inheritListOpt364 = this.inheritListOpt();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, inheritListOpt364.getTree());
				}
				LBRACE365 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_interfaceDecl3422);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3425);
				interfaceBody366 = this.interfaceBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, interfaceBody366.getTree());
				}
				RBRACE367 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_interfaceDecl3427);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 71, interfaceDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "interfaceDecl"

	/**
	 * The Class interfaceBody_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class interfaceBody_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "interfaceBody"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:401:1:
	// interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |
	// );
	/**
	 * Interface body.
	 * 
	 * @return the tiny haxe try1 parser.interface body_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
		retval.start = this.input.LT(1);
		int interfaceBody_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl368 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody369 = null;

		TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl370 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody371 = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 72)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:402:2:
			// ( varDecl interfaceBody | funcProtoDecl interfaceBody | )
			int alt71 = 3;
			alt71 = this.dfa71.predict(this.input);
			switch (alt71) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:402:4:
				// varDecl interfaceBody
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_varDecl_in_interfaceBody3440);
				varDecl368 = this.varDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, varDecl368.getTree());
				}
				this.pushFollow(FOLLOW_interfaceBody_in_interfaceBody3442);
				interfaceBody369 = this.interfaceBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, interfaceBody369.getTree());
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:403:4:
				// funcProtoDecl interfaceBody
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3447);
				funcProtoDecl370 = this.funcProtoDecl();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcProtoDecl370.getTree());
				}
				this.pushFollow(FOLLOW_interfaceBody_in_interfaceBody3449);
				interfaceBody371 = this.interfaceBody();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, interfaceBody371.getTree());
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:406:2:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 72, interfaceBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "interfaceBody"

	/**
	 * The Class inheritList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class inheritList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "inheritList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:408:1:
	// inheritList : inherit ( COMMA inherit )* ;
	/**
	 * Inherit list.
	 * 
	 * @return the tiny haxe try1 parser.inherit list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.inheritList_return inheritList()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
		retval.start = this.input.LT(1);
		int inheritList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA373 = null;
		TinyHaxeTry1Parser.inherit_return inherit372 = null;

		TinyHaxeTry1Parser.inherit_return inherit374 = null;

		Object COMMA373_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 73)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:2:
			// ( inherit ( COMMA inherit )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:4:
			// inherit ( COMMA inherit )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_inherit_in_inheritList3471);
				inherit372 = this.inherit();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, inherit372.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:12:
				// ( COMMA inherit )*
				loop72: do {
					int alt72 = 2;
					int LA72_0 = this.input.LA(1);

					if ((LA72_0 == COMMA)) {
						alt72 = 1;
					}

					switch (alt72) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:13:
						// COMMA inherit
					{
						COMMA373 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_inheritList3474);
						if (this.state.failed) {
							return retval;
						}
						this.pushFollow(FOLLOW_inherit_in_inheritList3477);
						inherit374 = this.inherit();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, inherit374.getTree());
						}

					}
						break;

					default:
						break loop72;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 73, inheritList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inheritList"

	/**
	 * The Class inheritListOpt_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class inheritListOpt_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "inheritListOpt"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:412:1:
	// inheritListOpt : ( inheritList -> ^(
	// INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
	/**
	 * Inherit list opt.
	 * 
	 * @return the tiny haxe try1 parser.inherit list opt_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
		retval.start = this.input.LT(1);
		int inheritListOpt_StartIndex = this.input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.inheritList_return inheritList375 = null;

		RewriteRuleSubtreeStream stream_inheritList = new RewriteRuleSubtreeStream(
				this.adaptor, "rule inheritList");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 74)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:2:
			// ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] (
			// inheritList )? ) | )
			int alt73 = 2;
			int LA73_0 = this.input.LA(1);

			if (((LA73_0 >= EXTENDS && LA73_0 <= IMPLEMENTS))) {
				alt73 = 1;
			} else if ((LA73_0 == LBRACE)) {
				alt73 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 73, 0,
						this.input);

				throw nvae;
			}
			switch (alt73) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:4:
				// inheritList
			{
				this.pushFollow(FOLLOW_inheritList_in_inheritListOpt3495);
				inheritList375 = this.inheritList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_inheritList.add(inheritList375.getTree());
				}

				// AST REWRITE
				// elements: inheritList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 413:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true]
					// ( inheritList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:18:
						// ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] (
						// inheritList )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									new ExtendedCommonTree(INHERIT_LIST_OPT,
											"INHERIT_LIST_OPT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:82:
							// ( inheritList )?
							if (stream_inheritList.hasNext()) {
								this.adaptor.addChild(root_1,
										stream_inheritList.nextTree());

							}
							stream_inheritList.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:415:6:
			{
				root_0 = (Object) this.adaptor.nil();

			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 74, inheritListOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inheritListOpt"

	/**
	 * The Class inherit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class inherit_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "inherit"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:1:
	// inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type ->
	// ^( IMPLEMENTS ( type )? ) );
	/**
	 * Inherit.
	 * 
	 * @return the tiny haxe try1 parser.inherit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.inherit_return inherit()
			throws RecognitionException {
		TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
		retval.start = this.input.LT(1);
		int inherit_StartIndex = this.input.index();
		Object root_0 = null;

		Token EXTENDS376 = null;
		Token IMPLEMENTS378 = null;
		TinyHaxeTry1Parser.type_return type377 = null;

		TinyHaxeTry1Parser.type_return type379 = null;

		Object EXTENDS376_tree = null;
		Object IMPLEMENTS378_tree = null;
		RewriteRuleTokenStream stream_IMPLEMENTS = new RewriteRuleTokenStream(
				this.adaptor, "token IMPLEMENTS");
		RewriteRuleTokenStream stream_EXTENDS = new RewriteRuleTokenStream(
				this.adaptor, "token EXTENDS");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
				this.adaptor, "rule type");
		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 75)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:9:
			// ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^(
			// IMPLEMENTS ( type )? ) )
			int alt74 = 2;
			int LA74_0 = this.input.LA(1);

			if ((LA74_0 == EXTENDS)) {
				alt74 = 1;
			} else if ((LA74_0 == IMPLEMENTS)) {
				alt74 = 2;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 74, 0,
						this.input);

				throw nvae;
			}
			switch (alt74) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:11:
				// EXTENDS type
			{
				EXTENDS376 = (Token) this.match(this.input, EXTENDS,
						FOLLOW_EXTENDS_in_inherit3530);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_EXTENDS.add(EXTENDS376);
				}

				this.pushFollow(FOLLOW_type_in_inherit3532);
				type377 = this.type();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_type.add(type377.getTree());
				}

				// AST REWRITE
				// elements: EXTENDS, type
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 417:25: -> ^( EXTENDS ( type )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:28:
						// ^( EXTENDS ( type )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_EXTENDS.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:38:
							// ( type )?
							if (stream_type.hasNext()) {
								this.adaptor.addChild(root_1, stream_type
										.nextTree());

							}
							stream_type.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:11:
				// IMPLEMENTS type
			{
				IMPLEMENTS378 = (Token) this.match(this.input, IMPLEMENTS,
						FOLLOW_IMPLEMENTS_in_inherit3554);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_IMPLEMENTS.add(IMPLEMENTS378);
				}

				this.pushFollow(FOLLOW_type_in_inherit3556);
				type379 = this.type();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_type.add(type379.getTree());
				}

				// AST REWRITE
				// elements: IMPLEMENTS, type
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 418:27: -> ^( IMPLEMENTS ( type )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:30:
						// ^( IMPLEMENTS ( type )? )
						{
							Object root_1 = (Object) this.adaptor.nil();
							root_1 = (Object) this.adaptor.becomeRoot(
									stream_IMPLEMENTS.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:43:
							// ( type )?
							if (stream_type.hasNext()) {
								this.adaptor.addChild(root_1, stream_type
										.nextTree());

							}
							stream_type.reset();

							this.adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 75, inherit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inherit"

	/**
	 * The Class typedefDecl_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typedefDecl_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typedefDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:421:1:
	// typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
	/**
	 * Typedef decl.
	 * 
	 * @return the tiny haxe try1 parser.typedef decl_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
		retval.start = this.input.LT(1);
		int typedefDecl_StartIndex = this.input.index();
		Object root_0 = null;

		Token TYPEDEF380 = null;
		Token IDENTIFIER381 = null;
		Token EQ382 = null;
		TinyHaxeTry1Parser.funcType_return funcType383 = null;

		Object TYPEDEF380_tree = null;
		Object IDENTIFIER381_tree = null;
		Object EQ382_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 76)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:422:2:
			// ( TYPEDEF IDENTIFIER EQ funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:422:4:
			// TYPEDEF IDENTIFIER EQ funcType
			{
				root_0 = (Object) this.adaptor.nil();

				TYPEDEF380 = (Token) this.match(this.input, TYPEDEF,
						FOLLOW_TYPEDEF_in_typedefDecl3584);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					TYPEDEF380_tree = (Object) this.adaptor.create(TYPEDEF380);
					this.adaptor.addChild(root_0, TYPEDEF380_tree);
				}
				IDENTIFIER381 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typedefDecl3586);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IDENTIFIER381_tree = (Object) this.adaptor
							.create(IDENTIFIER381);
					this.adaptor.addChild(root_0, IDENTIFIER381_tree);
				}
				EQ382 = (Token) this.match(this.input, EQ,
						FOLLOW_EQ_in_typedefDecl3588);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					EQ382_tree = (Object) this.adaptor.create(EQ382);
					this.adaptor.addChild(root_0, EQ382_tree);
				}
				this.pushFollow(FOLLOW_funcType_in_typedefDecl3590);
				funcType383 = this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcType383.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 76, typedefDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typedefDecl"

	/**
	 * The Class typeExtend_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class typeExtend_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "typeExtend"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:425:1:
	// typeExtend : GT funcType COMMA ;
	/**
	 * Type extend.
	 * 
	 * @return the tiny haxe try1 parser.type extend_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.typeExtend_return typeExtend()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
		retval.start = this.input.LT(1);
		int typeExtend_StartIndex = this.input.index();
		Object root_0 = null;

		Token GT384 = null;
		Token COMMA386 = null;
		TinyHaxeTry1Parser.funcType_return funcType385 = null;

		Object GT384_tree = null;
		Object COMMA386_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 77)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:426:9:
			// ( GT funcType COMMA )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:426:11:
			// GT funcType COMMA
			{
				root_0 = (Object) this.adaptor.nil();

				GT384 = (Token) this.match(this.input, GT,
						FOLLOW_GT_in_typeExtend3609);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					GT384_tree = (Object) this.adaptor.create(GT384);
					this.adaptor.addChild(root_0, GT384_tree);
				}
				this.pushFollow(FOLLOW_funcType_in_typeExtend3611);
				funcType385 = this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcType385.getTree());
				}
				COMMA386 = (Token) this.match(this.input, COMMA,
						FOLLOW_COMMA_in_typeExtend3613);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 77, typeExtend_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeExtend"

	/**
	 * The Class anonType_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class anonType_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "anonType"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:1:
	// anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
	// anonTypeFieldList | varDeclList ) ) RBRACE ;
	/**
	 * Anon type.
	 * 
	 * @return the tiny haxe try1 parser.anon type_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.anonType_return anonType()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
		retval.start = this.input.LT(1);
		int anonType_StartIndex = this.input.index();
		Object root_0 = null;

		Token LBRACE387 = null;
		Token RBRACE393 = null;
		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList388 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList389 = null;

		TinyHaxeTry1Parser.typeExtend_return typeExtend390 = null;

		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList391 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList392 = null;

		Object LBRACE387_tree = null;
		Object RBRACE393_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 78)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:9:
			// ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:11:
			// LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE
			{
				root_0 = (Object) this.adaptor.nil();

				LBRACE387 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_anonType3624);
				if (this.state.failed) {
					return retval;
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:430:4:
				// ( | anonTypeFieldList | varDeclList | typeExtend ( |
				// anonTypeFieldList | varDeclList ) )
				int alt76 = 4;
				switch (this.input.LA(1)) {
				case RBRACE: {
					alt76 = 1;
				}
					break;
				case IDENTIFIER: {
					alt76 = 2;
				}
					break;
				case PUBLIC:
				case PRIVATE:
				case STATIC:
				case INLINE:
				case DYNAMIC:
				case OVERRIDE:
				case VAR: {
					alt76 = 3;
				}
					break;
				case GT: {
					alt76 = 4;
				}
					break;
				default:
					if (this.state.backtracking > 0) {
						this.state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							76, 0, this.input);

					throw nvae;
				}

				switch (alt76) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:22:
				{
				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:27:
					// anonTypeFieldList
				{
					this.pushFollow(FOLLOW_anonTypeFieldList_in_anonType3659);
					anonTypeFieldList388 = this.anonTypeFieldList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, anonTypeFieldList388
								.getTree());
					}

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:432:26:
					// varDeclList
				{
					this.pushFollow(FOLLOW_varDeclList_in_anonType3687);
					varDeclList389 = this.varDeclList();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, varDeclList389.getTree());
					}

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:433:27:
					// typeExtend ( | anonTypeFieldList | varDeclList )
				{
					this.pushFollow(FOLLOW_typeExtend_in_anonType3716);
					typeExtend390 = this.typeExtend();

					this.state._fsp--;
					if (this.state.failed) {
						return retval;
					}
					if (this.state.backtracking == 0) {
						this.adaptor.addChild(root_0, typeExtend390.getTree());
					}
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:433:38:
					// ( | anonTypeFieldList | varDeclList )
					int alt75 = 3;
					switch (this.input.LA(1)) {
					case RBRACE: {
						alt75 = 1;
					}
						break;
					case IDENTIFIER: {
						alt75 = 2;
					}
						break;
					case PUBLIC:
					case PRIVATE:
					case STATIC:
					case INLINE:
					case DYNAMIC:
					case OVERRIDE:
					case VAR: {
						alt75 = 3;
					}
						break;
					default:
						if (this.state.backtracking > 0) {
							this.state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 75, 0, this.input);

						throw nvae;
					}

					switch (alt75) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:434:24:
					{
					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:434:25:
						// anonTypeFieldList
					{
						this
								.pushFollow(FOLLOW_anonTypeFieldList_in_anonType3744);
						anonTypeFieldList391 = this.anonTypeFieldList();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, anonTypeFieldList391
									.getTree());
						}

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:25:
						// varDeclList
					{
						this.pushFollow(FOLLOW_varDeclList_in_anonType3770);
						varDeclList392 = this.varDeclList();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, varDeclList392
									.getTree());
						}

					}
						break;

					}

				}
					break;

				}

				RBRACE393 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_anonType3814);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 78, anonType_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonType"

	/**
	 * The Class anonTypeFieldList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class anonTypeFieldList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "anonTypeFieldList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:440:1:
	// anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
	/**
	 * Anon type field list.
	 * 
	 * @return the tiny haxe try1 parser.anon type field list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
		retval.start = this.input.LT(1);
		int anonTypeFieldList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA395 = null;
		TinyHaxeTry1Parser.anonTypeField_return anonTypeField394 = null;

		TinyHaxeTry1Parser.anonTypeField_return anonTypeField396 = null;

		Object COMMA395_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 79)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:2:
			// ( anonTypeField ( COMMA anonTypeField )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:4:
			// anonTypeField ( COMMA anonTypeField )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3828);
				anonTypeField394 = this.anonTypeField();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, anonTypeField394.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:18:
				// ( COMMA anonTypeField )*
				loop77: do {
					int alt77 = 2;
					int LA77_0 = this.input.LA(1);

					if ((LA77_0 == COMMA)) {
						alt77 = 1;
					}

					switch (alt77) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:19:
						// COMMA anonTypeField
					{
						COMMA395 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_anonTypeFieldList3831);
						if (this.state.failed) {
							return retval;
						}
						this
								.pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList3834);
						anonTypeField396 = this.anonTypeField();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, anonTypeField396
									.getTree());
						}

					}
						break;

					default:
						break loop77;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 79, anonTypeFieldList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonTypeFieldList"

	/**
	 * The Class objLit_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class objLit_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "objLit"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:1:
	// objLit : '{' objLitElemList '}' ;
	/**
	 * Obj lit.
	 * 
	 * @return the tiny haxe try1 parser.obj lit_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.objLit_return objLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
		retval.start = this.input.LT(1);
		int objLit_StartIndex = this.input.index();
		Object root_0 = null;

		Token char_literal397 = null;
		Token char_literal399 = null;
		TinyHaxeTry1Parser.objLitElemList_return objLitElemList398 = null;

		Object char_literal397_tree = null;
		Object char_literal399_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 80)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:8:
			// ( '{' objLitElemList '}' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:10:
			// '{' objLitElemList '}'
			{
				root_0 = (Object) this.adaptor.nil();

				char_literal397 = (Token) this.match(this.input, LBRACE,
						FOLLOW_LBRACE_in_objLit3846);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_objLitElemList_in_objLit3849);
				objLitElemList398 = this.objLitElemList();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, objLitElemList398.getTree());
				}
				char_literal399 = (Token) this.match(this.input, RBRACE,
						FOLLOW_RBRACE_in_objLit3851);
				if (this.state.failed) {
					return retval;
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 80, objLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLit"

	/**
	 * The Class anonTypeField_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class anonTypeField_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "anonTypeField"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:447:1:
	// anonTypeField : IDENTIFIER COLON funcType ;
	/**
	 * Anon type field.
	 * 
	 * @return the tiny haxe try1 parser.anon type field_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
		retval.start = this.input.LT(1);
		int anonTypeField_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER400 = null;
		Token COLON401 = null;
		TinyHaxeTry1Parser.funcType_return funcType402 = null;

		Object IDENTIFIER400_tree = null;
		Object COLON401_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 81)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:448:2:
			// ( IDENTIFIER COLON funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:448:4:
			// IDENTIFIER COLON funcType
			{
				root_0 = (Object) this.adaptor.nil();

				IDENTIFIER400 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_anonTypeField3863);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IDENTIFIER400_tree = (Object) this.adaptor
							.create(IDENTIFIER400);
					this.adaptor.addChild(root_0, IDENTIFIER400_tree);
				}
				COLON401 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_anonTypeField3865);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_funcType_in_anonTypeField3868);
				funcType402 = this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, funcType402.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 81, anonTypeField_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonTypeField"

	/**
	 * The Class objLitElemList_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class objLitElemList_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "objLitElemList"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:451:1:
	// objLitElemList : objLitElem ( COMMA objLitElem )* ;
	/**
	 * Obj lit elem list.
	 * 
	 * @return the tiny haxe try1 parser.obj lit elem list_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
		retval.start = this.input.LT(1);
		int objLitElemList_StartIndex = this.input.index();
		Object root_0 = null;

		Token COMMA404 = null;
		TinyHaxeTry1Parser.objLitElem_return objLitElem403 = null;

		TinyHaxeTry1Parser.objLitElem_return objLitElem405 = null;

		Object COMMA404_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 82)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:2:
			// ( objLitElem ( COMMA objLitElem )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:4:
			// objLitElem ( COMMA objLitElem )*
			{
				root_0 = (Object) this.adaptor.nil();

				this.pushFollow(FOLLOW_objLitElem_in_objLitElemList3884);
				objLitElem403 = this.objLitElem();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, objLitElem403.getTree());
				}
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:15:
				// ( COMMA objLitElem )*
				loop78: do {
					int alt78 = 2;
					int LA78_0 = this.input.LA(1);

					if ((LA78_0 == COMMA)) {
						alt78 = 1;
					}

					switch (alt78) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:16:
						// COMMA objLitElem
					{
						COMMA404 = (Token) this.match(this.input, COMMA,
								FOLLOW_COMMA_in_objLitElemList3887);
						if (this.state.failed) {
							return retval;
						}
						this
								.pushFollow(FOLLOW_objLitElem_in_objLitElemList3890);
						objLitElem405 = this.objLitElem();

						this.state._fsp--;
						if (this.state.failed) {
							return retval;
						}
						if (this.state.backtracking == 0) {
							this.adaptor.addChild(root_0, objLitElem405
									.getTree());
						}

					}
						break;

					default:
						break loop78;
					}
				} while (true);

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 82, objLitElemList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLitElemList"

	/**
	 * The Class objLitElem_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class objLitElem_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "objLitElem"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:455:1:
	// objLitElem : IDENTIFIER COLON expr ;
	/**
	 * Obj lit elem.
	 * 
	 * @return the tiny haxe try1 parser.obj lit elem_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.objLitElem_return objLitElem()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
		retval.start = this.input.LT(1);
		int objLitElem_StartIndex = this.input.index();
		Object root_0 = null;

		Token IDENTIFIER406 = null;
		Token COLON407 = null;
		TinyHaxeTry1Parser.expr_return expr408 = null;

		Object IDENTIFIER406_tree = null;
		Object COLON407_tree = null;

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 83)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:456:9:
			// ( IDENTIFIER COLON expr )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:456:11:
			// IDENTIFIER COLON expr
			{
				root_0 = (Object) this.adaptor.nil();

				IDENTIFIER406 = (Token) this.match(this.input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_objLitElem3911);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					IDENTIFIER406_tree = (Object) this.adaptor
							.create(IDENTIFIER406);
					this.adaptor.addChild(root_0, IDENTIFIER406_tree);
				}
				COLON407 = (Token) this.match(this.input, COLON,
						FOLLOW_COLON_in_objLitElem3913);
				if (this.state.failed) {
					return retval;
				}
				this.pushFollow(FOLLOW_expr_in_objLitElem3916);
				expr408 = this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					this.adaptor.addChild(root_0, expr408.getTree());
				}

			}

			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 83, objLitElem_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLitElem"

	/**
	 * The Class elementarySymbol_return.
	 * 
	 * @author Anatoly Kondratyev
	 */
	public static class elementarySymbol_return extends ParserRuleReturnScope {

		/** The tree. */
		Object tree;

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.RuleReturnScope#getTree()
		 */
		@Override
		public Object getTree() {
			return this.tree;
		}
	};

	// $ANTLR start "elementarySymbol"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:459:1:
	// elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] |
	// INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL ->
	// STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL ->
	// CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM,
	// \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE ->
	// FALSE[$FALSE,\"BOOL\"] );
	/**
	 * Elementary symbol.
	 * 
	 * @return the tiny haxe try1 parser.elementary symbol_return
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol()
			throws RecognitionException {
		TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
		retval.start = this.input.LT(1);
		int elementarySymbol_StartIndex = this.input.index();
		Object root_0 = null;

		Token LONGLITERAL409 = null;
		Token INTLITERAL410 = null;
		Token STRINGLITERAL411 = null;
		Token CHARLITERAL412 = null;
		Token FLOATNUM413 = null;
		Token TRUE414 = null;
		Token FALSE415 = null;

		Object LONGLITERAL409_tree = null;
		Object INTLITERAL410_tree = null;
		Object STRINGLITERAL411_tree = null;
		Object CHARLITERAL412_tree = null;
		Object FLOATNUM413_tree = null;
		Object TRUE414_tree = null;
		Object FALSE415_tree = null;
		RewriteRuleTokenStream stream_INTLITERAL = new RewriteRuleTokenStream(
				this.adaptor, "token INTLITERAL");
		RewriteRuleTokenStream stream_FALSE = new RewriteRuleTokenStream(
				this.adaptor, "token FALSE");
		RewriteRuleTokenStream stream_TRUE = new RewriteRuleTokenStream(
				this.adaptor, "token TRUE");
		RewriteRuleTokenStream stream_FLOATNUM = new RewriteRuleTokenStream(
				this.adaptor, "token FLOATNUM");
		RewriteRuleTokenStream stream_STRINGLITERAL = new RewriteRuleTokenStream(
				this.adaptor, "token STRINGLITERAL");
		RewriteRuleTokenStream stream_CHARLITERAL = new RewriteRuleTokenStream(
				this.adaptor, "token CHARLITERAL");
		RewriteRuleTokenStream stream_LONGLITERAL = new RewriteRuleTokenStream(
				this.adaptor, "token LONGLITERAL");

		try {
			if (this.state.backtracking > 0
					&& this.alreadyParsedRule(this.input, 84)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:460:2:
			// ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL
			// -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL ->
			// STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL ->
			// CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM ->
			// FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] |
			// FALSE -> FALSE[$FALSE,\"BOOL\"] )
			int alt79 = 7;
			switch (this.input.LA(1)) {
			case LONGLITERAL: {
				alt79 = 1;
			}
				break;
			case INTLITERAL: {
				alt79 = 2;
			}
				break;
			case STRINGLITERAL: {
				alt79 = 3;
			}
				break;
			case CHARLITERAL: {
				alt79 = 4;
			}
				break;
			case FLOATNUM: {
				alt79 = 5;
			}
				break;
			case TRUE: {
				alt79 = 6;
			}
				break;
			case FALSE: {
				alt79 = 7;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 79, 0,
						this.input);

				throw nvae;
			}

			switch (alt79) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:460:4:
				// LONGLITERAL
			{
				LONGLITERAL409 = (Token) this.match(this.input, LONGLITERAL,
						FOLLOW_LONGLITERAL_in_elementarySymbol3928);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_LONGLITERAL.add(LONGLITERAL409);
				}

				// AST REWRITE
				// elements: LONGLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 460:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(LONGLITERAL,
								LONGLITERAL409, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:461:4:
				// INTLITERAL
			{
				INTLITERAL410 = (Token) this.match(this.input, INTLITERAL,
						FOLLOW_INTLITERAL_in_elementarySymbol3941);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_INTLITERAL.add(INTLITERAL410);
				}

				// AST REWRITE
				// elements: INTLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 461:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(INTLITERAL,
								INTLITERAL410, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:462:4:
				// STRINGLITERAL
			{
				STRINGLITERAL411 = (Token) this.match(this.input,
						STRINGLITERAL,
						FOLLOW_STRINGLITERAL_in_elementarySymbol3954);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_STRINGLITERAL.add(STRINGLITERAL411);
				}

				// AST REWRITE
				// elements: STRINGLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 462:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(
								STRINGLITERAL, STRINGLITERAL411, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:463:4:
				// CHARLITERAL
			{
				CHARLITERAL412 = (Token) this.match(this.input, CHARLITERAL,
						FOLLOW_CHARLITERAL_in_elementarySymbol3967);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_CHARLITERAL.add(CHARLITERAL412);
				}

				// AST REWRITE
				// elements: CHARLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 463:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(CHARLITERAL,
								CHARLITERAL412, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:464:4:
				// FLOATNUM
			{
				FLOATNUM413 = (Token) this.match(this.input, FLOATNUM,
						FOLLOW_FLOATNUM_in_elementarySymbol3980);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FLOATNUM.add(FLOATNUM413);
				}

				// AST REWRITE
				// elements: FLOATNUM
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 464:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(FLOATNUM,
								FLOATNUM413, "FLOAT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:465:4:
				// TRUE
			{
				TRUE414 = (Token) this.match(this.input, TRUE,
						FOLLOW_TRUE_in_elementarySymbol3993);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_TRUE.add(TRUE414);
				}

				// AST REWRITE
				// elements: TRUE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 465:10: -> TRUE[$TRUE,\"BOOL\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(TRUE,
								TRUE414, "BOOL"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:466:4:
				// FALSE
			{
				FALSE415 = (Token) this.match(this.input, FALSE,
						FOLLOW_FALSE_in_elementarySymbol4007);
				if (this.state.failed) {
					return retval;
				}
				if (this.state.backtracking == 0) {
					stream_FALSE.add(FALSE415);
				}

				// AST REWRITE
				// elements: FALSE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (this.state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							this.adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) this.adaptor.nil();
					// 466:11: -> FALSE[$FALSE,\"BOOL\"]
					{
						this.adaptor.addChild(root_0, new VarUsage(FALSE,
								FALSE415, "BOOL"));

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = this.input.LT(-1);

			if (this.state.backtracking == 0) {

				retval.tree = (Object) this.adaptor.rulePostProcessing(root_0);
				this.adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			this.reportError(re);
			this.recover(this.input, re);
			retval.tree = (Object) this.adaptor.errorNode(this.input,
					retval.start, this.input.LT(-1), re);

		} finally {
			if (this.state.backtracking > 0) {
				this.memoize(this.input, 84, elementarySymbol_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "elementarySymbol"

	// $ANTLR start synpred20_TinyHaxeTry1
	/**
	 * Synpred20_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred20_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
		// ( typeTagOpt )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
		// typeTagOpt
		{
			this.pushFollow(FOLLOW_typeTagOpt_in_synpred20_TinyHaxeTry1835);
			this.typeTagOpt();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred20_TinyHaxeTry1

	// $ANTLR start synpred22_TinyHaxeTry1
	/**
	 * Synpred22_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred22_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
		// ( COMMA funcType )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
		// COMMA funcType
		{
			this.match(this.input, COMMA,
					FOLLOW_COMMA_in_synpred22_TinyHaxeTry1941);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_funcType_in_synpred22_TinyHaxeTry1944);
			this.funcType();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred22_TinyHaxeTry1

	// $ANTLR start synpred23_TinyHaxeTry1
	/**
	 * Synpred23_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred23_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
		// ( funcType ( COMMA funcType )* )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
		// funcType ( COMMA funcType )*
		{
			this.pushFollow(FOLLOW_funcType_in_synpred23_TinyHaxeTry1938);
			this.funcType();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:20:
			// ( COMMA funcType )*
			loop81: do {
				int alt81 = 2;
				int LA81_0 = this.input.LA(1);

				if ((LA81_0 == COMMA)) {
					alt81 = 1;
				}

				switch (alt81) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
					// COMMA funcType
				{
					this.match(this.input, COMMA,
							FOLLOW_COMMA_in_synpred23_TinyHaxeTry1941);
					if (this.state.failed) {
						return;
					}
					this
							.pushFollow(FOLLOW_funcType_in_synpred23_TinyHaxeTry1944);
					this.funcType();

					this.state._fsp--;
					if (this.state.failed) {
						return;
					}

				}
					break;

				default:
					break loop81;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred23_TinyHaxeTry1

	// $ANTLR start synpred24_TinyHaxeTry1
	/**
	 * Synpred24_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred24_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
		// ( COMMA typeConstraint )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
		// COMMA typeConstraint
		{
			this.match(this.input, COMMA,
					FOLLOW_COMMA_in_synpred24_TinyHaxeTry1955);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_typeConstraint_in_synpred24_TinyHaxeTry1958);
			this.typeConstraint();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred24_TinyHaxeTry1

	// $ANTLR start synpred25_TinyHaxeTry1
	/**
	 * Synpred25_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred25_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
		// ( MINUS_BIGGER type )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
		// MINUS_BIGGER type
		{
			this.match(this.input, MINUS_BIGGER,
					FOLLOW_MINUS_BIGGER_in_synpred25_TinyHaxeTry1977);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_type_in_synpred25_TinyHaxeTry1980);
			this.type();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred25_TinyHaxeTry1

	// $ANTLR start synpred26_TinyHaxeTry1
	/**
	 * Synpred26_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred26_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
		// ( ( type ) ( MINUS_BIGGER type )* )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
		// ( type ) ( MINUS_BIGGER type )*
		{
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
			// ( type )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:12:
			// type
			{
				this.pushFollow(FOLLOW_type_in_synpred26_TinyHaxeTry1973);
				this.type();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}

			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:18:
			// ( MINUS_BIGGER type )*
			loop82: do {
				int alt82 = 2;
				int LA82_0 = this.input.LA(1);

				if ((LA82_0 == MINUS_BIGGER)) {
					alt82 = 1;
				}

				switch (alt82) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
					// MINUS_BIGGER type
				{
					this.match(this.input, MINUS_BIGGER,
							FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1977);
					if (this.state.failed) {
						return;
					}
					this.pushFollow(FOLLOW_type_in_synpred26_TinyHaxeTry1980);
					this.type();

					this.state._fsp--;
					if (this.state.failed) {
						return;
					}

				}
					break;

				default:
					break loop82;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred26_TinyHaxeTry1

	// $ANTLR start synpred33_TinyHaxeTry1
	/**
	 * Synpred33_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred33_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
		// ( typeParam )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
		// typeParam
		{
			this.pushFollow(FOLLOW_typeParam_in_synpred33_TinyHaxeTry11020);
			this.typeParam();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred33_TinyHaxeTry1

	// $ANTLR start synpred34_TinyHaxeTry1
	/**
	 * Synpred34_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred34_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
		// ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) (
		// typeParam )* )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
		// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) (
		// typeParam )*
		{
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
			// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
			int alt83 = 7;
			switch (this.input.LA(1)) {
			case LBRACE: {
				alt83 = 1;
			}
				break;
			case IDENTIFIER: {
				alt83 = 2;
			}
				break;
			case INT: {
				alt83 = 3;
			}
				break;
			case FLOAT: {
				alt83 = 4;
			}
				break;
			case DYNAMIC: {
				alt83 = 5;
			}
				break;
			case BOOLEAN: {
				alt83 = 6;
			}
				break;
			case VOID: {
				alt83 = 7;
			}
				break;
			default:
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 83, 0,
						this.input);

				throw nvae;
			}

			switch (alt83) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:9:
				// anonType
			{
				this.pushFollow(FOLLOW_anonType_in_synpred34_TinyHaxeTry1999);
				this.anonType();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:20:
				// dotIdent
			{
				this.pushFollow(FOLLOW_dotIdent_in_synpred34_TinyHaxeTry11003);
				this.dotIdent();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:30:
				// INT
			{
				this.match(this.input, INT,
						FOLLOW_INT_in_synpred34_TinyHaxeTry11006);
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:35:
				// FLOAT
			{
				this.match(this.input, FLOAT,
						FOLLOW_FLOAT_in_synpred34_TinyHaxeTry11009);
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:42:
				// DYNAMIC
			{
				this.match(this.input, DYNAMIC,
						FOLLOW_DYNAMIC_in_synpred34_TinyHaxeTry11012);
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:50:
				// BOOLEAN
			{
				this.match(this.input, BOOLEAN,
						FOLLOW_BOOLEAN_in_synpred34_TinyHaxeTry11014);
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:58:
				// VOID
			{
				this.match(this.input, VOID,
						FOLLOW_VOID_in_synpred34_TinyHaxeTry11016);
				if (this.state.failed) {
					return;
				}

			}
				break;

			}

			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:64:
			// ( typeParam )*
			loop84: do {
				int alt84 = 2;
				int LA84_0 = this.input.LA(1);

				if ((LA84_0 == LT)) {
					alt84 = 1;
				}

				switch (alt84) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
					// typeParam
				{
					this
							.pushFollow(FOLLOW_typeParam_in_synpred34_TinyHaxeTry11020);
					this.typeParam();

					this.state._fsp--;
					if (this.state.failed) {
						return;
					}

				}
					break;

				default:
					break loop84;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred34_TinyHaxeTry1

	// $ANTLR start synpred35_TinyHaxeTry1
	/**
	 * Synpred35_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred35_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
		// ( type )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
		// type
		{
			this.pushFollow(FOLLOW_type_in_synpred35_TinyHaxeTry11042);
			this.type();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred35_TinyHaxeTry1

	// $ANTLR start synpred36_TinyHaxeTry1
	/**
	 * Synpred36_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred36_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
		// ( GT )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
		// GT
		{
			this.match(this.input, GT, FOLLOW_GT_in_synpred36_TinyHaxeTry11048);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred36_TinyHaxeTry1

	// $ANTLR start synpred37_TinyHaxeTry1
	/**
	 * Synpred37_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred37_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
		// ( GTGT )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
		// GTGT
		{
			this.match(this.input, GTGT,
					FOLLOW_GTGT_in_synpred37_TinyHaxeTry11051);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred37_TinyHaxeTry1

	// $ANTLR start synpred38_TinyHaxeTry1
	/**
	 * Synpred38_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred38_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
		// ( typeParam )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
		// typeParam
		{
			this.pushFollow(FOLLOW_typeParam_in_synpred38_TinyHaxeTry11073);
			this.typeParam();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred38_TinyHaxeTry1

	// $ANTLR start synpred40_TinyHaxeTry1
	/**
	 * Synpred40_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred40_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
		// ( block )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
		// block
		{
			this.pushFollow(FOLLOW_block_in_synpred40_TinyHaxeTry11201);
			this.block();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred40_TinyHaxeTry1

	// $ANTLR start synpred41_TinyHaxeTry1
	/**
	 * Synpred41_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred41_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
		// ( assignExpr SEMI )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
		// assignExpr SEMI
		{
			this.pushFollow(FOLLOW_assignExpr_in_synpred41_TinyHaxeTry11206);
			this.assignExpr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SEMI,
					FOLLOW_SEMI_in_synpred41_TinyHaxeTry11208);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred41_TinyHaxeTry1

	// $ANTLR start synpred43_TinyHaxeTry1
	/**
	 * Synpred43_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred43_TinyHaxeTry1_fragment()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return st2 = null;

		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
		// ( ELSE st2= statement )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
		// ELSE st2= statement
		{
			this.match(this.input, ELSE,
					FOLLOW_ELSE_in_synpred43_TinyHaxeTry11228);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_statement_in_synpred43_TinyHaxeTry11232);
			st2 = this.statement();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred43_TinyHaxeTry1

	// $ANTLR start synpred51_TinyHaxeTry1
	/**
	 * Synpred51_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred51_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
		// ( expr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
		// expr
		{
			this.pushFollow(FOLLOW_expr_in_synpred51_TinyHaxeTry11440);
			this.expr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred51_TinyHaxeTry1

	// $ANTLR start synpred58_TinyHaxeTry1
	/**
	 * Synpred58_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred58_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
		// ( expr SEMI )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
		// expr SEMI
		{
			this.pushFollow(FOLLOW_expr_in_synpred58_TinyHaxeTry11534);
			this.expr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SEMI,
					FOLLOW_SEMI_in_synpred58_TinyHaxeTry11537);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred58_TinyHaxeTry1

	// $ANTLR start synpred59_TinyHaxeTry1
	/**
	 * Synpred59_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred59_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
		// ( IDENTIFIER COLON statement )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
		// IDENTIFIER COLON statement
		{
			this.match(this.input, IDENTIFIER,
					FOLLOW_IDENTIFIER_in_synpred59_TinyHaxeTry11543);
			if (this.state.failed) {
				return;
			}
			this.match(this.input, COLON,
					FOLLOW_COLON_in_synpred59_TinyHaxeTry11545);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_statement_in_synpred59_TinyHaxeTry11547);
			this.statement();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred59_TinyHaxeTry1

	// $ANTLR start synpred62_TinyHaxeTry1
	/**
	 * Synpred62_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred62_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
		// ( varDecl )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
		// varDecl
		{
			this.pushFollow(FOLLOW_varDecl_in_synpred62_TinyHaxeTry11649);
			this.varDecl();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred62_TinyHaxeTry1

	// $ANTLR start synpred66_TinyHaxeTry1
	/**
	 * Synpred66_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred66_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
		// ( exprList )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
		// exprList
		{
			this.pushFollow(FOLLOW_exprList_in_synpred66_TinyHaxeTry11863);
			this.exprList();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred66_TinyHaxeTry1

	// $ANTLR start synpred83_TinyHaxeTry1
	/**
	 * Synpred83_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred83_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:32:
		// ( ( GT GT ) addExpr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:32:
		// ( GT GT ) addExpr
		{
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:32:
			// ( GT GT )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:33:
			// GT GT
			{
				this.match(this.input, GT,
						FOLLOW_GT_in_synpred83_TinyHaxeTry12153);
				if (this.state.failed) {
					return;
				}
				this.match(this.input, GT,
						FOLLOW_GT_in_synpred83_TinyHaxeTry12155);
				if (this.state.failed) {
					return;
				}

			}

			this.pushFollow(FOLLOW_addExpr_in_synpred83_TinyHaxeTry12160);
			this.addExpr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred83_TinyHaxeTry1

	// $ANTLR start synpred94_TinyHaxeTry1
	/**
	 * Synpred94_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred94_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
		// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
		// ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
		{
			if (this.input.LA(1) == SUB
					|| (this.input.LA(1) >= SUBSUB && this.input.LA(1) <= TILDE)) {
				this.input.consume();
				this.state.errorRecovery = false;
				this.state.failed = false;
			} else {
				if (this.state.backtracking > 0) {
					this.state.failed = true;
					return;
				}
				MismatchedSetException mse = new MismatchedSetException(null,
						this.input);
				throw mse;
			}

			this.pushFollow(FOLLOW_prefixExpr_in_synpred94_TinyHaxeTry12257);
			this.prefixExpr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred94_TinyHaxeTry1

	// $ANTLR start synpred97_TinyHaxeTry1
	/**
	 * Synpred97_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred97_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
		// ( value LPAREN exprListOpt RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
		// value LPAREN exprListOpt RPAREN
		{
			this.pushFollow(FOLLOW_value_in_synpred97_TinyHaxeTry12312);
			this.value();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, LPAREN,
					FOLLOW_LPAREN_in_synpred97_TinyHaxeTry12314);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_exprListOpt_in_synpred97_TinyHaxeTry12316);
			this.exprListOpt();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, RPAREN,
					FOLLOW_RPAREN_in_synpred97_TinyHaxeTry12318);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred97_TinyHaxeTry1

	// $ANTLR start synpred98_TinyHaxeTry1
	/**
	 * Synpred98_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred98_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
		// ( value LBRACKET expr RBRACKET )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
		// value LBRACKET expr RBRACKET
		{
			this.pushFollow(FOLLOW_value_in_synpred98_TinyHaxeTry12339);
			this.value();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, LBRACKET,
					FOLLOW_LBRACKET_in_synpred98_TinyHaxeTry12341);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expr_in_synpred98_TinyHaxeTry12343);
			this.expr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, RBRACKET,
					FOLLOW_RBRACKET_in_synpred98_TinyHaxeTry12345);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred98_TinyHaxeTry1

	// $ANTLR start synpred99_TinyHaxeTry1
	/**
	 * Synpred99_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred99_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
		// ( value PLUSPLUS )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
		// value PLUSPLUS
		{
			this.pushFollow(FOLLOW_value_in_synpred99_TinyHaxeTry12350);
			this.value();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, PLUSPLUS,
					FOLLOW_PLUSPLUS_in_synpred99_TinyHaxeTry12352);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred99_TinyHaxeTry1

	// $ANTLR start synpred100_TinyHaxeTry1
	/**
	 * Synpred100_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred100_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4:
		// ( value SUBSUB )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4:
		// value SUBSUB
		{
			this.pushFollow(FOLLOW_value_in_synpred100_TinyHaxeTry12376);
			this.value();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			this.match(this.input, SUBSUB,
					FOLLOW_SUBSUB_in_synpred100_TinyHaxeTry12378);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred100_TinyHaxeTry1

	// $ANTLR start synpred102_TinyHaxeTry1
	/**
	 * Synpred102_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred102_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
		// ( arrayLit )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
		// arrayLit
		{
			this.pushFollow(FOLLOW_arrayLit_in_synpred102_TinyHaxeTry12418);
			this.arrayLit();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred102_TinyHaxeTry1

	// $ANTLR start synpred106_TinyHaxeTry1
	/**
	 * Synpred106_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred106_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
		// ( expr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
		// expr
		{
			this.pushFollow(FOLLOW_expr_in_synpred106_TinyHaxeTry12482);
			this.expr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred106_TinyHaxeTry1

	// $ANTLR start synpred107_TinyHaxeTry1
	/**
	 * Synpred107_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred107_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
		// ( LPAREN ( expr | statement ) RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
		// LPAREN ( expr | statement ) RPAREN
		{
			this.match(this.input, LPAREN,
					FOLLOW_LPAREN_in_synpred107_TinyHaxeTry12478);
			if (this.state.failed) {
				return;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:22:
			// ( expr | statement )
			int alt91 = 2;
			alt91 = this.dfa91.predict(this.input);
			switch (alt91) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
				// expr
			{
				this.pushFollow(FOLLOW_expr_in_synpred107_TinyHaxeTry12482);
				this.expr();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:28:
				// statement
			{
				this
						.pushFollow(FOLLOW_statement_in_synpred107_TinyHaxeTry12484);
				this.statement();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}
				break;

			}

			this.match(this.input, RPAREN,
					FOLLOW_RPAREN_in_synpred107_TinyHaxeTry12487);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred107_TinyHaxeTry1

	// $ANTLR start synpred110_TinyHaxeTry1
	/**
	 * Synpred110_ tiny haxe try1_fragment.
	 * 
	 * @throws RecognitionException
	 *             the recognition exception
	 */
	public final void synpred110_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
		// ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
		// CAST LPAREN expr ( COMMA funcType )? RPAREN
		{
			this.match(this.input, CAST,
					FOLLOW_CAST_in_synpred110_TinyHaxeTry12581);
			if (this.state.failed) {
				return;
			}
			this.match(this.input, LPAREN,
					FOLLOW_LPAREN_in_synpred110_TinyHaxeTry12583);
			if (this.state.failed) {
				return;
			}
			this.pushFollow(FOLLOW_expr_in_synpred110_TinyHaxeTry12585);
			this.expr();

			this.state._fsp--;
			if (this.state.failed) {
				return;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:28:
			// ( COMMA funcType )?
			int alt92 = 2;
			int LA92_0 = this.input.LA(1);

			if ((LA92_0 == COMMA)) {
				alt92 = 1;
			}
			switch (alt92) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:29:
				// COMMA funcType
			{
				this.match(this.input, COMMA,
						FOLLOW_COMMA_in_synpred110_TinyHaxeTry12588);
				if (this.state.failed) {
					return;
				}
				this.pushFollow(FOLLOW_funcType_in_synpred110_TinyHaxeTry12590);
				this.funcType();

				this.state._fsp--;
				if (this.state.failed) {
					return;
				}

			}
				break;

			}

			this.match(this.input, RPAREN,
					FOLLOW_RPAREN_in_synpred110_TinyHaxeTry12594);
			if (this.state.failed) {
				return;
			}

		}
	}

	// $ANTLR end synpred110_TinyHaxeTry1

	// Delegated rules

	/**
	 * Synpred23_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred23_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred23_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred66_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred66_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred66_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred40_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred40_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred40_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred97_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred97_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred97_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred51_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred51_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred51_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred24_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred24_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred24_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred43_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred43_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred43_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred36_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred36_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred36_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred59_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred59_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred59_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred102_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred102_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred102_TinyHaxeTry1_fragment(); // can never throw
			// exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred62_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred62_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred62_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred94_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred94_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred94_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred41_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred41_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred41_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred26_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred26_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred26_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred107_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred107_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred107_TinyHaxeTry1_fragment(); // can never throw
			// exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred25_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred25_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred25_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred106_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred106_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred106_TinyHaxeTry1_fragment(); // can never throw
			// exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred110_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred110_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred110_TinyHaxeTry1_fragment(); // can never throw
			// exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred58_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred58_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred58_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred100_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred100_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred100_TinyHaxeTry1_fragment(); // can never throw
			// exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred35_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred35_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred35_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred20_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred20_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred20_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred22_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred22_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred22_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred83_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred83_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred83_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred99_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred99_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred99_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred37_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred37_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred37_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred34_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred34_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred34_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred33_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred33_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred33_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred98_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred98_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred98_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/**
	 * Synpred38_ tiny haxe try1.
	 * 
	 * @return true, if successful
	 */
	public final boolean synpred38_TinyHaxeTry1() {
		this.state.backtracking++;
		int start = this.input.mark();
		try {
			this.synpred38_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !this.state.failed;
		this.input.rewind(start);
		this.state.backtracking--;
		this.state.failed = false;
		return success;
	}

	/** The dfa16. */
	protected DFA16 dfa16 = new DFA16(this);

	/** The dfa15. */
	protected DFA15 dfa15 = new DFA15(this);

	/** The dfa21. */
	protected DFA21 dfa21 = new DFA21(this);

	/** The dfa22. */
	protected DFA22 dfa22 = new DFA22(this);

	/** The dfa31. */
	protected DFA31 dfa31 = new DFA31(this);

	/** The dfa34. */
	protected DFA34 dfa34 = new DFA34(this);

	/** The dfa53. */
	protected DFA53 dfa53 = new DFA53(this);

	/** The dfa55. */
	protected DFA55 dfa55 = new DFA55(this);

	/** The dfa54. */
	protected DFA54 dfa54 = new DFA54(this);

	/** The dfa67. */
	protected DFA67 dfa67 = new DFA67(this);

	/** The dfa68. */
	protected DFA68 dfa68 = new DFA68(this);

	/** The dfa70. */
	protected DFA70 dfa70 = new DFA70(this);

	/** The dfa71. */
	protected DFA71 dfa71 = new DFA71(this);

	/** The dfa91. */
	protected DFA91 dfa91 = new DFA91(this);

	/** The Constant DFA16_eotS. */
	static final String DFA16_eotS = "\66\uffff";

	/** The Constant DFA16_eofS. */
	static final String DFA16_eofS = "\1\1\65\uffff";

	/** The Constant DFA16_minS. */
	static final String DFA16_minS = "\1\20\1\uffff\1\0\63\uffff";

	/** The Constant DFA16_maxS. */
	static final String DFA16_maxS = "\1\140\1\uffff\1\0\63\uffff";

	/** The Constant DFA16_acceptS. */
	static final String DFA16_acceptS = "\1\uffff\1\1\63\uffff\1\2";

	/** The Constant DFA16_specialS. */
	static final String DFA16_specialS = "\2\uffff\1\0\63\uffff}>";

	/** The Constant DFA16_transitionS. */
	static final String[] DFA16_transitionS = {
			"\1\1\1\2\1\uffff\1\1\4\uffff\1\1\1\uffff\10\1\1\uffff\2\1\1"
					+ "\uffff\12\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1\6\uffff\1\1"
					+ "\1\uffff\6\1", "", "\1\uffff", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA16_eot. */
	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);

	/** The Constant DFA16_eof. */
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);

	/** The Constant DFA16_min. */
	static final char[] DFA16_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA16_minS);

	/** The Constant DFA16_max. */
	static final char[] DFA16_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA16_maxS);

	/** The Constant DFA16_accept. */
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);

	/** The Constant DFA16_special. */
	static final short[] DFA16_special = DFA
			.unpackEncodedString(DFA16_specialS);

	/** The Constant DFA16_transition. */
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	/**
	 * The Class DFA16.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA16 extends DFA {

		/**
		 * Instantiates a new dF a16.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA16(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "137:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA16_2 = input.LA(1);

				int index16_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred23_TinyHaxeTry1())) {
					s = 1;
				}

				else if ((true)) {
					s = 53;
				}

				input.seek(index16_2);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 16, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA15_eotS. */
	static final String DFA15_eotS = "\60\uffff";

	/** The Constant DFA15_eofS. */
	static final String DFA15_eofS = "\1\1\57\uffff";

	/** The Constant DFA15_minS. */
	static final String DFA15_minS = "\1\20\4\uffff\1\0\52\uffff";

	/** The Constant DFA15_maxS. */
	static final String DFA15_maxS = "\1\140\4\uffff\1\0\52\uffff";

	/** The Constant DFA15_acceptS. */
	static final String DFA15_acceptS = "\1\uffff\1\2\55\uffff\1\1";

	/** The Constant DFA15_specialS. */
	static final String DFA15_specialS = "\5\uffff\1\0\52\uffff}>";

	/** The Constant DFA15_transitionS. */
	static final String[] DFA15_transitionS = {
			"\1\1\2\uffff\1\1\6\uffff\1\5\7\1\1\uffff\2\1\1\uffff\3\1\4"
					+ "\uffff\3\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1\6\uffff\1\1"
					+ "\1\uffff\6\1", "", "", "", "", "\1\uffff", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "" };

	/** The Constant DFA15_eot. */
	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);

	/** The Constant DFA15_eof. */
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);

	/** The Constant DFA15_min. */
	static final char[] DFA15_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA15_minS);

	/** The Constant DFA15_max. */
	static final char[] DFA15_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA15_maxS);

	/** The Constant DFA15_accept. */
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);

	/** The Constant DFA15_special. */
	static final short[] DFA15_special = DFA
			.unpackEncodedString(DFA15_specialS);

	/** The Constant DFA15_transition. */
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	/**
	 * The Class DFA15.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA15 extends DFA {

		/**
		 * Instantiates a new dF a15.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA15(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "()* loopback of 138:19: ( COMMA typeConstraint )*";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA15_5 = input.LA(1);

				int index15_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred24_TinyHaxeTry1())) {
					s = 47;
				}

				else if ((true)) {
					s = 1;
				}

				input.seek(index15_5);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 15, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA21_eotS. */
	static final String DFA21_eotS = "\65\uffff";

	/** The Constant DFA21_eofS. */
	static final String DFA21_eofS = "\1\10\64\uffff";

	/** The Constant DFA21_minS. */
	static final String DFA21_minS = "\1\20\1\0\63\uffff";

	/** The Constant DFA21_maxS. */
	static final String DFA21_maxS = "\1\140\1\0\63\uffff";

	/** The Constant DFA21_acceptS. */
	static final String DFA21_acceptS = "\2\uffff\1\1\5\uffff\1\2\54\uffff";

	/** The Constant DFA21_specialS. */
	static final String DFA21_specialS = "\1\uffff\1\0\63\uffff}>";

	/** The Constant DFA21_transitionS. */
	static final String[] DFA21_transitionS = {
			"\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\10\10\1\uffff\2"
					+ "\10\1\uffff\3\10\4\2\3\10\4\uffff\1\10\4\uffff\1\1\1\10\7\uffff"
					+ "\21\10\6\uffff\1\10\1\uffff\6\10", "\1\uffff", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA21_eot. */
	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);

	/** The Constant DFA21_eof. */
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);

	/** The Constant DFA21_min. */
	static final char[] DFA21_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA21_minS);

	/** The Constant DFA21_max. */
	static final char[] DFA21_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA21_maxS);

	/** The Constant DFA21_accept. */
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);

	/** The Constant DFA21_special. */
	static final short[] DFA21_special = DFA
			.unpackEncodedString(DFA21_specialS);

	/** The Constant DFA21_transition. */
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	/**
	 * The Class DFA21.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA21 extends DFA {

		/**
		 * Instantiates a new dF a21.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA21(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "145:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA21_1 = input.LA(1);

				int index21_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred34_TinyHaxeTry1())) {
					s = 2;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index21_1);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 21, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA22_eotS. */
	static final String DFA22_eotS = "\67\uffff";

	/** The Constant DFA22_eofS. */
	static final String DFA22_eofS = "\1\16\66\uffff";

	/** The Constant DFA22_minS. */
	static final String DFA22_minS = "\1\20\64\0\2\uffff";

	/** The Constant DFA22_maxS. */
	static final String DFA22_maxS = "\1\140\64\0\2\uffff";

	/** The Constant DFA22_acceptS. */
	static final String DFA22_acceptS = "\65\uffff\1\1\1\2";

	/** The Constant DFA22_specialS. */
	static final String DFA22_specialS = "\1\uffff\1\24\1\10\1\55\1\47\1\43\1\34\1\33\1\41\1\57\1\25\1\44"
			+ "\1\40\1\37\1\17\1\61\1\52\1\6\1\42\1\22\1\51\1\36\1\46\1\60\1\30"
			+ "\1\45\1\1\1\26\1\31\1\27\1\3\1\21\1\0\1\35\1\50\1\62\1\53\1\11\1"
			+ "\4\1\54\1\56\1\14\1\63\1\32\1\7\1\23\1\20\1\13\1\5\1\2\1\16\1\12"
			+ "\1\15\2\uffff}>";

	/** The Constant DFA22_transitionS. */
	static final String[] DFA22_transitionS = {
			"\1\17\1\2\1\uffff\1\20\4\uffff\1\5\1\uffff\1\14\1\53\1\13\1"
					+ "\55\1\56\1\57\1\60\1\61\1\uffff\1\27\1\15\1\uffff\1\64\1\63"
					+ "\1\12\1\7\1\3\1\4\1\6\1\32\1\10\1\11\4\uffff\1\62\4\uffff\1"
					+ "\1\1\26\7\uffff\1\54\1\52\1\51\1\45\1\46\1\47\1\50\1\42\1\43"
					+ "\1\44\1\40\1\41\1\36\1\37\1\33\1\34\1\35\6\uffff\1\24\1\uffff"
					+ "\1\21\1\22\1\23\1\30\1\31\1\25", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "" };

	/** The Constant DFA22_eot. */
	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);

	/** The Constant DFA22_eof. */
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);

	/** The Constant DFA22_min. */
	static final char[] DFA22_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA22_minS);

	/** The Constant DFA22_max. */
	static final char[] DFA22_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA22_maxS);

	/** The Constant DFA22_accept. */
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);

	/** The Constant DFA22_special. */
	static final short[] DFA22_special = DFA
			.unpackEncodedString(DFA22_specialS);

	/** The Constant DFA22_transition. */
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	/**
	 * The Class DFA22.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA22 extends DFA {

		/**
		 * Instantiates a new dF a22.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA22(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "150:8: ( type | typeList )";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA22_32 = input.LA(1);

				int index22_32 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_32);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA22_26 = input.LA(1);

				int index22_26 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_26);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA22_49 = input.LA(1);

				int index22_49 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_49);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA22_30 = input.LA(1);

				int index22_30 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_30);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA22_38 = input.LA(1);

				int index22_38 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_38);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA22_48 = input.LA(1);

				int index22_48 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_48);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA22_17 = input.LA(1);

				int index22_17 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_17);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA22_44 = input.LA(1);

				int index22_44 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_44);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA22_2 = input.LA(1);

				int index22_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA22_37 = input.LA(1);

				int index22_37 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_37);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA22_51 = input.LA(1);

				int index22_51 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_51);
				if (s >= 0) {
					return s;
				}
				break;
			case 11:
				int LA22_47 = input.LA(1);

				int index22_47 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_47);
				if (s >= 0) {
					return s;
				}
				break;
			case 12:
				int LA22_41 = input.LA(1);

				int index22_41 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_41);
				if (s >= 0) {
					return s;
				}
				break;
			case 13:
				int LA22_52 = input.LA(1);

				int index22_52 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_52);
				if (s >= 0) {
					return s;
				}
				break;
			case 14:
				int LA22_50 = input.LA(1);

				int index22_50 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_50);
				if (s >= 0) {
					return s;
				}
				break;
			case 15:
				int LA22_14 = input.LA(1);

				int index22_14 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_14);
				if (s >= 0) {
					return s;
				}
				break;
			case 16:
				int LA22_46 = input.LA(1);

				int index22_46 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_46);
				if (s >= 0) {
					return s;
				}
				break;
			case 17:
				int LA22_31 = input.LA(1);

				int index22_31 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_31);
				if (s >= 0) {
					return s;
				}
				break;
			case 18:
				int LA22_19 = input.LA(1);

				int index22_19 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_19);
				if (s >= 0) {
					return s;
				}
				break;
			case 19:
				int LA22_45 = input.LA(1);

				int index22_45 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_45);
				if (s >= 0) {
					return s;
				}
				break;
			case 20:
				int LA22_1 = input.LA(1);

				int index22_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 21:
				int LA22_10 = input.LA(1);

				int index22_10 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 22:
				int LA22_27 = input.LA(1);

				int index22_27 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_27);
				if (s >= 0) {
					return s;
				}
				break;
			case 23:
				int LA22_29 = input.LA(1);

				int index22_29 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_29);
				if (s >= 0) {
					return s;
				}
				break;
			case 24:
				int LA22_24 = input.LA(1);

				int index22_24 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_24);
				if (s >= 0) {
					return s;
				}
				break;
			case 25:
				int LA22_28 = input.LA(1);

				int index22_28 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_28);
				if (s >= 0) {
					return s;
				}
				break;
			case 26:
				int LA22_43 = input.LA(1);

				int index22_43 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_43);
				if (s >= 0) {
					return s;
				}
				break;
			case 27:
				int LA22_7 = input.LA(1);

				int index22_7 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 28:
				int LA22_6 = input.LA(1);

				int index22_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 29:
				int LA22_33 = input.LA(1);

				int index22_33 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_33);
				if (s >= 0) {
					return s;
				}
				break;
			case 30:
				int LA22_21 = input.LA(1);

				int index22_21 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_21);
				if (s >= 0) {
					return s;
				}
				break;
			case 31:
				int LA22_13 = input.LA(1);

				int index22_13 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_13);
				if (s >= 0) {
					return s;
				}
				break;
			case 32:
				int LA22_12 = input.LA(1);

				int index22_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_12);
				if (s >= 0) {
					return s;
				}
				break;
			case 33:
				int LA22_8 = input.LA(1);

				int index22_8 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 34:
				int LA22_18 = input.LA(1);

				int index22_18 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_18);
				if (s >= 0) {
					return s;
				}
				break;
			case 35:
				int LA22_5 = input.LA(1);

				int index22_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 36:
				int LA22_11 = input.LA(1);

				int index22_11 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 37:
				int LA22_25 = input.LA(1);

				int index22_25 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_25);
				if (s >= 0) {
					return s;
				}
				break;
			case 38:
				int LA22_22 = input.LA(1);

				int index22_22 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_22);
				if (s >= 0) {
					return s;
				}
				break;
			case 39:
				int LA22_4 = input.LA(1);

				int index22_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 40:
				int LA22_34 = input.LA(1);

				int index22_34 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_34);
				if (s >= 0) {
					return s;
				}
				break;
			case 41:
				int LA22_20 = input.LA(1);

				int index22_20 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_20);
				if (s >= 0) {
					return s;
				}
				break;
			case 42:
				int LA22_16 = input.LA(1);

				int index22_16 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_16);
				if (s >= 0) {
					return s;
				}
				break;
			case 43:
				int LA22_36 = input.LA(1);

				int index22_36 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_36);
				if (s >= 0) {
					return s;
				}
				break;
			case 44:
				int LA22_39 = input.LA(1);

				int index22_39 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_39);
				if (s >= 0) {
					return s;
				}
				break;
			case 45:
				int LA22_3 = input.LA(1);

				int index22_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 46:
				int LA22_40 = input.LA(1);

				int index22_40 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_40);
				if (s >= 0) {
					return s;
				}
				break;
			case 47:
				int LA22_9 = input.LA(1);

				int index22_9 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 48:
				int LA22_23 = input.LA(1);

				int index22_23 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_23);
				if (s >= 0) {
					return s;
				}
				break;
			case 49:
				int LA22_15 = input.LA(1);

				int index22_15 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_15);
				if (s >= 0) {
					return s;
				}
				break;
			case 50:
				int LA22_35 = input.LA(1);

				int index22_35 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_35);
				if (s >= 0) {
					return s;
				}
				break;
			case 51:
				int LA22_42 = input.LA(1);

				int index22_42 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred35_TinyHaxeTry1())) {
					s = 53;
				}

				else if ((true)) {
					s = 54;
				}

				input.seek(index22_42);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 22, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA31_eotS. */
	static final String DFA31_eotS = "\103\uffff";

	/** The Constant DFA31_eofS. */
	static final String DFA31_eofS = "\103\uffff";

	/** The Constant DFA31_minS. */
	static final String DFA31_minS = "\1\20\55\0\25\uffff";

	/** The Constant DFA31_maxS. */
	static final String DFA31_maxS = "\1\147\55\0\25\uffff";

	/** The Constant DFA31_acceptS. */
	static final String DFA31_acceptS = "\56\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"
			+ "\1\15\1\1\1\2\1\16\1\20\1\17";

	/** The Constant DFA31_specialS. */
	static final String DFA31_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\25\uffff}>";

	/** The Constant DFA31_transitionS. */
	static final String[] DFA31_transitionS = {
			"\1\2\1\21\2\uffff\6\56\1\uffff\1\46\1\50\1\51\1\52\1\53\1\54"
					+ "\1\55\1\6\1\20\1\uffff\1\7\7\uffff\1\24\1\33\1\uffff\1\4\1\64"
					+ "\1\uffff\1\65\1\uffff\1\66\1\67\1\70\1\71\1\1\1\uffff\1\72\1"
					+ "\73\1\74\1\75\3\uffff\1\47\1\45\1\44\1\40\1\41\1\42\1\43\1\35"
					+ "\1\36\1\37\1\32\1\34\1\30\1\23\1\25\1\26\1\27\1\22\1\3\2\31"
					+ "\1\10\1\5\1\uffff\1\56\6\uffff\1\11\1\12\1\13\1\14\1\15\1\16"
					+ "\1\17", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "" };

	/** The Constant DFA31_eot. */
	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);

	/** The Constant DFA31_eof. */
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);

	/** The Constant DFA31_min. */
	static final char[] DFA31_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA31_minS);

	/** The Constant DFA31_max. */
	static final char[] DFA31_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA31_maxS);

	/** The Constant DFA31_accept. */
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);

	/** The Constant DFA31_special. */
	static final short[] DFA31_special = DFA
			.unpackEncodedString(DFA31_specialS);

	/** The Constant DFA31_transition. */
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	/**
	 * The Class DFA31.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA31 extends DFA {

		/**
		 * Instantiates a new dF a31.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA31(final BaseRecognizer recognizer) {
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

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "167:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA31_1 = input.LA(1);

				int index31_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred40_TinyHaxeTry1())) {
					s = 62;
				}

				else if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA31_2 = input.LA(1);

				int index31_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred40_TinyHaxeTry1())) {
					s = 62;
				}

				else if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 65;
				}

				input.seek(index31_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA31_3 = input.LA(1);

				int index31_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA31_4 = input.LA(1);

				int index31_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA31_5 = input.LA(1);

				int index31_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA31_6 = input.LA(1);

				int index31_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA31_7 = input.LA(1);

				int index31_7 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA31_8 = input.LA(1);

				int index31_8 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA31_9 = input.LA(1);

				int index31_9 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA31_10 = input.LA(1);

				int index31_10 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA31_11 = input.LA(1);

				int index31_11 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 11:
				int LA31_12 = input.LA(1);

				int index31_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_12);
				if (s >= 0) {
					return s;
				}
				break;
			case 12:
				int LA31_13 = input.LA(1);

				int index31_13 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_13);
				if (s >= 0) {
					return s;
				}
				break;
			case 13:
				int LA31_14 = input.LA(1);

				int index31_14 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_14);
				if (s >= 0) {
					return s;
				}
				break;
			case 14:
				int LA31_15 = input.LA(1);

				int index31_15 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_15);
				if (s >= 0) {
					return s;
				}
				break;
			case 15:
				int LA31_16 = input.LA(1);

				int index31_16 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_16);
				if (s >= 0) {
					return s;
				}
				break;
			case 16:
				int LA31_17 = input.LA(1);

				int index31_17 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((TinyHaxeTry1Parser.this.synpred59_TinyHaxeTry1())) {
					s = 66;
				}

				input.seek(index31_17);
				if (s >= 0) {
					return s;
				}
				break;
			case 17:
				int LA31_18 = input.LA(1);

				int index31_18 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_18);
				if (s >= 0) {
					return s;
				}
				break;
			case 18:
				int LA31_19 = input.LA(1);

				int index31_19 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_19);
				if (s >= 0) {
					return s;
				}
				break;
			case 19:
				int LA31_20 = input.LA(1);

				int index31_20 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_20);
				if (s >= 0) {
					return s;
				}
				break;
			case 20:
				int LA31_21 = input.LA(1);

				int index31_21 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_21);
				if (s >= 0) {
					return s;
				}
				break;
			case 21:
				int LA31_22 = input.LA(1);

				int index31_22 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_22);
				if (s >= 0) {
					return s;
				}
				break;
			case 22:
				int LA31_23 = input.LA(1);

				int index31_23 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_23);
				if (s >= 0) {
					return s;
				}
				break;
			case 23:
				int LA31_24 = input.LA(1);

				int index31_24 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_24);
				if (s >= 0) {
					return s;
				}
				break;
			case 24:
				int LA31_25 = input.LA(1);

				int index31_25 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_25);
				if (s >= 0) {
					return s;
				}
				break;
			case 25:
				int LA31_26 = input.LA(1);

				int index31_26 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_26);
				if (s >= 0) {
					return s;
				}
				break;
			case 26:
				int LA31_27 = input.LA(1);

				int index31_27 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_27);
				if (s >= 0) {
					return s;
				}
				break;
			case 27:
				int LA31_28 = input.LA(1);

				int index31_28 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_28);
				if (s >= 0) {
					return s;
				}
				break;
			case 28:
				int LA31_29 = input.LA(1);

				int index31_29 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_29);
				if (s >= 0) {
					return s;
				}
				break;
			case 29:
				int LA31_30 = input.LA(1);

				int index31_30 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_30);
				if (s >= 0) {
					return s;
				}
				break;
			case 30:
				int LA31_31 = input.LA(1);

				int index31_31 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_31);
				if (s >= 0) {
					return s;
				}
				break;
			case 31:
				int LA31_32 = input.LA(1);

				int index31_32 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_32);
				if (s >= 0) {
					return s;
				}
				break;
			case 32:
				int LA31_33 = input.LA(1);

				int index31_33 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_33);
				if (s >= 0) {
					return s;
				}
				break;
			case 33:
				int LA31_34 = input.LA(1);

				int index31_34 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_34);
				if (s >= 0) {
					return s;
				}
				break;
			case 34:
				int LA31_35 = input.LA(1);

				int index31_35 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_35);
				if (s >= 0) {
					return s;
				}
				break;
			case 35:
				int LA31_36 = input.LA(1);

				int index31_36 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_36);
				if (s >= 0) {
					return s;
				}
				break;
			case 36:
				int LA31_37 = input.LA(1);

				int index31_37 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_37);
				if (s >= 0) {
					return s;
				}
				break;
			case 37:
				int LA31_38 = input.LA(1);

				int index31_38 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_38);
				if (s >= 0) {
					return s;
				}
				break;
			case 38:
				int LA31_39 = input.LA(1);

				int index31_39 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_39);
				if (s >= 0) {
					return s;
				}
				break;
			case 39:
				int LA31_40 = input.LA(1);

				int index31_40 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_40);
				if (s >= 0) {
					return s;
				}
				break;
			case 40:
				int LA31_41 = input.LA(1);

				int index31_41 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_41);
				if (s >= 0) {
					return s;
				}
				break;
			case 41:
				int LA31_42 = input.LA(1);

				int index31_42 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_42);
				if (s >= 0) {
					return s;
				}
				break;
			case 42:
				int LA31_43 = input.LA(1);

				int index31_43 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_43);
				if (s >= 0) {
					return s;
				}
				break;
			case 43:
				int LA31_44 = input.LA(1);

				int index31_44 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_44);
				if (s >= 0) {
					return s;
				}
				break;
			case 44:
				int LA31_45 = input.LA(1);

				int index31_45 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred41_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((TinyHaxeTry1Parser.this.synpred58_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index31_45);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 31, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA34_eotS. */
	static final String DFA34_eotS = "\101\uffff";

	/** The Constant DFA34_eofS. */
	static final String DFA34_eofS = "\101\uffff";

	/** The Constant DFA34_minS. */
	static final String DFA34_minS = "\1\20\6\0\72\uffff";

	/** The Constant DFA34_maxS. */
	static final String DFA34_maxS = "\1\147\6\0\72\uffff";

	/** The Constant DFA34_acceptS. */
	static final String DFA34_acceptS = "\7\uffff\1\2\1\uffff\1\3\66\uffff\1\1";

	/** The Constant DFA34_specialS. */
	static final String DFA34_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\72\uffff}>";

	/** The Constant DFA34_transitionS. */
	static final String[] DFA34_transitionS = {
			"\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"
					+ "\7\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff\5\11\1\uffff"
					+ "\4\11\3\uffff\27\11\1\uffff\1\6\2\7\4\uffff\7\11",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA34_eot. */
	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);

	/** The Constant DFA34_eof. */
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);

	/** The Constant DFA34_min. */
	static final char[] DFA34_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA34_minS);

	/** The Constant DFA34_max. */
	static final char[] DFA34_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA34_maxS);

	/** The Constant DFA34_accept. */
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);

	/** The Constant DFA34_special. */
	static final short[] DFA34_special = DFA
			.unpackEncodedString(DFA34_specialS);

	/** The Constant DFA34_transition. */
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	/**
	 * The Class DFA34.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA34 extends DFA {

		/**
		 * Instantiates a new dF a34.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA34(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "194:1: blockStmt : ( varDecl | classDecl | statement );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA34_1 = input.LA(1);

				int index34_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA34_2 = input.LA(1);

				int index34_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA34_3 = input.LA(1);

				int index34_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA34_4 = input.LA(1);

				int index34_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA34_5 = input.LA(1);

				int index34_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA34_6 = input.LA(1);

				int index34_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred62_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index34_6);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 34, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA53_eotS. */
	static final String DFA53_eotS = "\64\uffff";

	/** The Constant DFA53_eofS. */
	static final String DFA53_eofS = "\1\20\63\uffff";

	/** The Constant DFA53_minS. */
	static final String DFA53_minS = "\1\20\15\0\46\uffff";

	/** The Constant DFA53_maxS. */
	static final String DFA53_maxS = "\1\147\15\0\46\uffff";

	/** The Constant DFA53_acceptS. */
	static final String DFA53_acceptS = "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";

	/** The Constant DFA53_specialS. */
	static final String DFA53_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\46\uffff}>";

	/** The Constant DFA53_transitionS. */
	static final String[] DFA53_transitionS = {
			"\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\2\20\5\uffff\2"
					+ "\20\5\uffff\1\20\4\uffff\1\3\1\20\7\uffff\21\20\1\17\1\16\2"
					+ "\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA53_eot. */
	static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);

	/** The Constant DFA53_eof. */
	static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);

	/** The Constant DFA53_min. */
	static final char[] DFA53_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA53_minS);

	/** The Constant DFA53_max. */
	static final char[] DFA53_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA53_maxS);

	/** The Constant DFA53_accept. */
	static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);

	/** The Constant DFA53_special. */
	static final short[] DFA53_special = DFA
			.unpackEncodedString(DFA53_specialS);

	/** The Constant DFA53_transition. */
	static final short[][] DFA53_transition;

	static {
		int numStates = DFA53_transitionS.length;
		DFA53_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
		}
	}

	/**
	 * The Class DFA53.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA53 extends DFA {

		/**
		 * Instantiates a new dF a53.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA53(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 53;
			this.eot = DFA53_eot;
			this.eof = DFA53_eof;
			this.min = DFA53_min;
			this.max = DFA53_max;
			this.accept = DFA53_accept;
			this.special = DFA53_special;
			this.transition = DFA53_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "282:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA53_1 = input.LA(1);

				int index53_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA53_2 = input.LA(1);

				int index53_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA53_3 = input.LA(1);

				int index53_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA53_4 = input.LA(1);

				int index53_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA53_5 = input.LA(1);

				int index53_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA53_6 = input.LA(1);

				int index53_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA53_7 = input.LA(1);

				int index53_7 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA53_8 = input.LA(1);

				int index53_8 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA53_9 = input.LA(1);

				int index53_9 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA53_10 = input.LA(1);

				int index53_10 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA53_11 = input.LA(1);

				int index53_11 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 11:
				int LA53_12 = input.LA(1);

				int index53_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_12);
				if (s >= 0) {
					return s;
				}
				break;
			case 12:
				int LA53_13 = input.LA(1);

				int index53_13 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred97_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((TinyHaxeTry1Parser.this.synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((TinyHaxeTry1Parser.this.synpred99_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((TinyHaxeTry1Parser.this.synpred100_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index53_13);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 53, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA55_eotS. */
	static final String DFA55_eotS = "\64\uffff";

	/** The Constant DFA55_eofS. */
	static final String DFA55_eofS = "\1\16\63\uffff";

	/** The Constant DFA55_minS. */
	static final String DFA55_minS = "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";

	/** The Constant DFA55_maxS. */
	static final String DFA55_maxS = "\1\147\1\uffff\1\0\11\uffff\1\0\47\uffff";

	/** The Constant DFA55_acceptS. */
	static final String DFA55_acceptS = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"
			+ "\1\6";

	/** The Constant DFA55_specialS. */
	static final String DFA55_specialS = "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";

	/** The Constant DFA55_transitionS. */
	static final String[] DFA55_transitionS = {
			"\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\2\16\5\uffff\2"
					+ "\16\5\uffff\1\16\4\uffff\1\3\1\16\7\uffff\23\16\2\uffff\1\4"
					+ "\11\uffff\7\5", "", "\1\uffff", "", "", "", "", "", "",
			"", "", "", "\1\uffff", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA55_eot. */
	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);

	/** The Constant DFA55_eof. */
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);

	/** The Constant DFA55_min. */
	static final char[] DFA55_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA55_minS);

	/** The Constant DFA55_max. */
	static final char[] DFA55_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA55_maxS);

	/** The Constant DFA55_accept. */
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);

	/** The Constant DFA55_special. */
	static final short[] DFA55_special = DFA
			.unpackEncodedString(DFA55_specialS);

	/** The Constant DFA55_transition. */
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	/**
	 * The Class DFA55.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA55 extends DFA {

		/**
		 * Instantiates a new dF a55.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA55(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "290:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA55_2 = input.LA(1);

				int index55_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred102_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index55_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA55_12 = input.LA(1);

				int index55_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred107_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index55_12);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 55, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA54_eotS. */
	static final String DFA54_eotS = "\77\uffff";

	/** The Constant DFA54_eofS. */
	static final String DFA54_eofS = "\77\uffff";

	/** The Constant DFA54_minS. */
	static final String DFA54_minS = "\1\20\54\0\22\uffff";

	/** The Constant DFA54_maxS. */
	static final String DFA54_maxS = "\1\147\54\0\22\uffff";

	/** The Constant DFA54_acceptS. */
	static final String DFA54_acceptS = "\55\uffff\1\1\1\2\20\uffff";

	/** The Constant DFA54_specialS. */
	static final String DFA54_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";

	/** The Constant DFA54_transitionS. */
	static final String[] DFA54_transitionS = {
			"\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"
					+ "\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1\2\1\56"
					+ "\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3\uffff\1\46\1\44"
					+ "\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\33\1\27\1\22"
					+ "\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1\56\6\uffff\1"
					+ "\10\1\11\1\12\1\13\1\14\1\15\1\16", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA54_eot. */
	static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);

	/** The Constant DFA54_eof. */
	static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);

	/** The Constant DFA54_min. */
	static final char[] DFA54_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA54_minS);

	/** The Constant DFA54_max. */
	static final char[] DFA54_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA54_maxS);

	/** The Constant DFA54_accept. */
	static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);

	/** The Constant DFA54_special. */
	static final short[] DFA54_special = DFA
			.unpackEncodedString(DFA54_specialS);

	/** The Constant DFA54_transition. */
	static final short[][] DFA54_transition;

	static {
		int numStates = DFA54_transitionS.length;
		DFA54_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
		}
	}

	/**
	 * The Class DFA54.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA54 extends DFA {

		/**
		 * Instantiates a new dF a54.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA54(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 54;
			this.eot = DFA54_eot;
			this.eof = DFA54_eof;
			this.min = DFA54_min;
			this.max = DFA54_max;
			this.accept = DFA54_accept;
			this.special = DFA54_special;
			this.transition = DFA54_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "295:22: ( expr | statement )";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA54_1 = input.LA(1);

				int index54_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA54_2 = input.LA(1);

				int index54_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA54_3 = input.LA(1);

				int index54_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA54_4 = input.LA(1);

				int index54_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA54_5 = input.LA(1);

				int index54_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA54_6 = input.LA(1);

				int index54_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA54_7 = input.LA(1);

				int index54_7 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA54_8 = input.LA(1);

				int index54_8 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA54_9 = input.LA(1);

				int index54_9 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA54_10 = input.LA(1);

				int index54_10 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA54_11 = input.LA(1);

				int index54_11 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 11:
				int LA54_12 = input.LA(1);

				int index54_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_12);
				if (s >= 0) {
					return s;
				}
				break;
			case 12:
				int LA54_13 = input.LA(1);

				int index54_13 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_13);
				if (s >= 0) {
					return s;
				}
				break;
			case 13:
				int LA54_14 = input.LA(1);

				int index54_14 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_14);
				if (s >= 0) {
					return s;
				}
				break;
			case 14:
				int LA54_15 = input.LA(1);

				int index54_15 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_15);
				if (s >= 0) {
					return s;
				}
				break;
			case 15:
				int LA54_16 = input.LA(1);

				int index54_16 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_16);
				if (s >= 0) {
					return s;
				}
				break;
			case 16:
				int LA54_17 = input.LA(1);

				int index54_17 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_17);
				if (s >= 0) {
					return s;
				}
				break;
			case 17:
				int LA54_18 = input.LA(1);

				int index54_18 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_18);
				if (s >= 0) {
					return s;
				}
				break;
			case 18:
				int LA54_19 = input.LA(1);

				int index54_19 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_19);
				if (s >= 0) {
					return s;
				}
				break;
			case 19:
				int LA54_20 = input.LA(1);

				int index54_20 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_20);
				if (s >= 0) {
					return s;
				}
				break;
			case 20:
				int LA54_21 = input.LA(1);

				int index54_21 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_21);
				if (s >= 0) {
					return s;
				}
				break;
			case 21:
				int LA54_22 = input.LA(1);

				int index54_22 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_22);
				if (s >= 0) {
					return s;
				}
				break;
			case 22:
				int LA54_23 = input.LA(1);

				int index54_23 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_23);
				if (s >= 0) {
					return s;
				}
				break;
			case 23:
				int LA54_24 = input.LA(1);

				int index54_24 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_24);
				if (s >= 0) {
					return s;
				}
				break;
			case 24:
				int LA54_25 = input.LA(1);

				int index54_25 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_25);
				if (s >= 0) {
					return s;
				}
				break;
			case 25:
				int LA54_26 = input.LA(1);

				int index54_26 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_26);
				if (s >= 0) {
					return s;
				}
				break;
			case 26:
				int LA54_27 = input.LA(1);

				int index54_27 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_27);
				if (s >= 0) {
					return s;
				}
				break;
			case 27:
				int LA54_28 = input.LA(1);

				int index54_28 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_28);
				if (s >= 0) {
					return s;
				}
				break;
			case 28:
				int LA54_29 = input.LA(1);

				int index54_29 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_29);
				if (s >= 0) {
					return s;
				}
				break;
			case 29:
				int LA54_30 = input.LA(1);

				int index54_30 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_30);
				if (s >= 0) {
					return s;
				}
				break;
			case 30:
				int LA54_31 = input.LA(1);

				int index54_31 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_31);
				if (s >= 0) {
					return s;
				}
				break;
			case 31:
				int LA54_32 = input.LA(1);

				int index54_32 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_32);
				if (s >= 0) {
					return s;
				}
				break;
			case 32:
				int LA54_33 = input.LA(1);

				int index54_33 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_33);
				if (s >= 0) {
					return s;
				}
				break;
			case 33:
				int LA54_34 = input.LA(1);

				int index54_34 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_34);
				if (s >= 0) {
					return s;
				}
				break;
			case 34:
				int LA54_35 = input.LA(1);

				int index54_35 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_35);
				if (s >= 0) {
					return s;
				}
				break;
			case 35:
				int LA54_36 = input.LA(1);

				int index54_36 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_36);
				if (s >= 0) {
					return s;
				}
				break;
			case 36:
				int LA54_37 = input.LA(1);

				int index54_37 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_37);
				if (s >= 0) {
					return s;
				}
				break;
			case 37:
				int LA54_38 = input.LA(1);

				int index54_38 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_38);
				if (s >= 0) {
					return s;
				}
				break;
			case 38:
				int LA54_39 = input.LA(1);

				int index54_39 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_39);
				if (s >= 0) {
					return s;
				}
				break;
			case 39:
				int LA54_40 = input.LA(1);

				int index54_40 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_40);
				if (s >= 0) {
					return s;
				}
				break;
			case 40:
				int LA54_41 = input.LA(1);

				int index54_41 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_41);
				if (s >= 0) {
					return s;
				}
				break;
			case 41:
				int LA54_42 = input.LA(1);

				int index54_42 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_42);
				if (s >= 0) {
					return s;
				}
				break;
			case 42:
				int LA54_43 = input.LA(1);

				int index54_43 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_43);
				if (s >= 0) {
					return s;
				}
				break;
			case 43:
				int LA54_44 = input.LA(1);

				int index54_44 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index54_44);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 54, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant DFA67_eotS. */
	static final String DFA67_eotS = "\11\uffff";

	/** The Constant DFA67_eofS. */
	static final String DFA67_eofS = "\11\uffff";

	/** The Constant DFA67_minS. */
	static final String DFA67_minS = "\6\24\1\21\2\uffff";

	/** The Constant DFA67_maxS. */
	static final String DFA67_maxS = "\6\42\1\60\2\uffff";

	/** The Constant DFA67_acceptS. */
	static final String DFA67_acceptS = "\7\uffff\1\1\1\2";

	/** The Constant DFA67_specialS. */
	static final String DFA67_specialS = "\11\uffff}>";

	/** The Constant DFA67_transitionS. */
	static final String[] DFA67_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6", "\1\10\36\uffff\1\7", "", "" };

	/** The Constant DFA67_eot. */
	static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);

	/** The Constant DFA67_eof. */
	static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);

	/** The Constant DFA67_min. */
	static final char[] DFA67_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA67_minS);

	/** The Constant DFA67_max. */
	static final char[] DFA67_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA67_maxS);

	/** The Constant DFA67_accept. */
	static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);

	/** The Constant DFA67_special. */
	static final short[] DFA67_special = DFA
			.unpackEncodedString(DFA67_specialS);

	/** The Constant DFA67_transition. */
	static final short[][] DFA67_transition;

	static {
		int numStates = DFA67_transitionS.length;
		DFA67_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
		}
	}

	/**
	 * The Class DFA67.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA67 extends DFA {

		/**
		 * Instantiates a new dF a67.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA67(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 67;
			this.eot = DFA67_eot;
			this.eof = DFA67_eof;
			this.min = DFA67_min;
			this.max = DFA67_max;
			this.accept = DFA67_accept;
			this.special = DFA67_special;
			this.transition = DFA67_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "363:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
		}
	}

	/** The Constant DFA68_eotS. */
	static final String DFA68_eotS = "\14\uffff";

	/** The Constant DFA68_eofS. */
	static final String DFA68_eofS = "\14\uffff";

	/** The Constant DFA68_minS. */
	static final String DFA68_minS = "\6\24\2\21\4\uffff";

	/** The Constant DFA68_maxS. */
	static final String DFA68_maxS = "\6\42\2\60\4\uffff";

	/** The Constant DFA68_acceptS. */
	static final String DFA68_acceptS = "\10\uffff\1\3\1\4\1\2\1\1";

	/** The Constant DFA68_specialS. */
	static final String DFA68_specialS = "\14\uffff}>";

	/** The Constant DFA68_transitionS. */
	static final String[] DFA68_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7", "\1\11\36\uffff\1\10",
			"\1\12\36\uffff\1\13", "", "", "", "" };

	/** The Constant DFA68_eot. */
	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);

	/** The Constant DFA68_eof. */
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);

	/** The Constant DFA68_min. */
	static final char[] DFA68_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA68_minS);

	/** The Constant DFA68_max. */
	static final char[] DFA68_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA68_maxS);

	/** The Constant DFA68_accept. */
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);

	/** The Constant DFA68_special. */
	static final short[] DFA68_special = DFA
			.unpackEncodedString(DFA68_specialS);

	/** The Constant DFA68_transition. */
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	/**
	 * The Class DFA68.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA68 extends DFA {

		/**
		 * Instantiates a new dF a68.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA68(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 68;
			this.eot = DFA68_eot;
			this.eof = DFA68_eof;
			this.min = DFA68_min;
			this.max = DFA68_max;
			this.accept = DFA68_accept;
			this.special = DFA68_special;
			this.transition = DFA68_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "369:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
		}
	}

	/** The Constant DFA70_eotS. */
	static final String DFA70_eotS = "\12\uffff";

	/** The Constant DFA70_eofS. */
	static final String DFA70_eofS = "\1\11\11\uffff";

	/** The Constant DFA70_minS. */
	static final String DFA70_minS = "\6\24\4\uffff";

	/** The Constant DFA70_maxS. */
	static final String DFA70_maxS = "\6\132\4\uffff";

	/** The Constant DFA70_acceptS. */
	static final String DFA70_acceptS = "\6\uffff\1\1\1\2\1\3\1\4";

	/** The Constant DFA70_specialS. */
	static final String DFA70_specialS = "\12\uffff}>";

	/** The Constant DFA70_transitionS. */
	static final String[] DFA70_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\27\uffff\1\11\36\uffff\1"
					+ "\10\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6", "", "", "", "" };

	/** The Constant DFA70_eot. */
	static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);

	/** The Constant DFA70_eof. */
	static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);

	/** The Constant DFA70_min. */
	static final char[] DFA70_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA70_minS);

	/** The Constant DFA70_max. */
	static final char[] DFA70_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA70_maxS);

	/** The Constant DFA70_accept. */
	static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);

	/** The Constant DFA70_special. */
	static final short[] DFA70_special = DFA
			.unpackEncodedString(DFA70_specialS);

	/** The Constant DFA70_transition. */
	static final short[][] DFA70_transition;

	static {
		int numStates = DFA70_transitionS.length;
		DFA70_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
		}
	}

	/**
	 * The Class DFA70.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA70 extends DFA {

		/**
		 * Instantiates a new dF a70.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA70(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 70;
			this.eot = DFA70_eot;
			this.eof = DFA70_eof;
			this.min = DFA70_min;
			this.max = DFA70_max;
			this.accept = DFA70_accept;
			this.special = DFA70_special;
			this.transition = DFA70_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "389:1: classBody : ( varDecl classBody | funcDecl classBody | enumDecl classBody | );";
		}
	}

	/** The Constant DFA71_eotS. */
	static final String DFA71_eotS = "\11\uffff";

	/** The Constant DFA71_eofS. */
	static final String DFA71_eofS = "\1\10\10\uffff";

	/** The Constant DFA71_minS. */
	static final String DFA71_minS = "\6\24\3\uffff";

	/** The Constant DFA71_maxS. */
	static final String DFA71_maxS = "\6\132\3\uffff";

	/** The Constant DFA71_acceptS. */
	static final String DFA71_acceptS = "\6\uffff\1\1\1\2\1\3";

	/** The Constant DFA71_specialS. */
	static final String DFA71_specialS = "\11\uffff}>";

	/** The Constant DFA71_transitionS. */
	static final String[] DFA71_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\27\uffff\1\10\37\uffff\1" + "\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\67\uffff\1\6", "", "", "" };

	/** The Constant DFA71_eot. */
	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);

	/** The Constant DFA71_eof. */
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);

	/** The Constant DFA71_min. */
	static final char[] DFA71_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA71_minS);

	/** The Constant DFA71_max. */
	static final char[] DFA71_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA71_maxS);

	/** The Constant DFA71_accept. */
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);

	/** The Constant DFA71_special. */
	static final short[] DFA71_special = DFA
			.unpackEncodedString(DFA71_specialS);

	/** The Constant DFA71_transition. */
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	/**
	 * The Class DFA71.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA71 extends DFA {

		/**
		 * Instantiates a new dF a71.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA71(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 71;
			this.eot = DFA71_eot;
			this.eof = DFA71_eof;
			this.min = DFA71_min;
			this.max = DFA71_max;
			this.accept = DFA71_accept;
			this.special = DFA71_special;
			this.transition = DFA71_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "401:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | );";
		}
	}

	/** The Constant DFA91_eotS. */
	static final String DFA91_eotS = "\77\uffff";

	/** The Constant DFA91_eofS. */
	static final String DFA91_eofS = "\77\uffff";

	/** The Constant DFA91_minS. */
	static final String DFA91_minS = "\1\20\54\0\22\uffff";

	/** The Constant DFA91_maxS. */
	static final String DFA91_maxS = "\1\147\54\0\22\uffff";

	/** The Constant DFA91_acceptS. */
	static final String DFA91_acceptS = "\55\uffff\1\1\1\2\20\uffff";

	/** The Constant DFA91_specialS. */
	static final String DFA91_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";

	/** The Constant DFA91_transitionS. */
	static final String[] DFA91_transitionS = {
			"\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"
					+ "\53\1\54\1\4\1\17\1\55\1\5\7\uffff\1\23\1\32\1\uffff\1\2\1\56"
					+ "\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3\uffff\1\46\1\44"
					+ "\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\33\1\27\1\22"
					+ "\1\24\1\25\1\26\1\21\1\1\2\30\1\7\1\3\1\uffff\1\56\6\uffff\1"
					+ "\10\1\11\1\12\1\13\1\14\1\15\1\16", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "" };

	/** The Constant DFA91_eot. */
	static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);

	/** The Constant DFA91_eof. */
	static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);

	/** The Constant DFA91_min. */
	static final char[] DFA91_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA91_minS);

	/** The Constant DFA91_max. */
	static final char[] DFA91_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA91_maxS);

	/** The Constant DFA91_accept. */
	static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);

	/** The Constant DFA91_special. */
	static final short[] DFA91_special = DFA
			.unpackEncodedString(DFA91_specialS);

	/** The Constant DFA91_transition. */
	static final short[][] DFA91_transition;

	static {
		int numStates = DFA91_transitionS.length;
		DFA91_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
		}
	}

	/**
	 * The Class DFA91.
	 * 
	 * @author Anatoly Kondratyev
	 */
	class DFA91 extends DFA {

		/**
		 * Instantiates a new dF a91.
		 * 
		 * @param recognizer
		 *            the recognizer
		 */
		public DFA91(final BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 91;
			this.eot = DFA91_eot;
			this.eof = DFA91_eof;
			this.min = DFA91_min;
			this.max = DFA91_max;
			this.accept = DFA91_accept;
			this.special = DFA91_special;
			this.transition = DFA91_transition;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#getDescription()
		 */
		@Override
		public String getDescription() {
			return "295:22: ( expr | statement )";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.antlr.runtime.DFA#specialStateTransition(int,
		 * org.antlr.runtime.IntStream)
		 */
		@Override
		public int specialStateTransition(int s, final IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA91_1 = input.LA(1);

				int index91_1 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_1);
				if (s >= 0) {
					return s;
				}
				break;
			case 1:
				int LA91_2 = input.LA(1);

				int index91_2 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_2);
				if (s >= 0) {
					return s;
				}
				break;
			case 2:
				int LA91_3 = input.LA(1);

				int index91_3 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_3);
				if (s >= 0) {
					return s;
				}
				break;
			case 3:
				int LA91_4 = input.LA(1);

				int index91_4 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_4);
				if (s >= 0) {
					return s;
				}
				break;
			case 4:
				int LA91_5 = input.LA(1);

				int index91_5 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_5);
				if (s >= 0) {
					return s;
				}
				break;
			case 5:
				int LA91_6 = input.LA(1);

				int index91_6 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_6);
				if (s >= 0) {
					return s;
				}
				break;
			case 6:
				int LA91_7 = input.LA(1);

				int index91_7 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_7);
				if (s >= 0) {
					return s;
				}
				break;
			case 7:
				int LA91_8 = input.LA(1);

				int index91_8 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_8);
				if (s >= 0) {
					return s;
				}
				break;
			case 8:
				int LA91_9 = input.LA(1);

				int index91_9 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_9);
				if (s >= 0) {
					return s;
				}
				break;
			case 9:
				int LA91_10 = input.LA(1);

				int index91_10 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_10);
				if (s >= 0) {
					return s;
				}
				break;
			case 10:
				int LA91_11 = input.LA(1);

				int index91_11 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_11);
				if (s >= 0) {
					return s;
				}
				break;
			case 11:
				int LA91_12 = input.LA(1);

				int index91_12 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_12);
				if (s >= 0) {
					return s;
				}
				break;
			case 12:
				int LA91_13 = input.LA(1);

				int index91_13 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_13);
				if (s >= 0) {
					return s;
				}
				break;
			case 13:
				int LA91_14 = input.LA(1);

				int index91_14 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_14);
				if (s >= 0) {
					return s;
				}
				break;
			case 14:
				int LA91_15 = input.LA(1);

				int index91_15 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_15);
				if (s >= 0) {
					return s;
				}
				break;
			case 15:
				int LA91_16 = input.LA(1);

				int index91_16 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_16);
				if (s >= 0) {
					return s;
				}
				break;
			case 16:
				int LA91_17 = input.LA(1);

				int index91_17 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_17);
				if (s >= 0) {
					return s;
				}
				break;
			case 17:
				int LA91_18 = input.LA(1);

				int index91_18 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_18);
				if (s >= 0) {
					return s;
				}
				break;
			case 18:
				int LA91_19 = input.LA(1);

				int index91_19 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_19);
				if (s >= 0) {
					return s;
				}
				break;
			case 19:
				int LA91_20 = input.LA(1);

				int index91_20 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_20);
				if (s >= 0) {
					return s;
				}
				break;
			case 20:
				int LA91_21 = input.LA(1);

				int index91_21 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_21);
				if (s >= 0) {
					return s;
				}
				break;
			case 21:
				int LA91_22 = input.LA(1);

				int index91_22 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_22);
				if (s >= 0) {
					return s;
				}
				break;
			case 22:
				int LA91_23 = input.LA(1);

				int index91_23 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_23);
				if (s >= 0) {
					return s;
				}
				break;
			case 23:
				int LA91_24 = input.LA(1);

				int index91_24 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_24);
				if (s >= 0) {
					return s;
				}
				break;
			case 24:
				int LA91_25 = input.LA(1);

				int index91_25 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_25);
				if (s >= 0) {
					return s;
				}
				break;
			case 25:
				int LA91_26 = input.LA(1);

				int index91_26 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_26);
				if (s >= 0) {
					return s;
				}
				break;
			case 26:
				int LA91_27 = input.LA(1);

				int index91_27 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_27);
				if (s >= 0) {
					return s;
				}
				break;
			case 27:
				int LA91_28 = input.LA(1);

				int index91_28 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_28);
				if (s >= 0) {
					return s;
				}
				break;
			case 28:
				int LA91_29 = input.LA(1);

				int index91_29 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_29);
				if (s >= 0) {
					return s;
				}
				break;
			case 29:
				int LA91_30 = input.LA(1);

				int index91_30 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_30);
				if (s >= 0) {
					return s;
				}
				break;
			case 30:
				int LA91_31 = input.LA(1);

				int index91_31 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_31);
				if (s >= 0) {
					return s;
				}
				break;
			case 31:
				int LA91_32 = input.LA(1);

				int index91_32 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_32);
				if (s >= 0) {
					return s;
				}
				break;
			case 32:
				int LA91_33 = input.LA(1);

				int index91_33 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_33);
				if (s >= 0) {
					return s;
				}
				break;
			case 33:
				int LA91_34 = input.LA(1);

				int index91_34 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_34);
				if (s >= 0) {
					return s;
				}
				break;
			case 34:
				int LA91_35 = input.LA(1);

				int index91_35 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_35);
				if (s >= 0) {
					return s;
				}
				break;
			case 35:
				int LA91_36 = input.LA(1);

				int index91_36 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_36);
				if (s >= 0) {
					return s;
				}
				break;
			case 36:
				int LA91_37 = input.LA(1);

				int index91_37 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_37);
				if (s >= 0) {
					return s;
				}
				break;
			case 37:
				int LA91_38 = input.LA(1);

				int index91_38 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_38);
				if (s >= 0) {
					return s;
				}
				break;
			case 38:
				int LA91_39 = input.LA(1);

				int index91_39 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_39);
				if (s >= 0) {
					return s;
				}
				break;
			case 39:
				int LA91_40 = input.LA(1);

				int index91_40 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_40);
				if (s >= 0) {
					return s;
				}
				break;
			case 40:
				int LA91_41 = input.LA(1);

				int index91_41 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_41);
				if (s >= 0) {
					return s;
				}
				break;
			case 41:
				int LA91_42 = input.LA(1);

				int index91_42 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_42);
				if (s >= 0) {
					return s;
				}
				break;
			case 42:
				int LA91_43 = input.LA(1);

				int index91_43 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_43);
				if (s >= 0) {
					return s;
				}
				break;
			case 43:
				int LA91_44 = input.LA(1);

				int index91_44 = input.index();
				input.rewind();
				s = -1;
				if ((TinyHaxeTry1Parser.this.synpred106_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index91_44);
				if (s >= 0) {
					return s;
				}
				break;
			}
			if (TinyHaxeTry1Parser.this.state.backtracking > 0) {
				TinyHaxeTry1Parser.this.state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(this
					.getDescription(), 91, _s, input);
			this.error(nvae);
			throw nvae;
		}
	}

	/** The Constant FOLLOW_myPackage_in_module119. */
	public static final BitSet FOLLOW_myPackage_in_module119 = new BitSet(
			new long[] { 0x0000000000080000L, 0x000000013A000000L });

	/** The Constant FOLLOW_topLevelList_in_module122. */
	public static final BitSet FOLLOW_topLevelList_in_module122 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_topLevel_in_topLevelList157. */
	public static final BitSet FOLLOW_topLevel_in_topLevelList157 = new BitSet(
			new long[] { 0x0000000000080002L, 0x000000013A000000L });

	/** The Constant FOLLOW_myImport_in_topLevel176. */
	public static final BitSet FOLLOW_myImport_in_topLevel176 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_topLevelDecl_in_topLevel203. */
	public static final BitSet FOLLOW_topLevelDecl_in_topLevel203 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_PACKAGE_in_myPackage222. */
	public static final BitSet FOLLOW_PACKAGE_in_myPackage222 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_dotIdent_in_myPackage224. */
	public static final BitSet FOLLOW_dotIdent_in_myPackage224 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_myPackage226. */
	public static final BitSet FOLLOW_SEMI_in_myPackage226 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_qualifiedIdentifier258. */
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier258 = new BitSet(
			new long[] { 0x0000000000040002L });

	/** The Constant FOLLOW_DOT_in_qualifiedIdentifier274. */
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier274 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_qualifiedIdentifier278. */
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier278 = new BitSet(
			new long[] { 0x0000000000040002L });

	/** The Constant FOLLOW_IMPORT_in_myImport320. */
	public static final BitSet FOLLOW_IMPORT_in_myImport320 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_dotIdent_in_myImport323. */
	public static final BitSet FOLLOW_dotIdent_in_myImport323 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_myImport325. */
	public static final BitSet FOLLOW_SEMI_in_myImport325 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_set_in_access0. */
	public static final BitSet FOLLOW_set_in_access0 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_STATIC_in_declAttr412. */
	public static final BitSet FOLLOW_STATIC_in_declAttr412 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_INLINE_in_declAttr437. */
	public static final BitSet FOLLOW_INLINE_in_declAttr437 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_DYNAMIC_in_declAttr463. */
	public static final BitSet FOLLOW_DYNAMIC_in_declAttr463 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_OVERRIDE_in_declAttr489. */
	public static final BitSet FOLLOW_OVERRIDE_in_declAttr489 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_access_in_declAttr515. */
	public static final BitSet FOLLOW_access_in_declAttr515 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttr_in_declAttrList530. */
	public static final BitSet FOLLOW_declAttr_in_declAttrList530 = new BitSet(
			new long[] { 0x0000000003F00002L });

	/** The Constant FOLLOW_param_in_paramList571. */
	public static final BitSet FOLLOW_param_in_paramList571 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_paramList574. */
	public static final BitSet FOLLOW_COMMA_in_paramList574 = new BitSet(
			new long[] { 0x0000000008020000L });

	/** The Constant FOLLOW_param_in_paramList576. */
	public static final BitSet FOLLOW_param_in_paramList576 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_QUES_in_param615. */
	public static final BitSet FOLLOW_QUES_in_param615 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_param618. */
	public static final BitSet FOLLOW_IDENTIFIER_in_param618 = new BitSet(
			new long[] { 0x0000008010000000L });

	/** The Constant FOLLOW_typeTagOpt_in_param620. */
	public static final BitSet FOLLOW_typeTagOpt_in_param620 = new BitSet(
			new long[] { 0x0000000010000000L });

	/** The Constant FOLLOW_varInit_in_param622. */
	public static final BitSet FOLLOW_varInit_in_param622 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_id658. */
	public static final BitSet FOLLOW_IDENTIFIER_in_id658 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_id_in_dotIdent672. */
	public static final BitSet FOLLOW_id_in_dotIdent672 = new BitSet(
			new long[] { 0x0000000000040002L });

	/** The Constant FOLLOW_DOT_in_dotIdent680. */
	public static final BitSet FOLLOW_DOT_in_dotIdent680 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_id_in_dotIdent684. */
	public static final BitSet FOLLOW_id_in_dotIdent684 = new BitSet(
			new long[] { 0x0000000000040002L });

	/** The Constant FOLLOW_EQ_in_assignOp707. */
	public static final BitSet FOLLOW_EQ_in_assignOp707 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_PLUSEQ_in_assignOp727. */
	public static final BitSet FOLLOW_PLUSEQ_in_assignOp727 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_SUBEQ_in_assignOp748. */
	public static final BitSet FOLLOW_SUBEQ_in_assignOp748 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_SLASHEQ_in_assignOp768. */
	public static final BitSet FOLLOW_SLASHEQ_in_assignOp768 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_PERCENTEQ_in_assignOp781. */
	public static final BitSet FOLLOW_PERCENTEQ_in_assignOp781 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_AMPEQ_in_assignOp797. */
	public static final BitSet FOLLOW_AMPEQ_in_assignOp797 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FUNCTION_in_funcLit827. */
	public static final BitSet FOLLOW_FUNCTION_in_funcLit827 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcLit829. */
	public static final BitSet FOLLOW_LPAREN_in_funcLit829 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcLit831. */
	public static final BitSet FOLLOW_paramList_in_funcLit831 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcLit833. */
	public static final BitSet FOLLOW_RPAREN_in_funcLit833 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcLit835. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcLit835 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_funcLit838. */
	public static final BitSet FOLLOW_block_in_funcLit838 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LBRACKET_in_arrayLit873. */
	public static final BitSet FOLLOW_LBRACKET_in_arrayLit873 = new BitSet(
			new long[] { 0x0201206C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_exprListOpt_in_arrayLit876. */
	public static final BitSet FOLLOW_exprListOpt_in_arrayLit876 = new BitSet(
			new long[] { 0x0000004000000000L });

	/** The Constant FOLLOW_RBRACKET_in_arrayLit878. */
	public static final BitSet FOLLOW_RBRACKET_in_arrayLit878 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_COLON_in_typeTag897. */
	public static final BitSet FOLLOW_COLON_in_typeTag897 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_typeTag900. */
	public static final BitSet FOLLOW_funcType_in_typeTag900 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_typeTag_in_typeTagOpt912. */
	public static final BitSet FOLLOW_typeTag_in_typeTagOpt912 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_funcType_in_typeList938. */
	public static final BitSet FOLLOW_funcType_in_typeList938 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_typeList941. */
	public static final BitSet FOLLOW_COMMA_in_typeList941 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_typeList944. */
	public static final BitSet FOLLOW_funcType_in_typeList944 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_typeConstraint_in_typeList952. */
	public static final BitSet FOLLOW_typeConstraint_in_typeList952 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_typeList955. */
	public static final BitSet FOLLOW_COMMA_in_typeList955 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_typeConstraint_in_typeList958. */
	public static final BitSet FOLLOW_typeConstraint_in_typeList958 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_type_in_funcType973. */
	public static final BitSet FOLLOW_type_in_funcType973 = new BitSet(
			new long[] { 0x0000010000000002L });

	/** The Constant FOLLOW_MINUS_BIGGER_in_funcType977. */
	public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType977 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_type_in_funcType980. */
	public static final BitSet FOLLOW_type_in_funcType980 = new BitSet(
			new long[] { 0x0000010000000002L });

	/** The Constant FOLLOW_VOID_in_funcType987. */
	public static final BitSet FOLLOW_VOID_in_funcType987 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_anonType_in_type999. */
	public static final BitSet FOLLOW_anonType_in_type999 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_dotIdent_in_type1003. */
	public static final BitSet FOLLOW_dotIdent_in_type1003 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_INT_in_type1006. */
	public static final BitSet FOLLOW_INT_in_type1006 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_FLOAT_in_type1009. */
	public static final BitSet FOLLOW_FLOAT_in_type1009 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_DYNAMIC_in_type1012. */
	public static final BitSet FOLLOW_DYNAMIC_in_type1012 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_BOOLEAN_in_type1014. */
	public static final BitSet FOLLOW_BOOLEAN_in_type1014 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_VOID_in_type1016. */
	public static final BitSet FOLLOW_VOID_in_type1016 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_typeParam_in_type1020. */
	public static final BitSet FOLLOW_typeParam_in_type1020 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_LT_in_typeParam1038. */
	public static final BitSet FOLLOW_LT_in_typeParam1038 = new BitSet(
			new long[] { 0x0200DF0001020000L });

	/** The Constant FOLLOW_type_in_typeParam1042. */
	public static final BitSet FOLLOW_type_in_typeParam1042 = new BitSet(
			new long[] { 0x0000C00000000002L });

	/** The Constant FOLLOW_typeList_in_typeParam1044. */
	public static final BitSet FOLLOW_typeList_in_typeParam1044 = new BitSet(
			new long[] { 0x0000C00000000002L });

	/** The Constant FOLLOW_GT_in_typeParam1048. */
	public static final BitSet FOLLOW_GT_in_typeParam1048 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_GTGT_in_typeParam1051. */
	public static final BitSet FOLLOW_GTGT_in_typeParam1051 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_typeParam_in_typeParamOpt1073. */
	public static final BitSet FOLLOW_typeParam_in_typeParamOpt1073 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_typeConstraint1115. */
	public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1115 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_typeConstraint1117. */
	public static final BitSet FOLLOW_COLON_in_typeConstraint1117 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_typeConstraint1119. */
	public static final BitSet FOLLOW_LPAREN_in_typeConstraint1119 = new BitSet(
			new long[] { 0x0200DF0001020000L });

	/** The Constant FOLLOW_typeList_in_typeConstraint1121. */
	public static final BitSet FOLLOW_typeList_in_typeConstraint1121 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_typeConstraint1123. */
	public static final BitSet FOLLOW_RPAREN_in_typeConstraint1123 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_functionReturn1149. */
	public static final BitSet FOLLOW_declAttrList_in_functionReturn1149 = new BitSet(
			new long[] { 0x0000000400000000L });

	/** The Constant FOLLOW_FUNCTION_in_functionReturn1152. */
	public static final BitSet FOLLOW_FUNCTION_in_functionReturn1152 = new BitSet(
			new long[] { 0x0001000000000000L });

	/** The Constant FOLLOW_NEW_in_functionReturn1154. */
	public static final BitSet FOLLOW_NEW_in_functionReturn1154 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_functionReturn1156. */
	public static final BitSet FOLLOW_LPAREN_in_functionReturn1156 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_functionReturn1158. */
	public static final BitSet FOLLOW_paramList_in_functionReturn1158 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_functionReturn1160. */
	public static final BitSet FOLLOW_RPAREN_in_functionReturn1160 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_functionReturn1162. */
	public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1162 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_functionReturn1164. */
	public static final BitSet FOLLOW_block_in_functionReturn1164 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_block_in_statement1201. */
	public static final BitSet FOLLOW_block_in_statement1201 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_assignExpr_in_statement1206. */
	public static final BitSet FOLLOW_assignExpr_in_statement1206 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1208. */
	public static final BitSet FOLLOW_SEMI_in_statement1208 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_statement1214. */
	public static final BitSet FOLLOW_varDecl_in_statement1214 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IF_in_statement1219. */
	public static final BitSet FOLLOW_IF_in_statement1219 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_parExpression_in_statement1221. */
	public static final BitSet FOLLOW_parExpression_in_statement1221 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1225. */
	public static final BitSet FOLLOW_statement_in_statement1225 = new BitSet(
			new long[] { 0x0004000000000002L });

	/** The Constant FOLLOW_ELSE_in_statement1228. */
	public static final BitSet FOLLOW_ELSE_in_statement1228 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1232. */
	public static final BitSet FOLLOW_statement_in_statement1232 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FOR_in_statement1272. */
	public static final BitSet FOLLOW_FOR_in_statement1272 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_statement1274. */
	public static final BitSet FOLLOW_LPAREN_in_statement1274 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_statement1278. */
	public static final BitSet FOLLOW_expr_in_statement1278 = new BitSet(
			new long[] { 0x0010000000000000L });

	/** The Constant FOLLOW_IN_in_statement1280. */
	public static final BitSet FOLLOW_IN_in_statement1280 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_statement1284. */
	public static final BitSet FOLLOW_expr_in_statement1284 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_statement1286. */
	public static final BitSet FOLLOW_RPAREN_in_statement1286 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1288. */
	public static final BitSet FOLLOW_statement_in_statement1288 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_WHILE_in_statement1316. */
	public static final BitSet FOLLOW_WHILE_in_statement1316 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_parExpression_in_statement1318. */
	public static final BitSet FOLLOW_parExpression_in_statement1318 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1320. */
	public static final BitSet FOLLOW_statement_in_statement1320 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_DO_in_statement1344. */
	public static final BitSet FOLLOW_DO_in_statement1344 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1346. */
	public static final BitSet FOLLOW_statement_in_statement1346 = new BitSet(
			new long[] { 0x0020000000000000L });

	/** The Constant FOLLOW_WHILE_in_statement1348. */
	public static final BitSet FOLLOW_WHILE_in_statement1348 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_parExpression_in_statement1350. */
	public static final BitSet FOLLOW_parExpression_in_statement1350 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1352. */
	public static final BitSet FOLLOW_SEMI_in_statement1352 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_TRY_in_statement1375. */
	public static final BitSet FOLLOW_TRY_in_statement1375 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_statement1377. */
	public static final BitSet FOLLOW_block_in_statement1377 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000002L });

	/** The Constant FOLLOW_catchStmtList_in_statement1379. */
	public static final BitSet FOLLOW_catchStmtList_in_statement1379 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_SWITCH_in_statement1403. */
	public static final BitSet FOLLOW_SWITCH_in_statement1403 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_statement1405. */
	public static final BitSet FOLLOW_LPAREN_in_statement1405 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_statement1407. */
	public static final BitSet FOLLOW_expr_in_statement1407 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_statement1409. */
	public static final BitSet FOLLOW_RPAREN_in_statement1409 = new BitSet(
			new long[] { 0x0200000000000000L });

	/** The Constant FOLLOW_LBRACE_in_statement1411. */
	public static final BitSet FOLLOW_LBRACE_in_statement1411 = new BitSet(
			new long[] { 0x8000000000000000L, 0x0000000000000001L });

	/** The Constant FOLLOW_caseStmt_in_statement1413. */
	public static final BitSet FOLLOW_caseStmt_in_statement1413 = new BitSet(
			new long[] { 0x8400000000000000L, 0x0000000000000001L });

	/** The Constant FOLLOW_RBRACE_in_statement1416. */
	public static final BitSet FOLLOW_RBRACE_in_statement1416 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_RETURN_in_statement1437. */
	public static final BitSet FOLLOW_RETURN_in_statement1437 = new BitSet(
			new long[] { 0x0201202C00030000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_statement1440. */
	public static final BitSet FOLLOW_expr_in_statement1440 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1444. */
	public static final BitSet FOLLOW_SEMI_in_statement1444 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_THROW_in_statement1462. */
	public static final BitSet FOLLOW_THROW_in_statement1462 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_statement1464. */
	public static final BitSet FOLLOW_expr_in_statement1464 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1466. */
	public static final BitSet FOLLOW_SEMI_in_statement1466 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_BREAK_in_statement1485. */
	public static final BitSet FOLLOW_BREAK_in_statement1485 = new BitSet(
			new long[] { 0x0000000000030000L });

	/** The Constant FOLLOW_IDENTIFIER_in_statement1488. */
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1488 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1492. */
	public static final BitSet FOLLOW_SEMI_in_statement1492 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CONTINUE_in_statement1509. */
	public static final BitSet FOLLOW_CONTINUE_in_statement1509 = new BitSet(
			new long[] { 0x0000000000030000L });

	/** The Constant FOLLOW_IDENTIFIER_in_statement1512. */
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1512 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1516. */
	public static final BitSet FOLLOW_SEMI_in_statement1516 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_expr_in_statement1534. */
	public static final BitSet FOLLOW_expr_in_statement1534 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_statement1537. */
	public static final BitSet FOLLOW_SEMI_in_statement1537 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_statement1543. */
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1543 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_statement1545. */
	public static final BitSet FOLLOW_COLON_in_statement1545 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_statement1547. */
	public static final BitSet FOLLOW_statement_in_statement1547 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_SEMI_in_statement1568. */
	public static final BitSet FOLLOW_SEMI_in_statement1568 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LPAREN_in_parExpression1589. */
	public static final BitSet FOLLOW_LPAREN_in_parExpression1589 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_parExpression1592. */
	public static final BitSet FOLLOW_expr_in_parExpression1592 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_parExpression1594. */
	public static final BitSet FOLLOW_RPAREN_in_parExpression1594 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LBRACE_in_block1609. */
	public static final BitSet FOLLOW_LBRACE_in_block1609 = new BitSet(
			new long[] { 0x7FEB20AC03F30000L, 0x000000FE1DF88000L });

	/** The Constant FOLLOW_blockStmt_in_block1612. */
	public static final BitSet FOLLOW_blockStmt_in_block1612 = new BitSet(
			new long[] { 0x7FEB20AC03F30000L, 0x000000FE1DF88000L });

	/** The Constant FOLLOW_RBRACE_in_block1616. */
	public static final BitSet FOLLOW_RBRACE_in_block1616 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_SEMI_in_block1636. */
	public static final BitSet FOLLOW_SEMI_in_block1636 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_blockStmt1649. */
	public static final BitSet FOLLOW_varDecl_in_blockStmt1649 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_classDecl_in_blockStmt1654. */
	public static final BitSet FOLLOW_classDecl_in_blockStmt1654 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_statement_in_blockStmt1659. */
	public static final BitSet FOLLOW_statement_in_blockStmt1659 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_BREAK_in_breakStmt1692. */
	public static final BitSet FOLLOW_BREAK_in_breakStmt1692 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_breakStmt1694. */
	public static final BitSet FOLLOW_SEMI_in_breakStmt1694 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CONTINUE_in_continueStmt1713. */
	public static final BitSet FOLLOW_CONTINUE_in_continueStmt1713 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_continueStmt1715. */
	public static final BitSet FOLLOW_SEMI_in_continueStmt1715 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CASE_in_caseStmt1726. */
	public static final BitSet FOLLOW_CASE_in_caseStmt1726 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_exprList_in_caseStmt1728. */
	public static final BitSet FOLLOW_exprList_in_caseStmt1728 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_caseStmt1730. */
	public static final BitSet FOLLOW_COLON_in_caseStmt1730 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_caseStmt1732. */
	public static final BitSet FOLLOW_statement_in_caseStmt1732 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_DEFAULT_in_caseStmt1750. */
	public static final BitSet FOLLOW_DEFAULT_in_caseStmt1750 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_caseStmt1752. */
	public static final BitSet FOLLOW_COLON_in_caseStmt1752 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_caseStmt1754. */
	public static final BitSet FOLLOW_statement_in_caseStmt1754 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_DEFAULT_in_defaultStmt1783. */
	public static final BitSet FOLLOW_DEFAULT_in_defaultStmt1783 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_defaultStmt1785. */
	public static final BitSet FOLLOW_COLON_in_defaultStmt1785 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_catchStmt_in_catchStmtList1798. */
	public static final BitSet FOLLOW_catchStmt_in_catchStmtList1798 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000002L });

	/** The Constant FOLLOW_catchStmtList_in_catchStmtList1800. */
	public static final BitSet FOLLOW_catchStmtList_in_catchStmtList1800 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CATCH_in_catchStmt1829. */
	public static final BitSet FOLLOW_CATCH_in_catchStmt1829 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_catchStmt1831. */
	public static final BitSet FOLLOW_LPAREN_in_catchStmt1831 = new BitSet(
			new long[] { 0x0000000008020000L });

	/** The Constant FOLLOW_param_in_catchStmt1833. */
	public static final BitSet FOLLOW_param_in_catchStmt1833 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_catchStmt1835. */
	public static final BitSet FOLLOW_RPAREN_in_catchStmt1835 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_catchStmt1837. */
	public static final BitSet FOLLOW_block_in_catchStmt1837 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_exprList_in_exprListOpt1863. */
	public static final BitSet FOLLOW_exprList_in_exprListOpt1863 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_expr_in_exprList1883. */
	public static final BitSet FOLLOW_expr_in_exprList1883 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_exprList1886. */
	public static final BitSet FOLLOW_COMMA_in_exprList1886 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_exprList1889. */
	public static final BitSet FOLLOW_expr_in_exprList1889 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_assignExpr_in_expr1902. */
	public static final BitSet FOLLOW_assignExpr_in_expr1902 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_iterExpr_in_assignExpr1922. */
	public static final BitSet FOLLOW_iterExpr_in_assignExpr1922 = new BitSet(
			new long[] { 0x00000003F0000002L });

	/** The Constant FOLLOW_assignOp_in_assignExpr1925. */
	public static final BitSet FOLLOW_assignOp_in_assignExpr1925 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_iterExpr_in_assignExpr1928. */
	public static final BitSet FOLLOW_iterExpr_in_assignExpr1928 = new BitSet(
			new long[] { 0x00000003F0000002L });

	/** The Constant FOLLOW_logicOrExpr_in_ternaryExpr1951. */
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1951 = new BitSet(
			new long[] { 0x0000000008000002L });

	/** The Constant FOLLOW_QUES_in_ternaryExpr1954. */
	public static final BitSet FOLLOW_QUES_in_ternaryExpr1954 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_ternaryExpr1957. */
	public static final BitSet FOLLOW_expr_in_ternaryExpr1957 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_ternaryExpr1959. */
	public static final BitSet FOLLOW_COLON_in_ternaryExpr1959 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_logicOrExpr_in_ternaryExpr1962. */
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr1962 = new BitSet(
			new long[] { 0x0000000008000002L });

	/** The Constant FOLLOW_ternaryExpr_in_iterExpr1974. */
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1974 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	/** The Constant FOLLOW_ELLIPSIS_in_iterExpr1977. */
	public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr1977 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_ternaryExpr_in_iterExpr1980. */
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr1980 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000004L });

	/** The Constant FOLLOW_logicAndExpr_in_logicOrExpr2009. */
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2009 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });

	/** The Constant FOLLOW_BARBAR_in_logicOrExpr2013. */
	public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2013 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_logicAndExpr_in_logicOrExpr2016. */
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2016 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });

	/** The Constant FOLLOW_cmpExpr_in_logicAndExpr2037. */
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2037 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000010L });

	/** The Constant FOLLOW_AMPAMP_in_logicAndExpr2041. */
	public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2041 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_cmpExpr_in_logicAndExpr2044. */
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2044 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000010L });

	/** The Constant FOLLOW_bitExpr_in_cmpExpr2058. */
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2058 = new BitSet(
			new long[] { 0x0000600000000002L, 0x00000000000001E0L });

	/** The Constant FOLLOW_EQEQ_in_cmpExpr2063. */
	public static final BitSet FOLLOW_EQEQ_in_cmpExpr2063 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_BANGEQ_in_cmpExpr2067. */
	public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2067 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_GTEQ_in_cmpExpr2072. */
	public static final BitSet FOLLOW_GTEQ_in_cmpExpr2072 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_LTEQ_in_cmpExpr2077. */
	public static final BitSet FOLLOW_LTEQ_in_cmpExpr2077 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_GT_in_cmpExpr2082. */
	public static final BitSet FOLLOW_GT_in_cmpExpr2082 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_LT_in_cmpExpr2087. */
	public static final BitSet FOLLOW_LT_in_cmpExpr2087 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_bitExpr_in_cmpExpr2092. */
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2092 = new BitSet(
			new long[] { 0x0000600000000002L, 0x00000000000001E0L });

	/** The Constant FOLLOW_shiftExpr_in_bitExpr2106. */
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2106 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000E00L });

	/** The Constant FOLLOW_BAR_in_bitExpr2110. */
	public static final BitSet FOLLOW_BAR_in_bitExpr2110 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_shiftExpr_in_bitExpr2113. */
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2113 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000E00L });

	/** The Constant FOLLOW_AMP_in_bitExpr2117. */
	public static final BitSet FOLLOW_AMP_in_bitExpr2117 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_shiftExpr_in_bitExpr2120. */
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2120 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000E00L });

	/** The Constant FOLLOW_CARET_in_bitExpr2123. */
	public static final BitSet FOLLOW_CARET_in_bitExpr2123 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_shiftExpr_in_bitExpr2126. */
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2126 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000E00L });

	/** The Constant FOLLOW_addExpr_in_shiftExpr2140. */
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2140 = new BitSet(
			new long[] { 0x0000400000000002L, 0x0000000000003000L });

	/** The Constant FOLLOW_LTLT_in_shiftExpr2144. */
	public static final BitSet FOLLOW_LTLT_in_shiftExpr2144 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_addExpr_in_shiftExpr2148. */
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2148 = new BitSet(
			new long[] { 0x0000400000000002L, 0x0000000000003000L });

	/** The Constant FOLLOW_GT_in_shiftExpr2153. */
	public static final BitSet FOLLOW_GT_in_shiftExpr2153 = new BitSet(
			new long[] { 0x0000400000000000L });

	/** The Constant FOLLOW_GT_in_shiftExpr2155. */
	public static final BitSet FOLLOW_GT_in_shiftExpr2155 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_addExpr_in_shiftExpr2160. */
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2160 = new BitSet(
			new long[] { 0x0000400000000002L, 0x0000000000003000L });

	/** The Constant FOLLOW_GTGTGT_in_shiftExpr2164. */
	public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2164 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_addExpr_in_shiftExpr2167. */
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2167 = new BitSet(
			new long[] { 0x0000400000000002L, 0x0000000000003000L });

	/** The Constant FOLLOW_multExpr_in_addExpr2181. */
	public static final BitSet FOLLOW_multExpr_in_addExpr2181 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000C000L });

	/** The Constant FOLLOW_PLUS_in_addExpr2186. */
	public static final BitSet FOLLOW_PLUS_in_addExpr2186 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_SUB_in_addExpr2191. */
	public static final BitSet FOLLOW_SUB_in_addExpr2191 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_multExpr_in_addExpr2195. */
	public static final BitSet FOLLOW_multExpr_in_addExpr2195 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000C000L });

	/** The Constant FOLLOW_prefixExpr_in_multExpr2209. */
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2209 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000070000L });

	/** The Constant FOLLOW_STAR_in_multExpr2214. */
	public static final BitSet FOLLOW_STAR_in_multExpr2214 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_SLASH_in_multExpr2217. */
	public static final BitSet FOLLOW_SLASH_in_multExpr2217 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_PERCENT_in_multExpr2220. */
	public static final BitSet FOLLOW_PERCENT_in_multExpr2220 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_prefixExpr_in_multExpr2224. */
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2224 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000070000L });

	/** The Constant FOLLOW_set_in_prefixExpr2245. */
	public static final BitSet FOLLOW_set_in_prefixExpr2245 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_prefixExpr_in_prefixExpr2257. */
	public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2257 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_newExpr_in_prefixExpr2269. */
	public static final BitSet FOLLOW_newExpr_in_prefixExpr2269 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_cast_in_prefixExpr2281. */
	public static final BitSet FOLLOW_cast_in_prefixExpr2281 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_suffixExpr_in_prefixExpr2293. */
	public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2293 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_suffixExpr2312. */
	public static final BitSet FOLLOW_value_in_suffixExpr2312 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_suffixExpr2314. */
	public static final BitSet FOLLOW_LPAREN_in_suffixExpr2314 = new BitSet(
			new long[] { 0x0201203C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_exprListOpt_in_suffixExpr2316. */
	public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2316 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_suffixExpr2318. */
	public static final BitSet FOLLOW_RPAREN_in_suffixExpr2318 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_suffixExpr2339. */
	public static final BitSet FOLLOW_value_in_suffixExpr2339 = new BitSet(
			new long[] { 0x0000002000000000L });

	/** The Constant FOLLOW_LBRACKET_in_suffixExpr2341. */
	public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2341 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_suffixExpr2343. */
	public static final BitSet FOLLOW_expr_in_suffixExpr2343 = new BitSet(
			new long[] { 0x0000004000000000L });

	/** The Constant FOLLOW_RBRACKET_in_suffixExpr2345. */
	public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2345 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_suffixExpr2350. */
	public static final BitSet FOLLOW_value_in_suffixExpr2350 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000100000L });

	/** The Constant FOLLOW_PLUSPLUS_in_suffixExpr2352. */
	public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2352 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_suffixExpr2376. */
	public static final BitSet FOLLOW_value_in_suffixExpr2376 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000080000L });

	/** The Constant FOLLOW_SUBSUB_in_suffixExpr2378. */
	public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2378 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_suffixExpr2401. */
	public static final BitSet FOLLOW_value_in_suffixExpr2401 = new BitSet(
			new long[] { 0x0000200000000000L });

	/** The Constant FOLLOW_typeParamOpt_in_suffixExpr2403. */
	public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2403 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_funcLit_in_value2412. */
	public static final BitSet FOLLOW_funcLit_in_value2412 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_arrayLit_in_value2418. */
	public static final BitSet FOLLOW_arrayLit_in_value2418 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_objLit_in_value2433. */
	public static final BitSet FOLLOW_objLit_in_value2433 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_NULL_in_value2448. */
	public static final BitSet FOLLOW_NULL_in_value2448 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_elementarySymbol_in_value2463. */
	public static final BitSet FOLLOW_elementarySymbol_in_value2463 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LPAREN_in_value2478. */
	public static final BitSet FOLLOW_LPAREN_in_value2478 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_expr_in_value2482. */
	public static final BitSet FOLLOW_expr_in_value2482 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_statement_in_value2484. */
	public static final BitSet FOLLOW_statement_in_value2484 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_value2487. */
	public static final BitSet FOLLOW_RPAREN_in_value2487 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_dotIdent_in_value2500. */
	public static final BitSet FOLLOW_dotIdent_in_value2500 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_NEW_in_newExpr2547. */
	public static final BitSet FOLLOW_NEW_in_newExpr2547 = new BitSet(
			new long[] { 0x02001E0801020000L });

	/** The Constant FOLLOW_type_in_newExpr2549. */
	public static final BitSet FOLLOW_type_in_newExpr2549 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_newExpr2551. */
	public static final BitSet FOLLOW_LPAREN_in_newExpr2551 = new BitSet(
			new long[] { 0x0201203C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_exprListOpt_in_newExpr2553. */
	public static final BitSet FOLLOW_exprListOpt_in_newExpr2553 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_newExpr2555. */
	public static final BitSet FOLLOW_RPAREN_in_newExpr2555 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CAST_in_cast2581. */
	public static final BitSet FOLLOW_CAST_in_cast2581 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_cast2583. */
	public static final BitSet FOLLOW_LPAREN_in_cast2583 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_cast2585. */
	public static final BitSet FOLLOW_expr_in_cast2585 = new BitSet(
			new long[] { 0x0000001004000000L });

	/** The Constant FOLLOW_COMMA_in_cast2588. */
	public static final BitSet FOLLOW_COMMA_in_cast2588 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_cast2590. */
	public static final BitSet FOLLOW_funcType_in_cast2590 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_cast2594. */
	public static final BitSet FOLLOW_RPAREN_in_cast2594 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CAST_in_cast2612. */
	public static final BitSet FOLLOW_CAST_in_cast2612 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_cast2614. */
	public static final BitSet FOLLOW_LPAREN_in_cast2614 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_cast2616. */
	public static final BitSet FOLLOW_expr_in_cast2616 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_cast2618. */
	public static final BitSet FOLLOW_RPAREN_in_cast2618 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_classDecl_in_topLevelDecl2650. */
	public static final BitSet FOLLOW_classDecl_in_topLevelDecl2650 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_interfaceDecl_in_topLevelDecl2655. */
	public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2655 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_enumDecl_in_topLevelDecl2667. */
	public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2667 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_typedefDecl_in_topLevelDecl2672. */
	public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2672 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_ENUM_in_enumDecl2682. */
	public static final BitSet FOLLOW_ENUM_in_enumDecl2682 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_enumDecl2684. */
	public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2684 = new BitSet(
			new long[] { 0x0200200000000000L });

	/** The Constant FOLLOW_typeParamOpt_in_enumDecl2686. */
	public static final BitSet FOLLOW_typeParamOpt_in_enumDecl2686 = new BitSet(
			new long[] { 0x0200000000000000L });

	/** The Constant FOLLOW_LBRACE_in_enumDecl2688. */
	public static final BitSet FOLLOW_LBRACE_in_enumDecl2688 = new BitSet(
			new long[] { 0x0400000000020000L });

	/** The Constant FOLLOW_enumBody_in_enumDecl2690. */
	public static final BitSet FOLLOW_enumBody_in_enumDecl2690 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_RBRACE_in_enumDecl2692. */
	public static final BitSet FOLLOW_RBRACE_in_enumDecl2692 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_enumValueDecl_in_enumBody2718. */
	public static final BitSet FOLLOW_enumValueDecl_in_enumBody2718 = new BitSet(
			new long[] { 0x0000000000020002L });

	/** The Constant FOLLOW_IDENTIFIER_in_enumValueDecl2737. */
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2737 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_enumValueDecl2739. */
	public static final BitSet FOLLOW_LPAREN_in_enumValueDecl2739 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_enumValueDecl2741. */
	public static final BitSet FOLLOW_paramList_in_enumValueDecl2741 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_enumValueDecl2743. */
	public static final BitSet FOLLOW_RPAREN_in_enumValueDecl2743 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_enumValueDecl2745. */
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl2745 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_enumValueDecl2770. */
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl2770 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_enumValueDecl2772. */
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl2772 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_varDeclList2810. */
	public static final BitSet FOLLOW_varDecl_in_varDeclList2810 = new BitSet(
			new long[] { 0x0000000003F00000L, 0x0000000004000000L });

	/** The Constant FOLLOW_varDeclList_in_varDeclList2812. */
	public static final BitSet FOLLOW_varDeclList_in_varDeclList2812 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_varDecl2824. */
	public static final BitSet FOLLOW_declAttrList_in_varDecl2824 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000004000000L });

	/** The Constant FOLLOW_VAR_in_varDecl2828. */
	public static final BitSet FOLLOW_VAR_in_varDecl2828 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_varDeclPartList_in_varDecl2830. */
	public static final BitSet FOLLOW_varDeclPartList_in_varDecl2830 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_varDecl2832. */
	public static final BitSet FOLLOW_SEMI_in_varDecl2832 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDeclPart_in_varDeclPartList2862. */
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2862 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_varDeclPartList2865. */
	public static final BitSet FOLLOW_COMMA_in_varDeclPartList2865 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_varDeclPart_in_varDeclPartList2868. */
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList2868 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_varDeclPart2882. */
	public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart2882 = new BitSet(
			new long[] { 0x0000008810000000L });

	/** The Constant FOLLOW_propDeclOpt_in_varDeclPart2887. */
	public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart2887 = new BitSet(
			new long[] { 0x0000008010000000L });

	/** The Constant FOLLOW_typeTagOpt_in_varDeclPart2889. */
	public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart2889 = new BitSet(
			new long[] { 0x0000000010000000L });

	/** The Constant FOLLOW_varInit_in_varDeclPart2891. */
	public static final BitSet FOLLOW_varInit_in_varDeclPart2891 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LPAREN_in_propDecl2901. */
	public static final BitSet FOLLOW_LPAREN_in_propDecl2901 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000000800001L });

	/** The Constant FOLLOW_propAccessor_in_propDecl2905. */
	public static final BitSet FOLLOW_propAccessor_in_propDecl2905 = new BitSet(
			new long[] { 0x0000000004000000L });

	/** The Constant FOLLOW_COMMA_in_propDecl2907. */
	public static final BitSet FOLLOW_COMMA_in_propDecl2907 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000000800001L });

	/** The Constant FOLLOW_propAccessor_in_propDecl2911. */
	public static final BitSet FOLLOW_propAccessor_in_propDecl2911 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_propDecl2913. */
	public static final BitSet FOLLOW_RPAREN_in_propDecl2913 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_set_in_propAccessor0. */
	public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_propDecl_in_propDeclOpt2973. */
	public static final BitSet FOLLOW_propDecl_in_propDeclOpt2973 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_EQ_in_varInit2988. */
	public static final BitSet FOLLOW_EQ_in_varInit2988 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_varInit2990. */
	public static final BitSet FOLLOW_expr_in_varInit2990 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_funcDecl3016. */
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3016 = new BitSet(
			new long[] { 0x0000000400000000L });

	/** The Constant FOLLOW_FUNCTION_in_funcDecl3019. */
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3019 = new BitSet(
			new long[] { 0x0001000000000000L });

	/** The Constant FOLLOW_NEW_in_funcDecl3021. */
	public static final BitSet FOLLOW_NEW_in_funcDecl3021 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcDecl3023. */
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3023 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcDecl3025. */
	public static final BitSet FOLLOW_paramList_in_funcDecl3025 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcDecl3027. */
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3027 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcDecl3029. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3029 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_funcDecl3031. */
	public static final BitSet FOLLOW_block_in_funcDecl3031 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_funcDecl3064. */
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3064 = new BitSet(
			new long[] { 0x0000000400000000L });

	/** The Constant FOLLOW_FUNCTION_in_funcDecl3067. */
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3067 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_funcDecl3069. */
	public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3069 = new BitSet(
			new long[] { 0x0000200800000000L });

	/** The Constant FOLLOW_typeParamOpt_in_funcDecl3071. */
	public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3071 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcDecl3073. */
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3073 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcDecl3075. */
	public static final BitSet FOLLOW_paramList_in_funcDecl3075 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcDecl3077. */
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3077 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcDecl3079. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3079 = new BitSet(
			new long[] { 0x0200008000010000L });

	/** The Constant FOLLOW_block_in_funcDecl3081. */
	public static final BitSet FOLLOW_block_in_funcDecl3081 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_funcProtoDecl3122. */
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3122 = new BitSet(
			new long[] { 0x0000000400000000L });

	/** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3124. */
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3124 = new BitSet(
			new long[] { 0x0001000000000000L });

	/** The Constant FOLLOW_NEW_in_funcProtoDecl3126. */
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3126 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcProtoDecl3128. */
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3128 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcProtoDecl3130. */
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3130 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcProtoDecl3132. */
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3132 = new BitSet(
			new long[] { 0x0000008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3134. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3134 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_funcProtoDecl3136. */
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3136 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_declAttrList_in_funcProtoDecl3163. */
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3163 = new BitSet(
			new long[] { 0x0000000400000000L });

	/** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3165. */
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3165 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_funcProtoDecl3167. */
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3167 = new BitSet(
			new long[] { 0x0000200800000000L });

	/** The Constant FOLLOW_typeParamOpt_in_funcProtoDecl3169. */
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3169 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcProtoDecl3171. */
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3171 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcProtoDecl3173. */
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3173 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcProtoDecl3175. */
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3175 = new BitSet(
			new long[] { 0x0000008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3177. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3177 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_funcProtoDecl3179. */
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3179 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3208. */
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3208 = new BitSet(
			new long[] { 0x0001000000000000L });

	/** The Constant FOLLOW_NEW_in_funcProtoDecl3210. */
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3210 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcProtoDecl3212. */
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3212 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcProtoDecl3214. */
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3214 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcProtoDecl3216. */
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3216 = new BitSet(
			new long[] { 0x0000008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3218. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3218 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_funcProtoDecl3220. */
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3220 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FUNCTION_in_funcProtoDecl3244. */
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3244 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_funcProtoDecl3246. */
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3246 = new BitSet(
			new long[] { 0x0000200800000000L });

	/** The Constant FOLLOW_typeParamOpt_in_funcProtoDecl3248. */
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3248 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_funcProtoDecl3250. */
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3250 = new BitSet(
			new long[] { 0x0000001008020000L });

	/** The Constant FOLLOW_paramList_in_funcProtoDecl3252. */
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3252 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_funcProtoDecl3254. */
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3254 = new BitSet(
			new long[] { 0x0000008000010000L });

	/** The Constant FOLLOW_typeTagOpt_in_funcProtoDecl3256. */
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3256 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_funcProtoDecl3258. */
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3258 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_EXTERN_in_classDecl3291. */
	public static final BitSet FOLLOW_EXTERN_in_classDecl3291 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000010000000L });

	/** The Constant FOLLOW_CLASS_in_classDecl3294. */
	public static final BitSet FOLLOW_CLASS_in_classDecl3294 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_classDecl3296. */
	public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3296 = new BitSet(
			new long[] { 0x0200200000000000L, 0x00000000C0000000L });

	/** The Constant FOLLOW_typeParamOpt_in_classDecl3298. */
	public static final BitSet FOLLOW_typeParamOpt_in_classDecl3298 = new BitSet(
			new long[] { 0x0200000000000000L, 0x00000000C0000000L });

	/** The Constant FOLLOW_inheritListOpt_in_classDecl3300. */
	public static final BitSet FOLLOW_inheritListOpt_in_classDecl3300 = new BitSet(
			new long[] { 0x0200000000000000L });

	/** The Constant FOLLOW_LBRACE_in_classDecl3304. */
	public static final BitSet FOLLOW_LBRACE_in_classDecl3304 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000006000000L });

	/** The Constant FOLLOW_classBodyScope_in_classDecl3306. */
	public static final BitSet FOLLOW_classBodyScope_in_classDecl3306 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_RBRACE_in_classDecl3309. */
	public static final BitSet FOLLOW_RBRACE_in_classDecl3309 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_classBody_in_classBodyScope3355. */
	public static final BitSet FOLLOW_classBody_in_classBodyScope3355 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_classBody3379. */
	public static final BitSet FOLLOW_varDecl_in_classBody3379 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000006000000L });

	/** The Constant FOLLOW_classBody_in_classBody3381. */
	public static final BitSet FOLLOW_classBody_in_classBody3381 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_funcDecl_in_classBody3386. */
	public static final BitSet FOLLOW_funcDecl_in_classBody3386 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000006000000L });

	/** The Constant FOLLOW_classBody_in_classBody3388. */
	public static final BitSet FOLLOW_classBody_in_classBody3388 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_enumDecl_in_classBody3394. */
	public static final BitSet FOLLOW_enumDecl_in_classBody3394 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000006000000L });

	/** The Constant FOLLOW_classBody_in_classBody3396. */
	public static final BitSet FOLLOW_classBody_in_classBody3396 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_INTERFACE_in_interfaceDecl3416. */
	public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3416 = new BitSet(
			new long[] { 0x02001E0001020000L, 0x00000000C0000000L });

	/** The Constant FOLLOW_type_in_interfaceDecl3418. */
	public static final BitSet FOLLOW_type_in_interfaceDecl3418 = new BitSet(
			new long[] { 0x0200000000000000L, 0x00000000C0000000L });

	/** The Constant FOLLOW_inheritListOpt_in_interfaceDecl3420. */
	public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3420 = new BitSet(
			new long[] { 0x0200000000000000L });

	/** The Constant FOLLOW_LBRACE_in_interfaceDecl3422. */
	public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3422 = new BitSet(
			new long[] { 0x0400000403F00000L, 0x0000000004000000L });

	/** The Constant FOLLOW_interfaceBody_in_interfaceDecl3425. */
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3425 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_RBRACE_in_interfaceDecl3427. */
	public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3427 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_interfaceBody3440. */
	public static final BitSet FOLLOW_varDecl_in_interfaceBody3440 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000004000000L });

	/** The Constant FOLLOW_interfaceBody_in_interfaceBody3442. */
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3442 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_funcProtoDecl_in_interfaceBody3447. */
	public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3447 = new BitSet(
			new long[] { 0x0000000403F00000L, 0x0000000004000000L });

	/** The Constant FOLLOW_interfaceBody_in_interfaceBody3449. */
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3449 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_inherit_in_inheritList3471. */
	public static final BitSet FOLLOW_inherit_in_inheritList3471 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_inheritList3474. */
	public static final BitSet FOLLOW_COMMA_in_inheritList3474 = new BitSet(
			new long[] { 0x0000000000000000L, 0x00000000C0000000L });

	/** The Constant FOLLOW_inherit_in_inheritList3477. */
	public static final BitSet FOLLOW_inherit_in_inheritList3477 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_inheritList_in_inheritListOpt3495. */
	public static final BitSet FOLLOW_inheritList_in_inheritListOpt3495 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_EXTENDS_in_inherit3530. */
	public static final BitSet FOLLOW_EXTENDS_in_inherit3530 = new BitSet(
			new long[] { 0x02001E0001020000L });

	/** The Constant FOLLOW_type_in_inherit3532. */
	public static final BitSet FOLLOW_type_in_inherit3532 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IMPLEMENTS_in_inherit3554. */
	public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3554 = new BitSet(
			new long[] { 0x02001E0001020000L });

	/** The Constant FOLLOW_type_in_inherit3556. */
	public static final BitSet FOLLOW_type_in_inherit3556 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_TYPEDEF_in_typedefDecl3584. */
	public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3584 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_IDENTIFIER_in_typedefDecl3586. */
	public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3586 = new BitSet(
			new long[] { 0x0000000010000000L });

	/** The Constant FOLLOW_EQ_in_typedefDecl3588. */
	public static final BitSet FOLLOW_EQ_in_typedefDecl3588 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_typedefDecl3590. */
	public static final BitSet FOLLOW_funcType_in_typedefDecl3590 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_GT_in_typeExtend3609. */
	public static final BitSet FOLLOW_GT_in_typeExtend3609 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_typeExtend3611. */
	public static final BitSet FOLLOW_funcType_in_typeExtend3611 = new BitSet(
			new long[] { 0x0000000004000000L });

	/** The Constant FOLLOW_COMMA_in_typeExtend3613. */
	public static final BitSet FOLLOW_COMMA_in_typeExtend3613 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LBRACE_in_anonType3624. */
	public static final BitSet FOLLOW_LBRACE_in_anonType3624 = new BitSet(
			new long[] { 0x0400400003F20000L, 0x0000000004000000L });

	/** The Constant FOLLOW_anonTypeFieldList_in_anonType3659. */
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3659 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_varDeclList_in_anonType3687. */
	public static final BitSet FOLLOW_varDeclList_in_anonType3687 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_typeExtend_in_anonType3716. */
	public static final BitSet FOLLOW_typeExtend_in_anonType3716 = new BitSet(
			new long[] { 0x0400000003F20000L, 0x0000000004000000L });

	/** The Constant FOLLOW_anonTypeFieldList_in_anonType3744. */
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3744 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_varDeclList_in_anonType3770. */
	public static final BitSet FOLLOW_varDeclList_in_anonType3770 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_RBRACE_in_anonType3814. */
	public static final BitSet FOLLOW_RBRACE_in_anonType3814 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_anonTypeField_in_anonTypeFieldList3828. */
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3828 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_anonTypeFieldList3831. */
	public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList3831 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_anonTypeField_in_anonTypeFieldList3834. */
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList3834 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_LBRACE_in_objLit3846. */
	public static final BitSet FOLLOW_LBRACE_in_objLit3846 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_objLitElemList_in_objLit3849. */
	public static final BitSet FOLLOW_objLitElemList_in_objLit3849 = new BitSet(
			new long[] { 0x0400000000000000L });

	/** The Constant FOLLOW_RBRACE_in_objLit3851. */
	public static final BitSet FOLLOW_RBRACE_in_objLit3851 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_anonTypeField3863. */
	public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField3863 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_anonTypeField3865. */
	public static final BitSet FOLLOW_COLON_in_anonTypeField3865 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_anonTypeField3868. */
	public static final BitSet FOLLOW_funcType_in_anonTypeField3868 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_objLitElem_in_objLitElemList3884. */
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList3884 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_objLitElemList3887. */
	public static final BitSet FOLLOW_COMMA_in_objLitElemList3887 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_objLitElem_in_objLitElemList3890. */
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList3890 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_objLitElem3911. */
	public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem3911 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_objLitElem3913. */
	public static final BitSet FOLLOW_COLON_in_objLitElem3913 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_objLitElem3916. */
	public static final BitSet FOLLOW_expr_in_objLitElem3916 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LONGLITERAL_in_elementarySymbol3928. */
	public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol3928 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_INTLITERAL_in_elementarySymbol3941. */
	public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol3941 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_STRINGLITERAL_in_elementarySymbol3954. */
	public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol3954 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CHARLITERAL_in_elementarySymbol3967. */
	public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol3967 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FLOATNUM_in_elementarySymbol3980. */
	public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol3980 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_TRUE_in_elementarySymbol3993. */
	public static final BitSet FOLLOW_TRUE_in_elementarySymbol3993 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_FALSE_in_elementarySymbol4007. */
	public static final BitSet FOLLOW_FALSE_in_elementarySymbol4007 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_typeTagOpt_in_synpred20_TinyHaxeTry1835. */
	public static final BitSet FOLLOW_typeTagOpt_in_synpred20_TinyHaxeTry1835 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_COMMA_in_synpred22_TinyHaxeTry1941. */
	public static final BitSet FOLLOW_COMMA_in_synpred22_TinyHaxeTry1941 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_synpred22_TinyHaxeTry1944. */
	public static final BitSet FOLLOW_funcType_in_synpred22_TinyHaxeTry1944 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_funcType_in_synpred23_TinyHaxeTry1938. */
	public static final BitSet FOLLOW_funcType_in_synpred23_TinyHaxeTry1938 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_synpred23_TinyHaxeTry1941. */
	public static final BitSet FOLLOW_COMMA_in_synpred23_TinyHaxeTry1941 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_synpred23_TinyHaxeTry1944. */
	public static final BitSet FOLLOW_funcType_in_synpred23_TinyHaxeTry1944 = new BitSet(
			new long[] { 0x0000000004000002L });

	/** The Constant FOLLOW_COMMA_in_synpred24_TinyHaxeTry1955. */
	public static final BitSet FOLLOW_COMMA_in_synpred24_TinyHaxeTry1955 = new BitSet(
			new long[] { 0x0000000000020000L });

	/** The Constant FOLLOW_typeConstraint_in_synpred24_TinyHaxeTry1958. */
	public static final BitSet FOLLOW_typeConstraint_in_synpred24_TinyHaxeTry1958 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_MINUS_BIGGER_in_synpred25_TinyHaxeTry1977. */
	public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred25_TinyHaxeTry1977 = new BitSet(
			new long[] { 0x02001E0001020000L });

	/** The Constant FOLLOW_type_in_synpred25_TinyHaxeTry1980. */
	public static final BitSet FOLLOW_type_in_synpred25_TinyHaxeTry1980 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_type_in_synpred26_TinyHaxeTry1973. */
	public static final BitSet FOLLOW_type_in_synpred26_TinyHaxeTry1973 = new BitSet(
			new long[] { 0x0000010000000002L });

	/** The Constant FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1977. */
	public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred26_TinyHaxeTry1977 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_type_in_synpred26_TinyHaxeTry1980. */
	public static final BitSet FOLLOW_type_in_synpred26_TinyHaxeTry1980 = new BitSet(
			new long[] { 0x0000010000000002L });

	/** The Constant FOLLOW_typeParam_in_synpred33_TinyHaxeTry11020. */
	public static final BitSet FOLLOW_typeParam_in_synpred33_TinyHaxeTry11020 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_anonType_in_synpred34_TinyHaxeTry1999. */
	public static final BitSet FOLLOW_anonType_in_synpred34_TinyHaxeTry1999 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_dotIdent_in_synpred34_TinyHaxeTry11003. */
	public static final BitSet FOLLOW_dotIdent_in_synpred34_TinyHaxeTry11003 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_INT_in_synpred34_TinyHaxeTry11006. */
	public static final BitSet FOLLOW_INT_in_synpred34_TinyHaxeTry11006 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_FLOAT_in_synpred34_TinyHaxeTry11009. */
	public static final BitSet FOLLOW_FLOAT_in_synpred34_TinyHaxeTry11009 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_DYNAMIC_in_synpred34_TinyHaxeTry11012. */
	public static final BitSet FOLLOW_DYNAMIC_in_synpred34_TinyHaxeTry11012 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_BOOLEAN_in_synpred34_TinyHaxeTry11014. */
	public static final BitSet FOLLOW_BOOLEAN_in_synpred34_TinyHaxeTry11014 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_VOID_in_synpred34_TinyHaxeTry11016. */
	public static final BitSet FOLLOW_VOID_in_synpred34_TinyHaxeTry11016 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_typeParam_in_synpred34_TinyHaxeTry11020. */
	public static final BitSet FOLLOW_typeParam_in_synpred34_TinyHaxeTry11020 = new BitSet(
			new long[] { 0x0000200000000002L });

	/** The Constant FOLLOW_type_in_synpred35_TinyHaxeTry11042. */
	public static final BitSet FOLLOW_type_in_synpred35_TinyHaxeTry11042 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_GT_in_synpred36_TinyHaxeTry11048. */
	public static final BitSet FOLLOW_GT_in_synpred36_TinyHaxeTry11048 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_GTGT_in_synpred37_TinyHaxeTry11051. */
	public static final BitSet FOLLOW_GTGT_in_synpred37_TinyHaxeTry11051 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_typeParam_in_synpred38_TinyHaxeTry11073. */
	public static final BitSet FOLLOW_typeParam_in_synpred38_TinyHaxeTry11073 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_block_in_synpred40_TinyHaxeTry11201. */
	public static final BitSet FOLLOW_block_in_synpred40_TinyHaxeTry11201 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_assignExpr_in_synpred41_TinyHaxeTry11206. */
	public static final BitSet FOLLOW_assignExpr_in_synpred41_TinyHaxeTry11206 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_synpred41_TinyHaxeTry11208. */
	public static final BitSet FOLLOW_SEMI_in_synpred41_TinyHaxeTry11208 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_ELSE_in_synpred43_TinyHaxeTry11228. */
	public static final BitSet FOLLOW_ELSE_in_synpred43_TinyHaxeTry11228 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_synpred43_TinyHaxeTry11232. */
	public static final BitSet FOLLOW_statement_in_synpred43_TinyHaxeTry11232 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_expr_in_synpred51_TinyHaxeTry11440. */
	public static final BitSet FOLLOW_expr_in_synpred51_TinyHaxeTry11440 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_expr_in_synpred58_TinyHaxeTry11534. */
	public static final BitSet FOLLOW_expr_in_synpred58_TinyHaxeTry11534 = new BitSet(
			new long[] { 0x0000000000010000L });

	/** The Constant FOLLOW_SEMI_in_synpred58_TinyHaxeTry11537. */
	public static final BitSet FOLLOW_SEMI_in_synpred58_TinyHaxeTry11537 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_IDENTIFIER_in_synpred59_TinyHaxeTry11543. */
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred59_TinyHaxeTry11543 = new BitSet(
			new long[] { 0x0000008000000000L });

	/** The Constant FOLLOW_COLON_in_synpred59_TinyHaxeTry11545. */
	public static final BitSet FOLLOW_COLON_in_synpred59_TinyHaxeTry11545 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_statement_in_synpred59_TinyHaxeTry11547. */
	public static final BitSet FOLLOW_statement_in_synpred59_TinyHaxeTry11547 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_varDecl_in_synpred62_TinyHaxeTry11649. */
	public static final BitSet FOLLOW_varDecl_in_synpred62_TinyHaxeTry11649 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_exprList_in_synpred66_TinyHaxeTry11863. */
	public static final BitSet FOLLOW_exprList_in_synpred66_TinyHaxeTry11863 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_GT_in_synpred83_TinyHaxeTry12153. */
	public static final BitSet FOLLOW_GT_in_synpred83_TinyHaxeTry12153 = new BitSet(
			new long[] { 0x0000400000000000L });

	/** The Constant FOLLOW_GT_in_synpred83_TinyHaxeTry12155. */
	public static final BitSet FOLLOW_GT_in_synpred83_TinyHaxeTry12155 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_addExpr_in_synpred83_TinyHaxeTry12160. */
	public static final BitSet FOLLOW_addExpr_in_synpred83_TinyHaxeTry12160 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_set_in_synpred94_TinyHaxeTry12245. */
	public static final BitSet FOLLOW_set_in_synpred94_TinyHaxeTry12245 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_prefixExpr_in_synpred94_TinyHaxeTry12257. */
	public static final BitSet FOLLOW_prefixExpr_in_synpred94_TinyHaxeTry12257 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_synpred97_TinyHaxeTry12312. */
	public static final BitSet FOLLOW_value_in_synpred97_TinyHaxeTry12312 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_synpred97_TinyHaxeTry12314. */
	public static final BitSet FOLLOW_LPAREN_in_synpred97_TinyHaxeTry12314 = new BitSet(
			new long[] { 0x0201203C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_exprListOpt_in_synpred97_TinyHaxeTry12316. */
	public static final BitSet FOLLOW_exprListOpt_in_synpred97_TinyHaxeTry12316 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_synpred97_TinyHaxeTry12318. */
	public static final BitSet FOLLOW_RPAREN_in_synpred97_TinyHaxeTry12318 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_synpred98_TinyHaxeTry12339. */
	public static final BitSet FOLLOW_value_in_synpred98_TinyHaxeTry12339 = new BitSet(
			new long[] { 0x0000002000000000L });

	/** The Constant FOLLOW_LBRACKET_in_synpred98_TinyHaxeTry12341. */
	public static final BitSet FOLLOW_LBRACKET_in_synpred98_TinyHaxeTry12341 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_synpred98_TinyHaxeTry12343. */
	public static final BitSet FOLLOW_expr_in_synpred98_TinyHaxeTry12343 = new BitSet(
			new long[] { 0x0000004000000000L });

	/** The Constant FOLLOW_RBRACKET_in_synpred98_TinyHaxeTry12345. */
	public static final BitSet FOLLOW_RBRACKET_in_synpred98_TinyHaxeTry12345 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_synpred99_TinyHaxeTry12350. */
	public static final BitSet FOLLOW_value_in_synpred99_TinyHaxeTry12350 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000100000L });

	/** The Constant FOLLOW_PLUSPLUS_in_synpred99_TinyHaxeTry12352. */
	public static final BitSet FOLLOW_PLUSPLUS_in_synpred99_TinyHaxeTry12352 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_value_in_synpred100_TinyHaxeTry12376. */
	public static final BitSet FOLLOW_value_in_synpred100_TinyHaxeTry12376 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000080000L });

	/** The Constant FOLLOW_SUBSUB_in_synpred100_TinyHaxeTry12378. */
	public static final BitSet FOLLOW_SUBSUB_in_synpred100_TinyHaxeTry12378 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_arrayLit_in_synpred102_TinyHaxeTry12418. */
	public static final BitSet FOLLOW_arrayLit_in_synpred102_TinyHaxeTry12418 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_expr_in_synpred106_TinyHaxeTry12482. */
	public static final BitSet FOLLOW_expr_in_synpred106_TinyHaxeTry12482 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_LPAREN_in_synpred107_TinyHaxeTry12478. */
	public static final BitSet FOLLOW_LPAREN_in_synpred107_TinyHaxeTry12478 = new BitSet(
			new long[] { 0x7BEB20AC03F30000L, 0x000000FE05F88000L });

	/** The Constant FOLLOW_expr_in_synpred107_TinyHaxeTry12482. */
	public static final BitSet FOLLOW_expr_in_synpred107_TinyHaxeTry12482 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_statement_in_synpred107_TinyHaxeTry12484. */
	public static final BitSet FOLLOW_statement_in_synpred107_TinyHaxeTry12484 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_synpred107_TinyHaxeTry12487. */
	public static final BitSet FOLLOW_RPAREN_in_synpred107_TinyHaxeTry12487 = new BitSet(
			new long[] { 0x0000000000000002L });

	/** The Constant FOLLOW_CAST_in_synpred110_TinyHaxeTry12581. */
	public static final BitSet FOLLOW_CAST_in_synpred110_TinyHaxeTry12581 = new BitSet(
			new long[] { 0x0000000800000000L });

	/** The Constant FOLLOW_LPAREN_in_synpred110_TinyHaxeTry12583. */
	public static final BitSet FOLLOW_LPAREN_in_synpred110_TinyHaxeTry12583 = new BitSet(
			new long[] { 0x0201202C00020000L, 0x000000FE01F88000L });

	/** The Constant FOLLOW_expr_in_synpred110_TinyHaxeTry12585. */
	public static final BitSet FOLLOW_expr_in_synpred110_TinyHaxeTry12585 = new BitSet(
			new long[] { 0x0000001004000000L });

	/** The Constant FOLLOW_COMMA_in_synpred110_TinyHaxeTry12588. */
	public static final BitSet FOLLOW_COMMA_in_synpred110_TinyHaxeTry12588 = new BitSet(
			new long[] { 0x02001F0001020000L });

	/** The Constant FOLLOW_funcType_in_synpred110_TinyHaxeTry12590. */
	public static final BitSet FOLLOW_funcType_in_synpred110_TinyHaxeTry12590 = new BitSet(
			new long[] { 0x0000001000000000L });

	/** The Constant FOLLOW_RPAREN_in_synpred110_TinyHaxeTry12594. */
	public static final BitSet FOLLOW_RPAREN_in_synpred110_TinyHaxeTry12594 = new BitSet(
			new long[] { 0x0000000000000002L });

}