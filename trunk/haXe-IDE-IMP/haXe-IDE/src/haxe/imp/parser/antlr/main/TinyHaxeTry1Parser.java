// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g 2010-05-02 19:20:50

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

public class TinyHaxeTry1Parser extends Parser {
	public static final String[] tokenNames = new String[] { "<invalid>",
			"<EOR>", "<DOWN>", "<UP>", "PROPERTY_DECL", "MODULE",
			"SUFFIX_EXPR", "BLOCK_SCOPE", "PARAM_LIST", "TYPE_TAG",
			"TYPE_PARAM_OPT", "INHERIT_LIST_OPT", "DECL_ATTR_LIST", "VAR_INIT",
			"ASSIGN_OPERATOR", "PACKAGE", "SEMI", "IDENTIFIER", "DOT",
			"IMPORT", "PUBLIC", "PRIVATE", "STATIC", "INLINE", "DYNAMIC",
			"OVERRIDE", "COMMA", "QUES", "EQ", "PLUSEQ", "SUBEQ", "SLASHEQ",
			"PERCENTEQ", "AMPEQ", "FUNCTION", "LPAREN", "RPAREN", "LBRACKET",
			"RBRACKET", "PP_IF", "BANG", "PP_ELSEIF", "PP_ELSE", "PP_END",
			"PP_ERROR", "COLON", "MINUS_BIGGER", "VOID", "GT", "LT", "IF",
			"ELSE", "FOR", "IN", "WHILE", "DO", "TRY", "SWITCH", "LBRACE",
			"RBRACE", "RETURN", "THROW", "BREAK", "CONTINUE", "CASE",
			"DEFAULT", "CATCH", "ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ",
			"BANGEQ", "GTEQ", "LTEQ", "BAR", "AMP", "CARET", "LTLT", "GTGT",
			"GTGTGT", "PLUS", "SUB", "STAR", "SLASH", "PERCENT", "SUBSUB",
			"PLUSPLUS", "TILDE", "NULL", "NEW", "CAST", "ENUM", "VAR",
			"EXTERN", "CLASS", "INTERFACE", "EXTENDS", "IMPLEMENTS", "TYPEDEF",
			"LONGLITERAL", "INTLITERAL", "STRINGLITERAL", "CHARLITERAL",
			"FLOATNUM", "TRUE", "FALSE", "WS", "IntegerNumber", "LongSuffix",
			"HexPrefix", "HexDigit", "Exponent", "EscapeSequence", "ABSTRACT",
			"BOOLEAN", "BYTE", "CHAR", "CONST", "DOUBLE", "FINAL", "FINALLY",
			"FLOAT", "GOTO", "INSTANCEOF", "INT", "LONG", "NATIVE",
			"PROTECTED", "SHORT", "STRICTFP", "SUPER", "THIS", "THROWS",
			"TRANSIENT", "VOLATILE", "STAREQ", "BAREQ", "CARETEQ",
			"PERCENTDLQ", "PERCENTDBQ", "PERCENTDBBQ", "EQEQEQ", "PERCENTLESQ",
			"BANGEQQ", "MONKEYS_AT", "PERCENTLL", "PERCENTBB", "PERCENTBBB",
			"LTLTEQ", "GTGTEQ", "GTGTGTEQ", "INTNUM", "EXPONENT", "COMMENT",
			"HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ" };
	public static final int FUNCTION = 34;
	public static final int PACKAGE = 15;
	public static final int CAST = 90;
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
	public static final int FINAL = 119;
	public static final int RPAREN = 36;
	public static final int IMPORT = 19;
	public static final int SUBSUB = 85;
	public static final int STAREQ = 135;
	public static final int CARET = 76;
	public static final int THIS = 131;
	public static final int RETURN = 60;
	public static final int DOUBLE = 118;
	public static final int MONKEYS_AT = 144;
	public static final int BARBAR = 68;
	public static final int VAR = 92;
	public static final int VOID = 47;
	public static final int SUPER = 130;
	public static final int GOTO = 122;
	public static final int EQ = 28;
	public static final int COMMENT = 153;
	public static final int AMPAMP = 69;
	public static final int VAR_INIT = 13;
	public static final int LTLTEQ = 148;
	public static final int QUES = 27;
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
	public static final int Exponent = 111;
	public static final int FOR = 52;
	public static final int SUFFIX_EXPR = 6;
	public static final int SUB = 81;
	public static final int FLOAT = 121;
	public static final int ABSTRACT = 113;
	public static final int MINUS_BIGGER = 46;
	public static final int PERCENTDBQ = 139;
	public static final int HexDigit = 110;
	public static final int PLUSEQ = 29;
	public static final int LPAREN = 35;
	public static final int IF = 50;
	public static final int INTNUM = 151;
	public static final int ESC_SEQ = 157;
	public static final int BOOLEAN = 114;
	public static final int PP_END = 43;
	public static final int SLASH = 83;
	public static final int IN = 53;
	public static final int GTGTGTEQ = 150;
	public static final int IMPLEMENTS = 97;
	public static final int CONTINUE = 63;
	public static final int COMMA = 26;
	public static final int AMPEQ = 33;
	public static final int TRANSIENT = 133;
	public static final int IDENTIFIER = 17;
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
	public static final int EQEQEQ = 141;
	public static final int DEFAULT = 65;
	public static final int HEX_DIGIT = 154;
	public static final int SHORT = 128;
	public static final int BANG = 40;
	public static final int INSTANCEOF = 123;
	public static final int PP_ERROR = 44;
	public static final int GTEQ = 72;
	public static final int MODULE = 5;
	public static final int TRUE = 104;
	public static final int SEMI = 16;
	public static final int COLON = 45;
	public static final int PARAM_LIST = 8;
	public static final int PERCENTLESQ = 142;
	public static final int ENUM = 91;
	public static final int FINALLY = 120;
	public static final int PERCENTEQ = 32;
	public static final int PROPERTY_DECL = 4;
	public static final int OVERRIDE = 25;
	public static final int STRINGLITERAL = 101;
	public static final int CARETEQ = 137;
	public static final int PERCENTBBB = 147;
	public static final int INTERFACE = 95;
	public static final int LONG = 125;
	public static final int EXTENDS = 96;
	public static final int PUBLIC = 20;
	public static final int TYPE_TAG = 9;
	public static final int BAR = 74;

	// delegates
	// delegators

	public TinyHaxeTry1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[237 + 1];

	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	@Override
	public String[] getTokenNames() {
		return TinyHaxeTry1Parser.tokenNames;
	}

	@Override
	public String getGrammarFileName() {
		return "C:\\Documents and Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g";
	}

	public static class module_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "module"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:1:
	// module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
	// myPackage )? topLevelList ) ;
	public final TinyHaxeTry1Parser.module_return module()
			throws RecognitionException {
		TinyHaxeTry1Parser.module_return retval = new TinyHaxeTry1Parser.module_return();
		retval.start = input.LT(1);
		int module_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.myPackage_return myPackage1 = null;

		TinyHaxeTry1Parser.topLevelList_return topLevelList2 = null;

		RewriteRuleSubtreeStream stream_myPackage = new RewriteRuleSubtreeStream(
				adaptor, "rule myPackage");
		RewriteRuleSubtreeStream stream_topLevelList = new RewriteRuleSubtreeStream(
				adaptor, "rule topLevelList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 1)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:19:
			// ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
			// myPackage )? topLevelList ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:21:
			// ( myPackage )? topLevelList
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:21:
				// ( myPackage )?
				int alt1 = 2;
				int LA1_0 = input.LA(1);

				if ((LA1_0 == PACKAGE)) {
					alt1 = 1;
				}
				switch (alt1) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
					// myPackage
				{
					pushFollow(FOLLOW_myPackage_in_module119);
					myPackage1 = myPackage();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_myPackage.add(myPackage1.getTree());

				}
					break;

				}

				pushFollow(FOLLOW_topLevelList_in_module122);
				topLevelList2 = topLevelList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_topLevelList.add(topLevelList2.getTree());

				// AST REWRITE
				// elements: topLevelList, myPackage
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 47:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )?
					// topLevelList )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:47:
						// ^( MODULE[\"MODULE\",true] ( myPackage )?
						// topLevelList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(MODULE, "MODULE",
											true), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:47:91:
							// ( myPackage )?
							if (stream_myPackage.hasNext()) {
								adaptor.addChild(root_1, stream_myPackage
										.nextTree());

							}
							stream_myPackage.reset();
							adaptor.addChild(root_1, stream_topLevelList
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 1, module_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "module"

	public static class topLevelList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "topLevelList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:1:
	// topLevelList : ( topLevel )* ;
	public final TinyHaxeTry1Parser.topLevelList_return topLevelList()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevelList_return retval = new TinyHaxeTry1Parser.topLevelList_return();
		retval.start = input.LT(1);
		int topLevelList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.topLevel_return topLevel3 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 2)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:19:
			// ( ( topLevel )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:22:
			// ( topLevel )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:22:
				// ( topLevel )*
				loop2: do {
					int alt2 = 2;
					int LA2_0 = input.LA(1);

					if ((LA2_0 == IMPORT || LA2_0 == PP_IF
							|| (LA2_0 >= PP_ELSEIF && LA2_0 <= PP_ERROR)
							|| LA2_0 == ENUM
							|| (LA2_0 >= EXTERN && LA2_0 <= INTERFACE) || LA2_0 == TYPEDEF)) {
						alt2 = 1;
					}

					switch (alt2) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:50:23:
						// topLevel
					{
						pushFollow(FOLLOW_topLevel_in_topLevelList156);
						topLevel3 = topLevel();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, topLevel3.getTree());

					}
						break;

					default:
						break loop2;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 2, topLevelList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevelList"

	public static class topLevel_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "topLevel"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:1:
	// topLevel : ( myImport | pp | topLevelDecl );
	public final TinyHaxeTry1Parser.topLevel_return topLevel()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevel_return retval = new TinyHaxeTry1Parser.topLevel_return();
		retval.start = input.LT(1);
		int topLevel_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.myImport_return myImport4 = null;

		TinyHaxeTry1Parser.pp_return pp5 = null;

		TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl6 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 3)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:19:
			// ( myImport | pp | topLevelDecl )
			int alt3 = 3;
			switch (input.LA(1)) {
			case IMPORT: {
				alt3 = 1;
			}
				break;
			case PP_IF:
			case PP_ELSEIF:
			case PP_ELSE:
			case PP_END:
			case PP_ERROR: {
				alt3 = 2;
			}
				break;
			case ENUM:
			case EXTERN:
			case CLASS:
			case INTERFACE:
			case TYPEDEF: {
				alt3 = 3;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 3, 0,
						input);

				throw nvae;
			}

			switch (alt3) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:52:21:
				// myImport
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_myImport_in_topLevel175);
				myImport4 = myImport();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, myImport4.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:53:25:
				// pp
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_topLevel201);
				pp5 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp5.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:54:25:
				// topLevelDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_topLevelDecl_in_topLevel227);
				topLevelDecl6 = topLevelDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, topLevelDecl6.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 3, topLevel_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevel"

	public static class myPackage_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "myPackage"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:1:
	// myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) ;
	public final TinyHaxeTry1Parser.myPackage_return myPackage()
			throws RecognitionException {
		TinyHaxeTry1Parser.myPackage_return retval = new TinyHaxeTry1Parser.myPackage_return();
		retval.start = input.LT(1);
		int myPackage_StartIndex = input.index();
		Object root_0 = null;

		Token PACKAGE7 = null;
		Token SEMI9 = null;
		TinyHaxeTry1Parser.dotIdent_return dotIdent8 = null;

		Object PACKAGE7_tree = null;
		Object SEMI9_tree = null;
		RewriteRuleTokenStream stream_PACKAGE = new RewriteRuleTokenStream(
				adaptor, "token PACKAGE");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleSubtreeStream stream_dotIdent = new RewriteRuleSubtreeStream(
				adaptor, "rule dotIdent");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 4)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:21:
			// ( PACKAGE dotIdent SEMI -> ^( PACKAGE dotIdent ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:23:
			// PACKAGE dotIdent SEMI
			{
				PACKAGE7 = (Token) match(input, PACKAGE,
						FOLLOW_PACKAGE_in_myPackage246);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PACKAGE.add(PACKAGE7);

				pushFollow(FOLLOW_dotIdent_in_myPackage248);
				dotIdent8 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_dotIdent.add(dotIdent8.getTree());
				SEMI9 = (Token) match(input, SEMI, FOLLOW_SEMI_in_myPackage250);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI9);

				// AST REWRITE
				// elements: PACKAGE, dotIdent
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 56:45: -> ^( PACKAGE dotIdent )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:56:48:
						// ^( PACKAGE dotIdent )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_PACKAGE
									.nextNode(), root_1);

							adaptor
									.addChild(root_1, stream_dotIdent
											.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 4, myPackage_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "myPackage"

	public static class qualifiedIdentifier_return extends
			ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "qualifiedIdentifier"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:59:1:
	// qualifiedIdentifier : (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^(
	// DOT $qualifiedIdentifier $ident) )* ;
	public final TinyHaxeTry1Parser.qualifiedIdentifier_return qualifiedIdentifier()
			throws RecognitionException {
		TinyHaxeTry1Parser.qualifiedIdentifier_return retval = new TinyHaxeTry1Parser.qualifiedIdentifier_return();
		retval.start = input.LT(1);
		int qualifiedIdentifier_StartIndex = input.index();
		Object root_0 = null;

		Token a = null;
		Token ident = null;
		Token DOT10 = null;

		Object a_tree = null;
		Object ident_tree = null;
		Object DOT10_tree = null;
		RewriteRuleTokenStream stream_DOT = new RewriteRuleTokenStream(adaptor,
				"token DOT");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 5)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:5:
			// ( (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT
			// $qualifiedIdentifier $ident) )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:9:
			// (a= IDENTIFIER -> $a) ( DOT ident= IDENTIFIER -> ^( DOT
			// $qualifiedIdentifier $ident) )*
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:9:
				// (a= IDENTIFIER -> $a)
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:12:
				// a= IDENTIFIER
				{
					a = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_qualifiedIdentifier281);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_IDENTIFIER.add(a);

					// AST REWRITE
					// elements: a
					// token labels: a
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleTokenStream stream_a = new RewriteRuleTokenStream(
								adaptor, "token a", a);
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "rule retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 60:27: -> $a
						{
							adaptor.addChild(root_0, stream_a.nextNode());

						}

						retval.tree = root_0;
					}
				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:37:
				// ( DOT ident= IDENTIFIER -> ^( DOT $qualifiedIdentifier
				// $ident) )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == DOT)) {
						alt4 = 1;
					}

					switch (alt4) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:41:
						// DOT ident= IDENTIFIER
					{
						DOT10 = (Token) match(input, DOT,
								FOLLOW_DOT_in_qualifiedIdentifier297);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_DOT.add(DOT10);

						ident = (Token) match(input, IDENTIFIER,
								FOLLOW_IDENTIFIER_in_qualifiedIdentifier301);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_IDENTIFIER.add(ident);

						// AST REWRITE
						// elements: DOT, ident, qualifiedIdentifier
						// token labels: ident
						// rule labels: retval
						// token list labels:
						// rule list labels:
						// wildcard labels:
						if (state.backtracking == 0) {
							retval.tree = root_0;
							RewriteRuleTokenStream stream_ident = new RewriteRuleTokenStream(
									adaptor, "token ident", ident);
							RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
									adaptor, "rule retval",
									retval != null ? retval.tree : null);

							root_0 = (Object) adaptor.nil();
							// 60:63: -> ^( DOT $qualifiedIdentifier $ident)
							{
								// C:\\Documents and
								// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:60:67:
								// ^( DOT $qualifiedIdentifier $ident)
								{
									Object root_1 = (Object) adaptor.nil();
									root_1 = (Object) adaptor.becomeRoot(
											stream_DOT.nextNode(), root_1);

									adaptor.addChild(root_1, stream_retval
											.nextTree());
									adaptor.addChild(root_1, stream_ident
											.nextNode());

									adaptor.addChild(root_0, root_1);
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

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 5, qualifiedIdentifier_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "qualifiedIdentifier"

	public static class myImport_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "myImport"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:63:1:
	// myImport : IMPORT dotIdent SEMI ;
	public final TinyHaxeTry1Parser.myImport_return myImport()
			throws RecognitionException {
		TinyHaxeTry1Parser.myImport_return retval = new TinyHaxeTry1Parser.myImport_return();
		retval.start = input.LT(1);
		int myImport_StartIndex = input.index();
		Object root_0 = null;

		Token IMPORT11 = null;
		Token SEMI13 = null;
		TinyHaxeTry1Parser.dotIdent_return dotIdent12 = null;

		Object IMPORT11_tree = null;
		Object SEMI13_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 6)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:63:21:
			// ( IMPORT dotIdent SEMI )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:63:23:
			// IMPORT dotIdent SEMI
			{
				root_0 = (Object) adaptor.nil();

				IMPORT11 = (Token) match(input, IMPORT,
						FOLLOW_IMPORT_in_myImport343);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IMPORT11_tree = (Object) adaptor.create(IMPORT11);
					root_0 = (Object) adaptor.becomeRoot(IMPORT11_tree, root_0);
				}
				pushFollow(FOLLOW_dotIdent_in_myImport346);
				dotIdent12 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, dotIdent12.getTree());
				SEMI13 = (Token) match(input, SEMI, FOLLOW_SEMI_in_myImport348);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 6, myImport_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "myImport"

	public static class access_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "access"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:67:1:
	// access : ( PUBLIC | PRIVATE );
	public final TinyHaxeTry1Parser.access_return access()
			throws RecognitionException {
		TinyHaxeTry1Parser.access_return retval = new TinyHaxeTry1Parser.access_return();
		retval.start = input.LT(1);
		int access_StartIndex = input.index();
		Object root_0 = null;

		Token set14 = null;

		Object set14_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 7)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:67:19:
			// ( PUBLIC | PRIVATE )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
			{
				root_0 = (Object) adaptor.nil();

				set14 = (Token) input.LT(1);
				if ((input.LA(1) >= PUBLIC && input.LA(1) <= PRIVATE)) {
					input.consume();
					if (state.backtracking == 0)
						adaptor
								.addChild(root_0, (Object) adaptor
										.create(set14));
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 7, access_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "access"

	public static class declAttr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "declAttr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:70:1:
	// declAttr : ( STATIC | INLINE | DYNAMIC | OVERRIDE | access );
	public final TinyHaxeTry1Parser.declAttr_return declAttr()
			throws RecognitionException {
		TinyHaxeTry1Parser.declAttr_return retval = new TinyHaxeTry1Parser.declAttr_return();
		retval.start = input.LT(1);
		int declAttr_StartIndex = input.index();
		Object root_0 = null;

		Token STATIC15 = null;
		Token INLINE16 = null;
		Token DYNAMIC17 = null;
		Token OVERRIDE18 = null;
		TinyHaxeTry1Parser.access_return access19 = null;

		Object STATIC15_tree = null;
		Object INLINE16_tree = null;
		Object DYNAMIC17_tree = null;
		Object OVERRIDE18_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 8)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:70:19:
			// ( STATIC | INLINE | DYNAMIC | OVERRIDE | access )
			int alt5 = 5;
			switch (input.LA(1)) {
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
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 5, 0,
						input);

				throw nvae;
			}

			switch (alt5) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:70:21:
				// STATIC
			{
				root_0 = (Object) adaptor.nil();

				STATIC15 = (Token) match(input, STATIC,
						FOLLOW_STATIC_in_declAttr435);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					STATIC15_tree = (Object) adaptor.create(STATIC15);
					adaptor.addChild(root_0, STATIC15_tree);
				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:71:24:
				// INLINE
			{
				root_0 = (Object) adaptor.nil();

				INLINE16 = (Token) match(input, INLINE,
						FOLLOW_INLINE_in_declAttr460);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					INLINE16_tree = (Object) adaptor.create(INLINE16);
					adaptor.addChild(root_0, INLINE16_tree);
				}

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:72:25:
				// DYNAMIC
			{
				root_0 = (Object) adaptor.nil();

				DYNAMIC17 = (Token) match(input, DYNAMIC,
						FOLLOW_DYNAMIC_in_declAttr486);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					DYNAMIC17_tree = (Object) adaptor.create(DYNAMIC17);
					adaptor.addChild(root_0, DYNAMIC17_tree);
				}

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:73:25:
				// OVERRIDE
			{
				root_0 = (Object) adaptor.nil();

				OVERRIDE18 = (Token) match(input, OVERRIDE,
						FOLLOW_OVERRIDE_in_declAttr512);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					OVERRIDE18_tree = (Object) adaptor.create(OVERRIDE18);
					adaptor.addChild(root_0, OVERRIDE18_tree);
				}

			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:74:25:
				// access
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_access_in_declAttr538);
				access19 = access();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, access19.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 8, declAttr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "declAttr"

	public static class declAttrList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "declAttrList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:1:
	// declAttrList : ( declAttr )+ -> ^(
	// DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr )+ ) ;
	public final TinyHaxeTry1Parser.declAttrList_return declAttrList()
			throws RecognitionException {
		TinyHaxeTry1Parser.declAttrList_return retval = new TinyHaxeTry1Parser.declAttrList_return();
		retval.start = input.LT(1);
		int declAttrList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.declAttr_return declAttr20 = null;

		RewriteRuleSubtreeStream stream_declAttr = new RewriteRuleSubtreeStream(
				adaptor, "rule declAttr");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 9)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:19:
			// ( ( declAttr )+ -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] (
			// declAttr )+ ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:21:
			// ( declAttr )+
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:21:
				// ( declAttr )+
				int cnt6 = 0;
				loop6: do {
					int alt6 = 2;
					int LA6_0 = input.LA(1);

					if (((LA6_0 >= PUBLIC && LA6_0 <= OVERRIDE))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:22:
						// declAttr
					{
						pushFollow(FOLLOW_declAttr_in_declAttrList553);
						declAttr20 = declAttr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_declAttr.add(declAttr20.getTree());

					}
						break;

					default:
						if (cnt6 >= 1)
							break loop6;
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(6,
								input);
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
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 76:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] (
					// declAttr )+ )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:76:36:
						// ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] ( declAttr
						// )+ )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(DECL_ATTR_LIST,
											"DECL_ATTR_LIST", true), root_1);

							if (!(stream_declAttr.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_declAttr.hasNext()) {
								adaptor.addChild(root_1, stream_declAttr
										.nextTree());

							}
							stream_declAttr.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 9, declAttrList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "declAttrList"

	public static class paramList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "paramList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:1:
	// paramList : ( param ( COMMA param )* -> ^(
	// PARAM_LIST[\"PARAM_LIST\",true] ( param )+ ) | );
	public final TinyHaxeTry1Parser.paramList_return paramList()
			throws RecognitionException {
		TinyHaxeTry1Parser.paramList_return retval = new TinyHaxeTry1Parser.paramList_return();
		retval.start = input.LT(1);
		int paramList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA22 = null;
		TinyHaxeTry1Parser.param_return param21 = null;

		TinyHaxeTry1Parser.param_return param23 = null;

		Object COMMA22_tree = null;
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleSubtreeStream stream_param = new RewriteRuleSubtreeStream(
				adaptor, "rule param");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 10)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:19:
			// ( param ( COMMA param )* -> ^( PARAM_LIST[\"PARAM_LIST\",true] (
			// param )+ ) | )
			int alt8 = 2;
			int LA8_0 = input.LA(1);

			if ((LA8_0 == IDENTIFIER || LA8_0 == QUES)) {
				alt8 = 1;
			} else if ((LA8_0 == RPAREN)) {
				alt8 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 8, 0,
						input);

				throw nvae;
			}
			switch (alt8) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:21:
				// param ( COMMA param )*
			{
				pushFollow(FOLLOW_param_in_paramList594);
				param21 = param();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_param.add(param21.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:27:
				// ( COMMA param )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == COMMA)) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:28:
						// COMMA param
					{
						COMMA22 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_paramList597);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_COMMA.add(COMMA22);

						pushFollow(FOLLOW_param_in_paramList599);
						param23 = param();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_param.add(param23.getTree());

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
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 79:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:79:45:
						// ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(PARAM_LIST,
											"PARAM_LIST", true), root_1);

							if (!(stream_param.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_param.hasNext()) {
								adaptor.addChild(root_1, stream_param
										.nextTree());

							}
							stream_param.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:81:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 10, paramList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "paramList"

	public static class param_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "param"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:1:
	// param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^(
	// VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES )? ) ;
	public final TinyHaxeTry1Parser.param_return param()
			throws RecognitionException {
		TinyHaxeTry1Parser.param_return retval = new TinyHaxeTry1Parser.param_return();
		retval.start = input.LT(1);
		int param_StartIndex = input.index();
		Object root_0 = null;

		Token QUES24 = null;
		Token IDENTIFIER25 = null;
		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt26 = null;

		TinyHaxeTry1Parser.varInit_return varInit27 = null;

		Object QUES24_tree = null;
		Object IDENTIFIER25_tree = null;
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_QUES = new RewriteRuleTokenStream(
				adaptor, "token QUES");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_varInit = new RewriteRuleSubtreeStream(
				adaptor, "rule varInit");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 11)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:19:
			// ( ( QUES )? IDENTIFIER typeTagOpt varInit -> ^(
			// VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt ( varInit )? ( QUES
			// )? ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:20:
			// ( QUES )? IDENTIFIER typeTagOpt varInit
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:20:
				// ( QUES )?
				int alt9 = 2;
				int LA9_0 = input.LA(1);

				if ((LA9_0 == QUES)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
					// QUES
				{
					QUES24 = (Token) match(input, QUES, FOLLOW_QUES_in_param638);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_QUES.add(QUES24);

				}
					break;

				}

				IDENTIFIER25 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_param641);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER25);

				pushFollow(FOLLOW_typeTagOpt_in_param643);
				typeTagOpt26 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt26.getTree());
				pushFollow(FOLLOW_varInit_in_param645);
				varInit27 = varInit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_varInit.add(varInit27.getTree());

				// AST REWRITE
				// elements: IDENTIFIER, varInit, typeTagOpt, QUES
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 82:56: -> ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt
					// ( varInit )? ( QUES )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:59:
						// ^( VAR[$IDENTIFIER,true] IDENTIFIER typeTagOpt (
						// varInit )? ( QUES )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor
									.becomeRoot(new VarDeclaration(VAR,
											IDENTIFIER25, true), root_1);

							adaptor.addChild(root_1, new VarUsage(
									stream_IDENTIFIER.nextToken()));
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:131:
							// ( varInit )?
							if (stream_varInit.hasNext()) {
								adaptor.addChild(root_1, stream_varInit
										.nextTree());

							}
							stream_varInit.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:82:140:
							// ( QUES )?
							if (stream_QUES.hasNext()) {
								adaptor
										.addChild(root_1, stream_QUES
												.nextNode());

							}
							stream_QUES.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 11, param_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "param"

	public static class id_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "id"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:85:1:
	// id : IDENTIFIER ;
	public final TinyHaxeTry1Parser.id_return id() throws RecognitionException {
		TinyHaxeTry1Parser.id_return retval = new TinyHaxeTry1Parser.id_return();
		retval.start = input.LT(1);
		int id_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER28 = null;

		Object IDENTIFIER28_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 12)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:85:4:
			// ( IDENTIFIER )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:85:6:
			// IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER28 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_id679);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER28_tree = new VarUsage(IDENTIFIER28);
					adaptor.addChild(root_0, IDENTIFIER28_tree);
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 12, id_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "id"

	public static class dotIdent_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "dotIdent"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:1:
	// dotIdent : ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* ;
	public final TinyHaxeTry1Parser.dotIdent_return dotIdent()
			throws RecognitionException {
		TinyHaxeTry1Parser.dotIdent_return retval = new TinyHaxeTry1Parser.dotIdent_return();
		retval.start = input.LT(1);
		int dotIdent_StartIndex = input.index();
		Object root_0 = null;

		Token DOT30 = null;
		TinyHaxeTry1Parser.id_return ident = null;

		TinyHaxeTry1Parser.id_return id29 = null;

		Object DOT30_tree = null;
		RewriteRuleTokenStream stream_DOT = new RewriteRuleTokenStream(adaptor,
				"token DOT");
		RewriteRuleSubtreeStream stream_id = new RewriteRuleSubtreeStream(
				adaptor, "rule id");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 13)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:9:
			// ( ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:11:
			// ( id -> id ) ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:11:
				// ( id -> id )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:12:
				// id
				{
					pushFollow(FOLLOW_id_in_dotIdent693);
					id29 = id();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_id.add(id29.getTree());

					// AST REWRITE
					// elements: id
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					if (state.backtracking == 0) {
						retval.tree = root_0;
						RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
								adaptor, "rule retval",
								retval != null ? retval.tree : null);

						root_0 = (Object) adaptor.nil();
						// 88:15: -> id
						{
							adaptor.addChild(root_0, stream_id.nextTree());

						}

						retval.tree = root_0;
					}
				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:22:
				// ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == DOT)) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:23:
						// DOT ident= id
					{
						DOT30 = (Token) match(input, DOT,
								FOLLOW_DOT_in_dotIdent701);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_DOT.add(DOT30);

						pushFollow(FOLLOW_id_in_dotIdent705);
						ident = id();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_id.add(ident.getTree());

						// AST REWRITE
						// elements: DOT, ident, dotIdent
						// token labels:
						// rule labels: retval, ident
						// token list labels:
						// rule list labels:
						// wildcard labels:
						if (state.backtracking == 0) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
									adaptor, "rule retval",
									retval != null ? retval.tree : null);
							RewriteRuleSubtreeStream stream_ident = new RewriteRuleSubtreeStream(
									adaptor, "rule ident",
									ident != null ? ident.tree : null);

							root_0 = (Object) adaptor.nil();
							// 88:36: -> ^( DOT $dotIdent $ident)
							{
								// C:\\Documents and
								// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:88:38:
								// ^( DOT $dotIdent $ident)
								{
									Object root_1 = (Object) adaptor.nil();
									root_1 = (Object) adaptor.becomeRoot(
											stream_DOT.nextNode(), root_1);

									adaptor.addChild(root_1, stream_retval
											.nextTree());
									adaptor.addChild(root_1, stream_ident
											.nextTree());

									adaptor.addChild(root_0, root_1);
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

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 13, dotIdent_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "dotIdent"

	public static class assignOp_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "assignOp"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:111:1:
	// assignOp : ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ ->
	// SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ ->
	// PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] );
	public final TinyHaxeTry1Parser.assignOp_return assignOp()
			throws RecognitionException {
		TinyHaxeTry1Parser.assignOp_return retval = new TinyHaxeTry1Parser.assignOp_return();
		retval.start = input.LT(1);
		int assignOp_StartIndex = input.index();
		Object root_0 = null;

		Token EQ31 = null;
		Token PLUSEQ32 = null;
		Token SUBEQ33 = null;
		Token SLASHEQ34 = null;
		Token PERCENTEQ35 = null;
		Token AMPEQ36 = null;

		Object EQ31_tree = null;
		Object PLUSEQ32_tree = null;
		Object SUBEQ33_tree = null;
		Object SLASHEQ34_tree = null;
		Object PERCENTEQ35_tree = null;
		Object AMPEQ36_tree = null;
		RewriteRuleTokenStream stream_SUBEQ = new RewriteRuleTokenStream(
				adaptor, "token SUBEQ");
		RewriteRuleTokenStream stream_SLASHEQ = new RewriteRuleTokenStream(
				adaptor, "token SLASHEQ");
		RewriteRuleTokenStream stream_PERCENTEQ = new RewriteRuleTokenStream(
				adaptor, "token PERCENTEQ");
		RewriteRuleTokenStream stream_EQ = new RewriteRuleTokenStream(adaptor,
				"token EQ");
		RewriteRuleTokenStream stream_AMPEQ = new RewriteRuleTokenStream(
				adaptor, "token AMPEQ");
		RewriteRuleTokenStream stream_PLUSEQ = new RewriteRuleTokenStream(
				adaptor, "token PLUSEQ");

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 14)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:111:9:
			// ( EQ -> EQ[$EQ] | PLUSEQ -> PLUSEQ[$PLUSEQ] | SUBEQ ->
			// SUBEQ[$SUBEQ] | SLASHEQ -> SLASHEQ[$SLASHEQ] | PERCENTEQ ->
			// PERCENTEQ[$PERCENTEQ] | AMPEQ -> AMPEQ[$AMPEQ] )
			int alt11 = 6;
			switch (input.LA(1)) {
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
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 11, 0,
						input);

				throw nvae;
			}

			switch (alt11) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:111:11:
				// EQ
			{
				EQ31 = (Token) match(input, EQ, FOLLOW_EQ_in_assignOp737);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_EQ.add(EQ31);

				// AST REWRITE
				// elements: EQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 111:14: -> EQ[$EQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(EQ,
								EQ31));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:112:11:
				// PLUSEQ
			{
				PLUSEQ32 = (Token) match(input, PLUSEQ,
						FOLLOW_PLUSEQ_in_assignOp757);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PLUSEQ.add(PLUSEQ32);

				// AST REWRITE
				// elements: PLUSEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 112:19: -> PLUSEQ[$PLUSEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								PLUSEQ, PLUSEQ32));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:113:11:
				// SUBEQ
			{
				SUBEQ33 = (Token) match(input, SUBEQ,
						FOLLOW_SUBEQ_in_assignOp778);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SUBEQ.add(SUBEQ33);

				// AST REWRITE
				// elements: SUBEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 113:17: -> SUBEQ[$SUBEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(SUBEQ,
								SUBEQ33));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:114:11:
				// SLASHEQ
			{
				SLASHEQ34 = (Token) match(input, SLASHEQ,
						FOLLOW_SLASHEQ_in_assignOp798);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SLASHEQ.add(SLASHEQ34);

				// AST REWRITE
				// elements: SLASHEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 114:19: -> SLASHEQ[$SLASHEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								SLASHEQ, SLASHEQ34));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:115:4:
				// PERCENTEQ
			{
				PERCENTEQ35 = (Token) match(input, PERCENTEQ,
						FOLLOW_PERCENTEQ_in_assignOp811);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PERCENTEQ.add(PERCENTEQ35);

				// AST REWRITE
				// elements: PERCENTEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 116:4: -> PERCENTEQ[$PERCENTEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								PERCENTEQ, PERCENTEQ35));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:117:4:
				// AMPEQ
			{
				AMPEQ36 = (Token) match(input, AMPEQ,
						FOLLOW_AMPEQ_in_assignOp827);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_AMPEQ.add(AMPEQ36);

				// AST REWRITE
				// elements: AMPEQ
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 117:10: -> AMPEQ[$AMPEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(AMPEQ,
								AMPEQ36));

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 14, assignOp_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "assignOp"

	public static class funcLit_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "funcLit"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:126:1:
	// funcLit : FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^(
	// FUNCTION paramList typeTagOpt block ) ;
	public final TinyHaxeTry1Parser.funcLit_return funcLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcLit_return retval = new TinyHaxeTry1Parser.funcLit_return();
		retval.start = input.LT(1);
		int funcLit_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION37 = null;
		Token LPAREN38 = null;
		Token RPAREN40 = null;
		TinyHaxeTry1Parser.paramList_return paramList39 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt41 = null;

		TinyHaxeTry1Parser.block_return block42 = null;

		Object FUNCTION37_tree = null;
		Object LPAREN38_tree = null;
		Object RPAREN40_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				adaptor, "rule block");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 15)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:126:19:
			// ( FUNCTION LPAREN paramList RPAREN typeTagOpt block -> ^(
			// FUNCTION paramList typeTagOpt block ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:126:21:
			// FUNCTION LPAREN paramList RPAREN typeTagOpt block
			{
				FUNCTION37 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcLit867);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION37);

				LPAREN38 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcLit869);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN38);

				pushFollow(FOLLOW_paramList_in_funcLit871);
				paramList39 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList39.getTree());
				RPAREN40 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcLit873);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN40);

				pushFollow(FOLLOW_typeTagOpt_in_funcLit875);
				typeTagOpt41 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt41.getTree());
				pushFollow(FOLLOW_block_in_funcLit877);
				block42 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block42.getTree());

				// AST REWRITE
				// elements: FUNCTION, paramList, typeTagOpt, block
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 126:71: -> ^( FUNCTION paramList typeTagOpt block )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:126:74:
						// ^( FUNCTION paramList typeTagOpt block )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_paramList
									.nextTree());
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());
							adaptor.addChild(root_1, stream_block.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 15, funcLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcLit"

	public static class arrayLit_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "arrayLit"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:128:1:
	// arrayLit : LBRACKET exprListOpt RBRACKET ;
	public final TinyHaxeTry1Parser.arrayLit_return arrayLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.arrayLit_return retval = new TinyHaxeTry1Parser.arrayLit_return();
		retval.start = input.LT(1);
		int arrayLit_StartIndex = input.index();
		Object root_0 = null;

		Token LBRACKET43 = null;
		Token RBRACKET45 = null;
		TinyHaxeTry1Parser.exprListOpt_return exprListOpt44 = null;

		Object LBRACKET43_tree = null;
		Object RBRACKET45_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 16)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:128:18:
			// ( LBRACKET exprListOpt RBRACKET )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:128:20:
			// LBRACKET exprListOpt RBRACKET
			{
				root_0 = (Object) adaptor.nil();

				LBRACKET43 = (Token) match(input, LBRACKET,
						FOLLOW_LBRACKET_in_arrayLit909);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_exprListOpt_in_arrayLit912);
				exprListOpt44 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, exprListOpt44.getTree());
				RBRACKET45 = (Token) match(input, RBRACKET,
						FOLLOW_RBRACKET_in_arrayLit914);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 16, arrayLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "arrayLit"

	public static class pp_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "pp"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:135:1:
	// pp : ( ppIf | ppElseIf | ppElse | ppEnd | ppError );
	public final TinyHaxeTry1Parser.pp_return pp() throws RecognitionException {
		TinyHaxeTry1Parser.pp_return retval = new TinyHaxeTry1Parser.pp_return();
		retval.start = input.LT(1);
		int pp_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.ppIf_return ppIf46 = null;

		TinyHaxeTry1Parser.ppElseIf_return ppElseIf47 = null;

		TinyHaxeTry1Parser.ppElse_return ppElse48 = null;

		TinyHaxeTry1Parser.ppEnd_return ppEnd49 = null;

		TinyHaxeTry1Parser.ppError_return ppError50 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 17)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:135:19:
			// ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
			int alt12 = 5;
			switch (input.LA(1)) {
			case PP_IF: {
				alt12 = 1;
			}
				break;
			case PP_ELSEIF: {
				alt12 = 2;
			}
				break;
			case PP_ELSE: {
				alt12 = 3;
			}
				break;
			case PP_END: {
				alt12 = 4;
			}
				break;
			case PP_ERROR: {
				alt12 = 5;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 12, 0,
						input);

				throw nvae;
			}

			switch (alt12) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:135:21:
				// ppIf
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppIf_in_pp942);
				ppIf46 = ppIf();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppIf46.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:136:25:
				// ppElseIf
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppElseIf_in_pp968);
				ppElseIf47 = ppElseIf();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppElseIf47.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:137:25:
				// ppElse
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppElse_in_pp994);
				ppElse48 = ppElse();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppElse48.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:138:25:
				// ppEnd
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppEnd_in_pp1020);
				ppEnd49 = ppEnd();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppEnd49.getTree());

			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:139:25:
				// ppError
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppError_in_pp1046);
				ppError50 = ppError();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppError50.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 17, pp_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "pp"

	public static class ppIf_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ppIf"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:1:
	// ppIf : ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER );
	public final TinyHaxeTry1Parser.ppIf_return ppIf()
			throws RecognitionException {
		TinyHaxeTry1Parser.ppIf_return retval = new TinyHaxeTry1Parser.ppIf_return();
		retval.start = input.LT(1);
		int ppIf_StartIndex = input.index();
		Object root_0 = null;

		Token PP_IF51 = null;
		Token IDENTIFIER52 = null;
		Token PP_IF53 = null;
		Token BANG54 = null;
		Token IDENTIFIER55 = null;

		Object PP_IF51_tree = null;
		Object IDENTIFIER52_tree = null;
		Object PP_IF53_tree = null;
		Object BANG54_tree = null;
		Object IDENTIFIER55_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 18)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:19:
			// ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
			int alt13 = 2;
			int LA13_0 = input.LA(1);

			if ((LA13_0 == PP_IF)) {
				int LA13_1 = input.LA(2);

				if ((LA13_1 == IDENTIFIER)) {
					alt13 = 1;
				} else if ((LA13_1 == BANG)) {
					alt13 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							13, 1, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 13, 0,
						input);

				throw nvae;
			}
			switch (alt13) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:141:21:
				// PP_IF IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_IF51 = (Token) match(input, PP_IF, FOLLOW_PP_IF_in_ppIf1068);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_IF51_tree = (Object) adaptor.create(PP_IF51);
					adaptor.addChild(root_0, PP_IF51_tree);
				}
				IDENTIFIER52 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppIf1070);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER52_tree = (Object) adaptor.create(IDENTIFIER52);
					adaptor.addChild(root_0, IDENTIFIER52_tree);
				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:142:25:
				// PP_IF BANG IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_IF53 = (Token) match(input, PP_IF, FOLLOW_PP_IF_in_ppIf1096);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_IF53_tree = (Object) adaptor.create(PP_IF53);
					adaptor.addChild(root_0, PP_IF53_tree);
				}
				BANG54 = (Token) match(input, BANG, FOLLOW_BANG_in_ppIf1098);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BANG54_tree = (Object) adaptor.create(BANG54);
					adaptor.addChild(root_0, BANG54_tree);
				}
				IDENTIFIER55 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppIf1100);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER55_tree = (Object) adaptor.create(IDENTIFIER55);
					adaptor.addChild(root_0, IDENTIFIER55_tree);
				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 18, ppIf_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ppIf"

	public static class ppElseIf_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ppElseIf"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:1:
	// ppElseIf : ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER );
	public final TinyHaxeTry1Parser.ppElseIf_return ppElseIf()
			throws RecognitionException {
		TinyHaxeTry1Parser.ppElseIf_return retval = new TinyHaxeTry1Parser.ppElseIf_return();
		retval.start = input.LT(1);
		int ppElseIf_StartIndex = input.index();
		Object root_0 = null;

		Token PP_ELSEIF56 = null;
		Token IDENTIFIER57 = null;
		Token PP_ELSEIF58 = null;
		Token BANG59 = null;
		Token IDENTIFIER60 = null;

		Object PP_ELSEIF56_tree = null;
		Object IDENTIFIER57_tree = null;
		Object PP_ELSEIF58_tree = null;
		Object BANG59_tree = null;
		Object IDENTIFIER60_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 19)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:19:
			// ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
			int alt14 = 2;
			int LA14_0 = input.LA(1);

			if ((LA14_0 == PP_ELSEIF)) {
				int LA14_1 = input.LA(2);

				if ((LA14_1 == IDENTIFIER)) {
					alt14 = 1;
				} else if ((LA14_1 == BANG)) {
					alt14 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							14, 1, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 14, 0,
						input);

				throw nvae;
			}
			switch (alt14) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:144:21:
				// PP_ELSEIF IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSEIF56 = (Token) match(input, PP_ELSEIF,
						FOLLOW_PP_ELSEIF_in_ppElseIf1118);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ELSEIF56_tree = (Object) adaptor.create(PP_ELSEIF56);
					adaptor.addChild(root_0, PP_ELSEIF56_tree);
				}
				IDENTIFIER57 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppElseIf1120);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER57_tree = (Object) adaptor.create(IDENTIFIER57);
					adaptor.addChild(root_0, IDENTIFIER57_tree);
				}

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:145:24:
				// PP_ELSEIF BANG IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSEIF58 = (Token) match(input, PP_ELSEIF,
						FOLLOW_PP_ELSEIF_in_ppElseIf1145);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ELSEIF58_tree = (Object) adaptor.create(PP_ELSEIF58);
					adaptor.addChild(root_0, PP_ELSEIF58_tree);
				}
				BANG59 = (Token) match(input, BANG, FOLLOW_BANG_in_ppElseIf1147);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BANG59_tree = (Object) adaptor.create(BANG59);
					adaptor.addChild(root_0, BANG59_tree);
				}
				IDENTIFIER60 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppElseIf1149);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER60_tree = (Object) adaptor.create(IDENTIFIER60);
					adaptor.addChild(root_0, IDENTIFIER60_tree);
				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 19, ppElseIf_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ppElseIf"

	public static class ppElse_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ppElse"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:147:1:
	// ppElse : PP_ELSE ;
	public final TinyHaxeTry1Parser.ppElse_return ppElse()
			throws RecognitionException {
		TinyHaxeTry1Parser.ppElse_return retval = new TinyHaxeTry1Parser.ppElse_return();
		retval.start = input.LT(1);
		int ppElse_StartIndex = input.index();
		Object root_0 = null;

		Token PP_ELSE61 = null;

		Object PP_ELSE61_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 20)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:147:19:
			// ( PP_ELSE )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:147:21:
			// PP_ELSE
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSE61 = (Token) match(input, PP_ELSE,
						FOLLOW_PP_ELSE_in_ppElse1169);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ELSE61_tree = (Object) adaptor.create(PP_ELSE61);
					adaptor.addChild(root_0, PP_ELSE61_tree);
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 20, ppElse_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ppElse"

	public static class ppEnd_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ppEnd"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:1:
	// ppEnd : PP_END ;
	public final TinyHaxeTry1Parser.ppEnd_return ppEnd()
			throws RecognitionException {
		TinyHaxeTry1Parser.ppEnd_return retval = new TinyHaxeTry1Parser.ppEnd_return();
		retval.start = input.LT(1);
		int ppEnd_StartIndex = input.index();
		Object root_0 = null;

		Token PP_END62 = null;

		Object PP_END62_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 21)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:19:
			// ( PP_END )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:149:21:
			// PP_END
			{
				root_0 = (Object) adaptor.nil();

				PP_END62 = (Token) match(input, PP_END,
						FOLLOW_PP_END_in_ppEnd1190);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_END62_tree = (Object) adaptor.create(PP_END62);
					adaptor.addChild(root_0, PP_END62_tree);
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 21, ppEnd_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ppEnd"

	public static class ppError_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ppError"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:1:
	// ppError : PP_ERROR ;
	public final TinyHaxeTry1Parser.ppError_return ppError()
			throws RecognitionException {
		TinyHaxeTry1Parser.ppError_return retval = new TinyHaxeTry1Parser.ppError_return();
		retval.start = input.LT(1);
		int ppError_StartIndex = input.index();
		Object root_0 = null;

		Token PP_ERROR63 = null;

		Object PP_ERROR63_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 22)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:19:
			// ( PP_ERROR )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:151:21:
			// PP_ERROR
			{
				root_0 = (Object) adaptor.nil();

				PP_ERROR63 = (Token) match(input, PP_ERROR,
						FOLLOW_PP_ERROR_in_ppError1209);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ERROR63_tree = (Object) adaptor.create(PP_ERROR63);
					adaptor.addChild(root_0, PP_ERROR63_tree);
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 22, ppError_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ppError"

	public static class typeTag_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeTag"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:1:
	// typeTag : COLON funcType ;
	public final TinyHaxeTry1Parser.typeTag_return typeTag()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeTag_return retval = new TinyHaxeTry1Parser.typeTag_return();
		retval.start = input.LT(1);
		int typeTag_StartIndex = input.index();
		Object root_0 = null;

		Token COLON64 = null;
		TinyHaxeTry1Parser.funcType_return funcType65 = null;

		Object COLON64_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 23)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:19:
			// ( COLON funcType )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:156:21:
			// COLON funcType
			{
				root_0 = (Object) adaptor.nil();

				COLON64 = (Token) match(input, COLON,
						FOLLOW_COLON_in_typeTag1232);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_funcType_in_typeTag1235);
				funcType65 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType65.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 23, typeTag_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeTag"

	public static class typeTagOpt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeTagOpt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:1:
	// typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | );
	public final TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeTagOpt_return retval = new TinyHaxeTry1Parser.typeTagOpt_return();
		retval.start = input.LT(1);
		int typeTagOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.typeTag_return typeTag66 = null;

		RewriteRuleSubtreeStream stream_typeTag = new RewriteRuleSubtreeStream(
				adaptor, "rule typeTag");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 24)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:19:
			// ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag ) | )
			int alt15 = 2;
			int LA15_0 = input.LA(1);

			if ((LA15_0 == COLON)) {
				alt15 = 1;
			} else if ((LA15_0 == EOF || LA15_0 == SEMI || LA15_0 == COMMA
					|| LA15_0 == EQ || LA15_0 == RPAREN || LA15_0 == LBRACE)) {
				alt15 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 15, 0,
						input);

				throw nvae;
			}
			switch (alt15) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:21:
				// typeTag
			{
				pushFollow(FOLLOW_typeTag_in_typeTagOpt1251);
				typeTag66 = typeTag();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTag.add(typeTag66.getTree());

				// AST REWRITE
				// elements: typeTag
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 158:29: -> ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:158:32:
						// ^( TYPE_TAG[\"TYPE_TAG\",true] typeTag )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_TAG,
											"TYPE_TAG", true), root_1);

							adaptor.addChild(root_1, stream_typeTag.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:160:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 24, typeTagOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeTagOpt"

	public static class typeList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:1:
	// typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA
	// typeConstraint )* );
	public final TinyHaxeTry1Parser.typeList_return typeList()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeList_return retval = new TinyHaxeTry1Parser.typeList_return();
		retval.start = input.LT(1);
		int typeList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA68 = null;
		Token COMMA71 = null;
		TinyHaxeTry1Parser.funcType_return funcType67 = null;

		TinyHaxeTry1Parser.funcType_return funcType69 = null;

		TinyHaxeTry1Parser.typeConstraint_return typeConstraint70 = null;

		TinyHaxeTry1Parser.typeConstraint_return typeConstraint72 = null;

		Object COMMA68_tree = null;
		Object COMMA71_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 25)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:19:
			// ( funcType ( COMMA funcType )* | typeConstraint ( COMMA
			// typeConstraint )* )
			int alt18 = 2;
			int LA18_0 = input.LA(1);

			if ((LA18_0 == VOID || LA18_0 == LBRACE)) {
				alt18 = 1;
			} else if ((LA18_0 == IDENTIFIER)) {
				int LA18_2 = input.LA(2);

				if ((LA18_2 == COLON)) {
					alt18 = 2;
				} else if ((LA18_2 == DOT || LA18_2 == COMMA
						|| LA18_2 == RPAREN || LA18_2 == MINUS_BIGGER || (LA18_2 >= GT && LA18_2 <= LT))) {
					alt18 = 1;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							18, 2, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 18, 0,
						input);

				throw nvae;
			}
			switch (alt18) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:21:
				// funcType ( COMMA funcType )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcType_in_typeList1303);
				funcType67 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType67.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:30:
				// ( COMMA funcType )*
				loop16: do {
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if ((LA16_0 == COMMA)) {
						alt16 = 1;
					}

					switch (alt16) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:161:31:
						// COMMA funcType
					{
						COMMA68 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_typeList1306);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_funcType_in_typeList1309);
						funcType69 = funcType();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, funcType69.getTree());

					}
						break;

					default:
						break loop16;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:25:
				// typeConstraint ( COMMA typeConstraint )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_typeConstraint_in_typeList1337);
				typeConstraint70 = typeConstraint();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeConstraint70.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:40:
				// ( COMMA typeConstraint )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == COMMA)) {
						alt17 = 1;
					}

					switch (alt17) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:162:41:
						// COMMA typeConstraint
					{
						COMMA71 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_typeList1340);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_typeConstraint_in_typeList1343);
						typeConstraint72 = typeConstraint();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor
									.addChild(root_0, typeConstraint72
											.getTree());

					}
						break;

					default:
						break loop17;
					}
				} while (true);

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 25, typeList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeList"

	public static class funcType_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "funcType"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:1:
	// funcType : ( ( type ) ( MINUS_BIGGER type )* | VOID );
	public final TinyHaxeTry1Parser.funcType_return funcType()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcType_return retval = new TinyHaxeTry1Parser.funcType_return();
		retval.start = input.LT(1);
		int funcType_StartIndex = input.index();
		Object root_0 = null;

		Token MINUS_BIGGER74 = null;
		Token VOID76 = null;
		TinyHaxeTry1Parser.type_return type73 = null;

		TinyHaxeTry1Parser.type_return type75 = null;

		Object MINUS_BIGGER74_tree = null;
		Object VOID76_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 26)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:19:
			// ( ( type ) ( MINUS_BIGGER type )* | VOID )
			int alt20 = 2;
			int LA20_0 = input.LA(1);

			if ((LA20_0 == IDENTIFIER || LA20_0 == LBRACE)) {
				alt20 = 1;
			} else if ((LA20_0 == VOID)) {
				alt20 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 20, 0,
						input);

				throw nvae;
			}
			switch (alt20) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:21:
				// ( type ) ( MINUS_BIGGER type )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:21:
				// ( type )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:22:
				// type
				{
					pushFollow(FOLLOW_type_in_funcType1383);
					type73 = type();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, type73.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:28:
				// ( MINUS_BIGGER type )*
				loop19: do {
					int alt19 = 2;
					int LA19_0 = input.LA(1);

					if ((LA19_0 == MINUS_BIGGER)) {
						alt19 = 1;
					}

					switch (alt19) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:165:29:
						// MINUS_BIGGER type
					{
						MINUS_BIGGER74 = (Token) match(input, MINUS_BIGGER,
								FOLLOW_MINUS_BIGGER_in_funcType1387);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_type_in_funcType1390);
						type75 = type();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, type75.getTree());

					}
						break;

					default:
						break loop19;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:166:4:
				// VOID
			{
				root_0 = (Object) adaptor.nil();

				VOID76 = (Token) match(input, VOID, FOLLOW_VOID_in_funcType1397);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					VOID76_tree = (Object) adaptor.create(VOID76);
					adaptor.addChild(root_0, VOID76_tree);
				}

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 26, funcType_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcType"

	public static class type_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "type"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:1:
	// type : ( anonType | dotIdent ) ( typeParam )* ;
	public final TinyHaxeTry1Parser.type_return type()
			throws RecognitionException {
		TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.anonType_return anonType77 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent78 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam79 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 27)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:19:
			// ( ( anonType | dotIdent ) ( typeParam )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:21:
			// ( anonType | dotIdent ) ( typeParam )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:21:
				// ( anonType | dotIdent )
				int alt21 = 2;
				int LA21_0 = input.LA(1);

				if ((LA21_0 == LBRACE)) {
					alt21 = 1;
				} else if ((LA21_0 == IDENTIFIER)) {
					alt21 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							21, 0, input);

					throw nvae;
				}
				switch (alt21) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:22:
					// anonType
				{
					pushFollow(FOLLOW_anonType_in_type1420);
					anonType77 = anonType();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, anonType77.getTree());

				}
					break;
				case 2:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:33:
					// dotIdent
				{
					pushFollow(FOLLOW_dotIdent_in_type1424);
					dotIdent78 = dotIdent();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, dotIdent78.getTree());

				}
					break;

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:43:
				// ( typeParam )*
				loop22: do {
					int alt22 = 2;
					int LA22_0 = input.LA(1);

					if ((LA22_0 == GT)) {
						alt22 = 1;
					}

					switch (alt22) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:168:44:
						// typeParam
					{
						pushFollow(FOLLOW_typeParam_in_type1428);
						typeParam79 = typeParam();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, typeParam79.getTree());

					}
						break;

					default:
						break loop22;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 27, type_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "type"

	public static class typeParam_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeParam"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:1:
	// typeParam : GT typeList LT ;
	public final TinyHaxeTry1Parser.typeParam_return typeParam()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
		retval.start = input.LT(1);
		int typeParam_StartIndex = input.index();
		Object root_0 = null;

		Token GT80 = null;
		Token LT82 = null;
		TinyHaxeTry1Parser.typeList_return typeList81 = null;

		Object GT80_tree = null;
		Object LT82_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 28)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:19:
			// ( GT typeList LT )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:170:21:
			// GT typeList LT
			{
				root_0 = (Object) adaptor.nil();

				GT80 = (Token) match(input, GT, FOLLOW_GT_in_typeParam1447);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_typeList_in_typeParam1450);
				typeList81 = typeList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeList81.getTree());
				LT82 = (Token) match(input, LT, FOLLOW_LT_in_typeParam1452);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 28, typeParam_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeParam"

	public static class typeParamOpt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeParamOpt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:1:
	// typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true]
	// typeParam ) | );
	public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
		retval.start = input.LT(1);
		int typeParamOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam83 = null;

		RewriteRuleSubtreeStream stream_typeParam = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParam");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 29)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:19:
			// ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true]
			// typeParam ) | )
			int alt23 = 2;
			alt23 = dfa23.predict(input);
			switch (alt23) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:21:
				// typeParam
			{
				pushFollow(FOLLOW_typeParam_in_typeParamOpt1467);
				typeParam83 = typeParam();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParam.add(typeParam83.getTree());

				// AST REWRITE
				// elements: typeParam
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 172:30: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true]
					// typeParam )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:32:
						// ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam
						// )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_PARAM_OPT,
											"TYPE_PARAM_OPT", true), root_1);

							adaptor.addChild(root_1, stream_typeParam
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:174:8:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 29, typeParamOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeParamOpt"

	public static class typeConstraint_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeConstraint"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:1:
	// typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^(
	// $typeConstraint IDENTIFIER typeList ) ;
	public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
		retval.start = input.LT(1);
		int typeConstraint_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER84 = null;
		Token COLON85 = null;
		Token LPAREN86 = null;
		Token RPAREN88 = null;
		TinyHaxeTry1Parser.typeList_return typeList87 = null;

		Object IDENTIFIER84_tree = null;
		Object COLON85_tree = null;
		Object LPAREN86_tree = null;
		Object RPAREN88_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				adaptor, "token COLON");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_typeList = new RewriteRuleSubtreeStream(
				adaptor, "rule typeList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 30)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:19:
			// ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint
			// IDENTIFIER typeList ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:21:
			// IDENTIFIER COLON LPAREN typeList RPAREN
			{
				IDENTIFIER84 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typeConstraint1499);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER84);

				COLON85 = (Token) match(input, COLON,
						FOLLOW_COLON_in_typeConstraint1501);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON85);

				LPAREN86 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_typeConstraint1503);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN86);

				pushFollow(FOLLOW_typeList_in_typeConstraint1505);
				typeList87 = typeList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeList.add(typeList87.getTree());
				RPAREN88 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_typeConstraint1507);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN88);

				// AST REWRITE
				// elements: IDENTIFIER, typeList, typeConstraint
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 175:61: -> ^( $typeConstraint IDENTIFIER typeList )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:175:64:
						// ^( $typeConstraint IDENTIFIER typeList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_retval
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							adaptor
									.addChild(root_1, stream_typeList
											.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 30, typeConstraint_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeConstraint"

	public static class statement_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "statement"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:178:1:
	// statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1=
	// statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE
	// $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^(
	// FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^(
	// WHILE parExpression statement ) | DO statement WHILE parExpression SEMI
	// -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY
	// block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+
	// RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^(
	// RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK (
	// IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER
	// )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON
	// statement -> ^( COLON IDENTIFIER statement ) | SEMI );
	public final TinyHaxeTry1Parser.statement_return statement()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();
		Object root_0 = null;

		Token SEMI91 = null;
		Token IF93 = null;
		Token ELSE95 = null;
		Token FOR96 = null;
		Token LPAREN97 = null;
		Token IN98 = null;
		Token RPAREN99 = null;
		Token WHILE101 = null;
		Token DO104 = null;
		Token WHILE106 = null;
		Token SEMI108 = null;
		Token TRY109 = null;
		Token SWITCH112 = null;
		Token LPAREN113 = null;
		Token RPAREN115 = null;
		Token LBRACE116 = null;
		Token RBRACE118 = null;
		Token RETURN119 = null;
		Token SEMI121 = null;
		Token THROW122 = null;
		Token SEMI124 = null;
		Token BREAK125 = null;
		Token IDENTIFIER126 = null;
		Token SEMI127 = null;
		Token CONTINUE128 = null;
		Token IDENTIFIER129 = null;
		Token SEMI130 = null;
		Token SEMI132 = null;
		Token IDENTIFIER133 = null;
		Token COLON134 = null;
		Token SEMI136 = null;
		TinyHaxeTry1Parser.statement_return st1 = null;

		TinyHaxeTry1Parser.statement_return st2 = null;

		TinyHaxeTry1Parser.expr_return exp1 = null;

		TinyHaxeTry1Parser.expr_return exp2 = null;

		TinyHaxeTry1Parser.block_return block89 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr90 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl92 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression94 = null;

		TinyHaxeTry1Parser.statement_return statement100 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression102 = null;

		TinyHaxeTry1Parser.statement_return statement103 = null;

		TinyHaxeTry1Parser.statement_return statement105 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression107 = null;

		TinyHaxeTry1Parser.block_return block110 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList111 = null;

		TinyHaxeTry1Parser.expr_return expr114 = null;

		TinyHaxeTry1Parser.caseStmt_return caseStmt117 = null;

		TinyHaxeTry1Parser.expr_return expr120 = null;

		TinyHaxeTry1Parser.expr_return expr123 = null;

		TinyHaxeTry1Parser.expr_return expr131 = null;

		TinyHaxeTry1Parser.statement_return statement135 = null;

		Object SEMI91_tree = null;
		Object IF93_tree = null;
		Object ELSE95_tree = null;
		Object FOR96_tree = null;
		Object LPAREN97_tree = null;
		Object IN98_tree = null;
		Object RPAREN99_tree = null;
		Object WHILE101_tree = null;
		Object DO104_tree = null;
		Object WHILE106_tree = null;
		Object SEMI108_tree = null;
		Object TRY109_tree = null;
		Object SWITCH112_tree = null;
		Object LPAREN113_tree = null;
		Object RPAREN115_tree = null;
		Object LBRACE116_tree = null;
		Object RBRACE118_tree = null;
		Object RETURN119_tree = null;
		Object SEMI121_tree = null;
		Object THROW122_tree = null;
		Object SEMI124_tree = null;
		Object BREAK125_tree = null;
		Object IDENTIFIER126_tree = null;
		Object SEMI127_tree = null;
		Object CONTINUE128_tree = null;
		Object IDENTIFIER129_tree = null;
		Object SEMI130_tree = null;
		Object SEMI132_tree = null;
		Object IDENTIFIER133_tree = null;
		Object COLON134_tree = null;
		Object SEMI136_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				adaptor, "token COLON");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IN = new RewriteRuleTokenStream(adaptor,
				"token IN");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_WHILE = new RewriteRuleTokenStream(
				adaptor, "token WHILE");
		RewriteRuleTokenStream stream_CONTINUE = new RewriteRuleTokenStream(
				adaptor, "token CONTINUE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_SWITCH = new RewriteRuleTokenStream(
				adaptor, "token SWITCH");
		RewriteRuleTokenStream stream_ELSE = new RewriteRuleTokenStream(
				adaptor, "token ELSE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleTokenStream stream_RETURN = new RewriteRuleTokenStream(
				adaptor, "token RETURN");
		RewriteRuleTokenStream stream_FOR = new RewriteRuleTokenStream(adaptor,
				"token FOR");
		RewriteRuleTokenStream stream_DO = new RewriteRuleTokenStream(adaptor,
				"token DO");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleTokenStream stream_BREAK = new RewriteRuleTokenStream(
				adaptor, "token BREAK");
		RewriteRuleTokenStream stream_THROW = new RewriteRuleTokenStream(
				adaptor, "token THROW");
		RewriteRuleTokenStream stream_TRY = new RewriteRuleTokenStream(adaptor,
				"token TRY");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleTokenStream stream_IF = new RewriteRuleTokenStream(adaptor,
				"token IF");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		RewriteRuleSubtreeStream stream_parExpression = new RewriteRuleSubtreeStream(
				adaptor, "rule parExpression");
		RewriteRuleSubtreeStream stream_caseStmt = new RewriteRuleSubtreeStream(
				adaptor, "rule caseStmt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				adaptor, "rule block");
		RewriteRuleSubtreeStream stream_catchStmtList = new RewriteRuleSubtreeStream(
				adaptor, "rule catchStmtList");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 31)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:5:
			// ( block | assignExpr SEMI | varDecl | IF parExpression st1=
			// statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 (
			// ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN
			// statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE
			// parExpression statement -> ^( WHILE parExpression statement ) |
			// DO statement WHILE parExpression SEMI -> ^( DO parExpression
			// statement ) | TRY block catchStmtList -> ^( TRY block
			// catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+
			// RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI
			// -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) |
			// BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) |
			// CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) |
			// expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER
			// statement ) | SEMI )
			int alt29 = 16;
			alt29 = dfa29.predict(input);
			switch (alt29) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:9:
				// block
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_block_in_statement1536);
				block89 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, block89.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:180:7:
				// assignExpr SEMI
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_assignExpr_in_statement1544);
				assignExpr90 = assignExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, assignExpr90.getTree());
				SEMI91 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1546);
				if (state.failed)
					return retval;

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:181:7:
				// varDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_statement1555);
				varDecl92 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl92.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:9:
				// IF parExpression st1= statement ( ELSE st2= statement )?
			{
				IF93 = (Token) match(input, IF, FOLLOW_IF_in_statement1565);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IF.add(IF93);

				pushFollow(FOLLOW_parExpression_in_statement1567);
				parExpression94 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression94.getTree());
				pushFollow(FOLLOW_statement_in_statement1571);
				st1 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(st1.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:40:
				// ( ELSE st2= statement )?
				int alt24 = 2;
				int LA24_0 = input.LA(1);

				if ((LA24_0 == ELSE)) {
					int LA24_1 = input.LA(2);

					if ((synpred39_TinyHaxeTry1())) {
						alt24 = 1;
					}
				}
				switch (alt24) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:41:
					// ELSE st2= statement
				{
					ELSE95 = (Token) match(input, ELSE,
							FOLLOW_ELSE_in_statement1574);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_ELSE.add(ELSE95);

					pushFollow(FOLLOW_statement_in_statement1578);
					st2 = statement();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_statement.add(st2.getTree());

				}
					break;

				}

				// AST REWRITE
				// elements: parExpression, IF, ELSE, st2, st1
				// token labels:
				// rule labels: retval, st1, st2
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_st1 = new RewriteRuleSubtreeStream(
							adaptor, "rule st1", st1 != null ? st1.tree : null);
					RewriteRuleSubtreeStream stream_st2 = new RewriteRuleSubtreeStream(
							adaptor, "rule st2", st2 != null ? st2.tree : null);

					root_0 = (Object) adaptor.nil();
					// 182:62: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:65:
						// ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new IfNode(
									stream_IF.nextToken()), root_1);

							adaptor.addChild(root_1, stream_parExpression
									.nextTree());
							adaptor.addChild(root_1, stream_st1.nextTree());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:97:
							// ( ^( ELSE $st2) )?
							if (stream_ELSE.hasNext() || stream_st2.hasNext()) {
								// C:\\Documents and
								// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:97:
								// ^( ELSE $st2)
								{
									Object root_2 = (Object) adaptor.nil();
									root_2 = (Object) adaptor.becomeRoot(
											stream_ELSE.nextNode(), root_2);

									adaptor.addChild(root_2, stream_st2
											.nextTree());

									adaptor.addChild(root_1, root_2);
								}

							}
							stream_ELSE.reset();
							stream_st2.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:9:
				// FOR LPAREN exp1= expr IN exp2= expr RPAREN statement
			{
				FOR96 = (Token) match(input, FOR, FOLLOW_FOR_in_statement1622);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FOR.add(FOR96);

				LPAREN97 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_statement1624);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN97);

				pushFollow(FOLLOW_expr_in_statement1628);
				exp1 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(exp1.getTree());
				IN98 = (Token) match(input, IN, FOLLOW_IN_in_statement1630);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IN.add(IN98);

				pushFollow(FOLLOW_expr_in_statement1634);
				exp2 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(exp2.getTree());
				RPAREN99 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_statement1636);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN99);

				pushFollow(FOLLOW_statement_in_statement1638);
				statement100 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement100.getTree());

				// AST REWRITE
				// elements: FOR, exp2, exp1, statement, IN
				// token labels:
				// rule labels: retval, exp2, exp1
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_exp2 = new RewriteRuleSubtreeStream(
							adaptor, "rule exp2", exp2 != null ? exp2.tree
									: null);
					RewriteRuleSubtreeStream stream_exp1 = new RewriteRuleSubtreeStream(
							adaptor, "rule exp1", exp1 != null ? exp1.tree
									: null);

					root_0 = (Object) adaptor.nil();
					// 183:60: -> ^( FOR ^( IN $exp1 $exp2) statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:63:
						// ^( FOR ^( IN $exp1 $exp2) statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new ForNode(
									stream_FOR.nextToken()), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:183:78:
							// ^( IN $exp1 $exp2)
							{
								Object root_2 = (Object) adaptor.nil();
								root_2 = (Object) adaptor.becomeRoot(stream_IN
										.nextNode(), root_2);

								adaptor
										.addChild(root_2, stream_exp1
												.nextTree());
								adaptor
										.addChild(root_2, stream_exp2
												.nextTree());

								adaptor.addChild(root_1, root_2);
							}
							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:184:9:
				// WHILE parExpression statement
			{
				WHILE101 = (Token) match(input, WHILE,
						FOLLOW_WHILE_in_statement1669);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_WHILE.add(WHILE101);

				pushFollow(FOLLOW_parExpression_in_statement1671);
				parExpression102 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression102.getTree());
				pushFollow(FOLLOW_statement_in_statement1673);
				statement103 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement103.getTree());

				// AST REWRITE
				// elements: WHILE, statement, parExpression
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 184:39: -> ^( WHILE parExpression statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:184:42:
						// ^( WHILE parExpression statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new WhileNode(
									stream_WHILE.nextToken()), root_1);

							adaptor.addChild(root_1, stream_parExpression
									.nextTree());
							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:185:9:
				// DO statement WHILE parExpression SEMI
			{
				DO104 = (Token) match(input, DO, FOLLOW_DO_in_statement1696);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_DO.add(DO104);

				pushFollow(FOLLOW_statement_in_statement1698);
				statement105 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement105.getTree());
				WHILE106 = (Token) match(input, WHILE,
						FOLLOW_WHILE_in_statement1700);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_WHILE.add(WHILE106);

				pushFollow(FOLLOW_parExpression_in_statement1702);
				parExpression107 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression107.getTree());
				SEMI108 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1704);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI108);

				// AST REWRITE
				// elements: parExpression, DO, statement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 185:47: -> ^( DO parExpression statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:185:50:
						// ^( DO parExpression statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new DoWhileNode(stream_DO.nextToken()),
									root_1);

							adaptor.addChild(root_1, stream_parExpression
									.nextTree());
							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 8:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:9:
				// TRY block catchStmtList
			{
				TRY109 = (Token) match(input, TRY, FOLLOW_TRY_in_statement1727);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_TRY.add(TRY109);

				pushFollow(FOLLOW_block_in_statement1729);
				block110 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block110.getTree());
				pushFollow(FOLLOW_catchStmtList_in_statement1731);
				catchStmtList111 = catchStmtList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_catchStmtList.add(catchStmtList111.getTree());

				// AST REWRITE
				// elements: TRY, block, catchStmtList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 186:33: -> ^( TRY block catchStmtList )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:186:36:
						// ^( TRY block catchStmtList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new TryNode(
									stream_TRY.nextToken()), root_1);

							adaptor.addChild(root_1, stream_block.nextTree());
							adaptor.addChild(root_1, stream_catchStmtList
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 9:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:7:
				// SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE
			{
				SWITCH112 = (Token) match(input, SWITCH,
						FOLLOW_SWITCH_in_statement1752);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SWITCH.add(SWITCH112);

				LPAREN113 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_statement1754);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN113);

				pushFollow(FOLLOW_expr_in_statement1756);
				expr114 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr114.getTree());
				RPAREN115 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_statement1758);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN115);

				LBRACE116 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_statement1760);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE116);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:40:
				// ( caseStmt )+
				int cnt25 = 0;
				loop25: do {
					int alt25 = 2;
					int LA25_0 = input.LA(1);

					if (((LA25_0 >= CASE && LA25_0 <= DEFAULT))) {
						alt25 = 1;
					}

					switch (alt25) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
						// caseStmt
					{
						pushFollow(FOLLOW_caseStmt_in_statement1762);
						caseStmt117 = caseStmt();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_caseStmt.add(caseStmt117.getTree());

					}
						break;

					default:
						if (cnt25 >= 1)
							break loop25;
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(25,
								input);
						throw eee;
					}
					cnt25++;
				} while (true);

				RBRACE118 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_statement1765);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE118);

				// AST REWRITE
				// elements: caseStmt, SWITCH, expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 187:57: -> ^( SWITCH expr ( caseStmt )+ )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:187:60:
						// ^( SWITCH expr ( caseStmt )+ )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new SwitchNode(stream_SWITCH.nextToken()),
									root_1);

							adaptor.addChild(root_1, stream_expr.nextTree());
							if (!(stream_caseStmt.hasNext())) {
								throw new RewriteEarlyExitException();
							}
							while (stream_caseStmt.hasNext()) {
								adaptor.addChild(root_1, stream_caseStmt
										.nextTree());

							}
							stream_caseStmt.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 10:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:9:
				// RETURN ( expr )? SEMI
			{
				RETURN119 = (Token) match(input, RETURN,
						FOLLOW_RETURN_in_statement1789);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RETURN.add(RETURN119);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:16:
				// ( expr )?
				int alt26 = 2;
				int LA26_0 = input.LA(1);

				if ((LA26_0 == IDENTIFIER
						|| (LA26_0 >= QUES && LA26_0 <= LPAREN)
						|| LA26_0 == LBRACKET || LA26_0 == BANG
						|| (LA26_0 >= GT && LA26_0 <= LT) || LA26_0 == LBRACE
						|| (LA26_0 >= ELLIPSIS && LA26_0 <= CAST) || (LA26_0 >= LONGLITERAL && LA26_0 <= FALSE))) {
					alt26 = 1;
				} else if ((LA26_0 == SEMI)) {
					int LA26_2 = input.LA(2);

					if ((synpred47_TinyHaxeTry1())) {
						alt26 = 1;
					}
				}
				switch (alt26) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:17:
					// expr
				{
					pushFollow(FOLLOW_expr_in_statement1792);
					expr120 = expr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_expr.add(expr120.getTree());

				}
					break;

				}

				SEMI121 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1796);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI121);

				// AST REWRITE
				// elements: RETURN, expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 188:28: -> ^( RETURN ( expr )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:31:
						// ^( RETURN ( expr )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_RETURN
									.nextNode(), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:40:
							// ( expr )?
							if (stream_expr.hasNext()) {
								adaptor
										.addChild(root_1, stream_expr
												.nextTree());

							}
							stream_expr.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 11:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:189:9:
				// THROW expr SEMI
			{
				THROW122 = (Token) match(input, THROW,
						FOLLOW_THROW_in_statement1814);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_THROW.add(THROW122);

				pushFollow(FOLLOW_expr_in_statement1816);
				expr123 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr123.getTree());
				SEMI124 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1818);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI124);

				// AST REWRITE
				// elements: expr, THROW
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 189:25: -> ^( THROW expr )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:189:28:
						// ^( THROW expr )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_THROW
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_expr.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 12:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:9:
				// BREAK ( IDENTIFIER )? SEMI
			{
				BREAK125 = (Token) match(input, BREAK,
						FOLLOW_BREAK_in_statement1836);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_BREAK.add(BREAK125);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:15:
				// ( IDENTIFIER )?
				int alt27 = 2;
				int LA27_0 = input.LA(1);

				if ((LA27_0 == IDENTIFIER)) {
					alt27 = 1;
				}
				switch (alt27) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:16:
					// IDENTIFIER
				{
					IDENTIFIER126 = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1839);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_IDENTIFIER.add(IDENTIFIER126);

				}
					break;

				}

				SEMI127 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1843);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI127);

				// AST REWRITE
				// elements: IDENTIFIER, BREAK
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 190:34: -> ^( BREAK ( IDENTIFIER )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:37:
						// ^( BREAK ( IDENTIFIER )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_BREAK
									.nextNode(), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:190:45:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 13:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:9:
				// CONTINUE ( IDENTIFIER )? SEMI
			{
				CONTINUE128 = (Token) match(input, CONTINUE,
						FOLLOW_CONTINUE_in_statement1862);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CONTINUE.add(CONTINUE128);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:18:
				// ( IDENTIFIER )?
				int alt28 = 2;
				int LA28_0 = input.LA(1);

				if ((LA28_0 == IDENTIFIER)) {
					alt28 = 1;
				}
				switch (alt28) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:19:
					// IDENTIFIER
				{
					IDENTIFIER129 = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1865);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_IDENTIFIER.add(IDENTIFIER129);

				}
					break;

				}

				SEMI130 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1869);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI130);

				// AST REWRITE
				// elements: IDENTIFIER, CONTINUE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 191:37: -> ^( CONTINUE ( IDENTIFIER )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:40:
						// ^( CONTINUE ( IDENTIFIER )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_CONTINUE.nextNode(), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:191:51:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 14:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:9:
				// expr SEMI
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expr_in_statement1888);
				expr131 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr131.getTree());
				SEMI132 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1891);
				if (state.failed)
					return retval;

			}
				break;
			case 15:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:193:9:
				// IDENTIFIER COLON statement
			{
				IDENTIFIER133 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_statement1902);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER133);

				COLON134 = (Token) match(input, COLON,
						FOLLOW_COLON_in_statement1904);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON134);

				pushFollow(FOLLOW_statement_in_statement1906);
				statement135 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement135.getTree());

				// AST REWRITE
				// elements: IDENTIFIER, statement, COLON
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 193:36: -> ^( COLON IDENTIFIER statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:193:39:
						// ^( COLON IDENTIFIER statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_COLON
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 16:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:194:9:
				// SEMI
			{
				root_0 = (Object) adaptor.nil();

				SEMI136 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1926);
				if (state.failed)
					return retval;

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 31, statement_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "statement"

	public static class parExpression_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "parExpression"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:197:1:
	// parExpression : LPAREN expr RPAREN ;
	public final TinyHaxeTry1Parser.parExpression_return parExpression()
			throws RecognitionException {
		TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
		retval.start = input.LT(1);
		int parExpression_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN137 = null;
		Token RPAREN139 = null;
		TinyHaxeTry1Parser.expr_return expr138 = null;

		Object LPAREN137_tree = null;
		Object RPAREN139_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 32)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:198:5:
			// ( LPAREN expr RPAREN )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:198:9:
			// LPAREN expr RPAREN
			{
				root_0 = (Object) adaptor.nil();

				LPAREN137 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_parExpression1951);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_expr_in_parExpression1954);
				expr138 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr138.getTree());
				RPAREN139 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_parExpression1956);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 32, parExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "parExpression"

	public static class block_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "block"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:1:
	// block : ( LBRACE ( blockStmt )* RBRACE -> ^(
	// BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI );
	public final TinyHaxeTry1Parser.block_return block()
			throws RecognitionException {
		TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();
		Object root_0 = null;

		Token LBRACE140 = null;
		Token RBRACE142 = null;
		Token SEMI143 = null;
		TinyHaxeTry1Parser.blockStmt_return blockStmt141 = null;

		Object LBRACE140_tree = null;
		Object RBRACE142_tree = null;
		Object SEMI143_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_blockStmt = new RewriteRuleSubtreeStream(
				adaptor, "rule blockStmt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 33)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:15:
			// ( LBRACE ( blockStmt )* RBRACE -> ^(
			// BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* ) | SEMI )
			int alt31 = 2;
			int LA31_0 = input.LA(1);

			if ((LA31_0 == LBRACE)) {
				alt31 = 1;
			} else if ((LA31_0 == SEMI)) {
				alt31 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 31, 0,
						input);

				throw nvae;
			}
			switch (alt31) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:17:
				// LBRACE ( blockStmt )* RBRACE
			{
				LBRACE140 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_block1978);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE140);

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:24:
				// ( blockStmt )*
				loop30: do {
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if (((LA30_0 >= SEMI && LA30_0 <= IDENTIFIER)
							|| (LA30_0 >= PUBLIC && LA30_0 <= OVERRIDE)
							|| (LA30_0 >= QUES && LA30_0 <= LPAREN)
							|| LA30_0 == LBRACKET || LA30_0 == BANG
							|| (LA30_0 >= GT && LA30_0 <= IF) || LA30_0 == FOR
							|| (LA30_0 >= WHILE && LA30_0 <= LBRACE)
							|| (LA30_0 >= RETURN && LA30_0 <= CONTINUE)
							|| (LA30_0 >= ELLIPSIS && LA30_0 <= CAST)
							|| (LA30_0 >= VAR && LA30_0 <= CLASS) || (LA30_0 >= LONGLITERAL && LA30_0 <= FALSE))) {
						alt30 = 1;
					}

					switch (alt30) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:25:
						// blockStmt
					{
						pushFollow(FOLLOW_blockStmt_in_block1981);
						blockStmt141 = blockStmt();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_blockStmt.add(blockStmt141.getTree());

					}
						break;

					default:
						break loop30;
					}
				} while (true);

				RBRACE142 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_block1985);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE142);

				// AST REWRITE
				// elements: blockStmt
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 201:44: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] (
					// blockStmt )* )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:46:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( blockStmt )* )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:201:96:
							// ( blockStmt )*
							while (stream_blockStmt.hasNext()) {
								adaptor.addChild(root_1, stream_blockStmt
										.nextTree());

							}
							stream_blockStmt.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:202:4:
				// SEMI
			{
				root_0 = (Object) adaptor.nil();

				SEMI143 = (Token) match(input, SEMI, FOLLOW_SEMI_in_block2003);
				if (state.failed)
					return retval;

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 33, block_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "block"

	public static class blockStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "blockStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:205:1:
	// blockStmt : ( varDecl | classDecl | statement );
	public final TinyHaxeTry1Parser.blockStmt_return blockStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
		retval.start = input.LT(1);
		int blockStmt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl144 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl145 = null;

		TinyHaxeTry1Parser.statement_return statement146 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 34)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:2:
			// ( varDecl | classDecl | statement )
			int alt32 = 3;
			alt32 = dfa32.predict(input);
			switch (alt32) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:4:
				// varDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_blockStmt2016);
				varDecl144 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl144.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:207:4:
				// classDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_classDecl_in_blockStmt2021);
				classDecl145 = classDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classDecl145.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:208:4:
				// statement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_statement_in_blockStmt2026);
				statement146 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, statement146.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 34, blockStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "blockStmt"

	public static class breakStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "breakStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:1:
	// breakStmt : BREAK SEMI ;
	public final TinyHaxeTry1Parser.breakStmt_return breakStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
		retval.start = input.LT(1);
		int breakStmt_StartIndex = input.index();
		Object root_0 = null;

		Token BREAK147 = null;
		Token SEMI148 = null;

		Object BREAK147_tree = null;
		Object SEMI148_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 35)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:19:
			// ( BREAK SEMI )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:212:21:
			// BREAK SEMI
			{
				root_0 = (Object) adaptor.nil();

				BREAK147 = (Token) match(input, BREAK,
						FOLLOW_BREAK_in_breakStmt2057);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BREAK147_tree = (Object) adaptor.create(BREAK147);
					adaptor.addChild(root_0, BREAK147_tree);
				}
				SEMI148 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_breakStmt2059);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 35, breakStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "breakStmt"

	public static class continueStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "continueStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:1:
	// continueStmt : CONTINUE SEMI ;
	public final TinyHaxeTry1Parser.continueStmt_return continueStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
		retval.start = input.LT(1);
		int continueStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CONTINUE149 = null;
		Token SEMI150 = null;

		Object CONTINUE149_tree = null;
		Object SEMI150_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 36)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:19:
			// ( CONTINUE SEMI )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:214:21:
			// CONTINUE SEMI
			{
				root_0 = (Object) adaptor.nil();

				CONTINUE149 = (Token) match(input, CONTINUE,
						FOLLOW_CONTINUE_in_continueStmt2074);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					CONTINUE149_tree = (Object) adaptor.create(CONTINUE149);
					adaptor.addChild(root_0, CONTINUE149_tree);
				}
				SEMI150 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_continueStmt2076);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 36, continueStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "continueStmt"

	public static class caseStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "caseStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:1:
	// caseStmt : ( CASE exprList COLON statement -> ^( CASE exprList statement
	// ) | DEFAULT COLON statement -> ^( DEFAULT statement ) );
	public final TinyHaxeTry1Parser.caseStmt_return caseStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
		retval.start = input.LT(1);
		int caseStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CASE151 = null;
		Token COLON153 = null;
		Token DEFAULT155 = null;
		Token COLON156 = null;
		TinyHaxeTry1Parser.exprList_return exprList152 = null;

		TinyHaxeTry1Parser.statement_return statement154 = null;

		TinyHaxeTry1Parser.statement_return statement157 = null;

		Object CASE151_tree = null;
		Object COLON153_tree = null;
		Object DEFAULT155_tree = null;
		Object COLON156_tree = null;
		RewriteRuleTokenStream stream_COLON = new RewriteRuleTokenStream(
				adaptor, "token COLON");
		RewriteRuleTokenStream stream_DEFAULT = new RewriteRuleTokenStream(
				adaptor, "token DEFAULT");
		RewriteRuleTokenStream stream_CASE = new RewriteRuleTokenStream(
				adaptor, "token CASE");
		RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
				adaptor, "rule statement");
		RewriteRuleSubtreeStream stream_exprList = new RewriteRuleSubtreeStream(
				adaptor, "rule exprList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 37)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:9:
			// ( CASE exprList COLON statement -> ^( CASE exprList statement ) |
			// DEFAULT COLON statement -> ^( DEFAULT statement ) )
			int alt33 = 2;
			int LA33_0 = input.LA(1);

			if ((LA33_0 == CASE)) {
				alt33 = 1;
			} else if ((LA33_0 == DEFAULT)) {
				alt33 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 33, 0,
						input);

				throw nvae;
			}
			switch (alt33) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:11:
				// CASE exprList COLON statement
			{
				CASE151 = (Token) match(input, CASE,
						FOLLOW_CASE_in_caseStmt2087);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CASE.add(CASE151);

				pushFollow(FOLLOW_exprList_in_caseStmt2089);
				exprList152 = exprList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprList.add(exprList152.getTree());
				COLON153 = (Token) match(input, COLON,
						FOLLOW_COLON_in_caseStmt2091);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON153);

				pushFollow(FOLLOW_statement_in_caseStmt2093);
				statement154 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement154.getTree());

				// AST REWRITE
				// elements: exprList, CASE, statement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 217:41: -> ^( CASE exprList statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:217:44:
						// ^( CASE exprList statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CASE
									.nextNode(), root_1);

							adaptor
									.addChild(root_1, stream_exprList
											.nextTree());
							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:4:
				// DEFAULT COLON statement
			{
				DEFAULT155 = (Token) match(input, DEFAULT,
						FOLLOW_DEFAULT_in_caseStmt2108);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_DEFAULT.add(DEFAULT155);

				COLON156 = (Token) match(input, COLON,
						FOLLOW_COLON_in_caseStmt2110);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON156);

				pushFollow(FOLLOW_statement_in_caseStmt2112);
				statement157 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement157.getTree());

				// AST REWRITE
				// elements: DEFAULT, statement
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 218:28: -> ^( DEFAULT statement )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:218:30:
						// ^( DEFAULT statement )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_DEFAULT
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_statement
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 37, caseStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "caseStmt"

	public static class defaultStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "defaultStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:1:
	// defaultStmt : DEFAULT COLON ;
	public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
		retval.start = input.LT(1);
		int defaultStmt_StartIndex = input.index();
		Object root_0 = null;

		Token DEFAULT158 = null;
		Token COLON159 = null;

		Object DEFAULT158_tree = null;
		Object COLON159_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 38)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:19:
			// ( DEFAULT COLON )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:221:21:
			// DEFAULT COLON
			{
				root_0 = (Object) adaptor.nil();

				DEFAULT158 = (Token) match(input, DEFAULT,
						FOLLOW_DEFAULT_in_defaultStmt2136);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					DEFAULT158_tree = (Object) adaptor.create(DEFAULT158);
					adaptor.addChild(root_0, DEFAULT158_tree);
				}
				COLON159 = (Token) match(input, COLON,
						FOLLOW_COLON_in_defaultStmt2138);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 38, defaultStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "defaultStmt"

	public static class catchStmtList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "catchStmtList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:223:1:
	// catchStmtList : ( catchStmt catchStmtList | );
	public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
		retval.start = input.LT(1);
		int catchStmtList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.catchStmt_return catchStmt160 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList161 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 39)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:223:19:
			// ( catchStmt catchStmtList | )
			int alt34 = 2;
			int LA34_0 = input.LA(1);

			if ((LA34_0 == CATCH)) {
				alt34 = 1;
			} else if ((LA34_0 == EOF
					|| (LA34_0 >= SEMI && LA34_0 <= IDENTIFIER)
					|| (LA34_0 >= PUBLIC && LA34_0 <= RBRACKET)
					|| LA34_0 == BANG || LA34_0 == COLON
					|| (LA34_0 >= GT && LA34_0 <= DEFAULT)
					|| (LA34_0 >= ELLIPSIS && LA34_0 <= CAST)
					|| (LA34_0 >= VAR && LA34_0 <= CLASS)
					|| (LA34_0 >= EXTENDS && LA34_0 <= IMPLEMENTS) || (LA34_0 >= LONGLITERAL && LA34_0 <= FALSE))) {
				alt34 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 34, 0,
						input);

				throw nvae;
			}
			switch (alt34) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:223:21:
				// catchStmt catchStmtList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_catchStmt_in_catchStmtList2152);
				catchStmt160 = catchStmt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, catchStmt160.getTree());
				pushFollow(FOLLOW_catchStmtList_in_catchStmtList2154);
				catchStmtList161 = catchStmtList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, catchStmtList161.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:225:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 39, catchStmtList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "catchStmtList"

	public static class catchStmt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "catchStmt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:1:
	// catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH param block ) ;
	public final TinyHaxeTry1Parser.catchStmt_return catchStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
		retval.start = input.LT(1);
		int catchStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CATCH162 = null;
		Token LPAREN163 = null;
		Token RPAREN165 = null;
		TinyHaxeTry1Parser.param_return param164 = null;

		TinyHaxeTry1Parser.block_return block166 = null;

		Object CATCH162_tree = null;
		Object LPAREN163_tree = null;
		Object RPAREN165_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_CATCH = new RewriteRuleTokenStream(
				adaptor, "token CATCH");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_param = new RewriteRuleSubtreeStream(
				adaptor, "rule param");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				adaptor, "rule block");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 40)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:19:
			// ( CATCH LPAREN param RPAREN block -> ^( CATCH param block ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:21:
			// CATCH LPAREN param RPAREN block
			{
				CATCH162 = (Token) match(input, CATCH,
						FOLLOW_CATCH_in_catchStmt2193);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CATCH.add(CATCH162);

				LPAREN163 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_catchStmt2195);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN163);

				pushFollow(FOLLOW_param_in_catchStmt2197);
				param164 = param();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_param.add(param164.getTree());
				RPAREN165 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_catchStmt2199);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN165);

				pushFollow(FOLLOW_block_in_catchStmt2201);
				block166 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block166.getTree());

				// AST REWRITE
				// elements: CATCH, param, block
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 226:53: -> ^( CATCH param block )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:226:56:
						// ^( CATCH param block )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CATCH
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_param.nextTree());
							adaptor.addChild(root_1, stream_block.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 40, catchStmt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "catchStmt"

	public static class exprListOpt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "exprListOpt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:1:
	// exprListOpt : ( exprList | );
	public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
		retval.start = input.LT(1);
		int exprListOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.exprList_return exprList167 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 41)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:19:
			// ( exprList | )
			int alt35 = 2;
			switch (input.LA(1)) {
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
			case BANG:
			case GT:
			case LT:
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
			case GTGT:
			case GTGTGT:
			case PLUS:
			case SUB:
			case STAR:
			case SLASH:
			case PERCENT:
			case SUBSUB:
			case PLUSPLUS:
			case TILDE:
			case NULL:
			case NEW:
			case CAST:
			case LONGLITERAL:
			case INTLITERAL:
			case STRINGLITERAL:
			case CHARLITERAL:
			case FLOATNUM:
			case TRUE:
			case FALSE: {
				alt35 = 1;
			}
				break;
			case RBRACKET: {
				int LA35_2 = input.LA(2);

				if ((synpred62_TinyHaxeTry1())) {
					alt35 = 1;
				} else if ((true)) {
					alt35 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							35, 2, input);

					throw nvae;
				}
			}
				break;
			case RPAREN: {
				int LA35_3 = input.LA(2);

				if ((synpred62_TinyHaxeTry1())) {
					alt35 = 1;
				} else if ((true)) {
					alt35 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							35, 3, input);

					throw nvae;
				}
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 35, 0,
						input);

				throw nvae;
			}

			switch (alt35) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:21:
				// exprList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_exprList_in_exprListOpt2228);
				exprList167 = exprList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, exprList167.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:232:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 41, exprListOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "exprListOpt"

	public static class exprList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "exprList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:1:
	// exprList : expr ( COMMA expr )* ;
	public final TinyHaxeTry1Parser.exprList_return exprList()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
		retval.start = input.LT(1);
		int exprList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA169 = null;
		TinyHaxeTry1Parser.expr_return expr168 = null;

		TinyHaxeTry1Parser.expr_return expr170 = null;

		Object COMMA169_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 42)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:19:
			// ( expr ( COMMA expr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:21:
			// expr ( COMMA expr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expr_in_exprList2268);
				expr168 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr168.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:26:
				// ( COMMA expr )*
				loop36: do {
					int alt36 = 2;
					int LA36_0 = input.LA(1);

					if ((LA36_0 == COMMA)) {
						alt36 = 1;
					}

					switch (alt36) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:233:27:
						// COMMA expr
					{
						COMMA169 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_exprList2271);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_expr_in_exprList2274);
						expr170 = expr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, expr170.getTree());

					}
						break;

					default:
						break loop36;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 42, exprList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "exprList"

	public static class expr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "expr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:1:
	// expr : assignExpr ;
	public final TinyHaxeTry1Parser.expr_return expr()
			throws RecognitionException {
		TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr171 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 43)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:19:
			// ( assignExpr )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:235:21:
			// assignExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_assignExpr_in_expr2298);
				assignExpr171 = assignExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, assignExpr171.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 43, expr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "expr"

	public static class assignExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "assignExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:1:
	// assignExpr : iterExpr ( assignOp iterExpr )* ;
	public final TinyHaxeTry1Parser.assignExpr_return assignExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
		retval.start = input.LT(1);
		int assignExpr_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr172 = null;

		TinyHaxeTry1Parser.assignOp_return assignOp173 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr174 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 44)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:19:
			// ( iterExpr ( assignOp iterExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:21:
			// iterExpr ( assignOp iterExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_iterExpr_in_assignExpr2314);
				iterExpr172 = iterExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, iterExpr172.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:30:
				// ( assignOp iterExpr )*
				loop37: do {
					int alt37 = 2;
					int LA37_0 = input.LA(1);

					if (((LA37_0 >= EQ && LA37_0 <= AMPEQ))) {
						alt37 = 1;
					}

					switch (alt37) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:237:31:
						// assignOp iterExpr
					{
						pushFollow(FOLLOW_assignOp_in_assignExpr2317);
						assignOp173 = assignOp();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							root_0 = (Object) adaptor.becomeRoot(assignOp173
									.getTree(), root_0);
						pushFollow(FOLLOW_iterExpr_in_assignExpr2320);
						iterExpr174 = iterExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, iterExpr174.getTree());

					}
						break;

					default:
						break loop37;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 44, assignExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "assignExpr"

	public static class iterExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "iterExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:1:
	// iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
	public final TinyHaxeTry1Parser.iterExpr_return iterExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
		retval.start = input.LT(1);
		int iterExpr_StartIndex = input.index();
		Object root_0 = null;

		Token ELLIPSIS176 = null;
		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr175 = null;

		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr177 = null;

		Object ELLIPSIS176_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 45)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:19:
			// ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:21:
			// ternaryExpr ( ELLIPSIS ternaryExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ternaryExpr_in_iterExpr2341);
				ternaryExpr175 = ternaryExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ternaryExpr175.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:33:
				// ( ELLIPSIS ternaryExpr )*
				loop38: do {
					int alt38 = 2;
					int LA38_0 = input.LA(1);

					if ((LA38_0 == ELLIPSIS)) {
						alt38 = 1;
					}

					switch (alt38) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:239:34:
						// ELLIPSIS ternaryExpr
					{
						ELLIPSIS176 = (Token) match(input, ELLIPSIS,
								FOLLOW_ELLIPSIS_in_iterExpr2344);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							ELLIPSIS176_tree = (Object) adaptor
									.create(ELLIPSIS176);
							root_0 = (Object) adaptor.becomeRoot(
									ELLIPSIS176_tree, root_0);
						}
						pushFollow(FOLLOW_ternaryExpr_in_iterExpr2347);
						ternaryExpr177 = ternaryExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, ternaryExpr177.getTree());

					}
						break;

					default:
						break loop38;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 45, iterExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "iterExpr"

	public static class ternaryExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ternaryExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:1:
	// ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
	public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
		retval.start = input.LT(1);
		int ternaryExpr_StartIndex = input.index();
		Object root_0 = null;

		Token QUES179 = null;
		Token COLON181 = null;
		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr178 = null;

		TinyHaxeTry1Parser.expr_return expr180 = null;

		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr182 = null;

		Object QUES179_tree = null;
		Object COLON181_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 46)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:19:
			// ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:21:
			// logicOrExpr ( QUES expr COLON logicOrExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2370);
				logicOrExpr178 = logicOrExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, logicOrExpr178.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:33:
				// ( QUES expr COLON logicOrExpr )*
				loop39: do {
					int alt39 = 2;
					int LA39_0 = input.LA(1);

					if ((LA39_0 == QUES)) {
						alt39 = 1;
					}

					switch (alt39) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:241:34:
						// QUES expr COLON logicOrExpr
					{
						QUES179 = (Token) match(input, QUES,
								FOLLOW_QUES_in_ternaryExpr2373);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							QUES179_tree = (Object) adaptor.create(QUES179);
							root_0 = (Object) adaptor.becomeRoot(QUES179_tree,
									root_0);
						}
						pushFollow(FOLLOW_expr_in_ternaryExpr2376);
						expr180 = expr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, expr180.getTree());
						COLON181 = (Token) match(input, COLON,
								FOLLOW_COLON_in_ternaryExpr2378);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2381);
						logicOrExpr182 = logicOrExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, logicOrExpr182.getTree());

					}
						break;

					default:
						break loop39;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 46, ternaryExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ternaryExpr"

	public static class logicOrExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "logicOrExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:1:
	// logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
	public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
		retval.start = input.LT(1);
		int logicOrExpr_StartIndex = input.index();
		Object root_0 = null;

		Token BARBAR184 = null;
		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr183 = null;

		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr185 = null;

		Object BARBAR184_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 47)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:19:
			// ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:21:
			// ( logicAndExpr ) ( BARBAR logicAndExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:21:
				// ( logicAndExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:22:
				// logicAndExpr
				{
					pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2399);
					logicAndExpr183 = logicAndExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, logicAndExpr183.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:36:
				// ( BARBAR logicAndExpr )*
				loop40: do {
					int alt40 = 2;
					int LA40_0 = input.LA(1);

					if ((LA40_0 == BARBAR)) {
						alt40 = 1;
					}

					switch (alt40) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:243:37:
						// BARBAR logicAndExpr
					{
						BARBAR184 = (Token) match(input, BARBAR,
								FOLLOW_BARBAR_in_logicOrExpr2403);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							BARBAR184_tree = (Object) adaptor.create(BARBAR184);
							root_0 = (Object) adaptor.becomeRoot(
									BARBAR184_tree, root_0);
						}
						pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2406);
						logicAndExpr185 = logicAndExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, logicAndExpr185.getTree());

					}
						break;

					default:
						break loop40;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 47, logicOrExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "logicOrExpr"

	public static class logicAndExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "logicAndExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:1:
	// logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
	public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
		retval.start = input.LT(1);
		int logicAndExpr_StartIndex = input.index();
		Object root_0 = null;

		Token AMPAMP187 = null;
		TinyHaxeTry1Parser.cmpExpr_return cmpExpr186 = null;

		TinyHaxeTry1Parser.cmpExpr_return cmpExpr188 = null;

		Object AMPAMP187_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 48)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:19:
			// ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:21:
			// ( cmpExpr ) ( AMPAMP cmpExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:21:
				// ( cmpExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:22:
				// cmpExpr
				{
					pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2423);
					cmpExpr186 = cmpExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, cmpExpr186.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:31:
				// ( AMPAMP cmpExpr )*
				loop41: do {
					int alt41 = 2;
					int LA41_0 = input.LA(1);

					if ((LA41_0 == AMPAMP)) {
						alt41 = 1;
					}

					switch (alt41) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:245:32:
						// AMPAMP cmpExpr
					{
						AMPAMP187 = (Token) match(input, AMPAMP,
								FOLLOW_AMPAMP_in_logicAndExpr2427);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							AMPAMP187_tree = (Object) adaptor.create(AMPAMP187);
							root_0 = (Object) adaptor.becomeRoot(
									AMPAMP187_tree, root_0);
						}
						pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2430);
						cmpExpr188 = cmpExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, cmpExpr188.getTree());

					}
						break;

					default:
						break loop41;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 48, logicAndExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "logicAndExpr"

	public static class cmpExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "cmpExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:1:
	// cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
	// )* ;
	public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
		retval.start = input.LT(1);
		int cmpExpr_StartIndex = input.index();
		Object root_0 = null;

		Token EQEQ190 = null;
		Token BANGEQ191 = null;
		Token GTEQ192 = null;
		Token LTEQ193 = null;
		Token GT194 = null;
		Token LT195 = null;
		TinyHaxeTry1Parser.bitExpr_return bitExpr189 = null;

		TinyHaxeTry1Parser.bitExpr_return bitExpr196 = null;

		Object EQEQ190_tree = null;
		Object BANGEQ191_tree = null;
		Object GTEQ192_tree = null;
		Object LTEQ193_tree = null;
		Object GT194_tree = null;
		Object LT195_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 49)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:19:
			// ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:21:
			// ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:21:
				// ( bitExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:22:
				// bitExpr
				{
					pushFollow(FOLLOW_bitExpr_in_cmpExpr2452);
					bitExpr189 = bitExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, bitExpr189.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:31:
				// ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
				loop43: do {
					int alt43 = 2;
					int LA43_0 = input.LA(1);

					if (((LA43_0 >= GT && LA43_0 <= LT) || (LA43_0 >= EQEQ && LA43_0 <= LTEQ))) {
						alt43 = 1;
					}

					switch (alt43) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:32:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:32:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
						int alt42 = 6;
						switch (input.LA(1)) {
						case EQEQ: {
							alt42 = 1;
						}
							break;
						case BANGEQ: {
							alt42 = 2;
						}
							break;
						case GTEQ: {
							alt42 = 3;
						}
							break;
						case LTEQ: {
							alt42 = 4;
						}
							break;
						case GT: {
							alt42 = 5;
						}
							break;
						case LT: {
							alt42 = 6;
						}
							break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 42, 0, input);

							throw nvae;
						}

						switch (alt42) {
						case 1:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:33:
							// EQEQ
						{
							EQEQ190 = (Token) match(input, EQEQ,
									FOLLOW_EQEQ_in_cmpExpr2457);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								EQEQ190_tree = (Object) adaptor.create(EQEQ190);
								root_0 = (Object) adaptor.becomeRoot(
										EQEQ190_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:40:
							// BANGEQ
						{
							BANGEQ191 = (Token) match(input, BANGEQ,
									FOLLOW_BANGEQ_in_cmpExpr2461);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								BANGEQ191_tree = (Object) adaptor
										.create(BANGEQ191);
								root_0 = (Object) adaptor.becomeRoot(
										BANGEQ191_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:50:
							// GTEQ
						{
							GTEQ192 = (Token) match(input, GTEQ,
									FOLLOW_GTEQ_in_cmpExpr2466);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GTEQ192_tree = (Object) adaptor.create(GTEQ192);
								root_0 = (Object) adaptor.becomeRoot(
										GTEQ192_tree, root_0);
							}

						}
							break;
						case 4:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:58:
							// LTEQ
						{
							LTEQ193 = (Token) match(input, LTEQ,
									FOLLOW_LTEQ_in_cmpExpr2471);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								LTEQ193_tree = (Object) adaptor.create(LTEQ193);
								root_0 = (Object) adaptor.becomeRoot(
										LTEQ193_tree, root_0);
							}

						}
							break;
						case 5:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:66:
							// GT
						{
							GT194 = (Token) match(input, GT,
									FOLLOW_GT_in_cmpExpr2476);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GT194_tree = (Object) adaptor.create(GT194);
								root_0 = (Object) adaptor.becomeRoot(
										GT194_tree, root_0);
							}

						}
							break;
						case 6:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:247:72:
							// LT
						{
							LT195 = (Token) match(input, LT,
									FOLLOW_LT_in_cmpExpr2481);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								LT195_tree = (Object) adaptor.create(LT195);
								root_0 = (Object) adaptor.becomeRoot(
										LT195_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_bitExpr_in_cmpExpr2486);
						bitExpr196 = bitExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, bitExpr196.getTree());

					}
						break;

					default:
						break loop43;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 49, cmpExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "cmpExpr"

	public static class bitExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "bitExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:1:
	// bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
	// )* ;
	public final TinyHaxeTry1Parser.bitExpr_return bitExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
		retval.start = input.LT(1);
		int bitExpr_StartIndex = input.index();
		Object root_0 = null;

		Token BAR198 = null;
		Token AMP200 = null;
		Token CARET202 = null;
		TinyHaxeTry1Parser.shiftExpr_return shiftExpr197 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr199 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr201 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr203 = null;

		Object BAR198_tree = null;
		Object AMP200_tree = null;
		Object CARET202_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 50)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:19:
			// ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:21:
			// ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:21:
				// ( shiftExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:22:
				// shiftExpr
				{
					pushFollow(FOLLOW_shiftExpr_in_bitExpr2508);
					shiftExpr197 = shiftExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, shiftExpr197.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:33:
				// ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
				loop44: do {
					int alt44 = 4;
					switch (input.LA(1)) {
					case BAR: {
						alt44 = 1;
					}
						break;
					case AMP: {
						alt44 = 2;
					}
						break;
					case CARET: {
						alt44 = 3;
					}
						break;

					}

					switch (alt44) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:34:
						// BAR shiftExpr
					{
						BAR198 = (Token) match(input, BAR,
								FOLLOW_BAR_in_bitExpr2512);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							BAR198_tree = (Object) adaptor.create(BAR198);
							root_0 = (Object) adaptor.becomeRoot(BAR198_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2515);
						shiftExpr199 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr199.getTree());

					}
						break;
					case 2:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:51:
						// AMP shiftExpr
					{
						AMP200 = (Token) match(input, AMP,
								FOLLOW_AMP_in_bitExpr2519);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							AMP200_tree = (Object) adaptor.create(AMP200);
							root_0 = (Object) adaptor.becomeRoot(AMP200_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2522);
						shiftExpr201 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr201.getTree());

					}
						break;
					case 3:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:249:67:
						// CARET shiftExpr
					{
						CARET202 = (Token) match(input, CARET,
								FOLLOW_CARET_in_bitExpr2525);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							CARET202_tree = (Object) adaptor.create(CARET202);
							root_0 = (Object) adaptor.becomeRoot(CARET202_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2528);
						shiftExpr203 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr203.getTree());

					}
						break;

					default:
						break loop44;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 50, bitExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "bitExpr"

	public static class shiftExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "shiftExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:1:
	// shiftExpr : ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
	// ;
	public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
		retval.start = input.LT(1);
		int shiftExpr_StartIndex = input.index();
		Object root_0 = null;

		Token LTLT205 = null;
		Token GTGT207 = null;
		Token GTGTGT209 = null;
		TinyHaxeTry1Parser.addExpr_return addExpr204 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr206 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr208 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr210 = null;

		Object LTLT205_tree = null;
		Object GTGT207_tree = null;
		Object GTGTGT209_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 51)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:19:
			// ( ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:21:
			// ( addExpr ) ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:21:
				// ( addExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:22:
				// addExpr
				{
					pushFollow(FOLLOW_addExpr_in_shiftExpr2549);
					addExpr204 = addExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, addExpr204.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:31:
				// ( LTLT addExpr | GTGT addExpr | GTGTGT addExpr )*
				loop45: do {
					int alt45 = 4;
					switch (input.LA(1)) {
					case LTLT: {
						alt45 = 1;
					}
						break;
					case GTGT: {
						alt45 = 2;
					}
						break;
					case GTGTGT: {
						alt45 = 3;
					}
						break;

					}

					switch (alt45) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:32:
						// LTLT addExpr
					{
						LTLT205 = (Token) match(input, LTLT,
								FOLLOW_LTLT_in_shiftExpr2553);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							LTLT205_tree = (Object) adaptor.create(LTLT205);
							root_0 = (Object) adaptor.becomeRoot(LTLT205_tree,
									root_0);
						}
						pushFollow(FOLLOW_addExpr_in_shiftExpr2557);
						addExpr206 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr206.getTree());

					}
						break;
					case 2:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:49:
						// GTGT addExpr
					{
						GTGT207 = (Token) match(input, GTGT,
								FOLLOW_GTGT_in_shiftExpr2561);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							GTGT207_tree = (Object) adaptor.create(GTGT207);
							root_0 = (Object) adaptor.becomeRoot(GTGT207_tree,
									root_0);
						}
						pushFollow(FOLLOW_addExpr_in_shiftExpr2565);
						addExpr208 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr208.getTree());

					}
						break;
					case 3:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:252:66:
						// GTGTGT addExpr
					{
						GTGTGT209 = (Token) match(input, GTGTGT,
								FOLLOW_GTGTGT_in_shiftExpr2569);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							GTGTGT209_tree = (Object) adaptor.create(GTGTGT209);
							root_0 = (Object) adaptor.becomeRoot(
									GTGTGT209_tree, root_0);
						}
						pushFollow(FOLLOW_addExpr_in_shiftExpr2572);
						addExpr210 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr210.getTree());

					}
						break;

					default:
						break loop45;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 51, shiftExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "shiftExpr"

	public static class addExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "addExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:1:
	// addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
	public final TinyHaxeTry1Parser.addExpr_return addExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
		retval.start = input.LT(1);
		int addExpr_StartIndex = input.index();
		Object root_0 = null;

		Token PLUS212 = null;
		Token SUB213 = null;
		TinyHaxeTry1Parser.multExpr_return multExpr211 = null;

		TinyHaxeTry1Parser.multExpr_return multExpr214 = null;

		Object PLUS212_tree = null;
		Object SUB213_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 52)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:19:
			// ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:21:
			// ( multExpr ) ( ( PLUS | SUB ) multExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:21:
				// ( multExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:22:
				// multExpr
				{
					pushFollow(FOLLOW_multExpr_in_addExpr2595);
					multExpr211 = multExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, multExpr211.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:32:
				// ( ( PLUS | SUB ) multExpr )*
				loop47: do {
					int alt47 = 2;
					int LA47_0 = input.LA(1);

					if (((LA47_0 >= PLUS && LA47_0 <= SUB))) {
						alt47 = 1;
					}

					switch (alt47) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:33:
						// ( PLUS | SUB ) multExpr
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:33:
						// ( PLUS | SUB )
						int alt46 = 2;
						int LA46_0 = input.LA(1);

						if ((LA46_0 == PLUS)) {
							alt46 = 1;
						} else if ((LA46_0 == SUB)) {
							alt46 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 46, 0, input);

							throw nvae;
						}
						switch (alt46) {
						case 1:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:34:
							// PLUS
						{
							PLUS212 = (Token) match(input, PLUS,
									FOLLOW_PLUS_in_addExpr2600);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								PLUS212_tree = (Object) adaptor.create(PLUS212);
								root_0 = (Object) adaptor.becomeRoot(
										PLUS212_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:255:42:
							// SUB
						{
							SUB213 = (Token) match(input, SUB,
									FOLLOW_SUB_in_addExpr2605);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								SUB213_tree = (Object) adaptor.create(SUB213);
								root_0 = (Object) adaptor.becomeRoot(
										SUB213_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_multExpr_in_addExpr2609);
						multExpr214 = multExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, multExpr214.getTree());

					}
						break;

					default:
						break loop47;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 52, addExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "addExpr"

	public static class multExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "multExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:1:
	// multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
	public final TinyHaxeTry1Parser.multExpr_return multExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
		retval.start = input.LT(1);
		int multExpr_StartIndex = input.index();
		Object root_0 = null;

		Token STAR216 = null;
		Token SLASH217 = null;
		Token PERCENT218 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr215 = null;

		TinyHaxeTry1Parser.prefixExpr_return prefixExpr219 = null;

		Object STAR216_tree = null;
		Object SLASH217_tree = null;
		Object PERCENT218_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 53)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:19:
			// ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:21:
			// ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:21:
				// ( prefixExpr )
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:22:
				// prefixExpr
				{
					pushFollow(FOLLOW_prefixExpr_in_multExpr2631);
					prefixExpr215 = prefixExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, prefixExpr215.getTree());

				}

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:34:
				// ( ( STAR | SLASH | PERCENT ) prefixExpr )*
				loop49: do {
					int alt49 = 2;
					int LA49_0 = input.LA(1);

					if (((LA49_0 >= STAR && LA49_0 <= PERCENT))) {
						alt49 = 1;
					}

					switch (alt49) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:35:
						// ( STAR | SLASH | PERCENT ) prefixExpr
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:35:
						// ( STAR | SLASH | PERCENT )
						int alt48 = 3;
						switch (input.LA(1)) {
						case STAR: {
							alt48 = 1;
						}
							break;
						case SLASH: {
							alt48 = 2;
						}
							break;
						case PERCENT: {
							alt48 = 3;
						}
							break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 48, 0, input);

							throw nvae;
						}

						switch (alt48) {
						case 1:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:36:
							// STAR
						{
							STAR216 = (Token) match(input, STAR,
									FOLLOW_STAR_in_multExpr2636);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								STAR216_tree = (Object) adaptor.create(STAR216);
								root_0 = (Object) adaptor.becomeRoot(
										STAR216_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:42:
							// SLASH
						{
							SLASH217 = (Token) match(input, SLASH,
									FOLLOW_SLASH_in_multExpr2639);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								SLASH217_tree = (Object) adaptor
										.create(SLASH217);
								root_0 = (Object) adaptor.becomeRoot(
										SLASH217_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:257:49:
							// PERCENT
						{
							PERCENT218 = (Token) match(input, PERCENT,
									FOLLOW_PERCENT_in_multExpr2642);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								PERCENT218_tree = (Object) adaptor
										.create(PERCENT218);
								root_0 = (Object) adaptor.becomeRoot(
										PERCENT218_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_prefixExpr_in_multExpr2646);
						prefixExpr219 = prefixExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, prefixExpr219.getTree());

					}
						break;

					default:
						break loop49;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 53, multExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "multExpr"

	public static class prefixExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "prefixExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:1:
	// prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr |
	// newExpr | cast | suffixExpr );
	public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
		retval.start = input.LT(1);
		int prefixExpr_StartIndex = input.index();
		Object root_0 = null;

		Token set220 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr221 = null;

		TinyHaxeTry1Parser.newExpr_return newExpr222 = null;

		TinyHaxeTry1Parser.cast_return cast223 = null;

		TinyHaxeTry1Parser.suffixExpr_return suffixExpr224 = null;

		Object set220_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 54)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:19:
			// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr
			// | cast | suffixExpr )
			int alt50 = 4;
			switch (input.LA(1)) {
			case PLUSPLUS: {
				int LA50_1 = input.LA(2);

				if ((synpred90_TinyHaxeTry1())) {
					alt50 = 1;
				} else if ((true)) {
					alt50 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							50, 1, input);

					throw nvae;
				}
			}
				break;
			case NEW: {
				alt50 = 2;
			}
				break;
			case CAST: {
				alt50 = 3;
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
			case GT:
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
			case GTGT:
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
				alt50 = 4;
			}
				break;
			case SUBSUB: {
				int LA50_5 = input.LA(2);

				if ((synpred90_TinyHaxeTry1())) {
					alt50 = 1;
				} else if ((true)) {
					alt50 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							50, 5, input);

					throw nvae;
				}
			}
				break;
			case SUB: {
				int LA50_6 = input.LA(2);

				if ((synpred90_TinyHaxeTry1())) {
					alt50 = 1;
				} else if ((true)) {
					alt50 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							50, 6, input);

					throw nvae;
				}
			}
				break;
			case BANG:
			case TILDE: {
				alt50 = 1;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 50, 0,
						input);

				throw nvae;
			}

			switch (alt50) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:21:
				// ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
			{
				root_0 = (Object) adaptor.nil();

				set220 = (Token) input.LT(1);
				if (input.LA(1) == BANG || input.LA(1) == SUB
						|| (input.LA(1) >= SUBSUB && input.LA(1) <= TILDE)) {
					input.consume();
					if (state.backtracking == 0)
						adaptor.addChild(root_0, (Object) adaptor
								.create(set220));
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					throw mse;
				}

				pushFollow(FOLLOW_prefixExpr_in_prefixExpr2676);
				prefixExpr221 = prefixExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, prefixExpr221.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:260:25:
				// newExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_newExpr_in_prefixExpr2702);
				newExpr222 = newExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, newExpr222.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:261:25:
				// cast
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_cast_in_prefixExpr2728);
				cast223 = cast();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, cast223.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:262:25:
				// suffixExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_suffixExpr_in_prefixExpr2754);
				suffixExpr224 = suffixExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, suffixExpr224.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 54, prefixExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "prefixExpr"

	public static class suffixExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "suffixExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:265:1:
	// suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value
	// LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );
	public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
		retval.start = input.LT(1);
		int suffixExpr_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN226 = null;
		Token RPAREN228 = null;
		Token LBRACKET230 = null;
		Token RBRACKET232 = null;
		Token PLUSPLUS234 = null;
		Token SUBSUB236 = null;
		TinyHaxeTry1Parser.value_return value225 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt227 = null;

		TinyHaxeTry1Parser.value_return value229 = null;

		TinyHaxeTry1Parser.expr_return expr231 = null;

		TinyHaxeTry1Parser.value_return value233 = null;

		TinyHaxeTry1Parser.value_return value235 = null;

		TinyHaxeTry1Parser.value_return value237 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt238 = null;

		Object LPAREN226_tree = null;
		Object RPAREN228_tree = null;
		Object LBRACKET230_tree = null;
		Object RBRACKET232_tree = null;
		Object PLUSPLUS234_tree = null;
		Object SUBSUB236_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SUBSUB = new RewriteRuleTokenStream(
				adaptor, "token SUBSUB");
		RewriteRuleTokenStream stream_PLUSPLUS = new RewriteRuleTokenStream(
				adaptor, "token PLUSPLUS");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_exprListOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule exprListOpt");
		RewriteRuleSubtreeStream stream_value = new RewriteRuleSubtreeStream(
				adaptor, "rule value");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 55)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:2:
			// ( value LPAREN exprListOpt RPAREN -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) |
			// value LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB
			// -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value
			// typeParamOpt )
			int alt51 = 5;
			alt51 = dfa51.predict(input);
			switch (alt51) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:4:
				// value LPAREN exprListOpt RPAREN
			{
				pushFollow(FOLLOW_value_in_suffixExpr2773);
				value225 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value225.getTree());
				LPAREN226 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_suffixExpr2775);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN226);

				pushFollow(FOLLOW_exprListOpt_in_suffixExpr2777);
				exprListOpt227 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprListOpt.add(exprListOpt227.getTree());
				RPAREN228 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_suffixExpr2779);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN228);

				// AST REWRITE
				// elements: exprListOpt, value
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 266:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value (
					// exprListOpt )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:39:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value (
						// exprListOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							adaptor.addChild(root_1, stream_value.nextTree());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:99:
							// ( exprListOpt )?
							if (stream_exprListOpt.hasNext()) {
								adaptor.addChild(root_1, stream_exprListOpt
										.nextTree());

							}
							stream_exprListOpt.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:267:4:
				// value LBRACKET expr RBRACKET
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_value_in_suffixExpr2799);
				value229 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, value229.getTree());
				LBRACKET230 = (Token) match(input, LBRACKET,
						FOLLOW_LBRACKET_in_suffixExpr2801);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					LBRACKET230_tree = (Object) adaptor.create(LBRACKET230);
					adaptor.addChild(root_0, LBRACKET230_tree);
				}
				pushFollow(FOLLOW_expr_in_suffixExpr2803);
				expr231 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr231.getTree());
				RBRACKET232 = (Token) match(input, RBRACKET,
						FOLLOW_RBRACKET_in_suffixExpr2805);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					RBRACKET232_tree = (Object) adaptor.create(RBRACKET232);
					adaptor.addChild(root_0, RBRACKET232_tree);
				}

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:4:
				// value PLUSPLUS
			{
				pushFollow(FOLLOW_value_in_suffixExpr2810);
				value233 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value233.getTree());
				PLUSPLUS234 = (Token) match(input, PLUSPLUS,
						FOLLOW_PLUSPLUS_in_suffixExpr2812);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PLUSPLUS.add(PLUSPLUS234);

				// AST REWRITE
				// elements: PLUSPLUS, value
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 268:19: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value
					// PLUSPLUS )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:21:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							adaptor.addChild(root_1, stream_value.nextTree());
							adaptor
									.addChild(root_1, stream_PLUSPLUS
											.nextNode());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:269:4:
				// value SUBSUB
			{
				pushFollow(FOLLOW_value_in_suffixExpr2830);
				value235 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value235.getTree());
				SUBSUB236 = (Token) match(input, SUBSUB,
						FOLLOW_SUBSUB_in_suffixExpr2832);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SUBSUB.add(SUBSUB236);

				// AST REWRITE
				// elements: value, SUBSUB
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 269:17: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value
					// SUBSUB )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:269:20:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							adaptor.addChild(root_1, stream_value.nextTree());
							adaptor.addChild(root_1, stream_SUBSUB.nextNode());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:270:4:
				// value typeParamOpt
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_value_in_suffixExpr2851);
				value237 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, value237.getTree());
				pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2853);
				typeParamOpt238 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeParamOpt238.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 55, suffixExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "suffixExpr"

	public static class value_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "value"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:273:1:
	// value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
	// ( expr | statement ) RPAREN | dotIdent | );
	public final TinyHaxeTry1Parser.value_return value()
			throws RecognitionException {
		TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
		retval.start = input.LT(1);
		int value_StartIndex = input.index();
		Object root_0 = null;

		Token NULL242 = null;
		Token LPAREN244 = null;
		Token RPAREN247 = null;
		TinyHaxeTry1Parser.funcLit_return funcLit239 = null;

		TinyHaxeTry1Parser.arrayLit_return arrayLit240 = null;

		TinyHaxeTry1Parser.objLit_return objLit241 = null;

		TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol243 = null;

		TinyHaxeTry1Parser.expr_return expr245 = null;

		TinyHaxeTry1Parser.statement_return statement246 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent248 = null;

		Object NULL242_tree = null;
		Object LPAREN244_tree = null;
		Object RPAREN247_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 56)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:273:7:
			// ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
			// ( expr | statement ) RPAREN | dotIdent | )
			int alt53 = 8;
			alt53 = dfa53.predict(input);
			switch (alt53) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:273:9:
				// funcLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcLit_in_value2862);
				funcLit239 = funcLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcLit239.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:4:
				// arrayLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_arrayLit_in_value2868);
				arrayLit240 = arrayLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, arrayLit240.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:275:14:
				// objLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_objLit_in_value2883);
				objLit241 = objLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLit241.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:276:14:
				// NULL
			{
				root_0 = (Object) adaptor.nil();

				NULL242 = (Token) match(input, NULL, FOLLOW_NULL_in_value2898);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					NULL242_tree = (Object) adaptor.create(NULL242);
					adaptor.addChild(root_0, NULL242_tree);
				}

			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:277:14:
				// elementarySymbol
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_elementarySymbol_in_value2913);
				elementarySymbol243 = elementarySymbol();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, elementarySymbol243.getTree());

			}
				break;
			case 6:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:14:
				// LPAREN ( expr | statement ) RPAREN
			{
				root_0 = (Object) adaptor.nil();

				LPAREN244 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_value2928);
				if (state.failed)
					return retval;
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:22:
				// ( expr | statement )
				int alt52 = 2;
				alt52 = dfa52.predict(input);
				switch (alt52) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:23:
					// expr
				{
					pushFollow(FOLLOW_expr_in_value2932);
					expr245 = expr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, expr245.getTree());

				}
					break;
				case 2:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:28:
					// statement
				{
					pushFollow(FOLLOW_statement_in_value2934);
					statement246 = statement();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, statement246.getTree());

				}
					break;

				}

				RPAREN247 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_value2937);
				if (state.failed)
					return retval;

			}
				break;
			case 7:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:279:11:
				// dotIdent
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_dotIdent_in_value2950);
				dotIdent248 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, dotIdent248.getTree());

			}
				break;
			case 8:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:281:9:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 56, value_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "value"

	public static class newExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "newExpr"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:283:1:
	// newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt )
	// ;
	public final TinyHaxeTry1Parser.newExpr_return newExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
		retval.start = input.LT(1);
		int newExpr_StartIndex = input.index();
		Object root_0 = null;

		Token NEW249 = null;
		Token LPAREN251 = null;
		Token RPAREN253 = null;
		TinyHaxeTry1Parser.type_return type250 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt252 = null;

		Object NEW249_tree = null;
		Object LPAREN251_tree = null;
		Object RPAREN253_tree = null;
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(adaptor,
				"token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_exprListOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule exprListOpt");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
				adaptor, "rule type");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 57)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:283:19:
			// ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW type exprListOpt )
			// )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:283:21:
			// NEW type LPAREN exprListOpt RPAREN
			{
				NEW249 = (Token) match(input, NEW, FOLLOW_NEW_in_newExpr2995);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW249);

				pushFollow(FOLLOW_type_in_newExpr2997);
				type250 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type250.getTree());
				LPAREN251 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_newExpr2999);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN251);

				pushFollow(FOLLOW_exprListOpt_in_newExpr3001);
				exprListOpt252 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprListOpt.add(exprListOpt252.getTree());
				RPAREN253 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_newExpr3003);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN253);

				// AST REWRITE
				// elements: exprListOpt, type, NEW
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 283:56: -> ^( NEW type exprListOpt )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:283:58:
						// ^( NEW type exprListOpt )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_NEW
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_type.nextTree());
							adaptor.addChild(root_1, stream_exprListOpt
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 57, newExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "newExpr"

	public static class cast_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "cast"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:1:
	// cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr (
	// funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) );
	public final TinyHaxeTry1Parser.cast_return cast()
			throws RecognitionException {
		TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
		retval.start = input.LT(1);
		int cast_StartIndex = input.index();
		Object root_0 = null;

		Token CAST254 = null;
		Token LPAREN255 = null;
		Token COMMA257 = null;
		Token RPAREN259 = null;
		Token CAST260 = null;
		Token LPAREN261 = null;
		Token RPAREN263 = null;
		TinyHaxeTry1Parser.expr_return expr256 = null;

		TinyHaxeTry1Parser.funcType_return funcType258 = null;

		TinyHaxeTry1Parser.expr_return expr262 = null;

		Object CAST254_tree = null;
		Object LPAREN255_tree = null;
		Object COMMA257_tree = null;
		Object RPAREN259_tree = null;
		Object CAST260_tree = null;
		Object LPAREN261_tree = null;
		Object RPAREN263_tree = null;
		RewriteRuleTokenStream stream_CAST = new RewriteRuleTokenStream(
				adaptor, "token CAST");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_funcType = new RewriteRuleSubtreeStream(
				adaptor, "rule funcType");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 58)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:9:
			// ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST expr (
			// funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST expr ) )
			int alt55 = 2;
			int LA55_0 = input.LA(1);

			if ((LA55_0 == CAST)) {
				int LA55_1 = input.LA(2);

				if ((synpred106_TinyHaxeTry1())) {
					alt55 = 1;
				} else if ((true)) {
					alt55 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							55, 1, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 55, 0,
						input);

				throw nvae;
			}
			switch (alt55) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:11:
				// CAST LPAREN expr ( COMMA funcType )? RPAREN
			{
				CAST254 = (Token) match(input, CAST, FOLLOW_CAST_in_cast3024);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CAST.add(CAST254);

				LPAREN255 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_cast3026);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN255);

				pushFollow(FOLLOW_expr_in_cast3028);
				expr256 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr256.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:28:
				// ( COMMA funcType )?
				int alt54 = 2;
				int LA54_0 = input.LA(1);

				if ((LA54_0 == COMMA)) {
					alt54 = 1;
				}
				switch (alt54) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:29:
					// COMMA funcType
				{
					COMMA257 = (Token) match(input, COMMA,
							FOLLOW_COMMA_in_cast3031);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_COMMA.add(COMMA257);

					pushFollow(FOLLOW_funcType_in_cast3033);
					funcType258 = funcType();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_funcType.add(funcType258.getTree());

				}
					break;

				}

				RPAREN259 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_cast3037);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN259);

				// AST REWRITE
				// elements: CAST, funcType, expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 285:53: -> ^( CAST expr ( funcType )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:56:
						// ^( CAST expr ( funcType )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CAST
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_expr.nextTree());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:68:
							// ( funcType )?
							if (stream_funcType.hasNext()) {
								adaptor.addChild(root_1, stream_funcType
										.nextTree());

							}
							stream_funcType.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:286:4:
				// CAST LPAREN expr RPAREN
			{
				CAST260 = (Token) match(input, CAST, FOLLOW_CAST_in_cast3053);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CAST.add(CAST260);

				LPAREN261 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_cast3055);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN261);

				pushFollow(FOLLOW_expr_in_cast3057);
				expr262 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr262.getTree());
				RPAREN263 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_cast3059);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN263);

				// AST REWRITE
				// elements: expr, CAST
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 286:28: -> ^( CAST expr )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:286:30:
						// ^( CAST expr )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CAST
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_expr.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 58, cast_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "cast"

	public static class topLevelDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "topLevelDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:290:1:
	// topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
	public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
		retval.start = input.LT(1);
		int topLevelDecl_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl264 = null;

		TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl265 = null;

		TinyHaxeTry1Parser.enumDecl_return enumDecl266 = null;

		TinyHaxeTry1Parser.typedefDecl_return typedefDecl267 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 59)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:290:19:
			// ( classDecl | interfaceDecl | enumDecl | typedefDecl )
			int alt56 = 4;
			switch (input.LA(1)) {
			case EXTERN:
			case CLASS: {
				alt56 = 1;
			}
				break;
			case INTERFACE: {
				alt56 = 2;
			}
				break;
			case ENUM: {
				alt56 = 3;
			}
				break;
			case TYPEDEF: {
				alt56 = 4;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 56, 0,
						input);

				throw nvae;
			}

			switch (alt56) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:290:21:
				// classDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_classDecl_in_topLevelDecl3082);
				classDecl264 = classDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classDecl264.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:291:25:
				// interfaceDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl3108);
				interfaceDecl265 = interfaceDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceDecl265.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:292:25:
				// enumDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_enumDecl_in_topLevelDecl3134);
				enumDecl266 = enumDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, enumDecl266.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:293:25:
				// typedefDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_typedefDecl_in_topLevelDecl3160);
				typedefDecl267 = typedefDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typedefDecl267.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 59, topLevelDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "topLevelDecl"

	public static class enumDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "enumDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:295:1:
	// enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
	// IDENTIFIER typeParamOpt enumBody ) ;
	public final TinyHaxeTry1Parser.enumDecl_return enumDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
		retval.start = input.LT(1);
		int enumDecl_StartIndex = input.index();
		Object root_0 = null;

		Token ENUM268 = null;
		Token IDENTIFIER269 = null;
		Token LBRACE271 = null;
		Token RBRACE273 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt270 = null;

		TinyHaxeTry1Parser.enumBody_return enumBody272 = null;

		Object ENUM268_tree = null;
		Object IDENTIFIER269_tree = null;
		Object LBRACE271_tree = null;
		Object RBRACE273_tree = null;
		RewriteRuleTokenStream stream_ENUM = new RewriteRuleTokenStream(
				adaptor, "token ENUM");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_enumBody = new RewriteRuleSubtreeStream(
				adaptor, "rule enumBody");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParamOpt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 60)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:295:19:
			// ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
			// IDENTIFIER typeParamOpt enumBody ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:295:21:
			// ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
			{
				ENUM268 = (Token) match(input, ENUM,
						FOLLOW_ENUM_in_enumDecl3178);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_ENUM.add(ENUM268);

				IDENTIFIER269 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumDecl3180);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER269);

				pushFollow(FOLLOW_typeParamOpt_in_enumDecl3182);
				typeParamOpt270 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt270.getTree());
				LBRACE271 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_enumDecl3184);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE271);

				pushFollow(FOLLOW_enumBody_in_enumDecl3186);
				enumBody272 = enumBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_enumBody.add(enumBody272.getTree());
				RBRACE273 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_enumDecl3188);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE273);

				// AST REWRITE
				// elements: IDENTIFIER, ENUM, typeParamOpt, enumBody
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 295:73: -> ^( ENUM IDENTIFIER typeParamOpt enumBody )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:295:76:
						// ^( ENUM IDENTIFIER typeParamOpt enumBody )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_ENUM
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							adaptor.addChild(root_1, stream_typeParamOpt
									.nextTree());
							adaptor
									.addChild(root_1, stream_enumBody
											.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 60, enumDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumDecl"

	public static class enumBody_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "enumBody"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:1:
	// enumBody : ( enumValueDecl )+ ;
	public final TinyHaxeTry1Parser.enumBody_return enumBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl274 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 61)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:19:
			// ( ( enumValueDecl )+ )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:21:
			// ( enumValueDecl )+
			{
				root_0 = (Object) adaptor.nil();

				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:21:
				// ( enumValueDecl )+
				int cnt57 = 0;
				loop57: do {
					int alt57 = 2;
					int LA57_0 = input.LA(1);

					if ((LA57_0 == IDENTIFIER || LA57_0 == PP_IF || (LA57_0 >= PP_ELSEIF && LA57_0 <= PP_ERROR))) {
						alt57 = 1;
					}

					switch (alt57) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:297:22:
						// enumValueDecl
					{
						pushFollow(FOLLOW_enumValueDecl_in_enumBody3219);
						enumValueDecl274 = enumValueDecl();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor
									.addChild(root_0, enumValueDecl274
											.getTree());

					}
						break;

					default:
						if (cnt57 >= 1)
							break loop57;
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(57,
								input);
						throw eee;
					}
					cnt57++;
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 61, enumBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumBody"

	public static class enumValueDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "enumValueDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:300:1:
	// enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER
	// SEMI | pp );
	public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
		retval.start = input.LT(1);
		int enumValueDecl_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER275 = null;
		Token LPAREN276 = null;
		Token RPAREN278 = null;
		Token SEMI279 = null;
		Token IDENTIFIER280 = null;
		Token SEMI281 = null;
		TinyHaxeTry1Parser.paramList_return paramList277 = null;

		TinyHaxeTry1Parser.pp_return pp282 = null;

		Object IDENTIFIER275_tree = null;
		Object LPAREN276_tree = null;
		Object RPAREN278_tree = null;
		Object SEMI279_tree = null;
		Object IDENTIFIER280_tree = null;
		Object SEMI281_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 62)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:301:2:
			// ( IDENTIFIER LPAREN paramList RPAREN SEMI | IDENTIFIER SEMI | pp
			// )
			int alt58 = 3;
			int LA58_0 = input.LA(1);

			if ((LA58_0 == IDENTIFIER)) {
				int LA58_1 = input.LA(2);

				if ((LA58_1 == LPAREN)) {
					alt58 = 1;
				} else if ((LA58_1 == SEMI)) {
					alt58 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							58, 1, input);

					throw nvae;
				}
			} else if ((LA58_0 == PP_IF || (LA58_0 >= PP_ELSEIF && LA58_0 <= PP_ERROR))) {
				alt58 = 3;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 58, 0,
						input);

				throw nvae;
			}
			switch (alt58) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:301:4:
				// IDENTIFIER LPAREN paramList RPAREN SEMI
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER275 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl3238);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER275_tree = (Object) adaptor.create(IDENTIFIER275);
					adaptor.addChild(root_0, IDENTIFIER275_tree);
				}
				LPAREN276 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_enumValueDecl3240);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_paramList_in_enumValueDecl3243);
				paramList277 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, paramList277.getTree());
				RPAREN278 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_enumValueDecl3245);
				if (state.failed)
					return retval;
				SEMI279 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl3248);
				if (state.failed)
					return retval;

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:302:4:
				// IDENTIFIER SEMI
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER280 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl3255);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER280_tree = (Object) adaptor.create(IDENTIFIER280);
					adaptor.addChild(root_0, IDENTIFIER280_tree);
				}
				SEMI281 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl3257);
				if (state.failed)
					return retval;

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:303:4:
				// pp
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_enumValueDecl3264);
				pp282 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp282.getTree());

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 62, enumValueDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "enumValueDecl"

	public static class varDeclList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "varDeclList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:306:1:
	// varDeclList : varDecl varDeclList ;
	public final TinyHaxeTry1Parser.varDeclList_return varDeclList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
		retval.start = input.LT(1);
		int varDeclList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl283 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList284 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 63)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:306:19:
			// ( varDecl varDeclList )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:306:21:
			// varDecl varDeclList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_varDeclList3281);
				varDecl283 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl283.getTree());
				pushFollow(FOLLOW_varDeclList_in_varDeclList3283);
				varDeclList284 = varDeclList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDeclList284.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 63, varDeclList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclList"

	public static class varDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "varDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:1:
	// varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] (
	// declAttrList )? varDeclPartList ) ;
	public final TinyHaxeTry1Parser.varDecl_return varDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
		retval.start = input.LT(1);
		int varDecl_StartIndex = input.index();
		Object root_0 = null;

		Token VAR286 = null;
		Token SEMI288 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList285 = null;

		TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList287 = null;

		Object VAR286_tree = null;
		Object SEMI288_tree = null;
		RewriteRuleTokenStream stream_VAR = new RewriteRuleTokenStream(adaptor,
				"token VAR");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_varDeclPartList = new RewriteRuleSubtreeStream(
				adaptor, "rule varDeclPartList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 64)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:19:
			// ( ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] (
			// declAttrList )? varDeclPartList ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:21:
			// ( declAttrList )? VAR varDeclPartList SEMI
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:21:
				// ( declAttrList )?
				int alt59 = 2;
				int LA59_0 = input.LA(1);

				if (((LA59_0 >= PUBLIC && LA59_0 <= OVERRIDE))) {
					alt59 = 1;
				}
				switch (alt59) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:22:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_varDecl3305);
					declAttrList285 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList285.getTree());

				}
					break;

				}

				VAR286 = (Token) match(input, VAR, FOLLOW_VAR_in_varDecl3309);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_VAR.add(VAR286);

				pushFollow(FOLLOW_varDeclPartList_in_varDecl3311);
				varDeclPartList287 = varDeclPartList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_varDeclPartList.add(varDeclPartList287.getTree());
				SEMI288 = (Token) match(input, SEMI, FOLLOW_SEMI_in_varDecl3313);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI288);

				// AST REWRITE
				// elements: declAttrList, varDeclPartList, VAR
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 309:62: -> ^( VAR[$VAR] ( declAttrList )? varDeclPartList
					// )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:64:
						// ^( VAR[$VAR] ( declAttrList )? varDeclPartList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new VarDeclaration(VAR, VAR286), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:309:92:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							adaptor.addChild(root_1, stream_varDeclPartList
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 64, varDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDecl"

	public static class varDeclPartList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "varDeclPartList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:1:
	// varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
	public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
		retval.start = input.LT(1);
		int varDeclPartList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA290 = null;
		TinyHaxeTry1Parser.varDeclPart_return varDeclPart289 = null;

		TinyHaxeTry1Parser.varDeclPart_return varDeclPart291 = null;

		Object COMMA290_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 65)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:19:
			// ( varDeclPart ( COMMA varDeclPart )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:21:
			// varDeclPart ( COMMA varDeclPart )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3341);
				varDeclPart289 = varDeclPart();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDeclPart289.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:33:
				// ( COMMA varDeclPart )*
				loop60: do {
					int alt60 = 2;
					int LA60_0 = input.LA(1);

					if ((LA60_0 == COMMA)) {
						alt60 = 1;
					}

					switch (alt60) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:312:34:
						// COMMA varDeclPart
					{
						COMMA290 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_varDeclPartList3344);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3347);
						varDeclPart291 = varDeclPart();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, varDeclPart291.getTree());

					}
						break;

					default:
						break loop60;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 65, varDeclPartList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclPartList"

	public static class varDeclPart_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "varDeclPart"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:1:
	// varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
	public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
		retval.start = input.LT(1);
		int varDeclPart_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER292 = null;
		TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt293 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt294 = null;

		TinyHaxeTry1Parser.varInit_return varInit295 = null;

		Object IDENTIFIER292_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 66)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:19:
			// ( IDENTIFIER propDeclOpt typeTagOpt varInit )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:314:20:
			// IDENTIFIER propDeclOpt typeTagOpt varInit
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER292 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_varDeclPart3363);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER292_tree = new VarUsage(IDENTIFIER292);
					adaptor.addChild(root_0, IDENTIFIER292_tree);
				}
				pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3368);
				propDeclOpt293 = propDeclOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, propDeclOpt293.getTree());
				pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3370);
				typeTagOpt294 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeTagOpt294.getTree());
				pushFollow(FOLLOW_varInit_in_varDeclPart3372);
				varInit295 = varInit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varInit295.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 66, varDeclPart_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varDeclPart"

	public static class propDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "propDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:1:
	// propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
	// PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) ;
	public final TinyHaxeTry1Parser.propDecl_return propDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
		retval.start = input.LT(1);
		int propDecl_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN296 = null;
		Token COMMA297 = null;
		Token RPAREN298 = null;
		TinyHaxeTry1Parser.propAccessor_return a1 = null;

		TinyHaxeTry1Parser.propAccessor_return a2 = null;

		Object LPAREN296_tree = null;
		Object COMMA297_tree = null;
		Object RPAREN298_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_propAccessor = new RewriteRuleSubtreeStream(
				adaptor, "rule propAccessor");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 67)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:9:
			// ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
			// PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:11:
			// LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
			{
				LPAREN296 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_propDecl3382);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN296);

				pushFollow(FOLLOW_propAccessor_in_propDecl3386);
				a1 = propAccessor();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_propAccessor.add(a1.getTree());
				COMMA297 = (Token) match(input, COMMA,
						FOLLOW_COMMA_in_propDecl3388);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COMMA.add(COMMA297);

				pushFollow(FOLLOW_propAccessor_in_propDecl3392);
				a2 = propAccessor();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_propAccessor.add(a2.getTree());
				RPAREN298 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_propDecl3394);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN298);

				// AST REWRITE
				// elements: a1, a2
				// token labels:
				// rule labels: retval, a1, a2
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);
					RewriteRuleSubtreeStream stream_a1 = new RewriteRuleSubtreeStream(
							adaptor, "rule a1", a1 != null ? a1.tree : null);
					RewriteRuleSubtreeStream stream_a2 = new RewriteRuleSubtreeStream(
							adaptor, "rule a2", a2 != null ? a2.tree : null);

					root_0 = (Object) adaptor.nil();
					// 317:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1
					// $a2)
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:317:66:
						// ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] $a1 $a2)
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(PROPERTY_DECL,
											"PROPERTY_DECL", true), root_1);

							adaptor.addChild(root_1, stream_a1.nextTree());
							adaptor.addChild(root_1, stream_a2.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 67, propDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propDecl"

	public static class propAccessor_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "propAccessor"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:320:1:
	// propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
	public final TinyHaxeTry1Parser.propAccessor_return propAccessor()
			throws RecognitionException {
		TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
		retval.start = input.LT(1);
		int propAccessor_StartIndex = input.index();
		Object root_0 = null;

		Token set299 = null;

		Object set299_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 68)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:321:2:
			// ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:
			{
				root_0 = (Object) adaptor.nil();

				set299 = (Token) input.LT(1);
				if (input.LA(1) == IDENTIFIER || input.LA(1) == DYNAMIC
						|| input.LA(1) == DEFAULT || input.LA(1) == NULL) {
					input.consume();
					if (state.backtracking == 0)
						adaptor.addChild(root_0, (Object) adaptor
								.create(set299));
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(
							null, input);
					throw mse;
				}

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 68, propAccessor_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propAccessor"

	public static class propDeclOpt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "propDeclOpt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:327:1:
	// propDeclOpt : ( propDecl | );
	public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
		retval.start = input.LT(1);
		int propDeclOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.propDecl_return propDecl300 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 69)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:2:
			// ( propDecl | )
			int alt61 = 2;
			int LA61_0 = input.LA(1);

			if ((LA61_0 == LPAREN)) {
				alt61 = 1;
			} else if ((LA61_0 == EOF || LA61_0 == SEMI || LA61_0 == COMMA
					|| LA61_0 == EQ || LA61_0 == RPAREN || LA61_0 == COLON || LA61_0 == LBRACE)) {
				alt61 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 61, 0,
						input);

				throw nvae;
			}
			switch (alt61) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:328:4:
				// propDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_propDecl_in_propDeclOpt3452);
				propDecl300 = propDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, propDecl300.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:330:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 69, propDeclOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "propDeclOpt"

	public static class varInit_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "varInit"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:332:1:
	// varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | );
	public final TinyHaxeTry1Parser.varInit_return varInit()
			throws RecognitionException {
		TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
		retval.start = input.LT(1);
		int varInit_StartIndex = input.index();
		Object root_0 = null;

		Token EQ301 = null;
		TinyHaxeTry1Parser.expr_return expr302 = null;

		Object EQ301_tree = null;
		RewriteRuleTokenStream stream_EQ = new RewriteRuleTokenStream(adaptor,
				"token EQ");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 70)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:332:9:
			// ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] expr ) | )
			int alt62 = 2;
			int LA62_0 = input.LA(1);

			if ((LA62_0 == EQ)) {
				alt62 = 1;
			} else if ((LA62_0 == EOF || LA62_0 == SEMI || LA62_0 == COMMA || LA62_0 == RPAREN)) {
				alt62 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 62, 0,
						input);

				throw nvae;
			}
			switch (alt62) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:332:11:
				// EQ expr
			{
				EQ301 = (Token) match(input, EQ, FOLLOW_EQ_in_varInit3467);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_EQ.add(EQ301);

				pushFollow(FOLLOW_expr_in_varInit3469);
				expr302 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr302.getTree());

				// AST REWRITE
				// elements: expr
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 332:19: -> ^( VAR_INIT[\"VAR_INIT\",true] expr )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:332:21:
						// ^( VAR_INIT[\"VAR_INIT\",true] expr )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(VAR_INIT,
											"VAR_INIT", true), root_1);

							adaptor.addChild(root_1, stream_expr.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:334:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 70, varInit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "varInit"

	public static class funcDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "funcDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:1:
	// funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
	// typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER
	// typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION
	// IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block (
	// typeParamOpt )? ) );
	public final TinyHaxeTry1Parser.funcDecl_return funcDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
		retval.start = input.LT(1);
		int funcDecl_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION304 = null;
		Token NEW305 = null;
		Token LPAREN306 = null;
		Token RPAREN308 = null;
		Token FUNCTION312 = null;
		Token IDENTIFIER313 = null;
		Token LPAREN315 = null;
		Token RPAREN317 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList303 = null;

		TinyHaxeTry1Parser.paramList_return paramList307 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt309 = null;

		TinyHaxeTry1Parser.block_return block310 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList311 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt314 = null;

		TinyHaxeTry1Parser.paramList_return paramList316 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt318 = null;

		TinyHaxeTry1Parser.block_return block319 = null;

		Object FUNCTION304_tree = null;
		Object NEW305_tree = null;
		Object LPAREN306_tree = null;
		Object RPAREN308_tree = null;
		Object FUNCTION312_tree = null;
		Object IDENTIFIER313_tree = null;
		Object LPAREN315_tree = null;
		Object RPAREN317_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(adaptor,
				"token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_block = new RewriteRuleSubtreeStream(
				adaptor, "rule block");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParamOpt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 71)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:9:
			// ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
			// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList
			// )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION
			// IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
			// -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? (
			// typeTagOpt )? block ( typeParamOpt )? ) )
			int alt65 = 2;
			alt65 = dfa65.predict(input);
			switch (alt65) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:11:
				// ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
				// typeTagOpt block
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:11:
				// ( declAttrList )?
				int alt63 = 2;
				int LA63_0 = input.LA(1);

				if (((LA63_0 >= PUBLIC && LA63_0 <= OVERRIDE))) {
					alt63 = 1;
				}
				switch (alt63) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_funcDecl3494);
					declAttrList303 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList303.getTree());

				}
					break;

				}

				FUNCTION304 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3497);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION304);

				NEW305 = (Token) match(input, NEW, FOLLOW_NEW_in_funcDecl3499);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW305);

				LPAREN306 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3501);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN306);

				pushFollow(FOLLOW_paramList_in_funcDecl3503);
				paramList307 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList307.getTree());
				RPAREN308 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3505);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN308);

				pushFollow(FOLLOW_typeTagOpt_in_funcDecl3507);
				typeTagOpt309 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt309.getTree());
				pushFollow(FOLLOW_block_in_funcDecl3509);
				block310 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block310.getTree());

				// AST REWRITE
				// elements: typeTagOpt, FUNCTION, declAttrList, paramList,
				// block, NEW
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 336:79: -> ^( FUNCTION NEW ( declAttrList )? ( paramList
					// )? ( typeTagOpt )? block )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:82:
						// ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
						// typeTagOpt )? block )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_NEW.nextNode());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:111:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:125:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:336:136:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							adaptor.addChild(root_1, stream_block.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:4:
				// ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN
				// paramList RPAREN typeTagOpt block
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:4:
				// ( declAttrList )?
				int alt64 = 2;
				int LA64_0 = input.LA(1);

				if (((LA64_0 >= PUBLIC && LA64_0 <= OVERRIDE))) {
					alt64 = 1;
				}
				switch (alt64) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_funcDecl3537);
					declAttrList311 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList311.getTree());

				}
					break;

				}

				FUNCTION312 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3540);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION312);

				IDENTIFIER313 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcDecl3542);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER313);

				pushFollow(FOLLOW_typeParamOpt_in_funcDecl3544);
				typeParamOpt314 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt314.getTree());
				LPAREN315 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3546);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN315);

				pushFollow(FOLLOW_paramList_in_funcDecl3548);
				paramList316 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList316.getTree());
				RPAREN317 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3550);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN317);

				pushFollow(FOLLOW_typeTagOpt_in_funcDecl3552);
				typeTagOpt318 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt318.getTree());
				pushFollow(FOLLOW_block_in_funcDecl3554);
				block319 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block319.getTree());

				// AST REWRITE
				// elements: FUNCTION, paramList, typeTagOpt, declAttrList,
				// block, typeParamOpt, IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 337:92: -> ^( FUNCTION IDENTIFIER ( declAttrList )? (
					// paramList )? ( typeTagOpt )? block ( typeParamOpt )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:94:
						// ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList
						// )? ( typeTagOpt )? block ( typeParamOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:130:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:144:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:155:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							adaptor.addChild(root_1, stream_block.nextTree());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:337:173:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeParamOpt
										.nextTree());

							}
							stream_typeParamOpt.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 71, funcDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcDecl"

	public static class funcProtoDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "funcProtoDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:340:1:
	// funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) |
	// declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN
	// typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt
	// declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION
	// IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^(
	// FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );
	public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
		retval.start = input.LT(1);
		int funcProtoDecl_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION321 = null;
		Token NEW322 = null;
		Token LPAREN323 = null;
		Token RPAREN325 = null;
		Token SEMI327 = null;
		Token FUNCTION329 = null;
		Token IDENTIFIER330 = null;
		Token LPAREN332 = null;
		Token RPAREN334 = null;
		Token SEMI336 = null;
		Token FUNCTION337 = null;
		Token NEW338 = null;
		Token LPAREN339 = null;
		Token RPAREN341 = null;
		Token SEMI343 = null;
		Token FUNCTION344 = null;
		Token IDENTIFIER345 = null;
		Token LPAREN347 = null;
		Token RPAREN349 = null;
		Token SEMI351 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList320 = null;

		TinyHaxeTry1Parser.paramList_return paramList324 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt326 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList328 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt331 = null;

		TinyHaxeTry1Parser.paramList_return paramList333 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt335 = null;

		TinyHaxeTry1Parser.paramList_return paramList340 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt342 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt346 = null;

		TinyHaxeTry1Parser.paramList_return paramList348 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt350 = null;

		Object FUNCTION321_tree = null;
		Object NEW322_tree = null;
		Object LPAREN323_tree = null;
		Object RPAREN325_tree = null;
		Object SEMI327_tree = null;
		Object FUNCTION329_tree = null;
		Object IDENTIFIER330_tree = null;
		Object LPAREN332_tree = null;
		Object RPAREN334_tree = null;
		Object SEMI336_tree = null;
		Object FUNCTION337_tree = null;
		Object NEW338_tree = null;
		Object LPAREN339_tree = null;
		Object RPAREN341_tree = null;
		Object SEMI343_tree = null;
		Object FUNCTION344_tree = null;
		Object IDENTIFIER345_tree = null;
		Object LPAREN347_tree = null;
		Object RPAREN349_tree = null;
		Object SEMI351_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(adaptor,
				"token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				adaptor, "rule paramList");
		RewriteRuleSubtreeStream stream_typeTagOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeTagOpt");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParamOpt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 72)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:341:2:
			// ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
			// SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) |
			// declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList
			// RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList
			// typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN
			// paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList
			// typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList
			// RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList
			// typeTagOpt typeParamOpt ) )
			int alt66 = 4;
			alt66 = dfa66.predict(input);
			switch (alt66) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:341:4:
				// declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
				// SEMI
			{
				pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3590);
				declAttrList320 = declAttrList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_declAttrList.add(declAttrList320.getTree());
				FUNCTION321 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3592);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION321);

				NEW322 = (Token) match(input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3594);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW322);

				LPAREN323 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3596);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN323);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3598);
				paramList324 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList324.getTree());
				RPAREN325 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3600);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN325);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3602);
				typeTagOpt326 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt326.getTree());
				SEMI327 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3604);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI327);

				// AST REWRITE
				// elements: declAttrList, typeTagOpt, NEW, FUNCTION, paramList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 341:70: -> ^( FUNCTION NEW paramList typeTagOpt
					// declAttrList )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:341:73:
						// ^( FUNCTION NEW paramList typeTagOpt declAttrList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							adaptor.addChild(root_1, stream_NEW.nextNode());
							adaptor.addChild(root_1, stream_paramList
									.nextTree());
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());
							adaptor.addChild(root_1, stream_declAttrList
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:342:4:
				// declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN
				// paramList RPAREN typeTagOpt SEMI
			{
				pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3623);
				declAttrList328 = declAttrList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_declAttrList.add(declAttrList328.getTree());
				FUNCTION329 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3625);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION329);

				IDENTIFIER330 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3627);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER330);

				pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3629);
				typeParamOpt331 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt331.getTree());
				LPAREN332 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3631);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN332);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3633);
				paramList333 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList333.getTree());
				RPAREN334 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3635);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN334);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3637);
				typeTagOpt335 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt335.getTree());
				SEMI336 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3639);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI336);

				// AST REWRITE
				// elements: declAttrList, typeParamOpt, typeTagOpt, FUNCTION,
				// IDENTIFIER, paramList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 342:90: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt
					// declAttrList typeParamOpt )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:342:92:
						// ^( FUNCTION IDENTIFIER paramList typeTagOpt
						// declAttrList typeParamOpt )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							adaptor.addChild(root_1, stream_paramList
									.nextTree());
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());
							adaptor.addChild(root_1, stream_declAttrList
									.nextTree());
							adaptor.addChild(root_1, stream_typeParamOpt
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:343:4:
				// FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
			{
				FUNCTION337 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3659);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION337);

				NEW338 = (Token) match(input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3661);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW338);

				LPAREN339 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3663);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN339);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3665);
				paramList340 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList340.getTree());
				RPAREN341 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3667);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN341);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3669);
				typeTagOpt342 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt342.getTree());
				SEMI343 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3671);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI343);

				// AST REWRITE
				// elements: NEW, FUNCTION, typeTagOpt, paramList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 343:57: -> ^( FUNCTION NEW paramList typeTagOpt )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:343:60:
						// ^( FUNCTION NEW paramList typeTagOpt )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							adaptor.addChild(root_1, stream_NEW.nextNode());
							adaptor.addChild(root_1, stream_paramList
									.nextTree());
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:344:4:
				// FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN
				// typeTagOpt SEMI
			{
				FUNCTION344 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3688);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION344);

				IDENTIFIER345 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3690);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER345);

				pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3692);
				typeParamOpt346 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt346.getTree());
				LPAREN347 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3694);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN347);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3696);
				paramList348 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList348.getTree());
				RPAREN349 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3698);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN349);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3700);
				typeTagOpt350 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt350.getTree());
				SEMI351 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3702);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI351);

				// AST REWRITE
				// elements: typeTagOpt, typeParamOpt, paramList, FUNCTION,
				// IDENTIFIER
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 344:77: -> ^( FUNCTION IDENTIFIER paramList typeTagOpt
					// typeParamOpt )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:344:79:
						// ^( FUNCTION IDENTIFIER paramList typeTagOpt
						// typeParamOpt )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							adaptor.addChild(root_1, stream_paramList
									.nextTree());
							adaptor.addChild(root_1, stream_typeTagOpt
									.nextTree());
							adaptor.addChild(root_1, stream_typeParamOpt
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 72, funcProtoDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcProtoDecl"

	public static class classDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:347:1:
	// classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt
	// LBRACE classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? (
	// typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) ;
	public final TinyHaxeTry1Parser.classDecl_return classDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
		retval.start = input.LT(1);
		int classDecl_StartIndex = input.index();
		Object root_0 = null;

		Token EXTERN352 = null;
		Token CLASS353 = null;
		Token IDENTIFIER354 = null;
		Token LBRACE357 = null;
		Token RBRACE359 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt355 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt356 = null;

		TinyHaxeTry1Parser.classBodyScope_return classBodyScope358 = null;

		Object EXTERN352_tree = null;
		Object CLASS353_tree = null;
		Object IDENTIFIER354_tree = null;
		Object LBRACE357_tree = null;
		Object RBRACE359_tree = null;
		RewriteRuleTokenStream stream_EXTERN = new RewriteRuleTokenStream(
				adaptor, "token EXTERN");
		RewriteRuleTokenStream stream_CLASS = new RewriteRuleTokenStream(
				adaptor, "token CLASS");
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_classBodyScope = new RewriteRuleSubtreeStream(
				adaptor, "rule classBodyScope");
		RewriteRuleSubtreeStream stream_typeParamOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParamOpt");
		RewriteRuleSubtreeStream stream_inheritListOpt = new RewriteRuleSubtreeStream(
				adaptor, "rule inheritListOpt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 73)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:2:
			// ( ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE
			// classBodyScope RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? (
			// typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:4:
			// ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt LBRACE
			// classBodyScope RBRACE
			{
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:4:
				// ( EXTERN )?
				int alt67 = 2;
				int LA67_0 = input.LA(1);

				if ((LA67_0 == EXTERN)) {
					alt67 = 1;
				}
				switch (alt67) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:0:0:
					// EXTERN
				{
					EXTERN352 = (Token) match(input, EXTERN,
							FOLLOW_EXTERN_in_classDecl3727);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_EXTERN.add(EXTERN352);

				}
					break;

				}

				CLASS353 = (Token) match(input, CLASS,
						FOLLOW_CLASS_in_classDecl3730);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CLASS.add(CLASS353);

				IDENTIFIER354 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_classDecl3732);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER354);

				pushFollow(FOLLOW_typeParamOpt_in_classDecl3734);
				typeParamOpt355 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt355.getTree());
				pushFollow(FOLLOW_inheritListOpt_in_classDecl3736);
				inheritListOpt356 = inheritListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_inheritListOpt.add(inheritListOpt356.getTree());
				LBRACE357 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_classDecl3738);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE357);

				pushFollow(FOLLOW_classBodyScope_in_classDecl3740);
				classBodyScope358 = classBodyScope();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_classBodyScope.add(classBodyScope358.getTree());
				RBRACE359 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_classDecl3742);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE359);

				// AST REWRITE
				// elements: typeParamOpt, classBodyScope, inheritListOpt,
				// IDENTIFIER, CLASS, EXTERN
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 348:86: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt
					// )? ( inheritListOpt )? ( classBodyScope )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:88:
						// ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? (
						// inheritListOpt )? ( classBodyScope )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new ClassNode(
									stream_CLASS.nextToken()), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:118:
							// ( EXTERN )?
							if (stream_EXTERN.hasNext()) {
								adaptor.addChild(root_1, stream_EXTERN
										.nextNode());

							}
							stream_EXTERN.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:126:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeParamOpt
										.nextTree());

							}
							stream_typeParamOpt.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:140:
							// ( inheritListOpt )?
							if (stream_inheritListOpt.hasNext()) {
								adaptor.addChild(root_1, stream_inheritListOpt
										.nextTree());

							}
							stream_inheritListOpt.reset();
							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:348:156:
							// ( classBodyScope )?
							if (stream_classBodyScope.hasNext()) {
								adaptor.addChild(root_1, stream_classBodyScope
										.nextTree());

							}
							stream_classBodyScope.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 73, classDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classDecl"

	public static class classBodyScope_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classBodyScope"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:351:1:
	// classBodyScope : classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] (
	// classBody )? ) ;
	public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope()
			throws RecognitionException {
		TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
		retval.start = input.LT(1);
		int classBodyScope_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classBody_return classBody360 = null;

		RewriteRuleSubtreeStream stream_classBody = new RewriteRuleSubtreeStream(
				adaptor, "rule classBody");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 74)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:352:2:
			// ( classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody
			// )? ) )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:352:4:
			// classBody
			{
				pushFollow(FOLLOW_classBody_in_classBodyScope3776);
				classBody360 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_classBody.add(classBody360.getTree());

				// AST REWRITE
				// elements: classBody
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 352:14: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] (
					// classBody )? )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:352:17:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true] ( classBody )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true), root_1);

							// C:\\Documents and
							// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:352:67:
							// ( classBody )?
							if (stream_classBody.hasNext()) {
								adaptor.addChild(root_1, stream_classBody
										.nextTree());

							}
							stream_classBody.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 74, classBodyScope_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBodyScope"

	public static class classBody_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classBody"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:355:1:
	// classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );
	public final TinyHaxeTry1Parser.classBody_return classBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl361 = null;

		TinyHaxeTry1Parser.classBody_return classBody362 = null;

		TinyHaxeTry1Parser.funcDecl_return funcDecl363 = null;

		TinyHaxeTry1Parser.classBody_return classBody364 = null;

		TinyHaxeTry1Parser.pp_return pp365 = null;

		TinyHaxeTry1Parser.classBody_return classBody366 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 75)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:2:
			// ( varDecl classBody | funcDecl classBody | pp classBody | )
			int alt68 = 4;
			alt68 = dfa68.predict(input);
			switch (alt68) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:356:4:
				// varDecl classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_classBody3801);
				varDecl361 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl361.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3803);
				classBody362 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody362.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:357:4:
				// funcDecl classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcDecl_in_classBody3808);
				funcDecl363 = funcDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcDecl363.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3810);
				classBody364 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody364.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:358:4:
				// pp classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_classBody3815);
				pp365 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp365.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3817);
				classBody366 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody366.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:360:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 75, classBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBody"

	public static class interfaceDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "interfaceDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:362:1:
	// interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
	// ;
	public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
		retval.start = input.LT(1);
		int interfaceDecl_StartIndex = input.index();
		Object root_0 = null;

		Token INTERFACE367 = null;
		Token LBRACE370 = null;
		Token RBRACE372 = null;
		TinyHaxeTry1Parser.type_return type368 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt369 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody371 = null;

		Object INTERFACE367_tree = null;
		Object LBRACE370_tree = null;
		Object RBRACE372_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 76)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:363:2:
			// ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:363:4:
			// INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
			{
				root_0 = (Object) adaptor.nil();

				INTERFACE367 = (Token) match(input, INTERFACE,
						FOLLOW_INTERFACE_in_interfaceDecl3837);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					INTERFACE367_tree = (Object) adaptor.create(INTERFACE367);
					adaptor.addChild(root_0, INTERFACE367_tree);
				}
				pushFollow(FOLLOW_type_in_interfaceDecl3839);
				type368 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, type368.getTree());
				pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3841);
				inheritListOpt369 = inheritListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, inheritListOpt369.getTree());
				LBRACE370 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_interfaceDecl3843);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3846);
				interfaceBody371 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody371.getTree());
				RBRACE372 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_interfaceDecl3848);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 76, interfaceDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "interfaceDecl"

	public static class interfaceBody_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "interfaceBody"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:366:1:
	// interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |
	// pp interfaceBody | );
	public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl373 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody374 = null;

		TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl375 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody376 = null;

		TinyHaxeTry1Parser.pp_return pp377 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody378 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 77)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:2:
			// ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp
			// interfaceBody | )
			int alt69 = 4;
			alt69 = dfa69.predict(input);
			switch (alt69) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:367:4:
				// varDecl interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_interfaceBody3861);
				varDecl373 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl373.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3863);
				interfaceBody374 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody374.getTree());

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:368:4:
				// funcProtoDecl interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3868);
				funcProtoDecl375 = funcProtoDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcProtoDecl375.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3870);
				interfaceBody376 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody376.getTree());

			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:369:4:
				// pp interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_interfaceBody3875);
				pp377 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp377.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3877);
				interfaceBody378 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody378.getTree());

			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:371:2:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 77, interfaceBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "interfaceBody"

	public static class inheritList_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "inheritList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:373:1:
	// inheritList : inherit ( COMMA inherit )* ;
	public final TinyHaxeTry1Parser.inheritList_return inheritList()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
		retval.start = input.LT(1);
		int inheritList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA380 = null;
		TinyHaxeTry1Parser.inherit_return inherit379 = null;

		TinyHaxeTry1Parser.inherit_return inherit381 = null;

		Object COMMA380_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 78)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:374:2:
			// ( inherit ( COMMA inherit )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:374:4:
			// inherit ( COMMA inherit )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_inherit_in_inheritList3898);
				inherit379 = inherit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, inherit379.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:374:12:
				// ( COMMA inherit )*
				loop70: do {
					int alt70 = 2;
					int LA70_0 = input.LA(1);

					if ((LA70_0 == COMMA)) {
						alt70 = 1;
					}

					switch (alt70) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:374:13:
						// COMMA inherit
					{
						COMMA380 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_inheritList3901);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_inherit_in_inheritList3904);
						inherit381 = inherit();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, inherit381.getTree());

					}
						break;

					default:
						break loop70;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 78, inheritList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inheritList"

	public static class inheritListOpt_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "inheritListOpt"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:377:1:
	// inheritListOpt : ( inheritList -> ^(
	// INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] inheritList ) | );
	public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
		retval.start = input.LT(1);
		int inheritListOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.inheritList_return inheritList382 = null;

		RewriteRuleSubtreeStream stream_inheritList = new RewriteRuleSubtreeStream(
				adaptor, "rule inheritList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 79)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:378:2:
			// ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true]
			// inheritList ) | )
			int alt71 = 2;
			int LA71_0 = input.LA(1);

			if (((LA71_0 >= EXTENDS && LA71_0 <= IMPLEMENTS))) {
				alt71 = 1;
			} else if ((LA71_0 == LBRACE)) {
				alt71 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 71, 0,
						input);

				throw nvae;
			}
			switch (alt71) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:378:4:
				// inheritList
			{
				pushFollow(FOLLOW_inheritList_in_inheritListOpt3922);
				inheritList382 = inheritList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_inheritList.add(inheritList382.getTree());

				// AST REWRITE
				// elements: inheritList
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 378:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true]
					// inheritList )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:378:18:
						// ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true]
						// inheritList )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(INHERIT_LIST_OPT,
											"INHERIT_LIST_OPT", true), root_1);

							adaptor.addChild(root_1, stream_inheritList
									.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:380:6:
			{
				root_0 = (Object) adaptor.nil();

			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 79, inheritListOpt_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inheritListOpt"

	public static class inherit_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "inherit"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:1:
	// inherit : ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^(
	// IMPLEMENTS type ) );
	public final TinyHaxeTry1Parser.inherit_return inherit()
			throws RecognitionException {
		TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
		retval.start = input.LT(1);
		int inherit_StartIndex = input.index();
		Object root_0 = null;

		Token EXTENDS383 = null;
		Token IMPLEMENTS385 = null;
		TinyHaxeTry1Parser.type_return type384 = null;

		TinyHaxeTry1Parser.type_return type386 = null;

		Object EXTENDS383_tree = null;
		Object IMPLEMENTS385_tree = null;
		RewriteRuleTokenStream stream_IMPLEMENTS = new RewriteRuleTokenStream(
				adaptor, "token IMPLEMENTS");
		RewriteRuleTokenStream stream_EXTENDS = new RewriteRuleTokenStream(
				adaptor, "token EXTENDS");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
				adaptor, "rule type");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 80)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:9:
			// ( EXTENDS type -> ^( EXTENDS type ) | IMPLEMENTS type -> ^(
			// IMPLEMENTS type ) )
			int alt72 = 2;
			int LA72_0 = input.LA(1);

			if ((LA72_0 == EXTENDS)) {
				alt72 = 1;
			} else if ((LA72_0 == IMPLEMENTS)) {
				alt72 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 72, 0,
						input);

				throw nvae;
			}
			switch (alt72) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:11:
				// EXTENDS type
			{
				EXTENDS383 = (Token) match(input, EXTENDS,
						FOLLOW_EXTENDS_in_inherit3956);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_EXTENDS.add(EXTENDS383);

				pushFollow(FOLLOW_type_in_inherit3958);
				type384 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type384.getTree());

				// AST REWRITE
				// elements: EXTENDS, type
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 382:24: -> ^( EXTENDS type )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:382:27:
						// ^( EXTENDS type )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_EXTENDS
									.nextNode(), root_1);

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:383:11:
				// IMPLEMENTS type
			{
				IMPLEMENTS385 = (Token) match(input, IMPLEMENTS,
						FOLLOW_IMPLEMENTS_in_inherit3978);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IMPLEMENTS.add(IMPLEMENTS385);

				pushFollow(FOLLOW_type_in_inherit3980);
				type386 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type386.getTree());

				// AST REWRITE
				// elements: type, IMPLEMENTS
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 383:27: -> ^( IMPLEMENTS type )
					{
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:383:30:
						// ^( IMPLEMENTS type )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_IMPLEMENTS.nextNode(), root_1);

							adaptor.addChild(root_1, stream_type.nextTree());

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 80, inherit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "inherit"

	public static class typedefDecl_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typedefDecl"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:386:1:
	// typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
	public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
		retval.start = input.LT(1);
		int typedefDecl_StartIndex = input.index();
		Object root_0 = null;

		Token TYPEDEF387 = null;
		Token IDENTIFIER388 = null;
		Token EQ389 = null;
		TinyHaxeTry1Parser.funcType_return funcType390 = null;

		Object TYPEDEF387_tree = null;
		Object IDENTIFIER388_tree = null;
		Object EQ389_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 81)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:387:2:
			// ( TYPEDEF IDENTIFIER EQ funcType )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:387:4:
			// TYPEDEF IDENTIFIER EQ funcType
			{
				root_0 = (Object) adaptor.nil();

				TYPEDEF387 = (Token) match(input, TYPEDEF,
						FOLLOW_TYPEDEF_in_typedefDecl4007);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					TYPEDEF387_tree = (Object) adaptor.create(TYPEDEF387);
					adaptor.addChild(root_0, TYPEDEF387_tree);
				}
				IDENTIFIER388 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typedefDecl4009);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER388_tree = (Object) adaptor.create(IDENTIFIER388);
					adaptor.addChild(root_0, IDENTIFIER388_tree);
				}
				EQ389 = (Token) match(input, EQ, FOLLOW_EQ_in_typedefDecl4011);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					EQ389_tree = (Object) adaptor.create(EQ389);
					adaptor.addChild(root_0, EQ389_tree);
				}
				pushFollow(FOLLOW_funcType_in_typedefDecl4013);
				funcType390 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType390.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 81, typedefDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typedefDecl"

	public static class typeExtend_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "typeExtend"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:390:1:
	// typeExtend : GT funcType COMMA ;
	public final TinyHaxeTry1Parser.typeExtend_return typeExtend()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
		retval.start = input.LT(1);
		int typeExtend_StartIndex = input.index();
		Object root_0 = null;

		Token GT391 = null;
		Token COMMA393 = null;
		TinyHaxeTry1Parser.funcType_return funcType392 = null;

		Object GT391_tree = null;
		Object COMMA393_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 82)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:391:9:
			// ( GT funcType COMMA )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:391:11:
			// GT funcType COMMA
			{
				root_0 = (Object) adaptor.nil();

				GT391 = (Token) match(input, GT, FOLLOW_GT_in_typeExtend4032);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					GT391_tree = (Object) adaptor.create(GT391);
					adaptor.addChild(root_0, GT391_tree);
				}
				pushFollow(FOLLOW_funcType_in_typeExtend4034);
				funcType392 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType392.getTree());
				COMMA393 = (Token) match(input, COMMA,
						FOLLOW_COMMA_in_typeExtend4036);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 82, typeExtend_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "typeExtend"

	public static class anonType_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "anonType"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:394:1:
	// anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
	// anonTypeFieldList | varDeclList ) ) RBRACE ;
	public final TinyHaxeTry1Parser.anonType_return anonType()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
		retval.start = input.LT(1);
		int anonType_StartIndex = input.index();
		Object root_0 = null;

		Token LBRACE394 = null;
		Token RBRACE400 = null;
		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList395 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList396 = null;

		TinyHaxeTry1Parser.typeExtend_return typeExtend397 = null;

		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList398 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList399 = null;

		Object LBRACE394_tree = null;
		Object RBRACE400_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 83)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:394:9:
			// ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:394:11:
			// LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE
			{
				root_0 = (Object) adaptor.nil();

				LBRACE394 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_anonType4047);
				if (state.failed)
					return retval;
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:395:4:
				// ( | anonTypeFieldList | varDeclList | typeExtend ( |
				// anonTypeFieldList | varDeclList ) )
				int alt74 = 4;
				switch (input.LA(1)) {
				case RBRACE: {
					alt74 = 1;
				}
					break;
				case IDENTIFIER: {
					alt74 = 2;
				}
					break;
				case PUBLIC:
				case PRIVATE:
				case STATIC:
				case INLINE:
				case DYNAMIC:
				case OVERRIDE:
				case VAR: {
					alt74 = 3;
				}
					break;
				case GT: {
					alt74 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							74, 0, input);

					throw nvae;
				}

				switch (alt74) {
				case 1:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:396:22:
				{
				}
					break;
				case 2:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:396:27:
					// anonTypeFieldList
				{
					pushFollow(FOLLOW_anonTypeFieldList_in_anonType4082);
					anonTypeFieldList395 = anonTypeFieldList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor
								.addChild(root_0, anonTypeFieldList395
										.getTree());

				}
					break;
				case 3:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:397:26:
					// varDeclList
				{
					pushFollow(FOLLOW_varDeclList_in_anonType4110);
					varDeclList396 = varDeclList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, varDeclList396.getTree());

				}
					break;
				case 4:
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:398:27:
					// typeExtend ( | anonTypeFieldList | varDeclList )
				{
					pushFollow(FOLLOW_typeExtend_in_anonType4139);
					typeExtend397 = typeExtend();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, typeExtend397.getTree());
					// C:\\Documents and
					// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:398:38:
					// ( | anonTypeFieldList | varDeclList )
					int alt73 = 3;
					switch (input.LA(1)) {
					case RBRACE: {
						alt73 = 1;
					}
						break;
					case IDENTIFIER: {
						alt73 = 2;
					}
						break;
					case PUBLIC:
					case PRIVATE:
					case STATIC:
					case INLINE:
					case DYNAMIC:
					case OVERRIDE:
					case VAR: {
						alt73 = 3;
					}
						break;
					default:
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 73, 0, input);

						throw nvae;
					}

					switch (alt73) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:399:24:
					{
					}
						break;
					case 2:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:399:25:
						// anonTypeFieldList
					{
						pushFollow(FOLLOW_anonTypeFieldList_in_anonType4167);
						anonTypeFieldList398 = anonTypeFieldList();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, anonTypeFieldList398
									.getTree());

					}
						break;
					case 3:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:400:25:
						// varDeclList
					{
						pushFollow(FOLLOW_varDeclList_in_anonType4193);
						varDeclList399 = varDeclList();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, varDeclList399.getTree());

					}
						break;

					}

				}
					break;

				}

				RBRACE400 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_anonType4237);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 83, anonType_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonType"

	public static class anonTypeFieldList_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "anonTypeFieldList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:405:1:
	// anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
	public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
		retval.start = input.LT(1);
		int anonTypeFieldList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA402 = null;
		TinyHaxeTry1Parser.anonTypeField_return anonTypeField401 = null;

		TinyHaxeTry1Parser.anonTypeField_return anonTypeField403 = null;

		Object COMMA402_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 84)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:2:
			// ( anonTypeField ( COMMA anonTypeField )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:4:
			// anonTypeField ( COMMA anonTypeField )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4251);
				anonTypeField401 = anonTypeField();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, anonTypeField401.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:18:
				// ( COMMA anonTypeField )*
				loop75: do {
					int alt75 = 2;
					int LA75_0 = input.LA(1);

					if ((LA75_0 == COMMA)) {
						alt75 = 1;
					}

					switch (alt75) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:406:19:
						// COMMA anonTypeField
					{
						COMMA402 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_anonTypeFieldList4254);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4257);
						anonTypeField403 = anonTypeField();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor
									.addChild(root_0, anonTypeField403
											.getTree());

					}
						break;

					default:
						break loop75;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 84, anonTypeFieldList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonTypeFieldList"

	public static class objLit_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "objLit"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:409:1:
	// objLit : '{' objLitElemList '}' ;
	public final TinyHaxeTry1Parser.objLit_return objLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
		retval.start = input.LT(1);
		int objLit_StartIndex = input.index();
		Object root_0 = null;

		Token char_literal404 = null;
		Token char_literal406 = null;
		TinyHaxeTry1Parser.objLitElemList_return objLitElemList405 = null;

		Object char_literal404_tree = null;
		Object char_literal406_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 85)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:409:8:
			// ( '{' objLitElemList '}' )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:409:10:
			// '{' objLitElemList '}'
			{
				root_0 = (Object) adaptor.nil();

				char_literal404 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_objLit4269);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_objLitElemList_in_objLit4272);
				objLitElemList405 = objLitElemList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLitElemList405.getTree());
				char_literal406 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_objLit4274);
				if (state.failed)
					return retval;

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 85, objLit_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLit"

	public static class anonTypeField_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "anonTypeField"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:412:1:
	// anonTypeField : IDENTIFIER COLON funcType ;
	public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
		retval.start = input.LT(1);
		int anonTypeField_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER407 = null;
		Token COLON408 = null;
		TinyHaxeTry1Parser.funcType_return funcType409 = null;

		Object IDENTIFIER407_tree = null;
		Object COLON408_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 86)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:413:2:
			// ( IDENTIFIER COLON funcType )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:413:4:
			// IDENTIFIER COLON funcType
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER407 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_anonTypeField4286);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER407_tree = (Object) adaptor.create(IDENTIFIER407);
					adaptor.addChild(root_0, IDENTIFIER407_tree);
				}
				COLON408 = (Token) match(input, COLON,
						FOLLOW_COLON_in_anonTypeField4288);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_funcType_in_anonTypeField4291);
				funcType409 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType409.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 86, anonTypeField_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "anonTypeField"

	public static class objLitElemList_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "objLitElemList"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:416:1:
	// objLitElemList : objLitElem ( COMMA objLitElem )* ;
	public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
		retval.start = input.LT(1);
		int objLitElemList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA411 = null;
		TinyHaxeTry1Parser.objLitElem_return objLitElem410 = null;

		TinyHaxeTry1Parser.objLitElem_return objLitElem412 = null;

		Object COMMA411_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 87)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:2:
			// ( objLitElem ( COMMA objLitElem )* )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:4:
			// objLitElem ( COMMA objLitElem )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_objLitElem_in_objLitElemList4307);
				objLitElem410 = objLitElem();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLitElem410.getTree());
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:15:
				// ( COMMA objLitElem )*
				loop76: do {
					int alt76 = 2;
					int LA76_0 = input.LA(1);

					if ((LA76_0 == COMMA)) {
						alt76 = 1;
					}

					switch (alt76) {
					case 1:
						// C:\\Documents and
						// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:417:16:
						// COMMA objLitElem
					{
						COMMA411 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_objLitElemList4310);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_objLitElem_in_objLitElemList4313);
						objLitElem412 = objLitElem();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, objLitElem412.getTree());

					}
						break;

					default:
						break loop76;
					}
				} while (true);

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 87, objLitElemList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLitElemList"

	public static class objLitElem_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "objLitElem"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:420:1:
	// objLitElem : IDENTIFIER COLON expr ;
	public final TinyHaxeTry1Parser.objLitElem_return objLitElem()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
		retval.start = input.LT(1);
		int objLitElem_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER413 = null;
		Token COLON414 = null;
		TinyHaxeTry1Parser.expr_return expr415 = null;

		Object IDENTIFIER413_tree = null;
		Object COLON414_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 88)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:421:9:
			// ( IDENTIFIER COLON expr )
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:421:11:
			// IDENTIFIER COLON expr
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER413 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_objLitElem4334);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER413_tree = (Object) adaptor.create(IDENTIFIER413);
					adaptor.addChild(root_0, IDENTIFIER413_tree);
				}
				COLON414 = (Token) match(input, COLON,
						FOLLOW_COLON_in_objLitElem4336);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_expr_in_objLitElem4339);
				expr415 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr415.getTree());

			}

			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 88, objLitElem_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "objLitElem"

	public static class elementarySymbol_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "elementarySymbol"
	// C:\\Documents and
	// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:424:1:
	// elementarySymbol : ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] |
	// INTLITERAL -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL ->
	// STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL ->
	// CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM -> FLOATNUM[$FLOATNUM,
	// \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] | FALSE ->
	// FALSE[$FALSE,\"BOOL\"] );
	public final TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol()
			throws RecognitionException {
		TinyHaxeTry1Parser.elementarySymbol_return retval = new TinyHaxeTry1Parser.elementarySymbol_return();
		retval.start = input.LT(1);
		int elementarySymbol_StartIndex = input.index();
		Object root_0 = null;

		Token LONGLITERAL416 = null;
		Token INTLITERAL417 = null;
		Token STRINGLITERAL418 = null;
		Token CHARLITERAL419 = null;
		Token FLOATNUM420 = null;
		Token TRUE421 = null;
		Token FALSE422 = null;

		Object LONGLITERAL416_tree = null;
		Object INTLITERAL417_tree = null;
		Object STRINGLITERAL418_tree = null;
		Object CHARLITERAL419_tree = null;
		Object FLOATNUM420_tree = null;
		Object TRUE421_tree = null;
		Object FALSE422_tree = null;
		RewriteRuleTokenStream stream_INTLITERAL = new RewriteRuleTokenStream(
				adaptor, "token INTLITERAL");
		RewriteRuleTokenStream stream_FALSE = new RewriteRuleTokenStream(
				adaptor, "token FALSE");
		RewriteRuleTokenStream stream_TRUE = new RewriteRuleTokenStream(
				adaptor, "token TRUE");
		RewriteRuleTokenStream stream_FLOATNUM = new RewriteRuleTokenStream(
				adaptor, "token FLOATNUM");
		RewriteRuleTokenStream stream_STRINGLITERAL = new RewriteRuleTokenStream(
				adaptor, "token STRINGLITERAL");
		RewriteRuleTokenStream stream_CHARLITERAL = new RewriteRuleTokenStream(
				adaptor, "token CHARLITERAL");
		RewriteRuleTokenStream stream_LONGLITERAL = new RewriteRuleTokenStream(
				adaptor, "token LONGLITERAL");

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 89)) {
				return retval;
			}
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:2:
			// ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL
			// -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL ->
			// STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL ->
			// CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM ->
			// FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] |
			// FALSE -> FALSE[$FALSE,\"BOOL\"] )
			int alt77 = 7;
			switch (input.LA(1)) {
			case LONGLITERAL: {
				alt77 = 1;
			}
				break;
			case INTLITERAL: {
				alt77 = 2;
			}
				break;
			case STRINGLITERAL: {
				alt77 = 3;
			}
				break;
			case CHARLITERAL: {
				alt77 = 4;
			}
				break;
			case FLOATNUM: {
				alt77 = 5;
			}
				break;
			case TRUE: {
				alt77 = 6;
			}
				break;
			case FALSE: {
				alt77 = 7;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 77, 0,
						input);

				throw nvae;
			}

			switch (alt77) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:425:4:
				// LONGLITERAL
			{
				LONGLITERAL416 = (Token) match(input, LONGLITERAL,
						FOLLOW_LONGLITERAL_in_elementarySymbol4351);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LONGLITERAL.add(LONGLITERAL416);

				// AST REWRITE
				// elements: LONGLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 425:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
					{
						adaptor.addChild(root_0, new VarUsage(LONGLITERAL,
								LONGLITERAL416, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:426:4:
				// INTLITERAL
			{
				INTLITERAL417 = (Token) match(input, INTLITERAL,
						FOLLOW_INTLITERAL_in_elementarySymbol4364);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_INTLITERAL.add(INTLITERAL417);

				// AST REWRITE
				// elements: INTLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 426:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
					{
						adaptor.addChild(root_0, new VarUsage(INTLITERAL,
								INTLITERAL417, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:427:4:
				// STRINGLITERAL
			{
				STRINGLITERAL418 = (Token) match(input, STRINGLITERAL,
						FOLLOW_STRINGLITERAL_in_elementarySymbol4377);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_STRINGLITERAL.add(STRINGLITERAL418);

				// AST REWRITE
				// elements: STRINGLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 427:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
					{
						adaptor.addChild(root_0, new VarUsage(STRINGLITERAL,
								STRINGLITERAL418, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:428:4:
				// CHARLITERAL
			{
				CHARLITERAL419 = (Token) match(input, CHARLITERAL,
						FOLLOW_CHARLITERAL_in_elementarySymbol4390);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CHARLITERAL.add(CHARLITERAL419);

				// AST REWRITE
				// elements: CHARLITERAL
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 428:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
					{
						adaptor.addChild(root_0, new VarUsage(CHARLITERAL,
								CHARLITERAL419, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:429:4:
				// FLOATNUM
			{
				FLOATNUM420 = (Token) match(input, FLOATNUM,
						FOLLOW_FLOATNUM_in_elementarySymbol4403);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FLOATNUM.add(FLOATNUM420);

				// AST REWRITE
				// elements: FLOATNUM
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 429:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
					{
						adaptor.addChild(root_0, new VarUsage(FLOATNUM,
								FLOATNUM420, "FLOAT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:430:4:
				// TRUE
			{
				TRUE421 = (Token) match(input, TRUE,
						FOLLOW_TRUE_in_elementarySymbol4416);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_TRUE.add(TRUE421);

				// AST REWRITE
				// elements: TRUE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 430:10: -> TRUE[$TRUE,\"BOOL\"]
					{
						adaptor.addChild(root_0, new VarUsage(TRUE, TRUE421,
								"BOOL"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:431:4:
				// FALSE
			{
				FALSE422 = (Token) match(input, FALSE,
						FOLLOW_FALSE_in_elementarySymbol4430);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FALSE.add(FALSE422);

				// AST REWRITE
				// elements: FALSE
				// token labels:
				// rule labels: retval
				// token list labels:
				// rule list labels:
				// wildcard labels:
				if (state.backtracking == 0) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
							adaptor, "rule retval",
							retval != null ? retval.tree : null);

					root_0 = (Object) adaptor.nil();
					// 431:11: -> FALSE[$FALSE,\"BOOL\"]
					{
						adaptor.addChild(root_0, new VarUsage(FALSE, FALSE422,
								"BOOL"));

					}

					retval.tree = root_0;
				}
			}
				break;

			}
			retval.stop = input.LT(-1);

			if (state.backtracking == 0) {

				retval.tree = (Object) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start,
						retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (Object) adaptor.errorNode(input, retval.start, input
					.LT(-1), re);

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 89, elementarySymbol_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "elementarySymbol"

	// $ANTLR start synpred35_TinyHaxeTry1
	public final void synpred35_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:21:
		// ( typeParam )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:172:21:
		// typeParam
		{
			pushFollow(FOLLOW_typeParam_in_synpred35_TinyHaxeTry11467);
			typeParam();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred35_TinyHaxeTry1

	// $ANTLR start synpred36_TinyHaxeTry1
	public final void synpred36_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:9:
		// ( block )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:179:9:
		// block
		{
			pushFollow(FOLLOW_block_in_synpred36_TinyHaxeTry11536);
			block();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred36_TinyHaxeTry1

	// $ANTLR start synpred37_TinyHaxeTry1
	public final void synpred37_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:180:7:
		// ( assignExpr SEMI )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:180:7:
		// assignExpr SEMI
		{
			pushFollow(FOLLOW_assignExpr_in_synpred37_TinyHaxeTry11544);
			assignExpr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SEMI, FOLLOW_SEMI_in_synpred37_TinyHaxeTry11546);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred37_TinyHaxeTry1

	// $ANTLR start synpred39_TinyHaxeTry1
	public final void synpred39_TinyHaxeTry1_fragment()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return st2 = null;

		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:41:
		// ( ELSE st2= statement )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:182:41:
		// ELSE st2= statement
		{
			match(input, ELSE, FOLLOW_ELSE_in_synpred39_TinyHaxeTry11574);
			if (state.failed)
				return;
			pushFollow(FOLLOW_statement_in_synpred39_TinyHaxeTry11578);
			st2 = statement();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred39_TinyHaxeTry1

	// $ANTLR start synpred47_TinyHaxeTry1
	public final void synpred47_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:17:
		// ( expr )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:188:17:
		// expr
		{
			pushFollow(FOLLOW_expr_in_synpred47_TinyHaxeTry11792);
			expr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred47_TinyHaxeTry1

	// $ANTLR start synpred54_TinyHaxeTry1
	public final void synpred54_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:9:
		// ( expr SEMI )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:192:9:
		// expr SEMI
		{
			pushFollow(FOLLOW_expr_in_synpred54_TinyHaxeTry11888);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SEMI, FOLLOW_SEMI_in_synpred54_TinyHaxeTry11891);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred54_TinyHaxeTry1

	// $ANTLR start synpred55_TinyHaxeTry1
	public final void synpred55_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:193:9:
		// ( IDENTIFIER COLON statement )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:193:9:
		// IDENTIFIER COLON statement
		{
			match(input, IDENTIFIER,
					FOLLOW_IDENTIFIER_in_synpred55_TinyHaxeTry11902);
			if (state.failed)
				return;
			match(input, COLON, FOLLOW_COLON_in_synpred55_TinyHaxeTry11904);
			if (state.failed)
				return;
			pushFollow(FOLLOW_statement_in_synpred55_TinyHaxeTry11906);
			statement();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred55_TinyHaxeTry1

	// $ANTLR start synpred58_TinyHaxeTry1
	public final void synpred58_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:4:
		// ( varDecl )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:206:4:
		// varDecl
		{
			pushFollow(FOLLOW_varDecl_in_synpred58_TinyHaxeTry12016);
			varDecl();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred58_TinyHaxeTry1

	// $ANTLR start synpred62_TinyHaxeTry1
	public final void synpred62_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:21:
		// ( exprList )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:230:21:
		// exprList
		{
			pushFollow(FOLLOW_exprList_in_synpred62_TinyHaxeTry12228);
			exprList();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred62_TinyHaxeTry1

	// $ANTLR start synpred90_TinyHaxeTry1
	public final void synpred90_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:21:
		// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:259:21:
		// ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
		{
			if (input.LA(1) == BANG || input.LA(1) == SUB
					|| (input.LA(1) >= SUBSUB && input.LA(1) <= TILDE)) {
				input.consume();
				state.errorRecovery = false;
				state.failed = false;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				MismatchedSetException mse = new MismatchedSetException(null,
						input);
				throw mse;
			}

			pushFollow(FOLLOW_prefixExpr_in_synpred90_TinyHaxeTry12676);
			prefixExpr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred90_TinyHaxeTry1

	// $ANTLR start synpred93_TinyHaxeTry1
	public final void synpred93_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:4:
		// ( value LPAREN exprListOpt RPAREN )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:266:4:
		// value LPAREN exprListOpt RPAREN
		{
			pushFollow(FOLLOW_value_in_synpred93_TinyHaxeTry12773);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred93_TinyHaxeTry12775);
			if (state.failed)
				return;
			pushFollow(FOLLOW_exprListOpt_in_synpred93_TinyHaxeTry12777);
			exprListOpt();

			state._fsp--;
			if (state.failed)
				return;
			match(input, RPAREN, FOLLOW_RPAREN_in_synpred93_TinyHaxeTry12779);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred93_TinyHaxeTry1

	// $ANTLR start synpred94_TinyHaxeTry1
	public final void synpred94_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:267:4:
		// ( value LBRACKET expr RBRACKET )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:267:4:
		// value LBRACKET expr RBRACKET
		{
			pushFollow(FOLLOW_value_in_synpred94_TinyHaxeTry12799);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, LBRACKET,
					FOLLOW_LBRACKET_in_synpred94_TinyHaxeTry12801);
			if (state.failed)
				return;
			pushFollow(FOLLOW_expr_in_synpred94_TinyHaxeTry12803);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, RBRACKET,
					FOLLOW_RBRACKET_in_synpred94_TinyHaxeTry12805);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred94_TinyHaxeTry1

	// $ANTLR start synpred95_TinyHaxeTry1
	public final void synpred95_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:4:
		// ( value PLUSPLUS )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:268:4:
		// value PLUSPLUS
		{
			pushFollow(FOLLOW_value_in_synpred95_TinyHaxeTry12810);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, PLUSPLUS,
					FOLLOW_PLUSPLUS_in_synpred95_TinyHaxeTry12812);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred95_TinyHaxeTry1

	// $ANTLR start synpred96_TinyHaxeTry1
	public final void synpred96_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:269:4:
		// ( value SUBSUB )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:269:4:
		// value SUBSUB
		{
			pushFollow(FOLLOW_value_in_synpred96_TinyHaxeTry12830);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SUBSUB, FOLLOW_SUBSUB_in_synpred96_TinyHaxeTry12832);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred96_TinyHaxeTry1

	// $ANTLR start synpred98_TinyHaxeTry1
	public final void synpred98_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:4:
		// ( arrayLit )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:274:4:
		// arrayLit
		{
			pushFollow(FOLLOW_arrayLit_in_synpred98_TinyHaxeTry12868);
			arrayLit();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred98_TinyHaxeTry1

	// $ANTLR start synpred102_TinyHaxeTry1
	public final void synpred102_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:23:
		// ( expr )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:23:
		// expr
		{
			pushFollow(FOLLOW_expr_in_synpred102_TinyHaxeTry12932);
			expr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred102_TinyHaxeTry1

	// $ANTLR start synpred103_TinyHaxeTry1
	public final void synpred103_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:14:
		// ( LPAREN ( expr | statement ) RPAREN )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:14:
		// LPAREN ( expr | statement ) RPAREN
		{
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred103_TinyHaxeTry12928);
			if (state.failed)
				return;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:22:
			// ( expr | statement )
			int alt87 = 2;
			alt87 = dfa87.predict(input);
			switch (alt87) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:23:
				// expr
			{
				pushFollow(FOLLOW_expr_in_synpred103_TinyHaxeTry12932);
				expr();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;
			case 2:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:278:28:
				// statement
			{
				pushFollow(FOLLOW_statement_in_synpred103_TinyHaxeTry12934);
				statement();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;

			}

			match(input, RPAREN, FOLLOW_RPAREN_in_synpred103_TinyHaxeTry12937);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred103_TinyHaxeTry1

	// $ANTLR start synpred106_TinyHaxeTry1
	public final void synpred106_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:11:
		// ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
		// C:\\Documents and
		// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:11:
		// CAST LPAREN expr ( COMMA funcType )? RPAREN
		{
			match(input, CAST, FOLLOW_CAST_in_synpred106_TinyHaxeTry13024);
			if (state.failed)
				return;
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13026);
			if (state.failed)
				return;
			pushFollow(FOLLOW_expr_in_synpred106_TinyHaxeTry13028);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			// C:\\Documents and
			// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:28:
			// ( COMMA funcType )?
			int alt88 = 2;
			int LA88_0 = input.LA(1);

			if ((LA88_0 == COMMA)) {
				alt88 = 1;
			}
			switch (alt88) {
			case 1:
				// C:\\Documents and
				// Settings\\kondratyev\\workspace\\grammar-testing\\src\\TinyHaxeTry1.g:285:29:
				// COMMA funcType
			{
				match(input, COMMA, FOLLOW_COMMA_in_synpred106_TinyHaxeTry13031);
				if (state.failed)
					return;
				pushFollow(FOLLOW_funcType_in_synpred106_TinyHaxeTry13033);
				funcType();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;

			}

			match(input, RPAREN, FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13037);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred106_TinyHaxeTry1

	// Delegated rules

	public final boolean synpred95_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred95_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred106_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred106_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred47_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred58_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred55_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred35_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred96_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred96_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred36_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred36_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred102_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred102_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred62_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred37_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred103_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred103_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred54_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred94_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred94_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred39_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred39_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred98_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred98_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred93_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred93_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred90_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	protected DFA23 dfa23 = new DFA23(this);
	protected DFA29 dfa29 = new DFA29(this);
	protected DFA32 dfa32 = new DFA32(this);
	protected DFA51 dfa51 = new DFA51(this);
	protected DFA53 dfa53 = new DFA53(this);
	protected DFA52 dfa52 = new DFA52(this);
	protected DFA65 dfa65 = new DFA65(this);
	protected DFA66 dfa66 = new DFA66(this);
	protected DFA68 dfa68 = new DFA68(this);
	protected DFA69 dfa69 = new DFA69(this);
	protected DFA87 dfa87 = new DFA87(this);
	static final String DFA23_eotS = "\51\uffff";
	static final String DFA23_eofS = "\1\2\50\uffff";
	static final String DFA23_minS = "\1\20\1\0\47\uffff";
	static final String DFA23_maxS = "\1\141\1\0\47\uffff";
	static final String DFA23_acceptS = "\2\uffff\1\2\45\uffff\1\1";
	static final String DFA23_specialS = "\1\uffff\1\0\47\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\2\11\uffff\10\2\1\uffff\2\2\1\uffff\1\2\6\uffff\1\2\2\uffff"
					+ "\1\1\1\2\3\uffff\1\2\4\uffff\2\2\7\uffff\22\2\13\uffff\2\2",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "" };

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA
			.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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
			return "172:1: typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] typeParam ) | );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA23_1 = input.LA(1);

				int index23_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred35_TinyHaxeTry1())) {
					s = 40;
				}

				else if ((true)) {
					s = 2;
				}

				input.seek(index23_1);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA29_eotS = "\104\uffff";
	static final String DFA29_eofS = "\104\uffff";
	static final String DFA29_minS = "\1\20\56\0\25\uffff";
	static final String DFA29_maxS = "\1\151\56\0\25\uffff";
	static final String DFA29_acceptS = "\57\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"
			+ "\1\15\1\1\1\2\1\16\1\20\1\17";
	static final String DFA29_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\25\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\2\1\21\2\uffff\6\57\1\uffff\1\47\1\51\1\52\1\53\1\54\1\55"
					+ "\1\56\1\6\1\20\1\uffff\1\7\2\uffff\1\31\7\uffff\1\24\1\44\1"
					+ "\65\1\uffff\1\66\1\uffff\1\67\1\70\1\71\1\72\1\1\1\uffff\1\73"
					+ "\1\74\1\75\1\76\3\uffff\1\50\1\46\1\45\1\40\1\41\1\42\1\43\1"
					+ "\35\1\36\1\37\1\32\1\33\1\34\1\30\1\23\1\25\1\26\1\27\1\22\1"
					+ "\3\1\31\1\10\1\4\1\5\1\uffff\1\57\6\uffff\1\11\1\12\1\13\1\14"
					+ "\1\15\1\16\1\17", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA
			.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "178:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) statement ) | WHILE parExpression statement -> ^( WHILE parExpression statement ) | DO statement WHILE parExpression SEMI -> ^( DO parExpression statement ) | TRY block catchStmtList -> ^( TRY block catchStmtList ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH expr ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW expr ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON IDENTIFIER statement ) | SEMI );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA29_1 = input.LA(1);

				int index29_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred36_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA29_2 = input.LA(1);

				int index29_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred36_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 66;
				}

				input.seek(index29_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA29_3 = input.LA(1);

				int index29_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA29_4 = input.LA(1);

				int index29_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA29_5 = input.LA(1);

				int index29_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA29_6 = input.LA(1);

				int index29_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA29_7 = input.LA(1);

				int index29_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA29_8 = input.LA(1);

				int index29_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA29_9 = input.LA(1);

				int index29_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA29_10 = input.LA(1);

				int index29_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA29_11 = input.LA(1);

				int index29_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA29_12 = input.LA(1);

				int index29_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA29_13 = input.LA(1);

				int index29_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA29_14 = input.LA(1);

				int index29_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA29_15 = input.LA(1);

				int index29_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA29_16 = input.LA(1);

				int index29_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA29_17 = input.LA(1);

				int index29_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((synpred55_TinyHaxeTry1())) {
					s = 67;
				}

				input.seek(index29_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA29_18 = input.LA(1);

				int index29_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA29_19 = input.LA(1);

				int index29_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA29_20 = input.LA(1);

				int index29_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA29_21 = input.LA(1);

				int index29_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA29_22 = input.LA(1);

				int index29_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA29_23 = input.LA(1);

				int index29_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA29_24 = input.LA(1);

				int index29_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA29_25 = input.LA(1);

				int index29_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA29_26 = input.LA(1);

				int index29_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA29_27 = input.LA(1);

				int index29_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA29_28 = input.LA(1);

				int index29_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA29_29 = input.LA(1);

				int index29_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA29_30 = input.LA(1);

				int index29_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA29_31 = input.LA(1);

				int index29_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA29_32 = input.LA(1);

				int index29_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA29_33 = input.LA(1);

				int index29_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA29_34 = input.LA(1);

				int index29_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA29_35 = input.LA(1);

				int index29_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA29_36 = input.LA(1);

				int index29_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA29_37 = input.LA(1);

				int index29_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA29_38 = input.LA(1);

				int index29_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA29_39 = input.LA(1);

				int index29_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA29_40 = input.LA(1);

				int index29_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA29_41 = input.LA(1);

				int index29_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA29_42 = input.LA(1);

				int index29_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA29_43 = input.LA(1);

				int index29_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA29_44 = input.LA(1);

				int index29_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_44);
				if (s >= 0)
					return s;
				break;
			case 44:
				int LA29_45 = input.LA(1);

				int index29_45 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_45);
				if (s >= 0)
					return s;
				break;
			case 45:
				int LA29_46 = input.LA(1);

				int index29_46 = input.index();
				input.rewind();
				s = -1;
				if ((synpred37_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred54_TinyHaxeTry1())) {
					s = 65;
				}

				input.seek(index29_46);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA32_eotS = "\102\uffff";
	static final String DFA32_eofS = "\102\uffff";
	static final String DFA32_minS = "\1\20\6\0\73\uffff";
	static final String DFA32_maxS = "\1\151\6\0\73\uffff";
	static final String DFA32_acceptS = "\7\uffff\1\2\1\uffff\1\3\67\uffff\1\1";
	static final String DFA32_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\73\uffff}>";
	static final String[] DFA32_transitionS = {
			"\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"
					+ "\2\uffff\1\11\7\uffff\3\11\1\uffff\1\11\1\uffff\5\11\1\uffff"
					+ "\4\11\3\uffff\30\11\1\uffff\1\6\2\7\4\uffff\7\11",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA
			.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
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

		@Override
		public String getDescription() {
			return "205:1: blockStmt : ( varDecl | classDecl | statement );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA32_1 = input.LA(1);

				int index32_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA32_2 = input.LA(1);

				int index32_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA32_3 = input.LA(1);

				int index32_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA32_4 = input.LA(1);

				int index32_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA32_5 = input.LA(1);

				int index32_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA32_6 = input.LA(1);

				int index32_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred58_TinyHaxeTry1())) {
					s = 65;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index32_6);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA51_eotS = "\65\uffff";
	static final String DFA51_eofS = "\1\20\64\uffff";
	static final String DFA51_minS = "\1\20\15\0\47\uffff";
	static final String DFA51_maxS = "\1\151\15\0\47\uffff";
	static final String DFA51_acceptS = "\16\uffff\1\3\1\4\1\5\42\uffff\1\1\1\2";
	static final String DFA51_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\47\uffff}>";
	static final String[] DFA51_transitionS = {
			"\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\1\20\6\uffff\1"
					+ "\20\2\uffff\2\20\3\uffff\1\20\4\uffff\1\3\1\20\7\uffff\22\20"
					+ "\1\17\1\16\1\uffff\1\4\12\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"
					+ "\13", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
	static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
	static final char[] DFA51_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA51_minS);
	static final char[] DFA51_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA51_maxS);
	static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
	static final short[] DFA51_special = DFA
			.unpackEncodedString(DFA51_specialS);
	static final short[][] DFA51_transition;

	static {
		int numStates = DFA51_transitionS.length;
		DFA51_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
		}
	}

	class DFA51 extends DFA {

		public DFA51(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 51;
			this.eot = DFA51_eot;
			this.eof = DFA51_eof;
			this.min = DFA51_min;
			this.max = DFA51_max;
			this.accept = DFA51_accept;
			this.special = DFA51_special;
			this.transition = DFA51_transition;
		}

		@Override
		public String getDescription() {
			return "265:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value PLUSPLUS ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] value SUBSUB ) | value typeParamOpt );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA51_1 = input.LA(1);

				int index51_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA51_2 = input.LA(1);

				int index51_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA51_3 = input.LA(1);

				int index51_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA51_4 = input.LA(1);

				int index51_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA51_5 = input.LA(1);

				int index51_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA51_6 = input.LA(1);

				int index51_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA51_7 = input.LA(1);

				int index51_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA51_8 = input.LA(1);

				int index51_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA51_9 = input.LA(1);

				int index51_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA51_10 = input.LA(1);

				int index51_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA51_11 = input.LA(1);

				int index51_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA51_12 = input.LA(1);

				int index51_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA51_13 = input.LA(1);

				int index51_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred93_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred94_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((synpred95_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred96_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index51_13);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 51, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA53_eotS = "\65\uffff";
	static final String DFA53_eofS = "\1\16\64\uffff";
	static final String DFA53_minS = "\1\20\1\uffff\1\0\11\uffff\1\0\50\uffff";
	static final String DFA53_maxS = "\1\151\1\uffff\1\0\11\uffff\1\0\50\uffff";
	static final String DFA53_acceptS = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\44\uffff\1\2"
			+ "\1\6";
	static final String DFA53_specialS = "\2\uffff\1\0\11\uffff\1\1\50\uffff}>";
	static final String[] DFA53_transitionS = {
			"\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\1\16\6\uffff\1"
					+ "\16\2\uffff\2\16\3\uffff\1\16\4\uffff\1\3\1\16\7\uffff\24\16"
					+ "\1\uffff\1\4\12\uffff\7\5", "", "\1\uffff", "", "", "",
			"", "", "", "", "", "", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
	static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
	static final char[] DFA53_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA53_minS);
	static final char[] DFA53_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA53_maxS);
	static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
	static final short[] DFA53_special = DFA
			.unpackEncodedString(DFA53_specialS);
	static final short[][] DFA53_transition;

	static {
		int numStates = DFA53_transitionS.length;
		DFA53_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
		}
	}

	class DFA53 extends DFA {

		public DFA53(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "273:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA53_2 = input.LA(1);

				int index53_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred98_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index53_2);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA53_12 = input.LA(1);

				int index53_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred103_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index53_12);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 53, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA52_eotS = "\100\uffff";
	static final String DFA52_eofS = "\100\uffff";
	static final String DFA52_minS = "\1\20\55\0\22\uffff";
	static final String DFA52_maxS = "\1\151\55\0\22\uffff";
	static final String DFA52_acceptS = "\56\uffff\1\1\1\2\20\uffff";
	static final String DFA52_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\22\uffff}>";
	static final String[] DFA52_transitionS = {
			"\1\57\1\20\2\uffff\6\57\1\uffff\1\46\1\50\1\51\1\52\1\53\1"
					+ "\54\1\55\1\4\1\17\1\56\1\5\2\uffff\1\30\7\uffff\1\23\1\43\1"
					+ "\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1\47"
					+ "\1\45\1\44\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\32\1\33"
					+ "\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\2\1\3\1\uffff"
					+ "\1\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
	static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
	static final char[] DFA52_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA52_minS);
	static final char[] DFA52_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA52_maxS);
	static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
	static final short[] DFA52_special = DFA
			.unpackEncodedString(DFA52_specialS);
	static final short[][] DFA52_transition;

	static {
		int numStates = DFA52_transitionS.length;
		DFA52_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
		}
	}

	class DFA52 extends DFA {

		public DFA52(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 52;
			this.eot = DFA52_eot;
			this.eof = DFA52_eof;
			this.min = DFA52_min;
			this.max = DFA52_max;
			this.accept = DFA52_accept;
			this.special = DFA52_special;
			this.transition = DFA52_transition;
		}

		@Override
		public String getDescription() {
			return "278:22: ( expr | statement )";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA52_1 = input.LA(1);

				int index52_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA52_2 = input.LA(1);

				int index52_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA52_3 = input.LA(1);

				int index52_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA52_4 = input.LA(1);

				int index52_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA52_5 = input.LA(1);

				int index52_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA52_6 = input.LA(1);

				int index52_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA52_7 = input.LA(1);

				int index52_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA52_8 = input.LA(1);

				int index52_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA52_9 = input.LA(1);

				int index52_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA52_10 = input.LA(1);

				int index52_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA52_11 = input.LA(1);

				int index52_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA52_12 = input.LA(1);

				int index52_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA52_13 = input.LA(1);

				int index52_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA52_14 = input.LA(1);

				int index52_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA52_15 = input.LA(1);

				int index52_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA52_16 = input.LA(1);

				int index52_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA52_17 = input.LA(1);

				int index52_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA52_18 = input.LA(1);

				int index52_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA52_19 = input.LA(1);

				int index52_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA52_20 = input.LA(1);

				int index52_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA52_21 = input.LA(1);

				int index52_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA52_22 = input.LA(1);

				int index52_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA52_23 = input.LA(1);

				int index52_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA52_24 = input.LA(1);

				int index52_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA52_25 = input.LA(1);

				int index52_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA52_26 = input.LA(1);

				int index52_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA52_27 = input.LA(1);

				int index52_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA52_28 = input.LA(1);

				int index52_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA52_29 = input.LA(1);

				int index52_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA52_30 = input.LA(1);

				int index52_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA52_31 = input.LA(1);

				int index52_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA52_32 = input.LA(1);

				int index52_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA52_33 = input.LA(1);

				int index52_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA52_34 = input.LA(1);

				int index52_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA52_35 = input.LA(1);

				int index52_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA52_36 = input.LA(1);

				int index52_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA52_37 = input.LA(1);

				int index52_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA52_38 = input.LA(1);

				int index52_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA52_39 = input.LA(1);

				int index52_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA52_40 = input.LA(1);

				int index52_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA52_41 = input.LA(1);

				int index52_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA52_42 = input.LA(1);

				int index52_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA52_43 = input.LA(1);

				int index52_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA52_44 = input.LA(1);

				int index52_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_44);
				if (s >= 0)
					return s;
				break;
			case 44:
				int LA52_45 = input.LA(1);

				int index52_45 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index52_45);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 52, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA65_eotS = "\11\uffff";
	static final String DFA65_eofS = "\11\uffff";
	static final String DFA65_minS = "\6\24\1\21\2\uffff";
	static final String DFA65_maxS = "\6\42\1\131\2\uffff";
	static final String DFA65_acceptS = "\7\uffff\1\1\1\2";
	static final String DFA65_specialS = "\11\uffff}>";
	static final String[] DFA65_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6", "\1\10\107\uffff\1\7", "", "" };

	static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
	static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
	static final char[] DFA65_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA65_minS);
	static final char[] DFA65_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA65_maxS);
	static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
	static final short[] DFA65_special = DFA
			.unpackEncodedString(DFA65_specialS);
	static final short[][] DFA65_transition;

	static {
		int numStates = DFA65_transitionS.length;
		DFA65_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
		}
	}

	class DFA65 extends DFA {

		public DFA65(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 65;
			this.eot = DFA65_eot;
			this.eof = DFA65_eof;
			this.min = DFA65_min;
			this.max = DFA65_max;
			this.accept = DFA65_accept;
			this.special = DFA65_special;
			this.transition = DFA65_transition;
		}

		@Override
		public String getDescription() {
			return "336:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? block ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? block ( typeParamOpt )? ) );";
		}
	}

	static final String DFA66_eotS = "\14\uffff";
	static final String DFA66_eofS = "\14\uffff";
	static final String DFA66_minS = "\6\24\2\21\4\uffff";
	static final String DFA66_maxS = "\6\42\2\131\4\uffff";
	static final String DFA66_acceptS = "\10\uffff\1\3\1\4\1\2\1\1";
	static final String DFA66_specialS = "\14\uffff}>";
	static final String[] DFA66_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7", "\1\11\107\uffff\1\10",
			"\1\12\107\uffff\1\13", "", "", "", "" };

	static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
	static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
	static final char[] DFA66_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA66_minS);
	static final char[] DFA66_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA66_maxS);
	static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
	static final short[] DFA66_special = DFA
			.unpackEncodedString(DFA66_specialS);
	static final short[][] DFA66_transition;

	static {
		int numStates = DFA66_transitionS.length;
		DFA66_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
		}
	}

	class DFA66 extends DFA {

		public DFA66(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 66;
			this.eot = DFA66_eot;
			this.eof = DFA66_eof;
			this.min = DFA66_min;
			this.max = DFA66_max;
			this.accept = DFA66_accept;
			this.special = DFA66_special;
			this.transition = DFA66_transition;
		}

		@Override
		public String getDescription() {
			return "340:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt declAttrList ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt declAttrList typeParamOpt ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION NEW paramList typeTagOpt ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION IDENTIFIER paramList typeTagOpt typeParamOpt ) );";
		}
	}

	static final String DFA68_eotS = "\12\uffff";
	static final String DFA68_eofS = "\1\11\11\uffff";
	static final String DFA68_minS = "\6\24\4\uffff";
	static final String DFA68_maxS = "\6\134\4\uffff";
	static final String DFA68_acceptS = "\6\uffff\1\1\1\2\1\3\1\4";
	static final String DFA68_specialS = "\12\uffff}>";
	static final String[] DFA68_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"
					+ "\16\uffff\1\11\40\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6", "", "", "", "" };

	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
	static final char[] DFA68_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA68_minS);
	static final char[] DFA68_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA68_maxS);
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
	static final short[] DFA68_special = DFA
			.unpackEncodedString(DFA68_specialS);
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	class DFA68 extends DFA {

		public DFA68(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "355:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | );";
		}
	}

	static final String DFA69_eotS = "\12\uffff";
	static final String DFA69_eofS = "\1\11\11\uffff";
	static final String DFA69_minS = "\6\24\4\uffff";
	static final String DFA69_maxS = "\6\134\4\uffff";
	static final String DFA69_acceptS = "\6\uffff\1\1\1\2\1\3\1\4";
	static final String DFA69_specialS = "\12\uffff}>";
	static final String[] DFA69_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"
					+ "\16\uffff\1\11\40\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\71\uffff\1\6", "", "", "", "" };

	static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
	static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
	static final char[] DFA69_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA69_minS);
	static final char[] DFA69_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA69_maxS);
	static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
	static final short[] DFA69_special = DFA
			.unpackEncodedString(DFA69_specialS);
	static final short[][] DFA69_transition;

	static {
		int numStates = DFA69_transitionS.length;
		DFA69_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
		}
	}

	class DFA69 extends DFA {

		public DFA69(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 69;
			this.eot = DFA69_eot;
			this.eof = DFA69_eof;
			this.min = DFA69_min;
			this.max = DFA69_max;
			this.accept = DFA69_accept;
			this.special = DFA69_special;
			this.transition = DFA69_transition;
		}

		@Override
		public String getDescription() {
			return "366:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
		}
	}

	static final String DFA87_eotS = "\100\uffff";
	static final String DFA87_eofS = "\100\uffff";
	static final String DFA87_minS = "\1\20\55\0\22\uffff";
	static final String DFA87_maxS = "\1\151\55\0\22\uffff";
	static final String DFA87_acceptS = "\56\uffff\1\1\1\2\20\uffff";
	static final String DFA87_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\22\uffff}>";
	static final String[] DFA87_transitionS = {
			"\1\57\1\20\2\uffff\6\57\1\uffff\1\46\1\50\1\51\1\52\1\53\1"
					+ "\54\1\55\1\4\1\17\1\56\1\5\2\uffff\1\30\7\uffff\1\23\1\43\1"
					+ "\57\1\uffff\1\57\1\uffff\4\57\1\6\1\uffff\4\57\3\uffff\1\47"
					+ "\1\45\1\44\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31\1\32\1\33"
					+ "\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\2\1\3\1\uffff"
					+ "\1\57\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
	static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
	static final char[] DFA87_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA87_minS);
	static final char[] DFA87_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA87_maxS);
	static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
	static final short[] DFA87_special = DFA
			.unpackEncodedString(DFA87_specialS);
	static final short[][] DFA87_transition;

	static {
		int numStates = DFA87_transitionS.length;
		DFA87_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
		}
	}

	class DFA87 extends DFA {

		public DFA87(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 87;
			this.eot = DFA87_eot;
			this.eof = DFA87_eof;
			this.min = DFA87_min;
			this.max = DFA87_max;
			this.accept = DFA87_accept;
			this.special = DFA87_special;
			this.transition = DFA87_transition;
		}

		@Override
		public String getDescription() {
			return "278:22: ( expr | statement )";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA87_1 = input.LA(1);

				int index87_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA87_2 = input.LA(1);

				int index87_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA87_3 = input.LA(1);

				int index87_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA87_4 = input.LA(1);

				int index87_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA87_5 = input.LA(1);

				int index87_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA87_6 = input.LA(1);

				int index87_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA87_7 = input.LA(1);

				int index87_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA87_8 = input.LA(1);

				int index87_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA87_9 = input.LA(1);

				int index87_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA87_10 = input.LA(1);

				int index87_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA87_11 = input.LA(1);

				int index87_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA87_12 = input.LA(1);

				int index87_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA87_13 = input.LA(1);

				int index87_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA87_14 = input.LA(1);

				int index87_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA87_15 = input.LA(1);

				int index87_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA87_16 = input.LA(1);

				int index87_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA87_17 = input.LA(1);

				int index87_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA87_18 = input.LA(1);

				int index87_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA87_19 = input.LA(1);

				int index87_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA87_20 = input.LA(1);

				int index87_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA87_21 = input.LA(1);

				int index87_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA87_22 = input.LA(1);

				int index87_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA87_23 = input.LA(1);

				int index87_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA87_24 = input.LA(1);

				int index87_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA87_25 = input.LA(1);

				int index87_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA87_26 = input.LA(1);

				int index87_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA87_27 = input.LA(1);

				int index87_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA87_28 = input.LA(1);

				int index87_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA87_29 = input.LA(1);

				int index87_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA87_30 = input.LA(1);

				int index87_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA87_31 = input.LA(1);

				int index87_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA87_32 = input.LA(1);

				int index87_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA87_33 = input.LA(1);

				int index87_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA87_34 = input.LA(1);

				int index87_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA87_35 = input.LA(1);

				int index87_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA87_36 = input.LA(1);

				int index87_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA87_37 = input.LA(1);

				int index87_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA87_38 = input.LA(1);

				int index87_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA87_39 = input.LA(1);

				int index87_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA87_40 = input.LA(1);

				int index87_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA87_41 = input.LA(1);

				int index87_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA87_42 = input.LA(1);

				int index87_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA87_43 = input.LA(1);

				int index87_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA87_44 = input.LA(1);

				int index87_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_44);
				if (s >= 0)
					return s;
				break;
			case 44:
				int LA87_45 = input.LA(1);

				int index87_45 = input.index();
				input.rewind();
				s = -1;
				if ((synpred102_TinyHaxeTry1())) {
					s = 46;
				}

				else if ((true)) {
					s = 47;
				}

				input.seek(index87_45);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 87, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_myPackage_in_module119 = new BitSet(
			new long[] { 0x00001E8000080000L, 0x00000004E8000000L });
	public static final BitSet FOLLOW_topLevelList_in_module122 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_topLevel_in_topLevelList156 = new BitSet(
			new long[] { 0x00001E8000080002L, 0x00000004E8000000L });
	public static final BitSet FOLLOW_myImport_in_topLevel175 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_topLevel201 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_topLevelDecl_in_topLevel227 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PACKAGE_in_myPackage246 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_dotIdent_in_myPackage248 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_myPackage250 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier281 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier297 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier301 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_IMPORT_in_myImport343 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_dotIdent_in_myImport346 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_myImport348 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_access0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STATIC_in_declAttr435 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INLINE_in_declAttr460 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DYNAMIC_in_declAttr486 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OVERRIDE_in_declAttr512 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_access_in_declAttr538 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttr_in_declAttrList553 = new BitSet(
			new long[] { 0x0000000003F00002L });
	public static final BitSet FOLLOW_param_in_paramList594 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_paramList597 = new BitSet(
			new long[] { 0x0000000008020000L });
	public static final BitSet FOLLOW_param_in_paramList599 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_QUES_in_param638 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_param641 = new BitSet(
			new long[] { 0x0000200010000000L });
	public static final BitSet FOLLOW_typeTagOpt_in_param643 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_varInit_in_param645 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_id679 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_id_in_dotIdent693 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_DOT_in_dotIdent701 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_id_in_dotIdent705 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_EQ_in_assignOp737 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PLUSEQ_in_assignOp757 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SUBEQ_in_assignOp778 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SLASHEQ_in_assignOp798 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PERCENTEQ_in_assignOp811 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_AMPEQ_in_assignOp827 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcLit867 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcLit869 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcLit871 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcLit873 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcLit875 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_block_in_funcLit877 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACKET_in_arrayLit909 = new BitSet(
			new long[] { 0x0401016C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_exprListOpt_in_arrayLit912 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_arrayLit914 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppIf_in_pp942 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppElseIf_in_pp968 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppElse_in_pp994 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppEnd_in_pp1020 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppError_in_pp1046 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_IF_in_ppIf1068 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1070 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_IF_in_ppIf1096 = new BitSet(
			new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_BANG_in_ppIf1098 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1100 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1118 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1120 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1145 = new BitSet(
			new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_BANG_in_ppElseIf1147 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1149 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSE_in_ppElse1169 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_END_in_ppEnd1190 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ERROR_in_ppError1209 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COLON_in_typeTag1232 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_typeTag1235 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeTag_in_typeTagOpt1251 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcType_in_typeList1303 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_typeList1306 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_typeList1309 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_typeConstraint_in_typeList1337 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_typeList1340 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_typeConstraint_in_typeList1343 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_type_in_funcType1383 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1387 = new BitSet(
			new long[] { 0x0400000000020000L });
	public static final BitSet FOLLOW_type_in_funcType1390 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_VOID_in_funcType1397 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_anonType_in_type1420 = new BitSet(
			new long[] { 0x0001000000000002L });
	public static final BitSet FOLLOW_dotIdent_in_type1424 = new BitSet(
			new long[] { 0x0001000000000002L });
	public static final BitSet FOLLOW_typeParam_in_type1428 = new BitSet(
			new long[] { 0x0001000000000002L });
	public static final BitSet FOLLOW_GT_in_typeParam1447 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_typeList_in_typeParam1450 = new BitSet(
			new long[] { 0x0002000000000000L });
	public static final BitSet FOLLOW_LT_in_typeParam1452 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeParam_in_typeParamOpt1467 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1499 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_typeConstraint1501 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_typeConstraint1503 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_typeList_in_typeConstraint1505 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_typeConstraint1507 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_block_in_statement1536 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignExpr_in_statement1544 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1546 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_statement1555 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_statement1565 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1567 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1571 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_ELSE_in_statement1574 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1578 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FOR_in_statement1622 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_statement1624 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_statement1628 = new BitSet(
			new long[] { 0x0020000000000000L });
	public static final BitSet FOLLOW_IN_in_statement1630 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_statement1634 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_statement1636 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1638 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_statement1669 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1671 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1673 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DO_in_statement1696 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1698 = new BitSet(
			new long[] { 0x0040000000000000L });
	public static final BitSet FOLLOW_WHILE_in_statement1700 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1702 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1704 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRY_in_statement1727 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_block_in_statement1729 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_catchStmtList_in_statement1731 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SWITCH_in_statement1752 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_statement1754 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_statement1756 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_statement1758 = new BitSet(
			new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_statement1760 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000003L });
	public static final BitSet FOLLOW_caseStmt_in_statement1762 = new BitSet(
			new long[] { 0x0800000000000000L, 0x0000000000000003L });
	public static final BitSet FOLLOW_RBRACE_in_statement1765 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RETURN_in_statement1789 = new BitSet(
			new long[] { 0x0401012C00030000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_statement1792 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1796 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THROW_in_statement1814 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_statement1816 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1818 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_statement1836 = new BitSet(
			new long[] { 0x0000000000030000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1839 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1843 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONTINUE_in_statement1862 = new BitSet(
			new long[] { 0x0000000000030000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1865 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1869 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_statement1888 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1891 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1902 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_statement1904 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_statement1906 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMI_in_statement1926 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_parExpression1951 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_parExpression1954 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_parExpression1956 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_block1978 = new BitSet(
			new long[] { 0xFFD5212C03F30000L, 0x000003F877E20000L });
	public static final BitSet FOLLOW_blockStmt_in_block1981 = new BitSet(
			new long[] { 0xFFD5212C03F30000L, 0x000003F877E20000L });
	public static final BitSet FOLLOW_RBRACE_in_block1985 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMI_in_block2003 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_blockStmt2016 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classDecl_in_blockStmt2021 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_statement_in_blockStmt2026 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_breakStmt2057 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_breakStmt2059 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONTINUE_in_continueStmt2074 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_continueStmt2076 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CASE_in_caseStmt2087 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_exprList_in_caseStmt2089 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_caseStmt2091 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_caseStmt2093 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEFAULT_in_caseStmt2108 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_caseStmt2110 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_caseStmt2112 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2136 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_defaultStmt2138 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_catchStmt_in_catchStmtList2152 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000004L });
	public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2154 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CATCH_in_catchStmt2193 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_catchStmt2195 = new BitSet(
			new long[] { 0x0000000008020000L });
	public static final BitSet FOLLOW_param_in_catchStmt2197 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_catchStmt2199 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_block_in_catchStmt2201 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_exprList_in_exprListOpt2228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_exprList2268 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_exprList2271 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_exprList2274 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_assignExpr_in_expr2298 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_iterExpr_in_assignExpr2314 = new BitSet(
			new long[] { 0x00000003F0000002L });
	public static final BitSet FOLLOW_assignOp_in_assignExpr2317 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_iterExpr_in_assignExpr2320 = new BitSet(
			new long[] { 0x00000003F0000002L });
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2341 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });
	public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2344 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2347 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000008L });
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2370 = new BitSet(
			new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_QUES_in_ternaryExpr2373 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_ternaryExpr2376 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_ternaryExpr2378 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2381 = new BitSet(
			new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2399 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000010L });
	public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2403 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2406 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000010L });
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2423 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2427 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2430 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000020L });
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2452 = new BitSet(
			new long[] { 0x0003000000000002L, 0x00000000000003C0L });
	public static final BitSet FOLLOW_EQEQ_in_cmpExpr2457 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2461 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_GTEQ_in_cmpExpr2466 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_LTEQ_in_cmpExpr2471 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_GT_in_cmpExpr2476 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_LT_in_cmpExpr2481 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2486 = new BitSet(
			new long[] { 0x0003000000000002L, 0x00000000000003C0L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2508 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000001C00L });
	public static final BitSet FOLLOW_BAR_in_bitExpr2512 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2515 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000001C00L });
	public static final BitSet FOLLOW_AMP_in_bitExpr2519 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2522 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000001C00L });
	public static final BitSet FOLLOW_CARET_in_bitExpr2525 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2528 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000001C00L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2549 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000E000L });
	public static final BitSet FOLLOW_LTLT_in_shiftExpr2553 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2557 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000E000L });
	public static final BitSet FOLLOW_GTGT_in_shiftExpr2561 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2565 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000E000L });
	public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2569 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2572 = new BitSet(
			new long[] { 0x0000000000000002L, 0x000000000000E000L });
	public static final BitSet FOLLOW_multExpr_in_addExpr2595 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000030000L });
	public static final BitSet FOLLOW_PLUS_in_addExpr2600 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_SUB_in_addExpr2605 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_multExpr_in_addExpr2609 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000030000L });
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2631 = new BitSet(
			new long[] { 0x0000000000000002L, 0x00000000001C0000L });
	public static final BitSet FOLLOW_STAR_in_multExpr2636 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_SLASH_in_multExpr2639 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_PERCENT_in_multExpr2642 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2646 = new BitSet(
			new long[] { 0x0000000000000002L, 0x00000000001C0000L });
	public static final BitSet FOLLOW_set_in_prefixExpr2664 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2676 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_newExpr_in_prefixExpr2702 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cast_in_prefixExpr2728 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2754 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2773 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_suffixExpr2775 = new BitSet(
			new long[] { 0x0401013C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2777 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_suffixExpr2779 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2799 = new BitSet(
			new long[] { 0x0000002000000000L });
	public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2801 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_suffixExpr2803 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2805 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2810 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000400000L });
	public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2812 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2830 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000200000L });
	public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2832 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2851 = new BitSet(
			new long[] { 0x0001000000000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2853 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcLit_in_value2862 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_arrayLit_in_value2868 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_objLit_in_value2883 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NULL_in_value2898 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_elementarySymbol_in_value2913 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_value2928 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_expr_in_value2932 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_statement_in_value2934 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_value2937 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_dotIdent_in_value2950 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NEW_in_newExpr2995 = new BitSet(
			new long[] { 0x0400000000020000L });
	public static final BitSet FOLLOW_type_in_newExpr2997 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_newExpr2999 = new BitSet(
			new long[] { 0x0401013C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_exprListOpt_in_newExpr3001 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_newExpr3003 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_cast3024 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_cast3026 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_cast3028 = new BitSet(
			new long[] { 0x0000001004000000L });
	public static final BitSet FOLLOW_COMMA_in_cast3031 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_cast3033 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_cast3037 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_cast3053 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_cast3055 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_cast3057 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_cast3059 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classDecl_in_topLevelDecl3082 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl3108 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_enumDecl_in_topLevelDecl3134 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl3160 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ENUM_in_enumDecl3178 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl3180 = new BitSet(
			new long[] { 0x0401000000000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3182 = new BitSet(
			new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_enumDecl3184 = new BitSet(
			new long[] { 0x00001E8000020000L });
	public static final BitSet FOLLOW_enumBody_in_enumDecl3186 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_RBRACE_in_enumDecl3188 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_enumValueDecl_in_enumBody3219 = new BitSet(
			new long[] { 0x00001E8000020002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3238 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3240 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_enumValueDecl3243 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3245 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl3248 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3255 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl3257 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_enumValueDecl3264 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_varDeclList3281 = new BitSet(
			new long[] { 0x0000000003F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_varDeclList_in_varDeclList3283 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_varDecl3305 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_VAR_in_varDecl3309 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_varDeclPartList_in_varDecl3311 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_varDecl3313 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3341 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_varDeclPartList3344 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3347 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3363 = new BitSet(
			new long[] { 0x0000200810000000L });
	public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3368 = new BitSet(
			new long[] { 0x0000200010000000L });
	public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3370 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_varInit_in_varDeclPart3372 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_propDecl3382 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000001000002L });
	public static final BitSet FOLLOW_propAccessor_in_propDecl3386 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_COMMA_in_propDecl3388 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000001000002L });
	public static final BitSet FOLLOW_propAccessor_in_propDecl3392 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_propDecl3394 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propDecl_in_propDeclOpt3452 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EQ_in_varInit3467 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_varInit3469 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3494 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3497 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000002000000L });
	public static final BitSet FOLLOW_NEW_in_funcDecl3499 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3501 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcDecl3503 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3505 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3507 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_block_in_funcDecl3509 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3537 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3540 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3542 = new BitSet(
			new long[] { 0x0001000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3544 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3546 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcDecl3548 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3550 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3552 = new BitSet(
			new long[] { 0x0400200000010000L });
	public static final BitSet FOLLOW_block_in_funcDecl3554 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3590 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3592 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000002000000L });
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3594 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3596 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3598 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3600 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3602 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3604 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3623 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3625 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3627 = new BitSet(
			new long[] { 0x0001000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3629 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3631 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3633 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3635 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3637 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3639 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3659 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000002000000L });
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3661 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3663 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3665 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3667 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3669 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3671 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3688 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3690 = new BitSet(
			new long[] { 0x0001000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3692 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3694 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3696 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3698 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3700 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3702 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EXTERN_in_classDecl3727 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000040000000L });
	public static final BitSet FOLLOW_CLASS_in_classDecl3730 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3732 = new BitSet(
			new long[] { 0x0401000000000000L, 0x0000000300000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_classDecl3734 = new BitSet(
			new long[] { 0x0400000000000000L, 0x0000000300000000L });
	public static final BitSet FOLLOW_inheritListOpt_in_classDecl3736 = new BitSet(
			new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_classDecl3738 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_classBodyScope_in_classDecl3740 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_RBRACE_in_classDecl3742 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classBody_in_classBodyScope3776 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_classBody3801 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3803 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcDecl_in_classBody3808 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3810 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_classBody3815 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3817 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3837 = new BitSet(
			new long[] { 0x0400000000020000L });
	public static final BitSet FOLLOW_type_in_interfaceDecl3839 = new BitSet(
			new long[] { 0x0400000000000000L, 0x0000000300000000L });
	public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3841 = new BitSet(
			new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3843 = new BitSet(
			new long[] { 0x08001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3846 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3848 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_interfaceBody3861 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3863 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3868 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3870 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_interfaceBody3875 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3877 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_inherit_in_inheritList3898 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_inheritList3901 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000300000000L });
	public static final BitSet FOLLOW_inherit_in_inheritList3904 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_inheritList_in_inheritListOpt3922 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EXTENDS_in_inherit3956 = new BitSet(
			new long[] { 0x0400000000020000L });
	public static final BitSet FOLLOW_type_in_inherit3958 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3978 = new BitSet(
			new long[] { 0x0400000000020000L });
	public static final BitSet FOLLOW_type_in_inherit3980 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl4007 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl4009 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_EQ_in_typedefDecl4011 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_typedefDecl4013 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GT_in_typeExtend4032 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_typeExtend4034 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_COMMA_in_typeExtend4036 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_anonType4047 = new BitSet(
			new long[] { 0x0801000003F20000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4082 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_varDeclList_in_anonType4110 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_typeExtend_in_anonType4139 = new BitSet(
			new long[] { 0x0800000003F20000L, 0x0000000010000000L });
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4167 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_varDeclList_in_anonType4193 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_RBRACE_in_anonType4237 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4251 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4254 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4257 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_LBRACE_in_objLit4269 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_objLitElemList_in_objLit4272 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_RBRACE_in_objLit4274 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4286 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_anonTypeField4288 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_anonTypeField4291 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList4307 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_objLitElemList4310 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList4313 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4334 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_objLitElem4336 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_objLitElem4339 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol4351 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol4364 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol4377 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol4390 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol4403 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRUE_in_elementarySymbol4416 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FALSE_in_elementarySymbol4430 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeParam_in_synpred35_TinyHaxeTry11467 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_block_in_synpred36_TinyHaxeTry11536 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignExpr_in_synpred37_TinyHaxeTry11544 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_synpred37_TinyHaxeTry11546 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ELSE_in_synpred39_TinyHaxeTry11574 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_synpred39_TinyHaxeTry11578 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred47_TinyHaxeTry11792 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred54_TinyHaxeTry11888 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_synpred54_TinyHaxeTry11891 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred55_TinyHaxeTry11902 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_synpred55_TinyHaxeTry11904 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_statement_in_synpred55_TinyHaxeTry11906 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_synpred58_TinyHaxeTry12016 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_exprList_in_synpred62_TinyHaxeTry12228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_synpred90_TinyHaxeTry12664 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_prefixExpr_in_synpred90_TinyHaxeTry12676 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred93_TinyHaxeTry12773 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_synpred93_TinyHaxeTry12775 = new BitSet(
			new long[] { 0x0401013C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_exprListOpt_in_synpred93_TinyHaxeTry12777 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred93_TinyHaxeTry12779 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred94_TinyHaxeTry12799 = new BitSet(
			new long[] { 0x0000002000000000L });
	public static final BitSet FOLLOW_LBRACKET_in_synpred94_TinyHaxeTry12801 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_synpred94_TinyHaxeTry12803 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_synpred94_TinyHaxeTry12805 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred95_TinyHaxeTry12810 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000400000L });
	public static final BitSet FOLLOW_PLUSPLUS_in_synpred95_TinyHaxeTry12812 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred96_TinyHaxeTry12830 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000200000L });
	public static final BitSet FOLLOW_SUBSUB_in_synpred96_TinyHaxeTry12832 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_arrayLit_in_synpred98_TinyHaxeTry12868 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred102_TinyHaxeTry12932 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_synpred103_TinyHaxeTry12928 = new BitSet(
			new long[] { 0xF7D5212C03F30000L, 0x000003F817E20000L });
	public static final BitSet FOLLOW_expr_in_synpred103_TinyHaxeTry12932 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_statement_in_synpred103_TinyHaxeTry12934 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred103_TinyHaxeTry12937 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_synpred106_TinyHaxeTry13024 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_synpred106_TinyHaxeTry13026 = new BitSet(
			new long[] { 0x0401012C00020000L, 0x000003F807E20000L });
	public static final BitSet FOLLOW_expr_in_synpred106_TinyHaxeTry13028 = new BitSet(
			new long[] { 0x0000001004000000L });
	public static final BitSet FOLLOW_COMMA_in_synpred106_TinyHaxeTry13031 = new BitSet(
			new long[] { 0x0400800000020000L });
	public static final BitSet FOLLOW_funcType_in_synpred106_TinyHaxeTry13033 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred106_TinyHaxeTry13037 = new BitSet(
			new long[] { 0x0000000000000002L });

}